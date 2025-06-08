package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzez;
import com.google.android.gms.common.util.Clock;

public final class zzccp {
    public final Clock a;
    public final s2 b;

    public zzccp(Clock clock0, s2 s20) {
        this.a = clock0;
        this.b = s20;
    }

    public static zzccp zza(Context context0) {
        return zzcdo.zzd(context0).a();
    }

    public final void zzb(int v, long v1) {
        this.b.a(v, v1);
    }

    public final void zzc() {
        this.b.getClass();
        boolean z = !((Boolean)zzay.zzc().zzb(zzbhz.zzao)).booleanValue();
    }

    public final void zzd(zzez zzez0) {
        long v = this.a.currentTimeMillis();
        this.b.a(-1, v);
    }

    public final void zze() {
        long v = this.a.currentTimeMillis();
        this.b.a(-1, v);
    }
}

