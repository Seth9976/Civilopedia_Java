package com.spears.civilopedia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spears.civilopedia.pages.PageActivity;
import f2.C;
import f2.D;
import f2.j;
import f2.o;
import f2.x;
import f2.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import o1.a;
import o2.q;
import o2.r;
import o2.t;
import x2.i;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spears/civilopedia/PagesActivity;", "Lf2/j;", "Lf2/C;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class PagesActivity extends j implements C {
    public x B;
    public LinearLayoutManager C;
    public String D;
    public final HashSet E;

    public PagesActivity() {
        this.E = new HashSet();
    }

    @Override  // f2.C
    public final void m(int v) {
        x x0 = this.B;
        if(x0 != null) {
            Object object0 = ((List)x0.b).get(v);
            y y0 = object0 instanceof y ? ((y)object0) : null;
            if(y0 != null) {
                Intent intent0 = new Intent(this, PageActivity.class);
                intent0.putExtra("PageId", y0.a.b);
                intent0.putExtra("SectionId", y0.a.a);
                this.startActivity(intent0);
            }
            x x1 = this.B;
            if(x1 != null) {
                Object object1 = ((List)x1.b).get(v);
                o o0 = object1 instanceof o ? ((o)object1) : null;
                if(o0 != null) {
                    HashSet hashSet0 = this.E;
                    String s = o0.a.b;
                    if(hashSet0.contains(s)) {
                        hashSet0.remove(s);
                    }
                    else {
                        hashSet0.add(s);
                    }
                    this.n();
                    x x2 = this.B;
                    if(x2 != null) {
                        x2.a.a();
                        return;
                    }
                    J2.j.l("viewAdapter");
                    throw null;
                }
                return;
            }
            J2.j.l("viewAdapter");
            throw null;
        }
        J2.j.l("viewAdapter");
        throw null;
    }

    public final void n() {
        ArrayList arrayList0 = new ArrayList();
        HashMap hashMap0 = this.l().b.d().c;
        String s = this.D;
        if(s != null) {
            List list0 = (List)hashMap0.get(s);
            if(list0 != null) {
                int v = 0;
                r r0 = null;
                for(Object object0: list0) {
                    if(v >= 0) {
                        if(v == 0 || !J2.j.a((r0 == null ? null : r0.b), ((q)object0).c)) {
                            r r1 = this.l().b.d().j(((q)object0).a, ((q)object0).c);
                            if(r1 != null) {
                                arrayList0.add(new o(r1));
                                r0 = r1;
                            }
                        }
                        if(!i.M(this.E, ((q)object0).c)) {
                            arrayList0.add(new y(((q)object0)));
                        }
                        ++v;
                        continue;
                    }
                    x2.j.D();
                    throw null;
                }
            }
            x x0 = this.B;
            if(x0 != null) {
                x0.b = arrayList0;
                return;
            }
            J2.j.l("viewAdapter");
            throw null;
        }
        J2.j.l("sectionId");
        throw null;
    }

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.setContentView(0x7F0A0021);  // layout:activity_page_list
        String s = this.getIntent().getStringExtra("SectionId");
        J2.j.c(s);
        this.D = s;
        for(Object object0: this.l().b.d().a) {
            t t0 = (t)object0;
            String s1 = t0.a;
            String s2 = this.D;
            if(s2 != null) {
                if(!J2.j.a(s1, s2)) {
                    continue;
                }
                this.setTitle(a.B(t0.b));
                this.C = new LinearLayoutManager();
                x x0 = new x();  // 初始化器: LN/z;-><init>()V
                x0.b = x2.r.i;
                this.B = x0;
                this.n();
                View view0 = this.findViewById(0x7F0700A3);  // id:list
                ((RecyclerView)view0).setHasFixedSize(true);
                LinearLayoutManager linearLayoutManager0 = this.C;
                if(linearLayoutManager0 != null) {
                    ((RecyclerView)view0).setLayoutManager(linearLayoutManager0);
                    x x1 = this.B;
                    if(x1 != null) {
                        ((RecyclerView)view0).setAdapter(x1);
                        ((RecyclerView)view0).setClickable(true);
                        ((RecyclerView)view0).f(new D(((RecyclerView)view0).getContext(), ((RecyclerView)view0), this));
                        J2.j.e(view0, "apply(...)");
                        RecyclerView recyclerView0 = (RecyclerView)view0;
                        return;
                    }
                    J2.j.l("viewAdapter");
                    throw null;
                }
                J2.j.l("viewManager");
                throw null;
            }
            J2.j.l("sectionId");
            throw null;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}

