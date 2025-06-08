package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.zza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdqh {
    public final Context a;
    public final zzdpq b;
    public final zzaoc c;
    public final zzcfo d;
    public final zza e;
    public final zzbdm f;
    public final Executor g;
    public final zzbkp h;
    public final zzdqz i;
    public final zzdtp j;
    public final ScheduledExecutorService k;
    public final zzdsk l;
    public final zzdwh m;
    public final zzfgp n;
    public final zzfii o;
    public final zzees p;

    public zzdqh(Context context0, zzdpq zzdpq0, zzaoc zzaoc0, zzcfo zzcfo0, zza zza0, zzbdm zzbdm0, Executor executor0, zzfcd zzfcd0, zzdqz zzdqz0, zzdtp zzdtp0, ScheduledExecutorService scheduledExecutorService0, zzdwh zzdwh0, zzfgp zzfgp0, zzfii zzfii0, zzees zzees0, zzdsk zzdsk0) {
        this.a = context0;
        this.b = zzdpq0;
        this.c = zzaoc0;
        this.d = zzcfo0;
        this.e = zza0;
        this.f = zzbdm0;
        this.g = executor0;
        this.h = zzfcd0.zzi;
        this.i = zzdqz0;
        this.j = zzdtp0;
        this.k = scheduledExecutorService0;
        this.m = zzdwh0;
        this.n = zzfgp0;
        this.o = zzfii0;
        this.p = zzees0;
        this.l = zzdsk0;
    }

    public final zzfvl a(JSONObject jSONObject0, boolean z) {
        if(jSONObject0 == null) {
            return zzfvc.zzi(null);
        }
        String s = jSONObject0.optString("url");
        if(TextUtils.isEmpty(s)) {
            return zzfvc.zzi(null);
        }
        double f = jSONObject0.optDouble("scale", 1.0);
        boolean z1 = jSONObject0.optBoolean("is_transparent", true);
        int v = jSONObject0.optInt("width", -1);
        int v1 = jSONObject0.optInt("height", -1);
        if(z) {
            return zzfvc.zzi(new zzbkn(null, Uri.parse(s), f, v, v1));
        }
        zzfvl zzfvl0 = zzfvc.zzm(this.b.zzb(s, f, z1), new zzdqf(s, f, v, v1), this.g);
        if(jSONObject0.optBoolean("require")) {
            return zzfvc.zzn(zzfvl0, new zzdqc(zzfvl0), zzcfv.zzf);
        }
        zzdqe zzdqe0 = new zzdqe(null);
        return zzfvc.zzg(zzfvl0, Exception.class, zzdqe0, zzcfv.zzf);
    }

    public final zzfvl b(JSONArray jSONArray0, boolean z, boolean z1) {
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            int v = z1 ? jSONArray0.length() : 1;
            for(int v1 = 0; v1 < v; ++v1) {
                arrayList0.add(this.a(jSONArray0.optJSONObject(v1), z));
            }
            return zzfvc.zzm(zzfvc.zze(arrayList0), zzdqd.zza, this.g);
        }
        return zzfvc.zzi(Collections.emptyList());
    }

    public final zzfvl c(JSONObject jSONObject0, zzfbl zzfbl0, zzfbo zzfbo0) {
        AdSize adSize0;
        zzq zzq0;
        String s = jSONObject0.optString("base_url");
        String s1 = jSONObject0.optString("html");
        int v = jSONObject0.optInt("width", 0);
        int v1 = jSONObject0.optInt("height", 0);
        if(v != 0) {
            adSize0 = new AdSize(v, v1);
            zzq0 = new zzq(this.a, adSize0);
        }
        else if(v1 == 0) {
            zzq0 = zzq.zzc();
        }
        else {
            adSize0 = new AdSize(0, v1);
            zzq0 = new zzq(this.a, adSize0);
        }
        zzfvl zzfvl0 = this.i.zzb(s, s1, zzfbl0, zzfbo0, zzq0);
        return zzfvc.zzn(zzfvl0, new zzdqg(zzfvl0), zzcfv.zzf);
    }

    public static Integer d(String s, JSONObject jSONObject0) {
        try {
            JSONObject jSONObject1 = jSONObject0.getJSONObject(s);
            return Color.rgb(jSONObject1.getInt("r"), jSONObject1.getInt("g"), jSONObject1.getInt("b"));
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    public static final zzef e(JSONObject jSONObject0) {
        if(jSONObject0 == null) {
            return null;
        }
        String s = jSONObject0.optString("reason");
        String s1 = jSONObject0.optString("ping_url");
        return TextUtils.isEmpty(s) || TextUtils.isEmpty(s1) ? null : new zzef(s, s1);
    }

    public final zzfvl zzd(JSONObject jSONObject0, String s) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("attribution");
        if(jSONObject1 == null) {
            return zzfvc.zzi(null);
        }
        JSONArray jSONArray0 = jSONObject1.optJSONArray("images");
        JSONObject jSONObject2 = jSONObject1.optJSONObject("image");
        if(jSONArray0 == null && jSONObject2 != null) {
            jSONArray0 = new JSONArray();
            jSONArray0.put(jSONObject2);
        }
        zzfvl zzfvl0 = zzfvc.zzm(this.b(jSONArray0, false, true), new zzdpy(this, jSONObject1), this.g);
        if(jSONObject1.optBoolean("require")) {
            return zzfvc.zzn(zzfvl0, new zzdqc(zzfvl0), zzcfv.zzf);
        }
        zzdqe zzdqe0 = new zzdqe(null);
        return zzfvc.zzg(zzfvl0, Exception.class, zzdqe0, zzcfv.zzf);
    }

    public final zzfvl zze(JSONObject jSONObject0, String s) {
        return this.a(jSONObject0.optJSONObject(s), this.h.zzb);
    }

    public final zzfvl zzf(JSONObject jSONObject0, String s) {
        return this.b(jSONObject0.optJSONArray("images"), this.h.zzb, this.h.zzd);
    }

    public final zzfvl zzg(JSONObject jSONObject0, String s, zzfbl zzfbl0, zzfbo zzfbo0) {
        AdSize adSize0;
        zzq zzq0;
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhX)).booleanValue()) {
            return zzfvc.zzi(null);
        }
        JSONArray jSONArray0 = jSONObject0.optJSONArray("images");
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            JSONObject jSONObject1 = jSONArray0.optJSONObject(0);
            if(jSONObject1 == null) {
                return zzfvc.zzi(null);
            }
            String s1 = jSONObject1.optString("base_url");
            String s2 = jSONObject1.optString("html");
            int v = jSONObject1.optInt("width", 0);
            int v1 = jSONObject1.optInt("height", 0);
            if(v != 0) {
                adSize0 = new AdSize(v, v1);
                zzq0 = new zzq(this.a, adSize0);
            }
            else if(v1 == 0) {
                zzq0 = zzq.zzc();
            }
            else {
                adSize0 = new AdSize(0, v1);
                zzq0 = new zzq(this.a, adSize0);
            }
            if(TextUtils.isEmpty(s2)) {
                return zzfvc.zzi(null);
            }
            zzfvl zzfvl0 = zzfvc.zzn(zzfvc.zzi(null), new zzdpz(this, zzq0, zzfbl0, zzfbo0, s1, s2), zzcfv.zze);
            return zzfvc.zzn(zzfvl0, new zzdqa(zzfvl0), zzcfv.zzf);
        }
        return zzfvc.zzi(null);
    }

    public final zzfvl zzh(JSONObject jSONObject0, zzfbl zzfbl0, zzfbo zzfbo0) {
        zzfvl zzfvl0;
        JSONObject jSONObject1 = zzbu.zzg(jSONObject0, new String[]{"html_containers", "instream"});
        if(jSONObject1 == null) {
            JSONObject jSONObject2 = jSONObject0.optJSONObject("video");
            if(jSONObject2 == null) {
                return zzfvc.zzi(null);
            }
            String s = jSONObject2.optString("vast_xml");
            boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzhW)).booleanValue() && jSONObject2.has("html");
            if(TextUtils.isEmpty(s)) {
                if(!z) {
                    zzcfi.zzj("Required field \'vast_xml\' or \'html\' is missing");
                    return zzfvc.zzi(null);
                }
                zzfvl0 = this.c(jSONObject2, zzfbl0, zzfbo0);
            }
            else {
                zzfvl0 = z ? this.c(jSONObject2, zzfbl0, zzfbo0) : this.i.zza(jSONObject2);
            }
            zzfvl zzfvl1 = zzfvc.zzo(zzfvl0, ((long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzcQ)))))), TimeUnit.SECONDS, this.k);
            zzdqe zzdqe0 = new zzdqe(null);
            return zzfvc.zzg(zzfvl1, Exception.class, zzdqe0, zzcfv.zzf);
        }
        return this.c(jSONObject1, zzfbl0, zzfbo0);
    }

    public static final zzef zzi(JSONObject jSONObject0) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("mute");
        if(jSONObject1 == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject1.optJSONObject("default_reason");
        return jSONObject2 == null ? null : zzdqh.e(jSONObject2);
    }

    public static final List zzj(JSONObject jSONObject0) {
        JSONObject jSONObject1 = jSONObject0.optJSONObject("mute");
        if(jSONObject1 == null) {
            return zzfrj.zzo();
        }
        JSONArray jSONArray0 = jSONObject1.optJSONArray("reasons");
        if(jSONArray0 != null && jSONArray0.length() > 0) {
            ArrayList arrayList0 = new ArrayList();
            for(int v = 0; v < jSONArray0.length(); ++v) {
                zzef zzef0 = zzdqh.e(jSONArray0.optJSONObject(v));
                if(zzef0 != null) {
                    arrayList0.add(zzef0);
                }
            }
            return zzfrj.zzm(arrayList0);
        }
        return zzfrj.zzo();
    }
}

