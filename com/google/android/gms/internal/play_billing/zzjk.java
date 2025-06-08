package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.u9;
import java.io.IOException;
import java.util.Arrays;

public final class zzjk {
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;
    public static final zzjk f;

    static {
        zzjk.f = new zzjk(0, new int[0], new Object[0], false);
    }

    public zzjk(int v, int[] arr_v, Object[] arr_object, boolean z) {
        this.d = -1;
        this.a = v;
        this.b = arr_v;
        this.c = arr_object;
        this.e = z;
    }

    public static zzjk a() {
        return new zzjk(0, new int[8], new Object[8], true);
    }

    public final void b(int v, Object object0) {
        if(!this.e) {
            throw new UnsupportedOperationException();
        }
        this.c(this.a + 1);
        int v1 = this.a;
        this.b[v1] = v;
        this.c[v1] = object0;
        this.a = v1 + 1;
    }

    public final void c(int v) {
        int[] arr_v = this.b;
        if(v > arr_v.length) {
            int v1 = this.a / 2 + this.a;
            if(v1 >= v) {
                v = v1;
            }
            if(v < 8) {
                v = 8;
            }
            this.b = Arrays.copyOf(arr_v, v);
            this.c = Arrays.copyOf(this.c, v);
        }
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof zzjk)) {
            return false;
        }
        int v = this.a;
        if(v == ((zzjk)object0).a) {
            int[] arr_v = this.b;
            int[] arr_v1 = ((zzjk)object0).b;
            for(int v1 = 0; v1 < v; ++v1) {
                if(arr_v[v1] != arr_v1[v1]) {
                    return false;
                }
            }
            Object[] arr_object = this.c;
            Object[] arr_object1 = ((zzjk)object0).c;
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
        int v2 = 17;
        int v4 = 17;
        for(int v3 = 0; v3 < v; ++v3) {
            v4 = v4 * 0x1F + arr_v[v3];
        }
        Object[] arr_object = this.c;
        int v5 = this.a;
        for(int v1 = 0; v1 < v5; ++v1) {
            v2 = v2 * 0x1F + arr_object[v1].hashCode();
        }
        return ((v + 0x20F) * 0x1F + v4) * 0x1F + v2;
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
                        v2 = zzgr.zzA(((long)(((Long)this.c[v1])))) + zzgr.zzz(v4 << 3) + v2;
                        break;
                    }
                    case 1: {
                        ((Long)this.c[v1]).getClass();
                        v2 = zzgr.zzz(v4 << 3) + 8 + v2;
                        break;
                    }
                    case 2: {
                        int v6 = ((zzgk)this.c[v1]).zzd();
                        v2 = zzgr.zzz(v6) + v6 + zzgr.zzz(v4 << 3) + v2;
                        break;
                    }
                    case 3: {
                        int v5 = zzgr.zzz(v4 << 3);
                        v2 = ((zzjk)this.c[v1]).zza() + (v5 + v5) + v2;
                        break;
                    }
                    case 5: {
                        ((Integer)this.c[v1]).getClass();
                        v2 = zzgr.zzz(v4 << 3) + 4 + v2;
                        break;
                    }
                    default: {
                        throw new IllegalStateException(new zzhq("Protocol message tag had invalid wire type."));
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
                int v3 = zzgr.zzz(this.b[v1] >>> 3);
                int v4 = ((zzgk)this.c[v1]).zzd();
                v2 = u9.D(v4, v4, 1) + v2 + v3 + 3;
            }
            this.d = v2;
            return v2;
        }
        return v;
    }

    public static zzjk zzc() {
        return zzjk.f;
    }

    public final void zzh() {
        if(this.e) {
            this.e = false;
        }
    }

    public final void zzl(U0 u00) throws IOException {
        if(this.a != 0) {
            for(int v = 0; v < this.a; ++v) {
                int v1 = this.b[v];
                Object object0 = this.c[v];
                int v2 = v1 & 7;
                int v3 = v1 >>> 3;
                switch(v2) {
                    case 0: {
                        ((k0)u00).p(v3, ((long)(((Long)object0))));
                        break;
                    }
                    case 1: {
                        ((k0)u00).l(v3, ((long)(((Long)object0))));
                        break;
                    }
                    case 2: {
                        ((k0)u00).g(v3, ((zzgk)object0));
                        break;
                    }
                    case 3: {
                        ((k0)u00).a.zzr(v3, 3);
                        ((zzjk)object0).zzl(u00);
                        ((k0)u00).a.zzr(v3, 4);
                        break;
                    }
                    default: {
                        if(v2 != 5) {
                            throw new RuntimeException(new zzhq("Protocol message tag had invalid wire type."));
                        }
                        ((k0)u00).k(v3, ((int)(((Integer)object0))));
                        break;
                    }
                }
            }
        }
    }
}

