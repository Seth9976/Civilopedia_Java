package y3;

import M3.K;
import M3.w;
import X2.A;
import X2.F;
import X2.J;
import X2.P;
import X2.b;
import X2.e;
import X2.f;
import X2.k;
import X2.l;
import X2.n;
import X2.p;
import X2.y;
import a3.C;
import a3.x;
import java.util.Collection;
import java.util.LinkedHashSet;
import v3.c;
import v3.h;

public abstract class d {
    public static final int a;

    static {
        new c("kotlin.jvm.JvmName");
    }

    public static void a(int v) {
        IllegalArgumentException illegalArgumentException0;
        int v1;
        String s;
        switch(v) {
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                v1 = 2;
                break;
            }
            default: {
                v1 = 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 16: {
                arr_object[0] = "first";
                break;
            }
            case 17: {
                arr_object[0] = "second";
                break;
            }
            case 18: 
            case 19: {
                arr_object[0] = "aClass";
                break;
            }
            case 20: {
                arr_object[0] = "kotlinType";
                break;
            }
            case 25: {
                arr_object[0] = "declarationDescriptor";
                break;
            }
            case 26: 
            case 28: {
                arr_object[0] = "subClass";
                break;
            }
            case 0x1F: {
                arr_object[0] = "other";
                break;
            }
            case 27: 
            case 29: 
            case 33: {
                arr_object[0] = "superClass";
                break;
            }
            case 37: {
                arr_object[0] = "classKind";
                break;
            }
            case 46: {
                arr_object[0] = "typeConstructor";
                break;
            }
            case 55: {
                arr_object[0] = "innerClassName";
                break;
            }
            case 56: {
                arr_object[0] = "location";
                break;
            }
            case 66: {
                arr_object[0] = "variable";
                break;
            }
            case 30: 
            case 0x20: 
            case 45: 
            case 67: {
                arr_object[0] = "type";
                break;
            }
            case 71: {
                arr_object[0] = "f";
                break;
            }
            case 73: {
                arr_object[0] = "current";
                break;
            }
            case 74: {
                arr_object[0] = "result";
                break;
            }
            case 75: {
                arr_object[0] = "memberDescriptor";
                break;
            }
            case 38: 
            case 39: 
            case 41: 
            case 44: 
            case 0x30: 
            case 54: 
            case 68: 
            case 69: 
            case 70: 
            case 77: 
            case 78: {
                arr_object[0] = "classDescriptor";
                break;
            }
            case 0x4F: 
            case 80: 
            case 81: {
                arr_object[0] = "annotated";
                break;
            }
            case 85: 
            case 87: 
            case 90: 
            case 92: {
                arr_object[0] = "scope";
                break;
            }
            case 88: 
            case 91: 
            case 93: {
                arr_object[0] = "name";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
                break;
            }
            case 1: 
            case 2: 
            case 3: 
            case 5: 
            case 6: 
            case 8: 
            case 11: 
            case 13: 
            case 14: 
            case 15: 
            case 21: 
            case 23: 
            case 24: 
            case 34: 
            case 35: 
            case 36: 
            case 57: 
            case 58: 
            case 59: 
            case 61: 
            case 0x40: 
            case 82: 
            case 0x5F: 
            case 97: {
                arr_object[0] = "descriptor";
                break;
            }
            default: {
                arr_object[0] = "containingDeclaration";
            }
        }
        switch(v) {
            case 4: {
                arr_object[1] = "getFqNameSafe";
                break;
            }
            case 7: {
                arr_object[1] = "getFqNameUnsafe";
                break;
            }
            case 9: 
            case 10: {
                arr_object[1] = "getFqNameFromTopLevelClass";
                break;
            }
            case 12: {
                arr_object[1] = "getClassIdForNonLocalClass";
                break;
            }
            case 22: {
                arr_object[1] = "getContainingModule";
                break;
            }
            case 40: {
                arr_object[1] = "getSuperclassDescriptors";
                break;
            }
            case 42: 
            case 43: {
                arr_object[1] = "getSuperClassType";
                break;
            }
            case 0x2F: {
                arr_object[1] = "getClassDescriptorForTypeConstructor";
                break;
            }
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: {
                arr_object[1] = "getDefaultConstructorVisibility";
                break;
            }
            case 60: {
                arr_object[1] = "unwrapFakeOverride";
                break;
            }
            case 62: 
            case 0x3F: {
                arr_object[1] = "unwrapSubstitutionOverride";
                break;
            }
            case 65: {
                arr_object[1] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            }
            case 72: {
                arr_object[1] = "getAllOverriddenDescriptors";
                break;
            }
            case 76: {
                arr_object[1] = "getAllOverriddenDeclarations";
                break;
            }
            case 83: 
            case 84: {
                arr_object[1] = "getContainingSourceFile";
                break;
            }
            case 86: {
                arr_object[1] = "getAllDescriptors";
                break;
            }
            case 89: {
                arr_object[1] = "getFunctionByName";
                break;
            }
            case 94: {
                arr_object[1] = "getPropertyByName";
                break;
            }
            case 0x60: {
                arr_object[1] = "getDirectMember";
                break;
            }
            default: {
                arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorUtils";
            }
        }
        switch(v) {
            case 1: {
                arr_object[2] = "isLocal";
                break;
            }
            case 2: {
                arr_object[2] = "getFqName";
                break;
            }
            case 3: {
                arr_object[2] = "getFqNameSafe";
                break;
            }
            case 5: {
                arr_object[2] = "getFqNameSafeIfPossible";
                break;
            }
            case 6: {
                arr_object[2] = "getFqNameUnsafe";
                break;
            }
            case 8: {
                arr_object[2] = "getFqNameFromTopLevelClass";
                break;
            }
            case 11: {
                arr_object[2] = "getClassIdForNonLocalClass";
                break;
            }
            case 13: {
                arr_object[2] = "isExtension";
                break;
            }
            case 14: {
                arr_object[2] = "isOverride";
                break;
            }
            case 15: {
                arr_object[2] = "isStaticDeclaration";
                break;
            }
            case 16: 
            case 17: {
                arr_object[2] = "areInSameModule";
                break;
            }
            case 18: 
            case 19: {
                arr_object[2] = "getParentOfType";
                break;
            }
            case 21: {
                arr_object[2] = "getContainingModule";
                break;
            }
            case 20: 
            case 23: {
                arr_object[2] = "getContainingModuleOrNull";
                break;
            }
            case 24: {
                arr_object[2] = "getContainingClass";
                break;
            }
            case 25: {
                arr_object[2] = "isAncestor";
                break;
            }
            case 26: 
            case 27: {
                arr_object[2] = "isDirectSubclass";
                break;
            }
            case 28: 
            case 29: {
                arr_object[2] = "isSubclass";
                break;
            }
            case 30: 
            case 0x1F: {
                arr_object[2] = "isSameClass";
                break;
            }
            case 0x20: 
            case 33: {
                arr_object[2] = "isSubtypeOfClass";
                break;
            }
            case 34: {
                arr_object[2] = "isAnonymousObject";
                break;
            }
            case 35: {
                arr_object[2] = "isAnonymousFunction";
                break;
            }
            case 36: {
                arr_object[2] = "isEnumEntry";
                break;
            }
            case 37: {
                arr_object[2] = "isKindOf";
                break;
            }
            case 38: {
                arr_object[2] = "hasAbstractMembers";
                break;
            }
            case 39: {
                arr_object[2] = "getSuperclassDescriptors";
                break;
            }
            case 41: {
                arr_object[2] = "getSuperClassType";
                break;
            }
            case 44: {
                arr_object[2] = "getSuperClassDescriptor";
                break;
            }
            case 45: {
                arr_object[2] = "getClassDescriptorForType";
                break;
            }
            case 46: {
                arr_object[2] = "getClassDescriptorForTypeConstructor";
                break;
            }
            case 0x30: {
                arr_object[2] = "getDefaultConstructorVisibility";
                break;
            }
            case 54: 
            case 55: 
            case 56: {
                arr_object[2] = "getInnerClassByName";
                break;
            }
            case 57: {
                arr_object[2] = "isStaticNestedClass";
                break;
            }
            case 58: {
                arr_object[2] = "isTopLevelOrInnerClass";
                break;
            }
            case 59: {
                arr_object[2] = "unwrapFakeOverride";
                break;
            }
            case 61: {
                arr_object[2] = "unwrapSubstitutionOverride";
                break;
            }
            case 0x40: {
                arr_object[2] = "unwrapFakeOverrideToAnyDeclaration";
                break;
            }
            case 66: 
            case 67: {
                arr_object[2] = "shouldRecordInitializerForProperty";
                break;
            }
            case 68: {
                arr_object[2] = "classCanHaveAbstractFakeOverride";
                break;
            }
            case 69: {
                arr_object[2] = "classCanHaveAbstractDeclaration";
                break;
            }
            case 70: {
                arr_object[2] = "classCanHaveOpenMembers";
                break;
            }
            case 71: {
                arr_object[2] = "getAllOverriddenDescriptors";
                break;
            }
            case 73: 
            case 74: {
                arr_object[2] = "collectAllOverriddenDescriptors";
                break;
            }
            case 75: {
                arr_object[2] = "getAllOverriddenDeclarations";
                break;
            }
            case 77: {
                arr_object[2] = "isSingletonOrAnonymousObject";
                break;
            }
            case 78: {
                arr_object[2] = "canHaveDeclaredConstructors";
                break;
            }
            case 0x4F: {
                arr_object[2] = "getJvmName";
                break;
            }
            case 80: {
                arr_object[2] = "findJvmNameAnnotation";
                break;
            }
            case 81: {
                arr_object[2] = "hasJvmNameAnnotation";
                break;
            }
            case 82: {
                arr_object[2] = "getContainingSourceFile";
                break;
            }
            case 85: {
                arr_object[2] = "getAllDescriptors";
                break;
            }
            case 87: 
            case 88: {
                arr_object[2] = "getFunctionByName";
                break;
            }
            case 90: 
            case 91: {
                arr_object[2] = "getFunctionByNameOrNull";
                break;
            }
            case 92: 
            case 93: {
                arr_object[2] = "getPropertyByName";
                break;
            }
            case 0x5F: {
                arr_object[2] = "getDirectMember";
                break;
            }
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                break;
            }
            case 97: {
                arr_object[2] = "isMethodOfAny";
                break;
            }
            default: {
                arr_object[2] = "getDispatchReceiverParameterIfNeeded";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 4: 
            case 7: 
            case 9: 
            case 10: 
            case 12: 
            case 22: 
            case 40: 
            case 42: 
            case 43: 
            case 0x2F: 
            case 49: 
            case 50: 
            case 51: 
            case 52: 
            case 53: 
            case 60: 
            case 62: 
            case 0x3F: 
            case 65: 
            case 72: 
            case 76: 
            case 83: 
            case 84: 
            case 86: 
            case 89: 
            case 94: 
            case 0x60: {
                illegalArgumentException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalArgumentException0 = new IllegalArgumentException(s1);
            }
        }
        throw illegalArgumentException0;
    }

