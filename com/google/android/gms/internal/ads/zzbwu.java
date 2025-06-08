package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbwu extends zzbwv implements zzbom {
    public final zzcli c;
    public final Context d;
    public final WindowManager e;
    public final zzbhj f;
    public DisplayMetrics g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public zzbwu(zzcli zzcli0, Context context0, zzbhj zzbhj0) {
        super(zzcli0, "");
        this.i = -1;
        this.j = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.c = zzcli0;
        this.d = context0;
        this.f = zzbhj0;
        this.e = (WindowManager)context0.getSystemService("window");
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        JSONObject jSONObject0;
        zzcli zzcli0 = (zzcli)object0;
        this.g = new DisplayMetrics();
        Display display0 = this.e.getDefaultDisplay();
        display0.getMetrics(this.g);
        this.h = this.g.density;
        this.k = display0.getRotation();
        this.i = zzcfb.zzu(this.g, this.g.widthPixels);
        this.j = zzcfb.zzu(this.g, this.g.heightPixels);
        zzcli zzcli1 = this.c;
        Activity activity0 = zzcli1.zzk();
        if(activity0 == null || activity0.getWindow() == null) {
            this.l = this.i;
            this.m = this.j;
        }
        else {
            int[] arr_v = zzs.zzM(activity0);
            this.l = zzcfb.zzu(this.g, arr_v[0]);
            this.m = zzcfb.zzu(this.g, arr_v[1]);
        }
        if(zzcli1.zzQ().zzi()) {
            this.n = this.i;
            this.o = this.j;
        }
        else {
            zzcli1.measure(0, 0);
        }
        this.zzi(this.i, this.j, this.l, this.m, this.h, this.k);
        zzbwt zzbwt0 = new zzbwt();
        Intent intent0 = new Intent("android.intent.action.DIAL");
        intent0.setData(Uri.parse("tel:"));
        zzbwt0.zze(this.f.zza(intent0));
        Intent intent1 = new Intent("android.intent.action.VIEW");
        intent1.setData(Uri.parse("sms:"));
        zzbwt0.zzc(this.f.zza(intent1));
        zzbwt0.zza(this.f.zzb());
        zzbwt0.zzd(this.f.zzc());
        zzbwt0.zzb(true);
        boolean z = zzbwt0.a;
        boolean z1 = zzbwt0.b;
        boolean z2 = zzbwt0.c;
        boolean z3 = zzbwt0.d;
        boolean z4 = zzbwt0.e;
        try {
            jSONObject0 = new JSONObject().put("sms", z).put("tel", z1).put("calendar", z2).put("storePicture", z3).put("inlineVideo", z4);
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Error occurred while obtaining the MRAID capabilities.", jSONException0);
            jSONObject0 = null;
        }
        zzcli1.zze("onDeviceFeaturesReceived", jSONObject0);
        int[] arr_v1 = new int[2];
        zzcli1.getLocationOnScreen(arr_v1);
        this.zzb(zzaw.zzb().zzb(this.d, arr_v1[0]), zzaw.zzb().zzb(this.d, arr_v1[1]));
        if(zzcfi.zzm(2)) {
            zzcfi.zzi("Dispatching Ready Event.");
        }
        this.zzh(zzcli1.zzp().zza);
    }

    public final void zzb(int v, int v1) {
        Context context0 = this.d;
        int v2 = 0;
        int v3 = context0 instanceof Activity ? zzs.zzN(((Activity)context0))[0] : 0;
        zzcli zzcli0 = this.c;
        if(zzcli0.zzQ() == null || !zzcli0.zzQ().zzi()) {
            int v4 = zzcli0.getWidth();
            int v5 = zzcli0.getHeight();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzP)).booleanValue()) {
                if(v4 == 0) {
                    v4 = zzcli0.zzQ() == null ? 0 : zzcli0.zzQ().zzb;
                }
                if(v5 != 0) {
                    v2 = v5;
                }
                else if(zzcli0.zzQ() != null) {
                    v2 = zzcli0.zzQ().zza;
                }
            }
            else {
                v2 = v5;
            }
            this.n = zzaw.zzb().zzb(context0, v4);
            this.o = zzaw.zzb().zzb(context0, v2);
        }
        this.zzf(v, v1 - v3, this.n, this.o);
        zzcli0.zzP().zzA(v, v1);
    }
}

