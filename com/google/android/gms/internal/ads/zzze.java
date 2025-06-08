package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

public final class zzze {
    public final zzbl a;
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    public final zzzd zzk;

    public zzze(int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, zzzd zzzd0, zzbl zzbl0) {
        this.zza = v;
        this.zzb = v1;
        this.zzc = v2;
        this.zzd = v3;
        this.zze = v4;
        this.zzf = zzze.b(v4);
        this.zzg = v5;
        this.zzh = v6;
        this.zzi = zzze.a(v6);
        this.zzj = v7;
        this.zzk = zzzd0;
        this.a = zzbl0;
    }

    public zzze(byte[] arr_b, int v) {
        zzdx zzdx0 = new zzdx(arr_b, arr_b.length);
        zzdx0.zzh(v * 8);
        this.zza = zzdx0.zzc(16);
        this.zzb = zzdx0.zzc(16);
        this.zzc = zzdx0.zzc(24);
        this.zzd = zzdx0.zzc(24);
        int v1 = zzdx0.zzc(20);
        this.zze = v1;
        this.zzf = zzze.b(v1);
        this.zzg = zzdx0.zzc(3) + 1;
        int v2 = zzdx0.zzc(5);
        this.zzh = v2 + 1;
        this.zzi = zzze.a(v2 + 1);
        this.zzj = zzeg.zzy(zzdx0.zzc(4), zzdx0.zzc(0x20));
        this.zzk = null;
        this.a = null;
    }

    public static int a(int v) {
        switch(v) {
            case 8: {
                return 1;
            }
            case 12: {
                return 2;
            }
            case 16: {
                return 4;
            }
            case 20: {
                return 5;
            }
            case 24: {
                return 6;
            }
            default: {
                return -1;
            }
        }
    }

    public static int b(int v) {
        switch(v) {
            case 8000: {
                return 4;
            }
            case 16000: {
                return 5;
            }
            case 22050: {
                return 6;
            }
            case 24000: {
                return 7;
            }
            case 32000: {
                return 8;
            }
            case 44100: {
                return 9;
            }
            case 48000: {
                return 10;
            }
            case 88200: {
                return 1;
            }
            case 96000: {
                return 11;
            }
            case 176400: {
                return 2;
            }
            case 192000: {
                return 3;
            }
            default: {
                return -1;
            }
        }
    }

    public final long zza() {
        return this.zzj == 0L ? 0x8000000000000001L : this.zzj * 1000000L / ((long)this.zze);
    }

    public final long zzb(long v) {
        return zzeg.zzr(v * ((long)this.zze) / 1000000L, 0L, this.zzj - 1L);
    }

    public final zzad zzc(byte[] arr_b, zzbl zzbl0) {
        arr_b[4] = (byte)0x80;
        zzbl zzbl1 = this.zzd(zzbl0);
        zzab zzab0 = new zzab();
        zzab0.zzS("audio/flac");
        zzab0.zzL((this.zzd > 0 ? this.zzd : -1));
        zzab0.zzw(this.zzg);
        zzab0.zzT(this.zze);
        zzab0.zzI(Collections.singletonList(arr_b));
        zzab0.zzM(zzbl1);
        return zzab0.zzY();
    }

    public final zzbl zzd(zzbl zzbl0) {
        return this.a == null ? zzbl0 : this.a.zzd(zzbl0);
    }

    public final zzze zze(List list0) {
        zzbl zzbl0 = this.zzd(new zzbl(list0));
        return new zzze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzbl0);
    }

    public final zzze zzf(zzzd zzzd0) {
        return new zzze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzzd0, this.a);
    }

    public final zzze zzg(List list0) {
        zzbl zzbl0 = this.zzd(zzaae.zzb(list0));
        return new zzze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzbl0);
    }
}

