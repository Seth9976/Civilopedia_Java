package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzerh implements zzerk {
    public final zzerj zza;
    public final ArrayList zzb;

    public zzerh(zzerj zzerj0, ArrayList arrayList0) {
        this.zza = zzerj0;
        this.zzb = arrayList0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        String s1;
        zzerj zzerj0 = this.zza;
        zzerj0.getClass();
        ((Bundle)object0).putInt("native_version", 3);
        ((Bundle)object0).putStringArrayList("native_templates", this.zzb);
        zzfcd zzfcd0 = zzerj0.b;
        ((Bundle)object0).putStringArrayList("native_custom_templates", zzfcd0.zzh);
        String s = "any";
        if(zzfcd0.zzi.zza > 3) {
            ((Bundle)object0).putBoolean("enable_native_media_orientation", true);
            int v = zzfcd0.zzi.zzh;
            switch(v) {
                case 1: {
                    s1 = "any";
                    break;
                }
                case 2: {
                    s1 = "landscape";
                    break;
                }
                case 3: {
                    s1 = "portrait";
                    break;
                }
                default: {
                    s1 = v == 4 ? "square" : "unknown";
                }
            }
            if(!"unknown".equals(s1)) {
                ((Bundle)object0).putString("native_media_orientation", s1);
            }
        }
        switch(zzfcd0.zzi.zzc) {
            case 0: {
                break;
            }
            case 1: {
                s = "portrait";
                break;
            }
            case 2: {
                s = "landscape";
                break;
            }
            default: {
                s = "unknown";
            }
        }
        if(!"unknown".equals(s)) {
            ((Bundle)object0).putString("native_image_orientation", s);
        }
        ((Bundle)object0).putBoolean("native_multiple_images", zzfcd0.zzi.zzd);
        ((Bundle)object0).putBoolean("use_custom_mute", zzfcd0.zzi.zzg);
        int v1 = zzerj0.c == null ? 0 : zzerj0.c.versionCode;
        zzg zzg0 = zzerj0.d;
        if(v1 > zzg0.zza()) {
            zzg0.zzs();
            zzg0.zzv(v1);
        }
        JSONObject jSONObject0 = zzg0.zzp();
        CharSequence charSequence0 = null;
        if(jSONObject0 != null) {
            JSONArray jSONArray0 = jSONObject0.optJSONArray(zzfcd0.zzf);
            if(jSONArray0 != null) {
                charSequence0 = jSONArray0.toString();
            }
        }
        if(!TextUtils.isEmpty(charSequence0)) {
            ((Bundle)object0).putString("native_advanced_settings", ((String)charSequence0));
        }
        int v2 = zzfcd0.zzk;
        if(v2 > 1) {
            ((Bundle)object0).putInt("max_num_ads", v2);
        }
        String s2 = "p";
        zzbqs zzbqs0 = zzfcd0.zzb;
        if(zzbqs0 != null) {
            if(TextUtils.isEmpty(zzbqs0.zzc)) {
                if(zzbqs0.zza < 2) {
                    int v3 = zzbqs0.zzb;
                    if(v3 == 1) {
                        s2 = "l";
                    }
                    else if(v3 != 2) {
                        zzcfi.zzg(("Instream ad video aspect ratio " + v3 + " is wrong."));
                        s2 = "l";
                    }
                }
                else if(zzbqs0.zzd == 2 || zzbqs0.zzd != 3) {
                    s2 = "l";
                }
                ((Bundle)object0).putString("ia_var", s2);
            }
            else {
                ((Bundle)object0).putString("ad_tag", zzbqs0.zzc);
            }
            ((Bundle)object0).putBoolean("instr", true);
        }
        if(zzfcd0.zza() != null) {
            ((Bundle)object0).putBoolean("has_delayed_banner_listener", true);
        }
    }
}

