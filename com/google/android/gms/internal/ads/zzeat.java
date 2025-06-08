package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzeat {
    public final zzcnf a;
    public final Context b;
    public final zzcfo c;
    public final zzfcd d;
    public final Executor e;
    public final String f;
    public final zzfhs g;
    public final zzdwc h;

    public zzeat(zzcnf zzcnf0, Context context0, zzcfo zzcfo0, zzfcd zzfcd0, Executor executor0, String s, zzfhs zzfhs0, zzdwc zzdwc0) {
        this.a = zzcnf0;
        this.b = context0;
        this.c = zzcfo0;
        this.d = zzfcd0;
        this.e = executor0;
        this.f = s;
        this.g = zzfhs0;
        zzcnf0.zzv();
        this.h = zzdwc0;
    }

    public final zzfvl a(String s, String s1) {
        zzfhh zzfhh0 = zzfhg.zza(this.b, 11);
        zzfhh0.zzf();
        zzfhu zzfhu0 = this.a.zzy();
        zzbsq zzbsq0 = zzt.zzf().zza(this.b, this.c, zzfhu0).zza("google.afma.response.normalize", zzbsx.zza, zzbsx.zza);
        zzfvl zzfvl0 = zzfvc.zzn(zzfvc.zzn(zzfvc.zzn(zzfvc.zzi(""), new zzeaq(this, s, s1), this.e), new zzear(zzbsq0), this.e), new zzeas(this), this.e);
        zzfhr.zza(zzfvl0, this.g, zzfhh0);
        return zzfvl0;
    }

    public final String b(String s) {
        try {
            JSONObject jSONObject0 = new JSONObject(s);
            JSONArray jSONArray0 = jSONObject0.getJSONArray("ad_types");
            if(jSONArray0 != null && "unknown".equals(jSONArray0.getString(0))) {
                jSONObject0.put("ad_types", new JSONArray().put(this.f));
                return jSONObject0.toString();
            }
            return jSONObject0.toString();
        }
        catch(JSONException jSONException0) {
        }
        zzcfi.zzj(("Failed to update the ad types for rendering. " + jSONException0.toString()));
        return s;
    }

    public static final String c(String s) {
        try {
            return new JSONObject(s).optString("request_id", "");
        }
        catch(JSONException unused_ex) {
            return "";
        }
    }

    public final zzfvl zza() {
        zzfcd zzfcd0 = this.d;
        String s = zzfcd0.zzd.zzx;
        boolean z = TextUtils.isEmpty(s);
        zzcnf zzcnf0 = this.a;
        zzdwc zzdwc0 = this.h;
        if(!z && ((Boolean)zzay.zzc().zzb(zzbhz.zzfU)).booleanValue()) {
            String s1 = zzeat.c(s);
            zzbhr zzbhr0 = zzbhz.zzgg;
            if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue() && s1.isEmpty()) {
                int v = s.lastIndexOf("&request_id=");
                s1 = v == -1 ? "" : s.substring(v + 12);
            }
            if(TextUtils.isEmpty(s1)) {
                return zzfvc.zzh(new zzeit(15, "Invalid ad string."));
            }
            String s2 = zzcnf0.zzm().zzb(s1, zzdwc0);
            if(((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue() && !TextUtils.isEmpty(s2)) {
                try {
                    if(new JSONObject(s2).optString("is_gbid").equals("true")) {
                        goto label_17;
                    }
                }
                catch(JSONException unused_ex) {
                }
                goto label_31;
                try {
                label_17:
                    int v1 = s.lastIndexOf("&");
                    String s3 = null;
                    byte[] arr_b = Base64.decode((v1 == -1 ? null : s.substring(0, v1)), 11);
                    byte[] arr_b1 = s1.getBytes("UTF-8");
                    try {
                        s3 = new JSONObject(s2).getString("arek");
                    }
                    catch(JSONException jSONException0) {
                        zze.zza(("Failed to get key from QueryJSONMap" + jSONException0.toString()));
                        zzt.zzo().zzt(jSONException0, "CryptoUtils.getKeyFromQueryJsonMap");
                    }
                    s = zzfcp.zzb(arr_b, arr_b1, s3, zzdwc0);
                    goto label_31;
                }
                catch(UnsupportedEncodingException unsupportedEncodingException0) {
                }
                zze.zza(("Failed to decode the adResponse. " + unsupportedEncodingException0.toString()));
                zzt.zzo().zzt(unsupportedEncodingException0, "PreloadedLoader.decryptAdResponseIfNecessary");
            }
        label_31:
            if(!TextUtils.isEmpty(s2)) {
                return this.a(s, this.b(s2));
            }
        }
        zzc zzc0 = zzfcd0.zzd.zzs;
        if(zzc0 != null) {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzfS)).booleanValue()) {
                String s4 = zzeat.c(zzc0.zza);
                String s5 = zzeat.c(zzc0.zzb);
                if(!TextUtils.isEmpty(s5) && s4.equals(s5)) {
                    zzcnf0.zzm().zzf(s4);
                    zzdwc0.zza().put("rid", s4);
                    goto label_44;
                }
                zzdwc0.zza().put("ridmm", "true");
                return zzfvc.zzh(new zzeit(14, "Mismatch request IDs."));
            }
        label_44:
            String s6 = this.b(zzc0.zzb);
            return this.a(zzc0.zza, s6);
        }
        return zzfvc.zzh(new zzeit(14, "Mismatch request IDs."));
    }
}

