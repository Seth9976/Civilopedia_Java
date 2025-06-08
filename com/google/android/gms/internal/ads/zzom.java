package com.google.android.gms.internal.ads;

import A.f;
import N.b;
import android.media.AudioAttributes.Builder;
import android.media.AudioAttributes;
import android.media.AudioFormat.Builder;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

public final class zzom implements zznq {
    public long A;
    public float B;
    public zzmy[] C;
    public ByteBuffer[] D;
    public ByteBuffer E;
    public int F;
    public ByteBuffer G;
    public byte[] H;
    public int I;
    public int J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int O;
    public zzj P;
    public long Q;
    public boolean R;
    public boolean S;
    public final zzoc T;
    public final zzmv a;
    public final Na b;
    public final Ya c;
    public final zzmy[] d;
    public final zzmy[] e;
    public final ConditionVariable f;
    public final Ma g;
    public final ArrayDeque h;
    public S8 i;
    public final b j;
    public final b k;
    public zzmu l;
    public zznn m;
    public Ra n;
    public Ra o;
    public AudioTrack p;
    public zzi q;
    public Sa r;
    public Sa s;
    public long t;
    public long u;
    public long v;
    public long w;
    public int x;
    public boolean y;
    public boolean z;

    public zzom(zzoa zzoa0) {
        this.a = zzoa0.a;
        zzoc zzoc0 = zzoa0.b;
        this.T = zzoc0;
        this.f = new ConditionVariable(true);
        this.g = new Ma(new J5(this, 7));
        Na na0 = new Na();  // 初始化器: Lcom/google/android/gms/internal/ads/zznv;-><init>()V
        this.b = na0;
        Ya ya0 = new Ya();  // 初始化器: Lcom/google/android/gms/internal/ads/zznv;-><init>()V
        ya0.l = zzeg.zzf;
        this.c = ya0;
        ArrayList arrayList0 = new ArrayList();
        Collections.addAll(arrayList0, new zznv[]{new Wa(), na0, ya0});  // 初始化器: Lcom/google/android/gms/internal/ads/zznv;-><init>()V
        Collections.addAll(arrayList0, zzoc0.zze());
        this.d = (zzmy[])arrayList0.toArray(new zzmy[0]);
        this.e = new zzmy[]{new Ua()};  // 初始化器: Lcom/google/android/gms/internal/ads/zznv;-><init>()V
        this.B = 1.0f;
        this.q = zzi.zza;
        this.O = 0;
        this.P = new zzj(0, 0.0f);
        this.s = new Sa(zzbt.zza, false, 0L, 0L);
        this.J = -1;
        this.C = new zzmy[0];
        this.D = new ByteBuffer[0];
        this.h = new ArrayDeque();
        this.j = new b(3);
        this.k = new b(3);
    }

    public final long a() {
        return this.o.b == 0 ? this.t / ((long)this.o.a) : this.u;
    }

    public final long b() {
        return this.o.b == 0 ? this.v / ((long)this.o.c) : this.w;
    }

