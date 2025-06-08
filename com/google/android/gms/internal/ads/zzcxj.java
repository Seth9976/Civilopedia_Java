package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

public final class zzcxj extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {
    public final Context i;
    public View j;

    public zzcxj(Context context0) {
        super(context0);
        this.i = context0;
    }

    public final void a(JSONObject jSONObject0, RelativeLayout relativeLayout0, int v) {
        TextView textView0 = new TextView(this.i);
        textView0.setTextColor(-1);
        textView0.setBackgroundColor(0xFF000000);
        textView0.setGravity(17);
        textView0.setText(jSONObject0.optString("text", ""));
        textView0.setTextSize(((float)jSONObject0.optDouble("text_size", 11.0)));
        int v1 = (int)jSONObject0.optDouble("padding", 0.0);
        int v2 = zzcfb.zzw(this.i, v1);
        textView0.setPadding(0, v2, 0, v2);
        int v3 = (int)jSONObject0.optDouble("height", 15.0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-1, zzcfb.zzw(this.i, v3));
        relativeLayout$LayoutParams0.addRule(v);
        relativeLayout0.addView(textView0, relativeLayout$LayoutParams0);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int[] arr_v = new int[2];
        this.getLocationInWindow(arr_v);
        this.j.setY(((float)(-arr_v[1])));
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        int[] arr_v = new int[2];
        this.getLocationInWindow(arr_v);
        this.j.setY(((float)(-arr_v[1])));
    }

    public static zzcxj zza(Context context0, View view0, zzfbl zzfbl0) {
        zzcxj zzcxj0 = new zzcxj(context0);
        Context context1 = zzcxj0.i;
        if(!zzfbl0.zzv.isEmpty()) {
            Resources resources0 = context1.getResources();
            if(resources0 != null) {
                DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                if(displayMetrics0 != null) {
                    zzfbm zzfbm0 = (zzfbm)zzfbl0.zzv.get(0);
                    zzcxj0.setLayoutParams(new FrameLayout.LayoutParams(((int)(((float)zzfbm0.zza) * displayMetrics0.density)), ((int)(((float)zzfbm0.zzb) * displayMetrics0.density))));
                }
            }
        }
        zzcxj0.j = view0;
        zzcxj0.addView(view0);
        zzcgi.zzb(zzcxj0, zzcxj0);
        zzcgi.zza(zzcxj0, zzcxj0);
        JSONObject jSONObject0 = zzfbl0.zzaj;
        RelativeLayout relativeLayout0 = new RelativeLayout(context1);
        JSONObject jSONObject1 = jSONObject0.optJSONObject("header");
        if(jSONObject1 != null) {
            zzcxj0.a(jSONObject1, relativeLayout0, 10);
        }
        JSONObject jSONObject2 = jSONObject0.optJSONObject("footer");
        if(jSONObject2 != null) {
            zzcxj0.a(jSONObject2, relativeLayout0, 12);
        }
        zzcxj0.addView(relativeLayout0);
        return zzcxj0;
    }
}

