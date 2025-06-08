package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

public final class zzfkk extends zzfkg {
    public zzfkk(zzfjz zzfjz0, HashSet hashSet0, JSONObject jSONObject0, long v, byte[] arr_b) {
        super(zzfjz0, hashSet0, jSONObject0, v, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzfkh
    public final void a(String s) {
        this.b(s);
        super.a(s);
    }

    public final void b(String s) {
        zzfjc zzfjc0 = zzfjc.zza();
        if(zzfjc0 != null) {
            for(Object object0: zzfjc0.zzc()) {
                zzfir zzfir0 = (zzfir)object0;
                if(this.c.contains(zzfir0.zzh())) {
                    zzfir0.zzg().zzd(s, this.e);
                }
            }
        }
    }

    @Override  // android.os.AsyncTask
    public final Object doInBackground(Object[] arr_object) {
        return this.d.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzfkh
    public final void onPostExecute(Object object0) {
        this.b(((String)object0));
        super.a(((String)object0));
    }
}

