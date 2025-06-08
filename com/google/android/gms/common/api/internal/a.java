package com.google.android.gms.common.api.internal;

import T1.c;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import p.b;
import p.h;

public final class a implements zaca {
    public final Context i;
    public final zabe j;
    public final Looper k;
    public final zabi l;
    public final zabi m;
    public final Map n;
    public final Set o;
    public final Client p;
    public Bundle q;
    public ConnectionResult r;
    public ConnectionResult s;
    public boolean t;
    public final Lock u;
    public int v;

    public a(Context context0, zabe zabe0, Lock lock0, Looper looper0, GoogleApiAvailabilityLight googleApiAvailabilityLight0, b b0, b b1, ClientSettings clientSettings0, AbstractClientBuilder api$AbstractClientBuilder0, Client api$Client0, ArrayList arrayList0, ArrayList arrayList1, b b2, b b3) {
        this.o = Collections.newSetFromMap(new WeakHashMap());
        this.r = null;
        this.s = null;
        this.t = false;
        this.v = 0;
        this.i = context0;
        this.j = zabe0;
        this.u = lock0;
        this.k = looper0;
        this.p = api$Client0;
        this.l = new zabi(context0, zabe0, lock0, looper0, googleApiAvailabilityLight0, b1, null, b3, null, arrayList1, new c(this, 8));
        this.m = new zabi(context0, zabe0, lock0, looper0, googleApiAvailabilityLight0, b0, clientSettings0, b2, api$AbstractClientBuilder0, arrayList0, new D3.b(this, 5));
        b b4 = new b();  // 初始化器: Lp/k;-><init>()V
        for(Object object0: ((h)b1.keySet())) {
            b4.put(((AnyClientKey)object0), this.l);
        }
        for(Object object1: ((h)b0.keySet())) {
            b4.put(((AnyClientKey)object1), this.m);
        }
        this.n = Collections.unmodifiableMap(b4);
    }

    public final void a(ConnectionResult connectionResult0) {
        switch(this.v) {
            case 1: {
                this.b();
                break;
            }
            case 2: {
                this.j.zaa(connectionResult0);
                this.b();
                break;
            }
            default: {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
            }
        }
        this.v = 0;
    }

    public final void b() {
        Set set0 = this.o;
        for(Object object0: set0) {
            ((SignInConnectionListener)object0).onComplete();
        }
        set0.clear();
    }

    public final boolean c() {
        return this.s != null && this.s.getErrorCode() == 4;
    }

    public static void d(a a0) {
        zabi zabi0 = a0.l;
        if(a0.r == null || !a0.r.isSuccess()) {
            zabi zabi1 = a0.m;
            if(a0.r != null && (a0.s != null && a0.s.isSuccess())) {
                zabi1.zar();
                a0.a(((ConnectionResult)Preconditions.checkNotNull(a0.r)));
                return;
            }
            ConnectionResult connectionResult1 = a0.r;
            if(connectionResult1 != null) {
                ConnectionResult connectionResult2 = a0.s;
                if(connectionResult2 != null) {
                    if(zabi1.u < zabi0.u) {
                        connectionResult1 = connectionResult2;
                    }
                    a0.a(connectionResult1);
                }
            }
        }
        else {
            if(a0.s != null && a0.s.isSuccess() || a0.c()) {
                goto label_11;
            }
            ConnectionResult connectionResult0 = a0.s;
            if(connectionResult0 != null) {
                if(a0.v == 1) {
                    a0.b();
                    return;
                }
                a0.a(connectionResult0);
                zabi0.zar();
                return;
            label_11:
                switch(a0.v) {
                    case 1: {
                        a0.b();
                        break;
                    }
                    case 2: {
                        ((zabe)Preconditions.checkNotNull(a0.j)).zab(a0.q);
                        a0.b();
                        break;
                    }
                    default: {
                        Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    }
                }
                a0.v = 0;
            }
        }
    }