    public static void b(b b0, LinkedHashSet linkedHashSet0) {
        if(b0 != null) {
            if(linkedHashSet0.contains(b0)) {
                return;
            }
            for(Object object0: b0.a().s()) {
                b b1 = ((b)object0).a();
                d.b(b1, linkedHashSet0);
                linkedHashSet0.add(b1);
            }
            return;
        }
        d.a(73);
        throw null;
    }

    public static e c(w w0) {
        if(w0 != null) {
            K k0 = w0.H0();
            if(k0 != null) {
                e e0 = (e)k0.q();
                if(e0 != null) {
                    return e0;
                }
                d.a(0x2F);
                throw null;
            }
            d.a(46);
            throw null;
        }
        d.a(45);
        throw null;
    }

    public static A d(k k0) {
        if(k0 != null) {
            A a0 = d.e(k0);
            if(a0 != null) {
                return a0;
            }
            d.a(22);
            throw null;
        }
        d.a(21);
        throw null;
    }

    public static A e(k k0) {
        if(k0 != null) {
            while(k0 != null) {
                if(k0 instanceof A) {
                    return (A)k0;
                }
                if(k0 instanceof J) {
                    return ((x)(((J)k0))).k;
                }
                k0 = k0.p();
            }
            return null;
        }
        d.a(23);
        throw null;
    }

