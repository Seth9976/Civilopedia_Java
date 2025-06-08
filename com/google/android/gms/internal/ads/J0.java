package com.google.android.gms.internal.ads;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

public final class j0 implements i0 {
    public final FileChannel i;
    public final long j;
    public final long k;

    public j0(FileChannel fileChannel0, long v, long v1) {
        this.i = fileChannel0;
        this.j = v;
        this.k = v1;
    }

    @Override  // com.google.android.gms.internal.ads.i0
    public final void a(MessageDigest[] arr_messageDigest, long v, int v1) {
        MappedByteBuffer mappedByteBuffer0 = this.i.map(FileChannel.MapMode.READ_ONLY, this.j + v, ((long)v1));
        mappedByteBuffer0.load();
        for(int v2 = 0; v2 < arr_messageDigest.length; ++v2) {
            MessageDigest messageDigest0 = arr_messageDigest[v2];
            mappedByteBuffer0.position(0);
            messageDigest0.update(mappedByteBuffer0);
        }
    }

    @Override  // com.google.android.gms.internal.ads.i0
    public final long zza() {
        return this.k;
    }
}

