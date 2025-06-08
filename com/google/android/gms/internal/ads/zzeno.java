package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class zzeno implements zzetf {
    public final zzfcd a;
    public final long b;

    public zzeno(zzfcd zzfcd0, long v) {
        Preconditions.checkNotNull(zzfcd0, "the targeting must not be null");
        this.a = zzfcd0;
        this.b = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzetf
    public final void zzf(Object object0) {
        Bundle bundle0 = (Bundle)object0;
        zzl zzl0 = this.a.zzd;
        bundle0.putInt("http_timeout_millis", zzl0.zzw);
        bundle0.putString("slotname", this.a.zzf);
        int v = this.a.zzo.zza - 1;
        if(this.a.zzo.zza == 0) {
            throw null;
        }
        boolean z = true;
        switch(v) {
            case 1: {
                bundle0.putBoolean("is_new_rewarded", true);
                break;
            }
            case 2: {
                bundle0.putBoolean("is_rewarded_interstitial", true);
            }
        }
        bundle0.putLong("start_signals_timestamp", this.b);
        zzfco.zzg(bundle0, "cust_age", new SimpleDateFormat("yyyyMMdd", Locale.US).format(new Date(zzl0.zzb)), zzl0.zzb != -1L);
        zzfco.zzb(bundle0, "extras", zzl0.zzc);
        zzfco.zzf(bundle0, "cust_gender", zzl0.zzd, zzl0.zzd != -1);
        zzfco.zzd(bundle0, "kw", zzl0.zze);
        zzfco.zzf(bundle0, "tag_for_child_directed_treatment", zzl0.zzg, zzl0.zzg != -1);
        if(zzl0.zzf) {
            bundle0.putBoolean("test_request", true);
        }
        zzfco.zzf(bundle0, "d_imp_hdr", 1, zzl0.zza >= 2 && zzl0.zzh);
        boolean z1 = zzl0.zza >= 2 && !TextUtils.isEmpty(zzl0.zzi);
        zzfco.zzg(bundle0, "ppid", zzl0.zzi, z1);
        Location location0 = zzl0.zzk;
        if(location0 != null) {
            float f = location0.getAccuracy();
            long v1 = location0.getTime();
            double f1 = location0.getLatitude();
            double f2 = location0.getLongitude();
            Bundle bundle1 = new Bundle();
            bundle1.putFloat("radius", f * 1000.0f);
            bundle1.putLong("lat", ((long)(f1 * 10000000.0)));
            bundle1.putLong("long", ((long)(10000000.0 * f2)));
            bundle1.putLong("time", v1 * 1000L);
            bundle0.putBundle("uule", bundle1);
        }
        zzfco.zzc(bundle0, "url", zzl0.zzl);
        zzfco.zzd(bundle0, "neighboring_content_urls", zzl0.zzv);
        zzfco.zzb(bundle0, "custom_targeting", zzl0.zzn);
        zzfco.zzd(bundle0, "category_exclusions", zzl0.zzo);
        zzfco.zzc(bundle0, "request_agent", zzl0.zzp);
        zzfco.zzc(bundle0, "request_pkg", zzl0.zzq);
        zzfco.zze(bundle0, "is_designed_for_families", Boolean.valueOf(zzl0.zzr), zzl0.zza >= 7);
        if(zzl0.zza >= 8) {
            Integer integer0 = zzl0.zzt;
            if(zzl0.zzt == -1) {
                z = false;
            }
            zzfco.zzf(bundle0, "tag_for_under_age_of_consent", integer0, z);
            zzfco.zzc(bundle0, "max_ad_content_rating", zzl0.zzu);
        }
    }
}

