package z1;

import A3.l;
import A3.x;
import D3.d;
import J2.j;
import M3.N;
import M3.X;
import M3.w;
import O2.b;
import O2.g;
import O2.n;
import O2.q;
import R2.r;
import R2.x0;
import U2.m;
import V2.k;
import V3.c;
import X2.O;
import X2.T;
import X2.h;
import X2.u;
import a3.S;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.Ra;
import com.google.android.gms.internal.play_billing.A;
import com.google.android.gms.internal.play_billing.o;
import com.google.android.gms.internal.play_billing.zzgk;
import com.spears.civilopedia.db.tables.Buildings;
import com.spears.civilopedia.db.tables.ModifierArguments;
import com.spears.civilopedia.db.tables.ModifierStrings;
import com.spears.civilopedia.db.tables.Policies;
import com.spears.civilopedia.db.tables.Types;
import f2.J;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.regex.Matcher;
import k3.B;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import l.K0;
import n2.t;
import o2.I;
import o2.f;
import q3.E;
import w2.e;
import x2.i;
import x2.s;
import x2.z;

public abstract class a0 {
    public static Field a;
    public static boolean b;
    public static Field c;
    public static boolean d;
    public static Class e;
    public static boolean f;
    public static Field g;
    public static boolean h;
    public static Field i;
    public static boolean j;

    public static final w A(w w0) {
        j.f(w0, "<this>");
        a0.E(w0);
        if(w0.l().c(m.p) != null) {
            int v = a0.h(w0);
            return ((N)w0.A0().get(v)).b();
        }
        return null;
    }

    public static String B(f f0, String s) {
        j.f(s, "typeName");
        Types types0 = (Types)f0.D1.h(s);
        if(types0 != null) {
            HashMap hashMap0 = x2.w.o(new e[]{new e("KIND_PROJECT", "ICON_TECHUNLOCK_0"), new e("KIND_WONDER", "ICON_TECHUNLOCK_0"), new e("KIND_BUILDING", "ICON_TECHUNLOCK_1"), new e("KIND_DISTRICT", "ICON_TECHUNLOCK_2"), new e("KIND_IMPROVEMENT", "ICON_TECHUNLOCK_3"), new e("KIND_UNIT", "ICON_TECHUNLOCK_4"), new e("KIND_RESOURCE", "ICON_TECHUNLOCK_5"), new e("KIND_GOVERNMENT", "ICON_TECHUNLOCK_6"), new e("KIND_ROUTE", "ICON_TECHUNLOCK_3"), new e("KIND_AGREEMENT", "ICON_TECHUNLOCK_8"), new e("KIND_POLICY", "ICON_TECHUNLOCK_9")});
            if(j.a(types0.getKind(), "KIND_POLICY")) {
                Policies policies0 = (Policies)f0.V0.h(s);
                String s1 = policies0 == null ? null : policies0.getGovernmentSlotType();
                if(s1 != null) {
                    switch(s1) {
                        case "SLOT_DIPLOMATIC": {
                            return "ICON_TECHUNLOCK_11";
                        }
                        case "SLOT_ECONOMIC": {
                            return "ICON_TECHUNLOCK_12";
                        }
                        case "SLOT_GREAT_PERSON": {
                            return "ICON_TECHUNLOCK_9";
                        }
                        case "SLOT_MILITARY": {
                            return "ICON_TECHUNLOCK_10";
                        }
                        case "SLOT_WILDCARD": {
                            return "ICON_TECHUNLOCK_9";
                        }
                    }
                }
                Object object0 = hashMap0.get("KIND_POLICY");
                j.c(object0);
                return (String)object0;
            }
            if(!j.a(types0.getKind(), "KIND_BUILDING")) {
                goto label_28;
            }
            Buildings buildings0 = (Buildings)f0.v.h(types0.getType());
            if(buildings0 != null) {
                if(buildings0.isWonder()) {
                    Object object1 = hashMap0.get("KIND_WONDER");
                    j.c(object1);
                    return (String)object1;
                }
                Object object2 = hashMap0.get(types0.getKind());
                j.c(object2);
                return (String)object2;
            label_28:
                if(j.a(types0.getKind(), "KIND_DIPLOMATIC_ACTION")) {
                    return "ICON_TECHUNLOCK_8";
                }
                Object object3 = hashMap0.get(types0.getKind());
                j.c(object3);
                return (String)object3;
            }
        }
        return "ICON_TECHUNLOCK_0";
    }

