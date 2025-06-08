package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;

public final class zzaob extends zzaoa {
    @Override  // com.google.android.gms.internal.ads.zzaoa
    public final ArrayList j(zzapc zzapc0, Context context0, zzali zzali0) {
        if(zzapc0.zzk() != null && this.C) {
            int v = zzapc0.zza();
            ArrayList arrayList0 = new ArrayList();
            arrayList0.addAll(super.j(zzapc0, context0, zzali0));
            arrayList0.add(new zzapt(zzapc0, "Za6LxNnVxz2lEtZQYrJ2QLB5PwaCpmcdWBAdgk+Rc+b6fjcW8QKpJ7ITar8M3xU9", "2mbuydE9pw99Ld1EHQbedo6oUJcW1o/QWNiH9X+lcIw=", zzali0, v, 24));
            return arrayList0;
        }
        return super.j(zzapc0, context0, zzali0);
    }

    public static zzaob zzs(String s, Context context0, boolean z) {
        zzaoa.l(context0, false);
        return new zzaob(context0, s, false);  // 初始化器: Lcom/google/android/gms/internal/ads/zzaoa;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V
    }

    @Deprecated
    public static zzaob zzt(String s, Context context0, boolean z, int v) {
        zzaoa.l(context0, z);
        return new zzaob(context0, s, z);  // 初始化器: Lcom/google/android/gms/internal/ads/zzaoa;-><init>(Landroid/content/Context;Ljava/lang/String;Z)V
    }
}

