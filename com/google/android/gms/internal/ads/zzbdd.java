package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.io.IOException;

public final class zzbdd implements Runnable {
    public final G1 zza;
    public final zzbcx zzb;
    public final zzbcy zzc;
    public final zzcga zzd;

    public zzbdd(G1 g10, zzbcx zzbcx0, zzbcy zzbcy0, zzcga zzcga0) {
        this.zza = g10;
        this.zzb = zzbcx0;
        this.zzc = zzbcy0;
        this.zzd = zzcga0;
    }

    @Override
    public final void run() {
        zzcga zzcga0;
        G1 g10;
        try {
            g10 = this.zza;
            zzcga0 = this.zzd;
            zzbda zzbda0 = this.zzb.zzq();
            zzbcv zzbcv0 = this.zzb.zzp() ? zzbda0.zzg(this.zzc) : zzbda0.zzf(this.zzc);
            if(!zzbcv0.zze()) {
                zzcga0.zze(new RuntimeException("No entry contents."));
                zzbdi.a(g10.k);
                return;
            }
            F1 f10 = new F1(g10, zzbcv0.zzc());
            int v = f10.read();
            if(v == -1) {
                throw new IOException("Unable to read from cache.");
            }
            f10.unread(v);
            zzcga0.zzd(zzbdk.zzb(f10, zzbcv0.zzd(), zzbcv0.zzg(), zzbcv0.zza(), zzbcv0.zzf()));
            return;
        }
        catch(IOException | RemoteException iOException0) {
        }
        zzcfi.zzh("Unable to obtain a cache service instance.", iOException0);
        zzcga0.zze(iOException0);
        zzbdi.a(g10.k);
    }
}

