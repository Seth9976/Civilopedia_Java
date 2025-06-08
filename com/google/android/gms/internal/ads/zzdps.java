package com.google.android.gms.internal.ads;

import A.f;
import com.google.android.gms.ads.internal.util.zzs;
import i3.e;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class zzdps implements Callable {
    public final zzdpu zza;
    public final zzfbx zzb;
    public final zzfbl zzc;
    public final JSONObject zzd;

    public zzdps(zzdpu zzdpu0, zzfbx zzfbx0, zzfbl zzfbl0, JSONObject jSONObject0) {
        this.zza = zzdpu0;
        this.zzb = zzfbx0;
        this.zzc = zzfbl0;
        this.zzd = jSONObject0;
    }

    @Override
    public final Object call() {
        zzfbl zzfbl0 = this.zzc;
        JSONObject jSONObject0 = this.zzd;
        zzdnh zzdnh0 = new zzdnh();
        zzdnh0.zzV(jSONObject0.optInt("template_id", -1));
        zzdnh0.zzI(jSONObject0.optString("custom_template_id"));
        JSONObject jSONObject1 = jSONObject0.optJSONObject("omid_settings");
        zzdnh0.zzS((jSONObject1 == null ? null : jSONObject1.optString("omid_partner_name")));
        zzfcd zzfcd0 = this.zzb.zza.zza;
        String s = Integer.toString(zzdnh0.zzc());
        if(!zzfcd0.zzg.contains(s)) {
            throw new zzeit(1, e.d(zzdnh0.zzc(), "Invalid template ID: "));
        }
        if(zzdnh0.zzc() == 3) {
            if(zzdnh0.zzy() == null) {
                throw new zzeit(1, "No custom template id for custom template ad response.");
            }
            String s1 = zzdnh0.zzy();
            if(!zzfcd0.zzh.contains(s1)) {
                throw new zzeit(1, "Unexpected custom template id in the response.");
            }
        }
        zzdnh0.zzT(jSONObject0.optDouble("rating", -1.0));
        String s2 = jSONObject0.optString("headline", null);
        if(zzfbl0.zzN) {
            s2 = f.i(zzs.zzv(), " : ", s2);
        }
        zzdnh0.zzU("headline", s2);
        zzdnh0.zzU("body", jSONObject0.optString("body", null));
        zzdnh0.zzU("call_to_action", jSONObject0.optString("call_to_action", null));
        zzdnh0.zzU("store", jSONObject0.optString("store", null));
        zzdnh0.zzU("price", jSONObject0.optString("price", null));
        zzdnh0.zzU("advertiser", jSONObject0.optString("advertiser", null));
        return zzdnh0;
    }
}

