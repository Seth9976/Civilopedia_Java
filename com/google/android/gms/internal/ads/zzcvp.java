package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbs;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzcvp extends zzbcf {
    public final zzcvo i;
    public final zzbs j;
    public final zzexh k;
    public boolean l;

    public zzcvp(zzcvo zzcvo0, zzbs zzbs0, zzexh zzexh0) {
        this.l = false;
        this.i = zzcvo0;
        this.j = zzbs0;
        this.k = zzexh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final zzbs zze() {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final zzdh zzf() {
        return !((Boolean)zzay.zzc().zzb(zzbhz.zzfK)).booleanValue() ? null : this.i.zzl();
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final void zzg(boolean z) {
        this.l = z;
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final void zzh(zzde zzde0) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        zzexh zzexh0 = this.k;
        if(zzexh0 != null) {
            zzexh0.zzp(zzde0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final void zzi(IObjectWrapper iObjectWrapper0, zzbcn zzbcn0) {
        try {
            this.k.zzs(zzbcn0);
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
            this.i.zzd(activity0, zzbcn0, this.l);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbcg
    public final void zzj(zzbck zzbck0) {
    }
}

