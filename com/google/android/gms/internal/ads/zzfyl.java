package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class zzfyl implements zzfwf {
    public final zzgfo a;
    public final zzfwf b;
    public static final byte[] c;

    static {
        zzfyl.c = new byte[0];
    }

    public zzfyl(zzgfo zzgfo0, zzfwf zzfwf0) {
        this.a = zzgfo0;
        this.b = zzfwf0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        try {
            ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b);
            int v = byteBuffer0.getInt();
            if(v <= 0 || v > arr_b.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] arr_b2 = new byte[v];
            byteBuffer0.get(arr_b2, 0, v);
            byte[] arr_b3 = new byte[byteBuffer0.remaining()];
            byteBuffer0.get(arr_b3, 0, byteBuffer0.remaining());
            return ((zzfwf)zzfxk.zzh("", this.b.zza(arr_b2, zzfyl.c), zzfwf.class)).zza(arr_b3, arr_b1);
        }
        catch(IndexOutOfBoundsException | BufferUnderflowException | NegativeArraySizeException indexOutOfBoundsException0) {
        }
        throw new GeneralSecurityException("invalid ciphertext", indexOutOfBoundsException0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = zzfxk.zzd(this.a).zzaw();
        byte[] arr_b3 = this.b.zzb(arr_b2, zzfyl.c);
        byte[] arr_b4 = ((zzfwf)zzfxk.zzh(this.a.zzf(), arr_b2, zzfwf.class)).zzb(arr_b, arr_b1);
        return ByteBuffer.allocate(arr_b3.length + 4 + arr_b4.length).putInt(arr_b3.length).put(arr_b3).put(arr_b4).array();
    }
}

