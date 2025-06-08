package com.google.android.gms.internal.play_billing;

import A.f;

public class i0 extends zzgk {
    public final byte[] j;

    public i0(byte[] arr_b) {
        this.i = 0;
        arr_b.getClass();
        this.j = arr_b;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgk
    public byte a(int v) {
        return this.j[v];
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgk
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof zzgk)) {
            return false;
        }
        if(this.zzd() != ((zzgk)object0).zzd()) {
            return false;
        }
        if(this.zzd() == 0) {
            return true;
        }
        if(object0 instanceof i0) {
            int v = this.i;
            int v1 = ((i0)object0).i;
            if(v != 0 && v1 != 0 && v != v1) {
                return false;
            }
            int v2 = this.zzd();
            if(v2 > ((i0)object0).zzd()) {
                throw new IllegalArgumentException("Length too large: " + v2 + this.zzd());
            }
            if(v2 > ((i0)object0).zzd()) {
                throw new IllegalArgumentException(f.d(v2, ((i0)object0).zzd(), "Ran off end of other: 0, ", ", "));
            }
            int v3 = 0;
            for(int v4 = 0; v3 < v2; ++v4) {
                if(this.j[v3] != ((i0)object0).j[v4]) {
                    return false;
                }
                ++v3;
            }
            return true;
        }
        return object0.equals(this);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgk
    public final int h(int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            v = v * 0x1F + this.j[v2];
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgk
    public final void i(j0 j00) {
        j00.d(this.zzd(), this.j);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgk
    public byte zza(int v) {
        return this.j[v];
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgk
    public int zzd() {
        return this.j.length;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgk
    public final zzgk zzf(int v, int v1) {
        int v2 = zzgk.j(0, v1, this.zzd());
        return v2 == 0 ? zzgk.zzb : new h0(this.j, v2);
    }
}

