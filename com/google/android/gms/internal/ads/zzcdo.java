package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class zzcdo {
    public static t2 a;

    public abstract zzccp a();

    public static zzcdo zzd(Context context0) {
        JSONObject jSONObject0;
        synchronized(zzcdo.class) {
            zzcdo zzcdo0 = zzcdo.a;
            if(zzcdo0 != null) {
                return zzcdo0;
            }
            Context context1 = context0.getApplicationContext();
            zzbhz.zzc(context1);
            zzg zzg0 = zzt.zzo().zzh();
            zzg0.zzr(context1);
            context1.getClass();
            Clock clock0 = zzt.zzA();
            clock0.getClass();
            zzcdn zzcdn0 = zzt.zzn();
            zzgrc.zzc(context1, Context.class);
            zzgrc.zzc(clock0, Clock.class);
            zzgrc.zzc(zzg0, zzg.class);
            zzgrc.zzc(zzcdn0, zzcdn.class);
            t2 t20 = new t2(context1, clock0, zzg0, zzcdn0);
            zzcdo.a = t20;
            ((zzccl)t20.f.zzb()).a();
            zzcdo.a.a().zzc();
            z2 z20 = (z2)zzcdo.a.i.zzb();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzao)).booleanValue()) {
                HashMap hashMap0 = new HashMap();
                try {
                    jSONObject0 = new JSONObject(((String)zzay.zzc().zzb(zzbhz.zzaq)));
                }
                catch(JSONException jSONException0) {
                    zzcfi.zzf("Failed to parse listening list", jSONException0);
                    return zzcdo.a;
                }
                Iterator iterator0 = jSONObject0.keys();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    String s = (String)object0;
                    HashSet hashSet0 = new HashSet();
                    JSONArray jSONArray0 = jSONObject0.optJSONArray(s);
                    if(jSONArray0 != null) {
                        for(int v1 = 0; v1 < jSONArray0.length(); ++v1) {
                            String s1 = jSONArray0.optString(v1);
                            if(s1 != null) {
                                hashSet0.add(s1);
                            }
                        }
                        hashMap0.put(s, hashSet0);
                    }
                }
                for(Object object1: hashMap0.keySet()) {
                    z20.a(((String)object1));
                }
                z20.b(new zzcdq(z20, hashMap0));
            }
            return zzcdo.a;
        }
    }
}

