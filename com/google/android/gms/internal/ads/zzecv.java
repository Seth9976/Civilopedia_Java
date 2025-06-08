package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class zzecv implements zzffi {
    public final String a;
    public final zzfhh b;
    public final zzfhs c;
    public static final Pattern d;

    static {
        zzecv.d = Pattern.compile("([^;]+=[^;]+)(;\\s|$)", 2);
    }

    public zzecv(String s, zzfhs zzfhs0, zzfhh zzfhh0) {
        this.a = s;
        this.c = zzfhs0;
        this.b = zzfhh0;
    }

    @Override  // com.google.android.gms.internal.ads.zzffi
    public final Object zza(Object object0) throws Exception {
        String s2;
        int v = ((zzecu)object0).a.optInt("http_timeout_millis", 60000);
        zzbzy zzbzy0 = ((zzecu)object0).b;
        zzfhh zzfhh0 = this.b;
        zzfhs zzfhs0 = this.c;
        if(zzbzy0.zza() == -2) {
            HashMap hashMap0 = new HashMap();
            String s = "";
            if(zzbzy0.zzh()) {
                String s1 = this.a;
                if(!TextUtils.isEmpty(s1)) {
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzaI)).booleanValue()) {
                        if(TextUtils.isEmpty(s1)) {
                            s2 = "";
                        }
                        else {
                            Matcher matcher0 = zzecv.d.matcher(s1);
                            s2 = "";
                            while(matcher0.find()) {
                                String s3 = matcher0.group(1);
                                if(s3 != null && (s3.toLowerCase(Locale.ROOT).startsWith("id=") || s3.toLowerCase(Locale.ROOT).startsWith("ide="))) {
                                    if(!TextUtils.isEmpty(s2)) {
                                        s2 = s2 + "; ";
                                    }
                                    s2 = s2 + s3;
                                }
                            }
                        }
                        if(!TextUtils.isEmpty(s2)) {
                            hashMap0.put("Cookie", s2);
                        }
                    }
                    else {
                        hashMap0.put("Cookie", s1);
                    }
                }
            }
            if(zzbzy0.zzi()) {
                JSONObject jSONObject0 = ((zzecu)object0).a.optJSONObject("pii");
                if(jSONObject0 == null) {
                    zze.zza("DSID signal does not exist.");
                }
                else {
                    if(!TextUtils.isEmpty(jSONObject0.optString("doritos", ""))) {
                        hashMap0.put("x-afma-drt-cookie", jSONObject0.optString("doritos", ""));
                    }
                    if(!TextUtils.isEmpty(jSONObject0.optString("doritos_v2", ""))) {
                        hashMap0.put("x-afma-drt-v2-cookie", jSONObject0.optString("doritos_v2", ""));
                    }
                }
            }
            if(!TextUtils.isEmpty(zzbzy0.zzd())) {
                s = zzbzy0.zzd();
            }
            zzfhh0.zze(true);
            zzfhs0.zza(zzfhh0);
            return new zzecq(zzbzy0.zze(), v, hashMap0, s.getBytes(zzfoi.zzc), "");
        }
        zzfhh0.zze(false);
        zzfhs0.zza(zzfhh0);
        if(zzbzy0.zza() != 1) {
            throw new zzdzl(1);
        }
        if(zzbzy0.zzf() != null) {
            zzcfi.zzg(TextUtils.join(", ", zzbzy0.zzf()));
        }
        throw new zzdzl(2, "Error building request URL.");
    }
}

