package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public final class zzcsn {
    public final Map a;
    public final Map b;

    public zzcsn(Map map0, Map map1) {
        this.a = map0;
        this.b = map1;
    }

    public final void zza(zzfbx zzfbx0) throws Exception {
        for(Object object0: zzfbx0.zzb.zzc) {
            zzfbv zzfbv0 = (zzfbv)object0;
            Map map0 = this.a;
            if(map0.containsKey(zzfbv0.zza)) {
                ((zzcsq)map0.get(zzfbv0.zza)).zza(zzfbv0.zzb);
            }
            else {
                Map map1 = this.b;
                if(map1.containsKey(zzfbv0.zza)) {
                    zzcsp zzcsp0 = (zzcsp)map1.get(zzfbv0.zza);
                    JSONObject jSONObject0 = zzfbv0.zzb;
                    HashMap hashMap0 = new HashMap();
                    Iterator iterator1 = jSONObject0.keys();
                    while(iterator1.hasNext()) {
                        Object object1 = iterator1.next();
                        String s = (String)object1;
                        String s1 = jSONObject0.optString(s);
                        if(s1 != null) {
                            hashMap0.put(s, s1);
                        }
                    }
                    zzcsp0.zza(hashMap0);
                }
            }
        }
    }
}

