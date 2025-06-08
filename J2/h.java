package j2;

import J2.j;
import Q1.b;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.spears.civilopedia.pages.PageActivity;
import com.spears.civilopedia.planning.PlanningActivity;
import com.spears.civilopedia.planning.edit.CityProductionActivity;
import com.spears.civilopedia.planning.edit.PlotEditSelectorActivity;
import com.spears.civilopedia.planning.logic.Plot;
import com.spears.civilopedia.tree.civic.CivicTreeActivity;
import com.spears.civilopedia.tree.civic.CivicTreeNode;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import l2.f;
import m2.a;
import m2.d;
import m2.o;
import m2.p;
import n2.A;
import n2.c;
import n2.e;
import n2.s;
import n2.t;
import n2.v;
import o2.k;
import o2.q;
import o2.x;
import s2.g;

public final class h implements View.OnClickListener {
    public final int i;
    public final Object j;
    public final Object k;

    public h(int v, Object object0, Object object1) {
        this.i = v;
        this.j = object0;
        this.k = object1;
        super();
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Class class0 = PageActivity.class;
        Object object0 = this.k;
        Object object1 = this.j;
        switch(this.i) {
            case 0: {
                j.f(((b)object1), "this$0");
                j.f(((k)object0), "$icon");
                for(Object object2: ((x)((b)object1).l).c.entrySet()) {
                    for(Object object3: ((List)((Map.Entry)object2).getValue())) {
                        q q0 = (q)object3;
                        if(!j.a(q0.b, ((k)object0).c)) {
                            continue;
                        }
                        LinearLayout linearLayout0 = (LinearLayout)((b)object1).k;
                        FirebaseAnalytics firebaseAnalytics0 = FirebaseAnalytics.getInstance(linearLayout0.getContext());
                        j.e(firebaseAnalytics0, "getInstance(...)");
                        firebaseAnalytics0.a("tap_icon_to_open_page", null);
                        Intent intent0 = new Intent(linearLayout0.getContext(), class0);
                        intent0.putExtra("PageId", q0.b);
                        intent0.putExtra("SectionId", q0.a);
                        intent0.setFlags(0x10000000);
                        linearLayout0.getContext().startActivity(intent0);
                        return;
                    }
                    if(false) {
                        break;
                    }
                }
                return;
            }
            case 1: {
                j.f(((PlanningActivity)object0), "this$0");
                v v0 = new v(((t)object1), new Plot());
                A a0 = ((PlanningActivity)object0).G;
                if(a0 != null) {
                    ((s)a0.c).a.add(v0);
                    ((PlanningActivity)object0).o(v0);
                    ((PlanningActivity)object0).t();
                    return;
                }
                j.l("world");
                throw null;
            }
            case 2: {
                j.f(((PlanningActivity)object1), "this$0");
                if(((PlanningActivity)object1).I instanceof e) {
                    ((f)object0).setStatus((((f)object0).getStatus() == l2.e.j ? l2.e.i : l2.e.j));
                    if(((f)object0).getStatus() == l2.e.j) {
                        A a1 = ((PlanningActivity)object1).G;
                        if(a1 != null) {
                            ((c)a1.b).a.add(((f)object0).getRiver());
                            return;
                        }
                        j.l("world");
                        throw null;
                    }
                    A a2 = ((PlanningActivity)object1).G;
                    if(a2 != null) {
                        n2.x x0 = ((f)object0).getRiver();
                        c c0 = (c)a2.b;
                        c0.getClass();
                        j.f(x0, "river");
                        c0.a.remove(x0);
                        return;
                    }
                    j.l("world");
                    throw null;
                }
                return;
            }
            case 3: {
                j.f(((m2.c)object1), "this$0");
                CityProductionActivity cityProductionActivity0 = (CityProductionActivity)((m2.c)object1).g;
                if(cityProductionActivity0 != null) {
                    j.f(((m2.f)object0).a.a, "page");
                    String s = ((m2.f)object0).a.a.a;
                    j.f(s, "sectionId");
                    String s1 = ((m2.f)object0).a.a.b;
                    j.f(s1, "pageId");
                    Intent intent1 = new Intent(cityProductionActivity0, class0);
                    intent1.putExtra("PageId", s1);
                    intent1.putExtra("SectionId", s);
                    cityProductionActivity0.startActivity(intent1);
                }
                return;
            }
            case 4: {
                j.f(((m2.c)object1), "this$0");
                j.f(((m2.e)object0), "$item");
                CityProductionActivity cityProductionActivity1 = (CityProductionActivity)((m2.c)object1).g;
                if(cityProductionActivity1 != null) {
                    m2.f f0 = ((m2.e)object0) instanceof m2.f ? ((m2.f)(((m2.e)object0))) : null;
                    if(f0 != null) {
                        a a3 = f0.a;
                        p p0 = a3.c instanceof p ? ((p)a3.c) : null;
                        if(p0 != null) {
                            Toast.makeText(cityProductionActivity1, p0.b, 0).show();
                        }
                        else if(a3.b.isEmpty()) {
                            Toast.makeText(cityProductionActivity1, android.support.v4.media.session.a.H("LOC_BUILDING_CONSTRUCT_NO_SUITABLE_LOCATION", new Object[0]), 0).show();
                        }
                        else {
                            CityProductionActivity.C = a3;
                            cityProductionActivity1.setResult(-1);
                            cityProductionActivity1.finish();
                        }
                    }
                    d d0 = ((m2.e)object0) instanceof d ? ((d)(((m2.e)object0))) : null;
                    if(d0 != null) {
                        m2.c c1 = cityProductionActivity1.B;
                        if(c1 != null) {
                            String s2 = d0.a;
                            HashSet hashSet0 = c1.e;
                            if(hashSet0.contains(s2)) {
                                hashSet0.remove(s2);
                            }
                            else {
                                hashSet0.add(s2);
                            }
                            c1.e();
                            m2.c c2 = cityProductionActivity1.B;
                            if(c2 != null) {
                                c2.a.a();
                                return;
                            }
                            j.l("adapter");
                            throw null;
                        }
                        j.l("adapter");
                        throw null;
                    }
                }
                return;
            }
            case 5: {
                j.f(((m2.c)object1), "this$0");
                PlotEditSelectorActivity plotEditSelectorActivity0 = (PlotEditSelectorActivity)((m2.c)object1).g;
                if(plotEditSelectorActivity0 != null) {
                    j.f(((m2.k)object0).a.b, "page");
                    String s3 = ((m2.k)object0).a.b.a;
                    j.f(s3, "sectionId");
                    String s4 = ((m2.k)object0).a.b.b;
                    j.f(s4, "pageId");
                    Intent intent2 = new Intent(plotEditSelectorActivity0, class0);
                    intent2.putExtra("PageId", s4);
                    intent2.putExtra("SectionId", s3);
                    plotEditSelectorActivity0.startActivity(intent2);
                }
                return;
            }
            case 6: {
                j.f(((m2.c)object1), "this$0");
                j.f(((m2.j)object0), "$item");
                PlotEditSelectorActivity plotEditSelectorActivity1 = (PlotEditSelectorActivity)((m2.c)object1).g;
                if(plotEditSelectorActivity1 != null) {
                    m2.k k0 = ((m2.j)object0) instanceof m2.k ? ((m2.k)(((m2.j)object0))) : null;
                    if(k0 != null) {
                        o o0 = k0.a;
                        p p1 = o0.a instanceof p ? ((p)o0.a) : null;
                        if(p1 == null) {
                            Intent intent3 = new Intent(plotEditSelectorActivity1.getIntent());
                            intent3.putExtra("ID", o0.b.b);
                            plotEditSelectorActivity1.setResult(-1, intent3);
                            plotEditSelectorActivity1.finish();
                        }
                        else {
                            Toast.makeText(plotEditSelectorActivity1, p1.a + "\n" + p1.b, 0).show();
                        }
                    }
                    m2.h h0 = ((m2.j)object0) instanceof m2.h ? ((m2.h)(((m2.j)object0))) : null;
                    if(h0 != null) {
                        m2.c c3 = plotEditSelectorActivity1.C;
                        if(c3 != null) {
                            String s5 = h0.a.b;
                            j.f(s5, "group");
                            HashSet hashSet1 = c3.e;
                            if(hashSet1.contains(s5)) {
                                hashSet1.remove(s5);
                            }
                            else {
                                hashSet1.add(s5);
                            }
                            c3.e();
                            m2.c c4 = plotEditSelectorActivity1.C;
                            if(c4 != null) {
                                c4.a.a();
                                return;
                            }
                            j.l("adapter");
                            throw null;
                        }
                        j.l("adapter");
                        throw null;
                    }
                }
                return;
            }
            default: {
                j.f(((CivicTreeNode)object1), "this$0");
                j.f(((s2.f)object0), "$icon");
                g g0 = ((CivicTreeNode)object1).u;
                if(g0 != null) {
                    ((CivicTreeActivity)g0).B(((s2.f)object0).c);
                }
            }
        }
    }
}

