package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzam {
    public final Application a;
    public final SharedPreferences b;
    public final HashSet c;

    public zzam(Application application0) {
        this.a = application0;
        SharedPreferences sharedPreferences0 = application0.getSharedPreferences("__GOOGLE_FUNDING_CHOICE_SDK_INTERNAL__", 0);
        this.b = sharedPreferences0;
        this.c = new HashSet(sharedPreferences0.getStringSet("written_values", Collections.emptySet()));
    }

    public final int zza() {
        return this.b.getInt("consent_status", 0);
    }

    public final Map zzb() {
        String s3;
        Set set0 = Collections.emptySet();
        Set set1 = this.b.getStringSet("stored_info", set0);
        Map map0 = new HashMap();
        for(Object object0: set1) {
            String s = (String)object0;
            Application application0 = this.a;
            zzby zzby0 = zzca.zza(application0, s);
            if(zzby0 == null) {
                String s1 = String.valueOf(s);
                Log.d("UserMessagingPlatform", (s1.length() == 0 ? new String("Fetching request info: failed for key: ") : "Fetching request info: failed for key: " + s1));
            }
            else {
                Object object1 = application0.getSharedPreferences(zzby0.zza, 0).getAll().get(zzby0.zzb);
                if(object1 == null) {
                    String s2 = String.valueOf(s);
                    Log.d("UserMessagingPlatform", (s2.length() == 0 ? new String("Stored info not exists: ") : "Stored info not exists: " + s2));
                }
                else {
                    if(object1 instanceof Boolean) {
                        s3 = ((Boolean)object1).booleanValue() ? "1" : "0";
                    }
                    else if(object1 instanceof Number) {
                        s3 = object1.toString();
                    }
                    else if(object1 instanceof String) {
                        s3 = (String)object1;
                    }
                    else {
                        goto label_31;
                    }
                    ((HashMap)map0).put(s, s3);
                    continue;
                label_31:
                    String s4 = String.valueOf(s);
                    Log.d("UserMessagingPlatform", (s4.length() == 0 ? new String("Failed to fetch stored info: ") : "Failed to fetch stored info: " + s4));
                }
            }
        }
        return map0;
    }

    public final Set zzc() {
        return this.c;
    }

    public final void zzd() {
        zzca.zzb(this.a, this.c);
        this.c.clear();
        this.b.edit().remove("stored_info").remove("consent_status").remove("consent_type").apply();
    }

    public final void zze() {
        this.b.edit().putStringSet("written_values", this.c).apply();
    }

    public final void zzf(int v) {
        this.b.edit().putInt("consent_status", v).apply();
    }

    public final void zzg(Set set0) {
        this.b.edit().putStringSet("stored_info", set0).apply();
    }
}

