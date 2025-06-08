package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class zzdoj implements zzbom {
    public final zzdok zza;
    public final zzbmv zzb;

    public zzdoj(zzdok zzdok0, zzbmv zzbmv0) {
        this.zza = zzdok0;
        this.zzb = zzbmv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzbmv zzbmv0;
        zzdok zzdok0;
        try {
            zzdok0 = this.zza;
            zzbmv0 = this.zzb;
            zzdok0.n = Long.parseLong(((String)map0.get("timestamp")));
        }
        catch(NumberFormatException unused_ex) {
            zzcfi.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzdok0.m = (String)map0.get("id");
        String s = (String)map0.get("asset_id");
        if(zzbmv0 == null) {
            zzcfi.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbmv0.zzf(s);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

