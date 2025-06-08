package com.google.android.gms.internal.ads;

import B.k;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public final class zzadg implements zzyr {
    public long A;
    public long B;
    public zzdo C;
    public zzdo D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final l a;
    public boolean a0;
    public final m b;
    public zzyu b0;
    public final SparseArray c;
    public static final byte[] c0;
    public final boolean d;
    public static final byte[] d0;
    public final zzdy e;
    public static final byte[] e0;
    public final zzdy f;
    public static final byte[] f0;
    public final zzdy g;
    public static final UUID g0;
    public final zzdy h;
    public static final Map h0;
    public final zzdy i;
    public final zzdy j;
    public final zzdy k;
    public final zzdy l;
    public final zzdy m;
    public final zzdy n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public zzadf u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;
    public static final zzyy zza;

    static {
        zzadg.zza = zzadc.zza;
        zzadg.c0 = new byte[]{49, 10, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 0x20, 45, 45, 62, 0x20, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 10};
        zzadg.d0 = new byte[]{70, 0x6F, 0x72, 109, 97, 0x74, 58, 0x20, 83, 0x74, 97, 0x72, 0x74, 44, 0x20, 69, 110, 100, 44, 0x20, 82, 101, 97, 100, 0x4F, 0x72, 100, 101, 0x72, 44, 0x20, 76, 97, 0x79, 101, 0x72, 44, 0x20, 83, 0x74, 0x79, 108, 101, 44, 0x20, 78, 97, 109, 101, 44, 0x20, 77, 97, 0x72, 103, 105, 110, 76, 44, 0x20, 77, 97, 0x72, 103, 105, 110, 82, 44, 0x20, 77, 97, 0x72, 103, 105, 110, 86, 44, 0x20, 69, 102, 102, 101, 99, 0x74, 44, 0x20, 84, 101, 120, 0x74};
        zzadg.e0 = new byte[]{68, 105, 97, 108, 0x6F, 103, 0x75, 101, 58, 0x20, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44};
        zzadg.f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 46, 0x30, 0x30, 0x30, 0x20, 45, 45, 62, 0x20, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 46, 0x30, 0x30, 0x30, 10};
        zzadg.g0 = new UUID(0x100000000001000L, 0x800000AA00389B71L);
        HashMap hashMap0 = new HashMap();
        hashMap0.put("htc_video_rotA-000", 0);
        hashMap0.put("htc_video_rotA-090", 90);
        hashMap0.put("htc_video_rotA-180", 180);
        hashMap0.put("htc_video_rotA-270", 270);
        zzadg.h0 = Collections.unmodifiableMap(hashMap0);
    }

    public zzadg() {
        this(0);
    }

    public zzadg(int v) {
        l l0 = new l(0);
        super();
        this.q = -1L;
        this.r = 0x8000000000000001L;
        this.s = 0x8000000000000001L;
        this.t = 0x8000000000000001L;
        this.z = -1L;
        this.A = -1L;
        this.B = 0x8000000000000001L;
        this.a = l0;
        l0.g = new E9(this, 1);
        this.d = true;
        this.b = new m(0);
        this.c = new SparseArray();
        this.g = new zzdy(4);
        this.h = new zzdy(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new zzdy(4);
        this.e = new zzdy(zzzo.zza);
        this.f = new zzdy(4);
        this.j = new zzdy();
        this.k = new zzdy();
        this.l = new zzdy(8);
        this.m = new zzdy();
        this.n = new zzdy();
        this.L = new int[1];
    }

    public final void a(int v, double f) {
        switch(v) {
            case 0xB5: {
                this.e(0xB5);
                this.u.zzP = (int)f;
                return;
            }
            case 0x4489: {
                this.s = (long)f;
                return;
            }
            case 0x55D1: {
                this.e(0x55D1);
                this.u.zzC = (float)f;
                return;
            }
            case 21970: {
                this.e(21970);
                this.u.zzD = (float)f;
                return;
            }
            case 0x55D3: {
                this.e(0x55D3);
                this.u.zzE = (float)f;
                return;
            }
            case 0x55D4: {
                this.e(0x55D4);
                this.u.zzF = (float)f;
                return;
            }
            case 0x55D5: {
                this.e(0x55D5);
                this.u.zzG = (float)f;
                return;
            }
            case 0x55D6: {
                this.e(0x55D6);
                this.u.zzH = (float)f;
                return;
            }
            case 0x55D7: {
                this.e(0x55D7);
                this.u.zzI = (float)f;
                return;
            }
            case 0x55D8: {
                this.e(0x55D8);
                this.u.zzJ = (float)f;
                return;
            }
            case 0x55D9: {
                this.e(0x55D9);
                this.u.zzK = (float)f;
                return;
            }
            case 0x55DA: {
                this.e(0x55DA);
                this.u.zzL = (float)f;
                return;
            }
            case 30323: {
                this.e(30323);
                this.u.zzr = (float)f;
                return;
            }
            case 30324: {
                this.e(30324);
                this.u.zzs = (float)f;
                return;
            }
            case 30325: {
                this.e(30325);
                this.u.zzt = (float)f;
            }
        }
    }

    public final int b(zzys zzys0, zzadf zzadf0, int v, boolean z) {
        int v18;
        int v23;
        if("S_TEXT/UTF8".equals(zzadf0.zzb)) {
            this.i(zzys0, zzadg.c0, v);
            int v1 = this.T;
            this.h();
            return v1;
        }
        if("S_TEXT/ASS".equals(zzadf0.zzb)) {
            this.i(zzys0, zzadg.e0, v);
            int v2 = this.T;
            this.h();
            return v2;
        }
        if("S_TEXT/WEBVTT".equals(zzadf0.zzb)) {
            this.i(zzys0, zzadg.f0, v);
            int v3 = this.T;
            this.h();
            return v3;
        }
        zzzy zzzy0 = zzadf0.zzV;
        boolean z1 = true;
        zzdy zzdy0 = this.j;
        if(!this.V) {
            zzdy zzdy1 = this.g;
            if(zzadf0.zzg) {
                this.O &= 0xBFFFFFFF;
                if(!this.W) {
                    ((zzyl)zzys0).zzn(zzdy1.zzH(), 0, 1, false);
                    ++this.S;
                    if((zzdy1.zzH()[0] & 0x80) == 0x80) {
                        throw zzbp.zza("Extension bit is set in signal byte", null);
                    }
                    this.Z = zzdy1.zzH()[0];
                    this.W = true;
                }
                int v4 = this.Z;
                if((v4 & 1) == 1) {
                    this.O |= 0x40000000;
                    if(!this.a0) {
                        ((zzyl)zzys0).zzn(this.l.zzH(), 0, 8, false);
                        this.S += 8;
                        this.a0 = true;
                        zzdy1.zzH()[0] = (byte)(((v4 & 2) == 2 ? 0x80 : 0) | 8);
                        zzdy1.zzF(0);
                        zzzy0.zzr(zzdy1, 1, 1);
                        ++this.T;
                        this.l.zzF(0);
                        zzzy0.zzr(this.l, 8, 1);
                        this.T += 8;
                    }
                    if((v4 & 2) == 2) {
                        if(!this.X) {
                            ((zzyl)zzys0).zzn(zzdy1.zzH(), 0, 1, false);
                            ++this.S;
                            zzdy1.zzF(0);
                            this.Y = zzdy1.zzk();
                            this.X = true;
                        }
                        int v5 = this.Y * 4;
                        zzdy1.zzC(v5);
                        ((zzyl)zzys0).zzn(zzdy1.zzH(), 0, v5, false);
                        this.S += v5;
                        int v6 = (this.Y >> 1) + 1;
                        int v7 = v6 * 6 + 2;
                        if(this.o == null || this.o.capacity() < v7) {
                            this.o = ByteBuffer.allocate(v7);
                        }
                        this.o.position(0);
                        this.o.putShort(((short)v6));
                        int v8 = 0;
                        int v9;
                        for(v9 = 0; true; v9 = v11) {
                            int v10 = this.Y;
                            if(v8 >= v10) {
                                break;
                            }
                            int v11 = zzdy1.zzn();
                            if(v8 % 2 == 0) {
                                this.o.putShort(((short)(v11 - v9)));
                            }
                            else {
                                this.o.putInt(v11 - v9);
                            }
                            ++v8;
                        }
                        int v12 = v - this.S - v9;
                        if((v10 & 1) == 1) {
                            this.o.putInt(v12);
                        }
                        else {
                            this.o.putShort(((short)v12));
                            this.o.putInt(0);
                        }
                        byte[] arr_b = this.o.array();
                        this.m.zzD(arr_b, v7);
                        zzzy0.zzr(this.m, v7, 1);
                        this.T += v7;
                    }
                }
            }
            else {
                byte[] arr_b1 = zzadf0.zzh;
                if(arr_b1 != null) {
                    zzdy0.zzD(arr_b1, arr_b1.length);
                }
            }
            if(!"A_OPUS".equals(zzadf0.zzb)) {
                if(zzadf0.zzf > 0) {
                label_91:
                    this.O |= 0x10000000;
                    this.n.zzC(0);
                    int v13 = zzdy0.zzd() + v - this.S;
                    zzdy1.zzC(4);
                    zzdy1.zzH()[0] = (byte)(v13 >> 24 & 0xFF);
                    zzdy1.zzH()[1] = (byte)(v13 >> 16 & 0xFF);
                    zzdy1.zzH()[2] = (byte)(v13 >> 8 & 0xFF);
                    zzdy1.zzH()[3] = (byte)(v13 & 0xFF);
                    zzzy0.zzr(zzdy1, 4, 2);
                    this.T += 4;
                }
            }
            else if(z) {
                goto label_91;
            }
            this.V = true;
        }
        int v14 = zzdy0.zzd() + v;
        if("V_MPEG4/ISO/AVC".equals(zzadf0.zzb) || "V_MPEGH/ISO/HEVC".equals(zzadf0.zzb)) {
            zzdy zzdy2 = this.f;
            byte[] arr_b2 = zzdy2.zzH();
            arr_b2[0] = 0;
            arr_b2[1] = 0;
            arr_b2[2] = 0;
            int v19 = zzadf0.zzW;
            while(this.S < v14) {
                int v20 = this.U;
                if(v20 == 0) {
                    int v21 = Math.min(v19, zzdy0.zza());
                    ((zzyl)zzys0).zzn(arr_b2, 4 - v19 + v21, v19 - v21, false);
                    if(v21 > 0) {
                        zzdy0.zzB(arr_b2, 4 - v19, v21);
                    }
                    this.S += v19;
                    zzdy2.zzF(0);
                    this.U = zzdy2.zzn();
                    this.e.zzF(0);
                    zzzw.zzb(zzzy0, this.e, 4);
                    this.T += 4;
                }
                else {
                    int v22 = zzdy0.zza();
                    if(v22 > 0) {
                        v23 = Math.min(v20, v22);
                        zzzw.zzb(zzzy0, zzdy0, v23);
                    }
                    else {
                        v23 = zzzw.zza(zzzy0, zzys0, v20, false);
                    }
                    this.S += v23;
                    this.T += v23;
                    this.U -= v23;
                }
            }
        }
        else {
            if(zzadf0.zzS != null) {
                if(zzdy0.zzd() != 0) {
                    z1 = false;
                }
                zzcw.zzf(z1);
                zzadf0.zzS.zzd(zzys0);
            }
            int v15;
            while((v15 = this.S) < v14) {
                int v16 = v14 - v15;
                int v17 = zzdy0.zza();
                if(v17 > 0) {
                    v18 = Math.min(v16, v17);
                    zzzw.zzb(zzzy0, zzdy0, v18);
                }
                else {
                    v18 = zzzw.zza(zzzy0, zzys0, v16, false);
                }
                this.S += v18;
                this.T += v18;
            }
        }
        if("A_VORBIS".equals(zzadf0.zzb)) {
            this.h.zzF(0);
            zzzw.zzb(zzzy0, this.h, 4);
            this.T += 4;
        }
        int v24 = this.T;
        this.h();
        return v24;
    }

    public final long c(long v) {
        long v1 = this.r;
        if(v1 == 0x8000000000000001L) {
            throw zzbp.zza("Can\'t scale timecode prior to timecodeScale being set.", null);
        }
        return zzeg.zzw(v, v1, 1000L);
    }

    public final void d(int v) {
        if(this.C == null || this.D == null) {
            throw zzbp.zza(("Element " + v + " must be in a Cues"), null);
        }
    }

    public final void e(int v) {
        if(this.u == null) {
            throw zzbp.zza(("Element " + v + " must be in a TrackEntry"), null);
        }
    }

    public final void f(zzadf zzadf0, long v, int v1, int v2, int v3) {
        int v6;
        byte[] arr_b1;
        int v4;
        zzzz zzzz0 = zzadf0.zzS;
        if(zzzz0 == null) {
            if(!"S_TEXT/UTF8".equals(zzadf0.zzb) && !"S_TEXT/ASS".equals(zzadf0.zzb) && !"S_TEXT/WEBVTT".equals(zzadf0.zzb)) {
                v4 = v2;
            }
            else if(this.K > 1) {
                Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                v4 = v2;
            }
            else {
                long v5 = this.I;
                if(v5 == 0x8000000000000001L) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    v4 = v2;
                }
                else {
                    String s = zzadf0.zzb;
                    zzdy zzdy0 = this.k;
                    byte[] arr_b = zzdy0.zzH();
                    switch(s) {
                        case "S_TEXT/ASS": {
                            arr_b1 = zzadg.j("%01d:%02d:%02d:%02d", v5, 10000L);
                            v6 = 21;
                            break;
                        }
                        case "S_TEXT/UTF8": {
                            arr_b1 = zzadg.j("%02d:%02d:%02d,%03d", v5, 1000L);
                            v6 = 19;
                            break;
                        }
                        case "S_TEXT/WEBVTT": {
                            arr_b1 = zzadg.j("%02d:%02d:%02d.%03d", v5, 1000L);
                            v6 = 25;
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException();
                        }
                    }
                    System.arraycopy(arr_b1, 0, arr_b, v6, arr_b1.length);
                    for(int v7 = zzdy0.zzc(); v7 < zzdy0.zzd(); ++v7) {
                        if(zzdy0.zzH()[v7] == 0) {
                            zzdy0.zzE(v7);
                            break;
                        }
                    }
                    zzzw.zzb(zzadf0.zzV, zzdy0, zzdy0.zzd());
                    v4 = zzdy0.zzd() + v2;
                }
            }
            if((v1 & 0x10000000) != 0) {
                zzdy zzdy1 = this.n;
                if(this.K > 1) {
                    zzdy1.zzC(0);
                }
                else {
                    int v8 = zzdy1.zzd();
                    zzadf0.zzV.zzr(zzdy1, v8, 2);
                    v4 += v8;
                }
            }
            zzadf0.zzV.zzs(v, v1, v4, v3, zzadf0.zzi);
        }
        else {
            zzzz0.zzc(zzadf0.zzV, v, v1, v2, v3, zzadf0.zzi);
        }
        this.F = true;
    }

    public final void g(zzys zzys0, int v) {
        zzdy zzdy0 = this.g;
        if(zzdy0.zzd() >= v) {
            return;
        }
        if(zzdy0.zzb() < v) {
            int v1 = zzdy0.zzb();
            zzdy0.zzz(Math.max(v1 + v1, v));
        }
        ((zzyl)zzys0).zzn(zzdy0.zzH(), zzdy0.zzd(), v - zzdy0.zzd(), false);
        zzdy0.zzE(v);
    }

    public final void h() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = 0;
        this.a0 = false;
        this.j.zzC(0);
    }

    public final void i(zzys zzys0, byte[] arr_b, int v) {
        int v1 = arr_b.length + v;
        zzdy zzdy0 = this.k;
        if(zzdy0.zzb() < v1) {
            byte[] arr_b1 = Arrays.copyOf(arr_b, v1 + v);
            zzdy0.zzD(arr_b1, arr_b1.length);
        }
        else {
            System.arraycopy(arr_b, 0, zzdy0.zzH(), 0, arr_b.length);
        }
        ((zzyl)zzys0).zzn(zzdy0.zzH(), arr_b.length, v, false);
        zzdy0.zzF(0);
        zzdy0.zzE(v1);
    }

    public static byte[] j(String s, long v, long v1) {
        zzcw.zzd(v != 0x8000000000000001L);
        long v2 = v - ((long)(((int)(v / 3600000000L)))) * 3600000000L;
        long v3 = v2 - ((long)(((int)(v2 / 60000000L)))) * 60000000L;
        return zzeg.zzZ(String.format(Locale.US, s, ((int)(v / 3600000000L)), ((int)(v2 / 60000000L)), ((int)(v3 / 1000000L)), ((int)((v3 - ((long)(((int)(v3 / 1000000L)))) * 1000000L) / v1))));
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final int zza(zzys zzys0, zzzr zzzr0) throws IOException {
        this.F = false;
        while(!this.F) {
            if(this.a.a(zzys0)) {
                long v1 = zzys0.zzf();
                if(this.y) {
                    this.A = v1;
                    zzzr0.zza = this.z;
                    this.y = false;
                    return 1;
                }
                if(!this.v) {
                    continue;
                }
                long v2 = this.A;
                if(v2 == -1L) {
                    continue;
                }
                zzzr0.zza = v2;
                this.A = -1L;
                return 1;
            }
            for(int v = 0; true; ++v) {
                SparseArray sparseArray0 = this.c;
                if(v >= sparseArray0.size()) {
                    break;
                }
                zzadf zzadf0 = (zzadf)sparseArray0.valueAt(v);
                zzadf0.zzV.getClass();
                zzzz zzzz0 = zzadf0.zzS;
                if(zzzz0 != null) {
                    zzzz0.zza(zzadf0.zzV, zzadf0.zzi);
                }
            }
            return -1;
        }
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyu0) {
        this.b0 = zzyu0;
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long v, long v1) {
        this.B = 0x8000000000000001L;
        this.G = 0;
        this.a.b = 0;
        ((ArrayDeque)this.a.e).clear();
        ((m)this.a.f).b = 0;
        ((m)this.a.f).c = 0;
        this.b.b = 0;
        this.b.c = 0;
        this.h();
        for(int v2 = 0; true; ++v2) {
            SparseArray sparseArray0 = this.c;
            if(v2 >= sparseArray0.size()) {
                break;
            }
            zzzz zzzz0 = ((zzadf)sparseArray0.valueAt(v2)).zzS;
            if(zzzz0 != null) {
                zzzz0.zzb();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzys0) throws IOException {
        k k0 = new k(1);
        long v = zzys0.zzd();
        long v1 = 0x400L;
        int v2 = Long.compare(v, -1L);
        if(v2 != 0 && v <= 0x400L) {
            v1 = v;
        }
        zzdy zzdy0 = (zzdy)k0.j;
        ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 4, false);
        long v3 = zzdy0.zzs();
        k0.i = 4;
        while(v3 != 0x1A45DFA3L) {
            int v4 = k0.i + 1;
            k0.i = v4;
            if(v4 == ((int)v1)) {
                return false;
            }
            ((zzyl)zzys0).zzm(zzdy0.zzH(), 0, 1, false);
            v3 = v3 << 8 & 0xFFFFFFFFFFFFFF00L | ((long)(zzdy0.zzH()[0] & 0xFF));
        }
        long v5 = k0.d(zzys0);
        long v6 = (long)k0.i;
        if(v5 != 0x8000000000000000L && (v2 == 0 || v6 + v5 < v)) {
            while(true) {
                int v7 = Long.compare(k0.i, v6 + v5);
                if(v7 < 0) {
                    if(k0.d(zzys0) == 0x8000000000000000L) {
                        break;
                    }
                    long v8 = k0.d(zzys0);
                    int v9 = Long.compare(v8, 0L);
                    if(v9 < 0) {
                        break;
                    }
                    if(v9 == 0) {
                        continue;
                    }
                    ((zzyl)zzys0).zzl(((int)v8), false);
                    k0.i += (int)v8;
                    continue;
                }
                return v7 == 0;
            }
        }
        return false;
    }
}

