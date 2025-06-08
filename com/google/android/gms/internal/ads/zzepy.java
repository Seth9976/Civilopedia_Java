package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.concurrent.Callable;

public final class zzepy implements Callable {
    public final zzeqb zza;

    public zzepy(zzeqb zzeqb0) {
        this.zza = zzeqb0;
    }

    @Override
    public final Object call() {
        this.zza.getClass();
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzeZ)).booleanValue();
        String s = "";
        Context context0 = this.zza.a;
        String s1 = z ? context0.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "") : "";
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfb)).booleanValue()) {
            s = context0.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "");
        }
        Bundle bundle0 = null;
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzfa)).booleanValue()) {
            SharedPreferences sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(context0);
            Bundle bundle1 = new Bundle();
            if(sharedPreferences0.contains("IABConsent_CMPPresent")) {
                bundle1.putBoolean("IABConsent_CMPPresent", sharedPreferences0.getBoolean("IABConsent_CMPPresent", false));
            }
            for(int v = 0; v < 4; ++v) {
                String s2 = new String[]{"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"}[v];
                if(sharedPreferences0.contains(s2)) {
                    bundle1.putString(s2, sharedPreferences0.getString(s2, null));
                }
            }
            bundle0 = bundle1;
        }
        return new D5(s1, s, bundle0);
    }
}

