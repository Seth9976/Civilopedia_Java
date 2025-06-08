package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

@Deprecated
@ParametersAreNonnullByDefault
public final class zzbif {
    public static final void zza(zzbie zzbie0, zzbic zzbic0) {
        if(zzbic0.c == null) {
            throw new IllegalArgumentException("Context can\'t be null. Please set up context in CsiConfiguration.");
        }
        String s = zzbic0.d;
        if(TextUtils.isEmpty(s)) {
            throw new IllegalArgumentException("AfmaVersion can\'t be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbie0.zzd(zzbic0.c, s, zzbic0.a, zzbic0.b);
    }
}

