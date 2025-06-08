package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedList;

public final class zzatb {
    public int A;
    public long B;
    public int C;
    public long D;
    public int E;
    public long F;
    public long G;
    public long H;
    public float I;
    public zzasi[] J;
    public ByteBuffer[] K;
    public ByteBuffer L;
    public ByteBuffer M;
    public byte[] N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public int S;
    public boolean T;
    public long U;
    public final P0 a;
    public final zzati b;
    public final zzasi[] c;
    public final zzasx d;
    public final ConditionVariable e;
    public final long[] f;
    public final M0 g;
    public final LinkedList h;
    public AudioTrack i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public long o;
    public zzarx p;
    public zzarx q;
    public long r;
    public long s;
    public int t;
    public int u;
    public long v;
    public long w;
    public boolean x;
    public long y;
    public Method z;

    public zzatb(zzasg zzasg0, zzasi[] arr_zzasi, zzasx zzasx0) {
        this.d = zzasx0;
        this.e = new ConditionVariable(true);
        if(zzazo.zza >= 18) {
            try {
                this.z = AudioTrack.class.getMethod("getLatency", null);
            }
            catch(NoSuchMethodException unused_ex) {
            }
        }
        this.g = zzazo.zza >= 19 ? new N0() : new M0();  // 初始化器: Ljava/lang/Object;-><init>()V
        P0 p00 = new P0();  // 初始化器: Ljava/lang/Object;-><init>()V
        p00.f = zzasi.zza;
        p00.g = zzasi.zza;
        p00.a = -1;
        p00.b = -1;
        this.a = p00;
        zzati zzati0 = new zzati();
        this.b = zzati0;
        zzasi[] arr_zzasi1 = new zzasi[3];
        this.c = arr_zzasi1;
        R0 r00 = new R0();  // 初始化器: Ljava/lang/Object;-><init>()V
        r00.a = -1;
        r00.b = -1;
        r00.c = 0;
        r00.d = zzasi.zza;
        r00.e = zzasi.zza;
        arr_zzasi1[0] = r00;
        arr_zzasi1[1] = p00;
        System.arraycopy(arr_zzasi, 0, arr_zzasi1, 2, 0);
        arr_zzasi1[2] = zzati0;
        this.f = new long[10];
        this.I = 1.0f;
        this.E = 0;
        this.S = 0;
        this.q = zzarx.zza;
        this.P = -1;
        this.J = new zzasi[0];
        this.K = new ByteBuffer[0];
        this.h = new LinkedList();
    }

    public final void a() {
        ByteBuffer byteBuffer0;
        int v = this.J.length;
        int v1 = v;
        while(v1 >= 0) {
            if(v1 > 0) {
                byteBuffer0 = this.K[v1 - 1];
            }
            else {
                byteBuffer0 = this.L == null ? zzasi.zza : this.L;
            }
            if(v1 == v) {
                this.f(byteBuffer0);
            }
            else {
                zzasi zzasi0 = this.J[v1];
                zzasi0.zzf(byteBuffer0);
                ByteBuffer byteBuffer1 = zzasi0.zzc();
                this.K[v1] = byteBuffer1;
                if(byteBuffer1.hasRemaining()) {
                    ++v1;
                    continue;
                }
            }
            if(byteBuffer0.hasRemaining()) {
                return;
            }
            --v1;
        }
    }

    public final void b() {
        ArrayList arrayList0 = new ArrayList();
        for(int v1 = 0; v1 < 3; ++v1) {
            zzasi zzasi0 = this.c[v1];
            if(zzasi0.zzi()) {
                arrayList0.add(zzasi0);
            }
            else {
                zzasi0.zzd();
            }
        }
        int v2 = arrayList0.size();
        this.J = (zzasi[])arrayList0.toArray(new zzasi[v2]);
        this.K = new ByteBuffer[v2];
        for(int v = 0; v < v2; ++v) {
            zzasi zzasi1 = this.J[v];
            zzasi1.zzd();
            ByteBuffer[] arr_byteBuffer = this.K;
            arr_byteBuffer[v] = zzasi1.zzc();
        }
    }

