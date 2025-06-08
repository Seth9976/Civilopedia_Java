package androidx.activity;

import D3.b;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Trace;
import android.support.v4.media.session.a;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import androidx.lifecycle.y;
import androidx.savedstate.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import u.f;

public abstract class e extends f implements h, C, androidx.savedstate.e {
    public final b j;
    public final p k;
    public final d l;
    public B m;
    public final g n;
    public final AtomicInteger o;
    public final c p;

    public e() {
        this.i = new p(this);
        this.j = new b(13);
        p p0 = new p(this);
        this.k = p0;
        this.l = new d(this);
        this.n = new g(new B.b(this, 15));
        this.o = new AtomicInteger();
        this.p = new c(this);
        int v = Build.VERSION.SDK_INT;
        p0.a(new ComponentActivity.3(this));
        p0.a(new ComponentActivity.4(this));
        p0.a(new ComponentActivity.5(this));
        if(v <= 23) {
            ImmLeaksCleaner immLeaksCleaner0 = new ImmLeaksCleaner();  // 初始化器: Ljava/lang/Object;-><init>()V
            immLeaksCleaner0.i = this;
            p0.a(immLeaksCleaner0);
        }
    }

    @Override  // android.app.Activity
    public void addContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.d();
        super.addContentView(view0, viewGroup$LayoutParams0);
    }

    public final void d() {
        this.getWindow().getDecorView().setTag(0x7F070124, this);  // id:view_tree_lifecycle_owner
        this.getWindow().getDecorView().setTag(0x7F070126, this);  // id:view_tree_view_model_store_owner
        this.getWindow().getDecorView().setTag(0x7F070125, this);  // id:view_tree_saved_state_registry_owner
    }

    @Override  // androidx.lifecycle.n
    public final i getLifecycle() {
        return this.k;
    }

    @Override  // androidx.savedstate.e
    public final androidx.savedstate.c getSavedStateRegistry() {
        return this.l.b;
    }

    @Override  // androidx.lifecycle.C
    public final B getViewModelStore() {
        if(this.getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can\'t request ViewModel before onCreate call.");
        }
        if(this.m == null) {
            androidx.activity.d d0 = (androidx.activity.d)this.getLastNonConfigurationInstance();
            if(d0 != null) {
                this.m = d0.a;
            }
            if(this.m == null) {
                this.m = new B();
            }
        }
        return this.m;
    }

    @Override  // android.app.Activity
    public void onActivityResult(int v, int v1, Intent intent0) {
        if(!this.p.a(v, v1, intent0)) {
            super.onActivityResult(v, v1, intent0);
        }
    }

    @Override  // android.app.Activity
    public void onBackPressed() {
        this.n.b();
    }

    @Override  // u.f
    public void onCreate(Bundle bundle0) {
        this.l.a(bundle0);
        Iterator iterator0 = ((CopyOnWriteArraySet)this.j.j).iterator();
        if(!iterator0.hasNext()) {
            super.onCreate(bundle0);
            c c0 = this.p;
            c0.getClass();
            if(bundle0 != null) {
                ArrayList arrayList0 = bundle0.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                ArrayList arrayList1 = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                if(arrayList1 != null && arrayList0 != null) {
                    int v = arrayList1.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        Integer integer0 = (Integer)arrayList0.get(v1);
                        integer0.intValue();
                        String s = (String)arrayList1.get(v1);
                        c0.b.put(integer0, s);
                        c0.c.put(s, integer0);
                    }
                    c0.e = bundle0.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    c0.a = (Random)bundle0.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                    Bundle bundle1 = bundle0.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    c0.h.putAll(bundle1);
                }
            }
            y.c(this);
            return;
        }
        Object object0 = iterator0.next();
        object0.getClass();
        throw new ClassCastException();
    }

    @Override  // android.app.Activity
    public void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        Intent intent0 = new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", arr_s).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", arr_v);
        if(!this.p.a(v, -1, intent0) && Build.VERSION.SDK_INT >= 23) {
            super.onRequestPermissionsResult(v, arr_s, arr_v);
        }
    }

    @Override  // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        B b0 = this.m;
        if(b0 == null) {
            androidx.activity.d d0 = (androidx.activity.d)this.getLastNonConfigurationInstance();
            if(d0 != null) {
                b0 = d0.a;
            }
        }
        if(b0 == null) {
            return null;
        }
        androidx.activity.d d1 = new androidx.activity.d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d1.a = b0;
        return d1;
    }

    @Override  // u.f
    public void onSaveInstanceState(Bundle bundle0) {
        p p0 = this.k;
        if(p0 instanceof p) {
            p0.d("setCurrentState");
            p0.f(androidx.lifecycle.h.k);
        }
        super.onSaveInstanceState(bundle0);
        this.l.b(bundle0);
        this.p.getClass();
        bundle0.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.p.b.keySet()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.p.b.values()));
        bundle0.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.p.e));
        bundle0.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", ((Bundle)this.p.h.clone()));
        bundle0.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.p.a);
    }

    @Override  // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if(a.E()) {
                Trace.beginSection(("reportFullyDrawn() for " + this.getComponentName()));
            }
            super.reportFullyDrawn();
        }
        finally {
            Trace.endSection();
        }
    }

    @Override  // android.app.Activity
    public void setContentView(int v) {
        this.d();
        super.setContentView(v);
    }

    @Override  // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view0) {
        this.d();
        super.setContentView(view0);
    }

    @Override  // android.app.Activity
    public void setContentView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.d();
        super.setContentView(view0, viewGroup$LayoutParams0);
    }
}

