package com.spears.civilopedia.tree.civic;

import J2.j;
import J2.u;
import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spears.civilopedia.R.drawable;
import com.spears.civilopedia.db.tables.Boosts;
import com.spears.civilopedia.db.tables.CivicModifiers;
import com.spears.civilopedia.db.tables.CivicPrereqs;
import com.spears.civilopedia.db.tables.Civics;
import com.spears.civilopedia.db.tables.Eras;
import com.spears.civilopedia.db.tables.Government_SlotCounts;
import com.spears.civilopedia.db.tables.Governments;
import com.spears.civilopedia.db.tables.ModifierArguments;
import com.spears.civilopedia.db.tables.Modifiers;
import com.spears.civilopedia.db.tables.Policies;
import com.spears.civilopedia.db.tables.Types;
import f2.l;
import f2.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import o2.B;
import o2.C;
import o2.G;
import o2.a;
import o2.b;
import o2.f;
import o2.m;
import r2.h;
import r2.i;
import r2.k;
import s2.c;
import s2.e;
import s2.g;
import x2.w;
import z1.a0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spears/civilopedia/tree/civic/CivicTreeActivity;", "Lr2/h;", "Ls2/g;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CivicTreeActivity extends h implements g {
    public final HashMap L;
    public final HashMap M;
    public final HashMap N;
    public final HashMap O;
    public final HashMap P;
    public final HashMap Q;
    public final HashMap R;
    public String S;
    public final ArrayList T;
    public static final int U;

    public CivicTreeActivity() {
        this.L = new HashMap();
        this.M = new HashMap();
        this.N = new HashMap();
        this.O = new HashMap();
        this.P = new HashMap();
        this.Q = new HashMap();
        this.R = new HashMap();
        this.T = new ArrayList();
    }

    public final void A(CivicTreeNode civicTreeNode0, k k0) {
        Civics civics0;
        Iterator iterator3;
        String s4;
        int v6;
        String s1;
        civicTreeNode0.setListener(this);
        f f0 = this.r();
        f f1 = this.r();
        ArrayList arrayList0 = this.C;
        if(arrayList0 != null) {
            String s = k0.c;
            ArrayList arrayList1 = C.o(f1, s, "", arrayList0);
            civicTreeNode0.setCivicType(s);
            if(civicTreeNode0.y && arrayList1.size() == ((List)civicTreeNode0.w).size()) {
                int v = ((List)civicTreeNode0.w).size();
                int v1 = 0;
                while(v1 < v) {
                    List list0 = (List)arrayList1.get(v1);
                    List list1 = (List)((List)civicTreeNode0.w).get(v1);
                    if(!j.a(list0.get(0), list1.get(0)) || !j.a(list0.get(1), list1.get(1)) || !j.a(list0.get(2), list1.get(2))) {
                        goto label_19;
                    }
                    ++v1;
                }
                s1 = s;
                goto label_166;
            }
        label_19:
            civicTreeNode0.y = true;
            civicTreeNode0.w = arrayList1;
            LinearLayout linearLayout0 = civicTreeNode0.o;
            if(linearLayout0 != null) {
                linearLayout0.removeAllViews();
                m m0 = f0.B.h(s);
                j.c(m0);
                HashMap hashMap0 = B.a;
                if(hashMap0.isEmpty()) {
                    for(Object object0: ((List)f0.n0.i)) {
                        String s2 = ((Governments)object0).getGovernmentType();
                        int v2 = 0;
                        int v3 = 0;
                        int v4 = 0;
                        int v5 = 0;
                        for(Object object1: ((List)f0.m0)) {
                            Government_SlotCounts government_SlotCounts0 = (Government_SlotCounts)object1;
                            if(j.a(s2, government_SlotCounts0.getGovernmentType())) {
                                switch(government_SlotCounts0.getGovernmentSlotType()) {
                                    case "SLOT_DIPLOMATIC": {
                                        v4 = government_SlotCounts0.getNumSlots() + v4;
                                        continue;
                                    }
                                    case "SLOT_ECONOMIC": {
                                        v3 = government_SlotCounts0.getNumSlots() + v3;
                                        continue;
                                    }
                                    case "SLOT_GREAT_PERSON": 
                                    case "SLOT_WILDCARD": {
                                        v5 = government_SlotCounts0.getNumSlots() + v5;
                                        continue;
                                    }
                                    case "SLOT_MILITARY": {
                                        v2 = government_SlotCounts0.getNumSlots() + v2;
                                    }
                                }
                            }
                        }
                        a a0 = new a(((Governments)object0).getName(), v2, v3, v4, v5);
                        B.a.put(s2, a0);
                    }
                    hashMap0 = B.a;
                }
                if(arrayList1.isEmpty()) {
                    civics0 = (Civics)m0;
                    s1 = s;
                    v6 = 0;
                }
                else {
                    v6 = 0;
                    Iterator iterator2 = arrayList1.iterator();
                    while(iterator2.hasNext()) {
                        Object object2 = iterator2.next();
                        String s3 = (String)((List)object2).get(0);
                        Types types0 = (Types)f0.D1.h(s3);
                        if(types0 == null) {
                            iterator3 = iterator2;
                            s4 = null;
                        }
                        else {
                            s4 = types0.getKind();
                            iterator3 = iterator2;
                        }
                        if(j.a(s4, "KIND_GOVERNMENT")) {
                            v6 += 4;
                            LayoutInflater layoutInflater0 = LayoutInflater.from(civicTreeNode0.getContext());
                            LinearLayout linearLayout1 = civicTreeNode0.o;
                            if(linearLayout1 != null) {
                                View view0 = layoutInflater0.inflate(0x7F0A002C, linearLayout1, false);  // layout:civictree_node_goverment_icon
                                int v7 = 0x7F070075;  // id:diplomaticPolicyLabel
                                TextView textView0 = (TextView)a0.r(view0, 0x7F070075);  // id:diplomaticPolicyLabel
                                if(textView0 != null) {
                                    v7 = 0x7F07007C;  // id:economicPolicyLabel
                                    TextView textView1 = (TextView)a0.r(view0, 0x7F07007C);  // id:economicPolicyLabel
                                    if(textView1 != null) {
                                        TextView textView2 = (TextView)a0.r(view0, 0x7F0700AD);  // id:militaryPolicyLabel
                                        if(textView2 == null) {
                                            v7 = 0x7F0700AD;  // id:militaryPolicyLabel
                                        }
                                        else {
                                            TextView textView3 = (TextView)a0.r(view0, 0x7F0700B0);  // id:nameLabel
                                            if(textView3 == null) {
                                                v7 = 0x7F0700B0;  // id:nameLabel
                                            }
                                            else {
                                                TextView textView4 = (TextView)a0.r(view0, 0x7F070129);  // id:wildcardPolicyLabel
                                                if(textView4 == null) {
                                                    v7 = 0x7F070129;  // id:wildcardPolicyLabel
                                                }
                                                else {
                                                    a a1 = (a)hashMap0.get(s3);
                                                    if(a1 != null) {
                                                        textView3.setText(android.support.v4.media.session.a.H(a1.a, new Object[0]));
                                                        textView2.setText(String.valueOf(a1.b));
                                                        textView1.setText(String.valueOf(a1.c));
                                                        textView0.setText(String.valueOf(a1.d));
                                                        textView4.setText(String.valueOf(a1.e));
                                                    }
                                                    j.e(((RelativeLayout)view0), "getRoot(...)");
                                                    civicTreeNode0.a(((RelativeLayout)view0), v6);
                                                    ((RelativeLayout)view0).setOnClickListener(new e(civicTreeNode0, s3, 0));
                                                    iterator2 = iterator3;
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                                throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v7));
                            }
                            j.l("unlockStackView");
                            throw null;
                        }
                        ++v6;
                        String s5 = a0.B(f0, s3);
                        LayoutInflater layoutInflater1 = LayoutInflater.from(civicTreeNode0.getContext());
                        LinearLayout linearLayout2 = civicTreeNode0.o;
                        if(linearLayout2 != null) {
                            B1.a a2 = B1.a.x(layoutInflater1, linearLayout2);
                            boolean z = j.a((types0 == null ? null : types0.getKind()), "KIND_POLICY");
                            ImageView imageView0 = (ImageView)a2.k;
                            if(z) {
                                o1.a.Q(imageView0, "ICON_" + s3 + "_50");
                            }
                            else {
                                o1.a.R(imageView0, "ICON_" + s3, 50);
                            }
                            o1.a.Q(((ImageView)a2.l), s5);
                            RelativeLayout relativeLayout0 = (RelativeLayout)a2.j;
                            j.e(relativeLayout0, "getRoot(...)");
                            civicTreeNode0.a(relativeLayout0, v6);
                            relativeLayout0.setOnClickListener(new e(civicTreeNode0, s3, 1));
                            iterator2 = iterator3;
                            continue;
                        }
                        j.l("unlockStackView");
                        throw null;
                    }
                    civics0 = (Civics)m0;
                    s1 = s;
                }
                String s6 = civics0.getDescription();
                if(s6 != null) {
                    ++v6;
                    LayoutInflater layoutInflater2 = LayoutInflater.from(civicTreeNode0.getContext());
                    LinearLayout linearLayout3 = civicTreeNode0.o;
                    if(linearLayout3 != null) {
                        B1.a a3 = B1.a.x(layoutInflater2, linearLayout3);
                        o1.a.Q(((ImageView)a3.l), "ICON_TECHUNLOCK_13");
                        RelativeLayout relativeLayout1 = (RelativeLayout)a3.j;
                        j.e(relativeLayout1, "getRoot(...)");
                        civicTreeNode0.a(relativeLayout1, v6);
                        relativeLayout1.setOnClickListener(new e(civicTreeNode0, s6, 2));
                        goto label_148;
                    }
                    j.l("unlockStackView");
                    throw null;
                }
            label_148:
                for(Object object3: civicTreeNode0.v) {
                    ++v6;
                    LayoutInflater layoutInflater3 = LayoutInflater.from(civicTreeNode0.getContext());
                    LinearLayout linearLayout4 = civicTreeNode0.o;
                    if(linearLayout4 != null) {
                        View view1 = layoutInflater3.inflate(0x7F0A002D, linearLayout4, false);  // layout:civictree_unlock_numbered_icon
                        TextView textView5 = (TextView)a0.r(view1, 0x7F07009A);  // id:label
                        if(textView5 == null) {
                            throw new NullPointerException("Missing required view with ID: " + view1.getResources().getResourceName(0x7F07009A));  // id:label
                        }
                        o1.a.V(textView5, ((s2.f)object3).a + ((s2.f)object3).b);
                        j.e(((RelativeLayout)view1), "getRoot(...)");
                        civicTreeNode0.a(((RelativeLayout)view1), v6);
                        ((RelativeLayout)view1).setOnClickListener(new j2.h(7, civicTreeNode0, ((s2.f)object3)));
                        continue;
                    }
                    j.l("unlockStackView");
                    throw null;
                }
            label_166:
                civicTreeNode0.getNameLabel().setText(android.support.v4.media.session.a.Q(k0.f));
                if(k0.g) {
                    civicTreeNode0.getBoostIconView().setVisibility(0);
                    civicTreeNode0.getBoostTextView().setVisibility(0);
                    String s7 = android.support.v4.media.session.a.H("LOC_BOOST_TO_BOOST", new Object[0]) + android.support.v4.media.session.a.H(k0.i, new Object[0]);
                    o1.a.V(civicTreeNode0.getBoostTextView(), s7);
                    civicTreeNode0.setBoostMeterPercent(((double)k0.h) * 0.01);
                }
                else {
                    civicTreeNode0.getBoostIconView().setVisibility(8);
                    civicTreeNode0.getBoostTextView().setVisibility(8);
                    civicTreeNode0.getBoostMeterView().setVisibility(8);
                }
                o1.a.Q(civicTreeNode0.getIconView(), "ICON_" + s1 + "_50");
                return;
            }
            j.l("unlockStackView");
            throw null;
        }
        j.l("playerUnlockables");
        throw null;
    }

    public final void B(String s) {
        z z0 = new z(1);
        Bundle bundle0 = new Bundle();
        bundle0.putString("TITLE", s);
        bundle0.putString("TYPE_NAME", null);
        z0.setArguments(bundle0);
        z0.show(this.g(), "tooltip");
    }

    public final void C(String s) {
        j.f(s, "typeName");
        String s1 = w.l(this.r(), s);
        z z0 = new z(1);
        Bundle bundle0 = new Bundle();
        bundle0.putString("TITLE", s1);
        bundle0.putString("TYPE_NAME", s);
        z0.setArguments(bundle0);
        z0.show(this.g(), "tooltip");
    }

    @Override  // r2.h
    public final void n(r2.j j0, String s) {
        j.f(s, "texture");
        ImageView imageView0 = new ImageView(this);
        o1.a.T(imageView0, s);
        imageView0.setColorFilter(0xFF000000, PorterDuff.Mode.SRC_IN);
        imageView0.setAlpha(0.2f);
        int v = ((Number)this.p(j0.h, 0).i).intValue();
        int v1 = j0.f == this.D.e ? -300 : 0;
        double f = ((double)j0.d) * 500.0;
        Context context0 = imageView0.getContext();
        j.e(context0, "getContext(...)");
        double f1 = (double)context0.getResources().getDisplayMetrics().density;
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)(f * f1)), ((int)(500.0 * f1)));
        relativeLayout$LayoutParams0.leftMargin = (int)(((double)(v - 30 + v1)) * 1.0 * f1);
        relativeLayout$LayoutParams0.topMargin = (int)(120.0 * f1);
        imageView0.setLayoutParams(relativeLayout$LayoutParams0);
        this.t().addView(imageView0);
        int v2 = ((Number)this.p(j0.g + 1, 0).i).intValue();
        View view0 = this.getLayoutInflater().inflate(0x7F0A0033, this.t(), false);  // layout:era_label
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
        j.d(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0).leftMargin = (int)((((double)(v2 - 30)) - 210.0) * ((double)this.getResources().getDisplayMetrics().density));
        ((TextView)view0.findViewById(0x7F070116)).setText(android.support.v4.media.session.a.H("LOC_GAME_ERA_DESC", new Object[]{j0.c}));  // id:title
        this.t().addView(view0, ((RelativeLayout.LayoutParams)viewGroup$LayoutParams0));
    }

    @Override  // r2.h
    public final w2.e p(int v, int v1) {
        return new w2.e(((int)((v - 1) * 500 + 0xFF)), ((int)(v1 * 84 + 390)));
    }

    @Override  // r2.h
    public final i q() {
        return this.l().b.j;
    }

    @Override  // r2.h
    public final void u() {
        int v32;
        int v27;
        int v25;
        int v24;
        HashMap hashMap11;
        String s19;
        s2.i i5;
        String s18;
        Iterator iterator18;
        int v16;
        HashMap hashMap7;
        HashMap hashMap4;
        HashMap hashMap3;
        HashMap hashMap0 = this.O;
        hashMap0.put("MODIFIER_PLAYER_GRANT_INFLUENCE_TOKEN", s2.a.j);
        hashMap0.put("MODIFIER_PLAYER_ADD_FAVOR", s2.a.k);
        hashMap0.put("MODIFIER_PLAYER_ADJUST_GOVERNOR_POINTS", s2.a.l);
        Iterator iterator0 = ((List)this.r().V0.i).iterator();
        while(true) {
            String s = "";
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            f f0 = this.r();
            String s1 = ((Policies)object0).getPolicyType();
            m m0 = f0.D1.h(s1);
            j.c(m0);
            String s2 = android.support.v4.media.session.a.H(((Policies)object0).getName(), new Object[0]);
            int v = ((Types)m0).getHash();
            String s3 = ((Policies)object0).getGovernmentSlotType();
            String s4 = android.support.v4.media.session.a.I(((Policies)object0).getDescription());
            if(s4 != null) {
                s = s4;
            }
            String s5 = ((Policies)object0).getName();
            s2.h h0 = new s2.h(s, s2, v, s3);
            this.M.put(s5, h0);
        }
        for(Object object1: ((List)this.r().n0.i)) {
            Governments governments0 = (Governments)object1;
            m m1 = this.r().D1.h(governments0.getGovernmentType());
            j.c(m1);
            int v1 = 0;
            int v2 = 0;
            int v3 = 0;
            int v4 = 0;
            for(Object object2: ((List)this.r().m0)) {
                Government_SlotCounts government_SlotCounts0 = (Government_SlotCounts)object2;
                if(j.a(governments0.getGovernmentType(), government_SlotCounts0.getGovernmentType())) {
                    switch(government_SlotCounts0.getGovernmentSlotType()) {
                        case "SLOT_DIPLOMATIC": {
                            v3 = government_SlotCounts0.getNumSlots() + v3;
                            continue;
                        }
                        case "SLOT_ECONOMIC": {
                            v2 = government_SlotCounts0.getNumSlots() + v2;
                            continue;
                        }
                        case "SLOT_GREAT_PERSON": 
                        case "SLOT_WILDCARD": {
                            v4 = government_SlotCounts0.getNumSlots() + v4;
                            continue;
                        }
                        case "SLOT_MILITARY": {
                            v1 = government_SlotCounts0.getNumSlots() + v1;
                        }
                    }
                }
            }
            c c0 = new c(governments0.getAccumulatedBonusDesc(), governments0.getInherentBonusDesc(), governments0.getBonusType(), governments0.getName(), ((Types)m1).getHash(), v1, v2, v3, v4);
            this.N.put(governments0.getName(), c0);
        }
        f f1 = this.r();
        HashMap hashMap1 = new HashMap();
        for(Object object3: ((List)f1.R0.i)) {
            hashMap1.put(((Modifiers)object3).getModifierId(), new b(((Modifiers)object3).getModifierId(), ((Modifiers)object3).getModifierType()));
        }
        for(Object object4: ((List)f1.P0)) {
            ModifierArguments modifierArguments0 = (ModifierArguments)object4;
            b b0 = (b)hashMap1.get(modifierArguments0.getModifierId());
            if(b0 != null) {
                b0.c = modifierArguments0.getValue();
            }
        }
        HashMap hashMap2 = new HashMap();
        for(Object object5: ((List)f1.y)) {
            CivicModifiers civicModifiers0 = (CivicModifiers)object5;
            if(hashMap2.get(civicModifiers0.getCivicType()) == null) {
                hashMap2.put(civicModifiers0.getCivicType(), new ArrayList());
            }
            Object object6 = hashMap2.get(civicModifiers0.getCivicType());
            j.c(object6);
            Object object7 = hashMap1.get(civicModifiers0.getModifierId());
            j.c(object7);
            ((List)object6).add(object7);
        }
        Iterator iterator6 = ((List)this.r().B.i).iterator();
        while(true) {
            boolean z = iterator6.hasNext();
            hashMap3 = this.P;
            hashMap4 = this.Q;
            if(!z) {
                break;
            }
            Object object8 = iterator6.next();
            int v5 = ((Civics)object8).getCost();
            String s6 = android.support.v4.media.session.a.I(((Civics)object8).getDescription());
            String s7 = ((Civics)object8).getEraType();
            Integer integer0 = ((Civics)object8).getUITreeRow();
            j.c(integer0);
            s2.b b1 = new s2.b(((Civics)object8).getCivicType(), ((Civics)object8).getName(), (s6 == null ? "" : s6), v5, s7, ((Civics)object8).getCivicType(), ((int)integer0));
            List list0 = b1.j;
            String s8 = b1.a;
            List list1 = (List)hashMap2.get(s8);
            if(list1 == null) {
                list1 = new ArrayList();
            }
            b1.l = list1;
            for(Object object9: ((List)this.r().h)) {
                Boosts boosts0 = (Boosts)object9;
                if(j.a(boosts0.getCivicType(), s8)) {
                    b1.c = android.support.v4.media.session.a.H(boosts0.getTriggerDescription(), new Object[0]);
                    b1.i = true;
                    b1.n = boosts0.getBoost();
                }
            }
            f f2 = this.r();
            ArrayList arrayList0 = new ArrayList();
            for(Object object10: ((Iterable)f2.z)) {
                if(j.a(((CivicPrereqs)object10).getCivic(), s8)) {
                    arrayList0.add(object10);
                }
            }
            ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
            for(Object object11: arrayList0) {
                arrayList1.add(((CivicPrereqs)object11).getPrereqCivic());
            }
            if(!arrayList1.isEmpty()) {
                for(Object object12: arrayList1) {
                    Civics civics0 = (Civics)this.r().B.h(((String)object12));
                    if(civics0 != null) {
                        list0.add(civics0.getCivicType());
                    }
                }
            }
            if(list0.isEmpty()) {
                list0.add("_TREESTART");
            }
            String s9 = b1.g;
            Integer integer1 = (Integer)hashMap4.get(s9);
            if(integer1 == null) {
                hashMap4.put(s9, 1);
            }
            else {
                hashMap4.put(s9, ((int)(((int)integer1) + 1)));
            }
            hashMap3.put(s8, b1);
        }
        f f3 = this.r();
        ArrayList arrayList2 = new ArrayList();
        for(Object object13: ((List)f3.d0.i)) {
            Integer integer2 = (Integer)hashMap4.get(((Eras)object13).getEraType());
            if((integer2 == null ? 0 : ((int)integer2)) > 0) {
                arrayList2.add(object13);
            }
        }
        ArrayList arrayList3 = new ArrayList(x2.k.E(arrayList2));
        for(Object object14: arrayList2) {
            String s10 = ((Eras)object14).getEraType();
            String s11 = ((Eras)object14).getEraTechBackgroundTexture();
            String s12 = ((Eras)object14).getName();
            int v6 = ((Eras)object14).getChronologyIndex();
            String s13 = ((Eras)object14).getTechTreeLayoutMethod();
            arrayList3.add(new r2.j(s10, s11, s12, v6, (s13 == null ? "" : s13)));
        }
        x2.i.m0(arrayList3, new C1.a(20));
        int v7 = arrayList3.size();
        for(int v8 = 0; v8 < v7; ++v8) {
            ((r2.j)arrayList3.get(v8)).f = v8;
            this.D.c.put(((r2.j)arrayList3.get(v8)).a, arrayList3.get(v8));
        }
        HashMap hashMap5 = new HashMap();
        for(Object object15: hashMap3.values()) {
            s2.b b2 = (s2.b)object15;
            Object object16 = hashMap5.get(b2.g);
            String s14 = b2.g;
            if(object16 == null) {
                s2.i i0 = new s2.i();  // 初始化器: Ljava/lang/Object;-><init>()V
                i0.a = new HashMap();
                u u0 = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
                u0.a = new ArrayList();
                i0.b = u0;
                hashMap5.put(s14, i0);
                for(int v9 = -3; true; ++v9) {
                    s2.i i1 = (s2.i)hashMap5.get(s14);
                    if(i1 != null) {
                        HashMap hashMap6 = i1.a;
                        if(hashMap6 != null) {
                            s2.j j0 = new s2.j();  // 初始化器: Ljava/lang/Object;-><init>()V
                            j0.a = new HashMap();
                            hashMap6.put(v9, j0);
                        }
                    }
                    if(v9 == 3) {
                        break;
                    }
                }
            }
            s2.i i2 = (s2.i)hashMap5.get(s14);
            if(i2 != null) {
                u u1 = i2.b;
                if(u1 != null) {
                    ArrayList arrayList4 = u1.a;
                    if(arrayList4 != null) {
                        arrayList4.add(b2.a);
                    }
                }
            }
        }
        for(Object object17: hashMap5.values()) {
            s2.i i3 = (s2.i)object17;
            int v10 = i3.b.a.size();
            if(v10 > 1) {
                for(int v11 = 1; v11 < 3; ++v11) {
                    for(int v12 = 0; v12 < v10; ++v12) {
                        for(int v13 = v12; v13 < v10; ++v13) {
                            if(v12 != v13) {
                                u u2 = i3.b;
                                Object object18 = hashMap3.get(u2.a.get(v12));
                                j.c(object18);
                                for(Object object19: ((s2.b)object18).j) {
                                    ArrayList arrayList5 = u2.a;
                                    if(j.a(((String)object19), arrayList5.get(v13))) {
                                        String s15 = (String)arrayList5.get(v12);
                                        arrayList5.set(v12, arrayList5.get(v13));
                                        arrayList5.set(v13, s15);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        Iterator iterator16 = hashMap5.entrySet().iterator();
        while(iterator16.hasNext()) {
            Object object20 = iterator16.next();
            s2.i i4 = (s2.i)((Map.Entry)object20).getValue();
            int v14 = i4.b.a.size();
            while(true) {
                u u3 = i4.b;
                if(u3.a.isEmpty()) {
                    break;
                }
                String s16 = (String)u3.a.remove(0);
                Object object21 = hashMap3.get(s16);
                j.c(object21);
                Iterator iterator17 = ((s2.b)object21).j.iterator();
                int v15 = 1;
            alab1:
                while(true) {
                    boolean z1 = iterator17.hasNext();
                    hashMap7 = i4.a;
                    v16 = ((s2.b)object21).k;
                    if(!z1) {
                        break;
                    }
                    Object object22 = iterator17.next();
                    String s17 = (String)object22;
                    if(v15 <= v14) {
                        int v17 = v15;
                        boolean z2 = false;
                        while(true) {
                            int v18 = -3;
                            while(true) {
                                s2.j j1 = (s2.j)hashMap7.get(v18);
                                if(j1 == null) {
                                    iterator18 = iterator16;
                                    s18 = null;
                                }
                                else {
                                    HashMap hashMap8 = j1.a;
                                    if(hashMap8 != null) {
                                        iterator18 = iterator16;
                                        s18 = (String)hashMap8.get(v15);
                                    }
                                }
                                if(s18 != null && j.a(s17, s18)) {
                                    i5 = i4;
                                    v17 = v15 + 1;
                                    z2 = true;
                                    break;
                                }
                                i5 = i4;
                                if(v18 == 3) {
                                    break;
                                }
                                iterator16 = iterator18;
                                ++v18;
                                i4 = i5;
                            }
                            if(z2) {
                                for(v15 = v17; true; ++v15) {
                                    s2.j j2 = (s2.j)hashMap7.get(v16);
                                    if(j2 == null) {
                                        s19 = null;
                                    }
                                    else {
                                        HashMap hashMap9 = j2.a;
                                        if(hashMap9 != null) {
                                            s19 = (String)hashMap9.get(v15);
                                        }
                                    }
                                    if(s19 == null) {
                                        break;
                                    }
                                }
                                i4 = i5;
                                iterator16 = iterator18;
                                continue alab1;
                            }
                            else if(v15 == v14) {
                                v15 = v17;
                                break;
                            }
                            else {
                                ++v15;
                                i4 = i5;
                                iterator16 = iterator18;
                                continue;
                            }
                            goto label_302;
                        }
                        i4 = i5;
                        iterator16 = iterator18;
                    }
                }
                s2.j j3 = (s2.j)hashMap7.get(v16);
                if(j3 != null) {
                    HashMap hashMap10 = j3.a;
                    if(hashMap10 != null) {
                        hashMap10.put(v15, s16);
                    }
                }
            label_302:
                ((s2.b)object21).d = v15;
                Map map0 = this.D.c;
                String s20 = ((s2.b)object21).g;
                Object object23 = map0.get(s20);
                j.c(object23);
                if(v15 > ((r2.j)object23).d) {
                    r2.j j4 = (r2.j)this.D.c.get(s20);
                    if(j4 != null) {
                        j4.d = v15;
                    }
                }
            }
        }
        int v19 = 0;
        int v20 = 0;
        for(Object object24: ((List)this.r().d0.i)) {
            Eras eras0 = (Eras)object24;
            for(Object object25: this.D.c.entrySet()) {
                r2.j j5 = (r2.j)((Map.Entry)object25).getValue();
                if(j5.f == v20) {
                    j5.g = v19;
                    j5.h = (j5.d + 1) / 2 + v19;
                    this.D.e = this.D.e >= 0 ? Math.min(this.D.e, v20) : v20;
                    v19 = j5.d + 1 + v19;
                    break;
                }
                if(false) {
                    break;
                }
            }
            ++v20;
        }
        this.D.d = v19;
        for(int v21 = -3; true; ++v21) {
            hashMap11 = this.R;
            hashMap11.put(v21, new HashMap());
            if(v21 == 3) {
                break;
            }
        }
        for(Object object26: hashMap3.values()) {
            s2.b b3 = (s2.b)object26;
            Object object27 = this.D.c.get(b3.g);
            j.c(object27);
            int v22 = ((r2.j)object27).g + b3.d;
            Map map1 = (Map)hashMap11.get(b3.k);
            if(map1 != null) {
                map1.put(v22, b3.a);
            }
        }
        for(Object object28: hashMap3.values()) {
            Civics civics1 = (Civics)this.r().B.h(((s2.b)object28).a);
            String s21 = civics1 == null ? null : civics1.getCivicType();
            f f4 = this.r();
            j.c(s21);
            ArrayList arrayList6 = C.p(f4, s21, "", 8);
            ArrayList arrayList7 = new ArrayList();
            int v23 = 0;
            for(Object object29: arrayList6) {
                f f5 = this.r();
                String s22 = (String)((List)object29).get(0);
                Types types0 = (Types)f5.D1.h(s22);
                v23 += (j.a((types0 == null ? null : types0.getKind()), "KIND_GOVERNMENT") ? 4 : 1);
            }
            for(Object object30: ((s2.b)object28).l) {
                b b4 = (b)object30;
                I2.b b5 = (I2.b)hashMap0.get(b4.b);
                if(b5 != null) {
                    ++v23;
                    arrayList7.add(b5.b(b4));
                }
            }
            Object object31 = this.D.c.get(((s2.b)object28).g);
            j.c(object31);
            w2.e e0 = this.p(((r2.j)object31).g + ((s2.b)object28).d, ((s2.b)object28).k);
            String s23 = ((s2.b)object28).a;
            k k0 = new k(((Number)e0.i).intValue(), ((Number)e0.j).intValue() - w.a, s23);
            if(v23 > 8) {
                k0.e = true;
            }
            k0.d = 420;
            j.f(((s2.b)object28).b, "<set-?>");
            k0.f = ((s2.b)object28).b;
            k0.h = ((s2.b)object28).n;
            k0.g = ((s2.b)object28).i;
            k0.j = arrayList7;
            String s24 = ((s2.b)object28).c;
            j.f(s24, "<set-?>");
            k0.i = s24;
            this.D.a.put(s23, k0);
        }
        for(Object object32: hashMap3.entrySet()) {
            s2.b b6 = (s2.b)((Map.Entry)object32).getValue();
            Object object33 = this.D.a.get(b6.a);
            j.c(object33);
            k k1 = (k)object33;
            for(Object object34: b6.j) {
                String s25 = (String)object34;
                boolean z3 = j.a(s25, "_TREESTART");
                String s26 = b6.a;
                if(z3) {
                    v24 = -999;
                }
                else {
                    s2.b b7 = (s2.b)hashMap3.get(s25);
                    if(b7 == null) {
                        System.out.print(i3.e.f("Unable to find PREREQ for tech \'", s26, "\'"));
                        v24 = 0;
                    }
                    else {
                        Object object35 = this.D.c.get(b7.g);
                        j.c(object35);
                        v25 = ((r2.j)object35).g + b7.d;
                        v24 = b7.k;
                        goto label_421;
                    }
                }
                v25 = 0;
            label_421:
                Object object36 = this.D.c.get(b6.g);
                j.c(object36);
                int v26;
                for(v26 = ((r2.j)object36).g + b6.d - 1; true; --v26) {
                    v27 = b6.k;
                    Map map2 = (Map)hashMap11.get(v27);
                    if((map2 == null ? null : ((String)map2.get(v26))) != null || v26 <= v25) {
                        break;
                    }
                }
                if(v24 != -999) {
                    int v28 = k1.a;
                    int v29 = k1.b;
                    if(v24 >= v27 && v24 <= v27) {
                        r2.c c1 = new r2.c();
                        c1.b = "Controls_TreePathDashEW";
                        int v30 = ((Number)this.p(v26, v27).i).intValue();
                        c1.a(v30 + 420, v29 - 20);
                        c1.b(v28 - (v30 + 420), 40);
                        this.D.b.put(A.f.i(s26, ",", s25), G.p(c1));
                    }
                    else {
                        r2.c c2 = new r2.c();
                        r2.c c3 = new r2.c();
                        r2.c c4 = new r2.c();
                        r2.c c5 = new r2.c();
                        r2.c c6 = new r2.c();
                        int v31 = ((Number)this.p(v26, v27).i).intValue();
                        if(v24 < v27) {
                            v32 = v29 - (v27 - v24) * 84;
                            c3.b = "Controls_TreePathDashSE";
                            c5.b = "Controls_TreePathDashES";
                        }
                        else {
                            v32 = (v24 - v27) * 84 + v29;
                            c3.b = "Controls_TreePathDashNE";
                            c5.b = "Controls_TreePathDashEN";
                        }
                        c2.a(v28, v29 - 20);
                        c2.b(0, 40);
                        c2.b = "Controls_TreePathDashEW";
                        c3.a(v28 - 40, v29 - 20);
                        c3.b(40, 40);
                        c4.a(v28 - 40, Math.min(v29 + 20, v32 + 20));
                        c4.b(40, Math.abs(v29 - v32) - 40);
                        c4.b = "Controls_TreePathDashNS";
                        c5.a(v28 - 40, v32 - 20);
                        c5.b(40, 40);
                        c6.a(v31 + 420, v32 - 20);
                        c6.b(v28 - v31 - 460, 40);
                        c6.b = "Controls_TreePathDashEW";
                        this.D.b.put(A.f.i(s26, ",", s25), x2.j.z(new r2.c[]{c2, c3, c4, c5, c6}));
                    }
                }
            }
        }
        l l0 = this.l();
        l0.b.j = this.D;
    }

    @Override  // r2.h
    public final void w() {
        CivicTreeNode civicTreeNode0;
        HashMap hashMap0 = this.L;
        HashSet hashSet0 = new HashSet(hashMap0.keySet());
        Set set0 = x2.i.r0(new HashSet(((Map)this.E).keySet()));
        set0.removeAll(hashSet0);
        for(Object object0: set0) {
            String s = (String)object0;
            Object object1 = this.D.a.get(s);
            j.c(object1);
            k k0 = (k)object1;
            if(hashMap0.get(s) == null) {
                View view0 = this.getLayoutInflater().inflate(0x7F0A002B, this.t(), false);  // layout:civictree_node
                j.d(view0, "null cannot be cast to non-null type com.spears.civilopedia.tree.civic.CivicTreeNode");
                civicTreeNode0 = (CivicTreeNode)view0;
                civicTreeNode0.setX(k0.a);
                civicTreeNode0.setY(k0.b);
                civicTreeNode0.setExtraUnlockIcons(k0.j);
                j.c(s);
                hashMap0.put(s, civicTreeNode0);
                int v = k0.e ? 140 : 84;
                Context context0 = civicTreeNode0.getContext();
                j.e(context0, "getContext(...)");
                DisplayMetrics displayMetrics0 = context0.getResources().getDisplayMetrics();
                int v1 = (int)(((double)k0.a) * ((double)displayMetrics0.density));
                int v2 = (int)((((double)k0.b) - ((double)w.c)) * ((double)displayMetrics0.density));
                RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(((int)(420.0 * ((double)displayMetrics0.density))), ((int)(((double)v) * ((double)displayMetrics0.density))));
                relativeLayout$LayoutParams0.leftMargin = v1;
                relativeLayout$LayoutParams0.topMargin = v2;
                civicTreeNode0.setLayoutParams(relativeLayout$LayoutParams0);
                if(k0.e) {
                    civicTreeNode0.getTileView().setBackgroundResource(R.drawable.civicstree_gearbuttontile2);
                    civicTreeNode0.getGearButtonView().setBackgroundResource(R.drawable.civicstree_gearbutton2);
                }
                this.s().addView(civicTreeNode0);
                this.A(civicTreeNode0, k0);
                hashMap0.put(s, civicTreeNode0);
            }
            else {
                civicTreeNode0 = null;
            }
            j.c(civicTreeNode0);
            this.A(civicTreeNode0, k0);
        }
    }

    @Override  // r2.h
    public final void x() {
        for(Object object0: this.L.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            CivicTreeNode civicTreeNode0 = (CivicTreeNode)((Map.Entry)object0).getValue();
            Object object1 = this.D.a.get(s);
            j.c(object1);
            this.A(civicTreeNode0, ((k)object1));
        }
    }

    public final ArrayList z(String s) {
        f f0 = this.r();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: ((Iterable)f0.z)) {
            if(j.a(((CivicPrereqs)object0).getCivic(), s)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(x2.k.E(arrayList0));
        for(Object object1: arrayList0) {
            arrayList1.add(((CivicPrereqs)object1).getPrereqCivic());
        }
        ArrayList arrayList2 = x2.i.p0(arrayList1);
        for(Object object2: arrayList1) {
            arrayList2.addAll(this.z(((String)object2)));
        }
        return arrayList2;
    }
}

