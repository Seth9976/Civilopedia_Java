package a3;

import G3.a;
import G3.d;
import G3.e;
import M3.U;
import M3.a0;
import M3.w;
import X2.K;
import X2.O;
import X2.b;
import X2.k;
import X2.l;
import X2.o;
import X2.p;
import Y2.g;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import v3.f;
import v3.h;

public final class v extends m implements K {
    public final int k;
    public final k l;
    public final e m;

    public v(X2.e e0) {
        this.k = 0;
        if(e0 != null) {
            super(g.a, h.d);
            this.l = e0;
            this.m = new d(e0);
            return;
        }
        v.G0(0);
        throw null;
    }

    public v(k k0, a a0, Y2.h h0) {
        this.k = 1;
        if(k0 != null) {
            if(h0 != null) {
                this(k0, a0, h0, h.d);
                return;
            }
            v.H0(2);
            throw null;
        }
        v.H0(0);
        throw null;
    }

    public v(k k0, a a0, Y2.h h0, f f0) {
        this.k = 1;
        if(k0 != null) {
            if(h0 != null) {
                if(f0 != null) {
                    super(h0, f0);
                    this.l = k0;
                    this.m = a0;
                    return;
                }
                v.H0(6);
                throw null;
            }
            v.H0(5);
            throw null;
        }
        v.H0(3);
        throw null;
    }

    @Override  // X2.b
    public final v A() {
        return null;
    }

    @Override  // a3.m
    public static void G0(int v) {
        Object[] arr_object = new Object[(v == 1 || v == 2 ? 2 : 3)];
        switch(v) {
            case 1: 
            case 2: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
                break;
            }
            case 3: {
                arr_object[0] = "newOwner";
                break;
            }
            default: {
                arr_object[0] = "descriptor";
            }
        }
        switch(v) {
            case 1: {
                arr_object[1] = "getValue";
                break;
            }
            case 2: {
                arr_object[1] = "getContainingDeclaration";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
            }
        }
        switch(v) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                arr_object[2] = "copy";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 1 || v == 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 1 || v == 2 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // G3.a
    public static void H0(int v) {
        Object[] arr_object = new Object[(v == 7 || v == 8 ? 2 : 3)];
        switch(v) {
            case 1: 
            case 4: {
                arr_object[0] = "value";
                break;
            }
            case 2: 
            case 5: {
                arr_object[0] = "annotations";
                break;
            }
            case 6: {
                arr_object[0] = "name";
                break;
            }
            case 7: 
            case 8: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            }
            case 9: {
                arr_object[0] = "newOwner";
                break;
            }
            case 10: {
                arr_object[0] = "outType";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 7: {
                arr_object[1] = "getValue";
                break;
            }
            case 8: {
                arr_object[1] = "getContainingDeclaration";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
            }
        }
        switch(v) {
            case 7: 
            case 8: {
                break;
            }
            case 9: {
                arr_object[2] = "copy";
                break;
            }
            case 10: {
                arr_object[2] = "setOutType";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 7 || v == 8 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 7 || v == 8 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // X2.b
    public final v J() {
        return null;
    }

    public static void L0(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 2: {
                arr_object[0] = "name";
                break;
            }
            case 3: {
                arr_object[0] = "substitutor";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            }
            default: {
                arr_object[0] = "annotations";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getContextReceiverParameters";
                break;
            }
            case 5: {
                arr_object[1] = "getTypeParameters";
                break;
            }
            case 6: {
                arr_object[1] = "getType";
                break;
            }
            case 7: {
                arr_object[1] = "getValueParameters";
                break;
            }
            case 8: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 9: {
                arr_object[1] = "getVisibility";
                break;
            }
            case 10: {
                arr_object[1] = "getOriginal";
                break;
            }
            case 11: {
                arr_object[1] = "getSource";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
            }
        }
        switch(v) {
            case 3: {
                arr_object[2] = "substitute";
                break;
            }
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    public final e M0() {
        if(this.k != 0) {
            e e0 = (a)this.m;
            if(e0 != null) {
                return e0;
            }
            v.H0(7);
            throw null;
        }
        e e1 = (d)this.m;
        if(e1 != null) {
            return e1;
        }
        v.G0(1);
        throw null;
    }

    public final v N0(U u0) {
        if(u0 != null) {
            if(u0.a.e()) {
                return this;
            }
            w w0 = this.p() instanceof X2.e ? u0.i(this.getType(), a0.m) : u0.i(this.getType(), a0.k);
            if(w0 == null) {
                return null;
            }
            return w0 == this.getType() ? this : new v(this.p(), new G3.f(w0), this.l());  // 初始化器: LG3/a;-><init>(LM3/w;)V
        }
        v.L0(3);
        throw null;
    }

    @Override  // X2.b
    public final boolean Q() {
        return false;
    }

    @Override  // X2.b
    public final b a() {
        return this;
    }

    @Override  // a3.m, X2.k
    public final k a() {
        return this;
    }

    @Override  // X2.Q
    public final l b(U u0) {
        return this.N0(u0);
    }

    @Override  // X2.n
    public final o c() {
        o o0 = p.f;
        if(o0 != null) {
            return o0;
        }
        v.L0(9);
        throw null;
    }

    @Override  // X2.k
    public final Object c0(X2.m m0, Object object0) {
        return m0.y(this, object0);
    }

    @Override  // G3.a, X2.V
    public final w getType() {
        w w0 = this.M0().getType();
        if(w0 != null) {
            return w0;
        }
        v.L0(6);
        throw null;
    }

    @Override  // X2.k
    public final k p() {
        if(this.k != 0) {
            k k0 = this.l;
            if(k0 != null) {
                return k0;
            }
            v.H0(8);
            throw null;
        }
        k k1 = (X2.e)this.l;
        if(k1 != null) {
            return k1;
        }
        v.G0(2);
        throw null;
    }

    @Override  // X2.l
    public final O q() {
        return O.b;
    }

    @Override  // X2.b
    public final w r() {
        return this.getType();
    }

    @Override  // X2.b
    public final Collection s() {
        Collection collection0 = Collections.emptySet();
        if(collection0 != null) {
            return collection0;
        }
        v.L0(8);
        throw null;
    }

    @Override  // a3.m
    public String toString() {
        return this.k == 0 ? "class " + ((X2.e)this.l).getName() + "::this" : super.toString();
    }

    @Override  // X2.b
    public final List u() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        v.L0(5);
        throw null;
    }

    @Override  // X2.b
    public final List z0() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        v.L0(7);
        throw null;
    }
}

