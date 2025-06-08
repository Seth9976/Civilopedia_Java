package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzctz implements zzbst {
    public final Context i;
    public final zzbaj j;
    public final PowerManager k;

    public zzctz(Context context0, zzbaj zzbaj0) {
        this.i = context0;
        this.j = zzbaj0;
        this.k = (PowerManager)context0.getSystemService("power");
    }

    public final JSONObject zza(zzcuc zzcuc0) throws JSONException {
        JSONObject jSONObject1;
        JSONArray jSONArray0 = new JSONArray();
        JSONObject jSONObject0 = new JSONObject();
        zzbam zzbam0 = zzcuc0.zzf;
        if(zzbam0 == null) {
            jSONObject1 = new JSONObject();
        }
        else {
            zzbaj zzbaj0 = this.j;
            if(zzbaj0.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzbam0.zza;
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = jSONObject2.put("afmaVersion", zzbaj0.zzb()).put("activeViewJSON", zzbaj0.zzd()).put("timestamp", zzcuc0.zzd).put("adFormat", zzbaj0.zza()).put("hashCode", zzbaj0.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcuc0.zzb).put("isNative", zzbaj0.zze()).put("isScreenOn", this.k.isInteractive()).put("appMuted", zzt.zzr().zze()).put("appVolume", ((double)zzt.zzr().zza()));
            Context context0 = this.i;
            jSONObject3.put("deviceVolume", ((double)zzab.zzb(context0.getApplicationContext())));
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzeH)).booleanValue()) {
                AudioManager audioManager0 = (AudioManager)context0.getApplicationContext().getSystemService("audio");
                Integer integer0 = audioManager0 == null ? null : audioManager0.getMode();
                if(integer0 != null) {
                    jSONObject2.put("audioMode", integer0);
                }
            }
            Rect rect0 = new Rect();
            Display display0 = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
            rect0.right = display0.getWidth();
            rect0.bottom = display0.getHeight();
            DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
            jSONObject2.put("windowVisibility", zzbam0.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzbam0.zzc.top).put("bottom", zzbam0.zzc.bottom).put("left", zzbam0.zzc.left).put("right", zzbam0.zzc.right)).put("adBox", new JSONObject().put("top", zzbam0.zzd.top).put("bottom", zzbam0.zzd.bottom).put("left", zzbam0.zzd.left).put("right", zzbam0.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzbam0.zze.top).put("bottom", zzbam0.zze.bottom).put("left", zzbam0.zze.left).put("right", zzbam0.zze.right)).put("globalVisibleBoxVisible", zzbam0.zzf).put("localVisibleBox", new JSONObject().put("top", zzbam0.zzg.top).put("bottom", zzbam0.zzg.bottom).put("left", zzbam0.zzg.left).put("right", zzbam0.zzg.right)).put("localVisibleBoxVisible", zzbam0.zzh).put("hitBox", new JSONObject().put("top", zzbam0.zzi.top).put("bottom", zzbam0.zzi.bottom).put("left", zzbam0.zzi.left).put("right", zzbam0.zzi.right)).put("screenDensity", ((double)displayMetrics0.density));
            jSONObject2.put("isVisible", zzcuc0.zza);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzbi)).booleanValue()) {
                JSONArray jSONArray1 = new JSONArray();
                List list0 = zzbam0.zzk;
                if(list0 != null) {
                    for(Object object0: list0) {
                        jSONArray1.put(new JSONObject().put("top", ((Rect)object0).top).put("bottom", ((Rect)object0).bottom).put("left", ((Rect)object0).left).put("right", ((Rect)object0).right));
                    }
                }
                jSONObject2.put("scrollableContainerBoxes", jSONArray1);
            }
            if(!TextUtils.isEmpty(zzcuc0.zze)) {
                jSONObject2.put("doneReasonCode", "u");
            }
            jSONObject1 = jSONObject2;
        }
        jSONArray0.put(jSONObject1);
        jSONObject0.put("units", jSONArray0);
        return jSONObject0;
    }

    @Override  // com.google.android.gms.internal.ads.zzbst
    public final JSONObject zzb(Object object0) throws JSONException {
        return this.zza(((zzcuc)object0));
    }
}

