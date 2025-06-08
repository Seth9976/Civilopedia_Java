package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

public final class zzbki {
    public final Context a;

    public zzbki(Context context0) {
        this.a = context0;
    }

    public final void zza(zzbzf zzbzf0) {
        try {
            ((zzbkj)zzcfm.zzb(this.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbkh.zza)).zze(zzbzf0);
        }
        catch(zzcfl zzcfl0) {
            zzcfi.zzj(("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:" + zzcfl0.getMessage()));
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzj(("Error calling setFlagsAccessedBeforeInitializedListener: " + remoteException0.getMessage()));
        }
    }
}

