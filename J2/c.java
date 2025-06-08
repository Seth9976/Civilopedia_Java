package j2;

import A.f;
import B.d;
import J2.j;
import Q1.b;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spears.civilopedia.db.tables.Civ7Adjacency_YieldChanges;
import com.spears.civilopedia.db.tables.Civ7Biomes;
import com.spears.civilopedia.db.tables.Civ7Civilizations;
import com.spears.civilopedia.db.tables.Civ7CivilopediaPageLayoutChapters;
import com.spears.civilopedia.db.tables.Civ7CivilopediaPageSidebarPanels;
import com.spears.civilopedia.db.tables.Civ7ConstructibleModifiers;
import com.spears.civilopedia.db.tables.Civ7Constructible_Adjacencies;
import com.spears.civilopedia.db.tables.Civ7Constructible_Maintenances;
import com.spears.civilopedia.db.tables.Civ7Constructible_YieldChanges;
import com.spears.civilopedia.db.tables.Civ7Constructibles;
import com.spears.civilopedia.db.tables.Civ7Districts;
import com.spears.civilopedia.db.tables.Civ7FeatureClasses;
import com.spears.civilopedia.db.tables.Civ7Features;
import com.spears.civilopedia.db.tables.Civ7ModifierStrings;
import com.spears.civilopedia.db.tables.Civ7ProgressionTreeNodeUnlocks;
import com.spears.civilopedia.db.tables.Civ7ProgressionTreeNodes;
import com.spears.civilopedia.db.tables.Civ7ProgressionTrees;
import com.spears.civilopedia.db.tables.Civ7Routes;
import com.spears.civilopedia.db.tables.Civ7Terrains;
import com.spears.civilopedia.db.tables.Civ7TypeQuotes;
import com.spears.civilopedia.db.tables.Civ7Types;
import com.spears.civilopedia.db.tables.Civ7UniqueQuarters;
import com.spears.civilopedia.db.tables.Civ7UnitUpgrades;
import com.spears.civilopedia.db.tables.Civ7Unit_Costs;
import com.spears.civilopedia.db.tables.Civ7Unit_RequiredConstructibles;
import com.spears.civilopedia.db.tables.Civ7Unit_Stats;
import com.spears.civilopedia.db.tables.Civ7Units;
import com.spears.civilopedia.db.tables.Civ7Yields;
import com.spears.civilopedia.db.tables.FrontendCivilizationItems;
import com.spears.civilopedia.db.tables.FrontendLeaderItems;
import g1.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o1.a;
import o2.A;
import o2.G;
import o2.k;
import w2.e;
import x2.i;

public final class c extends g {
    public final n i;

    public c(n n0) {
        j.f(n0, "frontend");
        super();
        this.i = n0;
    }

