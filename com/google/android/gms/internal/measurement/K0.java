package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.b9;
import com.google.android.gms.internal.ads.u9;
import i3.e;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

public final class k0 implements s0 {
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final zzll e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final c0 k;
    public final z0 l;
    public final U m;
    public static final int[] n;
    public static final Unsafe o;

    static {
        k0.n = new int[0];
        k0.o = F0.j();
    }

    public k0(int[] arr_v, Object[] arr_object, int v, int v1, zzll zzll0, boolean z, int[] arr_v1, int v2, int v3, c0 c00, z0 z00, U u0, g0 g00) {
        this.a = arr_v;
        this.b = arr_object;
        this.c = v;
        this.d = v1;
        this.g = z;
        this.f = u0 != null && zzll0 instanceof zzkb;
        this.h = arr_v1;
        this.i = v2;
        this.j = v3;
        this.k = c00;
        this.l = z00;
        this.m = u0;
        this.e = zzll0;
    }

    public final int A(Object object0) {
        Unsafe unsafe0 = k0.o;
        int v1 = 0;
        for(int v = 0; true; v += 3) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            int v2 = this.h(v);
            int v3 = k0.g(v2);
            int v4 = arr_v[v];
            long v5 = (long)(v2 & 0xFFFFF);
            if(v3 >= zzjw.zzJ.zza() && v3 <= zzjw.zzW.zza()) {
                int v6 = arr_v[v + 2];
            }
            switch(v3) {
                case 0: {
                    if(this.s(v, object0)) {
                        v1 = u9.B(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 1: {
                    if(this.s(v, object0)) {
                        v1 = u9.B(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 2: {
                    if(this.s(v, object0)) {
                        v1 = zzjl.zzB(F0.g(v5, object0)) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 3: {
                    if(this.s(v, object0)) {
                        v1 = zzjl.zzB(F0.g(v5, object0)) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 4: {
                    if(this.s(v, object0)) {
                        v1 = zzjl.zzv(F0.f(v5, object0)) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 5: {
                    if(this.s(v, object0)) {
                        v1 = u9.B(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 6: {
                    if(this.s(v, object0)) {
                        v1 = u9.B(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 7: {
                    if(this.s(v, object0)) {
                        v1 = u9.B(v4 << 3, 1, v1);
                    }
                    break;
                }
                case 8: {
                    if(this.s(v, object0)) {
                        Object object1 = F0.i(v5, object0);
                        if(object1 instanceof zzjd) {
                            int v7 = ((zzjd)object1).zzd();
                            v1 = u9.C(v7, v7, zzjl.zzA(v4 << 3), v1);
                        }
                        else {
                            v1 = zzjl.zzy(((String)object1)) + zzjl.zzA(v4 << 3) + v1;
                        }
                    }
                    break;
                }
                case 9: {
                    if(this.s(v, object0)) {
                        v1 = t0.K(v4, F0.i(v5, object0), this.k(v)) + v1;
                    }
                    break;
                }
                case 10: {
                    if(this.s(v, object0)) {
                        int v8 = ((zzjd)F0.i(v5, object0)).zzd();
                        v1 = u9.C(v8, v8, zzjl.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 11: {
                    if(this.s(v, object0)) {
                        v1 = u9.B(F0.f(v5, object0), zzjl.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 12: {
                    if(this.s(v, object0)) {
                        v1 = zzjl.zzv(F0.f(v5, object0)) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 13: {
                    if(this.s(v, object0)) {
                        v1 = u9.B(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 14: {
                    if(this.s(v, object0)) {
                        v1 = u9.B(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 15: {
                    if(this.s(v, object0)) {
                        int v9 = F0.f(v5, object0);
                        v1 = u9.B(v9 >> 0x1F ^ v9 + v9, zzjl.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 16: {
                    if(this.s(v, object0)) {
                        long v10 = F0.g(v5, object0);
                        v1 = zzjl.zzB(v10 + v10 ^ v10 >> 0x3F) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 17: {
                    if(this.s(v, object0)) {
                        v1 = zzjl.a(v4, ((zzll)F0.i(v5, object0)), this.k(v)) + v1;
                    }
                    break;
                }
                case 18: {
                    v1 = t0.D(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 19: {
                    v1 = t0.B(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 20: {
                    v1 = t0.I(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 21: {
                    v1 = t0.T(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 22: {
                    v1 = t0.G(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 23: {
                    v1 = t0.D(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 24: {
                    v1 = t0.B(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 25: {
                    v1 = t0.v(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 26: {
                    v1 = t0.Q(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 27: {
                    v1 = t0.L(v4, ((List)F0.i(v5, object0)), this.k(v)) + v1;
                    break;
                }
                case 28: {
                    v1 = t0.y(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 29: {
                    v1 = t0.R(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 30: {
                    v1 = t0.z(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 0x1F: {
                    v1 = t0.B(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 0x20: {
                    v1 = t0.D(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 33: {
                    v1 = t0.M(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 34: {
                    v1 = t0.O(v4, ((List)F0.i(v5, object0))) + v1;
                    break;
                }
                case 35: {
                    int v11 = t0.E(((List)unsafe0.getObject(object0, v5)));
                    if(v11 > 0) {
                        v1 = u9.C(v11, zzjl.zzz(v4), v11, v1);
                    }
                    break;
                }
                case 36: {
                    int v12 = t0.C(((List)unsafe0.getObject(object0, v5)));
                    if(v12 > 0) {
                        v1 = u9.C(v12, zzjl.zzz(v4), v12, v1);
                    }
                    break;
                }
                case 37: {
                    int v13 = t0.J(((List)unsafe0.getObject(object0, v5)));
                    if(v13 > 0) {
                        v1 = u9.C(v13, zzjl.zzz(v4), v13, v1);
                    }
                    break;
                }
                case 38: {
                    int v14 = t0.U(((List)unsafe0.getObject(object0, v5)));
                    if(v14 > 0) {
                        v1 = u9.C(v14, zzjl.zzz(v4), v14, v1);
                    }
                    break;
                }
                case 39: {
                    int v15 = t0.H(((List)unsafe0.getObject(object0, v5)));
                    if(v15 > 0) {
                        v1 = u9.C(v15, zzjl.zzz(v4), v15, v1);
                    }
                    break;
                }
                case 40: {
                    int v16 = t0.E(((List)unsafe0.getObject(object0, v5)));
                    if(v16 > 0) {
                        v1 = u9.C(v16, zzjl.zzz(v4), v16, v1);
                    }
                    break;
                }
                case 41: {
                    int v17 = t0.C(((List)unsafe0.getObject(object0, v5)));
                    if(v17 > 0) {
                        v1 = u9.C(v17, zzjl.zzz(v4), v17, v1);
                    }
                    break;
                }
                case 42: {
                    int v18 = t0.x(((List)unsafe0.getObject(object0, v5)));
                    if(v18 > 0) {
                        v1 = u9.C(v18, zzjl.zzz(v4), v18, v1);
                    }
                    break;
                }
                case 43: {
                    int v19 = t0.S(((List)unsafe0.getObject(object0, v5)));
                    if(v19 > 0) {
                        v1 = u9.C(v19, zzjl.zzz(v4), v19, v1);
                    }
                    break;
                }
                case 44: {
                    int v20 = t0.A(((List)unsafe0.getObject(object0, v5)));
                    if(v20 > 0) {
                        v1 = u9.C(v20, zzjl.zzz(v4), v20, v1);
                    }
                    break;
                }
                case 45: {
                    int v21 = t0.C(((List)unsafe0.getObject(object0, v5)));
                    if(v21 > 0) {
                        v1 = u9.C(v21, zzjl.zzz(v4), v21, v1);
                    }
                    break;
                }
                case 46: {
                    int v22 = t0.E(((List)unsafe0.getObject(object0, v5)));
                    if(v22 > 0) {
                        v1 = u9.C(v22, zzjl.zzz(v4), v22, v1);
                    }
                    break;
                }
                case 0x2F: {
                    int v23 = t0.N(((List)unsafe0.getObject(object0, v5)));
                    if(v23 > 0) {
                        v1 = u9.C(v23, zzjl.zzz(v4), v23, v1);
                    }
                    break;
                }
                case 0x30: {
                    int v24 = t0.P(((List)unsafe0.getObject(object0, v5)));
                    if(v24 > 0) {
                        v1 = u9.C(v24, zzjl.zzz(v4), v24, v1);
                    }
                    break;
                }
                case 49: {
                    v1 = t0.F(v4, ((List)F0.i(v5, object0)), this.k(v)) + v1;
                    break;
                }
                case 50: {
                    g0.a(F0.i(v5, object0), this.l(v));
                    break;
                }
                case 51: {
                    if(this.t(v4, v, object0)) {
                        v1 = u9.B(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 52: {
                    if(this.t(v4, v, object0)) {
                        v1 = u9.B(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 53: {
                    if(this.t(v4, v, object0)) {
                        v1 = zzjl.zzB(k0.i(v5, object0)) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 54: {
                    if(this.t(v4, v, object0)) {
                        v1 = zzjl.zzB(k0.i(v5, object0)) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 55: {
                    if(this.t(v4, v, object0)) {
                        v1 = zzjl.zzv(k0.B(v5, object0)) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 56: {
                    if(this.t(v4, v, object0)) {
                        v1 = u9.B(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 57: {
                    if(this.t(v4, v, object0)) {
                        v1 = u9.B(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 58: {
                    if(this.t(v4, v, object0)) {
                        v1 = u9.B(v4 << 3, 1, v1);
                    }
                    break;
                }
                case 59: {
                    if(this.t(v4, v, object0)) {
                        Object object2 = F0.i(v5, object0);
                        if(object2 instanceof zzjd) {
                            int v25 = ((zzjd)object2).zzd();
                            v1 = u9.C(v25, v25, zzjl.zzA(v4 << 3), v1);
                        }
                        else {
                            v1 = zzjl.zzy(((String)object2)) + zzjl.zzA(v4 << 3) + v1;
                        }
                    }
                    break;
                }
                case 60: {
                    if(this.t(v4, v, object0)) {
                        v1 = t0.K(v4, F0.i(v5, object0), this.k(v)) + v1;
                    }
                    break;
                }
                case 61: {
                    if(this.t(v4, v, object0)) {
                        int v26 = ((zzjd)F0.i(v5, object0)).zzd();
                        v1 = u9.C(v26, v26, zzjl.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 62: {
                    if(this.t(v4, v, object0)) {
                        v1 = u9.B(k0.B(v5, object0), zzjl.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.t(v4, v, object0)) {
                        v1 = zzjl.zzv(k0.B(v5, object0)) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 0x40: {
                    if(this.t(v4, v, object0)) {
                        v1 = u9.B(v4 << 3, 4, v1);
                    }
                    break;
                }
                case 65: {
                    if(this.t(v4, v, object0)) {
                        v1 = u9.B(v4 << 3, 8, v1);
                    }
                    break;
                }
                case 66: {
                    if(this.t(v4, v, object0)) {
                        int v27 = k0.B(v5, object0);
                        v1 = u9.B(v27 >> 0x1F ^ v27 + v27, zzjl.zzA(v4 << 3), v1);
                    }
                    break;
                }
                case 67: {
                    if(this.t(v4, v, object0)) {
                        long v28 = k0.i(v5, object0);
                        v1 = zzjl.zzB(v28 + v28 ^ v28 >> 0x3F) + zzjl.zzA(v4 << 3) + v1;
                    }
                    break;
                }
                case 68: {
                    if(this.t(v4, v, object0)) {
                        v1 = zzjl.a(v4, ((zzll)F0.i(v5, object0)), this.k(v)) + v1;
                    }
                }
            }
        }
        this.l.getClass();
        return z0.a(z0.b(object0)) + v1;
    }

    public static int B(long v, Object object0) {
        return (int)(((Integer)F0.c.m(v, object0)));
    }

    public final void C(Object object0, long v, int v1) {
        Unsafe unsafe0 = k0.o;
        Object object1 = this.l(v1);
        Object object2 = unsafe0.getObject(object0, v);
        if(!((zzlf)object2).zze()) {
            zzlf zzlf0 = zzlf.zza().zzb();
            g0.b(zzlf0, object2);
            unsafe0.putObject(object0, v, zzlf0);
        }
        zzle zzle0 = (zzle)object1;
        throw null;
    }

    public final int D(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, int v6, long v7, int v8, b9 b90) {
        int v13;
        Unsafe unsafe0 = k0.o;
        long v9 = (long)(this.a[v8 + 2] & 0xFFFFF);
        Object object1 = null;
        boolean z = true;
        switch(v6) {
            case 51: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, Double.longBitsToDouble(j0.s(v, arr_b)));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 8;
                }
                break;
            }
            case 52: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, Float.intBitsToFloat(j0.c(arr_b, v)));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 4;
                }
                break;
            }
            case 53: 
            case 54: {
                if(v4 == 0) {
                    int v10 = j0.r(arr_b, v, b90);
                    unsafe0.putObject(object0, v7, b90.b);
                    unsafe0.putInt(object0, v9, v3);
                    return v10;
                }
                break;
            }
            case 58: {
                if(v4 == 0) {
                    int v12 = j0.r(arr_b, v, b90);
                    if(b90.b == 0L) {
                        z = false;
                    }
                    unsafe0.putObject(object0, v7, Boolean.valueOf(z));
                    unsafe0.putInt(object0, v9, v3);
                    return v12;
                }
                break;
            }
            case 59: {
                if(v4 == 2) {
                    v13 = j0.o(arr_b, v, b90);
                    int v14 = b90.a;
                    if(v14 == 0) {
                        unsafe0.putObject(object0, v7, "");
                    }
                    else {
                        if((v5 & 0x20000000) != 0 && !H0.d(arr_b, v13, v13 + v14)) {
                            throw zzko.a();
                        }
                        unsafe0.putObject(object0, v7, new String(arr_b, v13, v14, zzkm.a));
                        v13 += v14;
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v13;
                }
                break;
            }
            case 60: {
                if(v4 == 2) {
                    v13 = j0.g(this.k(v8), arr_b, v, v1, b90);
                    if(unsafe0.getInt(object0, v9) == v3) {
                        object1 = unsafe0.getObject(object0, v7);
                    }
                    if(object1 == null) {
                        unsafe0.putObject(object0, v7, b90.c);
                    }
                    else {
                        unsafe0.putObject(object0, v7, zzkm.a(object1, b90.c));
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v13;
                }
                break;
            }
            case 61: {
                if(v4 == 2) {
                    int v15 = j0.a(arr_b, v, b90);
                    unsafe0.putObject(object0, v7, b90.c);
                    unsafe0.putInt(object0, v9, v3);
                    return v15;
                }
                break;
            }
            case 55: 
            case 62: {
                if(v4 == 0) {
                    int v11 = j0.o(arr_b, v, b90);
                    unsafe0.putObject(object0, v7, b90.a);
                    unsafe0.putInt(object0, v9, v3);
                    return v11;
                }
                break;
            }
            case 0x3F: {
                if(v4 == 0) {
                    int v16 = j0.o(arr_b, v, b90);
                    int v17 = b90.a;
                    zzki zzki0 = this.j(v8);
                    if(zzki0 != null && !zzki0.zza(v17)) {
                        k0.w(object0).b(v2, ((long)v17));
                        return v16;
                    }
                    unsafe0.putObject(object0, v7, v17);
                    unsafe0.putInt(object0, v9, v3);
                    return v16;
                }
                break;
            }
            case 57: 
            case 0x40: {
                if(v4 == 5) {
                    unsafe0.putObject(object0, v7, j0.c(arr_b, v));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 4;
                }
                break;
            }
            case 56: 
            case 65: {
                if(v4 == 1) {
                    unsafe0.putObject(object0, v7, j0.s(v, arr_b));
                    unsafe0.putInt(object0, v9, v3);
                    return v + 8;
                }
                break;
            }
            case 66: {
                if(v4 == 0) {
                    int v18 = j0.o(arr_b, v, b90);
                    unsafe0.putObject(object0, v7, zzjh.zzb(b90.a));
                    unsafe0.putInt(object0, v9, v3);
                    return v18;
                }
                break;
            }
            case 67: {
                if(v4 == 0) {
                    int v19 = j0.r(arr_b, v, b90);
                    unsafe0.putObject(object0, v7, zzjh.zzc(b90.b));
                    unsafe0.putInt(object0, v9, v3);
                    return v19;
                }
                break;
            }
            case 68: {
                if(v4 == 3) {
                    v13 = j0.e(this.k(v8), arr_b, v, v1, v2 & -8 | 4, b90);
                    if(unsafe0.getInt(object0, v9) == v3) {
                        object1 = unsafe0.getObject(object0, v7);
                    }
                    if(object1 == null) {
                        unsafe0.putObject(object0, v7, b90.c);
                    }
                    else {
                        unsafe0.putObject(object0, v7, zzkm.a(object1, b90.c));
                    }
                    unsafe0.putInt(object0, v9, v3);
                    return v13;
                }
                break;
            }
            default: {
                return v;
            }
        }
        return v;
    }

    public final void E(Object object0, byte[] arr_b, int v, int v1, b9 b90) {
        int v30;
        int v29;
        int v26;
        int v27;
        int v25;
        int v24;
        int v16;
        Object object2;
        int v15;
        int v14;
        int v13;
        int v12;
        int v9;
        int v8;
        Object object1 = object0;
        Unsafe unsafe0 = k0.o;
        int v2 = v;
        int v3 = -1;
        int v4 = 0;
        int v5 = 0;
        int v6 = 0xFFFFF;
        while(v2 < v1) {
            int v7 = arr_b[v2];
            if(v7 < 0) {
                v8 = j0.p(v7, arr_b, v2 + 1, b90);
                v9 = b90.a;
            }
            else {
                v9 = v7;
                v8 = v2 + 1;
            }
            int v10 = this.d;
            int v11 = this.c;
            if(v9 >>> 3 <= v3) {
                if(v9 >>> 3 >= v11 && v9 >>> 3 <= v10) {
                    v12 = this.G(v9 >>> 3, 0);
                }
            }
            else if(v9 >>> 3 >= v11 && v9 >>> 3 <= v10) {
                v12 = this.G(v9 >>> 3, v4 / 3);
            }
            else {
                v12 = -1;
            }
            if(v12 == -1) {
                v13 = v9 >>> 3;
                v14 = v8;
                v15 = v5;
                object2 = object1;
                v16 = 0;
            }
            else {
                int[] arr_v = this.a;
                int v17 = arr_v[v12 + 1];
                int v18 = k0.g(v17);
                long v19 = (long)(v17 & 0xFFFFF);
                int v20 = v17;
                if(v18 <= 17) {
                    int v21 = arr_v[v12 + 2];
                    int v22 = 1 << (v21 >>> 20);
                    int v23 = v21 & 0xFFFFF;
                    if(v23 == v6) {
                        v25 = v6;
                    }
                    else {
                        if(v6 != 0xFFFFF) {
                            unsafe0.putInt(object1, ((long)v6), v5);
                        }
                        v24 = v23;
                        if(v24 != 0xFFFFF) {
                            v5 = unsafe0.getInt(object1, ((long)v24));
                        }
                        v25 = v24;
                    }
                    switch(v18) {
                        case 0: {
                            v26 = v8;
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 1) {
                                F0.l(object1, v19, Double.longBitsToDouble(j0.s(v26, arr_b)));
                                v2 = v26 + 8;
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            break;
                        }
                        case 1: {
                            v26 = v8;
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 5) {
                                F0.m(object1, v19, Float.intBitsToFloat(j0.c(arr_b, v26)));
                                v2 = v26 + 4;
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            v26 = v8;
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v27 = j0.r(arr_b, v26, b90);
                                unsafe0.putLong(object0, v19, b90.b);
                                v5 |= v22;
                                v2 = v27;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            break;
                        }
                        case 7: {
                        label_101:
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = j0.r(arr_b, v8, b90);
                                F0.k(object1, v19, b90.b != 0L);
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            else {
                                v26 = v8;
                                break;
                            }
                            goto label_109;
                        }
                        case 8: {
                        label_109:
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 2) {
                                v2 = (v20 & 0x20000000) == 0 ? j0.l(arr_b, v8, b90) : j0.m(arr_b, v8, b90);
                                unsafe0.putObject(object1, v19, b90.c);
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            else {
                                v26 = v8;
                                break;
                            }
                            goto label_117;
                        }
                        case 9: {
                        label_117:
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 2) {
                                v2 = j0.g(this.k(v12), arr_b, v8, v1, b90);
                                Object object3 = unsafe0.getObject(object1, v19);
                                if(object3 == null) {
                                    unsafe0.putObject(object1, v19, b90.c);
                                }
                                else {
                                    unsafe0.putObject(object1, v19, zzkm.a(object3, b90.c));
                                }
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            else {
                                v26 = v8;
                                break;
                            }
                            goto label_129;
                        }
                        case 10: {
                        label_129:
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 2) {
                                v2 = j0.a(arr_b, v8, b90);
                                unsafe0.putObject(object1, v19, b90.c);
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            else {
                                v26 = v8;
                                break;
                            }
                            goto label_137;
                        }
                        case 4: 
                        case 11: {
                            v26 = v8;
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = j0.o(arr_b, v26, b90);
                                unsafe0.putInt(object1, v19, b90.a);
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            break;
                        }
                        case 12: {
                        label_137:
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = j0.o(arr_b, v8, b90);
                                unsafe0.putInt(object1, v19, b90.a);
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            else {
                                v26 = v8;
                                break;
                            }
                            goto label_145;
                        }
                        case 6: 
                        case 13: {
                        label_93:
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 5) {
                                unsafe0.putInt(object1, v19, j0.c(arr_b, v8));
                                v2 = v8 + 4;
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            else {
                                v26 = v8;
                                break;
                            }
                            goto label_101;
                        }
                        case 5: 
                        case 14: {
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 1) {
                                unsafe0.putLong(object0, v19, j0.s(v8, arr_b));
                                v2 = v8 + 8;
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            else {
                                v26 = v8;
                                break;
                            }
                            goto label_93;
                        }
                        case 15: {
                        label_145:
                            v13 = v9 >>> 3;
                            if((v9 & 7) == 0) {
                                v2 = j0.o(arr_b, v8, b90);
                                unsafe0.putInt(object1, v19, zzjh.zzb(b90.a));
                                v5 |= v22;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            else {
                                v26 = v8;
                                break;
                            }
                            goto label_153;
                        }
                        case 16: {
                        label_153:
                            if((v9 & 7) == 0) {
                                v27 = j0.r(arr_b, v8, b90);
                                v13 = v9 >>> 3;
                                unsafe0.putLong(object0, v19, zzjh.zzc(b90.b));
                                v5 |= v22;
                                v2 = v27;
                                v4 = v12;
                                v3 = v13;
                                v6 = v25;
                                continue;
                            }
                            else {
                                v13 = v9 >>> 3;
                                v26 = v8;
                            }
                            break;
                        }
                        default: {
                            v26 = v8;
                            v13 = v9 >>> 3;
                        }
                    }
                    v15 = v5;
                    v14 = v26;
                    v16 = v12;
                    object2 = object1;
                    v6 = v25;
                }
                else {
                    v13 = v9 >>> 3;
                    if(v18 == 27) {
                        if((v9 & 7) == 2) {
                            zzkl zzkl0 = (zzkl)unsafe0.getObject(object1, v19);
                            if(!zzkl0.zzc()) {
                                int v28 = zzkl0.size();
                                zzkl0 = zzkl0.zzd((v28 == 0 ? 10 : v28 + v28));
                                unsafe0.putObject(object1, v19, zzkl0);
                            }
                            v25 = v6;
                            v2 = j0.i(this.k(v12), v9, arr_b, v8, v1, zzkl0, b90);
                            v4 = v12;
                            v3 = v13;
                            v6 = v25;
                            continue;
                        }
                        else {
                            v15 = v5;
                            v29 = v6;
                            v30 = v8;
                            v16 = v12;
                            v14 = v30;
                            v6 = v29;
                            object2 = object0;
                            goto label_225;
                        }
                        goto label_187;
                    }
                    else {
                    label_187:
                        if(v18 <= 49) {
                            v29 = v6;
                            v15 = v5;
                            v16 = v12;
                            v2 = this.F(object0, arr_b, v8, v1, v9, v13, v9 & 7, v12, ((long)v20), v18, v19, b90);
                            if(v2 == v8) {
                                object2 = object0;
                                v14 = v2;
                                goto label_224;
                            }
                            else {
                                object1 = object0;
                                v3 = v13;
                                v6 = v29;
                                v5 = v15;
                                v4 = v16;
                                continue;
                            }
                            goto label_202;
                        }
                        else {
                        label_202:
                            v15 = v5;
                            v30 = v8;
                            v16 = v12;
                            v29 = v6;
                            if(v18 == 50) {
                                if((v9 & 7) != 2) {
                                    v14 = v30;
                                    v6 = v29;
                                    object2 = object0;
                                    goto label_225;
                                }
                                this.C(object0, v19, v16);
                                throw null;
                            }
                            else {
                                object2 = object0;
                                v2 = this.D(object0, arr_b, v30, v1, v9, v13, v9 & 7, v20, v18, v19, v16, b90);
                                if(v2 == v30) {
                                    v14 = v2;
                                }
                                else {
                                    object1 = object2;
                                    v4 = v16;
                                    v3 = v13;
                                    v6 = v29;
                                    v5 = v15;
                                    continue;
                                }
                            }
                        }
                    label_224:
                        v6 = v29;
                    }
                }
            }
        label_225:
            v2 = j0.n(v9, arr_b, v14, v1, k0.w(object0), b90);
            object1 = object2;
            v3 = v13;
            v5 = v15;
            v4 = v16;
        }
        if(v6 != 0xFFFFF) {
            unsafe0.putInt(object1, ((long)v6), v5);
        }
        if(v2 != v1) {
            throw zzko.c();
        }
    }

    public final int F(Object object0, byte[] arr_b, int v, int v1, int v2, int v3, int v4, int v5, long v6, int v7, long v8, b9 b90) {
        int v34;
        int v14;
        int v9 = v;
        Unsafe unsafe0 = k0.o;
        zzkl zzkl0 = (zzkl)unsafe0.getObject(object0, v8);
        if(!zzkl0.zzc()) {
            int v10 = zzkl0.size();
            zzkl0 = zzkl0.zzd((v10 == 0 ? 10 : v10 + v10));
            unsafe0.putObject(object0, v8, zzkl0);
        }
        zzmo zzmo0 = null;
    alab1:
        switch(v7) {
            case 26: {
                if(v4 == 2) {
                    if((v6 & 0x20000000L) == 0L) {
                        v9 = j0.o(arr_b, v9, b90);
                        int v25 = b90.a;
                        if(v25 < 0) {
                            throw zzko.b();
                        }
                        if(v25 == 0) {
                            zzkl0.add("");
                            goto label_131;
                        }
                        else {
                            zzkl0.add(new String(arr_b, v9, v25, zzkm.a));
                        }
                    alab2:
                        while(true) {
                            v9 += v25;
                            while(true) {
                            label_131:
                                if(v9 >= v1) {
                                    break alab1;
                                }
                                int v26 = j0.o(arr_b, v9, b90);
                                if(v2 != b90.a) {
                                    break alab1;
                                }
                                v9 = j0.o(arr_b, v26, b90);
                                v25 = b90.a;
                                if(v25 < 0) {
                                    break alab2;
                                }
                                if(v25 != 0) {
                                    zzkl0.add(new String(arr_b, v9, v25, zzkm.a));
                                    break;
                                }
                                zzkl0.add("");
                            }
                        }
                        throw zzko.b();
                    }
                    else {
                        v9 = j0.o(arr_b, v9, b90);
                        int v27 = b90.a;
                        if(v27 < 0) {
                            throw zzko.b();
                        }
                        if(v27 == 0) {
                            zzkl0.add("");
                            goto label_154;
                        }
                        else {
                            int v28 = v9 + v27;
                            if(!H0.d(arr_b, v9, v28)) {
                                throw zzko.a();
                            }
                            zzkl0.add(new String(arr_b, v9, v27, zzkm.a));
                        alab3:
                            while(true) {
                                v9 = v28;
                                while(true) {
                                label_154:
                                    if(v9 >= v1) {
                                        break alab1;
                                    }
                                    int v29 = j0.o(arr_b, v9, b90);
                                    if(v2 != b90.a) {
                                        break alab1;
                                    }
                                    v9 = j0.o(arr_b, v29, b90);
                                    int v30 = b90.a;
                                    if(v30 < 0) {
                                        throw zzko.b();
                                    }
                                    if(v30 != 0) {
                                        v28 = v9 + v30;
                                        if(!H0.d(arr_b, v9, v28)) {
                                            break alab3;
                                        }
                                        zzkl0.add(new String(arr_b, v9, v30, zzkm.a));
                                        break;
                                    }
                                    zzkl0.add("");
                                }
                            }
                            throw zzko.a();
                        }
                    }
                }
                break;
            }
            case 27: {
                return v4 == 2 ? j0.i(this.k(v5), v2, arr_b, v, v1, zzkl0, b90) : v9;
            label_14:
                if(v4 == 3) {
                    s0 s00 = this.k(v5);
                    int v11 = v2 & -8 | 4;
                    int v12 = j0.e(s00, arr_b, v, v1, v11, b90);
                    zzkl0.add(b90.c);
                    while(v12 < v1) {
                        int v13 = j0.o(arr_b, v12, b90);
                        if(v2 != b90.a) {
                            break;
                        }
                        v12 = j0.e(s00, arr_b, v13, v1, v11, b90);
                        zzkl0.add(b90.c);
                    }
                    return v12;
                }
                break;
            }
            case 28: {
                if(v4 == 2) {
                    int v31 = j0.o(arr_b, v9, b90);
                    int v32 = b90.a;
                    if(v32 < 0) {
                        throw zzko.b();
                    }
                    if(v32 > arr_b.length - v31) {
                        throw zzko.d();
                    }
                    if(v32 == 0) {
                        zzkl0.add(zzjd.zzb);
                        goto label_181;
                    }
                    else {
                        zzkl0.add(zzjd.zzl(arr_b, v31, v32));
                    }
                alab4:
                    while(true) {
                        v31 += v32;
                        while(true) {
                        label_181:
                            if(v31 >= v1) {
                                return v31;
                            }
                            int v33 = j0.o(arr_b, v31, b90);
                            if(v2 != b90.a) {
                                return v31;
                            }
                            v31 = j0.o(arr_b, v33, b90);
                            v32 = b90.a;
                            if(v32 < 0) {
                                throw zzko.b();
                            }
                            if(v32 > arr_b.length - v31) {
                                break alab4;
                            }
                            if(v32 != 0) {
                                zzkl0.add(zzjd.zzl(arr_b, v31, v32));
                                break;
                            }
                            zzkl0.add(zzjd.zzb);
                        }
                    }
                    throw zzko.d();
                }
                break;
            }
            case 18: 
            case 35: {
                if(v4 == 2) {
                    u9.l(zzkl0);
                    v14 = j0.o(arr_b, v9, b90);
                    int v15 = b90.a + v14;
                    if(v14 >= v15) {
                        if(v14 != v15) {
                            throw zzko.d();
                        }
                        return v14;
                    }
                    j0.s(v14, arr_b);
                    throw null;
                }
                if(v4 != 1) {
                    return v9;
                }
                u9.l(zzkl0);
                j0.s(v9, arr_b);
                throw null;
            }
            case 19: 
            case 36: {
                if(v4 == 2) {
                    u9.l(zzkl0);
                    v14 = j0.o(arr_b, v9, b90);
                    int v16 = b90.a + v14;
                    if(v14 >= v16) {
                        if(v14 != v16) {
                            throw zzko.d();
                        }
                        return v14;
                    }
                    j0.c(arr_b, v14);
                    throw null;
                }
                if(v4 == 5) {
                    u9.l(zzkl0);
                    j0.c(arr_b, v);
                    throw null;
                }
                break;
            }
            case 20: 
            case 21: 
            case 37: 
            case 38: {
                if(v4 == 2) {
                    v14 = j0.o(arr_b, v9, b90);
                    int v17 = b90.a + v14;
                    while(v14 < v17) {
                        v14 = j0.r(arr_b, v14, b90);
                        ((d0)zzkl0).h(b90.b);
                    }
                    if(v14 != v17) {
                        throw zzko.d();
                    }
                    return v14;
                }
                if(v4 == 0) {
                    int v18 = j0.r(arr_b, v9, b90);
                    ((d0)zzkl0).h(b90.b);
                    while(v18 < v1) {
                        int v19 = j0.o(arr_b, v18, b90);
                        if(v2 != b90.a) {
                            break;
                        }
                        v18 = j0.r(arr_b, v19, b90);
                        ((d0)zzkl0).h(b90.b);
                    }
                    return v18;
                }
                break;
            }
            case 25: 
            case 42: {
                if(v4 == 2) {
                    u9.l(zzkl0);
                    v14 = j0.o(arr_b, v9, b90);
                    int v24 = b90.a + v14;
                    if(v14 >= v24) {
                        if(v14 != v24) {
                            throw zzko.d();
                        }
                        return v14;
                    }
                    j0.r(arr_b, v14, b90);
                    throw null;
                }
                if(v4 == 0) {
                    u9.l(zzkl0);
                    j0.r(arr_b, v9, b90);
                    throw null;
                }
                break;
            }
            case 22: 
            case 29: 
            case 39: 
            case 43: {
                if(v4 == 2) {
                    return j0.k(arr_b, v9, zzkl0, b90);
                }
                return v4 == 0 ? j0.q(v2, arr_b, v, v1, zzkl0, b90) : v9;
            }
            case 30: 
            case 44: {
                if(v4 == 2) {
                    v34 = j0.k(arr_b, v9, zzkl0, b90);
                }
                else if(v4 == 0) {
                    v34 = j0.q(v2, arr_b, v, v1, zzkl0, b90);
                }
                else {
                    break;
                }
                zzmo zzmo1 = ((zzke)object0).zzc;
                if(zzmo1 != zzmo.zzc()) {
                    zzmo0 = zzmo1;
                }
                Object object1 = t0.a(v3, zzkl0, this.j(v5), zzmo0, this.l);
                if(object1 == null) {
                    return v34;
                }
                ((zzke)object0).zzc = (zzmo)object1;
                return v34;
            }
            case 24: 
            case 0x1F: 
            case 41: 
            case 45: {
                if(v4 == 2) {
                    v14 = j0.o(arr_b, v9, b90);
                    int v22 = b90.a + v14;
                    while(v14 < v22) {
                        ((Z)zzkl0).zzh(j0.c(arr_b, v14));
                        v14 += 4;
                    }
                    if(v14 != v22) {
                        throw zzko.d();
                    }
                    return v14;
                }
                if(v4 == 5) {
                    ((Z)zzkl0).zzh(j0.c(arr_b, v));
                    int v23;
                    while((v23 = v9 + 4) < v1) {
                        v9 = j0.o(arr_b, v23, b90);
                        if(v2 != b90.a) {
                            break;
                        }
                        ((Z)zzkl0).zzh(j0.c(arr_b, v9));
                    }
                    return v23;
                }
                break;
            }
            case 23: 
            case 0x20: 
            case 40: 
            case 46: {
                if(v4 == 2) {
                    v14 = j0.o(arr_b, v9, b90);
                    int v20 = b90.a + v14;
                    while(v14 < v20) {
                        ((d0)zzkl0).h(j0.s(v14, arr_b));
                        v14 += 8;
                    }
                    if(v14 != v20) {
                        throw zzko.d();
                    }
                    return v14;
                }
                if(v4 == 1) {
                    ((d0)zzkl0).h(j0.s(v9, arr_b));
                    int v21;
                    while((v21 = v9 + 8) < v1) {
                        v9 = j0.o(arr_b, v21, b90);
                        if(v2 != b90.a) {
                            break;
                        }
                        ((d0)zzkl0).h(j0.s(v9, arr_b));
                    }
                    return v21;
                }
                break;
            }
            case 33: 
            case 0x2F: {
                if(v4 == 2) {
                    v14 = j0.o(arr_b, v9, b90);
                    int v35 = b90.a + v14;
                    while(v14 < v35) {
                        v14 = j0.o(arr_b, v14, b90);
                        ((Z)zzkl0).zzh(zzjh.zzb(b90.a));
                    }
                    if(v14 != v35) {
                        throw zzko.d();
                    }
                    return v14;
                }
                if(v4 == 0) {
                    int v36 = j0.o(arr_b, v9, b90);
                    ((Z)zzkl0).zzh(zzjh.zzb(b90.a));
                    while(v36 < v1) {
                        int v37 = j0.o(arr_b, v36, b90);
                        if(v2 != b90.a) {
                            break;
                        }
                        v36 = j0.o(arr_b, v37, b90);
                        ((Z)zzkl0).zzh(zzjh.zzb(b90.a));
                    }
                    return v36;
                }
                break;
            }
            case 34: 
            case 0x30: {
                if(v4 == 2) {
                    v14 = j0.o(arr_b, v9, b90);
                    int v38 = b90.a + v14;
                    while(v14 < v38) {
                        v14 = j0.r(arr_b, v14, b90);
                        ((d0)zzkl0).h(zzjh.zzc(b90.b));
                    }
                    if(v14 != v38) {
                        throw zzko.d();
                    }
                    return v14;
                }
                if(v4 == 0) {
                    int v39 = j0.r(arr_b, v9, b90);
                    ((d0)zzkl0).h(zzjh.zzc(b90.b));
                    while(v39 < v1) {
                        int v40 = j0.o(arr_b, v39, b90);
                        if(v2 != b90.a) {
                            break;
                        }
                        v39 = j0.r(arr_b, v40, b90);
                        ((d0)zzkl0).h(zzjh.zzc(b90.b));
                    }
                    return v39;
                }
                break;
            }
            default: {
                goto label_14;
            }
        }
        return v9;
    }

    public final int G(int v, int v1) {
        int[] arr_v = this.a;
        int v2 = arr_v.length / 3 - 1;
        while(v1 <= v2) {
            int v3 = v2 + v1 >>> 1;
            int v4 = v3 * 3;
            int v5 = arr_v[v4];
            if(v == v5) {
                return v4;
            }
            if(v < v5) {
                v2 = v3 - 1;
            }
            else {
                v1 = v3 + 1;
            }
        }
        return -1;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final boolean a(Object object0) {
        int v1 = 0xFFFFF;
        int v2 = 0;
        for(int v = 0; true; ++v) {
            boolean z = true;
            if(v >= this.i) {
                break;
            }
            int v3 = this.h[v];
            int v4 = this.a[v3];
            int v5 = this.h(v3);
            int v6 = this.a[v3 + 2];
            int v7 = v6 & 0xFFFFF;
            int v8 = 1 << (v6 >>> 20);
            if(v7 != v1) {
                if(v7 != 0xFFFFF) {
                    v2 = k0.o.getInt(object0, ((long)v7));
                }
                v1 = v7;
            }
            if((0x10000000 & v5) != 0 && !(v1 == 0xFFFFF ? this.s(v3, object0) : (v2 & v8) != 0)) {
                return false;
            }
            switch(k0.g(v5)) {
                case 9: 
                case 17: {
                    if(v1 == 0xFFFFF) {
                        z = this.s(v3, object0);
                    }
                    else if((v2 & v8) == 0) {
                        z = false;
                    }
                    if(z && !this.k(v3).a(F0.c.m(((long)(v5 & 0xFFFFF)), object0))) {
                        return false;
                    }
                    break;
                }
                case 27: 
                case 49: {
                    List list0 = (List)F0.i(v5 & 0xFFFFF, object0);
                    if(!list0.isEmpty()) {
                        s0 s00 = this.k(v3);
                        for(int v9 = 0; v9 < list0.size(); ++v9) {
                            if(!s00.a(list0.get(v9))) {
                                return false;
                            }
                        }
                    }
                    break;
                }
                case 50: {
                    if(!((zzlf)F0.i(v5 & 0xFFFFF, object0)).isEmpty()) {
                        zzle zzle0 = (zzle)this.l(v3);
                        throw null;
                    }
                    break;
                }
                case 60: 
                case 68: {
                    if(this.t(v4, v3, object0) && !this.k(v3).a(F0.c.m(((long)(v5 & 0xFFFFF)), object0))) {
                        return false;
                    }
                }
            }
        }
        if(!this.f) {
            return true;
        }
        this.m.getClass();
        U.a(object0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final void b(Object object0, byte[] arr_b, int v, int v1, b9 b90) {
        if(this.g) {
            this.E(object0, arr_b, v, v1, b90);
            return;
        }
        this.v(object0, arr_b, v, v1, 0, b90);
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final void c(Object object0, I0 i00) {
        if(this.g) {
            if(!this.f) {
                int[] arr_v = this.a;
                for(int v = 0; v < arr_v.length; v += 3) {
                    int v1 = this.h(v);
                    int v2 = arr_v[v];
                    switch(k0.g(v1)) {
                        case 0: {
                            if(this.s(v, object0)) {
                                ((S)i00).g(v2, F0.c.a(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 1: {
                            if(this.s(v, object0)) {
                                ((S)i00).k(F0.c.b(((long)(v1 & 0xFFFFF)), object0), v2);
                            }
                            break;
                        }
                        case 2: {
                            if(this.s(v, object0)) {
                                ((S)i00).n(v2, F0.c.k(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 3: {
                            if(this.s(v, object0)) {
                                ((S)i00).d(v2, F0.c.k(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 4: {
                            if(this.s(v, object0)) {
                                ((S)i00).m(v2, F0.c.j(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 5: {
                            if(this.s(v, object0)) {
                                ((S)i00).j(v2, F0.c.k(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 6: {
                            if(this.s(v, object0)) {
                                ((S)i00).i(v2, F0.c.j(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 7: {
                            if(this.s(v, object0)) {
                                ((S)i00).e(v2, F0.c.g(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 8: {
                            if(this.s(v, object0)) {
                                k0.u(v2, F0.c.m(((long)(v1 & 0xFFFFF)), object0), i00);
                            }
                            break;
                        }
                        case 9: {
                            if(this.s(v, object0)) {
                                ((S)i00).o(v2, F0.c.m(((long)(v1 & 0xFFFFF)), object0), this.k(v));
                            }
                            break;
                        }
                        case 10: {
                            if(this.s(v, object0)) {
                                ((S)i00).f(v2, ((zzjd)F0.c.m(((long)(v1 & 0xFFFFF)), object0)));
                            }
                            break;
                        }
                        case 11: {
                            if(this.s(v, object0)) {
                                ((S)i00).c(v2, F0.c.j(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 12: {
                            if(this.s(v, object0)) {
                                ((S)i00).h(v2, F0.c.j(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 13: {
                            if(this.s(v, object0)) {
                                ((S)i00).p(v2, F0.c.j(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 14: {
                            if(this.s(v, object0)) {
                                ((S)i00).q(v2, F0.c.k(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 15: {
                            if(this.s(v, object0)) {
                                ((S)i00).a(v2, F0.c.j(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 16: {
                            if(this.s(v, object0)) {
                                ((S)i00).b(v2, F0.c.k(((long)(v1 & 0xFFFFF)), object0));
                            }
                            break;
                        }
                        case 17: {
                            if(this.s(v, object0)) {
                                ((S)i00).l(v2, F0.c.m(((long)(v1 & 0xFFFFF)), object0), this.k(v));
                            }
                            break;
                        }
                        case 18: {
                            t0.e(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 19: {
                            t0.i(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 20: {
                            t0.l(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 21: {
                            t0.t(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 22: {
                            t0.k(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 23: {
                            t0.h(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 24: {
                            t0.g(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 25: {
                            t0.c(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 26: {
                            t0.r(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00);
                            break;
                        }
                        case 27: {
                            t0.m(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, this.k(v));
                            break;
                        }
                        case 28: {
                            t0.d(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00);
                            break;
                        }
                        case 29: {
                            t0.s(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 30: {
                            t0.f(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 0x1F: {
                            t0.n(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 0x20: {
                            t0.o(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 33: {
                            t0.p(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 34: {
                            t0.q(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, false);
                            break;
                        }
                        case 35: {
                            t0.e(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 36: {
                            t0.i(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 37: {
                            t0.l(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 38: {
                            t0.t(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 39: {
                            t0.k(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 40: {
                            t0.h(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 41: {
                            t0.g(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 42: {
                            t0.c(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 43: {
                            t0.s(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 44: {
                            t0.f(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 45: {
                            t0.n(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 46: {
                            t0.o(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 0x2F: {
                            t0.p(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 0x30: {
                            t0.q(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, true);
                            break;
                        }
                        case 49: {
                            t0.j(v2, ((List)F0.c.m(((long)(v1 & 0xFFFFF)), object0)), i00, this.k(v));
                            break;
                        }
                        case 50: {
                            if(F0.c.m(((long)(v1 & 0xFFFFF)), object0) != null) {
                                zzle zzle0 = (zzle)this.l(v);
                                throw null;
                            }
                            break;
                        }
                        case 51: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).g(v2, ((double)(((Double)F0.c.m(((long)(v1 & 0xFFFFF)), object0)))));
                            }
                            break;
                        }
                        case 52: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).k(((float)(((Float)F0.c.m(((long)(v1 & 0xFFFFF)), object0)))), v2);
                            }
                            break;
                        }
                        case 53: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).n(v2, k0.i(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 54: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).d(v2, k0.i(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 55: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).m(v2, k0.B(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 56: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).j(v2, k0.i(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 57: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).i(v2, k0.B(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 58: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).e(v2, ((Boolean)F0.c.m(((long)(v1 & 0xFFFFF)), object0)).booleanValue());
                            }
                            break;
                        }
                        case 59: {
                            if(this.t(v2, v, object0)) {
                                k0.u(v2, F0.c.m(((long)(v1 & 0xFFFFF)), object0), i00);
                            }
                            break;
                        }
                        case 60: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).o(v2, F0.c.m(((long)(v1 & 0xFFFFF)), object0), this.k(v));
                            }
                            break;
                        }
                        case 61: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).f(v2, ((zzjd)F0.c.m(((long)(v1 & 0xFFFFF)), object0)));
                            }
                            break;
                        }
                        case 62: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).c(v2, k0.B(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 0x3F: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).h(v2, k0.B(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 0x40: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).p(v2, k0.B(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 65: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).q(v2, k0.i(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 66: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).a(v2, k0.B(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 67: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).b(v2, k0.i(v1 & 0xFFFFF, object0));
                            }
                            break;
                        }
                        case 68: {
                            if(this.t(v2, v, object0)) {
                                ((S)i00).l(v2, F0.c.m(((long)(v1 & 0xFFFFF)), object0), this.k(v));
                            }
                        }
                    }
                }
                this.l.getClass();
                ((zzke)object0).zzc.zzi(i00);
                return;
            }
            this.m.getClass();
            U.a(object0);
            throw null;
        }
        this.q(object0, i00);
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final int d(zzke zzke0) {
        int[] arr_v = this.a;
        int v1 = 0;
        for(int v = 0; v < arr_v.length; v += 3) {
            int v2 = this.h(v);
            int v3 = arr_v[v];
            long v4 = (long)(0xFFFFF & v2);
            int v5 = 37;
            switch(k0.g(v2)) {
                case 0: {
                    v1 = zzkm.zzc(Double.doubleToLongBits(F0.c.a(v4, zzke0))) + v1 * 53;
                    break;
                }
                case 1: {
                    v1 = Float.floatToIntBits(F0.c.b(v4, zzke0)) + v1 * 53;
                    break;
                }
                case 2: {
                    v1 = zzkm.zzc(F0.c.k(v4, zzke0)) + v1 * 53;
                    break;
                }
                case 3: {
                    v1 = zzkm.zzc(F0.c.k(v4, zzke0)) + v1 * 53;
                    break;
                }
                case 4: {
                    v1 = F0.c.j(v4, zzke0) + v1 * 53;
                    break;
                }
                case 5: {
                    v1 = zzkm.zzc(F0.c.k(v4, zzke0)) + v1 * 53;
                    break;
                }
                case 6: {
                    v1 = F0.c.j(v4, zzke0) + v1 * 53;
                    break;
                }
                case 7: {
                    v1 = zzkm.zza(F0.c.g(v4, zzke0)) + v1 * 53;
                    break;
                }
                case 8: {
                    v1 = ((String)F0.c.m(v4, zzke0)).hashCode() + v1 * 53;
                    break;
                }
                case 9: {
                    Object object0 = F0.c.m(v4, zzke0);
                    if(object0 != null) {
                        v5 = object0.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 10: {
                    v1 = F0.c.m(v4, zzke0).hashCode() + v1 * 53;
                    break;
                }
                case 11: {
                    v1 = F0.c.j(v4, zzke0) + v1 * 53;
                    break;
                }
                case 12: {
                    v1 = F0.c.j(v4, zzke0) + v1 * 53;
                    break;
                }
                case 13: {
                    v1 = F0.c.j(v4, zzke0) + v1 * 53;
                    break;
                }
                case 14: {
                    v1 = zzkm.zzc(F0.c.k(v4, zzke0)) + v1 * 53;
                    break;
                }
                case 15: {
                    v1 = F0.c.j(v4, zzke0) + v1 * 53;
                    break;
                }
                case 16: {
                    v1 = zzkm.zzc(F0.c.k(v4, zzke0)) + v1 * 53;
                    break;
                }
                case 17: {
                    Object object1 = F0.c.m(v4, zzke0);
                    if(object1 != null) {
                        v5 = object1.hashCode();
                    }
                    v1 = v1 * 53 + v5;
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    v1 = F0.c.m(v4, zzke0).hashCode() + v1 * 53;
                    break;
                }
                case 50: {
                    v1 = F0.c.m(v4, zzke0).hashCode() + v1 * 53;
                    break;
                }
                case 51: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = zzkm.zzc(Double.doubleToLongBits(((double)(((Double)F0.c.m(v4, zzke0)))))) + v1 * 53;
                    }
                    break;
                }
                case 52: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = Float.floatToIntBits(((float)(((Float)F0.c.m(v4, zzke0))))) + v1 * 53;
                    }
                    break;
                }
                case 53: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = zzkm.zzc(k0.i(v4, zzke0)) + v1 * 53;
                    }
                    break;
                }
                case 54: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = zzkm.zzc(k0.i(v4, zzke0)) + v1 * 53;
                    }
                    break;
                }
                case 55: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = k0.B(v4, zzke0) + v1 * 53;
                    }
                    break;
                }
                case 56: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = zzkm.zzc(k0.i(v4, zzke0)) + v1 * 53;
                    }
                    break;
                }
                case 57: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = k0.B(v4, zzke0) + v1 * 53;
                    }
                    break;
                }
                case 58: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = zzkm.zza(((Boolean)F0.c.m(v4, zzke0)).booleanValue()) + v1 * 53;
                    }
                    break;
                }
                case 59: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = ((String)F0.c.m(v4, zzke0)).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 60: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = F0.c.m(v4, zzke0).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 61: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = F0.c.m(v4, zzke0).hashCode() + v1 * 53;
                    }
                    break;
                }
                case 62: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = k0.B(v4, zzke0) + v1 * 53;
                    }
                    break;
                }
                case 0x3F: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = k0.B(v4, zzke0) + v1 * 53;
                    }
                    break;
                }
                case 0x40: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = k0.B(v4, zzke0) + v1 * 53;
                    }
                    break;
                }
                case 65: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = zzkm.zzc(k0.i(v4, zzke0)) + v1 * 53;
                    }
                    break;
                }
                case 66: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = k0.B(v4, zzke0) + v1 * 53;
                    }
                    break;
                }
                case 67: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = zzkm.zzc(k0.i(v4, zzke0)) + v1 * 53;
                    }
                    break;
                }
                case 68: {
                    if(this.t(v3, v, zzke0)) {
                        v1 = F0.c.m(v4, zzke0).hashCode() + v1 * 53;
                    }
                }
            }
        }
        this.l.getClass();
        int v6 = zzke0.zzc.hashCode();
        if(!this.f) {
            return v6 + v1 * 53;
        }
        this.m.getClass();
        U.a(zzke0);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final void e(zzke zzke0, zzke zzke1) {
        zzke1.getClass();
        for(int v = 0; true; v += 3) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            int v1 = this.h(v);
            long v2 = (long)(v1 & 0xFFFFF);
            int v3 = arr_v[v];
            switch(k0.g(v1)) {
                case 0: {
                    if(this.s(v, zzke1)) {
                        F0.l(zzke0, v2, F0.c.a(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 1: {
                    if(this.s(v, zzke1)) {
                        F0.m(zzke0, v2, F0.c.b(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 2: {
                    if(this.s(v, zzke1)) {
                        long v4 = F0.c.k(v2, zzke1);
                        F0.c.o(zzke0, v2, v4);
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 3: {
                    if(this.s(v, zzke1)) {
                        long v5 = F0.c.k(v2, zzke1);
                        F0.c.o(zzke0, v2, v5);
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 4: {
                    if(this.s(v, zzke1)) {
                        F0.n(zzke0, v2, F0.c.j(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 5: {
                    if(this.s(v, zzke1)) {
                        long v6 = F0.c.k(v2, zzke1);
                        F0.c.o(zzke0, v2, v6);
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 6: {
                    if(this.s(v, zzke1)) {
                        F0.n(zzke0, v2, F0.c.j(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 7: {
                    if(this.s(v, zzke1)) {
                        F0.k(zzke0, v2, F0.c.g(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 8: {
                    if(this.s(v, zzke1)) {
                        F0.o(v2, zzke0, F0.c.m(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 9: {
                    this.n(zzke0, zzke1, v);
                    break;
                }
                case 10: {
                    if(this.s(v, zzke1)) {
                        F0.o(v2, zzke0, F0.c.m(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 11: {
                    if(this.s(v, zzke1)) {
                        F0.n(zzke0, v2, F0.c.j(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 12: {
                    if(this.s(v, zzke1)) {
                        F0.n(zzke0, v2, F0.c.j(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 13: {
                    if(this.s(v, zzke1)) {
                        F0.n(zzke0, v2, F0.c.j(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 14: {
                    if(this.s(v, zzke1)) {
                        long v7 = F0.c.k(v2, zzke1);
                        F0.c.o(zzke0, v2, v7);
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 15: {
                    if(this.s(v, zzke1)) {
                        F0.n(zzke0, v2, F0.c.j(v2, zzke1));
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 16: {
                    if(this.s(v, zzke1)) {
                        long v8 = F0.c.k(v2, zzke1);
                        F0.c.o(zzke0, v2, v8);
                        this.p(zzke0, v);
                    }
                    break;
                }
                case 17: {
                    this.n(zzke0, zzke1, v);
                    break;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    this.k.b(zzke0, zzke1, v2);
                    break;
                }
                case 50: {
                    F0.o(v2, zzke0, g0.b(F0.c.m(v2, zzke0), F0.c.m(v2, zzke1)));
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: {
                    if(this.t(v3, v, zzke1)) {
                        F0.o(v2, zzke0, F0.c.m(v2, zzke1));
                        F0.n(zzke0, ((long)(arr_v[v + 2] & 0xFFFFF)), v3);
                    }
                    break;
                }
                case 60: {
                    this.o(zzke0, zzke1, v);
                    break;
                }
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: {
                    if(this.t(v3, v, zzke1)) {
                        F0.o(v2, zzke0, F0.c.m(v2, zzke1));
                        F0.n(zzke0, ((long)(arr_v[v + 2] & 0xFFFFF)), v3);
                    }
                    break;
                }
                case 68: {
                    this.o(zzke0, zzke1, v);
                }
            }
        }
        t0.b(this.l, zzke0, zzke1);
        if(!this.f) {
            return;
        }
        this.m.getClass();
        U.a(zzke1);
        throw null;
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final boolean f(zzke zzke0, zzke zzke1) {
        boolean z;
        int[] arr_v = this.a;
        int v = 0;
        while(v < arr_v.length) {
            int v1 = this.h(v);
            long v2 = (long)(v1 & 0xFFFFF);
            switch(k0.g(v1)) {
                case 0: {
                    if(this.r(zzke0, zzke1, v) && Double.doubleToLongBits(F0.c.a(v2, zzke0)) == Double.doubleToLongBits(F0.c.a(v2, zzke1))) {
                        break;
                    }
                    return false;
                }
                case 1: {
                    if(this.r(zzke0, zzke1, v) && Float.floatToIntBits(F0.c.b(v2, zzke0)) == Float.floatToIntBits(F0.c.b(v2, zzke1))) {
                        break;
                    }
                    return false;
                }
                case 2: {
                    if(this.r(zzke0, zzke1, v) && F0.c.k(v2, zzke0) == F0.c.k(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 3: {
                    if(this.r(zzke0, zzke1, v) && F0.c.k(v2, zzke0) == F0.c.k(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 4: {
                    if(this.r(zzke0, zzke1, v) && F0.c.j(v2, zzke0) == F0.c.j(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 5: {
                    if(this.r(zzke0, zzke1, v) && F0.c.k(v2, zzke0) == F0.c.k(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 6: {
                    if(this.r(zzke0, zzke1, v) && F0.c.j(v2, zzke0) == F0.c.j(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 7: {
                    if(this.r(zzke0, zzke1, v) && F0.c.g(v2, zzke0) == F0.c.g(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 8: {
                    if(this.r(zzke0, zzke1, v) && t0.u(F0.c.m(v2, zzke0), F0.c.m(v2, zzke1))) {
                        break;
                    }
                    return false;
                }
                case 9: {
                    if(this.r(zzke0, zzke1, v) && t0.u(F0.c.m(v2, zzke0), F0.c.m(v2, zzke1))) {
                        break;
                    }
                    return false;
                }
                case 10: {
                    if(this.r(zzke0, zzke1, v) && t0.u(F0.c.m(v2, zzke0), F0.c.m(v2, zzke1))) {
                        break;
                    }
                    return false;
                }
                case 11: {
                    if(this.r(zzke0, zzke1, v) && F0.c.j(v2, zzke0) == F0.c.j(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 12: {
                    if(this.r(zzke0, zzke1, v) && F0.c.j(v2, zzke0) == F0.c.j(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 13: {
                    if(this.r(zzke0, zzke1, v) && F0.c.j(v2, zzke0) == F0.c.j(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 14: {
                    if(this.r(zzke0, zzke1, v) && F0.c.k(v2, zzke0) == F0.c.k(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 15: {
                    if(this.r(zzke0, zzke1, v) && F0.c.j(v2, zzke0) == F0.c.j(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 16: {
                    if(this.r(zzke0, zzke1, v) && F0.c.k(v2, zzke0) == F0.c.k(v2, zzke1)) {
                        break;
                    }
                    return false;
                }
                case 17: {
                    if(this.r(zzke0, zzke1, v) && t0.u(F0.c.m(v2, zzke0), F0.c.m(v2, zzke1))) {
                        break;
                    }
                    return false;
                }
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 0x1F: 
                case 0x20: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 0x2F: 
                case 0x30: 
                case 49: {
                    z = t0.u(F0.c.m(v2, zzke0), F0.c.m(v2, zzke1));
                    goto label_46;
                }
                case 50: {
                    z = t0.u(F0.c.m(v2, zzke0), F0.c.m(v2, zzke1));
                label_46:
                    if(!z) {
                        return false;
                    }
                    break;
                }
                case 51: 
                case 52: 
                case 53: 
                case 54: 
                case 55: 
                case 56: 
                case 57: 
                case 58: 
                case 59: 
                case 60: 
                case 61: 
                case 62: 
                case 0x3F: 
                case 0x40: 
                case 65: 
                case 66: 
                case 67: 
                case 68: {
                    long v3 = (long)(arr_v[v + 2] & 0xFFFFF);
                    if(F0.c.j(v3, zzke0) != F0.c.j(v3, zzke1) || !t0.u(F0.c.m(v2, zzke0), F0.c.m(v2, zzke1))) {
                        return false;
                    }
                }
            }
            v += 3;
        }
        this.l.getClass();
        if(!zzke0.zzc.equals(zzke1.zzc)) {
            return false;
        }
        if(!this.f) {
            return true;
        }
        this.m.getClass();
        U.a(zzke0);
        throw null;
    }

    public static int g(int v) {
        return v >>> 20 & 0xFF;
    }

    public final int h(int v) {
        return this.a[v + 1];
    }

    public static long i(long v, Object object0) {
        return (long)(((Long)F0.c.m(v, object0)));
    }

    public final zzki j(int v) {
        return (zzki)this.b[v / 3 * 2 + 1];
    }

    public final s0 k(int v) {
        int v1 = v / 3 + v / 3;
        Object[] arr_object = this.b;
        s0 s00 = (s0)arr_object[v1];
        if(s00 != null) {
            return s00;
        }
        s0 s01 = p0.c.a(((Class)arr_object[v1 + 1]));
        arr_object[v1] = s01;
        return s01;
    }

    public final Object l(int v) {
        return this.b[v / 3 + v / 3];
    }

    public static Field m(String s, Class class0) {
        try {
            return class0.getDeclaredField(s);
        }
        catch(NoSuchFieldException unused_ex) {
            Field[] arr_field = class0.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(s.equals(field0.getName())) {
                    return field0;
                }
            }
            String s1 = Arrays.toString(arr_field);
            StringBuilder stringBuilder0 = e.j("Field ", s, " for ", class0.getName(), " not found. Known fields are ");
            stringBuilder0.append(s1);
            throw new RuntimeException(stringBuilder0.toString());
        }
    }

    public final void n(zzke zzke0, zzke zzke1, int v) {
        int v1 = this.h(v);
        if(!this.s(v, zzke1)) {
            return;
        }
        Object object0 = F0.c.m(((long)(v1 & 0xFFFFF)), zzke0);
        Object object1 = F0.c.m(((long)(v1 & 0xFFFFF)), zzke1);
        if(object0 != null && object1 != null) {
            F0.o(v1 & 0xFFFFF, zzke0, zzkm.a(object0, object1));
            this.p(zzke0, v);
            return;
        }
        if(object1 != null) {
            F0.o(v1 & 0xFFFFF, zzke0, object1);
            this.p(zzke0, v);
        }
    }

    public final void o(zzke zzke0, zzke zzke1, int v) {
        int v1 = this.h(v);
        int[] arr_v = this.a;
        int v2 = arr_v[v];
        if(!this.t(v2, v, zzke1)) {
            return;
        }
        Object object0 = this.t(v2, v, zzke0) ? F0.c.m(((long)(v1 & 0xFFFFF)), zzke0) : null;
        Object object1 = F0.c.m(((long)(v1 & 0xFFFFF)), zzke1);
        if(object0 != null && object1 != null) {
            F0.o(v1 & 0xFFFFF, zzke0, zzkm.a(object0, object1));
            F0.n(zzke0, ((long)(arr_v[v + 2] & 0xFFFFF)), v2);
            return;
        }
        if(object1 != null) {
            F0.o(v1 & 0xFFFFF, zzke0, object1);
            F0.n(zzke0, ((long)(arr_v[v + 2] & 0xFFFFF)), v2);
        }
    }

    public final void p(zzke zzke0, int v) {
        int v1 = this.a[v + 2];
        if(((long)(0xFFFFF & v1)) == 0xFFFFFL) {
            return;
        }
        F0.n(zzke0, ((long)(0xFFFFF & v1)), 1 << (v1 >>> 20) | F0.c.j(((long)(0xFFFFF & v1)), zzke0));
    }

    public final void q(Object object0, I0 i00) {
        int v8;
        if(!this.f) {
            int[] arr_v = this.a;
            Unsafe unsafe0 = k0.o;
            int v1 = 0;
            int v2 = 0xFFFFF;
            for(int v = 0; v < arr_v.length; v += 3) {
                int v3 = this.h(v);
                int v4 = arr_v[v];
                int v5 = k0.g(v3);
                if(v5 <= 17) {
                    int v6 = arr_v[v + 2];
                    int v7 = v6 & 0xFFFFF;
                    if(v7 != v2) {
                        v1 = unsafe0.getInt(object0, ((long)v7));
                        v2 = v7;
                    }
                    v8 = 1 << (v6 >>> 20);
                }
                else {
                    v8 = 0;
                }
                long v9 = (long)(v3 & 0xFFFFF);
                switch(v5) {
                    case 0: {
                        if((v8 & v1) != 0) {
                            ((S)i00).g(v4, F0.d(v9, object0));
                        }
                        break;
                    }
                    case 1: {
                        if((v8 & v1) != 0) {
                            ((S)i00).k(F0.e(v9, object0), v4);
                        }
                        break;
                    }
                    case 2: {
                        if((v8 & v1) != 0) {
                            ((S)i00).n(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 3: {
                        if((v8 & v1) != 0) {
                            ((S)i00).d(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 4: {
                        if((v8 & v1) != 0) {
                            ((S)i00).m(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 5: {
                        if((v8 & v1) != 0) {
                            ((S)i00).j(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 6: {
                        if((v8 & v1) != 0) {
                            ((S)i00).i(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 7: {
                        if((v8 & v1) != 0) {
                            ((S)i00).e(v4, F0.s(v9, object0));
                        }
                        break;
                    }
                    case 8: {
                        if((v8 & v1) != 0) {
                            k0.u(v4, unsafe0.getObject(object0, v9), i00);
                        }
                        break;
                    }
                    case 9: {
                        if((v8 & v1) != 0) {
                            ((S)i00).o(v4, unsafe0.getObject(object0, v9), this.k(v));
                        }
                        break;
                    }
                    case 10: {
                        if((v8 & v1) != 0) {
                            ((S)i00).f(v4, ((zzjd)unsafe0.getObject(object0, v9)));
                        }
                        break;
                    }
                    case 11: {
                        if((v8 & v1) != 0) {
                            ((S)i00).c(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 12: {
                        if((v8 & v1) != 0) {
                            ((S)i00).h(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 13: {
                        if((v8 & v1) != 0) {
                            ((S)i00).p(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 14: {
                        if((v8 & v1) != 0) {
                            ((S)i00).q(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 15: {
                        if((v8 & v1) != 0) {
                            ((S)i00).a(v4, unsafe0.getInt(object0, v9));
                        }
                        break;
                    }
                    case 16: {
                        if((v8 & v1) != 0) {
                            ((S)i00).b(v4, unsafe0.getLong(object0, v9));
                        }
                        break;
                    }
                    case 17: {
                        if((v8 & v1) != 0) {
                            ((S)i00).l(v4, unsafe0.getObject(object0, v9), this.k(v));
                        }
                        break;
                    }
                    case 18: {
                        t0.e(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 19: {
                        t0.i(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 20: {
                        t0.l(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 21: {
                        t0.t(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 22: {
                        t0.k(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 23: {
                        t0.h(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 24: {
                        t0.g(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 25: {
                        t0.c(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 26: {
                        t0.r(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00);
                        break;
                    }
                    case 27: {
                        t0.m(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, this.k(v));
                        break;
                    }
                    case 28: {
                        t0.d(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00);
                        break;
                    }
                    case 29: {
                        t0.s(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 30: {
                        t0.f(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 0x1F: {
                        t0.n(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 0x20: {
                        t0.o(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 33: {
                        t0.p(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 34: {
                        t0.q(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, false);
                        break;
                    }
                    case 35: {
                        t0.e(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 36: {
                        t0.i(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 37: {
                        t0.l(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 38: {
                        t0.t(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 39: {
                        t0.k(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 40: {
                        t0.h(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 41: {
                        t0.g(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 42: {
                        t0.c(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 43: {
                        t0.s(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 44: {
                        t0.f(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 45: {
                        t0.n(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 46: {
                        t0.o(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 0x2F: {
                        t0.p(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 0x30: {
                        t0.q(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, true);
                        break;
                    }
                    case 49: {
                        t0.j(arr_v[v], ((List)unsafe0.getObject(object0, v9)), i00, this.k(v));
                        break;
                    }
                    case 50: {
                        if(unsafe0.getObject(object0, v9) != null) {
                            zzle zzle0 = (zzle)this.l(v);
                            throw null;
                        }
                        break;
                    }
                    case 51: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).g(v4, ((double)(((Double)F0.c.m(v9, object0)))));
                        }
                        break;
                    }
                    case 52: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).k(((float)(((Float)F0.c.m(v9, object0)))), v4);
                        }
                        break;
                    }
                    case 53: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).n(v4, k0.i(v9, object0));
                        }
                        break;
                    }
                    case 54: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).d(v4, k0.i(v9, object0));
                        }
                        break;
                    }
                    case 55: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).m(v4, k0.B(v9, object0));
                        }
                        break;
                    }
                    case 56: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).j(v4, k0.i(v9, object0));
                        }
                        break;
                    }
                    case 57: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).i(v4, k0.B(v9, object0));
                        }
                        break;
                    }
                    case 58: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).e(v4, ((Boolean)F0.c.m(v9, object0)).booleanValue());
                        }
                        break;
                    }
                    case 59: {
                        if(this.t(v4, v, object0)) {
                            k0.u(v4, unsafe0.getObject(object0, v9), i00);
                        }
                        break;
                    }
                    case 60: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).o(v4, unsafe0.getObject(object0, v9), this.k(v));
                        }
                        break;
                    }
                    case 61: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).f(v4, ((zzjd)unsafe0.getObject(object0, v9)));
                        }
                        break;
                    }
                    case 62: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).c(v4, k0.B(v9, object0));
                        }
                        break;
                    }
                    case 0x3F: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).h(v4, k0.B(v9, object0));
                        }
                        break;
                    }
                    case 0x40: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).p(v4, k0.B(v9, object0));
                        }
                        break;
                    }
                    case 65: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).q(v4, k0.i(v9, object0));
                        }
                        break;
                    }
                    case 66: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).a(v4, k0.B(v9, object0));
                        }
                        break;
                    }
                    case 67: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).b(v4, k0.i(v9, object0));
                        }
                        break;
                    }
                    case 68: {
                        if(this.t(v4, v, object0)) {
                            ((S)i00).l(v4, unsafe0.getObject(object0, v9), this.k(v));
                        }
                    }
                }
            }
            this.l.getClass();
            z0.c(z0.b(object0), i00);
            return;
        }
        this.m.getClass();
        U.a(object0);
        throw null;
    }

    public final boolean r(zzke zzke0, zzke zzke1, int v) {
        return this.s(v, zzke0) == this.s(v, zzke1);
    }

    public final boolean s(int v, Object object0) {
        int v1 = this.a[v + 2];
        if(((long)(v1 & 0xFFFFF)) == 0xFFFFFL) {
            int v2 = this.h(v);
            switch(k0.g(v2)) {
                case 0: {
                    return Double.doubleToRawLongBits(F0.c.a(((long)(v2 & 0xFFFFF)), object0)) != 0L;
                }
                case 1: {
                    return Float.floatToRawIntBits(F0.c.b(((long)(v2 & 0xFFFFF)), object0)) != 0;
                }
                case 2: {
                    return F0.c.k(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 3: {
                    return F0.c.k(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 4: {
                    return F0.c.j(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 5: {
                    return F0.c.k(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 6: {
                    return F0.c.j(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 7: {
                    return F0.c.g(((long)(v2 & 0xFFFFF)), object0);
                }
                case 8: {
                    Object object1 = F0.c.m(((long)(v2 & 0xFFFFF)), object0);
                    if(object1 instanceof String) {
                        return !((String)object1).isEmpty();
                    }
                    if(!(object1 instanceof zzjd)) {
                        throw new IllegalArgumentException();
                    }
                    return !zzjd.zzb.equals(object1);
                }
                case 9: {
                    return F0.c.m(((long)(v2 & 0xFFFFF)), object0) != null;
                }
                case 10: {
                    Object object2 = F0.c.m(((long)(v2 & 0xFFFFF)), object0);
                    return !zzjd.zzb.equals(object2);
                }
                case 11: {
                    return F0.c.j(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 12: {
                    return F0.c.j(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 13: {
                    return F0.c.j(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 14: {
                    return F0.c.k(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 15: {
                    return F0.c.j(((long)(v2 & 0xFFFFF)), object0) != 0;
                }
                case 16: {
                    return F0.c.k(((long)(v2 & 0xFFFFF)), object0) != 0L;
                }
                case 17: {
                    return F0.c.m(((long)(v2 & 0xFFFFF)), object0) != null;
                }
                default: {
                    throw new IllegalArgumentException();
                }
            }
        }
        return (F0.c.j(((long)(v1 & 0xFFFFF)), object0) & 1 << (v1 >>> 20)) != 0;
    }

    public final boolean t(int v, int v1, Object object0) {
        return F0.c.j(((long)(this.a[v1 + 2] & 0xFFFFF)), object0) == v;
    }

    public static final void u(int v, Object object0, I0 i00) {
        if(object0 instanceof String) {
            ((S)i00).a.zzm(v, ((String)object0));
            return;
        }
        ((S)i00).f(v, ((zzjd)object0));
    }

    public final int v(Object object0, byte[] arr_b, int v, int v1, int v2, b9 b90) {
        int v37;
        int v31;
        int v30;
        int v29;
        int v28;
        int v27;
        long v26;
        int v19;
        int v18;
        k0 k01;
        int v17;
        int v16;
        int[] arr_v1;
        int v15;
        int v14;
        int v11;
        int v10;
        k0 k00 = this;
        Unsafe unsafe0 = k0.o;
        int v3 = v;
        int v4 = 0;
        int v5 = -1;
        int v6 = 0;
        int v7 = 0;
        int v8 = 0xFFFFF;
        while(true) {
            int[] arr_v = k00.a;
            if(v3 >= v1) {
                arr_v1 = arr_v;
                k01 = k00;
                break;
            }
            int v9 = arr_b[v3];
            if(v9 < 0) {
                v10 = j0.p(v9, arr_b, v3 + 1, b90);
                v11 = b90.a;
            }
            else {
                v11 = v9;
                v10 = v3 + 1;
            }
            int v12 = k00.d;
            int v13 = k00.c;
            if(v11 >>> 3 > v5) {
                v14 = v11 >>> 3 < v13 || v11 >>> 3 > v12 ? -1 : k00.G(v11 >>> 3, v6 / 3);
            }
            else {
                v14 = v11 >>> 3 < v13 || v11 >>> 3 > v12 ? -1 : k00.G(v11 >>> 3, 0);
            }
            if(v14 == -1) {
                v15 = v10;
                arr_v1 = arr_v;
                v16 = v7;
                v17 = v11 >>> 3;
                k01 = k00;
                v18 = v11;
                v19 = 0;
            }
            else {
                int v20 = arr_v[v14 + 1];
                int v21 = k0.g(v20);
                long v22 = (long)(v20 & 0xFFFFF);
                if(v21 <= 17) {
                    int v23 = arr_v[v14 + 2];
                    int v24 = 1 << (v23 >>> 20);
                    int v25 = v23 & 0xFFFFF;
                    if(v25 == v8) {
                        v26 = v22;
                        v27 = v8;
                    }
                    else {
                        v26 = v22;
                        if(v8 != 0xFFFFF) {
                            unsafe0.putInt(object0, ((long)v8), v7);
                        }
                        v7 = unsafe0.getInt(object0, ((long)v25));
                        v27 = v25;
                    }
                    switch(v21) {
                        case 0: {
                        label_66:
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 1) {
                                F0.l(object0, v26, Double.longBitsToDouble(j0.s(v28, arr_b)));
                                v3 = v28 + 8;
                                goto label_81;
                            }
                            break;
                        }
                        case 1: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 5) {
                                F0.m(object0, v26, Float.intBitsToFloat(j0.c(arr_b, v28)));
                                v3 = v28 + 4;
                            label_81:
                                v7 |= v24;
                                v8 = v30;
                                v5 = v11 >>> 3;
                                v4 = v31;
                                v6 = v29;
                                continue;
                            }
                            break;
                        }
                        case 2: 
                        case 3: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 0) {
                                int v32 = j0.r(arr_b, v28, b90);
                                unsafe0.putLong(object0, v26, b90.b);
                                v7 |= v24;
                                v8 = v30;
                                v3 = v32;
                                v6 = v29;
                                v5 = v11 >>> 3;
                                v4 = v31;
                                continue;
                            }
                            break;
                        }
                        case 7: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 0) {
                                int v33 = j0.r(arr_b, v28, b90);
                                F0.k(object0, v26, b90.b != 0L);
                                v8 = v30;
                                v6 = v29;
                                v5 = v11 >>> 3;
                                v4 = v31;
                                v7 |= v24;
                                v3 = v33;
                                continue;
                            }
                            break;
                        }
                        case 8: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 2) {
                                v3 = (v20 & 0x20000000) == 0 ? j0.l(arr_b, v28, b90) : j0.m(arr_b, v28, b90);
                                unsafe0.putObject(object0, v26, b90.c);
                                goto label_197;
                            }
                            break;
                        }
                        case 9: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 2) {
                                v3 = j0.g(k00.k(v29), arr_b, v28, v1, b90);
                                if((v7 & v24) == 0) {
                                    unsafe0.putObject(object0, v26, b90.c);
                                }
                                else {
                                    unsafe0.putObject(object0, v26, zzkm.a(unsafe0.getObject(object0, v26), b90.c));
                                }
                                v8 = v30;
                                v6 = v29;
                                v4 = v31;
                                v7 |= v24;
                                v5 = v11 >>> 3;
                                continue;
                            }
                            break;
                        }
                        case 10: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 2) {
                                v3 = j0.a(arr_b, v28, b90);
                                unsafe0.putObject(object0, v26, b90.c);
                                goto label_197;
                            }
                            break;
                        }
                        case 4: 
                        case 11: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 0) {
                                v3 = j0.o(arr_b, v28, b90);
                                unsafe0.putInt(object0, v26, b90.a);
                                goto label_197;
                            }
                            break;
                        }
                        case 12: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 0) {
                                v3 = j0.o(arr_b, v28, b90);
                                int v34 = b90.a;
                                zzki zzki0 = k00.j(v29);
                                if(zzki0 == null || zzki0.zza(v34)) {
                                    unsafe0.putInt(object0, v26, v34);
                                    goto label_197;
                                }
                                else {
                                    k0.w(object0).b(v31, ((long)v34));
                                    v6 = v29;
                                    v5 = v11 >>> 3;
                                    v4 = v31;
                                    v8 = v30;
                                    continue;
                                }
                                goto label_190;
                            }
                            break;
                        }
                        case 6: 
                        case 13: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 5) {
                                unsafe0.putInt(object0, v26, j0.c(arr_b, v28));
                                v3 = v28 + 4;
                                goto label_197;
                            }
                            break;
                        }
                        case 5: 
                        case 14: {
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 1) {
                                unsafe0.putLong(object0, v26, j0.s(v28, arr_b));
                                v3 = v28 + 8;
                                v7 |= v24;
                                v8 = v30;
                                v6 = v29;
                                v5 = v11 >>> 3;
                                v4 = v31;
                                continue;
                            }
                            break;
                        }
                        case 15: {
                        label_190:
                            v28 = v10;
                            v29 = v14;
                            v30 = v27;
                            v31 = v11;
                            if((v11 & 7) == 0) {
                                v3 = j0.o(arr_b, v28, b90);
                                unsafe0.putInt(object0, v26, zzjh.zzb(b90.a));
                            label_197:
                                v8 = v30;
                                v6 = v29;
                                v5 = v11 >>> 3;
                                v7 |= v24;
                                v4 = v31;
                                continue;
                            }
                            break;
                        }
                        case 16: {
                            v28 = v10;
                            if((v11 & 7) == 0) {
                                int v35 = j0.r(arr_b, v28, b90);
                                unsafe0.putLong(object0, v26, zzjh.zzc(b90.b));
                                v7 |= v24;
                                v8 = v27;
                                v6 = v14;
                                v5 = v11 >>> 3;
                                v4 = v11;
                                v3 = v35;
                                continue;
                            }
                            else {
                                v29 = v14;
                                v30 = v27;
                                v31 = v11;
                            }
                            break;
                        }
                        default: {
                            if((v11 & 7) == 3) {
                                v3 = j0.e(k00.k(v14), arr_b, v10, v1, v11 >>> 3 << 3 | 4, b90);
                                if((v7 & v24) == 0) {
                                    unsafe0.putObject(object0, v26, b90.c);
                                }
                                else {
                                    unsafe0.putObject(object0, v26, zzkm.a(unsafe0.getObject(object0, v26), b90.c));
                                }
                                v7 |= v24;
                                v4 = v11;
                                v5 = v11 >>> 3;
                                v8 = v27;
                                v6 = v14;
                                continue;
                            }
                            else {
                                v28 = v10;
                                v29 = v14;
                                v30 = v27;
                                v31 = v11;
                                break;
                            }
                            goto label_66;
                        }
                    }
                    arr_v1 = arr_v;
                    v16 = v7;
                    v19 = v29;
                    v17 = v11 >>> 3;
                    v18 = v31;
                    v15 = v28;
                    k01 = k00;
                    v8 = v30;
                }
                else {
                    v17 = v11 >>> 3;
                    if(v21 == 27) {
                        if((v11 & 7) == 2) {
                            zzkl zzkl0 = (zzkl)unsafe0.getObject(object0, v22);
                            if(!zzkl0.zzc()) {
                                int v36 = zzkl0.size();
                                zzkl0 = zzkl0.zzd((v36 == 0 ? 10 : v36 + v36));
                                unsafe0.putObject(object0, v22, zzkl0);
                            }
                            v4 = v11;
                            v3 = j0.i(k00.k(v14), v4, arr_b, v10, v1, zzkl0, b90);
                            v6 = v14;
                            v5 = v17;
                            continue;
                        }
                        else {
                            v16 = v7;
                            arr_v1 = arr_v;
                            v19 = v14;
                            k01 = this;
                            v15 = v10;
                            v18 = v11;
                            goto label_283;
                        }
                        goto label_246;
                    }
                    else {
                    label_246:
                        v16 = v7;
                        if(v21 <= 49) {
                            arr_v1 = arr_v;
                            v19 = v14;
                            v3 = this.F(object0, arr_b, v10, v1, v11, v17, v11 & 7, v14, ((long)v20), v21, v22, b90);
                            if(v3 == v10) {
                                k01 = this;
                                v15 = v3;
                                v18 = v11;
                                goto label_283;
                            }
                            else {
                                k00 = this;
                                v5 = v17;
                                v7 = v16;
                                v4 = v11;
                                v6 = v19;
                                continue;
                            }
                            goto label_262;
                        }
                        else {
                        label_262:
                            arr_v1 = arr_v;
                            v19 = v14;
                            if(v21 == 50) {
                                if((v11 & 7) != 2) {
                                    k01 = this;
                                    v15 = v10;
                                    v18 = v11;
                                    goto label_283;
                                }
                                this.C(object0, v22, v19);
                                throw null;
                            }
                            else {
                                k01 = this;
                                v3 = this.D(object0, arr_b, v10, v1, v11, v17, v11 & 7, v20, v21, v22, v19, b90);
                                if(v3 == v10) {
                                    v15 = v3;
                                    v18 = v11;
                                }
                                else {
                                    k00 = k01;
                                    v5 = v17;
                                    v7 = v16;
                                    v4 = v11;
                                    v6 = v19;
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        label_283:
            if(v18 == v2 && v2 != 0) {
                v3 = v15;
                v4 = v18;
                v7 = v16;
                break;
            }
            if(k01.f) {
                zzjq zzjq0 = zzjq.zza();
                zzjq zzjq1 = (zzjq)b90.d;
                if(zzjq1 != zzjq0) {
                    v37 = v17;
                    if(zzjq1.zzc(k01.e, v37) == null) {
                        v3 = j0.n(v18, arr_b, v15, v1, k0.w(object0), b90);
                        goto label_300;
                    }
                    zzkb zzkb0 = (zzkb)object0;
                    throw null;
                }
            }
            v37 = v17;
            v3 = j0.n(v18, arr_b, v15, v1, k0.w(object0), b90);
        label_300:
            v4 = v18;
            v5 = v37;
            k00 = k01;
            v7 = v16;
            v6 = v19;
        }
        if(v8 != 0xFFFFF) {
            unsafe0.putInt(object0, ((long)v8), v7);
        }
        int v38 = k01.i;
        while(v38 < k01.j) {
            int v39 = k01.h[v38];
            int v40 = arr_v1[v39];
            Object object1 = F0.i(k01.h(v39) & 0xFFFFF, object0);
            if(object1 == null || k01.j(v39) == null) {
                ++v38;
                continue;
            }
            zzlf zzlf0 = (zzlf)object1;
            zzle zzle0 = (zzle)k01.l(v39);
            throw null;
        }
        if(v2 == 0) {
            if(v3 != v1) {
                throw zzko.c();
            }
            return v3;
        }
        if(v3 > v1 || v4 != v2) {
            throw zzko.c();
        }
        return v3;
    }

    public static zzmo w(Object object0) {
        zzmo zzmo0 = ((zzke)object0).zzc;
        if(zzmo0 == zzmo.zzc()) {
            zzmo0 = zzmo.a();
            ((zzke)object0).zzc = zzmo0;
        }
        return zzmo0;
    }

    public static k0 x(r0 r00, c0 c00, z0 z00, U u0, g0 g00) {
        if(r00 instanceof r0) {
            return k0.y(r00, c00, z00, u0, g00);
        }
        r00.getClass();
        throw new ClassCastException();
    }

    public static k0 y(r0 r00, c0 c00, z0 z00, U u0, g0 g00) {
        Field field3;
        int v90;
        int v84;
        int v83;
        int v82;
        int v81;
        Object[] arr_object2;
        int v80;
        Field field1;
        int v78;
        int v77;
        Field field0;
        int v75;
        int v74;
        int v73;
        int v68;
        int v62;
        int v14;
        int v13;
        int v12;
        int v11;
        int v10;
        int v9;
        int v8;
        int[] arr_v;
        int v2;
        boolean z = r00.b() == 2;
        String s = r00.c();
        int v = s.length();
        if(s.charAt(0) >= 0xD800) {
            for(int v1 = 1; true; v1 = v2) {
                v2 = v1 + 1;
                if(s.charAt(v1) < 0xD800) {
                    break;
                }
            }
        }
        else {
            v2 = 1;
        }
        int v3 = v2 + 1;
        int v4 = s.charAt(v2);
        if(v4 >= 0xD800) {
            int v5 = v4 & 0x1FFF;
            int v6 = 13;
            int v7;
            while((v7 = s.charAt(v3)) >= 0xD800) {
                v5 |= (v7 & 0x1FFF) << v6;
                v6 += 13;
                ++v3;
            }
            v4 = v5 | v7 << v6;
            ++v3;
        }
        if(v4 == 0) {
            arr_v = k0.n;
            v8 = 0;
            v9 = 0;
            v10 = 0;
            v11 = 0;
            v12 = 0;
            v13 = 0;
            v14 = 0;
        }
        else {
            int v15 = v3 + 1;
            int v16 = s.charAt(v3);
            if(v16 >= 0xD800) {
                int v17 = v16 & 0x1FFF;
                int v18 = 13;
                int v19;
                while((v19 = s.charAt(v15)) >= 0xD800) {
                    v17 |= (v19 & 0x1FFF) << v18;
                    v18 += 13;
                    ++v15;
                }
                v16 = v17 | v19 << v18;
                ++v15;
            }
            int v20 = v15 + 1;
            int v21 = s.charAt(v15);
            if(v21 >= 0xD800) {
                int v22 = v21 & 0x1FFF;
                int v23 = 13;
                int v24;
                while((v24 = s.charAt(v20)) >= 0xD800) {
                    v22 |= (v24 & 0x1FFF) << v23;
                    v23 += 13;
                    ++v20;
                }
                v21 = v22 | v24 << v23;
                ++v20;
            }
            int v25 = v20 + 1;
            v9 = s.charAt(v20);
            if(v9 >= 0xD800) {
                int v26 = v9 & 0x1FFF;
                int v27 = 13;
                int v28;
                while((v28 = s.charAt(v25)) >= 0xD800) {
                    v26 |= (v28 & 0x1FFF) << v27;
                    v27 += 13;
                    ++v25;
                }
                v9 = v26 | v28 << v27;
                ++v25;
            }
            int v29 = v25 + 1;
            v10 = s.charAt(v25);
            if(v10 >= 0xD800) {
                int v30 = v10 & 0x1FFF;
                int v31 = 13;
                int v32;
                while((v32 = s.charAt(v29)) >= 0xD800) {
                    v30 |= (v32 & 0x1FFF) << v31;
                    v31 += 13;
                    ++v29;
                }
                v10 = v30 | v32 << v31;
                ++v29;
            }
            int v33 = v29 + 1;
            v11 = s.charAt(v29);
            if(v11 >= 0xD800) {
                int v34 = v11 & 0x1FFF;
                int v35 = 13;
                int v36;
                while((v36 = s.charAt(v33)) >= 0xD800) {
                    v34 |= (v36 & 0x1FFF) << v35;
                    v35 += 13;
                    ++v33;
                }
                v11 = v34 | v36 << v35;
                ++v33;
            }
            int v37 = v33 + 1;
            int v38 = s.charAt(v33);
            if(v38 >= 0xD800) {
                int v39 = v38 & 0x1FFF;
                int v40 = 13;
                int v41;
                while((v41 = s.charAt(v37)) >= 0xD800) {
                    v39 |= (v41 & 0x1FFF) << v40;
                    v40 += 13;
                    ++v37;
                }
                v38 = v39 | v41 << v40;
                ++v37;
            }
            int v42 = v37 + 1;
            int v43 = s.charAt(v37);
            if(v43 >= 0xD800) {
                int v44 = v43 & 0x1FFF;
                int v45 = 13;
                int v46;
                while((v46 = s.charAt(v42)) >= 0xD800) {
                    v44 |= (v46 & 0x1FFF) << v45;
                    v45 += 13;
                    ++v42;
                }
                v43 = v44 | v46 << v45;
                ++v42;
            }
            int v47 = v42 + 1;
            int v48 = s.charAt(v42);
            if(v48 >= 0xD800) {
                int v49 = v48 & 0x1FFF;
                int v50 = 13;
                int v51;
                while((v51 = s.charAt(v47)) >= 0xD800) {
                    v49 |= (v51 & 0x1FFF) << v50;
                    v50 += 13;
                    ++v47;
                }
                v48 = v49 | v51 << v50;
                ++v47;
            }
            arr_v = new int[v48 + v38 + v43];
            v14 = v16 * 2 + v21;
            v8 = v16;
            v3 = v47;
            v13 = v38;
            v12 = v48;
        }
        Unsafe unsafe0 = k0.o;
        Object[] arr_object = r00.d();
        Class class0 = r00.a().getClass();
        int[] arr_v1 = new int[v11 * 3];
        Object[] arr_object1 = new Object[v11 + v11];
        int v52 = v13 + v12;
        int v53 = v12;
        int v54 = v52;
        int v55 = 0;
        int v56 = 0;
        while(v3 < v) {
            int v57 = s.charAt(v3);
            if(v57 >= 0xD800) {
                int v58 = v57 & 0x1FFF;
                int v59 = v3 + 1;
                int v60 = 13;
                int v61;
                while((v61 = s.charAt(v59)) >= 0xD800) {
                    v58 |= (v61 & 0x1FFF) << v60;
                    v60 += 13;
                    ++v59;
                }
                v57 = v58 | v61 << v60;
                v62 = v59 + 1;
            }
            else {
                v62 = v3 + 1;
            }
            int v63 = s.charAt(v62);
            if(v63 >= 0xD800) {
                int v64 = v63 & 0x1FFF;
                int v65 = v62 + 1;
                int v66 = 13;
                int v67;
                while((v67 = s.charAt(v65)) >= 0xD800) {
                    v64 |= (v67 & 0x1FFF) << v66;
                    v66 += 13;
                    ++v65;
                }
                v63 = v64 | v67 << v66;
                v68 = v65 + 1;
            }
            else {
                v68 = v62 + 1;
            }
            if((v63 & 0x400) != 0) {
                arr_v[v56] = v55;
                ++v56;
            }
            if((v63 & 0xFF) >= 51) {
                int v69 = s.charAt(v68);
                if(v69 >= 0xD800) {
                    int v70 = v69 & 0x1FFF;
                    int v71 = v68 + 1;
                    int v72 = 13;
                    while(true) {
                        v73 = s.charAt(v71);
                        v74 = v12;
                        if(v73 < 0xD800) {
                            break;
                        }
                        v70 |= (v73 & 0x1FFF) << v72;
                        v72 += 13;
                        ++v71;
                        v12 = v74;
                    }
                    v69 = v70 | v73 << v72;
                    v75 = v71 + 1;
                }
                else {
                    v74 = v12;
                    v75 = v68 + 1;
                }
                switch((v63 & 0xFF) - 51) {
                    case 12: {
                        if(!z) {
                            arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v14];
                            ++v14;
                        }
                        break;
                    }
                    case 9: 
                    case 17: {
                        arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v14];
                        ++v14;
                    }
                }
                int v76 = v69 + v69;
                Object object0 = arr_object[v76];
                if(object0 instanceof Field) {
                    field0 = (Field)object0;
                }
                else {
                    field0 = k0.m(((String)object0), class0);
                    arr_object[v76] = field0;
                }
                v77 = v9;
                v78 = v10;
                int v79 = (int)unsafe0.objectFieldOffset(field0);
                Object object1 = arr_object[v76 + 1];
                if(object1 instanceof Field) {
                    field1 = (Field)object1;
                }
                else {
                    field1 = k0.m(((String)object1), class0);
                    arr_object[v76 + 1] = field1;
                }
                v80 = (int)unsafe0.objectFieldOffset(field1);
                arr_object2 = arr_object1;
                v81 = v75;
                v82 = v79;
                v83 = 0;
            }
            else {
                v77 = v9;
                v78 = v10;
                v74 = v12;
                Field field2 = k0.m(((String)arr_object[v14]), class0);
                switch(v63 & 0xFF) {
                    case 9: 
                    case 17: {
                        arr_object1[v55 / 3 + v55 / 3 + 1] = field2.getType();
                        v84 = v14 + 1;
                        break;
                    }
                    case 12: 
                    case 30: 
                    case 44: {
                        if(z) {
                            v84 = v14 + 1;
                        }
                        else {
                            arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v14 + 1];
                            v84 = v14 + 2;
                        }
                        break;
                    }
                    case 27: 
                    case 49: {
                        arr_object1[v55 / 3 + v55 / 3 + 1] = arr_object[v14 + 1];
                        v84 = v14 + 2;
                        break;
                    }
                    case 50: {
                        arr_v[v53] = v55;
                        int v85 = v55 / 3 + v55 / 3;
                        arr_object1[v85] = arr_object[v14 + 1];
                        if((v63 & 0x800) == 0) {
                            ++v53;
                            v84 = v14 + 2;
                        }
                        else {
                            arr_object1[v85 + 1] = arr_object[v14 + 2];
                            ++v53;
                            v84 = v14 + 3;
                        }
                        break;
                    }
                    default: {
                        v84 = v14 + 1;
                    }
                }
                v82 = (int)unsafe0.objectFieldOffset(field2);
                v14 = v84;
                if((v63 & 0x1000) != 0x1000 || (v63 & 0xFF) > 17) {
                    arr_object2 = arr_object1;
                    v81 = v68;
                    v83 = 0;
                    v80 = 0xFFFFF;
                }
                else {
                    int v86 = v68 + 1;
                    int v87 = s.charAt(v68);
                    if(v87 >= 0xD800) {
                        int v88 = v87 & 0x1FFF;
                        int v89 = 13;
                        while(true) {
                            v81 = v86 + 1;
                            v90 = s.charAt(v86);
                            if(v90 < 0xD800) {
                                break;
                            }
                            v88 |= (v90 & 0x1FFF) << v89;
                            v89 += 13;
                            v86 = v81;
                        }
                        v87 = v88 | v90 << v89;
                    }
                    else {
                        v81 = v86;
                    }
                    int v91 = v87 / 0x20 + v8 * 2;
                    Object object2 = arr_object[v91];
                    if(object2 instanceof Field) {
                        field3 = (Field)object2;
                    }
                    else {
                        field3 = k0.m(((String)object2), class0);
                        arr_object[v91] = field3;
                    }
                    arr_object2 = arr_object1;
                    v80 = (int)unsafe0.objectFieldOffset(field3);
                    v83 = v87 % 0x20;
                }
                if((v63 & 0xFF) >= 18 && (v63 & 0xFF) <= 49) {
                    arr_v[v54] = v82;
                    ++v54;
                }
            }
            arr_v1[v55] = v57;
            int v92 = v55 + 2;
            arr_v1[v55 + 1] = ((v63 & 0x100) == 0 ? 0 : 0x10000000) | ((v63 & 0x200) == 0 ? 0 : 0x20000000) | (v63 & 0xFF) << 20 | v82;
            v55 += 3;
            arr_v1[v92] = v83 << 20 | v80;
            v9 = v77;
            arr_object1 = arr_object2;
            v3 = v81;
            v10 = v78;
            v12 = v74;
        }
        return new k0(arr_v1, arr_object1, v9, v10, r00.a(), z, arr_v, v12, v52, c00, z00, u0, g00);
    }

    public final int z(Object object0) {
        int v9;
        Unsafe unsafe0 = k0.o;
        int v1 = 0;
        int v2 = 0;
        int v3 = 0xFFFFF;
        for(int v = 0; true; v += 3) {
            int[] arr_v = this.a;
            if(v >= arr_v.length) {
                break;
            }
            int v4 = this.h(v);
            int v5 = arr_v[v];
            int v6 = k0.g(v4);
            if(v6 <= 17) {
                int v7 = arr_v[v + 2];
                int v8 = v7 & 0xFFFFF;
                v9 = 1 << (v7 >>> 20);
                if(v8 != v3) {
                    v2 = unsafe0.getInt(object0, ((long)v8));
                    v3 = v8;
                }
            }
            else {
                v9 = 0;
            }
            long v10 = (long)(v4 & 0xFFFFF);
            switch(v6) {
                case 0: {
                    if((v2 & v9) != 0) {
                        v1 = u9.B(v5 << 3, 8, v1);
                    }
                    break;
                }
                case 1: {
                    if((v2 & v9) != 0) {
                        v1 = u9.B(v5 << 3, 4, v1);
                    }
                    break;
                }
                case 2: {
                    if((v9 & v2) != 0) {
                        v1 += zzjl.zzB(unsafe0.getLong(object0, v10)) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 3: {
                    if((v9 & v2) != 0) {
                        v1 += zzjl.zzB(unsafe0.getLong(object0, v10)) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 4: {
                    if((v9 & v2) != 0) {
                        v1 += zzjl.zzv(unsafe0.getInt(object0, v10)) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 5: {
                    if((v2 & v9) != 0) {
                        v1 = u9.B(v5 << 3, 8, v1);
                    }
                    break;
                }
                case 6: {
                    if((v2 & v9) != 0) {
                        v1 = u9.B(v5 << 3, 4, v1);
                    }
                    break;
                }
                case 7: {
                    if((v2 & v9) != 0) {
                        v1 = u9.B(v5 << 3, 1, v1);
                    }
                    break;
                }
                case 8: {
                    if((v9 & v2) != 0) {
                        Object object1 = unsafe0.getObject(object0, v10);
                        if(object1 instanceof zzjd) {
                            int v11 = ((zzjd)object1).zzd();
                            v1 = u9.C(v11, v11, zzjl.zzA(v5 << 3), v1);
                        }
                        else {
                            v1 += zzjl.zzy(((String)object1)) + zzjl.zzA(v5 << 3);
                        }
                    }
                    break;
                }
                case 9: {
                    if((v9 & v2) != 0) {
                        v1 += t0.K(v5, unsafe0.getObject(object0, v10), this.k(v));
                    }
                    break;
                }
                case 10: {
                    if((v9 & v2) != 0) {
                        int v12 = ((zzjd)unsafe0.getObject(object0, v10)).zzd();
                        v1 = u9.C(v12, v12, zzjl.zzA(v5 << 3), v1);
                    }
                    break;
                }
                case 11: {
                    if((v9 & v2) != 0) {
                        v1 = u9.B(unsafe0.getInt(object0, v10), zzjl.zzA(v5 << 3), v1);
                    }
                    break;
                }
                case 12: {
                    if((v9 & v2) != 0) {
                        v1 += zzjl.zzv(unsafe0.getInt(object0, v10)) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 13: {
                    if((v2 & v9) != 0) {
                        v1 = u9.B(v5 << 3, 4, v1);
                    }
                    break;
                }
                case 14: {
                    if((v2 & v9) != 0) {
                        v1 = u9.B(v5 << 3, 8, v1);
                    }
                    break;
                }
                case 15: {
                    if((v9 & v2) != 0) {
                        int v13 = unsafe0.getInt(object0, v10);
                        v1 = u9.B(v13 >> 0x1F ^ v13 + v13, zzjl.zzA(v5 << 3), v1);
                    }
                    break;
                }
                case 16: {
                    if((v9 & v2) != 0) {
                        long v14 = unsafe0.getLong(object0, v10);
                        v1 += zzjl.zzB(v14 >> 0x3F ^ v14 + v14) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 17: {
                    if((v9 & v2) != 0) {
                        v1 += zzjl.a(v5, ((zzll)unsafe0.getObject(object0, v10)), this.k(v));
                    }
                    break;
                }
                case 18: {
                    v1 += t0.D(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 19: {
                    v1 += t0.B(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 20: {
                    v1 += t0.I(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 21: {
                    v1 += t0.T(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 22: {
                    v1 += t0.G(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 23: {
                    v1 += t0.D(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 24: {
                    v1 += t0.B(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 25: {
                    v1 += t0.v(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 26: {
                    v1 += t0.Q(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 27: {
                    v1 += t0.L(v5, ((List)unsafe0.getObject(object0, v10)), this.k(v));
                    break;
                }
                case 28: {
                    v1 += t0.y(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 29: {
                    v1 += t0.R(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 30: {
                    v1 += t0.z(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 0x1F: {
                    v1 += t0.B(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 0x20: {
                    v1 += t0.D(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 33: {
                    v1 += t0.M(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 34: {
                    v1 += t0.O(v5, ((List)unsafe0.getObject(object0, v10)));
                    break;
                }
                case 35: {
                    int v15 = t0.E(((List)unsafe0.getObject(object0, v10)));
                    if(v15 > 0) {
                        v1 = u9.C(v15, zzjl.zzz(v5), v15, v1);
                    }
                    break;
                }
                case 36: {
                    int v16 = t0.C(((List)unsafe0.getObject(object0, v10)));
                    if(v16 > 0) {
                        v1 = u9.C(v16, zzjl.zzz(v5), v16, v1);
                    }
                    break;
                }
                case 37: {
                    int v17 = t0.J(((List)unsafe0.getObject(object0, v10)));
                    if(v17 > 0) {
                        v1 = u9.C(v17, zzjl.zzz(v5), v17, v1);
                    }
                    break;
                }
                case 38: {
                    int v18 = t0.U(((List)unsafe0.getObject(object0, v10)));
                    if(v18 > 0) {
                        v1 = u9.C(v18, zzjl.zzz(v5), v18, v1);
                    }
                    break;
                }
                case 39: {
                    int v19 = t0.H(((List)unsafe0.getObject(object0, v10)));
                    if(v19 > 0) {
                        v1 = u9.C(v19, zzjl.zzz(v5), v19, v1);
                    }
                    break;
                }
                case 40: {
                    int v20 = t0.E(((List)unsafe0.getObject(object0, v10)));
                    if(v20 > 0) {
                        v1 = u9.C(v20, zzjl.zzz(v5), v20, v1);
                    }
                    break;
                }
                case 41: {
                    int v21 = t0.C(((List)unsafe0.getObject(object0, v10)));
                    if(v21 > 0) {
                        v1 = u9.C(v21, zzjl.zzz(v5), v21, v1);
                    }
                    break;
                }
                case 42: {
                    int v22 = t0.x(((List)unsafe0.getObject(object0, v10)));
                    if(v22 > 0) {
                        v1 = u9.C(v22, zzjl.zzz(v5), v22, v1);
                    }
                    break;
                }
                case 43: {
                    int v23 = t0.S(((List)unsafe0.getObject(object0, v10)));
                    if(v23 > 0) {
                        v1 = u9.C(v23, zzjl.zzz(v5), v23, v1);
                    }
                    break;
                }
                case 44: {
                    int v24 = t0.A(((List)unsafe0.getObject(object0, v10)));
                    if(v24 > 0) {
                        v1 = u9.C(v24, zzjl.zzz(v5), v24, v1);
                    }
                    break;
                }
                case 45: {
                    int v25 = t0.C(((List)unsafe0.getObject(object0, v10)));
                    if(v25 > 0) {
                        v1 = u9.C(v25, zzjl.zzz(v5), v25, v1);
                    }
                    break;
                }
                case 46: {
                    int v26 = t0.E(((List)unsafe0.getObject(object0, v10)));
                    if(v26 > 0) {
                        v1 = u9.C(v26, zzjl.zzz(v5), v26, v1);
                    }
                    break;
                }
                case 0x2F: {
                    int v27 = t0.N(((List)unsafe0.getObject(object0, v10)));
                    if(v27 > 0) {
                        v1 = u9.C(v27, zzjl.zzz(v5), v27, v1);
                    }
                    break;
                }
                case 0x30: {
                    int v28 = t0.P(((List)unsafe0.getObject(object0, v10)));
                    if(v28 > 0) {
                        v1 = u9.C(v28, zzjl.zzz(v5), v28, v1);
                    }
                    break;
                }
                case 49: {
                    v1 += t0.F(v5, ((List)unsafe0.getObject(object0, v10)), this.k(v));
                    break;
                }
                case 50: {
                    g0.a(unsafe0.getObject(object0, v10), this.l(v));
                    break;
                }
                case 51: {
                    if(this.t(v5, v, object0)) {
                        v1 = u9.B(v5 << 3, 8, v1);
                    }
                    break;
                }
                case 52: {
                    if(this.t(v5, v, object0)) {
                        v1 = u9.B(v5 << 3, 4, v1);
                    }
                    break;
                }
                case 53: {
                    if(this.t(v5, v, object0)) {
                        v1 += zzjl.zzB(k0.i(v10, object0)) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 54: {
                    if(this.t(v5, v, object0)) {
                        v1 += zzjl.zzB(k0.i(v10, object0)) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 55: {
                    if(this.t(v5, v, object0)) {
                        v1 += zzjl.zzv(k0.B(v10, object0)) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 56: {
                    if(this.t(v5, v, object0)) {
                        v1 = u9.B(v5 << 3, 8, v1);
                    }
                    break;
                }
                case 57: {
                    if(this.t(v5, v, object0)) {
                        v1 = u9.B(v5 << 3, 4, v1);
                    }
                    break;
                }
                case 58: {
                    if(this.t(v5, v, object0)) {
                        v1 = u9.B(v5 << 3, 1, v1);
                    }
                    break;
                }
                case 59: {
                    if(this.t(v5, v, object0)) {
                        Object object2 = unsafe0.getObject(object0, v10);
                        if(object2 instanceof zzjd) {
                            int v29 = ((zzjd)object2).zzd();
                            v1 = u9.C(v29, v29, zzjl.zzA(v5 << 3), v1);
                        }
                        else {
                            v1 += zzjl.zzy(((String)object2)) + zzjl.zzA(v5 << 3);
                        }
                    }
                    break;
                }
                case 60: {
                    if(this.t(v5, v, object0)) {
                        v1 += t0.K(v5, unsafe0.getObject(object0, v10), this.k(v));
                    }
                    break;
                }
                case 61: {
                    if(this.t(v5, v, object0)) {
                        int v30 = ((zzjd)unsafe0.getObject(object0, v10)).zzd();
                        v1 = u9.C(v30, v30, zzjl.zzA(v5 << 3), v1);
                    }
                    break;
                }
                case 62: {
                    if(this.t(v5, v, object0)) {
                        v1 = u9.B(k0.B(v10, object0), zzjl.zzA(v5 << 3), v1);
                    }
                    break;
                }
                case 0x3F: {
                    if(this.t(v5, v, object0)) {
                        v1 += zzjl.zzv(k0.B(v10, object0)) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 0x40: {
                    if(this.t(v5, v, object0)) {
                        v1 = u9.B(v5 << 3, 4, v1);
                    }
                    break;
                }
                case 65: {
                    if(this.t(v5, v, object0)) {
                        v1 = u9.B(v5 << 3, 8, v1);
                    }
                    break;
                }
                case 66: {
                    if(this.t(v5, v, object0)) {
                        int v31 = k0.B(v10, object0);
                        v1 = u9.B(v31 >> 0x1F ^ v31 + v31, zzjl.zzA(v5 << 3), v1);
                    }
                    break;
                }
                case 67: {
                    if(this.t(v5, v, object0)) {
                        long v32 = k0.i(v10, object0);
                        v1 += zzjl.zzB(v32 >> 0x3F ^ v32 + v32) + zzjl.zzA(v5 << 3);
                    }
                    break;
                }
                case 68: {
                    if(this.t(v5, v, object0)) {
                        v1 += zzjl.a(v5, ((zzll)unsafe0.getObject(object0, v10)), this.k(v));
                    }
                }
            }
        }
        this.l.getClass();
        int v33 = z0.a(z0.b(object0));
        if(!this.f) {
            return v33 + v1;
        }
        this.m.getClass();
        U.a(object0);
        throw null;
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.measurement.s0
    public final int zza(Object object0) {
        return this.g ? this.A(object0) : this.z(object0);
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final Object zze() {
        return ((zzke)this.e).i(4);
    }

    @Override  // com.google.android.gms.internal.measurement.s0
    public final void zzf(Object object0) {
        int v1;
        int[] arr_v;
        for(int v = this.i; true; ++v) {
            arr_v = this.h;
            v1 = this.j;
            if(v >= v1) {
                break;
            }
            long v2 = (long)(this.h(arr_v[v]) & 0xFFFFF);
            Object object1 = F0.c.m(v2, object0);
            if(object1 != null) {
                ((zzlf)object1).zzc();
                F0.o(v2, object0, object1);
            }
        }
        while(v1 < arr_v.length) {
            this.k.a(((long)arr_v[v1]), object0);
            ++v1;
        }
        this.l.getClass();
        ((zzke)object0).zzc.zzf();
        if(!this.f) {
            return;
        }
        this.m.getClass();
        zzkb zzkb0 = (zzkb)object0;
        throw null;
    }
}

