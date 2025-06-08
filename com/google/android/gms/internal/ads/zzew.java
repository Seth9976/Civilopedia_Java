package com.google.android.gms.internal.ads;

import android.content.Context;

public final class zzew implements zzep {
    public final Context a;
    public final zzey b;

    public zzew(Context context0) {
        zzey zzey0 = new zzey();
        super();
        this.a = context0.getApplicationContext();
        this.b = zzey0;
    }

    @Override  // com.google.android.gms.internal.ads.zzep
    public final zzeq zza() {
        zzfd zzfd0 = this.b.zzg();
        return new zzex(this.a, zzfd0);
    }
}

