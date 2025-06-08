package o3;

import J2.j;
import K3.x;
import M3.w;
import O2.q;
import X2.L;
import X2.M;
import X2.e;
import X2.m;
import X2.o;
import X2.u;
import X2.y;
import a3.A;
import a3.C;
import a3.G;
import a3.I;
import a3.J;
import a3.K;
import a3.S;
import a3.f;
import a3.h;
import a3.i;
import a3.v;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONException;
import org.json.JSONObject;
import v1.b;
import w1.a;
import w3.z;
import x3.d;
import x3.g;
import x3.p;

public final class k implements m, Continuation, b, a {
    public Object i;

    public k(Object object0) {
        this.i = object0;
        super();
    }

    @Override  // X2.m
    public Object B(i i0, Object object0) {
        boolean z;
        g g0 = (g)this.i;
        g0.getClass();
        g0.w(((StringBuilder)object0), i0, null);
        x3.k k0 = g0.a;
        q[] arr_q = x3.k.X;
        if(!((Boolean)k0.o.a(arr_q[13], k0)).booleanValue() && i0.I().f() == y.k) {
            z = false;
        }
        else {
            o o0 = i0.c();
            j.e(o0, "getVisibility(...)");
            z = g0.e0(o0, ((StringBuilder)object0));
        }
        g0.G(i0, ((StringBuilder)object0));
        boolean z1 = ((Boolean)k0.P.a(arr_q[40], k0)).booleanValue();
        boolean z2 = i0.L;
        boolean z3 = z1 || !z2 || z;
        if(z3) {
            ((StringBuilder)object0).append(g0.F("constructor"));
        }
        e e0 = i0.Y0();
        j.e(e0, "getContainingDeclaration(...)");
        if(((Boolean)k0.A.a(arr_q[25], k0)).booleanValue()) {
            if(z3) {
                ((StringBuilder)object0).append(" ");
            }
            g0.M(e0, ((StringBuilder)object0), true);
            g0.a0(i0.u(), ((StringBuilder)object0), false);
        }
        List list0 = i0.z0();
        j.e(list0, "getValueParameters(...)");
        g0.d0(list0, i0.Q(), ((StringBuilder)object0));
        if(((Boolean)k0.q.a(arr_q[15], k0)).booleanValue() && !z2) {
            i i1 = e0.o0();
            if(i1 != null) {
                List list1 = i1.z0();
                j.e(list1, "getValueParameters(...)");
                ArrayList arrayList0 = new ArrayList();
                for(Object object1: list1) {
                    if(!((S)object1).N0() && ((S)object1).r == null) {
                        arrayList0.add(object1);
                    }
                }
                if(!arrayList0.isEmpty()) {
                    ((StringBuilder)object0).append(" : ");
                    ((StringBuilder)object0).append(g0.F("this"));
                    ((StringBuilder)object0).append(x2.i.Y(arrayList0, ", ", "(", ")", d.t, 24));
                }
            }
        }
        if(((Boolean)k0.A.a(x3.k.X[25], k0)).booleanValue()) {
            g0.f0(((StringBuilder)object0), i0.u());
        }
        return w2.k.a;
    }

    @Override  // X2.m
    public Object E(h h0, Object object0) {
        ((g)this.i).Y(h0, ((StringBuilder)object0), true);
        return w2.k.a;
    }

    @Override  // X2.m
    public Object I(I i0, Object object0) {
        j.f(i0, "descriptor");
        g.l(((g)this.i), i0, ((StringBuilder)object0));
        return w2.k.a;
    }

    @Override  // X2.m
    public Object J(u u0, Object object0) {
        this.h(u0, ((StringBuilder)object0));
        return w2.k.a;
    }

