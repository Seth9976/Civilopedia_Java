package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

public final class zzgnl {
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    public static final zzgnl f;

    static {
        zzgnl.f = new zzgnl(0, new int[0], new Object[0], false);
    }

    public zzgnl(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.d = -1;
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
        this.e = z;
    }

    public static zzgnl a() {
        return new zzgnl(0, new int[8], new Object[8], true);
    }

    public final void b(int v, Object object0) {
        if(!this.e) {
            throw new UnsupportedOperationException();
        }
        int v1 = this.a;
        int[] arr_v = this.b;
        if(v1 == arr_v.length) {
            int v2 = v1 + (v1 >= 4 ? v1 >> 1 : 8);
            this.b = Arrays.copyOf(arr_v, v2);
            this.c = Arrays.copyOf(this.c, v2);
        }
        int v3 = this.a;
        this.b[v3] = v;
        this.c[v3] = object0;
        this.a = v3 + 1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzgnl)) {
            return false;
        }
        int v = this.a;
        if(v == ((zzgnl)object0).a) {
            int[] arr_v = this.b;
            int[] arr_v1 = ((zzgnl)object0).b;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.c;
            Object[] arr_object1 = ((zzgnl)object0).c;
            int v2 = this.a;
            for(int v3 = 0; v3 < v2; ++v3) {
                if(!arr_object[v3].equals(arr_object1[v3])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int v = this.a;
        int[] arr_v = this.b;
        int v1 = 17;
        int v4 = 17;
        for(int v3 = 0; v3 < v; ++v3) {
            v4 = v4 * 0x1F + arr_v[v3];
        }
        Object[] arr_object = this.c;
        int v5 = this.a;
        for(int v2 = 0; v2 < v5; ++v2) {
            v1 = v1 * 0x1F + arr_object[v2].hashCode();
        }
        return ((v + 0x20F) * 0x1F + v4) * 0x1F + v1;
    }

    public final int zza() {
        int v = this.d;
        if(v == -1) {
            int v2 = 0;
            for(int v1 = 0; v1 < this.a; ++v1) {
                int v3 = this.b[v1];
                int v4 = v3 >>> 3;
                switch(v3 & 7) {
                    case 0: {
                        v2 = zzgjx.zzF(((long)(((Long)this.c[v1])))) + zzgjx.zzE(v4 << 3) + v2;
                        break;
                    }
                    case 1: {
                        ((Long)this.c[v1]).getClass();
                        v2 = u9.a(v4 << 3, 8, v2);
                        break;
                    }
                    case 2: {
                        int v6 = ((zzgji)this.c[v1]).zzd();
                        v2 = u9.b(v6, v6, zzgjx.zzE(v4 << 3), v2);
                        break;
                    }
                    case 3: {
                        int v5 = zzgjx.zzD(v4);
                        v2 = ((zzgnl)this.c[v1]).zza() + (v5 + v5) + v2;
                        break;
                    }
                    case 5: {
                        ((Integer)this.c[v1]).getClass();
                        v2 = u9.a(v4 << 3, 4, v2);
                        break;
                    }
                    default: {
                        throw new IllegalStateException(zzglc.a());
                    }
                }
            }
            this.d = v2;
            return v2;
        }
        return v;
    }

    public final int zzb() {
        int v = this.d;
        if(v == -1) {
            int v2 = 0;
            for(int v1 = 0; v1 < this.a; ++v1) {
                int v3 = this.b[v1];
                int v4 = ((zzgji)this.c[v1]).zzd();
                v2 += zzgjx.zzE(v4) + v4 + 1 + u9.a(v3 >>> 3, 1, 2);
            }
            this.d = v2;
            return v2;
        }
        return v;
    }

    public static zzgnl zzc() {
        return zzgnl.f;
    }

    public final void zzf() {
        this.e = false;
    }

    public final void zzi(n9 n90) throws IOException {
        if(this.a != 0) {
            for(int v = 0; v < this.a; ++v) {
                int v1 = this.b[v];
                Object object0 = this.c[v];
                int v2 = v1 >>> 3;
                switch(v1 & 7) {
                    case 0: {
                        n90.n(v2, ((long)(((Long)object0))));
                        break;
                    }
                    case 1: {
                        n90.j(v2, ((long)(((Long)object0))));
                        break;
                    }
                    case 2: {
                        n90.f(v2, ((zzgji)object0));
                        break;
                    }
                    case 3: {
                        n90.a.zzq(v2, 3);
                        ((zzgnl)object0).zzi(n90);
                        n90.a.zzq(v2, 4);
                        break;
                    }
                    case 5: {
                        n90.i(v2, ((int)(((Integer)object0))));
                        break;
                    }
                    default: {
                        throw new RuntimeException(zzglc.a());
                    }
                }
            }
        }
    }
}

