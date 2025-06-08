package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

public final class zzfmv {
    public final byte[] a;
    public int b;
    public int c;
    public final zzfmw d;

    public zzfmv(zzfmw zzfmw0, byte[] arr_b) {
        this.d = zzfmw0;
        this.a = arr_b;
    }

    public final zzfmv zza(int v) {
        this.c = v;
        return this;
    }

    public final zzfmv zzb(int v) {
        this.b = v;
        return this;
    }

    public final void zzc() {
        synchronized(this) {
            zzfmw zzfmw0 = this.d;
            if(zzfmw0.b) {
                try {
                    zzfmw0.a.zzj(this.a);
                    this.d.a.zzi(this.b);
                    this.d.a.zzg(this.c);
                    this.d.a.zzh(null);
                    this.d.a.zzf();
                }
                catch(RemoteException remoteException0) {
                    Log.d("GASS", "Clearcut log failed", remoteException0);
                }
            }
        }
    }
}

