package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class zzgqf implements zzakp, Closeable, Iterator {
    public zzakl i;
    public zzgqg j;
    public zzako k;
    public long l;
    public long m;
    public final ArrayList n;
    public static final la o;

    static {
        zzgqf.o = new la("eof ");  // 初始化器: Lcom/google/android/gms/internal/ads/zzgqb;-><init>(Ljava/lang/String;)V
        zzgqm.zzb(zzgqf.class);
    }

    public zzgqf() {
        this.k = null;
        this.l = 0L;
        this.m = 0L;
        this.n = new ArrayList();
    }

    @Override
    public void close() throws IOException {
    }

    @Override
    public final boolean hasNext() {
        zzako zzako0 = this.k;
        la la0 = zzgqf.o;
        if(zzako0 == la0) {
            return false;
        }
        if(zzako0 != null) {
            return true;
        }
        try {
            this.k = this.zzd();
            return true;
        }
        catch(NoSuchElementException unused_ex) {
            this.k = la0;
            return false;
        }
    }

    @Override
    public final Object next() {
        return this.zzd();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append("[");
        for(int v = 0; true; ++v) {
            ArrayList arrayList0 = this.n;
            if(v >= arrayList0.size()) {
                break;
            }
            if(v > 0) {
                stringBuilder0.append(";");
            }
            stringBuilder0.append(((zzako)arrayList0.get(v)).toString());
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }

    public final zzako zzd() {
        zzako zzako0 = this.k;
        if(zzako0 != null && zzako0 != zzgqf.o) {
            this.k = null;
            return zzako0;
        }
        zzgqg zzgqg0 = this.j;
        if(zzgqg0 != null && this.l < this.m) {
            try {
                synchronized(zzgqg0) {
                    this.j.zze(this.l);
                    zzako zzako1 = this.i.zzb(this.j, this);
                    this.l = this.j.zzb();
                    return zzako1;
                }
            }
            catch(EOFException unused_ex) {
                throw new NoSuchElementException();
            }
            catch(IOException unused_ex) {
                throw new NoSuchElementException();
            }
        }
        this.k = zzgqf.o;
        throw new NoSuchElementException();
    }

    public final List zze() {
        List list0 = this.n;
        return this.j != null && this.k != zzgqf.o ? new zzgql(list0, this) : list0;
    }

    public final void zzf(zzgqg zzgqg0, long v, zzakl zzakl0) throws IOException {
        this.j = zzgqg0;
        this.l = zzgqg0.zzb();
        zzgqg0.zze(zzgqg0.zzb() + v);
        this.m = zzgqg0.zzb();
        this.i = zzakl0;
    }
}

