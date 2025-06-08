package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class zzgih implements zzgbg {
    public final Y8 a;
    public final String b;
    public final Key c;
    public final int d;

    public zzgih(String s, Key key0) throws GeneralSecurityException {
        Y8 y80 = new Y8(this);
        this.a = y80;
        if(!zzfze.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.b = s;
        this.c = key0;
        if(key0.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch(s) {
            case "HMACSHA1": {
                this.d = 20;
                break;
            }
            case "HMACSHA224": {
                this.d = 28;
                break;
            }
            case "HMACSHA256": {
                this.d = 0x20;
                break;
            }
            case "HMACSHA384": {
                this.d = 0x30;
                break;
            }
            case "HMACSHA512": {
                this.d = 0x40;
                break;
            }
            default: {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + s);
            }
        }
        y80.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzgbg
    public final byte[] zza(byte[] arr_b, int v) throws GeneralSecurityException {
        if(v > this.d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac)this.a.get()).update(arr_b);
        return Arrays.copyOf(((Mac)this.a.get()).doFinal(), v);
    }
}

