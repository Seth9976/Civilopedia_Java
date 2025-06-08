package com.google.android.gms.internal.play_billing;

import A.f;

public final class h0 extends i0 {
    public final int k;

    public h0(byte[] arr_b, int v) {
        super(arr_b);
        zzgk.j(0, v, arr_b.length);
        this.k = v;
    }

    @Override  // com.google.android.gms.internal.play_billing.i0
    public final byte a(int v) {
        return this.j[v];
    }

    @Override  // com.google.android.gms.internal.play_billing.i0
    public final byte zza(int v) {
        int v1 = this.k;
        if((v1 - (v + 1) | v) < 0) {
            throw v >= 0 ? new ArrayIndexOutOfBoundsException(f.d(v, v1, "Index > length: ", ", ")) : new ArrayIndexOutOfBoundsException("Index < 0: " + v);
        }
        return this.j[v];
    }

    @Override  // com.google.android.gms.internal.play_billing.i0
    public final int zzd() {
        return this.k;
    }
}

