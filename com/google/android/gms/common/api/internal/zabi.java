package com.google.android.gms.common.api.internal;

import M0.p;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class zabi implements zaca, zau {
    public final Lock i;
    public final Condition j;
    public final Context k;
    public final GoogleApiAvailabilityLight l;
    public final p m;
    public final Map n;
    public final HashMap o;
    public final ClientSettings p;
    public final Map q;
    public final AbstractClientBuilder r;
    public volatile zabf s;
    public ConnectionResult t;
    public int u;
    public final zabe v;
    public final zabz w;

    public zabi(Context context0, zabe zabe0, Lock lock0, Looper looper0, GoogleApiAvailabilityLight googleApiAvailabilityLight0, Map map0, ClientSettings clientSettings0, Map map1, AbstractClientBuilder api$AbstractClientBuilder0, ArrayList arrayList0, zabz zabz0) {
        this.o = new HashMap();
        this.t = null;
        this.k = context0;
        this.i = lock0;
        this.l = googleApiAvailabilityLight0;
        this.n = map0;
        this.p = clientSettings0;
        this.q = map1;
        this.r = api$AbstractClientBuilder0;
        this.v = zabe0;
        this.w = zabz0;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((zat)arrayList0.get(v1)).zaa(this);
        }
        this.m = new p(this, looper0, 1);
        this.j = lock0.newCondition();
        this.s = new zaax(this);
    }

    public final void a(ConnectionResult connectionResult0) {
        this.i.lock();
        try {
            this.t = connectionResult0;
            this.s = new zaax(this);
            this.s.zad();
            this.j.signalAll();
        }
        finally {
            this.i.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnected(Bundle bundle0) {
        this.i.lock();
        try {
            this.s.zag(bundle0);
        }
        finally {
            this.i.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public final void onConnectionSuspended(int v) {
        this.i.lock();
        try {
            this.s.zai(v);
        }
        finally {
            this.i.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zau
    public final void zaa(ConnectionResult connectionResult0, Api api0, boolean z) {
        this.i.lock();
        try {
            this.s.zah(connectionResult0, api0, z);
        }
        finally {
            this.i.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final ConnectionResult zab() {
        this.zaq();
        while(this.s instanceof zaaw) {
            try {
                this.j.await();
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if(this.s instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult0 = this.t;
        return connectionResult0 == null ? new ConnectionResult(13, null) : connectionResult0;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final ConnectionResult zac(long v, TimeUnit timeUnit0) {
        this.zaq();
        for(long v1 = timeUnit0.toNanos(v); this.s instanceof zaaw; v1 = this.j.awaitNanos(v1)) {
            try {
                if(v1 <= 0L) {
                    this.zar();
                    return new ConnectionResult(14, null);
                }
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        if(this.s instanceof zaaj) {
            return ConnectionResult.RESULT_SUCCESS;
        }
        ConnectionResult connectionResult0 = this.t;
        return connectionResult0 == null ? new ConnectionResult(13, null) : connectionResult0;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final ConnectionResult zad(Api api0) {
        AnyClientKey api$AnyClientKey0 = api0.zab();
        Map map0 = this.n;
        if(map0.containsKey(api$AnyClientKey0)) {
            if(((Client)map0.get(api$AnyClientKey0)).isConnected()) {
                return ConnectionResult.RESULT_SUCCESS;
            }
            return this.o.containsKey(api$AnyClientKey0) ? ((ConnectionResult)this.o.get(api$AnyClientKey0)) : null;
        }
        return null;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final ApiMethodImpl zae(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        this.s.zaa(baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final ApiMethodImpl zaf(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        baseImplementation$ApiMethodImpl0.zak();
        return this.s.zab(baseImplementation$ApiMethodImpl0);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final void zaq() {
        this.s.zae();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final void zar() {
        if(this.s.zaj()) {
            this.o.clear();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zas(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.append(s).append("mState=").println(this.s);
        for(Object object0: this.q.keySet()) {
            printWriter0.append(s).append(((Api)object0).zad()).println(":");
            ((Client)Preconditions.checkNotNull(((Client)this.n.get(((Api)object0).zab())))).dump(s + "  ", fileDescriptor0, printWriter0, arr_s);
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    @GuardedBy("lock")
    public final void zat() {
        if(this.s instanceof zaaj) {
            zaaj zaaj0 = (zaaj)this.s;
            if(zaaj0.b) {
                zaaj0.b = false;
                zaaj0.a.v.F.zab();
                zaaj0.zaj();
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        return this.s instanceof zaaj;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        return this.s instanceof zaaw;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener0) {
        return false;
    }
}