    public final boolean c() {
        if(this.P == -1) {
            this.P = 0;
        }
        for(boolean z = false; true; z = true) {
            int v = this.P;
            zzasi[] arr_zzasi = this.J;
            if(v >= arr_zzasi.length) {
                break;
            }
            zzasi zzasi0 = arr_zzasi[v];
            if(z) {
                zzasi0.zze();
            }
            this.a();
            if(!zzasi0.zzj()) {
                return false;
            }
            ++this.P;
        }
        ByteBuffer byteBuffer0 = this.M;
        if(byteBuffer0 != null) {
            this.f(byteBuffer0);
            if(this.M != null) {
                return false;
            }
        }
        this.P = -1;
        return true;
    }

    public final boolean d() {
        return this.i != null;
    }

    public final boolean e() [...] // Potential decryptor

    public final void f(ByteBuffer byteBuffer0) {
        if(!byteBuffer0.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer1 = this.M;
        int v = 0;
        if(byteBuffer1 == null) {
            this.M = byteBuffer0;
            if(zzazo.zza < 21) {
                int v1 = byteBuffer0.remaining();
                if(this.N == null || this.N.length < v1) {
                    this.N = new byte[v1];
                }
                byteBuffer0.get(this.N, 0, v1);
                byteBuffer0.position(byteBuffer0.position());
                this.O = 0;
            }
        }
        else {
            zzayz.zzc(byteBuffer1 == byteBuffer0);
        }
        int v2 = byteBuffer0.remaining();
        if(zzazo.zza < 21) {
            long v3 = this.D;
            long v4 = this.g.a();
            int v5 = this.n - ((int)(v3 - v4 * ((long)this.C)));
            if(v5 > 0) {
                v = this.i.write(this.N, this.O, Math.min(v2, v5));
                if(v > 0) {
                    this.O += v;
                    byteBuffer0.position(byteBuffer0.position() + v);
                }
            }
        }
        else {
            v = this.i.write(byteBuffer0, v2, 1);
        }
        this.U = SystemClock.elapsedRealtime();
        if(v < 0) {
            throw new zzata(v);
        }
        this.D += (long)v;
        if(v == v2) {
            this.M = null;
        }
    }

    public final long zza(boolean z) {
        long v12;
        if(this.d() && this.E != 0) {
            int v = this.i.getPlayState();
            M0 m00 = this.g;
            if(v == 3) {
                long v1 = m00.a() * 1000000L / ((long)m00.c);
                if(v1 != 0L) {
                    long v2 = System.nanoTime();
                    if(v2 / 1000L - this.w >= 30000L) {
                        int v3 = this.t;
                        long[] arr_v = this.f;
                        arr_v[v3] = v1 - v2 / 1000L;
                        this.t = (v3 + 1) % 10;
                        int v4 = this.u;
                        if(v4 < 10) {
                            this.u = v4 + 1;
                        }
                        this.w = v2 / 1000L;
                        this.v = 0L;
                        for(int v5 = 0; true; ++v5) {
                            int v6 = this.u;
                            if(v5 >= v6) {
                                break;
                            }
                            this.v = arr_v[v5] / ((long)v6) + this.v;
                        }
                    }
                    if(v2 / 1000L - this.y >= 500000L) {
                        boolean z1 = m00.e();
                        this.x = z1;
                        if(z1) {
                            long v7 = m00.c();
                            long v8 = m00.b();
                            if(v7 / 1000L < this.G) {
                                this.x = false;
                            }
                            else if(Math.abs(v7 / 1000L - v2 / 1000L) > 5000000L) {
                                Log.w("AudioTrack", "Spurious audio timestamp (system clock mismatch): " + v8 + ", " + v7 / 1000L + ", " + v2 / 1000L + ", " + v1);
                                this.x = false;
                            }
                            else if(Math.abs(v8 * 1000000L / ((long)this.j) - v1) > 5000000L) {
                                Log.w("AudioTrack", "Spurious audio timestamp (frame position mismatch): " + v8 + ", " + v7 / 1000L + ", " + v2 / 1000L + ", " + v1);
                                this.x = false;
                            }
                        }
                        Method method0 = this.z;
                        if(method0 != null) {
                            try {
                                long v9 = Math.max(((long)(((int)(((Integer)method0.invoke(this.i, null)))))) * 1000L - this.o, 0L);
                                this.H = v9;
                                if(v9 > 5000000L) {
                                    Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + v9);
                                    this.H = 0L;
                                }
                            }
                            catch(Exception unused_ex) {
                                this.z = null;
                            }
                        }
                        this.y = v2 / 1000L;
                    }
                }
            }
            long v10 = System.nanoTime();
            if(this.x) {
                long v11 = (v10 / 1000L - m00.c() / 1000L) * ((long)this.j) / 1000000L;
                v12 = (m00.b() + v11) * 1000000L / ((long)this.j);
            }
            else {
                v12 = this.u == 0 ? m00.a() * 1000000L / ((long)m00.c) : v10 / 1000L + this.v;
                if(!z) {
                    v12 -= this.H;
                }
            }
            long v13 = this.F;
            while(true) {
                LinkedList linkedList0 = this.h;
                if(linkedList0.isEmpty() || v12 < ((O0)linkedList0.getFirst()).c) {
                    break;
                }
                O0 o00 = (O0)linkedList0.remove();
                this.q = o00.a;
                this.s = o00.c;
                this.r = o00.b - this.F;
            }
            if(this.q.zzb == 1.0f) {
                return v13 + (v12 + this.r - this.s);
            }
            if(linkedList0.isEmpty()) {
                zzati zzati0 = this.b;
                if(zzati0.zzn() >= 0x400L) {
                    long v14 = this.r;
                    return v13 + (zzazo.zzj(v12 - this.s, zzati0.zzm(), zzati0.zzn()) + v14);
                }
            }
            return v13 + (((long)(((double)this.q.zzb) * ((double)(v12 - this.s)))) + this.r);
        }
        return 0x8000000000000000L;
    }

