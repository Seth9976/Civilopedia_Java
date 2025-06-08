package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzay;

public final class zzbdr {
    public final byte[] a;
    public int b;
    public final zzbds c;

    public zzbdr(zzbds zzbds0, byte[] arr_b) {
        this.c = zzbds0;
        this.a = arr_b;
    }

    public final void a() {
        synchronized(this) {
            zzbds zzbds0 = this.c;
            if(zzbds0.b) {
                try {
                    zzbds0.a.zzj(this.a);
                    this.c.a.zzi(0);
                    this.c.a.zzg(this.b);
                    this.c.a.zzh(null);
                    this.c.a.zzf();
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzf("Clearcut log failed", remoteException0);
                }
            }
        }
    }

    public final zzbdr zza(int v) {
        this.b = v;
        return this;
    }

    public final void zzc() {
        synchronized(this) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzis)).booleanValue()) {
                zzbdp zzbdp0 = () -> this.a();
                this.c.c.execute(zzbdp0);
                return;
            }
            this.a();
        }
    }
}

