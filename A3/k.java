package a3;

import C3.e;
import M3.w;
import X2.L;
import X2.M;
import X2.O;
import X2.b;
import X2.c;
import X2.k;
import X2.l;
import X2.m;
import X2.o;
import X2.u;
import X2.y;
import Y2.h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import v3.f;

public final class K extends G implements L {
    public S u;
    public final K v;

    public K(M m0, h h0, y y0, o o0, boolean z, boolean z1, boolean z2, int v, K k0, O o1) {
        K k2;
        K k1;
        if(h0 != null) {
            if(y0 != null) {
                if(o0 != null) {
                    if(v != 0) {
                        if(o1 != null) {
                            super(y0, o0, m0, h0, f.g(("<set-" + m0.getName() + ">")), z, z1, z2, v, o1);
                            if(k0 == null) {
                                k2 = this;
                                k1 = k2;
                            }
                            else {
                                k1 = this;
                                k2 = k0;
                            }
                            k1.v = k2;
                            return;
                        }
                        K.G0(5);
                        throw null;
                    }
                    K.G0(4);
                    throw null;
                }
                K.G0(3);
                throw null;
            }
            K.G0(2);
            throw null;
        }
        K.G0(1);
        throw null;
    }

    @Override  // a3.G
    public static void G0(int v) {
        Object[] arr_object = new Object[(v == 10 || v == 11 || v == 12 || v == 13 ? 2 : 3)];
        switch(v) {
            case 2: {
                arr_object[0] = "modality";
                break;
            }
            case 3: {
                arr_object[0] = "visibility";
                break;
            }
            case 4: {
                arr_object[0] = "kind";
                break;
            }
            case 5: {
                arr_object[0] = "source";
                break;
            }
            case 6: {
                arr_object[0] = "parameter";
                break;
            }
            case 7: {
                arr_object[0] = "setterDescriptor";
                break;
            }
            case 8: {
                arr_object[0] = "type";
                break;
            }
            case 1: 
            case 9: {
                arr_object[0] = "annotations";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "correspondingProperty";
            }
        }
        switch(v) {
            case 10: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 11: {
                arr_object[1] = "getValueParameters";
                break;
            }
            case 12: {
                arr_object[1] = "getReturnType";
                break;
            }
            case 13: {
                arr_object[1] = "getOriginal";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
            }
        }
        switch(v) {
            case 6: {
                arr_object[2] = "initialize";
                break;
            }
            case 7: 
            case 8: 
            case 9: {
                arr_object[2] = "createSetterParameter";
                break;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: {
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 10 || v == 11 || v == 12 || v == 13 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 10 || v == 11 || v == 12 || v == 13 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    @Override  // a3.n
    public final l L0() {
        return this.P0();
    }

    public static S O0(K k0, w w0, h h0) {
        if(w0 != null) {
            if(h0 != null) {
                return new S(k0, null, 0, h0, v3.h.g, w0, false, false, false, null, O.b);
            }
            K.G0(9);
            throw null;
        }
        K.G0(8);
        throw null;
    }

    public final K P0() {
        K k0 = this.v;
        if(k0 != null) {
            return k0;
        }
        K.G0(13);
        throw null;
    }

    @Override  // X2.b
    public final b a() {
        return this.P0();
    }

    @Override  // X2.c
    public final c a() {
        return this.P0();
    }

    @Override  // a3.n, X2.k
    public final k a() {
        return this.P0();
    }

    @Override  // X2.u
    public final u a() {
        return this.P0();
    }

    @Override  // X2.k
    public final Object c0(m m0, Object object0) {
        return m0.e(this, object0);
    }

    @Override  // X2.b
    public final w r() {
        return e.e(this).w();
    }

    @Override  // X2.c
    public final Collection s() {
        return this.N0(false);
    }

    @Override  // X2.b
    public final List z0() {
        S s0 = this.u;
        if(s0 == null) {
            throw new IllegalStateException();
        }
        List list0 = Collections.singletonList(s0);
        if(list0 != null) {
            return list0;
        }
        K.G0(11);
        throw null;
    }
}

