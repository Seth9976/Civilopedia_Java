package com.google.android.gms.common.api.internal;

import M0.d;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api.Client;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashSet;

public final class zaaj implements zabf {
    public final zabi a;
    public boolean b;

    public zaaj(zabi zabi0) {
        this.b = false;
        this.a = zabi0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zaa(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        this.zab(baseImplementation$ApiMethodImpl0);
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final ApiMethodImpl zab(ApiMethodImpl baseImplementation$ApiMethodImpl0) {
        zabi zabi0;
        try {
            zabi0 = this.a;
            zabi0.v.F.a.add(baseImplementation$ApiMethodImpl0);
            baseImplementation$ApiMethodImpl0.zan(zabi0.v.F.b);
            Client api$Client0 = (Client)zabi0.v.w.get(baseImplementation$ApiMethodImpl0.getClientKey());
            Preconditions.checkNotNull(api$Client0, "Appropriate Api was not requested.");
            if(!api$Client0.isConnected() && zabi0.o.containsKey(baseImplementation$ApiMethodImpl0.getClientKey())) {
                baseImplementation$ApiMethodImpl0.setFailedResult(new Status(17));
                return baseImplementation$ApiMethodImpl0;
            }
            baseImplementation$ApiMethodImpl0.run(api$Client0);
        }
        catch(DeadObjectException unused_ex) {
            b b0 = new b(this, this);
            Message message0 = zabi0.m.obtainMessage(1, b0);
            zabi0.m.sendMessage(message0);
        }
        return baseImplementation$ApiMethodImpl0;
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zad() {
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final void zae() {
        if(this.b) {
            this.b = false;
            d d0 = new d(this, this);
            Message message0 = this.a.m.obtainMessage(1, d0);
            this.a.m.sendMessage(message0);
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
        this.a.a(null);
        this.a.w.zac(v, this.b);
    }

    @Override  // com.google.android.gms.common.api.internal.zabf
    public final boolean zaj() {
        if(!this.b) {
            HashSet hashSet0 = this.a.v.E;
            if(hashSet0 != null && !hashSet0.isEmpty()) {
                this.b = true;
                for(Object object0: hashSet0) {
                    ((zada)object0).c = null;
                }
                return false;
            }
            this.a.a(null);
            return true;
        }
        return false;
    }
}

