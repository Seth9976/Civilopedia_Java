package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

public final class zzcsv implements zzcsp {
    public final zzdzb a;

    public zzcsv(zzdzb zzdzb0) {
        this.a = zzdzb0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcsp
    public final void zza(Map map0) {
        int v;
        String s = (String)map0.get("gesture");
        if(TextUtils.isEmpty(s)) {
            return;
        }
        switch(s) {
            case "flick": {
                v = 1;
                break;
            }
            case "shake": {
                v = 0;
                break;
            }
            default: {
                v = -1;
            }
        }
        zzdzb zzdzb0 = this.a;
        switch(v) {
            case 0: {
                zzdzb0.zzj(zzdyx.zzb);
                return;
            }
            case 1: {
                zzdzb0.zzj(zzdyx.zzc);
                return;
            }
            default: {
                zzdzb0.zzj(zzdyx.zza);
            }
        }
    }
}

