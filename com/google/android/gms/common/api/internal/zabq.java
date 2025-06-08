package com.google.android.gms.common.api.internal;

import M0.s;
import M0.u;
import M0.v;
import M0.x;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.zap;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import p.b;

public final class zabq implements ConnectionCallbacks, OnConnectionFailedListener, zau {
    public final LinkedList i;
    public final Client j;
    public final ApiKey k;
    public final zaad l;
    public final HashSet m;
    public final HashMap n;
    public final int o;
    public final zact p;
    public boolean q;
    public final ArrayList r;
    public ConnectionResult s;
    public int t;
    public final GoogleApiManager u;

    public zabq(GoogleApiManager googleApiManager0, GoogleApi googleApi0) {
        this.u = googleApiManager0;
        super();
        this.i = new LinkedList();
        this.m = new HashSet();
        this.n = new HashMap();
        this.r = new ArrayList();
        this.s = null;
        this.t = 0;
        Client api$Client0 = googleApi0.zab(googleApiManager0.v.getLooper(), this);
        this.j = api$Client0;
        this.k = googleApi0.getApiKey();
        this.l = new zaad();
        this.o = googleApi0.zaa();
        if(api$Client0.requiresSignIn()) {
            this.p = googleApi0.zac(googleApiManager0.m, googleApiManager0.v);
            return;
        }
        this.p = null;
    }

    public final Feature a(Feature[] arr_feature) {
        if(arr_feature != null && arr_feature.length != 0) {
            Feature[] arr_feature1 = this.j.getAvailableFeatures();
            int v = 0;
            if(arr_feature1 == null) {
                arr_feature1 = new Feature[0];
            }
            b b0 = new b(arr_feature1.length);
            for(int v1 = 0; v1 < arr_feature1.length; ++v1) {
                Feature feature0 = arr_feature1[v1];
                b0.put(feature0.getName(), feature0.getVersion());
            }
            while(v < arr_feature.length) {
                Feature feature1 = arr_feature[v];
                Long long0 = (Long)b0.getOrDefault(feature1.getName(), null);
                if(long0 != null && ((long)long0) >= feature1.getVersion()) {
                    ++v;
                    continue;
                }
                return feature1;
            }
        }
        return null;
    }

    public final void b(ConnectionResult connectionResult0) {
        HashSet hashSet0 = this.m;
        for(Object object0: hashSet0) {
            String s = Objects.equal(connectionResult0, ConnectionResult.RESULT_SUCCESS) ? this.j.getEndpointPackageName() : null;
            ((zal)object0).zac(this.k, connectionResult0, s);
        }
        hashSet0.clear();
    }

    public final void c(Status status0) {
        Preconditions.checkHandlerThread(this.u.v);
        this.d(status0, null, false);
    }

    public final void d(Status status0, Exception exception0, boolean z) {
        Preconditions.checkHandlerThread(this.u.v);
        if((status0 == null ? 1 : 0) == (exception0 == null ? 1 : 0)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator iterator0 = this.i.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            zai zai0 = (zai)object0;
            if(!z || zai0.zac == 2) {
                if(status0 == null) {
                    zai0.zae(exception0);
                }
                else {
                    zai0.zad(status0);
                }
                iterator0.remove();
            }
        }
    }

