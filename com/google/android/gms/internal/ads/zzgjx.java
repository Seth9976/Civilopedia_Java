package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzgjx extends zzgix {
    public n9 a;
    public static final Logger b;
    public static final boolean c;

    static {
        zzgjx.b = Logger.getLogger(zzgjx.class.getName());
        zzgjx.c = ia.e;
    }

    public final void a(String s, ja ja0) {
        zzgjx.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ja0);
        byte[] arr_b = s.getBytes(zzgla.a);
        try {
            this.zzs(arr_b.length);
            this.zza(arr_b, 0, arr_b.length);
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgju(indexOutOfBoundsException0);
        }
    }

    public abstract void b(int arg1, zzgma arg2, T9 arg3);

    public static int c(int v, zzgma zzgma0, T9 t90) {
        int v1 = zzgjx.zzE(v << 3);
        int v2 = ((zzgir)zzgma0).a();
        if(v2 == -1) {
            v2 = t90.c(((zzgir)zzgma0));
            ((zzgir)zzgma0).c(v2);
        }
        return v1 * 2 + v2;
    }

    public static int zzC(String s) {
        int v;
        try {
            v = ka.c(s);
            return zzgjx.zzE(v) + v;
        }
        catch(ja unused_ex) {
            v = s.getBytes(zzgla.a).length;
            return zzgjx.zzE(v) + v;
        }
    }

    public static int zzD(int v) {
        return zzgjx.zzE(v << 3);
    }

    public static int zzE(int v) [...] // Potential decryptor

    public static int zzF(long v) {
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

    public static zzgjx zzG(byte[] arr_b) {
        return new l9(arr_b, arr_b.length);
    }

    public static zzgjx zzH(OutputStream outputStream0, int v) {
        return new m9(outputStream0, v);
    }

    public final void zzI() {
        if(this.zzb() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void zzN() throws IOException;

    public abstract void zzO(byte arg1) throws IOException;

    public abstract void zzP(int arg1, boolean arg2) throws IOException;

    public abstract void zzQ(int arg1, zzgji arg2) throws IOException;

    @Override  // com.google.android.gms.internal.ads.zzgix
    public abstract void zza(byte[] arg1, int arg2, int arg3) throws IOException;

    public abstract int zzb();

    public abstract void zzh(int arg1, int arg2) throws IOException;

    public abstract void zzi(int arg1) throws IOException;

    public abstract void zzj(int arg1, long arg2) throws IOException;

    public abstract void zzk(long arg1) throws IOException;

    public abstract void zzl(int arg1, int arg2) throws IOException;

    public abstract void zzm(int arg1) throws IOException;

    public abstract void zzo(int arg1, String arg2) throws IOException;

    public abstract void zzq(int arg1, int arg2) throws IOException;

    public abstract void zzr(int arg1, int arg2) throws IOException;

    public abstract void zzs(int arg1) throws IOException;

    public abstract void zzt(int arg1, long arg2) throws IOException;

    public abstract void zzu(long arg1) throws IOException;

    public static int zzw(zzgji zzgji0) {
        int v = zzgji0.zzd();
        return zzgjx.zzE(v) + v;
    }

    public static int zzy(int v) {
        return v < 0 ? 10 : zzgjx.zzE(v);
    }

    public static int zzz(zzglg zzglg0) {
        int v = zzglg0.zza();
        return zzgjx.zzE(v) + v;
    }
}

