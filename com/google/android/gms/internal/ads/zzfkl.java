package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

public final class zzfkl extends zzfkg {
    public zzfkl(zzfjz zzfjz0, HashSet hashSet0, JSONObject jSONObject0, long v, byte[] arr_b) {
        super(zzfjz0, hashSet0, jSONObject0, v, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzfkh
    public final void a(String s) {
        if(!TextUtils.isEmpty(s)) {
            zzfjc zzfjc0 = zzfjc.zza();
            if(zzfjc0 != null) {
                for(Object object0: zzfjc0.zzc()) {
                    zzfir zzfir0 = (zzfir)object0;
                    if(this.c.contains(zzfir0.zzh())) {
                        zzfir0.zzg().zze(s, this.e);
                    }
                }
            }
        }
        super.a(s);
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        zzfjz zzfjz0 = this.b;
        JSONObject jSONObject0 = this.d;
        if(zzfjt.zzi(jSONObject0, zzfjz0.zza())) {
            return null;
        }
        zzfjz0.zze(jSONObject0);
        return jSONObject0.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfkh
    public final void onPostExecute(Object object0) {
        this.a(((String)object0));
    }
}

