package V2;

import J2.j;
import M3.U;
import M3.w;
import S3.s;
import X2.O;
import X2.k;
import Y2.g;
import Y2.h;
import a3.L;
import a3.S;
import a3.t;
import a3.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import w2.e;
import x2.i;
import z1.a0;

public final class f extends L {
    public f(k k0, f f0, int v, boolean z) {
        super(k0, f0, g.a, s.g, v, O.b);
        this.u = true;
        this.C = z;
        this.D = false;
    }

    @Override  // a3.L
    public final u O0(int v, k k0, X2.u u0, O o0, h h0, v3.f f0) {
        j.f(k0, "newOwner");
        A.f.o(v, "kind");
        j.f(h0, "annotations");
        return new f(k0, ((f)u0), v, this.C);
    }

    @Override  // a3.u
    public final u P0(t t0) {
        j.f(t0, "configuration");
        u u0 = (f)super.P0(t0);
        if(u0 == null) {
            return null;
        }
        List list0 = u0.z0();
        j.e(list0, "getValueParameters(...)");
        if(!(list0 instanceof Collection) || !list0.isEmpty()) {
        alab1:
            for(Object object0: list0) {
                w w0 = ((S)object0).getType();
                j.e(w0, "getType(...)");
                if(a0.p(w0) != null) {
                    List list1 = u0.z0();
                    j.e(list1, "getValueParameters(...)");
                    ArrayList arrayList0 = new ArrayList(x2.k.E(list1));
                    for(Object object1: list1) {
                        w w1 = ((S)object1).getType();
                        j.e(w1, "getType(...)");
                        arrayList0.add(a0.p(w1));
                    }
                    int v = u0.z0().size() - arrayList0.size();
                    boolean z = true;
                    if(v == 0) {
                        List list2 = u0.z0();
                        j.e(list2, "getValueParameters(...)");
                        ArrayList arrayList1 = i.v0(arrayList0, list2);
                        if(arrayList1.isEmpty()) {
                            break;
                        }
                        Iterator iterator2 = arrayList1.iterator();
                        while(true) {
                            if(!iterator2.hasNext()) {
                                break alab1;
                            }
                            Object object2 = iterator2.next();
                            v3.f f0 = ((S)((e)object2).j).getName();
                            if(!j.a(((v3.f)((e)object2).i), f0)) {
                                break;
                            }
                        }
                    }
                    List list3 = u0.z0();
                    j.e(list3, "getValueParameters(...)");
                    ArrayList arrayList2 = new ArrayList(x2.k.E(list3));
                    for(Object object3: list3) {
                        v3.f f1 = ((S)object3).getName();
                        j.e(f1, "getName(...)");
                        int v1 = ((S)object3).n;
                        int v2 = v1 - v;
                        if(v2 >= 0) {
                            v3.f f2 = (v3.f)arrayList0.get(v2);
                            if(f2 != null) {
                                f1 = f2;
                            }
                        }
                        arrayList2.add(((S)object3).M0(((f)u0), f1, v1));
                    }
                    t t1 = u0.S0(U.b);
                    if(!arrayList0.isEmpty()) {
                        for(Object object4: arrayList0) {
                            if(((v3.f)object4) != null) {
                                continue;
                            }
                            goto label_59;
                        }
                    }
                    z = false;
                label_59:
                    t1.D = Boolean.valueOf(z);
                    t1.o = arrayList2;
                    t1.m = ((L)u0).Y0();
                    u0 = u0.super.P0(t1);
                    j.c(u0);
                    return u0;
                }
                if(false) {
                    break;
                }
            }
        }
        return u0;
    }

    @Override  // a3.u
    public final boolean h0() {
        return false;
    }

    @Override  // a3.u
    public final boolean o() {
        return false;
    }

    @Override  // a3.u
    public final boolean z() {
        return false;
    }
}

