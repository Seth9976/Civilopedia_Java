package j2;

import A.f;
import J2.j;
import L2.e;
import O2.A;
import Y3.n;
import android.support.v4.media.session.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spears.civilopedia.db.tables.Adjacency_YieldChanges;
import com.spears.civilopedia.db.tables.Agendas;
import com.spears.civilopedia.db.tables.BeliefClasses;
import com.spears.civilopedia.db.tables.BeliefModifiers;
import com.spears.civilopedia.db.tables.Beliefs;
import com.spears.civilopedia.db.tables.Boosts;
import com.spears.civilopedia.db.tables.BuildingPrereqs;
import com.spears.civilopedia.db.tables.BuildingReplaces;
import com.spears.civilopedia.db.tables.Building_CitizenYieldChanges;
import com.spears.civilopedia.db.tables.Building_GreatPersonPoints;
import com.spears.civilopedia.db.tables.Building_GreatWorks;
import com.spears.civilopedia.db.tables.Building_RequiredFeatures;
import com.spears.civilopedia.db.tables.Building_TourismBombs_XP2;
import com.spears.civilopedia.db.tables.Building_ValidFeatures;
import com.spears.civilopedia.db.tables.Building_ValidTerrains;
import com.spears.civilopedia.db.tables.Building_YieldChanges;
import com.spears.civilopedia.db.tables.Building_YieldChangesBonusWithPower;
import com.spears.civilopedia.db.tables.Building_YieldDistrictCopies;
import com.spears.civilopedia.db.tables.Buildings;
import com.spears.civilopedia.db.tables.Buildings_XP2;
import com.spears.civilopedia.db.tables.Civ5Beliefs;
import com.spears.civilopedia.db.tables.Civ5BuildingClasses;
import com.spears.civilopedia.db.tables.Civ5Building_ClassesNeededInCity;
import com.spears.civilopedia.db.tables.Civ5Building_LocalResourceAnds;
import com.spears.civilopedia.db.tables.Civ5Building_ResourceQuantityRequirements;
import com.spears.civilopedia.db.tables.Civ5Building_YieldChanges;
import com.spears.civilopedia.db.tables.Civ5Building_YieldModifiers;
import com.spears.civilopedia.db.tables.Civ5Buildings;
import com.spears.civilopedia.db.tables.Civ5Builds;
import com.spears.civilopedia.db.tables.Civ5Civilization_BuildingClassOverrides;
import com.spears.civilopedia.db.tables.Civ5Civilization_Leaders;
import com.spears.civilopedia.db.tables.Civ5Civilization_UnitClassOverrides;
import com.spears.civilopedia.db.tables.Civ5Civilizations;
import com.spears.civilopedia.db.tables.Civ5Concepts;
import com.spears.civilopedia.db.tables.Civ5Eras;
import com.spears.civilopedia.db.tables.Civ5FakeFeatures;
import com.spears.civilopedia.db.tables.Civ5Feature_TerrainBooleans;
import com.spears.civilopedia.db.tables.Civ5Feature_YieldChanges;
import com.spears.civilopedia.db.tables.Civ5Features;
import com.spears.civilopedia.db.tables.Civ5GreatWorkSlots;
import com.spears.civilopedia.db.tables.Civ5Improvement_ResourceTypes;
import com.spears.civilopedia.db.tables.Civ5Improvement_TechFreshWaterYieldChanges;
import com.spears.civilopedia.db.tables.Civ5Improvement_TechNoFreshWaterYieldChanges;
import com.spears.civilopedia.db.tables.Civ5Improvement_TechYieldChanges;
import com.spears.civilopedia.db.tables.Civ5Improvement_ValidFeatures;
import com.spears.civilopedia.db.tables.Civ5Improvement_ValidTerrains;
import com.spears.civilopedia.db.tables.Civ5Improvement_Yields;
import com.spears.civilopedia.db.tables.Civ5Improvements;
import com.spears.civilopedia.db.tables.Civ5Leader_Traits;
import com.spears.civilopedia.db.tables.Civ5Leaders;
import com.spears.civilopedia.db.tables.Civ5LeagueProjectRewards;
import com.spears.civilopedia.db.tables.Civ5LeagueProjects;
import com.spears.civilopedia.db.tables.Civ5MinorCivilizations;
import com.spears.civilopedia.db.tables.Civ5Policies;
import com.spears.civilopedia.db.tables.Civ5PolicyBranchTypes;
import com.spears.civilopedia.db.tables.Civ5Policy_PrereqPolicies;
import com.spears.civilopedia.db.tables.Civ5Projects;
import com.spears.civilopedia.db.tables.Civ5Religions;
import com.spears.civilopedia.db.tables.Civ5Resolutions;
import com.spears.civilopedia.db.tables.Civ5Resource_FeatureBooleans;
import com.spears.civilopedia.db.tables.Civ5Resource_TerrainBooleans;
import com.spears.civilopedia.db.tables.Civ5Resource_YieldChanges;
import com.spears.civilopedia.db.tables.Civ5Resources;
import com.spears.civilopedia.db.tables.Civ5Route_TechMovementChanges;
import com.spears.civilopedia.db.tables.Civ5Routes;
import com.spears.civilopedia.db.tables.Civ5Specialists;
import com.spears.civilopedia.db.tables.Civ5Technologies;
import com.spears.civilopedia.db.tables.Civ5Technology_PrereqTechs;
import com.spears.civilopedia.db.tables.Civ5Terrain_Yields;
import com.spears.civilopedia.db.tables.Civ5Terrains;
import com.spears.civilopedia.db.tables.Civ5Traits;
import com.spears.civilopedia.db.tables.Civ5UnitClasses;
import com.spears.civilopedia.db.tables.Civ5UnitCombatInfos;
import com.spears.civilopedia.db.tables.Civ5UnitPromotions;
import com.spears.civilopedia.db.tables.Civ5Unit_ClassUpgrades;
import com.spears.civilopedia.db.tables.Civ5Unit_FreePromotions;
import com.spears.civilopedia.db.tables.Civ5Unit_ResourceQuantityRequirements;
import com.spears.civilopedia.db.tables.Civ5Units;
import com.spears.civilopedia.db.tables.Civ5Yields;
import com.spears.civilopedia.db.tables.CivicModifiers;
import com.spears.civilopedia.db.tables.CivicPrereqs;
import com.spears.civilopedia.db.tables.CivicQuotes;
import com.spears.civilopedia.db.tables.Civics;
import com.spears.civilopedia.db.tables.CivilizationInfo;
import com.spears.civilopedia.db.tables.CivilizationLeaders;
import com.spears.civilopedia.db.tables.CivilizationTraits;
import com.spears.civilopedia.db.tables.Civilizations;
import com.spears.civilopedia.db.tables.CivilopediaPageLayoutChapters;
import com.spears.civilopedia.db.tables.DistrictReplaces;
import com.spears.civilopedia.db.tables.District_Adjacencies;
import com.spears.civilopedia.db.tables.District_CitizenYieldChanges;
import com.spears.civilopedia.db.tables.District_GreatPersonPoints;
import com.spears.civilopedia.db.tables.District_RequiredFeatures;
import com.spears.civilopedia.db.tables.District_TradeRouteYields;
import com.spears.civilopedia.db.tables.District_ValidTerrains;
import com.spears.civilopedia.db.tables.Districts;
import com.spears.civilopedia.db.tables.DynamicModifiers;
import com.spears.civilopedia.db.tables.Eras;
import com.spears.civilopedia.db.tables.FavoredReligions;
import com.spears.civilopedia.db.tables.Feature_YieldChanges;
import com.spears.civilopedia.db.tables.Features;
import com.spears.civilopedia.db.tables.Features_XP2;
import com.spears.civilopedia.db.tables.GovernmentSlots;
import com.spears.civilopedia.db.tables.Government_SlotCounts;
import com.spears.civilopedia.db.tables.Governments;
import com.spears.civilopedia.db.tables.Governments_XP2;
import com.spears.civilopedia.db.tables.GovernorPromotionPrereqs;
import com.spears.civilopedia.db.tables.GovernorPromotionSets;
import com.spears.civilopedia.db.tables.GovernorPromotions;
import com.spears.civilopedia.db.tables.Governors;
import com.spears.civilopedia.db.tables.GreatPersonClasses;
import com.spears.civilopedia.db.tables.GreatPersonIndividualActionModifiers;
import com.spears.civilopedia.db.tables.GreatPersonIndividualBirthModifiers;
import com.spears.civilopedia.db.tables.GreatPersonIndividuals;
import com.spears.civilopedia.db.tables.GreatWorks;
import com.spears.civilopedia.db.tables.HistoricalAgendas;
import com.spears.civilopedia.db.tables.Improvement_Adjacencies;
import com.spears.civilopedia.db.tables.Improvement_BonusYieldChanges;
import com.spears.civilopedia.db.tables.Improvement_ValidBuildUnits;
import com.spears.civilopedia.db.tables.Improvement_ValidFeatures;
import com.spears.civilopedia.db.tables.Improvement_ValidResources;
import com.spears.civilopedia.db.tables.Improvement_ValidTerrains;
import com.spears.civilopedia.db.tables.Improvement_YieldChanges;
import com.spears.civilopedia.db.tables.Improvements;
import com.spears.civilopedia.db.tables.LeaderInfo;
import com.spears.civilopedia.db.tables.LeaderQuotes;
import com.spears.civilopedia.db.tables.LeaderTraits;
import com.spears.civilopedia.db.tables.Leaders;
import com.spears.civilopedia.db.tables.ModifierArguments;
import com.spears.civilopedia.db.tables.Modifiers;
import com.spears.civilopedia.db.tables.Moments;
import com.spears.civilopedia.db.tables.MutuallyExclusiveBuildings;
import com.spears.civilopedia.db.tables.ObsoletePolicies;
import com.spears.civilopedia.db.tables.Policies;
import com.spears.civilopedia.db.tables.Policies_XP1;
import com.spears.civilopedia.db.tables.Policy_GovernmentExclusives_XP2;
import com.spears.civilopedia.db.tables.RandomEvent_Yields;
import com.spears.civilopedia.db.tables.Religions;
import com.spears.civilopedia.db.tables.Resource_ValidFeatures;
import com.spears.civilopedia.db.tables.Resources;
import com.spears.civilopedia.db.tables.Technologies;
import com.spears.civilopedia.db.tables.Terrains;
import com.spears.civilopedia.db.tables.Traits;
import com.spears.civilopedia.db.tables.Units;
import com.spears.civilopedia.db.tables.Yields;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import o2.C;
import o2.G;
import o2.I;
import o2.K;
import o2.k;
import o2.m;
import o2.q;
import o2.x;
import x2.i;
import x2.o;
import x2.r;
import x2.w;
import z1.a0;

public final class b extends g {
    public final int i;

    public b(int v) {
        this.i = v;
        super();
    }

