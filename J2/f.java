package j2;

import J2.j;
import N2.c;
import O2.A;
import Q1.b;
import android.support.v4.media.session.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spears.civilopedia.db.tables.BeliefModifiers;
import com.spears.civilopedia.db.tables.Beliefs;
import com.spears.civilopedia.db.tables.Boosts;
import com.spears.civilopedia.db.tables.Building_TourismBombs_XP2;
import com.spears.civilopedia.db.tables.Buildings;
import com.spears.civilopedia.db.tables.Buildings_XP2;
import com.spears.civilopedia.db.tables.Civics;
import com.spears.civilopedia.db.tables.CivilizationTraits;
import com.spears.civilopedia.db.tables.Civilizations;
import com.spears.civilopedia.db.tables.CivilopediaPageLayoutChapters;
import com.spears.civilopedia.db.tables.Districts;
import com.spears.civilopedia.db.tables.DynamicModifiers;
import com.spears.civilopedia.db.tables.Eras;
import com.spears.civilopedia.db.tables.FavoredReligions;
import com.spears.civilopedia.db.tables.Features;
import com.spears.civilopedia.db.tables.Improvement_ValidBuildUnits;
import com.spears.civilopedia.db.tables.Improvement_ValidResources;
import com.spears.civilopedia.db.tables.Improvements;
import com.spears.civilopedia.db.tables.LeaderTraits;
import com.spears.civilopedia.db.tables.Leaders;
import com.spears.civilopedia.db.tables.ModifierArguments;
import com.spears.civilopedia.db.tables.Modifiers;
import com.spears.civilopedia.db.tables.ProjectPrereqs;
import com.spears.civilopedia.db.tables.Project_ResourceCosts;
import com.spears.civilopedia.db.tables.Projects;
import com.spears.civilopedia.db.tables.Religions;
import com.spears.civilopedia.db.tables.Resource_Consumption;
import com.spears.civilopedia.db.tables.Resource_Harvests;
import com.spears.civilopedia.db.tables.Resource_ValidFeatures;
import com.spears.civilopedia.db.tables.Resource_ValidTerrains;
import com.spears.civilopedia.db.tables.Resource_YieldChanges;
import com.spears.civilopedia.db.tables.Resources;
import com.spears.civilopedia.db.tables.Route_ResourceCosts;
import com.spears.civilopedia.db.tables.Route_ValidBuildUnits;
import com.spears.civilopedia.db.tables.Routes;
import com.spears.civilopedia.db.tables.Routes_XP2;
import com.spears.civilopedia.db.tables.Technologies;
import com.spears.civilopedia.db.tables.TechnologyModifiers;
import com.spears.civilopedia.db.tables.TechnologyPrereqs;
import com.spears.civilopedia.db.tables.TechnologyQuotes;
import com.spears.civilopedia.db.tables.Terrain_YieldChanges;
import com.spears.civilopedia.db.tables.Terrains;
import com.spears.civilopedia.db.tables.TypeProperties;
import com.spears.civilopedia.db.tables.UnitOperations;
import com.spears.civilopedia.db.tables.UnitPromotionClasses;
import com.spears.civilopedia.db.tables.UnitPromotionPrereqs;
import com.spears.civilopedia.db.tables.UnitPromotions;
import com.spears.civilopedia.db.tables.UnitReplaces;
import com.spears.civilopedia.db.tables.UnitUpgrades;
import com.spears.civilopedia.db.tables.Unit_BuildingPrereqs;
import com.spears.civilopedia.db.tables.Units;
import com.spears.civilopedia.db.tables.Units_MODE;
import com.spears.civilopedia.db.tables.Units_XP2;
import com.spears.civilopedia.db.tables.Yields;
import i3.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o2.C;
import o2.k;
import o2.l;
import o2.m;
import o2.q;
import o2.x;
import x2.i;
import x2.n;
import x2.w;

public class f extends g {
    public final int i;

    public f(int v) {
        this.i = v;
        super();
    }

