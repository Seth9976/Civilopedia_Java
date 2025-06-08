package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzccl implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final zzg c;
    public final zzcdn d;
    public String e;
    public int f;

    public zzccl(Context context0, zzg zzg0, zzcdn zzcdn0) {
        this.e = "-1";
        this.f = -1;
        this.b = PreferenceManager.getDefaultSharedPreferences(context0);
        this.c = zzg0;
        this.a = context0;
        this.d = zzcdn0;
    }

    public final void a() {
        SharedPreferences sharedPreferences0 = this.b;
        sharedPreferences0.registerOnSharedPreferenceChangeListener(this);
        this.onSharedPreferenceChanged(sharedPreferences0, "gad_has_consent_for_cookies");
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzav)).booleanValue()) {
            this.onSharedPreferenceChanged(sharedPreferences0, "IABTCF_gdprApplies");
            this.onSharedPreferenceChanged(sharedPreferences0, "IABTCF_TCString");
            return;
        }
        this.onSharedPreferenceChanged(sharedPreferences0, "IABTCF_PurposeConsents");
    }

    public final void b(String s, int v) {
        boolean z = true;
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzat)).booleanValue()) {
            if(!s.isEmpty() && s.charAt(0) == 49) {
                z = false;
            }
        }
        else if(v != 0 && !s.isEmpty() && (s.charAt(0) == 49 || s.equals("-1"))) {
            z = false;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzar)).booleanValue()) {
            this.c.zzH(z);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzfg)).booleanValue() && z) {
                Context context0 = this.a;
                if(context0 != null) {
                    context0.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        boolean z1 = !((Boolean)zzay.zzc().zzb(zzbhz.zzam)).booleanValue();
    }

    @Override  // android.content.SharedPreferences$OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences0, String s) {
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzav)).booleanValue()) {
            boolean z = zzcck.zza(s, "gad_has_consent_for_cookies");
            zzg zzg0 = this.c;
            if(z) {
                if(!((Boolean)zzay.zzc().zzb(zzbhz.zzat)).booleanValue()) {
                    return;
                }
                int v = sharedPreferences0.getInt("gad_has_consent_for_cookies", -1);
                if(v != zzg0.zzb()) {
                    zzg0.zzH(true);
                }
                zzg0.zzE(v);
                return;
            }
            if(zzcck.zza(s, "IABTCF_gdprApplies") || zzcck.zza(s, "IABTCF_TCString") || zzcck.zza(s, "IABTCF_PurposeConsents")) {
                String s1 = sharedPreferences0.getString(s, "-1");
                if(s1 != null && !s1.equals(zzg0.zzn(s))) {
                    zzg0.zzH(true);
                }
                zzg0.zzF(s, s1);
            }
        }
        else {
            String s2 = sharedPreferences0.getString("IABTCF_PurposeConsents", "-1");
            int v1 = sharedPreferences0.getInt("gad_has_consent_for_cookies", -1);
            switch(String.valueOf(s)) {
                case "IABTCF_PurposeConsents": {
                    if(!s2.equals("-1") && !this.e.equals(s2)) {
                        this.e = s2;
                        this.b(s2, v1);
                        return;
                    }
                    break;
                }
                case "gad_has_consent_for_cookies": {
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzat)).booleanValue() && v1 != -1 && this.f != v1) {
                        this.f = v1;
                        this.b(s2, v1);
                        return;
                    }
                    break;
                }
            }
        }
    }
}

