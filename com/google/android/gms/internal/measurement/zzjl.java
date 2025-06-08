package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.logging.Logger;

public abstract class zzjl extends zzit {
    public S a;
    public static final Logger b;
    public static final boolean c;

    static {
        zzjl.b = Logger.getLogger(zzjl.class.getName());
        zzjl.c = F0.e;
    }

    public static int a(int v, zzll zzll0, s0 s00) {
        int v1 = zzjl.zzA(v << 3);
        int v2 = ((zzin)zzll0).a();
        if(v2 == -1) {
            v2 = s00.zza(((zzin)zzll0));
            ((zzin)zzll0).c(v2);
        }
        return v1 * 2 + v2;
    }

    public static int zzA(int v) [...] // Potential decryptor

    public static int zzB(long v) {
        int v1;
        if((0xFFFFFFFFFFFFFF80L & v) == 0L) {
            return 1;
        }
        if(v < 0L) {
            return 10;
        }
        if((0xFFFFFFF800000000L & v) == 0L) {
            v1 = 2;
        }
        else {
            v >>>= 28;
            v1 = 6;
        }
        if((0xFFFFFFFFFFE00000L & v) != 0L) {
            v1 += 2;
            v >>>= 14;
        }
        return (v & 0xFFFFFFFFFFFFC000L) == 0L ? v1 : v1 + 1;
    }

    public static zzjl zzC(byte[] arr_b) {
        return new Q(arr_b, arr_b.length);
    }

    public final void zzD() {
        if(this.zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte arg1) throws IOException;

    public abstract void zzd(int arg1, boolean arg2) throws IOException;

    public abstract void zze(int arg1, zzjd arg2) throws IOException;

    public abstract void zzf(int arg1, int arg2) throws IOException;

    public abstract void zzg(int arg1) throws IOException;

    public abstract void zzh(int arg1, long arg2) throws IOException;

    public abstract void zzi(long arg1) throws IOException;

    public abstract void zzj(int arg1, int arg2) throws IOException;

    public abstract void zzk(int arg1) throws IOException;

    public abstract void zzl(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract void zzm(int arg1, String arg2) throws IOException;

    public abstract void zzo(int arg1, int arg2) throws IOException;

    public abstract void zzp(int arg1, int arg2) throws IOException;

    public abstract void zzq(int arg1) throws IOException;

    public abstract void zzr(int arg1, long arg2) throws IOException;

    public abstract void zzs(long arg1) throws IOException;

    public static int zzt(zzjd zzjd0) {
        int v = zzjd0.zzd();
        return zzjl.zzA(v) + v;
    }

    public static int zzv(int v) {
        return v < 0 ? 10 : zzjl.zzA(v);
    }

    public static int zzw(zzkr zzkr0) {
        int v = zzkr0.zza();
        return zzjl.zzA(v) + v;
    }

    public static int zzy(String s) {
        int v;
        try {
            v = H0.c(s);
            return zzjl.zzA(v) + v;
        }
        catch(G0 unused_ex) {
            v = s.getBytes(zzkm.a).length;
            return zzjl.zzA(v) + v;
        }
    }

    public static int zzz(int v) {
        return zzjl.zzA(v << 3);
    }
}

