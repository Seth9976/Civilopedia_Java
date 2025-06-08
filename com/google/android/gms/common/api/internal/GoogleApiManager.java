package com.google.android.gms.common.api.internal;

import A.f;
import M0.v;
import M0.y;
import M0.z;
import android.app.Application;
import android.content.Context;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.zal;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p.c;
import p.g;

@KeepForSdk
@ShowFirstParty
public class GoogleApiManager implements Handler.Callback {
    public long i;
    public boolean j;
    public TelemetryData k;
    public TelemetryLoggingClient l;
    public final Context m;
    public final GoogleApiAvailability n;
    public final zal o;
    public final AtomicInteger p;
    public final AtomicInteger q;
    public final ConcurrentHashMap r;
    public zaae s;
    public final c t;
    public final c u;
    public final zau v;
    public volatile boolean w;
    public static final Status x;
    public static final Object y;
    public static GoogleApiManager z;
    public static final Status zaa;

    static {
        GoogleApiManager.zaa = new Status(4, "Sign-out occurred while this API call was in progress.");
        GoogleApiManager.x = new Status(4, "The user must be signed in to make this API call.");
        GoogleApiManager.y = new Object();
    }

    public GoogleApiManager(Context context0, Looper looper0, GoogleApiAvailability googleApiAvailability0) {
        this.i = 10000L;
        this.j = false;
        this.p = new AtomicInteger(1);
        this.q = new AtomicInteger(0);
        this.r = new ConcurrentHashMap(5, 0.75f, 1);
        this.s = null;
        this.t = new c(0);
        this.u = new c(0);
        this.w = true;
        this.m = context0;
        zau zau0 = new zau(looper0, this);
        this.v = zau0;
        this.n = googleApiAvailability0;
        this.o = new zal(googleApiAvailability0);
        if(DeviceProperties.isAuto(context0)) {
            this.w = false;
        }
        zau0.sendMessage(zau0.obtainMessage(6));
    }