    public static final List C(w w0) {
        j.f(w0, "<this>");
        a0.E(w0);
        List list0 = w0.A0();
        int v = a0.h(w0);
        return !a0.E(w0) || w0.l().c(m.p) == null ? list0.subList(v, list0.size() - 1) : list0.subList(v + 1, list0.size() - 1);
    }

    public static final boolean D(b b0) {
        Member member1;
        Member member0;
        j.f(b0, "<this>");
        if(b0 instanceof O2.j) {
            Field field0 = a.t(((q)b0));
            if(!(field0 == null ? true : field0.isAccessible())) {
                return false;
            }
            Method method0 = a.u(((q)b0).d());
            if(!(method0 == null ? true : method0.isAccessible())) {
                return false;
            }
            Method method1 = a.u(((O2.j)b0).e());
            return method1 == null ? true : method1.isAccessible();
        }
        if(b0 instanceof q) {
            Field field1 = a.t(((q)b0));
            if(!(field1 == null ? true : field1.isAccessible())) {
                return false;
            }
            Method method2 = a.u(((q)b0).d());
            return method2 == null ? true : method2.isAccessible();
        }
        if(b0 instanceof n) {
            Field field2 = a.t(((n)b0).f());
            if(!(field2 == null ? true : field2.isAccessible())) {
                return false;
            }
            Method method3 = a.u(((O2.f)b0));
            return method3 == null ? true : method3.isAccessible();
        }
        if(b0 instanceof g) {
            Field field3 = a.t(((g)b0).f());
            if(!(field3 == null ? true : field3.isAccessible())) {
                return false;
            }
            Method method4 = a.u(((O2.f)b0));
            return method4 == null ? true : method4.isAccessible();
        }
        if(!(b0 instanceof O2.f)) {
            throw new UnsupportedOperationException("Unknown callable: " + b0 + " (" + b0.getClass() + ')');
        }
        Method method5 = a.u(((O2.f)b0));
        if((method5 == null ? true : method5.isAccessible())) {
            r r0 = x0.a(b0);
            Constructor constructor0 = null;
            if(r0 == null) {
                member0 = null;
            }
            else {
                S2.g g0 = r0.k();
                member0 = g0 == null ? null : g0.t();
            }
            AccessibleObject accessibleObject0 = member0 instanceof AccessibleObject ? ((AccessibleObject)member0) : null;
            if((accessibleObject0 == null ? true : accessibleObject0.isAccessible())) {
                r r1 = x0.a(((O2.f)b0));
                if(r1 == null) {
                    member1 = null;
                }
                else {
                    S2.g g1 = r1.i();
                    member1 = g1 == null ? null : g1.t();
                }
                if(member1 instanceof Constructor) {
                    constructor0 = (Constructor)member1;
                }
                return constructor0 == null ? true : constructor0.isAccessible();
            }
        }
        return false;
    }

    public static final boolean E(w w0) {
        j.f(w0, "<this>");
        h h0 = w0.H0().q();
        if(h0 != null) {
            k k0 = a0.x(h0);
            return j.a(k0, V2.g.c) || j.a(k0, V2.j.c);
        }
        return false;
    }

    public static final boolean F(w w0) {
        j.f(w0, "<this>");
        h h0 = w0.H0().q();
        return h0 == null ? j.a(null, V2.j.c) : j.a(a0.x(h0), V2.j.c);
    }

