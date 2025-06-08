package n2;

import B.d;
import J2.j;
import android.support.v4.media.session.a;
import com.spears.civilopedia.db.tables.AppealHousingChanges;
import com.spears.civilopedia.db.tables.Building_RequiredFeatures;
import com.spears.civilopedia.db.tables.Building_ValidFeatures;
import com.spears.civilopedia.db.tables.Building_ValidTerrains;
import com.spears.civilopedia.db.tables.Buildings;
import com.spears.civilopedia.db.tables.District_RequiredFeatures;
import com.spears.civilopedia.db.tables.District_ValidTerrains;
import com.spears.civilopedia.db.tables.Districts;
import com.spears.civilopedia.db.tables.Feature_ValidTerrains;
import com.spears.civilopedia.db.tables.Features;
import com.spears.civilopedia.db.tables.Improvement_ValidAdjacentTerrains;
import com.spears.civilopedia.db.tables.Improvement_ValidFeatures;
import com.spears.civilopedia.db.tables.Improvement_ValidResources;
import com.spears.civilopedia.db.tables.Improvement_ValidTerrains;
import com.spears.civilopedia.db.tables.Improvements;
import com.spears.civilopedia.db.tables.Resource_ValidFeatures;
import com.spears.civilopedia.db.tables.Resource_ValidTerrains;
import com.spears.civilopedia.db.tables.Resources;
import com.spears.civilopedia.db.tables.Terrains;
import com.spears.civilopedia.planning.logic.Plot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import m2.p;
import m2.r;
import o2.K;
import o2.f;
import o2.x;
import x2.i;
import x2.k;
import x2.o;

public final class u {
    public final f a;
    public final x b;
    public final Plot c;
    public final q d;

    public u(f f0, x x0, Plot plot0, q q0) {
        j.f(plot0, "plot");
        j.f(q0, "adjacencyProps");
        super();
        this.a = f0;
        this.b = x0;
        this.c = plot0;
        this.d = q0;
    }

    public static p a(String s, ArrayList arrayList0) {
        return new p(s, i.Y(arrayList0, ", ", null, null, null, 62), null);
    }

    public static p b(u u0, String s, String s1, int v) {
        if((v & 1) != 0) {
            s = a.H("LOC_UI_PEDIA_PLACEMENT", new Object[0]);
        }
        u0.getClass();
        return new p(s, s1, ((v & 4) == 0 ? "BUILT" : null));
    }

    public static p c(u u0, ArrayList arrayList0) {
        String s = a.H("LOC_UI_PEDIA_PLACEMENT", new Object[0]);
        u0.getClass();
        return u.a(s, arrayList0);
    }

    public final p d() {
        return u.b(this, null, a.H("LOC_WORLDBUILDER_FAILURE_UNKNOWN", new Object[0]), 5);
    }

