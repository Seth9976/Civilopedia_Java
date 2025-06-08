package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdjg;

public final class zzv extends zzbxu {
    public final AdOverlayInfoParcel i;
    public final Activity j;
    public boolean k;
    public boolean l;

    public zzv(Activity activity0, AdOverlayInfoParcel adOverlayInfoParcel0) {
        this.k = false;
        this.l = false;
        this.i = adOverlayInfoParcel0;
        this.j = activity0;
    }

    public final void b() {
        synchronized(this) {
            if(!this.l) {
                zzo zzo0 = this.i.zzc;
                if(zzo0 != null) {
                    zzo0.zzf(4);
                }
                this.l = true;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final boolean zzE() throws RemoteException {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzg(int v, int v1, Intent intent0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzh() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzj(IObjectWrapper iObjectWrapper0) throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzk(Bundle bundle0) {
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzht)).booleanValue();
        Activity activity0 = this.j;
        if(z) {
            activity0.requestWindowFeature(1);
        }
        boolean z1 = bundle0 != null && bundle0.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        AdOverlayInfoParcel adOverlayInfoParcel0 = this.i;
        if(adOverlayInfoParcel0 == null) {
            activity0.finish();
            return;
        }
        if(z1) {
            activity0.finish();
            return;
        }
        if(bundle0 == null) {
            zza zza0 = adOverlayInfoParcel0.zzb;
            if(zza0 != null) {
                zza0.onAdClicked();
            }
            zzdjg zzdjg0 = adOverlayInfoParcel0.zzy;
            if(zzdjg0 != null) {
                zzdjg0.zzq();
            }
            if(activity0.getIntent() != null && activity0.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true)) {
                zzo zzo0 = adOverlayInfoParcel0.zzc;
                if(zzo0 != null) {
                    zzo0.zzb();
                }
            }
        }
        if(!com.google.android.gms.ads.internal.overlay.zza.zzb(activity0, adOverlayInfoParcel0.zza, adOverlayInfoParcel0.zzi, adOverlayInfoParcel0.zza.zzi)) {
            activity0.finish();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzl() throws RemoteException {
        if(this.j.isFinishing()) {
            this.b();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzn() throws RemoteException {
        zzo zzo0 = this.i.zzc;
        if(zzo0 != null) {
            zzo0.zzbr();
        }
        if(this.j.isFinishing()) {
            this.b();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzo() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzp() throws RemoteException {
        if(this.k) {
            this.j.finish();
            return;
        }
        this.k = true;
        zzo zzo0 = this.i.zzc;
        if(zzo0 != null) {
            zzo0.zzbK();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzq(Bundle bundle0) throws RemoteException {
        bundle0.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.k);
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzr() throws RemoteException {
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzs() throws RemoteException {
        if(this.j.isFinishing()) {
            this.b();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzt() throws RemoteException {
        zzo zzo0 = this.i.zzc;
        if(zzo0 != null) {
            zzo0.zze();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbxv
    public final void zzv() throws RemoteException {
    }
}

