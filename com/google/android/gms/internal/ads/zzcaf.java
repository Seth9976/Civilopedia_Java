package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamite.DynamiteModule;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcaf extends zzcag {
    public final Object a;
    public final Context b;
    public SharedPreferences c;
    public final zzbsq d;

    public zzcaf(Context context0, zzbsq zzbsq0) {
        this.a = new Object();
        this.b = context0.getApplicationContext();
        this.d = zzbsq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzcag
    public final zzfvl zza() {
        synchronized(this.a) {
            if(this.c == null) {
                this.c = this.b.getSharedPreferences("google_ads_flags_meta", 0);
            }
        }
        long v1 = this.c.getLong("js_last_update", 0L);
        if(zzt.zzA().currentTimeMillis() - v1 < ((long)(((Long)zzbjp.zzb.zze())))) {
            return zzfvc.zzi(null);
        }
        JSONObject jSONObject0 = zzcaf.zzc(this.b);
        return zzfvc.zzm(this.d.zzb(jSONObject0), new zzcae(this), zzcfv.zzf);
    }

    public static JSONObject zzc(Context context0) {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("js", "afma-sdk-a-v12451000.12451000.0");
            jSONObject0.put("mf", zzbjp.zza.zze());
            jSONObject0.put("cl", "458339781");
            jSONObject0.put("rapid_rc", "dev");
            jSONObject0.put("rapid_rollup", "HEAD");
            jSONObject0.put("admob_module_version", 12451000);
            jSONObject0.put("dynamite_local_version", 221908400);
            jSONObject0.put("dynamite_version", DynamiteModule.getRemoteVersion(context0, "com.google.android.gms.ads.dynamite"));
            jSONObject0.put("container_version", 12451000);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }
}

