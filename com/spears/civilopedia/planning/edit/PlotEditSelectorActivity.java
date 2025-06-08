package com.spears.civilopedia.planning.edit;

import android.os.Bundle;
import android.support.v4.media.session.a;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spears.civilopedia.db.tables.Improvement_ValidBuildUnits;
import com.spears.civilopedia.db.tables.Improvements;
import com.spears.civilopedia.db.tables.Units;
import f2.j;
import f2.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k2.h;
import kotlin.Metadata;
import m2.c;
import m2.i;
import m2.o;
import m2.q;
import n2.A;
import n2.m;
import n2.u;
import o2.f;
import x2.k;
import x2.r;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spears/civilopedia/planning/edit/PlotEditSelectorActivity;", "Lf2/j;", "", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PlotEditSelectorActivity extends j {
    public ArrayList B;
    public c C;
    public static final int D;

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0A0025);  // layout:activity_plot_edit_selector
        Serializable serializable0 = this.getIntent().getSerializableExtra("FIELD");
        J2.j.d(serializable0, "null cannot be cast to non-null type com.spears.civilopedia.planning.edit.KeyValueField");
        this.setTitle(((i)serializable0).k);
        u u0 = PlotEditActivity.I;
        if(u0 != null) {
            switch(((i)serializable0).i.ordinal()) {
                case 2: {
                    Iterable iterable0 = this.l().b.d().k("FEATURES", "Terrain");
                    ArrayList arrayList0 = new ArrayList(k.E(iterable0));
                    for(Object object0: iterable0) {
                        arrayList0.add(new o(new q(), ((o2.q)object0)));  // 初始化器: Ljava/lang/Object;-><init>()V
                    }
                    this.B = arrayList0;
                    break;
                }
                case 3: {
                    Collection collection0 = this.l().b.d().k("FEATURES", "Feature");
                    ArrayList arrayList1 = x2.i.e0(this.l().b.d().k("FEATURES", "Wonder"), collection0);
                    ArrayList arrayList2 = new ArrayList(k.E(arrayList1));
                    for(Object object1: arrayList1) {
                        J2.j.f(((o2.q)object1), "page");
                        J2.j.f(((o2.q)object1).b, "p0");
                        arrayList2.add(new o(u0.g(((o2.q)object1).b), ((o2.q)object1)));
                    }
                    this.B = arrayList2;
                    break;
                }
                case 4: {
                    Iterable iterable1 = this.l().b.d().k("WONDERS", "Wonders");
                    ArrayList arrayList3 = new ArrayList(k.E(iterable1));
                    for(Object object2: iterable1) {
                        J2.j.f(((o2.q)object2), "page");
                        J2.j.f(((o2.q)object2).b, "p0");
                        arrayList3.add(new o(u0.e(((o2.q)object2).b), ((o2.q)object2)));
                    }
                    this.B = arrayList3;
                    break;
                }
                case 5: {
                    A a0 = this.k().b();
                    List list0 = (List)this.l().b.d().c.get("DISTRICTS");
                    if(list0 == null) {
                        list0 = r.i;
                    }
                    ArrayList arrayList4 = ((m)a0.f).a(list0);
                    ArrayList arrayList5 = new ArrayList(k.E(arrayList4));
                    for(Object object3: arrayList4) {
                        J2.j.f(((o2.q)object3), "page");
                        J2.j.f(((o2.q)object3).b, "p0");
                        arrayList5.add(new o(u0.f(((o2.q)object3).b), ((o2.q)object3)));
                    }
                    this.B = arrayList5;
                    break;
                }
                case 6: {
                    List list1 = (List)this.l().b.d().c.get("RESOURCES");
                    J2.j.c(list1);
                    ArrayList arrayList6 = new ArrayList(k.E(list1));
                    for(Object object4: list1) {
                        J2.j.f(((o2.q)object4), "page");
                        J2.j.f(((o2.q)object4).b, "p0");
                        arrayList6.add(new o(u0.i(((o2.q)object4).b), ((o2.q)object4)));
                    }
                    this.B = arrayList6;
                    break;
                }
                case 7: {
                    Iterable iterable2 = this.l().b.d().k("IMPROVEMENTS", "Improvements");
                    ArrayList arrayList7 = new ArrayList();
                    Iterator iterator5 = iterable2.iterator();
                    while(iterator5.hasNext()) {
                        boolean z = false;
                        Object object5 = iterator5.next();
                        A a1 = this.k().b();
                        String s = ((o2.q)object5).b;
                        m m0 = (m)a1.f;
                        m0.getClass();
                        J2.j.f(s, "id");
                        l l0 = m0.a;
                        Improvements improvements0 = (Improvements)l0.b.b().K0.h(s);
                        if(improvements0 != null) {
                            if(improvements0.getTraitType() == null) {
                                f2.m m1 = l0.b;
                                f f0 = m1.b();
                                ArrayList arrayList8 = new ArrayList();
                                for(Object object6: ((Iterable)f0.F0)) {
                                    if(J2.j.a(((Improvement_ValidBuildUnits)object6).getImprovementType(), s)) {
                                        arrayList8.add(object6);
                                    }
                                }
                                ArrayList arrayList9 = new ArrayList();
                                for(Object object7: arrayList8) {
                                    f f1 = m1.b();
                                    String s1 = ((Improvement_ValidBuildUnits)object7).getUnitType();
                                    Units units0 = (Units)f1.O1.h(s1);
                                    if(units0 != null) {
                                        arrayList9.add(units0);
                                    }
                                }
                                if(!arrayList9.isEmpty()) {
                                    for(Object object8: arrayList9) {
                                        if(((Units)object8).getTraitType() != null) {
                                            continue;
                                        }
                                        z = true;
                                        goto label_128;
                                    }
                                }
                                if(arrayList9.isEmpty()) {
                                    z = true;
                                }
                                else {
                                    ArrayList arrayList10 = new ArrayList();
                                    for(Object object9: arrayList9) {
                                        String s2 = ((Units)object9).getTraitType();
                                        if(s2 != null) {
                                            arrayList10.add(s2);
                                        }
                                    }
                                    if(!arrayList10.isEmpty()) {
                                        for(Object object10: arrayList10) {
                                            if(m0.d(((String)object10))) {
                                                z = true;
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                z = m0.d(improvements0.getTraitType());
                            }
                        }
                    label_128:
                        if(z) {
                            arrayList7.add(object5);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList(k.E(arrayList7));
                    for(Object object11: arrayList7) {
                        J2.j.f(((o2.q)object11), "page");
                        J2.j.f(((o2.q)object11).b, "p0");
                        arrayList11.add(new o(u0.h(((o2.q)object11).b), ((o2.q)object11)));
                    }
                    this.B = arrayList11;
                }
            }
            l l1 = this.l();
            ArrayList arrayList12 = this.B;
            if(arrayList12 != null) {
                c c0 = new c(l1, arrayList12);
                this.C = c0;
                c0.g = this;
                View view0 = this.findViewById(0x7F0700A3);  // id:list
                ((RecyclerView)view0).setHasFixedSize(true);
                ((RecyclerView)view0).setLayoutManager(new LinearLayoutManager());
                c c1 = this.C;
                if(c1 != null) {
                    ((RecyclerView)view0).setAdapter(c1);
                    ((RecyclerView)view0).setClickable(true);
                    J2.j.e(view0, "apply(...)");
                    RecyclerView recyclerView0 = (RecyclerView)view0;
                    return;
                }
                J2.j.l("adapter");
                throw null;
            }
            J2.j.l("data");
            throw null;
        }
        J2.j.l("validator");
        throw null;
    }

    @Override  // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        if(menu0 != null) {
            MenuItem menuItem0 = menu0.add(0, 0, 0, a.H("LOC_LEADER_VIEWER_DEBUG_RESET", new Object[0]));
            if(menuItem0 != null) {
                MenuItem menuItem1 = menuItem0.setShowAsActionFlags(2);
                if(menuItem1 != null) {
                    menuItem1.setOnMenuItemClickListener(new h(this, 2));
                }
            }
        }
        return super.onCreateOptionsMenu(menu0);
    }
}

