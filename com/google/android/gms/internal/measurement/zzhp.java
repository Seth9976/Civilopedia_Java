package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p.b;

public final class zzhp {
    public static final b a;

    static {
        zzhp.a = new b();  // 初始化器: Lp/k;-><init>()V
    }

    public static Uri zza(String s) {
        synchronized(zzhp.class) {
            b b0 = zzhp.a;
            Uri uri0 = (Uri)b0.getOrDefault("com.google.android.gms.measurement", null);
            if(uri0 == null) {
                Uri uri1 = Uri.parse(("content://com.google.android.gms.phenotype/" + Uri.encode("com.google.android.gms.measurement")));
                b0.put("com.google.android.gms.measurement", uri1);
                return uri1;
            }
            return uri0;
        }
    }
}

