package com.google.android.gms.internal.ads;

import L.a;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

public final class I0 implements Handler.Callback, zzawy, zzaxa, zzayd {
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public long G;
    public int H;
    public H0 I;
    public long J;
    public G0 K;
    public G0 L;
    public G0 M;
    public zzase N;
    public boolean O;
    public boolean P;
    public int Q;
    public volatile int R;
    public volatile int S;
    public final zzcio T;
    public final zzary[] i;
    public final zzarz[] j;
    public final zzaye k;
    public final zzazk l;
    public final Handler m;
    public final HandlerThread n;
    public final a o;
    public final F0 p;
    public final zzasd q;
    public final zzasc r;
    public zzaro s;
    public zzarx t;
    public zzary u;
    public zzazd v;
    public zzaxb w;
    public zzary[] x;
    public boolean y;
    public boolean z;

    public I0(zzary[] arr_zzary, zzaye zzaye0, zzcio zzcio0, boolean z, a a0, zzaro zzaro0, F0 f00) {
        this.i = arr_zzary;
        this.k = zzaye0;
        this.T = zzcio0;
        this.z = z;
        this.D = 0;
        this.o = a0;
        this.C = 1;
        this.s = zzaro0;
        this.p = f00;
        this.j = new zzarz[2];
        for(int v = 0; v < 2; ++v) {
            arr_zzary[v].zzw(v);
            this.j[v] = arr_zzary[v].zzf();
        }
        this.l = new zzazk();
        this.x = new zzary[0];
        this.q = new zzasd();
        this.r = new zzasc();
        zzaye0.zzf(this);
        this.t = zzarx.zza;
        HandlerThread handlerThread0 = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.n = handlerThread0;
        handlerThread0.start();
        this.m = new Handler(handlerThread0.getLooper(), this);
    }

    public final void a(int v, Object object0) {
        this.s = new zzaro(0, 0L);
        this.d(v, object0);
        this.s = new zzaro(0, 0x8000000000000001L);
        this.j(4);
        this.e(false);
    }

    public final void b() {
        long v = this.K.j ? this.K.a.zza() : 0L;
        if(v == 0x8000000000000000L) {
            this.h(false);
            return;
        }
        long v1 = this.J - (this.K.f - this.K.h);
        boolean z = this.T.zzj(v - v1);
        this.h(z);
        if(z) {
            this.K.a.zzbj(v1);
        }
    }

    public final void c() {
        if(this.K != null && !this.K.j && (this.L == null || this.L.l == this.K)) {
            zzary[] arr_zzary = this.x;
            for(int v = 0; v < arr_zzary.length; ++v) {
                if(!arr_zzary[v].zzA()) {
                    return;
                }
            }
            this.K.a.zzs();
        }
    }

    public final void d(int v, Object object0) {
        zzarq zzarq0 = new zzarq(this.N, object0, this.s, v);
        this.o.obtainMessage(6, zzarq0).sendToTarget();
    }