    public static o3.j G(u u0, S s0) {
        j.f(u0, "f");
        boolean z = j.a(((a3.m)u0).getName().b(), "remove");
        c c0 = c.i;
        X2.e e0 = null;
        if(z && u0.z0().size() == 1 && !(C3.e.k(u0).p() instanceof i3.c) && !U2.h.z(u0)) {
            List list0 = u0.a().z0();
            j.e(list0, "getValueParameters(...)");
            w w0 = ((S)i.i0(list0)).getType();
            j.e(w0, "getType(...)");
            o3.q q0 = o3.q.k;
            o3.j j0 = (o3.j)I.q(w0, q0, c0);
            o3.i i0 = j0 instanceof o3.i ? ((o3.i)j0) : null;
            if((i0 == null ? null : i0.i) == d.q) {
                u u1 = g3.f.a(u0);
                if(u1 != null) {
                    List list1 = u1.a().z0();
                    j.e(list1, "getValueParameters(...)");
                    w w1 = ((S)i.i0(list1)).getType();
                    j.e(w1, "getType(...)");
                    o3.j j1 = (o3.j)I.q(w1, q0, c0);
                    X2.k k0 = u1.p();
                    j.e(k0, "getContainingDeclaration(...)");
                    if(!C3.e.h(k0).equals(m.J.i()) || !(j1 instanceof o3.h) || !j.a(((o3.h)j1).i, "java/lang/Object")) {
                        goto label_23;
                    }
                    goto label_33;
                }
            }
        }
    label_23:
        if(u0.z0().size() == 1) {
            X2.k k1 = u0.p();
            X2.e e1 = k1 instanceof X2.e ? ((X2.e)k1) : null;
            if(e1 != null) {
                List list2 = u0.z0();
                j.e(list2, "getValueParameters(...)");
                h h0 = ((S)i.i0(list2)).getType().H0().q();
                if(h0 instanceof X2.e) {
                    e0 = (X2.e)h0;
                }
                if(e0 != null && U2.h.t(e1) != null && C3.e.g(e1).equals(C3.e.g(e0))) {
                label_33:
                    w w2 = s0.getType();
                    j.e(w2, "getType(...)");
                    return (o3.j)I.q(X.g(w2, true), o3.q.k, c0);
                }
            }
        }
        w w3 = s0.getType();
        j.e(w3, "getType(...)");
        return (o3.j)I.q(w3, o3.q.k, c0);
    }

    public static final String H(Reader reader0) {
        StringWriter stringWriter0 = new StringWriter();
        char[] arr_c = new char[0x2000];
        for(int v = reader0.read(arr_c); v >= 0; v = reader0.read(arr_c)) {
            stringWriter0.write(arr_c, 0, v);
        }
        String s = stringWriter0.toString();
        j.e(s, "toString(...)");
        return s;
    }

    public static final boolean I(w w0) {
        h h0 = w0.H0().q();
        if(h0 == null || (!y3.f.b(h0) || !y3.f.e(h0) || C3.e.g(((X2.e)h0)).equals(U2.n.h)) && !y3.f.g(w0)) {
            h h1 = w0.H0().q();
            T t0 = h1 instanceof T ? ((T)h1) : null;
            return t0 != null && a0.I(o1.a.y(t0));
        }
        return true;
    }

    public static final j3.c J(B.f f0, m3.b b0) {
        j.f(f0, "<this>");
        j.f(b0, "annotationsOwner");
        return new j3.c(f0, b0, false);
    }

    public void K() {
    }

    public static final Object L(Set set0, Enum enum0, Enum enum1, Enum enum2, boolean z) {
        Enum enum3;
        if(z) {
            if(set0.contains(enum0)) {
                enum3 = enum0;
            }
            else {
                enum3 = set0.contains(enum1) ? enum1 : null;
            }
            if(j.a(enum3, enum0) && j.a(enum2, enum1)) {
                return null;
            }
            return enum2 == null ? enum3 : enum2;
        }
        if(enum2 != null) {
            set0 = i.s0(z.x(set0, enum2));
        }
        return i.j0(set0);
    }

    public static void M(View view0, CharSequence charSequence0) {
        if(Build.VERSION.SDK_INT >= 26) {
            view0.setTooltipText(charSequence0);
            return;
        }
        if(K0.r != null && K0.r.i == view0) {
            K0.b(null);
        }
        if(TextUtils.isEmpty(charSequence0)) {
            K0 k00 = K0.s;
            if(k00 != null && k00.i == view0) {
                k00.a();
            }
            view0.setOnLongClickListener(null);
            view0.setLongClickable(false);
            view0.setOnHoverListener(null);
            return;
        }
        new K0(view0, charSequence0);
    }

    public abstract void N();

    public abstract void O();

    public static final Class P(ClassLoader classLoader0, String s) {
        j.f(s, "fqName");
        try {
            return Class.forName(s, false, classLoader0);
        }
        catch(ClassNotFoundException unused_ex) {
            return null;
        }
    }

    public static N2.c Q(int v, int v1) {
        return v1 > 0x80000000 ? new N2.c(v, v1 - 1, 1) : N2.c.l;  // 初始化器: LN2/a;-><init>(III)V
    }

