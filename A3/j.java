package a3;

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

public final class J extends G implements L {
    public w u;
    public final J v;

    public J(M m0, h h0, y y0, o o0, boolean z, boolean z1, boolean z2, int v, J j0, O o1) {
        J j2;
        J j1;
        if(h0 != null) {
            if(y0 != null) {
                if(o0 != null) {
                    if(v != 0) {
                        if(o1 != null) {
                            super(y0, o0, m0, h0, f.g(("<get-" + m0.getName() + ">")), z, z1, z2, v, o1);
                            if(j0 == null) {
                                j2 = this;
                                j1 = j2;
                            }
                            else {
                                j1 = this;
                                j2 = j0;
                            }
                            j1.v = j2;
                            return;
                        }
                        J.G0(5);
                        throw null;
                    }
                    J.G0(4);
                    throw null;
                }
                J.G0(3);
                throw null;
            }
            J.G0(2);
            throw null;
        }
        J.G0(1);
        throw null;
    }

    @Override  // a3.G
    public static void G0(int v) {
        Object[] arr_object = new Object[(v == 6 || v == 7 || v == 8 ? 2 : 3)];
        switch(v) {
            case 1: {
                arr_object[0] = "annotations";
                break;
            }
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
            case 6: 
            case 7: 
            case 8: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            }
            default: {
                arr_object[0] = "correspondingProperty";
            }
        }
        switch(v) {
            case 6: {
                arr_object[1] = "getOverriddenDescriptors";
                break;
            }
            case 7: {
                arr_object[1] = "getValueParameters";
                break;
            }
            case 8: {
                arr_object[1] = "getOriginal";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
            }
        }
        if(v != 6 && v != 7 && v != 8) {
            arr_object[2] = "<init>";
        }
        String s = String.format((v == 6 || v == 7 || v == 8 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 6 || v == 7 || v == 8 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    @Override  // a3.n
    public final l L0() {
        return this.O0();
    }

    public final J O0() {
        J j0 = this.v;
        if(j0 != null) {
            return j0;
        }
        J.G0(8);
        throw null;
    }

    public final void P0(w w0) {
        if(w0 == null) {
            w0 = this.M0().getType();
        }
        this.u = w0;
    }

    @Override  // X2.b
    public final b a() {
        return this.O0();
    }

    @Override  // X2.c
    public final c a() {
        return this.O0();
    }

    @Override  // a3.n, X2.k
    public final k a() {
        return this.O0();
    }

    @Override  // X2.u
    public final u a() {
        return this.O0();
    }

    @Override  // X2.k
    public final Object c0(m m0, Object object0) {
        return m0.m(this, object0);
    }

    @Override  // X2.b
    public final w r() {
        return this.u;
    }

    @Override  // X2.c
    public final Collection s() {
        return this.N0(true);
    }

    @Override  // X2.b
    public final List z0() {
        List list0 = Collections.emptyList();
        if(list0 != null) {
            return list0;
        }
        J.G0(7);
        throw null;
    }
}

