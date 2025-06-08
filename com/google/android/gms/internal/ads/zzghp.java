package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class zzghp {
    public final ECPublicKey a;

    public zzghp(ECPublicKey eCPublicKey0) {
        this.a = eCPublicKey0;
    }

    public final zzgho zza(String s, byte[] arr_b, byte[] arr_b1, int v, int v1) throws GeneralSecurityException {
        byte[] arr_b14;
        byte[] arr_b5;
        byte[] arr_b3;
        BigInteger bigInteger11;
        BigInteger bigInteger9;
        byte[] arr_b2;
        ECPublicKey eCPublicKey0 = this.a;
        KeyPair keyPair0 = zzghq.zzb(eCPublicKey0.getParams());
        ECPublicKey eCPublicKey1 = (ECPublicKey)keyPair0.getPublic();
        ECPrivateKey eCPrivateKey0 = (ECPrivateKey)keyPair0.getPrivate();
        try {
            ECParameterSpec eCParameterSpec0 = eCPublicKey0.getParams();
            ECParameterSpec eCParameterSpec1 = eCPrivateKey0.getParams();
            if(!eCParameterSpec0.getCurve().equals(eCParameterSpec1.getCurve()) || !eCParameterSpec0.getGenerator().equals(eCParameterSpec1.getGenerator()) || !eCParameterSpec0.getOrder().equals(eCParameterSpec1.getOrder()) || eCParameterSpec0.getCofactor() != eCParameterSpec1.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        }
        catch(IllegalArgumentException | NullPointerException illegalArgumentException0) {
            throw new GeneralSecurityException(illegalArgumentException0);
        }
        ECPoint eCPoint0 = eCPublicKey0.getW();
        zzghq.a(eCPoint0, eCPrivateKey0.getParams().getCurve());
        ECPublicKeySpec eCPublicKeySpec0 = new ECPublicKeySpec(eCPoint0, eCPrivateKey0.getParams());
        PublicKey publicKey0 = ((KeyFactory)zzghs.zzg.zza("EC")).generatePublic(eCPublicKeySpec0);
        KeyAgreement keyAgreement0 = (KeyAgreement)zzghs.zze.zza("ECDH");
        keyAgreement0.init(eCPrivateKey0);
        try {
            keyAgreement0.doPhase(publicKey0, true);
            arr_b2 = keyAgreement0.generateSecret();
            EllipticCurve ellipticCurve0 = eCPrivateKey0.getParams().getCurve();
            BigInteger bigInteger0 = new BigInteger(1, arr_b2);
            if(bigInteger0.signum() == -1 || bigInteger0.compareTo(zzghq.zza(ellipticCurve0)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger bigInteger1 = zzghq.zza(ellipticCurve0);
            BigInteger bigInteger2 = ellipticCurve0.getA();
            BigInteger bigInteger3 = ellipticCurve0.getB();
            BigInteger bigInteger4 = bigInteger0.multiply(bigInteger0).add(bigInteger2).multiply(bigInteger0).add(bigInteger3).mod(bigInteger1);
            if(bigInteger1.signum() != 1) {
                throw new InvalidAlgorithmParameterException("p must be positive");
            }
            BigInteger bigInteger5 = null;
            BigInteger bigInteger6 = bigInteger4.mod(bigInteger1);
            BigInteger bigInteger7 = BigInteger.ZERO;
            if(!bigInteger6.equals(bigInteger7)) {
                if(!bigInteger1.testBit(0) || !bigInteger1.testBit(1)) {
                    if(bigInteger1.testBit(0) && !bigInteger1.testBit(1)) {
                        bigInteger7 = BigInteger.ONE;
                        BigInteger bigInteger8 = bigInteger1.subtract(bigInteger7).shiftRight(1);
                        int v2 = 0;
                        do {
                            bigInteger9 = bigInteger7.multiply(bigInteger7).subtract(bigInteger6).mod(bigInteger1);
                            if(bigInteger9.equals(BigInteger.ZERO)) {
                                goto label_70;
                            }
                            BigInteger bigInteger10 = bigInteger9.modPow(bigInteger8, bigInteger1);
                            bigInteger11 = BigInteger.ONE;
                            if(bigInteger10.add(bigInteger11).equals(bigInteger1)) {
                                goto label_48;
                            }
                            if(!bigInteger10.equals(bigInteger11)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                            bigInteger7 = bigInteger7.add(bigInteger11);
                            ++v2;
                        }
                        while(v2 != 0x80 || bigInteger1.isProbablePrime(80));
                        throw new InvalidAlgorithmParameterException("p is not prime");
                    label_48:
                        BigInteger bigInteger12 = bigInteger1.add(bigInteger11).shiftRight(1);
                        int v3 = bigInteger12.bitLength() - 2;
                        bigInteger5 = bigInteger7;
                        while(v3 >= 0) {
                            BigInteger bigInteger13 = bigInteger5.multiply(bigInteger11);
                            BigInteger bigInteger14 = bigInteger5.multiply(bigInteger5).add(bigInteger11.multiply(bigInteger11).mod(bigInteger1).multiply(bigInteger9)).mod(bigInteger1);
                            BigInteger bigInteger15 = bigInteger13.add(bigInteger13).mod(bigInteger1);
                            if(bigInteger12.testBit(v3)) {
                                BigInteger bigInteger16 = bigInteger14.multiply(bigInteger7).add(bigInteger15.multiply(bigInteger9)).mod(bigInteger1);
                                bigInteger11 = bigInteger7.multiply(bigInteger15).add(bigInteger14).mod(bigInteger1);
                                bigInteger5 = bigInteger16;
                            }
                            else {
                                bigInteger5 = bigInteger14;
                                bigInteger11 = bigInteger15;
                            }
                            --v3;
                        }
                    }
                    bigInteger7 = bigInteger5;
                }
                else {
                    bigInteger7 = bigInteger6.modPow(bigInteger1.add(BigInteger.ONE).shiftRight(2), bigInteger1);
                }
                if(bigInteger7 != null && bigInteger7.multiply(bigInteger7).mod(bigInteger1).compareTo(bigInteger6) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
            }
        label_70:
            if(!bigInteger7.testBit(0)) {
                bigInteger1.subtract(bigInteger7).mod(bigInteger1);
            }
        }
        catch(IllegalStateException illegalStateException0) {
            throw new GeneralSecurityException(illegalStateException0);
        }
        EllipticCurve ellipticCurve1 = eCPublicKey1.getParams().getCurve();
        ECPoint eCPoint1 = eCPublicKey1.getW();
        zzghq.a(eCPoint1, ellipticCurve1);
        int v4 = (zzghq.zza(ellipticCurve1).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        switch(v1 - 1) {
            case 0: {
                int v5 = v4 * 2 + 1;
                arr_b5 = new byte[v5];
                byte[] arr_b6 = eCPoint1.getAffineX().toByteArray();
                byte[] arr_b7 = eCPoint1.getAffineY().toByteArray();
                System.arraycopy(arr_b7, 0, arr_b5, v5 - arr_b7.length, arr_b7.length);
                System.arraycopy(arr_b6, 0, arr_b5, v4 + 1 - arr_b6.length, arr_b6.length);
                arr_b5[0] = 4;
                break;
            }
            case 2: {
                int v6 = v4 + v4;
                arr_b3 = new byte[v6];
                byte[] arr_b8 = eCPoint1.getAffineX().toByteArray();
                if(arr_b8.length > v4) {
                    arr_b8 = Arrays.copyOfRange(arr_b8, arr_b8.length - v4, arr_b8.length);
                }
                byte[] arr_b9 = eCPoint1.getAffineY().toByteArray();
                if(arr_b9.length > v4) {
                    arr_b9 = Arrays.copyOfRange(arr_b9, arr_b9.length - v4, arr_b9.length);
                }
                System.arraycopy(arr_b9, 0, arr_b3, v6 - arr_b9.length, arr_b9.length);
                System.arraycopy(arr_b8, 0, arr_b3, v4 - arr_b8.length, arr_b8.length);
                arr_b5 = arr_b3;
                break;
            }
            default: {
                arr_b3 = new byte[v4 + 1];
                byte[] arr_b4 = eCPoint1.getAffineX().toByteArray();
                System.arraycopy(arr_b4, 0, arr_b3, v4 + 1 - arr_b4.length, arr_b4.length);
                arr_b3[0] = eCPoint1.getAffineY().testBit(0) ? 3 : 2;
                arr_b5 = arr_b3;
            }
        }
        byte[] arr_b10 = zzghh.zzc(new byte[][]{arr_b5, arr_b2});
        Mac mac0 = (Mac)zzghs.zzb.zza(s);
        if(v > mac0.getMacLength() * 0xFF) {
            throw new GeneralSecurityException("size too large");
        }
        if(arr_b == null || arr_b.length == 0) {
            mac0.init(new SecretKeySpec(new byte[mac0.getMacLength()], s));
        }
        else {
            mac0.init(new SecretKeySpec(arr_b, s));
        }
        byte[] arr_b11 = mac0.doFinal(arr_b10);
        byte[] arr_b12 = new byte[v];
        mac0.init(new SecretKeySpec(arr_b11, s));
        byte[] arr_b13 = new byte[0];
        int v7 = 1;
        int v8;
        for(v8 = 0; true; v8 = v9) {
            mac0.update(arr_b13);
            mac0.update(arr_b1);
            mac0.update(((byte)v7));
            arr_b14 = mac0.doFinal();
            int v9 = v8 + arr_b14.length;
            if(v9 >= v) {
                break;
            }
            System.arraycopy(arr_b14, 0, arr_b12, v8, arr_b14.length);
            ++v7;
            arr_b13 = arr_b14;
        }
        System.arraycopy(arr_b14, 0, arr_b12, v8, v - v8);
        return new zzgho(arr_b5, arr_b12);
    }
}