    @Override  // j2.g
    public final void k() {
        Iterator iterator49;
        Civ7Routes civ7Routes0;
        e e0;
        LinearLayout linearLayout6;
        LinearLayout linearLayout5;
        String s7;
        String s5;
        LinearLayout linearLayout4;
        LinearLayout linearLayout3;
        LinearLayout linearLayout2;
        LinearLayout linearLayout1;
        LinearLayout linearLayout0;
        String s1;
        this.s(this.p().j);
        this.p();
        Iterable iterable0 = this.o().d();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: iterable0) {
            Civ7CivilopediaPageSidebarPanels civ7CivilopediaPageSidebarPanels0 = (Civ7CivilopediaPageSidebarPanels)object0;
            if((civ7CivilopediaPageSidebarPanels0.getSectionID() == null || j.a(civ7CivilopediaPageSidebarPanels0.getSectionID(), this.p().b())) && (civ7CivilopediaPageSidebarPanels0.getPageID() == null || i3.e.m(this, civ7CivilopediaPageSidebarPanels0.getPageID()))) {
                arrayList0.add(object0);
            }
        }
        Iterator iterator1 = arrayList0.iterator();
    alab1:
        while(true) {
            while(true) {
                while(true) {
                    while(true) {
                        while(true) {
                            while(true) {
                                while(true) {
                                    while(true) {
                                        while(true) {
                                            while(true) {
                                                while(true) {
                                                    while(true) {
                                                        while(true) {
                                                            while(true) {
                                                                while(true) {
                                                                    while(true) {
                                                                        while(true) {
                                                                        alab2:
                                                                            while(true) {
                                                                            label_12:
                                                                                boolean z = iterator1.hasNext();
                                                                                n n0 = this.i;
                                                                                if(!z) {
                                                                                    break alab1;
                                                                                }
                                                                                Object object1 = iterator1.next();
                                                                                String s = ((Civ7CivilopediaPageSidebarPanels)object1).getComponent();
                                                                                s1 = "";
                                                                                switch(s.hashCode()) {
                                                                                    case 0x9FA10479: {
                                                                                        if(!s.equals("pedia-page-sidebar-base-yields")) {
                                                                                            break;
                                                                                        }
                                                                                        break alab2;
                                                                                    }
                                                                                    case 0xC840470: {
                                                                                        goto label_93;
                                                                                    }
                                                                                    case 0x177778FD: {
                                                                                        goto label_168;
                                                                                    }
                                                                                    case 0x36EF1B84: {
                                                                                        goto label_200;
                                                                                    }
                                                                                    case 0x4C370E66: {
                                                                                        goto label_207;
                                                                                    }
                                                                                    case 0x4D1A88BF: {
                                                                                        goto label_231;
                                                                                    }
                                                                                    case 0x4E40B96B: {
                                                                                        goto label_330;
                                                                                    }
                                                                                    case 0x76B745C0: {
                                                                                        goto label_366;
                                                                                    }
                                                                                    case 0x79390F33: {
                                                                                        goto label_484;
                                                                                    }
                                                                                }
                                                                            }
                                                                            linearLayout0 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                                                                            TextView textView0 = (TextView)i3.e.c(linearLayout0, 0x80, 0x7F0700F7);  // id:stat_box_title
                                                                            j.c(textView0);
                                                                            a.U(textView0, "LOC_UI_CHAT_ICONS_YIELDS");
                                                                            b b0 = new b(linearLayout0, this.q());
                                                                            b0.h();
                                                                            Iterable iterable1 = this.o().h();
                                                                            ArrayList arrayList1 = new ArrayList();
                                                                            for(Object object2: iterable1) {
                                                                                if(i3.e.m(this, ((Civ7Constructible_YieldChanges)object2).getConstructibleType())) {
                                                                                    arrayList1.add(object2);
                                                                                }
                                                                            }
                                                                            for(Object object3: arrayList1) {
                                                                                Civ7Constructible_YieldChanges civ7Constructible_YieldChanges0 = (Civ7Constructible_YieldChanges)object3;
                                                                                for(Object object4: this.o().v()) {
                                                                                    if(!j.a(((Civ7Yields)object4).getYieldType(), civ7Constructible_YieldChanges0.getYieldType())) {
                                                                                        continue;
                                                                                    }
                                                                                    goto label_45;
                                                                                }
                                                                                object4 = null;
                                                                            label_45:
                                                                                if(((Civ7Yields)object4) != null) {
                                                                                    b0.g(android.support.v4.media.session.a.H("LOC_UI_POS_YIELD", new Object[]{civ7Constructible_YieldChanges0.getYieldChange(), ((Civ7Yields)object4).getName()}));
                                                                                }
                                                                            }
                                                                            Iterable iterable2 = this.o().e();
                                                                            ArrayList arrayList2 = new ArrayList();
                                                                            for(Object object5: iterable2) {
                                                                                if(i3.e.m(this, ((Civ7Constructible_Adjacencies)object5).getConstructibleType())) {
                                                                                    arrayList2.add(object5);
                                                                                }
                                                                            }
                                                                            for(Object object6: arrayList2) {
                                                                                Civ7Constructible_Adjacencies civ7Constructible_Adjacencies0 = (Civ7Constructible_Adjacencies)object6;
                                                                                for(Object object7: this.o().a()) {
                                                                                    if(!j.a(((Civ7Adjacency_YieldChanges)object7).getID(), civ7Constructible_Adjacencies0.getYieldChangeId())) {
                                                                                        continue;
                                                                                    }
                                                                                    goto label_66;
                                                                                }
                                                                                object7 = null;
                                                                            label_66:
                                                                                if(((Civ7Adjacency_YieldChanges)object7) != null) {
                                                                                    b0.g(this.t(((Civ7Adjacency_YieldChanges)object7)));
                                                                                }
                                                                            }
                                                                            Iterable iterable3 = this.o().g();
                                                                            ArrayList arrayList3 = new ArrayList();
                                                                            for(Object object8: iterable3) {
                                                                                if(i3.e.m(this, ((Civ7ConstructibleModifiers)object8).getConstructibleType())) {
                                                                                    arrayList3.add(object8);
                                                                                }
                                                                            }
                                                                            for(Object object9: arrayList3) {
                                                                                Civ7ConstructibleModifiers civ7ConstructibleModifiers0 = (Civ7ConstructibleModifiers)object9;
                                                                                for(Object object10: this.o().j()) {
                                                                                    if(!j.a(((Civ7ModifierStrings)object10).getModifierId(), civ7ConstructibleModifiers0.getModifierId()) || !j.a(((Civ7ModifierStrings)object10).getContext(), "Description")) {
                                                                                        continue;
                                                                                    }
                                                                                    goto label_87;
                                                                                }
                                                                                object10 = null;
                                                                            label_87:
                                                                                if(((Civ7ModifierStrings)object10) != null) {
                                                                                    b0.g(android.support.v4.media.session.a.H(((Civ7ModifierStrings)object10).getText(), new Object[0]));
                                                                                }
                                                                            }
                                                                            if(b0.n()) {
                                                                                goto label_12;
                                                                            }
                                                                            break;
                                                                        }
                                                                        this.j(linearLayout0);
                                                                        goto label_12;
                                                                    label_93:
                                                                        if(!s.equals("pedia-page-sidebar-unit-requirements")) {
                                                                            goto label_12;
                                                                        }
                                                                        break;
                                                                    }
                                                                    linearLayout1 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                                                                    TextView textView1 = (TextView)i3.e.c(linearLayout1, 0x80, 0x7F0700F7);  // id:stat_box_title
                                                                    j.c(textView1);
                                                                    a.U(textView1, "LOC_PEDIA_SIDEBAR_REQUIRES");
                                                                    b b1 = new b(linearLayout1, this.q());
                                                                    b1.h();
                                                                    ArrayList arrayList4 = new ArrayList();
                                                                    for(Object object11: n0.g()) {
                                                                        if(i3.e.m(this, ((FrontendCivilizationItems)object11).getType())) {
                                                                            arrayList4.add(object11);
                                                                        }
                                                                    }
                                                                    for(Object object12: i.m0(arrayList4, new d(7))) {
                                                                        FrontendCivilizationItems frontendCivilizationItems0 = (FrontendCivilizationItems)object12;
                                                                        for(Object object13: this.o().b()) {
                                                                            if(!j.a(((Civ7Civilizations)object13).getCivilizationType(), frontendCivilizationItems0.getCivilizationType())) {
                                                                                continue;
                                                                            }
                                                                            goto label_117;
                                                                        }
                                                                        object13 = null;
                                                                    label_117:
                                                                        if(((Civ7Civilizations)object13) != null) {
                                                                            b1.b(new k(f.h("ICON_", ((Civ7Civilizations)object13).getCivilizationType()), null, ((Civ7Civilizations)object13).getCivilizationType()), ((Civ7Civilizations)object13).getFullName());
                                                                        }
                                                                    }
                                                                    Iterable iterable4 = this.o().r();
                                                                    ArrayList arrayList5 = new ArrayList();
                                                                    for(Object object14: iterable4) {
                                                                        if(i3.e.m(this, ((Civ7Unit_RequiredConstructibles)object14).getUnitType())) {
                                                                            arrayList5.add(object14);
                                                                        }
                                                                    }
                                                                    for(Object object15: arrayList5) {
                                                                        Civ7Unit_RequiredConstructibles civ7Unit_RequiredConstructibles0 = (Civ7Unit_RequiredConstructibles)object15;
                                                                        for(Object object16: this.o().i()) {
                                                                            if(!j.a(((Civ7Constructibles)object16).getConstructibleType(), civ7Unit_RequiredConstructibles0.getConstructibleType())) {
                                                                                continue;
                                                                            }
                                                                            goto label_138;
                                                                        }
                                                                        object16 = null;
                                                                    label_138:
                                                                        if(((Civ7Constructibles)object16) != null) {
                                                                            b1.b(new k(f.h("ICON_", ((Civ7Constructibles)object16).getConstructibleType()), null, civ7Unit_RequiredConstructibles0.getConstructibleType()), ((Civ7Constructibles)object16).getName());
                                                                        }
                                                                    }
                                                                    Iterable iterable5 = this.o().k();
                                                                    ArrayList arrayList6 = new ArrayList();
                                                                    for(Object object17: iterable5) {
                                                                        if(i3.e.m(this, ((Civ7ProgressionTreeNodeUnlocks)object17).getTargetType())) {
                                                                            arrayList6.add(object17);
                                                                        }
                                                                    }
                                                                    for(Object object18: arrayList6) {
                                                                        Civ7ProgressionTreeNodeUnlocks civ7ProgressionTreeNodeUnlocks0 = (Civ7ProgressionTreeNodeUnlocks)object18;
                                                                        for(Object object19: this.o().l()) {
                                                                            if(!j.a(((Civ7ProgressionTreeNodes)object19).getProgressionTreeNodeType(), civ7ProgressionTreeNodeUnlocks0.getProgressionTreeNodeType())) {
                                                                                continue;
                                                                            }
                                                                            goto label_159;
                                                                        }
                                                                        object19 = null;
                                                                    label_159:
                                                                        if(((Civ7ProgressionTreeNodes)object19) != null) {
                                                                            String s2 = ((Civ7ProgressionTreeNodes)object19).getIconString();
                                                                            if(s2 == null) {
                                                                                s2 = "";
                                                                            }
                                                                            b1.b(new k("ICON_" + s2, null, ((Civ7ProgressionTreeNodes)object19).getProgressionTreeNodeType()), ((Civ7ProgressionTreeNodes)object19).getName());
                                                                        }
                                                                    }
                                                                    if(b1.n()) {
                                                                        goto label_12;
                                                                    }
                                                                    break;
                                                                }
                                                                this.j(linearLayout1);
                                                                goto label_12;
                                                            label_168:
                                                                if(!s.equals("pedia-page-sidebar-building-cost")) {
                                                                    goto label_12;
                                                                }
                                                                break;
                                                            }
                                                            for(Object object20: this.o().i()) {
                                                                if(!i3.e.m(this, ((Civ7Constructibles)object20).getConstructibleType())) {
                                                                    continue;
                                                                }
                                                                goto label_175;
                                                            }
                                                            object20 = null;
                                                        label_175:
                                                            Iterable iterable6 = this.o().f();
                                                            ArrayList arrayList7 = new ArrayList();
                                                            for(Object object21: iterable6) {
                                                                if(i3.e.m(this, ((Civ7Constructible_Maintenances)object21).getConstructibleType()) && ((Civ7Constructible_Maintenances)object21).getAmount() > 0) {
                                                                    arrayList7.add(object21);
                                                                }
                                                            }
                                                            if(((Civ7Constructibles)object20) == null && arrayList7.isEmpty()) {
                                                                goto label_12;
                                                            }
                                                            break;
                                                        }
                                                        linearLayout2 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                                                        TextView textView2 = (TextView)i3.e.c(linearLayout2, 0x80, 0x7F0700F7);  // id:stat_box_title
                                                        j.c(textView2);
                                                        a.U(textView2, "LOC_UI_TECH_TREE_HEX_COST");
                                                        b b2 = new b(linearLayout2, this.q());
                                                        b2.h();
                                                        if(((Civ7Constructibles)object20) != null) {
                                                            b2.g(a.G("LOC_TERM_BASE_COST") + "[icon:YIELD_PRODUCTION]" + ((Civ7Constructibles)object20).getCost());
                                                        }
                                                        for(Object object22: arrayList7) {
                                                            b2.g(a.G("LOC_UI_PRODUCTION_MAINTENANCE") + "[icon:" + ((Civ7Constructible_Maintenances)object22).getYieldType() + "]" + ((Civ7Constructible_Maintenances)object22).getAmount());
                                                        }
                                                        if(b2.n()) {
                                                            goto label_12;
                                                        }
                                                        break;
                                                    }
                                                    this.j(linearLayout2);
                                                    goto label_12;
                                                label_200:
                                                    if(!s.equals("pedia-page-sidebar-portrait") || j.a(this.p().d, "Concept") || j.a(this.p().d, "Government")) {
                                                        goto label_12;
                                                    }
                                                    break;
                                                }
                                                String s3 = f.h("ICON_", this.p().a());
                                                if(j.a(this.p().b(), "LEADERS")) {
                                                    this.h(s3);
                                                }
                                                else {
                                                    this.f(s3);
                                                }
                                                goto label_12;
                                            label_207:
                                                if(!s.equals("pedia-page-sidebar-unit-costs")) {
                                                    goto label_12;
                                                }
                                                break;
                                            }
                                            linearLayout3 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                                            TextView textView3 = (TextView)i3.e.c(linearLayout3, 0x80, 0x7F0700F7);  // id:stat_box_title
                                            j.c(textView3);
                                            a.U(textView3, "LOC_UI_TECH_TREE_HEX_COST");
                                            b b3 = new b(linearLayout3, this.q());
                                            for(Object object23: this.o().q()) {
                                                Civ7Unit_Costs civ7Unit_Costs0 = (Civ7Unit_Costs)object23;
                                                if(i3.e.m(this, civ7Unit_Costs0.getUnitType())) {
                                                    b3.g(a.G("LOC_TERM_BASE_COST") + "[ICON_" + civ7Unit_Costs0.getYieldType() + "]" + civ7Unit_Costs0.getCost());
                                                }
                                            }
                                            for(Object object24: this.o().u()) {
                                                if(!i3.e.m(this, ((Civ7Units)object24).getUnitType())) {
                                                    continue;
                                                }
                                                goto label_226;
                                            }
                                            object24 = null;
                                        label_226:
                                            if(((Civ7Units)object24) != null) {
                                                b3.g(a.G("LOC_UI_PRODUCTION_MAINTENANCE") + "[ICON_GOLD]" + ((Civ7Units)object24).getMaintenance());
                                            }
                                            if(b3.n()) {
                                                goto label_12;
                                            }
                                            break;
                                        }
                                        this.j(linearLayout3);
                                        goto label_12;
                                    label_231:
                                        if(!s.equals("pedia-page-sidebar-unit-stats")) {
                                            goto label_12;
                                        }
                                        break;
                                    }
                                    linearLayout4 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                                    TextView textView4 = (TextView)i3.e.c(linearLayout4, 0x80, 0x7F0700F7);  // id:stat_box_title
                                    j.c(textView4);
                                    a.U(textView4, "LOC_PEDIA_SIDEBAR_TRAITS");
                                    b b4 = new b(linearLayout4, this.q());
                                    b4.h();
                                    Iterable iterable7 = this.o().t();
                                    ArrayList arrayList8 = new ArrayList();
                                    for(Object object25: iterable7) {
                                        if(i3.e.m(this, ((Civ7UnitUpgrades)object25).getUnit())) {
                                            arrayList8.add(object25);
                                        }
                                    }
                                    if(!arrayList8.isEmpty()) {
                                        b4.a("LOC_PEDIA_SIDEBAR_UPGRADES_TO");
                                        for(Object object26: arrayList8) {
                                            Civ7UnitUpgrades civ7UnitUpgrades0 = (Civ7UnitUpgrades)object26;
                                            for(Object object27: this.o().u()) {
                                                if(!j.a(((Civ7Units)object27).getUnitType(), civ7UnitUpgrades0.getUpgradeUnit())) {
                                                    continue;
                                                }
                                                goto label_258;
                                            }
                                            object27 = null;
                                        label_258:
                                            if(((Civ7Units)object27) == null) {
                                                s5 = "";
                                            }
                                            else {
                                                String s4 = ((Civ7Units)object27).getName();
                                                if(s4 != null) {
                                                    s5 = s4;
                                                }
                                            }
                                            b4.b(new k(f.h("ICON_", civ7UnitUpgrades0.getUpgradeUnit()), null, civ7UnitUpgrades0.getUpgradeUnit()), a.G(s5));
                                        }
                                        b4.h();
                                    }
                                    Iterable iterable8 = this.o().t();
                                    ArrayList arrayList9 = new ArrayList();
                                    for(Object object28: iterable8) {
                                        if(i3.e.m(this, ((Civ7UnitUpgrades)object28).getUpgradeUnit())) {
                                            arrayList9.add(object28);
                                        }
                                    }
                                    if(!arrayList9.isEmpty()) {
                                        b4.a("LOC_PEDIA_SIDEBAR_UPGRADE_FROM");
                                        for(Object object29: arrayList9) {
                                            Civ7UnitUpgrades civ7UnitUpgrades1 = (Civ7UnitUpgrades)object29;
                                            for(Object object30: this.o().u()) {
                                                if(!j.a(((Civ7Units)object30).getUnitType(), civ7UnitUpgrades1.getUnit())) {
                                                    continue;
                                                }
                                                goto label_287;
                                            }
                                            object30 = null;
                                        label_287:
                                            if(((Civ7Units)object30) == null) {
                                                s7 = "";
                                            }
                                            else {
                                                String s6 = ((Civ7Units)object30).getName();
                                                if(s6 != null) {
                                                    s7 = s6;
                                                }
                                            }
                                            b4.b(new k(f.h("ICON_", civ7UnitUpgrades1.getUnit()), null, civ7UnitUpgrades1.getUnit()), a.G(s7));
                                        }
                                        b4.h();
                                    }
                                    Iterable iterable9 = this.o().s();
                                    ArrayList arrayList10 = new ArrayList();
                                    for(Object object31: iterable9) {
                                        if(i3.e.m(this, ((Civ7Unit_Stats)object31).getUnitType())) {
                                            arrayList10.add(object31);
                                        }
                                    }
                                    if(!arrayList10.isEmpty()) {
                                        for(Object object32: arrayList10) {
                                            Civ7Unit_Stats civ7Unit_Stats0 = (Civ7Unit_Stats)object32;
                                            if(civ7Unit_Stats0.getRange() > 0) {
                                                b4.e(new k("ICON_RANGE", null, null), civ7Unit_Stats0.getRange(), "LOC_UNIT_INFO_RANGE");
                                            }
                                            if(civ7Unit_Stats0.getCombat() > 0) {
                                                b4.e(new k("ICON_STRENGTH", null, null), civ7Unit_Stats0.getCombat(), "LOC_COMBAT_PREVIEW_MELEE_STRENGTH");
                                            }
                                            if(civ7Unit_Stats0.getRangedCombat() > 0) {
                                                b4.e(new k("ICON_RANGED_STRENGTH", null, null), civ7Unit_Stats0.getRangedCombat(), "LOC_COMBAT_PREVIEW_RANGED_STRENGTH");
                                            }
                                            if(civ7Unit_Stats0.getBombard() > 0) {
                                                b4.e(new k("ICON_BOMBARD", null, null), civ7Unit_Stats0.getBombard(), "LOC_COMBAT_PREVIEW_BOMBARD_STRENGTH");
                                            }
                                        }
                                    }
                                    for(Object object33: this.o().u()) {
                                        if(!i3.e.m(this, ((Civ7Units)object33).getUnitType())) {
                                            continue;
                                        }
                                        goto label_324;
                                    }
                                    object33 = null;
                                label_324:
                                    if(((Civ7Units)object33) != null) {
                                        b4.e(new k("ICON_MOVES", null, null), ((Civ7Units)object33).getBaseMoves(), "LOC_UNIT_INFO_MOVES_REMAINING");
                                        b4.e(new k("", null, null), ((Civ7Units)object33).getBaseSightRange(), "LOC_PEDIA_SIDEBAR_SIGHT_RANGE");
                                    }
                                    if(b4.n()) {
                                        goto label_12;
                                    }
                                    break;
                                }
                                this.j(linearLayout4);
                                goto label_12;
                            label_330:
                                if(!s.equals("pedia-page-sidebar-civ-traits")) {
                                    goto label_12;
                                }
                                break;
                            }
                            linearLayout5 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                            TextView textView5 = (TextView)i3.e.c(linearLayout5, 0x80, 0x7F0700F7);  // id:stat_box_title
                            j.c(textView5);
                            a.U(textView5, "LOC_PEDIA_SIDEBAR_TRAITS");
                            b b5 = new b(linearLayout5, this.q());
                            b5.h();
                            ArrayList arrayList11 = new ArrayList();
                            for(Object object34: n0.g()) {
                                if(i3.e.m(this, ((FrontendCivilizationItems)object34).getCivilizationType())) {
                                    arrayList11.add(object34);
                                }
                            }
                            for(Object object35: i.m0(arrayList11, new d(8))) {
                                FrontendCivilizationItems frontendCivilizationItems1 = (FrontendCivilizationItems)object35;
                                switch(frontendCivilizationItems1.getKind()) {
                                    case "KIND_BUILDING": {
                                        b5.a("LOC_BUILDING_UNIQUE_TITLE");
                                        b5.b(new k("ICON_" + frontendCivilizationItems1.getType(), null, frontendCivilizationItems1.getType()), frontendCivilizationItems1.getName());
                                        break;
                                    }
                                    case "KIND_IMPROVEMENT": {
                                        b5.a("LOC_BUILDING_UNIQUE_TITLE");
                                        b5.b(new k("ICON_" + frontendCivilizationItems1.getType(), null, frontendCivilizationItems1.getType()), frontendCivilizationItems1.getName());
                                        break;
                                    }
                                    case "KIND_QUARTER": {
                                        b5.a("LOC_UI_PRODUCTION_UNIQUE_QUARTER");
                                        b5.b(new k("ICON_" + frontendCivilizationItems1.getType(), null, frontendCivilizationItems1.getType()), frontendCivilizationItems1.getName());
                                        break;
                                    }
                                    case "KIND_UNIT": {
                                        b5.a("LOC_UNIT_UNIQUE_TITLE");
                                        b5.b(new k("ICON_" + frontendCivilizationItems1.getType(), null, frontendCivilizationItems1.getType()), frontendCivilizationItems1.getName());
                                    }
                                }
                            }
                            if(b5.n()) {
                                goto label_12;
                            }
                            break;
                        }
                        this.j(linearLayout5);
                        goto label_12;
                    label_366:
                        if(!s.equals("pedia-page-sidebar-building-requirements")) {
                            goto label_12;
                        }
                        break;
                    }
                    linearLayout6 = (LinearLayout)this.r(0x7F0A0052);  // layout:page_stat_box
                    TextView textView6 = (TextView)i3.e.c(linearLayout6, 0x80, 0x7F0700F7);  // id:stat_box_title
                    j.c(textView6);
                    a.U(textView6, "LOC_PEDIA_SIDEBAR_REQUIRES");
                    b b6 = new b(linearLayout6, this.q());
                    ArrayList arrayList12 = new ArrayList();
                    for(Object object36: n0.g()) {
                        if(i3.e.m(this, ((FrontendCivilizationItems)object36).getType())) {
                            arrayList12.add(object36);
                        }
                    }
                    Iterable iterable10 = i.m0(arrayList12, new d(9));
                    ArrayList arrayList13 = new ArrayList();
                    for(Object object37: iterable10) {
                        FrontendCivilizationItems frontendCivilizationItems2 = (FrontendCivilizationItems)object37;
                        for(Object object38: this.o().b()) {
                            if(!j.a(((Civ7Civilizations)object38).getCivilizationType(), frontendCivilizationItems2.getCivilizationType())) {
                                continue;
                            }
                            goto label_391;
                        }
                        object38 = null;
                    label_391:
                        if(((Civ7Civilizations)object38) != null) {
                            arrayList13.add(((Civ7Civilizations)object38));
                        }
                    }
                    Iterable iterable11 = this.o().k();
                    ArrayList arrayList14 = new ArrayList();
                    for(Object object39: iterable11) {
                        if(i3.e.m(this, ((Civ7ProgressionTreeNodeUnlocks)object39).getTargetType())) {
                            arrayList14.add(object39);
                        }
                    }
                    ArrayList arrayList15 = new ArrayList();
                    for(Object object40: arrayList14) {
                        Civ7ProgressionTreeNodeUnlocks civ7ProgressionTreeNodeUnlocks1 = (Civ7ProgressionTreeNodeUnlocks)object40;
                        for(Object object41: this.o().l()) {
                            if(!j.a(((Civ7ProgressionTreeNodes)object41).getProgressionTreeNodeType(), civ7ProgressionTreeNodeUnlocks1.getProgressionTreeNodeType())) {
                                continue;
                            }
                            goto label_413;
                        }
                        object41 = null;
                    label_413:
                        Civ7ProgressionTreeNodes civ7ProgressionTreeNodes0 = (Civ7ProgressionTreeNodes)object41;
                        if(civ7ProgressionTreeNodes0 == null) {
                            e0 = null;
                        }
                        else {
                            for(Object object42: this.o().m()) {
                                if(!j.a(((Civ7ProgressionTrees)object42).getProgressionTreeType(), civ7ProgressionTreeNodes0.getProgressionTree())) {
                                    continue;
                                }
                                goto label_421;
                            }
                            object42 = null;
                        label_421:
                            if(((Civ7ProgressionTrees)object42) != null) {
                                e0 = new e(civ7ProgressionTreeNodes0, ((Civ7ProgressionTrees)object42));
                            }
                        }
                        if(e0 != null) {
                            arrayList15.add(e0);
                        }
                    }
                    if(!arrayList13.isEmpty()) {
                        b6.h();
                        b6.a("LOC_PEDIA_SIDEBAR_UNIQUE_TO");
                        for(Object object43: arrayList13) {
                            b6.b(new k(i3.e.f("[ICON_", ((Civ7Civilizations)object43).getCivilizationType(), "]"), null, ((Civ7Civilizations)object43).getCivilizationType()), ((Civ7Civilizations)object43).getFullName());
                        }
                    }
                    if(!arrayList15.isEmpty()) {
                        b6.h();
                        for(Object object44: arrayList15) {
                            b6.a((j.a(((Civ7ProgressionTrees)((e)object44).j).getSystemType(), "SYSTEM_TECH") ? "LOC_PEDIA_SIDEBAR_REQUIRED_TECH" : "LOC_PEDIA_SIDEBAR_REQUIRED_CIVIC"));
                            String s8 = ((Civ7ProgressionTreeNodes)((e)object44).a()).getIconString();
                            if(s8 == null) {
                                s8 = "";
                            }
                            b6.b(new k(i3.e.f("[ICON_", s8, "]"), null, ((Civ7ProgressionTreeNodes)((e)object44).a()).getProgressionTreeNodeType()), ((Civ7ProgressionTreeNodes)((e)object44).a()).getName());
                        }
                    }
                    for(Object object45: this.o().p()) {
                        if(!i3.e.m(this, ((Civ7Types)object45).getType())) {
                            continue;
                        }
                        goto label_453;
                    }
                    object45 = null;
                label_453:
                    if(j.a((((Civ7Types)object45) == null ? null : ((Civ7Types)object45).getKind()), "KIND_ROUTE")) {
                        for(Object object46: this.o().n()) {
                            if(!i3.e.m(this, ((Civ7Routes)object46).getRouteType())) {
                                continue;
                            }
                            goto label_460;
                        }
                        object46 = null;
                    label_460:
                        civ7Routes0 = (Civ7Routes)object46;
                    }
                    else {
                        civ7Routes0 = null;
                    }
                    if((civ7Routes0 == null ? null : civ7Routes0.getRequiredConstructible()) != null) {
                        Object object47 = null;
                        for(Object object48: this.o().i()) {
                            if(j.a(((Civ7Constructibles)object48).getConstructibleType(), (civ7Routes0 == null ? null : civ7Routes0.getRequiredConstructible()))) {
                                object47 = object48;
                                break;
                            }
                        }
                        if(((Civ7Constructibles)object47) != null) {
                            switch(((Civ7Constructibles)object47).getConstructibleClass()) {
                                case "BUILDING": {
                                    s1 = "LOC_PEDIA_SIDEBAR_REQUIRED_BUILDING";
                                    break;
                                }
                                case "IMPROVEMENT": {
                                    s1 = "LOC_PEDIA_SIDEBAR_REQUIRED_IMPROVEMENT";
                                    break;
                                }
                                case "WONDER": {
                                    s1 = "LOC_PEDIA_SIDEBAR_REQUIRED_WONDER";
                                }
                            }
                            if(s1.length() > 0) {
                                b6.a(s1);
                                b6.f(((Civ7Constructibles)object47).getName());
                            }
                        }
                    }
                    if(b6.n()) {
                        goto label_12;
                    }
                    break;
                }
                this.j(linearLayout6);
                goto label_12;
            label_484:
                if(s.equals("pedia-page-sidebar-quote")) {
                    Iterable iterable12 = this.o().o();
                    ArrayList arrayList16 = new ArrayList();
                    for(Object object49: iterable12) {
                        if(i3.e.m(this, ((Civ7TypeQuotes)object49).getType())) {
                            arrayList16.add(object49);
                        }
                    }
                    iterator49 = arrayList16.iterator();
                label_494:
                    if(!iterator49.hasNext()) {
                        goto label_12;
                    }
                    break;
                }
                else {
                    continue alab1;
                }
                goto label_508;
            }
            Object object50 = iterator49.next();
            g.g(this, ((Civ7TypeQuotes)object50).getQuote(), 6);
            goto label_494;
        }
        if(j.a(this.p().b(), "CIVILIZATIONS")) {
            Object object51 = null;
            for(Object object52: n0.g()) {
                if(j.a(((FrontendCivilizationItems)object52).getKind(), "KIND_TRAIT") && i3.e.m(this, ((FrontendCivilizationItems)object52).getCivilizationType())) {
                    object51 = object52;
                    break;
                }
            }
            if(((FrontendCivilizationItems)object51) != null) {
                this.b(((FrontendCivilizationItems)object51).getName(), G.p(((FrontendCivilizationItems)object51).getDescription()));
            }
        }
    label_508:
        if(j.a(this.p().b(), "LEADERS")) {
            Object object53 = null;
            for(Object object54: n0.i()) {
                if(j.a(((FrontendLeaderItems)object54).getKind(), "KIND_TRAIT") && i3.e.m(this, ((FrontendLeaderItems)object54).getLeaderType())) {
                    object53 = object54;
                    break;
                }
            }
            if(((FrontendLeaderItems)object53) != null) {
                this.b(((FrontendLeaderItems)object53).getName(), G.p(((FrontendLeaderItems)object53).getDescription()));
            }
        }
        Iterable iterable13 = this.o().c();
        ArrayList arrayList17 = new ArrayList();
        for(Object object55: iterable13) {
            if(j.a(((Civ7CivilopediaPageLayoutChapters)object55).getPageLayoutID(), this.p().d)) {
                arrayList17.add(object55);
            }
        }
        int v = 0;
        for(Object object56: arrayList17) {
            if(v >= 0) {
                String s9 = this.q().g(this.p().b(), this.p().a(), ((Civ7CivilopediaPageLayoutChapters)object56).getChapterID());
                ArrayList arrayList18 = ((A)this.q()).m(this.p().b(), this.p().a(), ((Civ7CivilopediaPageLayoutChapters)object56).getChapterID(), this.p().d);
                if(s9 == null || v == 0 && (j.a(android.support.v4.media.session.a.H(s9, new Object[0]), this.p().j) || j.a(android.support.v4.media.session.a.H(s9, new Object[0]), this.p().k))) {
                    this.e(arrayList18);
                }
                else {
                    this.b(s9, arrayList18);
                }
                ++v;
                continue;
            }
            x2.j.D();
            throw null;
        }
    }

    public final String t(Civ7Adjacency_YieldChanges civ7Adjacency_YieldChanges0) {
        double f = civ7Adjacency_YieldChanges0.getYieldChange();
        for(Object object0: ((Iterable)this.o().G)) {
            Civ7Yields civ7Yields0 = (Civ7Yields)object0;
            if(j.a(civ7Adjacency_YieldChanges0.getYieldType(), civ7Yields0.getYieldType())) {
                Object object1 = null;
                String s = civ7Yields0.getName();
                if(f == 0.0) {
                    return "";
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentTerrain() != null) {
                    Object object2 = null;
                    for(Object object3: ((Iterable)this.o().J)) {
                        if(j.a(((Civ7Terrains)object3).getTerrainType(), civ7Adjacency_YieldChanges0.getAdjacentTerrain())) {
                            object2 = object3;
                            break;
                        }
                    }
                    if(((Civ7Terrains)object2) != null) {
                        String s1 = ((Civ7Terrains)object2).getName();
                        if(s1 != null) {
                            return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_TERRAIN", new Object[]{f, s, s1});
                        }
                    }
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentBiome() != null) {
                    Object object4 = null;
                    for(Object object5: ((Iterable)this.o().L)) {
                        if(j.a(((Civ7Biomes)object5).getBiomeType(), civ7Adjacency_YieldChanges0.getAdjacentBiome())) {
                            object4 = object5;
                            break;
                        }
                    }
                    if(((Civ7Biomes)object4) != null) {
                        String s2 = ((Civ7Biomes)object4).getName();
                        if(s2 != null) {
                            return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_BIOME", new Object[]{f, s, s2});
                        }
                    }
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentFeature() != null) {
                    Object object6 = null;
                    for(Object object7: ((Iterable)this.o().K)) {
                        if(j.a(((Civ7Features)object7).getFeatureType(), civ7Adjacency_YieldChanges0.getAdjacentFeature())) {
                            object6 = object7;
                            break;
                        }
                    }
                    if(((Civ7Features)object6) != null) {
                        String s3 = ((Civ7Features)object6).getName();
                        if(s3 != null) {
                            return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_FEATURE", new Object[]{f, s, s3});
                        }
                    }
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentFeatureClass() != null) {
                    Object object8 = null;
                    for(Object object9: ((Iterable)this.o().M)) {
                        if(j.a(((Civ7FeatureClasses)object9).getFeatureClassType(), civ7Adjacency_YieldChanges0.getAdjacentFeatureClass())) {
                            object8 = object9;
                            break;
                        }
                    }
                    if(((Civ7FeatureClasses)object8) != null) {
                        String s4 = ((Civ7FeatureClasses)object8).getName();
                        if(s4 != null) {
                            return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_FEATURE", new Object[]{f, s, s4});
                        }
                    }
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentDistrict() != null) {
                    if(j.a(civ7Adjacency_YieldChanges0.getAdjacentDistrict(), "DISTRICT_WONDER")) {
                        return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_WONDERS", new Object[]{f, s});
                    }
                    Object object10 = null;
                    for(Object object11: ((Iterable)this.o().N)) {
                        if(j.a(((Civ7Districts)object11).getDistrictType(), civ7Adjacency_YieldChanges0.getAdjacentDistrict())) {
                            object10 = object11;
                            break;
                        }
                    }
                    if(((Civ7Districts)object10) != null) {
                        String s5 = ((Civ7Districts)object10).getName();
                        if(s5 != null) {
                            return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_DISTRICT", new Object[]{f, s, s5});
                        }
                    }
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentConstructible() != null) {
                    Object object12 = null;
                    for(Object object13: ((Iterable)this.o().w)) {
                        if(j.a(((Civ7Constructibles)object13).getConstructibleType(), civ7Adjacency_YieldChanges0.getAdjacentConstructible())) {
                            object12 = object13;
                            break;
                        }
                    }
                    if(((Civ7Constructibles)object12) != null) {
                        String s6 = ((Civ7Constructibles)object12).getName();
                        if(s6 != null) {
                            return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_OBJECT", new Object[]{f, s, s6});
                        }
                    }
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentConstructibleTag() != null) {
                    return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_CONSTRUCTIBLE_TAG", new Object[]{f, s, android.support.v4.media.session.a.H(("LOC_TAG_CONSTRUCTIBLE_" + civ7Adjacency_YieldChanges0.getAdjacentConstructibleTag()), new Object[0])});
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentNavigableRiver()) {
                    return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_OBJECT", new Object[]{f, s, "LOC_NAVIGABLE_RIVER_NAME"});
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentNaturalWonder()) {
                    return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_NATURAL_WONDER", new Object[]{f, s});
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentUniqueQuarter()) {
                    if(civ7Adjacency_YieldChanges0.getAdjacentUniqueQuarterType() != null) {
                        for(Object object14: ((Iterable)this.o().O)) {
                            if(j.a(((Civ7UniqueQuarters)object14).getUniqueQuarterType(), civ7Adjacency_YieldChanges0.getAdjacentUniqueQuarterType())) {
                                object1 = object14;
                                break;
                            }
                            if(false) {
                                break;
                            }
                        }
                        if(((Civ7UniqueQuarters)object1) != null) {
                            String s7 = ((Civ7UniqueQuarters)object1).getName();
                            return s7 == null ? android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_UNIQUE_QUARTERS", new Object[]{f, s}) : android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_OBJECT", new Object[]{f, s, s7});
                        }
                    }
                    return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_UNIQUE_QUARTERS", new Object[]{f, s});
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentQuarter()) {
                    return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_QUARTERS", new Object[]{f, s});
                }
                if(civ7Adjacency_YieldChanges0.getAdjacentResource()) {
                    return android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_RESOURCES", new Object[]{f, s});
                }
                return civ7Adjacency_YieldChanges0.getAdjacentLake() ? android.support.v4.media.session.a.H("LOC_UI_ADJACENCY_INFO_LAKE", new Object[]{f, s}) : "";
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

