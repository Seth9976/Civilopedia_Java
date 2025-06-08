package o3;

import I3.m;
import J2.j;
import M3.A;
import M3.d;
import M3.w;
import O3.k;
import O3.l;
import Y3.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import l3.g;
import q3.Q;

public final class e implements m {
    public static final e b;
    public static final e c;
    public static final e d;

    static {
        e.b = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        e.c = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
        e.d = new e();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // I3.m
    public w a(Q q0, String s, A a0, A a1) {
        j.f(s, "flexibleId");
        j.f(a0, "lowerBound");
        j.f(a1, "upperBound");
        if(!s.equals("kotlin.jvm.PlatformType")) {
            return l.c(k.u, new String[]{s, a0.toString(), a1.toString()});
        }
        return q0.l(t3.k.g) ? new g(a0, a1) : d.j(a0, a1);
    }

    public static String[] b(String[] arr_s) {
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            arrayList0.add("<init>(" + arr_s[v] + ")V");
        }
        return (String[])arrayList0.toArray(new String[0]);
    }

    public static o3.j c(String s) {
        D3.d d0;
        j.f(s, "representation");
        int v = s.charAt(0);
        D3.d[] arr_d = D3.d.values();
        for(int v1 = 0; true; ++v1) {
            d0 = null;
            if(v1 >= arr_d.length) {
                break;
            }
            D3.d d1 = arr_d[v1];
            if(d1.c().charAt(0) == v) {
                d0 = d1;
                break;
            }
        }
        if(d0 != null) {
            return new i(d0);
        }
        switch(v) {
            case 76: {
                if(s.length() > 0) {
                    s.charAt(n.v0(s));
                }
                break;
            }
            case 86: {
                return new i(null);
            }
            case 91: {
                String s1 = s.substring(1);
                j.e(s1, "substring(...)");
                return new o3.g(e.c(s1));
            }
        }
        String s2 = s.substring(1, s.length() - 1);
        j.e(s2, "substring(...)");
        return new h(s2);
    }

    public static h d(String s) {
        j.f(s, "internalName");
        return new h(s);
    }

    public static LinkedHashSet e(String s, String[] arr_s) {
        j.f(s, "internalName");
        j.f(arr_s, "signatures");
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        for(int v = 0; v < arr_s.length; ++v) {
            linkedHashSet0.add(s + '.' + arr_s[v]);
        }
        return linkedHashSet0;
    }

    public static LinkedHashSet f(String s, String[] arr_s) {
        j.f(arr_s, "signatures");
        return e.e(("java/lang/" + s), ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    public static LinkedHashSet g(String s, String[] arr_s) {
        return e.e(("java/util/" + s), ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    public static String h(o3.j j0) {
        j.f(j0, "type");
        if(j0 instanceof o3.g) {
            return "[" + e.h(((o3.g)j0).i);
        }
        if(j0 instanceof i) {
            D3.d d0 = ((i)j0).i;
            if(d0 != null) {
                String s = d0.c();
                return s == null ? "V" : s;
            }
            return "V";
        }
        if(!(j0 instanceof h)) {
            throw new NoWhenBranchMatchedException();
        }
        return "L" + ((h)j0).i + ';';
    }
}

