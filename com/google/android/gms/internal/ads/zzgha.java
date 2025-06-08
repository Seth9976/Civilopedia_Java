package com.google.android.gms.internal.ads;

import L2.b;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzgha implements zzgie {
    public final SecretKeySpec a;
    public final int b;
    public final int c;
    public static final b d;

    static {
        zzgha.d = new b(6);
    }

    public zzgha(byte[] arr_b, int v) throws GeneralSecurityException {
        if(!zzfze.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzgim.zza(arr_b.length);
        this.a = new SecretKeySpec(arr_b, "AES");
        int v1 = ((Cipher)zzgha.d.get()).getBlockSize();
        this.c = v1;
        if(v < 12 || v > v1) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.b = v;
    }

    public final void a(byte[] arr_b, int v, int v1, byte[] arr_b1, int v2, byte[] arr_b2, boolean z) {
        Object object0 = zzgha.d.get();
        byte[] arr_b3 = new byte[this.c];
        System.arraycopy(arr_b2, 0, arr_b3, 0, this.b);
        IvParameterSpec ivParameterSpec0 = new IvParameterSpec(arr_b3);
        SecretKeySpec secretKeySpec0 = this.a;
        if(z) {
            ((Cipher)object0).init(1, secretKeySpec0, ivParameterSpec0);
        }
        else {
            ((Cipher)object0).init(2, secretKeySpec0, ivParameterSpec0);
        }
        if(((Cipher)object0).doFinal(arr_b, v, v1, arr_b1, v2) != v1) {
            throw new GeneralSecurityException("stored output\'s length does not match input\'s length");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgie
    public final byte[] zza(byte[] arr_b) throws GeneralSecurityException {
        int v = this.b;
        if(arr_b.length < v) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] arr_b1 = new byte[v];
        System.arraycopy(arr_b, 0, arr_b1, 0, v);
        int v1 = arr_b.length - this.b;
        byte[] arr_b2 = new byte[v1];
        this.a(arr_b, this.b, v1, arr_b2, 0, arr_b1, false);
        return arr_b2;
    }

    @Override  // com.google.android.gms.internal.ads.zzgie
    public final byte[] zzb(byte[] arr_b) throws GeneralSecurityException {
        int v = this.b;
        if(arr_b.length > 0x7FFFFFFF - v) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (0x7FFFFFFF - v));
        }
        byte[] arr_b1 = new byte[v + arr_b.length];
        byte[] arr_b2 = zzgik.zza(v);
        System.arraycopy(arr_b2, 0, arr_b1, 0, v);
        this.a(arr_b, 0, arr_b.length, arr_b1, this.b, arr_b2, true);
        return arr_b1;
    }
}