    public final boolean a() {
        if(this.j) {
            return false;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration0 = RootTelemetryConfigManager.getInstance().getConfig();
        if(rootTelemetryConfiguration0 != null && !rootTelemetryConfiguration0.getMethodInvocationTelemetryEnabled()) {
            return false;
        }
        switch(this.o.zaa(this.m, 203400000)) {
            case -1: 
            case 0: {
                return true;
            }
            default: {
                return false;
            }
        }
    }

    public static Status b(ApiKey apiKey0, ConnectionResult connectionResult0) {
        return new Status(connectionResult0, f.j("API: ", apiKey0.zaa(), " is not available on this device. Connection failed with: ", String.valueOf(connectionResult0)));
    }

    public final zabq c(GoogleApi googleApi0) {
        ConcurrentHashMap concurrentHashMap0 = this.r;
        ApiKey apiKey0 = googleApi0.getApiKey();
        zabq zabq0 = (zabq)concurrentHashMap0.get(apiKey0);
        if(zabq0 == null) {
            zabq0 = new zabq(this, googleApi0);
            concurrentHashMap0.put(apiKey0, zabq0);
        }
        if(zabq0.zaA()) {
            this.u.add(apiKey0);
        }
        zabq0.zao();
        return zabq0;
    }

    public final void d(TaskCompletionSource taskCompletionSource0, int v, GoogleApi googleApi0) {
        OnCompleteListener onCompleteListener0;
        if(v != 0) {
            ApiKey apiKey0 = googleApi0.getApiKey();
            if(this.a()) {
                RootTelemetryConfiguration rootTelemetryConfiguration0 = RootTelemetryConfigManager.getInstance().getConfig();
                if(rootTelemetryConfiguration0 == null) {
                    onCompleteListener0 = new y(this, v, apiKey0, System.currentTimeMillis(), SystemClock.elapsedRealtime());
                }
                else if(rootTelemetryConfiguration0.getMethodInvocationTelemetryEnabled()) {
                    boolean z = rootTelemetryConfiguration0.getMethodTimingTelemetryEnabled();
                    zabq zabq0 = (zabq)this.r.get(apiKey0);
                    if(zabq0 == null) {
                        onCompleteListener0 = new y(this, v, apiKey0, (z ? System.currentTimeMillis() : 0L), (z ? SystemClock.elapsedRealtime() : 0L));
                    }
                    else if(zabq0.zaf() instanceof BaseGmsClient) {
                        BaseGmsClient baseGmsClient0 = (BaseGmsClient)zabq0.zaf();
                        if(!baseGmsClient0.hasConnectionInfo() || baseGmsClient0.isConnecting()) {
                            onCompleteListener0 = new y(this, v, apiKey0, (z ? System.currentTimeMillis() : 0L), (z ? SystemClock.elapsedRealtime() : 0L));
                        }
                        else {
                            ConnectionTelemetryConfiguration connectionTelemetryConfiguration0 = y.a(zabq0, baseGmsClient0, v);
                            if(connectionTelemetryConfiguration0 == null) {
                                onCompleteListener0 = null;
                            }
                            else {
                                ++zabq0.t;
                                boolean z1 = connectionTelemetryConfiguration0.getMethodTimingTelemetryEnabled();
                                onCompleteListener0 = new y(this, v, apiKey0, (z1 ? System.currentTimeMillis() : 0L), (z1 ? SystemClock.elapsedRealtime() : 0L));
                            }
                        }
                    }
                    else {
                        onCompleteListener0 = null;
                    }
                }
                else {
                    onCompleteListener0 = null;
                }
            }
            else {
                onCompleteListener0 = null;
            }
            if(onCompleteListener0 != null) {
                this.v.getClass();
                taskCompletionSource0.getTask().addOnCompleteListener(new zabk(this.v), onCompleteListener0);
            }
        }
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        Feature feature0;
        int v = message0.what;
        zau zau0 = this.v;
        ConcurrentHashMap concurrentHashMap0 = this.r;
        Context context0 = this.m;
        long v1 = 300000L;
        zabq zabq0 = null;
        switch(v) {
            case 1: {
                if(((Boolean)message0.obj).booleanValue()) {
                    v1 = 10000L;
                }
                this.i = v1;
                zau0.removeMessages(12);
                for(Object object0: concurrentHashMap0.keySet()) {
                    zau0.sendMessageDelayed(zau0.obtainMessage(12, ((ApiKey)object0)), this.i);
                }
                return true;
            }
            case 2: {
                com.google.android.gms.common.api.internal.zal zal0 = (com.google.android.gms.common.api.internal.zal)message0.obj;
                for(Object object1: zal0.zab()) {
                    ApiKey apiKey0 = (ApiKey)object1;
                    zabq zabq1 = (zabq)concurrentHashMap0.get(apiKey0);
                    if(zabq1 == null) {
                        zal0.zac(apiKey0, new ConnectionResult(13), null);
                        return true;
                    }
                    if(zabq1.j.isConnected()) {
                        String s = zabq1.zaf().getEndpointPackageName();
                        zal0.zac(apiKey0, ConnectionResult.RESULT_SUCCESS, s);
                    }
                    else {
                        ConnectionResult connectionResult0 = zabq1.zad();
                        if(connectionResult0 == null) {
                            zabq1.zat(zal0);
                            zabq1.zao();
                        }
                        else {
                            zal0.zac(apiKey0, connectionResult0, null);
                        }
                    }
                }
                return true;
            }
            case 3: {
                for(Object object2: concurrentHashMap0.values()) {
                    ((zabq)object2).zan();
                    ((zabq)object2).zao();
                }
                return true;
            }
            case 5: {
                int v3 = message0.arg1;
                ConnectionResult connectionResult1 = (ConnectionResult)message0.obj;
                for(Object object3: concurrentHashMap0.values()) {
                    zabq zabq3 = (zabq)object3;
                    if(zabq3.zab() == v3) {
                        zabq0 = zabq3;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                if(zabq0 != null) {
                    if(connectionResult1.getErrorCode() == 13) {
                        zabq0.c(new Status(17, f.j("Error resolution was canceled by the user, original error message: ", this.n.getErrorString(connectionResult1.getErrorCode()), ": ", connectionResult1.getErrorMessage())));
                        return true;
                    }
                    zabq0.c(GoogleApiManager.b(zabq0.k, connectionResult1));
                    return true;
                }
                Log.wtf("GoogleApiManager", f.e(v3, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                return true;
            }
            case 6: {
                if(context0.getApplicationContext() instanceof Application) {
                    BackgroundDetector.initialize(((Application)context0.getApplicationContext()));
                    BackgroundDetector.getInstance().addListener(new com.google.android.gms.common.api.internal.c(this));
                    if(!BackgroundDetector.getInstance().readCurrentStateIfPossible(true)) {
                        this.i = 300000L;
                        return true;
                    }
                }
                break;
            }
            case 7: {
                this.c(((GoogleApi)message0.obj));
                return true;
            }
            case 9: {
                if(concurrentHashMap0.containsKey(message0.obj)) {
                    ((zabq)concurrentHashMap0.get(message0.obj)).zau();
                    return true;
                }
                break;
            }
            case 10: {
                c c0 = this.u;
                Iterator iterator4 = c0.iterator();
                while(((g)iterator4).hasNext()) {
                    zabq zabq4 = (zabq)concurrentHashMap0.remove(((ApiKey)((g)iterator4).next()));
                    if(zabq4 != null) {
                        zabq4.zav();
                    }
                }
                c0.clear();
                return true;
            }
            case 11: {
                if(concurrentHashMap0.containsKey(message0.obj)) {
                    ((zabq)concurrentHashMap0.get(message0.obj)).zaw();
                    return true;
                }
                break;
            }
            case 12: {
                if(concurrentHashMap0.containsKey(message0.obj)) {
                    ((zabq)concurrentHashMap0.get(message0.obj)).zaB();
                    return true;
                }
                break;
            }
            case 4: 
            case 8: 
            case 13: {
                zach zach0 = (zach)message0.obj;
                zabq zabq2 = (zabq)concurrentHashMap0.get(zach0.zac.getApiKey());
                if(zabq2 == null) {
                    zabq2 = this.c(zach0.zac);
                }
                if(zabq2.zaA() && this.q.get() != zach0.zab) {
                    zach0.zaa.zad(GoogleApiManager.zaa);
                    zabq2.zav();
                    return true;
                }
                zabq2.zap(zach0.zaa);
                return true;
            }
            case 14: {
                M0.c c1 = (M0.c)message0.obj;
                ApiKey apiKey1 = c1.a;
                boolean z = concurrentHashMap0.containsKey(apiKey1);
                TaskCompletionSource taskCompletionSource0 = c1.b;
                if(!z) {
                    taskCompletionSource0.setResult(Boolean.FALSE);
                    return true;
                }
                taskCompletionSource0.setResult(Boolean.valueOf(((zabq)concurrentHashMap0.get(apiKey1)).k(false)));
                return true;
            }
            case 15: {
                v v4 = (v)message0.obj;
                if(concurrentHashMap0.containsKey(v4.a)) {
                    zabq zabq5 = (zabq)concurrentHashMap0.get(v4.a);
                    if(zabq5.r.contains(v4) && !zabq5.q) {
                        if(!zabq5.j.isConnected()) {
                            zabq5.zao();
                            return true;
                        }
                        zabq5.e();
                        return true;
                    }
                }
                break;
            }
            case 16: {
                v v5 = (v)message0.obj;
                if(concurrentHashMap0.containsKey(v5.a)) {
                    zabq zabq6 = (zabq)concurrentHashMap0.get(v5.a);
                    if(zabq6.r.remove(v5)) {
                        zabq6.u.v.removeMessages(15, v5);
                        zabq6.u.v.removeMessages(16, v5);
                        LinkedList linkedList0 = zabq6.i;
                        ArrayList arrayList0 = new ArrayList(linkedList0.size());
                        Iterator iterator5 = linkedList0.iterator();
                        while(true) {
                            boolean z1 = iterator5.hasNext();
                            feature0 = v5.b;
                            if(!z1) {
                                break;
                            }
                            Object object4 = iterator5.next();
                            zai zai0 = (zai)object4;
                            if(zai0 instanceof zac) {
                                Feature[] arr_feature = ((zac)zai0).zab(zabq6);
                                if(arr_feature != null && ArrayUtils.contains(arr_feature, feature0)) {
                                    arrayList0.add(zai0);
                                }
                            }
                        }
                        int v6 = arrayList0.size();
                        for(int v2 = 0; v2 < v6; ++v2) {
                            zai zai1 = (zai)arrayList0.get(v2);
                            linkedList0.remove(zai1);
                            zai1.zae(new UnsupportedApiCallException(feature0));
                        }
                        return true;
                    }
                }
                break;
            }
            case 17: {
                TelemetryData telemetryData0 = this.k;
                if(telemetryData0 != null) {
                    if(telemetryData0.zaa() > 0 || this.a()) {
                        if(this.l == null) {
                            this.l = TelemetryLogging.getClient(context0);
                        }
                        this.l.log(telemetryData0);
                    }
                    this.k = null;
                    return true;
                }
                break;
            }
            case 18: {
                z z2 = (z)message0.obj;
                MethodInvocation methodInvocation0 = z2.a;
                int v7 = z2.b;
                if(z2.c == 0L) {
                    TelemetryData telemetryData1 = new TelemetryData(v7, Arrays.asList(new MethodInvocation[]{methodInvocation0}));
                    if(this.l == null) {
                        this.l = TelemetryLogging.getClient(context0);
                    }
                    this.l.log(telemetryData1);
                    return true;
                }
                TelemetryData telemetryData2 = this.k;
                if(telemetryData2 != null) {
                    List list0 = telemetryData2.zab();
                    if(telemetryData2.zaa() != v7 || list0 != null && list0.size() >= z2.d) {
                        zau0.removeMessages(17);
                        TelemetryData telemetryData3 = this.k;
                        if(telemetryData3 != null) {
                            if(telemetryData3.zaa() > 0 || this.a()) {
                                if(this.l == null) {
                                    this.l = TelemetryLogging.getClient(context0);
                                }
                                this.l.log(telemetryData3);
                            }
                            this.k = null;
                        }
                    }
                    else {
                        this.k.zac(methodInvocation0);
                    }
                }
                if(this.k == null) {
                    ArrayList arrayList1 = new ArrayList();
                    arrayList1.add(methodInvocation0);
                    this.k = new TelemetryData(v7, arrayList1);
                    zau0.sendMessageDelayed(zau0.obtainMessage(17), z2.c);
                    return true;
                }
                break;
            }
            case 19: {
                this.j = false;
                return true;
            }
            default: {
                f.p(v, "Unknown message id: ", "GoogleApiManager");
                return false;
            }
        }
        return true;
    }

    @KeepForSdk
    public static void reportSignOut() {
        synchronized(GoogleApiManager.y) {
            GoogleApiManager googleApiManager0 = GoogleApiManager.z;
            if(googleApiManager0 != null) {
                googleApiManager0.q.incrementAndGet();
                Message message0 = googleApiManager0.v.obtainMessage(10);
                googleApiManager0.v.sendMessageAtFrontOfQueue(message0);
            }
        }
    }

    public final void zaA(zaae zaae0) {
        synchronized(GoogleApiManager.y) {
            if(this.s != zaae0) {
                this.s = zaae0;
                this.t.clear();
            }
            this.t.addAll(zaae0.n);
        }
    }

    public final int zaa() {
        return this.p.getAndIncrement();
    }

    public static GoogleApiManager zaj() {
        synchronized(GoogleApiManager.y) {
            Preconditions.checkNotNull(GoogleApiManager.z, "Must guarantee manager is non-null before using getInstance");
            return GoogleApiManager.z;
        }
    }

    @ResultIgnorabilityUnspecified
    public static GoogleApiManager zak(Context context0) {
        synchronized(GoogleApiManager.y) {
            if(GoogleApiManager.z == null) {
                Looper looper0 = GmsClientSupervisor.getOrStartHandlerThread().getLooper();
                GoogleApiManager.z = new GoogleApiManager(context0.getApplicationContext(), looper0, GoogleApiAvailability.getInstance());
            }
            return GoogleApiManager.z;
        }
    }

    public final Task zam(Iterable iterable0) {
        com.google.android.gms.common.api.internal.zal zal0 = new com.google.android.gms.common.api.internal.zal(iterable0);
        Message message0 = this.v.obtainMessage(2, zal0);
        this.v.sendMessage(message0);
        return zal0.zaa();
    }

    @ResultIgnorabilityUnspecified
    public final Task zan(GoogleApi googleApi0) {
        M0.c c0 = new M0.c(googleApi0.getApiKey());
        Message message0 = this.v.obtainMessage(14, c0);
        this.v.sendMessage(message0);
        return c0.b.getTask();
    }

    public final Task zao(GoogleApi googleApi0, RegisterListenerMethod registerListenerMethod0, UnregisterListenerMethod unregisterListenerMethod0, Runnable runnable0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.d(taskCompletionSource0, registerListenerMethod0.zaa(), googleApi0);
        zach zach0 = new zach(new zaf(new zaci(registerListenerMethod0, unregisterListenerMethod0, runnable0), taskCompletionSource0), this.q.get(), googleApi0);
        Message message0 = this.v.obtainMessage(8, zach0);
        this.v.sendMessage(message0);
        return taskCompletionSource0.getTask();
    }

    public final Task zap(GoogleApi googleApi0, ListenerKey listenerHolder$ListenerKey0, int v) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.d(taskCompletionSource0, v, googleApi0);
        zach zach0 = new zach(new zah(listenerHolder$ListenerKey0, taskCompletionSource0), this.q.get(), googleApi0);
        Message message0 = this.v.obtainMessage(13, zach0);
        this.v.sendMessage(message0);
        return taskCompletionSource0.getTask();
    }

    public final void zau(GoogleApi googleApi0, int v, ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        zach zach0 = new zach(new zae(v, baseImplementation$ApiMethodImpl0), this.q.get(), googleApi0);
        Message message0 = this.v.obtainMessage(4, zach0);
        this.v.sendMessage(message0);
    }

    public final void zav(GoogleApi googleApi0, int v, TaskApiCall taskApiCall0, TaskCompletionSource taskCompletionSource0, StatusExceptionMapper statusExceptionMapper0) {
        this.d(taskCompletionSource0, taskApiCall0.zaa(), googleApi0);
        zach zach0 = new zach(new zag(v, taskApiCall0, taskCompletionSource0, statusExceptionMapper0), this.q.get(), googleApi0);
        Message message0 = this.v.obtainMessage(4, zach0);
        this.v.sendMessage(message0);
    }

    public final void zax(ConnectionResult connectionResult0, int v) {
        if(!this.n.zah(this.m, connectionResult0, v)) {
            Message message0 = this.v.obtainMessage(5, v, 0, connectionResult0);
            this.v.sendMessage(message0);
        }
    }

    public final void zay() {
        Message message0 = this.v.obtainMessage(3);
        this.v.sendMessage(message0);
    }

    public final void zaz(GoogleApi googleApi0) {
        Message message0 = this.v.obtainMessage(7, googleApi0);
        this.v.sendMessage(message0);
    }
}

