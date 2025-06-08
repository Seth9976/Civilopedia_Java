package com.google.android.gms.internal.play_billing;

import java.util.List;

public final class k0 implements U0 {
    public final zzgr a;

    public k0(zzgr zzgr0) {
        this.a = zzgr0;
        zzgr0.a = this;
    }

    public final void a(int v, int v1) {
        this.a.zzs(v, v1 >> 0x1F ^ v1 + v1);
    }

    public final void b(int v, long v1) {
        this.a.zzu(v, v1 >> 0x3F ^ v1 + v1);
    }

    public final void c(int v, List list0) {
        int v1 = 0;
        zzgr zzgr0 = this.a;
        if(list0 instanceof zzhy) {
            while(v1 < list0.size()) {
                Object object0 = ((zzhy)list0).zzc();
                if(object0 instanceof String) {
                    zzgr0.zzp(v, ((String)object0));
                }
                else {
                    zzgr0.zze(v, ((zzgk)object0));
                }
                ++v1;
            }
            return;
        }
        while(v1 < list0.size()) {
            zzgr0.zzp(v, ((String)list0.get(v1)));
            ++v1;
        }
    }

    public final void d(int v, int v1) {
        this.a.zzs(v, v1);
    }

    public final void e(int v, long v1) {
        this.a.zzu(v, v1);
    }

    public final void f(int v, boolean z) {
        this.a.zzd(v, z);
    }

    public final void g(int v, zzgk zzgk0) {
        this.a.zze(v, zzgk0);
    }

    public final void h(int v, List list0) {
        for(int v1 = 0; v1 < list0.size(); ++v1) {
            zzgk zzgk0 = (zzgk)list0.get(v1);
            this.a.zze(v, zzgk0);
        }
    }

    public final void i(int v, double f) {
        this.a.zzh(v, Double.doubleToRawLongBits(f));
    }

    public final void j(int v, int v1) {
        this.a.zzj(v, v1);
    }

    public final void k(int v, int v1) {
        this.a.zzf(v, v1);
    }

    public final void l(int v, long v1) {
        this.a.zzh(v, v1);
    }

    public final void m(float f, int v) {
        this.a.zzf(v, Float.floatToRawIntBits(f));
    }

    public final void n(int v, Object object0, I0 i00) {
        this.a.zzr(v, 3);
        i00.b(((zzim)object0), this.a.a);
        this.a.zzr(v, 4);
    }

    public final void o(int v, int v1) {
        this.a.zzj(v, v1);
    }

    public final void p(int v, long v1) {
        this.a.zzu(v, v1);
    }

    public final void q(int v, Object object0, I0 i00) {
        this.a.a(v, ((zzim)object0), i00);
    }

    public final void r(int v, Object object0) {
        zzgr zzgr0 = this.a;
        if(object0 instanceof zzgk) {
            zzgr0.zzo(v, ((zzgk)object0));
            return;
        }
        zzgr0.zzn(v, ((zzim)object0));
    }

    public final void s(int v, int v1) {
        this.a.zzf(v, v1);
    }

    public final void t(int v, long v1) {
        this.a.zzh(v, v1);
    }
}

