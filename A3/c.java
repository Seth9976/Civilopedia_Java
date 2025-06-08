package a3;

import L3.m;
import M3.a0;
import X2.P;
import X2.k;
import v3.f;

public abstract class c extends h {
    public c(m m0, k k0, Y2.h h0, f f0, a0 a00, boolean z, int v, P p0) {
        if(m0 != null) {
            if(k0 != null) {
                if(p0 != null) {
                    super(m0, k0, h0, f0, a00, z, v, p0);
                    return;
                }
                c.G0(6);
                throw null;
            }
            c.G0(1);
            throw null;
        }
        c.G0(0);
        throw null;
    }

    @Override  // a3.h
    public static void G0(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "containingDeclaration";
                break;
            }
            case 2: {
                arr_object[0] = "annotations";
                break;
            }
            case 3: {
                arr_object[0] = "name";
                break;
            }
            case 4: {
                arr_object[0] = "variance";
                break;
            }
            case 5: {
                arr_object[0] = "source";
                break;
            }
            case 6: {
                arr_object[0] = "supertypeLoopChecker";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        arr_object[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // a3.m
    public final String toString() {
        String s = "";
        String s1 = this.n ? "reified " : "";
        if(this.b0() != a0.k) {
            s = this.b0() + " ";
        }
        return s1 + s + this.getName();
    }
}

