package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcfn;

public final class zzby extends zzb {
    public final zzcfn b;
    public final String c;

    public zzby(Context context0, String s, String s1) {
        String s2 = zzt.zzp().zzc(context0, s);
        super();
        this.b = new zzcfn(s2);
        this.c = s1;
    }

    @Override  // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.b.zza(this.c);
    }
}

