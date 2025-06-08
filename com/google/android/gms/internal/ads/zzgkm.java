package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzgkm extends zzgiq {
    public final zzgkq i;
    public zzgkq j;
    public boolean k;

    public zzgkm(zzgkq zzgkq0) {
        this.i = zzgkq0;
        this.j = (zzgkq)zzgkq0.k(4, null);
        this.k = false;
    }

    @Override  // com.google.android.gms.internal.ads.zzgiq
    public final zzgkm a(zzgir zzgir0) {
        this.zzaj(((zzgkq)zzgir0));
        return this;
    }

    public final void b() {
        zzgkq zzgkq0 = (zzgkq)this.j.k(4, null);
        zzgkq zzgkq1 = this.j;
        Class class0 = zzgkq0.getClass();
        N9.c.a(class0).f(zzgkq0, zzgkq1);
        this.j = zzgkq0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgiq
    public final Object clone() throws CloneNotSupportedException {
        return this.zzai();
    }

    @Override  // com.google.android.gms.internal.ads.zzgiq
    public final zzgiq zzaf() {
        return this.zzai();
    }

    public final zzgkm zzai() {
        zzgkm zzgkm0 = (zzgkm)this.i.k(5, null);
        zzgkm0.zzaj(this.zzam());
        return zzgkm0;
    }

    public final zzgkm zzaj(zzgkq zzgkq0) {
        if(this.k) {
            this.b();
            this.k = false;
        }
        zzgkq zzgkq1 = this.j;
        Class class0 = zzgkq1.getClass();
        N9.c.a(class0).f(zzgkq1, zzgkq0);
        return this;
    }

    public final zzgkm zzak(byte[] arr_b, int v, int v1, zzgkc zzgkc0) throws zzglc {
        if(this.k) {
            this.b();
            this.k = false;
        }
        try {
            Class class0 = this.j.getClass();
            N9.c.a(class0).e(this.j, arr_b, 0, v1, new b9(zzgkc0));
            return this;
        }
        catch(zzglc zzglc0) {
            throw zzglc0;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw zzglc.f();
        }
        catch(IOException iOException0) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", iOException0);
        }
    }

    public final zzgkq zzal() {
        zzgkq zzgkq0 = this.zzam();
        if(!zzgkq0.zzaR()) {
            throw new zzgnj(zzgkq0);
        }
        return zzgkq0;
    }

    public zzgkq zzam() {
        if(this.k) {
            return this.j;
        }
        zzgkq zzgkq0 = this.j;
        Class class0 = zzgkq0.getClass();
        N9.c.a(class0).zzf(zzgkq0);
        this.k = true;
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzglz
    public zzgma zzan() {
        return this.zzam();
    }

    @Override  // com.google.android.gms.internal.ads.zzgmb
    public final zzgma zzbh() {
        return this.i;
    }
}

