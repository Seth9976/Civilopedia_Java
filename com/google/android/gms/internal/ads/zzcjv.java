package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcjv implements zzbom {
    public static final Integer a(String s, Map map0) {
        if(!map0.containsKey(s)) {
            return null;
        }
        try {
            return Integer.parseInt(((String)map0.get(s)));
        }
        catch(NumberFormatException unused_ex) {
            zzcfi.zzj(("Precache invalid numeric parameter \'" + s + "\': " + ((String)map0.get(s))));
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        zzcju zzcju0;
        zzcjm zzcjm2;
        if(zzcfi.zzm(3)) {
            JSONObject jSONObject0 = new JSONObject(map0);
            jSONObject0.remove("google.afma.Notify_dt");
            zzcfi.zze(("Precache GMSG: " + jSONObject0.toString()));
        }
        zzcjn zzcjn0 = zzt.zzy();
        if(map0.containsKey("abort")) {
            if(zzcjn0.zzd(((zzchr)object0))) {
                return;
            }
            zzcfi.zzj("Precache abort but no precache task running.");
            return;
        }
        String s = (String)map0.get("src");
        Integer integer0 = zzcjv.a("periodicReportIntervalMs", map0);
        Integer integer1 = zzcjv.a("exoPlayerRenderingIntervalMs", map0);
        Integer integer2 = zzcjv.a("exoPlayerIdleIntervalMs", map0);
        zzchq zzchq0 = new zzchq(((String)map0.get("flags")));
        boolean z = zzchq0.zzn;
        if(s != null) {
            String[] arr_s = {s};
            String s1 = (String)map0.get("demuxed");
            if(s1 != null) {
                try {
                    JSONArray jSONArray0 = new JSONArray(s1);
                    String[] arr_s1 = new String[jSONArray0.length()];
                    for(int v = 0; v < jSONArray0.length(); ++v) {
                        arr_s1[v] = jSONArray0.getString(v);
                    }
                    arr_s = arr_s1;
                }
                catch(JSONException unused_ex) {
                    zzcfi.zzj(("Malformed demuxed URL list for precache: " + s1));
                    arr_s = null;
                }
            }
            if(arr_s == null) {
                arr_s = new String[]{s};
            }
            zzcjm zzcjm0 = null;
            if(z) {
                Iterator iterator0 = zzcjn0.iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_48;
                    }
                    Object object1 = iterator0.next();
                    zzcjm zzcjm1 = (zzcjm)object1;
                    if(zzcjm1.b == ((zzchr)object0) && s.equals(zzcjm1.zze())) {
                        zzcjm2 = zzcjm1;
                        break;
                    }
                }
            }
            else {
                Iterator iterator1 = zzcjn0.iterator();
                while(true) {
                    if(!iterator1.hasNext()) {
                        goto label_48;
                    }
                    Object object2 = iterator1.next();
                    zzcjm zzcjm3 = (zzcjm)object2;
                    if(zzcjm3.b == ((zzchr)object0)) {
                        zzcjm2 = zzcjm3;
                        break;
                    }
                }
            }
            zzcjm0 = zzcjm2;
        label_48:
            if(zzcjm0 != null) {
                zzcfi.zzj("Precache task is already running.");
                return;
            }
            if(((zzchr)object0).zzm() == null) {
                zzcfi.zzj("Precache requires a dependency provider.");
                return;
            }
            Integer integer3 = zzcjv.a("player", map0);
            if(integer3 == null) {
                integer3 = 0;
            }
            if(integer0 != null) {
                ((zzchr)object0).zzC(((int)integer0));
            }
            if(integer1 != null) {
                ((zzchr)object0).zzA(((int)integer1));
            }
            if(integer2 != null) {
                ((zzchr)object0).zzz(((int)integer2));
            }
            ((zzchr)object0).zzm();
            if(((int)integer3) > 0) {
                int v1 = zzchi.zzu();
                if(v1 < zzchq0.zzh) {
                    zzcju0 = new zzckd(((zzchr)object0), zzchq0);
                }
                else if(v1 < zzchq0.zzb) {
                    zzcju0 = new zzcka(((zzchr)object0), zzchq0);
                }
                else {
                    zzcju0 = new zzcjy(((zzchr)object0));
                }
            }
            else {
                zzcju0 = new zzcjx(((zzchr)object0));
            }
            new zzcjm(((zzchr)object0), zzcju0, s, arr_s).zzb();
            goto label_86;
        }
        zzcjm zzcjm4 = null;
        for(Object object3: zzcjn0) {
            zzcjm zzcjm5 = (zzcjm)object3;
            if(zzcjm5.b == ((zzchr)object0)) {
                zzcjm4 = zzcjm5;
                break;
            }
        }
        if(zzcjm4 != null) {
            zzcju0 = zzcjm4.c;
        label_86:
            Integer integer4 = zzcjv.a("minBufferMs", map0);
            if(integer4 != null) {
                zzcju0.zzp(((int)integer4));
            }
            Integer integer5 = zzcjv.a("maxBufferMs", map0);
            if(integer5 != null) {
                zzcju0.zzo(((int)integer5));
            }
            Integer integer6 = zzcjv.a("bufferForPlaybackMs", map0);
            if(integer6 != null) {
                zzcju0.zzh(((int)integer6));
            }
            Integer integer7 = zzcjv.a("bufferForPlaybackAfterRebufferMs", map0);
            if(integer7 != null) {
                zzcju0.zzn(((int)integer7));
            }
            return;
        }
        zzcfi.zzj("Precache must specify a source.");
    }
}