    public static P f(k k0) {
        if(k0 != null) {
            if(k0 instanceof a3.K) {
                k0 = ((a3.K)k0).M0();
            }
            P p0 = P.j;
            if(k0 instanceof l) {
                ((l)k0).q().getClass();
            }
            return p0;
        }
        d.a(82);
        throw null;
    }

    public static v3.e g(k k0) {
        if(k0 != null) {
            c c0 = d.h(k0);
            return c0 == null ? d.i(k0) : c0.i();
        }
        d.a(2);
        throw null;
    }

    public static c h(k k0) {
        if(k0 != null) {
            if(!(k0 instanceof A) && !O3.l.f(k0)) {
                if(k0 instanceof J) {
                    return ((x)(((J)k0))).l;
                }
                return k0 instanceof F ? ((C)(((F)k0))).m : null;
            }
            return c.c;
        }
        d.a(5);
        throw null;
    }

    public static v3.e i(k k0) {
        if(k0 != null) {
            return d.g(k0.p()).b(k0.getName());
        }
        d.a(6);
        throw null;
    }

    public static k j(k k0, Class class0, boolean z) {
        if(k0 == null) {
            return null;
        }
        if(z) {
            k0 = k0.p();
        }
        while(k0 != null) {
            if(class0.isInstance(k0)) {
                return k0;
            }
            k0 = k0.p();
        }
        return null;
    }

