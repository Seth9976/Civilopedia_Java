package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.internal.ads.zzdse;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvl;
import java.util.Map;
import org.json.JSONObject;

public final class zzk implements zzfuj {
    public final zzaa zza;
    public final zzdse[] zzb;
    public final String zzc;

    public zzk(zzaa zzaa0, zzdse[] arr_zzdse, String s) {
        this.zza = zzaa0;
        this.zzb = arr_zzdse;
        this.zzc = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzaa zzaa0 = this.zza;
        String s = this.zzc;
        zzaa0.getClass();
        this.zzb[0] = (zzdse)object0;
        Map map0 = zzaa0.p.zzb;
        JSONObject jSONObject0 = zzbx.zzd(zzaa0.j, map0, map0, zzaa0.p.zza);
        JSONObject jSONObject1 = zzbx.zzg(zzaa0.j, zzaa0.p.zza);
        JSONObject jSONObject2 = zzbx.zzf(zzaa0.p.zza);
        JSONObject jSONObject3 = zzbx.zze(zzaa0.j, zzaa0.p.zza);
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("asset_view_signal", jSONObject0);
        jSONObject4.put("ad_view_signal", jSONObject1);
        jSONObject4.put("scroll_view_signal", jSONObject2);
        jSONObject4.put("lock_screen_signal", jSONObject3);
        if(s == "google.afma.nativeAds.getPublisherCustomRenderedClickSignals") {
            jSONObject4.put("click_signal", zzbx.zzc(null, zzaa0.j, zzaa0.r, zzaa0.q));
        }
        return ((zzdse)object0).zzd(s, jSONObject4);
    }
}

