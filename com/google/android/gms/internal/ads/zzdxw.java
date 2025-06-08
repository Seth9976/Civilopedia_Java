package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdxw implements O4 {
    public final long a;
    public final zzdxl b;
    public final zzfbc c;

    public zzdxw(long v, Context context0, zzdxl zzdxl0, zzcnf zzcnf0, String s) {
        this.a = v;
        this.b = zzdxl0;
        zzfbe zzfbe0 = zzcnf0.zzu();
        zzfbe0.zzb(context0);
        zzfbe0.zza(s);
        this.c = zzfbe0.zzc().zza();
    }

    @Override  // com.google.android.gms.internal.ads.O4
    public final void zza() {
    }

    @Override  // com.google.android.gms.internal.ads.O4
    public final void zzb(zzl zzl0) {
        try {
            Q4 q40 = new Q4(this);
            this.c.zzf(zzl0, q40);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.O4
    public final void zzc() {
        try {
            R4 r40 = new R4(this);
            this.c.zzk(r40);
            IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(null);
            this.c.zzm(iObjectWrapper0);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }
}

