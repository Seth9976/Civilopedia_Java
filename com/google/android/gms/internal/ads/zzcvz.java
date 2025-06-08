package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

public final class zzcvz implements zzgqu {
    public final zzgrh a;
    public final zzgrh b;
    public final zzgrh c;
    public final zzgrh d;
    public final zzgrh e;
    public final zzgrh f;
    public final zzgrh g;
    public final zzgrh h;
    public final zzgrh i;
    public final zzgrh j;

    public zzcvz(zzgrh zzgrh0, zzgrh zzgrh1, zzgrh zzgrh2, zzgrh zzgrh3, zzgrh zzgrh4, zzgrh zzgrh5, zzgrh zzgrh6, zzgrh zzgrh7, zzgrh zzgrh8, zzgrh zzgrh9) {
        this.a = zzgrh0;
        this.b = zzgrh1;
        this.c = zzgrh2;
        this.d = zzgrh3;
        this.e = zzgrh4;
        this.f = zzgrh5;
        this.g = zzgrh6;
        this.h = zzgrh7;
        this.i = zzgrh8;
        this.j = zzgrh9;
    }

    public final e4 zza() {
        return new e4(((zzczs)this.a).zza(), ((Context)this.b.zzb()), ((zzcwf)this.c).zza(), ((zzcwe)this.d).zza(), ((zzcwq)this.e).zza(), ((zzcwg)this.f).zza(), ((zzdls)this.g).zza(), ((zzdji)this.h.zzb()), zzgqt.zza(this.i), ((Executor)this.j.zzb()));
    }

    @Override  // com.google.android.gms.internal.ads.zzgrh
    public final Object zzb() {
        return this.zza();
    }

    public static e4 zzc(zzcxw zzcxw0, Context context0, zzfbm zzfbm0, View view0, zzcli zzcli0, zzcxv zzcxv0, zzdns zzdns0, zzdji zzdji0, zzgqo zzgqo0, Executor executor0) {
        return new e4(zzcxw0, context0, zzfbm0, view0, zzcli0, zzcxv0, zzdns0, zzdji0, zzgqo0, executor0);
    }
}

