package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONObject;

public final class zzehu implements zzfuj {
    public final zzehx zza;
    public final zzfbl zzb;

    public zzehu(zzehx zzehx0, zzfbl zzfbl0) {
        this.zza = zzehx0;
        this.zzb = zzfbl0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzehx zzehx0 = this.zza;
        zzfbl zzfbl0 = this.zzb;
        zzehx0.getClass();
        JSONObject jSONObject0 = new JSONObject();
        jSONObject0.put("isNonagon", true);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhg)).booleanValue()) {
            jSONObject0.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject1 = new JSONObject();
        jSONObject1.put("response", zzfbl0.zzt.zzc);
        jSONObject1.put("sdk_params", jSONObject0);
        return zzfvc.zzn(((zzdse)object0).zzd("google.afma.nativeAds.preProcessJson", jSONObject1), new zzeht(zzehx0, ((zzdse)object0)), zzehx0.b);
    }
}

