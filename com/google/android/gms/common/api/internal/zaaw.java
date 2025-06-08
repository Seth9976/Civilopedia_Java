package com.google.android.gms.common.api.internal;

import A.f;
import B.b;
import M0.e;
import M0.h;
import M0.i;
import M0.k;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.signin.zae;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class zaaw implements zabf {
    public final zabi a;
    public final Lock b;
    public final Context c;
    public final GoogleApiAvailabilityLight d;
    public ConnectionResult e;
    public int f;
    public int g;
    public int h;
    public final Bundle i;
    public final HashSet j;
    public zae k;
    public boolean l;
    public boolean m;
    public boolean n;
    public IAccountAccessor o;
    public boolean p;
    public boolean q;
    public final ClientSettings r;
    public final Map s;
    public final AbstractClientBuilder t;
    public final ArrayList u;

    public zaaw(zabi zabi0, ClientSettings clientSettings0, Map map0, GoogleApiAvailabilityLight googleApiAvailabilityLight0, AbstractClientBuilder api$AbstractClientBuilder0, Lock lock0, Context context0) {
        this.g = 0;
        this.i = new Bundle();
        this.j = new HashSet();
        this.u = new ArrayList();
        this.a = zabi0;
        this.r = clientSettings0;
        this.s = map0;
        this.d = googleApiAvailabilityLight0;
        this.t = api$AbstractClientBuilder0;
        this.b = lock0;
        this.c = context0;
    }

    public final void a() {
        this.m = false;
        zabi zabi0 = this.a;
        zabi0.v.x = Collections.emptySet();
        for(Object object0: this.j) {
            AnyClientKey api$AnyClientKey0 = (AnyClientKey)object0;
            HashMap hashMap0 = zabi0.o;
            if(!hashMap0.containsKey(api$AnyClientKey0)) {
                hashMap0.put(api$AnyClientKey0, new ConnectionResult(17, null));
            }
        }
    }

    public final void b(boolean z) {
        zae zae0 = this.k;
        if(zae0 != null) {
            if(zae0.isConnected() && z) {
                zae0.zaa();
            }
            zae0.disconnect();
            ClientSettings clientSettings0 = (ClientSettings)Preconditions.checkNotNull(this.r);
            this.o = null;
        }
    }

    public final void c() {
        this.a.i.lock();
        try {
            this.a.v.c();
            this.a.s = new zaaj(this.a);
            this.a.s.zad();
            this.a.j.signalAll();
        }
        finally {
            this.a.i.unlock();
        }
        zabj.zaa().execute(new b(this, 5));
        zae zae0 = this.k;
        if(zae0 != null) {
            if(this.p) {
                zae0.zac(((IAccountAccessor)Preconditions.checkNotNull(this.o)), this.q);
            }
            this.b(false);
        }
        for(Object object0: this.a.o.keySet()) {
            ((Client)Preconditions.checkNotNull(((Client)this.a.n.get(((AnyClientKey)object0))))).disconnect();
        }
        this.a.w.zab((this.i.isEmpty() ? null : this.i));
    }

    public final void d(ConnectionResult connectionResult0) {
        ArrayList arrayList0 = this.u;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Future)arrayList0.get(v1)).cancel(true);
        }
        arrayList0.clear();
        this.b(!connectionResult0.hasResolution());
        this.a.a(connectionResult0);
        this.a.w.zaa(connectionResult0);
    }

    public final void e(ConnectionResult connectionResult0, Api api0, boolean z) {
        if((!z || connectionResult0.hasResolution() || this.d.getErrorResolutionIntent(connectionResult0.getErrorCode()) != null) && (this.e == null || 0x7FFFFFFF < this.f)) {
            this.e = connectionResult0;
            this.f = 0x7FFFFFFF;
        }
        this.a.o.put(api0.zab(), connectionResult0);
    }

    public final void f() {
        if(this.h == 0 && (!this.m || this.n)) {
            ArrayList arrayList0 = new ArrayList();
            this.g = 1;
            zabi zabi0 = this.a;
            this.h = zabi0.n.size();
            Map map0 = zabi0.n;
            for(Object object0: map0.keySet()) {
                AnyClientKey api$AnyClientKey0 = (AnyClientKey)object0;
                if(!zabi0.o.containsKey(api$AnyClientKey0)) {
                    arrayList0.add(((Client)map0.get(api$AnyClientKey0)));
                }
                else if(this.h()) {
                    this.c();
                }
            }
            if(!arrayList0.isEmpty()) {
                Future future0 = zabj.zaa().submit(new i(this, arrayList0));
                this.u.add(future0);
            }
        }
    }

    public final boolean g(int v) {
        if(this.g != v) {
            Log.w("GACConnecting", this.a.v.a());
            Log.w("GACConnecting", "Unexpected callback in " + this.toString());
            f.p(this.h, "mRemainingConnections=", "GACConnecting");
            String s = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            String s1 = this.g == 0 ? "STEP_SERVICE_BINDINGS_AND_SIGN_IN" : "STEP_GETTING_REMOTE_SERVICE";
            StringBuilder stringBuilder0 = new StringBuilder("GoogleApiClient connecting is in step ");
            stringBuilder0.append(s1);
            stringBuilder0.append(" but received callback for step ");
            if(v != 0) {
                s = "STEP_GETTING_REMOTE_SERVICE";
            }
            stringBuilder0.append(s);
            Log.e("GACConnecting", stringBuilder0.toString(), new Exception());
            this.d(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    public final boolean h() {
        int v = this.h - 1;
        this.h = v;
        if(v > 0) {
            return false;
        }
        zabi zabi0 = this.a;
        if(v < 0) {
            Log.w("GACConnecting", zabi0.v.a());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            this.d(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult0 = this.e;
        if(connectionResult0 != null) {
            zabi0.u = this.f;
            this.d(connectionResult0);
            return false;
        }
        return true;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zaa(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        this.a.v.p.add(baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zab(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final void zad() {
        Map map1;
        zabi zabi0 = this.a;
        zabi0.o.clear();
        this.m = false;
        this.e = null;
        this.g = 0;
        this.l = true;
        this.n = false;
        this.p = false;
        HashMap hashMap0 = new HashMap();
        Map map0 = this.s;
        Iterator iterator0 = map0.keySet().iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            map1 = zabi0.n;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            Api api0 = (Api)object0;
            Client api$Client0 = (Client)Preconditions.checkNotNull(((Client)map1.get(api0.zab())));
            boolean z1 = ((Boolean)map0.get(api0)).booleanValue();
            if(api$Client0.requiresSignIn()) {
                this.m = true;
                if(z1) {
                    this.j.add(api0.zab());
                }
                else {
                    this.l = false;
                }
            }
            hashMap0.put(api$Client0, new e(this, api0, z1));
        }
        if(this.m) {
            Preconditions.checkNotNull(this.r);
            Preconditions.checkNotNull(this.t);
            this.r.zae(System.identityHashCode(zabi0.v));
            k k0 = new k(this);
            this.k = this.t.buildClient(this.c, zabi0.v.getLooper(), this.r, this.r.zaa(), k0, k0);
        }
        this.h = map1.size();
        Future future0 = zabj.zaa().submit(new h(this, hashMap0));
        this.u.add(future0);
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final void zag(Bundle bundle0) {
        if(this.g(1)) {
            if(bundle0 != null) {
                this.i.putAll(bundle0);
            }
            if(this.h()) {
                this.c();
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final void zah(ConnectionResult connectionResult0, Api api0, boolean z) {
        if(this.g(1)) {
            this.e(connectionResult0, api0, z);
            if(this.h()) {
                this.c();
            }
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final void zai(int v) {
        this.d(new ConnectionResult(8, null));
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    @GuardedBy("lock")
    public final boolean zaj() {
        ArrayList arrayList0 = this.u;
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((Future)arrayList0.get(v1)).cancel(true);
        }
        arrayList0.clear();
        this.b(true);
        this.a.a(null);
        return true;
    }
}

