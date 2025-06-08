package com.google.android.gms.internal.ads;

import android.content.Context;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbta {
    public final zzbsm a;
    public static final S b;
    public static final S c;

    static {
        zzbta.b = new S(11);
        zzbta.c = new S(12);
    }

    public zzbta(Context context0, zzcfo zzcfo0, String s, @Nullable zzfhu zzfhu0) {
        this.a = new zzbsm(context0, zzcfo0, s, zzbta.b, zzbta.c, zzfhu0);
    }

    public final zzbsq zza(String s, zzbst zzbst0, zzbss zzbss0) {
        return new zzbte(this.a, s, zzbst0, zzbss0);
    }

    public final zzbtj zzb() {
        return new zzbtj(this.a);
    }
}

