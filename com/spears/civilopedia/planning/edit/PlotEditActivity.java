package com.spears.civilopedia.planning.edit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.a;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import com.spears.civilopedia.db.tables.Adjacency_YieldChanges;
import com.spears.civilopedia.db.tables.AppealHousingChanges;
import com.spears.civilopedia.db.tables.Building_RequiredFeatures;
import com.spears.civilopedia.db.tables.Buildings;
import com.spears.civilopedia.db.tables.Civics;
import com.spears.civilopedia.db.tables.District_RequiredFeatures;
import com.spears.civilopedia.db.tables.Districts;
import com.spears.civilopedia.db.tables.Features;
import com.spears.civilopedia.db.tables.Improvement_Adjacencies;
import com.spears.civilopedia.db.tables.Improvement_BonusYieldChanges;
import com.spears.civilopedia.db.tables.Improvements;
import com.spears.civilopedia.db.tables.Resources;
import com.spears.civilopedia.db.tables.Technologies;
import com.spears.civilopedia.db.tables.Yields;
import com.spears.civilopedia.planning.components.YieldLabel;
import com.spears.civilopedia.planning.logic.Plot;
import f2.L;
import f2.j;
import f2.l;
import f2.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import m2.g;
import m2.i;
import n2.A;
import n2.B;
import n2.D;
import n2.E;
import n2.F;
import n2.b;
import n2.d;
import n2.q;
import n2.s;
import n2.t;
import n2.u;
import n2.v;
import o2.G;
import o2.K;
import o2.f;
import o2.x;
import x2.k;
import x2.r;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spears/civilopedia/planning/edit/PlotEditActivity;", "Lf2/j;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PlotEditActivity extends j {
    public v B;
    public Plot C;
    public q D;
    public L E;
    public ListView F;
    public u G;
    public TextView H;
    public static u I;

    public final void n() {
        String s1;
        boolean z1;
        u u0 = this.G;
        if(u0 != null) {
            boolean z = u0.f("DISTRICT_CITY_CENTER").a();
            L l0 = this.E;
            if(l0 != null) {
                l l1 = this.l();
                Plot plot0 = this.C;
                if(plot0 != null) {
                    q q0 = this.D;
                    if(q0 != null) {
                        b b0 = (b)q0.g.getValue();
                        q q1 = this.D;
                        if(q1 != null) {
                            v v0 = this.B;
                            if(v0 != null) {
                                q1.b.getClass();
                                t t0 = v0.a;
                                ArrayList arrayList0 = ((s)q1.b.c).a;
                                ArrayList arrayList1 = new ArrayList();
                                for(Object object0: arrayList0) {
                                    if(((v)object0).b.k()) {
                                        arrayList1.add(object0);
                                    }
                                }
                                ArrayList arrayList2 = new ArrayList(k.E(arrayList1));
                                for(Object object1: arrayList1) {
                                    arrayList2.add(((v)object1).a);
                                }
                                if(!arrayList2.isEmpty()) {
                                    for(Object object2: arrayList2) {
                                        if(((t)object2).b(t0) >= 4) {
                                            continue;
                                        }
                                        z1 = false;
                                        goto label_39;
                                    }
                                }
                                z1 = z;
                            label_39:
                                J2.j.f(l1, "environment");
                                String s = a.H("LOC_UNITOPERATION_FOUND_CITY_DESCRIPTION", new Object[0]);
                                boolean z2 = plot0.k();
                                i i0 = new i(g.i, "icon_unitoperation_found_city_50", s, null, z2, z1, false);
                                g g0 = g.j;
                                if(b0 == null) {
                                    s1 = "";
                                }
                                else {
                                    s1 = b0.b;
                                    if(s1 == null) {
                                        s1 = "";
                                    }
                                }
                                Object object3 = null;
                                i i1 = new i(g0, "icon_unitoperation_found_city_50", a.H("LOC_DIPLO_GRIEVANCE_LOG_CITY_RAZED", new Object[]{s1}), null, !plot0.k(), b0 != null && b0.a != 0, false);
                                g g1 = g.k;
                                String s2 = a.H("LOC_OPTIONS_TERRAIN", new Object[0]);
                                m m0 = l1.b;
                                for(Object object4: m0.d().k("FEATURES", "Terrain")) {
                                    if(J2.j.a(((o2.q)object4).b, "TERRAIN_PLAINS")) {
                                        object3 = object4;
                                        break;
                                    }
                                }
                                i i2 = new i(g1, "icon_civilopedia_features", s2, a.I((((o2.q)object3) == null ? null : ((o2.q)object3).e)), false, true, false);
                                String s3 = a.H("LOC_HUD_MAP_SEARCH_TERMS_FEATURE", new Object[0]);
                                Features features0 = (Features)m0.b().j0.h(plot0.f());
                                i i3 = new i(g.l, "icon_civilopedia_features", s3, a.I((features0 == null ? null : features0.getName())), false, true, false);
                                String s4 = a.H("LOC_RESOURCE_NAME", new Object[0]);
                                Resources resources0 = (Resources)m0.b().o1.h(plot0.h());
                                i i4 = new i(g.o, "icon_civilopedia_resources", s4, a.I((resources0 == null ? null : resources0.getName())), false, true, false);
                                String s5 = a.H("LOC_IMPROVEMENT_NAME", new Object[0]);
                                Improvements improvements0 = (Improvements)m0.b().K0.h(plot0.g());
                                i i5 = new i(g.p, "icon_civilopedia_improvements", s5, a.I((improvements0 == null ? null : improvements0.getName())), b0 == null, true, false);
                                String s6 = a.H("LOC_DISTRICT_NAME", new Object[0]);
                                Districts districts0 = (Districts)m0.b().b0.h(plot0.e());
                                i i6 = new i(g.n, "icon_civilopedia_districts", s6, a.I((districts0 == null ? null : districts0.getName())), b0 == null, true, plot0.k());
                                String s7 = a.H("LOC_WONDER_NAME", new Object[0]);
                                Buildings buildings0 = (Buildings)m0.b().v.h(plot0.d());
                                l0.j = new i[]{i0, i1, i2, i3, i4, i5, i6, new i(g.m, "icon_civilopedia_wonders", s7, a.I((buildings0 == null ? null : buildings0.getName())), b0 == null, true, false)};
                                return;
                            }
                            J2.j.l("plotWithPosition");
                            throw null;
                        }
                        J2.j.l("adjacencyProps");
                        throw null;
                    }
                    J2.j.l("adjacencyProps");
                    throw null;
                }
                J2.j.l("plot");
                throw null;
            }
            J2.j.l("adapter");
            throw null;
        }
        J2.j.l("validator");
        throw null;
    }

    public final void o() {
        String s14;
        String s12;
        String s8;
        K k1;
        K k0;
        ArrayList arrayList5;
        ArrayList arrayList0 = new ArrayList();
        f f0 = this.l().b.b();
        for(Object object0: ((Iterable)f0.d)) {
            q q0 = this.D;
            if(q0 != null) {
                if(q0.c() < ((AppealHousingChanges)object0).getMinimumValue()) {
                    continue;
                }
                goto label_12;
            }
            J2.j.l("adjacencyProps");
            throw null;
        }
        object0 = null;
    label_12:
        if(((AppealHousingChanges)object0) != null) {
            String s = ((AppealHousingChanges)object0).getDescription();
            if(s != null) {
                q q1 = this.D;
                if(q1 != null) {
                    arrayList0.add(a.H("LOC_TOOLTIP_APPEAL", new Object[]{s, q1.c()}));
                    goto label_21;
                }
                J2.j.l("adjacencyProps");
                throw null;
            }
        }
    label_21:
        Plot plot0 = this.C;
        if(plot0 != null) {
            if(plot0.j()) {
                q q2 = this.D;
                if(q2 == null) {
                    J2.j.l("adjacencyProps");
                    throw null;
                }
                f f1 = q2.d;
                ArrayList arrayList1 = new ArrayList();
                for(Object object1: ((Iterable)f1.C0)) {
                    if(J2.j.a(((Improvement_Adjacencies)object1).getImprovementType(), q2.a.b.g())) {
                        arrayList1.add(object1);
                    }
                }
                ArrayList arrayList2 = new ArrayList(k.E(arrayList1));
                for(Object object2: arrayList1) {
                    arrayList2.add(((Improvement_Adjacencies)object2).getYieldChangeId());
                }
                ArrayList arrayList3 = new ArrayList();
                for(Object object3: ((List)f1.b.i)) {
                    if(arrayList2.contains(((Adjacency_YieldChanges)object3).getID())) {
                        arrayList3.add(object3);
                    }
                }
                D d0 = q2.e;
                if(d0 == null) {
                    ArrayList arrayList6 = new ArrayList(k.E(arrayList3));
                    for(Object object5: arrayList3) {
                        arrayList6.add(new n2.a(((Adjacency_YieldChanges)object5)));
                    }
                    arrayList5 = arrayList6;
                }
                else {
                    ArrayList arrayList4 = d0.e(q2, arrayList3);
                    arrayList5 = new ArrayList();
                    for(Object object4: arrayList4) {
                        String s1 = ((n2.a)object4).u;
                        if((s1 == null ? true : d0.g(s1, q2))) {
                            arrayList5.add(object4);
                        }
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for(Object object6: arrayList5) {
                    String s2 = ((n2.a)object6).q;
                    if(s2 != null) {
                        arrayList7.add(s2);
                    }
                }
                List list0 = x2.i.N(arrayList7);
                ArrayList arrayList8 = new ArrayList();
                for(Object object7: arrayList5) {
                    String s3 = ((n2.a)object7).p;
                    if(s3 != null) {
                        arrayList8.add(s3);
                    }
                }
                List list1 = x2.i.N(arrayList8);
                ArrayList arrayList9 = new ArrayList();
                for(Object object8: x2.i.e0(list0, G.p(null))) {
                    String s4 = (String)object8;
                    for(Object object9: x2.i.e0(list1, G.p(null))) {
                        String s5 = (String)object9;
                        if(s4 == null || s5 == null) {
                            E e0 = q2.e(new d(s5, s4));
                            if(e0 != null) {
                                arrayList9.add(new F(s4, s5, e0));
                            }
                        }
                    }
                }
                Iterator iterator10 = arrayList9.iterator();
                while(true) {
                    boolean z = iterator10.hasNext();
                    k0 = f0.t1;
                    k1 = f0.B;
                    if(!z) {
                        break;
                    }
                    Object object10 = iterator10.next();
                    E e1 = ((F)object10).c;
                    String[] arr_s = YieldLabel.i;
                    ArrayList arrayList10 = new ArrayList();
                    for(int v = 0; v < 6; ++v) {
                        String s6 = arr_s[v];
                        Integer integer0 = (Integer)e1.a.get(s6);
                        if(integer0 == null || ((int)integer0) <= 0) {
                            s8 = null;
                        }
                        else {
                            String s7 = s6.substring(6);
                            J2.j.e(s7, "substring(...)");
                            s8 = integer0 + "[ICON_" + s7 + "]";
                        }
                        if(s8 != null) {
                            arrayList10.add(s8);
                        }
                    }
                    String s9 = x2.i.Y(arrayList10, " ", null, null, null, 62);
                    String s10 = ((F)object10).a;
                    String s11 = ((F)object10).b;
                    if(s11 != null || s10 != null) {
                        if(s11 != null) {
                            Civics civics0 = (Civics)k1.h(s11);
                            if(civics0 != null) {
                                s12 = civics0.getName();
                            }
                        }
                        else if(s10 != null) {
                            Technologies technologies0 = (Technologies)k0.h(s10);
                            if(technologies0 != null) {
                                s12 = technologies0.getName();
                            }
                        }
                        else {
                            s12 = null;
                        }
                        if(s12 != null) {
                            s9 = A.f.i(s9, " ", a.H("LOC_TYPE_TRAIT_ADJACENT_BONUS_REQUIRES_TECH_OR_CIVIC", new Object[]{s12}));
                        }
                    }
                    if(s9.length() > 0) {
                        arrayList0.add(s9);
                    }
                }
                Plot plot1 = this.C;
                if(plot1 == null) {
                    J2.j.l("plot");
                    throw null;
                }
                String s13 = plot1.g();
                if(s13 != null) {
                    for(Object object11: ((List)f0.D0)) {
                        Improvement_BonusYieldChanges improvement_BonusYieldChanges0 = (Improvement_BonusYieldChanges)object11;
                        if(J2.j.a(improvement_BonusYieldChanges0.getImprovementType(), s13) && improvement_BonusYieldChanges0.getBonusYieldChange() != 0) {
                            Yields yields0 = (Yields)f0.R1.h(improvement_BonusYieldChanges0.getYieldType());
                            if(yields0 != null) {
                                if(improvement_BonusYieldChanges0.getPrereqCivic() != null) {
                                    Civics civics1 = (Civics)k1.h(improvement_BonusYieldChanges0.getPrereqCivic());
                                    if(civics1 != null) {
                                        s14 = civics1.getName();
                                    }
                                }
                                else if(improvement_BonusYieldChanges0.getPrereqTech() != null) {
                                    Technologies technologies1 = (Technologies)k0.h(improvement_BonusYieldChanges0.getPrereqTech());
                                    if(technologies1 != null) {
                                        s14 = technologies1.getName();
                                    }
                                }
                                else {
                                    s14 = null;
                                }
                                if(s14 != null) {
                                    arrayList0.add(a.H("LOC_TYPE_TRAIT_BONUS_YIELD", new Object[]{improvement_BonusYieldChanges0.getBonusYieldChange(), yields0.getIconString(), yields0.getName(), s14}));
                                }
                            }
                        }
                    }
                }
            }
            Plot plot2 = this.C;
            if(plot2 != null) {
                Features features0 = (Features)f0.j0.h(plot2.f());
                if(features0 != null && features0.getNaturalWonder() && features0.getDescription() != null) {
                    arrayList0.add("------------------");
                    arrayList0.add(a.H(features0.getDescription(), new Object[0]));
                }
                q q3 = this.D;
                if(q3 != null) {
                    B b0 = q3.a();
                    ArrayList arrayList11 = b0 == null ? r.i : b0.b;
                    if(!arrayList11.isEmpty()) {
                        arrayList0.add("------------------");
                        arrayList0.addAll(arrayList11);
                    }
                    TextView textView0 = this.H;
                    if(textView0 != null) {
                        o1.a.V(textView0, x2.i.Y(arrayList0, "[NEWLINE]", null, null, null, 62));
                        return;
                    }
                    J2.j.l("footerTextView");
                    throw null;
                }
                J2.j.l("adjacencyProps");
                throw null;
            }
            J2.j.l("plot");
            throw null;
        }
        J2.j.l("plot");
        throw null;
    }

    @Override  // androidx.fragment.app.j
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        if(v1 == -1 && v == 100 && intent0 != null) {
            Serializable serializable0 = intent0.getSerializableExtra("FIELD");
            J2.j.d(serializable0, "null cannot be cast to non-null type com.spears.civilopedia.planning.edit.KeyValueField");
            Plot plot0 = this.C;
            if(plot0 != null) {
                Plot plot1 = Plot.c(plot0);
                String s = intent0.getStringExtra("ID");
                switch(((i)serializable0).i.ordinal()) {
                    case 2: {
                        Plot plot2 = this.C;
                        if(plot2 != null) {
                            if(s == null) {
                                s = "TERRAIN_PLAINS";
                            }
                            plot2.s(s);
                            Plot plot3 = this.C;
                            if(plot3 != null) {
                                if(plot3.f() != null) {
                                    u u0 = this.G;
                                    if(u0 == null) {
                                        J2.j.l("validator");
                                        throw null;
                                    }
                                    Plot plot4 = this.C;
                                    if(plot4 == null) {
                                        J2.j.l("plot");
                                        throw null;
                                    }
                                    String s1 = plot4.f();
                                    J2.j.c(s1);
                                    if(!u0.g(s1).a()) {
                                        Plot plot5 = this.C;
                                        if(plot5 != null) {
                                            plot5.p(null);
                                            goto label_35;
                                        }
                                        J2.j.l("plot");
                                        throw null;
                                    }
                                }
                            label_35:
                                Plot plot6 = this.C;
                                if(plot6 != null) {
                                    if(plot6.h() != null) {
                                        u u1 = this.G;
                                        if(u1 == null) {
                                            J2.j.l("validator");
                                            throw null;
                                        }
                                        Plot plot7 = this.C;
                                        if(plot7 == null) {
                                            J2.j.l("plot");
                                            throw null;
                                        }
                                        String s2 = plot7.h();
                                        J2.j.c(s2);
                                        if(!u1.i(s2).a()) {
                                            Plot plot8 = this.C;
                                            if(plot8 != null) {
                                                plot8.r(null);
                                                goto label_55;
                                            }
                                            J2.j.l("plot");
                                            throw null;
                                        }
                                    }
                                label_55:
                                    Plot plot9 = this.C;
                                    if(plot9 != null) {
                                        if(plot9.g() != null) {
                                            u u2 = this.G;
                                            if(u2 == null) {
                                                J2.j.l("validator");
                                                throw null;
                                            }
                                            Plot plot10 = this.C;
                                            if(plot10 == null) {
                                                J2.j.l("plot");
                                                throw null;
                                            }
                                            String s3 = plot10.g();
                                            J2.j.c(s3);
                                            if(!u2.h(s3).a()) {
                                                Plot plot11 = this.C;
                                                if(plot11 != null) {
                                                    plot11.q(null);
                                                    goto label_75;
                                                }
                                                J2.j.l("plot");
                                                throw null;
                                            }
                                        }
                                    label_75:
                                        Plot plot12 = this.C;
                                        if(plot12 != null) {
                                            if(plot12.d() != null) {
                                                u u3 = this.G;
                                                if(u3 == null) {
                                                    J2.j.l("validator");
                                                    throw null;
                                                }
                                                Plot plot13 = this.C;
                                                if(plot13 == null) {
                                                    J2.j.l("plot");
                                                    throw null;
                                                }
                                                String s4 = plot13.d();
                                                J2.j.c(s4);
                                                if(!u3.e(s4).a()) {
                                                    Plot plot14 = this.C;
                                                    if(plot14 != null) {
                                                        plot14.n(null);
                                                        goto label_95;
                                                    }
                                                    J2.j.l("plot");
                                                    throw null;
                                                }
                                            }
                                        label_95:
                                            Plot plot15 = this.C;
                                            if(plot15 != null) {
                                                if(plot15.e() == null) {
                                                    goto label_367;
                                                }
                                                u u4 = this.G;
                                                if(u4 != null) {
                                                    Plot plot16 = this.C;
                                                    if(plot16 != null) {
                                                        String s5 = plot16.e();
                                                        J2.j.c(s5);
                                                        if(u4.f(s5).a()) {
                                                            goto label_367;
                                                        }
                                                        Plot plot17 = this.C;
                                                        if(plot17 != null) {
                                                            plot17.o(null);
                                                            goto label_367;
                                                        }
                                                        J2.j.l("plot");
                                                        throw null;
                                                    }
                                                    J2.j.l("plot");
                                                    throw null;
                                                }
                                                J2.j.l("validator");
                                                throw null;
                                            }
                                            J2.j.l("plot");
                                            throw null;
                                        }
                                        J2.j.l("plot");
                                        throw null;
                                    }
                                    J2.j.l("plot");
                                    throw null;
                                }
                                J2.j.l("plot");
                                throw null;
                            }
                            J2.j.l("plot");
                            throw null;
                        }
                        J2.j.l("plot");
                        throw null;
                    }
                    case 3: {
                        Plot plot18 = this.C;
                        if(plot18 != null) {
                            plot18.p(s);
                            Plot plot19 = this.C;
                            if(plot19 != null) {
                                if(plot19.h() != null) {
                                    u u5 = this.G;
                                    if(u5 == null) {
                                        J2.j.l("validator");
                                        throw null;
                                    }
                                    Plot plot20 = this.C;
                                    if(plot20 == null) {
                                        J2.j.l("plot");
                                        throw null;
                                    }
                                    String s6 = plot20.h();
                                    J2.j.c(s6);
                                    if(!u5.i(s6).a()) {
                                        Plot plot21 = this.C;
                                        if(plot21 != null) {
                                            plot21.r(null);
                                            goto label_150;
                                        }
                                        J2.j.l("plot");
                                        throw null;
                                    }
                                }
                            label_150:
                                Plot plot22 = this.C;
                                if(plot22 != null) {
                                    if(plot22.g() != null) {
                                        u u6 = this.G;
                                        if(u6 == null) {
                                            J2.j.l("validator");
                                            throw null;
                                        }
                                        Plot plot23 = this.C;
                                        if(plot23 == null) {
                                            J2.j.l("plot");
                                            throw null;
                                        }
                                        String s7 = plot23.g();
                                        J2.j.c(s7);
                                        if(!u6.h(s7).a()) {
                                            Plot plot24 = this.C;
                                            if(plot24 != null) {
                                                plot24.q(null);
                                                goto label_170;
                                            }
                                            J2.j.l("plot");
                                            throw null;
                                        }
                                    }
                                label_170:
                                    Plot plot25 = this.C;
                                    if(plot25 != null) {
                                        String s8 = plot25.d();
                                        if(s8 != null) {
                                            f f0 = this.l().b.b();
                                            ArrayList arrayList0 = new ArrayList();
                                            for(Object object0: ((Iterable)f0.o)) {
                                                if(J2.j.a(((Building_RequiredFeatures)object0).getBuildingType(), s8)) {
                                                    arrayList0.add(object0);
                                                }
                                            }
                                            if(arrayList0.isEmpty()) {
                                            label_189:
                                                Plot plot26 = this.C;
                                                if(plot26 != null) {
                                                    plot26.n(null);
                                                    goto label_195;
                                                }
                                                J2.j.l("plot");
                                                throw null;
                                            }
                                            else {
                                                u u7 = this.G;
                                                if(u7 == null) {
                                                    J2.j.l("validator");
                                                    throw null;
                                                }
                                                else if(!u7.e(s8).a()) {
                                                    goto label_189;
                                                }
                                            }
                                        }
                                    label_195:
                                        Plot plot27 = this.C;
                                        if(plot27 != null) {
                                            String s9 = plot27.e();
                                            if(s9 == null) {
                                                goto label_367;
                                            }
                                            f f1 = this.l().b.b();
                                            ArrayList arrayList1 = new ArrayList();
                                            for(Object object1: ((Iterable)f1.Y)) {
                                                if(J2.j.a(((District_RequiredFeatures)object1).getDistrictType(), s9)) {
                                                    arrayList1.add(object1);
                                                }
                                            }
                                            if(!arrayList1.isEmpty()) {
                                                u u8 = this.G;
                                                if(u8 != null) {
                                                    if(u8.f(s9).a()) {
                                                        goto label_367;
                                                    }
                                                    goto label_214;
                                                }
                                                J2.j.l("validator");
                                                throw null;
                                            }
                                        label_214:
                                            Plot plot28 = this.C;
                                            if(plot28 != null) {
                                                plot28.o(null);
                                                goto label_367;
                                            }
                                            J2.j.l("plot");
                                            throw null;
                                        }
                                        J2.j.l("plot");
                                        throw null;
                                    }
                                    J2.j.l("plot");
                                    throw null;
                                }
                                J2.j.l("plot");
                                throw null;
                            }
                            J2.j.l("plot");
                            throw null;
                        }
                        J2.j.l("plot");
                        throw null;
                    }
                    case 4: {
                        f f2 = this.l().b.b();
                        ArrayList arrayList2 = new ArrayList();
                        for(Object object2: ((Iterable)f2.o)) {
                            if(J2.j.a(((Building_RequiredFeatures)object2).getBuildingType(), s)) {
                                arrayList2.add(object2);
                            }
                        }
                        if(arrayList2.isEmpty()) {
                            Plot plot29 = this.C;
                            if(plot29 != null) {
                                plot29.p(null);
                                goto label_245;
                            }
                            J2.j.l("plot");
                            throw null;
                        }
                    label_245:
                        Plot plot30 = this.C;
                        if(plot30 != null) {
                            plot30.o(null);
                            Plot plot31 = this.C;
                            if(plot31 != null) {
                                plot31.n(s);
                                Plot plot32 = this.C;
                                if(plot32 != null) {
                                    plot32.r(null);
                                    Plot plot33 = this.C;
                                    if(plot33 != null) {
                                        plot33.q(null);
                                        goto label_367;
                                    }
                                    J2.j.l("plot");
                                    throw null;
                                }
                                J2.j.l("plot");
                                throw null;
                            }
                            J2.j.l("plot");
                            throw null;
                        }
                        J2.j.l("plot");
                        throw null;
                    }
                    case 5: {
                        f f3 = this.l().b.b();
                        ArrayList arrayList3 = new ArrayList();
                        for(Object object3: ((Iterable)f3.Y)) {
                            if(J2.j.a(((District_RequiredFeatures)object3).getDistrictType(), s)) {
                                arrayList3.add(object3);
                            }
                        }
                        if(arrayList3.isEmpty()) {
                            Plot plot34 = this.C;
                            if(plot34 != null) {
                                plot34.p(null);
                                goto label_281;
                            }
                            J2.j.l("plot");
                            throw null;
                        }
                    label_281:
                        Plot plot35 = this.C;
                        if(plot35 != null) {
                            plot35.o(s);
                            Plot plot36 = this.C;
                            if(plot36 != null) {
                                plot36.n(null);
                                Plot plot37 = this.C;
                                if(plot37 != null) {
                                    plot37.r(null);
                                    Plot plot38 = this.C;
                                    if(plot38 != null) {
                                        plot38.q(null);
                                        goto label_367;
                                    }
                                    J2.j.l("plot");
                                    throw null;
                                }
                                J2.j.l("plot");
                                throw null;
                            }
                            J2.j.l("plot");
                            throw null;
                        }
                        J2.j.l("plot");
                        throw null;
                    }
                    case 6: {
                        Plot plot39 = this.C;
                        if(plot39 != null) {
                            if(plot39.k()) {
                                Resources resources0 = (Resources)this.l().b.b().o1.h(s);
                                if(J2.j.a((resources0 == null ? null : resources0.getResourceClassType()), "RESOURCECLASS_LUXURY")) {
                                    Plot plot40 = this.C;
                                    if(plot40 != null) {
                                        plot40.r(s);
                                        goto label_325;
                                    }
                                    J2.j.l("plot");
                                    throw null;
                                }
                                Plot plot41 = this.C;
                                if(plot41 != null) {
                                    plot41.r(null);
                                    goto label_325;
                                }
                                J2.j.l("plot");
                                throw null;
                            }
                            Plot plot42 = this.C;
                            if(plot42 != null) {
                                plot42.o(null);
                                Plot plot43 = this.C;
                                if(plot43 != null) {
                                    plot43.r(s);
                                label_325:
                                    Plot plot44 = this.C;
                                    if(plot44 != null) {
                                        plot44.n(null);
                                        Plot plot45 = this.C;
                                        if(plot45 != null) {
                                            if(plot45.g() == null) {
                                                goto label_367;
                                            }
                                            u u9 = this.G;
                                            if(u9 != null) {
                                                Plot plot46 = this.C;
                                                if(plot46 != null) {
                                                    String s10 = plot46.g();
                                                    J2.j.c(s10);
                                                    if(u9.h(s10).a()) {
                                                        goto label_367;
                                                    }
                                                    Plot plot47 = this.C;
                                                    if(plot47 != null) {
                                                        plot47.q(null);
                                                        goto label_367;
                                                    }
                                                    J2.j.l("plot");
                                                    throw null;
                                                }
                                                J2.j.l("plot");
                                                throw null;
                                            }
                                            J2.j.l("validator");
                                            throw null;
                                        }
                                        J2.j.l("plot");
                                        throw null;
                                    }
                                    J2.j.l("plot");
                                    throw null;
                                }
                                J2.j.l("plot");
                                throw null;
                            }
                            J2.j.l("plot");
                            throw null;
                        }
                        J2.j.l("plot");
                        throw null;
                    }
                    case 7: {
                        Plot plot48 = this.C;
                        if(plot48 != null) {
                            plot48.o(null);
                            Plot plot49 = this.C;
                            if(plot49 != null) {
                                plot49.n(null);
                                Plot plot50 = this.C;
                                if(plot50 != null) {
                                    plot50.q(s);
                                label_367:
                                    if(plot1.k()) {
                                        Plot plot51 = this.C;
                                        if(plot51 == null) {
                                            J2.j.l("plot");
                                            throw null;
                                        }
                                        else if(plot51.e() == null) {
                                            this.C = plot1;
                                            u u10 = this.G;
                                            if(u10 != null) {
                                                u10.c.t(plot1);
                                                q q0 = this.D;
                                                if(q0 != null) {
                                                    q0.a.b.t(plot1);
                                                    goto label_385;
                                                }
                                                J2.j.l("adjacencyProps");
                                                throw null;
                                            }
                                            J2.j.l("validator");
                                            throw null;
                                        }
                                    }
                                label_385:
                                    this.n();
                                    L l0 = this.E;
                                    if(l0 != null) {
                                        l0.notifyDataSetChanged();
                                        this.o();
                                        return;
                                    }
                                    J2.j.l("adapter");
                                    throw null;
                                }
                                J2.j.l("plot");
                                throw null;
                            }
                            J2.j.l("plot");
                            throw null;
                        }
                        J2.j.l("plot");
                        throw null;
                    }
                    default: {
                        goto label_367;
                    }
                }
            }
            J2.j.l("plot");
            throw null;
        }
    }

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0A0024);  // layout:activity_plot_edit
        this.setTitle(a.H("LOC_WORLDBUILDER_PLOT", new Object[0]));
        A a0 = this.k().b();
        Serializable serializable0 = this.getIntent().getSerializableExtra("POSITION");
        J2.j.d(serializable0, "null cannot be cast to non-null type com.spears.civilopedia.planning.logic.PlotPosition");
        v v0 = ((s)a0.c).d(((t)serializable0));
        J2.j.c(v0);
        this.B = v0;
        Plot plot0 = Plot.c(v0.b);
        this.C = plot0;
        v v1 = this.B;
        if(v1 != null) {
            this.D = new q(v.a(v1, plot0), a0);
            f f0 = this.l().b.b();
            x x0 = this.l().b.d();
            Plot plot1 = this.C;
            if(plot1 != null) {
                q q0 = this.D;
                if(q0 != null) {
                    u u0 = new u(f0, x0, plot1, q0);
                    this.G = u0;
                    PlotEditActivity.I = u0;
                    this.E = new L(this, 0, 1);
                    this.n();
                    View view0 = this.findViewById(0x7F0700A3);  // id:list
                    J2.j.e(view0, "findViewById(...)");
                    this.F = (ListView)view0;
                    L l0 = this.E;
                    if(l0 != null) {
                        ((ListView)view0).setAdapter(l0);
                        ListView listView0 = this.F;
                        if(listView0 != null) {
                            listView0.setOnItemClickListener(new f2.K(this, 1));
                            LayoutInflater layoutInflater0 = this.getLayoutInflater();
                            ListView listView1 = this.F;
                            if(listView1 != null) {
                                View view1 = layoutInflater0.inflate(0x7F0A0037, listView1, false);  // layout:item_plot_edit_footer
                                View view2 = view1.findViewById(0x7F070113);  // id:textView
                                J2.j.e(view2, "findViewById(...)");
                                this.H = (TextView)view2;
                                ListView listView2 = this.F;
                                if(listView2 != null) {
                                    listView2.addFooterView(view1);
                                    this.o();
                                    return;
                                }
                                J2.j.l("listView");
                                throw null;
                            }
                            J2.j.l("listView");
                            throw null;
                        }
                        J2.j.l("listView");
                        throw null;
                    }
                    J2.j.l("adapter");
                    throw null;
                }
                J2.j.l("adjacencyProps");
                throw null;
            }
            J2.j.l("plot");
            throw null;
        }
        J2.j.l("plotWithPosition");
        throw null;
    }

    @Override  // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        this.getMenuInflater().inflate(0x7F0B0003, menu0);  // menu:options_plot_edit
        return super.onCreateOptionsMenu(menu0);
    }

    @Override  // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        J2.j.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x7F07007A) {  // id:done
            v v0 = this.B;
            if(v0 != null) {
                Plot plot0 = this.C;
                if(plot0 != null) {
                    v0.b = plot0;
                    this.setResult(100, this.getIntent());
                    this.finish();
                    return super.onOptionsItemSelected(menuItem0);
                }
                J2.j.l("plot");
                throw null;
            }
            J2.j.l("plotWithPosition");
            throw null;
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