    @Override  // w1.a
    public void a(x1.j j0) {
        this.i = j0;
        if(Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override  // v1.b
    public void b(String s, Bundle bundle0) {
        x1.j j0 = (x1.j)this.i;
        if(j0 != null) {
            try {
                j0.a.getClass();
                x1.i i0 = j0.a.g;
                i0.getClass();
                x1.g g0 = new x1.g(i0, System.currentTimeMillis() - j0.a.d, "$A$:" + k.g(s, bundle0));
                i0.d.q(g0);
            }
            catch(JSONException unused_ex) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    public void c(w3.e e0) {
        if(e0.l()) {
            int[] arr_v = z.p;
            int v = Arrays.binarySearch(arr_v, e0.size());
            if(v < 0) {
                v = -2 - v;
            }
            int v1 = arr_v[v + 1];
            Stack stack0 = (Stack)this.i;
            if(!stack0.isEmpty() && ((w3.e)stack0.peek()).size() < v1) {
                int v2 = arr_v[v];
                w3.e e1;
                for(e1 = (w3.e)stack0.pop(); !stack0.isEmpty() && ((w3.e)stack0.peek()).size() < v2; e1 = new z(((w3.e)stack0.pop()), e1)) {
                }
                z z0;
                for(z0 = new z(e1, e0); !stack0.isEmpty(); z0 = new z(((w3.e)stack0.pop()), z0)) {
                    int[] arr_v1 = z.p;
                    int v3 = Arrays.binarySearch(arr_v1, z0.j);
                    if(v3 < 0) {
                        v3 = -2 - v3;
                    }
                    int v4 = arr_v1[v3 + 1];
                    if(((w3.e)stack0.peek()).size() >= v4) {
                        break;
                    }
                }
                stack0.push(z0);
                return;
            }
            stack0.push(e0);
            return;
        }
        if(e0 instanceof z) {
            this.c(((z)e0).k);
            this.c(((z)e0).l);
            return;
        }
        String s = String.valueOf(e0.getClass());
        throw new IllegalArgumentException(i3.e.h(new StringBuilder(s.length() + 49), "Has a new type of ByteString been created? Found ", s));
    }

    @Override  // X2.m
    public Object d(A a0, Object object0) {
        ((g)this.i).M(a0, ((StringBuilder)object0), true);
        return w2.k.a;
    }

    @Override  // X2.m
    public Object e(K k0, Object object0) {
        this.i(k0, ((StringBuilder)object0), "setter");
        return w2.k.a;
    }

    @Override  // X2.m
    public Object f(f f0, Object object0) {
        g g0 = (g)this.i;
        g0.getClass();
        g0.w(((StringBuilder)object0), f0, null);
        j.e(f0.n, "getVisibility(...)");
        g0.e0(f0.n, ((StringBuilder)object0));
        g0.H(f0, ((StringBuilder)object0));
        ((StringBuilder)object0).append(g0.F("typealias"));
        ((StringBuilder)object0).append(" ");
        g0.M(f0, ((StringBuilder)object0), true);
        g0.a0(f0.t(), ((StringBuilder)object0), false);
        g0.x(f0, ((StringBuilder)object0));
        ((StringBuilder)object0).append(" = ");
        ((StringBuilder)object0).append(g0.V(((x)f0).O0()));
        return w2.k.a;
    }

    public static String g(String s, Bundle bundle0) {
        JSONObject jSONObject0 = new JSONObject();
        JSONObject jSONObject1 = new JSONObject();
        for(Object object0: bundle0.keySet()) {
            jSONObject1.put(((String)object0), bundle0.get(((String)object0)));
        }
        jSONObject0.put("name", s);
        jSONObject0.put("parameters", jSONObject1);
        return jSONObject0.toString();
    }

    public void h(u u0, StringBuilder stringBuilder0) {
        boolean z2;
        g g0 = (g)this.i;
        boolean z = g0.p();
        x3.k k0 = g0.a;
        if(!z) {
            q[] arr_q = x3.k.X;
            if(!((Boolean)k0.g.a(arr_q[5], k0)).booleanValue()) {
                g0.w(stringBuilder0, u0, null);
                List list0 = u0.T();
                j.e(list0, "getContextReceiverParameters(...)");
                g0.z(stringBuilder0, list0);
                o o0 = u0.c();
                j.e(o0, "getVisibility(...)");
                g0.e0(o0, stringBuilder0);
                g0.J(u0, stringBuilder0);
                if(((Boolean)k0.S.a(arr_q[43], k0)).booleanValue()) {
                    g0.H(u0, stringBuilder0);
                }
                boolean z1 = false;
                g0.P(u0, stringBuilder0);
                if(((Boolean)k0.S.a(arr_q[43], k0)).booleanValue()) {
                    if(u0.i0()) {
                        z2 = true;
                        Collection collection0 = u0.s();
                        j.e(collection0, "getOverriddenDescriptors(...)");
                        if(!collection0.isEmpty()) {
                            for(Object object0: collection0) {
                                if(((u)object0).i0()) {
                                    if(((Boolean)k0.O.a(x3.k.X[39], k0)).booleanValue()) {
                                        break;
                                    }
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                    }
                    else {
                        z2 = false;
                    }
                    if(u0.B0()) {
                        Collection collection1 = u0.s();
                        j.e(collection1, "getOverriddenDescriptors(...)");
                        if(!collection1.isEmpty()) {
                            for(Object object1: collection1) {
                                if(!((u)object1).B0()) {
                                    continue;
                                }
                                if(((Boolean)k0.O.a(x3.k.X[39], k0)).booleanValue()) {
                                    z1 = true;
                                }
                                goto label_46;
                            }
                        }
                        z1 = true;
                    }
                label_46:
                    g0.K(stringBuilder0, u0.h0(), "tailrec");
                    g0.K(stringBuilder0, u0.n(), "suspend");
                    g0.K(stringBuilder0, u0.o(), "inline");
                    g0.K(stringBuilder0, z1, "infix");
                    g0.K(stringBuilder0, z2, "operator");
                }
                else {
                    g0.K(stringBuilder0, u0.n(), "suspend");
                }
                g0.G(u0, stringBuilder0);
                if(g0.s()) {
                    if(u0.f0()) {
                        stringBuilder0.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if(u0.r0()) {
                        stringBuilder0.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            stringBuilder0.append(g0.F("fun"));
            stringBuilder0.append(" ");
            List list1 = u0.u();
            j.e(list1, "getTypeParameters(...)");
            g0.a0(list1, stringBuilder0, true);
            g0.S(u0, stringBuilder0);
        }
        g0.M(u0, stringBuilder0, true);
        List list2 = u0.z0();
        j.e(list2, "getValueParameters(...)");
        g0.d0(list2, u0.Q(), stringBuilder0);
        g0.T(u0, stringBuilder0);
        w w0 = u0.r();
        if(!((Boolean)k0.l.a(x3.k.X[10], k0)).booleanValue() && (((Boolean)k0.k.a(x3.k.X[9], k0)).booleanValue() || w0 == null || !U2.h.D(w0, U2.m.d))) {
            stringBuilder0.append(": ");
            stringBuilder0.append((w0 == null ? "[NULL]" : g0.V(w0)));
        }
        List list3 = u0.u();
        j.e(list3, "getTypeParameters(...)");
        g0.f0(stringBuilder0, list3);
    }

    public void i(L l0, StringBuilder stringBuilder0, String s) {
        g g0 = (g)this.i;
        switch(((p)g0.a.H.a(x3.k.X[0x20], g0.a)).ordinal()) {
            case 0: {
                g0.H(l0, stringBuilder0);
                stringBuilder0.append(s + " for ");
                M m0 = ((G)l0).M0();
                j.e(m0, "getCorrespondingProperty(...)");
                g.l(g0, m0, stringBuilder0);
                return;
            }
            case 1: {
                this.h(l0, stringBuilder0);
            }
        }
    }

    @Override  // X2.m
    public Object l(S s0, Object object0) {
        ((g)this.i).c0(s0, true, ((StringBuilder)object0), true);
        return w2.k.a;
    }

    @Override  // X2.m
    public Object m(J j0, Object object0) {
        this.i(j0, ((StringBuilder)object0), "getter");
        return w2.k.a;
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        return ((Callable)this.i).call();
    }

    @Override  // X2.m
    public Object u(C c0, Object object0) {
        g g0 = (g)this.i;
        g0.getClass();
        g0.Q(c0.m, "package-fragment", ((StringBuilder)object0));
        if(g0.a.l()) {
            ((StringBuilder)object0).append(" in ");
            g0.M(c0.M0(), ((StringBuilder)object0), false);
        }
        return w2.k.a;
    }

    @Override  // X2.m
    public Object v(a3.x x0, Object object0) {
        g g0 = (g)this.i;
        g0.getClass();
        g0.Q(x0.l, "package", ((StringBuilder)object0));
        if(g0.a.l()) {
            ((StringBuilder)object0).append(" in context of ");
            g0.M(x0.k, ((StringBuilder)object0), false);
        }
        return w2.k.a;
    }

    @Override  // X2.m
    public Object w(a3.z z0, Object object0) {
        String s;
        StringBuilder stringBuilder0 = (StringBuilder)object0;
        g g0 = (g)this.i;
        g0.getClass();
        boolean z1 = z0.j() == X2.f.l;
        if(!g0.p()) {
            g0.w(stringBuilder0, z0, null);
            List list0 = z0.y0();
            j.e(list0, "getContextReceivers(...)");
            g0.z(stringBuilder0, list0);
            if(!z1) {
                o o0 = z0.c();
                j.e(o0, "getVisibility(...)");
                g0.e0(o0, stringBuilder0);
            }
            if((z0.j() != X2.f.j || z0.f() != y.m) && (!z0.j().a() || z0.f() != y.j)) {
                y y0 = z0.f();
                j.e(y0, "getModality(...)");
                g0.I(y0, stringBuilder0, g.t(z0));
            }
            g0.H(z0, stringBuilder0);
            g0.K(stringBuilder0, g0.o().contains(x3.h.p) && z0.a0(), "inner");
            g0.K(stringBuilder0, g0.o().contains(x3.h.r) && z0.D0(), "data");
            g0.K(stringBuilder0, g0.o().contains(x3.h.s) && z0.o(), "inline");
            g0.K(stringBuilder0, g0.o().contains(x3.h.y) && z0.Y(), "value");
            g0.K(stringBuilder0, g0.o().contains(x3.h.x) && z0.K(), "fun");
            if(z0 instanceof X2.S) {
                s = "typealias";
            }
            else if(z0.D()) {
                s = "companion object";
            }
            else {
                switch(z0.j().ordinal()) {
                    case 0: {
                        s = "class";
                        break;
                    }
                    case 1: {
                        s = "interface";
                        break;
                    }
                    case 2: {
                        s = "enum class";
                        break;
                    }
                    case 3: {
                        s = "enum entry";
                        break;
                    }
                    case 4: {
                        s = "annotation class";
                        break;
                    }
                    case 5: {
                        s = "object";
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            stringBuilder0.append(g0.F(s));
        }
        boolean z2 = y3.d.m(z0);
        x3.k k0 = g0.a;
        if(z2) {
            if(((Boolean)k0.G.a(x3.k.X[0x1F], k0)).booleanValue()) {
                if(g0.p()) {
                    stringBuilder0.append("companion object");
                }
                g.U(stringBuilder0);
                X2.k k1 = z0.p();
                if(k1 != null) {
                    stringBuilder0.append("of ");
                    v3.f f0 = k1.getName();
                    j.e(f0, "getName(...)");
                    stringBuilder0.append(g0.L(f0, false));
                }
            }
            if(g0.s() || !j.a(z0.getName(), v3.h.b)) {
                if(!g0.p()) {
                    g.U(stringBuilder0);
                }
                v3.f f1 = z0.getName();
                j.e(f1, "getName(...)");
                stringBuilder0.append(g0.L(f1, true));
            }
        }
        else {
            if(!g0.p()) {
                g.U(stringBuilder0);
            }
            g0.M(z0, stringBuilder0, true);
        }
        if(!z1) {
            List list1 = z0.t();
            j.e(list1, "getDeclaredTypeParameters(...)");
            g0.a0(list1, stringBuilder0, false);
            g0.x(z0, stringBuilder0);
            if(!z0.j().a() && ((Boolean)k0.i.a(x3.k.X[7], k0)).booleanValue()) {
                i i0 = z0.o0();
                if(i0 != null) {
                    stringBuilder0.append(" ");
                    g0.w(stringBuilder0, i0, null);
                    o o1 = i0.c();
                    j.e(o1, "getVisibility(...)");
                    g0.e0(o1, stringBuilder0);
                    stringBuilder0.append(g0.F("constructor"));
                    List list2 = i0.z0();
                    j.e(list2, "getValueParameters(...)");
                    g0.d0(list2, i0.Q(), stringBuilder0);
                }
            }
            if(!((Boolean)k0.x.a(x3.k.X[22], k0)).booleanValue() && !U2.h.E(z0.k())) {
                Collection collection0 = z0.B().r();
                j.e(collection0, "getSupertypes(...)");
                if(!collection0.isEmpty()) {
                    if(collection0.size() == 1) {
                        Object object1 = collection0.iterator().next();
                        if(!U2.h.x(((w)object1))) {
                            goto label_90;
                        }
                    }
                    else {
                    label_90:
                        g.U(stringBuilder0);
                        stringBuilder0.append(": ");
                        x2.i.X(collection0, stringBuilder0, null, null, new x3.f(g0, 1), 60);
                    }
                }
            }
            g0.f0(stringBuilder0, list1);
        }
        return w2.k.a;
    }

    @Override  // X2.m
    public Object y(v v0, Object object0) {
        j.f(v0, "descriptor");
        ((StringBuilder)object0).append(v0.getName());
        return w2.k.a;
    }
}

