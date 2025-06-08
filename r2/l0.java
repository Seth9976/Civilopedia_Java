package R2;

import I2.a;
import J2.j;
import J2.l;
import O2.A;
import X2.M;
import X2.e;
import X2.f;
import X2.k;
import X2.o;
import Y3.c;
import Y3.d;
import a3.r;
import g3.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import q3.G;
import u3.h;
import x2.i;

public final class l0 extends l implements a {
    public final int i;
    public final m0 j;

    public l0(m0 m00, int v) {
        this.i = v;
        this.j = m00;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        Class class0;
        boolean z = false;
        d d0 = null;
        m0 m00 = this.j;
        if(this.i != 0) {
            A a0 = v0.b(m00.t());
            if(a0 instanceof m) {
                G g0 = ((m)a0).j;
                u3.d d1 = h.b(g0, ((m)a0).l, ((m)a0).m, true);
                if(d1 != null) {
                    M m0 = ((m)a0).i;
                    if(m0.j() != 2) {
                        k k0 = m0.p();
                        if(k0 == null) {
                            throw new IllegalArgumentException("Argument for @NotNull parameter \'companionObject\' of kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil.isClassCompanionObjectWithBackingFieldsInOuter must not be null");
                        }
                        if(y3.d.m(k0)) {
                            k k1 = k0.p();
                            if((y3.d.o(k1, f.i) || y3.d.o(k1, f.k)) && !o1.a.F(((e)k0))) {
                                z = true;
                                goto label_24;
                            }
                            goto label_18;
                        }
                        else {
                        label_18:
                            if(y3.d.m(m0.p())) {
                                r r0 = m0.R();
                                if((r0 == null || !r0.l().e(w.a) ? m0.l().e(w.a) : true)) {
                                    z = true;
                                }
                            }
                        }
                    }
                label_24:
                    F f0 = m00.l;
                    if(z || h.d(g0)) {
                        class0 = f0.a().getEnclosingClass();
                    }
                    else {
                        k k2 = m0.p();
                        class0 = k2 instanceof e ? x0.k(((e)k2)) : f0.a();
                    }
                    if(class0 != null) {
                        try {
                            return class0.getDeclaredField(d1.c);
                        }
                        catch(NoSuchFieldException unused_ex) {
                        }
                    }
                }
            }
            else {
                if(a0 instanceof R2.k) {
                    return ((R2.k)a0).i;
                }
                if(!(a0 instanceof R2.l) && !(a0 instanceof n)) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return null;
        }
        F f1 = m00.l;
        f1.getClass();
        String s = m00.m;
        j.f(s, "name");
        String s1 = m00.n;
        j.f(s1, "signature");
        F.i.getClass();
        Matcher matcher0 = ((Pattern)F.i.j).matcher(s1);
        j.e(matcher0, "matcher(...)");
        if(matcher0.matches()) {
            d0 = new d(matcher0, s1);
        }
        if(d0 != null) {
            String s2 = (String)((c)d0.a()).get(1);
            M m1 = f1.i(Integer.parseInt(s2));
            if(m1 == null) {
                throw new H2.a("Local property #" + s2 + " not found in " + f1.a(), 1);
            }
            return m1;
        }
        Iterable iterable0 = f1.l(v3.f.e(s));
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(j.a(v0.b(((M)object0)).d(), s1)) {
                arrayList0.add(object0);
            }
        }
        if(!arrayList0.isEmpty()) {
            if(arrayList0.size() != 1) {
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object1: arrayList0) {
                    o o0 = ((M)object1).c();
                    ArrayList arrayList1 = linkedHashMap0.get(o0);
                    if(arrayList1 == null) {
                        arrayList1 = new ArrayList();
                        linkedHashMap0.put(o0, arrayList1);
                    }
                    arrayList1.add(object1);
                }
                TreeMap treeMap0 = new TreeMap(new B.d(5));
                treeMap0.putAll(linkedHashMap0);
                Collection collection0 = treeMap0.values();
                j.e(collection0, "<get-values>(...)");
                List list0 = (List)i.Z(collection0);
                if(list0.size() == 1) {
                    return (M)i.S(list0);
                }
                String s3 = i.Y(f1.l(v3.f.e(s)), "\n", null, null, b.o, 30);
                StringBuilder stringBuilder0 = i3.e.j("Property \'", s, "\' (JVM signature: ", s1, ") not resolved in ");
                stringBuilder0.append(f1);
                stringBuilder0.append(':');
                stringBuilder0.append((s3.length() == 0 ? " no members found" : "\n" + s3));
                throw new H2.a(stringBuilder0.toString(), 1);
            }
            return (M)i.i0(arrayList0);
        }
        StringBuilder stringBuilder1 = i3.e.j("Property \'", s, "\' (JVM signature: ", s1, ") not resolved in ");
        stringBuilder1.append(f1);
        throw new H2.a(stringBuilder1.toString(), 1);
    }
}

