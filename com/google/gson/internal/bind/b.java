package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.n;
import com.google.gson.o;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public abstract class b {
    public static final n A;
    public static final o B;
    public static final o C;
    public static final o a;
    public static final o b;
    public static final n c;
    public static final o d;
    public static final o e;
    public static final o f;
    public static final o g;
    public static final o h;
    public static final o i;
    public static final o j;
    public static final n k;
    public static final o l;
    public static final o m;
    public static final n n;
    public static final n o;
    public static final o p;
    public static final o q;
    public static final o r;
    public static final o s;
    public static final o t;
    public static final o u;
    public static final o v;
    public static final o w;
    public static final o x;
    public static final o y;
    public static final o z;

    static {
        n n0 = new TypeAdapters.1().a();
        b.a = new TypeAdapters.32(Class.class, n0);
        n n1 = new TypeAdapters.2().a();
        b.b = new TypeAdapters.32(BitSet.class, n1);
        TypeAdapters.3 typeAdapters$30 = new TypeAdapters.3();
        b.c = new TypeAdapters.4();
        b.d = new TypeAdapters.33(Boolean.TYPE, Boolean.class, typeAdapters$30);
        TypeAdapters.5 typeAdapters$50 = new TypeAdapters.5();
        b.e = new TypeAdapters.33(Byte.TYPE, Byte.class, typeAdapters$50);
        TypeAdapters.6 typeAdapters$60 = new TypeAdapters.6();
        b.f = new TypeAdapters.33(Short.TYPE, Short.class, typeAdapters$60);
        TypeAdapters.7 typeAdapters$70 = new TypeAdapters.7();
        b.g = new TypeAdapters.33(Integer.TYPE, Integer.class, typeAdapters$70);
        n n2 = new TypeAdapters.8().a();
        b.h = new TypeAdapters.32(AtomicInteger.class, n2);
        n n3 = new TypeAdapters.9().a();
        b.i = new TypeAdapters.32(AtomicBoolean.class, n3);
        n n4 = new TypeAdapters.10().a();
        b.j = new TypeAdapters.32(AtomicIntegerArray.class, n4);
        b.k = new TypeAdapters.11();
        new TypeAdapters.12();
        new TypeAdapters.13();
        TypeAdapters.14 typeAdapters$140 = new TypeAdapters.14();
        b.l = new TypeAdapters.32(Number.class, typeAdapters$140);
        TypeAdapters.15 typeAdapters$150 = new TypeAdapters.15();
        b.m = new TypeAdapters.33(Character.TYPE, Character.class, typeAdapters$150);
        TypeAdapters.16 typeAdapters$160 = new TypeAdapters.16();
        b.n = new TypeAdapters.17();
        b.o = new TypeAdapters.18();
        b.p = new TypeAdapters.32(String.class, typeAdapters$160);
        TypeAdapters.19 typeAdapters$190 = new TypeAdapters.19();
        b.q = new TypeAdapters.32(StringBuilder.class, typeAdapters$190);
        TypeAdapters.20 typeAdapters$200 = new TypeAdapters.20();
        b.r = new TypeAdapters.32(StringBuffer.class, typeAdapters$200);
        TypeAdapters.21 typeAdapters$210 = new TypeAdapters.21();
        b.s = new TypeAdapters.32(URL.class, typeAdapters$210);
        TypeAdapters.22 typeAdapters$220 = new TypeAdapters.22();
        b.t = new TypeAdapters.32(URI.class, typeAdapters$220);
        TypeAdapters.23 typeAdapters$230 = new TypeAdapters.23();
        b.u = new TypeAdapters.35(InetAddress.class, typeAdapters$230);
        TypeAdapters.24 typeAdapters$240 = new TypeAdapters.24();
        b.v = new TypeAdapters.32(UUID.class, typeAdapters$240);
        n n5 = new TypeAdapters.25().a();
        b.w = new TypeAdapters.32(Currency.class, n5);
        b.x = new TypeAdapters.26();
        b.y = new TypeAdapters.34(new TypeAdapters.27());
        TypeAdapters.28 typeAdapters$280 = new TypeAdapters.28();
        b.z = new TypeAdapters.32(Locale.class, typeAdapters$280);
        TypeAdapters.29 typeAdapters$290 = new TypeAdapters.29();
        b.A = typeAdapters$290;
        b.B = new TypeAdapters.35(j.class, typeAdapters$290);
        b.C = new TypeAdapters.30();
    }

    public static o a(Class class0, n n0) {
        return new TypeAdapters.32(class0, n0);
    }

    public static o b(Class class0, Class class1, n n0) {
        return new TypeAdapters.33(class0, class1, n0);
    }
}

