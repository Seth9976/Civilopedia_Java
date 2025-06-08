package android.support.v4.media.session;

import C3.e;
import E.v;
import I2.b;
import J2.j;
import L3.n;
import M3.A;
import M3.K;
import M3.L;
import M3.N;
import M3.U;
import M3.V;
import M3.X;
import M3.Z;
import M3.a0;
import M3.w;
import N3.m;
import O2.q;
import R2.F;
import R2.g0;
import R2.m0;
import R2.v0;
import R2.x0;
import S2.r;
import S2.s;
import S2.t;
import S2.x;
import S2.y;
import U2.h;
import X2.M;
import X2.O;
import X2.T;
import X2.c;
import X2.k;
import a3.S;
import android.app.AlertDialog.Builder;
import android.graphics.Paint.FontMetricsInt;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.os.Trace;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.ActionMode.Callback;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.K0;
import com.google.android.gms.internal.play_billing.X0;
import com.google.android.gms.internal.play_billing.zzq;
import com.spears.civilopedia.db.tables.DynamicModifiers;
import com.spears.civilopedia.db.tables.GreatPersonClasses;
import com.spears.civilopedia.db.tables.GreatPersonIndividualActionModifiers;
import com.spears.civilopedia.db.tables.GreatPersonIndividuals;
import com.spears.civilopedia.db.tables.ModifierArguments;
import com.spears.civilopedia.db.tables.Modifiers;
import com.spears.civilopedia.db.tables.Units;
import com.spears.civilopedia.planning.logic.storage.MapFile;
import f2.l;
import g3.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.text.Collator;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import k3.D;
import kotlin.NoWhenBranchMatchedException;
import o2.G;
import o2.I;
import o2.o;
import o2.p;
import o2.u;
import v3.f;
import x2.i;
import y3.d;

public abstract class a implements v {
    public static long a;
    public static Method b;
    public static d3.a c;

    public static final Object A(n n0, q q0) {
        j.f(n0, "<this>");
        j.f(q0, "p");
        return n0.invoke();
    }