    public final PendingIntent e() {
        Client api$Client0 = this.p;
        if(api$Client0 == null) {
            return null;
        }
        Intent intent0 = api$Client0.getSignInIntent();
        return PendingIntent.getActivity(this.i, System.identityHashCode(this.j), intent0, zap.zaa | 0x8000000);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zab() {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zac(long v, TimeUnit timeUnit0) {
        throw new UnsupportedOperationException();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ConnectionResult zad(Api api0) {
        Object object0 = this.n.get(api0.zab());
        zabi zabi0 = this.m;
        if(Objects.equal(object0, zabi0)) {
            return this.c() ? new ConnectionResult(4, this.e()) : zabi0.zad(api0);
        }
        return this.l.zad(api0);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ApiMethodImpl zae(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        zabi zabi0 = (zabi)this.n.get(baseImplementation$ApiMethodImpl0.getClientKey());
        Preconditions.checkNotNull(zabi0, "GoogleApiClient is not configured to use the API required for this call.");
        zabi zabi1 = this.m;
        if(zabi0.equals(zabi1)) {
            if(this.c()) {
                baseImplementation$ApiMethodImpl0.setFailedResult(new Status(4, null, this.e()));
                return baseImplementation$ApiMethodImpl0;
            }
            zabi1.zae(baseImplementation$ApiMethodImpl0);
            return baseImplementation$ApiMethodImpl0;
        }
        this.l.zae(baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final ApiMethodImpl zaf(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        zabi zabi0 = (zabi)this.n.get(baseImplementation$ApiMethodImpl0.getClientKey());
        Preconditions.checkNotNull(zabi0, "GoogleApiClient is not configured to use the API required for this call.");
        zabi zabi1 = this.m;
        if(zabi0.equals(zabi1)) {
            if(this.c()) {
                baseImplementation$ApiMethodImpl0.setFailedResult(new Status(4, null, this.e()));
                return baseImplementation$ApiMethodImpl0;
            }
            return zabi1.zaf(baseImplementation$ApiMethodImpl0);
        }
        return this.l.zaf(baseImplementation$ApiMethodImpl0);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zaq() {
        this.v = 2;
        this.t = false;
        this.s = null;
        this.r = null;
        this.l.zaq();
        this.m.zaq();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zar() {
        this.s = null;
        this.r = null;
        this.v = 0;
        this.l.zar();
        this.m.zar();
        this.b();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zas(String s, FileDescriptor fileDescriptor0, PrintWriter printWriter0, String[] arr_s) {
        printWriter0.append(s).append("authClient").println(":");
        this.m.zas(s + "  ", fileDescriptor0, printWriter0, arr_s);
        printWriter0.append(s).append("anonClient").println(":");
        this.l.zas(s + "  ", fileDescriptor0, printWriter0, arr_s);
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zat() {
        this.l.zat();
        this.m.zat();
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final void zau() {
        Lock lock0 = this.u;
        lock0.lock();
        try {
            boolean z = this.zax();
            this.m.zar();
            this.s = new ConnectionResult(4);
            if(z) {
                new zau(this.k).post(new B.b(this, 8));
            }
            else {
                this.b();
            }
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zaw() {
        boolean z = false;
        Lock lock0 = this.u;
        lock0.lock();
        try {
            if(this.l.zaw() && (this.m.zaw() || this.c() || this.v == 1)) {
                z = true;
            }
            return z;
        }
        finally {
            lock0.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zax() {
        this.u.lock();
        boolean z = this.v == 2;
        this.u.unlock();
        return z;
    }

    @Override  // com.google.android.gms.common.api.internal.zaca
    public final boolean zay(SignInConnectionListener signInConnectionListener0) {
        boolean z = false;
        zabi zabi0 = this.m;
        Lock lock0 = this.u;
        lock0.lock();
        try {
            if((this.zax() || this.zaw()) && !zabi0.zaw()) {
                this.o.add(signInConnectionListener0);
                z = true;
                if(this.v == 0) {
                    this.v = 1;
                }
                this.s = null;
                zabi0.zaq();
            }
            return z;
        }
        finally {
            lock0.unlock();
        }
    }
}

