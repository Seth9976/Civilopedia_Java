package com.google.android.gms.internal.ads;

import B.k;
import android.util.Log;
import android.util.SparseArray;
import i3.e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import java.util.UUID;

public final class zzauo implements zzatw {
    public zzazc A;
    public zzazc B;
    public boolean C;
    public int D;
    public long E;
    public long F;
    public int G;
    public int H;
    public int[] I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public byte R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public zzatx X;
    public final l Y;
    public static final byte[] Z;
    public final m a;
    public static final byte[] a0;
    public final SparseArray b;
    public static final UUID b0;
    public final boolean c;
    public final zzazh d;
    public final zzazh e;
    public final zzazh f;
    public final zzazh g;
    public final zzazh h;
    public final zzazh i;
    public final zzazh j;
    public final zzazh k;
    public final zzazh l;
    public ByteBuffer m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public V0 s;
    public boolean t;
    public int u;
    public long v;
    public boolean w;
    public long x;
    public long y;
    public long z;
    public static final zzaty zza;

    static {
        zzauo.zza = new S(2);
        zzauo.Z = new byte[]{49, 10, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 0x20, 45, 45, 62, 0x20, 0x30, 0x30, 58, 0x30, 0x30, 58, 0x30, 0x30, 44, 0x30, 0x30, 0x30, 10};
        zzauo.a0 = new byte[]{0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20};
        zzauo.b0 = new UUID(0x100000000001000L, 0x800000AA00389B71L);
    }

    public zzauo() {
        this(0);
    }

    public zzauo(int v) {
        l l0 = new l(1);
        super();
        this.o = -1L;
        this.p = 0x8000000000000001L;
        this.q = 0x8000000000000001L;
        this.r = 0x8000000000000001L;
        this.x = -1L;
        this.y = -1L;
        this.z = 0x8000000000000001L;
        this.Y = l0;
        l0.g = new E9(this, 7);
        this.c = true;
        this.a = new m(1);
        this.b = new SparseArray();
        this.f = new zzazh(4);
        this.g = new zzazh(ByteBuffer.allocate(4).putInt(-1).array());
        this.h = new zzazh(4);
        this.d = new zzazh(zzazf.zza);
        this.e = new zzazh(4);
        this.i = new zzazh();
        this.j = new zzazh();
        this.k = new zzazh(8);
        this.l = new zzazh();
    }

    public final void a(int v, long v1) {
        switch(v) {
            case 0x5031: {
                if(v1 != 0L) {
                    throw new zzarw("ContentEncodingOrder " + v1 + " not supported");
                }
                break;
            }
            case 20530: {
                if(v1 != 1L) {
                    throw new zzarw("ContentEncodingScope " + v1 + " not supported");
                }
                break;
            }
            default: {
                boolean z = false;
            alab1:
                switch(v) {
                    case 0x83: {
                        this.s.c = (int)v1;
                        return;
                    }
                    case 0x88: {
                        V0 v00 = this.s;
                        if(v1 == 1L) {
                            z = true;
                        }
                        v00.L = z;
                        return;
                    }
                    case 0x9B: {
                        this.F = this.c(v1);
                        return;
                    }
                    case 0x9F: {
                        this.s.G = (int)v1;
                        return;
                    }
                    case 0xB0: {
                        this.s.j = (int)v1;
                        return;
                    }
                    case 0xB3: {
                        this.A.zzc(this.c(v1));
                        return;
                    }
                    case 0xBA: {
                        this.s.k = (int)v1;
                        return;
                    }
                    case 0xD7: {
                        this.s.b = (int)v1;
                        return;
                    }
                    case 0xE7: {
                        this.z = this.c(v1);
                        return;
                    }
                    case 0xF1: {
                        if(!this.C) {
                            this.B.zzc(v1);
                            this.C = true;
                            return;
                        }
                        break;
                    }
                    case 0xFB: {
                        this.W = true;
                        return;
                    }
                    case 16980: {
                        if(v1 != 3L) {
                            throw new zzarw("ContentCompAlgo " + v1 + " not supported");
                        }
                        break;
                    }
                    case 17029: {
                        if(v1 < 1L || v1 > 2L) {
                            throw new zzarw("DocTypeReadVersion " + v1 + " not supported");
                        }
                        break;
                    }
                    case 0x42F7: {
                        if(v1 != 1L) {
                            throw new zzarw("EBMLReadVersion " + v1 + " not supported");
                        }
                        break;
                    }
                    case 18401: {
                        if(v1 != 5L) {
                            throw new zzarw("ContentEncAlgo " + v1 + " not supported");
                        }
                        break;
                    }
                    case 18408: {
                        if(v1 != 1L) {
                            throw new zzarw("AESSettingsCipherMode " + v1 + " not supported");
                        }
                        break;
                    }
                    case 21420: {
                        this.v = v1 + this.o;
                        return;
                    }
                    case 0x53B8: {
                        switch(((int)v1)) {
                            case 0: {
                                this.s.p = 0;
                                return;
                            }
                            case 1: {
                                this.s.p = 2;
                                return;
                            }
                            case 3: {
                                this.s.p = 1;
                                return;
                            }
                        }
                        if(((int)v1) == 15) {
                            this.s.p = 3;
                            return;
                        }
                        break;
                    }
                    case 0x54B0: {
                        this.s.l = (int)v1;
                        return;
                    }
                    case 0x54B2: {
                        this.s.n = (int)v1;
                        return;
                    }
                    case 21690: {
                        this.s.m = (int)v1;
                        return;
                    }
                    case 21930: {
                        V0 v01 = this.s;
                        if(v1 == 1L) {
                            z = true;
                        }
                        v01.M = z;
                        return;
                    }
                    case 0x55B9: {
                        switch(((int)v1)) {
                            case 1: {
                                this.s.t = 2;
                                return;
                            }
                            case 2: {
                                this.s.t = 1;
                                return;
                            }
                            default: {
                                return;
                            }
                        }
                    }
                    case 0x55BA: {
                        switch(((int)v1)) {
                            case 1: {
                                this.s.s = 3;
                                return;
                            }
                            case 16: {
                                this.s.s = 6;
                                return;
                            label_50:
                                switch(((int)v1)) {
                                    case 6: 
                                    case 7: {
                                        this.s.s = 3;
                                        return;
                                    }
                                    case 18: {
                                        this.s.s = 7;
                                        return;
                                    }
                                    default: {
                                        return;
                                    }
                                }
                            }
                            default: {
                                goto label_50;
                            }
                        }
                    }
                    case 0x55BB: {
                        V0 v02 = this.s;
                        v02.q = true;
                        switch(((int)v1)) {
                            case 1: {
                                v02.r = 1;
                                return;
                            }
                            case 4: {
                                break;
                            }
                            case 9: {
                                v02.r = 6;
                                return;
                            label_103:
                                if(((int)v1) == 5 || ((int)v1) == 6 || ((int)v1) == 7) {
                                    break;
                                }
                                break alab1;
                            }
                            default: {
                                goto label_103;
                            }
                        }
                        v02.r = 2;
                        return;
                    }
                    case 0x55BC: {
                        this.s.u = (int)v1;
                        return;
                    }
                    case 0x55BD: {
                        this.s.v = (int)v1;
                        return;
                    }
                    case 0x56AA: {
                        this.s.J = v1;
                        return;
                    }
                    case 22203: {
                        this.s.K = v1;
                        return;
                    }
                    case 0x6264: {
                        this.s.H = (int)v1;
                        return;
                    }
                    case 2352003: {
                        this.s.d = (int)v1;
                        return;
                    }
                    case 2807729: {
                        this.p = v1;
                    }
                }
            }
        }
    }

