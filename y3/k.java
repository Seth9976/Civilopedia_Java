package y3;

import J2.j;
import M3.J;
import M3.Z;
import M3.d;
import M3.w;
import N3.c;
import N3.f;
import N3.g;
import X2.L;
import X2.M;
import X2.T;
import X2.o;
import X2.p;
import X2.u;
import X2.y;
import a3.G;
import a3.I;
import a3.K;
import a3.S;
import a3.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceLoader;
import x2.i;

public final class k {
    public final c a;
    public static final List b;
    public static final k c;
    public static final b d;

    static {
        k.b = i.o0(ServiceLoader.load(e.class, e.class.getClassLoader()));
        b b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        k.d = b0;
        k.c = new k(b0);
    }

    public k(c c0) {
        if(c0 != null) {
            super();
            this.a = c0;
            return;
        }
        k.a(5);
        throw null;
    }

    public static void a(int v) {
        IllegalStateException illegalStateException0;
        int v1;
        String s;
        switch(v) {
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 0x5F: 
            case 98: 
            case 103: {
                s = "@NotNull method %s.%s must not return null";
                break;
            }
            default: {
                s = v == 80 || v == 81 || v == 82 || v == 83 || v == 84 || (v == 90 || v == 91 || v == 92) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null";
            }
        }
        switch(v) {
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 0x5F: 
            case 98: 
            case 103: {
                v1 = 2;
                break;
            }
            default: {
                v1 = v == 80 || v == 81 || v == 82 || v == 83 || v == 84 || (v == 90 || v == 91 || v == 92) ? 2 : 3;
            }
        }
        Object[] arr_object = new Object[v1];
        switch(v) {
            case 2: {
                arr_object[0] = "customSubtype";
                break;
            }
            case 4: {
                arr_object[0] = "equalityAxioms";
                break;
            }
            case 5: {
                arr_object[0] = "axioms";
                break;
            }
            case 1: 
            case 7: {
                arr_object[0] = "kotlinTypePreparator";
                break;
            }
            case 8: 
            case 9: {
                arr_object[0] = "candidateSet";
                break;
            }
            case 10: {
                arr_object[0] = "transformFirst";
                break;
            }
            case 13: {
                arr_object[0] = "f";
                break;
            }
            case 14: {
                arr_object[0] = "g";
                break;
            }
            case 15: 
            case 17: {
                arr_object[0] = "descriptor";
                break;
            }
            case 18: {
                arr_object[0] = "result";
                break;
            }
            case 19: 
            case 22: 
            case 30: 
            case 40: {
                arr_object[0] = "superDescriptor";
                break;
            }
            case 20: 
            case 23: 
            case 0x1F: 
            case 41: {
                arr_object[0] = "subDescriptor";
                break;
            }
            case 42: {
                arr_object[0] = "firstParameters";
                break;
            }
            case 43: {
                arr_object[0] = "secondParameters";
                break;
            }
            case 46: {
                arr_object[0] = "typeInSuper";
                break;
            }
            case 0x2F: {
                arr_object[0] = "typeInSub";
                break;
            }
            case 49: {
                arr_object[0] = "superTypeParameter";
                break;
            }
            case 50: {
                arr_object[0] = "subTypeParameter";
                break;
            }
            case 52: {
                arr_object[0] = "name";
                break;
            }
            case 53: {
                arr_object[0] = "membersFromSupertypes";
                break;
            }
            case 54: {
                arr_object[0] = "membersFromCurrent";
                break;
            }
            case 57: {
                arr_object[0] = "overriding";
                break;
            }
            case 58: {
                arr_object[0] = "fromSuper";
                break;
            }
            case 59: {
                arr_object[0] = "fromCurrent";
                break;
            }
            case 60: {
                arr_object[0] = "descriptorsFromSuper";
                break;
            }
            case 0x3F: 
            case 65: {
                arr_object[0] = "notOverridden";
                break;
            }
            case 71: {
                arr_object[0] = "candidate";
                break;
            }
            case 67: 
            case 69: 
            case 73: {
                arr_object[0] = "a";
                break;
            }
            case 74: {
                arr_object[0] = "aReturnType";
                break;
            }
            case 68: 
            case 70: 
            case 75: {
                arr_object[0] = "b";
                break;
            }
            case 76: {
                arr_object[0] = "bReturnType";
                break;
            }
            case 0x30: 
            case 51: 
            case 77: {
                arr_object[0] = "typeCheckerState";
                break;
            }
            case 78: 
            case 85: {
                arr_object[0] = "overridables";
                break;
            }
            case 94: {
                arr_object[0] = "classModality";
                break;
            }
            case 55: 
            case 61: 
            case 0x40: 
            case 86: 
            case 89: 
            case 0x60: {
                arr_object[0] = "current";
                break;
            }
            case 97: {
                arr_object[0] = "toFilter";
                break;
            }
            case 0x4F: 
            case 101: {
                arr_object[0] = "descriptorByHandle";
                break;
            }
            case 102: {
                arr_object[0] = "onConflict";
                break;
            }
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 80: 
            case 81: 
            case 82: 
            case 83: 
            case 84: 
            case 90: 
            case 91: 
            case 92: 
            case 0x5F: 
            case 98: 
            case 103: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            }
            case 99: 
            case 104: {
                arr_object[0] = "overrider";
                break;
            }
            case 100: 
            case 105: {
                arr_object[0] = "extractFrom";
                break;
            }
            case 56: 
            case 62: 
            case 66: 
            case 87: 
            case 106: {
                arr_object[0] = "strategy";
                break;
            }
            case 107: 
            case 108: {
                arr_object[0] = "memberDescriptor";
                break;
            }
            case 72: 
            case 88: 
            case 93: 
            case 109: {
                arr_object[0] = "descriptors";
                break;
            }
            default: {
                arr_object[0] = "kotlinTypeRefiner";
            }
        }
        switch(v) {
            case 11: 
            case 12: {
                arr_object[1] = "filterOverrides";
                break;
            }
            case 16: {
                arr_object[1] = "getOverriddenDeclarations";
                break;
            }
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: {
                arr_object[1] = "isOverridableBy";
                break;
            }
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: {
                arr_object[1] = "isOverridableByWithoutExternalConditions";
                break;
            }
            case 44: 
            case 45: {
                arr_object[1] = "createTypeCheckerState";
                break;
            }
            case 0x5F: {
                arr_object[1] = "getMinimalModality";
                break;
            }
            case 98: {
                arr_object[1] = "filterVisibleFakeOverrides";
                break;
            }
            case 103: {
                arr_object[1] = "extractMembersOverridableInBothWays";
                break;
            }
            default: {
                if(v == 80 || v == 81 || v == 82 || v == 83 || v == 84) {
                    arr_object[1] = "selectMostSpecificMember";
                }
                else if(v != 90 && v != 91 && v != 92) {
                    arr_object[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                }
                else {
                    arr_object[1] = "determineModalityForFakeOverride";
                }
            }
        }
        switch(v) {
            case 1: 
            case 2: {
                arr_object[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            }
            case 3: 
            case 4: {
                arr_object[2] = "create";
                break;
            }
            case 5: 
            case 6: 
            case 7: {
                arr_object[2] = "<init>";
                break;
            }
            case 8: {
                arr_object[2] = "filterOutOverridden";
                break;
            }
            case 9: 
            case 10: {
                arr_object[2] = "filterOverrides";
                break;
            }
            case 13: 
            case 14: {
                arr_object[2] = "overrides";
                break;
            }
            case 15: {
                arr_object[2] = "getOverriddenDeclarations";
                break;
            }
            case 17: 
            case 18: {
                arr_object[2] = "collectOverriddenDeclarations";
                break;
            }
            case 19: 
            case 20: 
            case 22: 
            case 23: {
                arr_object[2] = "isOverridableBy";
                break;
            }
            case 30: 
            case 0x1F: {
                arr_object[2] = "isOverridableByWithoutExternalConditions";
                break;
            }
            case 40: 
            case 41: {
                arr_object[2] = "getBasicOverridabilityProblem";
                break;
            }
            case 42: 
            case 43: {
                arr_object[2] = "createTypeCheckerState";
                break;
            }
            case 46: 
            case 0x2F: 
            case 0x30: {
                arr_object[2] = "areTypesEquivalent";
                break;
            }
            case 49: 
            case 50: 
            case 51: {
                arr_object[2] = "areTypeParametersEquivalent";
                break;
            }
            case 52: 
            case 53: 
            case 54: 
            case 55: 
            case 56: {
                arr_object[2] = "generateOverridesInFunctionGroup";
                break;
            }
            case 57: 
            case 58: {
                arr_object[2] = "isVisibleForOverride";
                break;
            }
            case 59: 
            case 60: 
            case 61: 
            case 62: {
                arr_object[2] = "extractAndBindOverridesForMember";
                break;
            }
            case 0x3F: {
                arr_object[2] = "allHasSameContainingDeclaration";
                break;
            }
            case 0x40: 
            case 65: 
            case 66: {
                arr_object[2] = "createAndBindFakeOverrides";
                break;
            }
            case 67: 
            case 68: {
                arr_object[2] = "isMoreSpecific";
                break;
            }
            case 69: 
            case 70: {
                arr_object[2] = "isVisibilityMoreSpecific";
                break;
            }
            case 71: 
            case 72: {
                arr_object[2] = "isMoreSpecificThenAllOf";
                break;
            }
            case 73: 
            case 74: 
            case 75: 
            case 76: 
            case 77: {
                arr_object[2] = "isReturnTypeMoreSpecific";
                break;
            }
            case 78: 
            case 0x4F: {
                arr_object[2] = "selectMostSpecificMember";
                break;
            }
            case 85: 
            case 86: 
            case 87: {
                arr_object[2] = "createAndBindFakeOverride";
                break;
            }
            case 88: 
            case 89: {
                arr_object[2] = "determineModalityForFakeOverride";
                break;
            }
            case 93: 
            case 94: {
                arr_object[2] = "getMinimalModality";
                break;
            }
            case 0x60: 
            case 97: {
                arr_object[2] = "filterVisibleFakeOverrides";
                break;
            }
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 80: 
            case 81: 
            case 82: 
            case 83: 
            case 84: 
            case 90: 
            case 91: 
            case 92: 
            case 0x5F: 
            case 98: 
            case 103: {
                break;
            }
            case 99: 
            case 100: 
            case 101: 
            case 102: 
            case 104: 
            case 105: 
            case 106: {
                arr_object[2] = "extractMembersOverridableInBothWays";
                break;
            }
            case 107: {
                arr_object[2] = "resolveUnknownVisibilityForMember";
                break;
            }
            case 108: {
                arr_object[2] = "computeVisibilityToInherit";
                break;
            }
            case 109: {
                arr_object[2] = "findMaxVisibility";
                break;
            }
            default: {
                arr_object[2] = "createWithTypeRefiner";
            }
        }
        String s1 = String.format(s, arr_object);
        switch(v) {
            case 11: 
            case 12: 
            case 16: 
            case 21: 
            case 24: 
            case 25: 
            case 26: 
            case 27: 
            case 28: 
            case 29: 
            case 0x20: 
            case 33: 
            case 34: 
            case 35: 
            case 36: 
            case 37: 
            case 38: 
            case 39: 
            case 44: 
            case 45: 
            case 0x5F: 
            case 98: 
            case 103: {
                illegalStateException0 = new IllegalStateException(s1);
                break;
            }
            default: {
                illegalStateException0 = v == 80 || v == 81 || v == 82 || v == 83 || v == 84 || (v == 90 || v == 91 || v == 92) ? new IllegalStateException(s1) : new IllegalArgumentException(s1);
            }
        }
        throw illegalStateException0;
    }

    public static boolean b(w w0, w w1, J j0) {
        if(w0 != null) {
            if(w1 != null) {
                return !M3.c.i(w0) || !M3.c.i(w1) ? d.g(j0, w0.K0(), w1.K0()) : true;
            }
            k.a(0x2F);
            throw null;
        }
        k.a(46);
        throw null;
    }

    public static void c(X2.c c0, LinkedHashSet linkedHashSet0) {
        if(c0 != null) {
            if(c0.j() != 2) {
                linkedHashSet0.add(c0);
                return;
            }
            if(c0.s().isEmpty()) {
                throw new IllegalStateException("No overridden descriptors found for (fake override) " + c0);
            }
            for(Object object0: c0.s()) {
                k.c(((X2.c)object0), linkedHashSet0);
            }
            return;
        }
        k.a(17);
        throw null;
    }

    public static ArrayList d(X2.b b0) {
        v v0 = b0.J();
        ArrayList arrayList0 = new ArrayList();
        if(v0 != null) {
            arrayList0.add(v0.getType());
        }
        for(Object object0: b0.z0()) {
            arrayList0.add(((S)object0).getType());
        }
        return arrayList0;
    }

    public static void e(Collection collection0, X2.e e0, l l0) {
        y y0;
        boolean z1;
        if(collection0 != null) {
            if(e0 != null) {
                ArrayList arrayList0 = new ArrayList();
                Iterator iterator0 = collection0.iterator();
                while(true) {
                    boolean z = true;
                    z1 = false;
                    if(!iterator0.hasNext()) {
                        break;
                    }
                    Object object0 = iterator0.next();
                    X2.c c0 = (X2.c)object0;
                    if(p.e(c0.c())) {
                        z = false;
                    }
                    else if(e0 == null) {
                        p.a(3);
                        throw null;
                    }
                    else if(p.c(p.l, c0, e0) == null) {
                    }
                    if(z) {
                        arrayList0.add(object0);
                    }
                }
                boolean z2 = arrayList0.isEmpty();
                if(!z2) {
                    collection0 = arrayList0;
                }
                boolean z3 = false;
                boolean z4 = false;
                for(Object object1: collection0) {
                    X2.c c1 = (X2.c)object1;
                    switch(c1.f().ordinal()) {
                        case 0: {
                            y0 = y.j;
                            goto label_98;
                        }
                        case 1: {
                            throw new IllegalStateException("Member cannot have SEALED modality: " + c1);
                        }
                        case 2: {
                            z3 = true;
                            break;
                        }
                        case 3: {
                            z4 = true;
                        }
                    }
                }
                boolean z5 = e0.Z();
                y y1 = y.m;
                if(z5 && e0.f() != y1 && e0.f() != y.k) {
                    z1 = true;
                }
                if(z3 && !z4) {
                    y0 = y.l;
                    goto label_98;
                }
                if(!z3 && z4) {
                    y y2 = z1 ? e0.f() : y1;
                    if(y2 != null) {
                        y0 = y2;
                        goto label_98;
                    }
                    k.a(92);
                    throw null;
                }
                HashSet hashSet0 = new HashSet();
                for(Object object2: collection0) {
                    if(((X2.c)object2) != null) {
                        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                        k.c(((X2.c)object2), linkedHashSet0);
                        hashSet0.addAll(linkedHashSet0);
                        continue;
                    }
                    k.a(15);
                    throw null;
                }
                if(!hashSet0.isEmpty()) {
                    Object object3 = hashSet0.iterator().next();
                    if(C3.e.j(((X2.k)object3)).E0(g.a) != null) {
                        throw new ClassCastException();
                    }
                }
                if(hashSet0.size() > 1) {
                    LinkedHashSet linkedHashSet1 = new LinkedHashSet();
                    Iterator iterator3 = hashSet0.iterator();
                label_71:
                    while(iterator3.hasNext()) {
                        Object object4 = iterator3.next();
                        Iterator iterator4 = linkedHashSet1.iterator();
                        while(iterator4.hasNext()) {
                            Object object5 = iterator4.next();
                            X2.b b0 = (X2.b)object5;
                            if(k.q(((X2.b)object4), b0)) {
                                iterator4.remove();
                            }
                            else {
                                if(k.q(b0, ((X2.b)object4))) {
                                    continue label_71;
                                }
                                if(false) {
                                    break;
                                }
                            }
                        }
                        linkedHashSet1.add(object4);
                    }
                    hashSet0 = linkedHashSet1;
                }
                y y3 = e0.f();
                if(y3 != null) {
                    y y4 = y1;
                    for(Object object6: hashSet0) {
                        X2.c c2 = (X2.c)object6;
                        y y5 = !z1 || c2.f() != y1 ? c2.f() : y3;
                        if(y5.compareTo(y4) < 0) {
                            y4 = y5;
                        }
                    }
                    if(y4 != null) {
                        y0 = y4;
                    label_98:
                        X2.c c3 = ((X2.c)k.s(collection0, new h(0))).j0(e0, y0, (z2 ? p.h : p.g));
                        l0.p(c3, collection0);
                        l0.b(c3);
                        return;
                    }
                    k.a(0x5F);
                    throw null;
                }
                k.a(94);
                throw null;
            }
            k.a(86);
            throw null;
        }
        k.a(85);
        throw null;
    }

    public final J f(List list0, List list1) {
        if(list0 != null) {
            if(list1 != null) {
                N3.e e0 = N3.e.i;
                f f0 = f.a;
                c c0 = this.a;
                if(list0.isEmpty()) {
                    return new J(true, true, new w3.k(null, c0), e0, f0);
                }
                HashMap hashMap0 = new HashMap();
                for(int v = 0; v < list0.size(); ++v) {
                    hashMap0.put(((T)list0.get(v)).B(), ((T)list1.get(v)).B());
                }
                return new J(true, true, new w3.k(hashMap0, c0), e0, f0);
            }
            k.a(43);
            throw null;
        }
        k.a(42);
        throw null;
    }

    public static ArrayList g(Object object0, LinkedList linkedList0, I2.b b0, I2.b b1) {
        if(object0 != null) {
            ArrayList arrayList0 = new ArrayList();
            arrayList0.add(object0);
            X2.b b2 = (X2.b)b0.b(object0);
            Iterator iterator0 = linkedList0.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                X2.b b3 = (X2.b)b0.b(object1);
                if(object0 == object1) {
                    iterator0.remove();
                }
                else {
                    int v = k.j(b2, b3);
                    if(v == 1) {
                        arrayList0.add(object1);
                        iterator0.remove();
                    }
                    else if(v == 3) {
                        b1.b(object1);
                        iterator0.remove();
                    }
                }
            }
            return arrayList0;
        }
        k.a(99);
        throw null;
    }