    public final void e() {
        LinkedList linkedList0 = this.i;
        ArrayList arrayList0 = new ArrayList(linkedList0);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            zai zai0 = (zai)arrayList0.get(v1);
            if(!this.j.isConnected()) {
                break;
            }
            if(this.i(zai0)) {
                linkedList0.remove(zai0);
            }
        }
    }

    public final void f() {
        Client api$Client0 = this.j;
        this.zan();
        this.b(ConnectionResult.RESULT_SUCCESS);
        if(this.q) {
            this.u.v.removeMessages(11, this.k);
            this.u.v.removeMessages(9, this.k);
            this.q = false;
        }
        Iterator iterator0 = this.n.values().iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            zaci zaci0 = (zaci)object0;
            if(this.a(zaci0.zaa.getRequiredFeatures()) == null) {
                try {
                    TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
                    zaci0.zaa.a(api$Client0, taskCompletionSource0);
                }
                catch(DeadObjectException unused_ex) {
                    this.onConnectionSuspended(3);
                    api$Client0.disconnect("DeadObjectException thrown while calling register listener method.");
                    break;
                }
                catch(RemoteException unused_ex) {
                    iterator0.remove();
                }
            }
            else {
                iterator0.remove();
            }
        }
        this.e();
        this.h();
    }

    public final void g(int v) {
        this.zan();
        this.q = true;
        String s = this.j.getLastDisconnectMessage();
        zaad zaad0 = this.l;
        zaad0.getClass();
        StringBuilder stringBuilder0 = new StringBuilder("The connection to Google Play services was lost");
        if(v == 1) {
            stringBuilder0.append(" due to service disconnection.");
        }
        else if(v == 3) {
            stringBuilder0.append(" due to dead object exception.");
        }
        if(s != null) {
            stringBuilder0.append(" Last reason for disconnect: ");
            stringBuilder0.append(s);
        }
        zaad0.a(new Status(20, stringBuilder0.toString()), true);
        Message message0 = Message.obtain(this.u.v, 9, this.k);
        this.u.v.sendMessageDelayed(message0, 5000L);
        Message message1 = Message.obtain(this.u.v, 11, this.k);
        this.u.v.sendMessageDelayed(message1, 120000L);
        this.u.o.zac();
        for(Object object0: this.n.values()) {
            ((zaci)object0).zac.run();
        }
    }

    public final void h() {
        this.u.v.removeMessages(12, this.k);
        Message message0 = this.u.v.obtainMessage(12, this.k);
        this.u.v.sendMessageDelayed(message0, this.u.i);
    }

    public final boolean i(zai zai0) {
        if(!(zai0 instanceof zac)) {
            boolean z = this.zaA();
            zai0.zag(this.l, z);
            try {
                zai0.zaf(this);
            }
            catch(DeadObjectException unused_ex) {
                this.onConnectionSuspended(1);
                this.j.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Feature feature0 = this.a(((zac)zai0).zab(this));
        if(feature0 == null) {
            boolean z1 = this.zaA();
            zai0.zag(this.l, z1);
            try {
                zai0.zaf(this);
            }
            catch(DeadObjectException unused_ex) {
                this.onConnectionSuspended(1);
                this.j.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.j.getClass().getName() + " could not execute call because it requires feature (" + feature0.getName() + ", " + feature0.getVersion() + ").");
        if(this.u.w && ((zac)zai0).zaa(this)) {
            v v0 = new v(this.k, feature0);
            int v1 = this.r.indexOf(v0);
            if(v1 >= 0) {
                v v2 = (v)this.r.get(v1);
                this.u.v.removeMessages(15, v2);
                Message message0 = Message.obtain(this.u.v, 15, v2);
                this.u.v.sendMessageDelayed(message0, 5000L);
                return false;
            }
            this.r.add(v0);
            Message message1 = Message.obtain(this.u.v, 15, v0);
            this.u.v.sendMessageDelayed(message1, 5000L);
            Message message2 = Message.obtain(this.u.v, 16, v0);
            this.u.v.sendMessageDelayed(message2, 120000L);
            ConnectionResult connectionResult0 = new ConnectionResult(2, null);
            if(!this.j(connectionResult0)) {
                this.u.n.zah(this.u.m, connectionResult0, this.o);
            }
            return false;
        }
        ((zac)zai0).zae(new UnsupportedApiCallException(feature0));
        return true;
    }

    public final boolean j(ConnectionResult connectionResult0) {
        synchronized(GoogleApiManager.y) {
            if(this.u.s != null && this.u.t.contains(this.k)) {
                this.u.s.zah(connectionResult0, this.o);
                return true;
            }
            return false;
        }
    }

    public final boolean k(boolean z) {
        Preconditions.checkHandlerThread(this.u.v);
        Client api$Client0 = this.j;
        if(api$Client0.isConnected() && this.n.isEmpty()) {
            if(this.l.a.isEmpty() && this.l.b.isEmpty()) {
                api$Client0.disconnect("Timing out service connection.");
                return true;
            }
            if(z) {
                this.h();
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        Looper looper0 = Looper.myLooper();
        GoogleApiManager googleApiManager0 = this.u;
        if(looper0 == googleApiManager0.v.getLooper()) {
            this.f();
            return;
        }
        B.b b0 = new B.b(this, 6);
        googleApiManager0.v.post(b0);
    }

    @Override  // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult0) {
        this.zar(connectionResult0, null);
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        Looper looper0 = Looper.myLooper();
        GoogleApiManager googleApiManager0 = this.u;
        if(looper0 == googleApiManager0.v.getLooper()) {
            this.g(v);
            return;
        }
        s s0 = new s(v, 0, this);
        googleApiManager0.v.post(s0);
    }

    public final boolean zaA() {
        return this.j.requiresSignIn();
    }

    @ResultIgnorabilityUnspecified
    public final boolean zaB() {
        return this.k(true);
    }

    @Override  // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult0, Api api0, boolean z) {
        throw null;
    }

    public final int zab() {
        return this.o;
    }

    public final ConnectionResult zad() {
        Preconditions.checkHandlerThread(this.u.v);
        return this.s;
    }

    public final Client zaf() {
        return this.j;
    }

    public final Map zah() {
        return this.n;
    }

    public final void zan() {
        Preconditions.checkHandlerThread(this.u.v);
        this.s = null;
    }

    public final void zao() {
        GoogleApiManager googleApiManager0 = this.u;
        Preconditions.checkHandlerThread(googleApiManager0.v);
        Client api$Client0 = this.j;
        if(!api$Client0.isConnected() && !api$Client0.isConnecting()) {
            try {
                int v = googleApiManager0.o.zab(googleApiManager0.m, api$Client0);
                if(v != 0) {
                    ConnectionResult connectionResult0 = new ConnectionResult(v, null);
                    Log.w("GoogleApiManager", "The service for " + api$Client0.getClass().getName() + " is not available: " + connectionResult0.toString());
                    this.zar(connectionResult0, null);
                    return;
                }
            }
            catch(IllegalStateException illegalStateException0) {
                this.zar(new ConnectionResult(10), illegalStateException0);
                return;
            }
            x x0 = new x(googleApiManager0, api$Client0, this.k);
            if(api$Client0.requiresSignIn()) {
                ((zact)Preconditions.checkNotNull(this.p)).zae(x0);
            }
            try {
                api$Client0.connect(x0);
            }
            catch(SecurityException securityException0) {
                this.zar(new ConnectionResult(10), securityException0);
            }
        }
    }

    public final void zap(zai zai0) {
        Preconditions.checkHandlerThread(this.u.v);
        boolean z = this.j.isConnected();
        LinkedList linkedList0 = this.i;
        if(z) {
            if(this.i(zai0)) {
                this.h();
                return;
            }
            linkedList0.add(zai0);
            return;
        }
        linkedList0.add(zai0);
        if(this.s != null && this.s.hasResolution()) {
            this.zar(this.s, null);
            return;
        }
        this.zao();
    }

    public final void zar(ConnectionResult connectionResult0, Exception exception0) {
        Preconditions.checkHandlerThread(this.u.v);
        zact zact0 = this.p;
        if(zact0 != null) {
            zact0.zaf();
        }
        this.zan();
        this.u.o.zac();
        this.b(connectionResult0);
        if(this.j instanceof zap && connectionResult0.getErrorCode() != 24) {
            this.u.j = true;
            Message message0 = this.u.v.obtainMessage(19);
            this.u.v.sendMessageDelayed(message0, 300000L);
        }
        if(connectionResult0.getErrorCode() == 4) {
            this.c(GoogleApiManager.x);
            return;
        }
        if(this.i.isEmpty()) {
            this.s = connectionResult0;
            return;
        }
        if(exception0 != null) {
            Preconditions.checkHandlerThread(this.u.v);
            this.d(null, exception0, false);
            return;
        }
        if(this.u.w) {
            this.d(GoogleApiManager.b(this.k, connectionResult0), null, true);
            if(!this.i.isEmpty() && !this.j(connectionResult0) && !this.u.n.zah(this.u.m, connectionResult0, this.o)) {
                if(connectionResult0.getErrorCode() == 18) {
                    this.q = true;
                }
                if(this.q) {
                    Message message1 = Message.obtain(this.u.v, 9, this.k);
                    this.u.v.sendMessageDelayed(message1, 5000L);
                    return;
                }
                this.c(GoogleApiManager.b(this.k, connectionResult0));
            }
            return;
        }
        this.c(GoogleApiManager.b(this.k, connectionResult0));
    }

    public final void zas(ConnectionResult connectionResult0) {
        Preconditions.checkHandlerThread(this.u.v);
        String s = this.j.getClass().getName();
        this.j.disconnect("onSignInFailed for " + s + " with " + connectionResult0);
        this.zar(connectionResult0, null);
    }

    public final void zat(zal zal0) {
        Preconditions.checkHandlerThread(this.u.v);
        this.m.add(zal0);
    }

    public final void zau() {
        Preconditions.checkHandlerThread(this.u.v);
        if(this.q) {
            this.zao();
        }
    }

    public final void zav() {
        Preconditions.checkHandlerThread(this.u.v);
        this.c(GoogleApiManager.zaa);
        this.l.zaf();
        ListenerKey[] arr_listenerHolder$ListenerKey = (ListenerKey[])this.n.keySet().toArray(new ListenerKey[0]);
        for(int v = 0; v < arr_listenerHolder$ListenerKey.length; ++v) {
            this.zap(new zah(arr_listenerHolder$ListenerKey[v], new TaskCompletionSource()));
        }
        this.b(new ConnectionResult(4));
        Client api$Client0 = this.j;
        if(api$Client0.isConnected()) {
            api$Client0.onUserSignOut(new u(this));
        }
    }

    public final void zaw() {
        GoogleApiManager googleApiManager0 = this.u;
        Preconditions.checkHandlerThread(googleApiManager0.v);
        if(this.q) {
            googleApiManager0.v.removeMessages(11, this.k);
            googleApiManager0.v.removeMessages(9, this.k);
            this.q = false;
            this.c((googleApiManager0.n.isGooglePlayServicesAvailable(googleApiManager0.m) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error.")));
            this.j.disconnect("Timing out connection while resuming.");
        }
    }
}

