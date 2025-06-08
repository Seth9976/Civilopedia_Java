package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

public final class zzelo extends zzbr implements zzdej {
    public final Context i;
    public final zzexv j;
    public final String k;
    public final zzemh l;
    public zzq m;
    public final zzfcb n;
    public final zzcfo o;
    public zzcvv p;

    public zzelo(Context context0, zzq zzq0, String s, zzexv zzexv0, zzemh zzemh0, zzcfo zzcfo0) {
        this.i = context0;
        this.j = zzexv0;
        this.m = zzq0;
        this.k = s;
        this.l = zzemh0;
        this.n = zzexv0.zzi();
        this.o = zzcfo0;
        zzexv0.zzp(this);
    }

    public final void b(zzq zzq0) {
        synchronized(this) {
            this.n.zzr(zzq0);
            this.n.zzw(this.m.zzn);
        }
    }

    public final boolean c(zzl zzl0) {
        synchronized(this) {
            if(this.d()) {
                Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            }
            if(zzs.zzD(this.i) && zzl0.zzs == null) {
                zzcfi.zzg("Failed to load the ad because app ID is missing.");
                zzemh zzemh0 = this.l;
                if(zzemh0 != null) {
                    zzemh0.zza(zzfdc.zzd(4, null, null));
                }
                return false;
            }
            zzfcx.zza(this.i, zzl0.zzf);
            E9 e90 = new E9(this, 26);
            return this.j.zzb(zzl0, this.k, null, e90);
        }
    }

    public final boolean d() {
        boolean z = ((Boolean)zzbjn.zze.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue();
        return this.o.zzc < ((int)(((Integer)zzay.zzc().zzb(zzbhz.zziw)))) || !z;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
        synchronized(this) {
            Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
            zzcvv zzcvv0 = this.p;
            if(zzcvv0 != null) {
                zzcvv0.zzg();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
            zzcvv zzcvv0 = this.p;
            if(zzcvv0 != null) {
                zzcvv0.zzm().zzc(null);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbc0) {
        if(this.d()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.j.zzo(zzbc0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbf0) {
        if(this.d()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.l.zze(zzbf0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(zzbw zzbw0) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(zzq zzq0) {
        synchronized(this) {
            Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
            this.n.zzr(zzq0);
            this.m = zzq0;
            zzcvv zzcvv0 = this.p;
            if(zzcvv0 != null) {
                zzcvv0.zzh(this.j.zzd(), zzq0);
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbz0) {
        if(this.d()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.l.zzi(zzbz0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcj0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(zzw zzw0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcg0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdo0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbye0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) {
        synchronized(this) {
            if(this.d()) {
                Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
            }
            this.n.zzy(z);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbiu zzbiu0) {
        synchronized(this) {
            Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
            this.j.zzq(zzbiu0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzde0) {
        if(this.d()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        this.l.zzh(zzde0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyh0, String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcar0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String s) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(zzff zzff0) {
        synchronized(this) {
            if(this.d()) {
                Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
            }
            this.n.zzF(zzff0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() {
        synchronized(this) {
            return this.j.zza();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzdej
    public final void zza() {
        synchronized(this) {
            if(this.j.zzr()) {
                zzq zzq0 = this.n.zzg();
                if(this.p != null && this.p.zzf() != null && this.n.zzO()) {
                    List list0 = Collections.singletonList(this.p.zzf());
                    zzq0 = zzfch.zza(this.i, list0);
                }
                this.b(zzq0);
                try {
                    this.c(this.n.zze());
                }
                catch(RemoteException unused_ex) {
                    zzcfi.zzj("Failed to refresh the banner ad.");
                }
                return;
            }
            this.j.zzn();
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(zzl zzl0) throws RemoteException {
        synchronized(this) {
            this.b(this.m);
            return this.c(zzl0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcd0) {
        synchronized(this) {
            Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
            this.n.zzQ(zzcd0);
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzq zzg() {
        synchronized(this) {
            Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
            zzcvv zzcvv0 = this.p;
            if(zzcvv0 != null) {
                List list0 = Collections.singletonList(zzcvv0.zze());
                return zzfch.zza(this.i, list0);
            }
        }
        return this.n.zzg();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        return this.l.zzc();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        return this.l.zzd();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdh zzk() {
        zzcvv zzcvv0;
        synchronized(this) {
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
                return null;
            }
            zzcvv0 = this.p;
            if(zzcvv0 == null) {
                return null;
            }
        }
        return zzcvv0.zzl();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdk zzl() {
        synchronized(this) {
            Preconditions.checkMainThread("getVideoController must be called from the main thread.");
            zzcvv zzcvv0 = this.p;
            return zzcvv0 != null ? zzcvv0.zzd() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        if(this.d()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.j.zzd());
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        synchronized(this) {
        }
        return this.k;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() {
        synchronized(this) {
            zzcvv zzcvv0 = this.p;
            return zzcvv0 != null && zzcvv0.zzl() != null ? zzcvv0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() {
        synchronized(this) {
            zzcvv zzcvv0 = this.p;
            return zzcvv0 != null && zzcvv0.zzl() != null ? zzcvv0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            zzcvv zzcvv0 = this.p;
            if(zzcvv0 != null) {
                zzcvv0.zzV();
            }
        }
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(zzl zzl0, zzbi zzbi0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
            zzcvv zzcvv0 = this.p;
            if(zzcvv0 != null) {
                zzcvv0.zzm().zzb(null);
            }
        }
    }
}

