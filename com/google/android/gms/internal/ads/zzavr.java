package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CryptoException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;

@TargetApi(19)
public abstract class zzavr extends zzard {
    public ByteBuffer[] A;
    public ByteBuffer[] B;
    public long C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public zzatn O;
    public static final byte[] P;
    public final zzavt i;
    public final zzato j;
    public final zzato k;
    public final zzaru l;
    public final ArrayList m;
    public final MediaCodec.BufferInfo n;
    public zzart o;
    public MediaCodec p;
    public zzavp q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    static {
        zzavr.P = new byte[]{0, 0, 1, 103, 66, (byte)0xC0, 11, -38, 37, (byte)0x90, 0, 0, 1, 104, -50, 15, 19, 0x20, 0, 0, 1, 101, -120, (byte)0x84, 13, -50, 0x71, 24, (byte)0xA0, 0, 0x2F, -65, 28, 49, -61, 39, 93, 120};
    }

    public zzavr(int v, zzavt zzavt0, zzatt zzatt0, boolean z) {
        super(v);
        zzayz.zze(zzazo.zza >= 16);
        this.i = zzavt0;
        this.j = new zzato(0);
        this.k = new zzato(0);
        this.l = new zzaru();
        this.m = new ArrayList();
        this.n = new MediaCodec.BufferInfo();
        this.H = 0;
        this.I = 0;
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public void b() {
        this.o = null;
        this.r();
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public void c(boolean z) {
        this.O = new zzatn();
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public void d(long v, boolean z) {
        this.L = false;
        this.M = false;
        if(this.p != null) {
            this.C = 0x8000000000000001L;
            this.D = -1;
            this.E = -1;
            this.N = true;
            this.F = false;
            this.m.clear();
            this.y = false;
            this.z = false;
            if(this.s || this.v && this.K) {
                this.r();
                this.p();
            }
            else if(this.I != 0) {
                this.r();
                this.p();
            }
            else {
                this.p.flush();
                this.J = false;
            }
            if(this.G && this.o != null) {
                this.H = 1;
            }
        }
    }

    public abstract int h(zzart arg1);

    public final void i() {
        if(this.I == 2) {
            this.r();
            this.p();
            return;
        }
        this.M = true;
        this.n();
    }

    public abstract void j(zzavp arg1, MediaCodec arg2, zzart arg3);

    public void k(String s, long v, long v1) {
        throw null;
    }

    public void l(zzart zzart0) {
        zzart zzart1 = this.o;
        this.o = zzart0;
        boolean z = true;
        if(!zzazo.zzo(zzart0.zzi, (zzart1 == null ? null : zzart1.zzi)) && this.o.zzi != null) {
            throw zzarf.zza(new IllegalStateException("Media requires a DrmSessionManager"), this.c);
        }
        if(this.p != null && this.s(this.q.zzb, zzart1, this.o)) {
            this.G = true;
            this.H = 1;
            if(!this.t || (this.o.zzj != zzart1.zzj || this.o.zzk != zzart1.zzk)) {
                z = false;
            }
            this.y = z;
            return;
        }
        if(this.J) {
            this.I = 1;
            return;
        }
        this.r();
        this.p();
    }

    public void m(MediaCodec mediaCodec0, MediaFormat mediaFormat0) {
        throw null;
    }

    public void n() {
    }

    public abstract boolean o(long arg1, long arg2, MediaCodec arg3, ByteBuffer arg4, int arg5, long arg6, boolean arg7);

    public final void p() {
        boolean z2;
        boolean z1;
        boolean z;
        if(this.p == null) {
            zzart zzart0 = this.o;
            if(zzart0 != null) {
                zzavp zzavp0 = this.q;
                if(zzavp0 == null) {
                    try {
                        zzavp0 = zzawb.zzc(zzart0.zzf, false);
                        this.q = zzavp0;
                    }
                    catch(zzavw zzavw0) {
                        throw zzarf.zza(new zzavq(this.o, zzavw0, false, 0xFFFF3CB2), this.c);
                    }
                    if(zzavp0 == null) {
                        throw zzarf.zza(new zzavq(this.o, null, false, 0xFFFF3CB1), this.c);
                    }
                }
                if(!this.t(zzavp0)) {
                    return;
                }
                String s = this.q.zza;
                int v = zzazo.zza;
                this.r = v < 21 && this.o.zzh.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(s);
                if(v < 18 || v == 18 && ("OMX.SEC.avc.dec".equals(s) || "OMX.SEC.avc.dec.secure".equals(s))) {
                    z = true;
                }
                else if(v != 19 || !zzazo.zzd.startsWith("SM-G800") || !"OMX.Exynos.avc.dec".equals(s) && !"OMX.Exynos.avc.dec.secure".equals(s)) {
                    z = false;
                }
                else {
                    z = true;
                }
                this.s = z;
                if(v >= 24 || !"OMX.Nvidia.h264.decode".equals(s) && !"OMX.Nvidia.h264.decode.secure".equals(s)) {
                    z1 = false;
                }
                else if("flounder".equals(zzazo.zzb) || "flounder_lte".equals(zzazo.zzb) || "grouper".equals(zzazo.zzb) || "tilapia".equals(zzazo.zzb)) {
                    z1 = true;
                }
                else {
                    z1 = false;
                }
                this.t = z1;
                this.u = v <= 17 && ("OMX.rk.video_decoder.avc".equals(s) || "OMX.allwinner.video.decoder.avc".equals(s));
                if(v <= 23 && "OMX.google.vorbis.decoder".equals(s)) {
                    z2 = true;
                }
                else if(v > 19 || !"hb2000".equals(zzazo.zzb) || !"OMX.amlogic.avc.decoder.awesome".equals(s) && !"OMX.amlogic.avc.decoder.awesome.secure".equals(s)) {
                    z2 = false;
                }
                else {
                    z2 = true;
                }
                this.v = z2;
                this.w = v == 21 && "OMX.google.aac.decoder".equals(s);
                boolean z3 = v <= 18 && this.o.zzr == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(s);
                try {
                    this.x = z3;
                    long v1 = SystemClock.elapsedRealtime();
                    zzazm.zza(("createCodec:" + s));
                    this.p = MediaCodec.createByCodecName(s);
                    zzazm.zzb();
                    zzazm.zza("configureCodec");
                    this.j(this.q, this.p, this.o);
                    zzazm.zzb();
                    zzazm.zza("startCodec");
                    this.p.start();
                    zzazm.zzb();
                    long v2 = SystemClock.elapsedRealtime();
                    this.k(s, v2, v2 - v1);
                    this.A = this.p.getInputBuffers();
                    this.B = this.p.getOutputBuffers();
                }
                catch(Exception exception0) {
                    throw zzarf.zza(new zzavq(this.o, exception0, false, s), this.c);
                }
                this.C = this.zzb() == 2 ? SystemClock.elapsedRealtime() + 1000L : 0x8000000000000001L;
                this.D = -1;
                this.E = -1;
                this.N = true;
                ++this.O.zza;
            }
        }
    }

    public void q() {
    }

    public void r() {
        this.C = 0x8000000000000001L;
        this.D = -1;
        this.E = -1;
        this.F = false;
        this.m.clear();
        this.A = null;
        this.B = null;
        this.q = null;
        this.G = false;
        this.J = false;
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.K = false;
        this.H = 0;
        this.I = 0;
        this.j.zzb = null;
        MediaCodec mediaCodec0 = this.p;
        if(mediaCodec0 != null) {
            try {
                ++this.O.zzb;
                mediaCodec0.stop();
            }
            catch(Throwable throwable0) {
                try {
                    this.p.release();
                }
                catch(Throwable throwable1) {
                    this.p = null;
                    throw throwable1;
                }
                this.p = null;
                throw throwable0;
            }
            try {
                this.p.release();
                this.p = null;
            }
            catch(Throwable throwable2) {
                this.p = null;
                throw throwable2;
            }
        }
    }

    public boolean s(boolean z, zzart zzart0, zzart zzart1) {
        return false;
    }

    public boolean t(zzavp zzavp0) {
        return true;
    }

    // This method was un-flattened
    @Override  // com.google.android.gms.internal.ads.zzary
    public final void zzD(long v, long v1) throws zzarf {
        ArrayList arrayList2;
        boolean z1;
        boolean z;
        ArrayList arrayList1;
        int v3;
        if(this.M) {
            this.n();
            return;
        }
        zzaru zzaru0 = this.l;
        zzato zzato0 = this.k;
        if(this.o == null) {
            zzato0.zzb();
            int v2 = this.a(zzaru0, zzato0, true);
            if(v2 == -5) {
                this.l(zzaru0.zza);
                goto label_16;
            }
            if(v2 == -4) {
                zzayz.zze(zzato0.zzf());
                this.L = true;
                this.i();
            }
            return;
        }
    label_16:
        this.p();
        if(this.p != null) {
            zzazm.zza("drainAndFeed");
        alab1:
            while(true) {
                ArrayList arrayList0 = this.m;
                MediaCodec.BufferInfo mediaCodec$BufferInfo0 = this.n;
                if(this.E >= 0) {
                    goto label_77;
                }
                if(!this.w || !this.K) {
                    v3 = this.p.dequeueOutputBuffer(mediaCodec$BufferInfo0, 0L);
                    this.E = v3;
                }
                else {
                    try {
                        v3 = this.p.dequeueOutputBuffer(mediaCodec$BufferInfo0, 0L);
                        this.E = v3;
                    }
                    catch(IllegalStateException unused_ex) {
                        this.i();
                        if(this.M) {
                            this.r();
                        }
                        arrayList1 = arrayList0;
                        break;
                    }
                }
                if(v3 >= 0) {
                    if(this.z) {
                        this.z = false;
                        this.p.releaseOutputBuffer(v3, false);
                        this.E = -1;
                        continue;
                    }
                    else {
                        if((mediaCodec$BufferInfo0.flags & 4) != 0) {
                            this.i();
                            this.E = -1;
                            arrayList1 = arrayList0;
                            break;
                        }
                        ByteBuffer byteBuffer0 = this.B[this.E];
                        if(byteBuffer0 != null) {
                            byteBuffer0.position(mediaCodec$BufferInfo0.offset);
                            byteBuffer0.limit(mediaCodec$BufferInfo0.offset + mediaCodec$BufferInfo0.size);
                        }
                        long v4 = mediaCodec$BufferInfo0.presentationTimeUs;
                        int v5 = arrayList0.size();
                        int v6 = 0;
                        while(true) {
                            z = false;
                            if(v6 < v5) {
                                if(((long)(((Long)arrayList0.get(v6)))) == v4) {
                                    arrayList0.remove(v6);
                                    z = true;
                                }
                                else {
                                    ++v6;
                                    continue;
                                }
                            }
                            break;
                        }
                        this.F = z;
                        goto label_77;
                    }
                }
                switch(v3) {
                    case -3: {
                        this.B = this.p.getOutputBuffers();
                        break;
                    }
                    case -2: {
                        MediaFormat mediaFormat0 = this.p.getOutputFormat();
                        if(!this.t || mediaFormat0.getInteger("width") != 0x20 || mediaFormat0.getInteger("height") != 0x20) {
                            if(this.x) {
                                mediaFormat0.setInteger("channel-count", 1);
                            }
                            this.m(this.p, mediaFormat0);
                        }
                        else {
                            this.z = true;
                        }
                        break;
                    label_77:
                        if(!this.w || !this.K) {
                            arrayList1 = arrayList0;
                            z1 = this.o(v, v1, this.p, this.B[this.E], this.E, mediaCodec$BufferInfo0.presentationTimeUs, this.F);
                        label_87:
                            if(z1) {
                                this.E = -1;
                                break;
                            }
                            break alab1;
                        }
                        else {
                            try {
                                arrayList1 = arrayList0;
                                z1 = this.o(v, v1, this.p, this.B[this.E], this.E, mediaCodec$BufferInfo0.presentationTimeUs, this.F);
                                goto label_87;
                            }
                            catch(IllegalStateException unused_ex) {
                                this.i();
                                if(this.M) {
                                    this.r();
                                }
                                break alab1;
                            }
                        }
                        zzazm.zzb();
                        return;
                    }
                    default: {
                        if(this.u && (this.L || this.I == 2)) {
                            this.i();
                        }
                        arrayList1 = arrayList0;
                        break alab1;
                    }
                }
            }
            while(true) {
                MediaCodec mediaCodec0 = this.p;
                if(mediaCodec0 == null || this.I == 2 || this.L) {
                    break;
                }
                zzato zzato1 = this.j;
                if(this.D < 0) {
                    int v7 = mediaCodec0.dequeueInputBuffer(0L);
                    this.D = v7;
                    if(v7 < 0) {
                        break;
                    }
                    zzato1.zzb = this.A[v7];
                    zzato1.zzb();
                }
                if(this.I == 1) {
                    if(!this.u) {
                        this.K = true;
                        this.p.queueInputBuffer(this.D, 0, 0, 0L, 4);
                        this.D = -1;
                    }
                    this.I = 2;
                    break;
                }
                if(this.y) {
                    this.y = false;
                    zzato1.zzb.put(zzavr.P);
                    this.p.queueInputBuffer(this.D, 0, 38, 0L, 0);
                    this.D = -1;
                    this.J = true;
                    arrayList2 = arrayList1;
                }
                else {
                    if(this.H == 1) {
                        for(int v8 = 0; v8 < this.o.zzh.size(); ++v8) {
                            byte[] arr_b = (byte[])this.o.zzh.get(v8);
                            zzato1.zzb.put(arr_b);
                        }
                        this.H = 2;
                    }
                    int v9 = zzato1.zzb.position();
                    int v10 = this.a(zzaru0, zzato1, false);
                    if(v10 == -3) {
                        break;
                    }
                    if(v10 == -5) {
                        if(this.H == 2) {
                            zzato1.zzb();
                            this.H = 1;
                        }
                        this.l(zzaru0.zza);
                        arrayList2 = arrayList1;
                    }
                    else {
                        if(zzato1.zzf()) {
                            if(this.H == 2) {
                                zzato1.zzb();
                                this.H = 1;
                            }
                            this.L = true;
                            if(!this.J) {
                                this.i();
                                break;
                            }
                            if(this.u) {
                                break;
                            }
                            try {
                                this.K = true;
                                this.p.queueInputBuffer(this.D, 0, 0, 0L, 4);
                                this.D = -1;
                                break;
                            }
                            catch(MediaCodec.CryptoException mediaCodec$CryptoException0) {
                                throw zzarf.zza(mediaCodec$CryptoException0, this.c);
                            }
                        }
                        if(!this.N || zzato1.zzg()) {
                            this.N = false;
                            boolean z2 = zzato1.zzi();
                            if(this.r && !z2) {
                                ByteBuffer byteBuffer1 = zzato1.zzb;
                                int v11 = byteBuffer1.position();
                                int v12 = 0;
                                int v13 = 0;
                                while(true) {
                                    if(v13 + 1 >= v11) {
                                        byteBuffer1.clear();
                                        break;
                                    }
                                    int v14 = byteBuffer1.get(v13) & 0xFF;
                                    if(v12 != 3) {
                                    label_173:
                                        if(v14 == 0) {
                                            ++v12;
                                        }
                                    }
                                    else if(v14 == 1) {
                                        if((byteBuffer1.get(v13 + 1) & 0x1F) == 7) {
                                            ByteBuffer byteBuffer2 = byteBuffer1.duplicate();
                                            byteBuffer2.position(v13 - 3);
                                            byteBuffer2.limit(v11);
                                            byteBuffer1.position(0);
                                            byteBuffer1.put(byteBuffer2);
                                            break;
                                        }
                                        else {
                                            v14 = 1;
                                            goto label_175;
                                        }
                                        goto label_173;
                                    }
                                label_175:
                                    if(v14 != 0) {
                                        v12 = 0;
                                    }
                                    ++v13;
                                }
                                if(zzato1.zzb.position() == 0) {
                                    arrayList2 = arrayList1;
                                    goto label_210;
                                }
                                else {
                                    this.r = false;
                                }
                            }
                            try {
                                long v15 = zzato1.zzc;
                                if(zzato1.zze()) {
                                    arrayList2 = arrayList1;
                                    arrayList2.add(v15);
                                }
                                else {
                                    arrayList2 = arrayList1;
                                }
                                zzato1.zzb.flip();
                                this.q();
                                if(z2) {
                                    MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = zzato1.zza.zza();
                                    if(v9 != 0) {
                                        if(mediaCodec$CryptoInfo0.numBytesOfClearData == null) {
                                            mediaCodec$CryptoInfo0.numBytesOfClearData = new int[1];
                                        }
                                        mediaCodec$CryptoInfo0.numBytesOfClearData[0] += v9;
                                    }
                                    this.p.queueSecureInputBuffer(this.D, 0, mediaCodec$CryptoInfo0, v15, 0);
                                }
                                else {
                                    this.p.queueInputBuffer(this.D, 0, zzato1.zzb.limit(), v15, 0);
                                }
                                this.D = -1;
                                this.J = true;
                                this.H = 0;
                                ++this.O.zzc;
                                goto label_210;
                            }
                            catch(MediaCodec.CryptoException mediaCodec$CryptoException1) {
                            }
                            throw zzarf.zza(mediaCodec$CryptoException1, this.c);
                        }
                        else {
                            zzato1.zzb();
                            if(this.H == 2) {
                                this.H = 1;
                            }
                            arrayList2 = arrayList1;
                        }
                    }
                }
            label_210:
                arrayList1 = arrayList2;
            }
            zzazm.zzb();
            return;
        }
        this.e.zzd(v - this.f);
        zzato0.zzb();
        int v16 = this.a(zzaru0, zzato0, false);
        if(v16 == -5) {
            this.l(zzaru0.zza);
            return;
        }
        if(v16 == -4) {
            zzayz.zze(zzato0.zzf());
            this.L = true;
            this.i();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzary
    public boolean zzE() {
        return this.M;
    }

    // 去混淆评级： 低(30)
    @Override  // com.google.android.gms.internal.ads.zzary
    public boolean zzF() {
        return this.o == null ? false : (this.g ? this.h : this.e.zze()) || this.E >= 0 || this.C != 0x8000000000000001L && SystemClock.elapsedRealtime() < this.C;
    }

    @Override  // com.google.android.gms.internal.ads.zzarz
    public final int zzG(zzart zzart0) throws zzarf {
        try {
            return this.h(zzart0);
        }
        catch(zzavw zzavw0) {
            throw zzarf.zza(zzavw0, this.c);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzard
    public final int zze() {
        return 4;
    }
}

