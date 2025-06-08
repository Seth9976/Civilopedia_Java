package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbxs;
import com.google.android.gms.internal.ads.zzcbq;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfo;
import java.util.Random;

public final class zzaw {
    public final zzcfb a;
    public final zzau b;
    public final String c;
    public final zzcfo d;
    public final Random e;
    public static final zzaw f;

    static {
        zzaw.f = new zzaw();
    }

    public zzaw() {
        zzcfb zzcfb0 = new zzcfb();
        zzau zzau0 = new zzau(new zzk(), new zzi(), new zzek(), new zzbna(), new zzcbq(), new zzbxs(), new zzbnb());
        zzcfo zzcfo0 = new zzcfo(0, 221908000, true, false, false);
        Random random0 = new Random();
        super();
        this.a = zzcfb0;
        this.b = zzau0;
        this.c = "6274588131732844055";
        this.d = zzcfo0;
        this.e = random0;
    }

    public static zzau zza() {
        return zzaw.f.b;
    }

    public static zzcfb zzb() {
        return zzaw.f.a;
    }

    public static zzcfo zzc() {
        return zzaw.f.d;
    }

    public static String zzd() {
        return zzaw.f.c;
    }

    public static Random zze() {
        return zzaw.f.e;
    }
}

