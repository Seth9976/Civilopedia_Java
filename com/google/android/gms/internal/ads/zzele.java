package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzele {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final zzfvm d;
    public JSONObject e;

    public zzele(zzfvm zzfvm0) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = zzfvm0;
    }

    public final ArrayList a(String s, JSONObject jSONObject0) {
        synchronized(this) {
            ArrayList arrayList0 = new ArrayList();
            if(jSONObject0 == null) {
                return arrayList0;
            }
            Bundle bundle0 = zzele.e(jSONObject0.optJSONObject("data"));
            JSONArray jSONArray0 = jSONObject0.optJSONArray("rtb_adapters");
            if(jSONArray0 == null) {
                return arrayList0;
            }
            ArrayList arrayList1 = new ArrayList();
            for(int v2 = 0; v2 < jSONArray0.length(); ++v2) {
                String s1 = jSONArray0.optString(v2, "");
                if(!TextUtils.isEmpty(s1)) {
                    arrayList1.add(s1);
                }
            }
            int v3 = arrayList1.size();
            for(int v1 = 0; v1 < v3; ++v1) {
                String s2 = (String)arrayList1.get(v1);
                this.zzf(s2);
                if(((zzelg)this.a.get(s2)) != null) {
                    arrayList0.add(new zzelg(s2, s, bundle0));
                }
            }
            return arrayList0;
        }
    }

    public final void b(String s, String s1, ArrayList arrayList0) {
        synchronized(this) {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                Map map0 = (Map)this.c.get(s);
                if(map0 == null) {
                    map0 = new HashMap();
                }
                this.c.put(s, map0);
                List list0 = (List)map0.get(s1);
                if(list0 == null) {
                    list0 = new ArrayList();
                }
                list0.addAll(arrayList0);
                map0.put(s1, list0);
            }
        }
    }

    public final void c() {
        synchronized(this) {
            JSONObject jSONObject0 = zzt.zzo().zzh().zzh().zzf();
            if(jSONObject0 != null) {
                try {
                    JSONArray jSONArray0 = jSONObject0.optJSONArray("ad_unit_id_settings");
                    this.e = jSONObject0.optJSONObject("ad_unit_patterns");
                    if(jSONArray0 != null) {
                        for(int v1 = 0; true; ++v1) {
                            if(v1 >= jSONArray0.length()) {
                                break;
                            }
                            JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                            String s = ((Boolean)zzay.zzc().zzb(zzbhz.zzim)).booleanValue() ? jSONObject1.optString("ad_unit_id", "").toLowerCase(Locale.ROOT) : jSONObject1.optString("ad_unit_id", "");
                            String s1 = jSONObject1.optString("format", "");
                            ArrayList arrayList0 = new ArrayList();
                            JSONObject jSONObject2 = jSONObject1.optJSONObject("mediation_config");
                            if(jSONObject2 != null) {
                                JSONArray jSONArray1 = jSONObject2.optJSONArray("ad_networks");
                                if(jSONArray1 != null) {
                                    for(int v2 = 0; v2 < jSONArray1.length(); ++v2) {
                                        arrayList0.addAll(this.a(s1, jSONArray1.getJSONObject(v2)));
                                    }
                                }
                            }
                            this.b(s1, s, arrayList0);
                        }
                    }
                    return;
                }
                catch(JSONException jSONException0) {
                }
                zze.zzb("Malformed config loading JSON.", jSONException0);
            }
        }
    }

    public final void d() {
        synchronized(this) {
            if(!((Boolean)zzbju.zze.zze()).booleanValue() && ((Boolean)zzay.zzc().zzb(zzbhz.zzbx)).booleanValue()) {
                JSONObject jSONObject0 = zzt.zzo().zzh().zzh().zzf();
                if(jSONObject0 == null) {
                    return;
                }
                try {
                    JSONArray jSONArray0 = jSONObject0.getJSONArray("signal_adapters");
                    for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                        JSONObject jSONObject1 = jSONArray0.getJSONObject(v1);
                        Bundle bundle0 = zzele.e(jSONObject1.optJSONObject("data"));
                        String s = jSONObject1.optString("adapter_class_name");
                        boolean z = jSONObject1.optBoolean("render", false);
                        boolean z1 = jSONObject1.optBoolean("collect_signals", false);
                        if(!TextUtils.isEmpty(s)) {
                            zzeli zzeli0 = new zzeli(s, z1, z, bundle0);
                            this.b.put(s, zzeli0);
                        }
                    }
                }
                catch(JSONException jSONException0) {
                    zze.zzb("Malformed config loading JSON.", jSONException0);
                }
            }
        }
    }

    public static final Bundle e(JSONObject jSONObject0) {
        Bundle bundle0 = new Bundle();
        if(jSONObject0 != null) {
            Iterator iterator0 = jSONObject0.keys();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                bundle0.putString(((String)object0), jSONObject0.optString(((String)object0), ""));
            }
        }
        return bundle0;
    }

    public final Map zza(String s, String s1) {
        synchronized(this) {
            if(!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1)) {
                Map map0 = (Map)this.c.get(s);
                if(map0 == null) {
                    return zzfrm.zzd();
                }
                List list0 = (List)map0.get(s1);
                if(list0 == null) {
                    String s2 = zzduj.zza(this.e, s1, s);
                    if(((Boolean)zzay.zzc().zzb(zzbhz.zzim)).booleanValue()) {
                        s2 = s2.toLowerCase(Locale.ROOT);
                    }
                    list0 = (List)map0.get(s2);
                }
                if(list0 == null) {
                    return zzfrm.zzd();
                }
                HashMap hashMap0 = new HashMap();
                for(Object object0: list0) {
                    String s3 = ((zzelg)object0).zza;
                    if(!hashMap0.containsKey(s3)) {
                        hashMap0.put(s3, new ArrayList());
                    }
                    ((List)hashMap0.get(s3)).add(((zzelg)object0).zzc);
                }
                return zzfrm.zzc(hashMap0);
            }
        }
        return zzfrm.zzd();
    }

    public final Map zzb() {
        synchronized(this) {
            return zzfrm.zzc(this.b);
        }
    }

    // 检测为 lambda 实现。
    public static void zzc(zzele zzele0) {
        synchronized(zzele0) {
            zzele0.b.clear();
            zzele0.a.clear();
            zzele0.c();
            zzele0.d();
        }
    }

    public final void zzd() {
        zzt.zzo().zzh().zzq(new zzelc(this));
        zzeld zzeld0 = () -> synchronized(this) {
            this.b.clear();
            this.a.clear();
            this.c();
            this.d();
        };
        this.d.execute(zzeld0);
    }

    public final void zzf(String s) {
        synchronized(this) {
            if(TextUtils.isEmpty(s)) {
                return;
            }
            if(this.a.containsKey(s)) {
                return;
            }
            zzelg zzelg0 = new zzelg(s, "", new Bundle());
            this.a.put(s, zzelg0);
        }
    }
}