    public static String R(zzgk zzgk0) {
        StringBuilder stringBuilder0 = new StringBuilder(zzgk0.zzd());
        for(int v = 0; v < zzgk0.zzd(); ++v) {
            int v1 = zzgk0.zza(v);
            switch(v1) {
                case 7: {
                    stringBuilder0.append("\\a");
                    break;
                }
                case 8: {
                    stringBuilder0.append("\\b");
                    break;
                }
                case 9: {
                    stringBuilder0.append("\\t");
                    break;
                }
                case 10: {
                    stringBuilder0.append("\\n");
                    break;
                }
                case 11: {
                    stringBuilder0.append("\\v");
                    break;
                }
                case 12: {
                    stringBuilder0.append("\\f");
                    break;
                }
                case 13: {
                    stringBuilder0.append("\\r");
                    break;
                }
                case 34: {
                    stringBuilder0.append("\\\"");
                    break;
                }
                case 39: {
                    stringBuilder0.append("\\\'");
                    break;
                }
                case 92: {
                    stringBuilder0.append("\\\\");
                    break;
                }
                default: {
                    if(v1 < 0x20 || v1 > 0x7E) {
                        stringBuilder0.append('\\');
                        stringBuilder0.append(((char)((v1 >>> 6 & 3) + 0x30)));
                        stringBuilder0.append(((char)((v1 >>> 3 & 7) + 0x30)));
                        stringBuilder0.append(((char)((v1 & 7) + 0x30)));
                    }
                    else {
                        stringBuilder0.append(((char)v1));
                    }
                }
            }
        }
        return stringBuilder0.toString();
    }

    public static boolean S(Comparator comparator0, Collection collection0) {
        comparator0.getClass();
        collection0.getClass();
        if(collection0 instanceof SortedSet) {
            Comparator comparator1 = ((SortedSet)collection0).comparator();
            return comparator1 == null ? comparator0.equals(o.i) : comparator0.equals(comparator1);
        }
        return collection0 instanceof A ? comparator0.equals(((A)collection0).comparator()) : false;
    }

    public static final Y3.d a(Matcher matcher0, int v, CharSequence charSequence0) {
        return matcher0.find(v) ? new Y3.d(matcher0, charSequence0) : null;
    }

    public static final String b(Method method0) {
        Class[] arr_class = method0.getParameterTypes();
        j.e(arr_class, "getParameterTypes(...)");
        Class class0 = method0.getReturnType();
        j.e(class0, "getReturnType(...)");
        return method0.getName() + x2.g.M(arr_class, "", "(", ")", R2.b.r, 24) + d3.d.b(class0);
    }

    public abstract String c();