    public final void h(v3.f f0, Collection collection0, Collection collection1, X2.e e0, l l0) {
        if(f0 != null) {
            if(collection0 != null) {
                if(collection1 != null) {
                    if(e0 != null) {
                        LinkedHashSet linkedHashSet0 = new LinkedHashSet(collection0);
                        for(Object object0: collection1) {
                            X2.c c0 = (X2.c)object0;
                            if(c0 != null) {
                                ArrayList arrayList0 = new ArrayList(collection0.size());
                                V3.h h0 = new V3.h();
                                for(Object object1: collection0) {
                                    X2.c c1 = (X2.c)object1;
                                    int v = this.l(c1, c0, e0).c();
                                    boolean z = !p.e(c1.c()) && p.c(p.l, c1, c0) == null;
                                    switch(q.e.c(v)) {
                                        case 0: {
                                            if(z) {
                                                h0.add(c1);
                                            }
                                            arrayList0.add(c1);
                                            continue;
                                        }
                                        case 2: {
                                            if(z) {
                                                l0.d(c1, c0);
                                            }
                                            break;
                                        }
                                        default: {
                                            continue;
                                        }
                                    }
                                    arrayList0.add(c1);
                                }
                                l0.p(c0, h0);
                                linkedHashSet0.removeAll(arrayList0);
                                continue;
                            }
                            k.a(59);
                            throw null;
                        }
                        if(linkedHashSet0.size() >= 2) {
                            Object object2 = linkedHashSet0.iterator().next();
                            X2.k k0 = ((X2.c)object2).p();
                            if(!linkedHashSet0.isEmpty()) {
                                for(Object object3: linkedHashSet0) {
                                    if(((X2.c)object3).p() == k0) {
                                        continue;
                                    }
                                    LinkedList linkedList0 = new LinkedList(linkedHashSet0);
                                    while(!linkedList0.isEmpty()) {
                                        X2.c c2 = null;
                                        for(Object object4: linkedList0) {
                                            X2.c c3 = (X2.c)object4;
                                            if(c2 == null) {
                                                c2 = c3;
                                            }
                                            else {
                                                Integer integer0 = p.b(c2.c(), c3.c());
                                                if(integer0 != null && ((int)integer0) < 0) {
                                                    c2 = c3;
                                                }
                                            }
                                        }
                                        j.c(c2);
                                        k.e(k.g(c2, linkedList0, new h(1), new y3.i(l0, c2)), e0, l0);
                                    }
                                    return;
                                }
                            }
                        }
                        for(Object object5: linkedHashSet0) {
                            k.e(Collections.singleton(((X2.c)object5)), e0, l0);
                        }
                        return;
                    }
                    k.a(55);
                    throw null;
                }
                k.a(54);
                throw null;
            }
            k.a(53);
            throw null;
        }
        k.a(52);
        throw null;
    }

