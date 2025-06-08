package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzfbc extends zzcbd {
    public final zzfay i;
    public final zzfao j;
    public final String k;
    public final zzfby l;
    public final Context m;
    public final zzcfo n;
    public zzdst o;
    public boolean p;

    public zzfbc(String s, zzfay zzfay0, Context context0, zzfao zzfao0, zzfby zzfby0, zzcfo zzcfo0) {
        this.k = s;
        this.i = zzfay0;
        this.j = zzfao0;
        this.l = zzfby0;
        this.m = context0;
        this.n = zzcfo0;
        this.p = ((Boolean)zzay.zzc().zzb(zzbhz.zzaA)).booleanValue();
    }

    public final void b(zzl zzl0, zzcbl zzcbl0, int v) {
        boolean z = false;
        synchronized(this) {
            if(((Boolean)zzbjn.zzi.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                z = true;
            }
            if(this.n.zzc < ((int)(((Integer)zzay.zzc().zzb(zzbhz.zziw)))) || !z) {
                Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            }
            this.j.zze(zzcbl0);
            if(zzs.zzD(this.m) && zzl0.zzs == null) {
                zzcfi.zzg("Failed to load the ad because app ID is missing.");
                zze zze0 = zzfdc.zzd(4, null, null);
                this.j.zza(zze0);
                return;
            }
            if(this.o != null) {
                return;
            }
            zzfaq zzfaq0 = new zzfaq(null);
            this.i.h.zzo().zza(v);
            J5 j50 = new J5(this, 2);
            this.i.zzb(zzl0, this.k, zzfaq0, j50);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdst zzdst0 = this.o;
        return zzdst0 == null ? new Bundle() : zzdst0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final zzdh zzc() {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
            return null;
        }
        zzdst zzdst0 = this.o;
        return zzdst0 != null ? zzdst0.zzl() : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final zzcbb zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        return this.o == null ? null : this.o.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final String zze() throws RemoteException {
        synchronized(this) {
            zzdst zzdst0 = this.o;
            return zzdst0 != null && zzdst0.zzl() != null ? zzdst0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzf(zzl zzl0, zzcbl zzcbl0) throws RemoteException {
        synchronized(this) {
            this.b(zzl0, zzcbl0, 2);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzg(zzl zzl0, zzcbl zzcbl0) throws RemoteException {
        synchronized(this) {
            this.b(zzl0, zzcbl0, 3);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzh(boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
            this.p = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzi(zzdb zzdb0) {
        zzfao zzfao0 = this.j;
        if(zzdb0 == null) {
            zzfao0.zzb(null);
            return;
        }
        zzfao0.zzb(new T5(this, zzdb0, 0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzj(zzde zzde0) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        this.j.zzc(zzde0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzk(zzcbh zzcbh0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.j.zzd(zzcbh0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzl(zzcbs zzcbs0) {
        synchronized(this) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            this.l.zza = zzcbs0.zza;
            this.l.zzb = zzcbs0.zzb;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzm(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            this.zzn(iObjectWrapper0, this.p);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzn(IObjectWrapper iObjectWrapper0, boolean z) throws RemoteException {
        synchronized(this) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
            if(this.o == null) {
                zzcfi.zzj("Rewarded can not be shown before loaded");
                zze zze0 = zzfdc.zzd(9, null, null);
                this.j.zzk(zze0);
                return;
            }
            Activity activity0 = (Activity)ObjectWrapper.unwrap(iObjectWrapper0);
            this.o.zzg(z, activity0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        return this.o != null && !this.o.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zzcbe
    public final void zzp(zzcbm zzcbm0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.j.zzi(zzcbm0);
    }
}