    public static Pair c(zzad zzad0, zzmv zzmv0) {
        int v3;
        zzad0.zzm.getClass();
        int v = zzbo.zza(zzad0.zzm, zzad0.zzj);
        int v1 = 8;
        if(v != 5 && v != 6 && v != 18 && (v != 7 && v != 8 && v != 17) && v != 14) {
            return null;
        }
        if(v == 18 && !zzmv0.zza(18)) {
            v = 6;
        }
        else if(v == 8 && !zzmv0.zza(8)) {
            v = 7;
        }
        if(!zzmv0.zza(v)) {
            return null;
        }
        if(v != 18) {
            v3 = zzad0.zzz;
            if(v3 > 8) {
                return null;
            }
        }
        else if(zzeg.zza >= 29) {
            int v2 = zzad0.zzA == -1 ? 48000 : zzad0.zzA;
            AudioAttributes audioAttributes0 = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
            for(v3 = 8; true; --v3) {
                if(v3 <= 0) {
                    v3 = 0;
                    break;
                }
                if(AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(18).setSampleRate(v2).setChannelMask(zzeg.zzj(v3)).build(), audioAttributes0)) {
                    break;
                }
            }
            if(v3 == 0) {
                Log.w("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        }
        else {
            v3 = 6;
        }
        int v4 = zzeg.zza;
        if(v4 > 28) {
            v1 = v3;
        }
        else if(v3 != 7) {
            v1 = v3 != 3 && (v3 != 4 && v3 != 5) ? v3 : 6;
        }
        if(v4 <= 26 && "fugu".equals(zzeg.zzb) && v1 == 1) {
            v1 = 2;
        }
        int v5 = zzeg.zzj(v1);
        return v5 == 0 ? null : Pair.create(v, v5);
    }

    public final Sa d() {
        Sa sa0 = this.r;
        if(sa0 == null) {
            return this.h.isEmpty() ? this.s : ((Sa)this.h.getLast());
        }
        return sa0;
    }

    public final void e(long v) {
        boolean z;
        zzbt zzbt0;
        zzoc zzoc0 = this.T;
        if("audio/raw".equals(((zzad)this.o.h).zzm)) {
            zzbt0 = this.d().a;
            zzoc0.zzc(zzbt0);
        }
        else {
            zzbt0 = zzbt.zza;
        }
        if("audio/raw".equals(((zzad)this.o.h).zzm)) {
            z = this.d().b;
            zzoc0.zzd(z);
        }
        else {
            z = false;
        }
        Ra ra0 = this.o;
        Sa sa0 = new Sa(zzbt0, z, Math.max(0L, v), this.b() * 1000000L / ((long)ra0.d));
        this.h.add(sa0);
        zzmy[] arr_zzmy = (zzmy[])this.o.i;
        ArrayList arrayList0 = new ArrayList();
        for(int v2 = 0; v2 < arr_zzmy.length; ++v2) {
            zzmy zzmy0 = arr_zzmy[v2];
            if(zzmy0.zzg()) {
                arrayList0.add(zzmy0);
            }
            else {
                zzmy0.zzc();
            }
        }
        int v3 = arrayList0.size();
        this.C = (zzmy[])arrayList0.toArray(new zzmy[v3]);
        this.D = new ByteBuffer[v3];
        for(int v1 = 0; true; ++v1) {
            zzmy[] arr_zzmy1 = this.C;
            if(v1 >= arr_zzmy1.length) {
                break;
            }
            zzmy zzmy1 = arr_zzmy1[v1];
            zzmy1.zzc();
            ByteBuffer[] arr_byteBuffer = this.D;
            arr_byteBuffer[v1] = zzmy1.zzb();
        }
        zznn zznn0 = this.m;
        if(zznn0 != null) {
            ((Va)zznn0).a.I0.zzs(z);
        }
    }

    public final void f() {
        if(!this.L) {
            this.L = true;
            long v = this.b();
            this.g.z = this.g.d();
            this.g.x = SystemClock.elapsedRealtime() * 1000L;
            this.g.A = v;
            this.p.stop();
        }
    }

    public final void g() {
        ByteBuffer byteBuffer0;
        int v = this.C.length;
        int v1 = v;
        while(v1 >= 0) {
            if(v1 > 0) {
                byteBuffer0 = this.D[v1 - 1];
            }
            else {
                byteBuffer0 = this.E == null ? zzmy.zza : this.E;
            }
            if(v1 == v) {
                this.i(byteBuffer0);
            }
            else {
                zzmy zzmy0 = this.C[v1];
                if(v1 > this.J) {
                    zzmy0.zze(byteBuffer0);
                }
                ByteBuffer byteBuffer1 = zzmy0.zzb();
                this.D[v1] = byteBuffer1;
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

    public final void h(zzbt zzbt0, boolean z) {
        Sa sa0 = this.d();
        if(zzbt0.equals(sa0.a) && z == sa0.b) {
            return;
        }
        Sa sa1 = new Sa(zzbt0, z, 0x8000000000000001L, 0x8000000000000001L);
        if(this.k()) {
            this.r = sa1;
            return;
        }
        this.s = sa1;
    }

    public final void i(ByteBuffer byteBuffer0) {
        int v6;
        if(!byteBuffer0.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer1 = this.G;
        boolean z = true;
        boolean z1 = false;
        if(byteBuffer1 == null) {
            this.G = byteBuffer0;
            if(zzeg.zza < 21) {
                int v = byteBuffer0.remaining();
                if(this.H == null || this.H.length < v) {
                    this.H = new byte[v];
                }
                byteBuffer0.get(this.H, 0, v);
                byteBuffer0.position(byteBuffer0.position());
                this.I = 0;
            }
        }
        else {
            zzcw.zzd(byteBuffer1 == byteBuffer0);
        }
        int v1 = byteBuffer0.remaining();
        int v2 = zzeg.zza;
        Ma ma0 = this.g;
        if(v2 < 21) {
            long v3 = this.v;
            long v4 = ma0.d();
            int v5 = ma0.e - ((int)(v3 - v4 * ((long)ma0.d)));
            if(v5 > 0) {
                v6 = this.p.write(this.H, this.I, Math.min(v1, v5));
                if(v6 > 0) {
                    this.I += v6;
                    byteBuffer0.position(byteBuffer0.position() + v6);
                }
            }
            else {
                v6 = 0;
            }
        }
        else {
            v6 = this.p.write(byteBuffer0, v1, 1);
        }
        this.Q = SystemClock.elapsedRealtime();
        b b0 = this.k;
        if(v6 < 0) {
            if(v2 >= 24 && v6 == -6) {
                z1 = true;
            }
            else if(v6 == 0xFFFFFFE0) {
                z1 = true;
            }
            if(z1 && this.o.b == 1) {
                this.R = true;
            }
            zznp zznp0 = new zznp(v6, ((zzad)this.o.h), z1);
            zznn zznn0 = this.m;
            if(zznn0 != null) {
                zznn0.zza(zznp0);
            }
            if(zznp0.zzb) {
                throw zznp0;
            }
            b0.i(zznp0);
            return;
        }
        b0.k = null;
        if(zzom.l(this.p)) {
            long v7 = this.w;
            if(v7 > 0L) {
                this.S = false;
            }
            if(this.M && this.m != null && v6 < v1 && !this.S) {
                long v8 = zzeg.zzz(ma0.c(v7 - ma0.d()));
                zzjs zzjs0 = ((Va)this.m).a.R0;
                if(zzjs0 != null) {
                    zzjs0.zza(v8);
                }
            }
        }
        int v9 = this.o.b;
        if(v9 == 0) {
            this.v += (long)v6;
        }
        if(v6 == v1) {
            if(v9 != 0) {
                if(byteBuffer0 != this.E) {
                    z = false;
                }
                zzcw.zzf(z);
                this.w = ((long)this.x) * ((long)this.F) + this.w;
            }
            this.G = null;
        }
    }

    public final boolean j() {
        if(this.J == -1) {
            this.J = 0;
        }
        for(boolean z = false; true; z = true) {
            int v = this.J;
            zzmy[] arr_zzmy = this.C;
            if(v >= arr_zzmy.length) {
                break;
            }
            zzmy zzmy0 = arr_zzmy[v];
            if(z) {
                zzmy0.zzd();
            }
            this.g();
            if(!zzmy0.zzh()) {
                return false;
            }
            ++this.J;
        }
        ByteBuffer byteBuffer0 = this.G;
        if(byteBuffer0 != null) {
            this.i(byteBuffer0);
            if(this.G != null) {
                return false;
            }
        }
        this.J = -1;
        return true;
    }

    public final boolean k() {
        return this.p != null;
    }

    public static boolean l(AudioTrack audioTrack0) {
        return zzeg.zza >= 29 && audioTrack0.isOffloadedPlayback();
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final int zza(zzad zzad0) {
        if("audio/raw".equals(zzad0.zzm)) {
            if(!zzeg.zzU(zzad0.zzB)) {
                f.p(zzad0.zzB, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            return zzad0.zzB == 2 ? 2 : 1;
        }
        return zzom.c(zzad0, this.a) == null ? 0 : 2;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final long zzb(boolean z) {
        ArrayDeque arrayDeque0;
        long v14;
        long v8;
        zzom zzom1;
        Ma ma1;
        boolean z2;
        if(this.k() && !this.z) {
            Ma ma0 = this.g;
            AudioTrack audioTrack0 = ma0.c;
            audioTrack0.getClass();
            int v = audioTrack0.getPlayState();
            zzom zzom0 = (zzom)ma0.a.j;
            if(v == 3) {
                long v1 = ma0.c(ma0.d());
                if(v1 == 0L) {
                    ma1 = ma0;
                    zzom1 = zzom0;
                }
                else {
                    long v2 = System.nanoTime();
                    if(v2 / 1000L - ma0.m >= 30000L) {
                        int v3 = ma0.v;
                        long[] arr_v = ma0.b;
                        arr_v[v3] = v1 - v2 / 1000L;
                        ma0.v = (v3 + 1) % 10;
                        int v4 = ma0.w;
                        if(v4 < 10) {
                            ma0.w = v4 + 1;
                        }
                        ma0.m = v2 / 1000L;
                        ma0.l = 0L;
                        for(int v5 = 0; true; ++v5) {
                            int v6 = ma0.w;
                            if(v5 >= v6) {
                                break;
                            }
                            ma0.l = arr_v[v5] / ((long)v6) + ma0.l;
                        }
                    }
                    if(ma0.h) {
                        ma1 = ma0;
                        zzom1 = zzom0;
                    }
                    else {
                        La la0 = ma0.f;
                        la0.getClass();
                        k0 k00 = la0.a;
                        if(v2 / 1000L - la0.e >= la0.d) {
                            la0.e = v2 / 1000L;
                            AudioTimestamp audioTimestamp0 = (AudioTimestamp)k00.e;
                            boolean z1 = ((AudioTrack)k00.d).getTimestamp(audioTimestamp0);
                            if(z1) {
                                long v7 = audioTimestamp0.framePosition;
                                if(k00.b > v7) {
                                    ++k00.a;
                                }
                                k00.b = v7;
                                k00.c = v7 + (k00.a << 0x20);
                            }
                            z2 = false;
                            switch(la0.b) {
                                case 0: {
                                    if(!z1) {
                                        if(v2 / 1000L - la0.c > 500000L) {
                                            la0.a(3);
                                        }
                                    }
                                    else if(audioTimestamp0.nanoTime / 1000L >= la0.c) {
                                        la0.f = k00.c;
                                        la0.a(1);
                                        z2 = true;
                                    }
                                    break;
                                }
                                case 1: {
                                    if(!z1) {
                                        la0.a(0);
                                    }
                                    else if(k00.c > la0.f) {
                                        la0.a(2);
                                        z2 = true;
                                    }
                                    else {
                                        z2 = true;
                                    }
                                    break;
                                }
                                case 2: {
                                    if(z1) {
                                        z2 = true;
                                    }
                                    else {
                                        la0.a(0);
                                    }
                                    break;
                                }
                                case 3: {
                                    if(z1) {
                                        la0.a(0);
                                        z2 = true;
                                    }
                                    break;
                                }
                                default: {
                                    z2 = z1;
                                }
                            }
                        }
                        else {
                            z2 = false;
                        }
                        if(z2) {
                            long v9 = ((AudioTimestamp)k00.e).nanoTime / 1000L;
                            long v10 = k00.c;
                            if(Math.abs(v9 - v2 / 1000L) > 5000000L) {
                                Log.w("DefaultAudioSink", "Spurious audio timestamp (system clock mismatch): " + v10 + ", " + v9 + ", " + v2 / 1000L + ", " + v1 + ", " + zzom0.a() + ", " + zzom0.b());
                                la0.a(4);
                                v8 = v2 / 1000L;
                                ma1 = ma0;
                                zzom1 = zzom0;
                            }
                            else {
                                ma1 = ma0;
                                if(Math.abs(ma1.c(v10) - v1) > 5000000L) {
                                    zzom1 = zzom0;
                                    v8 = v2 / 1000L;
                                    Log.w("DefaultAudioSink", "Spurious audio timestamp (frame position mismatch): " + v10 + ", " + v9 + ", " + v8 + ", " + v1 + ", " + zzom0.a() + ", " + zzom0.b());
                                    la0.a(4);
                                }
                                else {
                                    zzom1 = zzom0;
                                    v8 = v2 / 1000L;
                                    if(la0.b == 4) {
                                        la0.a(0);
                                    }
                                }
                            }
                        }
                        else {
                            ma1 = ma0;
                            zzom1 = zzom0;
                            v8 = v2 / 1000L;
                        }
                        if(ma1.q) {
                            Method method0 = ma1.n;
                            if(method0 != null && v8 - ma1.r >= 500000L) {
                                try {
                                    AudioTrack audioTrack1 = ma1.c;
                                    if(audioTrack1 == null) {
                                        throw null;
                                    }
                                    long v11 = Math.max(((long)(((int)(((Integer)method0.invoke(audioTrack1, null)))))) * 1000L - ma1.i, 0L);
                                    ma1.o = v11;
                                    if(v11 > 5000000L) {
                                        Log.w("DefaultAudioSink", "Ignoring impossibly large audio latency: " + v11);
                                        ma1.o = 0L;
                                    }
                                }
                                catch(Exception unused_ex) {
                                    ma1.n = null;
                                }
                                ma1.r = v8;
                            }
                        }
                    }
                }
            }
            else {
                ma1 = ma0;
                zzom1 = zzom0;
            }
            long v12 = System.nanoTime();
            La la1 = ma1.f;
            la1.getClass();
            boolean z3 = la1.b == 2;
            if(z3) {
                long v13 = ma1.c(la1.a.c);
                v14 = zzeg.zzs(v12 / 1000L - ((AudioTimestamp)la1.a.e).nanoTime / 1000L, ma1.j) + v13;
            }
            else {
                v14 = ma1.w == 0 ? ma1.c(ma1.d()) : ma1.l + v12 / 1000L;
                if(!z) {
                    v14 = Math.max(0L, v14 - ma1.o);
                }
            }
            if(ma1.D != z3) {
                ma1.F = ma1.C;
                ma1.E = ma1.B;
            }
            long v15 = v12 / 1000L - ma1.F;
            if(v15 < 1000000L) {
                long v16 = v15 * 1000L / 1000000L;
                v14 = ((zzeg.zzs(v15, ma1.j) + ma1.E) * (1000L - v16) + v14 * v16) / 1000L;
            }
            if(!ma1.k) {
                long v17 = ma1.B;
                if(v14 > v17) {
                    ma1.k = true;
                    long v18 = System.currentTimeMillis();
                    long v19 = zzeg.zzz(zzeg.zzu(zzeg.zzz(v14 - v17), ma1.j));
                    zznn zznn0 = zzom1.m;
                    if(zznn0 != null) {
                        ((Va)zznn0).a.I0.zzr(v18 - v19);
                    }
                }
            }
            ma1.C = v12 / 1000L;
            ma1.B = v14;
            ma1.D = z3;
            Ra ra0 = this.o;
            long v20 = Math.min(v14, this.b() * 1000000L / ((long)ra0.d));
            while(true) {
                arrayDeque0 = this.h;
                if(arrayDeque0.isEmpty() || v20 < ((Sa)arrayDeque0.getFirst()).d) {
                    break;
                }
                this.s = (Sa)arrayDeque0.remove();
            }
            long v21 = v20 - this.s.d;
            boolean z4 = this.s.a.equals(zzbt.zza);
            zzoc zzoc0 = this.T;
            if(z4) {
                return zzoc0.zzb() * 1000000L / ((long)this.o.d) + (this.s.c + v21);
            }
            if(arrayDeque0.isEmpty()) {
                long v22 = zzoc0.zza(v21) + this.s.c;
                return zzoc0.zzb() * 1000000L / ((long)this.o.d) + v22;
            }
            Sa sa0 = (Sa)arrayDeque0.getFirst();
            return zzoc0.zzb() * 1000000L / ((long)this.o.d) + (sa0.c - zzeg.zzs(sa0.d - v20, this.s.a.zzc));
        }
        return 0x8000000000000000L;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final zzbt zzc() {
        return this.d().a;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzd(zzad zzad0, int v, int[] arr_v) throws zznl {
        zzmy[] arr_zzmy2;
        int v16;
        int v15;
        int v14;
        int v9;
        int v8;
        int v7;
        int v6;
        zzmy[] arr_zzmy1;
        int v5;
        int[] arr_v1;
        int v1;
        if("audio/raw".equals(zzad0.zzm)) {
            zzcw.zzd(zzeg.zzU(zzad0.zzB));
            v1 = zzeg.zzo(zzad0.zzB, zzad0.zzz);
            this.c.h = zzad0.zzC;
            this.c.i = zzad0.zzD;
            if(zzeg.zza >= 21 || zzad0.zzz != 8 || arr_v != null) {
                arr_v1 = arr_v;
            }
            else {
                arr_v1 = new int[6];
                for(int v2 = 0; v2 < 6; ++v2) {
                    arr_v1[v2] = v2;
                }
            }
            this.b.h = arr_v1;
            zzmw zzmw0 = new zzmw(zzad0.zzA, zzad0.zzz, zzad0.zzB);
            zzmy[] arr_zzmy = this.d;
            for(int v3 = 0; v3 < arr_zzmy.length; ++v3) {
                zzmy zzmy0 = arr_zzmy[v3];
                try {
                    zzmw zzmw1 = zzmy0.zza(zzmw0);
                    if(zzmy0.zzg()) {
                        zzmw0 = zzmw1;
                    }
                }
                catch(zzmx zzmx0) {
                    throw new zznl(zzmx0, zzad0);
                }
            }
            int v4 = zzeg.zzj(zzmw0.zzc);
            v5 = zzeg.zzo(zzmw0.zzd, zzmw0.zzc);
            arr_zzmy1 = arr_zzmy;
            v6 = zzmw0.zzb;
            v7 = 0;
            v8 = zzmw0.zzd;
            v9 = v4;
        }
        else {
            int v10 = zzad0.zzA;
            Pair pair0 = zzom.c(zzad0, this.a);
            if(pair0 == null) {
                throw new zznl("Unable to configure passthrough for: " + zzad0, zzad0);
            }
            v7 = 2;
            arr_zzmy1 = new zzmy[0];
            v8 = (int)(((Integer)pair0.first));
            v1 = -1;
            v9 = (int)(((Integer)pair0.second));
            v6 = v10;
            v5 = -1;
        }
        int v11 = AudioTrack.getMinBufferSize(v6, v9, v8);
        int v12 = 5;
        zzcw.zzf(v11 != -2);
        int v13 = 250000;
        if(v7 == 0) {
            v15 = v5;
            v16 = v8;
            arr_zzmy2 = arr_zzmy1;
            v14 = zzeg.zzf(v11 * 4, zzfto.zza(250000L * ((long)v6) * ((long)v15) / 1000000L), zzfto.zza(750000L * ((long)v6) * ((long)v15) / 1000000L));
        }
        else {
            if(v8 == 5) {
                v13 = 500000;
                v8 = 5;
            }
            else {
                v12 = v8;
            }
            v14 = zzfto.zza(((long)v13) * ((long)zzoo.a(v8)) / 1000000L);
            v15 = v5;
            v16 = v12;
            arr_zzmy2 = arr_zzmy1;
        }
        int v17 = Math.max(v11, ((int)(((double)v14))));
        if(v16 == 0) {
            throw new zznl("Invalid output encoding (mode=" + v7 + ") for: " + zzad0, zzad0);
        }
        if(v9 == 0) {
            throw new zznl("Invalid output channel config (mode=" + v7 + ") for: " + zzad0, zzad0);
        }
        this.R = false;
        Ra ra0 = new Ra(zzad0, v1, v7, v15, v6, v9, v16, (v17 + v15 - 1) / v15 * v15, arr_zzmy2);
        if(this.k()) {
            this.n = ra0;
            return;
        }
        this.o = ra0;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zze() {
        if(this.k()) {
            this.t = 0L;
            this.u = 0L;
            this.v = 0L;
            this.w = 0L;
            this.S = false;
            this.x = 0;
            Sa sa0 = this.d();
            Sa sa1 = this.d();
            this.s = new Sa(sa0.a, sa1.b, 0L, 0L);
            this.A = 0L;
            this.r = null;
            this.h.clear();
            this.E = null;
            this.F = 0;
            this.G = null;
            this.L = false;
            this.K = false;
            this.J = -1;
            this.c.n = 0L;
            for(int v = 0; true; ++v) {
                zzmy[] arr_zzmy = this.C;
                if(v >= arr_zzmy.length) {
                    break;
                }
                zzmy zzmy0 = arr_zzmy[v];
                zzmy0.zzc();
                ByteBuffer[] arr_byteBuffer = this.D;
                arr_byteBuffer[v] = zzmy0.zzb();
            }
            Ma ma0 = this.g;
            AudioTrack audioTrack0 = ma0.c;
            audioTrack0.getClass();
            if(audioTrack0.getPlayState() == 3) {
                this.p.pause();
            }
            if(zzom.l(this.p)) {
                S8 s80 = this.i;
                s80.getClass();
                this.p.unregisterStreamEventCallback(((Ta)s80.k));
                ((Handler)s80.j).removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack1 = this.p;
            this.p = null;
            if(zzeg.zza < 21 && !this.N) {
                this.O = 0;
            }
            Ra ra0 = this.n;
            if(ra0 != null) {
                this.o = ra0;
                this.n = null;
            }
            ma0.l = 0L;
            ma0.w = 0;
            ma0.v = 0;
            ma0.m = 0L;
            ma0.C = 0L;
            ma0.F = 0L;
            ma0.k = false;
            ma0.c = null;
            ma0.f = null;
            this.f.close();
            new L0(this, audioTrack1).start();
        }
        this.k.k = null;
        this.j.k = null;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzf() {
        this.y = true;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzg() {
        this.M = false;
        if(this.k()) {
            Ma ma0 = this.g;
            ma0.l = 0L;
            ma0.w = 0;
            ma0.v = 0;
            ma0.m = 0L;
            ma0.C = 0L;
            ma0.F = 0L;
            ma0.k = false;
            if(ma0.x == 0x8000000000000001L) {
                La la0 = ma0.f;
                la0.getClass();
                la0.a(0);
                this.p.pause();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzh() {
        this.M = true;
        if(this.k()) {
            La la0 = this.g.f;
            la0.getClass();
            la0.a(0);
            this.p.play();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzi() throws zznp {
        if(!this.K && this.k() && this.j()) {
            this.f();
            this.K = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzj() {
        this.zze();
        zzmy[] arr_zzmy = this.d;
        for(int v = 0; v < arr_zzmy.length; ++v) {
            arr_zzmy[v].zzf();
        }
        zzmy[] arr_zzmy1 = this.e;
        for(int v1 = 0; v1 <= 0; ++v1) {
            arr_zzmy1[v1].zzf();
        }
        this.M = false;
        this.R = false;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzk(zzi zzi0) {
        if(this.q.equals(zzi0)) {
            return;
        }
        this.q = zzi0;
        this.zze();
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzl(int v) {
        if(this.O != v) {
            this.O = v;
            this.N = v != 0;
            this.zze();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzm(zzj zzj0) {
        if(this.P.equals(zzj0)) {
            return;
        }
        this.P = zzj0;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzn(zznn zznn0) {
        this.m = zznn0;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzo(zzbt zzbt0) {
        this.h(new zzbt(zzeg.zza(zzbt0.zzc, 0.1f, 8.0f), zzeg.zza(zzbt0.zzd, 0.1f, 8.0f)), this.d().b);
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzp(zzmu zzmu0) {
        this.l = zzmu0;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzq(boolean z) {
        this.h(this.d().a, z);
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final void zzr(float f) {
        if(this.B != f) {
            this.B = f;
            if(this.k()) {
                if(zzeg.zza >= 21) {
                    this.p.setVolume(this.B);
                    return;
                }
                this.p.setStereoVolume(this.B, this.B);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final boolean zzs(ByteBuffer byteBuffer0, long v, int v1) throws zznm, zznp {
        int v9;
        int v19;
        int v14;
        int v13;
        int v12;
        Ra ra3;
        AudioTrack audioTrack0;
        Ra ra1;
        zzcw.zzd(this.E == null || byteBuffer0 == this.E);
        if(this.n != null) {
            if(!this.j()) {
                return false;
            }
            Ra ra0 = this.n;
            if(this.o.b != ra0.b || this.o.f != ra0.f || this.o.d != ra0.d || this.o.e != ra0.e || this.o.c != ra0.c) {
                this.f();
                if(this.zzt()) {
                    return false;
                }
                this.zze();
            }
            else {
                this.o = ra0;
                this.n = null;
                if(zzom.l(this.p)) {
                    this.p.setOffloadEndOfStream();
                    this.p.setOffloadDelayPadding(((zzad)this.o.h).zzC, ((zzad)this.o.h).zzD);
                    this.S = true;
                }
            }
            this.e(v);
        }
        b b0 = this.j;
        if(!this.k()) {
            try {
                this.f.block();
            }
            catch(zznm zznm0) {
                goto label_72;
            }
            try {
                ra1 = this.o;
                if(ra1 == null) {
                    throw null;
                }
            }
            catch(zznm zznm1) {
                goto label_32;
            }
            try {
                audioTrack0 = ra1.t(this.q, this.O);
                goto label_49;
            }
            catch(zznm zznm2) {
                try {
                    zznn zznn0 = this.m;
                    if(zznn0 != null) {
                        zznn0.zza(zznm2);
                    }
                    throw zznm2;
                }
                catch(zznm zznm1) {
                }
            }
            try {
            label_32:
                Ra ra2 = this.o;
                if(ra2.g > 1000000) {
                    ra3 = new Ra(((zzad)ra2.h), ra2.a, ra2.b, ra2.c, ra2.d, ra2.e, ra2.f, 1000000, ((zzmy[])ra2.i));
                    audioTrack0 = ra3.t(this.q, this.O);
                    this.o = ra3;
                    goto label_49;
                }
                goto label_46;
            }
            catch(zznm zznm0) {
                goto label_72;
            }
            try {
                audioTrack0 = ra3.t(this.q, this.O);
                this.o = ra3;
                goto label_49;
            }
            catch(zznm zznm3) {
                try {
                    zznn zznn1 = this.m;
                    if(zznn1 != null) {
                        zznn1.zza(zznm3);
                    }
                    throw zznm3;
                }
                catch(zznm zznm4) {
                }
            }
            try {
                zznm1.addSuppressed(zznm4);
            }
            catch(Exception unused_ex) {
            }
            try {
            label_46:
                if(this.o.b == 1) {
                    this.R = true;
                }
                throw zznm1;
            label_49:
                this.p = audioTrack0;
                if(zzom.l(audioTrack0)) {
                    AudioTrack audioTrack1 = this.p;
                    if(this.i == null) {
                        this.i = new S8(this);
                    }
                    S8 s80 = this.i;
                    audioTrack1.registerStreamEventCallback(new zzoi(((Handler)s80.j)), ((Ta)s80.k));
                    this.p.setOffloadDelayPadding(((zzad)this.o.h).zzC, ((zzad)this.o.h).zzD);
                }
                int v2 = zzeg.zza;
                if(v2 >= 0x1F) {
                    zzmu zzmu0 = this.l;
                    if(zzmu0 != null) {
                        Pa.a(this.p, zzmu0);
                    }
                }
                this.O = this.p.getAudioSessionId();
                this.g.a(this.p, this.o.b == 2, this.o.f, this.o.c, this.o.g);
                if(this.k()) {
                    if(v2 >= 21) {
                        this.p.setVolume(this.B);
                    }
                    else {
                        this.p.setStereoVolume(this.B, this.B);
                    }
                }
                this.z = true;
                goto label_76;
            label_72:
                if(zznm0.zzb) {
                    throw zznm0;
                }
            }
            catch(zznm zznm0) {
                goto label_72;
            }
            b0.i(zznm0);
            return false;
        }
    label_76:
        b0.k = null;
        if(this.z) {
            this.A = Math.max(0L, v);
            this.y = false;
            this.z = false;
            this.e(v);
            if(this.M) {
                this.zzh();
            }
        }
        long v3 = this.b();
        Ma ma0 = this.g;
        AudioTrack audioTrack2 = ma0.c;
        audioTrack2.getClass();
        int v4 = audioTrack2.getPlayState();
        if(ma0.h) {
            switch(v4) {
                case 1: {
                    if(ma0.d() != 0L) {
                        v4 = 1;
                        break;
                    }
                    return false;
                }
                case 2: {
                    ma0.p = false;
                    return false;
                }
            }
        }
        boolean z = ma0.p;
        boolean z1 = ma0.b(v3);
        ma0.p = z1;
        if(z && !z1 && v4 != 1) {
            int v5 = ma0.e;
            long v6 = zzeg.zzz(ma0.i);
            zzom zzom0 = (zzom)ma0.a.j;
            if(zzom0.m != null) {
                long v7 = SystemClock.elapsedRealtime();
                ((Va)zzom0.m).a.I0.zzt(v5, v6, v7 - zzom0.Q);
            }
        }
        if(this.E == null) {
            zzcw.zzd(byteBuffer0.order() == ByteOrder.LITTLE_ENDIAN);
            if(!byteBuffer0.hasRemaining()) {
                return true;
            }
            Ra ra4 = this.o;
            if(ra4.b != 0 && this.x == 0) {
                int v8 = ra4.f;
                switch(v8) {
                    case 7: 
                    case 8: {
                        int v10 = byteBuffer0.position();
                        int v11 = byteBuffer0.get(v10);
                        switch(v11) {
                            case -2: {
                                int v15 = byteBuffer0.get(v10 + 5);
                                v14 = (byteBuffer0.get(v10 + 4) & 0xFC) >> 2 | (v15 & 1) << 6;
                                break;
                            }
                            case -1: {
                                v12 = (byteBuffer0.get(v10 + 4) & 7) << 4;
                                v14 = (byteBuffer0.get(v10 + 7) & 60) >> 2 | v12;
                                break;
                            }
                            default: {
                                if(v11 == 0x1F) {
                                    v12 = (byteBuffer0.get(v10 + 5) & 7) << 4;
                                    v13 = byteBuffer0.get(v10 + 6) & 60;
                                }
                                else {
                                    v12 = (byteBuffer0.get(v10 + 4) & 1) << 6;
                                    v13 = byteBuffer0.get(v10 + 5) & 0xFC;
                                }
                                v14 = v13 >> 2 | v12;
                            }
                        }
                        v9 = (v14 + 1) * 0x20;
                        break;
                    }
                    case 9: {
                        v9 = zzzl.zzc(zzeg.zzk(byteBuffer0, byteBuffer0.position()));
                        if(v9 == -1) {
                            throw new IllegalArgumentException();
                        }
                        break;
                    }
                    case 11: 
                    case 12: {
                        v9 = 0x800;
                        break;
                    }
                    case 14: {
                        int v16 = byteBuffer0.position();
                        int v17 = byteBuffer0.limit();
                        for(int v18 = v16; true; ++v18) {
                            v19 = -1;
                            if(v18 > v17 - 10) {
                                break;
                            }
                            if((zzeg.zzk(byteBuffer0, v18 + 4) & -2) == 0xF8726FBA) {
                                v19 = v18 - v16;
                                break;
                            }
                        }
                        v9 = v19 == -1 ? 0 : (40 << (byteBuffer0.get(byteBuffer0.position() + v19 + ((byteBuffer0.get(byteBuffer0.position() + v19 + 7) & 0xFF) == 0xBB ? 9 : 8)) >> 4 & 7)) * 16;
                        break;
                    }
                    case 15: {
                        v9 = 0x200;
                        break;
                    }
                    case 10: 
                    case 16: {
                        v9 = 0x400;
                        break;
                    }
                    case 17: {
                        byte[] arr_b = new byte[16];
                        byteBuffer0.get(arr_b);
                        byteBuffer0.position(byteBuffer0.position());
                        v9 = zzxz.zza(new zzdx(arr_b, 16)).zzc;
                        break;
                    }
                    case 5: 
                    case 6: 
                    case 18: {
                        v9 = zzxw.zza(byteBuffer0);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unexpected audio encoding: " + v8);
                    }
                }
                this.x = v9;
                if(v9 == 0) {
                    return true;
                }
            }
            if(this.r != null) {
                if(!this.j()) {
                    return false;
                }
                this.e(v);
                this.r = null;
            }
            long v20 = this.A;
            Ra ra5 = this.o;
            long v21 = (this.a() - this.c.n) * 1000000L / ((long)((zzad)ra5.h).zzA) + v20;
            if(!this.y && Math.abs(v21 - v) > 200000L) {
                this.m.zza(new zzno(v, v21));
                this.y = true;
            }
            if(this.y) {
                if(!this.j()) {
                    return false;
                }
                long v22 = v - v21;
                this.A += v22;
                this.y = false;
                this.e(v);
                zznn zznn2 = this.m;
                if(zznn2 != null && v22 != 0L) {
                    ((Va)zznn2).a.P0 = true;
                }
            }
            if(this.o.b == 0) {
                this.t += (long)byteBuffer0.remaining();
            }
            else {
                this.u = ((long)this.x) * ((long)v1) + this.u;
            }
            this.E = byteBuffer0;
            this.F = v1;
        }
        this.g();
        if(!this.E.hasRemaining()) {
            this.E = null;
            this.F = 0;
            return true;
        }
        long v23 = this.b();
        if(ma0.y != 0x8000000000000001L && v23 > 0L && SystemClock.elapsedRealtime() - ma0.y >= 200L) {
            Log.w("DefaultAudioSink", "Resetting stalled audio track");
            this.zze();
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final boolean zzt() {
        if(this.k()) {
            long v = this.b();
            return this.g.b(v);
        }
        return false;
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zznq
    public final boolean zzu() {
        return !this.k() || this.K && !this.zzt();
    }

    @Override  // com.google.android.gms.internal.ads.zznq
    public final boolean zzv(zzad zzad0) {
        return this.zza(zzad0) != 0;
    }
}

