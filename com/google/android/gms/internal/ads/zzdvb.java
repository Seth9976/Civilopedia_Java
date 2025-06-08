package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import javax.annotation.Nullable;

public final class zzdvb implements zza, zzdbw, zzdcn, zzddh, zzdeo, zzdgz {
    public final zzbdm i;
    public boolean j;

    public zzdvb(zzbdm zzbdm0, @Nullable zzezg zzezg0) {
        this.j = false;
        this.i = zzbdm0;
        zzbdm0.zzc(2);
        if(zzezg0 != null) {
            zzbdm0.zzc(1101);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized(this) {
            if(!this.j) {
                this.i.zzc(7);
                this.j = true;
                return;
            }
            this.i.zzc(8);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdbw
    public final void zza(zze zze0) {
        zzbdm zzbdm0 = this.i;
        switch(zze0.zza) {
            case 1: {
                zzbdm0.zzc(101);
                return;
            }
            case 2: {
                zzbdm0.zzc(102);
                return;
            }
            case 3: {
                zzbdm0.zzc(5);
                return;
            }
            case 4: {
                zzbdm0.zzc(103);
                return;
            }
            case 5: {
                zzbdm0.zzc(104);
                return;
            }
            case 6: {
                zzbdm0.zzc(105);
                return;
            }
            case 7: {
                zzbdm0.zzc(106);
                return;
            }
            default: {
                zzbdm0.zzc(4);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzb(zzfbx zzfbx0) {
        zzdux zzdux0 = new zzdux(zzfbx0);
        this.i.zzb(zzdux0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdeo
    public final void zzbE(zzbzv zzbzv0) {
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzd() {
        this.i.zzc(1109);
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zze(zzbeh zzbeh0) {
        zzdva zzdva0 = new zzdva(zzbeh0);
        this.i.zzb(zzdva0);
        this.i.zzc(0x44F);
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzf(zzbeh zzbeh0) {
        zzduz zzduz0 = new zzduz(zzbeh0);
        this.i.zzb(zzduz0);
        this.i.zzc(1102);
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzh(boolean z) {
        this.i.zzc((z ? 1107 : 1108));
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzi(zzbeh zzbeh0) {
        zzduy zzduy0 = new zzduy(zzbeh0);
        this.i.zzb(zzduy0);
        this.i.zzc(0x450);
    }

    @Override  // com.google.android.gms.internal.ads.zzdgz
    public final void zzk(boolean z) {
        this.i.zzc((z ? 1105 : 1106));
    }

    @Override  // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        synchronized(this) {
            this.i.zzc(6);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzddh
    public final void zzn() {
        this.i.zzc(3);
    }
}

