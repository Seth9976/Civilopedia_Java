package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

public abstract class K8 {
    public final int[] a;
    public final int b;

    public K8(byte[] arr_b, int v) {
        if(arr_b.length != 0x20) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.a = J8.c(arr_b);
        this.b = v;
    }

    public final ByteBuffer a(int v, byte[] arr_b) {
        int[] arr_v = this.zzb(J8.c(arr_b), v);
        int[] arr_v1 = (int[])arr_v.clone();
        J8.b(arr_v1);
        for(int v1 = 0; v1 < 16; ++v1) {
            arr_v[v1] += arr_v1[v1];
        }
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(0x40).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer0.asIntBuffer().put(arr_v, 0, 16);
        return byteBuffer0;
    }

    public final void b(byte[] arr_b, ByteBuffer byteBuffer0, ByteBuffer byteBuffer1) {
        int v = this.zza();
        if(arr_b.length != v) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + this.zza());
        }
        int v1 = byteBuffer1.remaining();
        for(int v2 = 0; v2 < v1 / 0x40 + 1; ++v2) {
            ByteBuffer byteBuffer2 = this.a(this.b + v2, arr_b);
            if(v2 == v1 / 0x40) {
                zzghh.zza(byteBuffer0, byteBuffer1, byteBuffer2, v1 % 0x40);
            }
            else {
                zzghh.zza(byteBuffer0, byteBuffer1, byteBuffer2, 0x40);
            }
        }
    }

    public abstract int zza();

    public abstract int[] zzb(int[] arg1, int arg2);

    public final void zzd(ByteBuffer byteBuffer0, byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(byteBuffer0.remaining() < arr_b1.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        this.b(arr_b, byteBuffer0, ByteBuffer.wrap(arr_b1));
    }

    public final byte[] zze(byte[] arr_b, ByteBuffer byteBuffer0) throws GeneralSecurityException {
        ByteBuffer byteBuffer1 = ByteBuffer.allocate(byteBuffer0.remaining());
        this.b(arr_b, byteBuffer1, byteBuffer0);
        return byteBuffer1.array();
    }
}

