package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class c implements Iterator {
    public final int i;
    public int j;
    public final Object k;

    public c(Object object0, int v) {
        this.i = v;
        this.k = object0;
        this.j = 0;
        super();
    }

    @Override
    public final boolean hasNext() {
        switch(this.i) {
            case 0: {
                return this.j < ((zzat)this.k).i.length();
            }
            case 1: {
                return this.j < ((zzat)this.k).i.length();
            }
            default: {
                return this.j < ((zzae)this.k).zzc();
            }
        }
    }

    @Override
    public final Object next() {
        switch(this.i) {
            case 0: {
                int v2 = this.j;
                if(v2 >= ((zzat)this.k).i.length()) {
                    throw new NoSuchElementException();
                }
                this.j = v2 + 1;
                return new zzat(String.valueOf(v2));
            }
            case 1: {
                int v3 = this.j;
                zzat zzat0 = (zzat)this.k;
                if(v3 >= zzat0.i.length()) {
                    throw new NoSuchElementException();
                }
                this.j = v3 + 1;
                return new zzat(String.valueOf(zzat0.i.charAt(v3)));
            }
            default: {
                int v = this.j;
                zzae zzae0 = (zzae)this.k;
                if(v >= zzae0.zzc()) {
                    throw new NoSuchElementException("Out of bounds index: " + this.j);
                }
                int v1 = this.j;
                this.j = v1 + 1;
                return zzae0.zze(v1);
            }
        }
    }
}

