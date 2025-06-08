package com.spears.civilopedia.planning;

import A3.h;
import B1.a;
import D3.b;
import J2.u;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.JsonIOException;
import com.otaliastudios.zoom.ZoomLayout;
import com.spears.civilopedia.R.drawable;
import com.spears.civilopedia.db.tables.Improvements;
import com.spears.civilopedia.planning.components.PlanningContainerView;
import com.spears.civilopedia.planning.components.YieldLabel;
import com.spears.civilopedia.planning.edit.CityProductionActivity;
import com.spears.civilopedia.planning.logic.Plot;
import com.spears.civilopedia.planning.logic.storage.MapFile;
import com.spears.civilopedia.planning.logic.storage.MapObject;
import com.spears.civilopedia.planning.logic.storage.SimplifiedPlot;
import f2.A;
import f2.j;
import f2.l;
import f2.n;
import f2.z;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import k2.c;
import k2.f;
import kotlin.Metadata;
import l.I0;
import l2.d;
import n2.B;
import n2.g;
import n2.i;
import n2.m;
import n2.q;
import n2.r;
import n2.s;
import n2.t;
import n2.v;
import n2.x;
import o2.J;
import w2.e;
import x2.k;
import x2.o;
import z1.a0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spears/civilopedia/planning/PlanningActivity;", "Lf2/j;", "Lf2/A;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PlanningActivity extends j implements A {
    public Menu B;
    public ZoomLayout C;
    public PlanningContainerView D;
    public e E;
    public final e F;
    public n2.A G;
    public u H;
    public i I;
    public FirebaseAnalytics J;
    public ArrayList K;
    public static final int L;

    public PlanningActivity() {
        this.E = new e(0.0, 0.0);
        this.F = new e(20.0f, 50.0f);
        this.I = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        this.K = new ArrayList();
    }

    @Override  // f2.A
    public final void b() {
        FirebaseAnalytics firebaseAnalytics0 = this.J;
        if(firebaseAnalytics0 != null) {
            firebaseAnalytics0.a("billing_premium_buy", null);
            if(!this.l().c.c(this)) {
                FirebaseAnalytics firebaseAnalytics1 = this.J;
                if(firebaseAnalytics1 != null) {
                    firebaseAnalytics1.a("billing_google_play_alert_dialog", null);
                    new n().show(this.g(), "GOOGLE_PLAY_DIALOG_TAG");  // 初始化器: Landroidx/fragment/app/c;-><init>()V
                    return;
                }
                J2.j.l("mFirebaseAnalytics");
                throw null;
            }
            return;
        }
        J2.j.l("mFirebaseAnalytics");
        throw null;
    }

    public final void n(v v0) {
        u u0 = this.H;
        if(u0 != null) {
            d d0 = u0.d(v0.a);
            if(d0 == null) {
                this.o(v0);
            }
            else {
                n2.A a0 = this.G;
                if(a0 != null) {
                    d0.b(v0, new q(v0, a0));
                    this.w(d0);
                    goto label_12;
                }
                J2.j.l("world");
                throw null;
            }
        label_12:
            n2.A a1 = this.G;
            if(a1 != null) {
                this.s(((s)a1.c).a(v0.a));
                return;
            }
            J2.j.l("world");
            throw null;
        }
        J2.j.l("plotViewManager");
        throw null;
    }

    public final void o(v v0) {
        LayoutInflater layoutInflater0 = this.getLayoutInflater();
        PlanningContainerView planningContainerView0 = this.D;
        if(planningContainerView0 != null) {
            View view0 = layoutInflater0.inflate(0x7F0A005E, planningContainerView0, false);  // layout:planning_item_plot
            int v1 = 0x7F07003D;  // id:adjacency
            View view1 = a0.r(view0, 0x7F07003D);  // id:adjacency
            if(view1 != null) {
                int v2 = 0x7F07009A;  // id:label
                TextView textView0 = (TextView)a0.r(view1, 0x7F07009A);  // id:label
                if(textView0 == null) {
                    throw new NullPointerException("Missing required view with ID: " + view1.getResources().getResourceName(0x7F07009A));  // id:label
                }
                a a0 = new a(((RelativeLayout)view1), ((RelativeLayout)view1), textView0, 17);
                v1 = 0x7F070046;  // id:banner
                View view2 = a0.r(view0, 0x7F070046);  // id:banner
                if(view2 != null) {
                    View view3 = a0.r(view2, 0x7F070063);  // id:civIconView
                    if(((ImageView)view3) == null) {
                        v2 = 0x7F070063;  // id:civIconView
                        throw new NullPointerException("Missing required view with ID: " + view2.getResources().getResourceName(v2));
                    }
                    View view4 = a0.r(view2, 0x7F07009A);  // id:label
                    if(((TextView)view4) == null) {
                        throw new NullPointerException("Missing required view with ID: " + view2.getResources().getResourceName(v2));
                    }
                    v2 = 0x7F0700C5;  // id:productionView
                    View view5 = a0.r(view2, 0x7F0700C5);  // id:productionView
                    if(((ImageView)view5) == null) {
                        throw new NullPointerException("Missing required view with ID: " + view2.getResources().getResourceName(v2));
                    }
                    v2 = 0x7F0700F8;  // id:stateIconView
                    View view6 = a0.r(view2, 0x7F0700F8);  // id:stateIconView
                    if(((ImageView)view6) == null) {
                        throw new NullPointerException("Missing required view with ID: " + view2.getResources().getResourceName(v2));
                    }
                    C1.d d0 = new C1.d(((LinearLayoutCompat)view2), ((LinearLayoutCompat)view2), ((ImageView)view3), ((TextView)view4), ((ImageView)view5), ((ImageView)view6));
                    View view7 = a0.r(view0, 0x7F070055);  // id:buildingView
                    if(((ImageView)view7) == null) {
                        v1 = 0x7F070055;  // id:buildingView
                        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v1));
                    }
                    else if(((LinearLayout)a0.r(view0, 0x7F070078)) != null) {  // id:districtLayout
                        View view8 = a0.r(view0, 0x7F070079);  // id:districtView
                        if(((ImageView)view8) == null) {
                            v1 = 0x7F070079;  // id:districtView
                        }
                        else {
                            View view9 = a0.r(view0, 0x7F070082);  // id:featureView
                            if(((ImageView)view9) == null) {
                                v1 = 0x7F070082;  // id:featureView
                            }
                            else {
                                View view10 = a0.r(view0, 0x7F070093);  // id:improvementView
                                if(((ImageView)view10) == null) {
                                    v1 = 0x7F070093;  // id:improvementView
                                }
                                else if(((LinearLayout)a0.r(view0, 0x7F070096)) != null) {  // id:infoView
                                    View view11 = a0.r(view0, 0x7F0700C1);  // id:placementView
                                    if(((ImageView)view11) == null) {
                                        v1 = 0x7F0700C1;  // id:placementView
                                    }
                                    else {
                                        View view12 = a0.r(view0, 0x7F0700C9);  // id:purchase
                                        if(view12 == null) {
                                            v1 = 0x7F0700C9;  // id:purchase
                                        }
                                        else {
                                            b b0 = new b(((RelativeLayout)view12), 20);
                                            View view13 = a0.r(view0, 0x7F0700D0);  // id:resourceView
                                            if(((ImageView)view13) == null) {
                                                v1 = 0x7F0700D0;  // id:resourceView
                                            }
                                            else {
                                                View view14 = a0.r(view0, 0x7F0700FC);  // id:swap
                                                if(view14 == null) {
                                                    v1 = 0x7F0700FC;  // id:swap
                                                }
                                                else {
                                                    TextView textView1 = (TextView)a0.r(view14, 0x7F0700FE);  // id:swapTextView
                                                    if(textView1 == null) {
                                                        throw new NullPointerException("Missing required view with ID: " + view14.getResources().getResourceName(0x7F0700FE));  // id:swapTextView
                                                    }
                                                    g1.n n0 = new g1.n(((LinearLayout)view14), textView1, 4, false);
                                                    View view15 = a0.r(view0, 0x7F07010E);  // id:terrainView
                                                    if(((ImageView)view15) == null) {
                                                        v1 = 0x7F07010E;  // id:terrainView
                                                        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v1));
                                                    }
                                                    else if(((LinearLayout)a0.r(view0, 0x7F07011B)) != null) {  // id:topStackView
                                                        View view16 = a0.r(view0, 0x7F07012D);  // id:yieldLabel
                                                        if(((YieldLabel)view16) != null) {
                                                            d d1 = new d(new g2.a(((RelativeLayout)view0), a0, d0, ((ImageView)view7), ((ImageView)view8), ((ImageView)view9), ((ImageView)view10), ((ImageView)view11), b0, ((ImageView)view13), n0, ((ImageView)view15), ((YieldLabel)view16)));
                                                            n2.A a1 = this.G;
                                                            if(a1 != null) {
                                                                d1.b(v0, new q(v0, a1));
                                                                ((RelativeLayout)view0).setOnClickListener(new c(this, v0, 0));
                                                                ((RelativeLayout)view12).setOnClickListener(new k2.e(this, d1, 0));
                                                                ((LinearLayout)view14).setOnClickListener(new k2.e(this, d1, 1));
                                                                J j0 = v0.a.c();
                                                                d1.b = j0;
                                                                o1.a.P(((RelativeLayout)view0), j0);
                                                                this.x(j0);
                                                                PlanningContainerView planningContainerView1 = this.D;
                                                                if(planningContainerView1 != null) {
                                                                    planningContainerView1.addView(((RelativeLayout)view0));
                                                                    u u0 = this.H;
                                                                    if(u0 != null) {
                                                                        u0.a.add(d1);
                                                                        this.w(d1);
                                                                        this.y();
                                                                        return;
                                                                    }
                                                                    J2.j.l("plotViewManager");
                                                                    throw null;
                                                                }
                                                                J2.j.l("contentView");
                                                                throw null;
                                                            }
                                                            J2.j.l("world");
                                                            throw null;
                                                        }
                                                        v1 = 0x7F07012D;  // id:yieldLabel
                                                    }
                                                    else {
                                                        v1 = 0x7F07011B;  // id:topStackView
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                else {
                                    v1 = 0x7F070096;  // id:infoView
                                }
                            }
                        }
                    }
                    else {
                        v1 = 0x7F070078;  // id:districtLayout
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v1));
        }
        J2.j.l("contentView");
        throw null;
    }

    @Override  // androidx.fragment.app.j
    public final void onActivityResult(int v, int v1, Intent intent0) {
        super.onActivityResult(v, v1, intent0);
        switch(v) {
            case 100: {
                if(intent0 == null) {
                    return;
                }
                Serializable serializable0 = intent0.getSerializableExtra("POSITION");
                J2.j.d(serializable0, "null cannot be cast to non-null type com.spears.civilopedia.planning.logic.PlotPosition");
                switch(v1) {
                    case 100: {
                        n2.A a0 = this.G;
                        if(a0 != null) {
                            v v2 = ((s)a0.c).d(((t)serializable0));
                            J2.j.c(v2);
                            n2.A a1 = this.G;
                            if(a1 != null) {
                                n2.b b0 = ((n2.c)a1.d).a(v2.a);
                                if(b0 != null) {
                                    a1.d(b0);
                                }
                                this.n(v2);
                                return;
                            }
                            J2.j.l("world");
                            throw null;
                        }
                        J2.j.l("world");
                        throw null;
                    }
                    case 101: {
                        n2.A a2 = this.G;
                        if(a2 != null) {
                            a2.a(((t)serializable0));
                            n2.A a3 = this.G;
                            if(a3 != null) {
                                s s0 = (s)a3.c;
                                s0.getClass();
                                ArrayList arrayList0 = new ArrayList();
                                for(int v3 = -3; true; ++v3) {
                                    for(int v4 = -3; true; ++v4) {
                                        t t0 = new t(((t)serializable0).i + v3, ((t)serializable0).j + v4);
                                        if(((t)serializable0).b(t0) <= 3) {
                                            arrayList0.add(t0);
                                        }
                                        if(v4 == 3) {
                                            break;
                                        }
                                    }
                                    if(v3 == 3) {
                                        break;
                                    }
                                }
                                ArrayList arrayList1 = new ArrayList();
                                for(Object object0: arrayList0) {
                                    v v5 = s0.d(((t)object0));
                                    if(v5 != null) {
                                        arrayList1.add(v5);
                                    }
                                }
                                for(Object object1: arrayList1) {
                                    this.n(((v)object1));
                                }
                                this.y();
                                this.r();
                                return;
                            }
                            J2.j.l("world");
                            throw null;
                        }
                        J2.j.l("world");
                        throw null;
                    }
                    case 102: {
                        n2.A a4 = this.G;
                        if(a4 != null) {
                            n2.b b1 = ((n2.c)a4.d).a(((t)serializable0));
                            if(b1 != null) {
                                n2.A a5 = this.G;
                                if(a5 != null) {
                                    n2.c c0 = (n2.c)a5.d;
                                    c0.getClass();
                                    c0.a.remove(b1);
                                    ArrayList arrayList2 = b1.c;
                                    ArrayList arrayList3 = new ArrayList();
                                    for(Object object2: arrayList2) {
                                        v v6 = ((s)a5.c).d(((t)object2));
                                        if(v6 != null) {
                                            arrayList3.add(v6);
                                        }
                                    }
                                    for(Object object3: arrayList3) {
                                        ((v)object3).b.q(null);
                                        ((v)object3).b.n(null);
                                        ((v)object3).b.o(null);
                                    }
                                    ArrayList arrayList4 = new ArrayList();
                                    for(Object object4: arrayList2) {
                                        n2.A a6 = this.G;
                                        if(a6 != null) {
                                            v v7 = ((s)a6.c).d(((t)object4));
                                            if(v7 == null) {
                                                continue;
                                            }
                                            arrayList4.add(v7);
                                            continue;
                                        }
                                        J2.j.l("world");
                                        throw null;
                                    }
                                    for(Object object5: arrayList4) {
                                        this.n(((v)object5));
                                    }
                                    this.r();
                                    goto label_109;
                                }
                                J2.j.l("world");
                                throw null;
                            }
                        label_109:
                            PlanningContainerView planningContainerView0 = this.D;
                            if(planningContainerView0 != null) {
                                h h0 = new h(((t)serializable0), 20);
                                o.I(planningContainerView0.i, h0);
                                return;
                            }
                            J2.j.l("contentView");
                            throw null;
                        }
                        J2.j.l("world");
                        throw null;
                    }
                    default: {
                        return;
                    }
                }
            }
            case 101: {
                if(v1 == -1) {
                    m2.a a7 = CityProductionActivity.C;
                    if(a7 != null) {
                        this.u(new n2.h(a7));
                        return;
                    }
                }
                break;
            }
            case 102: {
                if(v1 == -1) {
                    J2.j.c(intent0);
                    String s1 = intent0.getStringExtra("LEADER");
                    J2.j.c(s1);
                    n2.A a8 = this.G;
                    if(a8 != null) {
                        m m0 = (m)a8.f;
                        m0.getClass();
                        m0.a.a.edit().putString("city-planning-selected-leader", s1).apply();
                        this.z(new n2.A(this.l(), s1));
                        return;
                    }
                    J2.j.l("world");
                    throw null;
                }
                break;
            }
            case 103: {
                if(v1 == -1) {
                    J2.j.c(intent0);
                    Serializable serializable1 = intent0.getSerializableExtra("FILE");
                    J2.j.d(serializable1, "null cannot be cast to non-null type java.io.File");
                    this.z(android.support.v4.media.session.a.G(this.l(), ((File)serializable1)));
                    return;
                }
                break;
            }
        }
    }

    @Override  // androidx.activity.e
    public final void onBackPressed() {
        android.support.v4.media.session.a.k(this, new A3.m(this, 28)).show();
    }

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        View view0 = this.getLayoutInflater().inflate(0x7F0A0022, null, false);  // layout:activity_planning
        int v = 0x7F0700D7;  // id:scrollContentView
        if(((PlanningContainerView)a0.r(view0, 0x7F0700D7)) != null) {  // id:scrollContentView
            if(((ZoomLayout)a0.r(view0, 0x7F0700DA)) != null) {  // id:scrollView
                this.setContentView(((LinearLayout)view0));
                FirebaseAnalytics firebaseAnalytics0 = FirebaseAnalytics.getInstance(this);
                J2.j.e(firebaseAnalytics0, "getInstance(...)");
                this.J = firebaseAnalytics0;
                this.setTitle(android.support.v4.media.session.a.H("LOC_POLICY_URBAN_PLANNING_NAME", new Object[0]));
                u u0 = new u();  // 初始化器: Ljava/lang/Object;-><init>()V
                u0.a = new ArrayList();
                this.H = u0;
                View view1 = this.findViewById(0x7F0700DA);  // id:scrollView
                J2.j.e(view1, "findViewById(...)");
                this.C = (ZoomLayout)view1;
                View view2 = this.findViewById(0x7F0700D7);  // id:scrollContentView
                J2.j.e(view2, "findViewById(...)");
                this.D = (PlanningContainerView)view2;
                f.A a0 = this.j();
                if(a0 != null) {
                    a0.k = true;
                    ((I0)a0.h).a(4 | ((I0)a0.h).b);
                }
                Serializable serializable0 = this.getIntent().getSerializableExtra("FILE");
                File file0 = serializable0 instanceof File ? ((File)serializable0) : null;
                this.z((file0 == null ? this.k().b() : android.support.v4.media.session.a.G(this.l(), file0)));
                ZoomLayout zoomLayout0 = this.C;
                if(zoomLayout0 != null) {
                    zoomLayout0.post(new f(this, 0));
                    return;
                }
                J2.j.l("zoomLayout");
                throw null;
            }
            v = 0x7F0700DA;  // id:scrollView
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }

    @Override  // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        this.B = menu0;
        this.v();
        return true;
    }

    @Override  // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        J2.j.f(menuItem0, "item");
        int v = menuItem0.getItemId();
        if(v == 0x102002C) {
            this.startActivityForResult(new Intent(this, LeaderListActivity.class), 102);
            return super.onOptionsItemSelected(menuItem0);
        }
        switch(v) {
            case 0x7F07003C: {  // id:add_plot
                this.u(new n2.e());  // 初始化器: Ljava/lang/Object;-><init>()V
                return super.onOptionsItemSelected(menuItem0);
            }
            case 0x7F0700A8: {  // id:load_map
                this.startActivityForResult(new Intent(this, PlanningSavesActivity.class), 103);
                return super.onOptionsItemSelected(menuItem0);
            }
            case 0x7F0700D5: {  // id:save_map
                Object object0 = this.l().c.b().e;
                if(object0 == androidx.lifecycle.t.k) {
                    object0 = null;
                }
                if((((q2.f)object0) == null ? false : ((q2.f)object0).a)) {
                    n2.A a0 = this.G;
                    if(a0 != null) {
                        MapFile.Companion.getClass();
                        HashMap hashMap0 = new HashMap();
                        for(Object object1: ((n2.c)a0.d).a) {
                            Integer integer0 = ((n2.b)object1).a;
                            ArrayList arrayList0 = new ArrayList(k.E(((n2.b)object1).c));
                            for(Object object2: ((n2.b)object1).c) {
                                arrayList0.add(((t)object2).e());
                            }
                            hashMap0.put(integer0, arrayList0);
                        }
                        ArrayList arrayList1 = ((s)a0.c).a;
                        ArrayList arrayList2 = new ArrayList(k.E(arrayList1));
                        for(Object object3: arrayList1) {
                            arrayList2.add(new SimplifiedPlot(((v)object3).b, ((v)object3).a.e()));
                        }
                        ArrayList arrayList3 = ((n2.c)a0.b).a;
                        ArrayList arrayList4 = new ArrayList(k.E(arrayList3));
                        for(Object object4: arrayList3) {
                            arrayList4.add(x2.j.z(new List[]{((x)object4).a.e(), ((x)object4).b.e()}));
                        }
                        String s = a0.a;
                        MapFile mapFile0 = new MapFile(new MapObject(s, arrayList2, hashMap0, arrayList4));
                        com.google.gson.h h0 = new com.google.gson.h();
                        StringWriter stringWriter0 = new StringWriter();
                        try {
                            Y1.b b0 = new Y1.b(stringWriter0);
                            b0.p = false;
                            h0.d(mapFile0, MapFile.class, b0);
                        }
                        catch(IOException iOException0) {
                            throw new JsonIOException(iOException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V
                        }
                        String s1 = stringWriter0.toString();
                        File file0 = new File(this.getFilesDir(), "saves");
                        if(!file0.exists()) {
                            file0.mkdir();
                        }
                        File file1 = (File)a0.e;
                        if(file1 == null) {
                            file1 = new File(file0, s + " " + UUID.randomUUID());
                        }
                        a0.e = file1;
                        file1.createNewFile();
                        FileWriter fileWriter0 = new FileWriter(file1);
                        fileWriter0.append(s1);
                        fileWriter0.flush();
                        fileWriter0.close();
                        Toast.makeText(this, android.support.v4.media.session.a.H("LOC_ESPIONAGEOVERVIEW_SUCCESS", new Object[0]), 0).show();
                        return super.onOptionsItemSelected(menuItem0);
                    }
                    J2.j.l("world");
                    throw null;
                }
                z z0 = new z(0);
                Bundle bundle0 = new Bundle();
                bundle0.putBoolean("PURCHASED", false);
                z0.setArguments(bundle0);
                z0.show(this.g(), "PREMIUM_DIALOG_TAG");
                return super.onOptionsItemSelected(menuItem0);
            }
            default: {
                return super.onOptionsItemSelected(menuItem0);
            }
        }
    }

    public final void p(x x0, l2.e e0) {
        l2.f f0 = new l2.f(x0, this);
        f0.setStatus(e0);
        PlanningContainerView planningContainerView0 = this.D;
        if(planningContainerView0 != null) {
            planningContainerView0.addView(f0);
            f0.setOnClickListener(new j2.h(2, this, f0));
            return;
        }
        J2.j.l("contentView");
        throw null;
    }

    public final void q() {
        this.y();
        float f = this.getResources().getDisplayMetrics().density;
        ZoomLayout zoomLayout0 = this.C;
        if(zoomLayout0 != null) {
            float f1 = (float)zoomLayout0.getWidth();
            Plot.Companion.getClass();
            int v = Plot.itemSize.getWidth();
            e e0 = this.F;
            float f2 = ((Number)e0.i).floatValue();
            PlanningContainerView planningContainerView0 = this.D;
            if(planningContainerView0 != null) {
                float f3 = -((float)planningContainerView0.getPaddingLeft());
                float f4 = (float)Plot.itemSize.getWidth();
                float f5 = ((Number)e0.i).floatValue();
                PlanningContainerView planningContainerView1 = this.D;
                if(planningContainerView1 != null) {
                    float f6 = -((float)planningContainerView1.getPaddingTop());
                    float f7 = (float)Plot.itemSize.getHeight();
                    float f8 = ((Number)e0.j).floatValue();
                    ZoomLayout zoomLayout1 = this.C;
                    if(zoomLayout1 != null) {
                        zoomLayout1.getEngine().c(f1 / (f2 * 2.0f + ((float)(v * 3))) / f, false);
                        ZoomLayout zoomLayout2 = this.C;
                        if(zoomLayout2 != null) {
                            Z1.j j0 = zoomLayout2.getEngine();
                            c2.b b0 = j0.i;
                            c2.d d0 = android.support.v4.media.session.a.J(new Z1.g((f5 + f4) * f + f3 - b0.d(), (f8 + f7) * f + f6 - b0.e.top / b0.f()));
                            a2.a a0 = j0.f;
                            int v1 = a0.b;
                            if(v1 == 4) {
                                j0.j.e.forceFinished(true);
                            }
                            else if(v1 == 3) {
                                a0.b(0);
                            }
                            b0.b(d0);
                            return;
                        }
                        J2.j.l("zoomLayout");
                        throw null;
                    }
                    J2.j.l("zoomLayout");
                    throw null;
                }
                J2.j.l("contentView");
                throw null;
            }
            J2.j.l("contentView");
            throw null;
        }
        J2.j.l("zoomLayout");
        throw null;
    }

    public final void r() {
        PlanningContainerView planningContainerView0 = this.D;
        if(planningContainerView0 != null) {
            planningContainerView0.removeView(planningContainerView0.findViewWithTag("frontier"));
            n2.A a0 = this.G;
            if(a0 != null) {
                l2.b b0 = new l2.b(this, a0.a, ((n2.c)a0.d));
                b0.setTag("frontier");
                PlanningContainerView planningContainerView1 = this.D;
                if(planningContainerView1 != null) {
                    planningContainerView1.addView(b0);
                    return;
                }
                J2.j.l("contentView");
                throw null;
            }
            J2.j.l("world");
            throw null;
        }
        J2.j.l("contentView");
        throw null;
    }

    public final void s(ArrayList arrayList0) {
        for(Object object0: arrayList0) {
            v v0 = (v)object0;
            l l0 = this.l();
            n2.A a0 = this.G;
            if(a0 != null) {
                J2.j.f(l0, "environment");
                J2.j.f(v0, "plotWithPostion");
                Plot plot0 = v0.b;
                n2.u u0 = new n2.u(l0.b.b(), l0.b.d(), plot0, new q(v0, a0));
                if(plot0.f() != null) {
                    String s = plot0.f();
                    J2.j.c(s);
                    if(!u0.g(s).a()) {
                        plot0.p(null);
                    }
                }
                if(plot0.h() != null) {
                    String s1 = plot0.h();
                    J2.j.c(s1);
                    if(!u0.i(s1).a()) {
                        plot0.r(null);
                    }
                }
                if(plot0.e() != null) {
                    String s2 = plot0.e();
                    J2.j.c(s2);
                    if(!u0.f(s2).a()) {
                        plot0.o(null);
                    }
                }
                if(plot0.d() != null) {
                    String s3 = plot0.d();
                    J2.j.c(s3);
                    if(!u0.e(s3).a()) {
                        plot0.n(null);
                    }
                }
                if(plot0.g() != null) {
                    String s4 = plot0.g();
                    J2.j.c(s4);
                    if(!u0.h(s4).a()) {
                        plot0.q(null);
                    }
                }
                u u1 = this.H;
                if(u1 != null) {
                    d d0 = u1.d(v0.a);
                    if(d0 == null) {
                        continue;
                    }
                    n2.A a1 = this.G;
                    if(a1 != null) {
                        d0.b(v0, new q(v0, a1));
                        continue;
                    }
                    J2.j.l("world");
                    throw null;
                }
                J2.j.l("plotViewManager");
                throw null;
            }
            J2.j.l("world");
            throw null;
        }
    }

    public final void t() {
        PlanningContainerView planningContainerView0 = this.D;
        if(planningContainerView0 != null) {
            planningContainerView0.b();
            n2.A a0 = this.G;
            if(a0 != null) {
                ArrayList arrayList0 = ((s)a0.c).a;
                ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
                for(Object object0: arrayList0) {
                    n2.A a1 = this.G;
                    if(a1 != null) {
                        arrayList1.add(Boolean.valueOf(new q(((v)object0), a1).b()));
                        continue;
                    }
                    J2.j.l("world");
                    throw null;
                }
                n2.A a2 = this.G;
                if(a2 != null) {
                    this.K = x2.i.v0(((s)a2.c).a, arrayList1);
                    n2.A a3 = this.G;
                    if(a3 != null) {
                        s s0 = (s)a3.c;
                        ArrayList arrayList2 = new ArrayList(k.E(s0.a));
                        for(Object object1: s0.a) {
                            r r0 = new r(1, s0, s.class, "isEmpty", "isEmpty(Lcom/spears/civilopedia/planning/logic/PlotPosition;)Z", 0, 0);
                            arrayList2.add(s.b(((v)object1).a, r0));
                        }
                        for(Object object2: new HashSet(k.F(arrayList2))) {
                            LayoutInflater layoutInflater0 = this.getLayoutInflater();
                            PlanningContainerView planningContainerView1 = this.D;
                            if(planningContainerView1 != null) {
                                View view0 = layoutInflater0.inflate(0x7F0A005F, planningContainerView1, false);  // layout:planning_item_plot_empty
                                view0.setTag("temporary");
                                J j0 = ((t)object2).c();
                                o1.a.P(view0, j0);
                                this.x(j0);
                                PlanningContainerView planningContainerView2 = this.D;
                                if(planningContainerView2 != null) {
                                    planningContainerView2.addView(view0);
                                    view0.setOnClickListener(new j2.h(1, ((t)object2), this));
                                    continue;
                                }
                                J2.j.l("contentView");
                                throw null;
                            }
                            J2.j.l("contentView");
                            throw null;
                        }
                        n2.A a4 = this.G;
                        if(a4 != null) {
                            ArrayList arrayList3 = ((s)a4.c).e();
                            ArrayList arrayList4 = new ArrayList(k.E(arrayList3));
                            for(Object object3: arrayList3) {
                                t t0 = (t)object3;
                                n2.A a5 = this.G;
                                if(a5 != null) {
                                    s s1 = (s)a5.c;
                                    s1.getClass();
                                    J2.j.f(t0, "position");
                                    ArrayList arrayList5 = s.b(t0, new r(1, s1, s.class, "isFilled", "isFilled(Lcom/spears/civilopedia/planning/logic/PlotPosition;)Z", 0, 1));
                                    ArrayList arrayList6 = new ArrayList(k.E(arrayList5));
                                    for(Object object4: arrayList5) {
                                        arrayList6.add(new x(t0, ((t)object4)));
                                    }
                                    arrayList4.add(arrayList6);
                                    continue;
                                }
                                J2.j.l("world");
                                throw null;
                            }
                            for(Object object5: x2.i.N(k.F(arrayList4))) {
                                n2.A a6 = this.G;
                                if(a6 != null) {
                                    n2.c c0 = (n2.c)a6.b;
                                    c0.getClass();
                                    J2.j.f(((x)object5), "edge");
                                    this.p(((x)object5), (c0.a.contains(((x)object5)) ? l2.e.j : l2.e.i));
                                    continue;
                                }
                                J2.j.l("world");
                                throw null;
                            }
                            this.y();
                            return;
                        }
                        J2.j.l("world");
                        throw null;
                    }
                    J2.j.l("world");
                    throw null;
                }
                J2.j.l("world");
                throw null;
            }
            J2.j.l("world");
            throw null;
        }
        J2.j.l("contentView");
        throw null;
    }

    public final void u(i i0) {
        n2.A a8;
        Iterator iterator18;
        i i1 = this.I;
        if(i1 instanceof n2.e) {
            ArrayList arrayList0 = this.K;
            ArrayList arrayList1 = new ArrayList(k.E(arrayList0));
            for(Object object0: arrayList0) {
                arrayList1.add(((v)((e)object0).i));
            }
            ArrayList arrayList2 = new ArrayList(k.E(arrayList1));
            for(Object object1: arrayList1) {
                n2.A a0 = this.G;
                if(a0 != null) {
                    arrayList2.add(Boolean.valueOf(new q(((v)object1), a0).b()));
                    continue;
                }
                J2.j.l("world");
                throw null;
            }
            ArrayList arrayList3 = x2.i.v0(this.K, arrayList2);
            ArrayList arrayList4 = new ArrayList();
            for(Object object2: arrayList3) {
                if(((Boolean)((e)((e)object2).i).j).booleanValue() != ((Boolean)((e)object2).j).booleanValue()) {
                    arrayList4.add(object2);
                }
            }
            ArrayList arrayList5 = new ArrayList(k.E(arrayList4));
            for(Object object3: arrayList4) {
                arrayList5.add(((v)((e)((e)object3).i).i));
            }
            this.s(arrayList5);
            PlanningContainerView planningContainerView0 = this.D;
            if(planningContainerView0 != null) {
                planningContainerView0.b();
                this.E = new e(0.0, 0.0);
                u u0 = this.H;
                if(u0 != null) {
                    for(Object object4: u0.a) {
                        J j0 = ((d)object4).b;
                        if(j0 != null) {
                            this.x(j0);
                            continue;
                        }
                        J2.j.l("frame");
                        throw null;
                    }
                    n2.A a1 = this.G;
                    if(a1 != null) {
                        for(Object object5: ((n2.c)a1.b).a) {
                            this.p(((x)object5), l2.e.k);
                        }
                        this.y();
                        goto label_106;
                    }
                    J2.j.l("world");
                    throw null;
                }
                J2.j.l("plotViewManager");
                throw null;
            }
            J2.j.l("contentView");
            throw null;
        }
        else if(i1 instanceof n2.h) {
            J2.j.d(i1, "null cannot be cast to non-null type com.spears.civilopedia.planning.logic.GridState.Placement");
            ArrayList arrayList6 = new ArrayList();
            for(Object object6: ((n2.h)i1).a.b) {
                u u1 = this.H;
                if(u1 != null) {
                    d d0 = u1.d(((t)object6));
                    if(d0 == null) {
                        continue;
                    }
                    arrayList6.add(d0);
                    continue;
                }
                J2.j.l("plotViewManager");
                throw null;
            }
            for(Object object7: arrayList6) {
                ((d)object7).a.h.setVisibility(8);
                v v0 = ((d)object7).a();
                q q0 = ((d)object7).d;
                if(q0 != null) {
                    ((d)object7).b(v0, q0);
                    continue;
                }
                J2.j.l("adjacencyProps");
                throw null;
            }
        }
        else if(i1 instanceof n2.f) {
            u u2 = this.H;
            if(u2 != null) {
                for(Object object8: u2.a) {
                    ((RelativeLayout)((d)object8).a.i.j).setVisibility(8);
                    ((LinearLayout)((d)object8).a.k.j).setVisibility(8);
                }
                PlanningContainerView planningContainerView1 = this.D;
                if(planningContainerView1 != null) {
                    planningContainerView1.removeView(planningContainerView1.findViewWithTag("shadow"));
                    goto label_106;
                }
                J2.j.l("contentView");
                throw null;
            }
            J2.j.l("plotViewManager");
            throw null;
        }
    label_106:
        this.I = i0;
        if(i0 instanceof n2.e) {
            this.t();
        }
        else if(i0 instanceof n2.h) {
            m2.a a2 = ((n2.h)i0).a;
            ArrayList arrayList7 = new ArrayList();
            for(Object object9: a2.b) {
                u u3 = this.H;
                if(u3 != null) {
                    d d1 = u3.d(((t)object9));
                    if(d1 == null) {
                        continue;
                    }
                    arrayList7.add(d1);
                    continue;
                }
                J2.j.l("plotViewManager");
                throw null;
            }
            for(Object object10: arrayList7) {
                d d2 = (d)object10;
                v v1 = v.a(d2.a(), Plot.c(d2.a().b));
                o2.q q1 = a2.a;
                if(J2.j.a(q1.a, "DISTRICTS")) {
                    v1.b.o(q1.b);
                }
                else if(J2.j.a(q1.a, "WONDERS")) {
                    v1.b.n(q1.b);
                }
                n2.A a3 = this.G;
                if(a3 != null) {
                    q q2 = new q(v1, a3);
                    g2.a a4 = d2.a;
                    a4.h.setVisibility(0);
                    a4.m.setVisibility(8);
                    B b0 = q2.a();
                    if(b0 == null) {
                        continue;
                    }
                    Set set0 = b0.a.entrySet();
                    if(set0 == null) {
                        continue;
                    }
                    Map.Entry map$Entry0 = (Map.Entry)x2.i.Q(set0);
                    if(map$Entry0 == null || ((Number)map$Entry0.getValue()).doubleValue() <= 0.0) {
                        continue;
                    }
                    d2.c(((String)map$Entry0.getKey()), ((Number)map$Entry0.getValue()).doubleValue());
                    ((RelativeLayout)a4.b.k).setVisibility(0);
                    continue;
                }
                J2.j.l("world");
                throw null;
            }
        }
        else if(i0 instanceof n2.f) {
            n2.A a5 = this.G;
            if(a5 != null) {
                ArrayList arrayList8 = a0.d(((s)a5.c).e(), null);
                n2.A a6 = this.G;
                if(a6 != null) {
                    n2.b b1 = ((n2.f)i0).a;
                    ArrayList arrayList9 = ((s)a6.c).e();
                    ArrayList arrayList10 = new ArrayList();
                    for(Object object11: arrayList9) {
                        if(b1.a(((t)object11)) == 1 && ((n2.c)a6.d).a(((t)object11)) == null) {
                            arrayList10.add(object11);
                        }
                    }
                    ArrayList arrayList11 = new ArrayList();
                    for(Object object12: arrayList10) {
                        u u4 = this.H;
                        if(u4 != null) {
                            d d3 = u4.d(((t)object12));
                            if(d3 == null) {
                                continue;
                            }
                            arrayList11.add(d3);
                            continue;
                        }
                        J2.j.l("plotViewManager");
                        throw null;
                    }
                    for(Object object13: arrayList11) {
                        ((RelativeLayout)((d)object13).a.i.j).setVisibility(0);
                    }
                    n2.A a7 = this.G;
                    if(a7 != null) {
                        s s0 = (s)a7.c;
                        ArrayList arrayList12 = new ArrayList();
                        for(Object object14: s0.a) {
                            v v2 = (v)object14;
                            String s1 = v2.b.g();
                            if(s1 != null) {
                                Improvements improvements0 = (Improvements)((l)a7.g).b.b().K0.h(s1);
                                if(improvements0 != null && improvements0.getOnePerCity()) {
                                    continue;
                                }
                            }
                            else if(v2.b.e() != null || v2.b.d() != null) {
                                continue;
                            }
                            arrayList12.add(object14);
                        }
                        ArrayList arrayList13 = new ArrayList(k.E(arrayList12));
                        for(Object object15: arrayList12) {
                            arrayList13.add(((v)object15).a);
                        }
                        ArrayList arrayList14 = new ArrayList();
                        Iterator iterator16 = arrayList13.iterator();
                        while(iterator16.hasNext()) {
                            Object object16 = iterator16.next();
                            t t0 = (t)object16;
                            if(b1.a(t0) == 1) {
                                n2.b b2 = ((n2.c)a7.d).a(t0);
                                if(b2 != null) {
                                    for(Object object17: b2.c) {
                                        t t1 = (t)object17;
                                        iterator18 = iterator16;
                                        v v3 = s0.d(t1);
                                        if(v3 == null) {
                                            a8 = a7;
                                        }
                                        else {
                                            Plot plot0 = v3.b;
                                            if(plot0 == null) {
                                                a8 = a7;
                                            }
                                            else {
                                                a8 = a7;
                                                if(plot0.k()) {
                                                    if(t0.b(t1) > 1 && !J2.j.a(b2.b, b1.b)) {
                                                        arrayList14.add(object16);
                                                    }
                                                    goto label_238;
                                                }
                                            }
                                        }
                                        iterator16 = iterator18;
                                        a7 = a8;
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                            }
                            iterator18 = iterator16;
                            a8 = a7;
                        label_238:
                            iterator16 = iterator18;
                            a7 = a8;
                        }
                        ArrayList arrayList15 = new ArrayList();
                        for(Object object18: arrayList14) {
                            u u5 = this.H;
                            if(u5 != null) {
                                d d4 = u5.d(((t)object18));
                                if(d4 == null) {
                                    continue;
                                }
                                arrayList15.add(d4);
                                continue;
                            }
                            J2.j.l("plotViewManager");
                            throw null;
                        }
                        for(Object object19: arrayList15) {
                            ((LinearLayout)((d)object19).a.k.j).setVisibility(0);
                        }
                        List list0 = (List)x2.i.S(a0.d(x2.i.e0(arrayList14, x2.i.e0(arrayList10, b1.c)), null));
                        Resources resources0 = this.getResources();
                        J2.j.e(resources0, "getResources(...)");
                        Path path0 = O2.A.e(list0, resources0);
                        List list1 = (List)x2.i.S(arrayList8);
                        Resources resources1 = this.getResources();
                        J2.j.e(resources1, "getResources(...)");
                        l2.c c0 = new l2.c(this, path0, O2.A.e(list1, resources1));
                        c0.setTag("shadow");
                        PlanningContainerView planningContainerView2 = this.D;
                        if(planningContainerView2 != null) {
                            planningContainerView2.addView(c0);
                            this.v();
                            return;
                        }
                        J2.j.l("contentView");
                        throw null;
                    }
                    J2.j.l("world");
                    throw null;
                }
                J2.j.l("world");
                throw null;
            }
            J2.j.l("world");
            throw null;
        }
        this.v();
    }

    public final void v() {
        Menu menu0 = this.B;
        if(menu0 != null) {
            menu0.clear();
            i i0 = this.I;
            if(i0 instanceof g) {
                this.getMenuInflater().inflate(0x7F0B0001, this.B);  // menu:options_planning
                MenuItem menuItem0 = menu0.findItem(0x7F0700A8);  // id:load_map
                if(menuItem0 != null) {
                    menuItem0.setTitle(android.support.v4.media.session.a.H("LOC_LOAD_MAP", new Object[0]));
                }
                MenuItem menuItem1 = menu0.findItem(0x7F0700D5);  // id:save_map
                if(menuItem1 != null) {
                    menuItem1.setTitle(android.support.v4.media.session.a.H("LOC_SAVE_MAP_BUTTON", new Object[0]));
                }
            }
            else {
                if(i0 instanceof n2.h) {
                    menu0.clear();
                    menu0.add(0, 0, 0, "").setShowAsActionFlags(2).setTitle(android.support.v4.media.session.a.H("LOC_CANCEL", new Object[0])).setOnMenuItemClickListener(new k2.h(this, 0));
                    return;
                }
                if((i0 instanceof n2.f ? true : i0 instanceof n2.e)) {
                    menu0.add(0, 0, 0, "").setShowAsActionFlags(2).setIcon(this.getResources().getDrawable(R.drawable.icon_done, null)).setOnMenuItemClickListener(new k2.h(this, 1));
                }
            }
        }
    }

    public final void w(d d0) {
        v v0 = d0.a();
        if(v0.b.k()) {
            LinearLayoutCompat linearLayoutCompat0 = (LinearLayoutCompat)d0.a.c.j;
            ImageView imageView0 = (ImageView)d0.a.c.m;
            linearLayoutCompat0.setOnClickListener(new c(this, v0, 1));
            imageView0.setOnClickListener(new c(this, v0, 2));
            PlanningContainerView planningContainerView0 = this.D;
            if(planningContainerView0 != null) {
                planningContainerView0.post(new k2.g(this, v0, imageView0, linearLayoutCompat0, 0));
                return;
            }
            J2.j.l("contentView");
            throw null;
        }
    }

    public final void x(J j0) {
        this.E = new e(Math.max(-j0.a, ((Number)this.E.i).doubleValue()), Math.max(-j0.b, ((Number)this.E.j).doubleValue()));
    }

    public final void y() {
        float f = this.getResources().getDisplayMetrics().density;
        int v = (int)(((Number)this.F.i).floatValue() * f);
        int v1 = (int)(((Number)this.F.j).floatValue() * f);
        PlanningContainerView planningContainerView0 = this.D;
        if(planningContainerView0 != null) {
            planningContainerView0.setPadding(((int)(((Number)this.E.i).doubleValue() * ((double)f))) + v, ((int)(((Number)this.E.j).doubleValue() * ((double)f))) + v1, v, v1);
            return;
        }
        J2.j.l("contentView");
        throw null;
    }

    public final void z(n2.A a0) {
        this.k().j = a0;
        this.G = a0;
        this.I = new g();  // 初始化器: Ljava/lang/Object;-><init>()V
        u u0 = this.H;
        if(u0 != null) {
            u0.a.clear();
            PlanningContainerView planningContainerView0 = this.D;
            if(planningContainerView0 != null) {
                planningContainerView0.removeAllViews();
                PlanningContainerView planningContainerView1 = this.D;
                if(planningContainerView1 != null) {
                    planningContainerView1.i.clear();
                    n2.A a1 = this.G;
                    if(a1 != null) {
                        for(Object object0: ((s)a1.c).a) {
                            this.o(((v)object0));
                        }
                        this.r();
                        n2.A a2 = this.G;
                        if(a2 != null) {
                            for(Object object1: ((n2.c)a2.b).a) {
                                this.p(((x)object1), l2.e.k);
                            }
                            this.q();
                            f.A a3 = this.j();
                            if(a3 != null) {
                                Integer integer0 = o1.a.Y(("ICON_" + a0.a), 50, "ICON_LEADER_BARBARIAN");
                                J2.j.c(integer0);
                                int v = (int)integer0;
                                I0 i00 = (I0)a3.h;
                                Drawable drawable0 = v == 0 ? null : g.b.c(i00.a.getContext(), v);
                                i00.f = drawable0;
                                Toolbar toolbar0 = i00.a;
                                if((i00.b & 4) != 0) {
                                    if(drawable0 == null) {
                                        drawable0 = i00.o;
                                    }
                                    toolbar0.setNavigationIcon(drawable0);
                                    return;
                                }
                                toolbar0.setNavigationIcon(null);
                            }
                            return;
                        }
                        J2.j.l("world");
                        throw null;
                    }
                    J2.j.l("world");
                    throw null;
                }
                J2.j.l("contentView");
                throw null;
            }
            J2.j.l("contentView");
            throw null;
        }
        J2.j.l("plotViewManager");
        throw null;
    }
}