    @Override  // j2.g
    public final void k() {
        Iterator iterator33;
        Resources resources2;
        ArrayList arrayList25;
        Iterator iterator31;
        Iterator iterator26;
        ArrayList arrayList20;
        Iterator iterator24;
        k k0;
        switch(this.i) {
            case 0: {
                this.s(this.p().j);
                this.p();
                o2.f f3 = this.m();
                q q1 = this.p();
                m m1 = f3.c1.h(q1.b);
                j.c(m1);
                o2.f f4 = this.m();
                ArrayList arrayList3 = new ArrayList();
                for(Object object4: ((Iterable)f4.Y0)) {
                    if(j.a(((ProjectPrereqs)object4).getProjectType(), ((Projects)m1).getProjectType())) {
                        arrayList3.add(object4);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for(Object object5: arrayList3) {
                    o2.f f5 = this.m();
                    String s3 = ((ProjectPrereqs)object5).getPrereqProjectType();
                    Projects projects0 = (Projects)f5.c1.h(s3);
                    String s4 = projects0 == null ? null : projects0.getShortName();
                    if(s4 != null) {
                        arrayList4.add(s4);
                    }
                }
                ArrayList arrayList5 = new ArrayList(x2.k.E(arrayList4));
                for(Object object6: arrayList4) {
                    arrayList5.add(a.H(((String)object6), new Object[0]));
                }
                ArrayList arrayList6 = i.p0(arrayList5);
                ArrayList arrayList7 = new ArrayList();
                String s5 = ((Projects)m1).getPrereqDistrict();
                if(s5 != null) {
                    Districts districts0 = (Districts)this.m().b0.h(s5);
                    if(districts0 != null) {
                        arrayList7 = A.f0(this.m(), districts0.getTraitType());
                    }
                }
                n.G(arrayList6, new C1.a(7));
                this.f("ICON_" + ((Projects)m1).getProjectType());
                String s6 = ((Projects)m1).getDescription();
                if(s6 != null) {
                    this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{s6}));
                }
                this.a();
                if(Y3.n.t0(((Projects)m1).getProjectType(), "CREATE_HERO")) {
                    String s7 = Y3.n.F0(((Projects)m1).getProjectType(), "PROJECT_CREATE_HERO_", "");
                    LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                    TextView textView2 = (TextView)e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
                    j.c(textView2);
                    o1.a.U(textView2, "LOC_UI_PEDIA_UNLOCKS");
                    b b2 = new b(linearLayout2, this.q());
                    b2.h();
                    b2.b(new k("ICON_UNIT_HERO_" + s7, e.f("LOC_UNIT_HERO_", s7, "_DESCRIPTION"), "UNIT_HERO_" + s7, null), "LOC_UNIT_HERO_" + s7 + "_NAME");
                    b2.h();
                    if(!b2.n()) {
                        this.j(linearLayout2);
                    }
                }
                LinearLayout linearLayout3 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView3 = (TextView)e.c(linearLayout3, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView3);
                o1.a.U(textView3, "LOC_UI_PEDIA_TRAITS");
                b b3 = new b(linearLayout3, this.q());
                b3.h();
                if(!arrayList7.isEmpty()) {
                    b3.a("LOC_UI_PEDIA_UNIQUE_TO");
                    for(Object object7: arrayList7) {
                        j.c(((k)object7).b);
                        b3.b(((k)object7), ((k)object7).b);
                    }
                    b3.h();
                }
                if(!b3.n()) {
                    this.j(linearLayout3);
                }
                LinearLayout linearLayout4 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView4 = (TextView)e.c(linearLayout4, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView4);
                o1.a.U(textView4, "LOC_UI_PEDIA_REQUIREMENTS");
                b b4 = new b(linearLayout4, this.q());
                b4.h();
                String s8 = ((Projects)m1).getPrereqDistrict();
                if(s8 != null) {
                    Districts districts1 = (Districts)this.m().b0.h(s8);
                    if(districts1 != null) {
                        b4.a("LOC_DISTRICT_NAME");
                        b4.b(new k(A.f.h("ICON_", districts1.getDistrictType()), districts1.getName(), districts1.getDistrictType(), null), districts1.getName());
                    }
                }
                String s9 = ((Projects)m1).getPrereqCivic();
                if(s9 != null) {
                    Civics civics0 = (Civics)this.m().B.h(s9);
                    if(civics0 != null) {
                        b4.a("LOC_CIVIC_NAME");
                        b4.b(new k(A.f.h("ICON_", civics0.getCivicType()), civics0.getName(), civics0.getCivicType(), null), civics0.getName());
                    }
                }
                String s10 = ((Projects)m1).getPrereqResource();
                if(s10 != null) {
                    Resources resources0 = (Resources)this.m().o1.h(s10);
                    if(resources0 != null) {
                        b4.a("LOC_RESOURCE_NAME");
                        b4.b(new k(A.f.h("ICON_", resources0.getResourceType()), resources0.getName(), resources0.getResourceType(), null), resources0.getName());
                    }
                }
                String s11 = ((Projects)m1).getPrereqTech();
                if(s11 != null) {
                    Technologies technologies0 = (Technologies)this.m().t1.h(s11);
                    if(technologies0 != null) {
                        b4.a("LOC_TECHNOLOGY_NAME");
                        b4.b(new k(A.f.h("ICON_", technologies0.getTechnologyType()), technologies0.getName(), technologies0.getTechnologyType(), null), technologies0.getName());
                    }
                }
                if(!arrayList6.isEmpty()) {
                    b4.a("LOC_UI_PEDIA_PROJECTS");
                    for(Object object8: arrayList6) {
                        b4.f("[ICON_Bullet] " + ((String)object8));
                    }
                }
                b4.h();
                if(!b4.n()) {
                    this.j(linearLayout4);
                }
                return;
            }
            case 1: {
                this.s(this.p().j);
                this.p();
                o2.f f6 = this.m();
                q q2 = this.p();
                m m2 = f6.e1.h(q2.b);
                j.c(m2);
                String s12 = ((Religions)m2).getReligionType();
                ArrayList arrayList8 = new ArrayList();
                o2.f f7 = this.m();
                ArrayList arrayList9 = new ArrayList();
                for(Object object9: ((Iterable)f7.f0)) {
                    if(j.a(((FavoredReligions)object9).getReligionType(), s12)) {
                        arrayList9.add(object9);
                    }
                }
                for(Object object10: arrayList9) {
                    FavoredReligions favoredReligions0 = (FavoredReligions)object10;
                    if(favoredReligions0.getLeaderType() == null && favoredReligions0.getCivilizationType() != null) {
                        Civilizations civilizations0 = (Civilizations)this.m().F.h(favoredReligions0.getCivilizationType());
                        if(civilizations0 == null) {
                            continue;
                        }
                        arrayList8.add(new k(A.f.h("ICON_", civilizations0.getCivilizationType()), civilizations0.getName(), civilizations0.getCivilizationType(), null));
                    }
                    else if(favoredReligions0.getLeaderType() != null) {
                        Leaders leaders0 = (Leaders)this.m().O0.h(favoredReligions0.getLeaderType());
                        if(leaders0 != null) {
                            arrayList8.add(new k(A.f.h("ICON_", leaders0.getLeaderType()), leaders0.getName(), leaders0.getLeaderType(), null));
                        }
                    }
                }
                this.f("ICON_" + s12);
                this.a();
                if(!arrayList8.isEmpty()) {
                    LinearLayout linearLayout5 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                    TextView textView5 = (TextView)e.c(linearLayout5, 0x80, 0x7F0700F7);  // id:stat_box_title
                    j.c(textView5);
                    o1.a.U(textView5, "LOC_UI_PEDIA_FOLLOWERS");
                    b b5 = new b(linearLayout5, this.q());
                    b5.h();
                    for(Object object11: arrayList8) {
                        j.c(((k)object11));
                        j.c(((k)object11).b);
                        b5.b(((k)object11), ((k)object11).b);
                    }
                    if(!b5.n()) {
                        this.j(linearLayout5);
                    }
                }
                return;
            }
            case 2: {
                this.s(this.p().j);
                this.p();
                o2.f f8 = this.m();
                q q3 = this.p();
                m m3 = f8.o1.h(q3.b);
                j.c(m3);
                Resources resources1 = (Resources)m3;
                String s13 = resources1.getResourceType();
                String s14 = (String)w.s(new w2.e[]{new w2.e("RESOURCECLASS_BONUS", "LOC_RESOURCECLASS_BONUS_NAME"), new w2.e("RESOURCECLASS_LUXURY", "LOC_RESOURCECLASS_LUXURY_NAME"), new w2.e("RESOURCECLASS_STRATEGIC", "LOC_RESOURCECLASS_STRATEGIC_NAME"), new w2.e("RESOURCECLASS_ARTIFACT", "LOC_RESOURCECLASS_ARTIFACT_NAME")}).get(resources1.getResourceClassType());
                HashMap hashMap0 = new HashMap();
                for(Object object12: ((List)this.m().n1)) {
                    Resource_YieldChanges resource_YieldChanges0 = (Resource_YieldChanges)object12;
                    if(j.a(resource_YieldChanges0.getResourceType(), s13)) {
                        String s15 = resource_YieldChanges0.getYieldType();
                        Integer integer0 = (Integer)hashMap0.get(resource_YieldChanges0.getYieldType());
                        if(integer0 == null) {
                            integer0 = 0;
                        }
                        hashMap0.put(s15, ((int)(resource_YieldChanges0.getYieldChange() + ((int)integer0))));
                    }
                }
                ArrayList arrayList10 = new ArrayList();
                for(Object object13: ((List)this.m().R1.i)) {
                    Yields yields0 = (Yields)object13;
                    Integer integer1 = (Integer)hashMap0.get(yields0.getYieldType());
                    if(integer1 != null) {
                        arrayList10.add(new w2.i(integer1, yields0.getIconString(), a.H(yields0.getName(), new Object[0])));
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                for(Object object14: ((List)this.m().l1)) {
                    Resource_ValidFeatures resource_ValidFeatures0 = (Resource_ValidFeatures)object14;
                    if(j.a(resource_ValidFeatures0.getResourceType(), s13)) {
                        Features features0 = (Features)this.m().j0.h(resource_ValidFeatures0.getFeatureType());
                        if(features0 != null) {
                            arrayList11.add(new w2.e(a.H(features0.getName(), new Object[0]), features0.getFeatureType()));
                        }
                    }
                }
                for(Object object15: ((List)this.m().m1)) {
                    Resource_ValidTerrains resource_ValidTerrains0 = (Resource_ValidTerrains)object15;
                    if(j.a(resource_ValidTerrains0.getResourceType(), s13)) {
                        Terrains terrains0 = (Terrains)this.m().z1.h(resource_ValidTerrains0.getTerrainType());
                        if(terrains0 != null) {
                            arrayList11.add(new w2.e(a.H(terrains0.getName(), new Object[0]), terrains0.getTerrainType()));
                        }
                    }
                }
                n.G(arrayList11, new C1.a(11));
                String s16 = resources1.getPrereqTech();
                if(s16 == null) {
                    k0 = null;
                }
                else {
                    Technologies technologies1 = (Technologies)this.m().t1.h(s16);
                    k0 = technologies1 == null ? null : new k(A.f.h("ICON_", technologies1.getTechnologyType()), technologies1.getName(), technologies1.getTechnologyType(), null);
                }
                String s17 = resources1.getPrereqCivic();
                if(s17 != null) {
                    Civics civics1 = (Civics)this.m().B.h(s17);
                    if(civics1 != null) {
                        k0 = new k(A.f.h("ICON_", civics1.getCivicType()), civics1.getName(), civics1.getCivicType(), null);
                    }
                }
                o2.f f9 = this.m();
                ArrayList arrayList12 = new ArrayList();
                for(Object object16: ((Iterable)f9.H0)) {
                    if(j.a(((Improvement_ValidResources)object16).getResourceType(), s13)) {
                        arrayList12.add(object16);
                    }
                }
                ArrayList arrayList13 = new ArrayList();
                for(Object object17: arrayList12) {
                    o2.f f10 = this.m();
                    String s18 = ((Improvement_ValidResources)object17).getImprovementType();
                    Improvements improvements0 = (Improvements)f10.K0.h(s18);
                    if(improvements0 != null) {
                        arrayList13.add(improvements0);
                    }
                }
                ArrayList arrayList14 = new ArrayList(x2.k.E(arrayList13));
                for(Object object18: arrayList13) {
                    arrayList14.add(new k(((Improvements)object18).getIcon(), ((Improvements)object18).getName(), ((Improvements)object18).getImprovementType(), null));
                }
                i.m0(arrayList14, new C1.a(12));
                o2.f f11 = this.m();
                ArrayList arrayList15 = new ArrayList();
                for(Object object19: ((Iterable)f11.k1)) {
                    if(j.a(((Resource_Harvests)object19).getResourceType(), s13)) {
                        arrayList15.add(object19);
                    }
                }
                o2.f f12 = this.m();
                ArrayList arrayList16 = new ArrayList();
                for(Object object20: ((List)f12.w.i)) {
                    if(j.a(((Buildings_XP2)object20).getResourceTypeConvertedToPower(), s13)) {
                        arrayList16.add(object20);
                    }
                }
                ArrayList arrayList17 = new ArrayList();
                for(Object object21: arrayList16) {
                    o2.f f13 = this.m();
                    String s19 = ((Buildings_XP2)object21).getBuildingType();
                    Buildings buildings0 = (Buildings)f13.v.h(s19);
                    if(buildings0 != null) {
                        arrayList17.add(buildings0);
                    }
                }
                ArrayList arrayList18 = new ArrayList(x2.k.E(arrayList17));
                for(Object object22: arrayList17) {
                    arrayList18.add(new l(new k(A.f.h("ICON_", ((Buildings)object22).getBuildingType()), ((Buildings)object22).getName(), ((Buildings)object22).getBuildingType(), null), a.H(((Buildings)object22).getName(), new Object[0])));
                }
                i.m0(arrayList18, new C1.a(13));
                HashSet hashSet0 = new HashSet();
                ArrayList arrayList19 = new ArrayList();
                Iterator iterator23 = ((List)this.m().c1.i).iterator();
                while(iterator23.hasNext()) {
                    Object object23 = iterator23.next();
                    Projects projects1 = (Projects)object23;
                    if(j.a(projects1.getPrereqResource(), s13)) {
                        Projects projects2 = (Projects)this.m().c1.h(projects1.getProjectType());
                        if(projects2 == null) {
                            iterator24 = iterator23;
                            arrayList20 = arrayList18;
                        }
                        else {
                            iterator24 = iterator23;
                            arrayList20 = arrayList18;
                            arrayList19.add(new l(new k(A.f.h("ICON_", projects2.getProjectType()), projects2.getName(), projects2.getProjectType(), null), a.H(projects2.getName(), new Object[0])));
                            hashSet0.add(projects2.getProjectType());
                        }
                        iterator23 = iterator24;
                        arrayList18 = arrayList20;
                    }
                }
                Iterator iterator25 = ((List)this.m().a1).iterator();
                while(iterator25.hasNext()) {
                    Object object24 = iterator25.next();
                    Project_ResourceCosts project_ResourceCosts0 = (Project_ResourceCosts)object24;
                    if(j.a(project_ResourceCosts0.getResourceType(), s13) && !hashSet0.contains(project_ResourceCosts0.getProjectType())) {
                        Projects projects3 = (Projects)this.m().c1.h(project_ResourceCosts0.getProjectType());
                        if(projects3 == null) {
                            iterator26 = iterator25;
                        }
                        else {
                            iterator26 = iterator25;
                            arrayList19.add(new l(new k(A.f.h("ICON_", projects3.getProjectType()), projects3.getName(), projects3.getProjectType(), null), a.H(projects3.getName(), new Object[0])));
                            hashSet0.add(projects3.getProjectType());
                        }
                        iterator25 = iterator26;
                    }
                }
                i.m0(arrayList19, new C1.a(14));
                o2.f f14 = this.m();
                ArrayList arrayList21 = new ArrayList();
                for(Object object25: ((Iterable)f14.p1)) {
                    if(j.a(((Route_ResourceCosts)object25).getResourceType(), s13)) {
                        arrayList21.add(object25);
                    }
                }
                ArrayList arrayList22 = new ArrayList();
                for(Object object26: arrayList21) {
                    o2.f f15 = this.m();
                    String s20 = ((Route_ResourceCosts)object26).getRouteType();
                    Routes routes0 = (Routes)f15.r1.h(s20);
                    if(routes0 != null) {
                        arrayList22.add(routes0);
                    }
                }
                ArrayList arrayList23 = new ArrayList(x2.k.E(arrayList22));
                for(Object object27: arrayList22) {
                    arrayList23.add(new l(new k(A.f.h("ICON_", ((Routes)object27).getRouteType()), ((Routes)object27).getName(), ((Routes)object27).getRouteType(), null), a.H(((Routes)object27).getName(), new Object[0])));
                }
                i.m0(arrayList23, new C1.a(15));
                HashSet hashSet1 = new HashSet();
                ArrayList arrayList24 = new ArrayList();
                Iterator iterator30 = ((List)this.m().O1.i).iterator();
                while(iterator30.hasNext()) {
                    Object object28 = iterator30.next();
                    Units units0 = (Units)object28;
                    if(j.a(units0.getStrategicResource(), s13)) {
                        Units units1 = (Units)this.m().O1.h(units0.getUnitType());
                        if(units1 == null) {
                            resources2 = resources1;
                            arrayList25 = arrayList23;
                            iterator31 = iterator30;
                        }
                        else {
                            iterator31 = iterator30;
                            arrayList25 = arrayList23;
                            resources2 = resources1;
                            arrayList19.add(new l(new k(A.f.h("ICON_", units1.getUnitType()), units1.getName(), units1.getUnitType(), null), a.H(units1.getName(), new Object[0])));
                            hashSet1.add(units1.getUnitType());
                        }
                        iterator30 = iterator31;
                        arrayList23 = arrayList25;
                        resources1 = resources2;
                    }
                }
                Iterator iterator32 = ((List)this.m().Q1.i).iterator();
                while(iterator32.hasNext()) {
                    Object object29 = iterator32.next();
                    Units_XP2 units_XP20 = (Units_XP2)object29;
                    if(j.a(units_XP20.getResourceMaintenanceType(), s13) && !hashSet1.contains(units_XP20.getUnitType())) {
                        Units units2 = (Units)this.m().O1.h(units_XP20.getUnitType());
                        if(units2 == null) {
                            iterator33 = iterator32;
                        }
                        else {
                            iterator33 = iterator32;
                            arrayList19.add(new l(new k(A.f.h("ICON_", units2.getUnitType()), units2.getName(), units2.getUnitType(), null), a.H(units2.getName(), new Object[0])));
                        }
                        iterator32 = iterator33;
                    }
                }
                i.m0(arrayList24, new C1.a(16));
                ArrayList arrayList26 = a.o(this.m(), s13);
                this.f("ICON_" + s13);
                this.a();
                LinearLayout linearLayout6 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView6 = (TextView)e.c(linearLayout6, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView6);
                o1.a.U(textView6, "LOC_UI_PEDIA_TRAITS");
                b b6 = new b(linearLayout6, this.q());
                b6.h();
                if(s14 != null) {
                    b6.a(s14);
                }
                if(!arrayList10.isEmpty()) {
                    for(Object object30: arrayList10) {
                        b6.f(a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{((w2.i)object30).i, ((w2.i)object30).j, ((w2.i)object30).k}));
                    }
                }
                if(resources1.getHappiness() > 0) {
                    b6.f(a.H("LOC_TYPE_TRAIT_HAPPINESS", new Object[]{resources1.getHappiness()}));
                }
                Resource_Consumption resource_Consumption0 = (Resource_Consumption)this.m().j1.h(s13);
                if(resource_Consumption0 != null && resource_Consumption0.getAccumulate() && resource_Consumption0.getImprovedExtractionRate() > 0) {
                    b6.f(a.H("LOC_RESOURCE_ACCUMULATION_WHEN_IMPROVED", new Object[]{resource_Consumption0.getImprovedExtractionRate(), e.f("[ICON_", resources1.getResourceType(), "]"), resources1.getName()}));
                }
                b6.h();
                if(!b6.n()) {
                    this.j(linearLayout6);
                }
                LinearLayout linearLayout7 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView7 = (TextView)e.c(linearLayout7, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView7);
                o1.a.U(textView7, "LOC_UI_PEDIA_REQUIREMENTS");
                b b7 = new b(linearLayout7, this.q());
                b7.h();
                if(k0 != null) {
                    b7.a("LOC_UI_PEDIA_UNLOCKED_BY");
                    j.c(k0.b);
                    b7.b(k0, k0.b);
                }
                if(s13.equals("RESOURCE_CLOVES") || s13.equals("RESOURCE_CINNAMON")) {
                    Civilizations civilizations1 = (Civilizations)this.m().F.h("CIVILIZATION_ZANZIBAR");
                    if(civilizations1 != null) {
                        b7.a("LOC_UI_PEDIA_SUZERAIN");
                        b7.b(new k("ICON_CIVILIZATION_ZANZIBAR", civilizations1.getName(), civilizations1.getCivilizationType(), null), civilizations1.getName());
                        b7.h();
                    }
                }
                if(!arrayList26.isEmpty()) {
                    b7.a("LOC_UI_PEDIA_CREATED_BY");
                    for(Object object31: arrayList26) {
                        j.c(((k)object31).b);
                        b7.b(((k)object31), ((k)object31).b);
                    }
                    b7.h();
                }
                if(!arrayList11.isEmpty()) {
                    b7.a("LOC_UI_PEDIA_PLACEMENT");
                    for(Object object32: arrayList11) {
                        b7.b(new k(A.f.h("ICON_", ((String)((w2.e)object32).j)), ((String)((w2.e)object32).i), ((String)((w2.e)object32).j), null), ((String)((w2.e)object32).i));
                    }
                    b7.h();
                }
                if(!b7.n()) {
                    this.j(linearLayout7);
                }
                LinearLayout linearLayout8 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView8 = (TextView)e.c(linearLayout8, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView8);
                o1.a.U(textView8, "LOC_UI_PEDIA_USAGE");
                b b8 = new b(linearLayout8, this.q());
                b8.h();
                if(!arrayList14.isEmpty()) {
                    b8.a("LOC_UI_PEDIA_IMPROVED_BY");
                    for(Object object33: arrayList14) {
                        j.c(((k)object33).b);
                        b8.b(((k)object33), ((k)object33).b);
                    }
                    b8.h();
                }
                if(!arrayList15.isEmpty()) {
                    b8.a("LOC_UI_PEDIA_HARVEST");
                    for(Object object34: arrayList15) {
                        Resource_Harvests resource_Harvests0 = (Resource_Harvests)object34;
                        Yields yields1 = (Yields)this.m().R1.h(resource_Harvests0.getYieldType());
                        if(yields1 != null) {
                            b8.f(a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{resource_Harvests0.getAmount(), yields1.getIconString(), yields1.getName()}));
                            String s21 = resource_Harvests0.getPrereqTech();
                            if(s21 != null) {
                                Technologies technologies2 = (Technologies)this.m().t1.h(s21);
                                if(technologies2 != null) {
                                    b8.b(new k(A.f.h("ICON_", technologies2.getTechnologyType()), technologies2.getName(), technologies2.getTechnologyType(), null), technologies2.getName());
                                }
                            }
                        }
                    }
                    b8.h();
                }
                if(!arrayList18.isEmpty()) {
                    Iterator iterator39 = e.k("LOC_UI_PEDIA_RESOURCES_BUILDINGS", new Object[]{arrayList18.size()}, b8, arrayList18);
                    while(iterator39.hasNext()) {
                        Object object35 = iterator39.next();
                        b8.c(((l)object35));
                    }
                    b8.h();
                }
                if(!arrayList19.isEmpty()) {
                    Iterator iterator40 = e.k("LOC_UI_PEDIA_RESOURCES_PROJECTS", new Object[]{arrayList19.size()}, b8, arrayList19);
                    while(iterator40.hasNext()) {
                        Object object36 = iterator40.next();
                        j.c(((l)object36));
                        b8.c(((l)object36));
                    }
                    b8.h();
                }
                if(!arrayList23.isEmpty()) {
                    Iterator iterator41 = e.k("LOC_UI_PEDIA_RESOURCES_ROUTES", new Object[]{arrayList23.size()}, b8, arrayList23);
                    while(iterator41.hasNext()) {
                        Object object37 = iterator41.next();
                        b8.c(((l)object37));
                    }
                    b8.h();
                }
                if(!arrayList24.isEmpty()) {
                    Iterator iterator42 = e.k("LOC_UI_PEDIA_RESOURCES_UNITS", new Object[]{arrayList24.size()}, b8, arrayList24);
                    while(iterator42.hasNext()) {
                        Object object38 = iterator42.next();
                        j.c(((l)object38));
                        b8.c(((l)object38));
                    }
                    b8.h();
                }
                if(!b8.n()) {
                    this.j(linearLayout8);
                }
                return;
            }
            case 3: {
                this.t();
                return;
            }
            case 4: {
                this.u();
                return;
            }
            case 5: {
                this.v();
                return;
            }
            case 6: {
                this.w();
                return;
            }
            case 7: {
                this.x();
                return;
            }
            default: {
                this.s(this.p().j);
                this.p();
                o2.f f0 = this.m();
                q q0 = this.p();
                m m0 = f0.K1.h(q0.b);
                j.c(m0);
                String s = ((UnitPromotions)m0).getUnitPromotionType();
                o2.f f1 = this.m();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: ((Iterable)f1.J1)) {
                    if(j.a(((UnitPromotionPrereqs)object0).getUnitPromotion(), s)) {
                        arrayList0.add(object0);
                    }
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: arrayList0) {
                    o2.f f2 = this.m();
                    String s1 = ((UnitPromotionPrereqs)object1).getPrereqUnitPromotion();
                    UnitPromotions unitPromotions0 = (UnitPromotions)f2.K1.h(s1);
                    if(unitPromotions0 != null) {
                        arrayList1.add(unitPromotions0);
                    }
                }
                ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
                for(Object object2: arrayList1) {
                    arrayList2.add(a.H(((UnitPromotions)object2).getName(), new Object[0]));
                }
                i.m0(arrayList2, new C1.a(7));
                this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{((UnitPromotions)m0).getDescription()}));
                this.a();
                LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView0 = (TextView)e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView0);
                o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
                b b0 = new b(linearLayout0, this.q());
                b0.h();
                String s2 = ((UnitPromotions)m0).getPromotionClass();
                if(s2 != null) {
                    UnitPromotionClasses unitPromotionClasses0 = (UnitPromotionClasses)this.m().I1.h(s2);
                    if(unitPromotionClasses0 != null) {
                        b0.a("LOC_UI_PEDIA_PROMOTION_CLASS");
                        b0.f(unitPromotionClasses0.getName());
                    }
                }
                b0.h();
                if(!b0.n()) {
                    this.j(linearLayout0);
                }
                LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView1 = (TextView)e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView1);
                o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
                b b1 = new b(linearLayout1, this.q());
                b1.h();
                if(!arrayList2.isEmpty()) {
                    b1.a("LOC_UI_PEDIA_PROMOTIONS");
                    for(Object object3: arrayList2) {
                        b1.f("[ICON_Bullet] " + ((String)object3));
                    }
                }
                b1.h();
                if(!b1.n()) {
                    this.j(linearLayout1);
                }
            }
        }
    }

    private final void t() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.r1.h(q0.b);
        j.c(m0);
        String s = ((Routes)m0).getRouteType();
        o2.f f1 = this.m();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f1.q1)) {
            if(j.a(((Route_ValidBuildUnits)object0).getRouteType(), s)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            o2.f f2 = this.m();
            String s1 = ((Route_ValidBuildUnits)object1).getUnitType();
            Units units0 = (Units)f2.O1.h(s1);
            if(units0 != null) {
                arrayList1.add(units0);
            }
        }
        ArrayList arrayList2 = i.p0(arrayList1);
        Routes_XP2 routes_XP20 = (Routes_XP2)this.m().s1.h(s);
        int v = routes_XP20 == null ? 1 : !routes_XP20.getBuildOnlyWithUnit();
        if(v != 0) {
            Units units1 = (Units)this.m().O1.h("UNIT_TRADER");
            if(units1 != null) {
                arrayList2.add(units1);
            }
        }
        n.G(arrayList2, new C1.a(17));
        this.f("ICON_" + s);
        this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{((Routes)m0).getDescription()}));
        this.a();
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        b b0 = new b(linearLayout0, this.q());
        b0.h();
        b0.f(a.H("LOC_ROUTE_MOVEMENT_COST", new Object[]{((Routes)m0).getMovementCost()}));
        if(((Routes)m0).getSupportsBridges()) {
            b0.f("LOC_ROUTE_SUPPORTS_BRIDGES");
        }
        b0.h();
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
        b b1 = new b(linearLayout1, this.q());
        b1.h();
        String s2 = ((Routes)m0).getPrereqEra();
        if(s2 != null) {
            Eras eras0 = (Eras)this.m().d0.h(s2);
            if(eras0 != null) {
                b1.a("LOC_ERA_NAME");
                b1.f(eras0.getName());
                b1.h();
            }
        }
        if(routes_XP20 != null) {
            String s3 = routes_XP20.getPrereqTech();
            if(s3 != null) {
                Technologies technologies0 = (Technologies)this.m().t1.h(s3);
                if(technologies0 != null) {
                    b1.a("LOC_TECHNOLOGY_NAME");
                    b1.b(new k(A.f.h("ICON_", technologies0.getTechnologyType()), technologies0.getName(), technologies0.getTechnologyType(), null), technologies0.getName());
                    b1.h();
                }
            }
        }
        if(!b1.n()) {
            this.j(linearLayout1);
        }
        LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView2 = (TextView)e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView2);
        o1.a.U(textView2, "LOC_UI_PEDIA_USAGE");
        b b2 = new b(linearLayout2, this.q());
        b2.h();
        if(!arrayList2.isEmpty()) {
            b2.a("LOC_UI_PEDIA_BUILT_BY");
            for(Object object2: arrayList2) {
                b2.b(new k(A.f.h("ICON_", ((Units)object2).getUnitType()), ((Units)object2).getName(), ((Units)object2).getUnitType(), null), ((Units)object2).getName());
            }
            b2.h();
        }
        if(!b2.n()) {
            this.j(linearLayout2);
        }
    }

    private final void u() {
        this.s(this.p().j);
        int v = 0;
        for(Object object0: this.q().i(this.p().d)) {
            if(v >= 0) {
                x x0 = this.q();
                q q0 = this.p();
                q q1 = this.p();
                String s = ((CivilopediaPageLayoutChapters)object0).getChapterId();
                String s1 = x0.g(q0.a, q1.b, s);
                x x1 = this.q();
                q q2 = this.p();
                q q3 = this.p();
                String s2 = ((CivilopediaPageLayoutChapters)object0).getChapterId();
                ArrayList arrayList0 = x1.f(q2.a, q3.b, s2);
                if(s1 == null || v == 0 && a.H(s1, new Object[0]).equals(this.p().j) || a.H(s1, new Object[0]).equals(this.p().k)) {
                    this.e(arrayList0);
                }
                else {
                    this.b(s1, arrayList0);
                }
                ++v;
                continue;
            }
            x2.j.D();
            throw null;
        }
    }

    private final void v() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.t1.h(q0.b);
        j.c(m0);
        String s = ((Technologies)m0).getTechnologyType();
        o2.f f1 = this.m();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f1.v1)) {
            if(j.a(((TechnologyPrereqs)object0).getTechnology(), s)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            o2.f f2 = this.m();
            String s1 = ((TechnologyPrereqs)object1).getPrereqTech();
            Technologies technologies0 = (Technologies)f2.t1.h(s1);
            if(technologies0 != null) {
                arrayList1.add(technologies0);
            }
        }
        ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
        for(Object object2: arrayList1) {
            arrayList2.add(new k(A.f.h("ICON_", ((Technologies)object2).getTechnologyType()), ((Technologies)object2).getName(), ((Technologies)object2).getTechnologyType(), null));
        }
        o2.f f3 = this.m();
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: ((Iterable)f3.v1)) {
            if(j.a(((TechnologyPrereqs)object3).getPrereqTech(), s)) {
                arrayList3.add(object3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: arrayList3) {
            o2.f f4 = this.m();
            String s2 = ((TechnologyPrereqs)object4).getTechnology();
            Technologies technologies1 = (Technologies)f4.t1.h(s2);
            if(technologies1 != null) {
                arrayList4.add(technologies1);
            }
        }
        ArrayList arrayList5 = new ArrayList(x2.k.E(arrayList4));
        for(Object object5: arrayList4) {
            arrayList5.add(new k(A.f.h("ICON_", ((Technologies)object5).getTechnologyType()), ((Technologies)object5).getName(), ((Technologies)object5).getTechnologyType(), null));
        }
        o2.f f5 = this.m();
        ArrayList arrayList6 = new ArrayList();
        for(Object object6: ((Iterable)f5.h)) {
            if(j.a(((Boosts)object6).getTechnologyType(), s)) {
                arrayList6.add(object6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        o2.f f6 = this.m();
        ArrayList arrayList8 = new ArrayList();
        for(Object object7: ((Iterable)f6.u1)) {
            if(j.a(((TechnologyModifiers)object7).getTechnologyType(), s)) {
                arrayList8.add(object7);
            }
        }
        int v = 0;
        int v1 = 0;
        for(Object object8: arrayList8) {
            TechnologyModifiers technologyModifiers0 = (TechnologyModifiers)object8;
            Modifiers modifiers0 = (Modifiers)this.m().R0.h(technologyModifiers0.getModifierId());
            if(modifiers0 != null) {
                DynamicModifiers dynamicModifiers0 = (DynamicModifiers)this.m().c0.h(modifiers0.getModifierType());
                String s3 = dynamicModifiers0 == null ? null : dynamicModifiers0.getEffectType();
                if(j.a(s3, "EFFECT_GRANT_INFLUENCE_TOKEN")) {
                    for(Object object9: ((List)this.m().P0)) {
                        ModifierArguments modifierArguments0 = (ModifierArguments)object9;
                        if(j.a(modifierArguments0.getModifierId(), technologyModifiers0.getModifierId()) && j.a(modifierArguments0.getName(), "Amount")) {
                            Integer integer0 = Y3.n.L0(modifierArguments0.getValue());
                            if(integer0 != null) {
                                v1 = integer0.intValue() + v1;
                            }
                        }
                    }
                }
                else if(j.a(s3, "EFFECT_GRANT_SPY")) {
                    for(Object object10: ((List)this.m().P0)) {
                        ModifierArguments modifierArguments1 = (ModifierArguments)object10;
                        if(j.a(modifierArguments1.getModifierId(), technologyModifiers0.getModifierId()) && j.a(modifierArguments1.getName(), "Amount")) {
                            Integer integer1 = Y3.n.L0(modifierArguments1.getValue());
                            if(integer1 != null) {
                                v = integer1.intValue() + v;
                            }
                        }
                    }
                }
            }
        }
        if(v > 0) {
            arrayList7.add(a.H("LOC_TYPE_TRAIT_SPIES", new Object[]{v}));
        }
        if(v1 > 0) {
            arrayList7.add(a.H("LOC_TYPE_TRAIT_ENVOYS", new Object[]{v1}));
        }
        ArrayList arrayList9 = C.q(this.m(), s, null, null);
        ArrayList arrayList10 = new ArrayList(x2.k.E(arrayList9));
        for(Object object11: arrayList9) {
            arrayList10.add(new k("ICON_" + ((List)object11).get(0), a.H(((String)((List)object11).get(1)), new Object[0]), ((String)((List)object11).get(2)), ((String)((List)object11).get(0))));
        }
        i.m0(arrayList10, new d(this, 1));
        this.f("ICON_" + s);
        String s4 = ((Technologies)m0).getDescription();
        if(s4 != null) {
            this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{s4}));
        }
        this.a();
        o2.f f7 = this.m();
        ArrayList arrayList11 = new ArrayList();
        for(Object object12: ((Iterable)f7.w1)) {
            if(j.a(((TechnologyQuotes)object12).getTechnologyType(), s)) {
                arrayList11.add(object12);
            }
        }
        for(Object object13: arrayList11) {
            g.g(this, ((TechnologyQuotes)object13).getQuote(), 4);
        }
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        b b0 = new b(linearLayout0, this.q());
        b0.h();
        if(!arrayList7.isEmpty()) {
            for(Object object14: arrayList7) {
                j.c(((String)object14));
                b0.f(((String)object14));
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_UNLOCKS");
        b b1 = new b(linearLayout1, this.q());
        b1.h();
        if(!arrayList10.isEmpty()) {
            b1.d(arrayList10);
            b1.h();
        }
        if(!b1.n()) {
            this.j(linearLayout1);
        }
        LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView2 = (TextView)e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView2);
        o1.a.U(textView2, "LOC_UI_PEDIA_REQUIREMENTS");
        b b2 = new b(linearLayout2, this.q());
        b2.h();
        Eras eras0 = (Eras)this.m().d0.h(((Technologies)m0).getEraType());
        if(eras0 != null) {
            b2.f(eras0.getName());
            b2.h();
        }
        if(!arrayList2.isEmpty()) {
            b2.a("LOC_UI_PEDIA_REQUIRED_TECHNOLOGIES");
            for(Object object15: arrayList2) {
                j.c(((k)object15).b);
                b2.b(((k)object15), ((k)object15).b);
            }
            b2.h();
        }
        Yields yields0 = (Yields)this.m().R1.h("YIELD_SCIENCE");
        if(yields0 != null) {
            b2.a("LOC_UI_PEDIA_RESEARCH_COST");
            b2.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{((Technologies)m0).getCost(), yields0.getIconString(), yields0.getName()}));
            b2.h();
        }
        if(!arrayList6.isEmpty()) {
            b2.a("LOC_UI_PEDIA_BOOSTS");
            for(Object object16: arrayList6) {
                b2.f(((Boosts)object16).getTriggerDescription());
            }
            b2.h();
        }
        if(!b2.n()) {
            this.j(linearLayout2);
        }
        LinearLayout linearLayout3 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView3 = (TextView)e.c(linearLayout3, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView3);
        o1.a.U(textView3, "LOC_UI_PEDIA_PROGRESSION");
        b b3 = new b(linearLayout3, this.q());
        b3.h();
        if(!arrayList5.isEmpty()) {
            b3.a("LOC_UI_PEDIA_LEADS_TO_TECHS");
            for(Object object17: arrayList5) {
                j.c(((k)object17).b);
                b3.b(((k)object17), ((k)object17).b);
            }
            b3.h();
        }
        if(!b3.n()) {
            this.j(linearLayout3);
        }
    }

    private final void w() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.z1.h(q0.b);
        j.c(m0);
        String s = ((Terrains)m0).getTerrainType();
        HashMap hashMap0 = new HashMap();
        for(Object object0: ((List)this.m().y1)) {
            Terrain_YieldChanges terrain_YieldChanges0 = (Terrain_YieldChanges)object0;
            if(j.a(terrain_YieldChanges0.getTerrainType(), s)) {
                String s1 = terrain_YieldChanges0.getYieldType();
                Integer integer0 = (Integer)hashMap0.get(terrain_YieldChanges0.getYieldType());
                if(integer0 == null) {
                    integer0 = 0;
                }
                hashMap0.put(s1, ((int)(terrain_YieldChanges0.getYieldChange() + ((int)integer0))));
            }
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object1: ((List)this.m().R1.i)) {
            Yields yields0 = (Yields)object1;
            Integer integer1 = (Integer)hashMap0.get(yields0.getYieldType());
            if(integer1 != null) {
                arrayList0.add(new w2.i(integer1, yields0.getIconString(), a.H(yields0.getName(), new Object[0])));
            }
        }
        ArrayList arrayList1 = new ArrayList();
        if(((Terrains)m0).getHills()) {
            arrayList1.add(a.H("LOC_UI_PEDIA_TERRAIN_HILLS", new Object[0]));
        }
        if(((Terrains)m0).getWater()) {
            arrayList1.add(a.H("LOC_UI_PEDIA_TERRAIN_WATER", new Object[0]));
        }
        if(((Terrains)m0).getShallowWater()) {
            arrayList1.add(a.H("LOC_UI_PEDIA_TERRAIN_SHALLOW_WATER", new Object[0]));
        }
        if(((Terrains)m0).getImpassable()) {
            arrayList1.add(a.H("LOC_UI_PEDIA_TERRAIN_IMPASSABLE", new Object[0]));
        }
        if(((Terrains)m0).getDefenseModifier() != 0) {
            arrayList1.add(a.H("LOC_TOOLTIP_DEFENSE_MODIFIER", new Object[]{((Terrains)m0).getDefenseModifier()}));
        }
        if(((Terrains)m0).getAppeal() != 0) {
            arrayList1.add(a.H("LOC_TYPE_TRAIT_APPEAL", new Object[]{((Terrains)m0).getAppeal()}));
        }
        n.G(arrayList1, new C1.a(7));
        this.f("ICON_" + s);
        this.a();
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        b b0 = new b(linearLayout0, this.q());
        b0.h();
        if(!arrayList1.isEmpty()) {
            for(Object object2: arrayList1) {
                b0.f("[ICON_Bullet] " + ((String)object2));
            }
            b0.h();
        }
        if(!arrayList0.isEmpty()) {
            for(Object object3: arrayList0) {
                b0.f(a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{((w2.i)object3).i, ((w2.i)object3).j, ((w2.i)object3).k}));
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
    }

    private final void x() {
        ArrayList arrayList45;
        Integer integer0;
        ArrayList arrayList38;
        ArrayList arrayList37;
        w2.e e0;
        ArrayList arrayList4;
        this.s(this.p().j);
        this.p();
        m m0 = this.m().I().h(this.p().a());
        j.c(m0);
        Units units0 = (Units)m0;
        ArrayList arrayList0 = i.p0(A.f0(this.m(), units0.getTraitType()));
        o2.f f0 = this.m();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: f0.R0) {
            Modifiers modifiers0 = (Modifiers)object0;
            DynamicModifiers dynamicModifiers0 = (DynamicModifiers)this.m().c0.h(modifiers0.getModifierType());
            if(j.a((dynamicModifiers0 == null ? null : dynamicModifiers0.getEffectType()), "EFFECT_ADD_RELIGIOUS_UNIT")) {
                Iterable iterable0 = this.m().A();
                ArrayList arrayList2 = new ArrayList();
                for(Object object1: iterable0) {
                    ModifierArguments modifierArguments0 = (ModifierArguments)object1;
                    if(j.a(modifierArguments0.getModifierId(), modifiers0.getModifierId()) && j.a(modifierArguments0.getName(), "UnitType") && j.a(modifierArguments0.getValue(), units0.getUnitType())) {
                        arrayList2.add(object1);
                    }
                }
                ArrayList arrayList3 = new ArrayList(x2.k.E(arrayList2));
                for(Object object2: arrayList2) {
                    arrayList3.add(((ModifierArguments)object2).getModifierId());
                }
                arrayList4 = arrayList3;
            }
            else {
                arrayList4 = null;
            }
            if(arrayList4 != null) {
                arrayList1.add(arrayList4);
            }
        }
        HashSet hashSet0 = new HashSet(x2.k.F(arrayList1));
        Iterable iterable1 = this.m().a();
        ArrayList arrayList5 = new ArrayList();
        for(Object object3: iterable1) {
            if(hashSet0.contains(((BeliefModifiers)object3).getModifierID())) {
                arrayList5.add(object3);
            }
        }
        ArrayList arrayList6 = new ArrayList(x2.k.E(arrayList5));
        for(Object object4: arrayList5) {
            arrayList6.add(((BeliefModifiers)object4).getBeliefType());
        }
        HashSet hashSet1 = new HashSet(arrayList6);
        o2.f f1 = this.m();
        ArrayList arrayList7 = new ArrayList();
        for(Object object5: f1.g) {
            if(hashSet1.contains(((Beliefs)object5).getBeliefType())) {
                arrayList7.add(object5);
            }
        }
        ArrayList arrayList8 = new ArrayList(x2.k.E(arrayList7));
        for(Object object6: arrayList7) {
            arrayList8.add(new k(A.f.h("ICON_", ((Beliefs)object6).getBeliefType()), ((Beliefs)object6).getName(), ((Beliefs)object6).getBeliefType()));
        }
        arrayList0.addAll(arrayList8);
        o2.f f2 = this.m();
        ArrayList arrayList9 = new ArrayList();
        for(Object object7: f2.L1) {
            if(j.a(((UnitReplaces)object7).getCivUniqueUnitType(), units0.getUnitType())) {
                arrayList9.add(object7);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for(Object object8: arrayList9) {
            Units units1 = (Units)this.m().I().h(((UnitReplaces)object8).getReplacesUnitType());
            if(units1 != null) {
                arrayList10.add(units1);
            }
        }
        ArrayList arrayList11 = new ArrayList();
        for(Object object9: arrayList10) {
            if(j.a(((Units)object9).getTraitType(), "TRAIT_BARBARIAN")) {
                arrayList11.add(object9);
            }
        }
        ArrayList arrayList12 = new ArrayList(x2.k.E(arrayList11));
        for(Object object10: arrayList11) {
            arrayList12.add(new k(A.f.h("ICON_", ((Units)object10).getUnitType()), ((Units)object10).getName(), ((Units)object10).getUnitType()));
        }
        k k0 = (k)i.U(arrayList12);
        o2.f f3 = this.m();
        ArrayList arrayList13 = new ArrayList();
        for(Object object11: f3.L1) {
            if(j.a(((UnitReplaces)object11).getReplacesUnitType(), units0.getUnitType())) {
                arrayList13.add(object11);
            }
        }
        ArrayList arrayList14 = new ArrayList();
        for(Object object12: arrayList13) {
            Units units2 = (Units)this.m().I().h(((UnitReplaces)object12).getCivUniqueUnitType());
            if(units2 != null) {
                arrayList14.add(units2);
            }
        }
        ArrayList arrayList15 = new ArrayList();
        for(Object object13: arrayList14) {
            if(j.a(((Units)object13).getTraitType(), "TRAIT_BARBARIAN")) {
                arrayList15.add(object13);
            }
        }
        ArrayList arrayList16 = new ArrayList(x2.k.E(arrayList15));
        for(Object object14: arrayList15) {
            arrayList16.add(new k(A.f.h("ICON_", ((Units)object14).getUnitType()), ((Units)object14).getName(), ((Units)object14).getUnitType()));
        }
        ArrayList arrayList17 = new ArrayList();
        ArrayList arrayList18 = new ArrayList();
        o2.f f4 = this.m();
        ArrayList arrayList19 = new ArrayList();
        for(Object object15: f4.M1) {
            if(j.a(((UnitUpgrades)object15).getUnit(), units0.getUnitType())) {
                arrayList19.add(object15);
            }
        }
        ArrayList arrayList20 = new ArrayList();
        for(Object object16: arrayList19) {
            Units units3 = (Units)this.m().I().h(((UnitUpgrades)object16).getUpgradeUnit());
            if(units3 != null) {
                arrayList20.add(units3);
            }
        }
        ArrayList arrayList21 = new ArrayList();
        for(Object object17: arrayList20) {
            if(!j.a(((Units)object17).getTraitType(), "TRAIT_BARBARIAN")) {
                arrayList21.add(object17);
            }
        }
        for(Object object18: arrayList21) {
            Units units4 = (Units)object18;
            if(f.y(arrayList0, this, units4)) {
                arrayList17.add(new k(A.f.h("ICON_", units4.getUnitType()), units4.getName(), units4.getUnitType()));
            }
            o2.f f5 = this.m();
            ArrayList arrayList22 = new ArrayList();
            for(Object object19: f5.L1) {
                if(j.a(((UnitReplaces)object19).getReplacesUnitType(), units4.getUnitType())) {
                    arrayList22.add(object19);
                }
            }
            ArrayList arrayList23 = new ArrayList();
            for(Object object20: arrayList22) {
                Units units5 = (Units)this.m().I().h(((UnitReplaces)object20).getCivUniqueUnitType());
                if(units5 != null) {
                    arrayList23.add(units5);
                }
            }
            for(Object object21: arrayList23) {
                arrayList17.add(new k(A.f.h("ICON_", ((Units)object21).getUnitType()), ((Units)object21).getName(), ((Units)object21).getUnitType()));
            }
        }
        o2.f f6 = this.m();
        ArrayList arrayList24 = new ArrayList();
        for(Object object22: f6.M1) {
            if(j.a(((UnitUpgrades)object22).getUpgradeUnit(), units0.getUnitType())) {
                arrayList24.add(object22);
            }
        }
        ArrayList arrayList25 = new ArrayList();
        for(Object object23: arrayList24) {
            Units units6 = (Units)this.m().I().h(((UnitUpgrades)object23).getUnit());
            if(units6 != null) {
                arrayList25.add(units6);
            }
        }
        ArrayList arrayList26 = new ArrayList();
        for(Object object24: arrayList25) {
            if(!j.a(((Units)object24).getTraitType(), "TRAIT_BARBARIAN") && f.y(arrayList0, this, ((Units)object24))) {
                arrayList26.add(object24);
            }
        }
        for(Object object25: arrayList26) {
            arrayList18.add(new k(A.f.h("ICON_", ((Units)object25).getUnitType()), ((Units)object25).getName(), ((Units)object25).getUnitType()));
        }
        for(Object object26: this.m().M1) {
            UnitUpgrades unitUpgrades0 = (UnitUpgrades)object26;
            o2.f f7 = this.m();
            ArrayList arrayList27 = new ArrayList();
            for(Object object27: f7.L1) {
                if(j.a(((UnitReplaces)object27).getCivUniqueUnitType(), units0.getUnitType()) && j.a(unitUpgrades0.getUpgradeUnit(), ((UnitReplaces)object27).getReplacesUnitType())) {
                    arrayList27.add(object27);
                }
            }
            ArrayList arrayList28 = new ArrayList();
            for(Object object28: arrayList27) {
                UnitReplaces unitReplaces0 = (UnitReplaces)object28;
                Units units7 = (Units)this.m().I().h(unitUpgrades0.getUnit());
                if(units7 != null) {
                    arrayList28.add(units7);
                }
            }
            ArrayList arrayList29 = new ArrayList();
            for(Object object29: arrayList28) {
                if(!j.a(((Units)object29).getTraitType(), "TRAIT_BARBARIAN") && f.y(arrayList0, this, ((Units)object29))) {
                    arrayList29.add(object29);
                }
            }
            for(Object object30: arrayList29) {
                arrayList18.add(new k(A.f.h("ICON_", ((Units)object30).getUnitType()), ((Units)object30).getName(), ((Units)object30).getUnitType()));
            }
        }
        String s = units0.getObsoleteCivic();
        if(s == null) {
        label_246:
            String s1 = units0.getObsoleteTech();
            if(s1 == null) {
                e0 = null;
            }
            else {
                Technologies technologies0 = (Technologies)this.m().t1.h(s1);
                e0 = technologies0 == null ? null : new w2.e(technologies0.getTechnologyType(), technologies0.getName());
            }
        }
        else {
            Civics civics0 = (Civics)this.m().B.h(s);
            if(civics0 != null) {
                e0 = new w2.e(civics0.getCivicType(), civics0.getName());
                goto label_255;
            }
            goto label_246;
        }
    label_255:
        Iterable iterable2 = this.m().H();
        ArrayList arrayList30 = new ArrayList();
        for(Object object31: iterable2) {
            if(j.a(((Unit_BuildingPrereqs)object31).getUnit(), units0.getUnitType())) {
                arrayList30.add(object31);
            }
        }
        ArrayList arrayList31 = new ArrayList();
        for(Object object32: arrayList30) {
            Buildings buildings0 = (Buildings)this.m().m().h(((Unit_BuildingPrereqs)object32).getPrereqBuilding());
            if(buildings0 != null) {
                arrayList31.add(buildings0);
            }
        }
        ArrayList arrayList32 = new ArrayList(x2.k.E(arrayList31));
        for(Object object33: arrayList31) {
            arrayList32.add(new k(A.f.h("ICON_", ((Buildings)object33).getBuildingType()), ((Buildings)object33).getName(), ((Buildings)object33).getBuildingType()));
        }
        ArrayList arrayList33 = new ArrayList();
        ArrayList arrayList34 = new ArrayList();
        int v = 0;
        for(Object object34: this.m().Q1) {
            Units_XP2 units_XP20 = (Units_XP2)object34;
            if(j.a(units_XP20.getUnitType(), units0.getUnitType())) {
                if(units_XP20.getResourceMaintenanceAmount() != 0) {
                    String s2 = units_XP20.getResourceMaintenanceType();
                    if(s2 != null) {
                        arrayList33.add(s2);
                        arrayList34.add(units_XP20.getResourceMaintenanceAmount());
                    }
                }
                v += units_XP20.getResourceCost();
            }
        }
        ArrayList arrayList35 = new ArrayList();
        ArrayList arrayList36 = new ArrayList();
        for(Object object35: this.m().Q1) {
            if(j.a(((Units_XP2)object35).getUnitType(), units0.getUnitType()) && ((Units_XP2)object35).getTourismBombPossible()) {
                for(Object object36: this.m().p) {
                    Building_TourismBombs_XP2 building_TourismBombs_XP20 = (Building_TourismBombs_XP2)object36;
                    Buildings buildings1 = (Buildings)this.m().m().h(building_TourismBombs_XP20.getBuildingType());
                    if(buildings1 == null) {
                        arrayList38 = arrayList32;
                        arrayList37 = arrayList34;
                    }
                    else {
                        arrayList37 = arrayList34;
                        arrayList38 = arrayList32;
                        arrayList35.add(new k(A.f.h("ICON_", buildings1.getBuildingType()), buildings1.getName(), buildings1.getBuildingType()));
                        arrayList36.add(building_TourismBombs_XP20.getTourismBombValue());
                    }
                    arrayList34 = arrayList37;
                    arrayList32 = arrayList38;
                }
            }
        }
        ArrayList arrayList39 = arrayList34;
        Iterable iterable3 = this.m().y();
        ArrayList arrayList40 = new ArrayList();
        for(Object object37: iterable3) {
            if(j.a(((Improvement_ValidBuildUnits)object37).getUnitType(), units0.getUnitType())) {
                arrayList40.add(object37);
            }
        }
        ArrayList arrayList41 = new ArrayList();
        for(Object object38: arrayList40) {
            o2.f f8 = this.m();
            String s3 = ((Improvement_ValidBuildUnits)object38).getImprovementType();
            Improvements improvements0 = (Improvements)f8.K0.h(s3);
            if(improvements0 != null) {
                arrayList41.add(improvements0);
            }
        }
        Iterable iterable4 = this.m().C();
        ArrayList arrayList42 = new ArrayList();
        for(Object object39: iterable4) {
            if(j.a(((Route_ValidBuildUnits)object39).getUnitType(), units0.getUnitType())) {
                arrayList42.add(object39);
            }
        }
        ArrayList arrayList43 = new ArrayList();
        for(Object object40: arrayList42) {
            Routes routes0 = (Routes)this.m().D().h(((Route_ValidBuildUnits)object40).getUnitType());
            if(routes0 != null) {
                arrayList43.add(routes0);
            }
        }
        String s4 = units0.getPurchaseYield();
        if(s4 == null) {
            integer0 = null;
        }
        else if(j.a(s4, "YIELD_GOLD")) {
            integer0 = (int)(units0.getCost() * 4);
        }
        else {
            integer0 = (int)(units0.getCost() * 2);
        }
        this.f("ICON_" + units0.getUnitType());
        String s5 = units0.getDescription();
        if(s5 != null) {
            this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{s5}));
        }
        this.a();
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        View view0 = e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(((TextView)view0));
        o1.a.U(((TextView)view0), "LOC_UI_PEDIA_TRAITS");
        b b0 = new b(linearLayout0, this.q());
        b0.h();
        if(!arrayList0.isEmpty()) {
            b0.a("LOC_UI_PEDIA_UNIQUE_TO");
            for(Object object41: arrayList0) {
                String s6 = ((k)object41).a();
                j.c(s6);
                b0.b(((k)object41), s6);
            }
            b0.h();
        }
        if(k0 != null) {
            b0.a("LOC_UI_PEDIA_REPLACES");
            String s7 = k0.a();
            j.c(s7);
            b0.b(k0, s7);
        }
        if(!arrayList16.isEmpty()) {
            b0.a("LOC_UI_PEDIA_REPLACED_BY");
            for(Object object42: arrayList16) {
                String s8 = ((k)object42).a();
                j.c(s8);
                b0.b(((k)object42), s8);
            }
        }
        if(k0 != null || !arrayList16.isEmpty()) {
            b0.h();
        }
        if(!arrayList18.isEmpty() || !arrayList17.isEmpty()) {
            if(!arrayList17.isEmpty()) {
                b0.a("LOC_UI_PEDIA_UPGRADES_TO");
                for(Object object43: arrayList17) {
                    j.c(((k)object43));
                    String s9 = ((k)object43).a();
                    j.c(s9);
                    b0.b(((k)object43), s9);
                }
            }
            if(!arrayList18.isEmpty()) {
                b0.a("LOC_UI_PEDIA_UPGRADE_FROM");
                for(Object object44: arrayList18) {
                    j.c(((k)object44));
                    String s10 = ((k)object44).a();
                    j.c(s10);
                    b0.b(((k)object44), s10);
                }
            }
            b0.h();
        }
        if(e0 != null) {
            String s11 = (String)e0.a();
            b0.a("LOC_UI_PEDIA_MADE_OBSOLETE_BY");
            b0.b(new k("ICON_" + s11, ((String)e0.j), s11), ((String)e0.j));
            b0.h();
        }
        String s12 = units0.getPromotionClass();
        if(s12 != null) {
            UnitPromotionClasses unitPromotionClasses0 = (UnitPromotionClasses)this.m().G().h(s12);
            if(unitPromotionClasses0 != null) {
                b0.f(a.H("LOC_UNIT_PROMOTION_CLASS", new Object[]{unitPromotionClasses0.getName()}));
            }
        }
        Units units8 = (Units)this.m().I().h("UNIT_SPY");
        int v1 = units8 == null || !j.a(units0.getUnitType(), units8.getUnitType()) ? 0 : 3;
        Units units9 = (Units)this.m().I().h("UNIT_ROCK_BAND");
        if(units9 != null && j.a(units0.getUnitType(), units9.getUnitType())) {
            v1 = 3;
        }
        if(v1 > 0) {
            b0.f(a.H("LOC_TYPE_TRAIT_MAX_PROMOTIONS", new Object[]{v1}));
        }
        if(units0.getBaseMoves() != 0 && (!units0.getIgnoreMoves() || j.a(units0.getDomain(), "DOMAIN_AIR"))) {
            b0.e(new k("ICON_MOVES", null, "MOVEMENT_1"), units0.getBaseMoves(), "LOC_UI_PEDIA_MOVEMENT_POINTS");
        }
        if(units0.getCombat() != 0) {
            b0.e(new k("ICON_STRENGTH", null, "COMBAT_5"), units0.getCombat(), "LOC_UI_PEDIA_MELEE_STRENGTH");
        }
        if(units0.getRangedCombat() != 0) {
            b0.e(new k("ICON_RANGED_STRENGTH", null, "COMBAT_5"), units0.getRangedCombat(), "LOC_UI_PEDIA_RANGED_STRENGTH");
        }
        if(units0.getBombard() != 0) {
            b0.e(new k("ICON_BOMBARD", null, "COMBAT_5"), units0.getBombard(), "LOC_UI_PEDIA_BOMBARD_STRENGTH");
        }
        if(units0.getReligiousStrength() != 0) {
            b0.e(new k("ICON_RELIGION", null, "FAITH_6"), units0.getReligiousStrength(), "LOC_UI_PEDIA_RELIGIOUS_STRENGTH");
        }
        if(units0.getAntiAirCombat() != 0) {
            b0.e(new k("ICON_STATS_ANTIAIR", null, "COMBAT_5"), units0.getAntiAirCombat(), "LOC_UI_PEDIA_ANTIAIR_STRENGTH");
        }
        if(units0.getRange() != 0) {
            b0.e(new k("ICON_RANGE", null, "COMBAT_5"), units0.getRange(), "LOC_UI_PEDIA_RANGE");
        }
        Iterable iterable5 = this.m().E();
        ArrayList arrayList44 = new ArrayList();
        for(Object object45: iterable5) {
            if(j.a(((TypeProperties)object45).getType(), units0.getUnitType())) {
                arrayList44.add(object45);
            }
        }
        Object object46 = null;
        for(Object object47: arrayList44) {
            if(j.a(((TypeProperties)object47).getName(), "LIFESPAN")) {
                object46 = object47;
                break;
            }
        }
        if(((TypeProperties)object46) != null) {
            String s13 = ((TypeProperties)object46).getValue();
            if(s13 != null) {
                Integer integer1 = Y3.n.L0(s13);
                if(integer1 != null) {
                    b0.e(new k("ICON_LIFESPAN", null, "HEROES"), integer1.intValue(), "LOC_HUD_UNIT_PANEL_LIFESPAN");
                }
            }
        }
        if(units0.getSpreadCharges() != 0) {
            b0.e(new k("ICON_RELIGION", null, "FAITH_6"), units0.getSpreadCharges(), "LOC_UI_PEDIA_SPREAD_CHARGES");
        }
        Object object48 = null;
        for(Object object49: this.m().J()) {
            if(j.a(((Units_MODE)object49).getUnitType(), units0.getUnitType())) {
                object48 = object49;
                break;
            }
        }
        if(((Units_MODE)object48) != null) {
            int v2 = ((Units_MODE)object48).getActionCharges();
            b0.e(new k("ICON_STATS_SPREADCHARGES", null, "HEROES"), v2, "LOC_HUD_UNIT_PANEL_CHARGES");
        }
        if(units0.getBuildCharges() != 0) {
            b0.e(new k("ICON_BUILD_CHARGES", null, "IMPROVEMENTS"), units0.getBuildCharges(), "LOC_UI_PEDIA_BUILD_CHARGES");
        }
        if(units0.getReligiousHealCharges() != 0) {
            b0.e(new k("ICON_RELIGION", null, "FAITH_6"), units0.getReligiousHealCharges(), "LOC_UI_PEDIA_HEAL_CHARGES");
        }
        if(units0.getAirSlots() != 0) {
            b0.f(a.H("LOC_TYPE_TRAIT_AIRSLOTS", new Object[]{units0.getAirSlots()}));
        }
        for(Object object50: this.m().Q1) {
            if(j.a(((Units_XP2)object50).getUnitType(), units0.getUnitType()) && ((Units_XP2)object50).getTourismBombPossible()) {
                b0.f(a.H("LOC_UI_PEDIA_UNIT_ROCK_BAND_TOURISM_WONDERS", new Object[]{1000}));
            }
        }
        b0.h();
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        if(j.a(units0.getUnitType(), "UNIT_HERO_ARTHUR")) {
            LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
            TextView textView0 = (TextView)e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
            j.c(textView0);
            o1.a.U(textView0, "LOC_UI_PEDIA_CREATES");
            b b1 = new b(linearLayout1, this.q());
            b1.h();
            String s14 = a.H("LOC_UNIT_QUESTING_KNIGHT_NAME", new Object[0]);
            b1.b(new k("ICON_UNIT_QUESTING_KNIGHT", s14, "UNIT_QUESTING_KNIGHT"), s14);
            if(!b1.n()) {
                this.j(linearLayout1);
            }
        }
        LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
        b b2 = new b(linearLayout2, this.q());
        b2.h();
        if(units0.getPrereqTech() != null || units0.getPrereqCivic() != null || units0.getPrereqDistrict() != null || !arrayList32.isEmpty() || !arrayList39.isEmpty() || units0.getStrategicResource() != null && v > 0) {
            String s15 = units0.getPrereqDistrict();
            if(s15 != null) {
                Districts districts0 = (Districts)this.m().w().h(s15);
                if(districts0 != null) {
                    b2.a("LOC_DISTRICT_NAME");
                    b2.b(new k(A.f.h("ICON_", districts0.getDistrictType()), districts0.getName(), districts0.getDistrictType()), districts0.getName());
                }
            }
            String s16 = units0.getPrereqCivic();
            if(s16 != null) {
                Civics civics1 = (Civics)this.m().B.h(s16);
                if(civics1 != null) {
                    b2.a("LOC_CIVIC_NAME");
                    b2.b(new k(A.f.h("ICON_", civics1.getCivicType()), civics1.getName(), civics1.getCivicType()), civics1.getName());
                }
            }
            String s17 = units0.getPrereqTech();
            if(s17 != null) {
                Technologies technologies1 = (Technologies)this.m().t1.h(s17);
                if(technologies1 != null) {
                    b2.a("LOC_TECHNOLOGY_NAME");
                    b2.b(new k(A.f.h("ICON_", technologies1.getTechnologyType()), technologies1.getName(), technologies1.getTechnologyType()), technologies1.getName());
                }
            }
            if(!arrayList32.isEmpty()) {
                b2.a("LOC_BUILDING_NAME");
                for(Object object51: arrayList32) {
                    String s18 = ((k)object51).a();
                    j.c(s18);
                    b2.b(((k)object51), s18);
                }
            }
            b2.h();
        }
        if(units0.getCanTrain() && !units0.getMustPurchase()) {
            Yields yields0 = (Yields)this.m().K().h("YIELD_PRODUCTION");
            if(yields0 != null) {
                b2.a("LOC_UI_PEDIA_PRODUCTION_COST");
                b2.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{units0.getCost(), yields0.getIconString(), yields0.getName()}));
            }
        }
        if(v > 0) {
            String s19 = units0.getStrategicResource();
            if(s19 != null) {
                Resources resources0 = (Resources)this.m().o1.h(s19);
                if(resources0 != null) {
                    b2.f(a.H("LOC_UI_PEDIA_RESOURCE_COST", new Object[]{v, e.f("[ICON_", resources0.getResourceType(), "]"), resources0.getName()}));
                }
            }
        }
        if(integer0 != null && units0.getPurchaseYield() != null) {
            Yields yields1 = (Yields)this.m().K().h(units0.getPurchaseYield());
            if(yields1 != null) {
                b2.a("LOC_UI_PEDIA_PURCHASE_COST");
                b2.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{integer0, yields1.getIconString(), yields1.getName()}));
            }
        }
        if(units0.getMaintenance() != 0) {
            Yields yields2 = (Yields)this.m().K().h("YIELD_GOLD");
            if(yields2 != null) {
                b2.a("LOC_UI_PEDIA_MAITENANCE_COST");
                b2.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{units0.getMaintenance(), yields2.getIconString(), yields2.getName()}));
            }
        }
        if(!arrayList39.isEmpty()) {
            int v3 = 0;
            for(Object object52: arrayList33) {
                if(v3 >= 0) {
                    Resources resources1 = (Resources)this.m().o1.h(((String)object52));
                    if(resources1 == null) {
                        arrayList45 = arrayList39;
                    }
                    else {
                        arrayList45 = arrayList39;
                        Object object53 = arrayList45.get(v3);
                        j.e(object53, "get(...)");
                        b2.f(a.H("LOC_UI_PEDIA_RESOURCE_MAINTENANCE_AMOUNT", new Object[]{object53, e.f("[ICON_", resources1.getResourceType(), "]"), resources1.getName()}));
                    }
                    arrayList39 = arrayList45;
                    ++v3;
                    continue;
                }
                x2.j.D();
                throw null;
            }
        }
        if(!b2.n()) {
            this.j(linearLayout2);
        }
        if(!arrayList35.isEmpty()) {
            LinearLayout linearLayout3 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
            TextView textView2 = (TextView)e.c(linearLayout3, 0x80, 0x7F0700F7);  // id:stat_box_title
            j.c(textView2);
            o1.a.U(textView2, "LOC_UI_PEDIA_UNIT_ROCK_BAND_TOURISM_BUILDING_HEADER");
            b b3 = new b(linearLayout3, this.q());
            int v4 = 0;
            for(Object object54: arrayList35) {
                if(v4 >= 0) {
                    String s20 = ((k)object54).a();
                    j.c(s20);
                    String s21 = a.H("LOC_UI_PEDIA_UNIT_ROCK_BAND_TOURISM_BUILDING", new Object[]{s20});
                    Object object55 = arrayList36.get(v4);
                    j.e(object55, "get(...)");
                    b3.e(((k)object54), ((Number)object55).intValue(), s21);
                    ++v4;
                    continue;
                }
                x2.j.D();
                throw null;
            }
            if(!b3.n()) {
                this.j(linearLayout3);
            }
        }
        LinearLayout linearLayout4 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView3 = (TextView)e.c(linearLayout4, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView3);
        o1.a.U(textView3, "LOC_UI_PEDIA_USAGE");
        b b4 = new b(linearLayout4, this.q());
        b4.h();
        if(!arrayList41.isEmpty() || !arrayList43.isEmpty()) {
            b4.a("LOC_UI_PEDIA_USAGE_CAN_CONSTRUCT");
            for(Object object56: arrayList41) {
                b4.b(new k(A.f.h("ICON_", ((Improvements)object56).getImprovementType()), ((Improvements)object56).getName(), ((Improvements)object56).getImprovementType()), ((Improvements)object56).getName());
            }
            for(Object object57: arrayList43) {
                b4.b(new k("ICON_UNITOPERATION_BUILD_ROUTE", ((Routes)object57).getName(), ((Routes)object57).getRouteType()), ((Routes)object57).getName());
            }
            b4.h();
        }
        if(!b4.n()) {
            this.j(linearLayout4);
        }
        LinearLayout linearLayout5 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView4 = (TextView)e.c(linearLayout5, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView4);
        o1.a.U(textView4, "LOC_UI_PEDIA_ESPIONAGE_MISSIONS");
        b b5 = new b(linearLayout5, this.q());
        b5.h();
        if(units0.getSpy()) {
            Iterator iterator54 = this.m().F().iterator();
            while(true) {
                if(!iterator54.hasNext()) {
                    goto label_656;
                }
                Object object58 = iterator54.next();
                UnitOperations unitOperations0 = (UnitOperations)object58;
                if(j.a(unitOperations0.getInterfaceMode(), "INTERFACEMODE_SPY_CHOOSE_MISSION")) {
                    b5.b(new k(unitOperations0.getIcon(), unitOperations0.getDescription(), unitOperations0.getOperationType()), unitOperations0.getDescription());
                    if(unitOperations0.getTurns() > 0) {
                        b5.f(a.H("LOC_TYPE_TRAIT_TURNS", new Object[]{unitOperations0.getTurns()}));
                    }
                    if(unitOperations0.getBaseProbability() > 0) {
                        Integer[] arr_integer = (Integer[])x2.g.P(new Integer[]{0, 0, 1, 3, 6, 10, 15, 21, 25, 27, 27, 25, 21, 15, 10, 6, 3, 1}, new c(unitOperations0.getBaseProbability() - 1));
                        int v6 = 0;
                        for(int v5 = 0; v5 < arr_integer.length; ++v5) {
                            v6 = ((int)arr_integer[v5]) + v6;
                        }
                        b5.f(a.H("LOC_TYPE_TRAIT_BASE_PROBABILITY", new Object[]{v6}));
                    }
                    String s22 = unitOperations0.getTargetDistrict();
                    if(s22 != null) {
                        Districts districts1 = (Districts)this.m().w().h(s22);
                        if(districts1 != null) {
                            b5.f(a.H("LOC_TYPE_TRAIT_TARGET_DISTRICT", new Object[]{districts1.getName()}));
                        }
                    }
                }
            }
        }
        else {
        label_656:
            b5.h();
            if(!b5.n()) {
                this.j(linearLayout5);
            }
        }
    }

    public static final boolean y(ArrayList arrayList0, f f0, Units units0) {
        if(arrayList0.isEmpty()) {
            return true;
        }
        if(units0.getTraitType() == null) {
            return true;
        }
        String s = units0.getTraitType();
        o2.f f1 = f0.m();
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: ((Iterable)f1.N0)) {
            if(j.a(((LeaderTraits)object0).getTraitType(), s)) {
                arrayList1.add(object0);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator iterator1 = arrayList1.iterator();
        while(true) {
            String s1 = null;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            o2.f f2 = f0.m();
            String s2 = ((LeaderTraits)object1).getLeaderType();
            Leaders leaders0 = (Leaders)f2.O0.h(s2);
            if(leaders0 != null) {
                s1 = leaders0.getLeaderType();
            }
            if(s1 != null) {
                arrayList2.add(s1);
            }
        }
        HashSet hashSet0 = new HashSet(arrayList2);
        o2.f f3 = f0.m();
        ArrayList arrayList3 = new ArrayList();
        for(Object object2: ((Iterable)f3.E)) {
            if(j.a(((CivilizationTraits)object2).getTraitType(), s)) {
                arrayList3.add(object2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for(Object object3: arrayList3) {
            o2.f f4 = f0.m();
            String s3 = ((CivilizationTraits)object3).getCivilizationType();
            Civilizations civilizations0 = (Civilizations)f4.F.h(s3);
            String s4 = civilizations0 == null ? null : civilizations0.getCivilizationType();
            if(s4 != null) {
                arrayList4.add(s4);
            }
        }
        Set set0 = i.t0(hashSet0, arrayList4);
        for(Object object4: arrayList0) {
            if(i.M(set0, ((k)object4).c)) {
                return true;
            }
            if(false) {
                break;
            }
        }
        return false;
    }
}