    public final r e(String s) {
        j.f(s, "id");
        f f0 = this.a;
        Buildings buildings0 = (Buildings)f0.v.h(s);
        if(buildings0 == null) {
            return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        String s1 = null;
        q q0 = this.d;
        if(buildings0.getMaxWorldInstances() == 1 && ((List)q0.k.getValue()).contains(s)) {
            return u.b(this, null, a.H("LOC_NOTIFICATION_WONDER_COMPLETED_HOTSEAT_CURRENT_PLAYER_SUMMARY", new Object[]{buildings0.getName()}), 1);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f0.r)) {
            if(j.a(((Building_ValidTerrains)object0).getBuildingType(), s)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((Building_ValidTerrains)object1).getTerrainType());
        }
        Plot plot0 = this.c;
        if(!arrayList1.isEmpty() && !arrayList1.contains("TERRAIN_PLAINS")) {
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: arrayList1) {
                Terrains terrains0 = (Terrains)f0.z1.h(((String)object2));
                String s2 = a.I((terrains0 == null ? null : terrains0.getName()));
                if(s2 != null) {
                    arrayList2.add(s2);
                }
            }
            return u.c(this, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: ((Iterable)f0.o)) {
            if(j.a(((Building_RequiredFeatures)object3).getBuildingType(), s)) {
                arrayList3.add(object3);
            }
        }
        ArrayList arrayList4 = new ArrayList(k.E(arrayList3));
        for(Object object4: arrayList3) {
            arrayList4.add(((Building_RequiredFeatures)object4).getFeatureType());
        }
        K k0 = f0.j0;
        if(!arrayList4.isEmpty()) {
            if(plot0.f() == null) {
                goto label_53;
            }
            String s3 = plot0.f();
            j.c(s3);
            if(!arrayList4.contains(s3)) {
            label_53:
                ArrayList arrayList5 = new ArrayList();
                for(Object object5: arrayList4) {
                    Features features0 = (Features)k0.h(((String)object5));
                    String s4 = a.I((features0 == null ? null : features0.getName()));
                    if(s4 != null) {
                        arrayList5.add(s4);
                    }
                }
                return u.c(this, arrayList5);
            }
        }
        if(plot0.f() != null) {
            ArrayList arrayList6 = new ArrayList();
            for(Object object6: ((Iterable)f0.q)) {
                if(j.a(((Building_ValidFeatures)object6).getBuildingType(), s)) {
                    arrayList6.add(object6);
                }
            }
            ArrayList arrayList7 = new ArrayList(k.E(arrayList6));
            for(Object object7: arrayList6) {
                arrayList7.add(((Building_ValidFeatures)object7).getFeatureType());
            }
            if(!arrayList7.isEmpty()) {
                String s5 = plot0.f();
                j.c(s5);
                if(!arrayList7.contains(s5)) {
                    ArrayList arrayList8 = new ArrayList();
                    for(Object object8: arrayList7) {
                        Features features1 = (Features)k0.h(((String)object8));
                        String s6 = a.I((features1 == null ? null : features1.getName()));
                        if(s6 != null) {
                            arrayList8.add(s6);
                        }
                    }
                    return u.c(this, arrayList8);
                }
            }
        }
        String s7 = "";
        if(buildings0.getMustBeLake() && !plot0.l(f0)) {
            return u.b(this, null, a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_LAKE", new Object[0]), 5);
        }
        if(j.a(buildings0.getCoast(), Boolean.TRUE) && !plot0.l(f0)) {
            return u.b(this, null, a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_COAST", new Object[0]), 5);
        }
        if(buildings0.getAdjacentDistrict() != null) {
            ArrayList arrayList9 = q0.d();
            if(!arrayList9.isEmpty()) {
                for(Object object9: arrayList9) {
                    if(!j.a(((Plot)object9).e(), buildings0.getAdjacentDistrict())) {
                        continue;
                    }
                    goto label_112;
                }
            }
            Districts districts0 = (Districts)f0.b0.h(buildings0.getAdjacentDistrict());
            String s8 = a.H("LOC_UI_PEDIA_ADJACENCY", new Object[0]);
            if(districts0 != null) {
                s1 = districts0.getName();
            }
            String s9 = a.I(s1);
            if(s9 != null) {
                s7 = s9;
            }
            return u.b(this, s8, s7, 4);
        }
    label_112:
        if(buildings0.getAdjacentImprovement() != null) {
            ArrayList arrayList10 = q0.d();
            if(!arrayList10.isEmpty()) {
                for(Object object10: arrayList10) {
                    if(!j.a(((Plot)object10).g(), buildings0.getAdjacentImprovement())) {
                        continue;
                    }
                    goto label_128;
                }
            }
            Improvements improvements0 = (Improvements)f0.K0.h(buildings0.getAdjacentImprovement());
            String s10 = a.H("LOC_UI_PEDIA_ADJACENCY", new Object[0]);
            if(improvements0 != null) {
                s1 = improvements0.getName();
            }
            String s11 = a.I(s1);
            if(s11 != null) {
                s7 = s11;
            }
            return u.b(this, s10, s7, 4);
        }
    label_128:
        if(buildings0.getAdjacentResource() != null) {
            ArrayList arrayList11 = q0.d();
            if(!arrayList11.isEmpty()) {
                for(Object object11: arrayList11) {
                    if(!j.a(((Plot)object11).h(), buildings0.getAdjacentResource())) {
                        continue;
                    }
                    goto label_144;
                }
            }
            Resources resources0 = (Resources)f0.o1.h(buildings0.getAdjacentResource());
            String s12 = a.H("LOC_UI_PEDIA_ADJACENCY", new Object[0]);
            if(resources0 != null) {
                s1 = resources0.getName();
            }
            String s13 = a.I(s1);
            if(s13 != null) {
                s7 = s13;
            }
            return u.b(this, s12, s7, 4);
        }
    label_144:
        if(buildings0.getAdjacentCapital() && ((Boolean)q0.l.getValue()).booleanValue()) {
            b b0 = (b)q0.g.getValue();
            if(b0 == null || b0.a != 0) {
                return u.b(this, a.H("LOC_UI_PEDIA_ADJACENCY", new Object[0]), a.H("LOC_DISTRICT_CITY_CENTER_NAME", new Object[0]), 4);
            }
        }
        if(buildings0.getRequiresRiver() && !q0.b()) {
            return u.b(this, a.H("LOC_UI_PEDIA_ADJACENCY", new Object[0]), a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_ADJACENT_RIVER", new Object[0]), 4);
        }
        return buildings0.getAdjacentToMountain() && !((Boolean)q0.o.getValue()).booleanValue() ? u.b(this, a.H("LOC_UI_PEDIA_ADJACENCY", new Object[0]), a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_ADJACENT_MOUNTAIN", new Object[0]), 4) : new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof u)) {
            return false;
        }
        if(!j.a(this.a, ((u)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((u)object0).b)) {
            return false;
        }
        return j.a(this.c, ((u)object0).c) ? j.a(this.d, ((u)object0).d) : false;
    }

    public final r f(String s) {
        j.f(s, "id");
        f f0 = this.a;
        Districts districts0 = (Districts)f0.b0.h(s);
        Plot plot0 = this.c;
        K k0 = f0.z1;
        Terrains terrains0 = (Terrains)k0.h("TERRAIN_PLAINS");
        if(districts0 != null && terrains0 != null) {
            String s1 = null;
            q q0 = this.d;
            if(districts0.getRequiresPlacement() && districts0.getOnePerCity() && ((List)q0.i.getValue()).contains(s)) {
                return u.b(this, null, a.H("LOC_HUD_CITY_DISTRICT_BUILT_TT", new Object[0]), 1);
            }
            if(!terrains0.getImpassable() && (districts0.getCoast() || !terrains0.getWater())) {
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: ((Iterable)f0.a0)) {
                    if(j.a(((District_ValidTerrains)object0).getDistrictType(), s)) {
                        arrayList0.add(object0);
                    }
                }
                ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
                for(Object object1: arrayList0) {
                    arrayList1.add(((District_ValidTerrains)object1).getTerrainType());
                }
                if(!arrayList1.isEmpty() && !arrayList1.contains("TERRAIN_PLAINS")) {
                    ArrayList arrayList2 = new ArrayList();
                    for(Object object2: arrayList1) {
                        Terrains terrains1 = (Terrains)k0.h(((String)object2));
                        String s2 = a.I((terrains1 == null ? null : terrains1.getName()));
                        if(s2 != null) {
                            arrayList2.add(s2);
                        }
                    }
                    return u.c(this, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object3: ((Iterable)f0.Y)) {
                    if(j.a(((District_RequiredFeatures)object3).getDistrictType(), s)) {
                        arrayList3.add(object3);
                    }
                }
                ArrayList arrayList4 = new ArrayList(k.E(arrayList3));
                for(Object object4: arrayList3) {
                    arrayList4.add(((District_RequiredFeatures)object4).getFeatureType());
                }
                if(!arrayList4.isEmpty()) {
                    if(plot0.f() != null) {
                        String s3 = plot0.f();
                        j.c(s3);
                        if(arrayList4.contains(s3)) {
                            goto label_54;
                        }
                        goto label_55;
                    }
                label_54:
                    if(plot0.f() == null) {
                    label_55:
                        ArrayList arrayList5 = new ArrayList();
                        for(Object object5: arrayList4) {
                            Features features0 = (Features)f0.j0.h(((String)object5));
                            String s4 = a.I((features0 == null ? null : features0.getName()));
                            if(s4 != null) {
                                arrayList5.add(s4);
                            }
                        }
                        return u.c(this, arrayList5);
                    }
                }
                if(districts0.getNoAdjacentCity() && ((Boolean)q0.l.getValue()).booleanValue()) {
                    return u.b(this, null, a.H("LOC_UI_PEDIA_PLACEMENT_NOT_ADJ_TO_CITY", new Object[0]), 5);
                }
                if(districts0.getCoast() && (!((Boolean)q0.m.getValue()).booleanValue() || !plot0.l(f0))) {
                    return u.b(this, null, a.H("LOC_UI_PEDIA_PLACEMENT_ADJ_TO_COAST", new Object[0]), 5);
                }
                return districts0.getAqueduct() && (!((Boolean)q0.l.getValue()).booleanValue() || !q0.b() && !((Boolean)q0.o.getValue()).booleanValue()) ? u.b(this, null, a.H("LOC_UI_PEDIA_PLACEMENT_ADJ_TO_CITY", new Object[0]), 5) : new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            Object object6 = null;
            for(Object object7: this.b.k("FEATURES", "Terrain")) {
                if(j.a(((o2.q)object7).b, "TERRAIN_PLAINS")) {
                    object6 = object7;
                    break;
                }
            }
            if(((o2.q)object6) != null) {
                s1 = ((o2.q)object6).e;
            }
            String s5 = a.I(s1);
            String s6 = a.H("LOC_WORLDBUILDER_REMOVE_BUTTON", new Object[0]);
            if(s5 == null) {
                s5 = "";
            }
            return u.b(this, s6, s5, 4);
        }
        return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final r g(String s) {
        j.f(s, "id");
        f f0 = this.a;
        Features features0 = (Features)f0.j0.h(s);
        if(features0 == null) {
            return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        if(features0.getCoast() && !((Boolean)this.d.n.getValue()).booleanValue()) {
            return this.d();
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f0.h0)) {
            if(j.a(((Feature_ValidTerrains)object0).getFeatureType(), s)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((Feature_ValidTerrains)object1).getTerrainType());
        }
        if(arrayList1.contains("TERRAIN_PLAINS")) {
            return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: arrayList1) {
            Terrains terrains0 = (Terrains)f0.z1.h(((String)object2));
            String s1 = a.I((terrains0 == null ? null : terrains0.getName()));
            if(s1 != null) {
                arrayList2.add(s1);
            }
        }
        return u.c(this, arrayList2);
    }

    public final r h(String s) {
        j.f(s, "id");
        f f0 = this.a;
        Improvements improvements0 = (Improvements)f0.K0.h(s);
        if(improvements0 == null) {
            return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        String s1 = null;
        q q0 = this.d;
        if(improvements0.getMinimumAppeal() != null && q0.c() < ((int)improvements0.getMinimumAppeal())) {
            int v = (int)improvements0.getMinimumAppeal();
            d d0 = new d(10);
            for(Object object0: i.m0(((Iterable)f0.d), d0)) {
                AppealHousingChanges appealHousingChanges0 = (AppealHousingChanges)object0;
                if(v >= appealHousingChanges0.getMinimumValue()) {
                    return u.b(this, null, a.H("LOC_TOOLTIP_APPEAL", new Object[]{appealHousingChanges0.getDescription(), improvements0.getMinimumAppeal()}), 5);
                }
                if(false) {
                    break;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if(!improvements0.getSameAdjacentValid()) {
            Iterable iterable0 = (List)q0.t.getValue();
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object1: iterable0) {
                    if(j.a(((Improvements)object1).getImprovementType(), s)) {
                        return this.d();
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        if(improvements0.getBuildInLine()) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: q0.c) {
                if(j.a(((v)object2).b.g(), s)) {
                    arrayList0.add(object2);
                }
            }
            ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
            for(Object object3: arrayList0) {
                arrayList1.add(((v)object3).a);
            }
            for(Object object4: arrayList1) {
                t t0 = (t)object4;
                for(Object object5: arrayList1) {
                    if(t0.b(((t)object5)) == 1) {
                        return this.d();
                    }
                    if(false) {
                        break;
                    }
                }
                if(false) {
                    break;
                }
            }
        }
        if(improvements0.getBuildOnFrontier()) {
            ArrayList arrayList2 = ((c)q0.b.d).a;
            ArrayList arrayList3 = new ArrayList();
            for(Object object6: arrayList2) {
                o.H(((b)object6).c, arrayList3);
            }
            ArrayList arrayList4 = new ArrayList();
            for(Object object7: arrayList3) {
                if(!((t)object7).d(arrayList3).isEmpty()) {
                    arrayList4.add(object7);
                }
            }
            if(!arrayList4.contains(q0.a.a)) {
                return this.d();
            }
        }
        if(improvements0.getOnePerCity() && ((List)q0.j.getValue()).contains(s)) {
            return this.d();
        }
        if(improvements0.getRequiresRiver() == 1 && !q0.b()) {
            return u.b(this, a.H("LOC_UI_PEDIA_ADJACENCY", new Object[0]), a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_ADJACENT_RIVER", new Object[0]), 4);
        }
        if(improvements0.getValidAdjacentTerrainAmount() > 0) {
            ArrayList arrayList5 = new ArrayList();
            for(Object object8: ((Iterable)f0.E0)) {
                if(j.a(((Improvement_ValidAdjacentTerrains)object8).getImprovementType(), improvements0.getImprovementType())) {
                    arrayList5.add(object8);
                }
            }
            ArrayList arrayList6 = new ArrayList(k.E(arrayList5));
            for(Object object9: arrayList5) {
                arrayList6.add(((Improvement_ValidAdjacentTerrains)object9).getTerrainType());
            }
            ArrayList arrayList7 = q0.d();
            ArrayList arrayList8 = new ArrayList();
            for(Object object10: arrayList7) {
                if(arrayList6.contains("TERRAIN_PLAINS")) {
                    arrayList8.add(object10);
                }
            }
            if(arrayList8.size() < improvements0.getValidAdjacentTerrainAmount()) {
                return this.d();
            }
        }
        m m0 = (m)q0.b.f;
        f f1 = m0.a.b.b();
        ArrayList arrayList9 = i.e0(((List)m0.d.getValue()), ((Collection)f1.I0));
        ArrayList arrayList10 = new ArrayList();
        for(Object object11: arrayList9) {
            if(j.a(((Improvement_ValidTerrains)object11).getImprovementType(), s)) {
                arrayList10.add(object11);
            }
        }
        ArrayList arrayList11 = new ArrayList(k.E(arrayList10));
        for(Object object12: arrayList10) {
            arrayList11.add(((Improvement_ValidTerrains)object12).getTerrainType());
        }
        ArrayList arrayList12 = new ArrayList();
        for(Object object13: ((Iterable)f0.G0)) {
            if(j.a(((Improvement_ValidFeatures)object13).getImprovementType(), s)) {
                arrayList12.add(object13);
            }
        }
        ArrayList arrayList13 = new ArrayList(k.E(arrayList12));
        for(Object object14: arrayList12) {
            arrayList13.add(((Improvement_ValidFeatures)object14).getFeatureType());
        }
        ArrayList arrayList14 = new ArrayList();
        for(Object object15: ((Iterable)f0.H0)) {
            if(j.a(((Improvement_ValidResources)object15).getImprovementType(), s)) {
                arrayList14.add(object15);
            }
        }
        ArrayList arrayList15 = new ArrayList(k.E(arrayList14));
        for(Object object16: arrayList14) {
            arrayList15.add(((Improvement_ValidResources)object16).getResourceType());
        }
        Plot plot0 = this.c;
        K k0 = f0.o1;
        String s2 = "";
        if(plot0.h() != null) {
            String s3 = plot0.h();
            j.c(s3);
            if(arrayList15.contains(s3)) {
                return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            String s4 = a.H("LOC_WORLDBUILDER_REMOVE_BUTTON", new Object[0]);
            Resources resources0 = (Resources)k0.h(plot0.h());
            if(resources0 != null) {
                s1 = resources0.getName();
            }
            String s5 = a.I(s1);
            if(s5 != null) {
                s2 = s5;
            }
            return u.b(this, s4, s2, 4);
        }
        if(!arrayList15.isEmpty() && arrayList13.isEmpty() && (arrayList11.isEmpty() || improvements0.getEnforceTerrain())) {
            ArrayList arrayList16 = new ArrayList();
            for(Object object17: arrayList15) {
                Resources resources1 = (Resources)k0.h(((String)object17));
                String s6 = a.I((resources1 == null ? null : resources1.getName()));
                if(s6 != null) {
                    arrayList16.add(s6);
                }
            }
            return u.c(this, arrayList16);
        }
        K k1 = f0.j0;
        if(plot0.f() != null) {
            String s7 = plot0.f();
            j.c(s7);
            if(arrayList13.contains(s7)) {
                return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            String s8 = a.H("LOC_WORLDBUILDER_REMOVE_BUTTON", new Object[0]);
            Features features0 = (Features)k1.h(plot0.f());
            if(features0 != null) {
                s1 = features0.getName();
            }
            String s9 = a.I(s1);
            if(s9 != null) {
                s2 = s9;
            }
            return u.b(this, s8, s2, 4);
        }
        if(!arrayList13.isEmpty() && arrayList11.isEmpty()) {
            ArrayList arrayList17 = new ArrayList();
            for(Object object18: arrayList13) {
                Features features1 = (Features)k1.h(((String)object18));
                String s10 = a.I((features1 == null ? null : features1.getName()));
                if(s10 != null) {
                    arrayList17.add(s10);
                }
            }
            return u.c(this, arrayList17);
        }
        if(arrayList11.contains("TERRAIN_PLAINS")) {
            return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
        }
        ArrayList arrayList18 = new ArrayList();
        for(Object object19: arrayList11) {
            Terrains terrains0 = (Terrains)f0.z1.h(((String)object19));
            String s11 = a.I((terrains0 == null ? null : terrains0.getName()));
            if(s11 != null) {
                arrayList18.add(s11);
            }
        }
        return u.c(this, arrayList18);
    }

    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F;
    }

    public final r i(String s) {
        j.f(s, "id");
        f f0 = this.a;
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f0.m1)) {
            if(j.a(((Resource_ValidTerrains)object0).getResourceType(), s)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((Resource_ValidTerrains)object1).getTerrainType());
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: ((Iterable)f0.l1)) {
            if(j.a(((Resource_ValidFeatures)object2).getResourceType(), s)) {
                arrayList2.add(object2);
            }
        }
        ArrayList arrayList3 = new ArrayList(k.E(arrayList2));
        for(Object object3: arrayList2) {
            arrayList3.add(((Resource_ValidFeatures)object3).getFeatureType());
        }
        Plot plot0 = this.c;
        K k0 = f0.j0;
        String s1 = null;
        if(plot0.f() != null) {
            String s2 = plot0.f();
            j.c(s2);
            if(arrayList3.contains(s2)) {
                return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            String s3 = a.H("LOC_WORLDBUILDER_REMOVE_BUTTON", new Object[0]);
            Features features0 = (Features)k0.h(plot0.f());
            if(features0 != null) {
                s1 = features0.getName();
            }
            String s4 = a.I(s1);
            if(s4 == null) {
                s4 = "";
            }
            return u.b(this, s3, s4, 4);
        }
        if(!arrayList3.isEmpty() && arrayList1.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            for(Object object4: arrayList3) {
                Features features1 = (Features)k0.h(((String)object4));
                String s5 = a.I((features1 == null ? null : features1.getName()));
                if(s5 != null) {
                    arrayList4.add(s5);
                }
            }
            return u.c(this, arrayList4);
        }
        if(!arrayList1.isEmpty()) {
            if(arrayList1.contains("TERRAIN_PLAINS")) {
                return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            ArrayList arrayList5 = new ArrayList();
            for(Object object5: arrayList1) {
                Terrains terrains0 = (Terrains)f0.z1.h(((String)object5));
                String s6 = a.I((terrains0 == null ? null : terrains0.getName()));
                if(s6 != null) {
                    arrayList5.add(s6);
                }
            }
            return u.c(this, arrayList5);
        }
        ArrayList arrayList6 = a.o(f0, s);
        if(!arrayList6.isEmpty()) {
            String s7 = a.H("LOC_UI_PEDIA_CREATED_BY", new Object[0]);
            ArrayList arrayList7 = new ArrayList(k.E(arrayList6));
            for(Object object6: arrayList6) {
                arrayList7.add(a.H(((o2.k)object6).a, new Object[0]));
            }
            return u.a(s7, arrayList7);
        }
        return new m2.q();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final String toString() {
        return "PlotValidator(gameInfo=" + this.a + ", support=" + this.b + ", plot=" + this.c + ", adjacencyProps=" + this.d + ")";
    }
}

