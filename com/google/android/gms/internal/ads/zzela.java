package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

public final class zzela {
    public final ConcurrentHashMap a;
    public final zzduc b;

    public zzela(zzduc zzduc0) {
        this.a = new ConcurrentHashMap();
        this.b = zzduc0;
    }

    // 去混淆评级： 低(20)
    @CheckForNull
    public final zzbvt zza(String s) {
        return this.a.containsKey(s) ? ((zzbvt)this.a.get(s)) : null;
    }

    public final void zzb(String s) {
        try {
            zzbvt zzbvt0 = this.b.zzb(s);
            this.a.put(s, zzbvt0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzh("Couldn\'t create RTB adapter : ", remoteException0);
        }
    }
}

