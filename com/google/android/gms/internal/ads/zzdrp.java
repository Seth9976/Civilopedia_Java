package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

public final class zzdrp implements zzbom {
    public final zzbmf a;
    public final zzdse b;
    public final zzgqo c;

    public zzdrp(zzdns zzdns0, zzdnh zzdnh0, zzdse zzdse0, zzgqo zzgqo0) {
        this.a = zzdns0.zzc(zzdnh0.zzy());
        this.b = zzdse0;
        this.c = zzgqo0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        String s = (String)map0.get("asset");
        try {
            zzblv zzblv0 = (zzblv)this.c.zzb();
            this.a.zze(zzblv0, s);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk(("Failed to call onCustomClick for asset " + s + "."), remoteException0);
        }
    }

    public final void zzb() {
        if(this.a == null) {
            return;
        }
        this.b.zzi("/nativeAdCustomClick", this);
    }
}

