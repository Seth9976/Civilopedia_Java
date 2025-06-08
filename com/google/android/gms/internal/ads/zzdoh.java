package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import java.util.concurrent.Executor;

public final class zzdoh {
    public final zzg a;
    public final zzfcd b;
    public final zzdnm c;
    public final zzdnh d;
    public final zzdos e;
    public final zzdpa f;
    public final Executor g;
    public final Executor h;
    public final zzbkp i;
    public final zzdne j;

    public zzdoh(zzg zzg0, zzfcd zzfcd0, zzdnm zzdnm0, zzdnh zzdnh0, zzdos zzdos0, zzdpa zzdpa0, Executor executor0, Executor executor1, zzdne zzdne0) {
        this.a = zzg0;
        this.b = zzfcd0;
        this.i = zzfcd0.zzi;
        this.c = zzdnm0;
        this.d = zzdnh0;
        this.e = zzdos0;
        this.f = zzdpa0;
        this.g = executor0;
        this.h = executor1;
        this.j = zzdne0;
    }

    public static void a(RelativeLayout.LayoutParams relativeLayout$LayoutParams0, int v) {
        switch(v) {
            case 0: {
                relativeLayout$LayoutParams0.addRule(10);
                relativeLayout$LayoutParams0.addRule(9);
                return;
            }
            case 2: {
                relativeLayout$LayoutParams0.addRule(12);
                relativeLayout$LayoutParams0.addRule(11);
                return;
            }
            case 3: {
                relativeLayout$LayoutParams0.addRule(12);
                relativeLayout$LayoutParams0.addRule(9);
                return;
            }
            default: {
                relativeLayout$LayoutParams0.addRule(10);
                relativeLayout$LayoutParams0.addRule(11);
            }
        }
    }

    public final boolean b(ViewGroup viewGroup0, boolean z) {
        View view0 = z ? this.d.zzf() : this.d.zzg();
        if(view0 == null) {
            return false;
        }
        viewGroup0.removeAllViews();
        if(view0.getParent() instanceof ViewGroup) {
            ((ViewGroup)view0.getParent()).removeView(view0);
        }
        viewGroup0.addView(view0, (((Boolean)zzay.zzc().zzb(zzbhz.zzcT)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17)));
        return true;
    }

    public final void zzc(zzdpc zzdpc0) {
        if(zzdpc0 != null) {
            zzdos zzdos0 = this.e;
            if(zzdos0 == null || zzdpc0.zzh() == null || !this.c.zzg()) {
                return;
            }
            try {
                zzdpc0.zzh().addView(zzdos0.zza());
            }
            catch(zzclt zzclt0) {
                zze.zzb("web view can not be obtained", zzclt0);
            }
        }
    }

    public final void zzd(zzdpc zzdpc0) {
        if(zzdpc0 == null) {
            return;
        }
        Context context0 = zzdpc0.zzf().getContext();
        if(!zzbx.zzh(context0, this.c.a)) {
            return;
        }
        if(!(context0 instanceof Activity)) {
            zzcfi.zze("Activity context is needed for policy validator.");
            return;
        }
        zzdpa zzdpa0 = this.f;
        if(zzdpa0 != null && zzdpc0.zzh() != null) {
            try {
                WindowManager windowManager0 = (WindowManager)context0.getSystemService("window");
                windowManager0.addView(zzdpa0.zza(zzdpc0.zzh(), windowManager0), zzbx.zzb());
            }
            catch(zzclt zzclt0) {
                zze.zzb("web view can not be obtained", zzclt0);
            }
        }
    }

    public final void zze(zzdpc zzdpc0) {
        zzdof zzdof0 = new zzdof(this, zzdpc0);
        this.g.execute(zzdof0);
    }

    public final boolean zzf(ViewGroup viewGroup0) {
        return this.b(viewGroup0, true);
    }
}

