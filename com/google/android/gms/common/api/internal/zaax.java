package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import java.util.Collections;

public final class zaax implements zabf {
    public final zabi a;

    public zaax(zabi zabi0) {
        this.a = zabi0;
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
    public final void zad() {
        zabi zabi0 = this.a;
        for(Object object0: zabi0.n.values()) {
            ((Client)object0).disconnect();
        }
        zabi0.v.x = Collections.emptySet();
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        this.a.i.lock();
        try {
            this.a.s = new zaaw(this.a, this.a.p, this.a.q, this.a.l, this.a.r, this.a.i, this.a.k);
            this.a.s.zad();
            this.a.j.signalAll();
        }
        finally {
            this.a.i.unlock();
        }
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zag(Bundle bundle0) {
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zah(ConnectionResult connectionResult0, Api api0, boolean z) {
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zai(int v) {
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        return true;
    }
}

