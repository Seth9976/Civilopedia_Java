package com.spears.civilopedia.tree.tech;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.support.v4.media.session.a;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.spears.civilopedia.db.tables.Boosts;
import com.spears.civilopedia.db.tables.Eras;
import com.spears.civilopedia.db.tables.Technologies;
import com.spears.civilopedia.db.tables.TechnologyPrereqs;
import f2.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import o2.C;
import o2.G;
import o2.f;
import o2.m;
import r2.d;
import r2.h;
import r2.i;
import r2.j;
import r2.k;
import t2.b;
import t2.c;
import w2.e;
import x2.n;
import x2.w;
import z1.a0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spears/civilopedia/tree/tech/TechTreeActivity;", "Lr2/h;", "Lt2/c;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TechTreeActivity extends h implements c {
    public final HashMap L;
    public final HashMap M;
    public final HashMap N;
    public final HashMap O;
    public String P;
    public final ArrayList Q;
    public static final int R;

    public TechTreeActivity() {
        this.L = new HashMap();
        this.M = new HashMap();
        this.N = new HashMap();
        this.O = new HashMap();
        this.Q = new ArrayList();
    }

    public static final int A(TechTreeActivity techTreeActivity0, d d0, j j0) {
        j j1 = (j)techTreeActivity0.D.c.get(d0.g);
        int v = 0;
        if(!J2.j.a((j1 == null ? null : j1.a), j0.a)) {
            return 0;
        }
        int v1 = 0;
        for(Object object0: d0.i) {
            String s = (String)object0;
            if(!J2.j.a(s, "_TREESTART")) {
                HashMap hashMap0 = techTreeActivity0.M;
                if(hashMap0.get(s) != null) {
                    Object object1 = hashMap0.get(s);
                    J2.j.c(object1);
                    int v2 = TechTreeActivity.A(techTreeActivity0, ((d)object1), j0);
                    if(v1 < v2) {
                        v1 = v2;
                    }
                }
            }
        }
        Integer integer0 = d0.m;
        if(integer0 != null) {
            v = (int)integer0;
        }
        d0.m = Math.max(v, v1);
        return v1 + 1;
    }

    public final void B(TechTreeNode techTreeNode0, k k0) {
        techTreeNode0.getNameLabel().setText(a.Q(k0.f));
        techTreeNode0.setListener(this);
        f f0 = this.r();
        f f1 = this.r();
        B.f f2 = this.I;
        if(f2 != null) {
            String s = (String)f2.j;
            ArrayList arrayList0 = this.C;
            if(arrayList0 != null) {
                String s1 = k0.c;
                ArrayList arrayList1 = C.q(f1, s1, s, arrayList0);
                techTreeNode0.setTechType(s1);
                if(techTreeNode0.u && arrayList1.size() == ((List)techTreeNode0.s).size()) {
                    int v = ((List)techTreeNode0.s).size();
                    int v1 = 0;
                    while(v1 < v) {
                        List list0 = (List)arrayList1.get(v1);
                        List list1 = (List)((List)techTreeNode0.s).get(v1);
                        if(!J2.j.a(list0.get(0), list1.get(0)) || !J2.j.a(list0.get(1), list1.get(1)) || !J2.j.a(list0.get(2), list1.get(2))) {
                            goto label_22;
                        }
                        ++v1;
                    }
                    goto label_79;
                }
            label_22:
                techTreeNode0.u = true;
                techTreeNode0.s = arrayList1;
                LinearLayout linearLayout0 = techTreeNode0.o;
                if(linearLayout0 != null) {
                    linearLayout0.removeAllViews();
                    m m0 = f0.t1.h(s1);
                    J2.j.c(m0);
                    if(!arrayList1.isEmpty()) {
                        for(Object object0: arrayList1) {
                            String s2 = (String)((List)object0).get(0);
                            String s3 = a0.B(f0, s2);
                            LayoutInflater layoutInflater0 = LayoutInflater.from(techTreeNode0.getContext());
                            LinearLayout linearLayout1 = techTreeNode0.o;
                            if(linearLayout1 != null) {
                                View view0 = layoutInflater0.inflate(0x7F0A0071, linearLayout1, false);  // layout:tree_node_unlock_icon
                                View view1 = view0.findViewById(0x7F07011E);  // id:unlock_icon
                                ImageView imageView0 = (ImageView)view0.findViewById(0x7F07008E);  // id:icon
                                J2.j.c(imageView0);
                                o1.a.R(imageView0, "ICON_" + s2, 50);
                                J2.j.c(((ImageView)view1));
                                o1.a.Q(((ImageView)view1), s3);
                                String s4 = w.l(f0, s2);
                                Context context0 = techTreeNode0.getContext();
                                J2.j.e(context0, "getContext(...)");
                                o1.a.O(context0, s4, false);
                                LinearLayout linearLayout2 = techTreeNode0.o;
                                if(linearLayout2 != null) {
                                    linearLayout2.addView(view0);
                                    view0.setOnClickListener(new b(techTreeNode0, s2, 0));
                                    continue;
                                }
                                J2.j.l("unlockStackView");
                                throw null;
                            }
                            J2.j.l("unlockStackView");
                            throw null;
                        }
                    }
                    String s5 = ((Technologies)m0).getDescription();
                    if(s5 != null) {
                        LayoutInflater layoutInflater1 = LayoutInflater.from(techTreeNode0.getContext());
                        LinearLayout linearLayout3 = techTreeNode0.o;
                        if(linearLayout3 != null) {
                            View view2 = layoutInflater1.inflate(0x7F0A0071, linearLayout3, false);  // layout:tree_node_unlock_icon
                            ImageView imageView1 = (ImageView)view2.findViewById(0x7F07011E);  // id:unlock_icon
                            J2.j.c(imageView1);
                            o1.a.Q(imageView1, "ICON_TECHUNLOCK_13");
                            LinearLayout linearLayout4 = techTreeNode0.o;
                            if(linearLayout4 != null) {
                                linearLayout4.addView(view2);
                                Context context1 = techTreeNode0.getContext();
                                J2.j.e(context1, "getContext(...)");
                                o1.a.O(context1, s5, false);
                                view2.setOnClickListener(new b(techTreeNode0, s5, 1));
                                goto label_79;
                            }
                            J2.j.l("unlockStackView");
                            throw null;
                        }
                        J2.j.l("unlockStackView");
                        throw null;
                    }
                label_79:
                    if(k0.g) {
                        techTreeNode0.getBoostIconView().setVisibility(0);
                        techTreeNode0.getBoostTextView().setVisibility(0);
                        String s6 = a.H("LOC_BOOST_TO_BOOST", new Object[0]) + a.H(k0.i, new Object[0]);
                        o1.a.V(techTreeNode0.getBoostTextView(), s6);
                        techTreeNode0.setBoostMeterPercent(((double)k0.h) * 0.01);
                    }
                    else {
                        techTreeNode0.getBoostIconView().setVisibility(8);
                        techTreeNode0.getBoostTextView().setVisibility(8);
                        techTreeNode0.getBoostMeterView().setVisibility(8);
                    }
                    o1.a.Q(techTreeNode0.getIconView(), "ICON_" + s1 + "_50");
                    return;
                }
                J2.j.l("unlockStackView");
                throw null;
            }
            J2.j.l("playerUnlockables");
            throw null;
        }
        J2.j.l("leaderDropDownView");
        throw null;
    }

    @Override  // r2.h
    public final void n(j j0, String s) {
        J2.j.f(s, "texture");
        ImageView imageView0 = new ImageView(this);
        o1.a.T(imageView0, s);
        imageView0.setColorFilter(0xFF000000, PorterDuff.Mode.SRC_IN);
        imageView0.setAlpha(0.2f);
        int v = ((Number)this.p(j0.h, 0).i).intValue();
        int v1 = j0.f == this.D.e ? -300 : 0;
        double f = ((double)j0.d) * 500.0;
        Context context0 = imageView0.getContext();
        J2.j.e(context0, "getContext(...)");
        double f1 = (double)context0.getResources().getDisplayMetrics().density;
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)(f * f1)), ((int)(500.0 * f1)));
        relativeLayout$LayoutParams0.leftMargin = (int)(((double)(v - 30 + v1)) * 1.0 * f1);
        relativeLayout$LayoutParams0.topMargin = (int)(100.0 * f1);
        imageView0.setLayoutParams(relativeLayout$LayoutParams0);
        this.t().addView(imageView0);
        int v2 = ((Number)this.p(j0.g + 1, 0).i).intValue();
        View view0 = this.getLayoutInflater().inflate(0x7F0A0033, this.t(), false);  // layout:era_label
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        J2.j.d(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).leftMargin = (int)((((double)(v2 - 30)) - 185.0) * ((double)this.getResources().getDisplayMetrics().density));
        ((TextView)view0.findViewById(0x7F070116)).setText(a.H("LOC_GAME_ERA_DESC", new Object[]{j0.c}));  // id:title
        this.t().addView(view0, ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0));
    }

    @Override  // r2.h
    public final e p(int v, int v1) {
        return new e(((int)((v - 1) * 440 + 305)), ((int)(v1 * 84 + 350)));
    }

    @Override  // r2.h
    public final i q() {
        return this.l().b.i;
    }

    @Override  // r2.h
    public final void u() {
        int v19;
        int v17;
        int v16;
        Iterator iterator16;
        int v12;
        int v10;
        HashMap hashMap2;
        String s1;
        HashMap hashMap1;
        HashMap hashMap0;
        Iterator iterator0 = ((List)this.r().t1.i).iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            hashMap0 = this.M;
            hashMap1 = this.N;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            Technologies technologies0 = (Technologies)object0;
            String s = technologies0.getDescription();
            Integer integer0 = technologies0.getUITreeRow();
            J2.j.c(integer0);
            new d(technologies0.getCost(), technologies0.getTechnologyType(), technologies0.getName(), ((int)integer0), (s == null ? "" : s), technologies0.getEraType());
            Iterator iterator1 = ((List)this.r().h).iterator();
            while(true) {
                boolean z1 = iterator1.hasNext();
                s1 = 0.a;
                if(!z1) {
                    break;
                }
                Object object1 = iterator1.next();
                Boosts boosts0 = (Boosts)object1;
                if(J2.j.a(boosts0.getTechnologyType(), s1)) {
                    String s2 = boosts0.getTriggerDescription();
                    J2.j.f(s2, "<set-?>");
                    0.c = s2;
                    0.h = true;
                    0.l = boosts0.getBoost();
                }
            }
            f f0 = this.r();
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: ((Iterable)f0.v1)) {
                if(J2.j.a(((TechnologyPrereqs)object2).getTechnology(), technologies0.getTechnologyType())) {
                    arrayList0.add(object2);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object3: arrayList0) {
                f f1 = this.r();
                String s3 = ((TechnologyPrereqs)object3).getPrereqTech();
                Technologies technologies1 = (Technologies)f1.t1.h(s3);
                String s4 = technologies1 == null ? null : technologies1.getTechnologyType();
                if(s4 != null) {
                    arrayList1.add(s4);
                }
            }
            0.i = arrayList1;
            if(arrayList1.isEmpty()) {
                0.i = G.p("_TREESTART");
            }
            String s5 = 0.g;
            Integer integer1 = (Integer)hashMap1.get(s5);
            if(integer1 == null) {
                hashMap1.put(s5, 1);
            }
            else {
                hashMap1.put(s5, ((int)(((int)integer1) + 1)));
            }
            hashMap0.put(s1, null);
        }
        f f2 = this.r();
        ArrayList arrayList2 = new ArrayList();
        for(Object object4: ((List)f2.d0.i)) {
            Integer integer2 = (Integer)hashMap1.get(((Eras)object4).getEraType());
            if((integer2 == null ? 0 : ((int)integer2)) > 0) {
                arrayList2.add(object4);
            }
        }
        ArrayList arrayList3 = new ArrayList(x2.k.E(arrayList2));
        for(Object object5: arrayList2) {
            String s6 = ((Eras)object5).getEraType();
            String s7 = ((Eras)object5).getEraTechBackgroundTexture();
            String s8 = ((Eras)object5).getName();
            int v = ((Eras)object5).getChronologyIndex();
            String s9 = ((Eras)object5).getTechTreeLayoutMethod();
            arrayList3.add(new j(s6, s7, s8, v, (s9 == null ? "" : s9)));
        }
        ArrayList arrayList4 = x2.i.p0(arrayList3);
        n.G(arrayList4, new C1.a(22));
        int v1 = arrayList4.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((j)arrayList4.get(v2)).f = v2;
            this.D.c.put(((j)arrayList4.get(v2)).a, arrayList4.get(v2));
        }
        for(Object object6: hashMap0.entrySet()) {
            d d0 = (d)((Map.Entry)object6).getValue();
            Object object7 = this.D.c.get(d0.g);
            J2.j.c(object7);
            j j0 = (j)object7;
            String s10 = j0.j.toUpperCase();
            J2.j.e(s10, "toUpperCase(...)");
            if(s10.equals("PREREQ")) {
                int v3 = TechTreeActivity.A(this, d0, j0);
                if(j0.d >= v3) {
                    continue;
                }
                j0.d = v3;
            }
            else {
                int v4 = d0.e;
                Map map0 = j0.i;
                if(map0.get(v4) == null) {
                    map0.put(v4, new ArrayList());
                }
                Object object8 = map0.get(v4);
                J2.j.c(object8);
                ((List)object8).add(d0.a);
                j0.d = map0.size();
            }
        }
        Iterator iterator7 = hashMap0.values().iterator();
    label_107:
        while(iterator7.hasNext()) {
            Object object9 = iterator7.next();
            d d1 = (d)object9;
            Object object10 = this.D.c.get(d1.g);
            J2.j.c(object10);
            j j1 = (j)object10;
            String s11 = j1.j.toUpperCase();
            J2.j.e(s11, "toUpperCase(...)");
            if(s11.equals("PREREQ")) {
                Integer integer3 = d1.m;
                if(integer3 != null) {
                    d1.d = ((int)integer3) + 1;
                    d1.m = null;
                    continue;
                }
            }
            Map map1 = j1.i;
            int v5 = 0;
            boolean z2 = false;
            Iterator iterator8 = x2.i.l0(map1.keySet()).iterator();
            do {
                if(!iterator8.hasNext()) {
                    continue label_107;
                }
                Object object11 = iterator8.next();
                Object object12 = map1.get(((Number)object11).intValue());
                J2.j.c(object12);
                ++v5;
                for(Object object13: ((List)object12)) {
                    if(J2.j.a(((String)object13), d1.a)) {
                        d1.d = v5;
                        z2 = true;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            while(!z2);
        }
        int v6 = 0;
        int v7 = 0;
        for(Object object14: ((List)this.r().d0.i)) {
            Eras eras0 = (Eras)object14;
            for(Object object15: this.D.c.entrySet()) {
                j j2 = (j)((Map.Entry)object15).getValue();
                if(j2.f == v7) {
                    j2.g = v6;
                    j2.h = (j2.d + 1) / 2 + v6;
                    v6 += j2.d + 1;
                    this.D.e = this.D.e >= 0 ? Math.min(this.D.e, v7) : v7;
                    break;
                }
                if(false) {
                    break;
                }
            }
            ++v7;
        }
        this.D.d = v6;
        for(int v8 = -3; true; ++v8) {
            hashMap2 = this.O;
            hashMap2.put(v8, new HashMap());
            if(v8 == 4) {
                break;
            }
        }
        for(Object object16: hashMap0.values()) {
            d d2 = (d)object16;
            Object object17 = this.D.c.get(d2.g);
            J2.j.c(object17);
            int v9 = ((j)object17).g + d2.d;
            Map map2 = (Map)hashMap2.get(d2.j);
            if(map2 != null) {
                map2.put(v9, d2.a);
            }
        }
        for(Object object18: hashMap0.values()) {
            Object object19 = this.D.c.get(((d)object18).g);
            J2.j.c(object19);
            e e0 = this.p(((j)object19).g + ((d)object18).d, ((d)object18).j);
            k k0 = new k(((Number)e0.i).intValue(), ((Number)e0.j).intValue() - w.c, ((d)object18).a);
            k0.d = 370;
            J2.j.f(((d)object18).b, "<set-?>");
            k0.f = ((d)object18).b;
            k0.h = ((d)object18).l;
            k0.g = ((d)object18).h;
            String s12 = ((d)object18).c;
            J2.j.f(s12, "<set-?>");
            k0.i = s12;
            this.D.a.put(((d)object18).a, k0);
        }
        Iterator iterator14 = hashMap0.entrySet().iterator();
        while(iterator14.hasNext()) {
            Object object20 = iterator14.next();
            d d3 = (d)((Map.Entry)object20).getValue();
            Object object21 = this.D.a.get(d3.a);
            J2.j.c(object21);
            k k1 = (k)object21;
            for(Object object22: d3.i) {
                String s13 = (String)object22;
                boolean z3 = J2.j.a(s13, "_TREESTART");
                String s14 = d3.a;
                if(!z3) {
                    d d4 = (d)hashMap0.get(s13);
                    if(d4 == null) {
                        System.out.print(i3.e.f("Unable to find PREREQ for tech \'", s14, "\'"));
                    }
                    else {
                        v10 = d4.j;
                        goto label_214;
                    }
                }
                v10 = 0;
            label_214:
                Object object23 = this.D.c.get(d3.g);
                J2.j.c(object23);
                int v11 = ((j)object23).g + d3.d;
                boolean z4 = false;
                boolean z5 = false;
                while(true) {
                    v12 = d3.j;
                    if(!z4) {
                        --v11;
                        Map map3 = (Map)hashMap2.get(v10);
                        iterator16 = iterator14;
                        String s15 = map3 == null ? null : ((String)map3.get(v11));
                        if(s15 == null) {
                            if(v11 <= 0) {
                                z4 = true;
                            }
                        }
                        else if(s15.equals(s13)) {
                            z4 = true;
                        }
                        if(!z4) {
                            Map map4 = (Map)hashMap2.get(v12);
                            if((map4 == null ? null : ((String)map4.get(v11))) != null) {
                                z5 = true;
                            }
                        }
                        if(v11 < 0) {
                            System.out.print(i3.e.f("Tech tree could not find prior for \'", s13, "\'"));
                            break;
                        }
                        else {
                            iterator14 = iterator16;
                            continue;
                        }
                    }
                    iterator16 = iterator14;
                    break;
                }
                if(v10 != -999) {
                    int v13 = k1.a;
                    int v14 = k1.b;
                    if(v10 < v12 || v10 > v12) {
                        r2.c c1 = new r2.c();
                        r2.c c2 = new r2.c();
                        r2.c c3 = new r2.c();
                        r2.c c4 = new r2.c();
                        r2.c c5 = new r2.c();
                        if(z5) {
                            v16 = v13 - 20;
                            v17 = ((Number)this.p(v11, v12).i).intValue();
                        }
                        else {
                            int v18 = ((Number)this.p(v11, v12).i).intValue();
                            v17 = ((Number)this.p(v11, v12).i).intValue();
                            v16 = v18 + 390;
                        }
                        if(v10 < v12) {
                            v19 = v14 - (v12 - v10) * 84;
                            c2.b = "Controls_TreePathDashSE";
                            c4.b = "Controls_TreePathDashES";
                        }
                        else {
                            v19 = (v10 - v12) * 84 + v14;
                            c2.b = "Controls_TreePathDashNE";
                            c4.b = "Controls_TreePathDashEN";
                        }
                        c1.a(v16 + 20, v14 - 20);
                        c1.b(v13 - v16 - 20, 40);
                        c1.b = "Controls_TreePathDashEW";
                        c2.a(v16 - 20, v14 - 20);
                        c2.b(40, 40);
                        c3.a(v16 - 20, Math.min(v14 + 20, v19 + 20));
                        c3.b(40, Math.abs(v14 - v19) - 40);
                        c3.b = "Controls_TreePathDashNS";
                        c4.a(v16 - 20, v19 - 20);
                        c4.b(40, 40);
                        c5.a(v17 + 370, v19 - 20);
                        c5.b(v16 - v17 - 390, 40);
                        c5.b = "Controls_TreePathDashEW";
                        this.D.b.put(A.f.i(s14, ",", s13), x2.j.z(new r2.c[]{c1, c2, c3, c4, c5}));
                    }
                    else {
                        r2.c c0 = new r2.c();
                        c0.b = "Controls_TreePathDashEW";
                        int v15 = ((Number)this.p(v11, v12).i).intValue();
                        c0.a(v15 + 370, v14 - 20);
                        c0.b(v13 - (v15 + 370), 40);
                        this.D.b.put(A.f.i(s14, ",", s13), G.p(c0));
                    }
                }
                iterator14 = iterator16;
            }
        }
        l l0 = this.l();
        l0.b.i = this.D;
    }

    @Override  // r2.h
    public final void v() {
        ImageView imageView0 = new ImageView(this);
        o1.a.Q(imageView0, "tree_start");
        e e0 = this.p(0, 0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        DisplayMetrics displayMetrics0 = this.getResources().getDisplayMetrics();
        relativeLayout$LayoutParams0.leftMargin = (int)(((float)(((Number)e0.i).intValue() + 328)) * displayMetrics0.density);
        DisplayMetrics displayMetrics1 = this.getResources().getDisplayMetrics();
        relativeLayout$LayoutParams0.topMargin = (int)(((float)(((Number)e0.j).intValue() - 71)) * displayMetrics1.density);
        this.t().addView(imageView0, relativeLayout$LayoutParams0);
    }

    @Override  // r2.h
    public final void w() {
        HashMap hashMap0 = this.L;
        HashSet hashSet0 = new HashSet(hashMap0.keySet());
        Set set0 = x2.i.r0(new HashSet(((Map)this.E).keySet()));
        set0.removeAll(hashSet0);
        for(Object object0: set0) {
            String s = (String)object0;
            Object object1 = this.D.a.get(s);
            J2.j.c(object1);
            k k0 = (k)object1;
            if(hashMap0.get(s) == null) {
                View view0 = this.getLayoutInflater().inflate(0x7F0A006B, this.s(), false);  // layout:techtree_node
                J2.j.d(view0, "null cannot be cast to non-null type com.spears.civilopedia.tree.tech.TechTreeNode");
                ((TechTreeNode)view0).setX(k0.a);
                ((TechTreeNode)view0).setY(k0.b);
                J2.j.c(s);
                hashMap0.put(s, ((TechTreeNode)view0));
                Context context0 = ((TechTreeNode)view0).getContext();
                J2.j.e(context0, "getContext(...)");
                DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
                int v = (int)(((double)k0.a) * ((double)displayMetrics0.density));
                int v1 = (int)((((double)k0.b) - ((double)w.c)) * ((double)displayMetrics0.density));
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)(370.0 * ((double)displayMetrics0.density))), ((int)(84.0 * ((double)displayMetrics0.density))));
                relativeLayout$LayoutParams0.leftMargin = v;
                relativeLayout$LayoutParams0.topMargin = v1;
                ((TechTreeNode)view0).setLayoutParams(relativeLayout$LayoutParams0);
                this.s().addView(((TechTreeNode)view0));
                this.B(((TechTreeNode)view0), k0);
            }
        }
    }

    @Override  // r2.h
    public final void x() {
        for(Object object0: this.L.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            TechTreeNode techTreeNode0 = (TechTreeNode)((Map.Entry)object0).getValue();
            Object object1 = this.D.a.get(s);
            J2.j.c(object1);
            this.B(techTreeNode0, ((k)object1));
        }
    }

    public final ArrayList z(String s) {
        f f0 = this.r();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f0.v1)) {
            if(J2.j.a(((TechnologyPrereqs)object0).getTechnology(), s)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((TechnologyPrereqs)object1).getPrereqTech());
        }
        ArrayList arrayList2 = x2.i.p0(arrayList1);
        for(Object object2: arrayList1) {
            arrayList2.addAll(this.z(((String)object2)));
        }
        return arrayList2;
    }
}

