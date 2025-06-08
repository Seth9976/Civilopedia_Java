package com.google.android.gms.internal.ads;

import A.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class h9 extends zzgji {
    public final byte[] j;

    public h9(byte[] arr_b) {
        arr_b.getClass();
        this.j = arr_b;
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzgji)) {
            return false;
        }
        if(this.zzd() != ((zzgji)object0).zzd()) {
            return false;
        }
        if(this.zzd() == 0) {
            return true;
        }
        if(object0 instanceof h9) {
            int v = this.i;
            int v1 = ((h9)object0).i;
            return v == 0 || v1 == 0 || v == v1 ? this.s(((h9)object0), 0, this.zzd()) : false;
        }
        return object0.equals(this);
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public byte h(int v) {
        return this.j[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public void j(int v, int v1, int v2, byte[] arr_b) {
        System.arraycopy(this.j, v, arr_b, v1, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final int k() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final boolean l() {
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final int m(int v, int v1, int v2) {
        int v3 = this.r() + v1;
        for(int v4 = v3; v4 < v3 + v2; ++v4) {
            v = v * 0x1F + this.j[v4];
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final int n(int v, int v1, int v2) {
        int v3 = this.r();
        ka.a.getClass();
        return S.e(v, v3 + v1, v2 + (v3 + v1), this.j);
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final String o(Charset charset0) {
        int v = this.zzd();
        return new String(this.j, this.r(), v, charset0);
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final void p(zzgjx zzgjx0) {
        int v = this.zzd();
        zzgjx0.zza(this.j, this.r(), v);
    }

    public int r() {
        return 0;
    }

    public final boolean s(h9 h90, int v, int v1) {
        if(v1 > h90.zzd()) {
            throw new IllegalArgumentException("Length too large: " + v1 + this.zzd());
        }
        if(v + v1 <= h90.zzd()) {
            int v2 = this.r();
            int v3 = this.r();
            for(int v4 = h90.r() + v; v3 < v2 + v1; ++v4) {
                if(this.j[v3] != h90.j[v4]) {
                    return false;
                }
                ++v3;
            }
            return true;
        }
        int v5 = h90.zzd();
        StringBuilder stringBuilder0 = f.n("Ran off end of other: ", v, ", ", v1, ", ");
        stringBuilder0.append(v5);
        throw new IllegalArgumentException(stringBuilder0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public byte zza(int v) {
        return this.j[v];
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public int zzd() {
        return this.j.length;
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final zzgji zzk(int v, int v1) {
        int v2 = zzgji.q(v, v1, this.zzd());
        return v2 == 0 ? zzgji.zzb : new g9(this.j, this.r() + v, v2);
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final zzgjq zzl() {
        int v = this.zzd();
        zzgjq zzgjq0 = new i9(this.j, this.r(), v);
        try {
            ((i9)zzgjq0).zze(v);
            return zzgjq0;
        }
        catch(zzglc zzglc0) {
            throw new IllegalArgumentException(zzglc0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final ByteBuffer zzn() {
        int v = this.zzd();
        return ByteBuffer.wrap(this.j, this.r(), v).asReadOnlyBuffer();
    }

    @Override  // com.google.android.gms.internal.ads.zzgji
    public final boolean zzp() {
        int v = this.r();
        int v1 = this.zzd();
        ka.a.getClass();
        return S.e(0, v, v1 + v, this.j) == 0;
    }
}

