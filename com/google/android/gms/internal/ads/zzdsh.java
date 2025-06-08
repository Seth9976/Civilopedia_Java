package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzdsh implements zza, zzo, zzw, zzbnm, zzbno, zzdjg {
    public zza i;
    public zzbnm j;
    public zzo k;
    public zzbno l;
    public zzdsi m;
    public zzdjg n;

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized(this) {
            zza zza0 = this.i;
            if(zza0 != null) {
                zza0.onAdClicked();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbnm
    public final void zza(String s, Bundle bundle0) {
        synchronized(this) {
            zzbnm zzbnm0 = this.j;
            if(zzbnm0 != null) {
                zzbnm0.zza(s, bundle0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        synchronized(this) {
            zzo zzo0 = this.k;
            if(zzo0 != null) {
                zzo0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
        synchronized(this) {
            zzo zzo0 = this.k;
            if(zzo0 != null) {
                zzo0.zzbC();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbno
    public final void zzbD(String s, String s1) {
        synchronized(this) {
            zzbno zzbno0 = this.l;
            if(zzbno0 != null) {
                zzbno0.zzbD(s, s1);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
        synchronized(this) {
            zzo zzo0 = this.k;
            if(zzo0 != null) {
                zzo0.zzbK();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
        synchronized(this) {
            zzo zzo0 = this.k;
            if(zzo0 != null) {
                zzo0.zzbr();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
        synchronized(this) {
            zzo zzo0 = this.k;
            if(zzo0 != null) {
                zzo0.zze();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int v) {
        synchronized(this) {
            zzo zzo0 = this.k;
            if(zzo0 != null) {
                zzo0.zzf(v);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.overlay.zzw
    public final void zzg() {
        synchronized(this) {
            zzdsi zzdsi0 = this.m;
            if(zzdsi0 != null) {
                zzdsi0.zza.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        synchronized(this) {
            zzdjg zzdjg0 = this.n;
            if(zzdjg0 != null) {
                zzdjg0.zzq();
            }
        }
    }
}

