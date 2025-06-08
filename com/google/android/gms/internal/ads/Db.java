package com.google.android.gms.internal.ads;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

public final class db extends MediaCodec.Callback {
    public final Object a;
    public final HandlerThread b;
    public Handler c;
    public final z d;
    public final z e;
    public final ArrayDeque f;
    public final ArrayDeque g;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;

    public db(HandlerThread handlerThread0) {
        this.a = new Object();
        this.b = handlerThread0;
        this.d = new z(3);
        this.e = new z(3);
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
    }

    public final void a() {
        ArrayDeque arrayDeque0 = this.g;
        if(!arrayDeque0.isEmpty()) {
            this.i = (MediaFormat)arrayDeque0.getLast();
        }
        this.d.b = 0;
        this.d.c = -1;
        this.d.d = 0;
        this.e.b = 0;
        this.e.c = -1;
        this.e.d = 0;
        this.f.clear();
        arrayDeque0.clear();
        this.j = null;
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onError(MediaCodec mediaCodec0, MediaCodec.CodecException mediaCodec$CodecException0) {
        synchronized(this.a) {
            this.j = mediaCodec$CodecException0;
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec0, int v) {
        synchronized(this.a) {
            this.d.a(v);
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec0, int v, MediaCodec.BufferInfo mediaCodec$BufferInfo0) {
        synchronized(this.a) {
            MediaFormat mediaFormat0 = this.i;
            if(mediaFormat0 != null) {
                this.e.a(-2);
                this.g.add(mediaFormat0);
                this.i = null;
            }
            this.e.a(v);
            this.f.add(mediaCodec$BufferInfo0);
        }
    }

    @Override  // android.media.MediaCodec$Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec0, MediaFormat mediaFormat0) {
        synchronized(this.a) {
            this.e.a(-2);
            this.g.add(mediaFormat0);
            this.i = null;
        }
    }
}

