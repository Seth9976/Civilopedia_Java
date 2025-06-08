package com.google.android.gms.internal.ads;

import L.a;
import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

public final class cb {
    public final MediaCodec a;
    public final HandlerThread b;
    public a c;
    public final AtomicReference d;
    public final zzcz e;
    public boolean f;
    public static final ArrayDeque g;
    public static final Object h;

    static {
        cb.g = new ArrayDeque();
        cb.h = new Object();
    }

    public cb(MediaCodec mediaCodec0, HandlerThread handlerThread0) {
        zzcz zzcz0 = new zzcz(zzcx.zza);
        super();
        this.a = mediaCodec0;
        this.b = handlerThread0;
        this.e = zzcz0;
        this.d = new AtomicReference();
    }

    public final void a() {
        zzcz zzcz0 = this.e;
        if(this.f) {
            try {
                a a0 = this.c;
                if(a0 == null) {
                    throw null;
                }
                a0.removeCallbacksAndMessages(null);
                zzcz0.zzc();
                a a1 = this.c;
                if(a1 == null) {
                    throw null;
                }
                a1.obtainMessage(2).sendToTarget();
                zzcz0.zza();
                return;
            }
            catch(InterruptedException interruptedException0) {
            }
            Thread.currentThread().interrupt();
            throw new IllegalStateException(interruptedException0);
        }
    }

    public static bb b() {
        ArrayDeque arrayDeque0 = cb.g;
        synchronized(arrayDeque0) {
            return arrayDeque0.isEmpty() ? new bb() : ((bb)arrayDeque0.removeFirst());
        }
        return new bb();
    }
}

