package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public class zzeje extends zzekf {
    public final zzdjp s;

    public zzeje(zzdbr zzdbr0, zzdje zzdje0, zzdcl zzdcl0, zzdda zzdda0, zzddf zzddf0, zzdcg zzdcg0, zzdgm zzdgm0, zzdjw zzdjw0, zzddz zzddz0, zzdjp zzdjp0, zzdgi zzdgi0) {
        super(zzdbr0, zzdje0, zzdcl0, zzdda0, zzddf0, zzdgm0, zzddz0, zzdjw0, zzdgi0, zzdcg0);
        this.s = zzdjp0;
    }

    @Override  // com.google.android.gms.internal.ads.zzekf
    public final void zzs(zzcax zzcax0) {
        this.s.zza(zzcax0);
    }

    @Override  // com.google.android.gms.internal.ads.zzekf
    public final void zzt(zzcbb zzcbb0) throws RemoteException {
        zzcax zzcax0 = new zzcax(zzcbb0.zzf(), zzcbb0.zze());
        this.s.zza(zzcax0);
    }

    @Override  // com.google.android.gms.internal.ads.zzekf
    public final void zzu() throws RemoteException {
        this.s.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzekf
    public final void zzv() {
        this.s.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzekf
    public final void zzy() {
        this.s.zzc();
    }
}

