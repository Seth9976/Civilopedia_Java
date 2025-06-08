package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

public final class zzbwp extends zzbwv {
    public String c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Object k;
    public final zzcli l;
    public final Activity m;
    public zzcmx n;
    public ImageView o;
    public LinearLayout p;
    public final zzbww q;
    public PopupWindow r;
    public RelativeLayout s;
    public ViewGroup t;

    static {
        CollectionUtils.setOf(new String[]{"top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center"});
    }

    public zzbwp(zzcli zzcli0, zzbww zzbww0) {
        super(zzcli0, "resize");
        this.c = "top-right";
        this.d = true;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = -1;
        this.k = new Object();
        this.l = zzcli0;
        this.m = zzcli0.zzk();
        this.q = zzbww0;
    }

    // 检测为 lambda 实现。
    public final void zza(boolean z) {
        synchronized(this.k) {
            PopupWindow popupWindow0 = this.r;
            if(popupWindow0 != null) {
                popupWindow0.dismiss();
                this.s.removeView(((View)this.l));
                ViewGroup viewGroup0 = this.t;
                if(viewGroup0 != null) {
                    viewGroup0.removeView(this.o);
                    this.t.addView(((View)this.l));
                    this.l.zzai(this.n);
                }
                if(z) {
                    this.zzk("default");
                    zzbww zzbww0 = this.q;
                    if(zzbww0 != null) {
                        zzbww0.zzb();
                    }
                }
                this.r = null;
                this.s = null;
                this.t = null;
                this.p = null;
            }
        }
    }

