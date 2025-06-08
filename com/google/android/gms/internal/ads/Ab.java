package com.google.android.gms.internal.ads;

import L.a;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class ab implements zzqd {
    public final MediaCodec a;
    public final db b;
    public final cb c;
    public boolean d;
    public int e;

    public ab(MediaCodec mediaCodec0, HandlerThread handlerThread0, HandlerThread handlerThread1) {
        this.a = mediaCodec0;
        this.b = new db(handlerThread0);
        this.c = new cb(mediaCodec0, handlerThread1);
        this.e = 0;
    }

    public static void a(ab ab0, MediaFormat mediaFormat0, Surface surface0) {
        zzcw.zzf(ab0.b.c == null);
        ab0.b.b.start();
        Handler handler0 = new Handler(ab0.b.b.getLooper());
        MediaCodec mediaCodec0 = ab0.a;
        l5.u(mediaCodec0, ab0.b, handler0);
        ab0.b.c = handler0;
        Trace.beginSection("configureCodec");
        mediaCodec0.configure(mediaFormat0, surface0, null, 0);
        Trace.endSection();
        cb cb0 = ab0.c;
        if(!cb0.f) {
            cb0.b.start();
            cb0.c = new a(cb0, cb0.b.getLooper(), 2);
            cb0.f = true;
        }
        Trace.beginSection("startCodec");
        mediaCodec0.start();
        Trace.endSection();
        ab0.e = 1;
    }

    public static String b(int v, String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        if(v == 1) {
            stringBuilder0.append("Audio");
            return stringBuilder0.toString();
        }
        if(v == 2) {
            stringBuilder0.append("Video");
            return stringBuilder0.toString();
        }
        stringBuilder0.append("Unknown(");
        stringBuilder0.append(v);
        stringBuilder0.append(")");
        return stringBuilder0.toString();
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final int zza() {
        IllegalStateException illegalStateException0;
        db db0 = this.b;
        synchronized(db0.a) {
            int v1 = -1;
            if(db0.k > 0L || db0.l) {
                return -1;
            }
            illegalStateException0 = db0.m;
            if(illegalStateException0 == null) {
                MediaCodec.CodecException mediaCodec$CodecException0 = db0.j;
                if(mediaCodec$CodecException0 == null) {
                    z z0 = db0.d;
                    if(z0.d != 0) {
                        v1 = z0.zza();
                    }
                    return v1;
                }
                db0.j = null;
                throw mediaCodec$CodecException0;
            }
            db0.m = null;
        }
        throw illegalStateException0;
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final int zzb(MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        IllegalStateException illegalStateException0;
        int v2;
        db db0 = this.b;
        synchronized(db0.a) {
            if(db0.k > 0L || db0.l) {
                return -1;
            }
            illegalStateException0 = db0.m;
            if(illegalStateException0 == null) {
                MediaCodec.CodecException mediaCodec$CodecException0 = db0.j;
                if(mediaCodec$CodecException0 == null) {
                    z z0 = db0.e;
                    if(z0.d == 0) {
                        return -1;
                    }
                    int v1 = z0.zza();
                    if(v1 >= 0) {
                        zzcw.zzb(db0.h);
                        MediaCodec.BufferInfo mediaCodec$BufferInfo1 = (MediaCodec.BufferInfo)db0.f.remove();
                        mediaCodec$BufferInfo0.set(mediaCodec$BufferInfo1.offset, mediaCodec$BufferInfo1.size, mediaCodec$BufferInfo1.presentationTimeUs, mediaCodec$BufferInfo1.flags);
                        v2 = v1;
                    }
                    else if(v1 == -2) {
                        db0.h = (MediaFormat)db0.g.remove();
                        v2 = -2;
                    }
                    else {
                        v2 = v1;
                    }
                    return v2;
                }
                db0.j = null;
                throw mediaCodec$CodecException0;
            }
            db0.m = null;
        }
        throw illegalStateException0;
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final MediaFormat zzc() {
        synchronized(this.b.a) {
            MediaFormat mediaFormat0 = this.b.h;
            if(mediaFormat0 != null) {
                return mediaFormat0;
            }
        }
        throw new IllegalStateException();
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final ByteBuffer zzf(int v) {
        return this.a.getInputBuffer(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final ByteBuffer zzg(int v) {
        return this.a.getOutputBuffer(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzi() {
        this.c.a();
        this.a.flush();
        synchronized(this.b.a) {
            ++this.b.k;
            this.b.c.post(new zzpv(this.b));
        }
        this.a.start();
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzj(int v, int v1, int v2, long v3, int v4) {
        cb cb0 = this.c;
        RuntimeException runtimeException0 = (RuntimeException)cb0.d.getAndSet(null);
        if(runtimeException0 != null) {
            throw runtimeException0;
        }
        bb bb0 = cb.b();
        bb0.a = v;
        bb0.b = v2;
        bb0.d = v3;
        bb0.e = v4;
        cb0.c.obtainMessage(0, bb0).sendToTarget();
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzk(int v, int v1, zzfy zzfy0, long v2, int v3) {
        cb cb0 = this.c;
        RuntimeException runtimeException0 = (RuntimeException)cb0.d.getAndSet(null);
        if(runtimeException0 != null) {
            throw runtimeException0;
        }
        bb bb0 = cb.b();
        bb0.a = v;
        bb0.b = 0;
        bb0.d = v2;
        bb0.e = 0;
        MediaCodec.CryptoInfo mediaCodec$CryptoInfo0 = bb0.c;
        mediaCodec$CryptoInfo0.numSubSamples = zzfy0.zzf;
        int[] arr_v = zzfy0.zzd;
        int[] arr_v1 = mediaCodec$CryptoInfo0.numBytesOfClearData;
        if(arr_v != null) {
            if(arr_v1 == null || arr_v1.length < arr_v.length) {
                arr_v1 = Arrays.copyOf(arr_v, arr_v.length);
            }
            else {
                System.arraycopy(arr_v, 0, arr_v1, 0, arr_v.length);
            }
        }
        mediaCodec$CryptoInfo0.numBytesOfClearData = arr_v1;
        int[] arr_v2 = zzfy0.zze;
        int[] arr_v3 = mediaCodec$CryptoInfo0.numBytesOfEncryptedData;
        if(arr_v2 != null) {
            if(arr_v3 == null || arr_v3.length < arr_v2.length) {
                arr_v3 = Arrays.copyOf(arr_v2, arr_v2.length);
            }
            else {
                System.arraycopy(arr_v2, 0, arr_v3, 0, arr_v2.length);
            }
        }
        mediaCodec$CryptoInfo0.numBytesOfEncryptedData = arr_v3;
        byte[] arr_b = zzfy0.zzb;
        byte[] arr_b1 = mediaCodec$CryptoInfo0.key;
        if(arr_b != null) {
            if(arr_b1 == null || arr_b1.length < arr_b.length) {
                arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
            }
            else {
                System.arraycopy(arr_b, 0, arr_b1, 0, arr_b.length);
            }
        }
        arr_b1.getClass();
        mediaCodec$CryptoInfo0.key = arr_b1;
        byte[] arr_b2 = zzfy0.zza;
        byte[] arr_b3 = mediaCodec$CryptoInfo0.iv;
        if(arr_b2 != null) {
            if(arr_b3 == null || arr_b3.length < arr_b2.length) {
                arr_b3 = Arrays.copyOf(arr_b2, arr_b2.length);
            }
            else {
                System.arraycopy(arr_b2, 0, arr_b3, 0, arr_b2.length);
            }
        }
        arr_b3.getClass();
        mediaCodec$CryptoInfo0.iv = arr_b3;
        mediaCodec$CryptoInfo0.mode = zzfy0.zzc;
        if(zzeg.zza >= 24) {
            mediaCodec$CryptoInfo0.setPattern(y8.d(zzfy0.zzg, zzfy0.zzh));
        }
        cb0.c.obtainMessage(1, bb0).sendToTarget();
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzl() {
        try {
            if(this.e == 1) {
                cb cb0 = this.c;
                if(cb0.f) {
                    cb0.a();
                    cb0.b.quit();
                }
                cb0.f = false;
                synchronized(this.b.a) {
                    this.b.l = true;
                    this.b.b.quit();
                    this.b.a();
                }
                goto label_20;
            label_16:
                if(this.d) {
                    throw throwable0;
                }
                goto label_17;
            }
            goto label_20;
        }
        catch(Throwable throwable0) {
            goto label_16;
        }
    label_17:
        this.a.release();
        this.d = true;
        throw throwable0;
    label_20:
        this.e = 2;
        if(!this.d) {
            this.a.release();
            this.d = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzm(int v, long v1) {
        this.a.releaseOutputBuffer(v, v1);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzn(int v, boolean z) {
        this.a.releaseOutputBuffer(v, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzo(Surface surface0) {
        this.a.setOutputSurface(surface0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzp(Bundle bundle0) {
        this.a.setParameters(bundle0);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final void zzq(int v) {
        this.a.setVideoScalingMode(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzqd
    public final boolean zzr() {
        return false;
    }
}

