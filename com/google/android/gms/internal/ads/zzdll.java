package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;

public final class zzdll implements zzdbt, zzdiq {
    public final zzccv i;
    public final Context j;
    public final zzcdn k;
    public final View l;
    public String m;
    public final zzbdw n;

    public zzdll(zzccv zzccv0, Context context0, zzcdn zzcdn0, View view0, zzbdw zzbdw0) {
        this.i = zzccv0;
        this.j = context0;
        this.k = zzcdn0;
        this.l = view0;
        this.n = zzbdw0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzbv() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdiq
    public final void zze() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdiq
    public final void zzf() {
        zzbdw zzbdw0 = this.n;
        if(zzbdw0 == zzbdw.zzk) {
            return;
        }
        this.m = this.k.zzd(this.j) + (zzbdw0 == zzbdw.zzh ? "/Rewarded" : "/Interstitial");
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzj() {
        this.i.zzb(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzm() {
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzo() {
        View view0 = this.l;
        if(view0 != null && this.m != null) {
            Context context0 = view0.getContext();
            this.k.zzs(context0, this.m);
        }
        this.i.zzb(true);
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    @ParametersAreNonnullByDefault
    public final void zzp(zzcal zzcal0, String s, String s1) {
        zzcdn zzcdn0 = this.k;
        if(zzcdn0.zzu(this.j)) {
            try {
                String s2 = zzcdn0.zza(this.j);
                String s3 = zzcal0.zzc();
                int v = zzcal0.zzb();
                zzcdn0.zzo(this.j, s2, this.i.zza(), s3, v);
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzk("Remote Exception to get reward item.", remoteException0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbt
    public final void zzr() {
    }
}