    public final void zzb(Map map0) {
        int v17;
        int v11;
        int v6;
        int v5;
        int v7;
        synchronized(this.k) {
            if(this.m == null) {
                this.zzg("Not an activity context. Cannot resize.");
                return;
            }
            if(this.l.zzQ() == null) {
                this.zzg("Webview is not yet available, size is not set.");
                return;
            }
            if(this.l.zzQ().zzi()) {
                this.zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if(!this.l.zzaC()) {
                if(!TextUtils.isEmpty(((CharSequence)map0.get("width")))) {
                    this.j = zzs.zzJ(((String)map0.get("width")));
                }
                if(!TextUtils.isEmpty(((CharSequence)map0.get("height")))) {
                    this.g = zzs.zzJ(((String)map0.get("height")));
                }
                if(!TextUtils.isEmpty(((CharSequence)map0.get("offsetX")))) {
                    this.h = zzs.zzJ(((String)map0.get("offsetX")));
                }
                if(!TextUtils.isEmpty(((CharSequence)map0.get("offsetY")))) {
                    this.i = zzs.zzJ(((String)map0.get("offsetY")));
                }
                if(!TextUtils.isEmpty(((CharSequence)map0.get("allowOffscreen")))) {
                    this.d = Boolean.parseBoolean(((String)map0.get("allowOffscreen")));
                }
                String s = (String)map0.get("customClosePosition");
                if(!TextUtils.isEmpty(s)) {
                    this.c = s;
                }
                if(this.j >= 0 && this.g >= 0) {
                    Window window0 = this.m.getWindow();
                    if(window0 != null && window0.getDecorView() != null) {
                        int[] arr_v = zzs.zzQ(this.m);
                        int[] arr_v1 = zzs.zzN(this.m);
                        int v1 = arr_v[0];
                        int v2 = arr_v[1];
                        int v3 = this.j;
                        int[] arr_v2 = null;
                        if(v3 < 50 || v3 > v1) {
                            zzcfi.zzj("Width is too small or too large.");
                        }
                        else {
                            int v4 = this.g;
                            if(v4 < 50 || v4 > v2) {
                                zzcfi.zzj("Height is too small or too large.");
                            }
                            else if(v4 == v2 && v3 == v1) {
                                zzcfi.zzj("Cannot resize to a full-screen ad.");
                            }
                            else if(this.d) {
                                String s1 = this.c;
                                switch(s1.hashCode()) {
                                    case -1364013995: {
                                        if(s1.equals("center")) {
                                            v5 = this.e + this.h + (v3 >> 1) - 25;
                                            v6 = this.f + this.i + (v4 >> 1) - 25;
                                        }
                                        else {
                                            v5 = this.e + this.h + v3 - 50;
                                            v6 = this.f + this.i;
                                        }
                                        break;
                                    }
                                    case -1012429441: {
                                        v5 = s1.equals("top-left") ? this.e + this.h : this.e + this.h + v3 - 50;
                                        v7 = this.f;
                                        v6 = v7 + this.i;
                                        break;
                                    }
                                    case 0xD8EFCA69: {
                                        if(s1.equals("bottom-left")) {
                                            v5 = this.e + this.h;
                                            v6 = this.f + this.i + v4 - 50;
                                        }
                                        else {
                                            v5 = this.e + this.h + v3 - 50;
                                            v6 = this.f + this.i;
                                        }
                                        break;
                                    }
                                    case 0x455FE3FA: {
                                        if(s1.equals("bottom-right")) {
                                            v5 = this.e + this.h + v3 - 50;
                                            v6 = this.f + this.i + v4 - 50;
                                        }
                                        else {
                                            v5 = this.e + this.h + v3 - 50;
                                            v6 = this.f + this.i;
                                        }
                                        break;
                                    }
                                    case 0x4CCEE637: {
                                        if(s1.equals("bottom-center")) {
                                            v5 = this.e + this.h + (v3 >> 1) - 25;
                                            v6 = this.f + this.i + v4 - 50;
                                        }
                                        else {
                                            v5 = this.e + this.h + v3 - 50;
                                            v6 = this.f + this.i;
                                        }
                                        break;
                                    }
                                    case 1755462605: {
                                        v5 = s1.equals("top-center") ? this.e + this.h + (v3 >> 1) - 25 : this.e + this.h + v3 - 50;
                                        v7 = this.f;
                                        v6 = v7 + this.i;
                                        break;
                                    }
                                    default: {
                                        v5 = this.e + this.h + v3 - 50;
                                        v6 = this.f + this.i;
                                    }
                                }
                                if(v5 >= 0 && v5 + 50 <= v1 && v6 >= arr_v1[0] && v6 + 50 <= arr_v1[1]) {
                                    arr_v2 = new int[]{this.e + this.h, this.f + this.i};
                                }
                            }
                            else {
                                int[] arr_v3 = zzs.zzQ(this.m);
                                int[] arr_v4 = zzs.zzN(this.m);
                                int v8 = arr_v3[0];
                                int v9 = this.e + this.h;
                                int v10 = this.f + this.i;
                                if(v9 < 0) {
                                    v11 = 0;
                                }
                                else {
                                    v11 = v9 + this.j <= v8 ? v9 : v8 - this.j;
                                }
                                int v12 = arr_v4[0];
                                if(v10 < v12) {
                                    v10 = v12;
                                }
                                else {
                                    int v13 = this.g;
                                    int v14 = arr_v4[1];
                                    if(v10 + v13 > v14) {
                                        v10 = v14 - v13;
                                    }
                                }
                                arr_v2 = new int[]{v11, v10};
                            }
                        }
                        if(arr_v2 == null) {
                            this.zzg("Resize location out of screen or close button is not visible.");
                            return;
                        }
                        int v15 = zzcfb.zzw(this.m, this.j);
                        int v16 = zzcfb.zzw(this.m, this.g);
                        ViewParent viewParent0 = ((View)this.l).getParent();
                        if(viewParent0 != null && viewParent0 instanceof ViewGroup) {
                            ((ViewGroup)viewParent0).removeView(((View)this.l));
                            PopupWindow popupWindow0 = this.r;
                            if(popupWindow0 == null) {
                                this.t = (ViewGroup)viewParent0;
                                ((View)this.l).setDrawingCacheEnabled(true);
                                Bitmap bitmap0 = Bitmap.createBitmap(((View)this.l).getDrawingCache());
                                ((View)this.l).setDrawingCacheEnabled(false);
                                ImageView imageView0 = new ImageView(this.m);
                                this.o = imageView0;
                                imageView0.setImageBitmap(bitmap0);
                                this.n = this.l.zzQ();
                                this.t.addView(this.o);
                            }
                            else {
                                popupWindow0.dismiss();
                            }
                            RelativeLayout relativeLayout0 = new RelativeLayout(this.m);
                            this.s = relativeLayout0;
                            relativeLayout0.setBackgroundColor(0);
                            this.s.setLayoutParams(new ViewGroup.LayoutParams(v15, v16));
                            PopupWindow popupWindow1 = new PopupWindow(this.s, v15, v16, false);
                            this.r = popupWindow1;
                            popupWindow1.setOutsideTouchable(false);
                            this.r.setTouchable(true);
                            this.r.setClippingEnabled(!this.d);
                            this.s.addView(((View)this.l), -1, -1);
                            this.p = new LinearLayout(this.m);
                            RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(zzcfb.zzw(this.m, 50), zzcfb.zzw(this.m, 50));
                            switch(this.c) {
                                case "bottom-center": {
                                    v17 = 4;
                                    goto label_168;
                                }
                                case "bottom-left": {
                                    v17 = 3;
                                    goto label_168;
                                }
                                case "bottom-right": {
                                    relativeLayout$LayoutParams0.addRule(12);
                                    relativeLayout$LayoutParams0.addRule(11);
                                    break;
                                }
                                case "center": {
                                    v17 = 2;
                                    goto label_168;
                                }
                                case "top-center": {
                                    v17 = 1;
                                    goto label_168;
                                }
                                case "top-left": {
                                    v17 = 0;
                                label_168:
                                    if(v17 == 0) {
                                        relativeLayout$LayoutParams0.addRule(10);
                                        relativeLayout$LayoutParams0.addRule(9);
                                    }
                                    else {
                                        switch(v17) {
                                            case 1: {
                                                relativeLayout$LayoutParams0.addRule(10);
                                                relativeLayout$LayoutParams0.addRule(14);
                                                break;
                                            }
                                            case 2: {
                                                relativeLayout$LayoutParams0.addRule(13);
                                                break;
                                            }
                                            case 3: {
                                                relativeLayout$LayoutParams0.addRule(12);
                                                relativeLayout$LayoutParams0.addRule(9);
                                                break;
                                            }
                                            case 4: {
                                                relativeLayout$LayoutParams0.addRule(12);
                                                relativeLayout$LayoutParams0.addRule(14);
                                                break;
                                            }
                                            default: {
                                                relativeLayout$LayoutParams0.addRule(10);
                                                relativeLayout$LayoutParams0.addRule(11);
                                            }
                                        }
                                    }
                                    break;
                                }
                                default: {
                                    v17 = -1;
                                    goto label_168;
                                }
                            }
                            this.p.setOnClickListener((/* 缺少LAMBDA参数 */) -> synchronized(this.k) {
                                PopupWindow popupWindow0 = this.r;
                                if(popupWindow0 != null) {
                                    popupWindow0.dismiss();
                                    this.s.removeView(((View)this.l));
                                    ViewGroup viewGroup0 = this.t;
                                    if(viewGroup0 != null) {
                                        viewGroup0.removeView(this.o);
                                        this.t.addView(((View)this.l));
                                        this.l.zzai(this.n);
                                    }
                                    if(true) {
                                        this.zzk("default");
                                        zzbww zzbww0 = this.q;
                                        if(zzbww0 != null) {
                                            zzbww0.zzb();
                                        }
                                    }
                                    this.r = null;
                                    this.s = null;
                                    this.t = null;
                                    this.p = null;
                                }
                            });
                            this.p.setContentDescription("Close button");
                            this.s.addView(this.p, relativeLayout$LayoutParams0);
                            try {
                                this.r.showAtLocation(window0.getDecorView(), 0, zzcfb.zzw(this.m, arr_v2[0]), zzcfb.zzw(this.m, arr_v2[1]));
                            }
                            catch(RuntimeException runtimeException0) {
                                this.zzg("Cannot show popup window: " + runtimeException0.getMessage());
                                this.s.removeView(((View)this.l));
                                ViewGroup viewGroup0 = this.t;
                                if(viewGroup0 != null) {
                                    viewGroup0.removeView(this.o);
                                    this.t.addView(((View)this.l));
                                    this.l.zzai(this.n);
                                }
                                return;
                            }
                            int v18 = arr_v2[0];
                            int v19 = arr_v2[1];
                            zzbww zzbww0 = this.q;
                            if(zzbww0 != null) {
                                zzbww0.zza(v18, v19, this.j, this.g);
                            }
                            zzcmx zzcmx0 = zzcmx.zzb(v15, v16);
                            this.l.zzai(zzcmx0);
                            this.zzj(arr_v2[0], arr_v2[1] - zzs.zzN(this.m)[0], this.j, this.g);
                            this.zzk("resized");
                            return;
                        }
                        this.zzg("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    this.zzg("Activity context is not ready, cannot get window or decor view.");
                    return;
                }
                this.zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            this.zzg("Cannot resize an expanded banner.");
        }
    }

    public final void zzc(int v, int v1, boolean z) {
        synchronized(this.k) {
            this.e = v;
            this.f = v1;
        }
    }

    public final void zzd(int v, int v1) {
        this.e = v;
        this.f = v1;
    }

    public final boolean zze() {
        synchronized(this.k) {
        }
        return this.r != null;
    }
}

