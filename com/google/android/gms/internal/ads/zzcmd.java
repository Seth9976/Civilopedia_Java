package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdn;

public final class zzcmd implements Runnable {
    public final zzcme zza;
    public final int zzb;
    public final int zzc;
    public final boolean zzd;
    public final boolean zze;

    public zzcmd(zzcme zzcme0, int v, int v1, boolean z, boolean z1) {
        this.zza = zzcme0;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = z;
        this.zze = z1;
    }

    @Override
    public final void run() {
        boolean z5;
        boolean z4;
        int v3;
        zzcme zzcme0 = this.zza;
        int v = this.zzb;
        int v1 = this.zzc;
        boolean z = this.zzd;
        boolean z1 = this.zze;
        synchronized(zzcme0.j) {
            boolean z2 = zzcme0.o;
            boolean z3 = false;
            if(z2 || v1 != 1) {
                v3 = v1;
                z4 = false;
            }
            else {
                v3 = 1;
                z4 = true;
            }
            if(v == v1 || v3 != 1) {
                z5 = false;
            }
            else {
                v3 = 1;
                z5 = true;
            }
            if(z2 || z4) {
                z3 = true;
            }
            try {
                zzcme0.o = z3;
                if(z4) {
                    zzdn zzdn0 = zzcme0.n;
                    if(zzdn0 != null) {
                        zzdn0.zzi();
                    }
                }
                if(z5) {
                    zzdn zzdn1 = zzcme0.n;
                    if(zzdn1 != null) {
                        zzdn1.zzh();
                    }
                }
                if(v != v1 && v3 == 2) {
                    zzdn zzdn2 = zzcme0.n;
                    if(zzdn2 != null) {
                        zzdn2.zzg();
                    }
                }
                if(v != v1 && v3 == 3) {
                    zzdn zzdn3 = zzcme0.n;
                    if(zzdn3 != null) {
                        zzdn3.zze();
                    }
                    zzcme0.i.zzy();
                }
                if(z != z1) {
                    zzdn zzdn4 = zzcme0.n;
                    if(zzdn4 != null) {
                        zzdn4.zzf(z1);
                    }
                }
            }
            catch(RemoteException remoteException0) {
                zzcfi.zzl("#007 Could not call remote method.", remoteException0);
            }
        }
    }
}

