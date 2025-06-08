package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzgio implements zzfwf {
    public final zzfza a;

    public zzgio(byte[] arr_b) throws GeneralSecurityException {
        this.a = new zzfza(arr_b);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOf(arr_b, 24);
        ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b, 24, arr_b.length - 24);
        return this.a.zzc(byteBuffer0, arr_b2, arr_b1);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 40);
        byte[] arr_b2 = zzgik.zza(24);
        byteBuffer0.put(arr_b2);
        this.a.zzb(byteBuffer0, arr_b2, arr_b, arr_b1);
        return byteBuffer0.array();
    }
}