    public static ArrayList d(ArrayList arrayList0, Float float0) {
        ArrayList arrayList10;
        n2.w w0;
        J2.u u2;
        t t3;
        ArrayList arrayList9;
        ArrayList arrayList8;
        Iterator iterator3;
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            if(!((t)object0).d(arrayList0).isEmpty()) {
                arrayList1.add(object0);
            }
        }
        ArrayList arrayList2 = i.p0(arrayList1);
        ArrayList arrayList3 = new ArrayList();
        while(!arrayList2.isEmpty()) {
            t t0 = t.a(((t)arrayList2.get(0)));
            ArrayList arrayList4 = t0.d(arrayList0);
            n2.j j0 = (n2.j)arrayList4.get(0);
            n2.k k0 = new n2.k(j0, t.a(t0));
            ArrayList arrayList5 = x2.j.B(new n2.k[]{k0});
            do {
                n2.j[] arr_j = n2.j.values();
                n2.j j1 = arr_j[(j0.ordinal() + 1) % arr_j.length];
                if(arrayList4.contains(j1)) {
                    j0 = j1;
                }
                else {
                    switch(j1.ordinal()) {
                        case 0: {
                            t0.j -= ~t0.i & 1;
                            --t0.i;
                            j0 = n2.j.m;
                            break;
                        }
                        case 1: {
                            t0.j += t0.i & 1;
                            --t0.i;
                            j0 = n2.j.n;
                            break;
                        }
                        case 2: {
                            ++t0.j;
                            j0 = n2.j.i;
                            break;
                        }
                        case 3: {
                            t0.j += t0.i & 1;
                            ++t0.i;
                            j0 = n2.j.j;
                            break;
                        }
                        case 4: {
                            t0.j -= ~t0.i & 1;
                            ++t0.i;
                            j0 = n2.j.k;
                            break;
                        }
                        case 5: {
                            --t0.j;
                            j0 = n2.j.l;
                        }
                    }
                    arrayList4 = t0.d(arrayList0);
                }
                arrayList5.add(new n2.k(j0, t.a(t0)));
            }
            while(!k0.b.equals(t0) || k0.a != j0);
            ArrayList arrayList6 = new ArrayList(x2.k.E(arrayList5));
            for(Object object1: arrayList5) {
                arrayList6.add(((n2.k)object1).b);
            }
            x2.o.I(arrayList2, new A3.h(arrayList6, 22));
            t t1 = ((n2.k)arrayList5.get(0)).b;
            J2.u u0 = new J2.u(t1, (float0 == null ? 0.0f : ((float)float0)));
            ArrayList arrayList7 = x2.j.B(new n2.w[]{u0.c(((n2.k)arrayList5.get(0)).a).a});
            n2.j j2 = ((n2.k)arrayList5.get(0)).a;
            Iterator iterator2 = arrayList5.iterator();
            while(iterator2.hasNext()) {
                Object object2 = iterator2.next();
                n2.k k1 = (n2.k)object2;
                n2.j j3 = k1.a;
                if(k1.b.equals(t1)) {
                    arrayList8 = arrayList2;
                    arrayList9 = arrayList3;
                    arrayList10 = arrayList7;
                    iterator3 = iterator2;
                }
                else {
                    t t2 = k1.b;
                    J2.u u1 = new J2.u(t2, (float0 == null ? 0.0f : ((float)float0)));
                    if(float0 == null) {
                        arrayList8 = arrayList2;
                        arrayList9 = arrayList3;
                        u2 = u1;
                        arrayList10 = arrayList7;
                        iterator3 = iterator2;
                        t3 = t2;
                    }
                    else {
                        n2.n n0 = u1.c(j3);
                        n2.n n1 = u0.c(j2);
                        double f = n0.a.a;
                        double f1 = n0.b.a - f;
                        iterator3 = iterator2;
                        double f2 = n0.b.b - n0.a.b;
                        arrayList8 = arrayList2;
                        arrayList9 = arrayList3;
                        double f3 = n0.a.b;
                        double f4 = n1.a.a;
                        double f5 = n1.b.a - f4;
                        t3 = t2;
                        u2 = u1;
                        double f6 = n1.a.b;
                        double f7 = n1.b.b - f6;
                        if(Math.abs(f1) < 0.001) {
                            w0 = new n2.w(f, f7 / f5 * f + (f6 - f4 * (f7 / f5)));
                        }
                        else if(Math.abs(f5) < 0.001) {
                            w0 = new n2.w(f4, f2 / f1 * f4 + (f3 - f * (f2 / f1)));
                        }
                        else {
                            double f8 = f2 / f1;
                            double f9 = f3 - f * f8;
                            double f10 = (f6 - f4 * (f7 / f5) - f9) / (f8 - f7 / f5);
                            w0 = new n2.w(f10, f8 * f10 + f9);
                        }
                        arrayList10 = arrayList7;
                        arrayList10.add(w0);
                    }
                    t1 = t3;
                    u0 = u2;
                }
                arrayList10.add(u0.c(j3).b);
                arrayList7 = arrayList10;
                j2 = j3;
                iterator2 = iterator3;
                arrayList2 = arrayList8;
                arrayList3 = arrayList9;
            }
            arrayList3.add(arrayList7);
        }
        return arrayList3;
    }

    public static ArrayList e(n2.c c0, Float float0) {
        j.f(c0, "map");
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: c0.a) {
            x2.o.H(((n2.b)object0).c, arrayList0);
        }
        return a0.d(arrayList0, float0);
    }

    public boolean f() {
        return false;
    }

    public static float g(float f, float f1, float f2) {
        if(f1 > f2) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f2 + " is less than minimum " + f1 + '.');
        }
        if(f < f1) {
            return f1;
        }
        return f > f2 ? f2 : f;
    }

    public static final int h(w w0) {
        j.f(w0, "<this>");
        Y2.b b0 = w0.l().c(m.q);
        if(b0 == null) {
            return 0;
        }
        A3.g g0 = (A3.g)x2.w.n(b0.b(), U2.n.e);
        j.d(g0, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number)((l)g0).a).intValue();
    }

    public static final ArrayList i(List list0, Collection collection0, u u0) {
        j.f(collection0, "oldValueParameters");
        list0.size();
        collection0.size();
        ArrayList arrayList0 = i.v0(list0, collection0);
        ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
        for(Object object0: arrayList0) {
            S s0 = (S)((e)object0).j;
            Y2.h h0 = s0.l();
            v3.f f0 = s0.getName();
            j.e(f0, "getName(...)");
            boolean z = s0.N0();
            w w0 = s0.r == null ? null : C3.e.j(u0).m().f(((w)((e)object0).i));
            O o0 = s0.q();
            j.e(o0, "getSource(...)");
            arrayList1.add(new S(u0, null, s0.n, h0, f0, ((w)((e)object0).i), z, s0.p, s0.q, w0, o0));
        }
        return arrayList1;
    }

    public static F3.n j(String s, Iterable iterable0) {
        F3.n n0;
        j.f(s, "debugName");
        V3.f f0 = new V3.f();
        Iterator iterator0 = iterable0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            n0 = F3.m.b;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            F3.n n1 = (F3.n)object0;
            if(n1 == n0) {
            }
            else if(n1 instanceof F3.a) {
                j.f(((F3.a)n1).c, "elements");
                f0.addAll(x2.g.B(((F3.a)n1).c));
            }
            else {
                f0.add(n1);
            }
        }
        switch(f0.i) {
            case 0: {
                return n0;
            }
            case 1: {
                return (F3.n)f0.get(0);
            }
            default: {
                return new F3.a(s, ((F3.n[])f0.toArray(new F3.n[0])));
            }
        }
    }

    public static J3.c k(v3.c c0, L3.m m0, X2.A a0, InputStream inputStream0) {
        E e0;
        r3.a a2;
        r3.a a1;
        j.f(c0, "fqName");
        j.f(a0, "module");
        try {
            a1 = x2.w.v(inputStream0);
            a2 = r3.a.f;
            j.f(a2, "ourVersion");
            int v = a1.c;
            int v1 = a2.c;
            int v2 = a2.b;
            int v3 = a1.b;
            boolean z = true;
            if(v3 != 0) {
                if(v3 != v2 || v > v1) {
                    z = false;
                }
            }
            else if(v2 != 0 || v != v1) {
                z = false;
            }
            if(z) {
                w3.g g0 = new w3.g();
                r3.b.a(g0);
                E.s.getClass();
                Ra ra0 = new Ra(inputStream0);
                w3.b b0 = (w3.b)E.s.a(ra0, g0);
                try {
                    ra0.a(0);
                }
                catch(InvalidProtocolBufferException invalidProtocolBufferException0) {
                    invalidProtocolBufferException0.i = b0;
                    throw invalidProtocolBufferException0;
                }
                if(!b0.b()) {
                    InvalidProtocolBufferException invalidProtocolBufferException1 = new InvalidProtocolBufferException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
                    invalidProtocolBufferException1.i = b0;
                    throw invalidProtocolBufferException1;
                }
                e0 = (E)b0;
            }
            else {
                e0 = null;
            }
        }
        catch(Throwable throwable0) {
            o1.a.e(inputStream0, throwable0);
            throw throwable0;
        }
        inputStream0.close();
        if(e0 == null) {
            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + a2 + ", actual " + a1 + ". Please update Kotlin");
        }
        return new J3.c(c0, m0, a0, e0, a1);
    }

    public static s1.a l(String s, String s1) {
        T1.a a0 = new T1.a(s, s1);
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet0.add(T1.a.class);
        Collections.addAll(hashSet0, new Class[0]);
        J j0 = new J(a0, 3);
        return new s1.a(new HashSet(hashSet0), new HashSet(hashSet1), 0, 1, j0, hashSet2);
    }

    public static final M3.A m(U2.h h0, Y2.h h1, w w0, List list0, ArrayList arrayList0, w w1, boolean z) {
        Y2.f f0;
        int v = 1;
        ArrayList arrayList1 = new ArrayList(list0.size() + arrayList0.size() + (w0 == null ? 0 : 1) + 1);
        ArrayList arrayList2 = new ArrayList(x2.k.E(list0));
        for(Object object0: list0) {
            arrayList2.add(o1.a.a(((w)object0)));
        }
        arrayList1.addAll(arrayList2);
        V3.k.a(arrayList1, (w0 == null ? null : o1.a.a(w0)));
        Iterator iterator1 = arrayList0.iterator();
        int v1 = 0;
        while(true) {
            boolean z1 = iterator1.hasNext();
            f0 = Y2.g.a;
            if(!z1) {
                break;
            }
            Object object1 = iterator1.next();
            if(v1 >= 0) {
                arrayList1.add(o1.a.a(((w)object1)));
                ++v1;
                continue;
            }
            x2.j.D();
            throw null;
        }
        arrayList1.add(o1.a.a(w1));
        int v2 = arrayList0.size();
        int v3 = list0.size();
        if(w0 == null) {
            v = 0;
        }
        int v4 = v3 + v2 + v;
        X2.e e0 = z ? h0.v(v4) : h0.j("Function" + v4);
        if(w0 != null) {
            v3.c c0 = m.p;
            if(!h1.e(c0)) {
                ArrayList arrayList3 = i.d0(h1, new Y2.j(h0, c0, s.i));
                h1 = arrayList3.isEmpty() ? f0 : new Y2.i(arrayList3, 0);
            }
        }
        if(!list0.isEmpty()) {
            int v5 = list0.size();
            v3.c c1 = m.q;
            if(!h1.e(c1)) {
                l l0 = new l(v5);
                ArrayList arrayList4 = i.d0(h1, new Y2.j(h0, c1, x2.w.r(new e(U2.n.e, l0))));
                if(!arrayList4.isEmpty()) {
                    f0 = new Y2.i(arrayList4, 0);
                }
                h1 = f0;
            }
        }
        return M3.d.q(M3.c.w(h1), e0, arrayList1);
    }

    public static boolean n(X2.b b0, X2.b b1) {
        j.f(b0, "superDescriptor");
        j.f(b1, "subDescriptor");
        if(b1 instanceof i3.f && b0 instanceof u) {
            ((i3.f)b1).z0().size();
            ((u)b0).z0().size();
            List list0 = ((i3.f)b1).Y0().z0();
            j.e(list0, "getValueParameters(...)");
            List list1 = ((u)b0).a().z0();
            j.e(list1, "getValueParameters(...)");
            for(Object object0: i.v0(list0, list1)) {
                j.c(((S)((e)object0).i));
                o3.j j0 = a0.G(((u)b1), ((S)((e)object0).i));
                j.c(((S)((e)object0).j));
                if(j0 instanceof o3.i != a0.G(((u)b0), ((S)((e)object0).j)) instanceof o3.i) {
                    return true;
                }
                if(false) {
                    break;
                }
            }
        }
        return false;
    }

    public void o(Y.n n0) {
        List list0 = Collections.singletonList(n0);
        if(list0.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        Z.e e0 = new Z.e(((Z.k)this), list0);
        if(!e0.g) {
            i0.c c0 = new i0.c(e0);
            ((Z.k)this).n.k(c0);
            return;
        }
        Y.m.d().g("WM-WorkContinuationImpl", i3.e.f("Already enqueued work ids (", TextUtils.join(", ", e0.e), ")"), new Throwable[0]);
    }

    public static final v3.f p(w w0) {
        Y2.b b0 = w0.l().c(m.r);
        if(b0 == null) {
            return null;
        }
        Object object0 = i.j0(b0.b().values());
        x x0 = object0 instanceof x ? ((x)object0) : null;
        if(x0 != null) {
            String s = (String)x0.a;
            if(s != null) {
                if(!v3.f.f(s)) {
                    s = null;
                }
                return s == null ? null : v3.f.e(s);
            }
        }
        return null;
    }

    public static final d3.e q(Annotation[] arr_annotation, v3.c c0) {
        j.f(arr_annotation, "<this>");
        j.f(c0, "fqName");
        for(int v = 0; v < arr_annotation.length; ++v) {
            Annotation annotation0 = arr_annotation[v];
            if(d3.d.a(O2.A.y(O2.A.v(annotation0))).b().equals(c0)) {
                return annotation0 == null ? null : new d3.e(annotation0);
            }
        }
        return null;
    }

    public static View r(View view0, int v) {
        if(!(view0 instanceof ViewGroup)) {
            return null;
        }
        int v1 = ((ViewGroup)view0).getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view1 = ((ViewGroup)view0).getChildAt(v2).findViewById(v);
            if(view1 != null) {
                return view1;
            }
        }
        return null;
    }

    public static void s(Object object0) {
        LongSparseArray longSparseArray0;
        if(!a0.f) {
            try {
                a0.e = Class.forName("android.content.res.ThemedResourceCache");
            }
            catch(ClassNotFoundException classNotFoundException0) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", classNotFoundException0);
            }
            a0.f = true;
        }
        Class class0 = a0.e;
        if(class0 == null) {
            return;
        }
        if(!a0.h) {
            try {
                Field field0 = class0.getDeclaredField("mUnthemedEntries");
                a0.g = field0;
                field0.setAccessible(true);
            }
            catch(NoSuchFieldException noSuchFieldException0) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", noSuchFieldException0);
            }
            a0.h = true;
        }
        Field field1 = a0.g;
        if(field1 == null) {
            return;
        }
        try {
            longSparseArray0 = (LongSparseArray)field1.get(object0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", illegalAccessException0);
            longSparseArray0 = null;
        }
        if(longSparseArray0 != null) {
            longSparseArray0.clear();
        }
    }

    public static s1.a t(String s, A1.a a0) {
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet0.add(T1.a.class);
        Collections.addAll(hashSet0, new Class[0]);
        s1.j j0 = new s1.j(Context.class, 1, 0);
        if(hashSet0.contains(j0.a)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet1.add(j0);
        D1.b b0 = new D1.b(1, s, a0);
        return new s1.a(new HashSet(hashSet0), new HashSet(hashSet1), 0, 1, b0, hashSet2);
    }

    public static final ArrayList u(Annotation[] arr_annotation) {
        j.f(arr_annotation, "<this>");
        ArrayList arrayList0 = new ArrayList(arr_annotation.length);
        for(int v = 0; v < arr_annotation.length; ++v) {
            arrayList0.add(new d3.e(arr_annotation[v]));
        }
        return arrayList0;
    }

    public static final int v(S2.g g0) {
        j.f(g0, "<this>");
        return g0.s().size();
    }

    public static final List w(w w0) {
        j.f(w0, "<this>");
        a0.E(w0);
        int v = a0.h(w0);
        if(v == 0) {
            return x2.r.i;
        }
        Iterable iterable0 = w0.A0().subList(0, v);
        ArrayList arrayList0 = new ArrayList(x2.k.E(iterable0));
        for(Object object0: iterable0) {
            w w1 = ((N)object0).b();
            j.e(w1, "getType(...)");
            arrayList0.add(w1);
        }
        return arrayList0;
    }

    public static final k x(h h0) {
        if(!(h0 instanceof X2.e)) {
            return null;
        }
        if(!U2.h.H(h0)) {
            return null;
        }
        v3.e e0 = C3.e.h(h0);
        if(e0.d() && !e0.a.isEmpty()) {
            v3.c c0 = e0.g().e();
            j.e(c0, "parent(...)");
            String s = e0.f().b();
            j.e(s, "asString(...)");
            V2.m.c.getClass();
            V2.l l0 = V2.m.c.a(s, c0);
            return l0 == null ? null : l0.a;
        }
        return null;
    }

    public static String y(f f0, String s) {
        Object object0 = null;
        j.f(s, "modifiedId");
        for(Object object1: ((Iterable)f0.Q0)) {
            if(j.a(((ModifierStrings)object1).getModifierId(), s) && j.a(((ModifierStrings)object1).getContext(), "Summary")) {
                object0 = object1;
                break;
            }
        }
        String s1 = ((ModifierStrings)object0) == null ? null : ((ModifierStrings)object0).getText();
        if(s1 != null) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: ((Iterable)f0.P0)) {
                if(j.a(((ModifierArguments)object2).getModifierId(), s)) {
                    arrayList0.add(object2);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object3: arrayList0) {
                if(!j.a(((ModifierArguments)object3).getName(), "Key")) {
                    arrayList1.add(object3);
                }
            }
            ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
            for(Object object4: arrayList1) {
                arrayList2.add(new o2.o(((ModifierArguments)object4).getName(), ((ModifierArguments)object4).getValue()));
            }
            o2.o[] arr_o = (o2.o[])arrayList2.toArray(new o2.o[0]);
            return a.H(s1, Arrays.copyOf(arr_o, arr_o.length));
        }
        return null;
    }

    public static final B z(X2.e e0) {
        B b0;
        X2.e e1 = null;
        j.f(e0, "<this>");
        Iterator iterator0 = e0.k().H0().r().iterator();
    alab1:
        while(true) {
            while(true) {
                b0 = null;
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                w w0 = (w)object0;
                if(U2.h.x(w0)) {
                    break;
                }
                h h0 = w0.H0().q();
                if(!y3.d.o(h0, X2.f.i) && !y3.d.o(h0, X2.f.k)) {
                    break;
                }
                j.d(h0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                e1 = (X2.e)h0;
                break alab1;
            }
        }
        if(e1 == null) {
            return null;
        }
        F3.n n0 = e1.p0();
        if(n0 instanceof B) {
            b0 = (B)n0;
        }
        return b0 == null ? a0.z(e1) : b0;
    }
}