    public static y3.j i(X2.b b0, X2.b b1) {
        y3.j j0;
        int v = 0;
        if(b0 != null) {
            if(b1 != null) {
                if(b0 instanceof u && !(b1 instanceof u) || b0 instanceof M && !(b1 instanceof M)) {
                    return y3.j.d("Member kind mismatch");
                }
                if(!(b0 instanceof u) && !(b0 instanceof M)) {
                    throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + b0);
                }
                if(!b0.getName().equals(b1.getName())) {
                    return y3.j.d("Name mismatch");
                }
                int v1 = b0.J() == null ? 1 : 0;
                if(b1.J() == null) {
                    v = 1;
                }
                if(v1 != v) {
                    j0 = y3.j.d("Receiver presence mismatch");
                    return j0 == null ? null : j0;
                }
                j0 = b0.z0().size() == b1.z0().size() ? null : y3.j.d("Value parameter number mismatch");
                return j0 == null ? null : j0;
            }
            k.a(41);
            throw null;
        }
        k.a(40);
        throw null;
    }

    public static int j(X2.b b0, X2.b b1) {
        int v = k.c.l(b1, b0, null).c();
        int v1 = k.c.m(b0, b1, null, false).c();
        return v == 1 && v1 == 1 || (v == 3 || v1 == 3) ? 1 : 2;
    }

    public static boolean k(X2.b b0, X2.b b1) {
        if(b0 != null) {
            if(b1 != null) {
                w w0 = b0.r();
                w w1 = b1.r();
                if(!k.p(b0, b1)) {
                    return false;
                }
                List list0 = b0.u();
                List list1 = b1.u();
                J j0 = k.c.f(list0, list1);
                if(b0 instanceof u) {
                    return k.o(b0, w0, b1, w1, j0);
                }
                if(!(b0 instanceof M)) {
                    throw new IllegalArgumentException("Unexpected callable: " + b0.getClass());
                }
                K k0 = ((M)b0).e();
                K k1 = ((M)b1).e();
                if(!(k0 == null || k1 == null ? true : k.p(k0, k1))) {
                    return false;
                }
                return !((M)b0).G() || !((M)b1).G() ? (((M)b0).G() || !((M)b1).G()) && k.o(b0, w0, b1, w1, j0) : d.g(j0, w0.K0(), w1.K0());
            }
            k.a(68);
            throw null;
        }
        k.a(67);
        throw null;
    }

    public final y3.j l(X2.b b0, X2.b b1, X2.e e0) {
        if(b0 != null) {
            if(b1 != null) {
                return this.m(b0, b1, e0, false);
            }
            k.a(20);
            throw null;
        }
        k.a(19);
        throw null;
    }

    public final y3.j m(X2.b b0, X2.b b1, X2.e e0, boolean z) {
        if(b0 != null) {
            if(b1 != null) {
                y3.j j0 = this.n(b0, b1, z);
                boolean z1 = j0.c() == 1;
                List list0 = k.b;
                for(Object object0: list0) {
                    e e1 = (e)object0;
                    if(e1.b() != 1 && (!z1 || e1.b() != 2)) {
                        switch(q.e.c(e1.a(b0, b1, e0))) {
                            case 0: {
                                z1 = true;
                                break;
                            }
                            case 1: {
                                return y3.j.b("External condition failed");
                            }
                            case 2: {
                                return y3.j.d("External condition");
                            }
                        }
                    }
                }
                if(!z1) {
                    return j0;
                }
                for(Object object1: list0) {
                    e e2 = (e)object1;
                    if(e2.b() != 1) {
                        continue;
                    }
                    switch(q.e.c(e2.a(b0, b1, e0))) {
                        case 0: {
                            throw new IllegalStateException("Contract violation in " + e2.getClass().getName() + " condition. It\'s not supposed to end with success");
                        }
                        case 1: {
                            return y3.j.b("External condition failed");
                        }
                        case 2: {
                            break;
                        }
                        default: {
                            continue;
                        }
                    }
                    return y3.j.d("External condition");
                }
                y3.j j1 = y3.j.b;
                if(j1 != null) {
                    return j1;
                }
                y3.j.a(0);
                throw null;
            }
            k.a(23);
            throw null;
        }
        k.a(22);
        throw null;
    }

    public final y3.j n(X2.b b0, X2.b b1, boolean z) {
        if(b0 != null) {
            if(b1 != null) {
                y3.j j0 = k.i(b0, b1);
                if(j0 != null) {
                    return j0;
                }
                ArrayList arrayList0 = k.d(b0);
                ArrayList arrayList1 = k.d(b1);
                List list0 = b0.u();
                List list1 = b1.u();
                if(list0.size() != list1.size()) {
                    for(int v = 0; v < arrayList0.size(); ++v) {
                        w w0 = (w)arrayList0.get(v);
                        w w1 = (w)arrayList1.get(v);
                        if(!N3.d.a.a(w0, w1)) {
                            return y3.j.d("Type parameter number mismatch");
                        }
                    }
                    return y3.j.b("Type parameter number mismatch");
                }
                J j1 = this.f(list0, list1);
                int v1 = 0;
                while(v1 < list0.size()) {
                    T t0 = (T)list0.get(v1);
                    T t1 = (T)list1.get(v1);
                    if(t0 != null) {
                        if(t1 != null) {
                            List list2 = t0.getUpperBounds();
                            ArrayList arrayList2 = new ArrayList(t1.getUpperBounds());
                            if(list2.size() == arrayList2.size()) {
                                Iterator iterator0 = list2.iterator();
                            label_30:
                                while(iterator0.hasNext()) {
                                    Object object0 = iterator0.next();
                                    ListIterator listIterator0 = arrayList2.listIterator();
                                    while(true) {
                                        if(!listIterator0.hasNext()) {
                                            return y3.j.d("Type parameter bounds mismatch");
                                        }
                                        if(!k.b(((w)object0), ((w)listIterator0.next()), j1)) {
                                            continue;
                                        }
                                        listIterator0.remove();
                                        continue label_30;
                                    }
                                }
                                ++v1;
                                continue;
                            }
                            return y3.j.d("Type parameter bounds mismatch");
                        }
                        k.a(50);
                        throw null;
                    }
                    k.a(49);
                    throw null;
                }
                for(int v2 = 0; v2 < arrayList0.size(); ++v2) {
                    if(!k.b(((w)arrayList0.get(v2)), ((w)arrayList1.get(v2)), j1)) {
                        return y3.j.d("Value parameter type mismatch");
                    }
                }
                if(b0 instanceof u && b1 instanceof u && ((u)b0).n() != ((u)b1).n()) {
                    return y3.j.b("Incompatible suspendability");
                }
                if(z) {
                    w w2 = b0.r();
                    w w3 = b1.r();
                    if(w2 != null && w3 != null && (!M3.c.i(w3) || !M3.c.i(w2))) {
                        Z z1 = w3.K0();
                        Z z2 = w2.K0();
                        if(!d.n(d.a, j1, z1, z2)) {
                            return y3.j.b("Return type mismatch");
                        }
                    }
                }
                y3.j j2 = y3.j.b;
                if(j2 != null) {
                    return j2;
                }
                y3.j.a(0);
                throw null;
            }
            k.a(0x1F);
            throw null;
        }
        k.a(30);
        throw null;
    }

    public static boolean o(X2.b b0, w w0, X2.b b1, w w1, J j0) {
        if(b0 != null) {
            if(w0 != null) {
                if(b1 != null) {
                    if(w1 != null) {
                        Z z0 = w0.K0();
                        Z z1 = w1.K0();
                        return d.n(d.a, j0, z0, z1);
                    }
                    k.a(76);
                    throw null;
                }
                k.a(75);
                throw null;
            }
            k.a(74);
            throw null;
        }
        k.a(73);
        throw null;
    }

    public static boolean p(X2.b b0, X2.b b1) {
        if(b0 != null) {
            if(b1 != null) {
                Integer integer0 = p.b(b0.c(), b1.c());
                return integer0 == null || ((int)integer0) >= 0;
            }
            k.a(70);
            throw null;
        }
        k.a(69);
        throw null;
    }

    public static boolean q(X2.b b0, X2.b b1) {
        if(b0 != null) {
            if(b1 != null) {
                boolean z = b0.equals(b1);
                b b2 = b.a;
                if(!z && b2.c(b0.a(), b1.a(), false)) {
                    return true;
                }
                X2.b b3 = b1.a();
                LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                y3.d.b(b0.a(), linkedHashSet0);
                for(Object object0: linkedHashSet0) {
                    if(b2.c(b3, ((X2.b)object0), false)) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
                return false;
            }
            k.a(14);
            throw null;
        }
        k.a(13);
        throw null;
    }

    public static void r(X2.c c0, U2.f f0) {
        o o3;
        o o2;
        o o1;
        o o0;
        if(c0 != null) {
            for(Object object0: c0.s()) {
                X2.c c1 = (X2.c)object0;
                if(c1.c() == p.g) {
                    k.r(c1, f0);
                }
            }
            if(c0.c() != p.g) {
                return;
            }
            Collection collection0 = c0.s();
            if(collection0 != null) {
                if(collection0.isEmpty()) {
                    o0 = p.j;
                }
                else {
                    Iterator iterator1 = collection0.iterator();
                    do {
                        o1 = null;
                    label_17:
                        if(!iterator1.hasNext()) {
                            goto label_26;
                        }
                        Object object1 = iterator1.next();
                        o2 = ((X2.c)object1).c();
                        if(o1 == null) {
                            o1 = o2;
                            goto label_17;
                        }
                        Integer integer0 = p.b(o2, o1);
                    }
                    while(integer0 == null);
                    if(((int)integer0) <= 0) {
                        goto label_17;
                    }
                    o1 = o2;
                    goto label_17;
                label_26:
                    if(o1 != null) {
                        for(Object object2: collection0) {
                            Integer integer1 = p.b(o1, ((X2.c)object2).c());
                            if(integer1 != null && ((int)integer1) >= 0) {
                                continue;
                            }
                            goto label_35;
                        }
                        o0 = o1;
                        goto label_36;
                    }
                label_35:
                    o0 = null;
                }
            label_36:
                if(o0 == null) {
                    o0 = null;
                }
                else if(c0.j() == 2) {
                    for(Object object3: collection0) {
                        if(((X2.c)object3).f() != y.m && !((X2.c)object3).c().equals(o0)) {
                            o0 = null;
                            break;
                        }
                    }
                }
                else {
                    o0 = p.f(o0.a.m());
                }
                if(o0 == null) {
                    if(f0 != null) {
                        f0.b(c0);
                    }
                    o3 = p.e;
                }
                else {
                    o3 = o0;
                }
                if(c0 instanceof I) {
                    if(o3 != null) {
                        ((I)c0).r = o3;
                        for(Object object4: ((M)c0).w()) {
                            k.r(((L)object4), (o0 == null ? null : f0));
                        }
                        return;
                    }
                    I.G0(20);
                    throw null;
                }
                if(c0 instanceof a3.u) {
                    if(o3 != null) {
                        ((a3.u)c0).t = o3;
                        return;
                    }
                    a3.u.G0(10);
                    throw null;
                }
                ((G)c0).s = o3;
                if(o3 != ((G)c0).M0().c()) {
                    ((G)c0).m = false;
                }
                return;
            }
            k.a(109);
            throw null;
        }
        k.a(107);
        throw null;
    }

    public static Object s(Collection collection0, I2.b b0) {
        if(collection0.size() == 1) {
            Object object0 = i.R(collection0);
            if(object0 != null) {
                return object0;
            }
            k.a(80);
            throw null;
        }
        ArrayList arrayList0 = new ArrayList(2);
        ArrayList arrayList1 = new ArrayList(x2.k.E(collection0));
        for(Object object1: collection0) {
            arrayList1.add(b0.b(object1));
        }
        Object object2 = i.R(collection0);
        X2.b b1 = (X2.b)b0.b(object2);
        for(Object object3: collection0) {
            X2.b b2 = (X2.b)b0.b(object3);
            if(b2 != null) {
                for(Object object4: arrayList1) {
                    if(k.k(b2, ((X2.b)object4))) {
                        continue;
                    }
                    goto label_26;
                }
                arrayList0.add(object3);
            label_26:
                if(!k.k(b2, b1) || k.k(b1, b2)) {
                    continue;
                }
                object2 = object3;
                continue;
            }
            k.a(71);
            throw null;
        }
        if(arrayList0.isEmpty()) {
            if(object2 != null) {
                return object2;
            }
            k.a(81);
            throw null;
        }
        if(arrayList0.size() == 1) {
            Object object5 = i.R(arrayList0);
            if(object5 != null) {
                return object5;
            }
            k.a(82);
            throw null;
        }
        Object object6 = null;
        for(Object object7: arrayList0) {
            if(!M3.c.j(((X2.b)b0.b(object7)).r())) {
                object6 = object7;
                break;
            }
        }
        if(object6 != null) {
            return object6;
        }
        Object object8 = i.R(arrayList0);
        if(object8 != null) {
            return object8;
        }
        k.a(84);
        throw null;
    }
}

