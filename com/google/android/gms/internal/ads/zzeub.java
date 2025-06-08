package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

public final class zzeub implements zzetg {
    public final Executor a;
    public final String b;

    public zzeub(zzcei zzcei0, Executor executor0, String s, PackageInfo packageInfo0, int v, byte[] arr_b) {
        this.a = executor0;
        this.b = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 41;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzfvl zzfvl0 = zzfvc.zzm(zzfvc.zzi(this.b), zzetz.zza, this.a);
        zzeua zzeua0 = new zzeua(this);
        return zzfvc.zzg(zzfvl0, Throwable.class, zzeua0, this.a);
    }
}

