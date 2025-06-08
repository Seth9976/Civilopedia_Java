package com.google.android.gms.internal.ads;

public abstract class f1 {
    public static final int[] a;

    static {
        f1.a = new int[]{zzazo.zzg("isom"), zzazo.zzg("iso2"), zzazo.zzg("iso3"), zzazo.zzg("iso4"), zzazo.zzg("iso5"), zzazo.zzg("iso6"), zzazo.zzg("avc1"), zzazo.zzg("hvc1"), zzazo.zzg("hev1"), zzazo.zzg("mp41"), zzazo.zzg("mp42"), zzazo.zzg("3g2a"), zzazo.zzg("3g2b"), zzazo.zzg("3gr6"), zzazo.zzg("3gs6"), zzazo.zzg("3ge6"), zzazo.zzg("3gg6"), zzazo.zzg("M4V "), zzazo.zzg("M4A "), zzazo.zzg("f4v "), zzazo.zzg("kddi"), zzazo.zzg("M4VP"), zzazo.zzg("qt  "), zzazo.zzg("MSNV")};
    }

    public static boolean a(zzatv zzatv0, boolean z) {
        long v5;
        int v4;
        long v = zzatv0.zzc();
        if(v == -1L || v > 0x1000L) {
            v = 0x1000L;
        }
        zzazh zzazh0 = new zzazh(0x40);
        int v1 = 0;
        boolean z1 = false;
        while(v1 < ((int)v)) {
            zzazh0.zzs(8);
            zzatv0.zzg(zzazh0.zza, 0, 8, false);
            long v2 = zzazh0.zzm();
            int v3 = zzazh0.zze();
            if(v2 == 1L) {
                zzatv0.zzg(zzazh0.zza, 8, 8, false);
                v4 = 16;
                zzazh0.zzu(16);
                v5 = zzazh0.zzn();
            }
            else {
                v5 = v2;
                v4 = 8;
            }
            if(v5 < ((long)v4)) {
                return false;
            }
            v1 += v4;
            if(v3 != Y0.C) {
                if(v3 == Y0.L || v3 == Y0.N) {
                    return z1 && z;
                }
                if(((long)v1) + v5 - ((long)v4) >= ((long)(((int)v)))) {
                    break;
                }
                int v6 = (int)(v5 - ((long)v4));
                v1 += v6;
                if(v3 == Y0.b) {
                    if(v6 < 8) {
                        return false;
                    }
                    zzazh0.zzs(v6);
                    zzatv0.zzg(zzazh0.zza, 0, v6, false);
                    int v7 = v6 >> 2;
                    int v8 = 0;
                    while(v8 < v7) {
                        if(v8 == 1) {
                            zzazh0.zzw(4);
                        }
                        else {
                            int v9 = zzazh0.zze();
                            if(v9 >>> 8 == zzazo.zzg("3gp")) {
                                goto label_50;
                            }
                            else {
                                int[] arr_v = f1.a;
                                int v10 = 0;
                                while(v10 < 24) {
                                    if(arr_v[v10] == v9) {
                                        goto label_50;
                                    }
                                    ++v10;
                                }
                            }
                        }
                        ++v8;
                        continue;
                    label_50:
                        z1 = true;
                        break;
                    }
                    if(z1) {
                        continue;
                    }
                    return false;
                }
                if(v6 != 0) {
                    zzatv0.zzf(v6, false);
                }
            }
        }
        return z1 && !z;
    }
}

