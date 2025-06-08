package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class zzaag implements zzyr {
    public final byte[] a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public boolean f;
    public int g;
    public zzyu h;
    public zzzy i;
    public boolean j;
    public static final int[] k;
    public static final int[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final int o;
    public static final zzyy zza;

    static {
        zzaag.zza = zzaaf.zza;
        zzaag.k = new int[]{13, 14, 16, 18, 20, 21, 27, 0x20, 6, 7, 6, 6, 1, 1, 1, 1};
        zzaag.l = new int[]{18, 24, 33, 37, 41, 0x2F, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        zzaag.m = new byte[]{35, 33, 65, 77, 82, 10};
        zzaag.n = new byte[]{35, 33, 65, 77, 82, 45, 87, 66, 10};
        zzaag.o = 61;
    }

    public zzaag() {
        this(0);
    }

    public zzaag(int v) {
        this.a = new byte[1];
        this.g = -1;
    }

    public final boolean a(zzys zzys0) {
        zzys0.zzj();
        byte[] arr_b = zzaag.m;
        byte[] arr_b1 = new byte[arr_b.length];
        ((zzyl)zzys0).zzm(arr_b1, 0, arr_b.length, false);
        if(Arrays.equals(arr_b1, arr_b)) {
            this.b = false;
            ((zzyl)zzys0).zzo(arr_b.length, false);
            return true;
        }
        zzys0.zzj();
        byte[] arr_b2 = zzaag.n;
        byte[] arr_b3 = new byte[arr_b2.length];
        ((zzyl)zzys0).zzm(arr_b3, 0, arr_b2.length, false);
        if(Arrays.equals(arr_b3, arr_b2)) {
            this.b = true;
            ((zzyl)zzys0).zzo(arr_b2.length, false);
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        zzcw.zzb(this.i);
        if(zzys0.zzf() == 0L && !this.a(zzys0)) {
            throw zzbp.zza("Could not find AMR header.", null);
        }
        if(!this.j) {
            this.j = true;
            boolean z = this.b;
            zzzy zzzy0 = this.i;
            zzab zzab0 = new zzab();
            zzab0.zzS((z ? "audio/amr-wb" : "audio/3gpp"));
            zzab0.zzL(zzaag.o);
            zzab0.zzw(1);
            zzab0.zzT((z ? 16000 : 8000));
            zzzy0.zzk(zzab0.zzY());
        }
        byte[] arr_b = this.a;
        int v = this.e;
        int v1 = -1;
        if(v == 0) {
            try {
                zzys0.zzj();
                ((zzyl)zzys0).zzm(arr_b, 0, 1, false);
                int v2 = arr_b[0];
                if((v2 & 0x83) > 0) {
                    throw zzbp.zza(("Invalid padding bits for frame header " + v2), null);
                }
                String s = "WB";
                int v3 = v2 >> 3 & 15;
                boolean z1 = this.b;
                if((!z1 || v3 >= 10 && v3 <= 13) && (z1 || v3 >= 12 && v3 <= 14)) {
                    if(!z1) {
                        s = "NB";
                    }
                    throw zzbp.zza(("Illegal AMR " + s + " frame type " + v3), null);
                }
                v = z1 ? zzaag.l[v3] : zzaag.k[v3];
            }
            catch(EOFException unused_ex) {
                goto label_44;
            }
            this.d = v;
            this.e = v;
            if(this.g == -1) {
                this.g = v;
            }
        }
        int v4 = zzzw.zza(this.i, zzys0, v, true);
        if(v4 != -1) {
            int v5 = this.e - v4;
            this.e = v5;
            if(v5 <= 0) {
                this.i.zzs(this.c, 1, this.d, 0, null);
                this.c += 20000L;
            }
            v1 = 0;
        }
    label_44:
        if(this.f) {
            return v1;
        }
        zzzt zzzt0 = new zzzt(0x8000000000000001L, 0L);
        this.h.zzL(zzzt0);
        this.f = true;
        return v1;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.h = zzyu0;
        this.i = zzyu0.zzv(0, 1);
        zzyu0.zzB();
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        this.c = 0L;
        this.d = 0;
        this.e = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        return this.a(zzys0);
    }
}

