package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzeha extends zzcav implements zzddd {
    public zzcaw i;
    public zzddc j;
    public zzdjr k;

    @Override  // com.google.android.gms.internal.ads.zzddd
    public final void zza(zzddc zzddc0) {
        synchronized(this) {
            this.j = zzddc0;
        }
    }

    public final void zzc(zzcaw zzcaw0) {
        synchronized(this) {
            this.i = zzcaw0;
        }
    }

    public final void zzd(zzdjr zzdjr0) {
        synchronized(this) {
            this.k = zzdjr0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zze(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzcaw zzcaw0 = this.i;
            if(zzcaw0 != null) {
                ((u5)zzcaw0).j.onAdClicked();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzf(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzcaw zzcaw0 = this.i;
            if(zzcaw0 != null) {
                zzcaw0.zzf(iObjectWrapper0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzg(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        synchronized(this) {
            zzddc zzddc0 = this.j;
            if(zzddc0 != null) {
                zzddc0.zza(v);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzh(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzcaw zzcaw0 = this.i;
            if(zzcaw0 != null) {
                ((u5)zzcaw0).k.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzi(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzddc zzddc0 = this.j;
            if(zzddc0 != null) {
                zzddc0.zzd();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzj(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzcaw zzcaw0 = this.i;
            if(zzcaw0 != null) {
                ((u5)zzcaw0).i.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzk(IObjectWrapper iObjectWrapper0, int v) throws RemoteException {
        synchronized(this) {
            zzdjr zzdjr0 = this.k;
            if(zzdjr0 != null) {
                zzcfi.zzj(("Fail to initialize adapter " + ((t5)zzdjr0).c.zza));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzl(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzdjr zzdjr0 = this.k;
            if(zzdjr0 != null) {
                zzejr zzejr0 = new zzejr(((t5)zzdjr0), ((t5)zzdjr0).a, ((t5)zzdjr0).b, ((t5)zzdjr0).c);
                ((t5)zzdjr0).d.b.execute(zzejr0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzm(IObjectWrapper iObjectWrapper0, zzcax zzcax0) throws RemoteException {
        synchronized(this) {
            zzcaw zzcaw0 = this.i;
            if(zzcaw0 != null) {
                ((u5)zzcaw0).l.zza(zzcax0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzn(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzcaw zzcaw0 = this.i;
            if(zzcaw0 != null) {
                ((u5)zzcaw0).k.zze();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcaw
    public final void zzo(IObjectWrapper iObjectWrapper0) throws RemoteException {
        synchronized(this) {
            zzcaw zzcaw0 = this.i;
            if(zzcaw0 != null) {
                ((u5)zzcaw0).l.zzc();
            }
        }
    }
}

