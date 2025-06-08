package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.LinkedList;

public abstract class zzanz implements zzany {
    public final DisplayMetrics A;
    public static volatile zzapc B;
    public MotionEvent i;
    public final LinkedList j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public double r;
    public double s;
    public double t;
    public float u;
    public float v;
    public float w;
    public float x;
    public boolean y;
    public boolean z;

    public zzanz(Context context0) {
        this.j = new LinkedList();
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.o = 0L;
        this.p = 0L;
        this.q = 0L;
        this.y = false;
        this.z = false;
        try {
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzcu)).booleanValue()) {
                y0.b();
            }
            else {
                h.i(zzanz.B);
            }
            this.A = context0.getResources().getDisplayMetrics();
        }
        catch(Throwable unused_ex) {
        }
    }

    public abstract long a(StackTraceElement[] arg1);

    public abstract zzali b(Context arg1, View arg2, Activity arg3);

    public abstract zzali c(Context arg1);

    public abstract zzali d(Context arg1, View arg2, Activity arg3);

    public abstract zzape e(MotionEvent arg1);

    public final void f() {
        this.o = 0L;
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
        this.n = 0L;
        this.p = 0L;
        this.q = 0L;
        LinkedList linkedList0 = this.j;
        if(linkedList0.size() > 0) {
            for(Object object0: linkedList0) {
                ((MotionEvent)object0).recycle();
            }
            linkedList0.clear();
        }
        else {
            MotionEvent motionEvent0 = this.i;
            if(motionEvent0 != null) {
                motionEvent0.recycle();
            }
        }
        this.i = null;
    }

    public final String g(Context context0, String s, int v, View view0, Activity activity0) {
        int v6;
        int v5;
        String s2;
        int v3;
        int v2;
        String s1;
        zzanx zzanx0;
        long v1 = System.currentTimeMillis();
        boolean z = ((Boolean)zzay.zzc().zzb(zzbhz.zzcb)).booleanValue();
        zzali zzali0 = null;
        if(z) {
            zzanx0 = zzanz.B == null ? null : zzanz.B.zzd();
            s1 = ((Boolean)zzay.zzc().zzb(zzbhz.zzcu)).booleanValue() ? "be" : "te";
        }
        else {
            zzanx0 = null;
            s1 = null;
        }
        try {
            switch(v) {
                case 2: {
                    zzali0 = this.d(context0, view0, activity0);
                    v2 = 0x3F0;
                    break;
                }
                case 3: {
                    zzali0 = this.b(context0, view0, activity0);
                    this.y = true;
                    v2 = 1002;
                    break;
                }
                default: {
                    zzali0 = this.c(context0);
                    v2 = 1000;
                }
            }
            if(z && zzanx0 != null) {
                zzanx0.zzc(v2, -1, System.currentTimeMillis() - v1, s1, null);
            }
        }
        catch(Exception exception0) {
            if(z && zzanx0 != null) {
                if(v == 3) {
                    v3 = 1003;
                }
                else if(v == 2) {
                    v3 = 1009;
                }
                else {
                    v = 1;
                    v3 = 1001;
                }
                zzanx0.zzc(v3, -1, System.currentTimeMillis() - v1, s1, exception0);
            }
        }
        long v4 = System.currentTimeMillis();
        if(zzali0 == null) {
            return "5";
        }
        try {
            if(((zzaly)zzali0.zzal()).zzax() == 0) {
                return "5";
            }
            s2 = y0.a(((zzaly)zzali0.zzal()), s);
            if(z && zzanx0 != null) {
                if(v == 3) {
                    v5 = 1006;
                }
                else {
                    v5 = v == 2 ? 1010 : 1004;
                }
                zzanx0.zzc(v5, -1, System.currentTimeMillis() - v4, s1, null);
                return s2;
            }
        }
        catch(Exception unused_ex) {
            s2 = "7";
            if(z && zzanx0 != null) {
                if(v == 3) {
                    v6 = 1007;
                }
                else {
                    v6 = v == 2 ? 0x3F3 : 1005;
                }
                zzanx0.zzc(v6, -1, System.currentTimeMillis() - v4, s1, exception1);
            }
        }
        return s2;
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zze(Context context0, String s, View view0) {
        return this.g(context0, s, 3, view0, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zzf(Context context0, String s, View view0, Activity activity0) {
        return this.g(context0, s, 3, view0, activity0);
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zzg(Context context0) {
        if(zzapf.zzf()) {
            throw new IllegalStateException("The caller must not be called from the UI thread.");
        }
        return this.g(context0, null, 1, null, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final String zzh(Context context0, View view0, Activity activity0) {
        return this.g(context0, null, 2, view0, activity0);
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzk(MotionEvent motionEvent0) {
        synchronized(this) {
            if(this.y) {
                this.f();
                this.y = false;
            }
            switch(motionEvent0.getAction()) {
                case 0: {
                    this.r = 0.0;
                    this.s = (double)motionEvent0.getRawX();
                    this.t = (double)motionEvent0.getRawY();
                    break;
                }
                case 1: 
                case 2: {
                    double f = (double)motionEvent0.getRawX();
                    double f1 = (double)motionEvent0.getRawY();
                    double f2 = f - this.s;
                    double f3 = f1 - this.t;
                    this.r += Math.sqrt(f3 * f3 + f2 * f2);
                    this.s = f;
                    this.t = f1;
                }
            }
            int v1 = motionEvent0.getAction();
            switch(v1) {
                case 0: {
                    this.u = motionEvent0.getX();
                    this.v = motionEvent0.getY();
                    this.w = motionEvent0.getRawX();
                    this.x = motionEvent0.getRawY();
                    ++this.k;
                    break;
                }
                case 1: {
                    MotionEvent motionEvent1 = MotionEvent.obtain(motionEvent0);
                    this.i = motionEvent1;
                    this.j.add(motionEvent1);
                    if(this.j.size() > 6) {
                        ((MotionEvent)this.j.remove()).recycle();
                    }
                    try {
                        ++this.m;
                        this.o = this.a(new Throwable().getStackTrace());
                    }
                    catch(zzaot unused_ex) {
                    }
                    break;
                }
                case 2: {
                    this.l += (long)(motionEvent0.getHistorySize() + 1);
                    try {
                        zzape zzape0 = this.e(motionEvent0);
                        Long long0 = zzape0.zzd;
                        if(long0 != null && zzape0.zzg != null) {
                            this.p = ((long)long0) + ((long)zzape0.zzg) + this.p;
                        }
                        if(this.A != null) {
                            Long long1 = zzape0.zze;
                            if(long1 != null && zzape0.zzh != null) {
                                this.q = ((long)long1) + ((long)zzape0.zzh) + this.q;
                            }
                        }
                    }
                    catch(zzaot unused_ex) {
                    }
                    break;
                }
                default: {
                    if(v1 == 3) {
                        ++this.n;
                    }
                }
            }
            this.z = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public final void zzl(int v, int v1, int v2) {
        synchronized(this) {
            if(this.i != null) {
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzbZ)).booleanValue()) {
                    this.f();
                }
                else {
                    this.i.recycle();
                }
            }
            DisplayMetrics displayMetrics0 = this.A;
            this.i = displayMetrics0 == null ? null : MotionEvent.obtain(0L, v2, 1, ((float)v) * displayMetrics0.density, ((float)v1) * displayMetrics0.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
            this.z = false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzany
    public void zzn(View view0) {
    }
}

