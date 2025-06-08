package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcel {
    public final ArrayList a;
    public final ArrayList b;
    public final HashMap c;
    public final String d;
    public final String e;
    public long f;
    public final JSONObject g;
    public final boolean h;
    public final ArrayList i;
    public final boolean j;

    public zzcel(String s, long v) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new HashMap();
        this.h = false;
        this.i = new ArrayList();
        this.j = false;
        this.e = s;
        this.f = v;
        if(TextUtils.isEmpty(s)) {
            return;
        }
        else {
            try {
                JSONObject jSONObject0 = new JSONObject(s);
                this.g = jSONObject0;
                if(jSONObject0.optInt("status", -1) != 1) {
                    this.h = false;
                    zzcfi.zzj("App settings could not be fetched successfully.");
                    return;
                }
                this.h = true;
                this.d = jSONObject0.optString("app_id");
                JSONArray jSONArray0 = jSONObject0.optJSONArray("ad_unit_id_settings");
                if(jSONArray0 != null) {
                    for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                        String s1 = jSONObject1.optString("format");
                        String s2 = jSONObject1.optString("ad_unit_id");
                        if(!TextUtils.isEmpty(s1) && !TextUtils.isEmpty(s2)) {
                            if("interstitial".equalsIgnoreCase(s1)) {
                                this.b.add(s2);
                            }
                            else if("rewarded".equalsIgnoreCase(s1) || "rewarded_interstitial".equals(s1)) {
                                JSONObject jSONObject2 = jSONObject1.optJSONObject("mediation_config");
                                if(jSONObject2 != null) {
                                    zzbtv zzbtv0 = new zzbtv(jSONObject2);
                                    this.c.put(s2, zzbtv0);
                                }
                            }
                        }
                    }
                }
                JSONArray jSONArray1 = this.g.optJSONArray("persistable_banner_ad_unit_ids");
                if(jSONArray1 != null) {
                    for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                        String s3 = jSONArray1.optString(v2);
                        this.a.add(s3);
                    }
                }
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzfR)).booleanValue()) {
                    JSONObject jSONObject3 = this.g.optJSONObject("common_settings");
                    if(jSONObject3 != null) {
                        JSONArray jSONArray2 = jSONObject3.optJSONArray("loeid");
                        if(jSONArray2 != null) {
                            for(int v3 = 0; v3 < jSONArray2.length(); ++v3) {
                                String s4 = jSONArray2.get(v3).toString();
                                this.i.add(s4);
                            }
                        }
                    }
                }
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzfm)).booleanValue()) {
                    JSONObject jSONObject4 = this.g.optJSONObject("common_settings");
                    if(jSONObject4 != null) {
                        this.j = jSONObject4.optBoolean("is_prefetching_enabled", false);
                    }
                }
                return;
            }
            catch(JSONException jSONException0) {
            }
        }
        zzcfi.zzk("Exception occurred while processing app setting json", jSONException0);
        zzt.zzo().zzt(jSONException0, "AppSettings.parseAppSettingsJson");
    }

    public final long zza() {
        return this.f;
    }

    public final String zzb() {
        return this.d;
    }

    public final String zzc() {
        return this.e;
    }

    public final List zzd() {
        return this.i;
    }

    public final Map zze() {
        return this.c;
    }

    public final JSONObject zzf() {
        return this.g;
    }

    public final void zzg(long v) {
        this.f = v;
    }

    public final boolean zzh() {
        return this.j;
    }

    public final boolean zzi() {
        return this.h;
    }
}

