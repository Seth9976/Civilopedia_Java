package n2;

import J2.j;
import com.spears.civilopedia.db.tables.Adjacency_YieldChanges;
import com.spears.civilopedia.db.tables.District_Adjacencies;
import com.spears.civilopedia.db.tables.Feature_AdjacentYields;
import com.spears.civilopedia.db.tables.Features;
import com.spears.civilopedia.db.tables.Improvement_Adjacencies;
import com.spears.civilopedia.db.tables.Improvement_BonusYieldChanges;
import com.spears.civilopedia.db.tables.Improvements;
import com.spears.civilopedia.db.tables.Resources;
import com.spears.civilopedia.planning.logic.Plot;
import f2.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import o2.f;
import w2.h;
import x2.k;

public final class q {
    public final v a;
    public final A b;
    public final ArrayList c;
    public final f d;
    public final D e;
    public final h f;
    public final h g;
    public final h h;
    public final h i;
    public final h j;
    public final h k;
    public final h l;
    public final h m;
    public final h n;
    public final h o;
    public final h p;
    public final h q;
    public final h r;
    public final h s;
    public final h t;
    public final h u;
    public final h v;
    public final h w;
    public final h x;
    public final h y;

    public q(v v0, A a0) {
        j.f(v0, "current");
        j.f(a0, "world");
        super();
        this.a = v0;
        this.b = a0;
        this.d = ((l)a0.g).b.b();
        b b0 = ((c)a0.d).a(v0.a);
        this.e = b0 == null ? null : ((D)((HashMap)a0.h).get(b0.b));
        this.c = ((s)a0.c).a(v0.a);
        this.f = new h(new p(this, 17));
        this.g = new h(new p(this, 15));
        this.h = new h(new p(this, 8));
        this.i = new h(new p(this, 10));
        this.j = new h(new p(this, 13));
        this.k = new h(new p(this, 11));
        this.l = new h(new p(this, 0));
        this.m = new h(new p(this, 3));
        this.n = new h(new p(this, 1));
        this.o = new h(new p(this, 4));
        this.p = new h(new p(this, 5));
        this.q = new h(new p(this, 2));
        this.r = new h(new p(this, 18));
        this.s = new h(new p(this, 9));
        this.t = new h(new p(this, 14));
        this.u = new h(new p(this, 16));
        this.v = new h(new p(this, 7));
        this.w = new h(new p(this, 19));
        this.x = new h(new p(this, 12));
        this.y = new h(new p(this, 6));
    }

