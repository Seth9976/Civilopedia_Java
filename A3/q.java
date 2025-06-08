package a3;

import F3.n;
import L3.i;
import L3.m;
import M3.A;
import M3.K;
import X2.O;
import X2.U;
import X2.e;
import X2.o;
import X2.y;
import Y2.h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import v3.f;

public final class q extends j {
    public final M3.j o;
    public final p p;
    public final i q;
    public final h r;

    public q(m m0, e e0, A a0, f f0, i i0, h h0, O o0) {
        if(m0 != null) {
            if(e0 != null) {
                if(a0 != null) {
                    if(f0 != null) {
                        if(i0 != null) {
                            super(m0, e0, f0, o0);
                            this.r = h0;
                            this.o = new M3.j(this, Collections.emptyList(), Collections.singleton(a0), m0);
                            this.p = new p(this, m0);
                            this.q = i0;
                            return;
                        }
                        q.d0(10);
                        throw null;
                    }
                    q.d0(9);
                    throw null;
                }
                q.d0(8);
                throw null;
            }
            q.d0(7);
            throw null;
        }
        q.d0(6);
        throw null;
    }

    public static q A0(m m0, e e0, f f0, i i0, h h0, O o0) {
        if(m0 != null) {
            if(e0 != null) {
                if(f0 != null) {
                    if(i0 != null) {
                        return new q(m0, e0, e0.k(), f0, i0, h0, o0);
                    }
                    q.d0(3);
                    throw null;
                }
                q.d0(2);
                throw null;
            }
            q.d0(1);
            throw null;
        }
        q.d0(0);
        throw null;
    }

    @Override  // X2.h
    public final K B() {
        K k0 = this.o;
        if(k0 != null) {
            return k0;
        }
        q.d0(17);
        throw null;
    }

    @Override  // X2.e
    public final boolean D() {
        return false;
    }

    @Override  // X2.e
    public final boolean D0() {
        return false;
    }

    @Override  // X2.e
    public final boolean K() {
        return false;
    }

    @Override  // a3.z
    public final n L(N3.f f0) {
        n n0 = this.p;
        if(n0 != null) {
            return n0;
        }
        q.d0(14);
        throw null;
    }

    @Override  // X2.e
    public final Collection V() {
        Collection collection0 = Collections.emptyList();
        if(collection0 != null) {
            return collection0;
        }
        q.d0(23);
        throw null;
    }

    @Override  // X2.e
    public final boolean Y() {
        return false;
    }

    @Override  // X2.x
    public final boolean Z() {
        return false;
    }

    @Override  // X2.i
    public final boolean a0() {
        return false;
    }

    @Override  // X2.e
    public final o c() {
        o o0 = X2.p.e;
        if(o0 != null) {
            return o0;
        }
        q.d0(20);
        throw null;
    }

    @Override  // a3.j
    public static void d0(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 1: {
                arr_object[0] = "enumClass";
                break;
            }
            case 7: {
                arr_object[0] = "containingClass";
                break;
            }
            case 8: {
                arr_object[0] = "supertype";
                break;
            }
            case 2: 
            case 9: {
                arr_object[0] = "name";
                break;
            }
            case 3: 
            case 10: {
                arr_object[0] = "enumMemberNames";
                break;
            }
            case 4: 
            case 11: {
                arr_object[0] = "annotations";
                break;
            }
            case 5: 
            case 12: {
                arr_object[0] = "source";
                break;
            }
            case 13: {
                arr_object[0] = "kotlinTypeRefiner";
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 14: {
                arr_object[1] = "getUnsubstitutedMemberScope";
                break;
            }
            case 15: {
                arr_object[1] = "getStaticScope";
                break;
            }
            case 16: {
                arr_object[1] = "getConstructors";
                break;
            }
            case 17: {
                arr_object[1] = "getTypeConstructor";
                break;
            }
            case 18: {
                arr_object[1] = "getKind";
                break;
            }
            case 19: {
                arr_object[1] = "getModality";
                break;
            }
            case 20: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 21: {
                arr_object[1] = "getAnnotations";
                break;
            }
            case 22: {
                arr_object[1] = "getDeclaredTypeParameters";
                break;
            }
            case 23: {
                arr_object[1] = "getSealedSubclasses";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
            }
        }
        switch(v) {
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                arr_object[2] = "<init>";
                break;
            }
            case 13: {
                arr_object[2] = "getUnsubstitutedMemberScope";
                break;
            }
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                break;
            }
            default: {
                arr_object[2] = "create";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 14: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: 
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    @Override  // X2.e
    public final y f() {
        return y.j;
    }

    @Override  // X2.e
    public final Collection g() {
        Collection collection0 = Collections.emptyList();
        if(collection0 != null) {
            return collection0;
        }
        q.d0(16);
        throw null;
    }

    @Override  // X2.e
    public final X2.f j() {
        return X2.f.l;
    }

    @Override  // Y2.a
    public final h l() {
        h h0 = this.r;
        if(h0 != null) {
            return h0;
        }
        q.d0(21);
        throw null;
    }

    @Override  // X2.e
    public final U l0() {
        return null;
    }

    @Override  // X2.e
    public final boolean o() {
        return false;
    }

    @Override  // X2.e
    public final a3.i o0() {
        return null;
    }

    @Override  // X2.e
    public final n p0() {
        return F3.m.b;
    }

    @Override  // X2.e
    public final List t() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        q.d0(22);
        throw null;
    }

    @Override
    public final String toString() {
        return "enum entry " + this.getName();
    }

    @Override  // X2.x
    public final boolean v0() {
        return false;
    }
}

