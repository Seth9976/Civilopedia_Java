package a3;

import D3.b;
import F3.n;
import F3.o;
import L3.e;
import L3.i;
import L3.m;
import M3.g;
import M3.w;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import v3.f;
import y3.k;

public final class p extends o {
    public final e b;
    public final e c;
    public final i d;
    public final q e;

    public p(q q0, m m0) {
        if(m0 != null) {
            super();
            this.e = q0;
            this.b = m0.b(new a3.o(this, 0));
            this.c = m0.b(new a3.o(this, 1));
            this.d = new i(m0, new b(this, 11));  // 初始化器: LL3/h;-><init>(LL3/m;LI2/a;)V
            return;
        }
        p.h(0);
        throw null;
    }

    @Override  // F3.o
    public final Collection a(f f0, f3.b b0) {
        if(f0 != null) {
            return (Collection)this.c.b(f0);
        }
        p.h(1);
        throw null;
    }

    @Override  // F3.o
    public final Collection b(f f0, f3.b b0) {
        if(f0 != null) {
            return (Collection)this.b.b(f0);
        }
        p.h(5);
        throw null;
    }

    @Override  // F3.o
    public final Set c() {
        Set set0 = (Set)this.e.q.invoke();
        if(set0 != null) {
            return set0;
        }
        p.h(17);
        throw null;
    }

    @Override  // F3.o
    public final Set d() {
        Set set0 = (Set)this.e.q.invoke();
        if(set0 != null) {
            return set0;
        }
        p.h(19);
        throw null;
    }

    @Override  // F3.o
    public final Set e() {
        Set set0 = Collections.emptySet();
        if(set0 != null) {
            return set0;
        }
        p.h(18);
        throw null;
    }

    @Override  // F3.o
    public final Collection g(F3.f f0, I2.b b0) {
        if(f0 != null) {
            Collection collection0 = (Collection)this.d.invoke();
            if(collection0 != null) {
                return collection0;
            }
            p.h(15);
            throw null;
        }
        p.h(13);
        throw null;
    }

    public static void h(int v) {
        Object[] arr_object = new Object[(v == 3 || v == 7 || v == 9 || v == 12 || (v == 15 || v == 16 || v == 17 || v == 18 || v == 19) ? 2 : 3)];
        switch(v) {
            case 2: 
            case 6: {
                arr_object[0] = "location";
                break;
            }
            case 1: 
            case 4: 
            case 5: 
            case 8: 
            case 10: {
                arr_object[0] = "name";
                break;
            }
            case 11: {
                arr_object[0] = "fromSupertypes";
                break;
            }
            case 13: {
                arr_object[0] = "kindFilter";
                break;
            }
            case 14: {
                arr_object[0] = "nameFilter";
                break;
            }
            case 3: 
            case 7: 
            case 9: 
            case 12: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                break;
            }
            case 20: {
                arr_object[0] = "p";
                break;
            }
            default: {
                arr_object[0] = "storageManager";
            }
        }
        switch(v) {
            case 3: {
                arr_object[1] = "getContributedVariables";
                break;
            }
            case 7: {
                arr_object[1] = "getContributedFunctions";
                break;
            }
            case 9: {
                arr_object[1] = "getSupertypeScope";
                break;
            }
            case 12: {
                arr_object[1] = "resolveFakeOverrides";
                break;
            }
            case 15: {
                arr_object[1] = "getContributedDescriptors";
                break;
            }
            case 16: {
                arr_object[1] = "computeAllDeclarations";
                break;
            }
            case 17: {
                arr_object[1] = "getFunctionNames";
                break;
            }
            case 18: {
                arr_object[1] = "getClassifierNames";
                break;
            }
            case 19: {
                arr_object[1] = "getVariableNames";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
            }
        }
        switch(v) {
            case 1: 
            case 2: {
                arr_object[2] = "getContributedVariables";
                break;
            }
            case 4: {
                arr_object[2] = "computeProperties";
                break;
            }
            case 5: 
            case 6: {
                arr_object[2] = "getContributedFunctions";
                break;
            }
            case 8: {
                arr_object[2] = "computeFunctions";
                break;
            }
            case 10: 
            case 11: {
                arr_object[2] = "resolveFakeOverrides";
                break;
            }
            case 13: 
            case 14: {
                arr_object[2] = "getContributedDescriptors";
                break;
            }
            case 3: 
            case 7: 
            case 9: 
            case 12: 
            case 15: 
            case 16: 
            case 17: 
            case 18: 
            case 19: {
                break;
            }
            case 20: {
                arr_object[2] = "printScopeStructure";
                break;
            }
            default: {
                arr_object[2] = "<init>";
            }
        }
        String s = String.format((v == 3 || v == 7 || v == 9 || v == 12 || (v == 15 || v == 16 || v == 17 || v == 18 || v == 19) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalStateException illegalStateException0 = v == 3 || v == 7 || v == 9 || v == 12 || (v == 15 || v == 16 || v == 17 || v == 18 || v == 19) ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalStateException0;
    }

    public final n i() {
        Object object0 = ((g)this.e.B()).e().iterator().next();
        n n0 = ((w)object0).x0();
        if(n0 != null) {
            return n0;
        }
        p.h(9);
        throw null;
    }

    public final LinkedHashSet j(f f0, Collection collection0) {
        if(f0 != null) {
            if(collection0 != null) {
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                Set set0 = Collections.emptySet();
                K3.f f1 = new K3.f(linkedHashSet0, 1);
                k.c.h(f0, collection0, set0, this.e, f1);
                return linkedHashSet0;
            }
            p.h(11);
            throw null;
        }
        p.h(10);
        throw null;
    }
}

