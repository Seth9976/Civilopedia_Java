package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import d1.j;
import m1.b;
import m1.c;
import m1.d;

public final class zzk {
    public final zzam a;
    public final j b;
    public final zzba c;

    public zzk(zzam zzam0, j j0, zzba zzba0) {
        this.a = zzam0;
        this.b = j0;
        this.c = zzba0;
    }

    public final int getConsentStatus() {
        return this.a.zza();
    }

    public final boolean isConsentFormAvailable() {
        return this.c.zzc();
    }

    public final void requestConsentInfoUpdate(Activity activity0, d d0, c c0, b b0) {
        this.b.getClass();
        zzq zzq0 = new zzq(this.b, activity0, d0, c0, b0);
        this.b.b.execute(zzq0);
    }

    public final void reset() {
        this.c.zzb(null);
        this.a.zzd();
    }
}

