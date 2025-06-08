package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

public final class zzfbi extends zzcan {
    public final zzfay i;
    public final zzfao j;
    public final zzfby k;
    public zzdst l;
    public boolean m;

    public zzfbi(zzfay zzfay0, zzfao zzfao0, zzfby zzfby0) {
        this.m = false;
        this.i = zzfay0;
        this.j = zzfao0;
        this.k = zzfby0;
    }

    public final boolean b() {
        synchronized(this) {
            return this.l != null && !this.l.zzd();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdst zzdst0 = this.l;
        return zzdst0 == null ? new Bundle() : zzdst0.zza();
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final zzdh zzc() throws RemoteException {
        synchronized(this) {
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
                return null;
            }
            zzdst zzdst0 = this.l;
            return zzdst0 != null ? zzdst0.zzl() : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final String zzd() throws RemoteException {
        synchronized(this) {
            zzdst zzdst0 = this.l;
            return zzdst0 != null && zzdst0.zzl() != null ? zzdst0.zzl().zzg() : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zze() throws RemoteException {
        this.zzf(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzf(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Preconditions.checkMainThread("destroy must be called on the main UI thread.");
            Context context0 = null;
            this.j.zzb(null);
            if(this.l != null) {
                if(iObjectWrapper0 != null) {
                    context0 = (Context)ObjectWrapper.unwrap(iObjectWrapper0);
                }
                this.l.zzm().zza(context0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzg(zzcas zzcas0) throws RemoteException {
        synchronized(this) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
            String s = zzcas0.zzb;
            String s1 = (String)zzay.zzc().zzb(zzbhz.zzes);
            if(s1 != null && s != null) {
                try {
                    if(Pattern.matches(s1, s)) {
                        return;
                    }
                }
                catch(RuntimeException runtimeException0) {
                    zzt.zzo().zzt(runtimeException0, "NonagonUtil.isPatternMatched");
                }
            }
            if(this.b() && !((Boolean)zzay.zzc().zzb(zzbhz.zzeu)).booleanValue()) {
                return;
            }
            zzfaq zzfaq0 = new zzfaq(null);
            this.l = null;
            this.i.h.zzo().zza(1);
            J5 j50 = new J5(this, 3);
            this.i.zzb(zzcas0.zza, zzcas0.zzb, zzfaq0, j50);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzh() {
        this.zzi(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzi(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Preconditions.checkMainThread("pause must be called on the main UI thread.");
            if(this.l != null) {
                Context context0 = iObjectWrapper0 == null ? null : ((Context)ObjectWrapper.unwrap(iObjectWrapper0));
                this.l.zzm().zzb(context0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzj() {
        this.zzk(null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzk(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Preconditions.checkMainThread("resume must be called on the main UI thread.");
            if(this.l != null) {
                Context context0 = iObjectWrapper0 == null ? null : ((Context)ObjectWrapper.unwrap(iObjectWrapper0));
                this.l.zzm().zzc(context0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzl(zzbw zzbw0) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        zzfao zzfao0 = this.j;
        if(zzbw0 == null) {
            zzfao0.zzb(null);
            return;
        }
        zzfao0.zzb(new T5(this, zzbw0, 1));
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzm(String s) throws RemoteException {
        synchronized(this) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
            this.k.zzb = s;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzn(boolean z) {
        synchronized(this) {
            Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
            this.m = z;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzo(zzcar zzcar0) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.j.zzf(zzcar0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzp(String s) throws RemoteException {
        synchronized(this) {
            Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
            this.k.zza = s;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzq() throws RemoteException {
        synchronized(this) {
            this.zzr(null);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzr(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            Activity activity0 = null;
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if(this.l != null) {
                if(iObjectWrapper0 != null) {
                    Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                    if(object0 instanceof Activity) {
                        activity0 = (Activity)object0;
                    }
                }
                this.l.zzg(this.m, activity0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return this.b();
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final boolean zzt() {
        return this.l != null && this.l.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzcao
    public final void zzu(zzcam zzcam0) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.j.zzh(zzcam0);
    }
}