    public final void b(int v, int v1, zzatv zzatv0) {
        int v22;
        zzazh zzazh2;
        long v18;
        int v17;
        int v13;
        int v9;
        int v7;
        zzazh zzazh1;
        if(v != 0xA1 && v != 0xA3) {
            switch(v) {
                case 0x4255: {
                    V0 v03 = this.s;
                    byte[] arr_b3 = new byte[v1];
                    v03.f = arr_b3;
                    zzatv0.zzh(arr_b3, 0, v1, false);
                    return;
                }
                case 18402: {
                    byte[] arr_b2 = new byte[v1];
                    zzatv0.zzh(arr_b2, 0, v1, false);
                    V0 v02 = this.s;
                    v02.g = new zzaue(1, arr_b2);
                    return;
                }
                case 0x53AB: {
                    Arrays.fill(this.h.zza, 0);
                    zzatv0.zzh(this.h.zza, 4 - v1, v1, false);
                    this.h.zzv(0);
                    this.u = (int)this.h.zzm();
                    return;
                }
                case 25506: {
                    V0 v01 = this.s;
                    byte[] arr_b1 = new byte[v1];
                    v01.h = arr_b1;
                    zzatv0.zzh(arr_b1, 0, v1, false);
                    return;
                }
                case 30322: {
                    V0 v00 = this.s;
                    byte[] arr_b = new byte[v1];
                    v00.o = arr_b;
                    zzatv0.zzh(arr_b, 0, v1, false);
                    return;
                }
                default: {
                    throw new zzarw("Unexpected id: " + v);
                }
            }
        }
        zzazh zzazh0 = this.f;
        if(this.D == 0) {
            this.J = (int)this.a.f(zzatv0, false, true, 8);
            this.K = this.a.c;
            this.F = 0x8000000000000001L;
            this.D = 1;
            zzazh0.zzr();
        }
        V0 v04 = (V0)this.b.get(this.J);
        if(v04 == null) {
            zzatv0.zzi(v1 - this.K, false);
            this.D = 0;
            return;
        }
        if(this.D == 1) {
            this.f(zzatv0, 3);
            int v2 = (zzazh0.zza[2] & 6) >> 1;
            if(v2 == 0) {
                this.H = 1;
                int[] arr_v = this.I;
                if(arr_v == null) {
                    arr_v = new int[1];
                }
                else if(arr_v.length < 1) {
                    arr_v = new int[Math.max(arr_v.length + arr_v.length, 1)];
                }
                this.I = arr_v;
                arr_v[0] = v1 - this.K - 3;
                zzazh1 = zzazh0;
                goto label_138;
            }
            else {
                if(v != 0xA3) {
                    throw new zzarw("Lacing only supported in SimpleBlocks.");
                }
                this.f(zzatv0, 4);
                int v3 = (zzazh0.zza[3] & 0xFF) + 1;
                this.H = v3;
                int[] arr_v1 = this.I;
                if(arr_v1 == null) {
                    arr_v1 = new int[v3];
                }
                else if(arr_v1.length < v3) {
                    arr_v1 = new int[Math.max(arr_v1.length + arr_v1.length, v3)];
                }
                this.I = arr_v1;
                if(v2 == 2) {
                    Arrays.fill(arr_v1, 0, this.H, (v1 - this.K - 4) / this.H);
                    zzazh1 = zzazh0;
                    goto label_138;
                }
                else if(v2 == 1) {
                    int v4 = 0;
                    int v5 = 0;
                    int v6;
                    for(v6 = 4; true; ++v6) {
                        v7 = this.H - 1;
                        if(v4 >= v7) {
                            break;
                        }
                        this.I[v4] = 0;
                        while(true) {
                            this.f(zzatv0, v6 + 1);
                            int v8 = zzazh0.zza[v6] & 0xFF;
                            int[] arr_v2 = this.I;
                            v9 = arr_v2[v4] + v8;
                            arr_v2[v4] = v9;
                            if(v8 != 0xFF) {
                                break;
                            }
                            ++v6;
                        }
                        v5 += v9;
                        ++v4;
                    }
                    this.I[v7] = v1 - this.K - v6 - v5;
                    zzazh1 = zzazh0;
                    goto label_138;
                }
                else {
                    if(v2 != 3) {
                        throw new zzarw("Unexpected lacing value: 2");
                    }
                    int v10 = 0;
                    int v11 = 0;
                    int v12 = 4;
                    while(true) {
                        v13 = this.H - 1;
                        if(v10 >= v13) {
                            goto label_136;
                        }
                        this.I[v10] = 0;
                        int v14 = v12 + 1;
                        this.f(zzatv0, v14);
                        if(zzazh0.zza[v12] == 0) {
                            throw new zzarw("No valid varint length mask found");
                        }
                        int v15 = 0;
                        while(true) {
                            if(v15 < 8) {
                                int v16 = 1 << 7 - v15;
                                if((zzazh0.zza[v12] & v16) == 0) {
                                    ++v15;
                                    continue;
                                }
                                else {
                                    v17 = v14 + v15;
                                    this.f(zzatv0, v17);
                                    v18 = (long)(zzazh0.zza[v12] & 0xFF & ~v16);
                                    while(v14 < v17) {
                                        v18 = v18 << 8 | ((long)(zzazh0.zza[v14] & 0xFF));
                                        ++v14;
                                    }
                                    zzazh2 = zzazh0;
                                    if(v10 > 0) {
                                        v18 -= (1L << v15 * 7 + 6) - 1L;
                                    }
                                    break;
                                }
                            }
                            zzazh2 = zzazh0;
                            v18 = 0L;
                            v17 = v14;
                            break;
                        }
                        if(v18 < 0xFFFFFFFF80000000L || v18 > 0x7FFFFFFFL) {
                            break;
                        }
                        int v19 = (int)v18;
                        int[] arr_v3 = this.I;
                        if(v10 != 0) {
                            v19 += arr_v3[v10 - 1];
                        }
                        arr_v3[v10] = v19;
                        v11 += v19;
                        ++v10;
                        v12 = v17;
                        zzazh0 = zzazh2;
                    }
                    throw new zzarw("EBML lacing sample size out of range.");
                label_136:
                    this.I[v13] = v1 - this.K - v12 - v11;
                    zzazh1 = zzazh0;
                label_138:
                    long v20 = this.z;
                    this.E = this.c(((long)(zzazh1.zza[1] & 0xFF | zzazh1.zza[0] << 8))) + v20;
                    int v21 = zzazh1.zza[2];
                    if(v04.c == 2) {
                        v22 = 1;
                    }
                    else if(v != 0xA3) {
                        v22 = 0;
                    }
                    else if((v21 & 0x80) == 0x80) {
                        v = 0xA3;
                        v22 = 1;
                    }
                    else {
                        v = 0xA3;
                        v22 = 0;
                    }
                    this.L = v22 | ((v21 & 8) == 8 ? 0x80000000 : 0);
                    this.D = 2;
                    this.G = 0;
                }
            }
        }
        if(v == 0xA3) {
            int v23;
            while((v23 = this.G) < this.H) {
                this.g(zzatv0, v04, this.I[v23]);
                this.d(v04, this.E + ((long)(this.G * v04.d / 1000)));
                ++this.G;
            }
            this.D = 0;
            return;
        }
        this.g(zzatv0, v04, this.I[0]);
    }

