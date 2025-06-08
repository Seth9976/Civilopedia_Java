package n2;

import I2.a;
import J2.j;
import J2.l;
import Y3.n;
import com.spears.civilopedia.db.tables.Buildings;
import com.spears.civilopedia.db.tables.Districts;
import com.spears.civilopedia.db.tables.DynamicModifiers;
import com.spears.civilopedia.db.tables.Features;
import com.spears.civilopedia.db.tables.Improvements;
import com.spears.civilopedia.db.tables.ModifierArguments;
import com.spears.civilopedia.db.tables.Modifiers;
import com.spears.civilopedia.db.tables.Resources;
import com.spears.civilopedia.db.tables.Terrains;
import com.spears.civilopedia.planning.logic.Plot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o2.G;
import o2.f;
import x2.k;
import x2.o;
import x2.r;

public final class p extends l implements a {
    public final int i;
    public final q j;

    public p(q q0, int v) {
        this.i = v;
        this.j = q0;
        super(0);
    }

    @Override  // I2.a
    public final Object invoke() {
        f f0;
        int v1;
        boolean z = true;
        int v = 0;
        q q0 = this.j;
        switch(this.i) {
            case 0: {
                Iterable iterable1 = (List)q0.s.getValue();
                if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                    for(Object object1: iterable1) {
                        if(((Districts)object1).getCityCenter()) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return false;
            }
            case 1: {
                Iterable iterable2 = (List)q0.r.getValue();
                if(!(iterable2 instanceof Collection) || !((Collection)iterable2).isEmpty()) {
                    for(Object object2: iterable2) {
                        if(!((Terrains)object2).getWater()) {
                            continue;
                        }
                        Terrains terrains0 = (Terrains)q0.f.getValue();
                        return terrains0 != null && !terrains0.getWater();
                    }
                    return false;
                }
                return false;
            }
            case 2: {
                if(!q0.b()) {
                    Iterable iterable3 = (List)q0.x.getValue();
                    if(!(iterable3 instanceof Collection) || !((Collection)iterable3).isEmpty()) {
                        for(Object object3: iterable3) {
                            if(((Features)object3).getAddsFreshWater()) {
                                return true;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            }
            case 3: {
                Iterable iterable4 = (List)q0.r.getValue();
                if(!(iterable4 instanceof Collection) || !((Collection)iterable4).isEmpty()) {
                    for(Object object4: iterable4) {
                        if(!((Terrains)object4).getWater()) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return false;
            }
            case 4: {
                Iterable iterable5 = (List)q0.r.getValue();
                if(!(iterable5 instanceof Collection) || !((Collection)iterable5).isEmpty()) {
                    for(Object object5: iterable5) {
                        if(((Terrains)object5).getMountain()) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return false;
            }
            case 5: {
                ArrayList arrayList1 = new ArrayList(k.E(q0.c));
                for(Object object6: q0.c) {
                    arrayList1.add(new x(q0.a.a, ((v)object6).a));
                }
                if(!arrayList1.isEmpty()) {
                    for(Object object7: arrayList1) {
                        c c0 = (c)q0.b.b;
                        c0.getClass();
                        j.f(((x)object7), "edge");
                        if(c0.a.contains(((x)object7))) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
                return false;
            }
            case 6: {
                D d0 = q0.e;
                if(d0 == null) {
                    v1 = 0;
                }
                else {
                    v1 = 0;
                    for(Object object8: ((List)d0.e.getValue())) {
                        Modifiers modifiers0 = (Modifiers)object8;
                        DynamicModifiers dynamicModifiers0 = d0.c(modifiers0.getModifierType());
                        if(dynamicModifiers0 != null && j.a(dynamicModifiers0.getEffectType(), "EFFECT_ADJUST_CITY_APPEAL")) {
                            ArrayList arrayList2 = new ArrayList();
                            for(Object object9: ((Iterable)d0.a.P0)) {
                                if(j.a(((ModifierArguments)object9).getModifierId(), modifiers0.getModifierId())) {
                                    arrayList2.add(object9);
                                }
                            }
                            String s = o1.a.t("Amount", arrayList2);
                            Integer integer0 = s == null ? null : n.L0(s);
                            if(integer0 != null) {
                                v1 = ((int)integer0) + v1;
                            }
                        }
                    }
                }
                ArrayList arrayList3 = q0.d();
                ArrayList arrayList4 = new ArrayList();
                Iterator iterator10 = arrayList3.iterator();
                while(true) {
                    boolean z1 = iterator10.hasNext();
                    f0 = q0.d;
                    if(!z1) {
                        break;
                    }
                    iterator10.next();
                    Terrains terrains1 = (Terrains)f0.z1.h("TERRAIN_PLAINS");
                    Integer integer1 = terrains1 == null ? null : terrains1.getAppeal();
                    if(integer1 != null) {
                        arrayList4.add(integer1);
                    }
                }
                ArrayList arrayList5 = q0.d();
                ArrayList arrayList6 = new ArrayList();
                for(Object object10: arrayList5) {
                    Features features0 = (Features)f0.j0.h(((Plot)object10).f());
                    Integer integer2 = features0 == null ? null : features0.getAppeal();
                    if(integer2 != null) {
                        arrayList6.add(integer2);
                    }
                }
                ArrayList arrayList7 = q0.d();
                ArrayList arrayList8 = new ArrayList();
                for(Object object11: arrayList7) {
                    Improvements improvements0 = (Improvements)f0.K0.h(((Plot)object11).g());
                    Integer integer3 = improvements0 == null ? null : improvements0.getAppeal();
                    if(integer3 != null) {
                        arrayList8.add(integer3);
                    }
                }
                List[] arr_list = {arrayList4, arrayList6, arrayList8, G.p(v1)};
                ArrayList arrayList9 = new ArrayList();
                for(int v2 = 0; v2 < 4; ++v2) {
                    o.H(arr_list[v2], arrayList9);
                }
                for(Object object12: arrayList9) {
                    v += ((Number)object12).intValue();
                }
                return v;
            }
            case 7: {
                ArrayList arrayList10 = q0.d();
                ArrayList arrayList11 = new ArrayList();
                for(Object object13: arrayList10) {
                    String s1 = ((Plot)object13).d();
                    if(s1 != null) {
                        arrayList11.add(s1);
                    }
                }
                ArrayList arrayList12 = new ArrayList();
                for(Object object14: arrayList11) {
                    Buildings buildings0 = (Buildings)q0.d.v.h(((String)object14));
                    if(buildings0 != null) {
                        arrayList12.add(buildings0);
                    }
                }
                return arrayList12;
            }
            case 8: {
                b b0 = (b)q0.g.getValue();
                if(b0 != null) {
                    ArrayList arrayList13 = b0.c;
                    if(arrayList13 != null) {
                        ArrayList arrayList14 = new ArrayList();
                        for(Object object15: arrayList13) {
                            v v3 = ((s)q0.b.c).d(((t)object15));
                            if(v3 != null) {
                                arrayList14.add(v3);
                            }
                        }
                        return arrayList14;
                    }
                }
                return r.i;
            }
            case 9: {
                ArrayList arrayList15 = q0.d();
                ArrayList arrayList16 = new ArrayList();
                for(Object object16: arrayList15) {
                    String s2 = ((Plot)object16).e();
                    if(s2 != null) {
                        arrayList16.add(s2);
                    }
                }
                ArrayList arrayList17 = new ArrayList();
                for(Object object17: arrayList16) {
                    Districts districts0 = (Districts)q0.d.b0.h(((String)object17));
                    if(districts0 != null) {
                        arrayList17.add(districts0);
                    }
                }
                return arrayList17;
            }
            case 10: {
                Iterable iterable6 = (List)q0.h.getValue();
                ArrayList arrayList18 = new ArrayList();
                for(Object object18: iterable6) {
                    if(!((v)object18).a.equals(q0.a.a)) {
                        arrayList18.add(object18);
                    }
                }
                ArrayList arrayList19 = new ArrayList();
                for(Object object19: arrayList18) {
                    String s3 = ((v)object19).b.e();
                    if(s3 != null) {
                        arrayList19.add(s3);
                    }
                }
                return arrayList19;
            }
            case 11: {
                ArrayList arrayList20 = ((s)q0.b.c).a;
                ArrayList arrayList21 = new ArrayList();
                for(Object object20: arrayList20) {
                    if(!((v)object20).a.equals(q0.a.a)) {
                        arrayList21.add(object20);
                    }
                }
                ArrayList arrayList22 = new ArrayList();
                for(Object object21: arrayList21) {
                    String s4 = ((v)object21).b.d();
                    if(s4 != null) {
                        arrayList22.add(s4);
                    }
                }
                return arrayList22;
            }
            case 12: {
                ArrayList arrayList23 = q0.d();
                ArrayList arrayList24 = new ArrayList();
                for(Object object22: arrayList23) {
                    String s5 = ((Plot)object22).f();
                    if(s5 != null) {
                        arrayList24.add(s5);
                    }
                }
                ArrayList arrayList25 = new ArrayList();
                for(Object object23: arrayList24) {
                    Features features1 = (Features)q0.d.j0.h(((String)object23));
                    if(features1 != null) {
                        arrayList25.add(features1);
                    }
                }
                return arrayList25;
            }
            case 13: {
                Iterable iterable7 = (List)q0.h.getValue();
                ArrayList arrayList26 = new ArrayList();
                for(Object object24: iterable7) {
                    if(!((v)object24).a.equals(q0.a.a)) {
                        arrayList26.add(object24);
                    }
                }
                ArrayList arrayList27 = new ArrayList();
                for(Object object25: arrayList26) {
                    String s6 = ((v)object25).b.g();
                    if(s6 != null) {
                        arrayList27.add(s6);
                    }
                }
                return arrayList27;
            }
            case 14: {
                ArrayList arrayList28 = q0.d();
                ArrayList arrayList29 = new ArrayList();
                for(Object object26: arrayList28) {
                    String s7 = ((Plot)object26).g();
                    if(s7 != null) {
                        arrayList29.add(s7);
                    }
                }
                ArrayList arrayList30 = new ArrayList();
                for(Object object27: arrayList29) {
                    Improvements improvements1 = (Improvements)q0.d.K0.h(((String)object27));
                    if(improvements1 != null) {
                        arrayList30.add(improvements1);
                    }
                }
                return arrayList30;
            }
            case 15: {
                return ((c)q0.b.d).a(q0.a.a);
            }
            case 16: {
                ArrayList arrayList31 = q0.d();
                ArrayList arrayList32 = new ArrayList();
                for(Object object28: arrayList31) {
                    String s8 = ((Plot)object28).h();
                    if(s8 != null) {
                        arrayList32.add(s8);
                    }
                }
                ArrayList arrayList33 = new ArrayList();
                for(Object object29: arrayList32) {
                    Resources resources0 = (Resources)q0.d.o1.h(((String)object29));
                    if(resources0 != null) {
                        arrayList33.add(resources0);
                    }
                }
                return arrayList33;
            }
            case 17: {
                return (Terrains)q0.d.z1.h("TERRAIN_PLAINS");
            }
            case 18: {
                ArrayList arrayList34 = q0.d();
                ArrayList arrayList35 = new ArrayList();
                Iterator iterator31 = arrayList34.iterator();
                while(iterator31.hasNext()) {
                    iterator31.next();
                    Terrains terrains2 = (Terrains)q0.d.z1.h("TERRAIN_PLAINS");
                    if(terrains2 != null) {
                        arrayList35.add(terrains2);
                    }
                }
                return arrayList35;
            }
            default: {
                Iterable iterable0 = (List)q0.v.getValue();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: iterable0) {
                    if(((Buildings)object0).isWonder()) {
                        arrayList0.add(object0);
                    }
                }
                return arrayList0;
            }
        }
    }
}

