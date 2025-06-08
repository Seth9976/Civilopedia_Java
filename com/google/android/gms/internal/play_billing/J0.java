package com.google.android.gms.internal.play_billing;

import A.f;
import java.util.logging.Level;

public final class j0 extends zzgr {
    public final byte[] d;
    public final int e;
    public int f;

    public j0(byte[] arr_b, int v) {
        if((arr_b.length - v | v) < 0) {
            throw new IllegalArgumentException(f.d(arr_b.length, v, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.d = arr_b;
        this.f = 0;
        this.e = v;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void a(int v, zzim zzim0, I0 i00) {
        this.zzt(v << 3 | 2);
        this.zzt(((zzfv)zzim0).a(i00));
        i00.b(zzim0, this.a);
    }

    public final void d(int v, byte[] arr_b) {
        try {
            System.arraycopy(arr_b, 0, this.d, this.f, v);
            this.f += v;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgp(((long)this.f), ((long)this.e), v, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final int zza() {
        return this.e - this.f;
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzb(byte b) {
        int v;
        try {
            v = this.f;
            this.d[v] = b;
            this.f = v + 1;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgp(((long)(v + 1)), ((long)this.e), 1, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzd(int v, boolean z) {
        this.zzt(v << 3);
        this.zzb(((byte)z));
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zze(int v, zzgk zzgk0) {
        this.zzt(v << 3 | 2);
        this.zzt(zzgk0.zzd());
        zzgk0.i(this);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzf(int v, int v1) {
        this.zzt(v << 3 | 5);
        this.zzg(v1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzg(int v) {
        int v1;
        try {
            v1 = this.f;
            this.d[v1] = (byte)(v & 0xFF);
            this.d[v1 + 1] = (byte)(v >> 8 & 0xFF);
            this.d[v1 + 2] = (byte)(v >> 16 & 0xFF);
            this.d[v1 + 3] = (byte)(v >> 24 & 0xFF);
            this.f = v1 + 4;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgp(((long)v1), ((long)this.e), 4, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzh(int v, long v1) {
        this.zzt(v << 3 | 1);
        this.zzi(v1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzi(long v) {
        int v1;
        try {
            v1 = this.f;
            this.d[v1] = (byte)(((int)v) & 0xFF);
            this.d[v1 + 1] = (byte)(((int)(v >> 8)) & 0xFF);
            this.d[v1 + 2] = (byte)(((int)(v >> 16)) & 0xFF);
            this.d[v1 + 3] = (byte)(((int)(v >> 24)) & 0xFF);
            this.d[v1 + 4] = (byte)(((int)(v >> 0x20)) & 0xFF);
            this.d[v1 + 5] = (byte)(((int)(v >> 40)) & 0xFF);
            this.d[v1 + 6] = (byte)(((int)(v >> 0x30)) & 0xFF);
            this.d[v1 + 7] = (byte)(((int)(v >> 56)) & 0xFF);
            this.f = v1 + 8;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgp(((long)v1), ((long)this.e), 8, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzj(int v, int v1) {
        this.zzt(v << 3);
        this.zzk(v1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzk(int v) {
        if(v >= 0) {
            this.zzt(v);
            return;
        }
        this.zzv(((long)v));
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzl(byte[] arr_b, int v, int v1) {
        this.d(v1, arr_b);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzn(int v, zzim zzim0) {
        this.zzt(11);
        this.zzs(2, v);
        this.zzt(26);
        this.zzt(zzim0.zzk());
        zzim0.zzJ(this);
        this.zzt(12);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzo(int v, zzgk zzgk0) {
        this.zzt(11);
        this.zzs(2, v);
        this.zze(3, zzgk0);
        this.zzt(12);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzp(int v, String s) {
        S0 s01;
        this.zzt(v << 3 | 2);
        int v1 = this.f;
        try {
            int v2 = zzgr.zzz(s.length());
            int v3 = this.e;
            byte[] arr_b = this.d;
            if(v2 == zzgr.zzz(s.length() * 3)) {
                int v4 = v1 + v2;
                this.f = v4;
                int v5 = T0.b(s, arr_b, v4, v3 - v4);
                this.f = v1;
                this.zzt(v5 - v1 - v2);
                this.f = v5;
                return;
            }
            this.zzt(T0.c(s));
            this.f = T0.b(s, arr_b, this.f, v3 - this.f);
            return;
        label_19:
            s01 = s00;
        }
        catch(S0 s00) {
            goto label_19;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgp(indexOutOfBoundsException0);
        }
        this.f = v1;
        zzgr.b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", s01);
        byte[] arr_b1 = s.getBytes(zzhp.a);
        try {
            this.zzt(arr_b1.length);
            this.d(arr_b1.length, arr_b1);
            return;
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException1) {
            throw new zzgp(indexOutOfBoundsException1);
        }
        throw new zzgp(indexOutOfBoundsException0);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzr(int v, int v1) {
        this.zzt(v << 3 | v1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzs(int v, int v1) {
        this.zzt(v << 3);
        this.zzt(v1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzt(int v) {
        try {
            while(true) {
                byte[] arr_b = this.d;
                if((v & 0xFFFFFF80) == 0) {
                    int v1 = this.f;
                    this.f = v1 + 1;
                    arr_b[v1] = (byte)v;
                    return;
                }
                int v2 = this.f;
                this.f = v2 + 1;
                arr_b[v2] = (byte)((v | 0x80) & 0xFF);
                v >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgp(((long)this.f), ((long)this.e), 1, indexOutOfBoundsException0);
        }
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzu(int v, long v1) {
        this.zzt(v << 3);
        this.zzv(v1);
    }

    @Override  // com.google.android.gms.internal.play_billing.zzgr
    public final void zzv(long v) {
        int v1 = this.e;
        byte[] arr_b = this.d;
        if(zzgr.c && v1 - this.f >= 10) {
            long v2;
            for(v2 = v; Long.compare(v2 & 0xFFFFFFFFFFFFFF80L, 0L) != 0; v2 >>>= 7) {
                int v3 = this.f;
                this.f = v3 + 1;
                R0.c.d(arr_b, R0.f + ((long)v3), ((byte)((((int)v2) | 0x80) & 0xFF)));
            }
            int v4 = this.f;
            this.f = v4 + 1;
            R0.c.d(arr_b, R0.f + ((long)v4), ((byte)(((int)v2))));
            return;
        }
        long v5 = v;
        try {
            while(true) {
                if((v5 & 0xFFFFFFFFFFFFFF80L) == 0L) {
                    int v6 = this.f;
                    this.f = v6 + 1;
                    arr_b[v6] = (byte)(((int)v5));
                    return;
                }
                int v7 = this.f;
                this.f = v7 + 1;
                arr_b[v7] = (byte)((((int)v5) | 0x80) & 0xFF);
                v5 >>>= 7;
            }
        }
        catch(IndexOutOfBoundsException indexOutOfBoundsException0) {
            throw new zzgp(((long)this.f), ((long)v1), 1, indexOutOfBoundsException0);
        }
    }
}