    public final long c(long v) {
        long v1 = this.p;
        if(v1 == 0x8000000000000001L) {
            throw new zzarw("Can\'t scale timecode prior to timecodeScale being set.");
        }
        return zzazo.zzj(v, v1, 1000L);
    }

    public final void d(V0 v00, long v) {
        byte[] arr_b1;
        if("S_TEXT/UTF8".equals(v00.a)) {
            zzazh zzazh0 = this.j;
            byte[] arr_b = zzazh0.zza;
            long v1 = this.F;
            if(v1 == 0x8000000000000001L) {
                arr_b1 = zzauo.a0;
            }
            else {
                long v2 = v1 - ((long)(((int)(v1 / 3600000000L)))) * 3600000000L;
                long v3 = v2 - ((long)(60000000 * ((int)(v2 / 60000000L))));
                arr_b1 = zzazo.zzq(String.format(Locale.US, "%02d:%02d:%02d,%03d", ((int)(v1 / 3600000000L)), ((int)(v2 / 60000000L)), ((int)(v3 / 1000000L)), ((int)((v3 - ((long)(((int)(v3 / 1000000L)) * 1000000))) / 1000L))));
            }
            System.arraycopy(arr_b1, 0, arr_b, 19, 12);
            v00.O.zzb(zzazh0, zzazh0.zzd());
            this.U = zzazh0.zzd() + this.U;
        }
        v00.O.zzc(v, this.L, this.U, 0, v00.g);
        this.V = true;
        this.M = 0;
        this.U = 0;
        this.T = 0;
        this.N = false;
        this.O = false;
        this.Q = false;
        this.S = 0;
        this.R = 0;
        this.P = false;
        this.i.zzr();
    }

    public final int e(zzatv zzatv0, zzauf zzauf0, int v) {
        int v2;
        zzazh zzazh0 = this.i;
        int v1 = zzazh0.zza();
        if(v1 > 0) {
            v2 = Math.min(v, v1);
            zzauf0.zzb(zzazh0, v2);
        }
        else {
            v2 = zzauf0.zzd(zzatv0, v, false);
        }
        this.M += v2;
        this.U += v2;
        return v2;
    }

    public final void f(zzatv zzatv0, int v) {
        zzazh zzazh0 = this.f;
        if(zzazh0.zzd() >= v) {
            return;
        }
        if(zzazh0.zzb() < v) {
            int v1 = zzazh0.zza.length;
            zzazh0.zzt(Arrays.copyOf(zzazh0.zza, Math.max(v1 + v1, v)), zzazh0.zzd());
        }
        zzatv0.zzh(zzazh0.zza, zzazh0.zzd(), v - zzazh0.zzd(), false);
        zzazh0.zzu(v);
    }

