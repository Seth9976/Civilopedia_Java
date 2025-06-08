package com.google.android.gms.internal.ads;

import A.f;
import L2.b;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzfzd implements zzfwf {
    public final SecretKeySpec a;
    public static final b b;

    static {
        zzfzd.b = new b(5);
    }

    public zzfzd(byte[] arr_b) throws GeneralSecurityException {
        zzgim.zza(arr_b.length);
        this.a = new SecretKeySpec(arr_b, "AES");
    }

    public static AlgorithmParameterSpec a(int v, byte[] arr_b) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(0x80, arr_b, 0, v);
        }
        catch(ClassNotFoundException unused_ex) {
            if(!zzgil.zzb()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            return new IvParameterSpec(arr_b, 0, v);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zza(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpec0 = zzfzd.a(12, arr_b);
        b b0 = zzfzd.b;
        ((Cipher)b0.get()).init(2, this.a, algorithmParameterSpec0);
        if(arr_b1 != null && arr_b1.length != 0) {
            ((Cipher)b0.get()).updateAAD(arr_b1);
        }
        return ((Cipher)b0.get()).doFinal(arr_b, 12, arr_b.length - 12);
    }

    @Override  // com.google.android.gms.internal.ads.zzfwf
    public final byte[] zzb(byte[] arr_b, byte[] arr_b1) throws GeneralSecurityException {
        if(arr_b.length > 0x7FFFFFE3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] arr_b2 = new byte[arr_b.length + 28];
        byte[] arr_b3 = zzgik.zza(12);
        System.arraycopy(arr_b3, 0, arr_b2, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpec0 = zzfzd.a(arr_b3.length, arr_b3);
        ((Cipher)zzfzd.b.get()).init(1, this.a, algorithmParameterSpec0);
        int v = ((Cipher)zzfzd.b.get()).doFinal(arr_b, 0, arr_b.length, arr_b2, 12);
        if(v != arr_b.length + 16) {
            throw new GeneralSecurityException(f.e(v - arr_b.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
        }
        return arr_b2;
    }
}

