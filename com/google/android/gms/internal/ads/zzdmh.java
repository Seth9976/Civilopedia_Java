package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcq;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.Map.Entry;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzdmh implements zzdnp {
    public zzcq A;
    public final Context a;
    public final zzdns b;
    public final JSONObject c;
    public final zzdse d;
    public final zzdnh e;
    public final zzaoc f;
    public final zzdcl g;
    public final zzdbr h;
    public final zzdje i;
    public final zzfbl j;
    public final zzcfo k;
    public final zzfcd l;
    public final zzcud m;
    public final zzdok n;
    public final Clock o;
    public final zzdjb p;
    public final zzfii q;
    public final zzfhs r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public Point w;
    public Point x;
    public long y;
    public long z;

    public zzdmh(Context context0, zzdns zzdns0, JSONObject jSONObject0, zzdse zzdse0, zzdnh zzdnh0, zzaoc zzaoc0, zzdcl zzdcl0, zzdbr zzdbr0, zzdje zzdje0, zzfbl zzfbl0, zzcfo zzcfo0, zzfcd zzfcd0, zzcud zzcud0, zzdok zzdok0, Clock clock0, zzdjb zzdjb0, zzfii zzfii0, zzfhs zzfhs0) {
        this.s = false;
        this.u = false;
        this.v = false;
        this.w = new Point();
        this.x = new Point();
        this.y = 0L;
        this.z = 0L;
        this.a = context0;
        this.b = zzdns0;
        this.c = jSONObject0;
        this.d = zzdse0;
        this.e = zzdnh0;
        this.f = zzaoc0;
        this.g = zzdcl0;
        this.h = zzdbr0;
        this.i = zzdje0;
        this.j = zzfbl0;
        this.k = zzcfo0;
        this.l = zzfcd0;
        this.m = zzcud0;
        this.n = zzdok0;
        this.o = clock0;
        this.p = zzdjb0;
        this.q = zzfii0;
        this.r = zzfhs0;
    }

    public final String a(View view0, Map map0) {
        if(map0 != null && view0 != null) {
            for(Object object0: map0.entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object0;
                if(view0.equals(((View)((WeakReference)map$Entry0.getValue()).get()))) {
                    return (String)map$Entry0.getKey();
                }
                if(false) {
                    break;
                }
            }
        }
        switch(this.e.zzc()) {
            case 1: {
                return "1099";
            }
            case 2: {
                return "2099";
            }
            case 6: {
                return "3099";
            }
            default: {
                return null;
            }
        }
    }

    public final boolean b(String s) {
        JSONObject jSONObject0 = this.c.optJSONObject("allow_pub_event_reporting");
        return jSONObject0 != null && jSONObject0.optBoolean(s, false);
    }

    public final boolean c(JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2, JSONObject jSONObject3, String s, JSONObject jSONObject4, boolean z) {
        DisplayMetrics displayMetrics0;
        JSONObject jSONObject6;
        JSONObject jSONObject5;
        Context context0 = this.a;
        Preconditions.checkMainThread("recordImpression must be called on the main UI thread.");
        try {
            jSONObject5 = new JSONObject();
            jSONObject5.put("ad", this.c);
            jSONObject5.put("asset_view_signal", jSONObject1);
            jSONObject5.put("ad_view_signal", jSONObject0);
            jSONObject5.put("scroll_view_signal", jSONObject2);
            jSONObject5.put("lock_screen_signal", jSONObject3);
            jSONObject5.put("provided_signals", jSONObject4);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzcF)).booleanValue()) {
                jSONObject5.put("view_signals", s);
            }
            jSONObject5.put("policy_validator_enabled", z);
            jSONObject6 = new JSONObject();
            displayMetrics0 = zzs.zzr(((WindowManager)context0.getSystemService("window")));
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Unable to create impression JSON.", jSONException0);
            return false;
        }
        try {
            jSONObject6.put("width", zzaw.zzb().zzb(context0, displayMetrics0.widthPixels));
            jSONObject6.put("height", zzaw.zzb().zzb(context0, displayMetrics0.heightPixels));
        }
        catch(JSONException unused_ex) {
            jSONObject6 = null;
        }
        try {
            jSONObject5.put("screen", jSONObject6);
            boolean z1 = ((Boolean)zzay.zzc().zzb(zzbhz.zzhd)).booleanValue();
            zzdse zzdse0 = this.d;
            if(z1) {
                zzdse0.zzi("/clickRecorded", new v4(this, 1));
            }
            else {
                zzdse0.zzi("/logScionEvent", new v4(this, 0));
            }
            zzdse0.zzi("/nativeImpression", new v4(this, 2));
            zzcfy.zza(zzdse0.zzd("google.afma.nativeAds.handleImpression", jSONObject5), "Error during performing handleImpression");
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Unable to create impression JSON.", jSONException0);
            return false;
        }
        if(!this.s) {
            this.s = zzt.zzs().zzn(context0, this.k.zza, this.j.zzD.toString(), this.l.zzf);
        }
        return true;
    }

    public final void d(View view0, JSONObject jSONObject0, JSONObject jSONObject1, JSONObject jSONObject2, JSONObject jSONObject3, String s, JSONObject jSONObject4, JSONObject jSONObject5, boolean z, boolean z1) {
        String s2;
        JSONObject jSONObject8;
        JSONObject jSONObject7;
        Clock clock0 = this.o;
        zzdns zzdns0 = this.b;
        JSONObject jSONObject6 = this.c;
        zzdnh zzdnh0 = this.e;
        Preconditions.checkMainThread("performClick must be called on the main UI thread.");
        try {
            jSONObject7 = new JSONObject();
            jSONObject7.put("ad", jSONObject6);
            jSONObject7.put("asset_view_signal", jSONObject1);
            jSONObject7.put("ad_view_signal", jSONObject0);
            jSONObject7.put("click_signal", jSONObject4);
            jSONObject7.put("scroll_view_signal", jSONObject2);
            jSONObject7.put("lock_screen_signal", jSONObject3);
            boolean z2 = false;
            jSONObject7.put("has_custom_click_handler", zzdns0.zzc(zzdnh0.zzy()) != null);
            jSONObject7.put("provided_signals", jSONObject5);
            jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", s);
            jSONObject8.put("template", zzdnh0.zzc());
            jSONObject8.put("view_aware_api_used", z);
            zzbkp zzbkp0 = this.l.zzi;
            jSONObject8.put("custom_mute_requested", zzbkp0 != null && zzbkp0.zzg);
            jSONObject8.put("custom_mute_enabled", !zzdnh0.zzF().isEmpty() && zzdnh0.zzk() != null);
            if(this.n.zza() != null && jSONObject6.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", clock0.currentTimeMillis());
            if(this.v && jSONObject6.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if(z1) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            if(zzdns0.zzc(zzdnh0.zzy()) != null) {
                z2 = true;
            }
            jSONObject8.put("has_custom_click_handler", z2);
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Unable to create click JSON.", jSONException0);
            return;
        }
        try {
            JSONObject jSONObject9 = jSONObject6.optJSONObject("tracking_urls_and_actions");
            if(jSONObject9 == null) {
                jSONObject9 = new JSONObject();
            }
            String s1 = jSONObject9.optString("click_string");
            s2 = this.f.zzc().zze(this.a, s1, view0);
            goto label_41;
        }
        catch(Exception exception0) {
        }
        try {
            zzcfi.zzh("Exception obtaining click signals", exception0);
            s2 = null;
        label_41:
            jSONObject8.put("click_signals", s2);
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzdF)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhh)).booleanValue()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzhi)).booleanValue()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject10 = new JSONObject();
            long v = clock0.currentTimeMillis();
            jSONObject10.put("time_from_last_touch_down", v - this.y);
            jSONObject10.put("time_from_last_touch", v - this.z);
            jSONObject7.put("touch_signal", jSONObject10);
            zzcfy.zza(this.d.zzd("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
            return;
        }
        catch(JSONException jSONException0) {
        }
        zzcfi.zzh("Unable to create click JSON.", jSONException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final boolean zzA(Bundle bundle0) {
        if(!this.b("impression_reporting")) {
            zzcfi.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        return this.c(null, null, null, null, null, zzaw.zzb().zzj(bundle0, null), false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final JSONObject zzd(View view0, Map map0, Map map1) {
        JSONObject jSONObject0 = zzbx.zzd(this.a, map0, map1, view0);
        JSONObject jSONObject1 = zzbx.zzg(this.a, view0);
        JSONObject jSONObject2 = zzbx.zzf(view0);
        JSONObject jSONObject3 = zzbx.zze(this.a, view0);
        try {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("asset_view_signal", jSONObject0);
            jSONObject4.put("ad_view_signal", jSONObject1);
            jSONObject4.put("scroll_view_signal", jSONObject2);
            jSONObject4.put("lock_screen_signal", jSONObject3);
            return jSONObject4;
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Unable to create native ad view signals JSON.", jSONException0);
            return null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final JSONObject zze(View view0, Map map0, Map map1) {
        JSONObject jSONObject0 = this.zzd(view0, map0, map1);
        JSONObject jSONObject1 = new JSONObject();
        try {
            if(this.v && this.c.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject1.put("custom_click_gesture_eligible", true);
            }
            if(jSONObject0 != null) {
                jSONObject1.put("nas", jSONObject0);
                return jSONObject1;
            }
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("Unable to create native click meta data JSON.", jSONException0);
        }
        return jSONObject1;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzf() {
        try {
            zzcq zzcq0 = this.A;
            if(zzcq0 != null) {
                zzcq0.zze();
            }
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzl("#007 Could not call remote method.", remoteException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzg() {
        if(!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            return;
        }
        this.n.zzb();
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzh() {
        this.d.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzi(zzcu zzcu0) {
        if(this.u) {
            return;
        }
        try {
            zzfhs zzfhs0 = this.r;
            zzfii zzfii0 = this.q;
            if(zzcu0 == null) {
                zzdnh zzdnh0 = this.e;
                if(zzdnh0.zzk() != null) {
                    this.u = true;
                    zzfii0.zzc(zzdnh0.zzk().zzf(), zzfhs0);
                    this.zzf();
                    return;
                }
            }
            this.u = true;
            zzfii0.zzc(zzcu0.zzf(), zzfhs0);
            this.zzf();
            return;
        }
        catch(RemoteException remoteException0) {
        }
        zzcfi.zzl("#007 Could not call remote method.", remoteException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzj(View view0, View view1, Map map0, Map map1, boolean z) {
        JSONObject jSONObject0 = zzbx.zzd(this.a, map0, map1, view1);
        JSONObject jSONObject1 = zzbx.zzg(this.a, view1);
        JSONObject jSONObject2 = zzbx.zzf(view1);
        JSONObject jSONObject3 = zzbx.zze(this.a, view1);
        String s = this.a(view0, map0);
        JSONObject jSONObject4 = zzbx.zzc(s, this.a, this.x, this.w);
        this.d((((Boolean)zzay.zzc().zzb(zzbhz.zzcG)).booleanValue() ? view1 : view0), jSONObject1, jSONObject0, jSONObject2, jSONObject3, s, jSONObject4, null, z, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzk(String s) {
        this.d(null, null, null, null, null, s, null, null, false, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzl(Bundle bundle0) {
        if(bundle0 == null) {
            zzcfi.zze("Click data is null. No click is reported.");
            return;
        }
        if(!this.b("click_reporting")) {
            zzcfi.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle1 = bundle0.getBundle("click_signal");
        this.d(null, null, null, null, null, (bundle1 == null ? null : bundle1.getString("asset_id")), null, zzaw.zzb().zzj(bundle0, null), false, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzn(View view0, Map map0, Map map1, boolean z) {
        if(!this.v) {
            zzcfi.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if(!this.c.optBoolean("allow_custom_click_gesture", false)) {
            zzcfi.zze("Custom click reporting failed. Ad unit id not in the allow list.");
            return;
        }
        JSONObject jSONObject0 = zzbx.zzd(this.a, map0, map1, view0);
        JSONObject jSONObject1 = zzbx.zzg(this.a, view0);
        JSONObject jSONObject2 = zzbx.zzf(view0);
        JSONObject jSONObject3 = zzbx.zze(this.a, view0);
        String s = this.a(null, map0);
        this.d(view0, jSONObject1, jSONObject0, jSONObject2, jSONObject3, s, zzbx.zzc(s, this.a, this.x, this.w), null, z, true);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzo() {
        Preconditions.checkMainThread("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject0 = new JSONObject();
            jSONObject0.put("ad", this.c);
            zzcfy.zza(this.d.zzd("google.afma.nativeAds.handleDownloadedImpression", jSONObject0), "Error during performing handleDownloadedImpression");
        }
        catch(JSONException jSONException0) {
            zzcfi.zzh("", jSONException0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzp(View view0, Map map0, Map map1) {
        String s;
        Context context0 = this.a;
        JSONObject jSONObject0 = zzbx.zzd(context0, map0, map1, view0);
        JSONObject jSONObject1 = zzbx.zzg(context0, view0);
        JSONObject jSONObject2 = zzbx.zzf(view0);
        JSONObject jSONObject3 = zzbx.zze(context0, view0);
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzcF)).booleanValue()) {
            try {
                s = this.f.zzc().zzh(context0, view0, null);
            }
            catch(Exception unused_ex) {
                zzcfi.zzg("Exception getting data.");
                s = null;
            }
        }
        else {
            s = null;
        }
        this.c(jSONObject1, jSONObject0, jSONObject2, jSONObject3, s, null, zzbx.zzh(context0, this.j));
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzq() {
        this.c(null, null, null, null, null, null, false);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzr(View view0, MotionEvent motionEvent0, View view1) {
        this.w = zzbx.zza(motionEvent0, view1);
        long v = this.o.currentTimeMillis();
        this.z = v;
        if(motionEvent0.getAction() == 0) {
            this.y = v;
            this.x = this.w;
        }
        MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
        motionEvent1.setLocation(((float)this.w.x), ((float)this.w.y));
        this.f.zzd(motionEvent1);
        motionEvent1.recycle();
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzs(Bundle bundle0) {
        if(bundle0 == null) {
            zzcfi.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if(!this.b("touch_reporting")) {
            zzcfi.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        float f = bundle0.getFloat("x");
        float f1 = bundle0.getFloat("y");
        int v = bundle0.getInt("duration_ms");
        this.f.zzc().zzl(((int)f), ((int)f1), v);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzt(View view0) {
        if(!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcfi.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        if(view0 == null) {
            return;
        }
        view0.setOnClickListener(this.n);
        view0.setClickable(true);
        this.n.o = new WeakReference(view0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzu() {
        this.v = true;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzv(zzcq zzcq0) {
        this.A = zzcq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzw(zzbmv zzbmv0) {
        if(!this.c.optBoolean("custom_one_point_five_click_enabled", false)) {
            zzcfi.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        this.n.zzc(zzbmv0);
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzx(View view0, Map map0, Map map1, View.OnTouchListener view$OnTouchListener0, View.OnClickListener view$OnClickListener0) {
        this.w = new Point();
        this.x = new Point();
        if(!this.t) {
            this.p.zza(view0);
            this.t = true;
        }
        view0.setOnTouchListener(view$OnTouchListener0);
        view0.setClickable(true);
        view0.setOnClickListener(view$OnClickListener0);
        this.m.zzi(this);
        boolean z = zzbx.zzi(this.k.zzc);
        if(map0 != null) {
            for(Object object0: map0.entrySet()) {
                View view1 = (View)((WeakReference)((Map.Entry)object0).getValue()).get();
                if(view1 != null) {
                    if(z) {
                        view1.setOnTouchListener(view$OnTouchListener0);
                    }
                    view1.setClickable(true);
                    view1.setOnClickListener(view$OnClickListener0);
                }
            }
        }
        if(map1 != null) {
            for(Object object1: map1.entrySet()) {
                View view2 = (View)((WeakReference)((Map.Entry)object1).getValue()).get();
                if(view2 != null) {
                    if(z) {
                        view2.setOnTouchListener(view$OnTouchListener0);
                    }
                    view2.setClickable(false);
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final void zzy(View view0, Map map0) {
        this.w = new Point();
        this.x = new Point();
        if(view0 != null) {
            this.p.zzb(view0);
        }
        this.t = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzdnp
    public final boolean zzz() {
        return this.c.optBoolean("allow_custom_click_gesture", false);
    }
}

