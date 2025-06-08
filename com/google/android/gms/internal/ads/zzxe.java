package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

public final class zzxe {
    public final Kb a;
    public final Nb b;
    public final Pb c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;

    public zzxe(Context context0) {
        Ob ob0;
        Kb kb0 = new Kb();  // 初始化器: Ljava/lang/Object;-><init>()V
        kb0.a = new Jb();
        kb0.b = new Jb();
        kb0.d = 0x8000000000000001L;
        this.a = kb0;
        Pb pb0 = null;
        if(context0 == null) {
            ob0 = null;
        }
        else {
            Context context1 = context0.getApplicationContext();
            DisplayManager displayManager0 = (DisplayManager)context1.getSystemService("display");
            ob0 = displayManager0 == null ? null : new Ob(displayManager0);
            if(ob0 == null) {
                WindowManager windowManager0 = (WindowManager)context1.getSystemService("window");
                ob0 = windowManager0 == null ? null : new J5(windowManager0, 8);
            }
        }
        this.b = ob0;
        if(ob0 != null) {
            pb0 = Pb.m;
        }
        this.c = pb0;
        this.k = 0x8000000000000001L;
        this.l = 0x8000000000000001L;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        if(zzeg.zza >= 30) {
            Surface surface0 = this.e;
            if(surface0 != null && this.j != 0x80000000 && this.h != 0.0f) {
                this.h = 0.0f;
                Mb.a(surface0, 0.0f);
            }
        }
    }

    public final void b() {
        float f;
        if(zzeg.zza >= 30 && this.e != null) {
            Kb kb0 = this.a;
            if(!kb0.a.c()) {
                f = this.f;
            }
            else if(kb0.a.c()) {
                long v = kb0.a.e;
                f = (float)(1000000000.0 / ((double)(v == 0L ? 0L : kb0.a.f / v)));
            }
            else {
                f = -1.0f;
            }
            float f1 = this.g;
            if(f == f1) {
                return;
            }
            float f2 = 1.0f;
            int v1 = Float.compare(f, -1.0f);
            if(v1 != 0 && f1 != -1.0f) {
                if(kb0.a.c() && (kb0.a.c() ? kb0.a.f : 0x8000000000000001L) >= 5000000000L) {
                    f2 = 0.02f;
                }
                if(Math.abs(f - this.g) < f2) {
                    return;
                }
            }
            else if(v1 == 0 && kb0.e < 30) {
                return;
            }
            this.g = f;
            this.c(false);
        }
    }

    public final void c(boolean z) {
        if(zzeg.zza >= 30) {
            float f = 0.0f;
            Surface surface0 = this.e;
            if(surface0 != null && this.j != 0x80000000) {
                if(this.d) {
                    float f1 = this.g;
                    if(f1 != -1.0f) {
                        f = this.i * f1;
                    }
                }
                if(!z && this.h == f) {
                    return;
                }
                this.h = f;
                Mb.a(surface0, f);
            }
        }
    }

    public final long zza(long v) {
        long v7;
        long v3;
        long v2;
        if(this.p == -1L || !this.a.a.c()) {
            v3 = v;
        }
        else {
            Kb kb0 = this.a;
            if(kb0.a.c()) {
                Jb jb0 = kb0.a;
                long v1 = jb0.e;
                v2 = v1 == 0L ? 0L : jb0.f / v1;
            }
            else {
                v2 = 0x8000000000000001L;
            }
            v3 = this.q + ((long)(((float)((this.m - this.p) * v2)) / this.i));
            if(Math.abs(v - v3) > 20000000L) {
                this.m = 0L;
                this.p = -1L;
                this.n = -1L;
                v3 = v;
            }
        }
        this.n = this.m;
        this.o = v3;
        Pb pb0 = this.c;
        if(pb0 != null && this.k != 0x8000000000000001L) {
            long v4 = pb0.i;
            if(v4 == 0x8000000000000001L) {
                return v3;
            }
            long v5 = this.k;
            long v6 = (v3 - v4) / v5 * v5 + v4;
            if(v3 <= v6) {
                v7 = v6 - v5;
            }
            else {
                v7 = v6;
                v6 = v5 + v6;
            }
            if(v6 - v3 >= v3 - v7) {
                v6 = v7;
            }
            return v6 - this.l;
        }
        return v3;
    }

    public static void zzb(zzxe zzxe0, Display display0) {
        if(display0 != null) {
            long v = (long)(1000000000.0 / ((double)display0.getRefreshRate()));
            zzxe0.k = v;
            zzxe0.l = v * 80L / 100L;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        zzxe0.k = 0x8000000000000001L;
        zzxe0.l = 0x8000000000000001L;
    }

    public final void zzc(float f) {
        this.f = f;
        this.a.a.b();
        this.a.b.b();
        this.a.c = false;
        this.a.d = 0x8000000000000001L;
        this.a.e = 0;
        this.b();
    }

    public final void zzd(long v) {
        long v1 = this.n;
        if(v1 != -1L) {
            this.p = v1;
            this.q = this.o;
        }
        ++this.m;
        Kb kb0 = this.a;
        kb0.a.a(v * 1000L);
        int v2 = 0;
        if(kb0.a.c()) {
            kb0.c = false;
        }
        else if(kb0.d != 0x8000000000000001L) {
            if(kb0.c) {
                long v3 = kb0.b.d;
                if((v3 == 0L ? false : kb0.b.g[((int)((v3 - 1L) % 15L))])) {
                    kb0.b.b();
                    kb0.b.a(kb0.d);
                }
            }
            else {
                kb0.b.b();
                kb0.b.a(kb0.d);
            }
            kb0.c = true;
            kb0.b.a(v * 1000L);
        }
        if(kb0.c && kb0.b.c()) {
            Jb jb0 = kb0.a;
            kb0.a = kb0.b;
            kb0.b = jb0;
            kb0.c = false;
        }
        kb0.d = v * 1000L;
        if(!kb0.a.c()) {
            v2 = kb0.e + 1;
        }
        kb0.e = v2;
        this.b();
    }

    public final void zze(float f) {
        this.i = f;
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
        this.c(false);
    }

    public final void zzf() {
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
    }

    public final void zzg() {
        this.d = true;
        this.m = 0L;
        this.p = -1L;
        this.n = -1L;
        Nb nb0 = this.b;
        if(nb0 != null) {
            this.c.getClass();
            this.c.j.sendEmptyMessage(1);
            nb0.a(new zzwy(this));
        }
        this.c(false);
    }

    public final void zzh() {
        this.d = false;
        Nb nb0 = this.b;
        if(nb0 != null) {
            nb0.zza();
            this.c.getClass();
            this.c.j.sendEmptyMessage(2);
        }
        this.a();
    }

    public final void zzi(Surface surface0) {
        if(surface0 instanceof zzww) {
            surface0 = null;
        }
        if(this.e == surface0) {
            return;
        }
        this.a();
        this.e = surface0;
        this.c(true);
    }

    public final void zzj(int v) {
        if(this.j == v) {
            return;
        }
        this.j = v;
        this.c(true);
    }
}

