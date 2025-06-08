package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbu;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbnl implements zzbom {
    public final zzbnm a;

    public zzbnl(zzbnm zzbnm0) {
        this.a = zzbnm0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzbnm zzbnm0 = this.a;
        if(zzbnm0 == null) {
            return;
        }
        String s = (String)map0.get("name");
        if(s == null) {
            zzcfi.zzi("Ad metadata with no name parameter.");
            s = "";
        }
        Bundle bundle0 = null;
        if(map0.containsKey("info")) {
            try {
                bundle0 = zzbu.zza(new JSONObject(((String)map0.get("info"))));
            }
            catch(JSONException jSONException0) {
                zzcfi.zzh("Failed to convert ad metadata to JSON.", jSONException0);
            }
        }
        if(bundle0 == null) {
            zzcfi.zzg("Failed to convert ad metadata to Bundle.");
            return;
        }
        zzbnm0.zza(s, bundle0);
    }
}

