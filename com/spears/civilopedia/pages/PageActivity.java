package com.spears.civilopedia.pages;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import f2.E;
import f2.j;
import g1.n;
import j2.b;
import j2.c;
import j2.e;
import j2.f;
import kotlin.Metadata;
import o2.g;
import o2.h;
import o2.q;
import o2.x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spears/civilopedia/pages/PageActivity;", "Lf2/j;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PageActivity extends j {
    public LinearLayout B;
    public static final int C;

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        b b0;
        super.onCreate(bundle0);
        this.setContentView(0x7F0A0020);  // layout:activity_page
        View view0 = this.findViewById(0x7F0700F3);  // id:stack
        J2.j.e(view0, "findViewById(...)");
        this.B = (LinearLayout)view0;
        ((LinearLayout)view0).getBackground().setAlpha(0x80);
        x x0 = this.l().b.d();
        String s = this.getIntent().getStringExtra("SectionId");
        J2.j.c(s);
        String s1 = this.getIntent().getStringExtra("PageId");
        J2.j.c(s1);
        q q0 = x0.h(s, s1);
        J2.j.c(q0);
        if(this.l().b.c().c()) {
            switch(q0.a) {
                case "10": {
                    b0 = new b(6);
                    goto label_111;
                }
                case "11": {
                    b0 = new b(5);
                    goto label_111;
                }
                case "12": {
                    b0 = new b(14);
                    goto label_111;
                }
                case "13": {
                    b0 = new b(12);
                    goto label_111;
                }
                case "14": {
                    b0 = new b(8);
                    goto label_111;
                }
                case "15": {
                    b0 = new b(3);
                    goto label_111;
                }
                case "16": {
                    b0 = new b(16);
                    goto label_111;
                }
                case "2": {
                    b0 = new b(7);
                    goto label_111;
                }
                case "3": {
                    b0 = new b(13);
                    goto label_111;
                }
                case "4": {
                    b0 = new b(15);
                    goto label_111;
                }
                case "5": {
                    b0 = new b(11);
                    goto label_111;
                }
                case "6": {
                    b0 = new b(4);
                    goto label_111;
                }
                case "7": {
                    b0 = new b(4);
                    goto label_111;
                }
                case "8": {
                    b0 = new b(10);
                    goto label_111;
                }
                case "9": {
                    b0 = new b(9);
                    goto label_111;
                }
                default: {
                    b0 = new b(7);
                    goto label_111;
                }
            }
        }
        E e0 = this.l().b.c();
        if(e0 != E.o && e0 != E.p && e0 != E.q) {
            switch(q0.d) {
                case "Belief": {
                    b0 = new b(0);
                    goto label_111;
                }
                case "Building": {
                    b0 = new b(1);
                    goto label_111;
                }
                case "CityState": {
                    b0 = new b(2);
                    goto label_111;
                }
                case "Civic": {
                    b0 = new b(17);
                    goto label_111;
                }
                case "Civilization": {
                    b0 = new b(18);
                    goto label_111;
                }
                case "District": {
                    b0 = new b(19);
                    goto label_111;
                }
                case "EnvironmentalEffects": {
                    b0 = new f(4);
                    goto label_111;
                }
                case "Feature": {
                    b0 = new b(20);
                    goto label_111;
                }
                case "FrontPage": {
                    b0 = new b(21);
                    goto label_111;
                }
                case "Government": {
                    b0 = new b(22);
                    goto label_111;
                }
                case "Governor": {
                    b0 = new b(23);
                    goto label_111;
                }
                case "GovernorPromotion": {
                    b0 = new b(24);
                    goto label_111;
                }
                case "GreatPerson": {
                    b0 = new b(25);
                    goto label_111;
                }
                case "HeroUnit": {
                    b0 = new e(7);  // 初始化器: Lj2/f;-><init>(I)V
                    goto label_111;
                }
                case "HistoricMoment": {
                    b0 = new b(26);
                    goto label_111;
                }
                case "Improvement": {
                    b0 = new b(27);
                    goto label_111;
                }
                case "Leader": {
                    b0 = new b(28);
                    goto label_111;
                }
                case "Policy": {
                    b0 = new b(29);
                    goto label_111;
                }
                case "Project": {
                    b0 = new f(0);
                    goto label_111;
                }
                case "Religion": {
                    b0 = new f(1);
                    goto label_111;
                }
                case "Resource": {
                    b0 = new f(2);
                    goto label_111;
                }
                case "Route": {
                    b0 = new f(3);
                    goto label_111;
                }
                case "Simple": {
                    b0 = new f(4);
                    goto label_111;
                }
                case "Technology": {
                    b0 = new f(5);
                    goto label_111;
                }
                case "Terrain": {
                    b0 = new f(6);
                    goto label_111;
                }
                case "Unit": {
                    b0 = new f(7);
                    goto label_111;
                }
                case "UnitPromotion": {
                    b0 = new f(8);
                    goto label_111;
                }
                case "WorldCongress": {
                    b0 = new f(4);
                    goto label_111;
                }
                default: {
                    b0 = new f(4);
                    goto label_111;
                }
            }
        }
        n n0 = this.l().b.h;
        if(n0 != null) {
            b0 = new c(n0);
        label_111:
            b0.d = q0;
            LinearLayout linearLayout0 = this.B;
            if(linearLayout0 != null) {
                b0.a = linearLayout0;
                if(linearLayout0 != null) {
                    LinearLayout linearLayout1 = (LinearLayout)linearLayout0.findViewById(0x7F07009F);  // id:left_stack
                    if(linearLayout1 == null) {
                        linearLayout1 = b0.l();
                    }
                    b0.b = linearLayout1;
                    LinearLayout linearLayout2 = this.B;
                    if(linearLayout2 != null) {
                        LinearLayout linearLayout3 = (LinearLayout)linearLayout2.findViewById(0x7F0700D4);  // id:right_stack
                        if(linearLayout3 == null) {
                            linearLayout3 = b0.b;
                            if(linearLayout3 == null) {
                                J2.j.l("leftBox");
                                throw null;
                            }
                        }
                        b0.c = linearLayout3;
                        b0.e = this.l().b.d();
                        if(this.l().b.c().c()) {
                            g g0 = this.l().b.g;
                            if(g0 != null) {
                                b0.g = g0;
                                goto label_143;
                            }
                            J2.j.l("infoCiv5");
                            throw null;
                        }
                        if(this.l().b.c().d()) {
                            b0.f = this.l().b.b();
                            goto label_143;
                        }
                        h h0 = this.l().b.f;
                        if(h0 != null) {
                            b0.h = h0;
                        label_143:
                            b0.k();
                            LinearLayout linearLayout4 = b0.c;
                            if(linearLayout4 != null) {
                                if(linearLayout4.getChildCount() == 0) {
                                    LinearLayout linearLayout5 = b0.c;
                                    if(linearLayout5 != null) {
                                        linearLayout5.setVisibility(8);
                                        return;
                                    }
                                    J2.j.l("rightBox");
                                    throw null;
                                }
                                return;
                            }
                            J2.j.l("rightBox");
                            throw null;
                        }
                        J2.j.l("infoCiv7");
                        throw null;
                    }
                    J2.j.l("linearLayout");
                    throw null;
                }
                J2.j.l("linearLayout");
                throw null;
            }
            J2.j.l("linearLayout");
            throw null;
        }
        J2.j.l("frontend");
        throw null;
    }
}

