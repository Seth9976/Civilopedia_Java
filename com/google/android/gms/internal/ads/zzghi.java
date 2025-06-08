package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzghi implements zzfwf {
    public final zzfyx a;

    public zzghi(byte[] arr_b) throws GeneralSecurityException {
        this.a = new zzfyx(arr_b);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOf(arr_b, 12);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 12, arr_b.length - 12);
        return this.a.zzc(byteBuffer0, arr_b2, arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 28);
        byte[] arr_b2 = zzgik.zza(12);
        byteBuffer0.put(arr_b2);
        this.a.zzb(byteBuffer0, arr_b2, arr_b, arr_b1);
        return byteBuffer0.array();
    }
}

