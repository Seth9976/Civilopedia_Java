package i3;

import B3.b;
import J2.j;
import J2.q;
import M3.U;
import M3.w;
import S3.i;
import S3.r;
import X2.O;
import X2.k;
import X2.o;
import X2.y;
import Y2.g;
import Y2.h;
import a3.L;
import a3.t;
import a3.u;
import a3.v;
import j3.c;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import w2.e;
import x2.s;
import y3.l;
import z1.a0;

public final class f extends L implements a {
    public int L;
    public final boolean M;
    public static final b N;
    public static final b O;

    static {
        f.N = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        f.O = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public f(k k0, L l0, h h0, v3.f f0, int v, O o0, boolean z) {
        if(k0 != null) {
            if(h0 != null) {
                if(f0 != null) {
                    if(v != 0) {
                        super(k0, l0, h0, f0, v, o0);
                        this.L = 0;
                        this.M = z;
                        return;
                    }
                    f.G0(3);
                    throw null;
                }
                f.G0(2);
                throw null;
            }
            f.G0(1);
            throw null;
        }
        f.G0(0);
        throw null;
    }

    @Override  // i3.a
    public final a F(w w0, ArrayList arrayList0, w w1, e e0) {
        ArrayList arrayList1 = a0.i(arrayList0, this.z0(), this);
        v v0 = w0 == null ? null : l.k(this, w0, g.a);
        t t0 = this.S0(U.b);
        t0.o = arrayList1;
        t0.s = w1;
        t0.q = v0;
        t0.x = true;
        t0.w = true;
        a a0 = (f)t0.F.P0(t0);
        if(e0 != null) {
            ((u)a0).T0(((X2.a)e0.i), e0.j);
        }
        if(a0 != null) {
            return a0;
        }
        f.G0(21);
        throw null;
    }

    @Override  // a3.L
    public static void G0(int v) {
        Object[] arr_object = new Object[(v == 13 || v == 18 || v == 21 ? 2 : 3)];
        switch(v) {
            case 2: 
            case 7: {
                arr_object[0] = "name";
                break;
            }
            case 9: {
                arr_object[0] = "contextReceiverParameters";
                break;
            }
            case 10: {
                arr_object[0] = "typeParameters";
                break;
            }
            case 11: {
                arr_object[0] = "unsubstitutedValueParameters";
                break;
            }
            case 12: {
                arr_object[0] = "visibility";
                break;
            }
            case 14: {
                arr_object[0] = "newOwner";
                break;
            }
            case 3: 
            case 15: {
                arr_object[0] = "kind";
                break;
            }
            case 1: 
            case 6: 
            case 16: {
                arr_object[0] = "annotations";
                break;
            }
            case 4: 
            case 8: 
            case 17: {
                arr_object[0] = "source";
                break;
            }
            case 19: {
                arr_object[0] = "enhancedValueParameterTypes";
                break;
            }
            case 20: {
                arr_object[0] = "enhancedReturnType";
                break;
            }
            case 13: 
            case 18: 
            case 21: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 13: {
                arr_object[1] = "initialize";
                break;
            }
            case 18: {
                arr_object[1] = "createSubstitutedCopy";
                break;
            }
            case 21: {
                arr_object[1] = "enhance";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
            }
        }
        switch(v) {
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                arr_object[2] = "createJavaMethod";
                break;
            }
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                arr_object[2] = "initialize";
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: {
                arr_object[2] = "createSubstitutedCopy";
                break;
            }
            case 19: 
            case 20: {
                arr_object[2] = "enhance";
                break;
            }
            case 13: 
            case 18: 
            case 21: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 13 || v == 18 || v == 21 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 13 || v == 18 || v == 21 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // a3.L
    public final u O0(int v, k k0, X2.u u0, O o0, h h0, v3.f f0) {
        if(k0 != null) {
            if(v != 0) {
                if(h0 != null) {
                    if(f0 == null) {
                        f0 = this.getName();
                    }
                    f f1 = new f(k0, ((L)u0), h0, f0, v, o0, this.M);
                    int v1 = this.L;
                    boolean z = false;
                    switch(v1) {
                        case 1: 
                        case 3: {
                            break;
                        }
                        case 2: 
                        case 4: {
                            z = true;
                            break;
                        }
                        default: {
                            throw null;
                        }
                    }
                    f1.c1(z, i3.e.b(v1));
                    return f1;
                }
                f.G0(16);
                throw null;
            }
            f.G0(15);
            throw null;
        }
        f.G0(14);
        throw null;
    }

    @Override  // a3.u, X2.b
    public final boolean Q() {
        return i3.e.b(this.L);
    }

    @Override  // a3.L
    public final L a1(v v0, v v1, List list0, List list1, List list2, w w0, y y0, o o0, s s0) {
        S3.f f0;
        if(list0 != null) {
            if(list1 != null) {
                if(list2 != null) {
                    if(o0 != null) {
                        super.a1(v0, v1, list0, list1, list2, w0, y0, o0, s0);
                        for(Object object0: r.d) {
                            i i0 = (i)object0;
                            i0.getClass();
                            if(i0.a != null && !j.a(this.getName(), i0.a)) {
                                continue;
                            }
                            q q0 = i0.b;
                            if(q0 != null) {
                                String s1 = this.getName().b();
                                j.e(s1, "asString(...)");
                                if(((Pattern)q0.j).matcher(s1).matches()) {
                                    goto label_16;
                                }
                                continue;
                            }
                        label_16:
                            if(i0.c != null && !i0.c.contains(this.getName())) {
                                continue;
                            }
                            S3.e[] arr_e = i0.e;
                            for(int v2 = 0; v2 < arr_e.length; ++v2) {
                                if(arr_e[v2].a(this) != null) {
                                    f0 = new S3.f(false);  // 初始化器: LS3/g;-><init>(Z)V
                                    this.u = f0.i;
                                    return this;
                                }
                            }
                            f0 = ((String)i0.d.b(this)) == null ? S3.f.k : new S3.f(false);  // 初始化器: LS3/g;-><init>(Z)V
                            this.u = f0.i;
                            return this;
                        }
                        f0 = S3.f.j;
                        this.u = f0.i;
                        return this;
                    }
                    f.G0(12);
                    throw null;
                }
                f.G0(11);
                throw null;
            }
            f.G0(10);
            throw null;
        }
        f.G0(9);
        throw null;
    }

    public static f b1(k k0, c c0, v3.f f0, c3.f f1, boolean z) {
        if(k0 != null) {
            if(f0 != null) {
                return new f(k0, null, c0, f0, 1, f1, z);
            }
            f.G0(7);
            throw null;
        }
        f.G0(5);
        throw null;
    }

    public final void c1(boolean z, boolean z1) {
        int v;
        if(!z) {
            v = z1 ? 3 : 1;
        }
        else if(z1) {
            v = 4;
        }
        else {
            v = 2;
        }
        this.L = v;
    }
}

