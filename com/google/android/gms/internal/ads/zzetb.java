package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;

public final class zzetb implements Callable {
    public final zzetd zza;

    public zzetb(zzetd zzetd0) {
        this.zza = zzetd0;
    }

    @Override
    public final Object call() {
        zzetd zzetd0 = this.zza;
        zzetd0.getClass();
        String s = (String)zzay.zzc().zzb(zzbhz.zzfc);
        if(!TextUtils.isEmpty(s)) {
            try {
                JSONArray jSONArray0 = new JSONArray(s);
                return new zzetc(zzetd.zzc(zzetd0.b, jSONArray0));
            }
            catch(JSONException jSONException0) {
                zzcfi.zzf("JSON parsing error", jSONException0);
                return null;
            }
        }
        return null;
    }
}

