package com.google.android.gms.internal.ads;

import P0.f;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager.OnChecksumsReadyListener;
import java.util.List;

public final class zzaqp implements PackageManager.OnChecksumsReadyListener {
    public final zzfvt zza;

    public zzaqp(zzfvt zzfvt0) {
        this.zza = zzfvt0;
    }

    @Override  // android.content.pm.PackageManager$OnChecksumsReadyListener
    public final void onChecksumsReady(List list0) {
        zzfvt zzfvt0 = this.zza;
        if(list0 == null) {
            zzfvt0.zzd(null);
            return;
        }
        try {
            int v = list0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ApkChecksum apkChecksum0 = f.b(list0.get(v1));
                if(apkChecksum0.getType() == 8) {
                    zzfvt0.zzd(zzapf.zzc(apkChecksum0.getValue()));
                    return;
                }
            }
            zzfvt0.zzd(null);
        }
        catch(Throwable unused_ex) {
            zzfvt0.zzd(null);
        }
    }
}

