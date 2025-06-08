package com.google.android.gms.internal.play_billing;

public final class c extends zzca {
    @Override  // com.google.android.gms.internal.play_billing.zzca
    public final int zza() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzca
    public final zzca zzb(Comparable comparable0, Comparable comparable1) {
        int v = comparable0.compareTo(comparable1);
        if(v < 0) {
            return zzca.b;
        }
        return v > 0 ? zzca.c : zzca.a;
    }
}

