package com.spears.civilopedia.planning;

import R2.q;
import android.os.Bundle;
import android.support.v4.media.session.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import f2.C;
import f2.D;
import f2.G;
import f2.j;
import java.util.List;
import kotlin.Metadata;
import n2.A;
import n2.m;
import z1.a0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/spears/civilopedia/planning/LeaderListActivity;", "Lf2/j;", "Lf2/C;", "<init>", "()V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class LeaderListActivity extends j implements C {
    @Override  // f2.C
    public final void m(int v) {
        a.k(this, new q(v, 1, this)).show();
    }

    @Override  // f.h
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        View view0 = this.getLayoutInflater().inflate(0x7F0A001E, null, false);  // layout:activity_leader_list
        RecyclerView recyclerView0 = (RecyclerView)a0.r(view0, 0x7F0700A6);  // id:listView
        if(recyclerView0 == null) {
            throw new NullPointerException("Missing required view with ID: " + view0.getResources().getResourceName(0x7F0700A6));  // id:listView
        }
        this.setContentView(((LinearLayout)view0));
        this.setTitle(a.H("LOC_SETUP_CIVILIZATION", new Object[0]));
        A a0 = this.k().b();
        recyclerView0.getContext();
        recyclerView0.setLayoutManager(new LinearLayoutManager());
        recyclerView0.setAdapter(new G(((m)a0.f).c(), ((List)this.l().b.b().D)));
        recyclerView0.f(new D(recyclerView0.getContext(), recyclerView0, this));
    }
}

