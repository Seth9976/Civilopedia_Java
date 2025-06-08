package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfhu;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import org.json.JSONObject;

public final class zzd implements zzfuj {
    public final zzfhu zza;
    public final zzfhh zzb;

    public zzd(zzfhu zzfhu0, zzfhh zzfhh0) {
        this.zza = zzfhu0;
        this.zzb = zzfhh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzfhu zzfhu0 = this.zza;
        zzfhh zzfhh0 = this.zzb;
        boolean z = ((JSONObject)object0).optBoolean("isSuccessful", false);
        if(z) {
            String s = ((JSONObject)object0).getString("appSettingsJson");
            zzt.zzo().zzh().zzu(s);
        }
        zzfhh0.zze(z);
        zzfhu0.zzb(zzfhh0.zzj());
        return zzfvc.zzi(null);
    }
}

