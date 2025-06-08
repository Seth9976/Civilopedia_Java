package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;

public final class zzekk implements zzefd {
    public final Context a;
    public final zzcws b;
    public final zzbiu c;
    public final zzfvm d;
    public final zzfgf e;

    public zzekk(Context context0, zzcws zzcws0, zzfgf zzfgf0, zzfvm zzfvm0, zzbiu zzbiu0) {
        this.a = context0;
        this.b = zzcws0;
        this.e = zzfgf0;
        this.d = zzfvm0;
        this.c = zzbiu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0) {
        View view0 = new View(this.a);
        zzfbm zzfbm0 = (zzfbm)zzfbl0.zzv.get(0);
        w5 w50 = new w5(view0, null, zzekg.zza, zzfbm0);  // 初始化器: Lcom/google/android/gms/internal/ads/zzcwc;-><init>(Landroid/view/View;Lcom/google/android/gms/internal/ads/zzcli;Lcom/google/android/gms/internal/ads/zzcxv;Lcom/google/android/gms/internal/ads/zzfbm;)V
        zzcym zzcym0 = new zzcym(zzfbx0, zzfbl0, null);
        zzcvw zzcvw0 = this.b.zza(zzcym0, w50);
        return zzffp.zzd(new zzekh(this, new zzbip(zzcvw0.zzk(), zzfbl0.zzt.zzb, zzfbl0.zzt.zza)), this.d, zzffz.zzq, this.e).zzb(zzffz.zzr).zzd(zzfvc.zzi(zzcvw0.zza())).zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzefd
    public final boolean zzb(zzfbx zzfbx0, zzfbl zzfbl0) {
        return this.c != null && (zzfbl0.zzt != null && zzfbl0.zzt.zza != null);
    }
}

