package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

public final class t2 extends zzcdo {
    public final Clock b;
    public final zzgqu c;
    public final zzgqu d;
    public final zzgqu e;
    public final zzgrh f;
    public final zzgqu g;
    public final zzgrh h;
    public final zzgrh i;

    public t2(Context context0, Clock clock0, zzg zzg0, zzcdn zzcdn0) {
        this.b = clock0;
        zzgqu zzgqu0 = zzgqv.zza(context0);
        this.c = zzgqu0;
        zzgqu zzgqu1 = zzgqv.zza(zzg0);
        this.d = zzgqu1;
        zzgqu zzgqu2 = zzgqv.zza(zzcdn0);
        this.e = zzgqu2;
        this.f = zzgqt.zzc(new zzccm(zzgqu0, zzgqu1, zzgqu2));
        zzgqu zzgqu3 = zzgqv.zza(clock0);
        this.g = zzgqu3;
        zzgrh zzgrh0 = zzgqt.zzc(new zzcco(zzgqu3, zzgqu1, zzgqu2));
        this.h = zzgrh0;
        this.i = zzgqt.zzc(new zzcdt(zzgqu0, new zzccq(zzgqu3, zzgrh0)));
    }

    @Override  // com.google.android.gms.internal.ads.zzcdo
    public final zzccp a() {
        s2 s20 = (s2)this.h.zzb();
        return new zzccp(this.b, s20);
    }
}