    public final zzarx zzc() {
        return this.q;
    }

    public final zzarx zzd(zzarx zzarx0) {
        float f = this.b.zzl(zzarx0.zzb);
        this.b.zzk(1.0f);
        zzarx zzarx1 = new zzarx(f, 1.0f);
        zzarx zzarx2 = this.p;
        if(zzarx2 == null) {
            zzarx2 = this.h.isEmpty() ? this.q : ((O0)this.h.getLast()).a;
        }
        if(!zzarx1.equals(zzarx2)) {
            if(this.d()) {
                this.p = zzarx1;
                return this.q;
            }
            this.q = zzarx1;
        }
        return this.q;
    }

    public final void zze(String s, int v, int v1, int v2, int v3, int[] arr_v) throws zzasv {
        int v6;
        boolean z2;
        this.A = zzazo.zzi(v2, v);
        this.a.c = arr_v;
        boolean z = false;
        boolean z1 = false;
        for(int v4 = 0; v4 < 3; ++v4) {
            zzasi zzasi0 = this.c[v4];
            try {
                z2 = zzasi0.zzh(v1, v, v2);
            }
            catch(zzash zzash0) {
                throw new zzasv(zzash0);
            }
            z1 |= z2;
            if(zzasi0.zzi()) {
                v = zzasi0.zza();
                zzasi0.zzb();
                v2 = 2;
            }
        }
        if(z1) {
            this.b();
        }
        int v5 = 0xFC;
        switch(v) {
            case 1: {
                v6 = 4;
                break;
            }
            case 2: {
                v6 = 12;
                break;
            }
            case 3: {
                v6 = 28;
                break;
            }
            case 4: {
                v6 = 204;
                break;
            }
            case 5: {
                v6 = 220;
                break;
            }
            case 6: {
                v6 = 0xFC;
                break;
            }
            case 7: {
                v6 = 0x4FC;
                break;
            }
            case 8: {
                v6 = zzare.zza;
                break;
            }
            default: {
                throw new zzasv("Unsupported channel count: " + v);
            }
        }
        int v7 = zzazo.zza;
        if(v7 > 23 || !"foster".equals(zzazo.zzb) || !"NVIDIA".equals(zzazo.zzc)) {
            v5 = v6;
        }
        else {
            switch(v) {
                case 3: 
                case 5: {
                    break;
                }
                case 7: {
                    v5 = zzare.zza;
                    break;
                }
                default: {
                    v5 = v6;
                }
            }
        }
        if(v7 <= 25) {
            "fugu".equals(zzazo.zzb);
        }
        if(!z1 && this.d() && this.l == v2 && this.j == v1 && this.k == v5) {
            return;
        }
        this.zzk();
        this.l = v2;
        this.j = v1;
        this.k = v5;
        this.m = 2;
        this.C = zzazo.zzi(2, v);
        int v8 = AudioTrack.getMinBufferSize(v1, v5, this.m);
        if(v8 != -2) {
            z = true;
        }
        zzayz.zze(z);
        int v9 = v8 * 4;
        int v10 = ((int)(250000L * ((long)this.j) / 1000000L)) * this.C;
        int v11 = (int)Math.max(v8, 750000L * ((long)this.j) / 1000000L * ((long)this.C));
        if(v9 < v10) {
            v9 = v10;
        }
        else if(v9 > v11) {
            v9 = v11;
        }
        this.n = v9;
        this.o = ((long)(v9 / this.C)) * 1000000L / ((long)this.j);
        this.zzd(this.q);
    }

