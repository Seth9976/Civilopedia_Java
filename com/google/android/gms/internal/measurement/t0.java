package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.u9;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class t0 {
    public static final Class a;
    public static final z0 b;
    public static final z0 c;
    public static final z0 d;

    static {
        Class class0 = null;
        try {
            class0 = Class.forName("com.google.protobuf.GeneratedMessage");
        }
        catch(Throwable unused_ex) {
        }
        t0.a = class0;
        t0.b = t0.w(false);
        t0.c = t0.w(true);
        t0.d = new z0();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static int A(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof Z) {
            v2 = 0;
            while(v1 < v) {
                ((Z)list0).h(v1);
                v2 += zzjl.zzv(((Z)list0).j[v1]);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjl.zzv(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int B(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : (zzjl.zzA(v << 3) + 4) * v1;
    }

    public static int C(List list0) {
        return list0.size() * 4;
    }

    public static int D(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : (zzjl.zzA(v << 3) + 8) * v1;
    }

    public static int E(List list0) {
        return list0.size() * 8;
    }

    public static int F(int v, List list0, s0 s00) {
        int v1 = list0.size();
        if(v1 != 0) {
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                v3 += zzjl.a(v, ((zzll)list0.get(v2)), s00);
            }
            return v3;
        }
        return 0;
    }

    public static int G(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjl.zzz(v) * v1 + t0.H(list0);
    }

    public static int H(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof Z) {
            v2 = 0;
            while(v1 < v) {
                ((Z)list0).h(v1);
                v2 += zzjl.zzv(((Z)list0).j[v1]);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjl.zzv(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int I(int v, List list0) {
        return list0.size() == 0 ? 0 : zzjl.zzz(v) * list0.size() + t0.J(list0);
    }

    public static int J(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof d0) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjl.zzB(((d0)list0).zza(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjl.zzB(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int K(int v, Object object0, s0 s00) {
        if(object0 instanceof zzkr) {
            int v1 = ((zzkr)object0).zza();
            return u9.B(v1, v1, zzjl.zzA(v << 3));
        }
        int v2 = zzjl.zzA(v << 3);
        int v3 = ((zzin)(((zzll)object0))).a();
        if(v3 == -1) {
            v3 = s00.zza(((zzin)(((zzll)object0))));
            ((zzin)(((zzll)object0))).c(v3);
        }
        return u9.B(v3, v3, v2);
    }

    public static int L(int v, List list0, s0 s00) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzjl.zzz(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            if(object0 instanceof zzkr) {
                v3 = zzjl.zzw(((zzkr)object0)) + v3;
            }
            else {
                int v4 = ((zzin)(((zzll)object0))).a();
                if(v4 == -1) {
                    v4 = s00.zza(((zzin)(((zzll)object0))));
                    ((zzin)(((zzll)object0))).c(v4);
                }
                v3 = u9.B(v4, v4, v3);
            }
        }
        return v3;
    }

    public static int M(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjl.zzz(v) * v1 + t0.N(list0);
    }

    public static int N(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof Z) {
            v2 = 0;
            while(v1 < v) {
                ((Z)list0).h(v1);
                int v3 = ((Z)list0).j[v1];
                v2 += zzjl.zzA(v3 >> 0x1F ^ v3 + v3);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            int v4 = (int)(((Integer)list0.get(v1)));
            v2 += zzjl.zzA(v4 >> 0x1F ^ v4 + v4);
            ++v1;
        }
        return v2;
    }

    public static int O(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjl.zzz(v) * v1 + t0.P(list0);
    }

    public static int P(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof d0) {
            v2 = 0;
            while(v1 < v) {
                long v3 = ((d0)list0).zza(v1);
                v2 += zzjl.zzB(v3 >> 0x3F ^ v3 + v3);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            long v4 = (long)(((Long)list0.get(v1)));
            v2 += zzjl.zzB(v4 >> 0x3F ^ v4 + v4);
            ++v1;
        }
        return v2;
    }

    public static int Q(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzjl.zzz(v) * v1;
        if(list0 instanceof zzkt) {
            while(v2 < v1) {
                Object object0 = ((zzkt)list0).zzf(v2);
                v3 = (object0 instanceof zzjd ? zzjl.zzt(((zzjd)object0)) : zzjl.zzy(((String)object0))) + v3;
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 = (object1 instanceof zzjd ? zzjl.zzt(((zzjd)object1)) : zzjl.zzy(((String)object1))) + v3;
            ++v2;
        }
        return v3;
    }

    public static int R(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjl.zzz(v) * v1 + t0.S(list0);
    }

    public static int S(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof Z) {
            v2 = 0;
            while(v1 < v) {
                ((Z)list0).h(v1);
                v2 += zzjl.zzA(((Z)list0).j[v1]);
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjl.zzA(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int T(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjl.zzz(v) * v1 + t0.U(list0);
    }

    public static int U(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof d0) {
            v2 = 0;
            while(v1 < v) {
                v2 += zzjl.zzB(((d0)list0).zza(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += zzjl.zzB(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static Object a(int v, zzkl zzkl0, zzki zzki0, zzmo zzmo0, z0 z00) {
        if(zzki0 == null) {
            return zzmo0;
        }
        if(zzkl0 instanceof RandomAccess) {
            int v1 = zzkl0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)zzkl0.get(v2);
                int v4 = (int)integer0;
                if(zzki0.zza(v4)) {
                    if(v2 != v3) {
                        zzkl0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    if(zzmo0 == null) {
                        z00.getClass();
                        zzmo0 = zzmo.a();
                    }
                    z00.getClass();
                    zzmo0.b(v << 3, ((long)v4));
                }
            }
            if(v3 != v1) {
                zzkl0.subList(v3, v1).clear();
                return zzmo0;
            }
        }
        else {
            Iterator iterator0 = zzkl0.iterator();
            while(iterator0.hasNext()) {
                Object object0 = iterator0.next();
                int v5 = (int)(((Integer)object0));
                if(!zzki0.zza(v5)) {
                    if(zzmo0 == null) {
                        z00.getClass();
                        zzmo0 = zzmo.a();
                    }
                    z00.getClass();
                    zzmo0.b(v << 3, ((long)v5));
                    iterator0.remove();
                }
            }
        }
        return zzmo0;
    }

    public static void b(z0 z00, zzke zzke0, zzke zzke1) {
        z00.getClass();
        zzmo zzmo0 = zzke0.zzc;
        zzmo zzmo1 = zzke1.zzc;
        if(!zzmo1.equals(zzmo.zzc())) {
            int v = zzmo0.a + zzmo1.a;
            int[] arr_v = Arrays.copyOf(zzmo0.b, v);
            System.arraycopy(zzmo1.b, 0, arr_v, zzmo0.a, zzmo1.a);
            Object[] arr_object = Arrays.copyOf(zzmo0.c, v);
            System.arraycopy(zzmo1.c, 0, arr_object, zzmo0.a, zzmo1.a);
            zzmo0 = new zzmo(v, arr_v, arr_object, true);
        }
        zzke0.zzc = zzmo0;
    }

    public static void c(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    ((Boolean)list0.get(v2)).getClass();
                    ++v3;
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzb(((byte)((Boolean)list0.get(v1)).booleanValue()));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzd(v, ((Boolean)list0.get(v1)).booleanValue());
                ++v1;
            }
        }
    }

    public static void d(int v, List list0, I0 i00) {
        if(list0 != null && !list0.isEmpty()) {
            ((S)i00).getClass();
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                zzjd zzjd0 = (zzjd)list0.get(v1);
                ((S)i00).a.zze(v, zzjd0);
            }
        }
    }

    public static void e(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    ((Double)list0.get(v2)).getClass();
                    v3 += 8;
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzi(Double.doubleToRawLongBits(((double)(((Double)list0.get(v1))))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzh(v, Double.doubleToRawLongBits(((double)(((Double)list0.get(v1))))));
                ++v1;
            }
        }
    }

    public static void f(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    v3 += zzjl.zzv(((int)(((Integer)list0.get(v2)))));
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzk(((int)(((Integer)list0.get(v1)))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzj(v, ((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
        }
    }

    public static void g(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    ((Integer)list0.get(v2)).getClass();
                    v3 += 4;
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzg(((int)(((Integer)list0.get(v1)))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzf(v, ((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
        }
    }

    public static void h(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    ((Long)list0.get(v2)).getClass();
                    v3 += 8;
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzi(((long)(((Long)list0.get(v1)))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzh(v, ((long)(((Long)list0.get(v1)))));
                ++v1;
            }
        }
    }

    public static void i(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    ((Float)list0.get(v2)).getClass();
                    v3 += 4;
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzg(Float.floatToRawIntBits(((float)(((Float)list0.get(v1))))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzf(v, Float.floatToRawIntBits(((float)(((Float)list0.get(v1))))));
                ++v1;
            }
        }
    }

    public static void j(int v, List list0, I0 i00, s0 s00) {
        if(list0 != null && !list0.isEmpty()) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ((S)i00).l(v, list0.get(v1), s00);
            }
        }
    }

    public static void k(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    v3 += zzjl.zzv(((int)(((Integer)list0.get(v2)))));
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzk(((int)(((Integer)list0.get(v1)))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzj(v, ((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
        }
    }

    public static void l(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    v3 += zzjl.zzB(((long)(((Long)list0.get(v2)))));
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzs(((long)(((Long)list0.get(v1)))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzr(v, ((long)(((Long)list0.get(v1)))));
                ++v1;
            }
        }
    }

    public static void m(int v, List list0, I0 i00, s0 s00) {
        if(list0 != null && !list0.isEmpty()) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                ((S)i00).o(v, list0.get(v1), s00);
            }
        }
    }

    public static void n(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    ((Integer)list0.get(v2)).getClass();
                    v3 += 4;
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzg(((int)(((Integer)list0.get(v1)))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzf(v, ((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
        }
    }

    public static void o(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    ((Long)list0.get(v2)).getClass();
                    v3 += 8;
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzi(((long)(((Long)list0.get(v1)))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzh(v, ((long)(((Long)list0.get(v1)))));
                ++v1;
            }
        }
    }

    public static void p(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    int v4 = (int)(((Integer)list0.get(v2)));
                    v3 += zzjl.zzA(v4 >> 0x1F ^ v4 + v4);
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    int v5 = (int)(((Integer)list0.get(v1)));
                    zzjl0.zzq(v5 >> 0x1F ^ v5 + v5);
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                int v6 = (int)(((Integer)list0.get(v1)));
                zzjl0.zzp(v, v6 >> 0x1F ^ v6 + v6);
                ++v1;
            }
        }
    }

    public static void q(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    long v4 = (long)(((Long)list0.get(v2)));
                    v3 += zzjl.zzB(v4 >> 0x3F ^ v4 + v4);
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    long v5 = (long)(((Long)list0.get(v1)));
                    zzjl0.zzs(v5 >> 0x3F ^ v5 + v5);
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                long v6 = (long)(((Long)list0.get(v1)));
                zzjl0.zzr(v, v6 >> 0x3F ^ v6 + v6);
                ++v1;
            }
        }
    }

    public static void r(int v, List list0, I0 i00) {
        if(list0 != null && !list0.isEmpty()) {
            ((S)i00).getClass();
            int v1 = 0;
            zzjl zzjl0 = ((S)i00).a;
            if(list0 instanceof zzkt) {
                while(v1 < list0.size()) {
                    Object object0 = ((zzkt)list0).zzf(v1);
                    if(object0 instanceof String) {
                        zzjl0.zzm(v, ((String)object0));
                    }
                    else {
                        zzjl0.zze(v, ((zzjd)object0));
                    }
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzm(v, ((String)list0.get(v1)));
                ++v1;
            }
        }
    }

    public static void s(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    v3 += zzjl.zzA(((int)(((Integer)list0.get(v2)))));
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzq(((int)(((Integer)list0.get(v1)))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzp(v, ((int)(((Integer)list0.get(v1)))));
                ++v1;
            }
        }
    }

    public static void t(int v, List list0, I0 i00, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            zzjl zzjl0 = ((S)i00).a;
            int v1 = 0;
            if(z) {
                zzjl0.zzo(v, 2);
                int v3 = 0;
                for(int v2 = 0; v2 < list0.size(); ++v2) {
                    v3 += zzjl.zzB(((long)(((Long)list0.get(v2)))));
                }
                zzjl0.zzq(v3);
                while(v1 < list0.size()) {
                    zzjl0.zzs(((long)(((Long)list0.get(v1)))));
                    ++v1;
                }
                return;
            }
            while(v1 < list0.size()) {
                zzjl0.zzr(v, ((long)(((Long)list0.get(v1)))));
                ++v1;
            }
        }
    }

    // 去混淆评级： 低(20)
    public static boolean u(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static int v(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : (zzjl.zzA(v << 3) + 1) * v1;
    }

    public static z0 w(boolean z) {
        Class class0 = null;
        try {
            class0 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
        }
        if(class0 == null) {
            return null;
        }
        try {
            return (z0)class0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static int x(List list0) {
        return list0.size();
    }

    public static int y(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = zzjl.zzz(v) * v1;
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += zzjl.zzt(((zzjd)list0.get(v2)));
        }
        return v3;
    }

    public static int z(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : zzjl.zzz(v) * v1 + t0.A(list0);
    }
}

