package com.spears.civilopedia;

import B.c;
import F0.g;
import L.b;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;
import f2.D;
import f2.G;
import f2.j;
import f2.r;
import f2.s;
import f2.t;
import f2.v;
import java.util.ArrayList;
import java.util.HashMap;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import p2.a;
import q2.e;
import z1.a0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/spears/civilopedia/MainActivity;", "Lf2/j;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MainActivity extends j {
    public RecyclerView B;
    public v C;
    public G D;
    public LinearLayoutManager E;
    public final g F;
    public static final int G;

    public MainActivity() {
        this.F = new g(this, 10);
    }

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setTitle(0x7F0E0001);  // string:APP_NAME "Civilopedia"
        View view0 = this.getLayoutInflater().inflate(0x7F0A001F, null, false);  // layout:activity_main
        int v1 = 0x7F070064;  // id:civic_tree
        RelativeLayout relativeLayout0 = (RelativeLayout)a0.r(view0, 0x7F070064);  // id:civic_tree
        if(relativeLayout0 != null && ((RecyclerView)a0.r(view0, 0x7F0700A3)) != null) {  // id:list
            LinearLayout linearLayout0 = (LinearLayout)a0.r(view0, 0x7F0700C2);  // id:planningButton
            if(linearLayout0 == null) {
                v1 = 0x7F0700C2;  // id:planningButton
            }
            else {
                RelativeLayout relativeLayout1 = (RelativeLayout)a0.r(view0, 0x7F07010D);  // id:tech_tree
                if(relativeLayout1 != null) {
                    this.setContentView(((RelativeLayout)view0));
                    FirebaseAnalytics.getInstance(this).a.zzN(null, "market", "google", false);
                    linearLayout0.setOnClickListener(new r(this, 0));
                    linearLayout0.setVisibility((this.l().b.c().d() ? 0 : 8));
                    relativeLayout0.setVisibility(linearLayout0.getVisibility());
                    relativeLayout1.setVisibility(linearLayout0.getVisibility());
                    relativeLayout0.setOnClickListener(new r(this, 1));
                    relativeLayout1.setOnClickListener(new r(this, 2));
                    v v2 = new v();  // 初始化器: LN/z;-><init>()V
                    v2.b = x2.r.i;
                    this.C = v2;
                    ArrayList arrayList0 = this.l().b.d().a;
                    J2.j.f(arrayList0, "<set-?>");
                    v2.b = arrayList0;
                    this.E = new LinearLayoutManager();
                    View view1 = this.findViewById(0x7F0700A3);  // id:list
                    ((RecyclerView)view1).setHasFixedSize(true);
                    LinearLayoutManager linearLayoutManager0 = this.E;
                    if(linearLayoutManager0 != null) {
                        ((RecyclerView)view1).setLayoutManager(linearLayoutManager0);
                        v v3 = this.C;
                        if(v3 != null) {
                            ((RecyclerView)view1).setAdapter(v3);
                            ((RecyclerView)view1).setClickable(true);
                            c c0 = new c(28, this, ((RecyclerView)view1));
                            ((RecyclerView)view1).f(new D(((RecyclerView)view1).getContext(), ((RecyclerView)view1), c0));
                            J2.j.e(view1, "apply(...)");
                            this.B = (RecyclerView)view1;
                            L.c c1 = L.c.a(this);
                            g g0 = this.F;
                            IntentFilter intentFilter0 = new IntentFilter("main-update");
                            synchronized(c1.b) {
                                b b0 = new b(intentFilter0, g0);
                                ArrayList arrayList1 = (ArrayList)c1.b.get(g0);
                                if(arrayList1 == null) {
                                    arrayList1 = new ArrayList(1);
                                    c1.b.put(g0, arrayList1);
                                }
                                arrayList1.add(b0);
                                for(int v = 0; v < intentFilter0.countActions(); ++v) {
                                    String s = intentFilter0.getAction(v);
                                    ArrayList arrayList2 = (ArrayList)c1.c.get(s);
                                    if(arrayList2 == null) {
                                        arrayList2 = new ArrayList(1);
                                        c1.c.put(s, arrayList2);
                                    }
                                    arrayList2.add(b0);
                                }
                            }
                            e e0 = this.l().c;
                            m0.b b1 = e0.d;
                            if(!b1.b()) {
                                b1.e(e0);
                            }
                            o2.G.b = true;
                            MobileAds.initialize(this, new a());  // 初始化器: Ljava/lang/Object;-><init>()V
                            return;
                        }
                        J2.j.l("viewAdapter");
                        throw null;
                    }
                    J2.j.l("viewManager");
                    throw null;
                }
                v1 = 0x7F07010D;  // id:tech_tree
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v1));
    }

    @Override  // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu0) {
        this.getMenuInflater().inflate(0x7F0B0000, menu0);  // menu:options_menu
        SharedPreferences sharedPreferences0 = this.getSharedPreferences("PrefsFile", 0);
        J2.j.c(sharedPreferences0);
        if(sharedPreferences0.getBoolean("introduce-civ5-3", false)) {
            if(menu0 != null) {
                MenuItem menuItem1 = menu0.findItem(0x7F0700E7);  // id:settings
                if(menuItem1 != null) {
                    menuItem1.setIcon(R.drawable.ic_settings);
                }
            }
        }
        else if(menu0 != null) {
            MenuItem menuItem0 = menu0.findItem(0x7F0700E7);  // id:settings
            if(menuItem0 != null) {
                menuItem0.setIcon(R.drawable.ic_settings_with_dot);
            }
        }
        View view0 = null;
        MenuItem menuItem2 = menu0 == null ? null : menu0.findItem(0x7F0700DB);  // id:search
        if(menuItem2 != null) {
            view0 = menuItem2.getActionView();
        }
        J2.j.d(view0, "null cannot be cast to non-null type android.widget.SearchView");
        ((SearchView)view0).setOnQueryTextListener(new t(((SearchView)view0), this));
        ((SearchView)view0).setOnCloseListener(new s(((SearchView)view0), this));
        return true;
    }

    @Override  // f.h
    public final void onDestroy() {
        L.c c0 = L.c.a(this);
        g g0 = this.F;
        HashMap hashMap0 = c0.b;
        __monitor_enter(hashMap0);
        int v = FIN.finallyOpen$NT();
        ArrayList arrayList0 = (ArrayList)c0.b.remove(g0);
        if(arrayList0 == null) {
            FIN.finallyExec$NT(v);
        }
        else {
            for(int v1 = arrayList0.size() - 1; v1 >= 0; --v1) {
                b b0 = (b)arrayList0.get(v1);
                b0.d = true;
                for(int v2 = 0; v2 < b0.a.countActions(); ++v2) {
                    String s = b0.a.getAction(v2);
                    ArrayList arrayList1 = (ArrayList)c0.c.get(s);
                    if(arrayList1 != null) {
                        for(int v3 = arrayList1.size() - 1; v3 >= 0; --v3) {
                            b b1 = (b)arrayList1.get(v3);
                            if(b1.b == g0) {
                                b1.d = true;
                                arrayList1.remove(v3);
                            }
                        }
                        if(arrayList1.size() <= 0) {
                            c0.c.remove(s);
                        }
                    }
                }
            }
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(hashMap0);
            FIN.finallyCodeEnd$NT(v);
        }
        super.onDestroy();
    }

    @Override  // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem0) {
        J2.j.f(menuItem0, "item");
        if(menuItem0.getItemId() == 0x7F0700E7) {  // id:settings
            this.startActivity(new Intent(this, SettingsActivity.class));
        }
        return super.onOptionsItemSelected(menuItem0);
    }
}

