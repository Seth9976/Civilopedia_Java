package com.google.android.gms.internal.ads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class zzakf extends ByteArrayOutputStream {
    public final zzajs i;

    public zzakf(zzajs zzajs0, int v) {
        this.i = zzajs0;
        this.buf = zzajs0.zzb(Math.max(v, 0x100));
    }

    public final void a(int v) {
        int v1 = this.count;
        if(v1 + v <= this.buf.length) {
            return;
        }
        byte[] arr_b = this.i.zzb(v * 2 + v1 * 2);
        System.arraycopy(this.buf, 0, arr_b, 0, this.count);
        this.i.zza(this.buf);
        this.buf = arr_b;
    }

    @Override
    public final void close() throws IOException {
        this.i.zza(this.buf);
        this.buf = null;
        super.close();
    }

    @Override
    public final void finalize() {
        this.i.zza(this.buf);
    }

    @Override
    public final void write(int v) {
        synchronized(this) {
            this.a(1);
            super.write(v);
        }
    }

    @Override
    public final void write(byte[] arr_b, int v, int v1) {
        synchronized(this) {
            this.a(v1);
            super.write(arr_b, v, v1);
        }
    }
}

