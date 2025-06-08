package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;

public final class zzajs {
    public final ArrayList a;
    public final ArrayList b;
    public int c;
    public static final s0 d;

    static {
        zzajs.d = new s0(0);
    }

    public zzajs(int v) {
        this.a = new ArrayList();
        this.b = new ArrayList(0x40);
        this.c = 0;
    }

    public final void a() {
        synchronized(this) {
            while(this.c > 0x1000) {
                byte[] arr_b = (byte[])this.a.remove(0);
                this.b.remove(arr_b);
                this.c -= arr_b.length;
            }
        }
    }

    public final void zza(byte[] arr_b) {
        synchronized(this) {
            if(arr_b != null && arr_b.length <= 0x1000) {
                this.a.add(arr_b);
                int v1 = Collections.binarySearch(this.b, arr_b, zzajs.d);
                if(v1 < 0) {
                    v1 = -1 - v1;
                }
                this.b.add(v1, arr_b);
                this.c += arr_b.length;
                this.a();
            }
        }
    }

    public final byte[] zzb(int v) {
        synchronized(this) {
            for(int v2 = 0; v2 < this.b.size(); ++v2) {
                byte[] arr_b = (byte[])this.b.get(v2);
                int v3 = arr_b.length;
                if(v3 >= v) {
                    this.c -= v3;
                    this.b.remove(v2);
                    this.a.remove(arr_b);
                    return arr_b;
                }
            }
        }
        return new byte[v];
    }
}

