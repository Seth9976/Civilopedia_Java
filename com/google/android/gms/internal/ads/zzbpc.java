package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzbpc implements zzbom {
    public final zzbpb a;

    public zzbpc(zzbpb zzbpb0) {
        this.a = zzbpb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzcax zzcax0;
        String s = (String)map0.get("action");
        zzbpb zzbpb0 = this.a;
        if("grant".equals(s)) {
            try {
                zzcax0 = null;
                int v = Integer.parseInt(((String)map0.get("amount")));
                String s1 = (String)map0.get("type");
                if(!TextUtils.isEmpty(s1)) {
                    zzcax0 = new zzcax(s1, v);
                }
            }
            catch(NumberFormatException numberFormatException0) {
                zzcfi.zzk("Unable to parse reward amount.", numberFormatException0);
            }
            zzbpb0.zza(zzcax0);
            return;
        }
        if("video_start".equals(s)) {
            zzbpb0.zzc();
            return;
        }
        if("video_complete".equals(s)) {
            zzbpb0.zzb();
        }
    }

    public static void zzb(zzcli zzcli0, zzbpb zzbpb0) {
        zzcli0.zzaf("/reward", new zzbpc(zzbpb0));
    }
}

