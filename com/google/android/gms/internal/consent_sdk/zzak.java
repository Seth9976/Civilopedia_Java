package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import i3.e;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzak implements zzg {
    public final Application a;
    public final zzam b;
    public final Executor c;

    public zzak(Application application0, zzam zzam0, Executor executor0) {
        this.a = application0;
        this.b = zzam0;
        this.c = executor0;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzg
    public final Executor zza() {
        return this.c;
    }

    @Override  // com.google.android.gms.internal.consent_sdk.zzg
    public final boolean zzb(String s, JSONObject jSONObject0) {
        zzam zzam0;
        int v1;
        switch(s) {
            case "clear": {
                v1 = 1;
                break;
            }
            case "write": {
                v1 = 0;
                break;
            }
            default: {
                v1 = -1;
            }
        }
        Application application0 = this.a;
        switch(v1) {
            case 0: {
                zzbz zzbz0 = new zzbz(application0);
                Iterator iterator0 = jSONObject0.keys();
                while(true) {
                    boolean z = iterator0.hasNext();
                    zzam0 = this.b;
                    if(!z) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    String s1 = (String)object0;
                    Object object1 = jSONObject0.opt(s1);
                    String s2 = String.valueOf(object1);
                    Log.d("UserMessagingPlatform", e.i(new StringBuilder(String.valueOf(s1).length() + 23 + s2.length()), "Writing to storage: [", s1, "] ", s2));
                    if(zzbz0.zzc(s1, object1)) {
                        zzam0.zzc().add(s1);
                    }
                    else {
                        String s3 = String.valueOf(s1);
                        Log.d("UserMessagingPlatform", (s3.length() == 0 ? new String("Failed writing key: ") : "Failed writing key: " + s3));
                    }
                }
                zzam0.zze();
                zzbz0.zzb();
                return true;
            }
            case 1: {
                JSONArray jSONArray0 = jSONObject0.optJSONArray("keys");
                if(jSONArray0 != null && jSONArray0.length() != 0) {
                    HashSet hashSet0 = new HashSet();
                    int v2 = jSONArray0.length();
                    for(int v = 0; v < v2; ++v) {
                        String s4 = jSONArray0.optString(v);
                        if(TextUtils.isEmpty(s4)) {
                            Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + v);
                        }
                        else {
                            hashSet0.add(s4);
                        }
                    }
                    zzca.zzb(application0, hashSet0);
                    return true;
                }
                String s5 = jSONObject0.toString();
                Log.d("UserMessagingPlatform", (s5.length() == 0 ? new String("Action[clear]: wrong args.") : "Action[clear]: wrong args." + s5));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