    public static e k(e e0) {
        if(e0 != null) {
            for(Object object0: e0.B().r()) {
                e e1 = d.c(((w)object0));
                if(e1.j() != f.j) {
                    return e1;
                }
                if(false) {
                    break;
                }
            }
            return null;
        }
        d.a(44);
        throw null;
    }

    public static boolean l(k k0) {
        if(k0 != null) {
            return d.o(k0, f.i) && k0.getName().equals(h.a);
        }
        d.a(34);
        throw null;
    }

    // 去混淆评级： 低(20)
    public static boolean m(k k0) {
        return d.o(k0, f.n) && ((e)k0).D();
    }

    public static boolean n(k k0) {
        if(k0 != null) {
            return d.o(k0, f.l);
        }
        d.a(36);
        throw null;
    }

    public static boolean o(k k0, f f0) {
        return k0 instanceof e && ((e)k0).j() == f0;
    }

    public static boolean p(k k0) {
        if(k0 != null) {
            while(k0 != null) {
                if(!d.l(k0) && (!(k0 instanceof n) || ((n)k0).c() != p.f)) {
                    k0 = k0.p();
                    continue;
                }
                return true;
            }
            return false;
        }
        d.a(1);
        throw null;
    }

    public static boolean q(w w0, e e0) {
        if(w0 != null) {
            if(e0 != null) {
                X2.h h0 = w0.H0().q();
                if(h0 != null) {
                    k k0 = h0.a();
                    return k0 instanceof X2.h && e0.B().equals(((X2.h)k0).B());
                }
                return false;
            }
            d.a(0x1F);
            throw null;
        }
        d.a(30);
        throw null;
    }

    // 去混淆评级： 低(20)
    public static boolean r(k k0) {
        return (d.o(k0, f.i) || d.o(k0, f.j)) && ((e)k0).f() == y.k;
    }

    public static boolean s(w w0, e e0) {
        if(w0 != null) {
            if(e0 != null) {
                if(d.q(w0, e0)) {
                    return true;
                }
                for(Object object0: w0.H0().r()) {
                    if(d.s(((w)object0), e0)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }
            d.a(33);
            throw null;
        }
        d.a(0x20);
        throw null;
    }

    public static boolean t(k k0) {
        return k0 != null && k0.p() instanceof F;
    }

    public static X2.c u(X2.c c0) {
        if(c0 != null) {
            while(c0.j() == 2) {
                Collection collection0 = c0.s();
                if(collection0.isEmpty()) {
                    throw new IllegalStateException("Fake override should have at least one overridden descriptor: " + c0);
                }
                Object object0 = collection0.iterator().next();
                c0 = (X2.c)object0;
            }
            return c0;
        }
        d.a(59);
        throw null;
    }
}