    public final void g(zzatv zzatv0, V0 v00, int v) {
        if("S_TEXT/UTF8".equals(v00.a)) {
            zzazh zzazh0 = this.j;
            if(zzazh0.zzb() < v + 0x20) {
                zzazh0.zza = Arrays.copyOf(zzauo.Z, v * 2 + 0x20);
            }
            zzatv0.zzh(zzazh0.zza, 0x20, v, false);
            zzazh0.zzv(0);
            zzazh0.zzu(v + 0x20);
            return;
        }
        zzauf zzauf0 = v00.O;
        zzazh zzazh1 = this.i;
        if(!this.N) {
            if(v00.e) {
                this.L &= 0xBFFFFFFF;
                int v1 = 0x80;
                zzazh zzazh2 = this.f;
                if(!this.O) {
                    zzatv0.zzh(zzazh2.zza, 0, 1, false);
                    ++this.M;
                    byte b = zzazh2.zza[0];
                    if((b & 0x80) == 0x80) {
                        throw new zzarw("Extension bit is set in signal byte");
                    }
                    this.R = b;
                    this.O = true;
                }
                int v2 = this.R;
                if((v2 & 1) == 1) {
                    this.L |= 0x40000000;
                    if(!this.P) {
                        zzazh zzazh3 = this.k;
                        zzatv0.zzh(zzazh3.zza, 0, 8, false);
                        this.M += 8;
                        this.P = true;
                        byte[] arr_b = zzazh2.zza;
                        if((v2 & 2) != 2) {
                            v1 = 0;
                        }
                        arr_b[0] = (byte)(v1 | 8);
                        zzazh2.zzv(0);
                        zzauf0.zzb(zzazh2, 1);
                        ++this.U;
                        zzazh3.zzv(0);
                        zzauf0.zzb(zzazh3, 8);
                        this.U += 8;
                    }
                    if((v2 & 2) == 2) {
                        if(!this.Q) {
                            zzatv0.zzh(zzazh2.zza, 0, 1, false);
                            ++this.M;
                            zzazh2.zzv(0);
                            this.S = zzazh2.zzg();
                            this.Q = true;
                        }
                        int v3 = this.S * 4;
                        zzazh2.zzs(v3);
                        zzatv0.zzh(zzazh2.zza, 0, v3, false);
                        this.M += v3;
                        int v4 = (this.S >> 1) + 1;
                        int v5 = v4 * 6 + 2;
                        if(this.m == null || this.m.capacity() < v5) {
                            this.m = ByteBuffer.allocate(v5);
                        }
                        this.m.position(0);
                        this.m.putShort(((short)v4));
                        int v6 = 0;
                        int v7;
                        for(v7 = 0; true; v7 = v9) {
                            int v8 = this.S;
                            if(v6 >= v8) {
                                break;
                            }
                            int v9 = zzazh2.zzi();
                            if(v6 % 2 == 0) {
                                this.m.putShort(((short)(v9 - v7)));
                            }
                            else {
                                this.m.putInt(v9 - v7);
                            }
                            ++v6;
                        }
                        int v10 = v - this.M - v7;
                        if((v8 & 1) == 1) {
                            this.m.putInt(v10);
                        }
                        else {
                            this.m.putShort(((short)v10));
                            this.m.putInt(0);
                        }
                        byte[] arr_b1 = this.m.array();
                        this.l.zzt(arr_b1, v5);
                        zzauf0.zzb(this.l, v5);
                        this.U += v5;
                    }
                }
            }
            else {
                byte[] arr_b2 = v00.f;
                if(arr_b2 != null) {
                    zzazh1.zzt(arr_b2, arr_b2.length);
                }
            }
            this.N = true;
        }
        int v11 = zzazh1.zzd() + v;
        if("V_MPEG4/ISO/AVC".equals(v00.a) || "V_MPEGH/ISO/HEVC".equals(v00.a)) {
            zzazh zzazh4 = this.e;
            byte[] arr_b3 = zzazh4.zza;
            arr_b3[0] = 0;
            arr_b3[1] = 0;
            arr_b3[2] = 0;
            int v13 = v00.P;
            while(this.M < v11) {
                int v14 = this.T;
                if(v14 == 0) {
                    int v15 = Math.min(v13, zzazh1.zza());
                    zzatv0.zzh(arr_b3, 4 - v13 + v15, v13 - v15, false);
                    if(v15 > 0) {
                        zzazh1.zzq(arr_b3, 4 - v13, v15);
                    }
                    this.M += v13;
                    zzazh4.zzv(0);
                    this.T = zzazh4.zzi();
                    this.d.zzv(0);
                    zzauf0.zzb(this.d, 4);
                    this.U += 4;
                }
                else {
                    this.T = v14 - this.e(zzatv0, zzauf0, v14);
                }
            }
        }
        else {
            int v12;
            while((v12 = this.M) < v11) {
                this.e(zzatv0, zzauf0, v11 - v12);
            }
        }
        if("A_VORBIS".equals(v00.a)) {
            this.g.zzv(0);
            zzauf0.zzb(this.g, 4);
            this.U += 4;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final void zzd(zzatx zzatx0) {
        this.X = zzatx0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final void zze(long v, long v1) {
        this.z = 0x8000000000000001L;
        this.D = 0;
        this.Y.b = 0;
        ((Stack)this.Y.e).clear();
        ((m)this.Y.f).b = 0;
        ((m)this.Y.f).c = 0;
        this.a.b = 0;
        this.a.c = 0;
        this.M = 0;
        this.U = 0;
        this.T = 0;
        this.N = false;
        this.O = false;
        this.Q = false;
        this.S = 0;
        this.R = 0;
        this.P = false;
        this.i.zzr();
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzatw
    public final int zzf(zzatv zzatv0, zzaub zzaub0) throws IOException, InterruptedException {
        String s2;
        zzauo zzauo2;
        int v34;
        long v33;
        int v32;
        int v31;
        zzauc zzauc0;
        zzauo zzauo1;
        zzazr zzazr0;
        byte[] arr_b4;
        float f;
        int v8;
        zzart zzart0;
        int v6;
        boolean z;
        int v3;
        int v2;
        String s1;
        List list0;
        Stack stack0;
        this.V = false;
        while(!this.V) {
            l l0 = this.Y;
            zzayz.zze(((E9)l0.g) != null);
        alab1:
            while(true) {
                stack0 = (Stack)l0.e;
                if(stack0.isEmpty() || zzatv0.zzd() < ((U0)stack0.peek()).b) {
                    goto label_329;
                }
                E9 e90 = (E9)l0.g;
                int v = ((U0)stack0.pop()).a;
                zzauo zzauo0 = (zzauo)e90.j;
                SparseArray sparseArray0 = zzauo0.b;
                switch(v) {
                    case 0xA0: {
                        if(zzauo0.D == 2) {
                            if(!zzauo0.W) {
                                zzauo0.L |= 1;
                            }
                            zzauo0.d(((V0)sparseArray0.get(zzauo0.J)), zzauo0.E);
                            zzauo0.D = 0;
                        }
                        goto label_487;
                    }
                    case 0xAE: {
                        String s = zzauo0.s.a;
                        if("V_VP8".equals(s) || "V_VP9".equals(s) || "V_MPEG2".equals(s) || "V_MPEG4/ISO/SP".equals(s) || "V_MPEG4/ISO/ASP".equals(s) || "V_MPEG4/ISO/AP".equals(s) || "V_MPEG4/ISO/AVC".equals(s) || "V_MPEGH/ISO/HEVC".equals(s) || "V_MS/VFW/FOURCC".equals(s) || "V_THEORA".equals(s) || "A_OPUS".equals(s) || "A_VORBIS".equals(s) || "A_AAC".equals(s) || "A_MPEG/L2".equals(s) || "A_MPEG/L3".equals(s) || "A_AC3".equals(s) || "A_EAC3".equals(s) || "A_TRUEHD".equals(s) || "A_DTS".equals(s) || "A_DTS/EXPRESS".equals(s) || "A_DTS/LOSSLESS".equals(s) || "A_FLAC".equals(s) || "A_MS/ACM".equals(s) || "A_PCM/INT/LIT".equals(s) || "S_TEXT/UTF8".equals(s) || "S_VOBSUB".equals(s) || "S_HDMV/PGS".equals(s) || "S_DVBSUB".equals(s)) {
                            V0 v00 = zzauo0.s;
                            zzatx zzatx0 = zzauo0.X;
                            int v1 = v00.b;
                            switch(v00.a) {
                                case "A_AAC": {
                                    list0 = Collections.singletonList(v00.h);
                                    s1 = "audio/mp4a-latm";
                                    v2 = -1;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_AC3": {
                                    s1 = "audio/ac3";
                                    list0 = null;
                                    v2 = -1;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_DTS": 
                                case "A_DTS/EXPRESS": {
                                    s1 = "audio/vnd.dts";
                                    list0 = null;
                                    v2 = -1;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_DTS/LOSSLESS": {
                                    s1 = "audio/vnd.dts.hd";
                                    list0 = null;
                                    v2 = -1;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_EAC3": {
                                    s1 = "audio/eac3";
                                    list0 = null;
                                    v2 = -1;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_FLAC": {
                                    list0 = Collections.singletonList(v00.h);
                                    s1 = "audio/x-flac";
                                    v2 = -1;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_MPEG/L2": {
                                    s1 = "audio/mpeg-L2";
                                    list0 = null;
                                    v2 = 0x1000;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_MPEG/L3": {
                                    s1 = "audio/mpeg";
                                    list0 = null;
                                    v2 = 0x1000;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_MS/ACM": {
                                    zzazh zzazh0 = new zzazh(v00.h);
                                    try {
                                        int v4 = zzazh0.zzf();
                                        if(v4 != 1) {
                                            if(v4 == 0xFFFE) {
                                                zzazh0.zzv(24);
                                                if(zzazh0.zzl() == zzauo.b0.getMostSignificantBits() && zzazh0.zzl() == zzauo.b0.getLeastSignificantBits()) {
                                                    goto label_85;
                                                }
                                            }
                                            goto label_83;
                                        }
                                        goto label_85;
                                    }
                                    catch(ArrayIndexOutOfBoundsException unused_ex) {
                                        throw new zzarw("Error parsing MS/ACM codec private");
                                    }
                                label_83:
                                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                    goto label_110;
                                label_85:
                                    int v5 = zzazo.zzh(v00.H);
                                    if(v5 == 0) {
                                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + v00.H + ". Setting mimeType to audio/x-unknown");
                                        goto label_110;
                                    }
                                    else {
                                        v6 = v5;
                                        goto label_103;
                                    }
                                    goto label_91;
                                }
                                case "A_OPUS": {
                                label_91:
                                    list0 = new ArrayList(3);
                                    ((ArrayList)list0).add(v00.h);
                                    ((ArrayList)list0).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(v00.J).array());
                                    ((ArrayList)list0).add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(v00.K).array());
                                    s1 = "audio/opus";
                                    v2 = 5760;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_PCM/INT/LIT": {
                                    int v7 = zzazo.zzh(v00.H);
                                    if(v7 == 0) {
                                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + v00.H + ". Setting mimeType to audio/x-unknown");
                                    }
                                    else {
                                        v6 = v7;
                                    label_103:
                                        v3 = v6;
                                        s1 = "audio/raw";
                                        list0 = null;
                                        v2 = -1;
                                        z = v00.M;
                                        zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                        v8 = 1;
                                        goto label_260;
                                    }
                                label_110:
                                    s1 = "audio/x-unknown";
                                    list0 = null;
                                    v2 = -1;
                                    v3 = -1;
                                    z = v00.M;
                                    zzart0 = zzart.zzh(Integer.toString(v1), s1, null, -1, v2, v00.G, v00.I, v3, -1, -1, list0, v00.i, ((int)z), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_TRUEHD": {
                                    zzart0 = zzart.zzh(Integer.toString(v1), "audio/true-hd", null, -1, -1, v00.G, v00.I, -1, -1, -1, null, v00.i, ((int)v00.M), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "A_VORBIS": {
                                    try {
                                        byte[] arr_b = v00.h;
                                        if(arr_b[0] != 2) {
                                            throw new zzarw("Error parsing vorbis codec private");
                                        }
                                        int v9 = 0;
                                        int v10 = 1;
                                        int v11;
                                        while((v11 = arr_b[v10]) == -1) {
                                            v9 += 0xFF;
                                            ++v10;
                                        }
                                        int v12 = v10 + 1;
                                        int v13 = v9 + v11;
                                        int v14 = 0;
                                        int v15;
                                        while((v15 = arr_b[v12]) == -1) {
                                            v14 += 0xFF;
                                            ++v12;
                                        }
                                        if(arr_b[v12 + 1] != 1) {
                                            throw new zzarw("Error parsing vorbis codec private");
                                        }
                                        byte[] arr_b1 = new byte[v13];
                                        System.arraycopy(arr_b, v12 + 1, arr_b1, 0, v13);
                                        int v16 = v12 + 1 + v13;
                                        if(arr_b[v16] != 3) {
                                            throw new zzarw("Error parsing vorbis codec private");
                                        }
                                        int v17 = v16 + (v14 + v15);
                                        if(arr_b[v17] != 5) {
                                            throw new zzarw("Error parsing vorbis codec private");
                                        }
                                        int v18 = arr_b.length - v17;
                                        byte[] arr_b2 = new byte[v18];
                                        System.arraycopy(arr_b, v17, arr_b2, 0, v18);
                                        list0 = new ArrayList(2);
                                        ((ArrayList)list0).add(arr_b1);
                                        ((ArrayList)list0).add(arr_b2);
                                    }
                                    catch(ArrayIndexOutOfBoundsException unused_ex) {
                                        throw new zzarw("Error parsing vorbis codec private");
                                    }
                                    zzart0 = zzart.zzh(Integer.toString(v1), "audio/vorbis", null, -1, 0x2000, v00.G, v00.I, -1, -1, -1, list0, v00.i, ((int)v00.M), v00.N, null);
                                    v8 = 1;
                                    goto label_260;
                                }
                                case "S_DVBSUB": {
                                    list0 = Collections.singletonList(new byte[]{v00.h[0], v00.h[1], v00.h[2], v00.h[3]});
                                    s1 = "application/dvbsubs";
                                    goto label_170;
                                }
                                case "S_HDMV/PGS": {
                                    s1 = "application/pgs";
                                    list0 = null;
                                    goto label_170;
                                }
                                case "S_TEXT/UTF8": {
                                    zzart0 = zzart.zzk(Integer.toString(v1), "application/x-subrip", null, -1, ((int)v00.M), v00.N, -1, v00.i, 0x7FFFFFFFFFFFFFFFL, Collections.emptyList());
                                    v8 = 3;
                                    goto label_260;
                                }
                                case "S_VOBSUB": {
                                    list0 = Collections.singletonList(v00.h);
                                    s1 = "application/vobsub";
                                label_170:
                                    if(!"application/vobsub".equals(s1) && !"application/pgs".equals(s1) && !"application/dvbsubs".equals(s1)) {
                                        throw new zzarw("Unexpected MIME type.");
                                    }
                                    zzart0 = zzart.zzi(Integer.toString(v1), s1, null, -1, list0, v00.N, v00.i);
                                    v8 = 3;
                                    goto label_260;
                                }
                                case "V_MPEG2": {
                                    s1 = "video/mpeg2";
                                    list0 = null;
                                    break;
                                }
                                case "V_MPEG4/ISO/AP": {
                                    list0 = v00.h == null ? null : Collections.singletonList(v00.h);
                                    s1 = "video/mp4v-es";
                                    break;
                                }
                                case "V_MPEG4/ISO/ASP": {
                                    list0 = v00.h == null ? null : Collections.singletonList(v00.h);
                                    s1 = "video/mp4v-es";
                                    break;
                                }
                                case "V_MPEG4/ISO/AVC": {
                                    zzazp zzazp0 = zzazp.zza(new zzazh(v00.h));
                                    list0 = zzazp0.zza;
                                    v00.P = zzazp0.zzb;
                                    s1 = "video/avc";
                                    break;
                                }
                                case "V_MPEG4/ISO/SP": {
                                    list0 = v00.h == null ? null : Collections.singletonList(v00.h);
                                    s1 = "video/mp4v-es";
                                    break;
                                }
                                case "V_MPEGH/ISO/HEVC": {
                                    zzazv zzazv0 = zzazv.zza(new zzazh(v00.h));
                                    list0 = zzazv0.zza;
                                    v00.P = zzazv0.zzb;
                                    s1 = "video/hevc";
                                    break;
                                }
                                case "V_MS/VFW/FOURCC": {
                                    zzazh zzazh1 = new zzazh(v00.h);
                                    try {
                                        zzazh1.zzw(16);
                                        if(zzazh1.zzk() == 0x31435657L) {
                                            int v19 = zzazh1.zzc() + 20;
                                            byte[] arr_b3 = zzazh1.zza;
                                            while(true) {
                                                if(v19 >= arr_b3.length - 4) {
                                                    throw new zzarw("Failed to find FourCC VC1 initialization data");
                                                }
                                                if(arr_b3[v19] == 0 && arr_b3[v19 + 1] == 0 && arr_b3[v19 + 2] == 1 && arr_b3[v19 + 3] == 15) {
                                                    break;
                                                }
                                                ++v19;
                                            }
                                            list0 = Collections.singletonList(Arrays.copyOfRange(arr_b3, v19, arr_b3.length));
                                        }
                                        else {
                                            list0 = null;
                                        }
                                    }
                                    catch(ArrayIndexOutOfBoundsException unused_ex) {
                                        throw new zzarw("Error parsing FourCC VC1 codec private");
                                    }
                                    if(list0 == null) {
                                        s1 = "video/x-unknown";
                                        Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                                    }
                                    else {
                                        s1 = "video/wvc1";
                                    }
                                    break;
                                }
                                case "V_THEORA": {
                                    s1 = "video/x-unknown";
                                    list0 = null;
                                    break;
                                }
                                case "V_VP8": {
                                    s1 = "video/x-vnd.on2.vp8";
                                    list0 = null;
                                    break;
                                }
                                case "V_VP9": {
                                    s1 = "video/x-vnd.on2.vp9";
                                    list0 = null;
                                    break;
                                }
                                default: {
                                    throw new zzarw("Unrecognized codec identifier.");
                                }
                            }
                            if(v00.n == 0) {
                                v00.l = v00.l == -1 ? v00.j : v00.l;
                                v00.m = v00.m == -1 ? v00.k : v00.m;
                            }
                            int v20 = v00.l;
                            if(v20 == -1) {
                                f = -1.0f;
                            }
                            else {
                                int v21 = v00.m;
                                if(v21 != -1) {
                                    f = ((float)(v00.k * v20)) / ((float)(v00.j * v21));
                                }
                            }
                            if(v00.q) {
                                if(v00.w != -1.0f && v00.x != -1.0f && v00.y != -1.0f && v00.z != -1.0f && v00.A != -1.0f && v00.B != -1.0f && v00.C != -1.0f && v00.D != -1.0f && v00.E != -1.0f && v00.F != -1.0f) {
                                    arr_b4 = new byte[25];
                                    ByteBuffer byteBuffer0 = ByteBuffer.wrap(arr_b4);
                                    byteBuffer0.put(0);
                                    byteBuffer0.putShort(((short)(((int)(v00.w * 50000.0f + 0.5f)))));
                                    byteBuffer0.putShort(((short)(((int)(v00.x * 50000.0f + 0.5f)))));
                                    byteBuffer0.putShort(((short)(((int)(v00.y * 50000.0f + 0.5f)))));
                                    byteBuffer0.putShort(((short)(((int)(v00.z * 50000.0f + 0.5f)))));
                                    byteBuffer0.putShort(((short)(((int)(v00.A * 50000.0f + 0.5f)))));
                                    byteBuffer0.putShort(((short)(((int)(v00.B * 50000.0f + 0.5f)))));
                                    byteBuffer0.putShort(((short)(((int)(v00.C * 50000.0f + 0.5f)))));
                                    byteBuffer0.putShort(((short)(((int)(v00.D * 50000.0f + 0.5f)))));
                                    byteBuffer0.putShort(((short)(((int)(v00.E + 0.5f)))));
                                    byteBuffer0.putShort(((short)(((int)(v00.F + 0.5f)))));
                                    byteBuffer0.putShort(((short)v00.u));
                                    byteBuffer0.putShort(((short)v00.v));
                                }
                                else {
                                    arr_b4 = null;
                                }
                                zzazr0 = new zzazr(v00.r, v00.t, v00.s, arr_b4);
                            }
                            else {
                                zzazr0 = null;
                            }
                            zzart0 = zzart.zzl(Integer.toString(v1), s1, null, -1, -1, v00.j, v00.k, -1.0f, list0, -1, f, v00.o, v00.p, zzazr0, v00.i);
                            v8 = 2;
                        label_260:
                            zzauf zzauf0 = zzatx0.zzbi(v00.b, v8);
                            v00.O = zzauf0;
                            zzauf0.zza(zzart0);
                            zzauo1 = zzauo0;
                            sparseArray0.put(zzauo1.s.b, zzauo1.s);
                        }
                        else {
                            zzauo1 = zzauo0;
                        }
                        zzauo1.s = null;
                        goto label_487;
                    }
                    case 0x4DBB: {
                        int v22 = zzauo0.u;
                        if(v22 == -1) {
                            throw new zzarw("Mandatory element SeekID or SeekPosition not found");
                        }
                        long v23 = zzauo0.v;
                        if(v23 == -1L) {
                            throw new zzarw("Mandatory element SeekID or SeekPosition not found");
                        }
                        if(v22 == 0x1C53BB6B) {
                            zzauo0.x = v23;
                        }
                        goto label_487;
                    }
                    case 0x6240: {
                        V0 v01 = zzauo0.s;
                        if(v01.e) {
                            zzaue zzaue0 = v01.g;
                            if(zzaue0 == null) {
                                throw new zzarw("Encrypted Track found but ContentEncKeyID was not found");
                            }
                            v01.i = new zzats(new zzatr[]{new zzatr(zzare.zzb, "video/webm", zzaue0.zzb, false)});
                        }
                        goto label_487;
                    }
                    case 0x6D80: {
                        if(zzauo0.s.e && zzauo0.s.f != null) {
                            throw new zzarw("Combining encryption and compression is not supported");
                        }
                        goto label_487;
                    }
                    case 357149030: {
                        if(zzauo0.p == 0x8000000000000001L) {
                            zzauo0.p = 1000000L;
                        }
                        long v24 = zzauo0.q;
                        if(v24 != 0x8000000000000001L) {
                            zzauo0.r = zzauo0.c(v24);
                        }
                        goto label_487;
                    }
                    case 0x1654AE6B: {
                        if(sparseArray0.size() == 0) {
                            throw new zzarw("No valid tracks were found");
                        }
                        zzauo0.X.zzb();
                        goto label_487;
                    }
                    case 0x1C53BB6B: {
                        break;
                    }
                    default: {
                        goto label_487;
                    }
                }
                if(!zzauo0.t) {
                    zzatx zzatx1 = zzauo0.X;
                    if(zzauo0.o == -1L || zzauo0.r == 0x8000000000000001L) {
                        zzauo0.A = null;
                        zzauo0.B = null;
                        zzauc0 = new zzauc(zzauo0.r);
                    }
                    else {
                        zzazc zzazc0 = zzauo0.A;
                        if(zzazc0 != null && zzazc0.zza() != 0 && (zzauo0.B != null && zzauo0.B.zza() == zzazc0.zza())) {
                            int v25 = zzazc0.zza();
                            int[] arr_v = new int[v25];
                            long[] arr_v1 = new long[v25];
                            long[] arr_v2 = new long[v25];
                            long[] arr_v3 = new long[v25];
                            for(int v26 = 0; v26 < v25; ++v26) {
                                arr_v3[v26] = zzauo0.A.zzb(v26);
                                long v27 = zzauo0.o;
                                arr_v1[v26] = zzauo0.B.zzb(v26) + v27;
                            }
                            for(int v28 = 0; v28 < v25 - 1; ++v28) {
                                arr_v[v28] = (int)(arr_v1[v28 + 1] - arr_v1[v28]);
                                arr_v2[v28] = arr_v3[v28 + 1] - arr_v3[v28];
                            }
                            arr_v[v25 - 1] = (int)(zzauo0.o + zzauo0.n - arr_v1[v25 - 1]);
                            arr_v2[v25 - 1] = zzauo0.r - arr_v3[v25 - 1];
                            zzauo0.A = null;
                            zzauo0.B = null;
                            zzauc0 = new zzatu(arr_v, arr_v1, arr_v2, arr_v3);
                        }
                    }
                    zzatx1.zzc(zzauc0);
                    zzauo0.t = true;
                    goto label_487;
                label_329:
                    int v29 = l0.b;
                    m m0 = (m)l0.f;
                    if(v29 == 0) {
                        long v30 = m0.f(zzatv0, true, false, 4);
                        if(v30 == -2L) {
                            zzatv0.zze();
                            while(true) {
                                byte[] arr_b5 = l0.a;
                                zzatv0.zzg(arr_b5, 0, 4, false);
                                v31 = m.b(arr_b5[0]);
                                if(v31 != -1 && v31 <= 4) {
                                    v32 = (int)m.d(false, v31, arr_b5);
                                    E9 e91 = (E9)l0.g;
                                    if(v32 != 357149030 && v32 != 0x1654AE6B && v32 != 0x1C53BB6B && v32 != 0x1F43B675) {
                                        goto label_342;
                                    }
                                    break;
                                }
                            label_342:
                                zzatv0.zzi(1, false);
                            }
                            zzatv0.zzi(v31, false);
                            v33 = (long)v32;
                        }
                        else {
                            v33 = v30;
                        }
                        if(v33 == -1L) {
                            return -1;
                        }
                        l0.c = (int)v33;
                        l0.b = 1;
                        l0.d = m0.f(zzatv0, false, true, 8);
                        l0.b = 2;
                    }
                    else if(v29 == 1) {
                        l0.d = m0.f(zzatv0, false, true, 8);
                        l0.b = 2;
                    }
                    v34 = l0.c;
                    zzauo2 = (zzauo)((E9)l0.g).j;
                    switch(v34) {
                        case 0xB5: 
                        case 0x4489: 
                        case 0x55D1: 
                        case 21970: 
                        case 0x55D3: 
                        case 0x55D4: 
                        case 0x55D5: 
                        case 0x55D6: 
                        case 0x55D7: 
                        case 0x55D8: 
                        case 0x55D9: 
                        case 0x55DA: {
                            goto label_456;
                        }
                        case 0xA1: 
                        case 0xA3: 
                        case 0x4255: 
                        case 18402: 
                        case 0x53AB: 
                        case 25506: 
                        case 30322: {
                            zzauo2.b(v34, ((int)l0.d), zzatv0);
                            l0.b = 0;
                            break;
                        }
                        case 0x86: 
                        case 17026: 
                        case 0x22B59C: {
                            goto label_370;
                        }
                        case 0x83: 
                        case 0x88: 
                        case 0x9B: 
                        case 0x9F: 
                        case 0xB0: 
                        case 0xB3: 
                        case 0xBA: 
                        case 0xD7: 
                        case 0xE7: 
                        case 0xF1: 
                        case 0xFB: 
                        case 16980: 
                        case 17029: 
                        case 0x42F7: 
                        case 18401: 
                        case 18408: 
                        case 0x5031: 
                        case 20530: 
                        case 21420: 
                        case 0x53B8: 
                        case 0x54B0: 
                        case 0x54B2: 
                        case 21690: 
                        case 21930: 
                        case 0x55B9: 
                        case 0x55BA: 
                        case 0x55BB: 
                        case 0x55BC: 
                        case 0x55BD: 
                        case 0x56AA: 
                        case 22203: 
                        case 0x6264: 
                        case 2352003: 
                        case 2807729: {
                            break alab1;
                        }
                        case 0xA0: 
                        case 0xAE: 
                        case 0xB7: 
                        case 0xBB: 
                        case 0xE0: 
                        case 0xE1: 
                        case 18407: 
                        case 0x4DBB: 
                        case 0x5034: 
                        case 0x5035: 
                        case 0x55B0: 
                        case 0x55D0: 
                        case 0x6240: 
                        case 0x6D80: 
                        case 30320: 
                        case 290298740: 
                        case 357149030: 
                        case 0x1654AE6B: 
                        case 0x18538067: 
                        case 0x1A45DFA3: 
                        case 0x1C53BB6B: 
                        case 0x1F43B675: {
                            goto label_387;
                        }
                        default: {
                            zzatv0.zzi(((int)l0.d), false);
                            l0.b = 0;
                            continue;
                        }
                    }
                }
                goto label_487;
            }
            long v35 = l0.d;
            if(v35 <= 8L) {
                zzauo2.a(v34, l0.b(zzatv0, ((int)v35)));
            }
            else {
                throw new zzarw("Invalid integer size: " + v35);
            label_370:
                long v36 = l0.d;
                if(v36 > 0x7FFFFFFFL) {
                    throw new zzarw("String element size: " + v36);
                }
                if(((int)v36) == 0) {
                    s2 = "";
                }
                else {
                    byte[] arr_b6 = new byte[((int)v36)];
                    zzatv0.zzh(arr_b6, 0, ((int)v36), false);
                    s2 = new String(arr_b6);
                }
                switch(v34) {
                    case 0x86: {
                        zzauo2.s.a = s2;
                        break;
                    }
                    case 17026: {
                        if(!"webm".equals(s2) && !"matroska".equals(s2)) {
                            throw new zzarw(e.f("DocType ", s2, " not supported"));
                        }
                        break;
                    }
                    case 0x22B59C: {
                        zzauo2.s.N = s2;
                        break;
                    label_387:
                        long v37 = zzatv0.zzd();
                        stack0.add(new U0(v34, l0.d + v37));
                        int v38 = l0.c;
                        long v39 = l0.d;
                        zzauo zzauo3 = (zzauo)((E9)l0.g).j;
                        switch(v38) {
                            case 0xA0: {
                                zzauo3.W = false;
                                break;
                            }
                            case 0xAE: {
                                V0 v02 = new V0();  // 初始化器: Ljava/lang/Object;-><init>()V
                                v02.j = -1;
                                v02.k = -1;
                                v02.l = -1;
                                v02.m = -1;
                                v02.n = 0;
                                v02.o = null;
                                v02.p = -1;
                                v02.q = false;
                                v02.r = -1;
                                v02.s = -1;
                                v02.t = -1;
                                v02.u = 1000;
                                v02.v = 200;
                                v02.w = -1.0f;
                                v02.x = -1.0f;
                                v02.y = -1.0f;
                                v02.z = -1.0f;
                                v02.A = -1.0f;
                                v02.B = -1.0f;
                                v02.C = -1.0f;
                                v02.D = -1.0f;
                                v02.E = -1.0f;
                                v02.F = -1.0f;
                                v02.G = 1;
                                v02.H = -1;
                                v02.I = 8000;
                                v02.J = 0L;
                                v02.K = 0L;
                                v02.M = true;
                                v02.N = "eng";
                                zzauo3.s = v02;
                                break;
                            }
                            case 0xBB: {
                                zzauo3.C = false;
                                break;
                            }
                            case 0x4DBB: {
                                zzauo3.u = -1;
                                zzauo3.v = -1L;
                                break;
                            }
                            case 0x5035: {
                                zzauo3.s.e = true;
                                break;
                            }
                            case 0x55D0: {
                                zzauo3.s.q = true;
                                break;
                            }
                            case 0x18538067: {
                                if(zzauo3.o != -1L && zzauo3.o != v37) {
                                    throw new zzarw("Multiple Segment elements not supported");
                                }
                                zzauo3.o = v37;
                                zzauo3.n = v39;
                                break;
                            }
                            case 0x1C53BB6B: {
                                zzauo3.A = new zzazc(0x20);
                                zzauo3.B = new zzazc(0x20);
                                break;
                            }
                            default: {
                                if(v38 == 0x1F43B675 && !zzauo3.t) {
                                    if(!zzauo3.c || zzauo3.x == -1L) {
                                        zzauo3.X.zzc(new zzauc(zzauo3.r));
                                        zzauo3.t = true;
                                    }
                                    else {
                                        zzauo3.w = true;
                                    }
                                }
                            }
                        }
                        l0.b = 0;
                        goto label_487;
                    label_456:
                        long v40 = l0.d;
                        if(v40 != 4L && v40 != 8L) {
                            throw new zzarw("Invalid float size: " + v40);
                        }
                        long v41 = l0.b(zzatv0, ((int)v40));
                        double f1 = ((int)v40) == 4 ? ((double)Float.intBitsToFloat(((int)v41))) : Double.longBitsToDouble(v41);
                        switch(v34) {
                            case 0xB5: {
                                zzauo2.s.I = (int)f1;
                                break;
                            }
                            case 0x4489: {
                                zzauo2.q = (long)f1;
                                break;
                            }
                            case 0x55D1: {
                                zzauo2.s.w = (float)f1;
                                break;
                            }
                            case 21970: {
                                zzauo2.s.x = (float)f1;
                                break;
                            }
                            case 0x55D3: {
                                zzauo2.s.y = (float)f1;
                                break;
                            }
                            case 0x55D4: {
                                zzauo2.s.z = (float)f1;
                                break;
                            }
                            case 0x55D5: {
                                zzauo2.s.A = (float)f1;
                                break;
                            }
                            case 0x55D6: {
                                zzauo2.s.B = (float)f1;
                                break;
                            }
                            case 0x55D7: {
                                zzauo2.s.C = (float)f1;
                                break;
                            }
                            case 0x55D8: {
                                zzauo2.s.D = (float)f1;
                                break;
                            }
                            case 0x55D9: {
                                zzauo2.s.E = (float)f1;
                                break;
                            }
                            case 0x55DA: {
                                zzauo2.s.F = (float)f1;
                            }
                        }
                    }
                }
            }
            l0.b = 0;
        label_487:
            long v42 = zzatv0.zzd();
            if(this.w) {
                this.y = v42;
                zzaub0.zza = this.x;
                this.w = false;
                return 1;
            }
            if(this.t) {
                long v43 = this.y;
                if(v43 != -1L) {
                    zzaub0.zza = v43;
                    this.y = -1L;
                    return 1;
                }
                if(false) {
                    break;
                }
            }
        }
        return 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzatw
    public final boolean zzg(zzatv zzatv0) throws IOException, InterruptedException {
        k k0 = new k(2);
        long v = zzatv0.zzc();
        long v1 = 0x400L;
        int v2 = Long.compare(v, -1L);
        if(v2 != 0 && v <= 0x400L) {
            v1 = v;
        }
        zzazh zzazh0 = (zzazh)k0.j;
        zzatv0.zzg(zzazh0.zza, 0, 4, false);
        long v3 = zzazh0.zzm();
        k0.i = 4;
        while(v3 != 0x1A45DFA3L) {
            int v4 = k0.i + 1;
            k0.i = v4;
            if(v4 == ((int)v1)) {
                return false;
            }
            zzatv0.zzg(zzazh0.zza, 0, 1, false);
            v3 = v3 << 8 & 0xFFFFFFFFFFFFFF00L | ((long)(zzazh0.zza[0] & 0xFF));
        }
        long v5 = k0.c(zzatv0);
        long v6 = (long)k0.i;
        if(v5 != 0x8000000000000000L && (v2 == 0 || v6 + v5 < v)) {
            while(true) {
                int v7 = Long.compare(k0.i, v6 + v5);
                if(v7 < 0) {
                    if(k0.c(zzatv0) == 0x8000000000000000L) {
                        break;
                    }
                    long v8 = k0.c(zzatv0);
                    int v9 = Long.compare(v8, 0L);
                    if(v9 < 0) {
                        break;
                    }
                    if(v9 == 0) {
                        continue;
                    }
                    zzatv0.zzf(((int)v8), false);
                    k0.i = (int)(((long)k0.i) + v8);
                    continue;
                }
                return v7 == 0;
            }
        }
        return false;
    }
}

