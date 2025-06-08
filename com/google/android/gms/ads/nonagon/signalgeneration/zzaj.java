package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.internal.ads.zzbzv;
import com.google.android.gms.internal.ads.zzfuj;
import com.google.android.gms.internal.ads.zzfvc;
import com.google.android.gms.internal.ads.zzfvl;
import java.io.InputStream;
import java.io.InputStreamReader;
import org.json.JSONException;

public final class zzaj implements zzfuj {
    public final zzbzv zza;

    public zzaj(zzbzv zzbzv0) {
        this.zza = zzbzv0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfuj
    public final zzfvl zza(Object object0) {
        zzam zzam0 = new zzam(new JsonReader(new InputStreamReader(((InputStream)object0))));
        try {
            zzam0.zzb = zzaw.zzb().zzh(this.zza.zza).toString();
            return zzfvc.zzi(zzam0);
        }
        catch(JSONException unused_ex) {
            zzam0.zzb = "{}";
            return zzfvc.zzi(zzam0);
        }
    }
}

