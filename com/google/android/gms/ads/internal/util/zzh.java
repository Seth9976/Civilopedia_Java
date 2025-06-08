package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.security.NetworkSecurityPolicy;
import com.google.android.gms.internal.ads.zzcel;
import com.google.android.gms.internal.ads.zzcfi;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzh implements Runnable {
    public final zzj zza;
    public final Context zzb;
    public final String zzc;

    public zzh(zzj zzj0, Context context0, String s) {
        this.zza = zzj0;
        this.zzb = context0;
        this.zzc = "admob";
    }

    @Override
    public final void run() {
        zzj zzj0 = this.zza;
        zzj0.getClass();
        SharedPreferences sharedPreferences0 = this.zzb.getSharedPreferences("admob", 0);
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        synchronized(zzj0.a) {
            zzj0.f = sharedPreferences0;
            zzj0.g = sharedPreferences$Editor0;
            NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            zzj0.h = zzj0.f.getBoolean("use_https", zzj0.h);
            zzj0.w = zzj0.f.getBoolean("content_url_opted_out", zzj0.w);
            zzj0.i = zzj0.f.getString("content_url_hashes", zzj0.i);
            zzj0.k = zzj0.f.getBoolean("gad_idless", zzj0.k);
            zzj0.x = zzj0.f.getBoolean("content_vertical_opted_out", zzj0.x);
            zzj0.j = zzj0.f.getString("content_vertical_hashes", zzj0.j);
            zzj0.t = zzj0.f.getInt("version_code", zzj0.t);
            zzj0.p = new zzcel(zzj0.f.getString("app_settings_json", zzj0.p.zzc()), zzj0.f.getLong("app_settings_last_update_ms", zzj0.p.zza()));
            zzj0.q = zzj0.f.getLong("app_last_background_time_ms", zzj0.q);
            zzj0.s = zzj0.f.getInt("request_in_session_count", zzj0.s);
            zzj0.r = zzj0.f.getLong("first_ad_req_time_ms", zzj0.r);
            zzj0.u = zzj0.f.getStringSet("never_pool_slots", zzj0.u);
            zzj0.y = zzj0.f.getString("display_cutout", zzj0.y);
            zzj0.C = zzj0.f.getInt("app_measurement_npa", zzj0.C);
            zzj0.D = zzj0.f.getInt("sd_app_measure_npa", zzj0.D);
            zzj0.E = zzj0.f.getLong("sd_app_measure_npa_ts", zzj0.E);
            zzj0.z = zzj0.f.getString("inspector_info", zzj0.z);
            zzj0.A = zzj0.f.getBoolean("linked_device", zzj0.A);
            zzj0.B = zzj0.f.getString("linked_ad_unit", zzj0.B);
            zzj0.l = zzj0.f.getString("IABTCF_gdprApplies", zzj0.l);
            zzj0.n = zzj0.f.getString("IABTCF_PurposeConsents", zzj0.n);
            zzj0.m = zzj0.f.getString("IABTCF_TCString", zzj0.m);
            zzj0.o = zzj0.f.getInt("gad_has_consent_for_cookies", zzj0.o);
            try {
                zzj0.v = new JSONObject(zzj0.f.getString("native_advanced_settings", "{}"));
            }
            catch(JSONException jSONException0) {
                zzcfi.zzk("Could not convert native advanced settings to json object", jSONException0);
            }
            zzj0.b();
        }
    }
}

