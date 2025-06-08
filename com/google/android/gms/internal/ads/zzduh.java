package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;
import org.json.JSONArray;
import org.json.JSONObject;

public final class zzduh {
    public final ConcurrentHashMap a;
    public JSONObject b;
    public final Executor c;
    public boolean d;
    public JSONObject e;

    public zzduh(Executor executor0) {
        this.a = new ConcurrentHashMap();
        this.c = executor0;
    }

    // 检测为 lambda 实现。
    public final void a() {
        Map map0;
        synchronized(this) {
            this.d = true;
            zzcel zzcel0 = zzt.zzo().zzh().zzh();
            if(zzcel0 == null) {
                return;
            }
            JSONObject jSONObject0 = zzcel0.zzf();
            if(jSONObject0 == null) {
                return;
            }
            this.b = ((Boolean)zzay.zzc().zzb(zzbhz.zzdc)).booleanValue() ? jSONObject0.optJSONObject("common_settings") : null;
            this.e = jSONObject0.optJSONObject("ad_unit_patterns");
            JSONArray jSONArray0 = jSONObject0.optJSONArray("ad_unit_id_settings");
            if(jSONArray0 != null) {
                for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                    JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                    if(jSONObject1 != null) {
                        String s = jSONObject1.optString("ad_unit_id");
                        String s1 = jSONObject1.optString("format");
                        JSONObject jSONObject2 = jSONObject1.optJSONObject("request_signals");
                        if(s != null && jSONObject2 != null && s1 != null) {
                            if(this.a.containsKey(s1)) {
                                map0 = (Map)this.a.get(s1);
                            }
                            else {
                                ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                                this.a.put(s1, concurrentHashMap0);
                                map0 = concurrentHashMap0;
                            }
                            map0.put(s, jSONObject2);
                        }
                    }
                }
            }
        }
    }

    @CheckForNull
    public final JSONObject zza() {
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzdc)).booleanValue() ? this.b : null;
    }

    @CheckForNull
    public final JSONObject zzb(String s, String s1) {
        if(!((Boolean)zzay.zzc().zzb(zzbhz.zzdb)).booleanValue()) {
            return null;
        }
        if(s != null && s1 != null) {
            if(!this.d) {
                this.a();
            }
            Map map0 = (Map)this.a.get(s1);
            if(map0 == null) {
                return null;
            }
            JSONObject jSONObject0 = (JSONObject)map0.get(s);
            if(jSONObject0 != null) {
                return jSONObject0;
            }
            String s2 = zzduj.zza(this.e, s, s1);
            return s2 == null ? null : ((JSONObject)map0.get(s2));
        }
        return null;
    }

    public final void zzc() {
        zzt.zzo().zzh().zzq(new zzdue(this));
        zzduf zzduf0 = () -> {
            Map map0;
            synchronized(this) {
                this.d = true;
                zzcel zzcel0 = zzt.zzo().zzh().zzh();
                if(zzcel0 == null) {
                    return;
                }
                JSONObject jSONObject0 = zzcel0.zzf();
                if(jSONObject0 == null) {
                    return;
                }
                this.b = ((Boolean)zzay.zzc().zzb(zzbhz.zzdc)).booleanValue() ? jSONObject0.optJSONObject("common_settings") : null;
                this.e = jSONObject0.optJSONObject("ad_unit_patterns");
                JSONArray jSONArray0 = jSONObject0.optJSONArray("ad_unit_id_settings");
                if(jSONArray0 != null) {
                    for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                        JSONObject jSONObject1 = jSONArray0.optJSONObject(v1);
                        if(jSONObject1 != null) {
                            String s = jSONObject1.optString("ad_unit_id");
                            String s1 = jSONObject1.optString("format");
                            JSONObject jSONObject2 = jSONObject1.optJSONObject("request_signals");
                            if(s != null && jSONObject2 != null && s1 != null) {
                                if(this.a.containsKey(s1)) {
                                    map0 = (Map)this.a.get(s1);
                                }
                                else {
                                    ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap();
                                    this.a.put(s1, concurrentHashMap0);
                                    map0 = concurrentHashMap0;
                                }
                                map0.put(s, jSONObject2);
                            }
                        }
                    }
                }
            }
        };
        this.c.execute(zzduf0);
    }
}

