package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.logging.Logger;

public abstract class zzgr extends zzgc {
    public k0 a;
    public static final Logger b;
    public static final boolean c;

    static {
        zzgr.b = Logger.getLogger(zzgr.class.getName());
        zzgr.c = R0.e;
    }

    public abstract void a(int arg1, zzim arg2, I0 arg3);

    public static int b(int v, zzim zzim0, I0 i00) {
        int v1 = zzgr.zzz(v << 3);
        return ((zzfv)zzim0).a(i00) + (v1 + v1);
    }

    public static int c(zzim zzim0, I0 i00) {
        int v = ((zzfv)zzim0).a(i00);
        return zzgr.zzz(v) + v;
    }

    public static int zzA(long v) {
        return 640 - Long.numberOfLeadingZeros(v) * 9 >>> 6;
    }

    public final void zzB() {
        if(this.zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract int zza();

    public abstract void zzb(byte arg1) throws IOException;

    public abstract void zzd(int arg1, boolean arg2) throws IOException;

    public abstract void zze(int arg1, zzgk arg2) throws IOException;

    public abstract void zzf(int arg1, int arg2) throws IOException;

    public abstract void zzg(int arg1) throws IOException;

    public abstract void zzh(int arg1, long arg2) throws IOException;

    public abstract void zzi(long arg1) throws IOException;

    public abstract void zzj(int arg1, int arg2) throws IOException;

    public abstract void zzk(int arg1) throws IOException;

    public abstract void zzl(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract void zzn(int arg1, zzim arg2) throws IOException;

    public abstract void zzo(int arg1, zzgk arg2) throws IOException;

    public abstract void zzp(int arg1, String arg2) throws IOException;

    public abstract void zzr(int arg1, int arg2) throws IOException;

    public abstract void zzs(int arg1, int arg2) throws IOException;

    public abstract void zzt(int arg1) throws IOException;

    public abstract void zzu(int arg1, long arg2) throws IOException;

    public abstract void zzv(long arg1) throws IOException;

    public static int zzy(String s) {
        int v;
        try {
            v = T0.c(s);
            return zzgr.zzz(v) + v;
        }
        catch(S0 unused_ex) {
            v = s.getBytes(zzhp.a).length;
            return zzgr.zzz(v) + v;
        }
    }

    public static int zzz(int v) [...] // Potential decryptor
}

