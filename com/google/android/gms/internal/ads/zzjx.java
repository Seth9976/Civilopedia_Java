package com.google.android.gms.internal.ads;

import android.content.Context;

@Deprecated
public final class zzjx {
    public final zzhd a;

    @Deprecated
    public zzjx(Context context0, zzckr zzckr0, byte[] arr_b) {
        this.a = new zzhd(context0, zzckr0, null);
    }

    @Deprecated
    public final zzjx zza(zzja zzja0) {
        zzcw.zzf(!this.a.l);
        this.a.f = new zzgv(zzja0);
        return this;
    }

    @Deprecated
    public final zzjx zzb(zzvm zzvm0) {
        zzcw.zzf(!this.a.l);
        this.a.e = new zzgw(zzvm0);
        return this;
    }

    @Deprecated
    public final zzjy zzc() {
        zzcw.zzf(!this.a.l);
        this.a.l = true;
        return new zzjy(this.a);
    }
}

