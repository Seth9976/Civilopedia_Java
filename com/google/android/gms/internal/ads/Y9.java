package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;

public final class y9 extends InputStream {
    public Iterator i;
    public ByteBuffer j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public byte[] o;
    public int p;
    public long q;

    public final void a(int v) {
        int v1 = this.m + v;
        this.m = v1;
        if(v1 == this.j.limit()) {
            this.b();
        }
    }

    public final boolean b() {
        ++this.l;
        Iterator iterator0 = this.i;
        if(!iterator0.hasNext()) {
            return false;
        }
        Object object0 = iterator0.next();
        this.j = (ByteBuffer)object0;
        this.m = ((ByteBuffer)object0).position();
        if(this.j.hasArray()) {
            this.n = true;
            this.o = this.j.array();
            this.p = this.j.arrayOffset();
            return true;
        }
        this.n = false;
        this.q = ia.c.m(ia.g, this.j);
        this.o = null;
        return true;
    }

    @Override
    public final int read() {
        int v;
        if(this.l == this.k) {
            return -1;
        }
        if(this.n) {
            v = this.o[this.m + this.p];
            this.a(1);
            return v & 0xFF;
        }
        v = ia.c.a(((long)this.m) + this.q);
        this.a(1);
        return v & 0xFF;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) {
        if(this.l == this.k) {
            return -1;
        }
        int v2 = this.m;
        int v3 = this.j.limit() - v2;
        if(v1 > v3) {
            v1 = v3;
        }
        if(this.n) {
            System.arraycopy(this.o, v2 + this.p, arr_b, v, v1);
            this.a(v1);
            return v1;
        }
        int v4 = this.j.position();
        ByteBuffer byteBuffer0 = (ByteBuffer)this.j.position(this.m);
        this.j.get(arr_b, v, v1);
        ByteBuffer byteBuffer1 = (ByteBuffer)this.j.position(v4);
        this.a(v1);
        return v1;
    }
}

