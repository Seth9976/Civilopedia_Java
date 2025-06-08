package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class zzdwc {
    public final ConcurrentHashMap a;
    public final zzcev b;

    public zzdwc(zzdwm zzdwm0, zzcev zzcev0, zzfcd zzfcd0, String s) {
        ConcurrentHashMap concurrentHashMap0 = zzdwm0.zzc();
        this.a = concurrentHashMap0;
        this.b = zzcev0;
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            return;
        }
        int v = zzf.zzd(zzfcd0);
        if(v - 1 != 0) {
            switch(v - 1) {
                case 1: {
                    concurrentHashMap0.put("se", "query_g");
                    break;
                }
                case 2: {
                    concurrentHashMap0.put("se", "r_adinfo");
                    break;
                }
                default: {
                    if(v - 1 == 3) {
                        concurrentHashMap0.put("se", "r_adstring");
                    }
                    else {
                        concurrentHashMap0.put("se", "r_both");
                    }
                }
            }
            concurrentHashMap0.put("scar", "true");
            if(v == 2) {
                concurrentHashMap0.put("rid", s);
            }
            String s1 = zzfcd0.zzd.zzp;
            if(!TextUtils.isEmpty(s1)) {
                concurrentHashMap0.put("ragent", s1);
            }
            String s2 = zzf.zza(zzf.zzb(zzfcd0.zzd));
            if(!TextUtils.isEmpty(s2)) {
                concurrentHashMap0.put("rtype", s2);
            }
            return;
        }
        concurrentHashMap0.put("scar", "false");
    }

    public final Map zza() {
        return this.a;
    }

    public final void zzb(zzfbx zzfbx0) {
        ConcurrentHashMap concurrentHashMap0 = this.a;
        if(zzfbx0.zzb.zza.size() > 0) {
            switch(((zzfbl)zzfbx0.zzb.zza.get(0)).zzb) {
                case 1: {
                    concurrentHashMap0.put("ad_format", "banner");
                    break;
                }
                case 2: {
                    concurrentHashMap0.put("ad_format", "interstitial");
                    break;
                }
                case 3: {
                    concurrentHashMap0.put("ad_format", "native_express");
                    break;
                }
                case 4: {
                    concurrentHashMap0.put("ad_format", "native_advanced");
                    break;
                }
                case 5: {
                    concurrentHashMap0.put("ad_format", "rewarded");
                    break;
                }
                case 6: {
                    concurrentHashMap0.put("ad_format", "app_open_ad");
                    concurrentHashMap0.put("as", (this.b.zzj() ? "1" : "0"));
                    break;
                }
                default: {
                    concurrentHashMap0.put("ad_format", "unknown");
                }
            }
        }
        String s = zzfbx0.zzb.zzb.zzb;
        if(!TextUtils.isEmpty(s)) {
            concurrentHashMap0.put("gqi", s);
        }
    }

    public final void zzc(Bundle bundle0) {
        boolean z = bundle0.containsKey("cnt");
        ConcurrentHashMap concurrentHashMap0 = this.a;
        if(z) {
            concurrentHashMap0.put("network_coarse", Integer.toString(bundle0.getInt("cnt")));
        }
        if(bundle0.containsKey("gnt")) {
            concurrentHashMap0.put("network_fine", Integer.toString(bundle0.getInt("gnt")));
        }
    }
}

