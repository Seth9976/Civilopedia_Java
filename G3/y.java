package g3;

import U2.m;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import v3.c;
import w2.e;
import x2.j;
import x2.w;
import x2.z;

public abstract class y {
    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final List g;
    public static final c h;
    public static final c i;
    public static final List j;
    public static final c k;
    public static final c l;
    public static final c m;
    public static final c n;
    public static final Set o;
    public static final Set p;

    static {
        c c0 = new c("org.jspecify.nullness.Nullable");
        y.a = c0;
        y.b = new c("org.jspecify.nullness.NullnessUnspecified");
        c c1 = new c("org.jspecify.nullness.NullMarked");
        y.c = c1;
        c c2 = new c("org.jspecify.annotations.Nullable");
        y.d = c2;
        y.e = new c("org.jspecify.annotations.NullnessUnspecified");
        c c3 = new c("org.jspecify.annotations.NullMarked");
        y.f = c3;
        c c4 = new c("androidx.annotation.Nullable");
        c c5 = new c("android.support.annotation.Nullable");
        c c6 = new c("android.annotation.Nullable");
        c c7 = new c("com.android.annotations.Nullable");
        c c8 = new c("org.eclipse.jdt.annotation.Nullable");
        c c9 = new c("org.checkerframework.checker.nullness.qual.Nullable");
        c c10 = new c("javax.annotation.Nullable");
        c c11 = new c("javax.annotation.CheckForNull");
        c c12 = new c("edu.umd.cs.findbugs.annotations.CheckForNull");
        c c13 = new c("edu.umd.cs.findbugs.annotations.Nullable");
        c c14 = new c("edu.umd.cs.findbugs.annotations.PossiblyNull");
        c c15 = new c("io.reactivex.annotations.Nullable");
        c c16 = new c("io.reactivex.rxjava3.annotations.Nullable");
        List list0 = j.z(new c[]{x.i, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16});
        y.g = list0;
        c c17 = new c("javax.annotation.Nonnull");
        y.h = c17;
        y.i = new c("javax.annotation.CheckForNull");
        c c18 = new c("edu.umd.cs.findbugs.annotations.NonNull");
        c c19 = new c("androidx.annotation.NonNull");
        c c20 = new c("android.support.annotation.NonNull");
        c c21 = new c("android.annotation.NonNull");
        c c22 = new c("com.android.annotations.NonNull");
        c c23 = new c("org.eclipse.jdt.annotation.NonNull");
        c c24 = new c("org.checkerframework.checker.nullness.qual.NonNull");
        c c25 = new c("lombok.NonNull");
        c c26 = new c("io.reactivex.annotations.NonNull");
        c c27 = new c("io.reactivex.rxjava3.annotations.NonNull");
        List list1 = j.z(new c[]{x.h, c18, c19, c20, c21, c22, c23, c24, c25, c26, c27});
        y.j = list1;
        c c28 = new c("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        y.k = c28;
        c c29 = new c("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        y.l = c29;
        c c30 = new c("androidx.annotation.RecentlyNullable");
        y.m = c30;
        c c31 = new c("androidx.annotation.RecentlyNonNull");
        y.n = c31;
        z.x(z.x(z.x(z.x(z.x(z.x(z.x(z.x(z.w(z.x(z.w(new LinkedHashSet(), list0), c17), list1), c28), c29), c30), c31), c0), c1), c2), c3);
        y.o = z.y(new c[]{x.k, x.l});
        y.p = z.y(new c[]{x.j, x.m});
        w.s(new e[]{new e(x.c, m.t), new e(x.d, m.w), new e(x.e, m.m), new e(x.f, m.x)});
    }
}