    public final void e(boolean z) {
        this.m.removeMessages(2);
        this.A = false;
        this.l.zzc();
        this.v = null;
        this.u = null;
        this.J = 60000000L;
        zzary[] arr_zzary = this.x;
        for(int v = 0; v < arr_zzary.length; ++v) {
            zzary zzary0 = arr_zzary[v];
            try {
                if(zzary0.zzb() == 2) {
                    zzary0.zzz();
                }
                zzary0.zzj();
            }
            catch(zzarf | RuntimeException zzarf0) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", zzarf0);
            }
        }
        this.x = new zzary[0];
        G0 g00 = this.M;
        if(g00 == null) {
            g00 = this.K;
        }
        while(g00 != null) {
            g00.b();
            g00 = g00.l;
        }
        this.K = null;
        this.L = null;
        this.M = null;
        this.h(false);
        if(z) {
            zzaxb zzaxb0 = this.w;
            if(zzaxb0 != null) {
                zzaxb0.zzd();
                this.w = null;
            }
            this.N = null;
        }
    }

    public final void f(long v) {
        long v1 = this.M == null ? v + 60000000L : v + (this.M.f - this.M.h);
        this.J = v1;
        this.l.zza(v1);
        zzary[] arr_zzary = this.x;
        for(int v2 = 0; v2 < arr_zzary.length; ++v2) {
            arr_zzary[v2].zzu(this.J);
        }
    }

    public final void g(long v, long v1) {
        Handler handler0 = this.m;
        handler0.removeMessages(2);
        long v2 = v + v1 - SystemClock.elapsedRealtime();
        if(v2 <= 0L) {
            handler0.sendEmptyMessage(2);
            return;
        }
        handler0.sendEmptyMessageDelayed(2, v2);
    }

    public final void h(boolean z) {
        if(this.B != z) {
            this.B = z;
            this.o.obtainMessage(2, ((int)z), 0).sendToTarget();
        }
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        RuntimeException runtimeException1;
        IOException iOException2;
        zzarf zzarf2;
        G0 g018;
        zzary zzary4;
        int v38;
        G0 g016;
        boolean z9;
        G0 g015;
        G0 g013;
        long v34;
        G0 g012;
        Pair pair5;
        G0 g011;
        G0 g010;
        Pair pair4;
        int v27;
        Object object0;
        Message message1;
        long v25;
        long v24;
        int v23;
        int v22;
        long v18;
        boolean z3;
        long v16;
        zzayf zzayf2;
        int v6;
        int v5;
        long v4;
        long v1 = 0L;
        try {
            switch(message0.what) {
                case 0: {
                    goto label_4;
                }
                case 1: {
                    goto label_16;
                }
                case 2: {
                    goto label_36;
                }
                case 3: {
                    goto label_236;
                }
                case 4: {
                    goto label_274;
                }
                case 5: {
                    goto label_283;
                }
                case 6: {
                    goto label_285;
                }
                case 7: {
                    goto label_296;
                }
                case 8: {
                    goto label_379;
                }
                case 9: {
                    goto label_392;
                }
                case 10: {
                    goto label_395;
                }
                case 11: {
                    goto label_461;
                }
                case 12: {
                    goto label_480;
                }
            }
        }
        catch(zzarf zzarf0) {
            goto label_525;
        }
        catch(IOException iOException0) {
            iOException2 = iOException0;
            goto label_530;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_535;
        }
        return false;
        try {
            try {
            label_4:
                zzaxb zzaxb0 = (zzaxb)message0.obj;
                int v2 = message0.arg1;
                this.o.sendEmptyMessage(0);
                this.e(true);
                this.T.zza();
                if(v2 != 0) {
                    this.s = new zzaro(0, 0x8000000000000001L);
                }
                this.w = zzaxb0;
                zzaxb0.zzb(this.p, true, this);
                this.j(2);
                this.m.sendEmptyMessage(2);
                return true;
            label_16:
                this.A = false;
                this.z = message0.arg1 != 0;
                if(message0.arg1 == 0) {
                    this.l();
                    this.m();
                    return true;
                }
                switch(this.C) {
                    case 2: {
                        this.m.sendEmptyMessage(2);
                        return true;
                    }
                    case 3: {
                        break;
                    }
                    default: {
                        return true;
                    }
                }
            }
            catch(zzarf zzarf0) {
                goto label_525;
            }
            catch(IOException iOException0) {
                iOException2 = iOException0;
                goto label_530;
            }
            try {
                this.A = false;
                this.l.zzb();
                zzary[] arr_zzary = this.x;
                for(int v3 = 0; v3 < arr_zzary.length; ++v3) {
                    arr_zzary[v3].zzy();
                }
            }
            catch(zzarf zzarf1) {
                zzarf2 = zzarf1;
                goto label_526;
            }
            catch(IOException iOException1) {
                iOException2 = iOException1;
                goto label_530;
            }
            try {
                this.m.sendEmptyMessage(2);
                return true;
            label_36:
                v4 = SystemClock.elapsedRealtime();
                if(this.N == null) {
                    this.w.zza();
                }
                else {
                    G0 g00 = this.K;
                    if(g00 == null) {
                        v5 = this.s.zza;
                        goto label_52;
                    }
                    else {
                        v6 = g00.g;
                        if(!g00.i) {
                            goto label_46;
                        }
                    }
                    goto label_78;
                }
                goto label_155;
            }
            catch(zzarf zzarf0) {
                goto label_525;
            }
            catch(IOException iOException0) {
                iOException2 = iOException0;
                goto label_530;
            }
            try {
            label_46:
                if(g00.j && (!g00.k || g00.a.zzg() == 0x8000000000000000L)) {
                    goto label_49;
                }
                else {
                    goto label_47;
                }
                goto label_50;
            }
            catch(zzarf zzarf1) {
                zzarf2 = zzarf1;
                goto label_526;
            }
            catch(IOException iOException1) {
                iOException2 = iOException1;
                goto label_530;
            }
        label_47:
            boolean z = false;
            goto label_50;
        label_49:
            z = true;
            try {
            label_50:
                if(z && (this.N.zzd(v6, this.r, false).zzc != 0x8000000000000001L && (this.M == null || this.K.c - this.M.c != 100))) {
                    v5 = this.N.zzf(v6, this.r, this.q, this.D);
                label_52:
                    if(v5 >= this.N.zzb()) {
                        this.w.zza();
                    }
                    else if(this.K == null) {
                        v1 = this.s.zzc;
                        goto label_65;
                    }
                    else {
                        this.N.zzd(v5, this.r, false);
                        this.N.zzg(0, this.q, false);
                        if(v5 == 0) {
                            long v7 = Math.max(0L, this.K.f - this.K.h + this.N.zzd(this.K.g, this.r, false).zzc - this.J);
                            Pair pair0 = this.t(this.N, 0x8000000000000001L, v7);
                            if(pair0 != null) {
                                int v8 = (int)(((Integer)pair0.first));
                                v1 = (long)(((Long)pair0.second));
                                v5 = v8;
                                goto label_65;
                            }
                        }
                        else {
                        label_65:
                            long v9 = this.K == null ? v1 + 60000000L : this.K.f - this.K.h + this.N.zzd(this.K.g, this.r, false).zzc;
                            int v10 = this.K == null ? 0 : this.K.c + 1;
                            boolean z1 = this.n(v5);
                            this.N.zzd(v5, this.r, true);
                            G0 g01 = new G0(this.i, this.j, v9, this.k, this.T, this.w, this.r.zzb, v10, v5, z1, v1);
                            G0 g02 = this.K;
                            if(g02 != null) {
                                g02.l = g01;
                            }
                            this.K = g01;
                            g01.a.zzw(this, v1);
                            this.h(true);
                        }
                    }
                }
            label_78:
                G0 g03 = this.K;
                if(g03 == null) {
                    this.h(false);
                    goto label_91;
                }
            }
            catch(zzarf zzarf0) {
                goto label_525;
            }
            catch(IOException iOException0) {
                iOException2 = iOException0;
                goto label_530;
            }
            try {
                if(g03.j && (!g03.k || g03.a.zzg() == 0x8000000000000000L)) {
                    goto label_85;
                }
                else {
                    goto label_83;
                }
                goto label_86;
            }
            catch(zzarf zzarf1) {
                zzarf2 = zzarf1;
                goto label_526;
            }
            catch(IOException iOException1) {
                iOException2 = iOException1;
                goto label_530;
            }
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_535;
        }
    label_83:
        boolean z2 = false;
        goto label_86;
    label_85:
        z2 = true;
        try {
        label_86:
            if(z2) {
                this.h(false);
            }
            else if(this.K != null && !this.B) {
                this.b();
            }
        label_91:
            if(this.M != null) {
                while(true) {
                    G0 g04 = this.M;
                    G0 g05 = this.L;
                    if(g04 == g05 || this.J < g04.l.f) {
                        break;
                    }
                    g04.b();
                    this.i(this.M.l);
                    this.s = new zzaro(this.M.g, this.M.h);
                    this.m();
                    this.o.obtainMessage(5, this.s).sendToTarget();
                }
                if(g05.i) {
                    for(int v11 = 0; v11 < 2; ++v11) {
                        zzary zzary0 = this.i[v11];
                        zzaxl zzaxl0 = this.L.d[v11];
                        if(zzaxl0 != null && zzary0.zzh() == zzaxl0 && zzary0.zzA()) {
                            zzary0.zzv();
                        }
                    }
                }
                else {
                    int v12 = 0;
                    while(v12 < 2) {
                        zzary zzary1 = this.i[v12];
                        zzaxl zzaxl1 = this.L.d[v12];
                        if(zzary1.zzh() != zzaxl1 || zzaxl1 != null && !zzary1.zzA()) {
                            goto label_155;
                        }
                        ++v12;
                    }
                    G0 g06 = this.L;
                    G0 g07 = g06.l;
                    if(g07 != null && g07.j) {
                        zzayf zzayf0 = g06.m;
                        this.L = g07;
                        zzayf zzayf1 = g07.m;
                        long v13 = g07.a.zzh();
                        int v14 = 0;
                        while(v14 < 2) {
                            zzary zzary2 = this.i[v14];
                            if(zzayf0.zzb.zza(v14) != null) {
                                if(v13 != 0x8000000000000001L) {
                                    zzary2.zzv();
                                }
                                else if(!zzary2.zzB()) {
                                    zzaxu zzaxu0 = zzayf1.zzb.zza(v14);
                                    if(zzaxu0 == null || !zzayf1.zzd[v14].equals(zzayf0.zzd[v14])) {
                                        zzayf2 = zzayf1;
                                        v16 = 0x8000000000000001L;
                                        zzary2.zzv();
                                    }
                                    else {
                                        zzart[] arr_zzart = new zzart[1];
                                        for(int v15 = 0; v15 <= 0; ++v15) {
                                            arr_zzart[v15] = zzaxu0.zzc(v15);
                                        }
                                        zzayf2 = zzayf1;
                                        v16 = 0x8000000000000001L;
                                        zzary2.zzt(arr_zzart, this.L.d[v14], this.L.f - this.L.h);
                                    }
                                    goto label_150;
                                }
                            }
                            zzayf2 = zzayf1;
                            v16 = v13;
                        label_150:
                            ++v14;
                            zzayf1 = zzayf2;
                            v13 = v16;
                        }
                    }
                }
            }
        }
        catch(zzarf zzarf0) {
            goto label_525;
        }
        catch(IOException iOException0) {
            iOException2 = iOException0;
            goto label_530;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_535;
        }
        try {
            try {
            label_155:
                if(this.M == null) {
                    this.c();
                    this.g(v4, 10L);
                    return true;
                }
                zzazm.zza("doSomeWork");
                this.m();
                this.M.a.zzq(this.s.zzc);
                zzary[] arr_zzary1 = this.x;
                z3 = true;
                boolean z4 = true;
                for(int v17 = 0; v17 < arr_zzary1.length; ++v17) {
                    zzary zzary3 = arr_zzary1[v17];
                    zzary3.zzD(this.J, this.G);
                    z4 = z4 && zzary3.zzE();
                    boolean z5 = zzary3.zzF() || zzary3.zzE();
                    if(!z5) {
                        zzary3.zzm();
                    }
                    z3 = z3 && z5;
                }
                if(!z3) {
                    this.c();
                }
                zzazd zzazd0 = this.v;
                if(zzazd0 != null) {
                    zzarx zzarx0 = zzazd0.zzJ();
                    if(!zzarx0.equals(this.t)) {
                        this.t = zzarx0;
                        this.l.zzd(this.v);
                        this.o.obtainMessage(7, zzarx0).sendToTarget();
                    }
                }
                v18 = this.N.zzd(this.M.g, this.r, false).zzc;
                if(!z4 || v18 != 0x8000000000000001L && v18 > this.s.zzc || !this.M.i) {
                    switch(this.C) {
                        case 2: {
                            if(this.x.length <= 0) {
                                if(this.o(v18)) {
                                label_204:
                                    this.j(3);
                                    if(this.z) {
                                        goto label_206;
                                    }
                                }
                            }
                            else if(z3) {
                                boolean z6 = this.A;
                                G0 g08 = this.K;
                                long v19 = g08.j ? g08.a.zzg() : g08.h;
                                if(v19 == 0x8000000000000000L) {
                                    G0 g09 = this.K;
                                    if(g09.i) {
                                        goto label_204;
                                    }
                                    else {
                                        v19 = this.N.zzd(g09.g, this.r, false).zzc;
                                        goto label_201;
                                    }
                                }
                                else {
                                label_201:
                                    if((this.O ? this.T.zzk(this.s.zzd - (this.J - (this.K.f - this.K.h)), z6) : this.T.zzk(v19 - (this.J - (this.K.f - this.K.h)), z6))) {
                                        goto label_204;
                                    }
                                }
                            }
                            break;
                        }
                        case 3: {
                            goto label_214;
                        }
                    }
                }
                else {
                    this.j(4);
                    this.l();
                }
                goto label_220;
            }
            catch(zzarf zzarf0) {
                goto label_525;
            }
            catch(IOException iOException0) {
                iOException2 = iOException0;
                goto label_530;
            }
            try {
            label_206:
                this.A = false;
                this.l.zzb();
                zzary[] arr_zzary2 = this.x;
                int v20 = 0;
                while(true) {
                    if(v20 >= arr_zzary2.length) {
                        goto label_220;
                    }
                    arr_zzary2[v20].zzy();
                    ++v20;
                }
            }
            catch(zzarf zzarf1) {
                zzarf2 = zzarf1;
                goto label_526;
            }
            catch(IOException iOException1) {
                iOException2 = iOException1;
                goto label_530;
            }
            try {
            label_214:
                if(this.x.length <= 0) {
                    z3 = this.o(v18);
                }
                if(!z3) {
                    this.A = this.z;
                    this.j(2);
                    this.l();
                }
            label_220:
                if(this.C == 2) {
                    zzary[] arr_zzary3 = this.x;
                    for(int v21 = 0; v21 < arr_zzary3.length; ++v21) {
                        arr_zzary3[v21].zzm();
                    }
                }
                if(this.z && this.C == 3 || this.C == 2) {
                    this.g(v4, (this.R <= 0 ? 10L : ((long)this.R)));
                }
                else if(this.x.length == 0) {
                    this.m.removeMessages(2);
                }
                else {
                    this.g(v4, (this.S <= 0 ? 1000L : ((long)this.S)));
                }
                zzazm.zzb();
                return true;
            label_236:
                H0 h00 = (H0)message0.obj;
                if(this.N == null) {
                    ++this.H;
                    this.I = h00;
                    return true;
                }
                Pair pair1 = this.u(h00);
                if(pair1 == null) {
                    zzaro zzaro0 = new zzaro(0, 0L);
                    this.s = zzaro0;
                    this.o.obtainMessage(4, 1, 0, zzaro0).sendToTarget();
                    this.s = new zzaro(0, 0x8000000000000001L);
                    this.j(4);
                    this.e(false);
                    return true;
                }
                v22 = h00.b == 0x8000000000000001L ? 1 : 0;
                v23 = (int)(((Integer)pair1.first));
                v24 = (long)(((Long)pair1.second));
            }
            catch(zzarf zzarf0) {
                goto label_525;
            }
            catch(IOException iOException0) {
                iOException2 = iOException0;
                goto label_530;
            }
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_535;
        }
        try {
            zzaro zzaro1 = this.s;
            if(v23 == zzaro1.zza) {
                if(v24 / 1000L != zzaro1.zzc / 1000L) {
                    v25 = this.s(v23, v24);
                    goto label_269;
                }
                goto label_258;
            }
            else {
                v25 = this.s(v23, v24);
                goto label_269;
            }
            goto label_272;
        }
        catch(Throwable throwable0) {
            goto label_265;
        }
        try {
        label_258:
            zzaro zzaro2 = new zzaro(v23, v24);
            this.s = zzaro2;
            message1 = this.o.obtainMessage(4, v22, 0, zzaro2);
            goto label_272;
        }
        catch(zzarf zzarf0) {
            goto label_525;
        }
        catch(IOException iOException0) {
            iOException2 = iOException0;
            goto label_530;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_535;
        }
        try {
            v25 = this.s(v23, v24);
            goto label_269;
        }
        catch(Throwable throwable0) {
            try {
                try {
                label_265:
                    zzaro zzaro3 = new zzaro(v23, v24);
                    this.s = zzaro3;
                    this.o.obtainMessage(4, v22, 0, zzaro3).sendToTarget();
                    throw throwable0;
                label_269:
                    zzaro zzaro4 = new zzaro(v23, v25);
                    this.s = zzaro4;
                    message1 = this.o.obtainMessage(4, v22 | (v24 == v25 ? 0 : 1), 0, zzaro4);
                label_272:
                    message1.sendToTarget();
                    return true;
                label_274:
                    zzarx zzarx1 = (zzarx)message0.obj;
                    zzazd zzazd1 = this.v;
                    if(zzazd1 == null) {
                        this.l.zzK(zzarx1);
                    }
                    else {
                        zzarx1 = zzazd1.zzK(zzarx1);
                    }
                    this.t = zzarx1;
                    this.o.obtainMessage(7, zzarx1).sendToTarget();
                    return true;
                label_283:
                    this.k();
                    return true;
                label_285:
                    this.e(true);
                    this.T.zzb();
                    this.j(1);
                    synchronized(this) {
                        this.y = true;
                        this.notifyAll();
                        return true;
                    }
                label_296:
                    Pair pair2 = (Pair)message0.obj;
                    zzase zzase0 = this.N;
                    zzase zzase1 = (zzase)pair2.first;
                    this.N = zzase1;
                    object0 = pair2.second;
                    if(zzase0 != null) {
                        v27 = 0;
                    }
                    else if(this.H > 0) {
                        Pair pair3 = this.u(this.I);
                        int v28 = this.H;
                        this.H = 0;
                        this.I = null;
                        if(pair3 == null) {
                            this.a(v28, object0);
                            return true;
                        }
                        this.s = new zzaro(((int)(((Integer)pair3.first))), ((long)(((Long)pair3.second))));
                        v27 = v28;
                    }
                    else {
                        if(this.s.zzb == 0x8000000000000001L) {
                            if(zzase1.zzh()) {
                                this.a(0, object0);
                                return true;
                            }
                            goto label_319;
                        }
                        goto label_321;
                    }
                    goto label_322;
                }
                catch(zzarf zzarf0) {
                    goto label_525;
                }
                catch(IOException iOException0) {
                    iOException2 = iOException0;
                    goto label_530;
                }
                try {
                label_319:
                    pair4 = this.t(this.N, 0x8000000000000001L, 0L);
                }
                catch(zzarf zzarf1) {
                    zzarf2 = zzarf1;
                    goto label_526;
                }
                catch(IOException iOException1) {
                    iOException2 = iOException1;
                    goto label_530;
                }
                try {
                    this.s = new zzaro(((int)(((Integer)pair4.first))), ((long)(((Long)pair4.second))));
                label_321:
                    v27 = 0;
                label_322:
                    g010 = this.M == null ? this.K : this.M;
                    if(g010 == null) {
                        this.d(v27, object0);
                        return true;
                    }
                    int v29 = this.N.zza(g010.b);
                    if(v29 != -1) {
                        boolean z7 = this.n(0);
                        g010.g = 0;
                        g010.i = z7;
                        int v30 = g010 == this.L ? 1 : 0;
                        zzaro zzaro5 = this.s;
                        if(zzaro5.zza != 0) {
                            zzaro zzaro6 = new zzaro(0, zzaro5.zzb);
                            zzaro6.zzc = zzaro5.zzc;
                            zzaro6.zzd = zzaro5.zzd;
                            this.s = zzaro6;
                        }
                        while(true) {
                            g011 = g010.l;
                            if(g011 == null) {
                                goto label_360;
                            }
                            v29 = this.N.zzf(v29, this.r, this.q, this.D);
                            if(v29 != -1) {
                                zzasc zzasc0 = this.N.zzd(v29, this.r, true);
                                if(!g011.b.equals(zzasc0.zzb)) {
                                    goto label_350;
                                }
                                boolean z8 = this.n(v29);
                                g011.g = v29;
                                g011.i = z8;
                                v30 |= (g011 == this.L ? 1 : 0);
                                g010 = g011;
                                continue;
                            }
                        label_350:
                            if(v30 == 0) {
                                int v31 = this.M.g;
                                this.s = new zzaro(v31, this.s(v31, this.s.zzc));
                            }
                            else {
                                this.K = g010;
                                g010.l = null;
                                goto label_356;
                            }
                            goto label_360;
                        }
                    }
                    goto label_362;
                }
                catch(zzarf zzarf0) {
                    goto label_525;
                }
                catch(IOException iOException0) {
                    iOException2 = iOException0;
                    goto label_530;
                }
            label_356:
                while(g011 != null) {
                    try {
                        g011.b();
                        g011 = g011.l;
                    }
                    catch(zzarf zzarf1) {
                        zzarf2 = zzarf1;
                        goto label_526;
                    }
                    catch(IOException iOException1) {
                        iOException2 = iOException1;
                        goto label_530;
                    }
                }
                try {
                label_360:
                    this.d(v27, object0);
                    return true;
                label_362:
                    if(this.r(g010.g, zzase0, this.N) == -1) {
                        this.a(v27, object0);
                        return true;
                    }
                    this.N.zzd(0, this.r, false);
                }
                catch(zzarf zzarf0) {
                    goto label_525;
                }
                catch(IOException iOException0) {
                    iOException2 = iOException0;
                    goto label_530;
                }
                try {
                    pair5 = this.t(this.N, 0x8000000000000001L, 0L);
                }
                catch(zzarf zzarf1) {
                    zzarf2 = zzarf1;
                    goto label_526;
                }
                catch(IOException iOException1) {
                    iOException2 = iOException1;
                    goto label_530;
                }
                try {
                    int v32 = (int)(((Integer)pair5.first));
                    long v33 = (long)(((Long)pair5.second));
                    this.N.zzd(v32, this.r, true);
                    Object object1 = this.r.zzb;
                    g010.g = -1;
                    while(true) {
                        g010 = g010.l;
                        if(g010 == null) {
                            break;
                        }
                        g010.g = g010.b.equals(object1) ? v32 : -1;
                    }
                    this.s = new zzaro(v32, this.s(v32, v33));
                    this.d(v27, object0);
                    return true;
                label_379:
                    g012 = this.K;
                    if(g012 == null || g012.a != ((zzawz)message0.obj)) {
                        return true;
                    }
                    g012.j = true;
                    g012.c();
                }
                catch(zzarf zzarf0) {
                    goto label_525;
                }
                catch(IOException iOException0) {
                    iOException2 = iOException0;
                    goto label_530;
                }
                try {
                    v34 = g012.a(g012.h, false, new boolean[2]);
                }
                catch(zzarf zzarf1) {
                    zzarf2 = zzarf1;
                    goto label_526;
                }
                catch(IOException iOException1) {
                    iOException2 = iOException1;
                    goto label_530;
                }
                try {
                    g012.h = v34;
                    if(this.M == null) {
                        this.L = this.K;
                        this.f(this.K.h);
                        this.i(this.L);
                    }
                    this.b();
                    return true;
                label_392:
                    if(this.K != null && this.K.a == ((zzawz)message0.obj)) {
                        this.b();
                    }
                    return true;
                label_395:
                    g013 = this.M;
                    if(g013 == null) {
                        return true;
                    }
                    int v35 = 1;
                    while(true) {
                        if(g013 == null || !g013.j) {
                            return true;
                        }
                        if(g013.c()) {
                            break;
                        }
                        v35 &= (g013 == this.L ? 0 : 1);
                        g013 = g013.l;
                    }
                    if(v35 == 0) {
                        this.K = g013;
                        for(G0 g014 = g013.l; g014 != null; g014 = g014.l) {
                            g014.b();
                        }
                        g015 = this.K;
                        g015.l = null;
                        if(g015.j) {
                            goto label_414;
                        }
                        goto label_436;
                    }
                    goto label_416;
                }
                catch(zzarf zzarf0) {
                    goto label_525;
                }
                catch(IOException iOException0) {
                    iOException2 = iOException0;
                    goto label_530;
                }
                try {
                label_414:
                    this.K.a(Math.max(g015.h, this.J - (g015.f - g015.h)), false, new boolean[2]);
                    goto label_436;
                }
                catch(zzarf zzarf1) {
                    zzarf2 = zzarf1;
                    goto label_526;
                }
                catch(IOException iOException1) {
                    iOException2 = iOException1;
                    goto label_530;
                }
                try {
                label_416:
                    z9 = this.L != this.M;
                    g016 = this.M.l;
                }
                catch(zzarf zzarf0) {
                    goto label_525;
                }
                catch(IOException iOException0) {
                    iOException2 = iOException0;
                    goto label_530;
                }
                while(g016 != null) {
                    try {
                        g016.b();
                        g016 = g016.l;
                    }
                    catch(zzarf zzarf1) {
                        zzarf2 = zzarf1;
                        goto label_526;
                    }
                    catch(IOException iOException1) {
                        iOException2 = iOException1;
                        goto label_530;
                    }
                }
                try {
                    this.M.l = null;
                    this.K = this.M;
                    this.L = this.M;
                    boolean[] arr_z = new boolean[2];
                    long v36 = this.M.a(this.s.zzc, z9, arr_z);
                    if(v36 != this.s.zzc) {
                        this.s.zzc = v36;
                        this.f(v36);
                    }
                    boolean[] arr_z1 = new boolean[2];
                    int v37 = 0;
                    for(v38 = 0; true; ++v38) {
                    label_433:
                        if(v38 >= 2) {
                            this.o.obtainMessage(3, g013.m).sendToTarget();
                            this.v(arr_z1, v37);
                        label_436:
                            this.b();
                            this.m();
                            this.m.sendEmptyMessage(2);
                            return true;
                        }
                        zzary4 = this.i[v38];
                        boolean z10 = zzary4.zzb() != 0;
                        arr_z1[v38] = z10;
                        zzaxl zzaxl2 = this.M.d[v38];
                        if(zzaxl2 != null) {
                            ++v37;
                        }
                        if(z10) {
                            if(zzaxl2 != zzary4.zzh()) {
                                if(zzary4 == this.u) {
                                    if(zzaxl2 == null) {
                                        this.l.zzd(this.v);
                                    }
                                    this.v = null;
                                    this.u = null;
                                }
                                break;
                            }
                            else if(arr_z[v38]) {
                                zzary4.zzu(this.J);
                            }
                        }
                    }
                }
                catch(zzarf zzarf0) {
                    goto label_525;
                }
                catch(IOException iOException0) {
                    iOException2 = iOException0;
                    goto label_530;
                }
                try {
                    if(zzary4.zzb() == 2) {
                        zzary4.zzz();
                    }
                }
                catch(zzarf zzarf1) {
                    zzarf2 = zzarf1;
                    goto label_526;
                }
                catch(IOException iOException1) {
                    iOException2 = iOException1;
                    goto label_530;
                }
                try {
                    zzary4.zzj();
                    ++v38;
                    goto label_433;
                label_461:
                    zzari[] arr_zzari = (zzari[])message0.obj;
                    try {
                        for(int v = 0; v < arr_zzari.length; ++v) {
                            zzari zzari0 = arr_zzari[v];
                            zzari0.zza.zzl(zzari0.zzb, zzari0.zzc);
                        }
                        if(this.w != null) {
                            this.m.sendEmptyMessage(2);
                        }
                        return true;
                    }
                    finally {
                        synchronized(this) {
                            ++this.F;
                            this.notifyAll();
                        }
                    }
                label_480:
                    int v41 = message0.arg1;
                    this.D = v41;
                    G0 g017 = this.M == null ? this.K : this.M;
                    if(g017 == null) {
                        return true;
                    }
                    int v42 = g017 == this.L ? 1 : 0;
                    int v43 = g017 == this.K ? 1 : 0;
                    int v44 = this.N.zzf(g017.g, this.r, this.q, v41);
                    while(true) {
                        g018 = g017.l;
                        if(g018 == null || v44 == -1) {
                            break;
                        }
                        int v45 = g018.g;
                        if(v45 != v44) {
                            break;
                        }
                        v42 |= (g018 == this.L ? 1 : 0);
                        v43 |= (g018 == this.K ? 1 : 0);
                        v44 = this.N.zzf(v45, this.r, this.q, v41);
                        g017 = g018;
                    }
                    if(g018 == null) {
                        goto label_499;
                    }
                label_497:
                    while(g018 == null) {
                        g017.l = null;
                    label_499:
                        g017.i = this.n(g017.g);
                        if(v43 == 0) {
                            this.K = g017;
                        }
                        if(v42 == 0) {
                            G0 g019 = this.M;
                            if(g019 != null) {
                                this.s = new zzaro(g019.g, this.s(g019.g, this.s.zzc));
                            }
                        }
                        if(this.C == 4 && v41 != 0) {
                            this.j(2);
                        }
                        return true;
                    }
                }
                catch(zzarf zzarf0) {
                    goto label_525;
                }
                catch(IOException iOException0) {
                    iOException2 = iOException0;
                    goto label_530;
                }
                try {
                    g018.b();
                    g018 = g018.l;
                    goto label_497;
                }
                catch(zzarf zzarf1) {
                    zzarf2 = zzarf1;
                    goto label_526;
                }
                catch(IOException iOException1) {
                    iOException2 = iOException1;
                    goto label_530;
                }
            }
            catch(RuntimeException runtimeException0) {
            }
        }
        try {
            runtimeException1 = runtimeException0;
            goto label_535;
        label_525:
            zzarf2 = zzarf0;
        }
        catch(zzarf zzarf0) {
            goto label_525;
        }
        catch(IOException iOException0) {
            iOException2 = iOException0;
            goto label_530;
        }
        catch(RuntimeException runtimeException0) {
            runtimeException1 = runtimeException0;
            goto label_535;
        }
    label_526:
        Log.e("ExoPlayerImplInternal", "Renderer error.", zzarf2);
        this.o.obtainMessage(8, zzarf2).sendToTarget();
        this.k();
        return true;
    label_530:
        Log.e("ExoPlayerImplInternal", "Source error.", iOException2);
        zzarf zzarf3 = zzarf.zzb(iOException2);
        this.o.obtainMessage(8, zzarf3).sendToTarget();
        this.k();
        return true;
    label_535:
        Log.e("ExoPlayerImplInternal", "Internal runtime error.", runtimeException1);
        zzarf zzarf4 = new zzarf(null, runtimeException1);  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        this.o.obtainMessage(8, zzarf4).sendToTarget();
        this.k();
        return true;
    }

    public final void i(G0 g00) {
        if(this.M == g00) {
            return;
        }
        boolean[] arr_z = new boolean[2];
        int v = 0;
        for(int v1 = 0; v1 < 2; ++v1) {
            zzary zzary0 = this.i[v1];
            arr_z[v1] = zzary0.zzb() != 0;
            zzaxu zzaxu0 = g00.m.zzb.zza(v1);
            if(zzaxu0 != null) {
                ++v;
            }
            if(arr_z[v1] && (zzaxu0 == null || zzary0.zzB() && zzary0.zzh() == this.M.d[v1])) {
                if(zzary0 == this.u) {
                    this.l.zzd(this.v);
                    this.v = null;
                    this.u = null;
                }
                if(zzary0.zzb() == 2) {
                    zzary0.zzz();
                }
                zzary0.zzj();
            }
        }
        this.M = g00;
        this.o.obtainMessage(3, g00.m).sendToTarget();
        this.v(arr_z, v);
    }

    public final void j(int v) {
        if(this.C != v) {
            this.C = v;
            this.o.obtainMessage(1, v, 0).sendToTarget();
        }
    }

    public final void k() {
        this.e(true);
        this.T.zzc();
        this.j(1);
    }

    public final void l() {
        this.l.zzc();
        zzary[] arr_zzary = this.x;
        for(int v = 0; v < arr_zzary.length; ++v) {
            zzary zzary0 = arr_zzary[v];
            if(zzary0.zzb() == 2) {
                zzary0.zzz();
            }
        }
    }

    public final void m() {
        G0 g00 = this.M;
        if(g00 == null) {
            return;
        }
        long v = g00.a.zzh();
        if(v == 0x8000000000000001L) {
            if(this.u == null || this.u.zzE()) {
                this.J = this.l.zzI();
            }
            else {
                long v1 = this.v.zzI();
                this.J = v1;
                this.l.zza(v1);
            }
            v = this.J - (this.M.f - this.M.h);
        }
        else {
            this.f(v);
        }
        this.s.zzc = v;
        this.G = SystemClock.elapsedRealtime() * 1000L;
        long v2 = this.x.length == 0 ? 0x8000000000000000L : this.M.a.zzg();
        zzaro zzaro0 = this.s;
        if(v2 == 0x8000000000000000L) {
            v2 = this.N.zzd(this.M.g, this.r, false).zzc;
        }
        zzaro0.zzd = v2;
    }

    public final boolean n(int v) {
        this.N.zzd(v, this.r, false);
        this.N.zzg(0, this.q, false);
        return this.N.zzf(v, this.r, this.q, this.D) == -1;
    }

    public final boolean o(long v) {
        if(v != 0x8000000000000001L && this.s.zzc >= v) {
            G0 g00 = this.M.l;
            return g00 != null && g00.j;
        }
        return true;
    }

    public final void p(zzari[] arr_zzari) {
        synchronized(this) {
            if(this.y) {
                Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
                return;
            }
            int v1 = this.E;
            this.E = v1 + 1;
            this.m.obtainMessage(11, arr_zzari).sendToTarget();
            while(this.F <= v1) {
                try {
                    this.wait();
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public final void q() {
        synchronized(this) {
            if(this.y) {
                return;
            }
            this.m.sendEmptyMessage(6);
            while(!this.y) {
                try {
                    this.wait();
                }
                catch(InterruptedException unused_ex) {
                    Thread.currentThread().interrupt();
                }
            }
            this.n.quit();
        }
    }

    public final int r(int v, zzase zzase0, zzase zzase1) {
        int v1 = zzase0.zzb();
        int v3 = -1;
        for(int v2 = 0; v2 < v1 && v3 == -1; ++v2) {
            v = zzase0.zzf(v, this.r, this.q, this.D);
            v3 = zzase1.zza(zzase0.zzd(v, this.r, true).zzb);
        }
        return v3;
    }

    public final long s(int v, long v1) {
        G0 g02;
        this.l();
        this.A = false;
        this.j(2);
        G0 g00 = this.M;
        if(g00 == null) {
            G0 g01 = this.K;
            if(g01 != null) {
                g01.b();
            }
            g02 = null;
        }
        else {
            g02 = null;
            while(g00 != null) {
                if(g00.g != v || !g00.j) {
                    g00.b();
                }
                else {
                    g02 = g00;
                }
                g00 = g00.l;
            }
        }
        if(this.M != g02 || this.M != this.L) {
            zzary[] arr_zzary = this.x;
            for(int v2 = 0; v2 < arr_zzary.length; ++v2) {
                arr_zzary[v2].zzj();
            }
            this.x = new zzary[0];
            this.v = null;
            this.u = null;
            this.M = null;
        }
        if(g02 == null) {
            this.K = null;
            this.L = null;
            this.M = null;
            this.f(v1);
        }
        else {
            g02.l = null;
            this.K = g02;
            this.L = g02;
            this.i(g02);
            G0 g03 = this.M;
            if(g03.k) {
                v1 = g03.a.zzi(v1);
            }
            this.f(v1);
            this.b();
        }
        this.m.sendEmptyMessage(2);
        return v1;
    }

    public final Pair t(zzase zzase0, long v, long v1) {
        zzayz.zza(0, 0, zzase0.zzc());
        zzase0.zze(0, this.q, false, v1);
        if(v == 0x8000000000000001L) {
            v = 0L;
        }
        zzase0.zzd(0, this.r, false);
        return Pair.create(0, v);
    }

    public final Pair u(H0 h00) {
        Pair pair0;
        zzase zzase0 = h00.a;
        long v = h00.b;
        if(zzase0.zzh()) {
            zzase0 = this.N;
        }
        try {
            pair0 = this.t(zzase0, v, 0L);
            zzase zzase1 = this.N;
        }
        catch(IndexOutOfBoundsException unused_ex) {
            throw new zzarv(this.N, 0, v);
        }
        if(zzase1 == zzase0) {
            return pair0;
        }
        zzasc zzasc0 = this.r;
        if(zzase1.zza(zzase0.zzd(((int)(((Integer)pair0.first))), zzasc0, true).zzb) != -1) {
            return Pair.create(0, ((Long)pair0.second));
        }
        if(this.r(((int)(((Integer)pair0.first))), zzase0, this.N) != -1) {
            this.N.zzd(0, zzasc0, false);
            return this.t(this.N, 0x8000000000000001L, 0L);
        }
        return null;
    }

    public final void v(boolean[] arr_z, int v) {
        int v3;
        this.x = new zzary[v];
        int v1 = 0;
        for(int v2 = 0; v2 < 2; v2 = v3 + 1) {
            zzary zzary0 = this.i[v2];
            zzaxu zzaxu0 = this.M.m.zzb.zza(v2);
            if(zzaxu0 == null) {
                v3 = v2;
            }
            else {
                this.x[v1] = zzary0;
                if(zzary0.zzb() == 0) {
                    boolean z = this.z && this.C == 3;
                    v3 = v2;
                    zzary0.zzk(this.M.m.zzd[v2], new zzart[]{zzaxu0.zzc(0)}, this.M.d[v2], this.J, !arr_z[v2] && z, this.M.f - this.M.h);
                    zzazd zzazd0 = zzary0.zzi();
                    if(zzazd0 != null) {
                        if(this.v != null) {
                            throw new zzarf(null, new IllegalStateException("Multiple renderer media clocks enabled."));  // 初始化器: Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                        }
                        this.v = zzazd0;
                        this.u = zzary0;
                        zzazd0.zzK(this.t);
                    }
                    if(z) {
                        zzary0.zzy();
                    }
                }
                else {
                    v3 = v2;
                }
                ++v1;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzaxm
    public final void zze(zzaxn zzaxn0) {
        this.m.obtainMessage(9, ((zzawz)zzaxn0)).sendToTarget();
    }

    @Override  // com.google.android.gms.internal.ads.zzawy
    public final void zzf(zzawz zzawz0) {
        this.m.obtainMessage(8, zzawz0).sendToTarget();
    }

    @Override  // com.google.android.gms.internal.ads.zzaxa
    public final void zzg(zzase zzase0, Object object0) {
        Pair pair0 = Pair.create(zzase0, null);
        this.m.obtainMessage(7, pair0).sendToTarget();
    }

    @Override  // com.google.android.gms.internal.ads.zzayd
    public final void zzh() {
        this.m.sendEmptyMessage(10);
    }
}

