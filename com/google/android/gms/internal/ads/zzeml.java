package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbc;

public final class zzeml implements zza, zzdjg {
    public zzbc i;

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        synchronized(this) {
            zzbc zzbc0 = this.i;
            if(zzbc0 != null) {
                try {
                    zzbc0.zzb();
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzk("Remote Exception at onAdClicked.", remoteException0);
                }
            }
        }
    }

    public final void zza(zzbc zzbc0) {
        synchronized(this) {
            this.i = zzbc0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        synchronized(this) {
            zzbc zzbc0 = this.i;
            if(zzbc0 != null) {
                try {
                    zzbc0.zzb();
                }
                catch(RemoteException remoteException0) {
                    zzcfi.zzk("Remote Exception at onPhysicalClick.", remoteException0);
                }
            }
        }
    }
}

