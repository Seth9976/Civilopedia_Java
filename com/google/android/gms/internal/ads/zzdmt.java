package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdmt extends zzbkx {
    public final zzdnh i;
    public IObjectWrapper j;

    public zzdmt(zzdnh zzdnh0) {
        this.i = zzdnh0;
    }

    public static float b(IObjectWrapper iObjectWrapper0) {
        if(iObjectWrapper0 == null) {
            return 0.0f;
        }
        Drawable drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
        return drawable0 == null || drawable0.getIntrinsicWidth() == -1 || drawable0.getIntrinsicHeight() == -1 ? 0.0f : ((float)drawable0.getIntrinsicWidth()) / ((float)drawable0.getIntrinsicHeight());
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final float zze() throws RemoteException {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfj)).booleanValue()) {
            return 0.0f;
        }
        zzdnh zzdnh0 = this.i;
        if(zzdnh0.zzb() != 0.0f) {
            return zzdnh0.zzb();
        }
        if(zzdnh0.zzj() != null) {
            try {
                return zzdnh0.zzj().zze();
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzh("Remote exception getting video controller aspect ratio.", remoteException0);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper0 = this.j;
        if(iObjectWrapper0 != null) {
            return zzdmt.b(iObjectWrapper0);
        }
        zzblb zzblb0 = zzdnh0.zzm();
        if(zzblb0 != null) {
            float f = zzblb0.zzd() == -1 || zzblb0.zzc() == -1 ? 0.0f : ((float)zzblb0.zzd()) / ((float)zzblb0.zzc());
            return f == 0.0f ? zzdmt.b(zzblb0.zzf()) : f;
        }
        return 0.0f;
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final float zzf() throws RemoteException {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfk)).booleanValue()) {
            return 0.0f;
        }
        return this.i.zzj() == null ? 0.0f : this.i.zzj().zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final float zzg() throws RemoteException {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfk)).booleanValue()) {
            return 0.0f;
        }
        return this.i.zzj() == null ? 0.0f : this.i.zzj().zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final zzdk zzh() throws RemoteException {
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzfk)).booleanValue() ? this.i.zzj() : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper0 = this.j;
        if(iObjectWrapper0 != null) {
            return iObjectWrapper0;
        }
        zzblb zzblb0 = this.i.zzm();
        return zzblb0 == null ? null : zzblb0.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final void zzj(IObjectWrapper iObjectWrapper0) {
        this.j = iObjectWrapper0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final boolean zzk() throws RemoteException {
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzfk)).booleanValue() ? this.i.zzj() != null : false;
    }

    @Override  // com.google.android.gms.internal.ads.zzbky
    public final void zzl(zzbmj zzbmj0) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfk)).booleanValue()) {
            return;
        }
        zzdnh zzdnh0 = this.i;
        if(zzdnh0.zzj() instanceof zzcme) {
            ((zzcme)zzdnh0.zzj()).zzv(zzbmj0);
        }
    }
}

