package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

public final class zzah {
    public String a;
    public Uri b;
    public final List c;
    public final zzfrj d;

    public zzah() {
        this.c = Collections.emptyList();
        this.d = zzfrj.zzo();
    }

    public final zzah zza(String s) {
        this.a = s;
        return this;
    }

    public final zzah zzb(Uri uri0) {
        this.b = uri0;
        return this;
    }

    public final zzbb zzc() {
        zzay zzay0 = this.b == null ? null : new zzay(this.b, this.c, this.d);  // 初始化器: Lcom/google/android/gms/internal/ads/zzaw;-><init>(Landroid/net/Uri;Ljava/util/List;Lcom/google/android/gms/internal/ads/zzfrj;)V
        return new zzbb((this.a == null ? "" : this.a), new zzan(), zzay0, new zzau(), zzbh.zza);  // 初始化器: Lcom/google/android/gms/internal/ads/zzal;-><init>()V
    }
}