    private final void A() {
        this.s(this.p().j);
        this.p();
        if(j.a(this.p().b, "HOME")) {
            o2.g g0 = this.n();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: ((Iterable)g0.i)) {
                if(((Civ5Policies)object0).getIconAtlas() != null) {
                    arrayList0.add(object0);
                }
            }
            Civ5Policies civ5Policies0 = (Civ5Policies)i.g0(arrayList0, e.i);
            if(civ5Policies0 != null) {
                String s = civ5Policies0.getType();
                if(s != null) {
                    this.f("ICON_" + s);
                    g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_POLICIES", new Object[0]), 2);
                    this.b(a.H("TXT_KEY_PEDIA_POLICIES_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_SOCIAL_POL_HELP_TEXT", new Object[0])));
                }
            }
            return;
        }
        Object object1 = null;
        for(Object object2: ((Iterable)this.n().i)) {
            if(j.a(((Civ5Policies)object2).getType(), this.p().b)) {
                object1 = object2;
                break;
            }
        }
        if(((Civ5Policies)object1) != null) {
            this.f("ICON_" + ((Civ5Policies)object1).getType());
            String s1 = ((Civ5Policies)object1).getHelp();
            if(s1 != null) {
                this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s1));
            }
            String s2 = ((Civ5Policies)object1).getCivilopedia();
            if(s2 != null) {
                this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s2));
            }
            String s3 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
            LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
            TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
            j.c(textView0);
            o1.a.U(textView0, s3);
            Q1.b b0 = new Q1.b(linearLayout0, this.q());
            b0.h();
            String s4 = ((Civ5Policies)object1).getPolicyBranchType();
            if(s4 != null) {
                Object object3 = null;
                for(Object object4: ((Iterable)this.n().j)) {
                    if(j.a(((Civ5PolicyBranchTypes)object4).getType(), s4)) {
                        object3 = object4;
                        break;
                    }
                }
                if(((Civ5PolicyBranchTypes)object3) != null) {
                    b0.a(a.H("TXT_KEY_PEDIA_POLICYBRANCH_LABEL", new Object[0]));
                    String s5 = ((Civ5PolicyBranchTypes)object3).getDescription();
                    b0.f((s5 == null ? "" : a.H(s5, new Object[0])));
                    b0.h();
                }
            }
            o2.g g1 = this.n();
            ArrayList arrayList1 = new ArrayList();
            for(Object object5: ((Iterable)g1.U)) {
                if(j.a(((Civ5Policy_PrereqPolicies)object5).getPolicyType(), ((Civ5Policies)object1).getType())) {
                    arrayList1.add(object5);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object6: arrayList1) {
                Civ5Policy_PrereqPolicies civ5Policy_PrereqPolicies0 = (Civ5Policy_PrereqPolicies)object6;
                for(Object object7: ((Iterable)this.n().i)) {
                    if(!j.a(((Civ5Policies)object7).getType(), civ5Policy_PrereqPolicies0.getPrereqPolicy())) {
                        continue;
                    }
                    goto label_72;
                }
                object7 = null;
            label_72:
                if(((Civ5Policies)object7) != null) {
                    arrayList2.add(((Civ5Policies)object7));
                }
            }
            List list0 = x2.j.z(new String[]{"TXT_KEY_POLICYSCREEN_L1_TENET", "TXT_KEY_POLICYSCREEN_L2_TENET", "TXT_KEY_POLICYSCREEN_L3_TENET"});
            Integer integer0 = ((Civ5Policies)object1).getLevel();
            if(integer0 != null) {
                int v = integer0.intValue();
                if(v > 0 && v - 1 < list0.size()) {
                    b0.a(a.H("TXT_KEY_PEDIA_TENET_LEVEL", new Object[0]));
                    b0.f(a.H(((String)list0.get(v - 1)), new Object[0]));
                    b0.h();
                }
            }
            String s6 = ((Civ5Policies)object1).getPolicyBranchType();
            if(s6 != null) {
                Object object8 = null;
                for(Object object9: ((Iterable)this.n().j)) {
                    if(j.a(((Civ5PolicyBranchTypes)object9).getType(), s6)) {
                        object8 = object9;
                        break;
                    }
                }
                if(((Civ5PolicyBranchTypes)object8) != null) {
                    String s7 = ((Civ5PolicyBranchTypes)object8).getEraPrereq();
                    if(s7 != null) {
                        Object object10 = null;
                        for(Object object11: ((Iterable)this.n().b)) {
                            if(j.a(((Civ5Eras)object11).getType(), s7)) {
                                object10 = object11;
                                break;
                            }
                        }
                        if(((Civ5Eras)object10) != null) {
                            b0.a(a.H("TXT_KEY_PEDIA_PREREQ_ERA_LABEL", new Object[0]));
                            String s8 = ((Civ5Eras)object10).getDescription();
                            b0.f((s8 == null ? "" : a.H(s8, new Object[0])));
                            b0.h();
                        }
                    }
                }
            }
            if(!arrayList2.isEmpty()) {
                Iterator iterator8 = i3.e.k("TXT_KEY_PEDIA_PREREQ_POLICY_LABEL", new Object[0], b0, arrayList2);
                while(iterator8.hasNext()) {
                    Object object12 = iterator8.next();
                    k k0 = new k(f.h("ICON_", ((Civ5Policies)object12).getType()), ((Civ5Policies)object12).getDescription(), ((Civ5Policies)object12).getType(), null);
                    String s9 = ((Civ5Policies)object12).getDescription();
                    if(s9 == null) {
                        s9 = "";
                    }
                    b0.b(k0, s9);
                }
                b0.h();
            }
            if(!b0.n()) {
                this.j(linearLayout0);
            }
        }
    }

    private final void B() {
        this.s(this.p().j);
        this.p();
        String s = null;
        if(j.a(this.p().b, "HOME")) {
            Civ5UnitPromotions civ5UnitPromotions0 = (Civ5UnitPromotions)i.g0(((List)(((Collection)this.n().e))), e.i);
            if(civ5UnitPromotions0 != null) {
                s = civ5UnitPromotions0.getType();
            }
            this.f("ICON_" + s);
            g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_PROMOTIONS", new Object[0]), 2);
            this.b(a.H("TXT_KEY_PEDIA_PROMOTIONS_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_PROMOTIONS_HELP_TEXT", new Object[0])));
            return;
        }
        Object object0 = null;
        for(Object object1: ((Iterable)this.n().e)) {
            if(j.a(((Civ5UnitPromotions)object1).getType(), this.p().b)) {
                object0 = object1;
                break;
            }
        }
        if(((Civ5UnitPromotions)object0) != null) {
            this.f("ICON_" + ((Civ5UnitPromotions)object0).getType());
            String s1 = ((Civ5UnitPromotions)object0).getHelp();
            if(s1 != null) {
                this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s1));
            }
            Iterable iterable0 = x2.j.z(new String[]{((Civ5UnitPromotions)object0).getPromotionPrereqOr1(), ((Civ5UnitPromotions)object0).getPromotionPrereqOr2(), ((Civ5UnitPromotions)object0).getPromotionPrereqOr3(), ((Civ5UnitPromotions)object0).getPromotionPrereqOr4(), ((Civ5UnitPromotions)object0).getPromotionPrereqOr5(), ((Civ5UnitPromotions)object0).getPromotionPrereqOr6()});
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: iterable0) {
                if(object2 != null) {
                    arrayList0.add(object2);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object3: arrayList0) {
                String s2 = (String)object3;
                for(Object object4: ((Iterable)this.n().e)) {
                    if(!j.a(((Civ5UnitPromotions)object4).getType(), s2)) {
                        continue;
                    }
                    goto label_41;
                }
                object4 = null;
            label_41:
                if(((Civ5UnitPromotions)object4) != null) {
                    arrayList1.add(((Civ5UnitPromotions)object4));
                }
            }
            if(!arrayList1.isEmpty()) {
                String s3 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView0);
                o1.a.U(textView0, s3);
                Q1.b b0 = new Q1.b(linearLayout0, this.q());
                b0.h();
                Iterator iterator4 = i3.e.k("TXT_KEY_PEDIA_FREEPROMOTIONS_LABEL", new Object[0], b0, arrayList1);
                while(iterator4.hasNext()) {
                    Object object5 = iterator4.next();
                    k k0 = new k(f.h("ICON_", ((Civ5UnitPromotions)object5).getType()), ((Civ5UnitPromotions)object5).getDescription(), ((Civ5UnitPromotions)object5).getType(), null);
                    String s4 = ((Civ5UnitPromotions)object5).getDescription();
                    if(s4 == null) {
                        s4 = "";
                    }
                    b0.b(k0, s4);
                }
                b0.h();
                if(!b0.n()) {
                    this.j(linearLayout0);
                }
            }
        }
    }

    private final void C() {
        String s5;
        this.s(this.p().j);
        this.p();
        if(j.a(this.p().b, "HOME")) {
            Civ5Resources civ5Resources0 = (Civ5Resources)i.g0(((List)(((Collection)this.n().t))), e.i);
            if(civ5Resources0 != null) {
                String s = civ5Resources0.getType();
                if(s != null) {
                    this.f("ICON_" + s);
                    g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_RESOURCES", new Object[0]), 2);
                    this.b(a.H("TXT_KEY_PEDIA_RESOURCES_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_RESOURCES_HELP_TEXT", new Object[0])));
                }
            }
            return;
        }
        Object object0 = null;
        for(Object object1: ((Iterable)this.n().t)) {
            if(j.a(((Civ5Resources)object1).getType(), this.p().b)) {
                object0 = object1;
                break;
            }
        }
        if(((Civ5Resources)object0) == null) {
            return;
        }
        this.f("ICON_" + ((Civ5Resources)object0).getType());
        String s1 = ((Civ5Resources)object0).getHelp();
        if(s1 != null) {
            this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s1));
        }
        String s2 = ((Civ5Resources)object0).getCivilopedia();
        if(s2 != null) {
            this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s2));
        }
        String s3 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, s3);
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        o2.g g0 = this.n();
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: ((Iterable)g0.c0)) {
            if(j.a(((Civ5Resource_YieldChanges)object2).getResourceType(), ((Civ5Resources)object0).getType())) {
                arrayList0.add(object2);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator2 = arrayList0.iterator();
        while(true) {
            String s4 = "";
            if(!iterator2.hasNext()) {
                break;
            }
            Object object3 = iterator2.next();
            Civ5Resource_YieldChanges civ5Resource_YieldChanges0 = (Civ5Resource_YieldChanges)object3;
            for(Object object4: ((Iterable)this.n().H)) {
                if(!j.a(((Civ5Yields)object4).getType(), civ5Resource_YieldChanges0.getYieldType())) {
                    continue;
                }
                goto label_53;
            }
            object4 = null;
        label_53:
            if(((Civ5Yields)object4) == null) {
                s5 = null;
            }
            else {
                Integer integer0 = civ5Resource_YieldChanges0.getYield();
                j.c(integer0);
                if(((int)integer0) > 0) {
                    s4 = "+";
                }
                s5 = s4 + civ5Resource_YieldChanges0.getYield() + ((Civ5Yields)object4).getIconString();
            }
            if(s5 != null) {
                arrayList1.add(s5);
            }
        }
        b0.a(a.H("TXT_KEY_PEDIA_YIELD_LABEL", new Object[0]));
        if(arrayList1.isEmpty()) {
            b0.f(a.H("TXT_KEY_PEDIA_NO_YIELD", new Object[0]));
        }
        else {
            b0.f(i.Y(arrayList1, " ", null, null, null, 62));
        }
        b0.h();
        String s6 = ((Civ5Resources)object0).getTechReveal();
        if(s6 != null) {
            Object object5 = null;
            for(Object object6: ((Iterable)this.n().c)) {
                if(j.a(((Civ5Technologies)object6).getType(), s6)) {
                    object5 = object6;
                    break;
                }
            }
            if(((Civ5Technologies)object5) != null) {
                b0.a(a.H("TXT_KEY_PEDIA_REVEAL_TECH_LABEL", new Object[0]));
                k k0 = new k(f.h("ICON_", ((Civ5Technologies)object5).getType()), ((Civ5Technologies)object5).getDescription(), ((Civ5Technologies)object5).getType(), null);
                String s7 = ((Civ5Technologies)object5).getDescription();
                if(s7 == null) {
                    s7 = "";
                }
                b0.b(k0, s7);
                b0.h();
            }
        }
        b0.a(a.H("TXT_KEY_PEDIA_TERRAINS_LABEL", new Object[0]));
        o2.g g1 = this.n();
        ArrayList arrayList2 = new ArrayList();
        for(Object object7: ((Iterable)g1.b0)) {
            if(j.a(((Civ5Resource_FeatureBooleans)object7).getResourceType(), ((Civ5Resources)object0).getType())) {
                arrayList2.add(object7);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object8: arrayList2) {
            Civ5Resource_FeatureBooleans civ5Resource_FeatureBooleans0 = (Civ5Resource_FeatureBooleans)object8;
            for(Object object9: ((Iterable)this.n().r)) {
                if(!j.a(((Civ5Features)object9).getType(), civ5Resource_FeatureBooleans0.getFeatureType())) {
                    continue;
                }
                goto label_106;
            }
            object9 = null;
        label_106:
            if(((Civ5Features)object9) != null) {
                arrayList3.add(((Civ5Features)object9));
            }
        }
        for(Object object10: arrayList3) {
            k k1 = new k(f.h("ICON_", ((Civ5Features)object10).getType()), ((Civ5Features)object10).getDescription(), ((Civ5Features)object10).getType(), null);
            String s8 = ((Civ5Features)object10).getDescription();
            if(s8 == null) {
                s8 = "";
            }
            b0.b(k1, s8);
        }
        o2.g g2 = this.n();
        ArrayList arrayList4 = new ArrayList();
        for(Object object11: ((Iterable)g2.Y)) {
            if(j.a(((Civ5Resource_TerrainBooleans)object11).getResourceType(), ((Civ5Resources)object0).getType())) {
                arrayList4.add(object11);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for(Object object12: arrayList4) {
            Civ5Resource_TerrainBooleans civ5Resource_TerrainBooleans0 = (Civ5Resource_TerrainBooleans)object12;
            for(Object object13: ((Iterable)this.n().q)) {
                if(!j.a(((Civ5Terrains)object13).getType(), civ5Resource_TerrainBooleans0.getTerrainType())) {
                    continue;
                }
                goto label_137;
            }
            object13 = null;
        label_137:
            if(((Civ5Terrains)object13) != null) {
                arrayList5.add(((Civ5Terrains)object13));
            }
        }
        if(j.a(((Civ5Resources)object0).getHills(), Boolean.TRUE)) {
            if(!arrayList5.isEmpty()) {
                for(Object object14: arrayList5) {
                    if(!j.a(((Civ5Terrains)object14).getType(), "TERRAIN_HILL")) {
                        continue;
                    }
                    goto label_155;
                }
            }
            Object object15 = null;
            for(Object object16: ((Iterable)this.n().q)) {
                if(j.a(((Civ5Terrains)object16).getType(), "TERRAIN_HILL")) {
                    object15 = object16;
                    break;
                }
            }
            if(((Civ5Terrains)object15) != null) {
                arrayList5 = i.f0(arrayList5, ((Civ5Terrains)object15));
            }
        }
    label_155:
        for(Object object17: arrayList5) {
            k k2 = new k(f.h("ICON_", ((Civ5Terrains)object17).getType()), ((Civ5Terrains)object17).getDescription(), ((Civ5Terrains)object17).getType(), null);
            String s9 = ((Civ5Terrains)object17).getDescription();
            if(s9 == null) {
                s9 = "";
            }
            b0.b(k2, s9);
        }
        b0.h();
        o2.g g3 = this.n();
        ArrayList arrayList6 = new ArrayList();
        for(Object object18: ((Iterable)g3.G)) {
            if(j.a(((Civ5Improvement_ResourceTypes)object18).getResourceType(), ((Civ5Resources)object0).getType())) {
                arrayList6.add(object18);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for(Object object19: arrayList6) {
            Civ5Improvement_ResourceTypes civ5Improvement_ResourceTypes0 = (Civ5Improvement_ResourceTypes)object19;
            for(Object object20: ((Iterable)this.n().u)) {
                if(!j.a(((Civ5Improvements)object20).getType(), civ5Improvement_ResourceTypes0.getImprovementType())) {
                    continue;
                }
                goto label_184;
            }
            object20 = null;
        label_184:
            if(((Civ5Improvements)object20) != null) {
                arrayList7.add(((Civ5Improvements)object20));
            }
        }
        if(!arrayList7.isEmpty()) {
            Iterator iterator18 = i3.e.k("TXT_KEY_PEDIA_IMPROVEMENTS_LABEL", new Object[0], b0, arrayList7);
            while(iterator18.hasNext()) {
                Object object21 = iterator18.next();
                String s10 = f.h("ICON_", ((Civ5Improvements)object21).getType());
                String s11 = ((Civ5Improvements)object21).getDescription();
                if(s11 == null) {
                    s11 = "";
                }
                k k3 = new k(s10, s11, ((Civ5Improvements)object21).getType(), null);
                String s12 = ((Civ5Improvements)object21).getDescription();
                if(s12 == null) {
                    s12 = "";
                }
                b0.b(k3, s12);
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
    }

    private final void D() {
        this.s(this.p().j);
        this.p();
        if(j.a(this.p().b, "HOME")) {
            Civ5Technologies civ5Technologies0 = (Civ5Technologies)i.g0(((List)(((Collection)this.n().c))), e.i);
            this.f("ICON_" + (civ5Technologies0 == null ? null : civ5Technologies0.getType()));
            g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_TECHS", new Object[0]), 2);
            this.b(a.H("TXT_KEY_PEDIA_TECH_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_TECHNOLOGIES_HELP_TEXT", new Object[0])));
            return;
        }
        Object object0 = null;
        for(Object object1: ((Iterable)this.n().c)) {
            if(j.a(((Civ5Technologies)object1).getType(), this.p().b)) {
                object0 = object1;
                break;
            }
        }
        Civ5Technologies civ5Technologies1 = (Civ5Technologies)object0;
        if(civ5Technologies1 == null) {
            return;
        }
        this.f("ICON_" + civ5Technologies1.getType());
        String s = civ5Technologies1.getQuote();
        if(s != null) {
            g.g(this, s, 2);
        }
        String s1 = civ5Technologies1.getHelp();
        if(s1 != null) {
            this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s1));
        }
        ArrayList arrayList0 = new ArrayList();
        o2.g g0 = this.n();
        ArrayList arrayList1 = new ArrayList();
        for(Object object2: ((Iterable)g0.y)) {
            if(j.a(((Civ5Route_TechMovementChanges)object2).getTechType(), civ5Technologies1.getType())) {
                arrayList1.add(object2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object3: arrayList1) {
            Civ5Route_TechMovementChanges civ5Route_TechMovementChanges0 = (Civ5Route_TechMovementChanges)object3;
            for(Object object4: ((Iterable)this.n().v)) {
                if(!j.a(((Civ5Routes)object4).getType(), civ5Route_TechMovementChanges0.getRouteType())) {
                    continue;
                }
                goto label_44;
            }
            object4 = null;
        label_44:
            if(((Civ5Routes)object4) != null) {
                arrayList2.add(((Civ5Routes)object4));
            }
        }
        Iterator iterator4 = arrayList2.iterator();
        while(true) {
            String s2 = "";
            if(!iterator4.hasNext()) {
                break;
            }
            Object object5 = iterator4.next();
            String s3 = ((Civ5Routes)object5).getDescription();
            if(s3 != null) {
                s2 = s3;
            }
            arrayList0.add(a.H("TXT_KEY_CIVILOPEDIA_SPECIALABILITIES_MOVEMENT", new Object[]{s2}));
        }
        o2.g g1 = this.n();
        ArrayList arrayList3 = new ArrayList();
        for(Object object6: ((Iterable)g1.z)) {
            if(j.a(((Civ5Improvement_TechYieldChanges)object6).getTechType(), civ5Technologies1.getType())) {
                arrayList3.add(object6);
            }
        }
        for(Object object7: arrayList3) {
            Civ5Improvement_TechYieldChanges civ5Improvement_TechYieldChanges0 = (Civ5Improvement_TechYieldChanges)object7;
            for(Object object8: ((Iterable)this.n().u)) {
                if(!j.a(((Civ5Improvements)object8).getType(), civ5Improvement_TechYieldChanges0.getImprovementType())) {
                    continue;
                }
                goto label_74;
            }
            object8 = null;
        label_74:
            if(((Civ5Improvements)object8) != null) {
                for(Object object9: ((Iterable)this.n().H)) {
                    if(!j.a(((Civ5Yields)object9).getType(), civ5Improvement_TechYieldChanges0.getYieldType())) {
                        continue;
                    }
                    goto label_81;
                }
                object9 = null;
            label_81:
                if(((Civ5Yields)object9) != null) {
                    String s4 = ((Civ5Improvements)object8).getDescription();
                    if(s4 == null) {
                        s4 = "";
                    }
                    String s5 = ((Civ5Yields)object9).getDescription();
                    if(s5 == null) {
                        s5 = "";
                    }
                    arrayList0.add(a.H("TXT_KEY_CIVILOPEDIA_SPECIALABILITIES_YIELDCHANGES", new Object[]{s4, s5, String.valueOf(civ5Improvement_TechYieldChanges0.getYield())}));
                }
            }
        }
        o2.g g2 = this.n();
        ArrayList arrayList4 = new ArrayList();
        for(Object object10: ((Iterable)g2.A)) {
            if(j.a(((Civ5Improvement_TechNoFreshWaterYieldChanges)object10).getTechType(), civ5Technologies1.getType())) {
                arrayList4.add(object10);
            }
        }
        for(Object object11: arrayList4) {
            Civ5Improvement_TechNoFreshWaterYieldChanges civ5Improvement_TechNoFreshWaterYieldChanges0 = (Civ5Improvement_TechNoFreshWaterYieldChanges)object11;
            for(Object object12: ((Iterable)this.n().u)) {
                if(!j.a(((Civ5Improvements)object12).getType(), civ5Improvement_TechNoFreshWaterYieldChanges0.getImprovementType())) {
                    continue;
                }
                goto label_108;
            }
            object12 = null;
        label_108:
            if(((Civ5Improvements)object12) != null) {
                for(Object object13: ((Iterable)this.n().H)) {
                    if(!j.a(((Civ5Yields)object13).getType(), civ5Improvement_TechNoFreshWaterYieldChanges0.getYieldType())) {
                        continue;
                    }
                    goto label_115;
                }
                object13 = null;
            label_115:
                if(((Civ5Yields)object13) != null) {
                    String s6 = ((Civ5Improvements)object12).getDescription();
                    if(s6 == null) {
                        s6 = "";
                    }
                    String s7 = ((Civ5Yields)object13).getDescription();
                    if(s7 == null) {
                        s7 = "";
                    }
                    arrayList0.add(a.H("TXT_KEY_CIVILOPEDIA_SPECIALABILITIES_NOFRESHWATERYIELDCHANGES", new Object[]{s6, s7, String.valueOf(civ5Improvement_TechNoFreshWaterYieldChanges0.getYield())}));
                }
            }
        }
        o2.g g3 = this.n();
        ArrayList arrayList5 = new ArrayList();
        for(Object object14: ((Iterable)g3.B)) {
            if(j.a(((Civ5Improvement_TechFreshWaterYieldChanges)object14).getTechType(), civ5Technologies1.getType())) {
                arrayList5.add(object14);
            }
        }
        for(Object object15: arrayList5) {
            Civ5Improvement_TechFreshWaterYieldChanges civ5Improvement_TechFreshWaterYieldChanges0 = (Civ5Improvement_TechFreshWaterYieldChanges)object15;
            for(Object object16: ((Iterable)this.n().u)) {
                if(!j.a(((Civ5Improvements)object16).getType(), civ5Improvement_TechFreshWaterYieldChanges0.getImprovementType())) {
                    continue;
                }
                goto label_142;
            }
            object16 = null;
        label_142:
            if(((Civ5Improvements)object16) != null) {
                for(Object object17: ((Iterable)this.n().H)) {
                    if(!j.a(((Civ5Yields)object17).getType(), civ5Improvement_TechFreshWaterYieldChanges0.getYieldType())) {
                        continue;
                    }
                    goto label_149;
                }
                object17 = null;
            label_149:
                if(((Civ5Yields)object17) != null) {
                    String s8 = ((Civ5Improvements)object16).getDescription();
                    if(s8 == null) {
                        s8 = "";
                    }
                    String s9 = ((Civ5Yields)object17).getDescription();
                    if(s9 == null) {
                        s9 = "";
                    }
                    arrayList0.add(a.H("TXT_KEY_CIVILOPEDIA_SPECIALABILITIES_FRESHWATERYIELDCHANGES", new Object[]{s8, s9, String.valueOf(civ5Improvement_TechFreshWaterYieldChanges0.getYield())}));
                }
            }
        }
        Integer integer0 = civ5Technologies1.getEmbarkedMoveChange();
        if((integer0 == null ? 0 : ((int)integer0)) > 0) {
            arrayList0.add(a.H("TXT_KEY_ABLTY_FAST_EMBARK_STRING", new Object[0]));
        }
        if(j.a(civ5Technologies1.getAllowsEmbarking(), Boolean.TRUE)) {
            arrayList0.add(a.H("TXT_KEY_ALLOWS_EMBARKING", new Object[0]));
        }
        if(j.a(civ5Technologies1.getAllowsDefensiveEmbarking(), Boolean.TRUE)) {
            arrayList0.add(a.H("TXT_KEY_ABLTY_DEFENSIVE_EMBARK_STRING", new Object[0]));
        }
        if(j.a(civ5Technologies1.getEmbarkedAllWaterPassage(), Boolean.TRUE)) {
            arrayList0.add(a.H("TXT_KEY_ABLTY_OCEAN_EMBARK_STRING", new Object[0]));
        }
        if(j.a(civ5Technologies1.getAllowEmbassyTradingAllowed(), Boolean.TRUE)) {
            arrayList0.add(a.H("TXT_KEY_ABLTY_ALLOW_EMBASSY_STRING", new Object[0]));
        }
        if(j.a(civ5Technologies1.getOpenBordersTradingAllowed(), Boolean.TRUE)) {
            arrayList0.add(a.H("TXT_KEY_ABLTY_OPEN_BORDER_STRING", new Object[0]));
        }
        if(j.a(civ5Technologies1.getDefensivePactTradingAllowed(), Boolean.TRUE)) {
            arrayList0.add(a.H("TXT_KEY_ABLTY_D_PACT_STRING", new Object[0]));
        }
        if(j.a(civ5Technologies1.getResearchAgreementTradingAllowed(), Boolean.TRUE)) {
            arrayList0.add(a.H("TXT_KEY_ABLTY_R_PACT_STRING", new Object[0]));
        }
        if(j.a(civ5Technologies1.getTradeAgreementTradingAllowed(), Boolean.TRUE)) {
            arrayList0.add(a.H("TXT_KEY_ABLTY_T_PACT_STRING", new Object[0]));
        }
        if(j.a(civ5Technologies1.getBridgeBuilding(), Boolean.TRUE)) {
            arrayList0.add(a.H("TXT_KEY_ABLTY_BRIDGE_STRING", new Object[0]));
        }
        this.b(a.H("TXT_KEY_PEDIA_ABILITIES_LABEL", new Object[0]), arrayList0);
        String s10 = civ5Technologies1.getCivilopedia();
        if(s10 != null) {
            this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s10));
        }
        String s11 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, s11);
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        Integer integer1 = civ5Technologies1.getCost();
        if(integer1 != null) {
            int v = integer1.intValue();
            b0.a(a.H("TXT_KEY_PEDIA_COST_LABEL", new Object[0]));
            if(v > 0) {
                b0.f(v + " [ICON_RESEARCH]");
            }
            else {
                b0.f(a.H("TXT_KEY_FREE", new Object[0]));
            }
            b0.h();
        }
        o2.g g4 = this.n();
        ArrayList arrayList6 = new ArrayList();
        for(Object object18: ((Iterable)g4.w)) {
            if(j.a(((Civ5Technology_PrereqTechs)object18).getTechType(), civ5Technologies1.getType())) {
                arrayList6.add(object18);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for(Object object19: arrayList6) {
            Civ5Technology_PrereqTechs civ5Technology_PrereqTechs0 = (Civ5Technology_PrereqTechs)object19;
            for(Object object20: ((Iterable)this.n().c)) {
                if(!j.a(((Civ5Technologies)object20).getType(), civ5Technology_PrereqTechs0.getPrereqTech())) {
                    continue;
                }
                goto label_218;
            }
            object20 = null;
        label_218:
            if(((Civ5Technologies)object20) != null) {
                arrayList7.add(((Civ5Technologies)object20));
            }
        }
        if(!arrayList7.isEmpty()) {
            Iterator iterator20 = i3.e.k("TXT_KEY_PEDIA_PREREQ_TECH_LABEL", new Object[0], b0, arrayList7);
            while(iterator20.hasNext()) {
                Object object21 = iterator20.next();
                k k0 = new k(f.h("ICON_", ((Civ5Technologies)object21).getType()), ((Civ5Technologies)object21).getDescription(), ((Civ5Technologies)object21).getType(), null);
                String s12 = ((Civ5Technologies)object21).getDescription();
                if(s12 == null) {
                    s12 = "";
                }
                b0.b(k0, s12);
            }
            b0.h();
        }
        o2.g g5 = this.n();
        ArrayList arrayList8 = new ArrayList();
        for(Object object22: ((Iterable)g5.w)) {
            if(j.a(((Civ5Technology_PrereqTechs)object22).getPrereqTech(), civ5Technologies1.getType())) {
                arrayList8.add(object22);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for(Object object23: arrayList8) {
            Civ5Technology_PrereqTechs civ5Technology_PrereqTechs1 = (Civ5Technology_PrereqTechs)object23;
            for(Object object24: ((Iterable)this.n().c)) {
                if(!j.a(((Civ5Technologies)object24).getType(), civ5Technology_PrereqTechs1.getTechType())) {
                    continue;
                }
                goto label_251;
            }
            object24 = null;
        label_251:
            if(((Civ5Technologies)object24) != null) {
                arrayList9.add(((Civ5Technologies)object24));
            }
        }
        if(!arrayList9.isEmpty()) {
            Iterator iterator24 = i3.e.k("TXT_KEY_PEDIA_LEADS_TO_TECH_LABEL", new Object[0], b0, arrayList9);
            while(iterator24.hasNext()) {
                Object object25 = iterator24.next();
                k k1 = new k(f.h("ICON_", ((Civ5Technologies)object25).getType()), ((Civ5Technologies)object25).getDescription(), ((Civ5Technologies)object25).getType(), null);
                String s13 = ((Civ5Technologies)object25).getDescription();
                if(s13 == null) {
                    s13 = "";
                }
                b0.b(k1, s13);
            }
            b0.h();
        }
        o2.g g6 = this.n();
        ArrayList arrayList10 = new ArrayList();
        for(Object object26: ((Iterable)g6.d)) {
            if(j.a(((Civ5Units)object26).getPrereqTech(), civ5Technologies1.getType()) && j.a(((Civ5Units)object26).getShowInPedia(), Boolean.TRUE)) {
                arrayList10.add(object26);
            }
        }
        if(!arrayList10.isEmpty()) {
            Iterator iterator26 = i3.e.k("TXT_KEY_PEDIA_UNIT_UNLOCK_LABEL", new Object[0], b0, arrayList10);
            while(iterator26.hasNext()) {
                Object object27 = iterator26.next();
                k k2 = new k(f.h("ICON_", ((Civ5Units)object27).getType()), ((Civ5Units)object27).getDescription(), ((Civ5Units)object27).getType(), null);
                String s14 = ((Civ5Units)object27).getDescription();
                if(s14 == null) {
                    s14 = "";
                }
                b0.b(k2, s14);
            }
            b0.h();
        }
        o2.g g7 = this.n();
        ArrayList arrayList11 = new ArrayList();
        for(Object object28: ((Iterable)g7.f)) {
            if(j.a(((Civ5Buildings)object28).getPrereqTech(), civ5Technologies1.getType())) {
                arrayList11.add(object28);
            }
        }
        if(!arrayList11.isEmpty()) {
            Iterator iterator28 = i3.e.k("TXT_KEY_PEDIA_BLDG_UNLOCK_LABEL", new Object[0], b0, arrayList11);
            while(iterator28.hasNext()) {
                Object object29 = iterator28.next();
                k k3 = new k(f.h("ICON_", ((Civ5Buildings)object29).getType()), ((Civ5Buildings)object29).getDescription(), ((Civ5Buildings)object29).getType(), null);
                String s15 = ((Civ5Buildings)object29).getDescription();
                if(s15 == null) {
                    s15 = "";
                }
                b0.b(k3, s15);
            }
            b0.h();
        }
        o2.g g8 = this.n();
        ArrayList arrayList12 = new ArrayList();
        for(Object object30: ((Iterable)g8.h)) {
            if(j.a(((Civ5Projects)object30).getTechPrereq(), civ5Technologies1.getType())) {
                arrayList12.add(object30);
            }
        }
        if(!arrayList12.isEmpty()) {
            Iterator iterator30 = i3.e.k("TXT_KEY_PEDIA_PROJ_UNLOCK_LABEL", new Object[0], b0, arrayList12);
            while(iterator30.hasNext()) {
                Object object31 = iterator30.next();
                k k4 = new k(f.h("ICON_", ((Civ5Projects)object31).getType()), ((Civ5Projects)object31).getDescription(), ((Civ5Projects)object31).getType(), null);
                String s16 = ((Civ5Projects)object31).getDescription();
                if(s16 == null) {
                    s16 = "";
                }
                b0.b(k4, s16);
            }
            b0.h();
        }
        o2.g g9 = this.n();
        ArrayList arrayList13 = new ArrayList();
        for(Object object32: ((Iterable)g9.t)) {
            if(j.a(((Civ5Resources)object32).getTechReveal(), civ5Technologies1.getType())) {
                arrayList13.add(object32);
            }
        }
        if(!arrayList13.isEmpty()) {
            Iterator iterator32 = i3.e.k("TXT_KEY_PEDIA_RESRC_RVL_LABEL", new Object[0], b0, arrayList13);
            while(iterator32.hasNext()) {
                Object object33 = iterator32.next();
                k k5 = new k(f.h("ICON_", ((Civ5Resources)object33).getType()), ((Civ5Resources)object33).getDescription(), ((Civ5Resources)object33).getType(), null);
                String s17 = ((Civ5Resources)object33).getDescription();
                if(s17 == null) {
                    s17 = "";
                }
                b0.b(k5, s17);
            }
            b0.h();
        }
        o2.g g10 = this.n();
        ArrayList arrayList14 = new ArrayList();
        for(Object object34: ((Iterable)g10.x)) {
            if(j.a(((Civ5Builds)object34).getPrereqTech(), civ5Technologies1.getType()) && j.a(((Civ5Builds)object34).getShowInPedia(), Boolean.TRUE)) {
                arrayList14.add(object34);
            }
        }
        if(!arrayList14.isEmpty()) {
            Iterator iterator34 = i3.e.k("TXT_KEY_PEDIA_WORKER_ACTION_LABEL", new Object[0], b0, arrayList14);
            while(iterator34.hasNext()) {
                Object object35 = iterator34.next();
                Civ5Builds civ5Builds0 = (Civ5Builds)object35;
                String s18 = civ5Builds0.getRouteType();
                if(s18 == null) {
                    String s19 = civ5Builds0.getImprovementType();
                    s18 = s19 == null ? "CONCEPT_WORKERS_CLEARINGLAND" : s19;
                }
                b0.b(new k("ICON_" + civ5Builds0.getType(), civ5Builds0.getDescription(), s18, null), (civ5Builds0.getDescription() == null ? "" : civ5Builds0.getDescription()));
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
    }

    private final void E() {
        j2.a a0;
        int v1;
        Iterator iterator4;
        Object object4;
        this.s(this.p().j);
        this.p();
        if(j.a(this.p().b, "HOME")) {
            Civ5Terrains civ5Terrains0 = (Civ5Terrains)i.g0(((List)(((Collection)this.n().q))), e.i);
            if(civ5Terrains0 != null) {
                String s = civ5Terrains0.getType();
                if(s != null) {
                    this.f("ICON_" + s);
                    g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_TERRAIN", new Object[0]), 2);
                    this.b(a.H("TXT_KEY_PEDIA_TERRAIN_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_TERRAIN_HELP_TEXT", new Object[0])));
                    this.b(a.H("TXT_KEY_PEDIA_TERRAIN_FEATURES_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_TERRAIN_FEATURES_HELP_TEXT", new Object[0])));
                }
            }
            return;
        }
        if(j.a(this.p().c, "1")) {
            Object object0 = null;
            for(Object object1: ((Iterable)this.n().q)) {
                if(j.a(((Civ5Terrains)object1).getType(), this.p().b)) {
                    object0 = object1;
                    break;
                }
            }
            if(((Civ5Terrains)object0) != null) {
                this.f("ICON_" + ((Civ5Terrains)object0).getType());
                String s1 = ((Civ5Terrains)object0).getCivilopedia();
                if(s1 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s1));
                }
                String s2 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView0);
                o1.a.U(textView0, s2);
                Q1.b b0 = new Q1.b(linearLayout0, this.q());
                b0.h();
                b0.a(a.H("TXT_KEY_PEDIA_YIELD_LABEL", new Object[0]));
                if(j.a(((Civ5Terrains)object0).getType(), "TERRAIN_HILL")) {
                    b0.f("2 [ICON_PRODUCTION]");
                    b0.h();
                }
                else {
                    o2.g g0 = this.n();
                    ArrayList arrayList0 = new ArrayList();
                    for(Object object2: ((Iterable)g0.X)) {
                        if(j.a(((Civ5Terrain_Yields)object2).getTerrainType(), ((Civ5Terrains)object0).getType())) {
                            arrayList0.add(object2);
                        }
                    }
                    ArrayList arrayList1 = new ArrayList();
                    Iterator iterator2 = arrayList0.iterator();
                    while(iterator2.hasNext()) {
                        Object object3 = iterator2.next();
                        Civ5Terrain_Yields civ5Terrain_Yields0 = (Civ5Terrain_Yields)object3;
                        Iterator iterator3 = ((Iterable)this.n().H).iterator();
                        while(true) {
                            if(iterator3.hasNext()) {
                                object4 = iterator3.next();
                                iterator4 = iterator2;
                                if(j.a(((Civ5Yields)object4).getType(), civ5Terrain_Yields0.getYieldType())) {
                                    break;
                                }
                                else {
                                    iterator2 = iterator4;
                                    continue;
                                }
                            }
                            iterator4 = iterator2;
                            object4 = null;
                            break;
                        }
                        String s3 = ((Civ5Yields)object4) == null ? null : civ5Terrain_Yields0.getYield() + " " + ((Civ5Yields)object4).getIconString();
                        if(s3 != null) {
                            arrayList1.add(s3);
                        }
                        iterator2 = iterator4;
                    }
                    if(arrayList1.isEmpty()) {
                        b0.f(a.H("TXT_KEY_PEDIA_NO_YIELD", new Object[0]));
                    }
                    else {
                        b0.f(i.Y(arrayList1, " ", null, null, null, 62));
                    }
                }
                b0.h();
                b0.a(a.H("TXT_KEY_PEDIA_MOVECOST_LABEL", new Object[0]));
                Integer integer0 = ((Civ5Terrains)object0).getMovement();
                int v = integer0 == null ? 0 : ((int)integer0);
                if(j.a(((Civ5Terrains)object0).getType(), "TERRAIN_HILL")) {
                    ++v;
                }
                if(j.a(((Civ5Terrains)object0).getType(), "TERRAIN_MOUNTAIN")) {
                    b0.f(a.H("TXT_KEY_PEDIA_IMPASSABLE", new Object[0]));
                }
                else {
                    b0.f(v + "[ICON_MOVES]");
                }
                b0.h();
                b0.a(a.H("TXT_KEY_PEDIA_COMBATMOD_LABEL", new Object[0]));
                if(j.a(((Civ5Terrains)object0).getType(), "TERRAIN_HILL") || j.a(((Civ5Terrains)object0).getType(), "TERRAIN_MOUNTAIN")) {
                    v1 = 25;
                }
                else if(j.a(((Civ5Terrains)object0).getWater(), Boolean.TRUE)) {
                    v1 = 0;
                }
                else {
                    v1 = -10;
                }
                b0.f((v1 <= 0 ? "" : "+") + v1 + "%");
                b0.h();
                o2.g g1 = this.n();
                ArrayList arrayList2 = new ArrayList();
                for(Object object5: ((Iterable)g1.Z)) {
                    if(j.a(((Civ5Feature_TerrainBooleans)object5).getTerrainType(), ((Civ5Terrains)object0).getType())) {
                        arrayList2.add(object5);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object6: arrayList2) {
                    Civ5Feature_TerrainBooleans civ5Feature_TerrainBooleans0 = (Civ5Feature_TerrainBooleans)object6;
                    for(Object object7: ((Iterable)this.n().r)) {
                        if(!j.a(((Civ5Features)object7).getType(), civ5Feature_TerrainBooleans0.getFeatureType())) {
                            continue;
                        }
                        goto label_108;
                    }
                    object7 = null;
                label_108:
                    if(((Civ5Features)object7) != null) {
                        arrayList3.add(((Civ5Features)object7));
                    }
                }
                if(!arrayList3.isEmpty()) {
                    Iterator iterator8 = i3.e.k("TXT_KEY_PEDIA_FEATURES_LABEL", new Object[0], b0, arrayList3);
                    while(iterator8.hasNext()) {
                        Object object8 = iterator8.next();
                        k k0 = new k(f.h("ICON_", ((Civ5Features)object8).getType()), ((Civ5Features)object8).getDescription(), ((Civ5Features)object8).getType(), null);
                        String s4 = ((Civ5Features)object8).getDescription();
                        if(s4 == null) {
                            s4 = "";
                        }
                        b0.b(k0, s4);
                    }
                    b0.h();
                }
                o2.g g2 = this.n();
                ArrayList arrayList4 = new ArrayList();
                for(Object object9: ((Iterable)g2.Y)) {
                    if(j.a(((Civ5Resource_TerrainBooleans)object9).getTerrainType(), ((Civ5Terrains)object0).getType())) {
                        arrayList4.add(object9);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for(Object object10: arrayList4) {
                    Civ5Resource_TerrainBooleans civ5Resource_TerrainBooleans0 = (Civ5Resource_TerrainBooleans)object10;
                    for(Object object11: ((Iterable)this.n().t)) {
                        if(!j.a(((Civ5Resources)object11).getType(), civ5Resource_TerrainBooleans0.getResourceType())) {
                            continue;
                        }
                        goto label_141;
                    }
                    object11 = null;
                label_141:
                    if(((Civ5Resources)object11) != null) {
                        arrayList5.add(((Civ5Resources)object11));
                    }
                }
                if(j.a(((Civ5Terrains)object0).getType(), "TERRAIN_HILL")) {
                    o2.g g3 = this.n();
                    ArrayList arrayList6 = new ArrayList();
                    for(Object object12: ((Iterable)g3.t)) {
                        if(j.a(((Civ5Resources)object12).getHills(), Boolean.TRUE)) {
                            arrayList6.add(object12);
                        }
                    }
                    arrayList5 = i.e0(arrayList6, arrayList5);
                }
                if(!arrayList5.isEmpty()) {
                    b0.a(a.H("TXT_KEY_PEDIA_RESOURCESFOUND_LABEL", new Object[0]));
                    for(Object object13: arrayList5) {
                        k k1 = new k(f.h("ICON_", ((Civ5Resources)object13).getType()), ((Civ5Resources)object13).getDescription(), ((Civ5Resources)object13).getType(), null);
                        String s5 = ((Civ5Resources)object13).getDescription();
                        if(s5 == null) {
                            s5 = "";
                        }
                        b0.b(k1, s5);
                    }
                    b0.h();
                }
                if(!b0.n()) {
                    this.j(linearLayout0);
                }
            }
        }
        else {
            Object object14 = null;
            for(Object object15: ((Iterable)this.n().r)) {
                if(j.a(((Civ5Features)object15).getType(), this.p().b)) {
                    object14 = object15;
                    break;
                }
            }
            if(((Civ5Features)object14) == null) {
                Object object16 = null;
                for(Object object17: ((Iterable)this.n().s)) {
                    if(j.a(((Civ5FakeFeatures)object17).getType(), this.p().b)) {
                        object16 = object17;
                        break;
                    }
                }
                a0 = ((Civ5FakeFeatures)object16) == null ? null : new j2.a(((Civ5FakeFeatures)object16).getType(), null, ((Civ5FakeFeatures)object16).getCivilopedia(), null, null, ((Civ5FakeFeatures)object16).getDefense(), ((Civ5FakeFeatures)object16).getImpassable());
            }
            else {
                a0 = new j2.a(((Civ5Features)object14).getType(), ((Civ5Features)object14).getHelp(), ((Civ5Features)object14).getCivilopedia(), ((Civ5Features)object14).getMovement(), ((Civ5Features)object14).getInBorderHappiness(), ((Civ5Features)object14).getDefense(), ((Civ5Features)object14).getImpassable());
            }
            if(a0 != null) {
                String s6 = a0.b;
                this.f("ICON_" + s6);
                String s7 = a0.f;
                if(s7 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s7));
                }
                String s8 = a0.g;
                if(s8 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s8));
                }
                String s9 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView1);
                o1.a.U(textView1, s9);
                Q1.b b1 = new Q1.b(linearLayout1, this.q());
                b1.h();
                o2.g g4 = this.n();
                ArrayList arrayList7 = new ArrayList();
                for(Object object18: ((Iterable)g4.a0)) {
                    if(j.a(((Civ5Feature_YieldChanges)object18).getFeatureType(), s6)) {
                        arrayList7.add(object18);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                Iterator iterator17 = arrayList7.iterator();
                while(iterator17.hasNext()) {
                    Object object19 = null;
                    Object object20 = iterator17.next();
                    Civ5Feature_YieldChanges civ5Feature_YieldChanges0 = (Civ5Feature_YieldChanges)object20;
                    for(Object object21: ((Iterable)this.n().H)) {
                        if(j.a(((Civ5Yields)object21).getType(), civ5Feature_YieldChanges0.getYieldType())) {
                            object19 = object21;
                            break;
                        }
                    }
                    String s10 = ((Civ5Yields)object19) == null ? null : civ5Feature_YieldChanges0.getYield() + ((Civ5Yields)object19).getIconString();
                    if(s10 != null) {
                        arrayList8.add(s10);
                    }
                }
                ArrayList arrayList9 = i.p0(arrayList8);
                Integer integer1 = a0.c;
                if(integer1 != null) {
                    int v2 = integer1.intValue();
                    if(v2 != 0) {
                        arrayList9.add(v2 + "[ICON_HAPPINESS_1]");
                    }
                }
                b1.a(a.H("TXT_KEY_PEDIA_YIELD_LABEL", new Object[0]));
                if(arrayList9.isEmpty()) {
                    b1.f(a.H("TXT_KEY_PEDIA_NO_YIELD", new Object[0]));
                }
                else {
                    b1.f(i.Y(arrayList9, " ", null, null, null, 62));
                }
                b1.h();
                b1.a(a.H("TXT_KEY_PEDIA_MOVECOST_LABEL", new Object[0]));
                if(j.a(s6, "FEATURE_RIVER")) {
                    b1.f(a.H("TXT_KEY_CIV5_FEATURES_RIVER_MVT_TEXT", new Object[0]) + "[ICON_MOVES]");
                }
                else if(j.a(a0.d, Boolean.TRUE)) {
                    b1.f(a.H("TXT_KEY_PEDIA_IMPASSABLE", new Object[0]));
                }
                else {
                    Integer integer2 = a0.a;
                    if(integer2 != null) {
                        b1.f(integer2.intValue() + "[ICON_MOVES]");
                    }
                }
                b1.h();
                b1.a(a.H("TXT_KEY_PEDIA_COMBATMOD_LABEL", new Object[0]));
                Integer integer3 = a0.e;
                if(integer3 != null) {
                    int v3 = integer3.intValue();
                    b1.f((v3 <= 0 ? "" : "+") + v3 + "%");
                    b1.h();
                }
                o2.g g5 = this.n();
                ArrayList arrayList10 = new ArrayList();
                for(Object object22: ((Iterable)g5.Z)) {
                    if(j.a(((Civ5Feature_TerrainBooleans)object22).getFeatureType(), s6)) {
                        arrayList10.add(object22);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                for(Object object23: arrayList10) {
                    Civ5Feature_TerrainBooleans civ5Feature_TerrainBooleans1 = (Civ5Feature_TerrainBooleans)object23;
                    for(Object object24: ((Iterable)this.n().q)) {
                        if(!j.a(((Civ5Terrains)object24).getType(), civ5Feature_TerrainBooleans1.getTerrainType())) {
                            continue;
                        }
                        goto label_272;
                    }
                    object24 = null;
                label_272:
                    if(((Civ5Terrains)object24) != null) {
                        arrayList11.add(((Civ5Terrains)object24));
                    }
                }
                if(!arrayList11.isEmpty()) {
                    Iterator iterator22 = i3.e.k("TXT_KEY_PEDIA_TERRAINS_LABEL", new Object[0], b1, arrayList11);
                    while(iterator22.hasNext()) {
                        Object object25 = iterator22.next();
                        k k2 = new k(f.h("ICON_", ((Civ5Terrains)object25).getType()), ((Civ5Terrains)object25).getDescription(), ((Civ5Terrains)object25).getType(), null);
                        String s11 = ((Civ5Terrains)object25).getDescription();
                        if(s11 == null) {
                            s11 = "";
                        }
                        b1.b(k2, s11);
                    }
                    b1.h();
                }
                o2.g g6 = this.n();
                ArrayList arrayList12 = new ArrayList();
                for(Object object26: ((Iterable)g6.b0)) {
                    if(j.a(((Civ5Resource_FeatureBooleans)object26).getFeatureType(), s6)) {
                        arrayList12.add(object26);
                    }
                }
                ArrayList arrayList13 = new ArrayList();
                for(Object object27: arrayList12) {
                    Civ5Resource_FeatureBooleans civ5Resource_FeatureBooleans0 = (Civ5Resource_FeatureBooleans)object27;
                    for(Object object28: ((Iterable)this.n().t)) {
                        if(!j.a(((Civ5Resources)object28).getType(), civ5Resource_FeatureBooleans0.getResourceType())) {
                            continue;
                        }
                        goto label_305;
                    }
                    object28 = null;
                label_305:
                    if(((Civ5Resources)object28) != null) {
                        arrayList13.add(((Civ5Resources)object28));
                    }
                }
                if(!arrayList13.isEmpty()) {
                    Iterator iterator26 = i3.e.k("TXT_KEY_PEDIA_RESOURCESFOUND_LABEL", new Object[0], b1, arrayList13);
                    while(iterator26.hasNext()) {
                        Object object29 = iterator26.next();
                        k k3 = new k(f.h("ICON_", ((Civ5Resources)object29).getType()), ((Civ5Resources)object29).getDescription(), ((Civ5Resources)object29).getType(), null);
                        String s12 = ((Civ5Resources)object29).getDescription();
                        if(s12 == null) {
                            s12 = "";
                        }
                        b1.b(k3, s12);
                    }
                    b1.h();
                }
                if(!b1.n()) {
                    this.j(linearLayout1);
                }
            }
        }
    }

    private final void F() {
        Civ5Units civ5Units1;
        this.s(this.p().j);
        this.p();
        if(j.a(this.p().b, "HOME")) {
            Civ5Units civ5Units0 = (Civ5Units)i.g0(((List)(((Collection)this.n().d))), e.i);
            this.f("ICON_" + (civ5Units0 == null ? null : civ5Units0.getType()));
            g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_TECHS", new Object[0]), 2);
            this.b(a.H("TXT_KEY_PEDIA_TECH_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_TECHNOLOGIES_HELP_TEXT", new Object[0])));
            return;
        }
        Object object0 = null;
        for(Object object1: ((Iterable)this.n().d)) {
            if(j.a(((Civ5Units)object1).getType(), this.p().b)) {
                object0 = object1;
                break;
            }
        }
        if(((Civ5Units)object0) != null) {
            this.f("ICON_" + ((Civ5Units)object0).getType());
            String s = ((Civ5Units)object0).getHelp();
            if(s != null) {
                this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s));
            }
            String s1 = ((Civ5Units)object0).getStrategy();
            if(s1 != null) {
                this.b(a.H("TXT_KEY_PEDIA_STRATEGY_LABEL", new Object[0]), G.p(s1));
            }
            String s2 = ((Civ5Units)object0).getCivilopedia();
            if(s2 != null) {
                this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s2));
            }
            String s3 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
            LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
            TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
            j.c(textView0);
            o1.a.U(textView0, s3);
            Q1.b b0 = new Q1.b(linearLayout0, this.q());
            b0.h();
            Integer integer0 = ((Civ5Units)object0).getCost();
            if(integer0 != null) {
                int v = integer0.intValue();
                Integer integer1 = ((Civ5Units)object0).getFaithCost();
                if(integer1 != null) {
                    int v1 = integer1.intValue();
                    b0.a(a.H("TXT_KEY_PEDIA_COST_LABEL", new Object[0]));
                    if(v == 1 && v1 > 0) {
                        b0.f(v1 + " [ICON_PEACE]");
                    }
                    else if(v > 0 && v1 > 0) {
                        b0.f(a.H("TXT_KEY_PEDIA_A_OR_B", new Object[]{v + " [ICON_PRODUCTION]", v1 + " [ICON_PEACE]"}));
                    }
                    else if(v > 0) {
                        b0.f(v + " [ICON_PRODUCTION]");
                    }
                    else if(v1 > 0) {
                        b0.f(v1 + " [ICON_PEACE]");
                    }
                    else {
                        b0.f(a.H("TXT_KEY_FREE", new Object[0]));
                    }
                    b0.h();
                }
            }
            String s4 = ((Civ5Units)object0).getCombatClass();
            if(s4 != null) {
                Object object2 = null;
                for(Object object3: ((Iterable)this.n().I)) {
                    if(j.a(((Civ5UnitCombatInfos)object3).getType(), s4)) {
                        object2 = object3;
                        break;
                    }
                }
                if(((Civ5UnitCombatInfos)object2) != null) {
                    b0.a(a.H("TXT_KEY_PEDIA_COMBATTYPE_LABEL", new Object[0]));
                    String s5 = ((Civ5UnitCombatInfos)object2).getDescription();
                    b0.f((s5 == null ? "" : a.H(s5, new Object[0])));
                    b0.h();
                }
            }
            Integer integer2 = ((Civ5Units)object0).getCombat();
            if(integer2 != null) {
                int v2 = integer2.intValue();
                if(v2 > 0) {
                    b0.a(a.H("TXT_KEY_PEDIA_COMBAT_LABEL", new Object[0]));
                    b0.f(v2 + " [ICON_STRENGTH]");
                    b0.h();
                }
            }
            Integer integer3 = ((Civ5Units)object0).getRangedCombat();
            if(integer3 != null) {
                int v3 = integer3.intValue();
                if(v3 > 0) {
                    b0.a(a.H("TXT_KEY_PEDIA_RANGEDCOMBAT_LABEL", new Object[0]));
                    b0.f(v3 + " [ICON_RANGE_STRENGTH]");
                    b0.h();
                }
            }
            Integer integer4 = ((Civ5Units)object0).getRange();
            if(integer4 != null) {
                int v4 = integer4.intValue();
                if(v4 > 0) {
                    b0.a(a.H("TXT_KEY_PEDIA_RANGE_LABEL", new Object[0]));
                    b0.f(String.valueOf(v4));
                    b0.h();
                }
            }
            Integer integer5 = ((Civ5Units)object0).getMoves();
            if(integer5 != null) {
                int v5 = integer5.intValue();
                if(v5 > 0) {
                    b0.a(a.H("TXT_KEY_PEDIA_MOVEMENT_LABEL", new Object[0]));
                    b0.f(v5 + " [ICON_MOVES]");
                    b0.h();
                }
            }
            o2.g g0 = this.n();
            ArrayList arrayList0 = new ArrayList();
            for(Object object4: ((Iterable)g0.N)) {
                Civ5Civilization_UnitClassOverrides civ5Civilization_UnitClassOverrides0 = (Civ5Civilization_UnitClassOverrides)object4;
                if(j.a(civ5Civilization_UnitClassOverrides0.getUnitType(), ((Civ5Units)object0).getType()) && !j.a(civ5Civilization_UnitClassOverrides0.getCivilizationType(), "CIVILIZATION_BARBARIAN") && !j.a(civ5Civilization_UnitClassOverrides0.getCivilizationType(), "CIVILIZATION_MINOR")) {
                    arrayList0.add(object4);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object5: arrayList0) {
                Civ5Civilization_UnitClassOverrides civ5Civilization_UnitClassOverrides1 = (Civ5Civilization_UnitClassOverrides)object5;
                for(Object object6: ((Iterable)this.n().l)) {
                    if(!j.a(civ5Civilization_UnitClassOverrides1.getCivilizationType(), ((Civ5Civilizations)object6).getType())) {
                        continue;
                    }
                    goto label_114;
                }
                object6 = null;
            label_114:
                if(((Civ5Civilizations)object6) != null) {
                    arrayList1.add(((Civ5Civilizations)object6));
                }
            }
            if(!arrayList1.isEmpty()) {
                Iterator iterator5 = i3.e.k("TXT_KEY_PEDIA_CIVILIZATIONS_LABEL", new Object[0], b0, arrayList1);
                while(iterator5.hasNext()) {
                    Object object7 = iterator5.next();
                    k k0 = new k(f.h("ICON_", ((Civ5Civilizations)object7).getType()), ((Civ5Civilizations)object7).getDescription(), ((Civ5Civilizations)object7).getType(), null);
                    String s6 = ((Civ5Civilizations)object7).getShortDescription();
                    if(s6 == null) {
                        s6 = "";
                    }
                    b0.b(k0, s6);
                }
                b0.h();
            }
            o2.g g1 = this.n();
            ArrayList arrayList2 = new ArrayList();
            for(Object object8: ((Iterable)g1.J)) {
                if(j.a(((Civ5Unit_FreePromotions)object8).getUnitType(), ((Civ5Units)object0).getType())) {
                    arrayList2.add(object8);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for(Object object9: arrayList2) {
                Civ5Unit_FreePromotions civ5Unit_FreePromotions0 = (Civ5Unit_FreePromotions)object9;
                for(Object object10: ((Iterable)this.n().e)) {
                    if(!j.a(civ5Unit_FreePromotions0.getPromotionType(), ((Civ5UnitPromotions)object10).getType())) {
                        continue;
                    }
                    goto label_147;
                }
                object10 = null;
            label_147:
                if(((Civ5UnitPromotions)object10) != null) {
                    arrayList3.add(((Civ5UnitPromotions)object10));
                }
            }
            if(!arrayList3.isEmpty()) {
                Iterator iterator9 = i3.e.k("TXT_KEY_PEDIA_FREEPROMOTIONS_LABEL", new Object[0], b0, arrayList3);
                while(iterator9.hasNext()) {
                    Object object11 = iterator9.next();
                    k k1 = new k(f.h("ICON_", ((Civ5UnitPromotions)object11).getType()), ((Civ5UnitPromotions)object11).getDescription(), ((Civ5UnitPromotions)object11).getType(), null);
                    String s7 = ((Civ5UnitPromotions)object11).getDescription();
                    if(s7 == null) {
                        s7 = "";
                    }
                    b0.b(k1, s7);
                }
                b0.h();
            }
            o2.g g2 = this.n();
            ArrayList arrayList4 = new ArrayList();
            for(Object object12: ((Iterable)g2.K)) {
                if(j.a(((Civ5Unit_ResourceQuantityRequirements)object12).getUnitType(), ((Civ5Units)object0).getType())) {
                    arrayList4.add(object12);
                }
            }
            ArrayList arrayList5 = new ArrayList();
            for(Object object13: arrayList4) {
                Civ5Unit_ResourceQuantityRequirements civ5Unit_ResourceQuantityRequirements0 = (Civ5Unit_ResourceQuantityRequirements)object13;
                for(Object object14: ((Iterable)this.n().t)) {
                    if(!j.a(civ5Unit_ResourceQuantityRequirements0.getResourceType(), ((Civ5Resources)object14).getType())) {
                        continue;
                    }
                    goto label_180;
                }
                object14 = null;
            label_180:
                if(((Civ5Resources)object14) != null) {
                    arrayList5.add(((Civ5Resources)object14));
                }
            }
            if(!arrayList5.isEmpty()) {
                Iterator iterator13 = i3.e.k("TXT_KEY_PEDIA_REQ_RESRC_LABEL", new Object[0], b0, arrayList5);
                while(iterator13.hasNext()) {
                    Object object15 = iterator13.next();
                    k k2 = new k(f.h("ICON_", ((Civ5Resources)object15).getType()), ((Civ5Resources)object15).getDescription(), ((Civ5Resources)object15).getType(), null);
                    String s8 = ((Civ5Resources)object15).getDescription();
                    if(s8 == null) {
                        s8 = "";
                    }
                    b0.b(k2, s8);
                }
                b0.h();
            }
            String s9 = ((Civ5Units)object0).getPrereqTech();
            if(s9 != null) {
                Object object16 = null;
                for(Object object17: ((Iterable)this.n().c)) {
                    if(j.a(((Civ5Technologies)object17).getType(), s9)) {
                        object16 = object17;
                        break;
                    }
                }
                if(((Civ5Technologies)object16) != null) {
                    b0.a(a.H("TXT_KEY_PEDIA_PREREQ_TECH_LABEL", new Object[0]));
                    k k3 = new k(f.h("ICON_", ((Civ5Technologies)object16).getType()), ((Civ5Technologies)object16).getDescription(), ((Civ5Technologies)object16).getType(), null);
                    String s10 = ((Civ5Technologies)object16).getDescription();
                    if(s10 == null) {
                        s10 = "";
                    }
                    b0.b(k3, s10);
                    b0.h();
                }
            }
            String s11 = ((Civ5Units)object0).getObsoleteTech();
            if(s11 != null) {
                Object object18 = null;
                for(Object object19: ((Iterable)this.n().c)) {
                    if(j.a(((Civ5Technologies)object19).getType(), s11)) {
                        object18 = object19;
                        break;
                    }
                }
                if(((Civ5Technologies)object18) != null) {
                    b0.a(a.H("TXT_KEY_PEDIA_OBSOLETE_TECH_LABEL", new Object[0]));
                    k k4 = new k(f.h("ICON_", ((Civ5Technologies)object18).getType()), ((Civ5Technologies)object18).getDescription(), ((Civ5Technologies)object18).getType(), null);
                    String s12 = ((Civ5Technologies)object18).getDescription();
                    if(s12 == null) {
                        s12 = "";
                    }
                    b0.b(k4, s12);
                    b0.h();
                }
            }
            o2.g g3 = this.n();
            ArrayList arrayList6 = new ArrayList();
            for(Object object20: ((Iterable)g3.L)) {
                if(j.a(((Civ5Unit_ClassUpgrades)object20).getUnitType(), ((Civ5Units)object0).getType())) {
                    arrayList6.add(object20);
                }
            }
            ArrayList arrayList7 = new ArrayList();
            for(Object object21: arrayList6) {
                Civ5Unit_ClassUpgrades civ5Unit_ClassUpgrades0 = (Civ5Unit_ClassUpgrades)object21;
                for(Object object22: ((Iterable)this.n().M)) {
                    if(!j.a(((Civ5UnitClasses)object22).getType(), civ5Unit_ClassUpgrades0.getUnitClassType())) {
                        continue;
                    }
                    goto label_245;
                }
                object22 = null;
            label_245:
                Civ5UnitClasses civ5UnitClasses0 = (Civ5UnitClasses)object22;
                if(civ5UnitClasses0 == null) {
                    civ5Units1 = null;
                }
                else {
                    for(Object object23: ((Iterable)this.n().d)) {
                        if(!j.a(((Civ5Units)object23).getType(), civ5UnitClasses0.getDefaultUnit())) {
                            continue;
                        }
                        goto label_253;
                    }
                    object23 = null;
                label_253:
                    civ5Units1 = (Civ5Units)object23;
                }
                if(civ5Units1 != null) {
                    arrayList7.add(civ5Units1);
                }
            }
            if(!arrayList7.isEmpty()) {
                Iterator iterator20 = i3.e.k("TXT_KEY_COMMAND_UPGRADE", new Object[0], b0, arrayList7);
                while(iterator20.hasNext()) {
                    Object object24 = iterator20.next();
                    k k5 = new k(f.h("ICON_", ((Civ5Units)object24).getType()), ((Civ5Units)object24).getDescription(), ((Civ5Units)object24).getType(), null);
                    String s13 = ((Civ5Units)object24).getDescription();
                    if(s13 == null) {
                        s13 = "";
                    }
                    b0.b(k5, s13);
                }
                b0.h();
            }
            o2.g g4 = this.n();
            ArrayList arrayList8 = new ArrayList();
            for(Object object25: ((Iterable)g4.N)) {
                Civ5Civilization_UnitClassOverrides civ5Civilization_UnitClassOverrides2 = (Civ5Civilization_UnitClassOverrides)object25;
                if(j.a(civ5Civilization_UnitClassOverrides2.getUnitType(), ((Civ5Units)object0).getType()) && !j.a(civ5Civilization_UnitClassOverrides2.getCivilizationType(), "CIVILIZATION_BARBARIAN") && !j.a(civ5Civilization_UnitClassOverrides2.getCivilizationType(), "CIVILIZATION_MINOR")) {
                    arrayList8.add(object25);
                }
            }
            ArrayList arrayList9 = new ArrayList();
            for(Object object26: arrayList8) {
                Civ5Civilization_UnitClassOverrides civ5Civilization_UnitClassOverrides3 = (Civ5Civilization_UnitClassOverrides)object26;
                o2.g g5 = this.n();
                ArrayList arrayList10 = new ArrayList();
                for(Object object27: ((Iterable)g5.M)) {
                    if(j.a(((Civ5UnitClasses)object27).getType(), civ5Civilization_UnitClassOverrides3.getUnitClassType())) {
                        arrayList10.add(object27);
                    }
                }
                ArrayList arrayList11 = new ArrayList();
                for(Object object28: arrayList10) {
                    Civ5UnitClasses civ5UnitClasses1 = (Civ5UnitClasses)object28;
                    o2.g g6 = this.n();
                    ArrayList arrayList12 = new ArrayList();
                    for(Object object29: ((Iterable)g6.d)) {
                        if(j.a(((Civ5Units)object29).getType(), civ5UnitClasses1.getDefaultUnit())) {
                            arrayList12.add(object29);
                        }
                    }
                    o.H(arrayList12, arrayList11);
                }
                o.H(arrayList11, arrayList9);
            }
            if(!arrayList9.isEmpty()) {
                Iterator iterator26 = i3.e.k("TXT_KEY_PEDIA_REPLACES_LABEL", new Object[0], b0, arrayList9);
                while(iterator26.hasNext()) {
                    Object object30 = iterator26.next();
                    k k6 = new k(f.h("ICON_", ((Civ5Units)object30).getType()), ((Civ5Units)object30).getDescription(), ((Civ5Units)object30).getType(), null);
                    String s14 = ((Civ5Units)object30).getDescription();
                    if(s14 == null) {
                        s14 = "";
                    }
                    b0.b(k6, s14);
                }
                b0.h();
            }
            if(!b0.n()) {
                this.j(linearLayout0);
            }
        }
    }

    private final void G() {
        String s4;
        Object object0 = null;
        this.s(this.p().j);
        this.p();
        if(j.a(this.p().b, "HOME")) {
            this.f("ICON_WORLDCONGRESS");
            g.g(this, a.H("TXT_KEY_PEDIA_WORLD_CONGRESS_HOMEPAGE_BLURB", new Object[0]), 2);
            this.b(a.H("TXT_KEY_PEDIA_WORLD_CONGRESS_HOMEPAGE_LABEL1", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_WORLD_CONGRESS_HOMEPAGE_TEXT1", new Object[0])));
            return;
        }
        if(j.a(this.p().c, "1")) {
            for(Object object1: ((Iterable)this.n().f0)) {
                if(j.a(((Civ5Resolutions)object1).getType(), this.p().b)) {
                    object0 = object1;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(((Civ5Resolutions)object0) != null) {
                String s = ((Civ5Resolutions)object0).getHelp();
                if(s != null) {
                    this.f("ICON_WORLDCONGRESS");
                    this.b(a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]), G.p(s));
                }
            }
        }
        else {
            Object object2 = null;
            for(Object object3: ((Iterable)this.n().g0)) {
                if(j.a(((Civ5LeagueProjects)object3).getType(), this.p().b)) {
                    object2 = object3;
                    break;
                }
            }
            if(((Civ5LeagueProjects)object2) != null) {
                this.f("ICON_" + ((Civ5LeagueProjects)object2).getType());
                List list0 = x2.j.z(new String[]{"[ICON_TROPHY_BRONZE]", "[ICON_TROPHY_SILVER]", "[ICON_TROPHY_GOLD]"});
                Iterable iterable0 = x2.j.z(new String[]{((Civ5LeagueProjects)object2).getRewardTier3(), ((Civ5LeagueProjects)object2).getRewardTier2(), ((Civ5LeagueProjects)object2).getRewardTier1()});
                ArrayList arrayList0 = new ArrayList();
                int v = 0;
                for(Object object4: iterable0) {
                    if(v >= 0) {
                        String s1 = (String)object4;
                        if(s1 == null) {
                            s4 = null;
                        }
                        else {
                            for(Object object5: ((Iterable)this.n().h0)) {
                                if(!j.a(((Civ5LeagueProjectRewards)object5).getType(), s1)) {
                                    continue;
                                }
                                goto label_46;
                            }
                            object5 = null;
                        label_46:
                            if(((Civ5LeagueProjectRewards)object5) != null) {
                                Object object6 = list0.get(2 - v);
                                String s2 = ((Civ5LeagueProjectRewards)object5).getDescription();
                                j.c(s2);
                                String s3 = ((Civ5LeagueProjectRewards)object5).getHelp();
                                j.c(s3);
                                s4 = a.H("TXT_KEY_PEDIA_LEAGUE_PROJECT_REWARD", new Object[]{object6, s2, s3});
                            }
                        }
                        if(s4 != null) {
                            arrayList0.add(s4);
                        }
                        ++v;
                        continue;
                    }
                    x2.j.D();
                    throw null;
                }
                this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(i.Y(arrayList0, "[NEWLINE][NEWLINE]", null, null, null, 62)));
                String s5 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView0);
                o1.a.U(textView0, s5);
                Q1.b b0 = new Q1.b(linearLayout0, this.q());
                b0.h();
                Integer integer0 = ((Civ5LeagueProjects)object2).getCostPerPlayer();
                if(integer0 != null) {
                    int v1 = integer0.intValue();
                    if(v1 > 0) {
                        b0.a(a.H("TXT_KEY_PEDIA_COST_LABEL", new Object[0]));
                        b0.f(a.H("TXT_KEY_LEAGUE_PROJECT_COST_PER_PLAYER", new Object[]{String.valueOf(v1)}));
                        b0.h();
                    }
                }
                if(!b0.n()) {
                    this.j(linearLayout0);
                }
            }
        }
    }

    private final void H() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.B.h(q0.b);
        j.c(m0);
        o2.f f1 = this.m();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f1.z)) {
            if(j.a(((CivicPrereqs)object0).getCivic(), ((Civics)m0).getCivicType())) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            o2.f f2 = this.m();
            String s = ((CivicPrereqs)object1).getPrereqCivic();
            Civics civics0 = (Civics)f2.B.h(s);
            if(civics0 != null) {
                arrayList1.add(civics0);
            }
        }
        ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
        for(Object object2: arrayList1) {
            arrayList2.add(new k(f.h("ICON_", ((Civics)object2).getCivicType()), ((Civics)object2).getName(), ((Civics)object2).getCivicType(), null));
        }
        o2.f f3 = this.m();
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: ((Iterable)f3.z)) {
            if(j.a(((CivicPrereqs)object3).getPrereqCivic(), ((Civics)m0).getCivicType())) {
                arrayList3.add(object3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: arrayList3) {
            o2.f f4 = this.m();
            String s1 = ((CivicPrereqs)object4).getCivic();
            Civics civics1 = (Civics)f4.B.h(s1);
            if(civics1 != null) {
                arrayList4.add(civics1);
            }
        }
        ArrayList arrayList5 = new ArrayList(x2.k.E(arrayList4));
        for(Object object5: arrayList4) {
            arrayList5.add(new k(f.h("ICON_", ((Civics)object5).getCivicType()), ((Civics)object5).getName(), ((Civics)object5).getCivicType(), null));
        }
        o2.f f5 = this.m();
        ArrayList arrayList6 = new ArrayList();
        for(Object object6: ((Iterable)f5.h)) {
            if(j.a(((Boosts)object6).getCivicType(), ((Civics)m0).getCivicType())) {
                arrayList6.add(object6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        o2.f f6 = this.m();
        ArrayList arrayList8 = new ArrayList();
        for(Object object7: ((Iterable)f6.y)) {
            if(j.a(((CivicModifiers)object7).getCivicType(), ((Civics)m0).getCivicType())) {
                arrayList8.add(object7);
            }
        }
        int v = 0;
        int v1 = 0;
        for(Object object8: arrayList8) {
            CivicModifiers civicModifiers0 = (CivicModifiers)object8;
            Modifiers modifiers0 = (Modifiers)this.m().R0.h(civicModifiers0.getModifierId());
            if(modifiers0 != null) {
                DynamicModifiers dynamicModifiers0 = (DynamicModifiers)this.m().c0.h(modifiers0.getModifierType());
                String s2 = dynamicModifiers0 == null ? null : dynamicModifiers0.getEffectType();
                if(j.a(s2, "EFFECT_GRANT_INFLUENCE_TOKEN")) {
                    for(Object object9: ((List)this.m().P0)) {
                        ModifierArguments modifierArguments0 = (ModifierArguments)object9;
                        if(j.a(modifierArguments0.getModifierId(), civicModifiers0.getModifierId()) && j.a(modifierArguments0.getName(), "Amount")) {
                            Integer integer0 = n.L0(modifierArguments0.getValue());
                            if(integer0 != null) {
                                v1 = integer0.intValue() + v1;
                            }
                        }
                    }
                }
                else if(j.a(s2, "EFFECT_GRANT_SPY")) {
                    for(Object object10: ((List)this.m().P0)) {
                        ModifierArguments modifierArguments1 = (ModifierArguments)object10;
                        if(j.a(modifierArguments1.getModifierId(), civicModifiers0.getModifierId()) && j.a(modifierArguments1.getName(), "Amount")) {
                            Integer integer1 = n.L0(modifierArguments1.getValue());
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
        ArrayList arrayList9 = C.p(this.m(), ((Civics)m0).getCivicType(), null, 12);
        ArrayList arrayList10 = new ArrayList(x2.k.E(arrayList9));
        for(Object object11: arrayList9) {
            arrayList10.add(new k("ICON_" + ((List)object11).get(0), a.H(((String)((List)object11).get(1)), new Object[0]), ((String)((List)object11).get(2)), ((String)((List)object11).get(0))));
        }
        i.m0(arrayList10, new d(this, 0));
        this.f("ICON_" + ((Civics)m0).getCivicType());
        String s3 = ((Civics)m0).getDescription();
        if(s3 != null) {
            this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{s3}));
        }
        this.a();
        o2.f f7 = this.m();
        ArrayList arrayList11 = new ArrayList();
        for(Object object12: ((Iterable)f7.A)) {
            if(j.a(((CivicQuotes)object12).getCivicType(), ((Civics)m0).getCivicType())) {
                arrayList11.add(object12);
            }
        }
        for(Object object13: arrayList11) {
            g.g(this, ((CivicQuotes)object13).getQuote(), 4);
        }
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
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
        TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_UNLOCKS");
        Q1.b b1 = new Q1.b(linearLayout1, this.q());
        b1.h();
        if(!arrayList10.isEmpty()) {
            b1.d(arrayList10);
            b1.h();
        }
        if(!b1.n()) {
            this.j(linearLayout1);
        }
        LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView2 = (TextView)i3.e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView2);
        o1.a.U(textView2, "LOC_UI_PEDIA_REQUIREMENTS");
        Q1.b b2 = new Q1.b(linearLayout2, this.q());
        b2.h();
        o2.f f8 = this.m();
        String s4 = ((Civics)m0).getEraType();
        Eras eras0 = (Eras)f8.d0.h(s4);
        if(eras0 != null) {
            b2.f(eras0.getName());
            b2.h();
        }
        if(!arrayList2.isEmpty()) {
            b2.a("LOC_UI_PEDIA_REQUIRED_CIVICS");
            for(Object object15: arrayList2) {
                j.c(((k)object15).b);
                b2.b(((k)object15), ((k)object15).b);
            }
            b2.h();
        }
        Yields yields0 = (Yields)this.m().R1.h("YIELD_CULTURE");
        if(yields0 != null) {
            b2.a("LOC_UI_PEDIA_CULTURE_COST");
            b2.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{((Civics)m0).getCost(), yields0.getIconString(), yields0.getName()}));
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
        TextView textView3 = (TextView)i3.e.c(linearLayout3, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView3);
        o1.a.U(textView3, "LOC_UI_PEDIA_PROGRESSION");
        Q1.b b3 = new Q1.b(linearLayout3, this.q());
        b3.h();
        if(!arrayList5.isEmpty()) {
            b3.a("LOC_UI_PEDIA_LEADS_TO_CIVICS");
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

    private final void I() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.F.h(q0.b);
        j.c(m0);
        o2.f f1 = this.m();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f1.D)) {
            if(j.a(((CivilizationLeaders)object0).getCivilizationType(), ((Civilizations)m0).getCivilizationType())) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            o2.f f2 = this.m();
            String s = ((CivilizationLeaders)object1).getLeaderType();
            Leaders leaders0 = (Leaders)f2.O0.h(s);
            if(leaders0 != null) {
                arrayList1.add(leaders0);
            }
        }
        o2.f f3 = this.m();
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: ((Iterable)f3.E)) {
            if(j.a(((CivilizationTraits)object2).getCivilizationType(), ((Civilizations)m0).getCivilizationType())) {
                arrayList2.add(object2);
            }
        }
        ArrayList arrayList3 = new ArrayList(x2.k.E(arrayList2));
        for(Object object3: arrayList2) {
            arrayList3.add(((CivilizationTraits)object3).getTraitType());
        }
        HashSet hashSet0 = new HashSet(arrayList3);
        o2.f f4 = this.m();
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: ((List)f4.O1.i)) {
            if(((Units)object4).getTraitType() != null) {
                arrayList4.add(object4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for(Object object5: arrayList4) {
            String s1 = ((Units)object5).getTraitType();
            if(s1 != null) {
                arrayList5.add(s1);
            }
        }
        HashSet hashSet1 = new HashSet(arrayList5);
        ArrayList arrayList6 = new ArrayList();
        for(Object object6: arrayList4) {
            if(hashSet0.contains(((Units)object6).getTraitType())) {
                arrayList6.add(object6);
            }
        }
        ArrayList arrayList7 = new ArrayList(x2.k.E(arrayList6));
        for(Object object7: arrayList6) {
            arrayList7.add(new String[]{((Units)object7).getUnitType(), ((Units)object7).getName()});
        }
        o2.f f5 = this.m();
        ArrayList arrayList8 = new ArrayList();
        for(Object object8: ((List)f5.v.i)) {
            if(((Buildings)object8).getTraitType() != null) {
                arrayList8.add(object8);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for(Object object9: arrayList8) {
            String s2 = ((Buildings)object9).getTraitType();
            if(s2 != null) {
                arrayList9.add(s2);
            }
        }
        Set set0 = i.t0(hashSet1, arrayList9);
        ArrayList arrayList10 = new ArrayList();
        for(Object object10: arrayList8) {
            if(hashSet0.contains(((Buildings)object10).getTraitType())) {
                arrayList10.add(object10);
            }
        }
        ArrayList arrayList11 = new ArrayList(x2.k.E(arrayList10));
        for(Object object11: arrayList10) {
            arrayList11.add(new String[]{((Buildings)object11).getBuildingType(), ((Buildings)object11).getName()});
        }
        ArrayList arrayList12 = i.p0(arrayList11);
        o2.f f6 = this.m();
        ArrayList arrayList13 = new ArrayList();
        for(Object object12: ((List)f6.b0.i)) {
            if(((Districts)object12).getTraitType() != null) {
                arrayList13.add(object12);
            }
        }
        ArrayList arrayList14 = new ArrayList();
        for(Object object13: arrayList13) {
            String s3 = ((Districts)object13).getTraitType();
            if(s3 != null) {
                arrayList14.add(s3);
            }
        }
        Set set1 = i.t0(set0, arrayList14);
        ArrayList arrayList15 = new ArrayList();
        for(Object object14: arrayList13) {
            if(hashSet0.contains(((Districts)object14).getTraitType())) {
                arrayList15.add(object14);
            }
        }
        ArrayList arrayList16 = new ArrayList(x2.k.E(arrayList15));
        for(Object object15: arrayList15) {
            arrayList16.add(new String[]{((Districts)object15).getDistrictType(), ((Districts)object15).getName()});
        }
        arrayList12.addAll(arrayList16);
        o2.f f7 = this.m();
        ArrayList arrayList17 = new ArrayList();
        for(Object object16: ((List)f7.K0.i)) {
            if(((Improvements)object16).getTraitType() != null) {
                arrayList17.add(object16);
            }
        }
        ArrayList arrayList18 = new ArrayList();
        for(Object object17: arrayList17) {
            String s4 = ((Improvements)object17).getTraitType();
            if(s4 != null) {
                arrayList18.add(s4);
            }
        }
        Set set2 = i.t0(set1, arrayList18);
        ArrayList arrayList19 = new ArrayList();
        for(Object object18: arrayList17) {
            if(hashSet0.contains(((Improvements)object18).getTraitType())) {
                arrayList19.add(object18);
            }
        }
        ArrayList arrayList20 = new ArrayList(x2.k.E(arrayList19));
        for(Object object19: arrayList19) {
            arrayList20.add(new String[]{((Improvements)object19).getImprovementType(), ((Improvements)object19).getName()});
        }
        arrayList12.addAll(arrayList20);
        o2.f f8 = this.m();
        ArrayList arrayList21 = new ArrayList();
        for(Object object20: ((Iterable)f8.E)) {
            if(j.a(((CivilizationTraits)object20).getCivilizationType(), ((Civilizations)m0).getCivilizationType()) && !set2.contains(((CivilizationTraits)object20).getTraitType())) {
                arrayList21.add(object20);
            }
        }
        ArrayList arrayList22 = new ArrayList();
        for(Object object21: arrayList21) {
            Traits traits0 = (Traits)this.m().B1.h(((CivilizationTraits)object21).getTraitType());
            if(traits0 != null) {
                arrayList22.add(traits0);
            }
        }
        o2.f f9 = this.m();
        ArrayList arrayList23 = new ArrayList();
        for(Object object22: ((Iterable)f9.f0)) {
            if(j.a(((FavoredReligions)object22).getCivilizationType(), ((Civilizations)m0).getCivilizationType()) && ((FavoredReligions)object22).getLeaderType() == null) {
                arrayList23.add(object22);
            }
        }
        ArrayList arrayList24 = new ArrayList();
        for(Object object23: arrayList23) {
            o2.f f10 = this.m();
            String s5 = ((FavoredReligions)object23).getReligionType();
            Religions religions0 = (Religions)f10.e1.h(s5);
            if(religions0 != null) {
                arrayList24.add(religions0);
            }
        }
        Religions religions1 = (Religions)i.U(arrayList24);
        o2.f f11 = this.m();
        ArrayList arrayList25 = new ArrayList();
        for(Object object24: ((Iterable)f11.C)) {
            if(j.a(((CivilizationInfo)object24).getCivilizationType(), ((Civilizations)m0).getCivilizationType())) {
                arrayList25.add(object24);
            }
        }
        this.f("ICON_" + ((Civilizations)m0).getCivilizationType());
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        if(!arrayList1.isEmpty()) {
            b0.a("LOC_UI_PEDIA_LEADERS");
            for(Object object25: arrayList1) {
                b0.b(new k(f.h("ICON_", ((Leaders)object25).getLeaderType()), ((Leaders)object25).getName(), ((Leaders)object25).getLeaderType(), null), ((Leaders)object25).getName());
            }
            b0.h();
        }
        if(!arrayList7.isEmpty()) {
            b0.a("LOC_UI_PEDIA_SPECIAL_UNITS");
            for(Object object26: arrayList7) {
                b0.b(new k(f.h("ICON_", ((String[])object26)[0]), ((String[])object26)[1], ((String[])object26)[0], null), ((String[])object26)[1]);
            }
            b0.h();
        }
        if(!arrayList12.isEmpty()) {
            b0.a("LOC_UI_PEDIA_SPECIAL_INFRASTRUCTURE");
            for(Object object27: arrayList12) {
                b0.b(new k(f.h("ICON_", ((String[])object27)[0]), ((String[])object27)[1], ((String[])object27)[0], null), ((String[])object27)[1]);
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        if(religions1 != null) {
            LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
            TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
            j.c(textView1);
            o1.a.U(textView1, "LOC_UI_PEDIA_PREFERENCES");
            Q1.b b1 = new Q1.b(linearLayout1, this.q());
            b1.h();
            b1.a("LOC_UI_PEDIA_PREFERRED_RELIGION");
            b1.b(new k(f.h("ICON_", religions1.getReligionType()), religions1.getName(), religions1.getReligionType(), null), religions1.getName());
            b1.h();
            if(!b1.n()) {
                this.j(linearLayout1);
            }
        }
        LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView2 = (TextView)i3.e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView2);
        o1.a.U(textView2, "LOC_UI_PEDIA_GEOGRAPHY_AND_SOCIAL_DATA");
        Q1.b b2 = new Q1.b(linearLayout2, this.q());
        b2.h();
        for(Object object28: arrayList25) {
            b2.a(((CivilizationInfo)object28).getHeader());
            b2.f(((CivilizationInfo)object28).getCaption());
            b2.h();
        }
        if(!b2.n()) {
            this.j(linearLayout2);
        }
        if(!arrayList22.isEmpty()) {
            this.c("LOC_UI_PEDIA_UNIQUE_ABILITY");
            for(Object object29: arrayList22) {
                this.d(((Traits)object29).getName(), ((Traits)object29).getDescription());
            }
        }
        this.a();
    }

    private final void J() {
        String s18;
        Iterator iterator49;
        String s17;
        HashMap hashMap3;
        String s16;
        String s14;
        ArrayList arrayList43;
        String s11;
        ArrayList arrayList30;
        Iterator iterator31;
        Boolean boolean0;
        Iterator iterator23;
        HashMap hashMap1;
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.b0.h(q0.b);
        j.c(m0);
        Districts districts0 = (Districts)m0;
        Iterable iterable0 = this.m().u();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            if(j.a(((District_TradeRouteYields)object0).getDistrictType(), districts0.getDistrictType())) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(((int)((District_TradeRouteYields)object1).getYieldChangeAsOrigin()) != 0) {
                arrayList1.add(object1);
            }
        }
        ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
        for(Object object2: arrayList1) {
            arrayList2.add(new w2.e(((District_TradeRouteYields)object2).getYieldType(), ((int)((District_TradeRouteYields)object2).getYieldChangeAsOrigin())));
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: arrayList0) {
            if(((int)((District_TradeRouteYields)object3).getYieldChangeAsDomesticDestination()) != 0) {
                arrayList3.add(object3);
            }
        }
        ArrayList arrayList4 = new ArrayList(x2.k.E(arrayList3));
        for(Object object4: arrayList3) {
            arrayList4.add(new w2.e(((District_TradeRouteYields)object4).getYieldType(), ((int)((District_TradeRouteYields)object4).getYieldChangeAsDomesticDestination())));
        }
        ArrayList arrayList5 = new ArrayList();
        for(Object object5: arrayList0) {
            if(((int)((District_TradeRouteYields)object5).getYieldChangeAsInternationalDestination()) != 0) {
                arrayList5.add(object5);
            }
        }
        ArrayList arrayList6 = new ArrayList(x2.k.E(arrayList5));
        for(Object object6: arrayList5) {
            arrayList6.add(new w2.e(((District_TradeRouteYields)object6).getYieldType(), ((int)((District_TradeRouteYields)object6).getYieldChangeAsInternationalDestination())));
        }
        String s = this.U(arrayList2);
        String s1 = this.U(arrayList4);
        String s2 = this.U(arrayList6);
        Iterable iterable1 = this.m().t();
        ArrayList arrayList7 = new ArrayList();
        for(Object object7: iterable1) {
            if(j.a(((District_RequiredFeatures)object7).getDistrictType(), districts0.getDistrictType())) {
                arrayList7.add(object7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for(Object object8: arrayList7) {
            o2.f f1 = this.m();
            String s3 = ((District_RequiredFeatures)object8).getFeatureType();
            Features features0 = (Features)f1.j0.h(s3);
            if(features0 != null) {
                arrayList8.add(features0);
            }
        }
        ArrayList arrayList9 = new ArrayList(x2.k.E(arrayList8));
        for(Object object9: arrayList8) {
            arrayList9.add(new String[]{a.H(((Features)object9).getName(), new Object[0]), ((Features)object9).getFeatureType()});
        }
        ArrayList arrayList10 = i.p0(arrayList9);
        Iterable iterable2 = this.m().v();
        ArrayList arrayList11 = new ArrayList();
        for(Object object10: iterable2) {
            if(j.a(((District_ValidTerrains)object10).getDistrictType(), districts0.getDistrictType())) {
                arrayList11.add(object10);
            }
        }
        ArrayList arrayList12 = new ArrayList();
        for(Object object11: arrayList11) {
            o2.f f2 = this.m();
            String s4 = ((District_ValidTerrains)object11).getTerrainType();
            Terrains terrains0 = (Terrains)f2.z1.h(s4);
            if(terrains0 != null) {
                arrayList12.add(terrains0);
            }
        }
        ArrayList arrayList13 = new ArrayList(x2.k.E(arrayList12));
        for(Object object12: arrayList12) {
            arrayList13.add(new String[]{a.H(((Terrains)object12).getName(), new Object[0]), ((Terrains)object12).getTerrainType()});
        }
        arrayList10.addAll(arrayList13);
        o2.f f3 = this.m();
        ArrayList arrayList14 = new ArrayList();
        for(Object object13: ((List)f3.U.i)) {
            if(j.a(((DistrictReplaces)object13).getCivUniqueDistrictType(), districts0.getDistrictType())) {
                arrayList14.add(object13);
            }
        }
        ArrayList arrayList15 = new ArrayList();
        for(Object object14: arrayList14) {
            o2.f f4 = this.m();
            String s5 = ((DistrictReplaces)object14).getReplacesDistrictType();
            Districts districts1 = (Districts)f4.b0.h(s5);
            if(districts1 != null) {
                arrayList15.add(districts1);
            }
        }
        Districts districts2 = (Districts)i.U(arrayList15);
        o2.f f5 = this.m();
        ArrayList arrayList16 = new ArrayList();
        for(Object object15: ((List)f5.U.i)) {
            if(j.a(((DistrictReplaces)object15).getReplacesDistrictType(), districts0.getDistrictType())) {
                arrayList16.add(object15);
            }
        }
        ArrayList arrayList17 = new ArrayList();
        for(Object object16: arrayList16) {
            o2.f f6 = this.m();
            String s6 = ((DistrictReplaces)object16).getCivUniqueDistrictType();
            Districts districts3 = (Districts)f6.b0.h(s6);
            if(districts3 != null) {
                arrayList17.add(districts3);
            }
        }
        K k0 = this.m().p();
        ArrayList arrayList18 = new ArrayList();
        for(Object object17: k0) {
            if(j.a(((Civilizations)object17).getStartingCivilizationLevelType(), "CIVILIZATION_LEVEL_CITY_STATE")) {
                arrayList18.add(object17);
            }
        }
        ArrayList arrayList19 = new ArrayList(x2.k.E(arrayList18));
        for(Object object18: arrayList18) {
            arrayList19.add(((Civilizations)object18).getCivilizationType());
        }
        HashSet hashSet0 = new HashSet(arrayList19);
        HashMap hashMap0 = new HashMap();
        for(Object object19: this.m().n()) {
            CivilizationLeaders civilizationLeaders0 = (CivilizationLeaders)object19;
            if(hashSet0.contains(civilizationLeaders0.getCivilizationType())) {
                hashMap0.put(civilizationLeaders0.getLeaderType(), civilizationLeaders0.getCivilizationType());
            }
        }
        ArrayList arrayList20 = new ArrayList();
        String s7 = districts0.getTraitType();
        if(s7 != null) {
            Iterable iterable3 = this.m().z();
            ArrayList arrayList21 = new ArrayList();
            for(Object object20: iterable3) {
                if(j.a(((LeaderTraits)object20).getTraitType(), s7)) {
                    arrayList21.add(object20);
                }
            }
            ArrayList arrayList22 = new ArrayList();
            for(Object object21: arrayList21) {
                Leaders leaders0 = (Leaders)this.m().O0.h(((LeaderTraits)object21).getLeaderType());
                if(leaders0 != null) {
                    arrayList22.add(leaders0);
                }
            }
            Iterator iterator22 = arrayList22.iterator();
            while(iterator22.hasNext()) {
                Object object22 = iterator22.next();
                Leaders leaders1 = (Leaders)object22;
                String s8 = (String)hashMap0.get(leaders1.getLeaderType());
                if(s8 == null) {
                    hashMap1 = hashMap0;
                    iterator23 = iterator22;
                }
                else {
                    Civilizations civilizations0 = (Civilizations)this.m().p().h(s8);
                    if(civilizations0 == null) {
                        hashMap1 = hashMap0;
                        iterator23 = iterator22;
                        boolean0 = null;
                    }
                    else {
                        hashMap1 = hashMap0;
                        iterator23 = iterator22;
                        boolean0 = Boolean.valueOf(arrayList20.add(new k(f.h("ICON_", civilizations0.getCivilizationType()), civilizations0.getName(), civilizations0.getCivilizationType())));
                    }
                    if(boolean0 != null) {
                        goto label_206;
                    }
                }
                arrayList20.add(new k("ICON_" + leaders1.getLeaderType(), leaders1.getName(), leaders1.getLeaderType()));
            label_206:
                hashMap0 = hashMap1;
                iterator22 = iterator23;
            }
            Iterable iterable4 = this.m().o();
            ArrayList arrayList23 = new ArrayList();
            for(Object object23: iterable4) {
                if(j.a(((CivilizationTraits)object23).getTraitType(), s7)) {
                    arrayList23.add(object23);
                }
            }
            ArrayList arrayList24 = new ArrayList();
            for(Object object24: arrayList23) {
                Civilizations civilizations1 = (Civilizations)this.m().p().h(((CivilizationTraits)object24).getCivilizationType());
                if(civilizations1 != null) {
                    arrayList24.add(civilizations1);
                }
            }
            for(Object object25: arrayList24) {
                arrayList20.add(new k(f.h("ICON_", ((Civilizations)object25).getCivilizationType()), ((Civilizations)object25).getName(), ((Civilizations)object25).getCivilizationType()));
            }
        }
        HashSet hashSet1 = new HashSet(x2.j.x(new String[]{districts0.getDistrictType()}));
        o2.f f7 = this.m();
        ArrayList arrayList25 = new ArrayList();
        for(Object object26: f7.U) {
            if(j.a(((DistrictReplaces)object26).getCivUniqueDistrictType(), districts0.getDistrictType())) {
                arrayList25.add(object26);
            }
        }
        ArrayList arrayList26 = new ArrayList(x2.k.E(arrayList25));
        for(Object object27: arrayList25) {
            arrayList26.add(((DistrictReplaces)object27).getReplacesDistrictType());
        }
        Set set0 = i.t0(hashSet1, arrayList26);
        ArrayList arrayList27 = new ArrayList();
        K k1 = this.m().m();
        ArrayList arrayList28 = new ArrayList();
        for(Object object28: k1) {
            Buildings buildings0 = (Buildings)object28;
            if(!buildings0.getInternalOnly() && buildings0.getPrereqDistrict() != null && set0.contains(buildings0.getPrereqDistrict())) {
                arrayList28.add(object28);
            }
        }
        Iterator iterator30 = arrayList28.iterator();
        while(iterator30.hasNext()) {
            Object object29 = iterator30.next();
            Buildings buildings1 = (Buildings)object29;
            if(arrayList20.isEmpty() || buildings1.getTraitType() == null) {
                iterator31 = iterator30;
                s11 = s2;
                arrayList30 = arrayList10;
                arrayList27.add(new k(f.h("ICON_", buildings1.getBuildingType()), buildings1.getName(), buildings1.getBuildingType()));
            }
            else {
                String s9 = buildings1.getTraitType();
                Iterable iterable5 = this.m().z();
                iterator31 = iterator30;
                ArrayList arrayList29 = new ArrayList();
                for(Object object30: iterable5) {
                    if(j.a(((LeaderTraits)object30).getTraitType(), s9)) {
                        arrayList29.add(object30);
                    }
                }
                arrayList30 = arrayList10;
                ArrayList arrayList31 = new ArrayList();
                for(Object object31: arrayList29) {
                    Leaders leaders2 = (Leaders)this.m().O0.h(((LeaderTraits)object31).getLeaderType());
                    String s10 = leaders2 == null ? null : leaders2.getLeaderType();
                    if(s10 != null) {
                        arrayList31.add(s10);
                    }
                }
                HashSet hashSet2 = new HashSet(arrayList31);
                Iterable iterable6 = this.m().o();
                ArrayList arrayList32 = new ArrayList();
                for(Object object32: iterable6) {
                    if(j.a(((CivilizationTraits)object32).getTraitType(), s9)) {
                        arrayList32.add(object32);
                    }
                }
                s11 = s2;
                ArrayList arrayList33 = new ArrayList();
                for(Object object33: arrayList32) {
                    Civilizations civilizations2 = (Civilizations)this.m().p().h(((CivilizationTraits)object33).getCivilizationType());
                    String s12 = civilizations2 == null ? null : civilizations2.getCivilizationType();
                    if(s12 != null) {
                        arrayList33.add(s12);
                    }
                }
                Set set1 = i.t0(hashSet2, arrayList33);
                for(Object object34: arrayList20) {
                    j.c(((k)object34).c);
                    if(set1.contains(((k)object34).c)) {
                        arrayList27.add(new k("ICON_" + buildings1.getBuildingType(), buildings1.getName(), buildings1.getBuildingType()));
                    }
                }
            }
            iterator30 = iterator31;
            arrayList10 = arrayList30;
            s2 = s11;
        }
        x2.n.G(arrayList27, new C1.a(4));
        K k2 = this.m().I();
        ArrayList arrayList34 = new ArrayList();
        for(Object object35: k2) {
            if(((Units)object35).getPrereqDistrict() != null && set0.contains(((Units)object35).getPrereqDistrict())) {
                arrayList34.add(object35);
            }
        }
        ArrayList arrayList35 = new ArrayList(x2.k.E(arrayList34));
        for(Object object36: arrayList34) {
            arrayList35.add(new k(f.h("ICON_", ((Units)object36).getUnitType()), ((Units)object36).getName(), ((Units)object36).getUnitType()));
        }
        ArrayList arrayList36 = i.p0(arrayList35);
        x2.n.G(arrayList36, new C1.a(5));
        Iterable iterable7 = this.m().q();
        ArrayList arrayList37 = new ArrayList();
        for(Object object37: iterable7) {
            if(j.a(((District_Adjacencies)object37).getDistrictType(), districts0.getDistrictType())) {
                arrayList37.add(object37);
            }
        }
        ArrayList arrayList38 = new ArrayList(x2.k.E(arrayList37));
        for(Object object38: arrayList37) {
            arrayList38.add(((District_Adjacencies)object38).getYieldChangeId());
        }
        HashSet hashSet3 = new HashSet(arrayList38);
        ArrayList arrayList39 = new ArrayList();
        o2.f f8 = this.m();
        ArrayList arrayList40 = new ArrayList();
        for(Object object39: f8.b) {
            if(hashSet3.contains(((Adjacency_YieldChanges)object39).getID())) {
                arrayList40.add(object39);
            }
        }
        for(Object object40: arrayList40) {
            String s13 = C.z(this.m(), ((Adjacency_YieldChanges)object40));
            if(s13 != null) {
                arrayList39.add(s13);
            }
        }
        Iterable iterable8 = this.m().r();
        ArrayList arrayList41 = new ArrayList();
        for(Object object41: iterable8) {
            if(j.a(((District_CitizenYieldChanges)object41).getDistrictType(), districts0.getDistrictType())) {
                arrayList41.add(object41);
            }
        }
        ArrayList arrayList42 = new ArrayList();
        for(Object object42: arrayList41) {
            District_CitizenYieldChanges district_CitizenYieldChanges0 = (District_CitizenYieldChanges)object42;
            Yields yields0 = (Yields)this.m().K().h(district_CitizenYieldChanges0.getYieldType());
            if(yields0 == null) {
                arrayList43 = arrayList27;
                s14 = s1;
            }
            else {
                arrayList43 = arrayList27;
                s14 = s1;
                String s15 = "[ICON_Bullet] " + a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{district_CitizenYieldChanges0.getYieldChange(), yields0.getIconString(), yields0.getName()});
                if(s15 != null) {
                    s16 = s15;
                    goto label_389;
                }
            }
            s16 = null;
        label_389:
            if(s16 != null) {
                arrayList42.add(s16);
            }
            arrayList27 = arrayList43;
            s1 = s14;
        }
        HashMap hashMap2 = new HashMap();
        Iterable iterable9 = this.m().s();
        ArrayList arrayList44 = new ArrayList();
        for(Object object43: iterable9) {
            if(j.a(((District_GreatPersonPoints)object43).getDistrictType(), districts0.getDistrictType())) {
                arrayList44.add(object43);
            }
        }
        for(Object object44: arrayList44) {
            Integer integer0 = (Integer)hashMap2.get(((District_GreatPersonPoints)object44).getGreatPersonClassType());
            if(integer0 == null) {
                integer0 = 0;
            }
            hashMap2.put(((District_GreatPersonPoints)object44).getGreatPersonClassType(), ((int)(((District_GreatPersonPoints)object44).getPointsPerTurn() + integer0.intValue())));
        }
        ArrayList arrayList45 = new ArrayList();
        o2.f f9 = this.m();
        ArrayList arrayList46 = new ArrayList();
        for(Object object45: f9.t0) {
            GreatPersonClasses greatPersonClasses0 = (GreatPersonClasses)object45;
            Integer integer1 = (Integer)hashMap2.get(greatPersonClasses0.getGreatPersonClassType());
            if(integer1 == null) {
                hashMap3 = hashMap2;
                s17 = null;
            }
            else {
                hashMap3 = hashMap2;
                s17 = a.H("LOC_TYPE_TRAIT_GREAT_PERSON_POINTS", new Object[]{integer1, greatPersonClasses0.getIconString(), greatPersonClasses0.getName()});
            }
            if(s17 != null) {
                arrayList46.add(s17);
            }
            hashMap2 = hashMap3;
        }
        arrayList45.addAll(arrayList46);
        if(j.a(districts0.getDistrictType(), "DISTRICT_MBANZA")) {
            Iterator iterator48 = this.m().A().iterator();
            while(iterator48.hasNext()) {
                Object object46 = iterator48.next();
                ModifierArguments modifierArguments0 = (ModifierArguments)object46;
                if(!j.a(modifierArguments0.getModifierId(), "MBANZA_FOOD") || !j.a(modifierArguments0.getName(), "Amount")) {
                    iterator49 = iterator48;
                    s18 = s;
                    if(j.a(modifierArguments0.getModifierId(), "MBANZA_GOLD") && j.a(modifierArguments0.getName(), "Amount")) {
                        Yields yields2 = (Yields)this.m().K().h("YIELD_GOLD");
                        if(yields2 != null) {
                            arrayList45.add(a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{modifierArguments0.getValue(), yields2.getIconString(), yields2.getName()}));
                        }
                    }
                }
                else {
                    Yields yields1 = (Yields)this.m().K().h("YIELD_FOOD");
                    if(yields1 == null) {
                        iterator49 = iterator48;
                        s18 = s;
                    }
                    else {
                        iterator49 = iterator48;
                        s18 = s;
                        arrayList45.add(a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{modifierArguments0.getValue(), yields1.getIconString(), yields1.getName()}));
                    }
                }
                iterator48 = iterator49;
                s = s18;
            }
        }
        if(districts0.getHousing() != 0) {
            arrayList45.add(a.H("LOC_TYPE_TRAIT_HOUSING", new Object[]{districts0.getHousing()}));
        }
        if(districts0.getEntertainment() != 0) {
            arrayList45.add(a.H("LOC_TYPE_TRAIT_AMENITY_ENTERTAINMENT", new Object[]{districts0.getEntertainment()}));
        }
        if(districts0.getCitizenSlots() != null) {
            Integer integer2 = districts0.getCitizenSlots();
            if(integer2 == null || ((int)integer2) != 0) {
                arrayList45.add(a.H("LOC_TYPE_TRAIT_CITIZENS", new Object[]{districts0.getCitizenSlots()}));
            }
        }
        if(districts0.getAirSlots() != 0) {
            arrayList45.add(a.H("LOC_TYPE_TRAIT_AIRSLOTS", new Object[]{districts0.getAirSlots()}));
        }
        if(districts0.getAppeal() != 0) {
            arrayList45.add(a.H("LOC_TYPE_TRAIT_APPEAL", new Object[]{districts0.getAppeal()}));
        }
        this.f("ICON_" + districts0.getDistrictType());
        String s19 = districts0.getDescription();
        if(s19 != null) {
            this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{s19}));
        }
        this.a();
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        if(!arrayList20.isEmpty()) {
            b0.a("LOC_UI_PEDIA_UNIQUE_TO");
            for(Object object47: arrayList20) {
                String s20 = ((k)object47).a();
                j.c(s20);
                b0.b(((k)object47), s20);
            }
            b0.h();
        }
        if(districts2 != null) {
            b0.a("LOC_UI_PEDIA_REPLACES");
            b0.b(new k(f.h("ICON_", districts2.getDistrictType()), districts2.getName(), districts2.getDistrictType()), districts2.getName());
        }
        if(!arrayList17.isEmpty()) {
            b0.a("LOC_UI_PEDIA_REPLACED_BY");
            for(Object object48: arrayList17) {
                b0.b(new k(f.h("ICON_", ((Districts)object48).getDistrictType()), ((Districts)object48).getName(), ((Districts)object48).getDistrictType()), ((Districts)object48).getName());
            }
        }
        if(districts2 != null || !arrayList17.isEmpty()) {
            b0.h();
        }
        if(!arrayList45.isEmpty()) {
            for(Object object49: arrayList45) {
                j.c(((String)object49));
                b0.f(((String)object49));
            }
            b0.h();
        }
        if(!arrayList39.isEmpty()) {
            b0.a("LOC_UI_PEDIA_ADJACENCY_BONUS");
            for(Object object50: arrayList39) {
                b0.f(((String)object50));
            }
            b0.h();
        }
        if(!arrayList42.isEmpty()) {
            b0.a("LOC_UI_PEDIA_CITIZEN_YIELDS");
            for(Object object51: arrayList42) {
                b0.f(((String)object51));
            }
            b0.h();
        }
        if(s != null || s1 != null || s2 != null) {
            b0.a("LOC_UI_PEDIA_TRADE_YIELDS");
            if(s != null) {
                b0.f("LOC_UI_PEDIA_TRADE_ORIGIN");
                b0.f(s);
            }
            if(s1 != null) {
                b0.f("LOC_UI_PEDIA_TRADE_DOMESTIC_DESTINATION");
                b0.f(s1);
            }
            if(s2 != null) {
                b0.f("LOC_UI_PEDIA_TRADE_INTERNATIONAL_DESTINATION");
                b0.f(s2);
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
        Q1.b b1 = new Q1.b(linearLayout1, this.q());
        b1.h();
        if(districts0.getPrereqTech() != null || districts0.getPrereqCivic() != null) {
            String s21 = districts0.getPrereqCivic();
            if(s21 != null) {
                Civics civics0 = (Civics)this.m().B.h(s21);
                if(civics0 != null) {
                    b1.a("LOC_CIVIC_NAME");
                    b1.b(new k(f.h("ICON_", civics0.getCivicType()), civics0.getName(), civics0.getCivicType()), civics0.getName());
                }
            }
            String s22 = districts0.getPrereqTech();
            if(s22 != null) {
                Technologies technologies0 = (Technologies)this.m().t1.h(s22);
                if(technologies0 != null) {
                    b1.a("LOC_TECHNOLOGY_NAME");
                    b1.b(new k(f.h("ICON_", technologies0.getTechnologyType()), technologies0.getName(), technologies0.getTechnologyType()), technologies0.getName());
                }
            }
            b1.h();
        }
        if(districts0.getCoast() || districts0.getAqueduct() || districts0.getNoAdjacentCity() || !arrayList10.isEmpty()) {
            b1.a("LOC_UI_PEDIA_PLACEMENT");
            if(districts0.getCoast()) {
                b1.f("[ICON_Bullet] " + a.H("LOC_UI_PEDIA_PLACEMENT_ADJ_TO_COAST", new Object[0]));
            }
            if(districts0.getAqueduct()) {
                b1.f("LOC_UI_PEDIA_PLACEMENT_ADJ_TO_CITY");
            }
            if(districts0.getNoAdjacentCity()) {
                b1.f("[ICON_Bullet] " + a.H("LOC_UI_PEDIA_PLACEMENT_NOT_ADJ_TO_CITY", new Object[0]));
            }
            for(Object object52: arrayList10) {
                b1.b(new k(f.h("ICON_", ((String[])object52)[1]), ((String[])object52)[0], ((String[])object52)[1]), ((String[])object52)[0]);
            }
            b1.h();
        }
        Yields yields3 = (Yields)this.m().K().h("YIELD_PRODUCTION");
        if(yields3 != null) {
            b1.a("LOC_UI_PEDIA_PRODUCTION_COST");
            b1.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{districts0.getCost(), yields3.getIconString(), yields3.getName()}));
            b1.h();
        }
        if(districts0.getMaintenance() != 0) {
            Yields yields4 = (Yields)this.m().K().h("YIELD_GOLD");
            if(yields4 != null) {
                b1.a("LOC_UI_PEDIA_MAITENANCE_COST");
                b1.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{districts0.getMaintenance(), yields4.getIconString(), yields4.getName()}));
            }
        }
        if(!b1.n()) {
            this.j(linearLayout1);
        }
        LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView2 = (TextView)i3.e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView2);
        o1.a.U(textView2, "LOC_UI_PEDIA_USAGE");
        Q1.b b2 = new Q1.b(linearLayout2, this.q());
        b2.h();
        if(!arrayList27.isEmpty()) {
            b2.a("LOC_UI_PEDIA_USAGE_UNLOCKS_BUILDINGS");
            for(Object object53: arrayList27) {
                String s23 = ((k)object53).a();
                j.c(s23);
                b2.b(((k)object53), s23);
            }
            b2.h();
        }
        if(!arrayList36.isEmpty()) {
            b2.a("LOC_UI_PEDIA_USAGE_UNLOCKS_UNITS");
            for(Object object54: arrayList36) {
                String s24 = ((k)object54).a();
                j.c(s24);
                b2.b(((k)object54), s24);
            }
            b2.h();
        }
        if(!b2.n()) {
            this.j(linearLayout2);
        }
    }

    private final void K() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.j0.h(q0.b);
        j.c(m0);
        String s = ((Features)m0).getFeatureType();
        Features_XP2 features_XP20 = (Features_XP2)this.m().k0.h(s);
        HashMap hashMap0 = new HashMap();
        for(Object object0: ((List)this.m().i0)) {
            Feature_YieldChanges feature_YieldChanges0 = (Feature_YieldChanges)object0;
            if(j.a(feature_YieldChanges0.getFeatureType(), s)) {
                String s1 = feature_YieldChanges0.getYieldType();
                Integer integer0 = (Integer)hashMap0.get(feature_YieldChanges0.getYieldType());
                if(integer0 == null) {
                    integer0 = 0;
                }
                hashMap0.put(s1, ((int)(feature_YieldChanges0.getYieldChange() + ((int)integer0))));
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
        for(Object object2: ((List)this.m().l1)) {
            Resource_ValidFeatures resource_ValidFeatures0 = (Resource_ValidFeatures)object2;
            if(j.a(resource_ValidFeatures0.getFeatureType(), s)) {
                Resources resources0 = (Resources)this.m().o1.h(resource_ValidFeatures0.getResourceType());
                if(resources0 != null) {
                    arrayList1.add(new w2.e(a.H(resources0.getName(), new Object[0]), resources0.getResourceType()));
                }
            }
        }
        x2.n.G(arrayList1, new C1.a(6));
        ArrayList arrayList2 = new ArrayList();
        if(((Features)m0).getImpassable()) {
            arrayList2.add(a.H("LOC_UI_PEDIA_TERRAIN_IMPASSABLE", new Object[0]));
        }
        if(features_XP20 != null && features_XP20.getVolcano()) {
            arrayList2.add(a.H("LOC_UI_PEDIA_MAY_ERUPT", new Object[0]));
        }
        if(((Features)m0).getMovementChange() > 0) {
            arrayList2.add(a.H("LOC_UI_PEDIA_MOVEMENT_CHANGE", new Object[]{((Features)m0).getMovementChange()}));
        }
        if(((Features)m0).getDefenseModifier() != 0) {
            arrayList2.add(a.H("LOC_TOOLTIP_DEFENSE_MODIFIER", new Object[]{((Features)m0).getDefenseModifier()}));
        }
        if(((Features)m0).getAppeal() != 0) {
            arrayList2.add(a.H("LOC_TYPE_TRAIT_APPEAL", new Object[]{((Features)m0).getAppeal()}));
        }
        for(Object object3: ((List)this.m().d1)) {
            RandomEvent_Yields randomEvent_Yields0 = (RandomEvent_Yields)object3;
            if(j.a(randomEvent_Yields0.getFeatureType(), s)) {
                Features features0 = (Features)this.m().j0.h("FEATURE_ICE");
                if(!j.a(randomEvent_Yields0.getFeatureType(), (features0 == null ? null : features0.getFeatureType()))) {
                    arrayList2.add(a.H("LOC_UI_PEDIA_ADDITIONAL_FERTILITY", new Object[0]));
                    break;
                }
                if(false) {
                    break;
                }
            }
        }
        x2.n.G(arrayList2, new C1.a(7));
        this.f("ICON_" + s);
        String s2 = ((Features)m0).getDescription();
        if(s2 != null) {
            this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{s2}));
        }
        this.a();
        String s3 = ((Features)m0).getQuote();
        if(s3 != null) {
            g.g(this, s3, 4);
        }
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        if(!arrayList2.isEmpty()) {
            for(Object object4: arrayList2) {
                b0.f("[ICON_Bullet] " + ((String)object4));
            }
            b0.h();
        }
        if(!arrayList0.isEmpty()) {
            for(Object object5: arrayList0) {
                b0.f(a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{((w2.i)object5).i, ((w2.i)object5).j, ((w2.i)object5).k}));
            }
            b0.h();
        }
        if(!arrayList1.isEmpty()) {
            b0.a("LOC_UI_PEDIA_VALID_RESOURCES");
            for(Object object6: arrayList1) {
                b0.b(new k(f.h("ICON_", ((String)((w2.e)object6).j)), ((String)((w2.e)object6).i), ((String)((w2.e)object6).j), null), ((String)((w2.e)object6).i));
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
    }

    private final void L() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.n0.h(q0.b);
        j.c(m0);
        o2.f f1 = this.m();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f1.X0)) {
            if(j.a(((Policy_GovernmentExclusives_XP2)object0).getGovernmentType(), ((Governments)m0).getGovernmentType())) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            String s = ((Policy_GovernmentExclusives_XP2)object1).getPolicyType();
            if(s != null) {
                arrayList1.add(s);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: ((List)this.m().o0.i)) {
            Governments_XP2 governments_XP20 = (Governments_XP2)object2;
            if(j.a(governments_XP20.getGovernmentType(), ((Governments)m0).getGovernmentType()) && governments_XP20.getFavor() > 0) {
                arrayList2.add(a.H("LOC_UI_PEDIA_TRAIT_FAVOR", new Object[]{governments_XP20.getFavor()}));
            }
        }
        for(Object object3: ((List)this.m().n0.i)) {
            Governments governments0 = (Governments)object3;
            if(j.a(governments0.getGovernmentType(), ((Governments)m0).getGovernmentType()) && governments0.getOtherGovernmentIntolerance() != 0) {
                arrayList2.add(a.H("LOC_UI_PEDIA_TRAIT_INTOLERANCE", new Object[]{governments0.getOtherGovernmentIntolerance()}));
            }
        }
        for(Object object4: ((List)this.m().m0)) {
            Government_SlotCounts government_SlotCounts0 = (Government_SlotCounts)object4;
            if(j.a(government_SlotCounts0.getGovernmentType(), ((Governments)m0).getGovernmentType())) {
                GovernmentSlots governmentSlots0 = (GovernmentSlots)this.m().l0.h(government_SlotCounts0.getGovernmentSlotType());
                if(governmentSlots0 != null) {
                    String s1 = governmentSlots0.getName();
                    if(s1 != null) {
                        arrayList2.add(a.H("LOC_UI_PEDIA_TRAIT_SLOT_TYPE", new Object[]{government_SlotCounts0.getNumSlots(), s1}));
                    }
                }
            }
        }
        if(((Governments)m0).getInherentBonusDesc().length() != 0 && ((Governments)m0).getAccumulatedBonusShortDesc().length() != 0) {
            this.c("LOC_UI_PEDIA_DESCRIPTION");
            this.d("LOC_GOVERNMENT_INHERENT_BONUS", ((Governments)m0).getInherentBonusDesc());
            this.d("LOC_GOVERNMENT_ACCUMULATED_BONUS", ((Governments)m0).getAccumulatedBonusShortDesc());
        }
        this.a();
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        for(Object object5: arrayList2) {
            j.c(((String)object5));
            b0.f(((String)object5));
        }
        b0.h();
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
        Q1.b b1 = new Q1.b(linearLayout1, this.q());
        String s2 = ((Governments)m0).getPrereqCivic();
        if(s2 != null) {
            Civics civics0 = (Civics)this.m().B.h(s2);
            if(civics0 != null) {
                b1.a("LOC_CIVIC_NAME");
                b1.b(new k(f.h("ICON_", civics0.getCivicType()), civics0.getName(), civics0.getCivicType(), null), civics0.getName());
                b1.h();
            }
        }
        if(!arrayList1.isEmpty()) {
            b1.a("LOC_UI_PEDIA_MADE_EXCLUSIVE_GOVENMENT");
            for(Object object6: arrayList1) {
                Policies policies0 = (Policies)this.m().V0.h(((String)object6));
                if(policies0 != null) {
                    b1.b(new k(f.h("ICON_", policies0.getPolicyType()), policies0.getName(), policies0.getPolicyType(), null), policies0.getName());
                }
            }
            b1.h();
        }
        if(!b1.n()) {
            this.j(linearLayout1);
        }
    }

    private final void M() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.s0.h(q0.b);
        j.c(m0);
        o2.f f1 = this.m();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f1.q0)) {
            if(j.a(((GovernorPromotionSets)object0).getGovernorType(), ((Governors)m0).getGovernorType())) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            o2.f f2 = this.m();
            String s = ((GovernorPromotionSets)object1).getGovernorPromotion();
            GovernorPromotions governorPromotions0 = (GovernorPromotions)f2.r0.h(s);
            String s1 = governorPromotions0 == null ? null : governorPromotions0.getName();
            if(s1 != null) {
                arrayList1.add(s1);
            }
        }
        ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
        for(Object object2: arrayList1) {
            arrayList2.add(a.H(((String)object2), new Object[0]));
        }
        ArrayList arrayList3 = i.p0(arrayList2);
        x2.n.G(arrayList3, new C1.a(7));
        this.h(((Governors)m0).getPortraitImage());
        this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{((Governors)m0).getDescription()}));
        this.a();
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        if(!arrayList3.isEmpty()) {
            b0.a("LOC_UI_PEDIA_TITLES");
            for(Object object3: arrayList3) {
                b0.f("[ICON_BULLET]" + ((String)object3));
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
    }

    private final void N() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.r0.h(q0.b);
        j.c(m0);
        o2.f f1 = this.m();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f1.p0)) {
            if(j.a(((GovernorPromotionPrereqs)object0).getGovernorPromotionType(), ((GovernorPromotions)m0).getGovernorPromotionType())) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        Iterator iterator1 = arrayList0.iterator();
        while(true) {
            String s = null;
            if(!iterator1.hasNext()) {
                break;
            }
            Object object1 = iterator1.next();
            o2.f f2 = this.m();
            String s1 = ((GovernorPromotionPrereqs)object1).getPrereqGovernorPromotion();
            GovernorPromotions governorPromotions0 = (GovernorPromotions)f2.r0.h(s1);
            if(governorPromotions0 != null) {
                s = governorPromotions0.getName();
            }
            if(s != null) {
                arrayList1.add(s);
            }
        }
        o2.f f3 = this.m();
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: ((Iterable)f3.p0)) {
            if(j.a(((GovernorPromotionPrereqs)object2).getPrereqGovernorPromotion(), ((GovernorPromotions)m0).getGovernorPromotionType())) {
                arrayList2.add(object2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: arrayList2) {
            o2.f f4 = this.m();
            String s2 = ((GovernorPromotionPrereqs)object3).getGovernorPromotionType();
            GovernorPromotions governorPromotions1 = (GovernorPromotions)f4.r0.h(s2);
            String s3 = governorPromotions1 == null ? null : governorPromotions1.getName();
            if(s3 != null) {
                arrayList3.add(s3);
            }
        }
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        if(((GovernorPromotions)m0).getLevel() < 1) {
            b0.f(a.H("LOC_UI_PEDIA_PROMOTION_BASE", new Object[0]));
        }
        else {
            b0.f(a.H("LOC_UI_PEDIA_PROMOTION_LEVEL", new Object[]{((GovernorPromotions)m0).getLevel()}));
        }
        b0.h();
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
        Q1.b b1 = new Q1.b(linearLayout1, this.q());
        b1.h();
        if(!arrayList1.isEmpty()) {
            for(Object object4: arrayList1) {
                b1.f("[ICON_Bullet] " + a.H(((String)object4), new Object[0]));
            }
            b1.h();
        }
        if(!b1.n()) {
            this.j(linearLayout1);
        }
        LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView2 = (TextView)i3.e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView2);
        o1.a.U(textView2, "LOC_UI_PEDIA_PROGRESSION");
        Q1.b b2 = new Q1.b(linearLayout2, this.q());
        b2.h();
        if(!arrayList3.isEmpty()) {
            b2.a("LOC_UI_PEDIA_LEADS_TO_GOVERNOR_PROMOTIONS");
            for(Object object5: arrayList3) {
                b2.f("[ICON_Bullet] " + a.H(((String)object5), new Object[0]));
            }
            b2.h();
        }
        if(!b2.n()) {
            this.j(linearLayout2);
        }
        this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{((GovernorPromotions)m0).getDescription()}));
        this.a();
    }

    private final void O() {
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.w0.h(q0.b);
        j.c(m0);
        String s = ((GreatPersonIndividuals)m0).getGreatPersonIndividualType();
        GreatPersonClasses greatPersonClasses0 = (GreatPersonClasses)this.m().t0.h(((GreatPersonIndividuals)m0).getGreatPersonClassType());
        m m1 = greatPersonClasses0 == null ? null : this.m().O1.h(greatPersonClasses0.getUnitType());
        o2.f f1 = this.m();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f1.u0)) {
            if(j.a(((GreatPersonIndividualActionModifiers)object0).getGreatPersonIndividualType(), s)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            String s1 = a0.y(this.m(), ((GreatPersonIndividualActionModifiers)object1).getModifierId());
            if(s1 != null) {
                arrayList1.add(s1);
            }
        }
        o2.f f2 = this.m();
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: ((Iterable)f2.v0)) {
            if(j.a(((GreatPersonIndividualBirthModifiers)object2).getGreatPersonIndividualType(), s)) {
                arrayList2.add(object2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object3: arrayList2) {
            String s2 = a0.y(this.m(), ((GreatPersonIndividualBirthModifiers)object3).getModifierId());
            if(s2 != null) {
                arrayList3.add(s2);
            }
        }
        o2.f f3 = this.m();
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: ((List)f3.x0.i)) {
            if(j.a(((GreatWorks)object4).getGreatPersonIndividualType(), s)) {
                arrayList4.add(object4);
            }
        }
        o2.f f4 = this.m();
        ArrayList arrayList5 = new ArrayList();
        for(Object object5: ((Iterable)f4.u0)) {
            if(j.a(((GreatPersonIndividualActionModifiers)object5).getGreatPersonIndividualType(), s)) {
                arrayList5.add(object5);
            }
        }
        ArrayList arrayList6 = new ArrayList(x2.k.E(arrayList5));
        for(Object object6: arrayList5) {
            arrayList6.add(((GreatPersonIndividualActionModifiers)object6).getModifierId());
        }
        HashSet hashSet0 = new HashSet(arrayList6);
        ArrayList arrayList7 = new ArrayList();
        for(Object object7: ((List)this.m().R0.i)) {
            Modifiers modifiers0 = (Modifiers)object7;
            if(hashSet0.contains(modifiers0.getModifierId())) {
                DynamicModifiers dynamicModifiers0 = (DynamicModifiers)this.m().c0.h(modifiers0.getModifierType());
                if(j.a((dynamicModifiers0 == null ? null : dynamicModifiers0.getEffectType()), "EFFECT_GRANT_FREE_RESOURCE_IN_CITY")) {
                    for(Object object8: ((List)this.m().P0)) {
                        ModifierArguments modifierArguments0 = (ModifierArguments)object8;
                        if(j.a(modifierArguments0.getModifierId(), modifiers0.getModifierId())) {
                            Resources resources0 = (Resources)this.m().o1.h(modifierArguments0.getValue());
                            if(resources0 != null) {
                                arrayList7.add(new k(f.h("ICON_", resources0.getResourceType()), resources0.getName(), resources0.getResourceType(), null));
                            }
                        }
                    }
                }
            }
        }
        if(((Units)m1) != null) {
            this.f("ICON_" + ((Units)m1).getUnitType());
        }
        this.a();
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        if(greatPersonClasses0 != null && greatPersonClasses0.getAvailableInTimeline()) {
            o2.f f5 = this.m();
            String s3 = ((GreatPersonIndividuals)m0).getEraType();
            Eras eras0 = (Eras)f5.d0.h(s3);
            if(eras0 != null) {
                b0.f(eras0.getName());
            }
        }
        if(greatPersonClasses0 != null) {
            b0.f(greatPersonClasses0.getName());
        }
        b0.h();
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_USAGE");
        Q1.b b1 = new Q1.b(linearLayout1, this.q());
        b1.h();
        if(!arrayList7.isEmpty()) {
            b1.a("LOC_UI_PEDIA_CREATES");
            for(Object object9: arrayList7) {
                j.c(((k)object9));
                j.c(((k)object9).b);
                b1.b(((k)object9), ((k)object9).b);
            }
            b1.h();
        }
        if(!b1.n()) {
            this.j(linearLayout1);
        }
        if(!arrayList4.isEmpty()) {
            this.c("LOC_UI_PEDIA_GREAT_WORKS");
            ArrayList arrayList8 = new ArrayList(x2.k.E(arrayList4));
            for(Object object10: arrayList4) {
                arrayList8.add("[ICON_Bullet] " + a.H(((GreatWorks)object10).getName(), new Object[0]));
            }
            this.e(x2.j.x(new String[]{i.Y(arrayList8, "[NEWLINE]", null, null, null, 62)}));
            this.e(x2.j.x(new String[]{"LOC_GREATPERSON_ACTION_USAGE_CREATE_GREAT_WORK"}));
        }
        boolean z = j.a(((GreatPersonIndividuals)m0).getGreatPersonClassType(), "GREAT_PERSON_CLASS_PROPHET");
        boolean z1 = ((GreatPersonIndividuals)m0).getActionCharges() > 0 && (!arrayList1.isEmpty() || ((GreatPersonIndividuals)m0).getActionEffectTextOverride() != null);
        boolean z2 = !arrayList3.isEmpty() || ((GreatPersonIndividuals)m0).getBirthEffectTextOverride() != null;
        if(z || z1 || z2) {
            this.c("LOC_UI_PEDIA_UNIQUE_ABILITY");
        }
        if(j.a(((GreatPersonIndividuals)m0).getGreatPersonClassType(), "GREAT_PERSON_CLASS_PROPHET")) {
            this.e(x2.j.x(new String[]{"LOC_GREATPERSON_ACTION_USAGE_FOUND_RELIGION"}));
        }
        if(z1) {
            String s4 = ((GreatPersonIndividuals)m0).getActionNameTextOverride();
            if(s4 == null) {
                s4 = "LOC_GREATPERSON_ACTION_NAME_DEFAULT";
            }
            String s5 = a.H("LOC_UI_PEDIA_GREATPERSON_ACTION", new Object[]{s4, ((GreatPersonIndividuals)m0).getActionCharges()});
            String s6 = ((GreatPersonIndividuals)m0).getActionEffectTextOverride();
            if(s6 == null) {
                s6 = i.Y(arrayList1, "[NEWLINE]", null, null, null, 62);
            }
            this.d(s5, s6);
        }
        if(z2) {
            String s7 = ((GreatPersonIndividuals)m0).getBirthNameTextOverride();
            if(s7 == null) {
                s7 = "LOC_GREATPERSON_PASSIVE_NAME_DEFAULT";
            }
            String s8 = ((GreatPersonIndividuals)m0).getBirthEffectTextOverride();
            if(s8 == null) {
                s8 = i.Y(arrayList3, "[NEWLINE]", null, null, null, 62);
            }
            this.d(s7, s8);
        }
    }

    private final void P() {
        String s4;
        String s2;
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.S0.h(q0.b);
        j.c(m0);
        Integer integer0 = ((Moments)m0).getEraScore();
        int v = integer0 == null ? 0 : ((int)integer0);
        String s = ((Moments)m0).getObsoleteEra();
        String s1 = null;
        if(s == null) {
            s2 = null;
        }
        else {
            Eras eras0 = s.equals("NO_ERA") ? null : ((Eras)this.m().d0.h(s));
            s2 = eras0 == null ? null : eras0.getName();
        }
        String s3 = ((Moments)m0).getMinimumGameEra();
        if(s3 == null) {
            s4 = null;
        }
        else {
            Eras eras1 = (Eras)this.m().d0.h(s3);
            s4 = eras1 == null ? null : eras1.getName();
        }
        String s5 = ((Moments)m0).getMaximumGameEra();
        if(s5 != null) {
            Eras eras2 = (Eras)this.m().d0.h(s5);
            if(eras2 != null) {
                s1 = eras2.getName();
            }
        }
        this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{((Moments)m0).getDescription()}));
        this.a();
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        b0.f(a.H("LOC_UI_PEDIA_ERA_SCORE", new Object[]{v}));
        b0.h();
        if(s2 != null) {
            b0.a("LOC_UI_PEDIA_MADE_REMOVED_IF");
            b0.f(s2);
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
        Q1.b b1 = new Q1.b(linearLayout1, this.q());
        b1.h();
        if(s4 != null) {
            b1.f(a.H("LOC_UI_PEDIA_MIN_ERA", new Object[]{s4}));
        }
        if(s1 != null) {
            b1.f(a.H("LOC_UI_PEDIA_MAX_ERA", new Object[]{s1}));
        }
        if(!b1.n()) {
            this.j(linearLayout1);
        }
    }

    private final void Q() {
        ArrayList arrayList11;
        Boolean boolean0;
        HashMap hashMap1;
        String s2;
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.K0.h(q0.b);
        j.c(m0);
        String s = ((Improvements)m0).getImprovementType();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((List)this.m().J0)) {
            Improvement_YieldChanges improvement_YieldChanges0 = (Improvement_YieldChanges)object0;
            if(j.a(improvement_YieldChanges0.getImprovementType(), s) && improvement_YieldChanges0.getYieldChange() > 0) {
                Yields yields0 = (Yields)this.m().R1.h(improvement_YieldChanges0.getYieldType());
                if(yields0 != null) {
                    arrayList0.add(a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{improvement_YieldChanges0.getYieldChange(), yields0.getIconString(), yields0.getName()}));
                }
            }
        }
        double f1 = ((Improvements)m0).getTilesRequired() <= 0 ? 0.0 : ((double)((Improvements)m0).getHousing()) / ((double)((Improvements)m0).getTilesRequired());
        if(f1 != 0.0) {
            arrayList0.add(a.H("LOC_TYPE_TRAIT_HOUSING", new Object[]{f1}));
        }
        if(((Improvements)m0).getAirSlots() != 0) {
            arrayList0.add(a.H("LOC_TYPE_TRAIT_AIRSLOTS", new Object[]{((Improvements)m0).getAirSlots()}));
        }
        if(((Improvements)m0).getWeaponSlots() != 0) {
            arrayList0.add(a.H("LOC_TYPE_TRAIT_WEAPONSLOTS", new Object[]{((Improvements)m0).getWeaponSlots()}));
        }
        if(((Improvements)m0).getAppeal() != 0) {
            arrayList0.add(a.H("LOC_TYPE_TRAIT_APPEAL", new Object[]{((Improvements)m0).getAppeal()}));
        }
        for(Object object1: ((List)this.m().D0)) {
            Improvement_BonusYieldChanges improvement_BonusYieldChanges0 = (Improvement_BonusYieldChanges)object1;
            if(j.a(improvement_BonusYieldChanges0.getImprovementType(), s) && improvement_BonusYieldChanges0.getBonusYieldChange() != 0) {
                Yields yields1 = (Yields)this.m().R1.h(improvement_BonusYieldChanges0.getYieldType());
                if(yields1 != null) {
                    String s1 = improvement_BonusYieldChanges0.getPrereqCivic();
                    if(s1 == null) {
                        s2 = null;
                    }
                    else {
                        Civics civics0 = (Civics)this.m().B.h(s1);
                        if(civics0 != null) {
                            s2 = civics0.getName();
                        }
                    }
                    String s3 = improvement_BonusYieldChanges0.getPrereqTech();
                    if(s3 != null) {
                        Technologies technologies0 = (Technologies)this.m().t1.h(s3);
                        s2 = technologies0 == null ? null : technologies0.getName();
                    }
                    if(s2 != null) {
                        arrayList0.add(a.H("LOC_TYPE_TRAIT_BONUS_YIELD", new Object[]{improvement_BonusYieldChanges0.getBonusYieldChange(), yields1.getIconString(), yields1.getName(), s2}));
                    }
                }
            }
        }
        ArrayList arrayList1 = i.p0(A.f0(this.m(), ((Improvements)m0).getTraitType()));
        o2.f f2 = this.m();
        ArrayList arrayList2 = new ArrayList();
        for(Object object2: ((List)f2.F.i)) {
            if(j.a(((Civilizations)object2).getStartingCivilizationLevelType(), "CIVILIZATION_LEVEL_CITY_STATE")) {
                arrayList2.add(object2);
            }
        }
        ArrayList arrayList3 = new ArrayList(x2.k.E(arrayList2));
        for(Object object3: arrayList2) {
            arrayList3.add(((Civilizations)object3).getCivilizationType());
        }
        HashSet hashSet0 = new HashSet(arrayList3);
        HashMap hashMap0 = new HashMap();
        o2.f f3 = this.m();
        ArrayList arrayList4 = new ArrayList();
        for(Object object4: ((Iterable)f3.D)) {
            if(hashSet0.contains(((CivilizationLeaders)object4).getCivilizationType())) {
                arrayList4.add(object4);
            }
        }
        for(Object object5: arrayList4) {
            hashMap0.put(((CivilizationLeaders)object5).getLeaderType(), ((CivilizationLeaders)object5).getCivilizationType());
        }
        o2.f f4 = this.m();
        ArrayList arrayList5 = new ArrayList();
        for(Object object6: ((Iterable)f4.F0)) {
            if(j.a(((Improvement_ValidBuildUnits)object6).getImprovementType(), s)) {
                arrayList5.add(object6);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for(Object object7: arrayList5) {
            o2.f f5 = this.m();
            String s4 = ((Improvement_ValidBuildUnits)object7).getUnitType();
            Units units0 = (Units)f5.O1.h(s4);
            if(units0 != null) {
                arrayList6.add(units0);
            }
        }
        boolean z = false;
        for(Object object8: arrayList6) {
            if(((Units)object8).getTraitType() == null) {
                z = true;
            }
        }
        i.m0(arrayList6, new C1.a(8));
        if(z) {
            for(Object object9: arrayList6) {
                Units units1 = (Units)object9;
                for(Object object10: ((List)this.m().N0)) {
                    LeaderTraits leaderTraits0 = (LeaderTraits)object10;
                    if(j.a(leaderTraits0.getTraitType(), units1.getTraitType())) {
                        Leaders leaders0 = (Leaders)this.m().O0.h(leaderTraits0.getLeaderType());
                        if(leaders0 == null) {
                            hashMap1 = hashMap0;
                        }
                        else {
                            String s5 = (String)hashMap0.get(leaders0.getLeaderType());
                            if(s5 == null) {
                                hashMap1 = hashMap0;
                            }
                            else {
                                Civilizations civilizations0 = (Civilizations)this.m().F.h(s5);
                                if(civilizations0 == null) {
                                    hashMap1 = hashMap0;
                                    boolean0 = null;
                                }
                                else {
                                    hashMap1 = hashMap0;
                                    boolean0 = Boolean.valueOf(arrayList1.add(new k(f.h("ICON_", civilizations0.getCivilizationType()), civilizations0.getName(), civilizations0.getCivilizationType(), null)));
                                }
                                if(boolean0 != null) {
                                    goto label_130;
                                }
                            }
                            arrayList1.add(new k("ICON_" + leaders0.getLeaderType(), leaders0.getName(), leaders0.getLeaderType(), null));
                        }
                    label_130:
                        hashMap0 = hashMap1;
                    }
                }
                o2.f f6 = this.m();
                ArrayList arrayList7 = new ArrayList();
                for(Object object11: ((Iterable)f6.E)) {
                    if(j.a(((CivilizationTraits)object11).getTraitType(), units1.getTraitType())) {
                        arrayList7.add(object11);
                    }
                }
                ArrayList arrayList8 = new ArrayList();
                for(Object object12: arrayList7) {
                    Civilizations civilizations1 = (Civilizations)this.m().F.h(((CivilizationTraits)object12).getCivilizationType());
                    if(civilizations1 != null) {
                        arrayList8.add(civilizations1);
                    }
                }
                for(Object object13: arrayList8) {
                    arrayList1.add(new k(f.h("ICON_", ((Civilizations)object13).getCivilizationType()), ((Civilizations)object13).getName(), ((Civilizations)object13).getCivilizationType(), null));
                }
            }
        }
        o2.f f7 = this.m();
        ArrayList arrayList9 = new ArrayList();
        for(Object object14: ((List)f7.R0.i)) {
            Modifiers modifiers0 = (Modifiers)object14;
            DynamicModifiers dynamicModifiers0 = (DynamicModifiers)this.m().c0.h(modifiers0.getModifierType());
            if(dynamicModifiers0 == null || !j.a(dynamicModifiers0.getEffectType(), "EFFECT_ADJUST_PLAYER_VALID_IMPROVEMENT")) {
                arrayList11 = null;
            }
            else {
                o2.f f8 = this.m();
                ArrayList arrayList10 = new ArrayList();
                for(Object object15: ((Iterable)f8.P0)) {
                    ModifierArguments modifierArguments0 = (ModifierArguments)object15;
                    if(j.a(modifierArguments0.getModifierId(), modifiers0.getModifierId()) && j.a(modifierArguments0.getName(), "ImprovementType") && j.a(modifierArguments0.getValue(), s)) {
                        arrayList10.add(object15);
                    }
                }
                arrayList11 = new ArrayList(x2.k.E(arrayList10));
                for(Object object16: arrayList10) {
                    arrayList11.add(((ModifierArguments)object16).getModifierId());
                }
            }
            if(arrayList11 != null) {
                arrayList9.add(arrayList11);
            }
        }
        HashSet hashSet1 = new HashSet(x2.k.F(arrayList9));
        o2.f f9 = this.m();
        ArrayList arrayList12 = new ArrayList();
        for(Object object17: ((Iterable)f9.f)) {
            if(hashSet1.contains(((BeliefModifiers)object17).getModifierID())) {
                arrayList12.add(object17);
            }
        }
        ArrayList arrayList13 = new ArrayList(x2.k.E(arrayList12));
        for(Object object18: arrayList12) {
            arrayList13.add(((BeliefModifiers)object18).getBeliefType());
        }
        HashSet hashSet2 = new HashSet(arrayList13);
        o2.f f10 = this.m();
        ArrayList arrayList14 = new ArrayList();
        for(Object object19: ((List)f10.g.i)) {
            if(hashSet2.contains(((Beliefs)object19).getBeliefType())) {
                arrayList14.add(object19);
            }
        }
        ArrayList arrayList15 = new ArrayList(x2.k.E(arrayList14));
        for(Object object20: arrayList14) {
            arrayList15.add(new k(f.h("ICON_", ((Beliefs)object20).getBeliefType()), ((Beliefs)object20).getName(), ((Beliefs)object20).getBeliefType(), null));
        }
        arrayList1.addAll(arrayList15);
        o2.f f11 = this.m();
        ArrayList arrayList16 = new ArrayList();
        for(Object object21: ((Iterable)f11.C0)) {
            if(j.a(((Improvement_Adjacencies)object21).getImprovementType(), s)) {
                arrayList16.add(object21);
            }
        }
        ArrayList arrayList17 = new ArrayList(x2.k.E(arrayList16));
        for(Object object22: arrayList16) {
            arrayList17.add(((Improvement_Adjacencies)object22).getYieldChangeId());
        }
        HashSet hashSet3 = new HashSet(arrayList17);
        ArrayList arrayList18 = new ArrayList();
        for(Object object23: ((List)this.m().b.i)) {
            Adjacency_YieldChanges adjacency_YieldChanges0 = (Adjacency_YieldChanges)object23;
            if(hashSet3.contains(adjacency_YieldChanges0.getID())) {
                String s6 = C.z(this.m(), adjacency_YieldChanges0);
                if(s6 != null) {
                    arrayList18.add(s6);
                }
            }
        }
        o2.f f12 = this.m();
        ArrayList arrayList19 = new ArrayList();
        for(Object object24: ((Iterable)f12.G0)) {
            if(j.a(((Improvement_ValidFeatures)object24).getImprovementType(), s)) {
                arrayList19.add(object24);
            }
        }
        ArrayList arrayList20 = new ArrayList();
        for(Object object25: arrayList19) {
            o2.f f13 = this.m();
            String s7 = ((Improvement_ValidFeatures)object25).getFeatureType();
            Features features0 = (Features)f13.j0.h(s7);
            if(features0 != null) {
                arrayList20.add(features0);
            }
        }
        ArrayList arrayList21 = new ArrayList(x2.k.E(arrayList20));
        for(Object object26: arrayList20) {
            arrayList21.add(new w2.e(a.H(((Features)object26).getName(), new Object[0]), ((Features)object26).getFeatureType()));
        }
        o2.f f14 = this.m();
        ArrayList arrayList22 = new ArrayList();
        for(Object object27: ((Iterable)f14.H0)) {
            if(j.a(((Improvement_ValidResources)object27).getImprovementType(), s)) {
                arrayList22.add(object27);
            }
        }
        ArrayList arrayList23 = new ArrayList();
        for(Object object28: arrayList22) {
            o2.f f15 = this.m();
            String s8 = ((Improvement_ValidResources)object28).getResourceType();
            Resources resources0 = (Resources)f15.o1.h(s8);
            if(resources0 != null) {
                arrayList23.add(resources0);
            }
        }
        ArrayList arrayList24 = new ArrayList(x2.k.E(arrayList23));
        for(Object object29: arrayList23) {
            arrayList24.add(new w2.e(a.H(((Resources)object29).getName(), new Object[0]), ((Resources)object29).getResourceType()));
        }
        o2.f f16 = this.m();
        ArrayList arrayList25 = new ArrayList();
        for(Object object30: ((Iterable)f16.I0)) {
            if(j.a(((Improvement_ValidTerrains)object30).getImprovementType(), s)) {
                arrayList25.add(object30);
            }
        }
        ArrayList arrayList26 = new ArrayList();
        for(Object object31: arrayList25) {
            o2.f f17 = this.m();
            String s9 = ((Improvement_ValidTerrains)object31).getTerrainType();
            Terrains terrains0 = (Terrains)f17.z1.h(s9);
            if(terrains0 != null) {
                arrayList26.add(terrains0);
            }
        }
        ArrayList arrayList27 = new ArrayList(x2.k.E(arrayList26));
        for(Object object32: arrayList26) {
            arrayList27.add(new w2.e(a.H(((Terrains)object32).getName(), new Object[0]), ((Terrains)object32).getTerrainType()));
        }
        ArrayList arrayList28 = x2.k.F(x2.j.x(new List[]{arrayList21, arrayList24, arrayList27}));
        i.m0(arrayList28, new C1.a(9));
        this.f(((Improvements)m0).getIcon());
        String s10 = ((Improvements)m0).getDescription();
        if(s10 != null) {
            this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{s10}));
        }
        this.a();
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        if(!arrayList1.isEmpty()) {
            b0.a("LOC_UI_PEDIA_UNIQUE_TO");
            for(Object object33: arrayList1) {
                j.c(((k)object33).b);
                b0.b(((k)object33), ((k)object33).b);
            }
            b0.h();
        }
        if(!arrayList0.isEmpty()) {
            for(Object object34: arrayList0) {
                j.c(((String)object34));
                b0.f(((String)object34));
            }
            b0.h();
        }
        if(!arrayList18.isEmpty()) {
            b0.a("LOC_UI_PEDIA_ADJACENCY_BONUS");
            for(Object object35: arrayList18) {
                j.c(((String)object35));
                b0.f(((String)object35));
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
        Q1.b b1 = new Q1.b(linearLayout1, this.q());
        b1.h();
        if(((Improvements)m0).getPrereqTech() != null || ((Improvements)m0).getPrereqCivic() != null) {
            String s11 = ((Improvements)m0).getPrereqCivic();
            if(s11 != null) {
                Civics civics1 = (Civics)this.m().B.h(s11);
                if(civics1 != null) {
                    b1.a("LOC_CIVIC_NAME");
                    b1.b(new k(f.h("ICON_", civics1.getCivicType()), civics1.getName(), civics1.getCivicType(), null), civics1.getName());
                }
            }
            String s12 = ((Improvements)m0).getPrereqTech();
            if(s12 != null) {
                Technologies technologies1 = (Technologies)this.m().t1.h(s12);
                if(technologies1 != null) {
                    b1.a("LOC_TECHNOLOGY_NAME");
                    b1.b(new k(f.h("ICON_", technologies1.getTechnologyType()), technologies1.getName(), technologies1.getTechnologyType(), null), technologies1.getName());
                }
            }
            b1.h();
        }
        if(!arrayList28.isEmpty()) {
            for(Object object36: arrayList28) {
                b1.b(new k("ICON_" + ((w2.e)object36).j, ((String)((w2.e)object36).i), ((String)((w2.e)object36).j), null), ((String)((w2.e)object36).i));
            }
            b1.h();
        }
        if(!b1.n()) {
            this.j(linearLayout1);
        }
        LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView2 = (TextView)i3.e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView2);
        o1.a.U(textView2, "LOC_UI_PEDIA_USAGE");
        Q1.b b2 = new Q1.b(linearLayout2, this.q());
        b2.h();
        if(!arrayList6.isEmpty()) {
            b2.a("LOC_UI_PEDIA_BUILT_BY");
            for(Object object37: arrayList6) {
                b2.b(new k(f.h("ICON_", ((Units)object37).getUnitType()), ((Units)object37).getName(), ((Units)object37).getUnitType(), null), ((Units)object37).getName());
            }
            b2.h();
        }
        if(!b2.n()) {
            this.j(linearLayout2);
        }
    }

    private final void R() {
        ArrayList arrayList33;
        ArrayList arrayList31;
        Iterator iterator31;
        this.s(this.p().j);
        this.p();
        o2.f f0 = this.m();
        q q0 = this.p();
        m m0 = f0.O0.h(q0.b);
        j.c(m0);
        ArrayList arrayList0 = this.u(((Leaders)m0));
        ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
        for(Object object0: arrayList0) {
            arrayList1.add(((Leaders)object0).getLeaderType());
        }
        HashSet hashSet0 = new HashSet(arrayList1);
        o2.f f1 = this.m();
        ArrayList arrayList2 = new ArrayList();
        for(Object object1: ((Iterable)f1.D)) {
            if(hashSet0.contains(((CivilizationLeaders)object1).getLeaderType())) {
                arrayList2.add(object1);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object2: arrayList2) {
            o2.f f2 = this.m();
            String s = ((CivilizationLeaders)object2).getCivilizationType();
            Civilizations civilizations0 = (Civilizations)f2.F.h(s);
            if(civilizations0 != null) {
                arrayList3.add(civilizations0);
            }
        }
        o2.f f3 = this.m();
        ArrayList arrayList4 = new ArrayList();
        for(Object object3: ((Iterable)f3.M0)) {
            if(hashSet0.contains(((LeaderQuotes)object3).getLeaderType())) {
                arrayList4.add(object3);
            }
        }
        o2.f f4 = this.m();
        ArrayList arrayList5 = new ArrayList();
        for(Object object4: ((Iterable)f4.N0)) {
            if(hashSet0.contains(((LeaderTraits)object4).getLeaderType())) {
                arrayList5.add(object4);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for(Object object5: arrayList5) {
            Traits traits0 = (Traits)this.m().B1.h(((LeaderTraits)object5).getTraitType());
            if(traits0 != null) {
                arrayList6.add(traits0);
            }
        }
        ArrayList arrayList7 = new ArrayList(x2.k.E(arrayList6));
        for(Object object6: arrayList6) {
            arrayList7.add(((Traits)object6).getTraitType());
        }
        HashSet hashSet1 = new HashSet(arrayList7);
        o2.f f5 = this.m();
        ArrayList arrayList8 = new ArrayList();
        for(Object object7: ((List)f5.O1.i)) {
            if(((Units)object7).getTraitType() != null) {
                arrayList8.add(object7);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for(Object object8: arrayList8) {
            String s1 = ((Units)object8).getTraitType();
            if(s1 != null) {
                arrayList9.add(s1);
            }
        }
        HashSet hashSet2 = new HashSet(arrayList9);
        ArrayList arrayList10 = new ArrayList();
        for(Object object9: arrayList8) {
            if(hashSet1.contains(((Units)object9).getTraitType())) {
                arrayList10.add(object9);
            }
        }
        ArrayList arrayList11 = new ArrayList(x2.k.E(arrayList10));
        for(Object object10: arrayList10) {
            arrayList11.add(new String[]{((Units)object10).getUnitType(), ((Units)object10).getName()});
        }
        o2.f f6 = this.m();
        ArrayList arrayList12 = new ArrayList();
        for(Object object11: ((List)f6.v.i)) {
            if(((Buildings)object11).getTraitType() != null) {
                arrayList12.add(object11);
            }
        }
        ArrayList arrayList13 = new ArrayList();
        for(Object object12: arrayList12) {
            String s2 = ((Buildings)object12).getTraitType();
            if(s2 != null) {
                arrayList13.add(s2);
            }
        }
        Set set0 = i.t0(hashSet2, arrayList13);
        ArrayList arrayList14 = new ArrayList();
        for(Object object13: arrayList12) {
            if(hashSet1.contains(((Buildings)object13).getTraitType())) {
                arrayList14.add(object13);
            }
        }
        ArrayList arrayList15 = new ArrayList(x2.k.E(arrayList14));
        for(Object object14: arrayList14) {
            arrayList15.add(new String[]{((Buildings)object14).getBuildingType(), ((Buildings)object14).getName()});
        }
        ArrayList arrayList16 = i.p0(arrayList15);
        o2.f f7 = this.m();
        ArrayList arrayList17 = new ArrayList();
        for(Object object15: ((List)f7.b0.i)) {
            if(((Districts)object15).getTraitType() != null) {
                arrayList17.add(object15);
            }
        }
        ArrayList arrayList18 = new ArrayList();
        for(Object object16: arrayList17) {
            String s3 = ((Districts)object16).getTraitType();
            if(s3 != null) {
                arrayList18.add(s3);
            }
        }
        Set set1 = i.t0(set0, arrayList18);
        ArrayList arrayList19 = new ArrayList();
        for(Object object17: arrayList17) {
            if(hashSet1.contains(((Districts)object17).getTraitType())) {
                arrayList19.add(object17);
            }
        }
        ArrayList arrayList20 = new ArrayList(x2.k.E(arrayList19));
        for(Object object18: arrayList19) {
            arrayList20.add(new String[]{((Districts)object18).getDistrictType(), ((Districts)object18).getName()});
        }
        arrayList16.addAll(arrayList20);
        o2.f f8 = this.m();
        ArrayList arrayList21 = new ArrayList();
        for(Object object19: ((List)f8.K0.i)) {
            if(((Improvements)object19).getTraitType() != null) {
                arrayList21.add(object19);
            }
        }
        ArrayList arrayList22 = new ArrayList();
        for(Object object20: arrayList21) {
            String s4 = ((Improvements)object20).getTraitType();
            if(s4 != null) {
                arrayList22.add(s4);
            }
        }
        Set set2 = i.t0(set1, arrayList22);
        ArrayList arrayList23 = new ArrayList();
        for(Object object21: arrayList21) {
            if(hashSet1.contains(((Improvements)object21).getTraitType())) {
                arrayList23.add(object21);
            }
        }
        ArrayList arrayList24 = new ArrayList(x2.k.E(arrayList23));
        for(Object object22: arrayList23) {
            arrayList24.add(new String[]{((Improvements)object22).getImprovementType(), ((Improvements)object22).getName()});
        }
        arrayList16.addAll(arrayList24);
        ArrayList arrayList25 = new ArrayList();
        for(Object object23: arrayList6) {
            if(!((Traits)object23).getInternalOnly() && !set2.contains(((Traits)object23).getTraitType())) {
                arrayList25.add(object23);
            }
        }
        o2.f f9 = this.m();
        ArrayList arrayList26 = new ArrayList();
        for(Object object24: ((Iterable)f9.f0)) {
            FavoredReligions favoredReligions0 = (FavoredReligions)object24;
            if(favoredReligions0.getCivilizationType() == null && favoredReligions0.getLeaderType() != null && hashSet0.contains(favoredReligions0.getLeaderType())) {
                arrayList26.add(object24);
            }
        }
        ArrayList arrayList27 = new ArrayList();
        for(Object object25: arrayList26) {
            o2.f f10 = this.m();
            String s5 = ((FavoredReligions)object25).getReligionType();
            Religions religions0 = (Religions)f10.e1.h(s5);
            if(religions0 != null) {
                arrayList27.add(religions0);
            }
        }
        Religions religions1 = (Religions)i.U(arrayList27);
        o2.f f11 = this.m();
        ArrayList arrayList28 = new ArrayList();
        for(Object object26: ((Iterable)f11.A0)) {
            if(hashSet0.contains(((HistoricalAgendas)object26).getLeaderType())) {
                arrayList28.add(object26);
            }
        }
        ArrayList arrayList29 = new ArrayList();
        for(Object object27: arrayList28) {
            o2.f f12 = this.m();
            String s6 = ((HistoricalAgendas)object27).getAgendaType();
            Agendas agendas0 = (Agendas)f12.c.h(s6);
            if(agendas0 != null) {
                arrayList29.add(agendas0);
            }
        }
        o2.f f13 = this.m();
        ArrayList arrayList30 = new ArrayList();
        for(Object object28: ((Iterable)f13.L0)) {
            if(hashSet0.contains(((LeaderInfo)object28).getLeaderType())) {
                arrayList30.add(object28);
            }
        }
        i.m0(arrayList30, new C1.a(10));
        this.h("ICON_" + ((Leaders)m0).getLeaderType());
        Iterator iterator29 = arrayList4.iterator();
        while(iterator29.hasNext()) {
            Object object29 = iterator29.next();
            g.g(this, ((LeaderQuotes)object29).getQuote(), 4);
            LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
            TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
            j.c(textView0);
            o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
            Q1.b b0 = new Q1.b(linearLayout0, this.q());
            b0.h();
            if(arrayList3.isEmpty()) {
                iterator31 = iterator29;
                arrayList31 = arrayList3;
            }
            else {
                b0.a("LOC_UI_PEDIA_CIVILIZATIONS");
                for(Object object30: arrayList3) {
                    b0.b(new k(f.h("ICON_", ((Civilizations)object30).getCivilizationType()), ((Civilizations)object30).getName(), ((Civilizations)object30).getCivilizationType(), null), ((Civilizations)object30).getName());
                }
                iterator31 = iterator29;
                arrayList31 = arrayList3;
                b0.h();
            }
            if(arrayList11.isEmpty()) {
                arrayList33 = arrayList11;
            }
            else {
                b0.a("LOC_UI_PEDIA_SPECIAL_UNITS");
                ArrayList arrayList32 = new ArrayList(x2.k.E(arrayList11));
                for(Object object31: arrayList11) {
                    arrayList32.add(new k(f.h("ICON_", ((String[])object31)[0]), ((String[])object31)[1], ((String[])object31)[0], null));
                }
                arrayList33 = arrayList11;
                b0.d(arrayList32);
                b0.h();
            }
            if(!arrayList16.isEmpty()) {
                b0.a("LOC_UI_PEDIA_SPECIAL_INFRASTRUCTURE");
                ArrayList arrayList34 = new ArrayList(x2.k.E(arrayList16));
                for(Object object32: arrayList16) {
                    arrayList34.add(new k(f.h("ICON_", ((String[])object32)[0]), ((String[])object32)[1], ((String[])object32)[0], null));
                }
                b0.d(arrayList34);
                b0.h();
            }
            if(!b0.n()) {
                this.j(linearLayout0);
            }
            LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
            TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
            j.c(textView1);
            o1.a.U(textView1, "LOC_UI_PEDIA_PREFERENCES");
            Q1.b b1 = new Q1.b(linearLayout1, this.q());
            b1.h();
            if(!arrayList29.isEmpty()) {
                b1.a("LOC_UI_PEDIA_AGENDAS");
                for(Object object33: arrayList29) {
                    b1.f(((Agendas)object33).getName());
                    b1.f(((Agendas)object33).getDescription());
                }
                b1.h();
            }
            if(religions1 != null) {
                b1.a("LOC_UI_PEDIA_PREFERRED_RELIGION");
                b1.b(new k(f.h("ICON_", religions1.getReligionType()), religions1.getName(), religions1.getReligionType(), null), religions1.getName());
                b1.h();
            }
            if(!b1.n()) {
                this.j(linearLayout1);
            }
            arrayList11 = arrayList33;
            iterator29 = iterator31;
            arrayList3 = arrayList31;
        }
        if(!arrayList30.isEmpty()) {
            LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
            TextView textView2 = (TextView)i3.e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
            j.c(textView2);
            o1.a.U(textView2, "LOC_UI_PEDIA_GEOGRAPHY_AND_SOCIAL_DATA");
            Q1.b b2 = new Q1.b(linearLayout2, this.q());
            b2.h();
            for(Object object34: arrayList30) {
                b2.a(((LeaderInfo)object34).getHeader());
                b2.f(((LeaderInfo)object34).getCaption());
                b2.h();
            }
            if(!b2.n()) {
                this.j(linearLayout2);
            }
        }
        if(!arrayList25.isEmpty()) {
            this.c("LOC_UI_PEDIA_UNIQUE_ABILITY");
            for(Object object35: arrayList25) {
                this.d(((Traits)object35).getName(), ((Traits)object35).getDescription());
            }
        }
        this.a();
    }

    public int S(Civ5Buildings civ5Buildings0, String s) {
        o2.g g0 = this.n();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)g0.O)) {
            if(j.a(((Civ5Building_YieldChanges)object0).getBuildingType(), civ5Buildings0.getType()) && j.a(((Civ5Building_YieldChanges)object0).getYieldType(), s)) {
                arrayList0.add(object0);
            }
        }
        int v = 0;
        for(Object object1: arrayList0) {
            Integer integer0 = ((Civ5Building_YieldChanges)object1).getYield();
            v += (integer0 == null ? 0 : ((int)integer0));
        }
        return v;
    }

    public int T(Civ5Buildings civ5Buildings0, String s) {
        o2.g g0 = this.n();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)g0.P)) {
            if(j.a(((Civ5Building_YieldModifiers)object0).getBuildingType(), civ5Buildings0.getType()) && j.a(((Civ5Building_YieldModifiers)object0).getYieldType(), s)) {
                arrayList0.add(object0);
            }
        }
        int v = 0;
        for(Object object1: arrayList0) {
            Integer integer0 = ((Civ5Building_YieldModifiers)object1).getYield();
            v += (integer0 == null ? 0 : ((int)integer0));
        }
        return v;
    }

    public String U(ArrayList arrayList0) {
        w2.k k0;
        if(!arrayList0.isEmpty()) {
            HashMap hashMap0 = new HashMap();
            for(Object object0: arrayList0) {
                Integer integer0 = (Integer)hashMap0.get(((w2.e)object0).i);
                Object object1 = ((w2.e)object0).j;
                Object object2 = ((w2.e)object0).i;
                if(integer0 == null) {
                    k0 = null;
                }
                else {
                    hashMap0.put(object2, ((int)(((Number)object1).intValue() + ((int)integer0))));
                    k0 = w2.k.a;
                }
                if(k0 == null) {
                    hashMap0.put(object2, object1);
                }
            }
            o2.f f0 = this.m();
            ArrayList arrayList1 = new ArrayList();
            for(Object object3: ((List)f0.R1.i)) {
                if(hashMap0.get(((Yields)object3).getYieldType()) != null) {
                    arrayList1.add(object3);
                }
            }
            ArrayList arrayList2 = new ArrayList(x2.k.E(arrayList1));
            for(Object object4: arrayList1) {
                Object object5 = hashMap0.get(((Yields)object4).getYieldType());
                j.c(object5);
                arrayList2.add(a.H("{1: number +#;-#} {2_Icon} {3_Name}", new Object[]{object5, ((Yields)object4).getIconString(), ((Yields)object4).getName()}));
            }
            return i.Y(arrayList2, a.H("LOC_GRAMMAR_COMMA_SEPARATOR", new Object[0]), null, null, null, 62);
        }
        return null;
    }

    @Override  // j2.g
    public final void k() {
        Governments governments0;
        Boolean boolean0;
        String s5;
        String s3;
        Iterator iterator15;
        switch(this.i) {
            case 0: {
                this.s(this.p().j);
                this.p();
                o2.f f5 = this.m();
                q q3 = this.p();
                m m1 = f5.g.h(q3.b);
                j.c(m1);
                String s14 = ((Beliefs)m1).getBeliefType();
                o2.f f6 = this.m();
                String s15 = ((Beliefs)m1).getBeliefClassType();
                BeliefClasses beliefClasses0 = (BeliefClasses)f6.e.h(s15);
                o2.f f7 = this.m();
                ArrayList arrayList7 = new ArrayList();
                for(Object object12: ((Iterable)f7.f)) {
                    if(j.a(((BeliefModifiers)object12).getBeliefType(), s14)) {
                        arrayList7.add(object12);
                    }
                }
                ArrayList arrayList8 = new ArrayList(x2.k.E(arrayList7));
                for(Object object13: arrayList7) {
                    arrayList8.add(((BeliefModifiers)object13).getModifierID());
                }
                HashSet hashSet0 = new HashSet(arrayList8);
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = new ArrayList();
                o2.f f8 = this.m();
                ArrayList arrayList11 = new ArrayList();
                for(Object object14: ((List)f8.R0.i)) {
                    if(hashSet0.contains(((Modifiers)object14).getModifierId())) {
                        arrayList11.add(object14);
                    }
                }
                for(Iterator iterator14 = arrayList11.iterator(); iterator14.hasNext(); iterator14 = iterator15) {
                    Object object15 = iterator14.next();
                    Modifiers modifiers0 = (Modifiers)object15;
                    DynamicModifiers dynamicModifiers0 = (DynamicModifiers)this.m().c0.h(modifiers0.getModifierType());
                    if(dynamicModifiers0 == null) {
                        iterator15 = iterator14;
                    }
                    else {
                        String s16 = dynamicModifiers0.getEffectType();
                        switch(s16.hashCode()) {
                            case -404529644: {
                                iterator15 = iterator14;
                                if(s16.equals("EFFECT_ADD_RELIGIOUS_UNIT")) {
                                    for(Object object16: ((List)this.m().P0)) {
                                        ModifierArguments modifierArguments0 = (ModifierArguments)object16;
                                        if(j.a(modifierArguments0.getModifierId(), modifiers0.getModifierId()) && j.a(modifierArguments0.getName(), "UnitType")) {
                                            Units units0 = (Units)this.m().O1.h(modifierArguments0.getValue());
                                            if(units0 != null) {
                                                arrayList10.add(new k(f.h("ICON_", units0.getUnitType()), units0.getName(), units0.getUnitType(), null));
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            case 677562180: {
                                iterator15 = iterator14;
                                if(s16.equals("EFFECT_ADD_RELIGIOUS_BUILDING")) {
                                    for(Object object17: ((List)this.m().P0)) {
                                        ModifierArguments modifierArguments1 = (ModifierArguments)object17;
                                        if(j.a(modifierArguments1.getModifierId(), modifiers0.getModifierId()) && j.a(modifierArguments1.getName(), "BuildingType")) {
                                            Buildings buildings0 = (Buildings)this.m().v.h(modifierArguments1.getValue());
                                            if(buildings0 != null) {
                                                arrayList9.add(new k(f.h("ICON_", buildings0.getBuildingType()), buildings0.getName(), buildings0.getBuildingType(), null));
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                            case 0x434C82F7: {
                                if(s16.equals("EFFECT_ADJUST_PLAYER_VALID_IMPROVEMENT")) {
                                    for(Object object18: ((List)this.m().P0)) {
                                        ModifierArguments modifierArguments2 = (ModifierArguments)object18;
                                        if(j.a(modifierArguments2.getModifierId(), modifiers0.getModifierId()) && j.a(modifierArguments2.getName(), "ImprovementType")) {
                                            Improvements improvements0 = (Improvements)this.m().K0.h(modifierArguments2.getValue());
                                            if(improvements0 != null) {
                                                arrayList9.add(new k(f.h("ICON_", improvements0.getImprovementType()), improvements0.getName(), improvements0.getImprovementType(), null));
                                            }
                                        }
                                    }
                                }
                                iterator15 = iterator14;
                                break;
                            }
                            default: {
                                iterator15 = iterator14;
                            }
                        }
                    }
                }
                this.f("ICON_" + s14);
                if(beliefClasses0 != null) {
                    LinearLayout linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                    TextView textView2 = (TextView)i3.e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
                    j.c(textView2);
                    o1.a.U(textView2, "LOC_UI_PEDIA_TRAITS");
                    Q1.b b2 = new Q1.b(linearLayout2, this.q());
                    b2.h();
                    b2.a("LOC_UI_PEDIA_BELIEF_CLASS");
                    b2.f(beliefClasses0.getName());
                    b2.h();
                    if(!arrayList9.isEmpty()) {
                        b2.a("LOC_UI_PEDIA_SPECIAL_INFRASTRUCTURE");
                        for(Object object19: arrayList9) {
                            j.c(((k)object19));
                            j.c(((k)object19).b);
                            b2.b(((k)object19), ((k)object19).b);
                        }
                        b2.h();
                    }
                    if(!arrayList10.isEmpty()) {
                        b2.a("LOC_UI_PEDIA_SPECIAL_UNITS");
                        for(Object object20: arrayList10) {
                            j.c(((k)object20));
                            j.c(((k)object20).b);
                            b2.b(((k)object20), ((k)object20).b);
                        }
                        b2.h();
                    }
                    if(!b2.n()) {
                        this.j(linearLayout2);
                    }
                }
                this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{((Beliefs)m1).getDescription()}));
                this.a();
                return;
            }
            case 1: {
                this.v();
                return;
            }
            case 2: {
                this.s(this.p().j);
                this.p();
                o2.f f9 = this.m();
                q q4 = this.p();
                m m2 = f9.F.h(q4.b);
                j.c(m2);
                o2.f f10 = this.m();
                ArrayList arrayList12 = new ArrayList();
                for(Object object21: ((Iterable)f10.D)) {
                    if(j.a(((CivilizationLeaders)object21).getCivilizationType(), ((Civilizations)m2).getCivilizationType())) {
                        arrayList12.add(object21);
                    }
                }
                ArrayList arrayList13 = new ArrayList();
                for(Object object22: arrayList12) {
                    Leaders leaders0 = (Leaders)this.m().O0.h(((CivilizationLeaders)object22).getLeaderType());
                    if(leaders0 != null) {
                        arrayList13.add(leaders0);
                    }
                }
                ArrayList arrayList14 = new ArrayList(x2.k.E(arrayList13));
                for(Object object23: arrayList13) {
                    arrayList14.add(this.t(((Leaders)object23)));
                }
                ArrayList arrayList15 = x2.k.F(arrayList14);
                ArrayList arrayList16 = new ArrayList(x2.k.E(arrayList15));
                for(Object object24: arrayList15) {
                    arrayList16.add(((Leaders)object24).getLeaderType());
                }
                HashSet hashSet1 = new HashSet(arrayList16);
                Map map0 = w.s(new w2.e[]{new w2.e("LEADER_MINOR_CIV_INDUSTRIAL", new String[]{"ICON_CITYSTATE_INDUSTRIAL", "LOC_CITY_STATES_TYPE_INDUSTRIAL", "COLOR_PLAYER_CITY_STATE_INDUSTRIAL_SECONDARY"}), new w2.e("LEADER_MINOR_CIV_CULTURAL", new String[]{"ICON_CITYSTATE_CULTURE", "LOC_CITY_STATES_TYPE_CULTURAL", "COLOR_PLAYER_CITY_STATE_CULTURAL_SECONDARY"}), new w2.e("LEADER_MINOR_CIV_TRADE", new String[]{"ICON_CITYSTATE_TRADE", "LOC_CITY_STATES_TYPE_TRADE", "COLOR_PLAYER_CITY_STATE_TRADE_SECONDARY"}), new w2.e("LEADER_MINOR_CIV_MILITARISTIC", new String[]{"ICON_CITYSTATE_MILITARISTIC", "LOC_CITY_STATES_TYPE_MILITARISTIC", "COLOR_PLAYER_CITY_STATE_MILITARISTIC_SECONDARY"}), new w2.e("LEADER_MINOR_CIV_RELIGIOUS", new String[]{"ICON_CITYSTATE_FAITH", "LOC_CITY_STATES_TYPE_RELIGIOUS", "COLOR_PLAYER_CITY_STATE_RELIGIOUS_SECONDARY"}), new w2.e("LEADER_MINOR_CIV_SCIENTIFIC", new String[]{"ICON_CITYSTATE_SCIENCE", "LOC_CITY_STATES_TYPE_SCIENTIFIC", "COLOR_PLAYER_CITY_STATE_SCIENCE_SECONDARY"}), new w2.e("LEADER_MINOR_CIV_MARITIME", new String[]{"ICON_CITYSTATE_MARITIME", "LOC_CITY_STATES_SCENARIO_TYPE_MARITIME", "COLOR_PLAYER_CITY_STATE_MARITIME_SECONDARY"})});
                LinkedHashMap linkedHashMap0 = new LinkedHashMap();
                for(Object object25: map0.entrySet()) {
                    Map.Entry map$Entry0 = (Map.Entry)object25;
                    if(hashSet1.contains(map$Entry0.getKey())) {
                        linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
                    }
                }
                List list0 = r.i;
                if(linkedHashMap0.size() != 0) {
                    Iterator iterator26 = linkedHashMap0.entrySet().iterator();
                    if(iterator26.hasNext()) {
                        Object object26 = iterator26.next();
                        if(iterator26.hasNext()) {
                            ArrayList arrayList17 = new ArrayList(linkedHashMap0.size());
                            arrayList17.add(new w2.e(((Map.Entry)object26).getKey(), ((Map.Entry)object26).getValue()));
                            do {
                                Object object27 = iterator26.next();
                                arrayList17.add(new w2.e(((Map.Entry)object27).getKey(), ((Map.Entry)object27).getValue()));
                            }
                            while(iterator26.hasNext());
                            list0 = arrayList17;
                        }
                        else {
                            list0 = G.p(new w2.e(((Map.Entry)object26).getKey(), ((Map.Entry)object26).getValue()));
                        }
                    }
                }
                w2.e e0 = (w2.e)i.U(list0);
                String[] arr_s = e0 == null ? null : ((String[])e0.j);
                o2.f f11 = this.m();
                ArrayList arrayList18 = new ArrayList();
                for(Object object28: ((Iterable)f11.E)) {
                    if(j.a(((CivilizationTraits)object28).getCivilizationType(), ((Civilizations)m2).getCivilizationType())) {
                        arrayList18.add(object28);
                    }
                }
                ArrayList arrayList19 = new ArrayList();
                for(Object object29: arrayList18) {
                    Traits traits0 = (Traits)this.m().B1.h(((CivilizationTraits)object29).getTraitType());
                    if(traits0 != null) {
                        arrayList19.add(traits0);
                    }
                }
                ArrayList arrayList20 = i.p0(arrayList19);
                ArrayList arrayList21 = new ArrayList(x2.k.E(arrayList20));
                for(Object object30: arrayList20) {
                    arrayList21.add(((Traits)object30).getTraitType());
                }
                HashSet hashSet2 = new HashSet(arrayList21);
                o2.f f12 = this.m();
                ArrayList arrayList22 = new ArrayList();
                for(Object object31: ((Iterable)f12.N0)) {
                    if(hashSet1.contains(((LeaderTraits)object31).getLeaderType()) && !hashSet2.contains(((LeaderTraits)object31).getTraitType())) {
                        arrayList22.add(object31);
                    }
                }
                ArrayList arrayList23 = new ArrayList();
                for(Object object32: arrayList22) {
                    Traits traits1 = (Traits)this.m().B1.h(((LeaderTraits)object32).getTraitType());
                    if(traits1 != null) {
                        arrayList23.add(traits1);
                    }
                }
                arrayList20.addAll(arrayList23);
                ArrayList arrayList24 = new ArrayList(x2.k.E(arrayList20));
                for(Object object33: arrayList20) {
                    arrayList24.add(((Traits)object33).getTraitType());
                }
                new HashSet(arrayList24);
                ArrayList arrayList25 = new ArrayList();
                for(Object object34: arrayList20) {
                    if(!((Traits)object34).getInternalOnly()) {
                        arrayList25.add(object34);
                    }
                }
                o2.f f13 = this.m();
                ArrayList arrayList26 = new ArrayList();
                for(Object object35: ((Iterable)f13.f0)) {
                    FavoredReligions favoredReligions0 = (FavoredReligions)object35;
                    if((j.a(favoredReligions0.getCivilizationType(), ((Civilizations)m2).getCivilizationType()) || favoredReligions0.getCivilizationType() == null) && (favoredReligions0.getLeaderType() == null || hashSet1.contains(favoredReligions0.getLeaderType()))) {
                        arrayList26.add(object35);
                    }
                }
                ArrayList arrayList27 = new ArrayList();
                for(Object object36: arrayList26) {
                    o2.f f14 = this.m();
                    String s17 = ((FavoredReligions)object36).getReligionType();
                    Religions religions0 = (Religions)f14.e1.h(s17);
                    if(religions0 != null) {
                        arrayList27.add(religions0);
                    }
                }
                Religions religions1 = (Religions)i.U(arrayList27);
                o2.f f15 = this.m();
                ArrayList arrayList28 = new ArrayList();
                for(Object object37: ((Iterable)f15.C)) {
                    if(j.a(((CivilizationInfo)object37).getCivilizationType(), ((Civilizations)m2).getCivilizationType())) {
                        arrayList28.add(object37);
                    }
                }
                i.m0(arrayList28, new C1.a(3));
                this.f("ICON_" + ((Civilizations)m2).getCivilizationType());
                if(arr_s != null) {
                    LinearLayout linearLayout3 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                    TextView textView3 = (TextView)i3.e.c(linearLayout3, 0x80, 0x7F0700F7);  // id:stat_box_title
                    j.c(textView3);
                    o1.a.U(textView3, "LOC_UI_PEDIA_CITY_STATE_TYPE");
                    Q1.b b3 = new Q1.b(linearLayout3, this.q());
                    b3.h();
                    b3.b(new k(arr_s[0], arr_s[1], null, arr_s[2]), arr_s[1]);
                    if(!b3.n()) {
                        this.j(linearLayout3);
                    }
                }
                if(religions1 != null) {
                    LinearLayout linearLayout4 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                    TextView textView4 = (TextView)i3.e.c(linearLayout4, 0x80, 0x7F0700F7);  // id:stat_box_title
                    j.c(textView4);
                    o1.a.U(textView4, "LOC_UI_PEDIA_PREFERENCES");
                    Q1.b b4 = new Q1.b(linearLayout4, this.q());
                    b4.h();
                    b4.a("LOC_UI_PEDIA_PREFERRED_RELIGION");
                    b4.b(new k(f.h("ICON_", religions1.getReligionType()), religions1.getName(), religions1.getReligionType(), null), religions1.getName());
                    b4.h();
                    if(!b4.n()) {
                        this.j(linearLayout4);
                    }
                }
                if(!arrayList28.isEmpty()) {
                    LinearLayout linearLayout5 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                    TextView textView5 = (TextView)i3.e.c(linearLayout5, 0x80, 0x7F0700F7);  // id:stat_box_title
                    j.c(textView5);
                    o1.a.U(textView5, "LOC_UI_PEDIA_GEOGRAPHY_AND_SOCIAL_DATA");
                    Q1.b b5 = new Q1.b(linearLayout5, this.q());
                    b5.h();
                    for(Object object38: arrayList28) {
                        b5.a(((CivilizationInfo)object38).getHeader());
                        b5.f(((CivilizationInfo)object38).getCaption());
                        b5.h();
                    }
                    if(!b5.n()) {
                        this.j(linearLayout5);
                    }
                }
                if(!arrayList25.isEmpty()) {
                    this.c("LOC_UI_PEDIA_UNIQUE_ABILITY");
                    for(Object object39: arrayList25) {
                        this.d(((Traits)object39).getName(), ((Traits)object39).getDescription());
                    }
                }
                this.a();
                return;
            }
            case 3: {
                this.s(this.p().j);
                this.p();
                if(j.a(this.p().b, "HOME")) {
                    this.f("ICON_RELIGION");
                    g.g(this, a.H("TXT_KEY_PEDIA_BELIEFS_HOMEPAGE_BLURB", new Object[0]), 2);
                    this.b(a.H("TXT_KEY_PEDIA_BELIEFS_HOMEPAGE_LABEL1", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_BELIEFS_HOMEPAGE_TEXT1", new Object[0])));
                    return;
                }
                if(j.a(this.p().c, "1")) {
                    Object object40 = null;
                    for(Object object41: ((Iterable)this.n().d0)) {
                        if(j.a(((Civ5Religions)object41).getType(), this.p().b)) {
                            object40 = object41;
                            break;
                        }
                    }
                    if(((Civ5Religions)object40) != null) {
                        String s18 = ((Civ5Religions)object40).getCivilopedia();
                        if(s18 != null) {
                            this.b(a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]), G.p(s18));
                            return;
                        }
                    }
                }
                else {
                    Object object42 = null;
                    for(Object object43: ((Iterable)this.n().e0)) {
                        if(j.a(((Civ5Beliefs)object43).getType(), this.p().b)) {
                            object42 = object43;
                            break;
                        }
                    }
                    if(((Civ5Beliefs)object42) != null) {
                        String s19 = ((Civ5Beliefs)object42).getDescription();
                        if(s19 != null) {
                            this.b(a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]), G.p(s19));
                        }
                    }
                }
                return;
            }
            case 4: {
                this.w();
                return;
            }
            case 5: {
                this.s(this.p().j);
                this.p();
                if(j.a(this.p().b, "HOME")) {
                    this.f("ICON_CITYSTATE");
                    g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_CITYSTATES", new Object[0]), 2);
                    this.b(a.H("TXT_KEY_PEDIA_CITY_STATES_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_CSTATES_HELP_TEXT", new Object[0])));
                    return;
                }
                Object object44 = null;
                for(Object object45: ((Iterable)this.n().p)) {
                    if(j.a(((Civ5MinorCivilizations)object45).getType(), this.p().b)) {
                        object44 = object45;
                        break;
                    }
                }
                if(((Civ5MinorCivilizations)object44) != null) {
                    String s20 = ((Civ5MinorCivilizations)object44).getCivilopedia();
                    if(s20 != null) {
                        this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s20));
                    }
                }
                return;
            }
            case 6: {
                this.x();
                return;
            }
            case 7: {
                this.s(this.p().j);
                this.p();
                if(j.a(this.p().b, "HOME")) {
                    this.f("ICON_CONCEPT");
                    g.g(this, "TXT_KEY_PEDIA_QUOTE_BLOCK_GCONCEPTS", 2);
                    this.b("TXT_KEY_PEDIA_GAME_CONCEPT_PAGE_LABEL", G.p("TXT_KEY_PEDIA_GAME_CONCEPT_HELP_TEXT"));
                    return;
                }
                for(Object object46: ((Iterable)this.n().a)) {
                    Civ5Concepts civ5Concepts0 = (Civ5Concepts)object46;
                    if(j.a(civ5Concepts0.getType(), this.p().b)) {
                        this.b("TXT_KEY_PEDIA_SUMMARY_LABEL", G.p(civ5Concepts0.getSummary()));
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            case 8: {
                this.y();
                return;
            }
            case 9: {
                this.z();
                return;
            }
            case 10: {
                this.A();
                return;
            }
            case 11: {
                this.B();
                return;
            }
            case 12: {
                this.C();
                return;
            }
            case 13: {
                this.D();
                return;
            }
            case 14: {
                this.E();
                return;
            }
            case 15: {
                this.F();
                return;
            }
            case 16: {
                this.G();
                return;
            }
            case 17: {
                this.H();
                return;
            }
            case 18: {
                this.I();
                return;
            }
            case 19: {
                this.J();
                return;
            }
            case 20: {
                this.K();
                return;
            }
            case 21: {
                this.s(null);
                View view0 = this.r(0x7F0A004C);  // layout:page_front_header
                ((TextView)view0.findViewById(0x7F070113)).setText(o1.a.B("LOC_UI_PEDIA_TITLE"));  // id:textView
                this.i(view0);
                this.a();
                return;
            }
            case 22: {
                this.L();
                return;
            }
            case 23: {
                this.M();
                return;
            }
            case 24: {
                this.N();
                return;
            }
            case 25: {
                this.O();
                return;
            }
            case 26: {
                this.P();
                return;
            }
            case 27: {
                this.Q();
                return;
            }
            case 28: {
                this.R();
                return;
            }
            default: {
                this.s(this.p().j);
                this.p();
                o2.f f0 = this.m();
                q q0 = this.p();
                m m0 = f0.V0.h(q0.b);
                j.c(m0);
                String s = ((Policies)m0).getPolicyType();
                o2.f f1 = this.m();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: ((Iterable)f1.U0)) {
                    if(((ObsoletePolicies)object0).getObsoletePolicy() != null && j.a(((ObsoletePolicies)object0).getPolicyType(), s)) {
                        arrayList0.add(object0);
                    }
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: arrayList0) {
                    o2.f f2 = this.m();
                    String s1 = ((ObsoletePolicies)object1).getObsoletePolicy();
                    j.c(s1);
                    Policies policies0 = (Policies)f2.V0.h(s1);
                    if(policies0 != null) {
                        arrayList1.add(policies0);
                    }
                }
                Object object2 = null;
                for(Object object3: ((List)this.m().n0.i)) {
                    if(j.a(((Governments)object3).getPolicyToUnlock(), s)) {
                        object2 = object3;
                        break;
                    }
                }
                Policies_XP1 policies_XP10 = (Policies_XP1)this.m().W0.h(s);
                if(policies_XP10 == null) {
                    s5 = null;
                    boolean0 = null;
                    s3 = null;
                }
                else {
                    String s2 = policies_XP10.getMinimumGameEra();
                    if(s2 == null) {
                        s3 = null;
                    }
                    else {
                        Eras eras0 = (Eras)this.m().d0.h(s2);
                        s3 = eras0 == null ? null : eras0.getName();
                    }
                    String s4 = policies_XP10.getMaximumGameEra();
                    if(s4 == null) {
                        s5 = null;
                    }
                    else {
                        Eras eras1 = (Eras)this.m().d0.h(s4);
                        s5 = eras1 == null ? null : eras1.getName();
                    }
                    boolean0 = Boolean.valueOf(policies_XP10.getRequiresDarkAge());
                }
                o2.f f3 = this.m();
                ArrayList arrayList2 = new ArrayList();
                for(Object object4: ((Iterable)f3.X0)) {
                    if(j.a(((Policy_GovernmentExclusives_XP2)object4).getPolicyType(), s)) {
                        arrayList2.add(object4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object5: arrayList2) {
                    String s6 = ((Policy_GovernmentExclusives_XP2)object5).getGovernmentType();
                    if(s6 != null) {
                        arrayList3.add(s6);
                    }
                }
                o2.f f4 = this.m();
                ArrayList arrayList4 = new ArrayList();
                for(Object object6: ((List)f4.n0.i)) {
                    if(j.a(((Governments)object6).getPolicyToUnlock(), s)) {
                        arrayList4.add(object6);
                    }
                }
                ArrayList arrayList5 = new ArrayList(x2.k.E(arrayList4));
                for(Object object7: arrayList4) {
                    arrayList5.add(((Governments)object7).getGovernmentType());
                }
                this.f("ICON_" + s);
                String s7 = ((Policies)m0).getDescription();
                if(s7 != null) {
                    this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{s7}));
                }
                this.a();
                LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView0);
                o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
                Q1.b b0 = new Q1.b(linearLayout0, this.q());
                b0.h();
                if(arrayList1.isEmpty()) {
                    governments0 = (Governments)object2;
                }
                else {
                    b0.a("LOC_UI_PEDIA_MADE_OBSOLETE_BY");
                    for(Object object8: arrayList1) {
                        b0.b(new k(f.h("ICON_", ((Policies)object8).getPolicyType()), ((Policies)object8).getName(), ((Policies)object8).getPolicyType(), null), ((Policies)object8).getName());
                    }
                    governments0 = (Governments)object2;
                    b0.h();
                }
                if(!b0.n()) {
                    this.j(linearLayout0);
                }
                LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView1);
                o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
                Q1.b b1 = new Q1.b(linearLayout1, this.q());
                b1.h();
                if(j.a(boolean0, Boolean.TRUE)) {
                    b1.f("LOC_UI_PEDIA_REQUIRES_DARK_AGE");
                }
                if(s3 != null) {
                    b1.f(a.H("LOC_UI_PEDIA_MIN_ERA", new Object[]{s3}));
                }
                if(s5 != null) {
                    b1.f(a.H("LOC_UI_PEDIA_MAX_ERA", new Object[]{s5}));
                }
                String s8 = ((Policies)m0).getPrereqCivic();
                if(s8 != null) {
                    Civics civics0 = (Civics)this.m().B.h(s8);
                    if(civics0 != null) {
                        b1.a("LOC_CIVIC_NAME");
                        b1.b(new k(f.h("ICON_", civics0.getCivicType()), civics0.getName(), civics0.getCivicType(), null), civics0.getName());
                    }
                }
                String s9 = ((Policies)m0).getPrereqTech();
                if(s9 != null) {
                    Technologies technologies0 = (Technologies)this.m().t1.h(s9);
                    if(technologies0 != null) {
                        b1.a("LOC_TECHNOLOGY_NAME");
                        b1.b(new k(f.h("ICON_", technologies0.getTechnologyType()), technologies0.getName(), technologies0.getTechnologyType(), null), technologies0.getName());
                    }
                }
                if(!arrayList3.isEmpty()) {
                    b1.a("LOC_GOVERNMENT_NAME");
                    for(Object object9: arrayList3) {
                        Governments governments1 = (Governments)this.m().n0.h(((String)object9));
                        if(governments1 != null) {
                            b1.b(new k(f.h("ICON_", governments1.getGovernmentType()), governments1.getName(), governments1.getGovernmentType(), null), governments1.getName());
                        }
                    }
                }
                if(!arrayList5.isEmpty()) {
                    if(arrayList3.isEmpty()) {
                        b1.a("LOC_GOVERNMENT_NAME");
                    }
                    b1.f("LOC_UI_PEDIA_REQUIRES_NOT_GOVERNMENT");
                    for(Object object10: arrayList5) {
                        Governments governments2 = (Governments)this.m().n0.h(((String)object10));
                        if(governments2 != null) {
                            b1.b(new k(f.h("ICON_", governments2.getGovernmentType()), governments2.getName(), governments2.getGovernmentType(), null), governments2.getName());
                        }
                    }
                }
                b1.h();
                if(!b1.n()) {
                    this.j(linearLayout1);
                }
                if(governments0 != null) {
                    String s10 = governments0.getGovernmentType();
                    for(Object object11: this.q().i(this.p().d)) {
                        x x0 = this.q();
                        q q1 = this.p();
                        String s11 = ((CivilopediaPageLayoutChapters)object11).getChapterId();
                        String s12 = x0.g(q1.a, s10, s11);
                        x x1 = this.q();
                        q q2 = this.p();
                        String s13 = ((CivilopediaPageLayoutChapters)object11).getChapterId();
                        ArrayList arrayList6 = x1.f(q2.a, s10, s13);
                        j.c(s12);
                        this.b(s12, arrayList6);
                    }
                }
            }
        }
    }

    public ArrayList t(Leaders leaders0) {
        ArrayList arrayList0 = x2.j.x(new Leaders[]{leaders0});
        String s = leaders0.getInheritFrom();
        if(s != null) {
            Leaders leaders1 = (Leaders)this.m().O0.h(s);
            if(leaders1 != null) {
                arrayList0.addAll(this.t(leaders1));
            }
        }
        return arrayList0;
    }

    public ArrayList u(Leaders leaders0) {
        ArrayList arrayList0 = x2.j.x(new Leaders[]{leaders0});
        String s = leaders0.getInheritFrom();
        if(s != null) {
            Leaders leaders1 = (Leaders)this.m().O0.h(s);
            if(leaders1 != null) {
                arrayList0.addAll(this.u(leaders1));
            }
        }
        return arrayList0;
    }

    private final void v() {
        Iterator iterator40;
        ArrayList arrayList35;
        String s7;
        Iterator iterator38;
        String s6;
        Iterator iterator34;
        ArrayList arrayList31;
        Iterator iterator31;
        String s5;
        ArrayList arrayList27;
        ArrayList arrayList26;
        m m0 = this.m().m().h(this.p().a());
        j.c(m0);
        Buildings buildings0 = (Buildings)m0;
        this.s(this.p().j);
        this.p();
        HashMap hashMap0 = new HashMap();
        K k0 = this.m().p();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: k0) {
            if(j.a(((Civilizations)object0).getStartingCivilizationLevelType(), "CIVILIZATION_LEVEL_CITY_STATE")) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((Civilizations)object1).getCivilizationType());
        }
        HashSet hashSet0 = new HashSet(arrayList1);
        for(Object object2: this.m().n()) {
            CivilizationLeaders civilizationLeaders0 = (CivilizationLeaders)object2;
            if(hashSet0.contains(civilizationLeaders0.getCivilizationType())) {
                hashMap0.put(civilizationLeaders0.getLeaderType(), civilizationLeaders0.getCivilizationType());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        String s = buildings0.getTraitType();
        if(s != null) {
            for(Object object3: this.m().z()) {
                LeaderTraits leaderTraits0 = (LeaderTraits)object3;
                Leaders leaders0 = (Leaders)this.m().O0.h(leaderTraits0.getLeaderType());
                if(j.a(leaderTraits0.getTraitType(), s) && leaders0 != null) {
                    String s1 = (String)hashMap0.get(leaderTraits0.getLeaderType());
                    Civilizations civilizations0 = s1 == null ? null : ((Civilizations)this.m().p().h(s1));
                    if(civilizations0 == null) {
                        arrayList2.add(new k("ICON_" + leaderTraits0.getLeaderType(), leaders0.getName(), leaderTraits0.getLeaderType()));
                    }
                    else {
                        arrayList2.add(new k(f.h("ICON_", civilizations0.getCivilizationType()), civilizations0.getName(), civilizations0.getCivilizationType()));
                    }
                }
            }
        }
        Iterable iterable0 = this.m().o();
        ArrayList arrayList3 = new ArrayList();
        for(Object object4: iterable0) {
            if(j.a(((CivilizationTraits)object4).getTraitType(), buildings0.getTraitType())) {
                arrayList3.add(object4);
            }
        }
        for(Object object5: arrayList3) {
            Civilizations civilizations1 = (Civilizations)this.m().p().h(((CivilizationTraits)object5).getCivilizationType());
            if(civilizations1 != null) {
                arrayList2.add(new k(f.h("ICON_", civilizations1.getCivilizationType()), civilizations1.getName(), civilizations1.getCivilizationType()));
            }
        }
        Object object6 = null;
        for(Object object7: this.m().c()) {
            if(j.a(((BuildingReplaces)object7).getCivUniqueBuildingType(), buildings0.getBuildingType())) {
                object6 = object7;
                break;
            }
        }
        m m1 = ((BuildingReplaces)object6) == null ? null : this.m().m().h(((BuildingReplaces)object6).getReplacesBuildingType());
        Iterable iterable1 = this.m().c();
        ArrayList arrayList4 = new ArrayList();
        for(Object object8: iterable1) {
            if(j.a(((BuildingReplaces)object8).getReplacesBuildingType(), buildings0.getBuildingType())) {
                arrayList4.add(object8);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for(Object object9: arrayList4) {
            Buildings buildings1 = (Buildings)this.m().m().h(((BuildingReplaces)object9).getCivUniqueBuildingType());
            if(buildings1 != null) {
                arrayList5.add(buildings1);
            }
        }
        m m2 = j.a(buildings0.getObsoleteEra(), "NO_ERA") ? null : this.m().x().h(buildings0.getObsoleteEra());
        Iterable iterable2 = this.m().b();
        ArrayList arrayList6 = new ArrayList();
        for(Object object10: iterable2) {
            if(j.a(((BuildingPrereqs)object10).getBuilding(), buildings0.getBuildingType())) {
                arrayList6.add(object10);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for(Object object11: arrayList6) {
            Buildings buildings2 = (Buildings)this.m().m().h(((BuildingPrereqs)object11).getPrereqBuilding());
            if(buildings2 != null) {
                arrayList7.add(buildings2);
            }
        }
        if(buildings0.getEnabledByReligion()) {
            HashSet hashSet1 = new HashSet();
            for(Object object12: this.m().c0) {
                DynamicModifiers dynamicModifiers0 = (DynamicModifiers)object12;
                if(j.a(dynamicModifiers0.getEffectType(), "EFFECT_ADD_RELIGIOUS_BUILDING")) {
                    for(Object object13: this.m().R0) {
                        Modifiers modifiers0 = (Modifiers)object13;
                        if(j.a(modifiers0.getModifierType(), dynamicModifiers0.getModifierType())) {
                            hashSet1.add(modifiers0.getModifierId());
                        }
                    }
                }
            }
            HashSet hashSet2 = new HashSet();
            for(Object object14: this.m().A()) {
                ModifierArguments modifierArguments0 = (ModifierArguments)object14;
                if(j.a(modifierArguments0.getValue(), buildings0.getBuildingType()) && hashSet1.contains(modifierArguments0.getModifierId()) && j.a(modifierArguments0.getName(), "BuildingType")) {
                    hashSet2.add(modifierArguments0.getModifierId());
                }
            }
            for(Object object15: this.m().a()) {
                BeliefModifiers beliefModifiers0 = (BeliefModifiers)object15;
                if(hashSet2.contains(beliefModifiers0.getModifierID())) {
                    Beliefs beliefs0 = (Beliefs)this.m().g.h(beliefModifiers0.getBeliefType());
                    if(beliefs0 != null) {
                        arrayList2.add(new k(f.h("ICON_", beliefs0.getBeliefType()), beliefs0.getName(), beliefs0.getBeliefType()));
                    }
                }
            }
        }
        ArrayList arrayList8 = new ArrayList();
        if(buildings0.getRequiresRiver()) {
            arrayList8.add(a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_ADJACENT_RIVER", new Object[0]));
        }
        if(buildings0.getAdjacentToMountain()) {
            arrayList8.add(a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_ADJACENT_MOUNTAIN", new Object[0]));
        }
        x2.n.G(arrayList8, new C1.a(2));
        Iterable iterable3 = this.m().B();
        ArrayList arrayList9 = new ArrayList();
        for(Object object16: iterable3) {
            if(j.a(((MutuallyExclusiveBuildings)object16).getBuilding(), buildings0.getBuildingType())) {
                arrayList9.add(object16);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for(Object object17: arrayList9) {
            Buildings buildings3 = (Buildings)this.m().m().h(((MutuallyExclusiveBuildings)object17).getMutuallyExclusiveBuilding());
            if(buildings3 != null) {
                arrayList10.add(buildings3);
            }
        }
        Iterable iterable4 = this.m().g();
        ArrayList arrayList11 = new ArrayList();
        for(Object object18: iterable4) {
            if(j.a(((Building_RequiredFeatures)object18).getBuildingType(), buildings0.getBuildingType())) {
                arrayList11.add(object18);
            }
        }
        ArrayList arrayList12 = new ArrayList();
        for(Object object19: arrayList11) {
            o2.f f0 = this.m();
            String s2 = ((Building_RequiredFeatures)object19).getFeatureType();
            Features features0 = (Features)f0.j0.h(s2);
            if(features0 != null) {
                arrayList12.add(features0);
            }
        }
        ArrayList arrayList13 = new ArrayList(x2.k.E(arrayList12));
        for(Object object20: arrayList12) {
            arrayList13.add(x2.j.x(new String[]{a.H(((Features)object20).getName(), new Object[0]), ((Features)object20).getFeatureType()}));
        }
        ArrayList arrayList14 = i.p0(arrayList13);
        Iterable iterable5 = this.m().h();
        ArrayList arrayList15 = new ArrayList();
        for(Object object21: iterable5) {
            if(j.a(((Building_ValidFeatures)object21).getBuildingType(), buildings0.getBuildingType())) {
                arrayList15.add(object21);
            }
        }
        ArrayList arrayList16 = new ArrayList();
        for(Object object22: arrayList15) {
            o2.f f1 = this.m();
            String s3 = ((Building_ValidFeatures)object22).getFeatureType();
            Features features1 = (Features)f1.j0.h(s3);
            if(features1 != null) {
                arrayList16.add(features1);
            }
        }
        ArrayList arrayList17 = new ArrayList(x2.k.E(arrayList16));
        for(Object object23: arrayList16) {
            arrayList17.add(x2.j.x(new String[]{a.H(((Features)object23).getName(), new Object[0]), ((Features)object23).getFeatureType()}));
        }
        arrayList14.addAll(arrayList17);
        Iterable iterable6 = this.m().i();
        ArrayList arrayList18 = new ArrayList();
        for(Object object24: iterable6) {
            if(j.a(((Building_ValidTerrains)object24).getBuildingType(), buildings0.getBuildingType())) {
                arrayList18.add(object24);
            }
        }
        ArrayList arrayList19 = new ArrayList();
        for(Object object25: arrayList18) {
            o2.f f2 = this.m();
            String s4 = ((Building_ValidTerrains)object25).getTerrainType();
            Terrains terrains0 = (Terrains)f2.z1.h(s4);
            if(terrains0 != null) {
                arrayList19.add(terrains0);
            }
        }
        ArrayList arrayList20 = new ArrayList();
        for(Object object26: arrayList19) {
            if(!j.a(((Terrains)object26).getTerrainType(), "TERRAIN_COAST") || !j.a(buildings0.getCoast(), Boolean.TRUE) && !buildings0.getMustBeAdjacentLand()) {
                arrayList20.add(object26);
            }
        }
        ArrayList arrayList21 = new ArrayList(x2.k.E(arrayList20));
        for(Object object27: arrayList20) {
            arrayList21.add(x2.j.x(new String[]{a.H(((Terrains)object27).getName(), new Object[0]), ((Terrains)object27).getTerrainType()}));
        }
        arrayList14.addAll(arrayList21);
        ArrayList arrayList22 = new ArrayList();
        if(buildings0.getMustBeLake()) {
            arrayList22.add(a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_LAKE", new Object[0]));
        }
        if(buildings0.getMustNotBeLake()) {
            arrayList22.add(a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_NOT_LAKE", new Object[0]));
        }
        if(j.a(buildings0.getCoast(), Boolean.TRUE) || buildings0.getMustBeAdjacentLand()) {
            arrayList22.add(a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_COAST", new Object[0]));
        }
        if(buildings0.getMustBeLake()) {
            arrayList22.add(a.H("LOC_UI_PEDIA_PLACEMENT_REQUIRES_LAKE", new Object[0]));
        }
        x2.n.G(arrayList22, new C1.a(2));
        ArrayList arrayList23 = new ArrayList(x2.k.E(arrayList22));
        for(Object object28: arrayList22) {
            arrayList23.add(x2.j.x(new String[]{((String)object28)}));
        }
        arrayList14.addAll(arrayList23);
        Iterable iterable7 = this.m().j();
        ArrayList arrayList24 = new ArrayList();
        for(Object object29: iterable7) {
            if(j.a(((Building_YieldChanges)object29).getBuildingType(), buildings0.getBuildingType())) {
                arrayList24.add(object29);
            }
        }
        ArrayList arrayList25 = new ArrayList();
        for(Object object30: arrayList24) {
            Building_YieldChanges building_YieldChanges0 = (Building_YieldChanges)object30;
            Yields yields0 = (Yields)this.m().K().h(building_YieldChanges0.getYieldType());
            if(yields0 == null) {
                arrayList26 = arrayList8;
                arrayList27 = arrayList14;
                s5 = null;
            }
            else {
                arrayList26 = arrayList8;
                arrayList27 = arrayList14;
                s5 = a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{building_YieldChanges0.getYieldChange(), yields0.getIconString(), yields0.getName()});
            }
            if(s5 != null) {
                arrayList25.add(s5);
            }
            arrayList8 = arrayList26;
            arrayList14 = arrayList27;
        }
        ArrayList arrayList28 = i.p0(arrayList25);
        Iterator iterator30 = this.m().k().iterator();
        while(iterator30.hasNext()) {
            Object object31 = iterator30.next();
            Building_YieldChangesBonusWithPower building_YieldChangesBonusWithPower0 = (Building_YieldChangesBonusWithPower)object31;
            if(j.a(building_YieldChangesBonusWithPower0.getBuildingType(), buildings0.getBuildingType())) {
                Yields yields1 = (Yields)this.m().K().h(building_YieldChangesBonusWithPower0.getYieldType());
                if(yields1 == null) {
                    iterator31 = iterator30;
                }
                else {
                    iterator31 = iterator30;
                    arrayList28.add(a.H("LOC_TYPE_TRAIT_YIELD_POWER_ENHANCEMENT", new Object[]{building_YieldChangesBonusWithPower0.getYieldChange(), yields1.getIconString(), yields1.getName()}));
                }
                iterator30 = iterator31;
            }
        }
        Iterable iterable8 = this.m().l();
        ArrayList arrayList29 = new ArrayList();
        for(Object object32: iterable8) {
            if(j.a(((Building_YieldDistrictCopies)object32).getBuildingType(), buildings0.getBuildingType())) {
                arrayList29.add(object32);
            }
        }
        ArrayList arrayList30 = new ArrayList();
        Iterator iterator33 = arrayList29.iterator();
        while(iterator33.hasNext()) {
            Object object33 = iterator33.next();
            Yields yields2 = (Yields)this.m().K().h(((Building_YieldDistrictCopies)object33).getOldYieldType());
            Yields yields3 = (Yields)this.m().K().h(((Building_YieldDistrictCopies)object33).getNewYieldType());
            if(yields2 == null || yields3 == null) {
                arrayList31 = arrayList10;
                iterator34 = iterator33;
                s6 = null;
            }
            else {
                arrayList31 = arrayList10;
                iterator34 = iterator33;
                s6 = a.H("LOC_TYPE_TRAIT_BUILDING_DISTRICT_COPY", new Object[]{yields3.getIconString(), yields3.getName(), yields2.getIconString(), yields2.getName()});
            }
            if(s6 != null) {
                arrayList30.add(s6);
            }
            iterator33 = iterator34;
            arrayList10 = arrayList31;
        }
        arrayList28.addAll(arrayList30);
        if(buildings0.getHousing() != 0) {
            arrayList28.add(a.H("LOC_TYPE_TRAIT_HOUSING", new Object[]{buildings0.getHousing()}));
        }
        if(buildings0.getEntertainment() != 0) {
            arrayList28.add(a.H("LOC_TYPE_TRAIT_AMENITY_ENTERTAINMENT", new Object[]{buildings0.getEntertainment()}));
        }
        for(Object object34: this.m().w) {
            Buildings_XP2 buildings_XP20 = (Buildings_XP2)object34;
            if(j.a(buildings_XP20.getBuildingType(), buildings0.getBuildingType()) && buildings_XP20.getEntertainmentBonusWithPower() != 0) {
                arrayList28.add(a.H("LOC_TYPE_TRAIT_AMENITY_ENTERTAINMENT_POWER_ENHANCEMENT", new Object[]{buildings_XP20.getEntertainmentBonusWithPower()}));
            }
        }
        if(buildings0.getCitizenSlots() != null) {
            Integer integer0 = buildings0.getCitizenSlots();
            if(integer0 == null || ((int)integer0) != 0) {
                arrayList28.add(a.H("LOC_TYPE_TRAIT_CITIZENS", new Object[]{buildings0.getCitizenSlots()}));
            }
        }
        if(buildings0.getOuterDefenseHitPoints() != null) {
            Integer integer1 = buildings0.getOuterDefenseHitPoints();
            if(integer1 == null || ((int)integer1) != 0) {
                arrayList28.add(a.H("LOC_TYPE_TRAIT_OUTER_DEFENSE", new Object[]{buildings0.getOuterDefenseHitPoints()}));
            }
        }
        Iterable iterable9 = this.m().e();
        ArrayList arrayList32 = new ArrayList();
        for(Object object35: iterable9) {
            if(j.a(((Building_GreatPersonPoints)object35).getBuildingType(), buildings0.getBuildingType())) {
                arrayList32.add(object35);
            }
        }
        ArrayList arrayList33 = new ArrayList();
        for(Iterator iterator37 = arrayList32.iterator(); iterator37.hasNext(); iterator37 = iterator38) {
            Object object36 = iterator37.next();
            Building_GreatPersonPoints building_GreatPersonPoints0 = (Building_GreatPersonPoints)object36;
            GreatPersonClasses greatPersonClasses0 = (GreatPersonClasses)this.m().t0.h(building_GreatPersonPoints0.getGreatPersonClassType());
            if(greatPersonClasses0 == null) {
                iterator38 = iterator37;
                s7 = null;
            }
            else {
                iterator38 = iterator37;
                s7 = a.H("LOC_TYPE_TRAIT_GREAT_PERSON_POINTS", new Object[]{building_GreatPersonPoints0.getPointsPerTurn(), greatPersonClasses0.getIconString(), greatPersonClasses0.getName()});
            }
            if(s7 != null) {
                arrayList33.add(s7);
            }
        }
        arrayList28.addAll(arrayList33);
        ArrayList arrayList34 = new ArrayList();
        Iterator iterator39 = this.m().d().iterator();
        while(iterator39.hasNext()) {
            Object object37 = iterator39.next();
            Building_CitizenYieldChanges building_CitizenYieldChanges0 = (Building_CitizenYieldChanges)object37;
            if(j.a(building_CitizenYieldChanges0.getBuildingType(), buildings0.getBuildingType())) {
                Yields yields4 = (Yields)this.m().K().h(building_CitizenYieldChanges0.getYieldType());
                if(yields4 == null) {
                    arrayList35 = arrayList7;
                    iterator40 = iterator39;
                }
                else {
                    arrayList35 = arrayList7;
                    iterator40 = iterator39;
                    arrayList34.add("[ICON_Bullet] " + a.H("LOC_TYPE_TRAIT_YIELD", new Object[]{building_CitizenYieldChanges0.getYieldChange(), yields4.getIconString(), yields4.getName()}));
                }
                iterator39 = iterator40;
                arrayList7 = arrayList35;
            }
        }
        HashMap hashMap1 = w.o(new w2.e[]{I.u("GREATWORKSLOT_ART", "LOC_TYPE_TRAIT_GREAT_WORKS_ART_SLOTS"), I.u("GREATWORKSLOT_WRITING", "LOC_TYPE_TRAIT_GREAT_WORKS_WRITING_SLOTS"), I.u("GREATWORKSLOT_MUSIC", "LOC_TYPE_TRAIT_GREAT_WORKS_MUSIC_SLOTS"), I.u("GREATWORKSLOT_RELIC", "LOC_TYPE_TRAIT_GREAT_WORKS_RELIC_SLOTS"), I.u("GREATWORKSLOT_ARTIFACT", "LOC_TYPE_TRAIT_GREAT_WORKS_ARTIFACT_SLOTS"), I.u("GREATWORKSLOT_CATHEDRAL", "LOC_TYPE_TRAIT_GREAT_WORKS_CATHEDRAL_SLOTS"), I.u("GREATWORKSLOT_PALACE", "LOC_TYPE_TRAIT_GREAT_WORKS_PALACE_SLOTS"), I.u("GREATWORKSLOT_PRODUCT", "LOC_TYPE_TRAIT_GREAT_WORKS_PRODUCT_SLOTS")});
        for(Object object38: this.m().f()) {
            Building_GreatWorks building_GreatWorks0 = (Building_GreatWorks)object38;
            if(j.a(building_GreatWorks0.getBuildingType(), buildings0.getBuildingType())) {
                String s8 = (String)hashMap1.get(building_GreatWorks0.getGreatWorkSlotType());
                if(s8 != null) {
                    arrayList28.add(a.H(s8, new Object[]{building_GreatWorks0.getNumSlots()}));
                }
            }
        }
        this.f("ICON_" + buildings0.getBuildingType());
        String s9 = buildings0.getDescription();
        if(s9 != null) {
            this.b("LOC_UI_PEDIA_DESCRIPTION", x2.j.x(new String[]{s9}));
        }
        this.a();
        String s10 = buildings0.getQuote();
        if(s10 != null) {
            g.g(this, s10, 6);
        }
        LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView0);
        o1.a.U(textView0, "LOC_UI_PEDIA_TRAITS");
        Q1.b b0 = new Q1.b(linearLayout0, this.q());
        b0.h();
        if(!arrayList2.isEmpty()) {
            b0.a("LOC_UI_PEDIA_UNIQUE_TO");
            for(Object object39: arrayList2) {
                j.c(((k)object39));
                String s11 = ((k)object39).a();
                j.c(s11);
                b0.b(((k)object39), s11);
            }
            b0.h();
        }
        if(((Buildings)m1) != null) {
            b0.a("LOC_UI_PEDIA_REPLACES");
            b0.b(new k(f.h("ICON_", ((Buildings)m1).getBuildingType()), ((Buildings)m1).getName(), ((Buildings)m1).getBuildingType()), ((Buildings)m1).getName());
        }
        if(!arrayList5.isEmpty()) {
            b0.a("LOC_UI_PEDIA_REPLACED_BY");
            for(Object object40: arrayList5) {
                b0.b(new k(f.h("ICON_", ((Buildings)object40).getBuildingType()), ((Buildings)object40).getName(), ((Buildings)object40).getBuildingType()), ((Buildings)object40).getName());
            }
        }
        if(m1 != null || !arrayList5.isEmpty()) {
            b0.h();
        }
        boolean z = buildings0.getMaxWorldInstances() != -1;
        if(((Eras)m2) != null) {
            if(z) {
                b0.a("LOC_UI_PEDIA_MADE_REMOVED_IF");
            }
            else {
                b0.a("LOC_UI_PEDIA_MADE_OBSOLETE_BY");
            }
            b0.f(((Eras)m2).getName());
            b0.h();
        }
        o2.f f3 = this.m();
        ArrayList arrayList36 = new ArrayList();
        for(Object object41: f3.p) {
            if(j.a(((Building_TourismBombs_XP2)object41).getBuildingType(), buildings0.getBuildingType())) {
                arrayList36.add(object41);
            }
        }
        ArrayList arrayList37 = new ArrayList(x2.k.E(arrayList36));
        for(Object object42: arrayList36) {
            arrayList37.add(((Building_TourismBombs_XP2)object42).getTourismBombValue());
        }
        int v = 0;
        for(Object object43: arrayList37) {
            v += ((Number)object43).intValue();
        }
        if(z) {
            v += 1000;
        }
        if(v != 0) {
            arrayList28.add(a.H("LOC_UI_PEDIA_TOURISM_BOMB_VALUE_BUILDING", new Object[]{v}));
        }
        if(!arrayList28.isEmpty()) {
            for(Object object44: arrayList28) {
                b0.f(((String)object44));
            }
            b0.h();
        }
        if(!arrayList34.isEmpty()) {
            b0.a("LOC_UI_PEDIA_CITIZEN_YIELDS");
            for(Object object45: arrayList34) {
                j.c(((String)object45));
                b0.f(((String)object45));
            }
            b0.h();
        }
        if(!b0.n()) {
            this.j(linearLayout0);
        }
        LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
        TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
        j.c(textView1);
        o1.a.U(textView1, "LOC_UI_PEDIA_REQUIREMENTS");
        Q1.b b1 = new Q1.b(linearLayout1, this.q());
        b1.h();
        if(buildings0.getPrereqTech() != null || buildings0.getPrereqCivic() != null || buildings0.getPrereqDistrict() != null || !arrayList7.isEmpty()) {
            String s12 = buildings0.getPrereqDistrict();
            if(s12 != null) {
                Districts districts0 = (Districts)this.m().w().h(s12);
                if(districts0 != null) {
                    b1.a("LOC_DISTRICT_NAME");
                    b1.b(new k(f.h("ICON_", districts0.getDistrictType()), districts0.getName(), districts0.getDistrictType()), districts0.getName());
                }
            }
            String s13 = buildings0.getPrereqCivic();
            if(s13 != null) {
                Civics civics0 = (Civics)this.m().B.h(s13);
                if(civics0 != null) {
                    b1.a("LOC_CIVIC_NAME");
                    b1.b(new k(f.h("ICON_", civics0.getCivicType()), civics0.getName(), civics0.getCivicType()), civics0.getName());
                }
            }
            String s14 = buildings0.getPrereqTech();
            if(s14 != null) {
                Technologies technologies0 = (Technologies)this.m().t1.h(s14);
                if(technologies0 != null) {
                    b1.a("LOC_TECHNOLOGY_NAME");
                    b1.b(new k(f.h("ICON_", technologies0.getTechnologyType()), technologies0.getName(), technologies0.getTechnologyType()), technologies0.getName());
                }
            }
            if(arrayList7.size() > 1) {
                b1.a("LOC_UI_PEDIA_REQUIRED_BUILDINGS_OR");
            }
            else if(arrayList7.size() == 1) {
                b1.a("LOC_BUILDING_NAME");
            }
            for(Object object46: arrayList7) {
                b1.b(new k(f.h("ICON_", ((Buildings)object46).getBuildingType()), ((Buildings)object46).getName(), ((Buildings)object46).getBuildingType()), ((Buildings)object46).getName());
            }
            b1.h();
        }
        if(buildings0.getRequiresReligion()) {
            b1.f("LOC_UI_PEDIA_REQUIRES_FOUND_RELIGION");
            b1.h();
        }
        if(!arrayList10.isEmpty()) {
            b1.a("LOC_UI_PEDIA_EXCLUSIVE_WITH");
            for(Object object47: arrayList10) {
                b1.b(new k(f.h("ICON_", ((Buildings)object47).getBuildingType()), ((Buildings)object47).getName(), ((Buildings)object47).getBuildingType()), ((Buildings)object47).getName());
            }
            b1.h();
        }
        if(buildings0.getAdjacentDistrict() != null || buildings0.getAdjacentImprovement() != null || buildings0.getAdjacentResource() != null || !arrayList14.isEmpty()) {
            b1.a("LOC_UI_PEDIA_ADJACENCY");
            String s15 = buildings0.getAdjacentDistrict();
            if(s15 != null) {
                Districts districts1 = (Districts)this.m().w().h(s15);
                if(districts1 != null) {
                    b1.b(new k(f.h("ICON_", districts1.getDistrictType()), districts1.getName(), districts1.getDistrictType()), districts1.getName());
                }
            }
            String s16 = buildings0.getAdjacentImprovement();
            if(s16 != null) {
                Improvements improvements0 = (Improvements)this.m().K0.h(s16);
                if(improvements0 != null) {
                    b1.b(new k(f.h("ICON_", improvements0.getImprovementType()), improvements0.getName(), improvements0.getImprovementType()), improvements0.getName());
                }
            }
            String s17 = buildings0.getAdjacentResource();
            if(s17 != null) {
                Resources resources0 = (Resources)this.m().o1.h(s17);
                if(resources0 != null) {
                    b1.b(new k(f.h("ICON_", resources0.getResourceType()), resources0.getName(), resources0.getResourceType()), resources0.getName());
                }
            }
            for(Object object48: arrayList8) {
                b1.f("[ICON_Bullet] " + ((String)object48));
            }
            b1.h();
        }
        if(!arrayList14.isEmpty()) {
            b1.a("LOC_UI_PEDIA_PLACEMENT");
            for(Object object49: arrayList14) {
                ArrayList arrayList38 = (ArrayList)object49;
                if(arrayList38.size() == 2) {
                    Object object50 = arrayList38.get(0);
                    j.e(object50, "get(...)");
                    Object object51 = arrayList38.get(1);
                    j.e(object51, "get(...)");
                    b1.b(new k("ICON_" + ((String)object51), ((String)object50), ((String)object51)), ((String)object50));
                }
                else {
                    b1.f("[ICON_Bullet] " + arrayList38.get(0));
                }
            }
            b1.h();
        }
        if(buildings0.getCost() != 0) {
            if(!buildings0.getMustPurchase()) {
                Yields yields5 = (Yields)this.m().K().h("YIELD_PRODUCTION");
                if(yields5 != null) {
                    b1.a("LOC_UI_PEDIA_PRODUCTION_COST");
                    b1.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{buildings0.getCost(), yields5.getIconString(), yields5.getName()}));
                }
            }
            String s18 = buildings0.getPurchaseYield();
            if(s18 != null) {
                Yields yields6 = (Yields)this.m().K().h(s18);
                if(yields6 != null) {
                    int v1 = j.a(yields6.getYieldType(), "YIELD_GOLD") ? buildings0.getCost() * 4 : buildings0.getCost() * 2;
                    b1.a("LOC_UI_PEDIA_PURCHASE_COST");
                    b1.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{v1, yields6.getIconString(), yields6.getName()}));
                }
            }
        }
        if(buildings0.getMaintenance() != 0) {
            Yields yields7 = (Yields)this.m().K().h("YIELD_GOLD");
            if(yields7 != null) {
                b1.a("LOC_UI_PEDIA_MAITENANCE_COST");
                b1.f(a.H("LOC_UI_PEDIA_BASE_COST", new Object[]{buildings0.getMaintenance(), yields7.getIconString(), yields7.getName()}));
            }
        }
        for(Object object52: this.m().w) {
            Buildings_XP2 buildings_XP21 = (Buildings_XP2)object52;
            if(j.a(buildings_XP21.getBuildingType(), buildings0.getBuildingType()) && buildings_XP21.getRequiredPower() != 0) {
                b1.a("LOC_UI_PEDIA_POWER_COST");
                b1.f(a.H("LOC_UI_PEDIA_BASE_POWER_LOAD", new Object[]{buildings_XP21.getRequiredPower()}));
            }
        }
        b1.h();
        if(!b1.n()) {
            this.j(linearLayout1);
        }
    }

    private final void w() {
        LinearLayout linearLayout2;
        Iterator iterator14;
        Object object16;
        String s = "";
        this.s(this.p().j);
        this.p();
        if(j.a(this.p().b, "HOME")) {
            if(j.a(this.p().a, "6")) {
                o2.g g0 = this.n();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: ((Iterable)g0.f)) {
                    if(((Civ5Buildings)object0).getWonderSplashImage() == null) {
                        arrayList0.add(object0);
                    }
                }
                Civ5Buildings civ5Buildings0 = (Civ5Buildings)i.g0(arrayList0, e.i);
                if(civ5Buildings0 != null) {
                    String s1 = civ5Buildings0.getType();
                    if(s1 != null) {
                        this.f("ICON_" + s1);
                        g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_BUILDINGS", new Object[0]), 2);
                        this.b(a.H("TXT_KEY_PEDIA_BUILDINGS_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_BUILDINGS_HELP_TEXT", new Object[0])));
                        return;
                    }
                }
            }
            else {
                o2.g g1 = this.n();
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: ((Iterable)g1.f)) {
                    if(((Civ5Buildings)object1).getWonderSplashImage() != null) {
                        arrayList1.add(object1);
                    }
                }
                Civ5Buildings civ5Buildings1 = (Civ5Buildings)i.g0(arrayList1, e.i);
                if(civ5Buildings1 != null) {
                    String s2 = civ5Buildings1.getType();
                    if(s2 != null) {
                        this.f("ICON_" + s2);
                        g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_WONDERS", new Object[0]), 2);
                        this.b(a.H("TXT_KEY_PEDIA_WONDERS_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_WONDERS_HELP_TEXT", new Object[0])));
                    }
                }
            }
            return;
        }
        if(j.a(this.p().c, "3")) {
            Object object2 = null;
            for(Object object3: ((Iterable)this.n().h)) {
                if(j.a(((Civ5Projects)object3).getType(), this.p().b)) {
                    object2 = object3;
                    break;
                }
            }
            if(((Civ5Projects)object2) != null) {
                this.f("ICON_" + ((Civ5Projects)object2).getType());
                String s3 = ((Civ5Projects)object2).getHelp();
                if(s3 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s3));
                }
                String s4 = ((Civ5Projects)object2).getStrategy();
                if(s4 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_STRATEGY_LABEL", new Object[0]), G.p(s4));
                }
                String s5 = ((Civ5Projects)object2).getCivilopedia();
                if(s5 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s5));
                }
                String s6 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView0);
                o1.a.U(textView0, s6);
                Q1.b b0 = new Q1.b(linearLayout0, this.q());
                b0.h();
                Integer integer0 = ((Civ5Projects)object2).getCost();
                if(integer0 != null) {
                    int v = integer0.intValue();
                    b0.a(a.H("TXT_KEY_PEDIA_COST_LABEL", new Object[0]));
                    if(v > 0) {
                        b0.f(v + " [ICON_PRODUCTION]");
                    }
                    else {
                        b0.f(a.H("TXT_KEY_FREE", new Object[0]));
                    }
                    b0.h();
                }
                String s7 = ((Civ5Projects)object2).getTechPrereq();
                if(s7 != null) {
                    Object object4 = null;
                    for(Object object5: ((Iterable)this.n().c)) {
                        if(j.a(((Civ5Technologies)object5).getType(), s7)) {
                            object4 = object5;
                            break;
                        }
                    }
                    if(((Civ5Technologies)object4) != null) {
                        b0.a(a.H("TXT_KEY_PEDIA_PREREQ_TECH_LABEL", new Object[0]));
                        k k0 = new k(f.h("ICON_", ((Civ5Technologies)object4).getType()), ((Civ5Technologies)object4).getDescription(), ((Civ5Technologies)object4).getType(), null);
                        String s8 = ((Civ5Technologies)object4).getDescription();
                        if(s8 == null) {
                            s8 = "";
                        }
                        b0.b(k0, s8);
                        b0.h();
                    }
                }
                o2.g g2 = this.n();
                ArrayList arrayList2 = new ArrayList();
                for(Object object6: ((Iterable)g2.Q)) {
                    if(j.a(((Civ5Building_ClassesNeededInCity)object6).getBuildingType(), ((Civ5Projects)object2).getType())) {
                        arrayList2.add(object6);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object7: arrayList2) {
                    Civ5Building_ClassesNeededInCity civ5Building_ClassesNeededInCity0 = (Civ5Building_ClassesNeededInCity)object7;
                    for(Object object8: ((Iterable)this.n().g)) {
                        if(!j.a(((Civ5BuildingClasses)object8).getType(), civ5Building_ClassesNeededInCity0.getBuildingClassType())) {
                            continue;
                        }
                        goto label_106;
                    }
                    object8 = null;
                label_106:
                    if(((Civ5BuildingClasses)object8) != null) {
                        arrayList3.add(((Civ5BuildingClasses)object8));
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for(Object object9: arrayList3) {
                    Civ5BuildingClasses civ5BuildingClasses0 = (Civ5BuildingClasses)object9;
                    for(Object object10: ((Iterable)this.n().f)) {
                        if(!j.a(((Civ5Buildings)object10).getType(), civ5BuildingClasses0.getDefaultBuilding())) {
                            continue;
                        }
                        goto label_120;
                    }
                    object10 = null;
                label_120:
                    if(((Civ5Buildings)object10) != null) {
                        arrayList4.add(((Civ5Buildings)object10));
                    }
                }
                if(!arrayList4.isEmpty()) {
                    Iterator iterator9 = i3.e.k("TXT_KEY_PEDIA_REQ_BLDG_LABEL", new Object[0], b0, arrayList4);
                    while(iterator9.hasNext()) {
                        Object object11 = iterator9.next();
                        k k1 = new k(f.h("ICON_", ((Civ5Buildings)object11).getType()), ((Civ5Buildings)object11).getDescription(), ((Civ5Buildings)object11).getType(), null);
                        String s9 = ((Civ5Buildings)object11).getDescription();
                        if(s9 == null) {
                            s9 = "";
                        }
                        b0.b(k1, s9);
                    }
                    b0.h();
                }
                if(!b0.n()) {
                    this.j(linearLayout0);
                }
            }
        }
        else {
            Object object12 = null;
            for(Object object13: this.n().e()) {
                if(j.a(((Civ5Buildings)object13).getType(), this.p().b)) {
                    object12 = object13;
                    break;
                }
            }
            Civ5Buildings civ5Buildings2 = (Civ5Buildings)object12;
            if(civ5Buildings2 != null) {
                this.f("ICON_" + civ5Buildings2.getType());
                String s10 = civ5Buildings2.getQuote();
                if(s10 != null) {
                    g.g(this, s10, 2);
                }
                String s11 = civ5Buildings2.getHelp();
                if(s11 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s11));
                }
                String s12 = civ5Buildings2.getStrategy();
                if(s12 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_STRATEGY_LABEL", new Object[0]), G.p(s12));
                }
                String s13 = civ5Buildings2.getCivilopedia();
                if(s13 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s13));
                }
                String s14 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView1);
                o1.a.U(textView1, s14);
                Q1.b b1 = new Q1.b(linearLayout1, this.q());
                b1.h();
                int v1 = 0;
                for(Object object14: this.n().j()) {
                    Civ5LeagueProjects civ5LeagueProjects0 = (Civ5LeagueProjects)object14;
                    Iterator iterator12 = x2.j.z(new String[]{civ5LeagueProjects0.getRewardTier1(), civ5LeagueProjects0.getRewardTier3(), civ5LeagueProjects0.getRewardTier1()}).iterator();
                    while(iterator12.hasNext()) {
                        Object object15 = iterator12.next();
                        String s15 = (String)object15;
                        Iterator iterator13 = this.n().i().iterator();
                        while(true) {
                            if(iterator13.hasNext()) {
                                object16 = iterator13.next();
                                iterator14 = iterator12;
                                if(j.a(((Civ5LeagueProjectRewards)object16).getType(), s15)) {
                                    break;
                                }
                                else {
                                    iterator12 = iterator14;
                                    continue;
                                }
                            }
                            iterator14 = iterator12;
                            object16 = null;
                            break;
                        }
                        if(((Civ5LeagueProjectRewards)object16) != null && j.a(((Civ5LeagueProjectRewards)object16).getBuilding(), this.p().b)) {
                            Integer integer1 = civ5LeagueProjects0.getCostPerPlayer();
                            v1 = integer1 == null ? 0 : ((int)integer1);
                        }
                        iterator12 = iterator14;
                    }
                }
                Integer integer2 = civ5Buildings2.getCost();
                if(integer2 == null) {
                    linearLayout2 = linearLayout1;
                }
                else {
                    int v2 = integer2.intValue();
                    Integer integer3 = civ5Buildings2.getFaithCost();
                    if(integer3 == null) {
                        linearLayout2 = linearLayout1;
                    }
                    else {
                        int v3 = integer3.intValue();
                        linearLayout2 = linearLayout1;
                        b1.a(a.H("TXT_KEY_PEDIA_COST_LABEL", new Object[0]));
                        if(v1 > 0) {
                            b1.f(a.H("TXT_KEY_LEAGUE_PROJECT_COST_PER_PLAYER", new Object[]{String.valueOf(v1)}));
                        }
                        else if(v2 == 1 && v3 > 0) {
                            b1.f(v3 + " [ICON_PEACE]");
                        }
                        else if(v2 > 0 && v3 > 0) {
                            b1.f(a.H("TXT_KEY_PEDIA_A_OR_B", new Object[]{v2 + " [ICON_PRODUCTION]", v3 + " [ICON_PEACE]"}));
                        }
                        else if(v2 > 0) {
                            b1.f(v2 + " [ICON_PRODUCTION]");
                        }
                        else if(v3 > 0) {
                            b1.f(v3 + " [ICON_PEACE]");
                        }
                        else {
                            b1.f(a.H("TXT_KEY_FREE", new Object[0]));
                        }
                        b1.h();
                    }
                }
                Integer integer4 = civ5Buildings2.getGoldMaintenance();
                if(integer4 != null) {
                    int v4 = integer4.intValue();
                    if(v4 > 0) {
                        b1.a(a.H("TXT_KEY_PEDIA_MAINT_LABEL", new Object[0]));
                        b1.f(v4 + " [ICON_GOLD]");
                        b1.h();
                    }
                }
                Integer integer5 = civ5Buildings2.getHappiness();
                if(integer5 != null) {
                    int v5 = integer5.intValue();
                    if(v5 > 0) {
                        b1.a(a.H("TXT_KEY_PEDIA_HAPPINESS_LABEL", new Object[0]));
                        b1.f(v5 + " [ICON_HAPPINESS_1]");
                        b1.h();
                    }
                }
                Integer integer6 = civ5Buildings2.getUnmoddedHappiness();
                if(integer6 != null) {
                    int v6 = integer6.intValue();
                    if(v6 > 0) {
                        b1.a(a.H("TXT_KEY_PEDIA_HAPPINESS_LABEL", new Object[0]));
                        b1.f(v6 + " [ICON_HAPPINESS_1]");
                        b1.h();
                    }
                }
                int v7 = this.S(civ5Buildings2, "YIELD_CULTURE");
                if(v7 > 0) {
                    b1.a(a.H("TXT_KEY_PEDIA_CULTURE_LABEL", new Object[0]));
                    b1.f(v7 + " [ICON_CULTURE]");
                    b1.h();
                }
                int v8 = this.S(civ5Buildings2, "YIELD_FAITH");
                if(v8 > 0) {
                    b1.a(a.H("TXT_KEY_PEDIA_FAITH_LABEL", new Object[0]));
                    b1.f(v8 + " [ICON_PEACE]");
                    b1.h();
                }
                ArrayList arrayList5 = new ArrayList();
                Integer integer7 = civ5Buildings2.getDefense();
                if(integer7 != null) {
                    int v9 = integer7.intValue();
                    if(v9 > 0) {
                        arrayList5.add(((double)v9) / 100.0 + " [ICON_STRENGTH]");
                    }
                }
                Integer integer8 = civ5Buildings2.getExtraCityHitPoints();
                if(integer8 != null) {
                    int v10 = integer8.intValue();
                    if(v10 > 0) {
                        arrayList5.add(a.H("TXT_KEY_PEDIA_DEFENSE_HITPOINTS", new Object[]{String.valueOf(v10)}));
                    }
                }
                if(!arrayList5.isEmpty()) {
                    b1.a(a.H("TXT_KEY_PEDIA_DEFENSE_LABEL", new Object[0]));
                    b1.f(i.Y(arrayList5, ", ", null, null, null, 62));
                    b1.h();
                }
                int v11 = this.S(civ5Buildings2, "YIELD_FOOD");
                if(v11 > 0) {
                    b1.a(a.H("TXT_KEY_PEDIA_FOOD_LABEL", new Object[0]));
                    b1.f("+" + v11 + " [ICON_FOOD]");
                    b1.h();
                }
                Iterable iterable0 = x2.j.z(new w2.e[]{new w2.e(this.S(civ5Buildings2, "YIELD_GOLD"), ""), new w2.e(this.T(civ5Buildings2, "YIELD_GOLD"), "%")});
                ArrayList arrayList6 = new ArrayList();
                for(Object object17: iterable0) {
                    if(((Number)((w2.e)object17).i).intValue() > 0) {
                        arrayList6.add(object17);
                    }
                }
                if(!arrayList6.isEmpty()) {
                    Iterator iterator16 = i3.e.k("TXT_KEY_PEDIA_GOLD_LABEL", new Object[0], b1, arrayList6);
                    while(iterator16.hasNext()) {
                        Object object18 = iterator16.next();
                        b1.f("+" + ((w2.e)object18).i + ((w2.e)object18).j + " [ICON_GOLD]");
                    }
                    b1.h();
                }
                Iterable iterable1 = x2.j.z(new w2.e[]{new w2.e(this.S(civ5Buildings2, "YIELD_SCIENCE"), ""), new w2.e(this.T(civ5Buildings2, "YIELD_SCIENCE"), "%")});
                ArrayList arrayList7 = new ArrayList();
                for(Object object19: iterable1) {
                    if(((Number)((w2.e)object19).i).intValue() > 0) {
                        arrayList7.add(object19);
                    }
                }
                if(!arrayList7.isEmpty()) {
                    Iterator iterator18 = i3.e.k("TXT_KEY_PEDIA_SCIENCE_LABEL", new Object[0], b1, arrayList7);
                    while(iterator18.hasNext()) {
                        Object object20 = iterator18.next();
                        b1.f("+" + ((w2.e)object20).i + ((w2.e)object20).j + " [ICON_RESEARCH]");
                    }
                    b1.h();
                }
                Iterable iterable2 = x2.j.z(new w2.e[]{new w2.e(this.S(civ5Buildings2, "YIELD_PRODUCTION"), ""), new w2.e(this.T(civ5Buildings2, "YIELD_PRODUCTION"), "%")});
                ArrayList arrayList8 = new ArrayList();
                for(Object object21: iterable2) {
                    if(((Number)((w2.e)object21).i).intValue() > 0) {
                        arrayList8.add(object21);
                    }
                }
                if(!arrayList8.isEmpty()) {
                    Iterator iterator20 = i3.e.k("TXT_KEY_PEDIA_PRODUCTION_LABEL", new Object[0], b1, arrayList8);
                    while(iterator20.hasNext()) {
                        Object object22 = iterator20.next();
                        b1.f("+" + ((w2.e)object22).i + ((w2.e)object22).j + " [ICON_PRODUCTION]");
                    }
                    b1.h();
                }
                Iterable iterable3 = this.n().f();
                ArrayList arrayList9 = new ArrayList();
                for(Object object23: iterable3) {
                    if(j.a(((Civ5Civilization_BuildingClassOverrides)object23).getBuildingType(), civ5Buildings2.getType())) {
                        arrayList9.add(object23);
                    }
                }
                Civ5Civilizations civ5Civilizations0 = null;
                Civ5Buildings civ5Buildings3 = null;
                for(Object object24: arrayList9) {
                    Civ5Civilization_BuildingClassOverrides civ5Civilization_BuildingClassOverrides0 = (Civ5Civilization_BuildingClassOverrides)object24;
                    if(!j.a(civ5Civilization_BuildingClassOverrides0.getCivilizationType(), "CIVILIZATION_BARBARIAN") && !j.a(civ5Civilization_BuildingClassOverrides0.getCivilizationType(), "CIVILIZATION_MINOR")) {
                        Iterable iterable4 = this.n().a();
                        ArrayList arrayList10 = new ArrayList();
                        for(Object object25: iterable4) {
                            if(j.a(((Civ5BuildingClasses)object25).getType(), civ5Civilization_BuildingClassOverrides0.getBuildingClassType())) {
                                arrayList10.add(object25);
                            }
                        }
                        for(Object object26: arrayList10) {
                            Civ5BuildingClasses civ5BuildingClasses1 = (Civ5BuildingClasses)object26;
                            for(Object object27: this.n().e()) {
                                if(!j.a(((Civ5Buildings)object27).getType(), civ5BuildingClasses1.getDefaultBuilding())) {
                                    continue;
                                }
                                goto label_348;
                            }
                            object27 = null;
                        label_348:
                            civ5Buildings3 = (Civ5Buildings)object27;
                        }
                        if(civ5Buildings3 != null) {
                            for(Object object28: this.n().g()) {
                                if(!j.a(((Civ5Civilizations)object28).getType(), civ5Civilization_BuildingClassOverrides0.getCivilizationType())) {
                                    continue;
                                }
                                goto label_357;
                            }
                            object28 = null;
                        label_357:
                            civ5Civilizations0 = (Civ5Civilizations)object28;
                        }
                    }
                }
                String s16 = civ5Buildings2.getSpecialistType();
                if(s16 != null) {
                    Integer integer9 = civ5Buildings2.getGreatPeopleRateChange();
                    if(integer9 != null) {
                        int v12 = integer9.intValue();
                        if(v12 > 0) {
                            Object object29 = null;
                            for(Object object30: this.n().l()) {
                                if(j.a(((Civ5Specialists)object30).getType(), s16)) {
                                    object29 = object30;
                                    break;
                                }
                            }
                            if(((Civ5Specialists)object29) != null) {
                                String s17 = ((Civ5Specialists)object29).getGreatPeopleTitle();
                                if(s17 != null) {
                                    b1.a(s17);
                                    b1.f(v12 + " [ICON_GREAT_PEOPLE]");
                                    b1.h();
                                }
                            }
                        }
                    }
                }
                if(civ5Civilizations0 != null) {
                    b1.a(a.H("TXT_KEY_PEDIA_CIVILIZATIONS_LABEL", new Object[0]));
                    b1.b(new k(f.h("ICON_", civ5Civilizations0.getType()), civ5Civilizations0.getDescription(), civ5Civilizations0.getType(), null), (civ5Civilizations0.getShortDescription() == null ? "" : civ5Civilizations0.getShortDescription()));
                    b1.h();
                }
                String s18 = civ5Buildings2.getPrereqTech();
                if(s18 != null) {
                    Object object31 = null;
                    for(Object object32: this.n().m()) {
                        if(j.a(((Civ5Technologies)object32).getType(), s18)) {
                            object31 = object32;
                            break;
                        }
                    }
                    if(((Civ5Technologies)object31) != null) {
                        b1.a(a.H("TXT_KEY_PEDIA_PREREQ_TECH_LABEL", new Object[0]));
                        k k2 = new k(f.h("ICON_", ((Civ5Technologies)object31).getType()), ((Civ5Technologies)object31).getDescription(), ((Civ5Technologies)object31).getType(), null);
                        String s19 = ((Civ5Technologies)object31).getDescription();
                        if(s19 == null) {
                            s19 = "";
                        }
                        b1.b(k2, s19);
                        b1.h();
                    }
                }
                Iterable iterable5 = this.n().b();
                ArrayList arrayList11 = new ArrayList();
                for(Object object33: iterable5) {
                    if(j.a(((Civ5Building_ClassesNeededInCity)object33).getBuildingType(), civ5Buildings2.getType())) {
                        arrayList11.add(object33);
                    }
                }
                ArrayList arrayList12 = new ArrayList();
                for(Object object34: arrayList11) {
                    Civ5Building_ClassesNeededInCity civ5Building_ClassesNeededInCity1 = (Civ5Building_ClassesNeededInCity)object34;
                    for(Object object35: this.n().a()) {
                        if(!j.a(((Civ5BuildingClasses)object35).getType(), civ5Building_ClassesNeededInCity1.getBuildingClassType())) {
                            continue;
                        }
                        goto label_416;
                    }
                    object35 = null;
                label_416:
                    if(((Civ5BuildingClasses)object35) != null) {
                        arrayList12.add(((Civ5BuildingClasses)object35));
                    }
                }
                ArrayList arrayList13 = new ArrayList();
                for(Object object36: arrayList12) {
                    Civ5BuildingClasses civ5BuildingClasses2 = (Civ5BuildingClasses)object36;
                    for(Object object37: this.n().e()) {
                        if(!j.a(((Civ5Buildings)object37).getType(), civ5BuildingClasses2.getDefaultBuilding())) {
                            continue;
                        }
                        goto label_430;
                    }
                    object37 = null;
                label_430:
                    if(((Civ5Buildings)object37) != null) {
                        arrayList13.add(((Civ5Buildings)object37));
                    }
                }
                if(!arrayList13.isEmpty()) {
                    Iterator iterator34 = i3.e.k("TXT_KEY_PEDIA_REQ_BLDG_LABEL", new Object[0], b1, arrayList13);
                    while(iterator34.hasNext()) {
                        Object object38 = iterator34.next();
                        k k3 = new k(f.h("ICON_", ((Civ5Buildings)object38).getType()), ((Civ5Buildings)object38).getDescription(), ((Civ5Buildings)object38).getType(), null);
                        String s20 = ((Civ5Buildings)object38).getDescription();
                        if(s20 == null) {
                            s20 = "";
                        }
                        b1.b(k3, s20);
                    }
                    b1.h();
                }
                Integer integer10 = civ5Buildings2.getGreatWorkCount();
                if(integer10 != null) {
                    int v13 = integer10.intValue();
                    String s21 = civ5Buildings2.getGreatWorkSlotType();
                    if(s21 != null) {
                        Object object39 = null;
                        for(Object object40: this.n().h()) {
                            if(j.a(((Civ5GreatWorkSlots)object40).getType(), s21)) {
                                object39 = object40;
                                break;
                            }
                        }
                        if(((Civ5GreatWorkSlots)object39) != null && v13 > 0) {
                            b1.a(a.H("TXT_KEY_PEDIA_GREAT_WORKS_LABEL", new Object[0]));
                            if(1 <= v13) {
                                for(int v14 = 1; true; ++v14) {
                                    String s22 = ((Civ5GreatWorkSlots)object39).getEmptyToolTipText();
                                    String s23 = ("CIV5_ICON_" + n.F0(((Civ5GreatWorkSlots)object39).getEmptyIcon(), ".dds", "")).toLowerCase(Locale.ROOT);
                                    j.e(s23, "toLowerCase(...)");
                                    j.f(s22, "text");
                                    View view0 = b1.m(0x7F0A0053);  // layout:page_stat_box_great_work_civ5
                                    ImageView imageView0 = (ImageView)view0.findViewById(0x7F07008E);  // id:icon
                                    TextView textView2 = (TextView)view0.findViewById(0x7F07010F);  // id:text
                                    j.c(textView2);
                                    o1.a.V(textView2, s22);
                                    j.c(imageView0);
                                    o1.a.Q(imageView0, s23);
                                    b1.i(view0);
                                    if(v14 == v13) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                Iterable iterable6 = this.n().c();
                ArrayList arrayList14 = new ArrayList();
                for(Object object41: iterable6) {
                    if(j.a(((Civ5Building_LocalResourceAnds)object41).getBuildingType(), civ5Buildings2.getType())) {
                        arrayList14.add(object41);
                    }
                }
                ArrayList arrayList15 = new ArrayList();
                for(Object object42: arrayList14) {
                    Civ5Building_LocalResourceAnds civ5Building_LocalResourceAnds0 = (Civ5Building_LocalResourceAnds)object42;
                    for(Object object43: this.n().k()) {
                        if(!j.a(((Civ5Resources)object43).getType(), civ5Building_LocalResourceAnds0.getResourceType())) {
                            continue;
                        }
                        goto label_493;
                    }
                    object43 = null;
                label_493:
                    if(((Civ5Resources)object43) != null) {
                        arrayList15.add(((Civ5Resources)object43));
                    }
                }
                if(!arrayList15.isEmpty()) {
                    Iterator iterator39 = i3.e.k("TXT_KEY_PEDIA_LOCAL_RESRC_LABEL", new Object[0], b1, arrayList15);
                    while(iterator39.hasNext()) {
                        Object object44 = iterator39.next();
                        k k4 = new k(f.h("ICON_", ((Civ5Resources)object44).getType()), ((Civ5Resources)object44).getDescription(), ((Civ5Resources)object44).getType(), null);
                        String s24 = ((Civ5Resources)object44).getDescription();
                        if(s24 == null) {
                            s24 = "";
                        }
                        b1.b(k4, s24);
                    }
                    b1.h();
                }
                Iterable iterable7 = this.n().d();
                ArrayList arrayList16 = new ArrayList();
                for(Object object45: iterable7) {
                    if(j.a(((Civ5Building_ResourceQuantityRequirements)object45).getBuildingType(), civ5Buildings2.getType())) {
                        arrayList16.add(object45);
                    }
                }
                ArrayList arrayList17 = new ArrayList();
                for(Object object46: arrayList16) {
                    Civ5Building_ResourceQuantityRequirements civ5Building_ResourceQuantityRequirements0 = (Civ5Building_ResourceQuantityRequirements)object46;
                    for(Object object47: this.n().k()) {
                        if(!j.a(((Civ5Resources)object47).getType(), civ5Building_ResourceQuantityRequirements0.getResourceType())) {
                            continue;
                        }
                        goto label_526;
                    }
                    object47 = null;
                label_526:
                    if(((Civ5Resources)object47) != null) {
                        arrayList17.add(((Civ5Resources)object47));
                    }
                }
                if(!arrayList17.isEmpty()) {
                    Iterator iterator43 = i3.e.k("TXT_KEY_PEDIA_REQ_RESRC_LABEL", new Object[0], b1, arrayList17);
                    while(iterator43.hasNext()) {
                        Object object48 = iterator43.next();
                        k k5 = new k(f.h("ICON_", ((Civ5Resources)object48).getType()), ((Civ5Resources)object48).getDescription(), ((Civ5Resources)object48).getType(), null);
                        String s25 = ((Civ5Resources)object48).getDescription();
                        if(s25 == null) {
                            s25 = "";
                        }
                        b1.b(k5, s25);
                    }
                    b1.h();
                }
                String s26 = civ5Buildings2.getSpecialistType();
                if(s26 != null) {
                    Integer integer11 = civ5Buildings2.getSpecialistCount();
                    if(integer11 != null) {
                        int v15 = integer11.intValue();
                        if(v15 > 0) {
                            Object object49 = null;
                            for(Object object50: this.n().l()) {
                                if(j.a(((Civ5Specialists)object50).getType(), s26)) {
                                    object49 = object50;
                                    break;
                                }
                            }
                            if(((Civ5Specialists)object49) != null) {
                                b1.a(a.H("TXT_KEY_PEDIA_SPEC_LABEL", new Object[0]));
                                for(int v16 = 0; v16 < v15; ++v16) {
                                    k k6 = new k(f.h("ICON_", ((Civ5Specialists)object49).getType()), ((Civ5Specialists)object49).getDescription(), ((Civ5Specialists)object49).getType(), null);
                                    String s27 = ((Civ5Specialists)object49).getDescription();
                                    if(s27 == null) {
                                        s27 = "";
                                    }
                                    b1.b(k6, s27);
                                }
                                b1.h();
                            }
                        }
                    }
                }
                if(civ5Buildings3 != null) {
                    b1.a(a.H("TXT_KEY_PEDIA_REPLACES_LABEL", new Object[0]));
                    k k7 = new k(f.h("ICON_", civ5Buildings3.getType()), civ5Buildings3.getDescription(), civ5Buildings3.getType(), null);
                    String s28 = civ5Buildings3.getDescription();
                    if(s28 != null) {
                        s = s28;
                    }
                    b1.b(k7, s);
                    b1.h();
                }
                if(!b1.n()) {
                    this.j(linearLayout2);
                }
            }
        }
    }

    private final void x() {
        w2.k k4;
        Object object0 = null;
        if(j.a(this.p().b, "HOME")) {
            this.s(this.p().j);
            this.p();
            o2.g g0 = this.n();
            ArrayList arrayList0 = new ArrayList();
            for(Object object1: ((Iterable)g0.m)) {
                if(!j.a(((Civ5Leaders)object1).getType(), "LEADER_BARBARIAN")) {
                    arrayList0.add(object1);
                }
            }
            Civ5Leaders civ5Leaders0 = (Civ5Leaders)i.g0(arrayList0, e.i);
            if(civ5Leaders0 != null) {
                String s = civ5Leaders0.getType();
                if(s != null) {
                    this.f("ICON_" + s);
                }
            }
            g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_CIVS", new Object[0]), 2);
            this.b(a.H("TXT_KEY_PEDIA_CIVILIZATIONS_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_CIVS_HELP_TEXT", new Object[0])));
            return;
        }
        if(j.a(this.p().c, "1")) {
            Object object2 = null;
            this.s(this.p().j);
            this.p();
            for(Object object3: ((Iterable)this.n().l)) {
                if(j.a(((Civ5Civilizations)object3).getType(), this.p().b)) {
                    object2 = object3;
                    break;
                }
            }
            if(((Civ5Civilizations)object2) != null) {
                Object object4 = null;
                this.f("ICON_" + ((Civ5Civilizations)object2).getType());
                String s1 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView0);
                o1.a.U(textView0, s1);
                Q1.b b0 = new Q1.b(linearLayout0, this.q());
                b0.h();
                for(Object object5: ((Iterable)this.n().n)) {
                    if(j.a(((Civ5Civilization_Leaders)object5).getCivilizationType(), ((Civ5Civilizations)object2).getType())) {
                        object4 = object5;
                        break;
                    }
                }
                if(((Civ5Civilization_Leaders)object4) != null) {
                    Object object6 = null;
                    for(Object object7: ((Iterable)this.n().m)) {
                        if(j.a(((Civ5Leaders)object7).getType(), ((Civ5Civilization_Leaders)object4).getLeaderheadType())) {
                            object6 = object7;
                            break;
                        }
                    }
                    if(((Civ5Leaders)object6) != null) {
                        b0.a(a.H("TXT_KEY_PEDIA_LEADERS_LABEL", new Object[0]));
                        k k0 = new k(f.h("ICON_", ((Civ5Leaders)object6).getType()), ((Civ5Leaders)object6).getDescription(), ((Civ5Leaders)object6).getType(), null);
                        String s2 = ((Civ5Leaders)object6).getDescription();
                        j.c(s2);
                        b0.b(k0, s2);
                        b0.h();
                    }
                }
                o2.g g1 = this.n();
                ArrayList arrayList1 = new ArrayList();
                for(Object object8: ((Iterable)g1.N)) {
                    if(j.a(((Civ5Civilization_UnitClassOverrides)object8).getCivilizationType(), ((Civ5Civilizations)object2).getType()) && ((Civ5Civilization_UnitClassOverrides)object8).getUnitType() != null) {
                        arrayList1.add(object8);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for(Object object9: arrayList1) {
                    Civ5Civilization_UnitClassOverrides civ5Civilization_UnitClassOverrides0 = (Civ5Civilization_UnitClassOverrides)object9;
                    for(Object object10: ((Iterable)this.n().d)) {
                        if(!j.a(((Civ5Units)object10).getType(), civ5Civilization_UnitClassOverrides0.getUnitType())) {
                            continue;
                        }
                        goto label_77;
                    }
                    object10 = null;
                label_77:
                    if(((Civ5Units)object10) != null) {
                        arrayList2.add(((Civ5Units)object10));
                    }
                }
                if(!arrayList2.isEmpty()) {
                    Iterator iterator7 = i3.e.k("TXT_KEY_PEDIA_UNIQUEUNIT_LABEL", new Object[0], b0, arrayList2);
                    while(iterator7.hasNext()) {
                        Object object11 = iterator7.next();
                        k k1 = new k(f.h("ICON_", ((Civ5Units)object11).getType()), ((Civ5Units)object11).getDescription(), ((Civ5Units)object11).getType(), null);
                        String s3 = ((Civ5Units)object11).getDescription();
                        j.c(s3);
                        b0.b(k1, s3);
                    }
                    b0.h();
                }
                o2.g g2 = this.n();
                ArrayList arrayList3 = new ArrayList();
                for(Object object12: ((Iterable)g2.T)) {
                    if(j.a(((Civ5Civilization_BuildingClassOverrides)object12).getCivilizationType(), ((Civ5Civilizations)object2).getType()) && ((Civ5Civilization_BuildingClassOverrides)object12).getBuildingType() != null) {
                        arrayList3.add(object12);
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                for(Object object13: arrayList3) {
                    Civ5Civilization_BuildingClassOverrides civ5Civilization_BuildingClassOverrides0 = (Civ5Civilization_BuildingClassOverrides)object13;
                    for(Object object14: ((Iterable)this.n().f)) {
                        if(!j.a(((Civ5Buildings)object14).getType(), civ5Civilization_BuildingClassOverrides0.getBuildingType())) {
                            continue;
                        }
                        goto label_109;
                    }
                    object14 = null;
                label_109:
                    if(((Civ5Buildings)object14) != null) {
                        arrayList4.add(((Civ5Buildings)object14));
                    }
                }
                if(!arrayList4.isEmpty()) {
                    Iterator iterator11 = i3.e.k("TXT_KEY_PEDIA_UNIQUEBLDG_LABEL", new Object[0], b0, arrayList4);
                    while(iterator11.hasNext()) {
                        Object object15 = iterator11.next();
                        k k2 = new k(f.h("ICON_", ((Civ5Buildings)object15).getType()), ((Civ5Buildings)object15).getDescription(), ((Civ5Buildings)object15).getType(), null);
                        String s4 = ((Civ5Buildings)object15).getDescription();
                        j.c(s4);
                        b0.b(k2, s4);
                    }
                    b0.h();
                }
                o2.g g3 = this.n();
                ArrayList arrayList5 = new ArrayList();
                for(Object object16: ((Iterable)g3.u)) {
                    if(j.a(((Civ5Improvements)object16).getCivilizationType(), ((Civ5Civilizations)object2).getType())) {
                        arrayList5.add(object16);
                    }
                }
                if(!arrayList5.isEmpty()) {
                    Iterator iterator13 = i3.e.k("TXT_KEY_PEDIA_UNIQUEIMPRV_LABEL", new Object[0], b0, arrayList5);
                    while(iterator13.hasNext()) {
                        Object object17 = iterator13.next();
                        k k3 = new k(f.h("ICON_", ((Civ5Improvements)object17).getType()), ((Civ5Improvements)object17).getDescription(), ((Civ5Improvements)object17).getType(), null);
                        String s5 = ((Civ5Improvements)object17).getDescription();
                        j.c(s5);
                        b0.b(k3, s5);
                    }
                    b0.h();
                }
                if(!b0.n()) {
                    this.j(linearLayout0);
                }
                String s6 = ((Civ5Civilizations)object2).getCivilopediaTag();
                if(s6 != null) {
                    for(int v = 1; true; ++v) {
                        String s7 = s6 + "_HEADING_" + v;
                        String s8 = s6 + "_TEXT_" + v;
                        if(!a.D(s7) || !a.D(s8)) {
                            break;
                        }
                        this.b(a.H(s7, new Object[0]), G.p(a.H(s8, new Object[0])));
                    }
                    if(a.D((s6 + "_FACTOID_HEADING")) && a.D((s6 + "_FACTOID_TEXT"))) {
                        this.b(a.H((s6 + "_FACTOID_HEADING"), new Object[0]), G.p(a.H((s6 + "_FACTOID_TEXT"), new Object[0])));
                    }
                }
            }
        }
        else {
            Object object18 = null;
            for(Object object19: ((Iterable)this.n().m)) {
                if(j.a(((Civ5Leaders)object19).getType(), this.p().b)) {
                    object18 = object19;
                    break;
                }
            }
            if(((Civ5Leaders)object18) != null) {
                String s9 = ((Civ5Leaders)object18).getCivilopediaTag();
                if(s9 == null) {
                    k4 = null;
                }
                else {
                    this.s(a.H((s9 + "_NAME"), new Object[0]));
                    a.H((s9 + "_SUBTITLE"), new Object[0]);
                    k4 = w2.k.a;
                }
                if(k4 == null) {
                    this.s(((Civ5Leaders)object18).getDescription());
                }
                this.f("ICON_" + ((Civ5Leaders)object18).getType());
                String s10 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView1);
                o1.a.U(textView1, s10);
                Q1.b b1 = new Q1.b(linearLayout1, this.q());
                b1.h();
                String s11 = ((Civ5Leaders)object18).getCivilopediaTag();
                if(s11 != null) {
                    b1.a(a.H("TXT_KEY_PEDIA_LIVED_LABEL", new Object[0]));
                    b1.f(a.H((s11 + "_LIVED"), new Object[0]));
                    b1.h();
                    ArrayList arrayList6 = new ArrayList();
                    for(int v1 = 1; true; ++v1) {
                        String s12 = s11 + "_TITLES_" + v1;
                        if(!a.D(s12)) {
                            break;
                        }
                        arrayList6.add(a.H(s12, new Object[0]));
                    }
                    b1.a(a.H("TXT_KEY_PEDIA_TITLES_LABEL", new Object[0]));
                    b1.f(i.Y(arrayList6, "[NEWLINE][NEWLINE]", null, null, null, 62));
                    b1.h();
                }
                Object object20 = null;
                for(Object object21: ((Iterable)this.n().n)) {
                    if(j.a(((Civ5Civilization_Leaders)object21).getLeaderheadType(), ((Civ5Leaders)object18).getType())) {
                        object20 = object21;
                        break;
                    }
                }
                if(((Civ5Civilization_Leaders)object20) != null) {
                    String s13 = ((Civ5Civilization_Leaders)object20).getCivilizationType();
                    if(s13 != null) {
                        Object object22 = null;
                        for(Object object23: ((Iterable)this.n().l)) {
                            if(j.a(((Civ5Civilizations)object23).getType(), s13)) {
                                object22 = object23;
                                break;
                            }
                        }
                        if(((Civ5Civilizations)object22) != null) {
                            b1.a(a.H("TXT_KEY_PEDIA_CIVILIZATIONS_LABEL", new Object[0]));
                            k k5 = new k(f.h("ICON_", ((Civ5Civilizations)object22).getType()), ((Civ5Civilizations)object22).getDescription(), ((Civ5Civilizations)object22).getType(), null);
                            String s14 = ((Civ5Civilizations)object22).getShortDescription();
                            if(s14 == null) {
                                s14 = "";
                            }
                            b1.b(k5, s14);
                            b1.h();
                        }
                    }
                }
                if(!b1.n()) {
                    this.j(linearLayout1);
                }
                Object object24 = null;
                for(Object object25: ((Iterable)this.n().V)) {
                    if(j.a(((Civ5Leader_Traits)object25).getLeaderType(), ((Civ5Leaders)object18).getType())) {
                        object24 = object25;
                        break;
                    }
                }
                if(((Civ5Leader_Traits)object24) != null) {
                    String s15 = ((Civ5Leader_Traits)object24).getTraitType();
                    if(s15 != null) {
                        for(Object object26: ((Iterable)this.n().W)) {
                            if(j.a(((Civ5Traits)object26).getType(), s15)) {
                                object0 = object26;
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                        if(((Civ5Traits)object0) != null) {
                            String s16 = a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]);
                            String s17 = ((Civ5Traits)object0).getShortDescription();
                            j.c(s17);
                            String s18 = a.H(s17, new Object[0]);
                            String s19 = ((Civ5Traits)object0).getDescription();
                            j.c(s19);
                            this.b(s16, G.p((s18 + "[NEWLINE][NEWLINE]" + a.H(s19, new Object[0]))));
                        }
                    }
                }
                String s20 = ((Civ5Leaders)object18).getCivilopediaTag();
                if(s20 != null) {
                    for(int v2 = 1; true; ++v2) {
                        String s21 = s20 + "_HEADING_" + v2;
                        String s22 = s20 + "_TEXT_" + v2;
                        if(!a.D(s21) || !a.D(s22)) {
                            break;
                        }
                        this.b(a.H(s21, new Object[0]), G.p(a.H(s22, new Object[0])));
                    }
                    for(int v3 = 1; true; ++v3) {
                        String s23 = s20 + "_FACT_" + v3;
                        if(!a.D(s23)) {
                            break;
                        }
                        this.b(a.H("TXT_KEY_PEDIA_FACTOID", new Object[0]), G.p(a.H(s23, new Object[0])));
                    }
                }
            }
        }
    }

    private final void y() {
        String s5;
        String s = "";
        this.s(this.p().j);
        this.p();
        if(j.a(this.p().b, "HOME")) {
            Civ5Improvements civ5Improvements0 = (Civ5Improvements)i.g0(((List)(((Collection)this.n().u))), e.i);
            if(civ5Improvements0 != null) {
                String s1 = civ5Improvements0.getType();
                if(s1 != null) {
                    this.f("ICON_" + s1);
                    g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_IMPROVEMENTS", new Object[0]), 2);
                    this.b(a.H("TXT_KEY_PEDIA_IMPROVEMENTS_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_IMPROVEMENT_HELP_TEXT", new Object[0])));
                }
            }
            return;
        }
        if(n.H0(this.p().b, "IMPROVEMENT")) {
            Object object0 = null;
            for(Object object1: ((Iterable)this.n().u)) {
                if(j.a(((Civ5Improvements)object1).getType(), this.p().b)) {
                    object0 = object1;
                    break;
                }
            }
            if(((Civ5Improvements)object0) != null) {
                this.f("ICON_" + ((Civ5Improvements)object0).getType());
                String s2 = ((Civ5Improvements)object0).getHelp();
                if(s2 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s2));
                }
                String s3 = ((Civ5Improvements)object0).getCivilopedia();
                if(s3 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s3));
                }
                String s4 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView0);
                o1.a.U(textView0, s4);
                Q1.b b0 = new Q1.b(linearLayout0, this.q());
                b0.h();
                o2.g g0 = this.n();
                ArrayList arrayList0 = new ArrayList();
                for(Object object2: ((Iterable)g0.C)) {
                    if(j.a(((Civ5Improvement_Yields)object2).getImprovementType(), ((Civ5Improvements)object0).getType())) {
                        arrayList0.add(object2);
                    }
                }
                ArrayList arrayList1 = new ArrayList();
                for(Object object3: arrayList0) {
                    Civ5Improvement_Yields civ5Improvement_Yields0 = (Civ5Improvement_Yields)object3;
                    for(Object object4: ((Iterable)this.n().H)) {
                        if(!j.a(((Civ5Yields)object4).getType(), civ5Improvement_Yields0.getYieldType())) {
                            continue;
                        }
                        goto label_53;
                    }
                    object4 = null;
                label_53:
                    if(((Civ5Yields)object4) == null) {
                        s5 = null;
                    }
                    else {
                        Integer integer0 = civ5Improvement_Yields0.getYield();
                        j.c(integer0);
                        s5 = (((int)integer0) <= 0 ? "" : "+") + civ5Improvement_Yields0.getYield() + ((Civ5Yields)object4).getIconString();
                    }
                    if(s5 != null) {
                        arrayList1.add(s5);
                    }
                }
                if(!arrayList1.isEmpty()) {
                    b0.a(a.H("TXT_KEY_PEDIA_YIELD_LABEL", new Object[0]));
                    b0.f(i.Y(arrayList1, " ", null, null, null, 62));
                    b0.h();
                }
                o2.g g1 = this.n();
                ArrayList arrayList2 = new ArrayList();
                for(Object object5: ((Iterable)g1.G)) {
                    if(j.a(((Civ5Improvement_ResourceTypes)object5).getImprovementType(), ((Civ5Improvements)object0).getType())) {
                        arrayList2.add(object5);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object6: arrayList2) {
                    Civ5Improvement_ResourceTypes civ5Improvement_ResourceTypes0 = (Civ5Improvement_ResourceTypes)object6;
                    for(Object object7: ((Iterable)this.n().t)) {
                        if(!j.a(((Civ5Resources)object7).getType(), civ5Improvement_ResourceTypes0.getResourceType())) {
                            continue;
                        }
                        goto label_85;
                    }
                    object7 = null;
                label_85:
                    if(((Civ5Resources)object7) != null) {
                        arrayList3.add(((Civ5Resources)object7));
                    }
                }
                if(!arrayList3.isEmpty()) {
                    Iterator iterator7 = i3.e.k("TXT_KEY_PEDIA_IMPROVES_RESRC_LABEL", new Object[0], b0, arrayList3);
                    while(iterator7.hasNext()) {
                        Object object8 = iterator7.next();
                        k k0 = new k(f.h("ICON_", ((Civ5Resources)object8).getType()), ((Civ5Resources)object8).getDescription(), ((Civ5Resources)object8).getType(), null);
                        String s6 = ((Civ5Resources)object8).getDescription();
                        if(s6 == null) {
                            s6 = "";
                        }
                        b0.b(k0, s6);
                    }
                    b0.h();
                }
                String s7 = ((Civ5Improvements)object0).getCivilizationType();
                if(s7 != null) {
                    Object object9 = null;
                    for(Object object10: ((Iterable)this.n().l)) {
                        if(j.a(((Civ5Civilizations)object10).getType(), s7)) {
                            object9 = object10;
                            break;
                        }
                    }
                    if(((Civ5Civilizations)object9) != null) {
                        b0.a(a.H("TXT_KEY_PEDIA_CIVILIZATIONS_LABEL", new Object[0]));
                        k k1 = new k(f.h("ICON_", ((Civ5Civilizations)object9).getType()), ((Civ5Civilizations)object9).getShortDescription(), ((Civ5Civilizations)object9).getType(), null);
                        String s8 = ((Civ5Civilizations)object9).getDescription();
                        if(s8 == null) {
                            s8 = "";
                        }
                        b0.b(k1, s8);
                        b0.h();
                    }
                }
                Object object11 = null;
                for(Object object12: ((Iterable)this.n().x)) {
                    if(j.a(((Civ5Builds)object12).getImprovementType(), ((Civ5Improvements)object0).getType())) {
                        object11 = object12;
                        break;
                    }
                }
                if(((Civ5Builds)object11) != null) {
                    String s9 = ((Civ5Builds)object11).getPrereqTech();
                    if(s9 != null) {
                        Object object13 = null;
                        for(Object object14: ((Iterable)this.n().c)) {
                            if(j.a(((Civ5Technologies)object14).getType(), s9)) {
                                object13 = object14;
                                break;
                            }
                        }
                        if(((Civ5Technologies)object13) != null) {
                            b0.a(a.H("TXT_KEY_PEDIA_PREREQ_TECH_LABEL", new Object[0]));
                            k k2 = new k(f.h("ICON_", ((Civ5Technologies)object13).getType()), ((Civ5Technologies)object13).getDescription(), ((Civ5Technologies)object13).getType(), null);
                            String s10 = ((Civ5Technologies)object13).getDescription();
                            if(s10 == null) {
                                s10 = "";
                            }
                            b0.b(k2, s10);
                            b0.h();
                        }
                    }
                }
                o2.g g2 = this.n();
                ArrayList arrayList4 = new ArrayList();
                for(Object object15: ((Iterable)g2.E)) {
                    if(j.a(((Civ5Improvement_ValidFeatures)object15).getImprovementType(), ((Civ5Improvements)object0).getType())) {
                        arrayList4.add(object15);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                for(Object object16: arrayList4) {
                    Civ5Improvement_ValidFeatures civ5Improvement_ValidFeatures0 = (Civ5Improvement_ValidFeatures)object16;
                    for(Object object17: ((Iterable)this.n().r)) {
                        if(!j.a(((Civ5Features)object17).getType(), civ5Improvement_ValidFeatures0.getFeatureType())) {
                            continue;
                        }
                        goto label_157;
                    }
                    object17 = null;
                label_157:
                    if(((Civ5Features)object17) != null) {
                        arrayList5.add(((Civ5Features)object17));
                    }
                }
                o2.g g3 = this.n();
                ArrayList arrayList6 = new ArrayList();
                for(Object object18: ((Iterable)g3.F)) {
                    if(j.a(((Civ5Improvement_ValidTerrains)object18).getImprovementType(), ((Civ5Improvements)object0).getType())) {
                        arrayList6.add(object18);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for(Object object19: arrayList6) {
                    Civ5Improvement_ValidTerrains civ5Improvement_ValidTerrains0 = (Civ5Improvement_ValidTerrains)object19;
                    for(Object object20: ((Iterable)this.n().q)) {
                        if(!j.a(((Civ5Terrains)object20).getType(), civ5Improvement_ValidTerrains0.getTerrainType())) {
                            continue;
                        }
                        goto label_179;
                    }
                    object20 = null;
                label_179:
                    if(((Civ5Terrains)object20) != null) {
                        arrayList7.add(((Civ5Terrains)object20));
                    }
                }
                if(!arrayList5.isEmpty() || !arrayList7.isEmpty()) {
                    Iterator iterator17 = i3.e.k("TXT_KEY_PEDIA_FOUNDON_LABEL", new Object[0], b0, arrayList5);
                    while(iterator17.hasNext()) {
                        Object object21 = iterator17.next();
                        k k3 = new k(f.h("ICON_", ((Civ5Features)object21).getType()), ((Civ5Features)object21).getDescription(), ((Civ5Features)object21).getType(), null);
                        String s11 = ((Civ5Features)object21).getDescription();
                        if(s11 == null) {
                            s11 = "";
                        }
                        b0.b(k3, s11);
                    }
                    for(Object object22: arrayList7) {
                        k k4 = new k(f.h("ICON_", ((Civ5Terrains)object22).getType()), ((Civ5Terrains)object22).getDescription(), ((Civ5Terrains)object22).getType(), null);
                        String s12 = ((Civ5Terrains)object22).getDescription();
                        if(s12 == null) {
                            s12 = "";
                        }
                        b0.b(k4, s12);
                    }
                    b0.h();
                }
                if(!b0.n()) {
                    this.j(linearLayout0);
                }
            }
        }
        else {
            Object object23 = null;
            for(Object object24: ((Iterable)this.n().v)) {
                if(j.a(((Civ5Routes)object24).getType(), this.p().b)) {
                    object23 = object24;
                    break;
                }
            }
            if(((Civ5Routes)object23) != null) {
                this.f("ICON_" + ((Civ5Routes)object23).getType());
                String s13 = ((Civ5Routes)object23).getCivilopedia();
                if(s13 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s13));
                }
                Object object25 = null;
                String s14 = a.H("TXT_KEY_PEDIA_SUMMARY_LABEL", new Object[0]);
                LinearLayout linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
                j.c(textView1);
                o1.a.U(textView1, s14);
                Q1.b b1 = new Q1.b(linearLayout1, this.q());
                b1.h();
                for(Object object26: ((Iterable)this.n().x)) {
                    if(j.a(((Civ5Builds)object26).getRouteType(), ((Civ5Routes)object23).getType())) {
                        object25 = object26;
                        break;
                    }
                }
                if(((Civ5Builds)object25) != null) {
                    String s15 = ((Civ5Builds)object25).getPrereqTech();
                    if(s15 != null) {
                        Object object27 = null;
                        for(Object object28: ((Iterable)this.n().c)) {
                            if(j.a(((Civ5Technologies)object28).getType(), s15)) {
                                object27 = object28;
                                break;
                            }
                        }
                        if(((Civ5Technologies)object27) != null) {
                            b1.a(a.H("TXT_KEY_PEDIA_PREREQ_TECH_LABEL", new Object[0]));
                            k k5 = new k(f.h("ICON_", ((Civ5Technologies)object27).getType()), ((Civ5Technologies)object27).getDescription(), ((Civ5Technologies)object27).getType(), null);
                            String s16 = ((Civ5Technologies)object27).getDescription();
                            if(s16 != null) {
                                s = s16;
                            }
                            b1.b(k5, s);
                            b1.h();
                        }
                    }
                }
                if(!b1.n()) {
                    this.j(linearLayout1);
                }
            }
        }
    }

    private final void z() {
        Object object0 = null;
        this.s(this.p().j);
        this.p();
        if(j.a(this.p().b, "HOME")) {
            this.f("ICON_UNIT_ENGINEER");
            g.g(this, a.H("TXT_KEY_PEDIA_QUOTE_BLOCK_PEOPLE", new Object[0]), 2);
            this.b(a.H("TXT_KEY_PEDIA_PEOPLE_PAGE_LABEL", new Object[0]), G.p(a.H("TXT_KEY_PEDIA_SPEC_HELP_TEXT", new Object[0])));
            return;
        }
        if(j.a(this.p().c, "1")) {
            for(Object object1: ((Iterable)this.n().k)) {
                if(j.a(((Civ5Specialists)object1).getType(), this.p().b)) {
                    object0 = object1;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(((Civ5Specialists)object0) != null) {
                this.f("ICON_" + ((Civ5Specialists)object0).getType());
                String s = ((Civ5Specialists)object0).getHelp();
                if(s != null) {
                    this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s));
                }
                String s1 = ((Civ5Specialists)object0).getStrategy();
                if(s1 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_STRATEGY_LABEL", new Object[0]), G.p(s1));
                }
                String s2 = ((Civ5Specialists)object0).getCivilopedia();
                if(s2 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s2));
                }
            }
        }
        else {
            for(Object object2: ((Iterable)this.n().d)) {
                if(j.a(((Civ5Units)object2).getType(), this.p().b)) {
                    object0 = object2;
                    break;
                }
                if(false) {
                    break;
                }
            }
            if(((Civ5Units)object0) != null) {
                this.f("ICON_" + ((Civ5Units)object0).getType());
                String s3 = ((Civ5Units)object0).getHelp();
                if(s3 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_GAME_INFO_LABEL", new Object[0]), G.p(s3));
                }
                String s4 = ((Civ5Units)object0).getStrategy();
                if(s4 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_STRATEGY_LABEL", new Object[0]), G.p(s4));
                }
                String s5 = ((Civ5Units)object0).getCivilopedia();
                if(s5 != null) {
                    this.b(a.H("TXT_KEY_PEDIA_HISTORICAL_LABEL", new Object[0]), G.p(s5));
                }
            }
        }
    }
}

