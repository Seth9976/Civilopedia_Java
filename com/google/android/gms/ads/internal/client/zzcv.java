package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzcv implements MuteThisAdReason {
    public final String a;
    public final zzcu b;

    public zzcv(zzcu zzcu0) {
        String s;
        this.b = zzcu0;
        try {
            s = zzcu0.zze();
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("", remoteException0);
            s = null;
        }
        this.a = s;
    }

    @Override  // com.google.android.gms.ads.MuteThisAdReason
    public final String getDescription() {
        return this.a;
    }

    @Override
    public final String toString() {
        return this.a;
    }

    public final zzcu zza() {
        return this.b;
    }
}

