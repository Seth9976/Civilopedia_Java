package com.google.android.gms.internal.ads;

import android.os.Build.VERSION;
import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

public class zzfjp {
    public zzfkn a;
    public long b;
    public int c;

    public zzfjp() {
        this.zzb();
        this.a = new zzfkn(null);
    }

    public final void a(zzfir zzfir0, zzfip zzfip0, JSONObject jSONObject0) {
        String s = zzfir0.zzh();
        JSONObject jSONObject1 = new JSONObject();
        zzfjt.zzg(jSONObject1, "environment", "app");
        zzfjt.zzg(jSONObject1, "adSessionType", zzfip0.zzd());
        JSONObject jSONObject2 = new JSONObject();
        zzfjt.zzg(jSONObject2, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        zzfjt.zzg(jSONObject2, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfjt.zzg(jSONObject2, "os", "Android");
        zzfjt.zzg(jSONObject1, "deviceInfo", jSONObject2);
        JSONArray jSONArray0 = new JSONArray();
        jSONArray0.put("clid");
        jSONArray0.put("vlid");
        zzfjt.zzg(jSONObject1, "supports", jSONArray0);
        JSONObject jSONObject3 = new JSONObject();
        zzfjt.zzg(jSONObject3, "partnerName", zzfip0.zze().zzb());
        zzfjt.zzg(jSONObject3, "partnerVersion", zzfip0.zze().zzc());
        zzfjt.zzg(jSONObject1, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        zzfjt.zzg(jSONObject4, "libraryVersion", "1.3.3-google_20200416");
        zzfjt.zzg(jSONObject4, "appId", "com.spears.civilopedia");
        zzfjt.zzg(jSONObject1, "app", jSONObject4);
        if(zzfip0.zzf() != null) {
            zzfjt.zzg(jSONObject1, "contentUrl", zzfip0.zzf());
        }
        zzfjt.zzg(jSONObject1, "customReferenceData", zzfip0.zzg());
        JSONObject jSONObject5 = new JSONObject();
        Iterator iterator0 = zzfip0.zzh().iterator();
        if(!iterator0.hasNext()) {
            zzfji.zza().zzg(this.zza(), s, jSONObject1, jSONObject5, jSONObject0);
            return;
        }
        Object object0 = iterator0.next();
        zzfix zzfix0 = (zzfix)object0;
        throw null;
    }

    public final WebView zza() {
        return (WebView)this.a.get();
    }

    public final void zzb() {
        this.b = System.nanoTime();
        this.c = 1;
    }

    public void zzc() {
        this.a.clear();
    }

    public final void zzd(String s, long v) {
        if(v >= this.b && this.c != 3) {
            this.c = 3;
            zzfji.zza().zzf(this.zza(), s);
        }
    }

    public final void zze(String s, long v) {
        if(v >= this.b) {
            this.c = 2;
            zzfji.zza().zzf(this.zza(), s);
        }
    }

    public void zzf(zzfir zzfir0, zzfip zzfip0) {
        this.a(zzfir0, zzfip0, null);
    }

    public final void zzh(float f) {
        zzfji.zza().zze(this.zza(), f);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.a.get() != null;
    }
}

