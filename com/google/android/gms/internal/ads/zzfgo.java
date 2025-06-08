package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;

public final class zzfgo {
    public final HashMap a;
    public final S8 b;

    public zzfgo() {
        HashMap hashMap0 = new HashMap();
        this.a = hashMap0;
        this.b = new S8(zzt.zzA());
        hashMap0.put("new_csi", "1");
    }

    public final zzfgo zza(String s, String s1) {
        this.a.put(s, s1);
        return this;
    }

    public static zzfgo zzb(String s) {
        zzfgo zzfgo0 = new zzfgo();
        zzfgo0.a.put("action", s);
        return zzfgo0;
    }

    public static zzfgo zzc(String s) {
        zzfgo zzfgo0 = new zzfgo();
        zzfgo0.a.put("request_id", s);
        return zzfgo0;
    }

    public final zzfgo zzd(String s) {
        S8 s80 = this.b;
        HashMap hashMap0 = (HashMap)s80.l;
        boolean z = hashMap0.containsKey(s);
        Clock clock0 = (Clock)s80.j;
        if(z) {
            long v = clock0.elapsedRealtime();
            long v1 = (long)(((Long)hashMap0.remove(s)));
            s80.b(s, v - v1);
            return this;
        }
        hashMap0.put(s, clock0.elapsedRealtime());
        return this;
    }

    public final zzfgo zze(String s, String s1) {
        S8 s80 = this.b;
        HashMap hashMap0 = (HashMap)s80.l;
        boolean z = hashMap0.containsKey(s);
        Clock clock0 = (Clock)s80.j;
        if(z) {
            s80.b(s, s1 + (clock0.elapsedRealtime() - ((long)(((Long)hashMap0.remove(s))))));
            return this;
        }
        hashMap0.put(s, clock0.elapsedRealtime());
        return this;
    }

    public final zzfgo zzf(zzfbl zzfbl0) {
        this.a.put("aai", zzfbl0.zzx);
        return this;
    }

    public final zzfgo zzg(zzfbo zzfbo0) {
        if(!TextUtils.isEmpty(zzfbo0.zzb)) {
            this.a.put("gqi", zzfbo0.zzb);
        }
        return this;
    }

    public final zzfgo zzh(zzfbx zzfbx0, zzcev zzcev0) {
        zzfbw zzfbw0 = zzfbx0.zzb;
        this.zzg(zzfbw0.zzb);
        if(!zzfbw0.zza.isEmpty()) {
            int v = ((zzfbl)zzfbw0.zza.get(0)).zzb;
            HashMap hashMap0 = this.a;
            switch(v) {
                case 1: {
                    hashMap0.put("ad_format", "banner");
                    return this;
                }
                case 2: {
                    hashMap0.put("ad_format", "interstitial");
                    return this;
                }
                case 3: {
                    hashMap0.put("ad_format", "native_express");
                    return this;
                }
                case 4: {
                    hashMap0.put("ad_format", "native_advanced");
                    return this;
                }
                case 5: {
                    hashMap0.put("ad_format", "rewarded");
                    return this;
                }
                case 6: {
                    hashMap0.put("ad_format", "app_open_ad");
                    if(zzcev0 != null) {
                        hashMap0.put("as", (zzcev0.zzj() ? "1" : "0"));
                        return this;
                    }
                    break;
                }
                default: {
                    hashMap0.put("ad_format", "unknown");
                    return this;
                }
            }
        }
        return this;
    }

    public final zzfgo zzi(Bundle bundle0) {
        boolean z = bundle0.containsKey("cnt");
        HashMap hashMap0 = this.a;
        if(z) {
            hashMap0.put("network_coarse", Integer.toString(bundle0.getInt("cnt")));
        }
        if(bundle0.containsKey("gnt")) {
            hashMap0.put("network_fine", Integer.toString(bundle0.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        Map map0 = new HashMap(this.a);
        this.b.getClass();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((HashMap)this.b.k).entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            int v = 0;
            if(((List)map$Entry0.getValue()).size() > 1) {
                for(Object object1: ((List)map$Entry0.getValue())) {
                    ++v;
                    arrayList0.add(new n6(((String)map$Entry0.getKey()) + "." + v, ((String)object1)));
                }
            }
            else {
                arrayList0.add(new n6(((String)map$Entry0.getKey()), ((String)((List)map$Entry0.getValue()).get(0))));
            }
        }
        for(Object object2: arrayList0) {
            ((HashMap)map0).put(((n6)object2).a, ((n6)object2).b);
        }
        return map0;
    }
}

