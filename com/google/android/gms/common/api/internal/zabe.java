package com.google.android.gms.common.api.internal;

import D3.b;
import M0.m;
import M0.n;
import M0.o;
import M0.p;
import M0.q;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.j;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.Builder;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.internal.zak;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class zabe extends GoogleApiClient implements zabz {
    public final AbstractClientBuilder A;
    public final ListenerHolders B;
    public final ArrayList C;
    public Integer D;
    public HashSet E;
    public final zadc F;
    public static final int G;
    public final Lock j;
    public final zak k;
    public zaca l;
    public final int m;
    public final Context n;
    public final Looper o;
    public final LinkedList p;
    public volatile boolean q;
    public final long r;
    public final long s;
    public final p t;
    public final GoogleApiAvailability u;
    public zabx v;
    public final Map w;
    public Set x;
    public final ClientSettings y;
    public final Map z;

    public zabe(Context context0, Lock lock0, Looper looper0, ClientSettings clientSettings0, GoogleApiAvailability googleApiAvailability0, AbstractClientBuilder api$AbstractClientBuilder0, Map map0, List list0, List list1, Map map1, int v, int v1, ArrayList arrayList0) {
        this.l = null;
        this.p = new LinkedList();
        this.r = 120000L;
        this.s = 5000L;
        this.x = new HashSet();
        this.B = new ListenerHolders();
        this.D = null;
        this.E = null;
        b b0 = new b(this, 4);
        this.n = context0;
        this.j = lock0;
        this.k = new zak(looper0, b0);
        this.o = looper0;
        this.t = new p(this, looper0, 0);
        this.u = googleApiAvailability0;
        this.m = v;
        if(v >= 0) {
            this.D = v1;
        }
        this.z = map0;
        this.w = map1;
        this.C = arrayList0;
        this.F = new zadc();
        for(Object object0: list0) {
            this.k.zaf(((ConnectionCallbacks)object0));
        }
        for(Object object1: list1) {
            this.k.zag(((OnConnectionFailedListener)object1));
        }
        this.y = clientSettings0;
        this.A = api$AbstractClientBuilder0;
    }

    public final String a() {
        StringWriter stringWriter0 = new StringWriter();
        this.dump("", null, new PrintWriter(stringWriter0), null);
        return stringWriter0.toString();
    }

    public static void b(zabe zabe0) {
        zabe0.j.lock();
        try {
            if(zabe0.q) {
                zabe0.e();
            }
        }
        finally {
            zabe0.j.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final ConnectionResult blockingConnect() {
        boolean z = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Lock lock0 = this.j;
        lock0.lock();
        try {
            if(this.m >= 0) {
                if(this.D == null) {
                    z = false;
                }
                Preconditions.checkState(z, "Sign-in mode should have been set explicitly by auto-manage.");
                this.d(((int)(((Integer)Preconditions.checkNotNull(this.D)))));
                this.k.zab();
                return ((zaca)Preconditions.checkNotNull(this.l)).zab();
            }
            Integer integer0 = this.D;
            boolean z1 = false;
            if(integer0 == null) {
                z1 = true;
                this.D = zabe.zad(this.w.values(), false);
            }
            else if(((int)integer0) != 2) {
                z1 = true;
            }
            if(z1) {
                this.d(((int)(((Integer)Preconditions.checkNotNull(this.D)))));
                this.k.zab();
                return ((zaca)Preconditions.checkNotNull(this.l)).zab();
            }
        }
        finally {
            lock0.unlock();
        }
        throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long v, TimeUnit timeUnit0) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit0, "TimeUnit must not be null");
        Lock lock0 = this.j;
        lock0.lock();
        try {
            Integer integer0 = this.D;
            boolean z = false;
            if(integer0 == null) {
                z = true;
                this.D = zabe.zad(this.w.values(), false);
            }
            else if(((int)integer0) != 2) {
                z = true;
            }
            if(z) {
                this.d(((int)(((Integer)Preconditions.checkNotNull(this.D)))));
                this.k.zab();
                return ((zaca)Preconditions.checkNotNull(this.l)).zac(v, timeUnit0);
            }
        }
        finally {
            lock0.unlock();
        }
        throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }

    public final boolean c() {
        if(!this.q) {
            return false;
        }
        this.q = false;
        this.t.removeMessages(2);
        this.t.removeMessages(1);
        zabx zabx0 = this.v;
        if(zabx0 != null) {
            zabx0.zab();
            this.v = null;
        }
        return true;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult clearDefaultAccountAndReconnect() {
        Preconditions.checkState(this.isConnected(), "GoogleApiClient is not connected yet.");
        Preconditions.checkState(this.D == null || ((int)this.D) != 2, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        PendingResult pendingResult0 = new StatusPendingResult(this);
        if(this.w.containsKey(Common.CLIENT_KEY)) {
            Common.zaa.zaa(this).setResultCallback(new o(this, ((StatusPendingResult)pendingResult0), false, this));
            return pendingResult0;
        }
        AtomicReference atomicReference0 = new AtomicReference();
        m m0 = new m(this, atomicReference0, ((StatusPendingResult)pendingResult0));
        n n0 = new n(((StatusPendingResult)pendingResult0));
        Builder googleApiClient$Builder0 = new Builder(this.n);
        googleApiClient$Builder0.addApi(Common.API);
        googleApiClient$Builder0.addConnectionCallbacks(m0);
        googleApiClient$Builder0.addOnConnectionFailedListener(n0);
        googleApiClient$Builder0.setHandler(this.t);
        GoogleApiClient googleApiClient0 = googleApiClient$Builder0.build();
        atomicReference0.set(googleApiClient0);
        googleApiClient0.connect();
        return pendingResult0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        Lock lock0 = this.j;
        lock0.lock();
        try {
            int v1 = 2;
            boolean z = false;
            if(this.m >= 0) {
                Preconditions.checkState(this.D != null, "Sign-in mode should have been set explicitly by auto-manage.");
                goto label_13;
            }
            Integer integer0 = this.D;
            boolean z1 = false;
            if(integer0 == null) {
                z1 = true;
                this.D = zabe.zad(this.w.values(), false);
            }
            else if(((int)integer0) != 2) {
                z1 = true;
            }
            if(z1) {
            label_13:
                int v2 = (int)(((Integer)Preconditions.checkNotNull(this.D)));
                lock0.lock();
                switch(v2) {
                    case 2: {
                        z = true;
                        break;
                    }
                    case 1: 
                    case 3: {
                        v1 = v2;
                        z = true;
                        break;
                    }
                    default: {
                        v1 = v2;
                    }
                }
                try {
                    Preconditions.checkArgument(z, "Illegal sign-in mode: " + v1);
                    this.d(v1);
                    this.e();
                }
                catch(Throwable throwable0) {
                    lock0.unlock();
                    throw throwable0;
                }
                lock0.unlock();
                return;
            }
        }
        finally {
            lock0.unlock();
        }
        throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int v) {
        Lock lock0 = this.j;
        lock0.lock();
        boolean z = true;
        if(v != 1 && v != 3) {
            if(v == 2) {
                v = 2;
            }
            else {
                z = false;
            }
        }
        try {
            Preconditions.checkArgument(z, "Illegal sign-in mode: " + v);
            this.d(v);
            this.e();
        }
        finally {
            lock0.unlock();
        }
    }

    public final void d(int v) {
        String s1;
        Integer integer0 = this.D;
        boolean z2 = false;
        if(integer0 == null) {
            z2 = true;
            this.D = v;
        }
        else if(((int)integer0) == v) {
            z2 = true;
        }
        if(z2) {
            if(this.l != null) {
                return;
            }
            Map map0 = this.w;
            boolean z = false;
            boolean z1 = false;
            for(Object object0: map0.values()) {
                z |= ((Client)object0).requiresSignIn();
                z1 |= ((Client)object0).providesSignIn();
            }
            switch(((int)this.D)) {
                case 1: {
                    if(!z) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    }
                    if(z1) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                }
                case 2: {
                    if(z) {
                        p.b b0 = new p.b();  // 初始化器: Lp/k;-><init>()V
                        p.b b1 = new p.b();  // 初始化器: Lp/k;-><init>()V
                        Client api$Client0 = null;
                        for(Object object1: map0.entrySet()) {
                            Map.Entry map$Entry0 = (Map.Entry)object1;
                            Client api$Client1 = (Client)map$Entry0.getValue();
                            if(api$Client1.providesSignIn()) {
                                api$Client0 = api$Client1;
                            }
                            if(api$Client1.requiresSignIn()) {
                                b0.put(((AnyClientKey)map$Entry0.getKey()), api$Client1);
                            }
                            else {
                                b1.put(((AnyClientKey)map$Entry0.getKey()), api$Client1);
                            }
                        }
                        Preconditions.checkState(!b0.isEmpty(), "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
                        p.b b2 = new p.b();  // 初始化器: Lp/k;-><init>()V
                        p.b b3 = new p.b();  // 初始化器: Lp/k;-><init>()V
                        Map map1 = this.z;
                        for(Object object2: map1.keySet()) {
                            Api api0 = (Api)object2;
                            AnyClientKey api$AnyClientKey0 = api0.zab();
                            if(b0.containsKey(api$AnyClientKey0)) {
                                b2.put(api0, ((Boolean)map1.get(api0)));
                            }
                            else {
                                if(!b1.containsKey(api$AnyClientKey0)) {
                                    throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
                                }
                                b3.put(api0, ((Boolean)map1.get(api0)));
                            }
                        }
                        ArrayList arrayList0 = new ArrayList();
                        ArrayList arrayList1 = new ArrayList();
                        ArrayList arrayList2 = this.C;
                        int v2 = arrayList2.size();
                        for(int v1 = 0; v1 < v2; ++v1) {
                            zat zat0 = (zat)arrayList2.get(v1);
                            if(b2.containsKey(zat0.zaa)) {
                                arrayList0.add(zat0);
                            }
                            else {
                                if(!b3.containsKey(zat0.zaa)) {
                                    throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
                                }
                                arrayList1.add(zat0);
                            }
                        }
                        this.l = new a(this.n, this, this.j, this.o, this.u, b0, b1, this.y, this.A, api$Client0, arrayList0, arrayList1, b2, b3);
                        return;
                    }
                }
            }
            this.l = new zabi(this.n, this, this.j, this.o, this.u, this.w, this.y, this.z, this.A, this.C, this);
            return;
        }
        String s = "SIGN_IN_MODE_REQUIRED";
        switch(((int)this.D)) {
            case 1: {
                s1 = "SIGN_IN_MODE_REQUIRED";
                break;
            }
            case 2: {
                s1 = "SIGN_IN_MODE_OPTIONAL";
                break;
            }
            case 3: {
                s1 = "SIGN_IN_MODE_NONE";
                break;
            }
            default: {
                s1 = "UNKNOWN";
            }
        }
        StringBuilder stringBuilder0 = new StringBuilder("Cannot use sign-in mode: ");
        switch(v) {
            case 1: {
                break;
            }
            case 2: {
                s = "SIGN_IN_MODE_OPTIONAL";
                break;
            }
            case 3: {
                s = "SIGN_IN_MODE_NONE";
                break;
            }
            default: {
                s = "UNKNOWN";
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append(". Mode was already set to ");
        stringBuilder0.append(s1);
        throw new IllegalStateException(stringBuilder0.toString());
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        Lock lock0 = this.j;
        lock0.lock();
        try {
            this.F.zab();
            zaca zaca0 = this.l;
            if(zaca0 != null) {
                zaca0.zar();
            }
            this.B.zab();
            LinkedList linkedList0 = this.p;
            for(Object object0: linkedList0) {
                ((ApiMethodImpl)object0).zan(null);
                ((ApiMethodImpl)object0).cancel();
            }
            linkedList0.clear();
            if(this.l != null) {
                this.c();
                this.k.zaa();
            }
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.append(s).append("mContext=").println(this.n);
        printWriter0.append(s).append("mResuming=").print(this.q);
        printWriter0.append(" mWorkQueue.size()=").print(this.p.size());
        printWriter0.append(" mUnconsumedApiCalls.size()=").println(this.F.a.size());
        zaca zaca0 = this.l;
        if(zaca0 != null) {
            zaca0.zas(s, fileDescriptor0, printWriter0, arr_s);
        }
    }

    public final void e() {
        this.k.zab();
        ((zaca)Preconditions.checkNotNull(this.l)).zaq();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final ApiMethodImpl enqueue(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        Api api0 = baseImplementation$ApiMethodImpl0.getApi();
        Preconditions.checkArgument(this.w.containsKey(baseImplementation$ApiMethodImpl0.getClientKey()), "GoogleApiClient is not configured to use " + (api0 == null ? "the API" : api0.zad()) + " required for this call.");
        Lock lock0 = this.j;
        lock0.lock();
        try {
            zaca zaca0 = this.l;
            if(zaca0 == null) {
                this.p.add(baseImplementation$ApiMethodImpl0);
            }
            else {
                baseImplementation$ApiMethodImpl0 = zaca0.zae(baseImplementation$ApiMethodImpl0);
            }
            return baseImplementation$ApiMethodImpl0;
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final ApiMethodImpl execute(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        Api api0 = baseImplementation$ApiMethodImpl0.getApi();
        Preconditions.checkArgument(this.w.containsKey(baseImplementation$ApiMethodImpl0.getClientKey()), "GoogleApiClient is not configured to use " + (api0 == null ? "the API" : api0.zad()) + " required for this call.");
        this.j.lock();
        try {
            zaca zaca0 = this.l;
            if(zaca0 != null) {
                if(this.q) {
                    this.p.add(baseImplementation$ApiMethodImpl0);
                    while(!this.p.isEmpty()) {
                        ApiMethodImpl baseImplementation$ApiMethodImpl1 = (ApiMethodImpl)this.p.remove();
                        this.F.a.add(baseImplementation$ApiMethodImpl1);
                        baseImplementation$ApiMethodImpl1.zan(this.F.b);
                        baseImplementation$ApiMethodImpl1.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                    }
                }
                else {
                    baseImplementation$ApiMethodImpl0 = zaca0.zaf(baseImplementation$ApiMethodImpl0);
                }
                return baseImplementation$ApiMethodImpl0;
            }
        }
        finally {
            this.j.unlock();
        }
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final Client getClient(AnyClientKey api$AnyClientKey0) {
        Client api$Client0 = (Client)this.w.get(api$AnyClientKey0);
        Preconditions.checkNotNull(api$Client0, "Appropriate Api was not requested.");
        return api$Client0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult getConnectionResult(Api api0) {
        ConnectionResult connectionResult1;
        ConnectionResult connectionResult0;
        this.j.lock();
        try {
            if(!this.isConnected() && !this.q) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if(!this.w.containsKey(api0.zab())) {
                throw new IllegalArgumentException(api0.zad() + " was never registered with GoogleApiClient");
            }
            connectionResult0 = ((zaca)Preconditions.checkNotNull(this.l)).zad(api0);
            if(connectionResult0 == null) {
                if(this.q) {
                    connectionResult1 = ConnectionResult.RESULT_SUCCESS;
                }
                else {
                    Log.w("GoogleApiClientImpl", this.a());
                    Log.wtf("GoogleApiClientImpl", api0.zad() + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new Exception());
                    connectionResult1 = new ConnectionResult(8, null);
                }
                goto label_17;
            }
            goto label_19;
        }
        catch(Throwable throwable0) {
        }
        this.j.unlock();
        throw throwable0;
    label_17:
        this.j.unlock();
        return connectionResult1;
    label_19:
        this.j.unlock();
        return connectionResult0;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.n;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.o;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(Api api0) {
        return this.w.containsKey(api0.zab());
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(Api api0) {
        if(!this.isConnected()) {
            return false;
        }
        Client api$Client0 = (Client)this.w.get(api0.zab());
        return api$Client0 != null && api$Client0.isConnected();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        return this.l != null && this.l.zaw();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        return this.l != null && this.l.zax();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        return this.k.zaj(googleApiClient$ConnectionCallbacks0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        return this.k.zak(googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener0) {
        return this.l != null && this.l.zay(signInConnectionListener0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zaca zaca0 = this.l;
        if(zaca0 != null) {
            zaca0.zau();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        this.disconnect();
        this.connect();
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        this.k.zaf(googleApiClient$ConnectionCallbacks0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this.k.zag(googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final ListenerHolder registerListener(Object object0) {
        this.j.lock();
        try {
            return this.B.zaa(object0, this.o, "NO_TYPE");
        }
        finally {
            this.j.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(j j0) {
        LifecycleActivity lifecycleActivity0 = new LifecycleActivity(j0);
        int v = this.m;
        if(v < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        com.google.android.gms.common.api.internal.zak.zaa(lifecycleActivity0).zae(v);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(ConnectionCallbacks googleApiClient$ConnectionCallbacks0) {
        this.k.zah(googleApiClient$ConnectionCallbacks0);
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        this.k.zai(googleApiClient$OnConnectionFailedListener0);
    }

    @Override  // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("lock")
    public final void zaa(ConnectionResult connectionResult0) {
        if(!this.u.isPlayServicesPossiblyUpdating(this.n, connectionResult0.getErrorCode())) {
            this.c();
        }
        if(!this.q) {
            this.k.zac(connectionResult0);
            this.k.zaa();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("lock")
    public final void zab(Bundle bundle0) {
        while(true) {
            LinkedList linkedList0 = this.p;
            if(linkedList0.isEmpty()) {
                break;
            }
            this.execute(((ApiMethodImpl)linkedList0.remove()));
        }
        this.k.zad(bundle0);
    }

    @Override  // com.google.android.gms.common.api.internal.zabz
    @GuardedBy("lock")
    public final void zac(int v, boolean z) {
        if(v == 1) {
            if(!z && !this.q) {
                this.q = true;
                if(this.v == null) {
                    try {
                        Context context0 = this.n.getApplicationContext();
                        q q0 = new q(this);
                        this.v = this.u.zac(context0, q0);
                    }
                    catch(SecurityException unused_ex) {
                    }
                }
                Message message0 = this.t.obtainMessage(1);
                this.t.sendMessageDelayed(message0, this.r);
                Message message1 = this.t.obtainMessage(2);
                this.t.sendMessageDelayed(message1, this.s);
            }
            v = 1;
        }
        BasePendingResult[] arr_basePendingResult = (BasePendingResult[])this.F.a.toArray(new BasePendingResult[0]);
        for(int v1 = 0; v1 < arr_basePendingResult.length; ++v1) {
            arr_basePendingResult[v1].forceFailureUnlessReady(zadc.zaa);
        }
        this.k.zae(v);
        this.k.zaa();
        if(v == 2) {
            this.e();
        }
    }

    public static int zad(Iterable iterable0, boolean z) {
        boolean z1 = false;
        boolean z2 = false;
        for(Object object0: iterable0) {
            z1 |= ((Client)object0).requiresSignIn();
            z2 |= ((Client)object0).providesSignIn();
        }
        if(z1) {
            return !z2 || !z ? 1 : 2;
        }
        return 3;
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zada0) {
        Lock lock0 = this.j;
        lock0.lock();
        try {
            if(this.E == null) {
                this.E = new HashSet();
            }
            this.E.add(zada0);
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zada zada0) {
        Lock lock0 = this.j;
        lock0.lock();
        try {
            HashSet hashSet0 = this.E;
            if(hashSet0 == null) {
                Log.wtf("GoogleApiClientImpl", "Attempted to remove pending transform when no transforms are registered.", new Exception());
            }
            else if(hashSet0.remove(zada0)) {
                lock0.lock();
                HashSet hashSet1 = this.E;
                if(hashSet1 == null) {
                    lock0.unlock();
                label_23:
                    zaca zaca0 = this.l;
                    if(zaca0 != null) {
                        zaca0.zat();
                    }
                }
                else {
                    try {
                        boolean z = hashSet1.isEmpty();
                    }
                    catch(Throwable throwable0) {
                        lock0.unlock();
                        throw throwable0;
                    }
                    lock0.unlock();
                    if(z) {
                        goto label_23;
                    }
                }
            }
            else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        }
        finally {
            lock0.unlock();
        }
    }
}

