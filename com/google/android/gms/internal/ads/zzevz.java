package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevz implements zzetf {
    public final Map a;

    public zzevz(Map map0) {
        this.a = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        try {
            jSONObject0.put("video_decoders", zzaw.zzb().zzi(this.a));
        }
        catch(JSONException jSONException0) {
            zze.zza(("Could not encode video decoder properties: " + jSONException0.getMessage()));
        }
    }
}

