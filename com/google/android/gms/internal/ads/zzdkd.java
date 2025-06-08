package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

public class zzdkd {
    public final zzdlg a;
    public final zzcli b;

    public zzdkd(zzdlg zzdlg0, zzcli zzcli0) {
        this.a = zzdlg0;
        this.b = zzcli0;
    }

    public final View zza() {
        zzcli zzcli0 = this.b;
        return zzcli0 == null ? null : zzcli0.zzI();
    }

    public final View zzb() {
        zzcli zzcli0 = this.b;
        return zzcli0 != null ? zzcli0.zzI() : null;
    }

    public final zzcli zzc() {
        return this.b;
    }

    public final zzdiz zzd(Executor executor0) {
        return new zzdiz(new zzdkb(this.b), executor0);
    }

    public final zzdlg zze() {
        return this.a;
    }

    public Set zzf(zzdat zzdat0) {
        return Collections.singleton(new zzdiz(zzdat0, zzcfv.zzf));
    }

    public Set zzg(zzdat zzdat0) {
        return Collections.singleton(new zzdiz(zzdat0, zzcfv.zzf));
    }

    public static final zzdiz zzh(zzfhe zzfhe0) {
        return new zzdiz(zzfhe0, zzcfv.zzf);
    }

    public static final zzdiz zzi(zzdll zzdll0) {
        return new zzdiz(zzdll0, zzcfv.zzf);
    }
}

