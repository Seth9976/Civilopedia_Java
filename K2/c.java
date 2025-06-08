package k2;

import J2.j;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.view.ContextThemeWrapper;
import android.view.View.OnClickListener;
import android.view.View;
import com.spears.civilopedia.db.tables.Building_RequiredFeatures;
import com.spears.civilopedia.db.tables.Buildings;
import com.spears.civilopedia.db.tables.District_RequiredFeatures;
import com.spears.civilopedia.db.tables.Districts;
import com.spears.civilopedia.db.tables.Features;
import com.spears.civilopedia.db.tables.Improvements;
import com.spears.civilopedia.db.tables.Resources;
import com.spears.civilopedia.planning.PlanningActivity;
import com.spears.civilopedia.planning.edit.CityProductionActivity;
import com.spears.civilopedia.planning.edit.PlotEditActivity;
import com.spears.civilopedia.planning.logic.Plot;
import java.util.ArrayList;
import m2.a;
import n2.A;
import n2.b;
import n2.g;
import n2.h;
import n2.i;
import n2.t;
import n2.v;
import o2.f;
import o2.q;
import x2.k;

public final class c implements View.OnClickListener {
    public final int i;
    public final PlanningActivity j;
    public final v k;

    public c(PlanningActivity planningActivity0, v v0, int v1) {
        this.i = v1;
        this.j = planningActivity0;
        this.k = v0;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        String s5;
        String s3;
        String s1;
        String s;
        ArrayList arrayList2;
        v v0 = this.k;
        PlanningActivity planningActivity0 = this.j;
        switch(this.i) {
            case 0: {
                PlanningActivity planningActivity1 = this.j;
                j.f(planningActivity1, "this$0");
                v v1 = this.k;
                j.f(v1, "$plot");
                i i0 = planningActivity1.I;
                t t0 = v1.a;
                if(i0 instanceof h) {
                    j.d(i0, "null cannot be cast to non-null type com.spears.civilopedia.planning.logic.GridState.Placement");
                    a a0 = ((h)i0).a;
                    if(a0.b.contains(t0)) {
                        Plot plot0 = v1.b;
                        f f0 = planningActivity1.l().b.b();
                        ArrayList arrayList0 = new ArrayList();
                        q q0 = a0.a;
                        if(j.a(q0.a, "DISTRICTS")) {
                            ArrayList arrayList1 = new ArrayList();
                            for(Object object0: ((Iterable)f0.Y)) {
                                if(j.a(((District_RequiredFeatures)object0).getDistrictType(), q0.b)) {
                                    arrayList1.add(object0);
                                }
                            }
                            arrayList2 = new ArrayList(k.E(arrayList1));
                            for(Object object1: arrayList1) {
                                arrayList2.add(((District_RequiredFeatures)object1).getFeatureType());
                            }
                        }
                        else {
                            ArrayList arrayList3 = new ArrayList();
                            for(Object object2: ((Iterable)f0.o)) {
                                if(j.a(((Building_RequiredFeatures)object2).getBuildingType(), q0.b)) {
                                    arrayList3.add(object2);
                                }
                            }
                            arrayList2 = new ArrayList(k.E(arrayList3));
                            for(Object object3: arrayList3) {
                                arrayList2.add(((Building_RequiredFeatures)object3).getFeatureType());
                            }
                        }
                        if(j.a(q0.a, "DISTRICTS")) {
                            Districts districts0 = (Districts)f0.b0.h(q0.b);
                            s = districts0 == null ? null : districts0.getName();
                        }
                        else {
                            Buildings buildings0 = (Buildings)f0.v.h(q0.b);
                            s = buildings0 == null ? null : buildings0.getName();
                        }
                        if(plot0.f() != null && arrayList2.isEmpty()) {
                            Features features0 = (Features)f0.j0.h(plot0.f());
                            if(features0 == null) {
                                s1 = "";
                            }
                            else {
                                s1 = features0.getName();
                                if(s1 == null) {
                                    s1 = "";
                                }
                            }
                            arrayList0.add(android.support.v4.media.session.a.H("LOC_DISTRICT_ZONE_WILL_REMOVE_FEATURE", new Object[]{s1}));
                        }
                        String s2 = plot0.h();
                        if(s2 != null) {
                            Resources resources0 = (Resources)f0.o1.h(s2);
                            if(resources0 == null) {
                                s3 = "";
                            }
                            else {
                                s3 = resources0.getName();
                                if(s3 == null) {
                                    s3 = "";
                                }
                            }
                            arrayList0.add(android.support.v4.media.session.a.H("LOC_DISTRICT_ZONE_WILL_HARVEST_RESOURCE", new Object[]{s3}));
                        }
                        String s4 = plot0.g();
                        if(s4 != null) {
                            Improvements improvements0 = (Improvements)f0.K0.h(s4);
                            if(improvements0 == null) {
                                s5 = "";
                            }
                            else {
                                s5 = improvements0.getName();
                                if(s5 == null) {
                                    s5 = "";
                                }
                            }
                            arrayList0.add(android.support.v4.media.session.a.H("LOC_DISTRICT_ZONE_WILL_REMOVE_IMPROVEMENT", new Object[]{s5}));
                        }
                        new AlertDialog.Builder(planningActivity1);
                        AlertDialog.Builder alertDialog$Builder0 = new AlertDialog.Builder(new ContextThemeWrapper(planningActivity1, 0x7F0F0002));  // style:AlertDialogTheme
                        String s6 = j.a(q0.a, "DISTRICTS") ? "LOC_DISTRICT_ZONE_CONFIRM_DISTRICT_POPUP" : "LOC_DISTRICT_ZONE_CONFIRM_WONDER_POPUP";
                        if(s == null) {
                            s = "";
                        }
                        alertDialog$Builder0.setTitle(android.support.v4.media.session.a.H(s6, new Object[]{s})).setMessage(x2.i.Y(arrayList0, "\n", null, null, null, 62)).setPositiveButton(android.support.v4.media.session.a.H("LOC_YES_BUTTON", new Object[0]), new d(planningActivity1, a0, plot0, arrayList2, v1)).setNegativeButton(android.support.v4.media.session.a.H("LOC_NO_BUTTON", new Object[0]), null).show();
                        return;
                    }
                }
                else if(i0 instanceof g) {
                    Intent intent1 = new Intent(planningActivity1, PlotEditActivity.class);
                    intent1.putExtra("POSITION", t0);
                    planningActivity1.startActivityForResult(intent1, 100);
                }
                return;
            }
            case 1: {
                j.f(planningActivity0, "this$0");
                A a1 = planningActivity0.G;
                if(a1 != null) {
                    b b0 = ((n2.c)a1.d).a(v0.a);
                    if(b0 != null) {
                        planningActivity0.u(new n2.f(b0));
                    }
                    return;
                }
                j.l("world");
                throw null;
            }
            default: {
                j.f(planningActivity0, "this$0");
                j.f(v0, "$plot");
                if(planningActivity0.I instanceof g) {
                    Intent intent0 = new Intent(planningActivity0, CityProductionActivity.class);
                    intent0.putExtra("POSITION", v0.a);
                    planningActivity0.startActivityForResult(intent0, 101);
                }
            }
        }
    }
}