    public final void zzf() {
        if(this.E == 1) {
            this.E = 2;
        }
    }

    public final void zzg() {
        this.R = false;
        if(this.d()) {
            this.v = 0L;
            this.u = 0;
            this.t = 0;
            this.w = 0L;
            this.x = false;
            this.y = 0L;
            M0 m00 = this.g;
            if(m00.g == 0x8000000000000001L) {
                m00.a.pause();
            }
        }
    }

    public final void zzh() {
        this.R = true;
        if(this.d()) {
            this.G = System.nanoTime() / 1000L;
            this.i.play();
        }
    }

    public final void zzi() throws zzata {
        if(!this.Q && this.d() && this.c()) {
            long v = this.D / ((long)this.C);
            this.g.h = this.g.a();
            this.g.g = SystemClock.elapsedRealtime() * 1000L;
            this.g.i = v;
            this.g.a.stop();
            this.Q = true;
        }
    }

    public final void zzj() {
        this.zzk();
        for(int v = 0; v < 3; ++v) {
            this.c[v].zzg();
        }
        this.S = 0;
        this.R = false;
    }

    public final void zzk() {
        if(this.d()) {
            this.B = 0L;
            this.D = 0L;
            zzarx zzarx0 = this.p;
            LinkedList linkedList0 = this.h;
            if(zzarx0 != null) {
                this.q = zzarx0;
                this.p = null;
            }
            else if(!linkedList0.isEmpty()) {
                this.q = ((O0)linkedList0.getLast()).a;
            }
            linkedList0.clear();
            this.r = 0L;
            this.s = 0L;
            this.L = null;
            this.M = null;
            for(int v = 0; true; ++v) {
                zzasi[] arr_zzasi = this.J;
                if(v >= arr_zzasi.length) {
                    break;
                }
                zzasi zzasi0 = arr_zzasi[v];
                zzasi0.zzd();
                ByteBuffer[] arr_byteBuffer = this.K;
                arr_byteBuffer[v] = zzasi0.zzc();
            }
            this.Q = false;
            this.P = -1;
            this.E = 0;
            this.H = 0L;
            this.v = 0L;
            this.u = 0;
            this.t = 0;
            this.w = 0L;
            this.x = false;
            this.y = 0L;
            if(this.i.getPlayState() == 3) {
                this.i.pause();
            }
            AudioTrack audioTrack0 = this.i;
            this.i = null;
            this.g.d(null, false);
            this.e.close();
            new L0(this, audioTrack0).start();
        }
    }

