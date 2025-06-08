package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzchq {
    public final boolean zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;
    public final boolean zzl;
    public final boolean zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final long zzp;
    public final long zzq;

    public zzchq(String s) {
        long v1;
        long v;
        String s1;
        JSONObject jSONObject0 = null;
        if(s != null) {
            try {
                jSONObject0 = new JSONObject(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        this.zza = zzchq.a(jSONObject0, "aggressive_media_codec_release", zzbhz.zzG);
        this.zzb = zzchq.b(jSONObject0, "byte_buffer_precache_limit", zzbhz.zzj);
        this.zzc = zzchq.b(jSONObject0, "exo_cache_buffer_size", zzbhz.zzu);
        this.zzd = zzchq.b(jSONObject0, "exo_connect_timeout_millis", zzbhz.zzf);
        zzbhr zzbhr0 = zzbhz.zze;
        if(jSONObject0 == null) {
        label_12:
            s1 = (String)zzay.zzc().zzb(zzbhr0);
        }
        else {
            try {
                s1 = jSONObject0.getString("exo_player_version");
                goto label_13;
            }
            catch(JSONException unused_ex) {
            }
            goto label_12;
        }
    label_13:
        this.zze = s1;
        this.zzf = zzchq.b(jSONObject0, "exo_read_timeout_millis", zzbhz.zzg);
        this.zzg = zzchq.b(jSONObject0, "load_check_interval_bytes", zzbhz.zzh);
        this.zzh = zzchq.b(jSONObject0, "player_precache_limit", zzbhz.zzi);
        this.zzi = zzchq.b(jSONObject0, "socket_receive_buffer_size", zzbhz.zzk);
        this.zzj = zzchq.a(jSONObject0, "use_cache_data_source", zzbhz.zzdo);
        this.zzk = zzchq.b(jSONObject0, "min_retry_count", zzbhz.zzl);
        this.zzl = zzchq.a(jSONObject0, "treat_load_exception_as_non_fatal", zzbhz.zzo);
        this.zzm = zzchq.a(jSONObject0, "using_official_simple_exo_player", zzbhz.zzbC);
        this.zzn = zzchq.a(jSONObject0, "enable_multiple_video_playback", zzbhz.zzbD);
        this.zzo = zzchq.a(jSONObject0, "use_range_http_data_source", zzbhz.zzbF);
        zzbhr zzbhr1 = zzbhz.zzbG;
        if(jSONObject0 == null) {
        label_28:
            v = (long)(((Long)zzay.zzc().zzb(zzbhr1)));
        }
        else {
            try {
                v = jSONObject0.getLong("range_http_data_source_high_water_mark");
                goto label_29;
            }
            catch(JSONException unused_ex) {
            }
            goto label_28;
        }
    label_29:
        this.zzp = v;
        zzbhr zzbhr2 = zzbhz.zzbH;
        if(jSONObject0 == null) {
            v1 = (long)(((Long)zzay.zzc().zzb(zzbhr2)));
        }
        else {
            try {
                v1 = jSONObject0.getLong("range_http_data_source_low_water_mark");
                this.zzq = v1;
                return;
            }
            catch(JSONException unused_ex) {
            }
            v1 = (long)(((Long)zzay.zzc().zzb(zzbhr2)));
            this.zzq = v1;
            return;
        }
        this.zzq = v1;
    }

    public static final boolean a(JSONObject jSONObject0, String s, zzbhr zzbhr0) {
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue();
        if(jSONObject0 != null) {
            try {
                return jSONObject0.getBoolean(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        return z;
    }

    public static final int b(JSONObject jSONObject0, String s, zzbhr zzbhr0) {
        if(jSONObject0 != null) {
            try {
                return jSONObject0.getInt(s);
            }
            catch(JSONException unused_ex) {
            }
        }
        return (int)(((Integer)zzay.zzc().zzb(zzbhr0)));
    }
}

