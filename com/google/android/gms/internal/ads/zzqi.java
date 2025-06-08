package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class zzqi extends zzgk {
    public final eb A;
    public zzgl A0;
    public final zzed B;
    public long B0;
    public final ArrayList C;
    public long C0;
    public final MediaCodec.BufferInfo D;
    public int D0;
    public final long[] E;
    public zzpj E0;
    public final long[] F;
    public zzpj F0;
    public final long[] G;
    public static final byte[] G0;
    public zzad H;
    public zzad I;
    public final long J;
    public float K;
    public float L;
    public zzqd M;
    public zzad N;
    public MediaFormat O;
    public boolean P;
    public float Q;
    public ArrayDeque R;
    public zzqh S;
    public zzqf T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;
    public fb e0;
    public long f0;
    public int g0;
    public int h0;
    public ByteBuffer i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public final zzqc u;
    public boolean u0;
    public final zzqk v;
    public long v0;
    public final float w;
    public long w0;
    public final zzgb x;
    public boolean x0;
    public final zzgb y;
    public boolean y0;
    public final zzgb z;
    public boolean z0;

    static {
        zzqi.G0 = new byte[]{0, 0, 1, 103, 66, (byte)0xC0, 11, -38, 37, (byte)0x90, 0, 0, 1, 104, -50, 15, 19, 0x20, 0, 0, 1, 101, -120, (byte)0x84, 13, -50, 0x71, 24, (byte)0xA0, 0, 0x2F, -65, 28, 49, -61, 39, 93, 120};
    }

    public zzqi(int v, zzqc zzqc0, zzqk zzqk0, boolean z, float f) {
        super(v);
        this.u = zzqc0;
        zzqk0.getClass();
        this.v = zzqk0;
        this.w = f;
        this.x = new zzgb(0, 0);
        this.y = new zzgb(0, 0);
        this.z = new zzgb(2, 0);
        eb eb0 = new eb(2, 0);  // 初始化器: Lcom/google/android/gms/internal/ads/zzgb;-><init>(II)V
        eb0.e = 0x20;
        this.A = eb0;
        this.B = new zzed(10);
        this.C = new ArrayList();
        this.D = new MediaCodec.BufferInfo();
        this.K = 1.0f;
        this.L = 1.0f;
        this.J = 0x8000000000000001L;
        this.E = new long[10];
        this.F = new long[10];
        this.G = new long[10];
        this.B0 = 0x8000000000000001L;
        this.C0 = 0x8000000000000001L;
        eb0.zzi(0);
        eb0.zzb.order(ByteOrder.nativeOrder());
        this.Q = -1.0f;
        this.U = 0;
        this.p0 = 0;
        this.g0 = -1;
        this.h0 = -1;
        this.f0 = 0x8000000000000001L;
        this.v0 = 0x8000000000000001L;
        this.w0 = 0x8000000000000001L;
        this.q0 = 0;
        this.r0 = 0;
    }

    public void A() {
    }

    public void B(zzgb zzgb0) {
        throw null;
    }

    public void C() {
    }

    public abstract boolean D(long arg1, long arg2, zzqd arg3, ByteBuffer arg4, int arg5, int arg6, int arg7, long arg8, boolean arg9, boolean arg10, zzad arg11);

    public boolean E(zzad zzad0) {
        return false;
    }

    public zzqe F(IllegalStateException illegalStateException0, zzqf zzqf0) {
        return new zzqe(illegalStateException0, zzqf0);
    }

    public void G(zzgb zzgb0) {
    }

    public final void H() {
        zzqf zzqf1;
        if(this.M == null && !this.l0) {
            zzad zzad0 = this.H;
            if(zzad0 != null) {
                if(this.F0 == null && this.E(zzad0)) {
                    zzad zzad1 = this.H;
                    this.n();
                    eb eb0 = this.A;
                    eb0.e = "audio/mp4a-latm".equals(zzad1.zzm) || "audio/mpeg".equals(zzad1.zzm) || "audio/opus".equals(zzad1.zzm) ? 0x20 : 1;
                    this.l0 = true;
                    return;
                }
                zzpj zzpj0 = this.F0;
                this.E0 = zzpj0;
                zzad zzad2 = this.H;
                if(zzpj0 != null && zzpk.zza) {
                    zzpa zzpa0 = zzpj0.zza();
                    throw this.b(zzpa0, this.H, false, zzpa0.zza);
                }
                if(this.R == null) {
                    try {
                        try {
                            List list0 = this.q(this.v, zzad2);
                            list0.isEmpty();
                            this.R = new ArrayDeque();
                            if(!list0.isEmpty()) {
                                this.R.add(((zzqf)list0.get(0)));
                            }
                            this.S = null;
                        }
                        catch(zzqr zzqr0) {
                            throw new zzqh(this.H, zzqr0, false, 0xFFFF3CB2);
                        }
                    label_26:
                        if(this.R.isEmpty()) {
                            throw new zzqh(this.H, null, false, 0xFFFF3CB1);
                        }
                        zzqf zzqf0 = (zzqf)this.R.peekFirst();
                        while(true) {
                        label_29:
                            if(this.M != null) {
                                this.R = null;
                                return;
                            }
                            zzqf1 = (zzqf)this.R.peekFirst();
                            if(!this.N(zzqf1)) {
                                return;
                            }
                            goto label_35;
                        }
                    }
                    catch(zzqh zzqh0) {
                        throw this.b(zzqh0, this.H, false, 4001);
                    }
                }
                goto label_26;
                try {
                label_35:
                    this.O(zzqf1);
                    goto label_29;
                }
                catch(Exception exception0) {
                    try {
                        if(zzqf1 != zzqf0) {
                            throw exception0;
                        }
                        Log.w("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                        Thread.sleep(50L);
                        this.O(zzqf1);
                        goto label_29;
                    }
                    catch(Exception exception1) {
                    }
                    try {
                        zzdn.zzb("MediaCodecRenderer", "Failed to initialize decoder: " + zzqf1, exception1);
                        this.R.removeFirst();
                        zzqh zzqh1 = new zzqh(this.H, exception1, false, zzqf1);
                        this.r(zzqh1);
                        zzqh zzqh2 = this.S;
                        this.S = zzqh2 == null ? zzqh1 : new zzqh(zzqh2.getMessage(), zzqh2.getCause(), zzqh2.zza, zzqh2.zzc, zzqh2.zzd, zzqh1);
                        if(this.R.isEmpty()) {
                            throw this.S;
                        }
                        goto label_29;
                    }
                    catch(zzqh zzqh0) {
                    }
                }
                throw this.b(zzqh0, this.H, false, 4001);
            }
        }
    }

    public void I(long v) {
        int v1;
        while((v1 = this.D0) != 0) {
            long[] arr_v = this.G;
            if(v < arr_v[0]) {
                break;
            }
            this.B0 = this.E[0];
            this.C0 = this.F[0];
            this.D0 = v1 - 1;
            System.arraycopy(this.E, 1, this.E, 0, v1 - 1);
            System.arraycopy(this.F, 1, this.F, 0, this.D0);
            System.arraycopy(arr_v, 1, arr_v, 0, this.D0);
            this.A();
        }
    }

    public final void J() {
        try {
            zzqd zzqd0 = this.M;
            if(zzqd0 != null) {
                zzqd0.zzl();
                ++this.A0.zzb;
                this.t(this.T.zza);
            }
        }
        finally {
            this.M = null;
            this.E0 = null;
            this.L();
        }
    }

    public void K() {
        this.g0 = -1;
        this.y.zzb = null;
        this.h0 = -1;
        this.i0 = null;
        this.f0 = 0x8000000000000001L;
        this.t0 = false;
        this.s0 = false;
        this.b0 = false;
        this.c0 = false;
        this.j0 = false;
        this.k0 = false;
        this.C.clear();
        this.v0 = 0x8000000000000001L;
        this.w0 = 0x8000000000000001L;
        fb fb0 = this.e0;
        if(fb0 != null) {
            fb0.a = 0L;
            fb0.b = 0L;
            fb0.c = false;
        }
        this.q0 = 0;
        this.r0 = 0;
        this.p0 = this.o0;
    }

    public final void L() {
        this.K();
        this.e0 = null;
        this.R = null;
        this.T = null;
        this.N = null;
        this.O = null;
        this.P = false;
        this.u0 = false;
        this.Q = -1.0f;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.a0 = false;
        this.d0 = false;
        this.o0 = false;
        this.p0 = 0;
    }

    public final boolean M() {
        if(this.M == null) {
            return false;
        }
        if(this.r0 != 3 && !this.W && (!this.X || this.u0) && (!this.Y || !this.t0)) {
            this.z();
            return false;
        }
        this.J();
        return true;
    }

    public boolean N(zzqf zzqf0) {
        return true;
    }

    public final void O(zzqf zzqf0) {
        boolean z1;
        boolean z;
        int v5;
        ab ab0;
        MediaCodec mediaCodec1;
        MediaCodec mediaCodec0;
        float f1;
        String s = zzqf0.zza;
        int v = zzeg.zza;
        float f = -1.0f;
        if(v < 23) {
            f1 = -1.0f;
        }
        else {
            float f2 = this.L;
            zzad[] arr_zzad = this.p;
            arr_zzad.getClass();
            f1 = this.j(f2, arr_zzad);
        }
        if(f1 > this.w) {
            f = f1;
        }
        long v1 = SystemClock.elapsedRealtime();
        zzqb zzqb0 = this.p(zzqf0, this.H, f);
        if(v >= 0x1F) {
            zzmu zzmu0 = this.m;
            zzmu0.getClass();
            gb.a(zzqb0, zzmu0);
        }
        try {
            Trace.beginSection(("createCodec:" + s));
            if(v < 23 || v < 0x1F) {
                try {
                    mediaCodec0 = null;
                    zzqf zzqf1 = zzqb0.zza;
                    if(zzqf1 == null) {
                        throw null;
                    }
                    Trace.beginSection(("createCodec:" + zzqf1.zza));
                    mediaCodec1 = MediaCodec.createByCodecName(zzqf1.zza);
                    Trace.endSection();
                }
                catch(IOException | RuntimeException iOException0) {
                    goto label_46;
                }
                try {
                    Trace.beginSection("configureCodec");
                    mediaCodec1.configure(zzqb0.zzb, zzqb0.zzd, null, 0);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    mediaCodec1.start();
                    Trace.endSection();
                    ab0 = new zzqz(mediaCodec1);
                    goto label_50;
                }
                catch(IOException | RuntimeException iOException0) {
                    mediaCodec0 = mediaCodec1;
                }
            label_46:
                if(mediaCodec0 != null) {
                    mediaCodec0.release();
                }
                throw iOException0;
            }
            else {
                int v3 = zzbo.zzb(zzqb0.zzc.zzm);
                Log.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + zzeg.zzN(v3));
                ab0 = new zzpo(v3, false).zzc(zzqb0);
            }
        label_50:
            this.M = ab0;
        }
        finally {
            Trace.endSection();
        }
        long v4 = SystemClock.elapsedRealtime();
        this.T = zzqf0;
        this.Q = f;
        this.N = this.H;
        if(v <= 25 && "OMX.Exynos.avc.dec.secure".equals(s) && (zzeg.zzd.startsWith("SM-T585") || zzeg.zzd.startsWith("SM-A510") || zzeg.zzd.startsWith("SM-A520") || zzeg.zzd.startsWith("SM-J700"))) {
            v5 = 2;
        }
        else if(v >= 24 || !"OMX.Nvidia.h264.decode".equals(s) && !"OMX.Nvidia.h264.decode.secure".equals(s)) {
            v5 = 0;
        }
        else if("flounder".equals(zzeg.zzb) || "flounder_lte".equals(zzeg.zzb) || "grouper".equals(zzeg.zzb) || "tilapia".equals(zzeg.zzb)) {
            v5 = 1;
        }
        else {
            v5 = 0;
        }
        this.U = v5;
        this.V = v < 21 && this.N.zzo.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(s);
        this.W = v == 19 && zzeg.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(s) || "OMX.Exynos.avc.dec.secure".equals(s));
        this.X = v == 29 && "c2.android.aac.decoder".equals(s);
        if(v <= 23 && "OMX.google.vorbis.decoder".equals(s)) {
            z = true;
        }
        else if(v > 19 || !"hb2000".equals(zzeg.zzb) && !"stvm8".equals(zzeg.zzb)) {
            z = false;
        }
        else if(!"OMX.amlogic.avc.decoder.awesome".equals(s) && !"OMX.amlogic.avc.decoder.awesome.secure".equals(s)) {
            z = false;
        }
        else {
            z = true;
        }
        this.Y = z;
        this.Z = v == 21 && "OMX.google.aac.decoder".equals(s);
        this.a0 = v < 21 && "OMX.SEC.mp3.dec".equals(s) && "samsung".equals(zzeg.zzc) && (zzeg.zzb.startsWith("baffin") || zzeg.zzb.startsWith("grand") || zzeg.zzb.startsWith("fortuna") || zzeg.zzb.startsWith("gprimelte") || zzeg.zzb.startsWith("j2y18lte") || zzeg.zzb.startsWith("ms01"));
        String s1 = zzqf0.zza;
        if(v <= 25 && "OMX.rk.video_decoder.avc".equals(s1)) {
            z1 = true;
        }
        else if((v > 29 || !"OMX.broadcom.video_decoder.tunnel".equals(s1) && !"OMX.broadcom.video_decoder.tunnel.secure".equals(s1)) && (!"Amazon".equals(zzeg.zzc) || !"AFTS".equals(zzeg.zzd) || !zzqf0.zzf)) {
            z1 = false;
        }
        else {
            z1 = true;
        }
        this.d0 = z1;
        this.M.zzr();
        if("c2.android.mp3.decoder".equals(zzqf0.zza)) {
            this.e0 = new fb();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        if(this.zzbe() == 2) {
            this.f0 = SystemClock.elapsedRealtime() + 1000L;
        }
        ++this.A0.zza;
        this.s(s, v4, v4 - v1);
    }

    public final void P() {
        switch(this.r0) {
            case 1: {
                this.z();
                return;
            }
            case 2: {
                this.z();
                try {
                    throw null;
                }
                catch(MediaCryptoException mediaCryptoException0) {
                    throw this.b(mediaCryptoException0, this.H, false, 6006);
                }
            }
            case 3: {
                this.J();
                this.H();
                return;
            }
            default: {
                this.y0 = true;
                this.C();
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public void c() {
        this.H = null;
        this.B0 = 0x8000000000000001L;
        this.C0 = 0x8000000000000001L;
        this.D0 = 0;
        this.M();
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public void d(boolean z, boolean z1) {
        this.A0 = new zzgl();
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public void e(long v, boolean z) {
        this.x0 = false;
        this.y0 = false;
        if(this.l0) {
            this.A.zzb();
            this.z.zzb();
            this.m0 = false;
        }
        else if(this.M()) {
            this.H();
        }
        zzed zzed0 = this.B;
        if(zzed0.zza() > 0) {
            this.z0 = true;
        }
        zzed0.zze();
        int v1 = this.D0;
        if(v1 != 0) {
            this.C0 = this.F[v1 - 1];
            this.B0 = this.E[v1 - 1];
            this.D0 = 0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public void f() {
        try {
            this.n();
            this.J();
            this.F0 = null;
        }
        catch(Throwable throwable0) {
            this.F0 = null;
            throw throwable0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public final void i(long v, long v1) {
        boolean z = true;
        if(this.C0 == 0x8000000000000001L) {
            if(this.B0 != 0x8000000000000001L) {
                z = false;
            }
            zzcw.zzf(z);
            this.B0 = v;
            this.C0 = v1;
            return;
        }
        int v2 = this.D0;
        long[] arr_v = this.F;
        if(v2 == 10) {
            Log.w("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + arr_v[9]);
        }
        else {
            this.D0 = v2 + 1;
        }
        int v3 = this.D0 - 1;
        this.E[v3] = v;
        arr_v[v3] = v1;
        this.G[v3] = this.v0;
    }

    public float j(float f, zzad[] arr_zzad) {
        throw null;
    }

    public abstract int k(zzqk arg1, zzad arg2);

    public zzgm l(zzqf zzqf0, zzad zzad0, zzad zzad1) {
        throw null;
    }

    public zzgm m(zziz zziz0) {
        boolean z = true;
        this.z0 = true;
        zzad zzad0 = zziz0.zza;
        zzad0.getClass();
        if(zzad0.zzm == null) {
            throw this.b(new IllegalArgumentException(), zzad0, false, 4005);
        }
        zzpj zzpj0 = zziz0.zzb;
        this.F0 = zzpj0;
        this.H = zzad0;
        if(this.l0) {
            this.n0 = true;
            return null;
        }
        zzqd zzqd0 = this.M;
        if(zzqd0 == null) {
            this.R = null;
            this.H();
            return null;
        }
        zzqf zzqf0 = this.T;
        zzad zzad1 = this.N;
        zzpj zzpj1 = this.E0;
        if(zzpj1 == zzpj0) {
            zzcw.zzf(zzpj0 == zzpj1 || zzeg.zza >= 23);
            zzgm zzgm0 = this.l(zzqf0, zzad1, zzad0);
            int v = zzgm0.zzd;
            if(v != 0) {
                switch(v) {
                    case 1: {
                        if(this.x(zzad0)) {
                            this.N = zzad0;
                            if(zzpj0 != zzpj1) {
                                if(this.u()) {
                                    return zzgm0.zzd == 0 || this.M == zzqd0 && this.r0 != 3 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 0);
                                }
                                return zzgm0.zzd == 0 || this.M == zzqd0 && this.r0 != 3 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 2);
                            }
                            if(!this.s0) {
                                return zzgm0.zzd == 0 || this.M == zzqd0 && this.r0 != 3 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 0);
                            }
                            this.q0 = 1;
                            if(!this.W && !this.Y) {
                                this.r0 = 1;
                                return zzgm0.zzd == 0 || this.M == zzqd0 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 0);
                            }
                            this.r0 = 3;
                            return zzgm0.zzd == 0 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 2);
                        }
                        break;
                    }
                    case 2: {
                        if(this.x(zzad0)) {
                            this.o0 = true;
                            this.p0 = 1;
                            if(this.U != 2 && (this.U != 1 || zzad0.zzr != zzad1.zzr || zzad0.zzs != zzad1.zzs)) {
                                z = false;
                            }
                            this.b0 = z;
                            this.N = zzad0;
                            if(zzpj0 != zzpj1 && !this.u()) {
                                return zzgm0.zzd == 0 || this.M == zzqd0 && this.r0 != 3 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 2);
                            }
                            return zzgm0.zzd == 0 || this.M == zzqd0 && this.r0 != 3 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 0);
                        }
                        break;
                    }
                    default: {
                        if(this.x(zzad0)) {
                            this.N = zzad0;
                            if(zzpj0 == zzpj1 || this.u()) {
                                return zzgm0.zzd == 0 || this.M == zzqd0 && this.r0 != 3 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 0);
                            }
                            return zzgm0.zzd == 0 || this.M == zzqd0 && this.r0 != 3 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 2);
                        }
                    }
                }
                return zzgm0.zzd == 0 || this.M == zzqd0 && this.r0 != 3 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 16);
            }
            this.o();
            return zzgm0.zzd == 0 || this.M == zzqd0 && this.r0 != 3 ? zzgm0 : new zzgm(zzqf0.zza, zzad1, zzad0, 0, 0);
        }
        if(zzpj0 != null && zzpj1 != null && zzeg.zza >= 23) {
            UUID uUID0 = zzm.zze;
            UUID uUID1 = zzm.zza;
            if(!uUID0.equals(uUID1)) {
                uUID0.equals(uUID1);
            }
        }
        this.o();
        return new zzgm(zzqf0.zza, zzad1, zzad0, 0, 0x80);
    }

    public final void n() {
        this.n0 = false;
        this.A.zzb();
        this.z.zzb();
        this.m0 = false;
        this.l0 = false;
    }

    public final void o() {
        if(this.s0) {
            this.q0 = 1;
            this.r0 = 3;
            return;
        }
        this.J();
        this.H();
    }

    public abstract zzqb p(zzqf arg1, zzad arg2, float arg3);

    public abstract List q(zzqk arg1, zzad arg2);

    public void r(Exception exception0) {
        throw null;
    }

    public void s(String s, long v, long v1) {
        throw null;
    }

    public void t(String s) {
        throw null;
    }

    public final boolean u() {
        if(this.s0) {
            this.q0 = 1;
            if(!this.W && !this.Y) {
                this.r0 = 2;
                return true;
            }
            this.r0 = 3;
            return false;
        }
        try {
            throw null;
        }
        catch(MediaCryptoException mediaCryptoException0) {
            throw this.b(mediaCryptoException0, this.H, false, 6006);
        }
    }

    public final boolean v() {
        boolean z1;
        zzqd zzqd0 = this.M;
        if(zzqd0 == null || this.q0 == 2 || this.x0) {
            return false;
        }
        zzgb zzgb0 = this.y;
        if(this.g0 < 0) {
            int v = zzqd0.zza();
            this.g0 = v;
            if(v < 0) {
                return false;
            }
            zzgb0.zzb = this.M.zzf(v);
            zzgb0.zzb();
        }
        if(this.q0 == 1) {
            if(!this.d0) {
                this.t0 = true;
                this.M.zzj(this.g0, 0, 0, 0L, 4);
                this.g0 = -1;
                zzgb0.zzb = null;
            }
            this.q0 = 2;
            return false;
        }
        if(this.b0) {
            this.b0 = false;
            zzgb0.zzb.put(zzqi.G0);
            this.M.zzj(this.g0, 0, 38, 0L, 0);
            this.g0 = -1;
            zzgb0.zzb = null;
            this.s0 = true;
            return true;
        }
        if(this.p0 == 1) {
            for(int v1 = 0; v1 < this.N.zzo.size(); ++v1) {
                byte[] arr_b = (byte[])this.N.zzo.get(v1);
                zzgb0.zzb.put(arr_b);
            }
            this.p0 = 2;
        }
        int v2 = zzgb0.zzb.position();
        zziz zziz0 = this.j;
        zziz0.zzb = null;
        zziz0.zza = null;
        try {
            int v3 = this.a(zziz0, zzgb0, 0);
        }
        catch(zzga zzga0) {
            this.r(zzga0);
            this.w(0);
            this.z();
            return true;
        }
        if(this.zzG()) {
            this.w0 = this.v0;
        }
        switch(v3) {
            case -5: {
                if(this.p0 == 2) {
                    zzgb0.zzb();
                    this.p0 = 1;
                }
                this.m(zziz0);
                return true;
            }
            case -3: {
                return false;
            }
            default: {
                if(zzgb0.zzg()) {
                    if(this.p0 == 2) {
                        zzgb0.zzb();
                        this.p0 = 1;
                    }
                    this.x0 = true;
                    if(!this.s0) {
                        this.P();
                        return false;
                    }
                    try {
                        if(!this.d0) {
                            this.t0 = true;
                            this.M.zzj(this.g0, 0, 0, 0L, 4);
                            this.g0 = -1;
                            zzgb0.zzb = null;
                            return false;
                        }
                        return false;
                    }
                    catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                        throw this.b(mediaCodec$CryptoException0, this.H, false, zzeg.zzl(mediaCodec$CryptoException0.getErrorCode()));
                    }
                }
                if(!this.s0 && !zzgb0.zzh()) {
                    zzgb0.zzb();
                    if(this.p0 == 2) {
                        this.p0 = 1;
                    }
                    return true;
                }
                boolean z = zzgb0.zzk();
                if(z) {
                    zzgb0.zza.zzb(v2);
                }
                if(this.V && !z) {
                    ByteBuffer byteBuffer0 = zzgb0.zzb;
                    int v4 = byteBuffer0.position();
                    int v6 = 0;
                    for(int v5 = 0; true; ++v5) {
                        if(v5 + 1 >= v4) {
                            byteBuffer0.clear();
                            break;
                        }
                        int v7 = byteBuffer0.get(v5) & 0xFF;
                        if(v6 != 3) {
                            if(v7 == 0) {
                                ++v6;
                            }
                        }
                        else if(v7 == 1) {
                            if((byteBuffer0.get(v5 + 1) & 0x1F) == 7) {
                                ByteBuffer byteBuffer1 = byteBuffer0.duplicate();
                                byteBuffer1.position(v5 - 3);
                                byteBuffer1.limit(v4);
                                byteBuffer0.position(0);
                                byteBuffer0.put(byteBuffer1);
                                break;
                            }
                            v7 = 1;
                        }
                        if(v7 != 0) {
                            v6 = 0;
                        }
                    }
                    if(zzgb0.zzb.position() == 0) {
                        return true;
                    }
                    this.V = false;
                }
                long v8 = zzgb0.zzd;
                fb fb0 = this.e0;
                if(fb0 == null) {
                    z1 = z;
                }
                else {
                    zzad zzad0 = this.H;
                    if(fb0.b == 0L) {
                        fb0.a = v8;
                    }
                    if(!fb0.c) {
                        ByteBuffer byteBuffer2 = zzgb0.zzb;
                        byteBuffer2.getClass();
                        int v9 = 0;
                        for(int v10 = 0; v10 < 4; ++v10) {
                            v9 = v9 << 8 | byteBuffer2.get(v10) & 0xFF;
                        }
                        int v11 = zzzl.zzc(v9);
                        if(v11 == -1) {
                            fb0.c = true;
                            fb0.b = 0L;
                            fb0.a = zzgb0.zzd;
                            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                            v8 = zzgb0.zzd;
                        }
                        else {
                            long v12 = fb0.a;
                            long v13 = Math.max(0L, (fb0.b - 529L) * 1000000L / ((long)zzad0.zzA));
                            fb0.b += (long)v11;
                            v8 = v13 + v12;
                        }
                    }
                    long v14 = this.v0;
                    fb fb1 = this.e0;
                    zzad zzad1 = this.H;
                    fb1.getClass();
                    z1 = z;
                    this.v0 = Math.max(v14, Math.max(0L, (fb1.b - 529L) * 1000000L / ((long)zzad1.zzA)) + fb1.a);
                }
                if(zzgb0.zzf()) {
                    this.C.add(v8);
                }
                if(this.z0) {
                    this.B.zzd(v8, this.H);
                    this.z0 = false;
                }
                this.v0 = Math.max(this.v0, v8);
                zzgb0.zzj();
                if(zzgb0.zze()) {
                    this.G(zzgb0);
                }
                this.B(zzgb0);
                try {
                    if(z1) {
                        this.M.zzk(this.g0, 0, zzgb0.zza, v8, 0);
                    }
                    else {
                        this.M.zzj(this.g0, 0, zzgb0.zzb.limit(), v8, 0);
                    }
                }
                catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                    throw this.b(mediaCodec$CryptoException1, this.H, false, zzeg.zzl(mediaCodec$CryptoException1.getErrorCode()));
                }
                this.g0 = -1;
                zzgb0.zzb = null;
                this.s0 = true;
                this.p0 = 0;
                ++this.A0.zzc;
                return true;
            }
        }
    }

    public final boolean w(int v) {
        zziz zziz0 = this.j;
        zziz0.zzb = null;
        zziz0.zza = null;
        zzgb zzgb0 = this.x;
        zzgb0.zzb();
        int v1 = this.a(zziz0, zzgb0, v | 4);
        if(v1 == -5) {
            this.m(zziz0);
            return true;
        }
        if(v1 == -4 && zzgb0.zzg()) {
            this.x0 = true;
            this.P();
        }
        return false;
    }

    public final boolean x(zzad zzad0) {
        if(zzeg.zza < 23) {
            return true;
        }
        if(this.M != null && this.r0 != 3 && this.zzbe() != 0) {
            float f = this.L;
            zzad[] arr_zzad = this.p;
            arr_zzad.getClass();
            float f1 = this.j(f, arr_zzad);
            float f2 = this.Q;
            if(f2 == f1) {
                return true;
            }
            if(f1 == -1.0f) {
                this.o();
                return false;
            }
            if(f2 == -1.0f && f1 <= this.w) {
                return true;
            }
            Bundle bundle0 = new Bundle();
            bundle0.putFloat("operating-rate", f1);
            this.M.zzp(bundle0);
            this.Q = f1;
        }
        return true;
    }

    public void y(zzad zzad0, MediaFormat mediaFormat0) {
        throw null;
    }

    public final void z() {
        try {
            this.M.zzi();
        }
        finally {
            this.K();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public void zzD(float f, float f1) throws zzgt {
        this.K = f;
        this.L = f1;
        this.x(this.N);
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public final void zzL(long v, long v1) throws zzgt {
        MediaCodec.BufferInfo mediaCodec$BufferInfo1;
        boolean z4;
        int v7;
        zzqi zzqi1;
        eb eb0;
        zzed zzed0;
        zzqi zzqi0;
        try {
            zzqi0 = this;
            long v2 = zzqi0.J;
            zzed0 = zzqi0.B;
            eb0 = zzqi0.A;
            if(zzqi0.y0) {
                this.C();
                return;
            }
            if(zzqi0.H == null && !zzqi0.w(2)) {
                return;
            }
            this.H();
            if(zzqi0.l0) {
                Trace.beginSection("bypassRender");
                while(true) {
                    while(true) {
                    label_12:
                        zzcw.zzf(!zzqi0.y0);
                        int v3 = eb0.d;
                        boolean z = v3 > 0;
                        if(z) {
                            ByteBuffer byteBuffer0 = eb0.zzb;
                            int v4 = zzqi0.h0;
                            long v5 = eb0.zzd;
                            boolean z1 = eb0.zzf();
                            boolean z2 = eb0.zzg();
                            goto label_24;
                        }
                        goto label_28;
                    }
                }
            }
            goto label_75;
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_155;
        }
        try {
        label_24:
            if(!this.D(v, v1, null, byteBuffer0, v4, 0, v3, v5, z1, z2, zzqi0.I)) {
                zzqi0 = this;
                goto label_73;
            }
            zzqi0 = this;
        }
        catch(IllegalStateException illegalStateException0) {
            zzqi1 = this;
            goto label_200;
        }
        try {
            zzqi0.I(eb0.c);
            eb0.zzb();
        label_28:
            if(zzqi0.x0) {
                zzqi0.y0 = true;
                goto label_73;
            }
            zzgb zzgb0 = zzqi0.z;
            if(zzqi0.m0) {
                zzcw.zzf(eb0.c(zzgb0));
                zzqi0.m0 = false;
            }
            if(zzqi0.n0) {
                if(eb0.d > 0) {
                    goto label_12;
                }
                this.n();
                zzqi0.n0 = false;
                this.H();
                if(!zzqi0.l0) {
                    goto label_73;
                }
            }
            zzcw.zzf(!zzqi0.x0);
            zziz zziz0 = zzqi0.j;
            zziz0.zzb = null;
            zziz0.zza = null;
            zzgb0.zzb();
            do {
                zzgb0.zzb();
                switch(zzqi0.a(zziz0, zzgb0, 0)) {
                    case -5: {
                        zzqi0.m(zziz0);
                        goto label_64;
                    }
                    case -4: {
                        if(zzgb0.zzg()) {
                            goto label_63;
                        }
                        if(zzqi0.z0) {
                            zzad zzad0 = zzqi0.H;
                            if(zzad0 == null) {
                                throw null;
                            }
                            zzqi0.I = zzad0;
                            zzqi0.y(zzad0, null);
                            zzqi0.z0 = false;
                        }
                        break;
                    }
                    default: {
                        goto label_64;
                    }
                }
                zzgb0.zzj();
            }
            while(eb0.c(zzgb0));
            zzqi0.m0 = true;
            goto label_64;
        label_63:
            zzqi0.x0 = true;
        label_64:
            if(eb0.d > 0) {
                eb0.zzj();
            }
            if(eb0.d > 0 || zzqi0.x0 || zzqi0.n0) {
                goto label_12;
            }
        }
        catch(IllegalStateException illegalStateException0) {
            goto label_155;
        }
        goto label_73;
        try {
            zzqi0 = this;
            goto label_73;
        }
        catch(IllegalStateException illegalStateException0) {
            try {
                zzqi1 = this;
                goto label_200;
            label_73:
                Trace.endSection();
                return;
            label_75:
                if(zzqi0.M != null) {
                    goto label_76;
                }
                goto label_191;
            }
            catch(IllegalStateException illegalStateException0) {
                goto label_155;
            }
        }
        try {
        label_76:
            long v6 = SystemClock.elapsedRealtime();
            Trace.beginSection("drainAndFeed");
        }
        catch(IllegalStateException illegalStateException0) {
            try {
                zzqi1 = zzqi0;
            }
            catch(IllegalStateException illegalStateException0) {
            }
            goto label_200;
        }
        while(true) {
            MediaCodec.BufferInfo mediaCodec$BufferInfo0 = zzqi0.D;
            if(zzqi0.h0 < 0) {
                try {
                    if(!zzqi0.Z) {
                    }
                    else if(!zzqi0.t0) {
                        v7 = zzqi0.M.zzb(mediaCodec$BufferInfo0);
                        goto label_96;
                    }
                    v7 = zzqi0.M.zzb(mediaCodec$BufferInfo0);
                    goto label_96;
                }
                catch(IllegalStateException illegalStateException0) {
                    goto label_155;
                }
                try {
                    v7 = zzqi0.M.zzb(mediaCodec$BufferInfo0);
                    goto label_96;
                }
                catch(IllegalStateException unused_ex) {
                    try {
                        this.P();
                        if(!zzqi0.y0) {
                            zzqi1 = zzqi0;
                            goto label_187;
                        }
                        this.J();
                        zzqi1 = zzqi0;
                        goto label_187;
                    label_96:
                        if(v7 < 0) {
                            if(v7 == -2) {
                                zzqi0.u0 = true;
                                MediaFormat mediaFormat0 = zzqi0.M.zzc();
                                if(zzqi0.U == 0 || mediaFormat0.getInteger("width") != 0x20 || mediaFormat0.getInteger("height") != 0x20) {
                                    zzqi0.O = mediaFormat0;
                                    zzqi0.P = true;
                                }
                                else {
                                    zzqi0.c0 = true;
                                }
                                zzqi1 = zzqi0;
                                goto label_183;
                            }
                            if(zzqi0.d0 && (zzqi0.x0 || zzqi0.q0 == 2)) {
                                this.P();
                            }
                            zzqi1 = zzqi0;
                            goto label_187;
                        }
                        else if(zzqi0.c0) {
                            zzqi0.c0 = false;
                            zzqi0.M.zzn(v7, false);
                            zzqi1 = zzqi0;
                            goto label_183;
                        }
                        else {
                            if(mediaCodec$BufferInfo0.size == 0 && (mediaCodec$BufferInfo0.flags & 4) != 0) {
                                this.P();
                                zzqi1 = zzqi0;
                                goto label_187;
                            }
                            zzqi0.h0 = v7;
                            ByteBuffer byteBuffer1 = zzqi0.M.zzg(v7);
                            zzqi0.i0 = byteBuffer1;
                            if(byteBuffer1 != null) {
                                byteBuffer1.position(mediaCodec$BufferInfo0.offset);
                                zzqi0.i0.limit(mediaCodec$BufferInfo0.offset + mediaCodec$BufferInfo0.size);
                            }
                            if(zzqi0.a0 && mediaCodec$BufferInfo0.presentationTimeUs == 0L && (mediaCodec$BufferInfo0.flags & 4) != 0) {
                                long v8 = zzqi0.v0;
                                if(v8 != 0x8000000000000001L) {
                                    mediaCodec$BufferInfo0.presentationTimeUs = v8;
                                }
                            }
                            boolean z3 = false;
                            long v9 = mediaCodec$BufferInfo0.presentationTimeUs;
                            ArrayList arrayList0 = zzqi0.C;
                            int v10 = arrayList0.size();
                            for(int v11 = 0; v11 < v10; ++v11) {
                                if(((long)(((Long)arrayList0.get(v11)))) == v9) {
                                    arrayList0.remove(v11);
                                    z3 = true;
                                    break;
                                }
                            }
                            zzqi0.j0 = z3;
                            zzqi0.k0 = zzqi0.w0 == mediaCodec$BufferInfo0.presentationTimeUs;
                            zzad zzad1 = (zzad)zzed0.zzc(mediaCodec$BufferInfo0.presentationTimeUs);
                            if(zzad1 == null && zzqi0.P) {
                                zzad1 = (zzad)zzed0.zzb();
                            }
                            if(zzad1 != null) {
                                zzqi0.I = zzad1;
                                zzqi0.y(zzqi0.I, zzqi0.O);
                                zzqi0.P = false;
                            }
                            else if(zzqi0.P && zzqi0.I != null) {
                                zzqi0.y(zzqi0.I, zzqi0.O);
                                zzqi0.P = false;
                            }
                        }
                    label_152:
                        if(!zzqi0.Z || !zzqi0.t0) {
                            mediaCodec$BufferInfo1 = mediaCodec$BufferInfo0;
                            goto label_170;
                        }
                        else {
                            z4 = this.D(v, v1, zzqi0.M, zzqi0.i0, zzqi0.h0, mediaCodec$BufferInfo0.flags, 1, mediaCodec$BufferInfo0.presentationTimeUs, zzqi0.j0, zzqi0.k0, zzqi0.I);
                            mediaCodec$BufferInfo1 = mediaCodec$BufferInfo0;
                        }
                        goto label_171;
                    }
                    catch(IllegalStateException illegalStateException0) {
                        goto label_155;
                    }
                }
            }
            goto label_152;
        label_155:
            zzqi1 = zzqi0;
            break;
            try {
                z4 = this.D(v, v1, zzqi0.M, zzqi0.i0, zzqi0.h0, mediaCodec$BufferInfo0.flags, 1, mediaCodec$BufferInfo0.presentationTimeUs, zzqi0.j0, zzqi0.k0, zzqi0.I);
                mediaCodec$BufferInfo1 = mediaCodec$BufferInfo0;
                goto label_171;
            }
            catch(IllegalStateException unused_ex) {
                try {
                    this.P();
                    if(this.y0) {
                        this.J();
                    }
                    zzqi1 = this;
                    goto label_187;
                }
                catch(IllegalStateException illegalStateException0) {
                }
            }
            zzqi1 = this;
            break;
            try {
            label_170:
                z4 = this.D(v, v1, zzqi0.M, zzqi0.i0, zzqi0.h0, mediaCodec$BufferInfo0.flags, 1, mediaCodec$BufferInfo0.presentationTimeUs, zzqi0.j0, zzqi0.k0, zzqi0.I);
            label_171:
                if(z4) {
                    zzqi1 = this;
                    goto label_177;
                }
                else {
                    goto label_186;
                }
                goto label_187;
            }
            catch(IllegalStateException illegalStateException0) {
                try {
                    zzqi1 = this;
                    break;
                label_177:
                    zzqi1.I(mediaCodec$BufferInfo1.presentationTimeUs);
                    zzqi1.h0 = -1;
                    zzqi1.i0 = null;
                    if((mediaCodec$BufferInfo1.flags & 4) == 0) {
                    label_183:
                        if(v2 == 0x8000000000000001L || SystemClock.elapsedRealtime() - v6 < v2) {
                            zzqi0 = zzqi1;
                            continue;
                        label_186:
                            zzqi1 = this;
                        }
                    }
                    else {
                        this.P();
                    }
                    while(true) {
                    label_187:
                        if(!this.v() || v2 != 0x8000000000000001L && SystemClock.elapsedRealtime() - v6 >= v2) {
                            Trace.endSection();
                            return;
                        }
                    }
                label_191:
                    zzqi1 = zzqi0;
                    zzgl zzgl0 = zzqi1.A0;
                    int v12 = zzgl0.zzd;
                    zztq zztq0 = zzqi1.o;
                    zztq0.getClass();
                    zzgl0.zzd = v12 + zztq0.zzb(v - zzqi1.q);
                    zzqi1.w(1);
                    return;
                }
                catch(IllegalStateException illegalStateException0) {
                    break;
                }
            }
        }
    label_200:
        int v13 = zzeg.zza;
        if(v13 < 21 || !(illegalStateException0 instanceof MediaCodec.CodecException)) {
            StackTraceElement[] arr_stackTraceElement = illegalStateException0.getStackTrace();
            if(arr_stackTraceElement.length <= 0 || !arr_stackTraceElement[0].getClassName().equals("android.media.MediaCodec")) {
                throw illegalStateException0;
            }
        }
        zzqi1.r(illegalStateException0);
        boolean z5 = v13 >= 21 && illegalStateException0 instanceof MediaCodec.CodecException && ((MediaCodec.CodecException)illegalStateException0).isRecoverable();
        if(z5) {
            this.J();
        }
        throw zzqi1.b(zzqi1.F(illegalStateException0, zzqi1.T), zzqi1.H, z5, 4003);
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public boolean zzM() {
        return this.y0;
    }

    @Override  // com.google.android.gms.internal.ads.zzjt
    public boolean zzN() {
        if(this.H != null) {
            if(this.zzG()) {
                return !this.s && this.h0 < 0 ? this.f0 != 0x8000000000000001L && SystemClock.elapsedRealtime() < this.f0 : true;
            }
            zztq zztq0 = this.o;
            zztq0.getClass();
            return !zztq0.zze() && this.h0 < 0 ? this.f0 != 0x8000000000000001L && SystemClock.elapsedRealtime() < this.f0 : true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzju
    public final int zzO(zzad zzad0) throws zzgt {
        try {
            return this.k(this.v, zzad0);
        }
        catch(zzqr zzqr0) {
            throw this.b(zzqr0, zzad0, false, 4002);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzgk
    public final int zze() {
        return 8;
    }
}

