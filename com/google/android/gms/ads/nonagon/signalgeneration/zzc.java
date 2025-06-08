package com.google.android.gms.ads.nonagon.signalgeneration;

import H0.c;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzdwc;
import com.google.android.gms.internal.ads.zzdwm;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzc {
    public final int a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final Map e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public final zzdwm h;
    public ConcurrentHashMap i;

    public zzc(zzdwm zzdwm0) {
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
        this.h = zzdwm0;
        this.a = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzfV)));
        this.b = (long)(((Long)zzay.zzc().zzb(zzbhz.zzfW)));
        this.c = ((Boolean)zzay.zzc().zzb(zzbhz.zzgb)).booleanValue();
        this.d = ((Boolean)zzay.zzc().zzb(zzbhz.zzfZ)).booleanValue();
        this.e = Collections.synchronizedMap(new c(this));
    }

    public final void a(zzdwc zzdwc0) {
        synchronized(this) {
            if(!this.c) {
                return;
            }
            ArrayDeque arrayDeque0 = this.g.clone();
            this.g.clear();
            ArrayDeque arrayDeque1 = this.f.clone();
            this.f.clear();
            zza zza0 = new zza(this, zzdwc0, arrayDeque0, arrayDeque1);
            zzcfv.zza.execute(zza0);
        }
    }

    public final void b(zzdwc zzdwc0, ArrayDeque arrayDeque0, String s) {
        Pair pair1;
        while(!arrayDeque0.isEmpty()) {
            Pair pair0 = (Pair)arrayDeque0.poll();
            ConcurrentHashMap concurrentHashMap0 = new ConcurrentHashMap(zzdwc0.zza());
            this.i = concurrentHashMap0;
            concurrentHashMap0.put("action", "ev");
            this.i.put("e_r", s);
            this.i.put("e_id", ((String)pair0.first));
            if(this.d) {
                String s1 = (String)pair0.second;
                try {
                    JSONObject jSONObject0 = new JSONObject(s1);
                    String s2 = jSONObject0.getString("request_agent");
                    pair1 = new Pair(zzf.zza(jSONObject0.getJSONObject("extras").getString("query_info_type")), s2);
                }
                catch(JSONException unused_ex) {
                    pair1 = new Pair("", "");
                }
                ConcurrentHashMap concurrentHashMap1 = this.i;
                String s3 = (String)pair1.first;
                if(!TextUtils.isEmpty(s3)) {
                    concurrentHashMap1.put("e_type", s3);
                }
                ConcurrentHashMap concurrentHashMap2 = this.i;
                String s4 = (String)pair1.second;
                if(!TextUtils.isEmpty(s4)) {
                    concurrentHashMap2.put("e_agent", s4);
                }
            }
            this.h.zze(this.i);
        }
    }

    public final void c() {
        synchronized(this) {
            long v1 = zzt.zzA().currentTimeMillis();
            Set set0 = this.e.entrySet();
            try {
                Iterator iterator0 = set0.iterator();
                while(iterator0.hasNext()) {
                    Object object0 = iterator0.next();
                    if(v1 - ((long)(((Long)((Pair)((Map.Entry)object0).getValue()).first))) <= this.b) {
                        break;
                    }
                    Pair pair0 = new Pair(((String)((Map.Entry)object0).getKey()), ((String)((Pair)((Map.Entry)object0).getValue()).second));
                    this.g.add(pair0);
                    iterator0.remove();
                }
            }
            catch(ConcurrentModificationException concurrentModificationException0) {
                zzt.zzo().zzt(concurrentModificationException0, "QueryJsonMap.removeExpiredEntries");
            }
        }
    }

    public final String zzb(String s, zzdwc zzdwc0) {
        synchronized(this) {
            Pair pair0 = (Pair)this.e.get(s);
            zzdwc0.zza().put("rid", s);
            if(pair0 != null) {
                String s1 = (String)pair0.second;
                this.e.remove(s);
                zzdwc0.zza().put("mhit", "true");
                return s1;
            }
            zzdwc0.zza().put("mhit", "false");
            return null;
        }
    }

    public final void zzd(String s, String s1, zzdwc zzdwc0) {
        synchronized(this) {
            Pair pair0 = new Pair(zzt.zzA().currentTimeMillis(), s1);
            this.e.put(s, pair0);
            this.c();
            this.a(zzdwc0);
        }
    }

    public final void zzf(String s) {
        synchronized(this) {
            this.e.remove(s);
        }
    }
}

