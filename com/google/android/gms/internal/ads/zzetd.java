package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzetd implements zzetg {
    public final zzfvm a;
    public final Context b;

    public zzetd(zzfvm zzfvm0, Context context0) {
        this.a = zzfvm0;
        this.b = context0;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 37;
    }

    @Override  // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        zzetb zzetb0 = new zzetb(this);
        return this.a.zzb(zzetb0);
    }

    public static Bundle zzc(Context context0, JSONArray jSONArray0) {
        String s2;
        SharedPreferences sharedPreferences0;
        int v1;
        Bundle bundle0 = new Bundle();
        for(int v = 0; v < jSONArray0.length(); ++v) {
            JSONObject jSONObject0 = jSONArray0.optJSONObject(v);
            String s = jSONObject0.optString("bk");
            String s1 = jSONObject0.optString("sk");
            switch(jSONObject0.optInt("type", -1)) {
                case 0: {
                    v1 = 1;
                    break;
                }
                case 1: {
                    v1 = 2;
                    break;
                }
                case 2: {
                    v1 = 3;
                    break;
                }
                default: {
                    v1 = 0;
                }
            }
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && v1 != 0) {
                String[] arr_s = s1.split("/");
                int v2 = arr_s.length;
                Object object0 = null;
                if(v2 <= 2 && v2 != 0) {
                    if(v2 == 1) {
                        sharedPreferences0 = PreferenceManager.getDefaultSharedPreferences(context0);
                        s2 = arr_s[0];
                    }
                    else {
                        sharedPreferences0 = context0.getSharedPreferences(arr_s[0], 0);
                        s2 = arr_s[1];
                    }
                    object0 = sharedPreferences0.getAll().get(s2);
                }
                if(object0 != null) {
                    switch(v1 - 1) {
                        case 0: {
                            if(object0 instanceof String) {
                                bundle0.putString(s, ((String)object0));
                            }
                            break;
                        }
                        case 1: {
                            if(object0 instanceof Integer) {
                                bundle0.putInt(s, ((int)(((Integer)object0))));
                            }
                            else if(object0 instanceof Long) {
                                bundle0.putLong(s, ((long)(((Long)object0))));
                            }
                            else if(object0 instanceof Float) {
                                bundle0.putFloat(s, ((float)(((Float)object0))));
                            }
                            break;
                        }
                        default: {
                            if(object0 instanceof Boolean) {
                                bundle0.putBoolean(s, ((Boolean)object0).booleanValue());
                            }
                        }
                    }
                }
            }
        }
        return bundle0;
    }
}