    public final void zzl(float f) {
        if(this.I != f) {
            this.I = f;
            if(this.d()) {
                if(zzazo.zza >= 21) {
                    this.i.setVolume(this.I);
                    return;
                }
                this.i.setStereoVolume(this.I, this.I);
            }
        }
    }

    public final boolean zzm(ByteBuffer byteBuffer0, long v) throws zzasw, zzata {
        zzayz.zzc(this.L == null || byteBuffer0 == this.L);
        M0 m00 = this.g;
        zzasx zzasx0 = this.d;
        if(!this.d()) {
            this.e.block();
            int v1 = this.S;
            this.i = v1 == 0 ? new AudioTrack(3, this.j, this.k, this.m, this.n, 1) : new AudioTrack(3, this.j, this.k, this.m, this.n, 1, v1);
            int v2 = this.i.getState();
            if(v2 != 1) {
                goto label_23;
            }
            int v3 = this.i.getAudioSessionId();
            if(this.S != v3) {
                this.S = v3;
                ((Q0)zzasx0).a.Q.zzb(v3);
            }
            m00.d(this.i, false);
            if(this.d()) {
                this.i.setVolume(this.I);
            }
            this.T = false;
            if(this.R) {
                this.zzh();
                goto label_32;
                try {
                label_23:
                    this.i.release();
                    this.i = null;
                }
                catch(Exception unused_ex) {
                    this.i = null;
                }
                catch(Throwable throwable0) {
                    this.i = null;
                    throw throwable0;
                }
                throw new zzasw(v2, this.j, this.k, this.n);
            }
        }
    label_32:
        boolean z = this.T;
        boolean z1 = this.zzn();
        this.T = z1;
        if(z && !z1 && this.i.getPlayState() != 1) {
            long v4 = SystemClock.elapsedRealtime();
            long v5 = this.U;
            int v6 = this.n;
            long v7 = zzare.zzb(this.o);
            ((Q0)zzasx0).a.Q.zzc(v6, v7, v4 - v5);
        }
        if(this.L == null) {
            if(!byteBuffer0.hasRemaining()) {
                return true;
            }
            if(this.p != null) {
                if(!this.c()) {
                    return false;
                }
                O0 o00 = new O0(this.p, Math.max(0L, v), this.D / ((long)this.C) * 1000000L / ((long)this.j));
                this.h.add(o00);
                this.p = null;
                this.b();
            }
            int v8 = this.E;
            if(v8 == 0) {
                this.F = Math.max(0L, v);
                this.E = 1;
            }
            else {
                long v9 = this.B / ((long)this.A) * 1000000L / ((long)this.j) + this.F;
                if(v8 == 1 && Math.abs(v9 - v) > 200000L) {
                    Log.e("AudioTrack", "Discontinuity detected [expected " + v9 + ", got " + v + "]");
                    this.E = 2;
                }
                if(this.E == 2) {
                    this.F = v - v9 + this.F;
                    this.E = 1;
                    ((Q0)zzasx0).a.W = true;
                }
            }
            this.B += (long)byteBuffer0.remaining();
            this.L = byteBuffer0;
        }
        this.a();
        if(!this.L.hasRemaining()) {
            this.L = null;
            return true;
        }
        return false;
    }

    // 去混淆评级： 中等(50)
    public final boolean zzn() {
        return this.d() && this.D / ((long)this.C) > this.g.a();
    }

    // 去混淆评级： 低(30)
    public final boolean zzo() {
        return !this.d() || this.Q && !this.zzn();
    }
}

