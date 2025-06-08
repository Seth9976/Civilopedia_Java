package com.spears.civilopedia.planning;

import B.d;
import N.O;
import N.z;
import R2.q;
import android.os.Bundle;
import android.support.v4.media.session.a;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f2.C;
import f2.D;
import f2.j;
import g1.n;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import k2.b;
import kotlin.Metadata;
import n2.m;
import x2.i;
import x2.k;
import x2.r;
import z1.a0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spears/civilopedia/planning/PlanningSavesActivity;", "Lf2/j;", "Lf2/C;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PlanningSavesActivity extends j implements C {
    public ArrayList B;
    public b C;
    public n D;

    @Override  // f2.C
    public final void m(int v) {
        a.k(this, new q(v, 2, this)).show();
    }

    public final void n() {
        ArrayList arrayList0 = this.B;
        if(arrayList0 != null) {
            if(arrayList0.size() == 0) {
                n n0 = this.D;
                if(n0 != null) {
                    ((TextView)n0.j).setVisibility(0);
                    n n1 = this.D;
                    if(n1 != null) {
                        ((RecyclerView)n1.k).setVisibility(8);
                        return;
                    }
                    J2.j.l("binding");
                    throw null;
                }
                J2.j.l("binding");
                throw null;
            }
            n n2 = this.D;
            if(n2 != null) {
                ((TextView)n2.j).setVisibility(8);
                n n3 = this.D;
                if(n3 != null) {
                    ((RecyclerView)n3.k).setVisibility(0);
                    return;
                }
                J2.j.l("binding");
                throw null;
            }
            J2.j.l("binding");
            throw null;
        }
        J2.j.l("files");
        throw null;
    }

    @Override  // android.app.Activity
    public final boolean onContextItemSelected(MenuItem menuItem0) {
        J2.j.f(menuItem0, "item");
        if(menuItem0.getGroupId() == 101) {
            ArrayList arrayList0 = this.B;
            if(arrayList0 != null) {
                ((File)arrayList0.remove(menuItem0.getOrder())).delete();
                n n0 = this.D;
                if(n0 != null) {
                    z z0 = ((RecyclerView)n0.k).getAdapter();
                    if(z0 != null) {
                        z0.a.a();
                    }
                    return true;
                }
                J2.j.l("binding");
                throw null;
            }
            J2.j.l("files");
            throw null;
        }
        return super.onContextItemSelected(menuItem0);
    }

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        ArrayList arrayList1;
        super.onCreate(bundle0);
        View view0 = this.getLayoutInflater().inflate(0x7F0A0023, null, false);  // layout:activity_planning_saves
        int v = 0x7F0700A4;  // id:listEmptyView
        TextView textView0 = (TextView)a0.r(view0, 0x7F0700A4);  // id:listEmptyView
        if(textView0 != null) {
            v = 0x7F0700A6;  // id:listView
            RecyclerView recyclerView0 = (RecyclerView)a0.r(view0, 0x7F0700A6);  // id:listView
            if(recyclerView0 != null) {
                this.D = new n(((RelativeLayout)view0), textView0, recyclerView0, 3);
                this.setContentView(((RelativeLayout)view0));
                this.setTitle(a.H("LOC_LOAD_MAP", new Object[0]));
                m m0 = (m)this.k().b().f;
                Iterable iterable0 = m0.c();
                ArrayList arrayList0 = new ArrayList(k.E(iterable0));
                for(Object object0: iterable0) {
                    arrayList0.add(((o2.q)object0).b);
                }
                File[] arr_file = new File(this.getFilesDir(), "saves").listFiles();
                if(arr_file == null) {
                    arrayList1 = r.i;
                }
                else {
                    arrayList1 = new ArrayList();
                    for(int v1 = 0; v1 < arr_file.length; ++v1) {
                        File file0 = arr_file[v1];
                        String s = file0.getName();
                        J2.j.e(s, "getName(...)");
                        String s1 = (String)i.U(Y3.n.G0(s, new String[]{" "}));
                        if((s1 == null ? false : arrayList0.contains(s1))) {
                            arrayList1.add(file0);
                        }
                    }
                }
                ArrayList arrayList2 = i.p0(i.m0(arrayList1, new d(11)));
                this.B = arrayList2;
                this.C = new b(arrayList2, m0.c(), ((List)this.l().b.b().D));
                n n0 = this.D;
                if(n0 != null) {
                    String s2 = a.H("LOC_NO_SAVED_MAPS", new Object[0]);
                    ((TextView)n0.j).setText(s2);
                    O o0 = new O(this, 1);
                    b b0 = this.C;
                    if(b0 != null) {
                        b0.a.registerObserver(o0);
                        n n1 = this.D;
                        if(n1 != null) {
                            LinearLayoutManager linearLayoutManager0 = new LinearLayoutManager();
                            ((RecyclerView)n1.k).setLayoutManager(linearLayoutManager0);
                            n n2 = this.D;
                            if(n2 != null) {
                                b b1 = this.C;
                                if(b1 != null) {
                                    ((RecyclerView)n2.k).setAdapter(b1);
                                    n n3 = this.D;
                                    if(n3 != null) {
                                        RecyclerView recyclerView1 = (RecyclerView)n3.k;
                                        recyclerView1.f(new D(this, recyclerView1, this));
                                        this.n();
                                        return;
                                    }
                                    J2.j.l("binding");
                                    throw null;
                                }
                                J2.j.l("adapter");
                                throw null;
                            }
                            J2.j.l("binding");
                            throw null;
                        }
                        J2.j.l("binding");
                        throw null;
                    }
                    J2.j.l("adapter");
                    throw null;
                }
                J2.j.l("binding");
                throw null;
            }
        }
        throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(v));
    }
}

