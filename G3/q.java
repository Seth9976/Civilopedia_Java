package g3;

import g1.n;
import v3.c;
import w2.b;
import w2.e;
import x2.w;

public abstract class q {
    public static final c a;
    public static final c[] b;
    public static final n c;
    public static final r d;

    static {
        c c0 = new c("org.jspecify.nullness");
        c c1 = new c("org.jspecify.annotations");
        q.a = c1;
        c c2 = new c("io.reactivex.rxjava3.annotations");
        c c3 = new c("org.checkerframework.checker.nullness.compatqual");
        q.b = new c[]{new c("io.reactivex.rxjava3.annotations.Nullable"), new c("io.reactivex.rxjava3.annotations.NonNull")};
        e e0 = new e(new c("org.jetbrains.annotations"), r.d);
        e e1 = new e(new c("androidx.annotation"), r.d);
        e e2 = new e(new c("android.support.annotation"), r.d);
        e e3 = new e(new c("android.annotation"), r.d);
        e e4 = new e(new c("com.android.annotations"), r.d);
        e e5 = new e(new c("org.eclipse.jdt.annotation"), r.d);
        e e6 = new e(new c("org.checkerframework.checker.nullness.qual"), r.d);
        e e7 = new e(c3, r.d);
        e e8 = new e(new c("javax.annotation"), r.d);
        e e9 = new e(new c("edu.umd.cs.findbugs.annotations"), r.d);
        e e10 = new e(new c("io.reactivex.annotations"), r.d);
        e e11 = new e(new c("androidx.annotation.RecentlyNullable"), new r(B.j, 4));
        e e12 = new e(new c("androidx.annotation.RecentlyNonNull"), new r(B.j, 4));
        e e13 = new e(new c("lombok"), r.d);
        b b0 = new b(2, 0, 0);
        e e14 = new e(c0, new r(B.j, b0, B.k));
        b b1 = new b(2, 0, 0);
        e e15 = new e(c1, new r(B.j, b1, B.k));
        b b2 = new b(1, 8, 0);
        q.c = new n(w.s(new e[]{e0, e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, new e(c2, new r(B.j, b2, B.k))}));
        q.d = new r(B.j, 4);
    }
}

