package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbu;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzdnl extends zzdnm {
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final JSONObject h;

    public zzdnl(zzfbl zzfbl0, JSONObject jSONObject0) {
        super(zzfbl0);
        this.b = zzbu.zzg(jSONObject0, new String[]{"tracking_urls_and_actions", "active_view"});
        boolean z = false;
        this.c = zzbu.zzk(false, jSONObject0, new String[]{"allow_pub_owned_ad_view"});
        this.d = zzbu.zzk(false, jSONObject0, new String[]{"attribution", "allow_pub_rendering"});
        this.e = zzbu.zzk(false, jSONObject0, new String[]{"enable_omid"});
        this.g = zzbu.zzb("", jSONObject0, new String[]{"watermark_overlay_png_base64"});
        if(jSONObject0.optJSONObject("overlay") != null) {
            z = true;
        }
        this.f = z;
        this.h = ((Boolean)zzay.zzc().zzb(zzbhz.zzef)).booleanValue() ? jSONObject0.optJSONObject("omid_settings") : null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnm
    public final zzfcg zza() {
        return this.h == null ? this.a.zzW : new zzfcg(this.h);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnm
    public final String zzb() {
        return this.g;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnm
    public final JSONObject zzc() {
        JSONObject jSONObject0 = this.b;
        if(jSONObject0 != null) {
            return jSONObject0;
        }
        try {
            return new JSONObject(this.a.zzA);
        }
        catch(JSONException unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdnm
    public final boolean zzd() {
        return this.e;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnm
    public final boolean zze() {
        return this.c;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnm
    public final boolean zzf() {
        return this.d;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnm
    public final boolean zzg() {
        return this.f;
    }
}

