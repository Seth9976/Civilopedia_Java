package com.google.android.gms.internal.ads;

import A.f;
import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.ads.internal.util.zze;
import i3.e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzcji implements zzbom {
    public boolean a;

    public static int a(Context context0, Map map0, String s, int v) {
        String s1 = (String)map0.get(s);
        if(s1 != null) {
            try {
                v = zzcfb.zzw(context0, Integer.parseInt(s1));
            }
            catch(NumberFormatException unused_ex) {
                zzcfi.zzj(("Could not parse " + s + " in a video GMSG: " + s1));
            }
        }
        if(zze.zzc()) {
            StringBuilder stringBuilder0 = e.j("Parse pixels for ", s, ", got string ", s1, ", int ");
            stringBuilder0.append(v);
            stringBuilder0.append(".");
            zze.zza(stringBuilder0.toString());
        }
        return v;
    }

    public static void b(zzchf zzchf0, Map map0) {
        String s = (String)map0.get("minBufferMs");
        String s1 = (String)map0.get("maxBufferMs");
        String s2 = (String)map0.get("bufferForPlaybackMs");
        String s3 = (String)map0.get("bufferForPlaybackAfterRebufferMs");
        String s4 = (String)map0.get("socketReceiveBufferSize");
        try {
            if(s != null) {
                zzchf0.zzA(Integer.parseInt(s));
            }
            if(s1 != null) {
                zzchf0.zzz(Integer.parseInt(s1));
            }
            if(s2 != null) {
                zzchf0.zzx(Integer.parseInt(s2));
            }
            if(s3 != null) {
                zzchf0.zzy(Integer.parseInt(s3));
            }
            if(s4 != null) {
                zzchf0.zzC(Integer.parseInt(s4));
            }
        }
        catch(NumberFormatException unused_ex) {
            zzcfi.zzj(("Could not parse buffer parameters in loadControl video GMSG: (" + s + ", " + s1 + ")"));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        int v11;
        int v10;
        int v8;
        zzchr zzchr0 = (zzchr)object0;
        String s = (String)map0.get("action");
        if(s == null) {
            zzcfi.zzj("Action missing from video GMSG.");
            return;
        }
        if(zzcfi.zzm(3)) {
            JSONObject jSONObject0 = new JSONObject(map0);
            jSONObject0.remove("google.afma.Notify_dt");
            zzcfi.zze(("Video GMSG: " + s + " " + jSONObject0.toString()));
        }
        if("background".equals(s)) {
            String s1 = (String)map0.get("color");
            if(TextUtils.isEmpty(s1)) {
                zzcfi.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzchr0.setBackgroundColor(Color.parseColor(s1));
            }
            catch(IllegalArgumentException unused_ex) {
                zzcfi.zzj("Invalid color parameter in background video GMSG.");
            }
            return;
        }
        if("playerBackground".equals(s)) {
            String s2 = (String)map0.get("color");
            if(TextUtils.isEmpty(s2)) {
                zzcfi.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzchr0.zzD(Color.parseColor(s2));
            }
            catch(IllegalArgumentException unused_ex) {
                zzcfi.zzj("Invalid color parameter in playerBackground video GMSG.");
            }
            return;
        }
        if("decoderProps".equals(s)) {
            String s3 = (String)map0.get("mimeTypes");
            if(s3 == null) {
                zzcfi.zzj("No MIME types specified for decoder properties inspection.");
                HashMap hashMap0 = new HashMap();
                hashMap0.put("event", "decoderProps");
                hashMap0.put("error", "missingMimeTypes");
                zzchr0.zzd("onVideoEvent", hashMap0);
                return;
            }
            HashMap hashMap1 = new HashMap();
            String[] arr_s = s3.split(",");
            for(int v = 0; v < arr_s.length; ++v) {
                String s4 = arr_s[v];
                hashMap1.put(s4, zzch.zza(s4.trim()));
            }
            HashMap hashMap2 = new HashMap();
            hashMap2.put("event", "decoderProps");
            hashMap2.put("mimeTypes", hashMap1);
            zzchr0.zzd("onVideoEvent", hashMap2);
            return;
        }
        zzchg zzchg0 = zzchr0.zzbp();
        if(zzchg0 == null) {
            zzcfi.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean z = "new".equals(s);
        if(!z && !"position".equals(s)) {
            zzcme zzcme0 = zzchr0.zzs();
            if(zzcme0 != null) {
                if("timeupdate".equals(s)) {
                    String s5 = (String)map0.get("currentTime");
                    if(s5 == null) {
                        zzcfi.zzj("currentTime parameter missing from timeupdate video GMSG.");
                        return;
                    }
                    try {
                        zzcme0.zzt(Float.parseFloat(s5));
                    }
                    catch(NumberFormatException unused_ex) {
                        zzcfi.zzj(("Could not parse currentTime parameter from timeupdate video GMSG: " + s5));
                    }
                    return;
                }
                if("skip".equals(s)) {
                    zzcme0.zzu();
                    return;
                }
            }
            zzchf zzchf0 = zzchg0.zza();
            if(zzchf0 == null) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("event", "no_video_view");
                zzchr0.zzd("onVideoEvent", hashMap3);
                return;
            }
            if("click".equals(s)) {
                Context context0 = zzchr0.getContext();
                int v1 = zzcji.a(context0, map0, "x", 0);
                int v2 = zzcji.a(context0, map0, "y", 0);
                long v3 = SystemClock.uptimeMillis();
                MotionEvent motionEvent0 = MotionEvent.obtain(v3, v3, 0, ((float)v1), ((float)v2), 0);
                zzchf0.zzw(motionEvent0);
                motionEvent0.recycle();
                return;
            }
            if("currentTime".equals(s)) {
                String s6 = (String)map0.get("time");
                if(s6 == null) {
                    zzcfi.zzj("Time parameter missing from currentTime video GMSG.");
                    return;
                }
                try {
                    zzchf0.zzv(((int)(Float.parseFloat(s6) * 1000.0f)));
                }
                catch(NumberFormatException unused_ex) {
                    zzcfi.zzj(("Could not parse time parameter from currentTime video GMSG: " + s6));
                }
                return;
            }
            if("hide".equals(s)) {
                zzchf0.setVisibility(4);
                return;
            }
            if("load".equals(s)) {
                zzchf0.zzq();
                return;
            }
            if("loadControl".equals(s)) {
                zzcji.b(zzchf0, map0);
                return;
            }
            if("muted".equals(s)) {
                if(Boolean.parseBoolean(((String)map0.get("muted")))) {
                    zzchf0.zzr();
                    return;
                }
                zzchf0.zzH();
                return;
            }
            if("pause".equals(s)) {
                zzchf0.zzt();
                return;
            }
            if("play".equals(s)) {
                zzchf0.zzu();
                return;
            }
            if("show".equals(s)) {
                zzchf0.setVisibility(0);
                return;
            }
            if("src".equals(s)) {
                String s7 = (String)map0.get("src");
                Integer integer0 = null;
                if(map0.containsKey("periodicReportIntervalMs")) {
                    try {
                        integer0 = Integer.parseInt(((String)map0.get("periodicReportIntervalMs")));
                    }
                    catch(NumberFormatException unused_ex) {
                        zzcfi.zzj(("Video gmsg invalid numeric parameter \'periodicReportIntervalMs\': " + ((String)map0.get("periodicReportIntervalMs"))));
                    }
                }
                String[] arr_s1 = {s7};
                String s8 = (String)map0.get("demuxed");
                if(s8 != null) {
                    try {
                        JSONArray jSONArray0 = new JSONArray(s8);
                        String[] arr_s2 = new String[jSONArray0.length()];
                        for(int v4 = 0; v4 < jSONArray0.length(); ++v4) {
                            arr_s2[v4] = jSONArray0.getString(v4);
                        }
                        arr_s1 = arr_s2;
                    }
                    catch(JSONException unused_ex) {
                        zzcfi.zzj(("Malformed demuxed URL list for playback: " + s8));
                        arr_s1 = new String[]{s7};
                    }
                }
                if(integer0 != null) {
                    zzchr0.zzC(((int)integer0));
                }
                zzchf0.zzD(s7, arr_s1);
                return;
            }
            if("touchMove".equals(s)) {
                Context context1 = zzchr0.getContext();
                zzchf0.zzG(((float)zzcji.a(context1, map0, "dx", 0)), ((float)zzcji.a(context1, map0, "dy", 0)));
                if(this.a) {
                    return;
                }
                zzchr0.zzw();
                this.a = true;
                return;
            }
            if("volume".equals(s)) {
                String s9 = (String)map0.get("volume");
                if(s9 == null) {
                    zzcfi.zzj("Level parameter missing from volume video GMSG.");
                    return;
                }
                try {
                    zzchf0.zzF(Float.parseFloat(s9));
                }
                catch(NumberFormatException unused_ex) {
                    zzcfi.zzj(("Could not parse volume parameter from volume video GMSG: " + s9));
                }
                return;
            }
            if("watermark".equals(s)) {
                zzchf0.zzm();
                return;
            }
            zzcfi.zzj(("Unknown video action: " + s));
            return;
        }
        Context context2 = zzchr0.getContext();
        int v5 = zzcji.a(context2, map0, "x", 0);
        int v6 = zzcji.a(context2, map0, "y", 0);
        int v7 = zzcji.a(context2, map0, "w", -1);
        zzbhr zzbhr0 = zzbhz.zzcU;
        if(!((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue()) {
            if(zze.zzc()) {
                StringBuilder stringBuilder0 = f.n("Calculate width with original width ", v7, ", videoHost.getVideoBoundingWidth() ", zzchr0.zzj(), ", x ");
                stringBuilder0.append(v5);
                stringBuilder0.append(".");
                zze.zza(stringBuilder0.toString());
            }
            v8 = Math.min(v7, zzchr0.zzj() - v5);
        }
        else if(v7 == -1) {
            v8 = zzchr0.zzj();
        }
        else {
            v8 = Math.min(v7, zzchr0.zzj());
        }
        int v9 = zzcji.a(context2, map0, "h", -1);
        if(!((Boolean)zzay.zzc().zzb(zzbhr0)).booleanValue()) {
            if(zze.zzc()) {
                StringBuilder stringBuilder1 = f.n("Calculate height with original height ", v9, ", videoHost.getVideoBoundingHeight() ", zzchr0.zzi(), ", y ");
                stringBuilder1.append(v6);
                stringBuilder1.append(".");
                zze.zza(stringBuilder1.toString());
            }
            v10 = Math.min(v9, zzchr0.zzi() - v6);
        }
        else if(v9 == -1) {
            v10 = zzchr0.zzi();
        }
        else {
            v10 = Math.min(v9, zzchr0.zzi());
        }
        try {
            v11 = 0;
            v11 = Integer.parseInt(((String)map0.get("player")));
        }
        catch(NumberFormatException unused_ex) {
        }
        boolean z1 = Boolean.parseBoolean(((String)map0.get("spherical")));
        if(z && zzchg0.zza() == null) {
            zzchg0.zzc(v5, v6, v8, v10, v11, z1, new zzchq(((String)map0.get("flags"))));
            zzchf zzchf1 = zzchg0.zza();
            if(zzchf1 != null) {
                zzcji.b(zzchf1, map0);
            }
            return;
        }
        zzchg0.zzb(v5, v6, v8, v10);
    }
}

