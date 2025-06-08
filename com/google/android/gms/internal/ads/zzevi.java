package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzevi implements zzetf {
    public final Bundle a;

    public zzevi(Bundle bundle0) {
        this.a = bundle0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        JSONObject jSONObject0 = (JSONObject)object0;
        Bundle bundle0 = this.a;
        if(bundle0 != null) {
            try {
                zzbu.zzf(zzbu.zzf(jSONObject0, "device"), "play_store").put("parental_controls", zzaw.zzb().zzh(bundle0));
            }
            catch(JSONException unused_ex) {
                zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}