    public static boolean B(c c0) {
        j.f(c0, "callableMemberDescriptor");
        f f0 = c0.getName();
        if(!g.d.contains(f0)) {
            return false;
        }
        v3.c c1 = e.c(c0);
        if(i.M(g.c, c1) && c0.z0().isEmpty()) {
            return true;
        }
        if(h.z(c0)) {
            Collection collection0 = c0.s();
            j.e(collection0, "getOverriddenDescriptors(...)");
            if(!collection0.isEmpty()) {
                for(Object object0: collection0) {
                    j.c(((c)object0));
                    if(a.B(((c)object0))) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean C(X2.e e0, c c0) {
        j.f(e0, "<this>");
        j.f(c0, "specialCallableDescriptor");
        k k0 = c0.p();
        j.d(k0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        A a0 = ((X2.e)k0).k();
        j.e(a0, "getDefaultType(...)");
        X2.e e1 = d.k(e0);
        while(e1 != null) {
            if(!(e1 instanceof i3.c)) {
                A a1 = e1.k();
                if(a1 == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'subtype\' of kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckingProcedure.findCorrespondingSupertype must not be null");
                }
                ArrayDeque arrayDeque0 = new ArrayDeque();
                Z z0 = null;
                arrayDeque0.add(new m(a1, null));
                K k1 = a0.H0();
                while(!arrayDeque0.isEmpty()) {
                    m m0 = (m)arrayDeque0.poll();
                    w w0 = m0.a;
                    K k2 = w0.H0();
                    if(k2 != null) {
                        if(k1 != null) {
                            if(k2.equals(k1)) {
                                boolean z1 = w0.I0();
                                m m1 = m0.b;
                                while(m1 != null) {
                                    w w1 = m1.a;
                                    Iterable iterable0 = w1.A0();
                                    M3.d d0 = L.b;
                                    a0 a00 = a0.k;
                                    if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                                        for(Object object0: iterable0) {
                                            if(((N)object0).a() == a00) {
                                                continue;
                                            }
                                            w0 = (w)O2.A.c(new U(G.w(d0.f(w1.H0(), w1.A0()))).g(w0, a00)).b;
                                            goto label_37;
                                        }
                                    }
                                    w0 = new U(d0.f(w1.H0(), w1.A0())).g(w0, a00);
                                label_37:
                                    z1 = z1 || w1.I0();
                                    m1 = m1.b;
                                }
                                K k3 = w0.H0();
                                if(k3 != null) {
                                    if(!k3.equals(k1)) {
                                        throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + N3.g.n(k3) + ", \n\nsupertype: " + N3.g.n(k1) + " \n" + k3.equals(k1));
                                    }
                                    z0 = X.g(w0, z1);
                                    break;
                                }
                                N3.g.a(3);
                                throw null;
                            }
                            for(Object object1: k2.r()) {
                                j.c(((w)object1));
                                arrayDeque0.add(new m(((w)object1), m0));
                            }
                            continue;
                        }
                        N3.g.a(4);
                        throw null;
                    }
                    N3.g.a(3);
                    throw null;
                }
                if(z0 != null) {
                    return !h.z(e1);
                }
            }
            e1 = d.k(e1);
        }
        return false;
    }

    public static boolean D(String s) {
        j.f(s, "key");
        return O2.A.F().containsKey(s);
    }

    public static boolean E() {
        try {
            if(a.b == null) {
                return Trace.isEnabled();
            }
            goto label_2;
        }
        catch(NoSuchMethodError | NoClassDefFoundError unused_ex) {
            try {
            label_2:
                Class class0 = Trace.class;
                if(a.b == null) {
                    a.a = class0.getField("TRACE_TAG_APP").getLong(null);
                    a.b = class0.getMethod("isTagEnabled", Long.TYPE);
                }
                return ((Boolean)a.b.invoke(null, a.a)).booleanValue();
            label_8:
                if(exception0 instanceof InvocationTargetException) {
                    goto label_9;
                }
                goto label_11;
            }
            catch(Exception exception0) {
                goto label_8;
            }
        label_9:
            Throwable throwable0 = exception0.getCause();
            throw throwable0 instanceof RuntimeException ? ((RuntimeException)throwable0) : new RuntimeException(throwable0);
        label_11:
            Log.v("Trace", "Unable to call isTagEnabled via reflection", exception0);
            return false;
        }
    }

    public static boolean F(String s) {
        return s != null && s.length() != 0 ? Y3.n.M0(a.H(s, new Object[0])).toString().length() == 0 : true;
    }

    public static n2.A G(l l0, File file0) {
        String s;
        j.f(l0, "environment");
        com.google.gson.h h0 = new com.google.gson.h();
        j.f(Y3.a.a, "charset");
        InputStreamReader inputStreamReader0 = new InputStreamReader(new FileInputStream(file0), Y3.a.a);
        try {
            s = z1.a0.H(inputStreamReader0);
        }
        catch(Throwable throwable0) {
            o1.a.e(inputStreamReader0, throwable0);
            throw throwable0;
        }
        inputStreamReader0.close();
        Class class0 = MapFile.class;
        Object object0 = h0.b(s, class0);
        if(class0 == Integer.TYPE) {
            class0 = Integer.class;
        }
        else if(class0 == Float.TYPE) {
            class0 = Float.class;
        }
        else if(class0 == Byte.TYPE) {
            class0 = Byte.class;
        }
        else if(class0 == Double.TYPE) {
            class0 = Double.class;
        }
        else if(class0 == Long.TYPE) {
            class0 = Long.class;
        }
        else if(class0 == Character.TYPE) {
            class0 = Character.class;
        }
        else if(class0 == Boolean.TYPE) {
            class0 = Boolean.class;
        }
        else if(class0 == Short.TYPE) {
            class0 = Short.class;
        }
        else if(class0 == Void.TYPE) {
            class0 = Void.class;
        }
        n2.A a0 = ((MapFile)class0.cast(object0)).a(l0);
        a0.e = file0;
        return a0;
    }

    public static String H(String s, Object[] arr_object) {
        p p0;
        j.f(s, "key");
        j.f(arr_object, "args");
        String s1 = o1.a.B(s);
        if(s1 != null) {
            s = s1;
        }
        ArrayList arrayList0 = new ArrayList(arr_object.length);
        for(int v = 0; v < arr_object.length; ++v) {
            Object object0 = arr_object[v];
            if(object0 instanceof String) {
                p0 = new u(((String)object0));
            }
            else if(object0 instanceof Double) {
                p0 = new o2.d(((Number)object0).doubleValue());
            }
            else if(object0 instanceof Integer) {
                p0 = new o2.n(((Number)object0).intValue());
            }
            else if(object0 instanceof o) {
                p0 = (p)object0;
            }
            else {
                p0 = new o2.n(0);
            }
            arrayList0.add(p0);
        }
        return o1.a.K(s, arrayList0);
    }

    public static String I(String s) {
        return s == null || s.length() == 0 ? null : a.H(s, new Object[0]);
    }

    public static c2.d J(b b0) {
        c2.c c0 = new c2.c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c0.a = NaNf;
        c0.i = true;
        b0.b(c0);
        return new c2.d(c0.a, c0.b, c0.c, c0.d, c0.e, c0.f, c0.g, c0.h, c0.i);
    }

    public static LinkedHashSet K(f f0, Collection collection0, Collection collection1, X2.e e0, I3.l l0, y3.k k0, boolean z) {
        if(f0 != null) {
            if(collection0 != null) {
                if(e0 != null) {
                    if(l0 != null) {
                        if(k0 != null) {
                            LinkedHashSet linkedHashSet0 = new LinkedHashSet();
                            k0.h(f0, collection0, collection1, e0, new h3.a(l0, linkedHashSet0, z));
                            return linkedHashSet0;
                        }
                        a.d(17);
                        throw null;
                    }
                    a.d(16);
                    throw null;
                }
                a.d(15);
                throw null;
            }
            a.d(13);
            throw null;
        }
        a.d(12);
        throw null;
    }

    public static LinkedHashSet L(f f0, AbstractCollection abstractCollection0, Collection collection0, X2.e e0, I3.l l0, y3.k k0) {
        if(f0 != null) {
            if(e0 != null) {
                if(l0 != null) {
                    if(k0 != null) {
                        return a.K(f0, abstractCollection0, collection0, e0, l0, k0, false);
                    }
                    a.d(5);
                    throw null;
                }
                a.d(4);
                throw null;
            }
            a.d(3);
            throw null;
        }
        a.d(0);
        throw null;
    }

    public static LinkedHashSet M(f f0, Collection collection0, AbstractCollection abstractCollection0, k3.i i0, c3.d d0, y3.k k0) {
        if(f0 != null) {
            if(collection0 != null) {
                if(i0 != null) {
                    if(d0 != null) {
                        if(k0 != null) {
                            return a.K(f0, collection0, abstractCollection0, i0, d0, k0, true);
                        }
                        a.d(11);
                        throw null;
                    }
                    a.d(10);
                    throw null;
                }
                a.d(9);
                throw null;
            }
            a.d(7);
            throw null;
        }
        a.d(6);
        throw null;
    }

    public static void N(TextView textView0, int v) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        if(Build.VERSION.SDK_INT >= 28) {
            textView0.setFirstBaselineToTopHeight(v);
            return;
        }
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.top : paint$FontMetricsInt0.ascent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), v + v1, textView0.getPaddingRight(), textView0.getPaddingBottom());
        }
    }

    public static void O(TextView textView0, int v) {
        if(v < 0) {
            throw new IllegalArgumentException();
        }
        Paint.FontMetricsInt paint$FontMetricsInt0 = textView0.getPaint().getFontMetricsInt();
        int v1 = textView0.getIncludeFontPadding() ? paint$FontMetricsInt0.bottom : paint$FontMetricsInt0.descent;
        if(v > Math.abs(v1)) {
            textView0.setPadding(textView0.getPaddingLeft(), textView0.getPaddingTop(), textView0.getPaddingRight(), v - v1);
        }
    }

    public static l3.a P(V v0, boolean z, D d0, int v1) {
        boolean z1 = (v1 & 1) == 0 ? z : false;
        boolean z2 = (v1 & 2) == 0;
        if((v1 & 4) != 0) {
            d0 = null;
        }
        return d0 == null ? new l3.a(v0, z2, z1, null, 34) : new l3.a(v0, z2, z1, I.s(d0), 34);
    }

    public static String Q(String s) {
        j.f(s, "key");
        String s1 = a.H(s, new Object[0]);
        Locale locale0 = Locale.getDefault();
        j.e(locale0, "getDefault(...)");
        String s2 = s1.toUpperCase(locale0);
        j.e(s2, "toUpperCase(...)");
        return s2;
    }

    public static ActionMode.Callback R(ActionMode.Callback actionMode$Callback0, TextView textView0) {
        return Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 27 && !(actionMode$Callback0 instanceof G.f) && actionMode$Callback0 != null ? new G.f(actionMode$Callback0, textView0) : actionMode$Callback0;
    }

    public abstract void S(X0 arg1, X0 arg2);

    public abstract void T(X0 arg1, Thread arg2);

    public static void U(Object object0, Object object1) {
        if(object0 == null) {
            throw new NullPointerException("null key in entry: null=" + object1);
        }
        if(object1 == null) {
            throw new NullPointerException(i3.e.f("null value in entry: ", object0.toString(), "=null"));
        }
    }

    public abstract boolean V(zzq arg1, K0 arg2, K0 arg3);

    public abstract boolean W(zzq arg1, Object arg2, Object arg3);

    public abstract boolean X(zzq arg1, X0 arg2, X0 arg3);

    @Override  // E.v
    public void b(View view0) {
    }

    @Override  // E.v
    public void c() {
    }

    public static void d(int v) {
        Object[] arr_object = new Object[(v == 18 ? 2 : 3)];
        switch(v) {
            case 1: 
            case 7: 
            case 13: {
                arr_object[0] = "membersFromSupertypes";
                break;
            }
            case 2: 
            case 8: 
            case 14: {
                arr_object[0] = "membersFromCurrent";
                break;
            }
            case 3: 
            case 9: 
            case 15: {
                arr_object[0] = "classDescriptor";
                break;
            }
            case 4: 
            case 10: 
            case 16: {
                arr_object[0] = "errorReporter";
                break;
            }
            case 5: 
            case 11: 
            case 17: {
                arr_object[0] = "overridingUtil";
                break;
            }
            case 18: {
                arr_object[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            }
            case 20: {
                arr_object[0] = "annotationClass";
                break;
            }
            default: {
                arr_object[0] = "name";
            }
        }
        arr_object[1] = v == 18 ? "resolveOverrides" : "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        switch(v) {
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                arr_object[2] = "resolveOverridesForStaticMembers";
                break;
            }
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: {
                arr_object[2] = "resolveOverrides";
                break;
            }
            case 18: {
                break;
            }
            case 19: 
            case 20: {
                arr_object[2] = "getAnnotationParameterByName";
                break;
            }
            default: {
                arr_object[2] = "resolveOverridesForNonStaticMembers";
            }
        }
        String s = String.format((v == 18 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"), arr_object);
        IllegalArgumentException illegalArgumentException0 = v == 18 ? new IllegalStateException(s) : new IllegalArgumentException(s);
        throw illegalArgumentException0;
    }

    public static final S2.g e(g0 g00, boolean z) {
        R2.j j0;
        Method method2;
        t3.c c0;
        m0 m00 = g00.t();
        F.i.getClass();
        j.f(m00.n, "input");
        if(((Pattern)F.i.j).matcher(m00.n).matches()) {
            return S2.A.a;
        }
        O2.A a0 = v0.b(g00.t().t());
        if(a0 instanceof R2.m) {
            t3.e e0 = ((R2.m)a0).k;
            Method method0 = null;
            if(!z) {
                c0 = (e0.j & 8) == 8 ? e0.n : null;
            }
            else if((e0.j & 4) == 4) {
                c0 = e0.m;
            }
            else {
                c0 = null;
            }
            if(c0 != null) {
                m0 m01 = g00.t();
                String s = ((R2.m)a0).l.getString(c0.k);
                String s1 = ((R2.m)a0).l.getString(c0.l);
                method0 = m01.l.d(s, s1);
            }
            if(method0 == null) {
                if(y3.f.d(g00.t().t()) && j.a(g00.t().t().c(), X2.p.d)) {
                    Class class0 = O2.A.d0(g00.t().t().p());
                    if(class0 == null) {
                        throw new H2.a("Underlying property of inline class " + g00.t() + " should have a field", 1);
                    }
                    Method method1 = O2.A.x(class0, g00.t().t());
                    return g00.r() ? O2.A.q(new x(method1, a.q(g00)), g00.s(), false) : O2.A.q(new y(method1, G.p(method1.getDeclaringClass())), g00.s(), false);  // 初始化器: LS2/z;-><init>(Ljava/lang/reflect/Method;Ljava/util/List;)V
                }
                Field field0 = (Field)((w2.c)g00.t().p).getValue();
                if(field0 == null) {
                    throw new H2.a("No accessors or field is found for property " + g00.t(), 1);
                }
                return O2.A.q(a.i(g00, z, field0), g00.s(), false);
            }
            if(!Modifier.isStatic(method0.getModifiers())) {
                return g00.r() ? O2.A.q(new r(method0, a.q(g00)), g00.s(), false) : O2.A.q(new S2.v(0, method0), g00.s(), false);
            }
            if(g00.t().t().l().e(x0.a)) {
                return g00.r() ? O2.A.q(new s(method0), g00.s(), false) : O2.A.q(new S2.v(1, method0), g00.s(), false);
            }
            return g00.r() ? O2.A.q(new t(method0, a.q(g00)), g00.s(), false) : O2.A.q(new S2.v(2, method0), g00.s(), false);
        }
        if(a0 instanceof R2.k) {
            return O2.A.q(a.i(g00, z, ((R2.k)a0).i), g00.s(), false);
        }
        if(a0 instanceof R2.l) {
            if(z) {
                method2 = ((R2.l)a0).i;
                return g00.r() ? O2.A.q(new r(method2, a.q(g00)), g00.s(), false) : O2.A.q(new S2.v(0, method2), g00.s(), false);
            }
            method2 = ((R2.l)a0).j;
            if(method2 == null) {
                throw new H2.a("No source found for setter of Java method property: " + ((R2.l)a0).i, 1);
            }
            return g00.r() ? O2.A.q(new r(method2, a.q(g00)), g00.s(), false) : O2.A.q(new S2.v(0, method2), g00.s(), false);
        }
        if(!(a0 instanceof R2.n)) {
            throw new NoWhenBranchMatchedException();
        }
        if(z) {
            j0 = ((R2.n)a0).i;
        }
        else {
            j0 = ((R2.n)a0).j;
            if(j0 == null) {
                throw new H2.a("No setter found for property " + g00.t(), 1);
            }
        }
        Method method3 = g00.t().l.d(j0.k.c, j0.k.d);
        if(method3 == null) {
            throw new H2.a("No accessor found for property " + g00.t(), 1);
        }
        Modifier.isStatic(method3.getModifiers());
        return g00.r() ? new r(method3, a.q(g00)) : new S2.v(0, method3);
    }

    public static void f(Object object0, StringBuilder stringBuilder0) {
        if(object0 == null) {
            stringBuilder0.append("null");
            return;
        }
        String s = object0.getClass().getSimpleName();
        if(s.length() <= 0) {
            s = object0.getClass().getName();
            int v = s.lastIndexOf(46);
            if(v > 0) {
                s = s.substring(v + 1);
            }
        }
        stringBuilder0.append(s);
        stringBuilder0.append('{');
        stringBuilder0.append(Integer.toHexString(System.identityHashCode(object0)));
    }

    public static int g(String s, String s1) {
        j.f(s, "a");
        j.f(s1, "b");
        return Collator.getInstance().compare(s, s1);
    }

    public static final Y2.h h(Y2.h h0, Y2.h h1) {
        j.f(h0, "first");
        j.f(h1, "second");
        if(h0.isEmpty()) {
            return h1;
        }
        return !h1.isEmpty() ? new Y2.i(new Y2.h[]{h0, h1}) : h0;
    }

    public static final S2.w i(g0 g00, boolean z, Field field0) {
        M m0 = g00.t().t();
        k k0 = m0.p();
        j.e(k0, "getContainingDeclaration(...)");
        if(d.m(k0)) {
            k k1 = k0.p();
            if((d.o(k1, X2.f.j) || d.o(k1, X2.f.m)) && (!(m0 instanceof K3.v) || !u3.h.d(((K3.v)m0).I))) {
                goto label_6;
            }
            goto label_7;
        }
    label_6:
        if(!Modifier.isStatic(field0.getModifiers())) {
        label_7:
            if(z) {
                if(g00.r()) {
                    return new S2.j(field0, a.q(g00));
                }
                j.f(field0, "field");
                return new S2.l(field0, true, 0);
            }
            if(g00.r()) {
                return new S2.n(field0, a.j(g00), a.q(g00));
            }
            boolean z1 = a.j(g00);
            j.f(field0, "field");
            return new S2.p(field0, z1, true, 0);
        }
        if(g00.t().t().l().e(x0.a)) {
            if(z) {
                return g00.r() ? new S2.k(field0, false) : new S2.l(field0, true, 1);  // 初始化器: LS2/m;-><init>(Ljava/lang/reflect/Field;Z)V
            }
            return g00.r() ? new S2.o(field0, a.j(g00), false) : new S2.p(field0, a.j(g00), true, 1);  // 初始化器: LS2/q;-><init>(Ljava/lang/reflect/Field;ZZ)V
        }
        return z ? new S2.l(field0, false, 2) : new S2.p(field0, a.j(g00), false, 2);
    }

    public static final boolean j(g0 g00) {
        return !X.e(g00.t().t().getType());
    }

    public static AlertDialog.Builder k(f2.j j0, I2.a a0) {
        new AlertDialog.Builder(j0);
        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(new ContextThemeWrapper(j0, 0x7F0F0002)).setMessage(a.H("LOC_CONFIRM_LOAD_TXT", new Object[0])).setNegativeButton(a.H("LOC_NO_BUTTON", new Object[0]), null).setPositiveButton(a.H("LOC_YES_BUTTON", new Object[0]), new f2.b(a0));  // style:AlertDialogTheme
        j.e(alertDialog$Builder0, "setPositiveButton(...)");
        return alertDialog$Builder0;
    }

    public static final P3.h l(a0 a00) {
        switch(a00.ordinal()) {
            case 0: {
                return P3.h.l;
            }
            case 1: {
                return P3.h.j;
            }
            case 2: {
                return P3.h.k;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static V2.f m(V2.c c0, boolean z) {
        String s1;
        j.f(c0, "functionClass");
        V2.f f0 = new V2.f(c0, null, 1, z);
        a3.v v0 = c0.F0();
        x2.r r0 = x2.r.i;
        List list0 = c0.s;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list0) {
            if(((T)object0).b0() != a0.l) {
                break;
            }
            arrayList0.add(object0);
        }
        X3.o o0 = i.u0(arrayList0);
        ArrayList arrayList1 = new ArrayList(x2.k.E(o0));
        Iterator iterator1 = o0.iterator();
        while(((X3.b)iterator1).j.hasNext()) {
            x2.u u0 = (x2.u)((X3.b)iterator1).next();
            int v1 = u0.a;
            T t0 = (T)u0.b;
            String s = t0.getName().b();
            j.e(s, "asString(...)");
            if(s.equals("T")) {
                s1 = "instance";
            }
            else if(s.equals("E")) {
                s1 = "receiver";
            }
            else {
                s1 = s.toLowerCase(Locale.ROOT);
                j.e(s1, "toLowerCase(...)");
            }
            f f1 = f.e(s1);
            A a0 = t0.k();
            j.e(a0, "getDefaultType(...)");
            arrayList1.add(new S(f0, null, v1, Y2.g.a, f1, a0, false, false, false, null, O.b));
        }
        f0.Z0(null, v0, r0, r0, arrayList1, ((T)i.a0(list0)).k(), X2.y.m, X2.p.e);
        f0.E = true;
        return f0;
    }

    public static final Object n(Class class0, Map map0, List list0) {
        j.f(class0, "annotationClass");
        j.f(list0, "methods");
        w2.h h0 = new w2.h(new A3.m(map0, 18));
        w2.h h1 = new w2.h(new I3.A(6, class0, map0));
        Object object0 = Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, new S2.d(class0, map0, h1, h0, list0));
        j.d(object0, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt.createAnnotationInstance");
        return object0;
    }

    public static ArrayList o(o2.f f0, String s) {
        j.f(s, "id");
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: ((List)f0.c0.i)) {
            if(j.a(((DynamicModifiers)object0).getEffectType(), "EFFECT_GRANT_FREE_RESOURCE_IN_CITY")) {
                arrayList1.add(object0);
            }
        }
        ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
        for(Object object1: arrayList1) {
            arrayList2.add(((DynamicModifiers)object1).getModifierType());
        }
        HashSet hashSet0 = new HashSet(arrayList2);
        HashSet hashSet1 = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for(Object object2: ((List)f0.R0.i)) {
            if(hashSet0.contains(((Modifiers)object2).getModifierType())) {
                arrayList3.add(object2);
            }
        }
        boolean z = false;
        for(Object object3: arrayList3) {
            Modifiers modifiers0 = (Modifiers)object3;
            ArrayList arrayList4 = new ArrayList();
            for(Object object4: ((Iterable)f0.P0)) {
                ModifierArguments modifierArguments0 = (ModifierArguments)object4;
                if(j.a(modifierArguments0.getModifierId(), modifiers0.getModifierId()) && j.a(modifierArguments0.getName(), "ResourceType") && j.a(modifierArguments0.getValue(), s)) {
                    arrayList4.add(object4);
                }
            }
            for(Object object5: arrayList4) {
                ModifierArguments modifierArguments1 = (ModifierArguments)object5;
                hashSet1.add(modifiers0.getModifierId());
                z = true;
            }
        }
        if(z) {
            for(Object object6: ((List)f0.u0)) {
                GreatPersonIndividualActionModifiers greatPersonIndividualActionModifiers0 = (GreatPersonIndividualActionModifiers)object6;
                if(hashSet1.contains(greatPersonIndividualActionModifiers0.getModifierId())) {
                    GreatPersonIndividuals greatPersonIndividuals0 = (GreatPersonIndividuals)f0.w0.h(greatPersonIndividualActionModifiers0.getGreatPersonIndividualType());
                    if(greatPersonIndividuals0 != null) {
                        GreatPersonClasses greatPersonClasses0 = (GreatPersonClasses)f0.t0.h(greatPersonIndividuals0.getGreatPersonClassType());
                        if(greatPersonClasses0 != null) {
                            Units units0 = (Units)f0.O1.h(greatPersonClasses0.getUnitType());
                            if(units0 != null) {
                                arrayList0.add(new o2.k(A.f.h("ICON_", units0.getUnitType()), greatPersonIndividuals0.getName(), greatPersonIndividualActionModifiers0.getGreatPersonIndividualType(), null));
                            }
                        }
                    }
                }
            }
        }
        return arrayList0;
    }

    public static S p(f f0, X2.e e0) {
        if(f0 != null) {
            if(e0 != null) {
                Collection collection0 = e0.g();
                if(collection0.size() != 1) {
                    return null;
                }
                Object object0 = collection0.iterator().next();
                for(Object object1: ((a3.i)object0).z0()) {
                    S s0 = (S)object1;
                    if(s0.getName().equals(f0)) {
                        return s0;
                    }
                    if(false) {
                        break;
                    }
                }
                return null;
            }
            a.d(20);
            throw null;
        }
        a.d(19);
        throw null;
    }

    public static final Object q(g0 g00) {
        j.f(g00, "<this>");
        m0 m00 = g00.t();
        M m0 = m00.t();
        return O2.A.k(m00.o, m0);
    }

    public static final v3.b r(s3.f f0, int v) {
        j.f(f0, "<this>");
        return v3.b.e(f0.b(v), f0.a(v));
    }

    public static Collection s(F3.p p0, F3.f f0, int v) {
        if((v & 1) != 0) {
            f0 = F3.f.m;
        }
        F3.n.a.getClass();
        return p0.g(f0, F3.k.j);
    }

    public static final Field t(q q0) {
        j.f(q0, "<this>");
        m0 m00 = x0.c(q0);
        return m00 == null ? null : ((Field)((w2.c)m00.p).getValue());
    }

    public static final Method u(O2.f f0) {
        j.f(f0, "<this>");
        R2.r r0 = x0.a(f0);
        if(r0 != null) {
            S2.g g0 = r0.i();
            if(g0 != null) {
                Member member0 = g0.t();
                return member0 instanceof Method ? ((Method)member0) : null;
            }
        }
        return null;
    }

    public static final String v(X2.u u0) {
        c c0 = h.z(u0) ? a.x(u0) : null;
        if(c0 != null) {
            c c1 = e.k(c0);
            if(c1 instanceof M) {
                h.z(c1);
                c c2 = e.b(e.k(c1), g3.e.l);
                if(c2 != null) {
                    v3.c c3 = e.g(c2);
                    f f0 = (f)((Map)g.a).get(c3);
                    return f0 == null ? null : f0.b();
                }
            }
            else if(c1 instanceof a3.L) {
                String s = I.i(((a3.L)c1));
                f f1 = s == null ? null : ((f)g3.G.i.get(s));
                return f1 == null ? null : f1.b();
            }
        }
        return null;
    }

    public static final f w(s3.f f0, int v) {
        j.f(f0, "<this>");
        return f.d(f0.getString(v));
    }

    public static final c x(c c0) {
        j.f(c0, "<this>");
        f f0 = c0.getName();
        if(!g3.G.j.contains(f0)) {
            f f1 = e.k(c0).getName();
            if(!g.d.contains(f1)) {
                return null;
            }
        }
        if((c0 instanceof M ? true : c0 instanceof X2.L)) {
            return e.b(c0, g3.e.n);
        }
        return c0 instanceof a3.L ? e.b(c0, g3.e.o) : null;
    }

    public static final c y(c c0) {
        j.f(c0, "<this>");
        c c1 = a.x(c0);
        if(c1 != null) {
            return c1;
        }
        f f0 = c0.getName();
        j.e(f0, "getName(...)");
        return g3.f.b(f0) ? e.b(c0, g3.e.p) : null;
    }

    public static C.c z(l.N n0) {
        int v2;
        int v1;
        int v = Build.VERSION.SDK_INT;
        if(v >= 28) {
            return new C.c(n0.getTextMetricsParams());
        }
        TextPaint textPaint0 = new TextPaint(n0.getPaint());
        boolean z = false;
        if(v >= 23) {
            v1 = 1;
            v2 = 1;
        }
        else {
            v1 = 0;
            v2 = 0;
        }
        TextDirectionHeuristic textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        if(v >= 23) {
            v1 = n0.getBreakStrategy();
            v2 = n0.getHyphenationFrequency();
        }
        if(n0.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return new C.c(textPaint0, TextDirectionHeuristics.LTR, v1, v2);
        }
        if(v >= 28 && (n0.getInputType() & 15) == 3) {
            switch(Character.getDirectionality(DecimalFormatSymbols.getInstance(n0.getTextLocale()).getDigitStrings()[0].codePointAt(0))) {
                case 1: 
                case 2: {
                    return new C.c(textPaint0, TextDirectionHeuristics.RTL, v1, v2);
                }
                default: {
                    return new C.c(textPaint0, TextDirectionHeuristics.LTR, v1, v2);
                }
            }
        }
        if(n0.getLayoutDirection() == 1) {
            z = true;
        }
        switch(n0.getTextDirection()) {
            case 2: {
                textDirectionHeuristic0 = TextDirectionHeuristics.ANYRTL_LTR;
                break;
            }
            case 3: {
                return new C.c(textPaint0, TextDirectionHeuristics.LTR, v1, v2);
            }
            case 4: {
                return new C.c(textPaint0, TextDirectionHeuristics.RTL, v1, v2);
            }
            case 5: {
                return new C.c(textPaint0, TextDirectionHeuristics.LOCALE, v1, v2);
            }
            case 6: {
                break;
            }
            case 7: {
                return new C.c(textPaint0, TextDirectionHeuristics.FIRSTSTRONG_RTL, v1, v2);
            }
            default: {
                return z ? new C.c(textPaint0, TextDirectionHeuristics.FIRSTSTRONG_RTL, v1, v2) : new C.c(textPaint0, textDirectionHeuristic0, v1, v2);
            }
        }
        return new C.c(textPaint0, textDirectionHeuristic0, v1, v2);
    }
}

