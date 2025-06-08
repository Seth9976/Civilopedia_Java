package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;

@TargetApi(16)
public final class zzazx extends zzavr {
    public final Context Q;
    public final zzazz R;
    public final zzbah S;
    public final boolean T;
    public final long[] U;
    public zzart[] V;
    public zzazw W;
    public Surface X;
    public zzazu Y;
    public boolean Z;
    public long a0;
    public long b0;
    public int c0;
    public int d0;
    public int e0;
    public float f0;
    public int g0;
    public int h0;
    public int i0;
    public float j0;
    public int k0;
    public int l0;
    public int m0;
    public float n0;
    public long o0;
    public int p0;

    public zzazx(Context context0, zzavt zzavt0, long v, Handler handler0, zzbai zzbai0, int v1) {
        super(2, zzavt0, null, false);
        this.Q = context0.getApplicationContext();
        this.R = new zzazz(context0);
        this.S = new zzbah(handler0, zzbai0);
        this.T = false;
        this.U = new long[10];
        this.o0 = 0x8000000000000001L;
        this.a0 = 0x8000000000000001L;
        this.g0 = -1;
        this.h0 = -1;
        this.j0 = -1.0f;
        this.f0 = -1.0f;
        this.k0 = -1;
        this.l0 = -1;
        this.n0 = -1.0f;
        this.m0 = -1;
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void b() {
        this.g0 = -1;
        this.h0 = -1;
        this.j0 = -1.0f;
        this.f0 = -1.0f;
        this.o0 = 0x8000000000000001L;
        this.p0 = 0;
        this.k0 = -1;
        this.l0 = -1;
        this.n0 = -1.0f;
        this.m0 = -1;
        this.Z = false;
        this.R.zzb();
        try {
            super.b();
        }
        finally {
            this.S.zzc(this.O);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void c(boolean z) {
        super.c(z);
        this.S.zze(this.O);
        this.R.zzc();
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void d(long v, boolean z) {
        super.d(v, z);
        this.Z = false;
        this.d0 = 0;
        int v1 = this.p0;
        if(v1 != 0) {
            this.o0 = this.U[v1 - 1];
            this.p0 = 0;
        }
        this.a0 = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public final void e() {
        this.c0 = 0;
        this.b0 = SystemClock.elapsedRealtime();
        this.a0 = 0x8000000000000001L;
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public final void f() {
        if(this.c0 > 0) {
            long v = SystemClock.elapsedRealtime();
            this.S.zzd(this.c0, v - this.b0);
            this.c0 = 0;
            this.b0 = v;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public final void g(zzart[] arr_zzart, long v) {
        this.V = arr_zzart;
        if(this.o0 == 0x8000000000000001L) {
            this.o0 = v;
            return;
        }
        int v1 = this.p0;
        long[] arr_v = this.U;
        if(v1 == 10) {
            Log.w("MediaCodecVideoRenderer", "Too many stream changes, so dropping offset: " + arr_v[9]);
        }
        else {
            this.p0 = v1 + 1;
        }
        arr_v[this.p0 - 1] = v;
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final int h(zzart zzart0) {
        boolean z;
        String s = zzart0.zzf;
        int v = 0;
        if(!zzaze.zzb(s)) {
            return 0;
        }
        zzats zzats0 = zzart0.zzi;
        if(zzats0 == null) {
            z = false;
        }
        else {
            z = false;
            for(int v1 = 0; v1 < zzats0.zza; ++v1) {
                z |= zzats0.zza(v1).zzc;
            }
        }
        zzavp zzavp0 = zzawb.zzc(s, z);
        if(zzavp0 == null) {
            return 1;
        }
        boolean z1 = zzavp0.zze(zzart0.zzc);
        if(z1) {
            int v2 = zzart0.zzj;
            if(v2 > 0) {
                int v3 = zzart0.zzk;
                if(v3 > 0) {
                    z1 = zzavp0.zzf(v2, v3, ((double)zzart0.zzl));
                }
            }
        }
        int v4 = zzavp0.zzb ? 8 : 4;
        if(zzavp0.zzc) {
            v = 16;
        }
        return z1 ? v4 | v | 3 : v4 | v | 2;
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void j(zzavp zzavp0, MediaCodec mediaCodec0, zzart zzart0) {
        int v = zzart0.zzj;
        int v1 = zzart0.zzk;
        int v2 = zzart0.zzg;
        if(v2 == -1) {
            String s = zzart0.zzf;
            if(v == -1 || v1 == -1) {
                v2 = -1;
            }
            else {
                switch(s) {
                    case "video/3gpp": {
                        v2 = v * v1 * 3 / 4;
                        break;
                    }
                    case "video/avc": {
                        if("BRAVIA 4K 2015".equals(zzazo.zzd)) {
                            v2 = -1;
                        }
                        else {
                            int v3 = zzazo.zzd(v, 16);
                            v2 = zzazo.zzd(v1, 16) * v3 * 0x300 / 4;
                        }
                        break;
                    }
                    case "video/hevc": {
                        v2 = v * v1 * 3 / 8;
                        break;
                    }
                    case "video/mp4v-es": {
                        v2 = v * v1 * 3 / 4;
                        break;
                    }
                    case "video/x-vnd.on2.vp8": {
                        v2 = v * v1 * 3 / 4;
                        break;
                    }
                    case "video/x-vnd.on2.vp9": {
                        v2 = v * v1 * 3 / 8;
                        break;
                    }
                    default: {
                        v2 = -1;
                    }
                }
            }
        }
        zzazw zzazw0 = new zzazw(v, v1, v2);
        this.W = zzazw0;
        MediaFormat mediaFormat0 = zzart0.zzb();
        mediaFormat0.setInteger("max-width", zzazw0.zza);
        mediaFormat0.setInteger("max-height", zzazw0.zzb);
        int v4 = zzazw0.zzc;
        if(v4 != -1) {
            mediaFormat0.setInteger("max-input-size", v4);
        }
        if(this.T) {
            mediaFormat0.setInteger("auto-frc", 0);
        }
        if(this.X == null) {
            zzayz.zze(this.x(zzavp0.zzd));
            if(this.Y == null) {
                this.Y = zzazu.zza(this.Q, zzavp0.zzd);
            }
            this.X = this.Y;
        }
        mediaCodec0.configure(mediaFormat0, this.X, null, 0);
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void k(String s, long v, long v1) {
        this.S.zzb(s, v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void l(zzart zzart0) {
        super.l(zzart0);
        this.S.zzf(zzart0);
        this.f0 = zzart0.zzn == -1.0f ? 1.0f : zzart0.zzn;
        this.e0 = zzart0.zzm == -1 ? 0 : zzart0.zzm;
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void m(MediaCodec mediaCodec0, MediaFormat mediaFormat0) {
        this.g0 = !mediaFormat0.containsKey("crop-right") || !mediaFormat0.containsKey("crop-left") || !mediaFormat0.containsKey("crop-bottom") || !mediaFormat0.containsKey("crop-top") ? mediaFormat0.getInteger("width") : mediaFormat0.getInteger("crop-right") - mediaFormat0.getInteger("crop-left") + 1;
        int v = mediaFormat0.getInteger("height");
        this.h0 = v;
        float f = this.f0;
        this.j0 = f;
        if(this.e0 == 90 || this.e0 == 270) {
            int v1 = this.g0;
            this.g0 = v;
            this.h0 = v1;
            this.j0 = 1.0f / f;
        }
        mediaCodec0.setVideoScalingMode(1);
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final boolean o(long v, long v1, MediaCodec mediaCodec0, ByteBuffer byteBuffer0, int v2, long v3, boolean z) {
        int v4;
        while((v4 = this.p0) != 0) {
            long[] arr_v = this.U;
            long v5 = arr_v[0];
            if(v3 < v5) {
                break;
            }
            this.o0 = v5;
            this.p0 = v4 - 1;
            System.arraycopy(arr_v, 1, arr_v, 0, v4 - 1);
        }
        if(z) {
            zzazm.zza("skipVideoBuffer");
            mediaCodec0.releaseOutputBuffer(v2, false);
            zzazm.zzb();
            ++this.O.zze;
            return true;
        }
        long v6 = v3 - v;
        if(this.X == this.Y) {
            if(v6 < -30000L) {
                zzazm.zza("skipVideoBuffer");
                mediaCodec0.releaseOutputBuffer(v2, false);
                zzazm.zzb();
                ++this.O.zze;
                return true;
            }
            return false;
        }
        if(!this.Z) {
            this.v(mediaCodec0, v2, System.nanoTime());
            return true;
        }
        if(this.zzb() != 2) {
            return false;
        }
        long v7 = SystemClock.elapsedRealtime();
        long v8 = System.nanoTime();
        long v9 = this.R.zza(v3, (v6 - (v7 * 1000L - v1)) * 1000L + v8);
        long v10 = (v9 - v8) / 1000L;
        if(v10 < -30000L) {
            zzazm.zza("dropVideoBuffer");
            mediaCodec0.releaseOutputBuffer(v2, false);
            zzazm.zzb();
            ++this.O.zzf;
            ++this.c0;
            int v11 = this.d0 + 1;
            this.d0 = v11;
            this.O.zzg = Math.max(v11, this.O.zzg);
            return true;
        }
        if(v10 < 50000L) {
            this.v(mediaCodec0, v2, v9);
            return true;
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void q() {
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final void r() {
        zzazu zzazu0;
        try {
            super.r();
            zzazu0 = this.Y;
        }
        catch(Throwable throwable0) {
            zzazu zzazu1 = this.Y;
            if(zzazu1 != null) {
                if(this.X == zzazu1) {
                    this.X = null;
                }
                zzazu1.release();
                this.Y = null;
            }
            throw throwable0;
        }
        if(zzazu0 != null) {
            if(this.X == zzazu0) {
                this.X = null;
            }
            zzazu0.release();
            this.Y = null;
        }
    }

    // 去混淆评级： 中等(50)
    @Override  // com.google.android.gms.internal.ads.zzavr
    public final boolean s(boolean z, zzart zzart0, zzart zzart1) {
        return zzart0.zzf.equals(zzart1.zzf) ? (zzart0.zzm == -1 ? 0 : zzart0.zzm) == (zzart1.zzm == -1 ? 0 : zzart1.zzm) && (z || zzart0.zzj == zzart1.zzj && zzart0.zzk == zzart1.zzk) && (zzart1.zzj <= this.W.zza && zzart1.zzk <= this.W.zzb && zzart1.zzg <= this.W.zzc) : false;
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final boolean t(zzavp zzavp0) {
        return this.X != null || this.x(zzavp0.zzd);
    }

    public final void u(MediaCodec mediaCodec0, int v) {
        this.w();
        zzazm.zza("releaseOutputBuffer");
        mediaCodec0.releaseOutputBuffer(v, true);
        zzazm.zzb();
        ++this.O.zzd;
        this.d0 = 0;
        if(!this.Z) {
            this.Z = true;
            this.S.zzg(this.X);
        }
    }

    public final void v(MediaCodec mediaCodec0, int v, long v1) {
        this.w();
        zzazm.zza("releaseOutputBuffer");
        mediaCodec0.releaseOutputBuffer(v, v1);
        zzazm.zzb();
        ++this.O.zzd;
        this.d0 = 0;
        if(!this.Z) {
            this.Z = true;
            this.S.zzg(this.X);
        }
    }

    public final void w() {
        int v = this.g0;
        if(this.k0 == v && this.l0 == this.h0 && this.m0 == this.i0 && this.n0 == this.j0) {
            return;
        }
        this.S.zzh(v, this.h0, this.i0, this.j0);
        this.k0 = this.g0;
        this.l0 = this.h0;
        this.m0 = this.i0;
        this.n0 = this.j0;
    }

    // 去混淆评级： 低(20)
    public final boolean x(boolean z) {
        return !z || zzazu.zzb(this.Q);
    }

    @Override  // com.google.android.gms.internal.ads.zzavr
    public final boolean zzF() {
        if(super.zzF() && (this.Z || (this.Y != null && this.X == this.Y || this.p == null))) {
            this.a0 = 0x8000000000000001L;
            return true;
        }
        if(this.a0 == 0x8000000000000001L) {
            return false;
        }
        if(SystemClock.elapsedRealtime() < this.a0) {
            return true;
        }
        this.a0 = 0x8000000000000001L;
        return false;
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public final void zzl(int v, Object object0) throws zzarf {
        if(v == 1) {
            Surface surface0 = (Surface)object0;
            if(surface0 == null) {
                zzazu zzazu0 = this.Y;
                if(zzazu0 == null) {
                    zzavp zzavp0 = this.q;
                    if(zzavp0 != null && this.x(zzavp0.zzd)) {
                        surface0 = zzazu.zza(this.Q, zzavp0.zzd);
                        this.Y = surface0;
                    }
                }
                else {
                    surface0 = zzazu0;
                }
            }
            zzbah zzbah0 = this.S;
            if(this.X != surface0) {
                this.X = surface0;
                int v1 = this.zzb();
                if(v1 == 1 || v1 == 2) {
                    MediaCodec mediaCodec0 = this.p;
                    if(mediaCodec0 == null || surface0 == null) {
                        this.r();
                        this.p();
                    }
                    else {
                        mediaCodec0.setOutputSurface(surface0);
                    }
                }
                if(surface0 == null || surface0 == this.Y) {
                    goto label_29;
                }
                if(this.k0 != -1 || this.l0 != -1) {
                    zzbah0.zzh(this.g0, this.h0, this.i0, this.j0);
                }
                this.Z = false;
                if(v1 == 2) {
                    this.a0 = 0x8000000000000001L;
                    return;
                label_29:
                    this.k0 = -1;
                    this.l0 = -1;
                    this.n0 = -1.0f;
                    this.m0 = -1;
                    this.Z = false;
                }
            }
            else if(surface0 != null && surface0 != this.Y) {
                if(this.k0 != -1 || this.l0 != -1) {
                    zzbah0.zzh(this.g0, this.h0, this.i0, this.j0);
                }
                if(this.Z) {
                    zzbah0.zzg(this.X);
                }
            }
        }
    }
}

