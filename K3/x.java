package k3;

import I2.b;
import J2.j;
import J2.l;
import J2.q;
import K3.p;
import M3.V;
import M3.X;
import M3.w;
import N3.d;
import U2.h;
import U2.m;
import X2.M;
import X2.W;
import X2.e;
import X2.k;
import X2.o;
import a3.I;
import a3.L;
import a3.v;
import d3.E;
import d3.i;
import d3.u;
import d3.z;
import i3.g;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import o1.a;
import v3.f;
import x2.r;
import z1.a0;

public final class x extends l implements b {
    public final int i;
    public final y j;

    public x(y y0, int v) {
        this.i = v;
        this.j = y0;
        super(1);
    }

    @Override  // I2.b
    public final Object b(Object object0) {
        z z1;
        i i0;
        y y0 = this.j;
        switch(this.i) {
            case 0: {
                j.f(((f)object0), "name");
                n n0 = y0.c;
                if(n0 != null) {
                    return (M)n0.g.b(((f)object0));
                }
                u u0 = ((c)y0.e.invoke()).d(((f)object0));
                if(u0 != null) {
                    Field field0 = u0.a;
                    if(!field0.isEnumConstant()) {
                        q q0 = new q(0);
                        boolean z = Modifier.isFinal(((Field)u0.b()).getModifiers());
                        B.f f0 = y0.b;
                        j3.c c0 = a0.J(f0, u0);
                        k k0 = y0.q();
                        o o0 = a.W(u0.e());
                        f f1 = u0.c();
                        j3.a a0 = (j3.a)f0.j;
                        g g0 = g.U0(k0, c0, o0, !z, f1, a0.j.a(u0), Modifier.isFinal(((Field)u0.b()).getModifiers()) && Modifier.isStatic(((Field)u0.b()).getModifiers()));
                        q0.j = g0;
                        g0.Q0(null, null, null, null);
                        Type type0 = field0.getGenericType();
                        j.e(type0, "getGenericType(...)");
                        if(!(type0 instanceof Class) || !((Class)type0).isPrimitive()) {
                            if(type0 instanceof GenericArrayType || type0 instanceof Class && ((Class)type0).isArray()) {
                                i0 = new i(type0);
                            }
                            else if(type0 instanceof WildcardType) {
                                i0 = new E(((WildcardType)type0));
                            }
                            else {
                                i0 = new d3.q(type0);
                            }
                            z1 = i0;
                        }
                        else {
                            z1 = new z(((Class)type0));
                        }
                        l3.a a1 = android.support.v4.media.session.a.P(V.j, false, null, 7);
                        w w0 = ((B1.a)f0.n).H(z1, a1);
                        if((h.F(w0) || h.D(w0, m.f)) && Modifier.isFinal(((Field)u0.b()).getModifiers())) {
                            Modifier.isStatic(((Field)u0.b()).getModifiers());
                        }
                        I i1 = (I)q0.j;
                        v v0 = y0.p();
                        i1.T0(w0, r.i, v0, null, r.i);
                        k k1 = y0.q();
                        e e0 = k1 instanceof e ? ((e)k1) : null;
                        if(e0 != null) {
                            q0.j = ((D3.a)a0.x).h(f0, e0, ((I)q0.j));
                        }
                        Object object1 = q0.j;
                        w w1 = ((I)object1).getType();
                        if(((W)object1) != null) {
                            if(w1 != null) {
                                if(!((W)object1).G() && !M3.c.i(w1)) {
                                    if(X.b(w1)) {
                                        ((I)q0.j).R0(null, new p(y0, u0, q0, 2));
                                    }
                                    else {
                                        h h0 = C3.e.e(((W)object1));
                                        if(h.F(w1) || (d.a.a(h0.u(), w1) || d.a.a(h0.j("Number").k(), w1) || d.a.a(h0.e(), w1) || U2.r.a(w1))) {
                                            ((I)q0.j).R0(null, new p(y0, u0, q0, 2));
                                        }
                                    }
                                }
                                M m0 = (M)q0.j;
                                a0.g.getClass();
                                if(m0 == null) {
                                    throw new IllegalArgumentException("Argument for @NotNull parameter \'descriptor\' of kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1.recordField must not be null");
                                }
                                return (M)q0.j;
                            }
                            y3.d.a(67);
                            throw null;
                        }
                        y3.d.a(66);
                        throw null;
                    }
                }
                return null;
            }
            case 1: {
                j.f(((f)object0), "name");
                n n1 = y0.c;
                if(n1 != null) {
                    return (Collection)n1.f.b(((f)object0));
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object2: ((c)y0.e.invoke()).a(((f)object0))) {
                    i3.f f2 = y0.t(((d3.x)object2));
                    if(y0.r(f2)) {
                        ((j3.a)y0.b.j).g.getClass();
                        arrayList1.add(f2);
                    }
                }
                y0.j(arrayList1, ((f)object0));
                return arrayList1;
            }
            case 2: {
                j.f(((f)object0), "name");
                LinkedHashSet linkedHashSet0 = new LinkedHashSet(((Collection)y0.f.b(((f)object0))));
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object3: linkedHashSet0) {
                    String s = o2.I.h(((L)object3), 2);
                    ArrayList arrayList2 = linkedHashMap0.get(s);
                    if(arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap0.put(s, arrayList2);
                    }
                    arrayList2.add(object3);
                }
                for(Object object4: linkedHashMap0.values()) {
                    List list0 = (List)object4;
                    if(list0.size() != 1) {
                        Collection collection0 = y3.l.o(list0, k3.j.k);
                        linkedHashSet0.removeAll(list0);
                        linkedHashSet0.addAll(collection0);
                    }
                }
                y0.m(linkedHashSet0, ((f)object0));
                return x2.i.o0(((j3.a)y0.b.j).r.e(y0.b, linkedHashSet0));
            }
            default: {
                j.f(((f)object0), "name");
                ArrayList arrayList0 = new ArrayList();
                V3.k.a(arrayList0, y0.g.b(((f)object0)));
                y0.n(arrayList0, ((f)object0));
                return y3.d.o(y0.q(), X2.f.m) ? x2.i.o0(arrayList0) : x2.i.o0(((j3.a)y0.b.j).r.e(y0.b, arrayList0));
            }
        }
    }
}

