package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager.BadTokenException;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzdzb;
import i3.e;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzas {
    public final Context a;
    public final zzdzb b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public final int h;
    public PointF i;
    public PointF j;
    public final Handler k;
    public final zzar l;

    public zzas(Context context0) {
        this.g = 0;
        this.l = new zzar(this);
        this.a = context0;
        this.h = ViewConfiguration.get(context0).getScaledTouchSlop();
        zzt.zzt().zzb();
        this.k = zzt.zzt().zza();
        this.b = zzt.zzs().zza();
    }

    public zzas(Context context0, String s) {
        this(context0);
        this.c = s;
    }

    public final void a(Context context0) {
        int v3;
        ArrayList arrayList0 = new ArrayList();
        int v = zzas.c(arrayList0, "None", true);
        int v1 = zzas.c(arrayList0, "Shake", true);
        int v2 = zzas.c(arrayList0, "Flick", true);
        switch(this.b.zza().ordinal()) {
            case 1: {
                v3 = v1;
                break;
            }
            case 2: {
                v3 = v2;
                break;
            }
            default: {
                v3 = v;
            }
        }
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(context0, zzt.zzq().zza());
        AtomicInteger atomicInteger0 = new AtomicInteger(v3);
        alertDialog$Builder0.setTitle("Setup gesture");
        alertDialog$Builder0.setSingleChoiceItems(((CharSequence[])arrayList0.toArray(new String[0])), v3, new zzaj(atomicInteger0));
        alertDialog$Builder0.setNegativeButton("Dismiss", (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> {
            try {
                String s = "Troubleshooting (enabled)";
                Context context0 = this.a;
                if(!(context0 instanceof Activity)) {
                    zzcfi.zzi("Can not create dialog without Activity Context");
                    return;
                }
                if(!zzt.zzs().zzm()) {
                    s = "Troubleshooting";
                }
                ArrayList arrayList0 = new ArrayList();
                int v = zzas.c(arrayList0, "Ad information", true);
                int v1 = zzas.c(arrayList0, "Creative preview", true);
                int v2 = zzas.c(arrayList0, s, true);
                boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue();
                int v3 = zzas.c(arrayList0, "Open ad inspector", z);
                int v4 = zzas.c(arrayList0, "Ad inspector settings", z);
                AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(context0, zzt.zzq().zza());
                alertDialog$Builder0.setTitle("Select a debug mode").setItems(((CharSequence[])arrayList0.toArray(new String[0])), new zzap(this, v, v1, v2, v3, v4));
                alertDialog$Builder0.create().show();
                return;
            }
            catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
            }
            zze.zzb("", windowManager$BadTokenException0);
        });
        alertDialog$Builder0.setPositiveButton("Save", new zzal(this, atomicInteger0, v3, v1, v2));
        alertDialog$Builder0.setOnCancelListener((/* 缺少LAMBDA参数 */) -> {
            try {
                String s = "Troubleshooting (enabled)";
                Context context0 = this.a;
                if(!(context0 instanceof Activity)) {
                    zzcfi.zzi("Can not create dialog without Activity Context");
                    return;
                }
                if(!zzt.zzs().zzm()) {
                    s = "Troubleshooting";
                }
                ArrayList arrayList0 = new ArrayList();
                int v = zzas.c(arrayList0, "Ad information", true);
                int v1 = zzas.c(arrayList0, "Creative preview", true);
                int v2 = zzas.c(arrayList0, s, true);
                boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue();
                int v3 = zzas.c(arrayList0, "Open ad inspector", z);
                int v4 = zzas.c(arrayList0, "Ad inspector settings", z);
                AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(context0, zzt.zzq().zza());
                alertDialog$Builder0.setTitle("Select a debug mode").setItems(((CharSequence[])arrayList0.toArray(new String[0])), new zzap(this, v, v1, v2, v3, v4));
                alertDialog$Builder0.create().show();
                return;
            }
            catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
            }
            zze.zzb("", windowManager$BadTokenException0);
        });
        alertDialog$Builder0.create().show();
    }

    public final boolean b(float f, float f1, float f2, float f3) {
        return Math.abs(this.i.x - f) < ((float)this.h) && Math.abs(this.i.y - f1) < ((float)this.h) && Math.abs(this.j.x - f2) < ((float)this.h) && Math.abs(this.j.y - f3) < ((float)this.h);
    }

    public static final int c(ArrayList arrayList0, String s, boolean z) {
        if(!z) {
            return -1;
        }
        arrayList0.add(s);
        return arrayList0.size() - 1;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder(100);
        stringBuilder0.append("{Dialog: ");
        stringBuilder0.append(this.c);
        stringBuilder0.append(",DebugSignal: ");
        stringBuilder0.append(this.f);
        stringBuilder0.append(",AFMA Version: ");
        stringBuilder0.append(this.e);
        stringBuilder0.append(",Ad Unit ID: ");
        return e.h(stringBuilder0, this.d, "}");
    }

    public final void zzm(MotionEvent motionEvent0) {
        int v = motionEvent0.getActionMasked();
        int v1 = motionEvent0.getHistorySize();
        int v2 = motionEvent0.getPointerCount();
        if(v == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent0.getX(0), motionEvent0.getY(0));
            return;
        }
        int v3 = this.g;
        if(v3 == -1) {
            return;
        }
        zzar zzar0 = this.l;
        Handler handler0 = this.k;
        if(v3 == 0) {
            if(v == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent0.getX(1), motionEvent0.getY(1));
                handler0.postDelayed(zzar0, ((long)(((Long)zzay.zzc().zzb(zzbhz.zzdJ)))));
            }
        }
        else if(v3 == 5) {
            if(v2 != 2) {
                this.g = -1;
                handler0.removeCallbacks(zzar0);
            }
            else if(v == 2) {
                int v5 = 0;
                for(int v4 = 0; v4 < v1; ++v4) {
                    v5 |= !this.b(motionEvent0.getHistoricalX(0, v4), motionEvent0.getHistoricalY(0, v4), motionEvent0.getHistoricalX(1, v4), motionEvent0.getHistoricalY(1, v4));
                }
                if(!this.b(motionEvent0.getX(), motionEvent0.getY(), motionEvent0.getX(1), motionEvent0.getY(1)) || v5 != 0) {
                    this.g = -1;
                    handler0.removeCallbacks(zzar0);
                }
            }
        }
    }

    public final void zzn(String s) {
        this.d = s;
    }

    public final void zzo(String s) {
        this.e = s;
    }

    public final void zzp(String s) {
        this.c = s;
    }

    public final void zzq(String s) {
        this.f = s;
    }

    // 检测为 lambda 实现。
    public final void zzr() {
        try {
            String s = "Troubleshooting (enabled)";
            Context context0 = this.a;
            if(!(context0 instanceof Activity)) {
                zzcfi.zzi("Can not create dialog without Activity Context");
                return;
            }
            if(!zzt.zzs().zzm()) {
                s = "Troubleshooting";
            }
            ArrayList arrayList0 = new ArrayList();
            int v = zzas.c(arrayList0, "Ad information", true);
            int v1 = zzas.c(arrayList0, "Creative preview", true);
            int v2 = zzas.c(arrayList0, s, true);
            boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzhK)).booleanValue();
            int v3 = zzas.c(arrayList0, "Open ad inspector", z);
            int v4 = zzas.c(arrayList0, "Ad inspector settings", z);
            AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(context0, zzt.zzq().zza());
            alertDialog$Builder0.setTitle("Select a debug mode").setItems(((CharSequence[])arrayList0.toArray(new String[0])), new zzap(this, v, v1, v2, v3, v4));
            alertDialog$Builder0.create().show();
            return;
        }
        catch(WindowManager.BadTokenException windowManager$BadTokenException0) {
        }
        zze.zzb("", windowManager$BadTokenException0);
    }
}

