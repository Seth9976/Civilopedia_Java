package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

public class zzcwc {
    public final zzcxv a;
    public final View b;
    public final zzfbm c;
    public final zzcli d;

    public zzcwc(View view0, zzcli zzcli0, zzcxv zzcxv0, zzfbm zzfbm0) {
        this.b = view0;
        this.d = zzcli0;
        this.a = zzcxv0;
        this.c = zzfbm0;
    }

    public final View zza() {
        return this.b;
    }

    public final zzcli zzb() {
        return this.d;
    }

    public final zzcxv zzc() {
        return this.a;
    }

    public zzddf zzd(Set set0) {
        return new zzddf(set0);
    }

    public final zzfbm zze() {
        return this.c;
    }

    public static final zzdiz zzf(Context context0, zzcfo zzcfo0, zzfbl zzfbl0, zzfcd zzfcd0) {
        return new zzdiz(new zzcwa(context0, zzcfo0, zzfbl0, zzfcd0), zzcfv.zzf);
    }

    public static final Set zzg(zzcxm zzcxm0) {
        return Collections.singleton(new zzdiz(zzcxm0, zzcfv.zzf));
    }

    public static final zzdiz zzh(zzcxk zzcxk0) {
        return new zzdiz(zzcxk0, zzcfv.zze);
    }
}

