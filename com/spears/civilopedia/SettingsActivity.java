package com.spears.civilopedia;

import J3.d;
import L.b;
import L.c;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;
import androidx.lifecycle.t;
import com.google.firebase.analytics.FirebaseAnalytics;
import f2.A;
import f2.E;
import f2.H;
import f2.J;
import f2.K;
import f2.L;
import f2.e;
import f2.j;
import f2.n;
import f2.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import jeb.synthetic.FIN;
import kotlin.Metadata;
import o2.I;
import q2.f;
import x2.r;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/spears/civilopedia/SettingsActivity;", "Lf2/j;", "Lf2/e;", "Lf2/A;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SettingsActivity extends j implements A, e {
    public FirebaseAnalytics B;
    public ListView C;
    public L D;
    public static final int E;

    @Override  // f2.A
    public final void b() {
        FirebaseAnalytics firebaseAnalytics0 = this.B;
        if(firebaseAnalytics0 != null) {
            firebaseAnalytics0.a("billing_premium_buy", null);
            if(!this.l().c.c(this)) {
                FirebaseAnalytics firebaseAnalytics1 = this.B;
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

    public final void n() {
        String s4;
        ArrayList arrayList3;
        ArrayList arrayList2;
        c c0 = c.a(this);
        Intent intent0 = new Intent("main-update");
        HashMap hashMap0 = c0.b;
        __monitor_enter(hashMap0);
        int v = FIN.finallyOpen$NT();
        String s = intent0.getAction();
        String s1 = intent0.resolveTypeIfNeeded(c0.a.getContentResolver());
        Uri uri0 = intent0.getData();
        String s2 = intent0.getScheme();
        Set set0 = intent0.getCategories();
        boolean z = (intent0.getFlags() & 8) != 0;
        if(z) {
            Log.v("LocalBroadcastManager", "Resolving type " + s1 + " scheme " + s2 + " of intent " + intent0);
        }
        String s3 = intent0.getAction();
        ArrayList arrayList0 = (ArrayList)c0.c.get(s3);
        if(arrayList0 == null) {
        label_68:
            FIN.finallyCodeBegin$NT(v);
            __monitor_exit(hashMap0);
            FIN.finallyCodeEnd$NT(v);
        }
        else {
            if(z) {
                Log.v("LocalBroadcastManager", "Action list: " + arrayList0);
            }
            ArrayList arrayList1 = null;
            int v1 = 0;
            while(v1 < arrayList0.size()) {
                b b0 = (b)arrayList0.get(v1);
                if(z) {
                    Log.v("LocalBroadcastManager", "Matching against filter " + b0.a);
                }
                if(b0.c) {
                    if(z) {
                        Log.v("LocalBroadcastManager", "  Filter\'s target already added");
                    }
                    arrayList2 = arrayList0;
                    arrayList3 = arrayList1;
                }
                else {
                    arrayList2 = arrayList0;
                    arrayList3 = arrayList1;
                    int v2 = b0.a.match(s, s1, s2, uri0, set0, "LocalBroadcastManager");
                    if(v2 >= 0) {
                        if(z) {
                            Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(v2));
                        }
                        arrayList1 = arrayList3 == null ? new ArrayList() : arrayList3;
                        arrayList1.add(b0);
                        b0.c = true;
                        goto label_53;
                    }
                    else if(z) {
                        switch(v2) {
                            case -4: {
                                s4 = "category";
                                break;
                            }
                            case -3: {
                                s4 = "action";
                                break;
                            }
                            case -2: {
                                s4 = "data";
                                break;
                            }
                            case -1: {
                                s4 = "type";
                                break;
                            }
                            default: {
                                s4 = "unknown reason";
                            }
                        }
                        Log.v("LocalBroadcastManager", "  Filter did not match: " + s4);
                    }
                }
                arrayList1 = arrayList3;
            label_53:
                ++v1;
                arrayList0 = arrayList2;
            }
            if(arrayList1 != null) {
                for(int v3 = 0; v3 < arrayList1.size(); ++v3) {
                    ((b)arrayList1.get(v3)).c = false;
                }
                B.c c1 = new B.c(8, intent0, arrayList1);
                c0.d.add(c1);
                if(!c0.e.hasMessages(1)) {
                    c0.e.sendEmptyMessage(1);
                }
                FIN.finallyExec$NT(v);
                goto label_71;
            }
            goto label_68;
        }
    label_71:
        SettingsActivity.o(this);
        L l0 = this.D;
        if(l0 != null) {
            l0.notifyDataSetChanged();
            return;
        }
        J2.j.l("adapter");
        throw null;
    }

    public static void o(SettingsActivity settingsActivity0) {
        boolean z = false;
        E e0 = settingsActivity0.l().b.c();
        J2.j.f(settingsActivity0, "context");
        p p0 = I.p(settingsActivity0);
        if(p0 == null) {
            p.i.getClass();
            p0 = d.b();
        }
        p p1 = I.j(p0);
        J2.j.e("Choose Ruleset", "getString(...)");
        String s = e0.b(settingsActivity0);
        H h0 = new H("Choose Ruleset", f2.I.i, s, null, 8);
        J2.j.e("Language", "getString(...)");
        String s1 = p1.a();
        H h1 = new H("Language", f2.I.j, s1, null, 8);
        J2.j.e("Rate This App", "getString(...)");
        H h2 = new H("Rate This App", f2.I.k, null, null, 8);
        J2.j.e("Feedback", "getString(...)");
        H h3 = new H("Feedback", f2.I.l, null, null, 8);
        J2.j.e("Copyright", "getString(...)");
        ArrayList arrayList0 = x2.j.x(new H[]{h0, h1, h2, h3, new H("Copyright", f2.I.m, null, null, 8)});
        Object object0 = settingsActivity0.l().c.b().e;
        if(object0 == t.k) {
            object0 = null;
        }
        if(((f)object0) != null) {
            z = ((f)object0).a;
        }
        int v = z ? R.drawable.ic_award_solid : R.drawable.ic_award_gray;
        J2.j.e("Premium", "getString(...)");
        arrayList0.add(new H("Premium", f2.I.n, null, v, 4));
        L l0 = settingsActivity0.D;
        if(l0 != null) {
            l0.j = arrayList0;
            return;
        }
        J2.j.l("adapter");
        throw null;
    }

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        FirebaseAnalytics firebaseAnalytics0 = FirebaseAnalytics.getInstance(this);
        J2.j.e(firebaseAnalytics0, "getInstance(...)");
        this.B = firebaseAnalytics0;
        this.l().c.b().d(this, new J(this, 0));
        this.setTitle(0x7F0E001D);  // string:SETTINGS "Settings"
        this.setContentView(0x7F0A0026);  // layout:activity_settings
        View view0 = this.findViewById(0x7F0700A3);  // id:list
        J2.j.e(view0, "findViewById(...)");
        this.C = (ListView)view0;
        L l0 = new L(this, 0, 0);
        l0.j = r.i;
        this.D = l0;
        SettingsActivity.o(this);
        ListView listView0 = this.C;
        if(listView0 != null) {
            L l1 = this.D;
            if(l1 != null) {
                listView0.setAdapter(l1);
                ListView listView1 = this.C;
                if(listView1 != null) {
                    listView1.setOnItemClickListener(new K(this, 0));
                    return;
                }
                J2.j.l("listView");
                throw null;
            }
            J2.j.l("adapter");
            throw null;
        }
        J2.j.l("listView");
        throw null;
    }
}

