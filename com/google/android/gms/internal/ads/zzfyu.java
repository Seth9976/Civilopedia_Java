package com.google.android.gms.internal.ads;

import A.f;
import L2.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzfyu {
    public final SecretKeySpec a;
    public final boolean b;
    public static final b c;

    static {
        zzfyu.c = new b(4);
    }

    public zzfyu(byte[] arr_b, boolean z) throws GeneralSecurityException {
        if(!zzfze.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgim.zza(arr_b.length);
        this.a = new SecretKeySpec(arr_b, "AES");
        this.b = z;
    }

    public static AlgorithmParameterSpec a(byte[] arr_b) {
        return zzgil.zzb() && zzgil.zza() <= 19 ? new IvParameterSpec(arr_b, 0, 12) : new GCMParameterSpec(0x80, arr_b, 0, 12);
    }

    public final byte[] zza(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        int v = 12;
        if(arr_b.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z = this.b;
        int v1 = arr_b1.length;
        if(v1 < (z ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if(z && !ByteBuffer.wrap(arr_b).equals(ByteBuffer.wrap(arr_b1, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpec0 = zzfyu.a(arr_b);
        b b0 = zzfyu.c;
        ((Cipher)b0.get()).init(2, this.a, algorithmParameterSpec0);
        if(arr_b2 != null && arr_b2.length != 0) {
            ((Cipher)b0.get()).updateAAD(arr_b2);
        }
        if(!z) {
            v = 0;
        }
        if(z) {
            v1 += -12;
        }
        return ((Cipher)b0.get()).doFinal(arr_b1, v, v1);
    }

    public final byte[] zzb(byte[] arr_b, byte[] arr_b1, byte[] arr_b2) throws GeneralSecurityException {
        if(arr_b.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if(arr_b1.length > 0x7FFFFFE3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z = this.b;
        byte[] arr_b3 = new byte[(z ? arr_b1.length + 28 : arr_b1.length + 16)];
        if(z) {
            System.arraycopy(arr_b, 0, arr_b3, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpec0 = zzfyu.a(arr_b);
        ((Cipher)zzfyu.c.get()).init(1, this.a, algorithmParameterSpec0);
        int v = ((Cipher)zzfyu.c.get()).doFinal(arr_b1, 0, arr_b1.length, arr_b3, (z ? 12 : 0));
        if(v != arr_b1.length + 16) {
            throw new GeneralSecurityException(f.e(v - arr_b1.length, "encryption failed; GCM tag must be 16 bytes, but got only ", " bytes"));
        }
        return arr_b3;
    }
}

