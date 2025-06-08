package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzghr implements zzfwf {
    public final zzgie a;
    public final zzfwx b;
    public final int c;

    public zzghr(zzgie zzgie0, zzfwx zzfwx0, int v) {
        this.a = zzgie0;
        this.b = zzfwx0;
        this.c = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        int v = this.c;
        if(arr_b.length < v) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b2 = Arrays.copyOfRange(arr_b, 0, arr_b.length - v);
        byte[] arr_b3 = Arrays.copyOfRange(arr_b, arr_b.length - v, arr_b.length);
        if(arr_b1 == null) {
            arr_b1 = new byte[0];
        }
        byte[] arr_b4 = zzghh.zzc(new byte[][]{arr_b1, arr_b2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long)arr_b1.length) * 8L).array(), 8)});
        this.b.zza(arr_b3, arr_b4);
        return this.a.zza(arr_b2);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        byte[] arr_b2 = this.a.zzb(arr_b);
        byte[] arr_b3 = zzghh.zzc(new byte[][]{arr_b1, arr_b2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8)});
        return zzghh.zzc(new byte[][]{arr_b2, this.b.zzb(arr_b3)});
    }
}

