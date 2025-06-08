package h3;

import U2.f;
import X2.c;
import java.util.Collection;
import java.util.LinkedHashSet;
import y3.k;
import y3.l;

public final class a extends l {
    public final I3.l c;
    public final LinkedHashSet d;
    public final boolean e;

    public a(I3.l l0, LinkedHashSet linkedHashSet0, boolean z) {
        this.c = l0;
        this.d = linkedHashSet0;
        this.e = z;
    }

    @Override  // y3.l
    public static void a(int v) {
        Object[] arr_object = new Object[3];
        switch(v) {
            case 1: {
                arr_object[0] = "fromSuper";
                break;
            }
            case 2: {
                arr_object[0] = "fromCurrent";
                break;
            }
            case 3: {
                arr_object[0] = "member";
                break;
            }
            case 4: {
                arr_object[0] = "overridden";
                break;
            }
            default: {
                arr_object[0] = "fakeOverride";
            }
        }
        arr_object[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        switch(v) {
            case 1: 
            case 2: {
                arr_object[2] = "conflict";
                break;
            }
            case 3: 
            case 4: {
                arr_object[2] = "setOverriddenDescriptors";
                break;
            }
            default: {
                arr_object[2] = "addFakeOverride";
            }
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter \'%s\' of %s.%s must not be null", arr_object));
    }

    @Override  // y3.l
    public final void b(c c0) {
        if(c0 != null) {
            k.r(c0, new f(this, 2));
            this.d.add(c0);
            return;
        }
        a.a(0);
        throw null;
    }

    @Override  // y3.l
    public final void d(c c0, c c1) {
        if(c1 != null) {
            return;
        }
        a.a(2);
        throw null;
    }

    @Override  // y3.l
    public final void p(c c0, Collection collection0) {
        if(c0 != null) {
            if(this.e && c0.j() != 2) {
                return;
            }
            c0.g0(collection0);
            return;
        }
        a.a(3);
        throw null;
    }
}

