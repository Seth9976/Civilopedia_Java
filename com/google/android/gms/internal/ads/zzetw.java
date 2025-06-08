package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzetw implements zzetf {
    public final Info a;
    public final String b;

    public zzetw(Info advertisingIdClient$Info0, String s) {
        this.a = advertisingIdClient$Info0;
        this.b = s;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            JSONObject jSONObject1 = zzbu.zzf(jSONObject0, "pii");
            Info advertisingIdClient$Info0 = this.a;
            if(advertisingIdClient$Info0 != null && !TextUtils.isEmpty(advertisingIdClient$Info0.getId())) {
                jSONObject1.put("rdid", advertisingIdClient$Info0.getId());
                jSONObject1.put("is_lat", advertisingIdClient$Info0.isLimitAdTrackingEnabled());
                jSONObject1.put("idtype", "adid");
                return;
            }
            jSONObject1.put("pdid", this.b);
            jSONObject1.put("pdidtype", "ssaid");
            return;
        }
        catch(JSONException jSONException0) {
        }
        zze.zzb("Failed putting Ad ID.", jSONException0);
    }
}

