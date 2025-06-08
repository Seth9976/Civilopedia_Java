package com.google.android.gms.internal.ads;

import f0.g;
import java.util.concurrent.Executor;

public final class zzeym implements zzeza {
    public final zzfdo a;
    public final Executor b;
    public final S c;

    public zzeym(zzfdo zzfdo0, Executor executor0) {
        this.c = new S(16);
        this.a = zzfdo0;
        this.b = executor0;
    }

    public final zzfvl zzb(zzezb zzezb0, zzeyz zzeyz0, zzdbc zzdbc0) {
        zzfvl zzfvl2;
        zzfvl zzfvl0;
        zzfdo zzfdo0 = this.a;
        Executor executor0 = this.b;
        g g0 = new g(zzfdo0, zzdbc0, executor0);
        zzeyv zzeyv0 = (zzeyv)g0.m;
        if(zzeyv0 == null) {
            if(((Boolean)zzbjv.zza.zze()).booleanValue()) {
                zzfvl zzfvl1 = zzfvc.zzm(zzfut.zzv(zzdbc0.zzb().zze(zzfdo0.zza())), new N5(g0, 1), executor0);
                N5 n50 = new N5(g0, 0);
                zzfvl0 = zzfvc.zzf(zzfvl1, zzebn.class, n50, executor0);
            }
            else {
                zzfcd zzfcd0 = zzdbc0.zzg();
                zzeyv zzeyv1 = new zzeyv(null, zzfdo0.zzc(zzfcd0.zzd, zzfcd0.zzf, zzfcd0.zzj));
                g0.m = zzeyv1;
                zzfvl0 = zzfvc.zzi(zzeyv1);
            }
            zzfvl2 = zzfvc.zzm(zzfvl0, zzeyr.zza, executor0);
        }
        else {
            zzfvl2 = zzfvc.zzi(zzeyv0);
        }
        zzfvl zzfvl3 = zzfvc.zzn(zzfut.zzv(zzfvl2), new zzeyi(this, zzdbc0), executor0);
        M5 m50 = new M5();  // 初始化器: Ljava/lang/Object;-><init>()V
        return zzfvc.zzf(zzfvl3, Exception.class, m50, executor0);
    }

    @Override  // com.google.android.gms.internal.ads.zzeza
    public final zzfvl zzc(zzezb zzezb0, zzeyz zzeyz0, Object object0) {
        return this.zzb(zzezb0, zzeyz0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzeza
    public final Object zzd() {
        return null;
    }
}

