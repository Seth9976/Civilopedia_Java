package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzkl;
import com.google.android.gms.internal.play_billing.H0;
import com.google.android.gms.internal.play_billing.zzgr;
import com.google.android.gms.internal.play_billing.zzho;
import com.google.android.gms.measurement.internal.zzge;
import java.util.List;

public abstract class u9 {
    public static void A(StringBuilder stringBuilder0, boolean z, String s, boolean z1, String s1) {
        stringBuilder0.append(z);
        stringBuilder0.append(s);
        stringBuilder0.append(z1);
        stringBuilder0.append(s1);
    }

    public static int B(int v, int v1, int v2) {
        return zzjl.zzA(v) + v1 + v2;
    }

    public static int C(int v, int v1, int v2, int v3) {
        return zzjl.zzA(v) + v1 + v2 + v3;
    }

    public static int D(int v, int v1, int v2) {
        return zzgr.zzz(v) + v1 + v2;
    }

    public static int a(int v, int v1, int v2) {
        return zzgjx.zzE(v) + v1 + v2;
    }

    public static int b(int v, int v1, int v2, int v3) {
        return zzgjx.zzE(v) + v1 + v2 + v3;
    }

    public static Object c(zzbl zzbl0, int v, List list0, int v1) {
        zzh.zzh(zzbl0.name(), v, list0);
        return list0.get(v1);
    }

    public static String d(Integer integer0, String s, String s1, String s2, StringBuilder stringBuilder0) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(integer0);
        stringBuilder0.append(s2);
        return stringBuilder0.toString();
    }

    public static String e(StringBuilder stringBuilder0, int v, String s, String s1, String s2) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        return stringBuilder0.toString();
    }

    public static String f(StringBuilder stringBuilder0, Integer integer0, String s) {
        stringBuilder0.append(integer0);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static String g(StringBuilder stringBuilder0, boolean z, String s) {
        stringBuilder0.append(z);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static StringBuilder h(String s, Integer integer0, String s1, String s2, String s3) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(integer0);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        stringBuilder0.append(s3);
        return stringBuilder0;
    }

    public static StringBuilder i(String s, String s1, String s2, Integer integer0, String s3) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        stringBuilder0.append(integer0);
        stringBuilder0.append(s3);
        return stringBuilder0;
    }

    public static StringBuilder j(String s, String s1, boolean z, String s2, String s3) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        stringBuilder0.append(z);
        stringBuilder0.append(s3);
        return stringBuilder0;
    }

    public static void k(zzgkz zzgkz0) {
        if(zzgkz0 != null) {
            throw new ClassCastException();
        }
    }

    public static void l(zzkl zzkl0) {
        if(zzkl0 != null) {
            throw new ClassCastException();
        }
    }

    public static void m(zzho zzho0) {
        if(zzho0 != null) {
            throw new ClassCastException();
        }
    }

    public static void n(H0 h00) {
        if(h00 != null) {
            throw new ClassCastException();
        }
    }

    public static void o(zzge zzge0, String s) {
        zzge0.zzay().zzd().zza(s);
    }

    public static void p(Integer integer0, String s, String s1, String s2, StringBuilder stringBuilder0) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(integer0);
        stringBuilder0.append(s2);
    }

    public static void q(Object object0) {
        if(object0 != null) {
            throw new ClassCastException();
        }
    }

    public static void r(StringBuilder stringBuilder0, int v, String s, boolean z, String s1) {
        stringBuilder0.append(v);
        stringBuilder0.append(s);
        stringBuilder0.append(z);
        stringBuilder0.append(s1);
    }

    public static void s(StringBuilder stringBuilder0, Boolean boolean0, String s, Boolean boolean1, String s1) {
        stringBuilder0.append(boolean0);
        stringBuilder0.append(s);
        stringBuilder0.append(boolean1);
        stringBuilder0.append(s1);
    }

    public static void t(StringBuilder stringBuilder0, Boolean boolean0, String s, Integer integer0, String s1) {
        stringBuilder0.append(boolean0);
        stringBuilder0.append(s);
        stringBuilder0.append(integer0);
        stringBuilder0.append(s1);
    }

    public static void u(StringBuilder stringBuilder0, Double double0, String s, Double double1, String s1) {
        stringBuilder0.append(double0);
        stringBuilder0.append(s);
        stringBuilder0.append(double1);
        stringBuilder0.append(s1);
    }

    public static void v(StringBuilder stringBuilder0, Integer integer0, String s, Boolean boolean0, String s1) {
        stringBuilder0.append(integer0);
        stringBuilder0.append(s);
        stringBuilder0.append(boolean0);
        stringBuilder0.append(s1);
    }

    public static void w(StringBuilder stringBuilder0, Integer integer0, String s, Integer integer1, String s1) {
        stringBuilder0.append(integer0);
        stringBuilder0.append(s);
        stringBuilder0.append(integer1);
        stringBuilder0.append(s1);
    }

    public static void x(StringBuilder stringBuilder0, String s, String s1, boolean z, String s2) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(z);
        stringBuilder0.append(s2);
    }

    public static void y(StringBuilder stringBuilder0, boolean z, String s, int v, String s1) {
        stringBuilder0.append(z);
        stringBuilder0.append(s);
        stringBuilder0.append(v);
        stringBuilder0.append(s1);
    }

    public static void z(StringBuilder stringBuilder0, boolean z, String s, String s1, String s2) {
        stringBuilder0.append(z);
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
    }
}

