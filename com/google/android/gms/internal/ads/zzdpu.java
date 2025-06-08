package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import org.json.JSONObject;

public final class zzdpu {
    public final zzfvm a;
    public final zzdqh b;
    public final zzdqm c;

    public zzdpu(zzfvm zzfvm0, zzdqh zzdqh0, zzdqm zzdqm0) {
        this.a = zzfvm0;
        this.b = zzdqh0;
        this.c = zzdqm0;
    }

    public final zzfvl zza(zzfbx zzfbx0, zzfbl zzfbl0, JSONObject jSONObject0) {
        zzfvl zzfvl7;
        zzdps zzdps0 = new zzdps(this, zzfbx0, zzfbl0, jSONObject0);
        zzfvm zzfvm0 = this.a;
        zzfvl zzfvl0 = zzfvm0.zzb(zzdps0);
        zzdqh zzdqh0 = this.b;
        zzfvl zzfvl1 = zzdqh0.zzf(jSONObject0, "images");
        zzfvl zzfvl2 = zzdqh0.zzg(jSONObject0, "images", zzfbl0, zzfbx0.zzb.zzb);
        zzfvl zzfvl3 = zzdqh0.zze(jSONObject0, "secondary_image");
        zzfvl zzfvl4 = zzdqh0.zze(jSONObject0, "app_icon");
        zzfvl zzfvl5 = zzdqh0.zzd(jSONObject0, "attribution");
        zzfvl zzfvl6 = zzdqh0.zzh(jSONObject0, zzfbl0, zzfbx0.zzb.zzb);
        if(jSONObject0.optBoolean("enable_omid")) {
            JSONObject jSONObject1 = jSONObject0.optJSONObject("omid_settings");
            if(jSONObject1 == null) {
                zzfvl7 = zzfvc.zzi(null);
            }
            else {
                String s = jSONObject1.optString("omid_html");
                zzfvl7 = TextUtils.isEmpty(s) ? zzfvc.zzi(null) : zzfvc.zzn(zzfvc.zzi(null), new zzdpw(zzdqh0, s), zzcfv.zze);
            }
        }
        else {
            zzfvl7 = zzfvc.zzi(null);
        }
        zzfvl zzfvl8 = this.c.zza(jSONObject0, "custom_assets");
        return zzfvc.zzb(new zzfvl[]{zzfvl0, zzfvl1, zzfvl2, zzfvl3, zzfvl4, zzfvl5, zzfvl6, zzfvl7, zzfvl8}).zza(new zzdpt(this, zzfvl0, zzfvl1, zzfvl4, zzfvl3, zzfvl5, jSONObject0, zzfvl6, zzfvl2, zzfvl7, zzfvl8), zzfvm0);
    }
}

