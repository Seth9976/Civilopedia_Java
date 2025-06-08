package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.nio.ByteBuffer;

public final class k0 {
    public long a;
    public long b;
    public long c;
    public final Object d;
    public final Object e;

    public k0(AudioTrack audioTrack0) {
        this.d = audioTrack0;
        this.e = new AudioTimestamp();
    }

    public k0(ByteBuffer byteBuffer0, long v, long v1, long v2, ByteBuffer byteBuffer1) {
        this.d = byteBuffer0;
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.e = byteBuffer1;
    }
}

