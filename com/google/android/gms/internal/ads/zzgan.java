package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

public final class zzgan {
    public static final byte[] a;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] zza;
    public static final byte[] zzb;
    public static final byte[] zzc;
    public static final byte[] zzd;
    public static final byte[] zze;
    public static final byte[] zzf;
    public static final byte[] zzg;

    static {
        zzgan.zza = new byte[]{0};
        zzgan.zzb = new byte[]{0, 0x20};
        zzgan.zzc = new byte[]{0, 1};
        zzgan.zzd = new byte[]{0, 1};
        zzgan.zze = new byte[]{0, 2};
        zzgan.zzf = new byte[]{0, 3};
        zzgan.zzg = new byte[0];
        zzgan.a = new byte[]{75, 69, 77};
        zzgan.b = new byte[]{72, 80, 75, 69};
        zzgan.c = new byte[]{72, 80, 75, 69, 45, 0x76, 49};
    }

    public static void a(zzgfa zzgfa0) {
        String s = "UNRECOGNIZED";
        switch(zzgfa0.zzg()) {
            case 1: 
            case 2: {
                throw new GeneralSecurityException("Invalid KEM param: " + zzgeu.zza(zzgfa0.zzg()));
            }
            default: {
                switch(zzgfa0.zzf()) {
                    case 1: 
                    case 2: {
                        switch(zzgfa0.zzf()) {
                            case 2: {
                                s = "KDF_UNKNOWN";
                                break;
                            }
                            case 3: {
                                s = "HKDF_SHA256";
                            }
                        }
                        throw new GeneralSecurityException("Invalid KDF param: " + s);
                    }
                    default: {
                        switch(zzgfa0.zze()) {
                            case 1: 
                            case 2: {
                                switch(zzgfa0.zze()) {
                                    case 2: {
                                        s = "AEAD_UNKNOWN";
                                        break;
                                    }
                                    case 3: {
                                        s = "AES_128_GCM";
                                        break;
                                    }
                                    case 4: {
                                        s = "AES_256_GCM";
                                        break;
                                    }
                                    case 5: {
                                        s = "CHACHA20_POLY1305";
                                    }
                                }
                                throw new GeneralSecurityException("Invalid AEAD param: " + s);
                            }
                        }
                    }
                }
            }
        }
    }

    public static byte[] zzc(int v, int v1) [...] // Potential decryptor
}

