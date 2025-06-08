package k3;

import B.f;
import I2.a;
import J2.j;
import M3.V;
import M3.w;
import X2.T;
import X2.e;
import X2.o;
import a3.S;
import com.google.android.gms.internal.ads.U;
import d3.A;
import d3.B;
import d3.C;
import d3.k;
import d3.x;
import i3.b;
import j3.c;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import m3.d;
import o2.I;
import x2.g;
import x2.i;
import x2.r;
import z1.a0;

public final class l extends J2.l implements a {
    public final int i;
    public final f j;
    public final n k;

    public l(f f0, n n0) {
        this.i = 1;
        this.j = f0;
        this.k = n0;
        super(0);
    }

    public l(n n0, f f0) {
        this.i = 0;
        this.k = n0;
        this.j = f0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        b b2;
        f f5;
        B1.a a5;
        V v3;
        f f4;
        n n1;
        r r1;
        e e0;
        f f0;
        if(this.i != 0) {
            return i.s0(((D3.a)((j3.a)this.j.j).x).f(this.j, this.k.n));
        }
        n n0 = this.k;
        Constructor[] arr_constructor = n0.o.a.getDeclaredConstructors();
        j.e(arr_constructor, "getDeclaredConstructors(...)");
        Collection collection0 = X3.l.y0(X3.l.w0(new X3.f(g.C(arr_constructor), false, d3.j.q), k.q));
        Collection collection1 = new ArrayList(collection0.size());
        Iterator iterator0 = collection0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            f0 = n0.b;
            e0 = n0.n;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            d3.r r0 = (d3.r)object0;
            c c0 = a0.J(f0, r0);
            j3.a a0 = (j3.a)f0.j;
            b b0 = b.d1(e0, c0, false, a0.j.a(r0));
            int v = e0.t().size();
            Object object1 = f0.l;
            f f1 = new f(a0, new U(f0, b0, r0, v), ((w2.c)object1));
            Constructor constructor0 = r0.a;
            Type[] arr_type = constructor0.getGenericParameterTypes();
            j.c(arr_type);
            if(arr_type.length == 0) {
                r1 = r.i;
            }
            else {
                Class class0 = constructor0.getDeclaringClass();
                if(class0.getDeclaringClass() != null && !Modifier.isStatic(class0.getModifiers())) {
                    arr_type = (Type[])g.F(arr_type, 1, arr_type.length);
                }
                Annotation[][] arr2_annotation = constructor0.getParameterAnnotations();
                if(arr2_annotation.length < arr_type.length) {
                    throw new IllegalStateException("Illegal generic signature: " + constructor0);
                }
                if(arr2_annotation.length > arr_type.length) {
                    arr2_annotation = (Annotation[][])g.F(arr2_annotation, arr2_annotation.length - arr_type.length, arr2_annotation.length);
                }
                r1 = r0.d(arr_type, arr2_annotation, constructor0.isVarArgs());
            }
            L3.l l0 = y.u(f1, b0, r1);
            List list0 = e0.t();
            j.e(list0, "getDeclaredTypeParameters(...)");
            ArrayList arrayList0 = r0.u();
            ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
            for(Object object2: arrayList0) {
                T t0 = ((j3.e)f1.k).a(((C)object2));
                j.c(t0);
                arrayList1.add(t0);
            }
            ArrayList arrayList2 = i.e0(arrayList1, list0);
            o o0 = o1.a.W(r0.e());
            b0.b1(((List)l0.c), o0, arrayList2);
            b0.U0(false);
            b0.V0(l0.b);
            b0.W0(e0.k());
            ((j3.a)f1.j).g.getClass();
            ((ArrayList)collection1).add(b0);
        }
        d3.o o1 = n0.o;
        boolean z1 = o1.g();
        Y2.f f2 = Y2.g.a;
        V v1 = V.j;
        f f3 = this.j;
        if(z1) {
            b b1 = b.d1(e0, f2, true, ((j3.a)f0.j).j.a(o1));
            ArrayList arrayList3 = o1.f();
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            l3.a a1 = android.support.v4.media.session.a.P(v1, false, null, 6);
            int v2 = 0;
            for(Object object3: arrayList3) {
                d d0 = ((A)object3).f();
                w w0 = ((B1.a)f0.n).H(d0, a1);
                arrayList4.add(new S(b1, null, v2, f2, ((A)object3).c(), w0, false, false, false, null, ((j3.a)f0.j).j.a(((A)object3))));
                ++v2;
            }
            n1 = n0;
            f4 = f3;
            v3 = v1;
            b1.V0(false);
            o o2 = e0.c();
            j.e(o2, "getVisibility(...)");
            if(o2.equals(g3.o.b)) {
                o2 = g3.o.c;
                j.e(o2, "PROTECTED_AND_PACKAGE");
            }
            b1.a1(arrayList4, o2);
            b1.U0(false);
            b1.W0(e0.k());
            String s = I.h(b1, 2);
            if(!((ArrayList)collection1).isEmpty()) {
                for(Object object4: ((ArrayList)collection1)) {
                    if(!I.h(((a3.i)object4), 2).equals(s)) {
                        continue;
                    }
                    goto label_100;
                }
            }
            ((ArrayList)collection1).add(b1);
            ((j3.a)f4.j).g.getClass();
        }
        else {
            n1 = n0;
            f4 = f3;
            v3 = v1;
        }
    label_100:
        ((D3.a)((j3.a)f4.j).x).a(f4, e0, ((ArrayList)collection1));
        j3.a a2 = (j3.a)f4.j;
        if(((ArrayList)collection1).isEmpty()) {
            o1.a.isInterface();
            if(o1.a.isAnnotation()) {
                b2 = b.d1(e0, f2, true, ((j3.a)f0.j).j.a(o1));
                Collection collection2 = o1.d();
                List list1 = new ArrayList(collection2.size());
                l3.a a3 = android.support.v4.media.session.a.P(v3, true, null, 6);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for(Object object5: collection2) {
                    if(j.a(((x)object5).c(), g3.x.b)) {
                        arrayList5.add(object5);
                    }
                    else {
                        arrayList6.add(object5);
                    }
                }
                Object object6 = i.U(arrayList5);
                B1.a a4 = (B1.a)f0.n;
                if(((x)object6) == null) {
                    f5 = f4;
                    a5 = a4;
                }
                else {
                    B b3 = ((x)object6).f();
                    w2.e e1 = b3 instanceof d3.i ? new w2.e(a4.G(((d3.i)b3), a3, true), a4.H(((d3.i)b3).b, a3)) : new w2.e(a4.H(b3, a3), null);
                    a5 = a4;
                    f5 = f4;
                    n1.x(((ArrayList)list1), b2, 0, ((x)object6), ((w)e1.i), ((w)e1.j));
                }
                int v4 = 0;
                for(Object object7: arrayList6) {
                    n1.x(((ArrayList)list1), b2, v4 + (((x)object6) == null ? 0 : 1), ((x)object7), a5.H(((x)object7).f(), a3), null);
                    ++v4;
                }
                b2.V0(false);
                o o3 = e0.c();
                j.e(o3, "getVisibility(...)");
                if(o3.equals(g3.o.b)) {
                    o3 = g3.o.c;
                    j.e(o3, "PROTECTED_AND_PACKAGE");
                }
                b2.a1(list1, o3);
                b2.U0(true);
                b2.W0(e0.k());
                ((j3.a)f0.j).g.getClass();
            }
            else {
                f5 = f4;
                b2 = null;
            }
            collection1 = x2.j.A(b2);
            return i.o0(a2.r.e(f5, collection1));
        }
        return i.o0(a2.r.e(f4, collection1));
    }
}

