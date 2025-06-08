package com.google.android.gms.internal.play_billing;

import i3.e;
import java.io.IOException;

public abstract class zzfv implements zzim {
    protected int zza;

    public zzfv() {
        this.zza = 0;
    }

    public int a(I0 i00) {
        throw null;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzim
    public final zzgk zzf() {
        try {
            int v = this.zzk();
            byte[] arr_b = new byte[v];
            j0 j00 = new j0(arr_b, v);
            this.zzJ(j00);
            j00.zzB();
            return new i0(arr_b);
        }
        catch(IOException iOException0) {
            throw new RuntimeException(e.f("Serializing ", this.getClass().getName(), " to a ByteString threw an IOException (should never happen)."), iOException0);
        }
    }

    public final byte[] zzh() {
        try {
            int v = this.zzk();
            byte[] arr_b = new byte[v];
            j0 j00 = new j0(arr_b, v);
            this.zzJ(j00);
            j00.zzB();
            return arr_b;
        }
        catch(IOException iOException0) {
            throw new RuntimeException(e.f("Serializing ", this.getClass().getName(), " to a byte array threw an IOException (should never happen)."), iOException0);
        }
    }
}

