package com.google.android.gms.internal.ads;

import E.h;
import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbbm extends Thread {
    public boolean i;
    public boolean j;
    public final Object k;
    public final zzbbd l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final String u;
    public final boolean v;
    public final boolean w;
    public final boolean x;

    public zzbbm() {
        zzbbd zzbbd0 = new zzbbd();
        super();
        this.i = false;
        this.j = false;
        this.l = zzbbd0;
        this.k = new Object();
        this.n = ((Long)zzbjh.zzd.zze()).intValue();
        this.o = ((Long)zzbjh.zza.zze()).intValue();
        this.p = ((Long)zzbjh.zze.zze()).intValue();
        this.q = ((Long)zzbjh.zzc.zze()).intValue();
        this.r = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzQ)));
        this.s = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzR)));
        this.t = (int)(((Integer)zzay.zzc().zzb(zzbhz.zzS)));
        this.m = ((Long)zzbjh.zzf.zze()).intValue();
        this.u = (String)zzay.zzc().zzb(zzbhz.zzU);
        this.v = ((Boolean)zzay.zzc().zzb(zzbhz.zzV)).booleanValue();
        this.w = ((Boolean)zzay.zzc().zzb(zzbhz.zzW)).booleanValue();
        this.x = ((Boolean)zzay.zzc().zzb(zzbhz.zzX)).booleanValue();
        this.setName("ContentFetchTask");
    }

    public final h a(View view0, zzbbc zzbbc0) {
        if(view0 == null) {
            return new h(0, 0);
        }
        boolean z = view0.getGlobalVisibleRect(new Rect());
        if(view0 instanceof TextView && !(view0 instanceof EditText)) {
            CharSequence charSequence0 = ((TextView)view0).getText();
            if(!TextUtils.isEmpty(charSequence0)) {
                zzbbc0.zzk(charSequence0.toString(), z, view0.getX(), view0.getY(), ((float)view0.getWidth()), ((float)view0.getHeight()));
                return new h(1, 0);
            }
            return new h(0, 0);
        }
        if(view0 instanceof WebView && !(view0 instanceof zzcli)) {
            zzbbc0.zzh();
            ((WebView)view0).post(new A1(this, zzbbc0, ((WebView)view0), z));
            return new h(0, 1);
        }
        if(view0 instanceof ViewGroup) {
            int v1 = 0;
            int v2 = 0;
            for(int v = 0; v < ((ViewGroup)view0).getChildCount(); ++v) {
                h h0 = this.a(((ViewGroup)view0).getChildAt(v), zzbbc0);
                v1 += h0.a;
                v2 += h0.b;
            }
            return new h(v1, v2);
        }
        return new h(0, 0);
    }

    @Override
    public final void run() {
        Activity activity0;
        View view0;
        while(true) {
            try {
                Context context0 = zzt.zzb().zzb();
                if(context0 != null) {
                    ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
                    KeyguardManager keyguardManager0 = (KeyguardManager)context0.getSystemService("keyguard");
                    if(activityManager0 != null && keyguardManager0 != null) {
                        List list0 = activityManager0.getRunningAppProcesses();
                        if(list0 != null) {
                            Iterator iterator0 = list0.iterator();
                            while(true) {
                                if(!iterator0.hasNext()) {
                                    break;
                                }
                                Object object0 = iterator0.next();
                                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                                if(Process.myPid() == activityManager$RunningAppProcessInfo0.pid) {
                                    if(activityManager$RunningAppProcessInfo0.importance == 100 && !keyguardManager0.inKeyguardRestrictedInputMode()) {
                                        PowerManager powerManager0 = (PowerManager)context0.getSystemService("power");
                                        if(powerManager0 != null && powerManager0.isScreenOn()) {
                                            goto label_21;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }
                goto label_18;
            }
            catch(Throwable throwable0) {
                try {
                    zzt.zzo().zzt(throwable0, "ContentFetchTask.isInForeground");
                label_18:
                    zzcfi.zze("ContentFetchTask: sleeping");
                    this.zzf();
                    goto label_35;
                label_21:
                    view0 = null;
                    activity0 = zzt.zzb().zza();
                    if(activity0 == null) {
                        zzcfi.zze("ContentFetchThread: no activity. Sleeping.");
                        this.zzf();
                        goto label_35;
                    }
                }
                catch(InterruptedException interruptedException0) {
                    zzcfi.zzh("Error in ContentFetchTask", interruptedException0);
                    goto label_43;
                }
                catch(Exception exception0) {
                    goto label_41;
                }
            }
            try {
                if(activity0.getWindow() != null && activity0.getWindow().getDecorView() != null) {
                    view0 = activity0.getWindow().getDecorView().findViewById(0x1020002);
                }
                goto label_33;
            }
            catch(Exception exception1) {
                try {
                    zzt.zzo().zzt(exception1, "ContentFetchTask.extractContent");
                    zzcfi.zze("Failed getting root view of activity. Content not extracted.");
                label_33:
                    if(view0 != null) {
                        view0.post(new m0(6, this, view0));
                    }
                label_35:
                    Thread.sleep(this.m * 1000);
                    goto label_43;
                }
                catch(InterruptedException interruptedException0) {
                }
                catch(Exception exception0) {
                    goto label_41;
                }
            }
            zzcfi.zzh("Error in ContentFetchTask", interruptedException0);
            goto label_43;
        label_41:
            zzcfi.zzh("Error in ContentFetchTask", exception0);
            zzt.zzo().zzt(exception0, "ContentFetchTask.run");
        label_43:
            synchronized(this.k) {
                while(this.j) {
                    try {
                        zzcfi.zze("ContentFetchTask: waiting");
                        this.k.wait();
                    }
                    catch(InterruptedException unused_ex) {
                    }
                }
            }
        }
    }

    public final zzbbc zza() {
        return this.l.zza(this.x);
    }

    public final void zze() {
        synchronized(this.k) {
            if(this.i) {
                zzcfi.zze("Content hash thread already started, quiting...");
                return;
            }
            this.i = true;
        }
        this.start();
    }

    public final void zzf() {
        synchronized(this.k) {
            this.j = true;
            zzcfi.zze("ContentFetchThread: paused, mPause = true");
        }
    }

    public final void zzg() {
        synchronized(this.k) {
            this.j = false;
            this.k.notifyAll();
            zzcfi.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.j;
    }
}