    public final B a() {
        v v0 = this.a;
        if(v0.b.e() == null) {
            return null;
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)this.d.V)) {
            if(j.a(((District_Adjacencies)object0).getDistrictType(), v0.b.e())) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((District_Adjacencies)object1).getYieldChangeId());
        }
        return this.f(arrayList1, null, true);
    }

    public final boolean b() {
        return ((Boolean)this.p.getValue()).booleanValue();
    }

    public final int c() {
        return ((Number)this.y.getValue()).intValue();
    }

    public final ArrayList d() {
        ArrayList arrayList0 = new ArrayList(k.E(this.c));
        for(Object object0: this.c) {
            arrayList0.add(((v)object0).b);
        }
        return arrayList0;
    }

    public final E e(d d0) {
        E e0 = new E();
        v v0 = this.a;
        String s = v0.b.g();
        f f0 = this.d;
        if(s != null) {
            Improvements improvements0 = (Improvements)f0.K0.h(s);
            if(improvements0 != null) {
                if(!improvements0.getWorkable()) {
                    return null;
                }
                for(Object object0: ((List)f0.D0)) {
                    Improvement_BonusYieldChanges improvement_BonusYieldChanges0 = (Improvement_BonusYieldChanges)object0;
                    if(j.a(improvement_BonusYieldChanges0.getImprovementType(), improvements0.getImprovementType()) && improvement_BonusYieldChanges0.getBonusYieldChange() != 0) {
                        e0.a(improvement_BonusYieldChanges0.getBonusYieldChange(), improvement_BonusYieldChanges0.getYieldType());
                    }
                }
                String s1 = improvements0.getYieldFromAppeal();
                if(s1 != null) {
                    e0.a(improvements0.getYieldFromAppealPercent() * this.c() / 100, s1);
                }
            }
        }
        boolean z = false;
        Plot plot0 = v0.b;
        h h0 = this.x;
        Iterable iterable0 = (List)h0.getValue();
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
            for(Object object1: iterable0) {
                if(((Features)object1).getDoubleAdjacentTerrainYield()) {
                    z = true;
                    break;
                }
            }
        }
        for(Object object2: plot0.u(f0, z).a.entrySet()) {
            String s2 = (String)((Map.Entry)object2).getKey();
            e0.a(((Number)((Map.Entry)object2).getValue()).intValue(), s2);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object3: ((Iterable)f0.C0)) {
            if(j.a(((Improvement_Adjacencies)object3).getImprovementType(), v0.b.g())) {
                arrayList0.add(object3);
            }
        }
        ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
        for(Object object4: arrayList0) {
            arrayList1.add(((Improvement_Adjacencies)object4).getYieldChangeId());
        }
        for(Object object5: this.f(arrayList1, d0, false).a.entrySet()) {
            String s3 = (String)((Map.Entry)object5).getKey();
            e0.a(((int)((Number)((Map.Entry)object5).getValue()).doubleValue()), s3);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator iterator6 = ((Iterable)f0.g0).iterator();
    label_56:
        while(iterator6.hasNext()) {
            Object object6 = iterator6.next();
            Feature_AdjacentYields feature_AdjacentYields0 = (Feature_AdjacentYields)object6;
            Iterable iterable1 = (List)h0.getValue();
            if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                Iterator iterator7 = iterable1.iterator();
                do {
                    if(!iterator7.hasNext()) {
                        continue label_56;
                    }
                    Object object7 = iterator7.next();
                }
                while(!j.a(feature_AdjacentYields0.getFeatureType(), ((Features)object7).getFeatureType()));
                arrayList2.add(object6);
            }
        }
        for(Object object8: arrayList2) {
            e0.a(((Feature_AdjacentYields)object8).getYieldChange(), ((Feature_AdjacentYields)object8).getYieldType());
        }
        if(v0.b.k()) {
            e0.b(2, "YIELD_FOOD");
            e0.b(1, "YIELD_PRODUCTION");
        }
        return e0;
    }

    public final B f(ArrayList arrayList0, d d0, boolean z) {
        int v;
        double f;
        ArrayList arrayList3;
        HashMap hashMap0 = new HashMap();
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for(Object object0: ((List)this.d.b.i)) {
            if(arrayList0.contains(((Adjacency_YieldChanges)object0).getID())) {
                arrayList2.add(object0);
            }
        }
        D d1 = this.e;
        if(d1 == null) {
            ArrayList arrayList4 = new ArrayList(k.E(arrayList2));
            for(Object object1: arrayList2) {
                arrayList4.add(new a(((Adjacency_YieldChanges)object1)));
            }
            arrayList3 = arrayList4;
        }
        else {
            arrayList3 = d1.e(this, arrayList2);
        }
        for(Object object2: arrayList3) {
            a a0 = (a)object2;
            if(d0 == null) {
                if(a0.r == null && a0.s == null) {
                    goto label_28;
                }
                continue;
            }
            else if(a0.q != null && !a0.q.equals(d0.b) || (a0.p != null && !a0.p.equals(d0.a) || a0.s != null && a0.s.equals(d0.b) || a0.r != null && a0.r.equals(d0.a))) {
                continue;
            }
        label_28:
            h h0 = this.u;
            if(a0.f) {
                Iterable iterable0 = (List)h0.getValue();
                ArrayList arrayList5 = new ArrayList();
                for(Object object3: iterable0) {
                    if(((Resources)object3).getSeaFrequency() > 0) {
                        arrayList5.add(object3);
                    }
                }
                f = a0.a(arrayList5.size()) + 0.0;
            }
            else {
                f = 0.0;
            }
            String s = a0.g;
            if(s != null) {
                ArrayList arrayList6 = this.d();
                ArrayList arrayList7 = new ArrayList();
                for(Object object4: arrayList6) {
                    if(j.a("TERRAIN_PLAINS", s)) {
                        arrayList7.add(object4);
                    }
                }
                f += a0.a(arrayList7.size());
            }
            String s1 = a0.h;
            if(s1 != null) {
                ArrayList arrayList8 = this.d();
                ArrayList arrayList9 = new ArrayList();
                for(Object object5: arrayList8) {
                    if(j.a(((Plot)object5).f(), s1)) {
                        arrayList9.add(object5);
                    }
                }
                f += a0.a(arrayList9.size());
            }
            if(a0.i && this.b()) {
                f += a0.a(1);
            }
            if(a0.j) {
                f += a0.a(((List)this.w.getValue()).size());
            }
            if(a0.k) {
                Iterable iterable1 = (List)this.x.getValue();
                ArrayList arrayList10 = new ArrayList();
                for(Object object6: iterable1) {
                    if(((Features)object6).getNaturalWonder()) {
                        arrayList10.add(object6);
                    }
                }
                f += a0.a(arrayList10.size());
            }
            String s2 = a0.l;
            if(s2 != null) {
                ArrayList arrayList11 = this.d();
                ArrayList arrayList12 = new ArrayList();
                for(Object object7: arrayList11) {
                    if(j.a(((Plot)object7).g(), s2)) {
                        arrayList12.add(object7);
                    }
                }
                f += a0.a(arrayList12.size());
            }
            String s3 = a0.m;
            if(s3 != null) {
                ArrayList arrayList13 = this.d();
                ArrayList arrayList14 = new ArrayList();
                for(Object object8: arrayList13) {
                    if(j.a(((Plot)object8).e(), s3)) {
                        arrayList14.add(object8);
                    }
                }
                f += a0.a(arrayList14.size());
            }
            if(a0.e) {
                f += a0.a(((List)this.s.getValue()).size());
            }
            if(a0.n) {
                f += a0.a(((List)h0.getValue()).size());
            }
            if(a0.t != null && ((int)a0.t) <= this.c()) {
                f += a0.a(1);
            }
            Iterable iterable2 = (List)h0.getValue();
            ArrayList arrayList15 = new ArrayList();
            for(Object object9: iterable2) {
                if(j.a(((Resources)object9).getResourceClassType(), a0.o)) {
                    arrayList15.add(object9);
                }
            }
            double f1 = a0.a(arrayList15.size()) + f;
            if(!z && d1 != null && (a0.u != null && d1.g(a0.u, this))) {
                if(a0.v == null) {
                    v = 1;
                }
                else {
                    ArrayList arrayList16 = this.d();
                    ArrayList arrayList17 = new ArrayList();
                    for(Object object10: arrayList16) {
                        if(j.a(((Plot)object10).g(), a0.v)) {
                            arrayList17.add(object10);
                        }
                    }
                    v = arrayList17.size();
                }
                f1 += a0.a(v);
            }
            if(f1 > 0.0) {
                String s4 = a0.b;
                Double double0 = (Double)hashMap0.get(s4);
                if(double0 == null) {
                    hashMap0.put(s4, f1);
                }
                else {
                    hashMap0.put(s4, ((double)(((double)double0) + f1)));
                }
                arrayList1.add(android.support.v4.media.session.a.H(a0.a, new Object[]{f1}));
            }
        }
        return new B(hashMap0, arrayList1);
    }
}

