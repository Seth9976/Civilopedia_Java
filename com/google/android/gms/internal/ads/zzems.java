package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;

public final class zzems {
    public final zzemx a;
    public final String b;
    public zzdbm c;

    public zzems(zzemx zzemx0, String s) {
        this.a = zzemx0;
        this.b = s;
    }

    public final String zza() {
        synchronized(this) {
            String s = null;
            zzdbm zzdbm0 = this.c;
            if(zzdbm0 != null) {
                try {
                    s = zzdbm0.zzg();
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                    return null;
                }
            }
            return s;
        }
    }

    public final String zzb() {
        synchronized(this) {
            String s = null;
            zzdbm zzdbm0 = this.c;
            if(zzdbm0 != null) {
                try {
                    s = zzdbm0.zzg();
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzl("#007 Could not call remote method.", remoteException0);
                    return null;
                }
            }
            return s;
        }
    }

    public final void zzd(zzl zzl0, int v) throws RemoteException {
        synchronized(this) {
            this.c = null;
            zzemy zzemy0 = new zzemy(v);
            E9 e90 = new E9(this, 28);
            this.a.zzb(zzl0, this.b, zzemy0, e90);
        }
    }

    public final boolean zze() throws RemoteException {
        synchronized(this) {
            return this.a.zza();
        }
    }
}

