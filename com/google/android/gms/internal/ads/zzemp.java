package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzemp extends zzbr {
    public final zzq i;
    public final Context j;
    public final zzezo k;
    public final String l;
    public final zzcfo m;
    public final zzemh n;
    public final zzfao o;
    public zzdjz p;
    public boolean q;

    public zzemp(Context context0, zzq zzq0, String s, zzezo zzezo0, zzemh zzemh0, zzfao zzfao0, zzcfo zzcfo0) {
        this.i = zzq0;
        this.l = s;
        this.j = context0;
        this.k = zzezo0;
        this.n = zzemh0;
        this.o = zzfao0;
        this.m = zzcfo0;
        this.q = ((Boolean)zzay.zzc().zzb(zzbhz.zzaA)).booleanValue();
    }

    public final boolean b() {
        synchronized(this) {
            return this.p != null && !this.p.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
            zzdjz zzdjz0 = this.p;
            if(zzdjz0 != null) {
                zzdjz0.zzm().zzc(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbc0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbf0) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.n.zze(zzbf0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(zzbw zzbw0) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(zzq zzq0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbz0) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.n.zzi(zzbz0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcj0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(zzw zzw0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcg0) {
        this.n.zzs(zzcg0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdo0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
            this.q = z;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbye0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbiu zzbiu0) {
        synchronized(this) {
            Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
            this.k.zzi(zzbiu0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzde0) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.n.zzh(zzde0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyh0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcar0) {
        this.o.zzf(zzcar0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(zzff zzff0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.p == null) {
                zzcfi.zzj("Interstitial can not be shown before loaded.");
                zze zze0 = zzfdc.zzd(9, null, null);
                this.n.zzk(zze0);
                return;
            }
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
            this.p.zzc(this.q, activity0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
        synchronized(this) {
            Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
            zzdjz zzdjz0 = this.p;
            if(zzdjz0 == null) {
                zzcfi.zzj("Interstitial can not be shown before loaded.");
                zze zze0 = zzfdc.zzd(9, null, null);
                this.n.zzk(zze0);
                return;
            }
            zzdjz0.zzc(this.q, null);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() {
        synchronized(this) {
            return this.k.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        synchronized(this) {
            Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
            return this.b();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(zzl zzl0) {
        synchronized(this) {
            boolean z = ((Boolean)zzbjn.zzf.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue();
            if(this.m.zzc < ((int)(((Integer)zzay.zzc().zzb(zzbhz.zziw)))) || !z) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(zzs.zzD(this.j) && zzl0.zzs == null) {
                zzcfi.zzg("Failed to load the ad because app ID is missing.");
                zzemh zzemh0 = this.n;
                if(zzemh0 != null) {
                    zzemh0.zza(zzfdc.zzd(4, null, null));
                }
                return false;
            }
            if(this.b()) {
                return false;
            }
            zzfcx.zza(this.j, zzl0.zzf);
            this.p = null;
            zzezh zzezh0 = new zzezh(this.i);
            E9 e90 = new E9(this, 27);
            return this.k.zzb(zzl0, this.l, zzezh0, e90);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcd0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzq zzg() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        return this.n.zzc();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        return this.n.zzd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdh zzk() {
        zzdjz zzdjz0;
        synchronized(this) {
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
                return null;
            }
            zzdjz0 = this.p;
            if(zzdjz0 == null) {
                return null;
            }
        }
        return zzdjz0.zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdk zzl() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        synchronized(this) {
        }
        return this.l;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() {
        synchronized(this) {
            zzdjz zzdjz0 = this.p;
            return zzdjz0 != null && zzdjz0.zzl() != null ? zzdjz0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() {
        synchronized(this) {
            zzdjz zzdjz0 = this.p;
            return zzdjz0 != null && zzdjz0.zzl() != null ? zzdjz0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            zzdjz zzdjz0 = this.p;
            if(zzdjz0 != null) {
                zzdjz0.zzm().zza(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(zzl zzl0, zzbi zzbi0) {
        this.n.zzf(zzbi0);
        this.zzaa(zzl0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
            zzdjz zzdjz0 = this.p;
            if(zzdjz0 != null) {
                zzdjz0.zzm().zzb(null);
            }
        }
    }
}

