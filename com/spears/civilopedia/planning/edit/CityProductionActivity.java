package com.spears.civilopedia.planning.edit;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spears.civilopedia.db.tables.Districts;
import f2.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import m2.a;
import m2.c;
import n2.A;
import n2.b;
import n2.m;
import n2.q;
import n2.s;
import n2.t;
import n2.u;
import n2.v;
import o2.f;
import o2.x;
import w2.e;
import x2.i;
import x2.k;
import x2.r;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spears/civilopedia/planning/edit/CityProductionActivity;", "Lf2/j;", "", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CityProductionActivity extends j {
    public c B;
    public static a C;

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0A001C);  // layout:activity_city_production
        this.setTitle(android.support.v4.media.session.a.H("LOC_HUD_CHOOSE_PRODUCTION", new Object[0]));
        Serializable serializable0 = this.getIntent().getSerializableExtra("POSITION");
        J2.j.d(serializable0, "null cannot be cast to non-null type com.spears.civilopedia.planning.logic.PlotPosition");
        A a0 = this.k().b();
        b b0 = ((n2.c)a0.d).a(((t)serializable0));
        J2.j.c(b0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: b0.c) {
            v v0 = ((s)a0.c).d(((t)object0));
            if(v0 != null) {
                arrayList0.add(v0);
            }
        }
        f f0 = this.l().b.b();
        x x0 = this.l().b.d();
        ArrayList arrayList1 = new ArrayList();
        for(Object object1: arrayList0) {
            if(((v)object1).b.e() == null && ((v)object1).b.d() == null) {
                arrayList1.add(object1);
            }
        }
        ArrayList arrayList2 = new ArrayList(k.E(arrayList1));
        for(Object object2: arrayList1) {
            arrayList2.add(new u(f0, x0, ((v)object2).b, new q(((v)object2), a0)));
        }
        List list0 = (List)this.l().b.d().c.get("DISTRICTS");
        if(list0 == null) {
            list0 = r.i;
        }
        ArrayList arrayList3 = ((m)a0.f).a(list0);
        ArrayList arrayList4 = new ArrayList();
        for(Object object3: arrayList3) {
            Districts districts0 = (Districts)f0.b0.h(((o2.q)object3).b);
            if(districts0 != null && districts0.getRequiresPlacement()) {
                arrayList4.add(object3);
            }
        }
        ArrayList arrayList5 = new ArrayList(k.E(arrayList4));
        Iterator iterator4 = arrayList4.iterator();
        while(true) {
            Object object4 = null;
            if(!iterator4.hasNext()) {
                break;
            }
            Object object5 = iterator4.next();
            o2.q q0 = (o2.q)object5;
            ArrayList arrayList6 = new ArrayList(k.E(arrayList2));
            for(Object object6: arrayList2) {
                arrayList6.add(((u)object6).f(q0.b));
            }
            for(Object object7: arrayList6) {
                if(J2.j.a(((m2.r)object7).b(), "BUILT")) {
                    object4 = object7;
                    break;
                }
                if(false) {
                    break;
                }
            }
            ArrayList arrayList7 = i.v0(arrayList2, arrayList6);
            ArrayList arrayList8 = new ArrayList();
            for(Object object8: arrayList7) {
                if(((m2.r)((e)object8).j).a()) {
                    arrayList8.add(object8);
                }
            }
            ArrayList arrayList9 = new ArrayList(k.E(arrayList8));
            for(Object object9: arrayList8) {
                arrayList9.add(((u)((e)object9).i).d.a.a);
            }
            arrayList5.add(new a(q0, arrayList9, ((m2.r)object4)));
        }
        Iterable iterable0 = x0.k("WONDERS", "Wonders");
        ArrayList arrayList10 = new ArrayList(k.E(iterable0));
        for(Object object10: iterable0) {
            o2.q q1 = (o2.q)object10;
            ArrayList arrayList11 = new ArrayList(k.E(arrayList2));
            for(Object object11: arrayList2) {
                arrayList11.add(((u)object11).e(q1.b));
            }
            for(Object object12: arrayList11) {
                if(!J2.j.a(((m2.r)object12).b(), "BUILT")) {
                    continue;
                }
                goto label_96;
            }
            object12 = null;
        label_96:
            ArrayList arrayList12 = i.v0(arrayList2, arrayList11);
            ArrayList arrayList13 = new ArrayList();
            for(Object object13: arrayList12) {
                if(((m2.r)((e)object13).j).a()) {
                    arrayList13.add(object13);
                }
            }
            ArrayList arrayList14 = new ArrayList(k.E(arrayList13));
            for(Object object14: arrayList13) {
                arrayList14.add(((u)((e)object14).i).d.a.a);
            }
            arrayList10.add(new a(q1, arrayList14, ((m2.r)object12)));
        }
        i.e0(arrayList10, arrayList5);
        c c0 = new c(this.l(), arrayList5, arrayList10);
        this.B = c0;
        c0.g = this;
        View view0 = this.findViewById(0x7F0700A3);  // id:list
        ((RecyclerView)view0).setHasFixedSize(true);
        ((RecyclerView)view0).setLayoutManager(new LinearLayoutManager());
        c c1 = this.B;
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
}

