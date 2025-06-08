package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.n;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.Map.Entry;
import n.f;

public final class d {
    public final Object a;
    public final c b;

    public d(e e0) {
        this.a = e0;
        c c0 = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
        c0.a = new f();
        c0.e = true;
        this.b = c0;
    }

    public final void a(Bundle bundle0) {
        Object object0 = this.a;
        i i0 = ((n)object0).getLifecycle();
        if(((p)i0).b != h.j) {
            throw new IllegalStateException("Restarter must be created only during owner\'s initialization stage");
        }
        i0.a(new Recreator(((e)object0)));
        c c0 = this.b;
        if(c0.c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if(bundle0 != null) {
            c0.b = bundle0.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        i0.a(new SavedStateRegistry.1(c0));
        c0.c = true;
    }

    public final void b(Bundle bundle0) {
        c c0 = this.b;
        c0.getClass();
        Bundle bundle1 = new Bundle();
        Bundle bundle2 = c0.b;
        if(bundle2 != null) {
            bundle1.putAll(bundle2);
        }
        f f0 = c0.a;
        f0.getClass();
        n.d d0 = new n.d(f0);
        f0.k.put(d0, Boolean.FALSE);
        while(d0.hasNext()) {
            Map.Entry map$Entry0 = (Map.Entry)d0.next();
            String s = (String)map$Entry0.getKey();
            a a0 = (a)map$Entry0.getValue();
            a0.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putStringArrayList("classes_to_restore", new ArrayList(a0.a));
            bundle1.putBundle(s, bundle3);
        }
        bundle0.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle1);
    }
}

