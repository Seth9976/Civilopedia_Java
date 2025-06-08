package androidx.activity.result;

import M1.f;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.util.ArrayList;
import java.util.HashMap;

class ActivityResultRegistry.1 implements l {
    public final String i;
    public final a j;
    public final f k;
    public final androidx.activity.result.f l;

    public ActivityResultRegistry.1(androidx.activity.result.f f0, String s, a a0, f f1) {
        this.l = f0;
        this.i = s;
        this.j = a0;
        this.k = f1;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        boolean z = g.ON_START.equals(g0);
        String s = this.i;
        androidx.activity.result.f f0 = this.l;
        if(z) {
            a a0 = this.j;
            d d0 = new d(a0, this.k);
            f0.f.put(s, d0);
            HashMap hashMap0 = f0.g;
            if(hashMap0.containsKey(s)) {
                Object object0 = hashMap0.get(s);
                hashMap0.remove(s);
                a0.b(object0);
            }
            Bundle bundle0 = f0.h;
            ActivityResult activityResult0 = (ActivityResult)bundle0.getParcelable(s);
            if(activityResult0 != null) {
                bundle0.remove(s);
                a0.b(new ActivityResult(activityResult0.i, activityResult0.j));
            }
        }
        else {
            if(g.ON_STOP.equals(g0)) {
                f0.f.remove(s);
                return;
            }
            if(g.ON_DESTROY.equals(g0)) {
                if(!f0.e.contains(s)) {
                    Integer integer0 = (Integer)f0.c.remove(s);
                    if(integer0 != null) {
                        f0.b.remove(integer0);
                    }
                }
                f0.f.remove(s);
                HashMap hashMap1 = f0.g;
                if(hashMap1.containsKey(s)) {
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + hashMap1.get(s));
                    hashMap1.remove(s);
                }
                Bundle bundle1 = f0.h;
                if(bundle1.containsKey(s)) {
                    Log.w("ActivityResultRegistry", "Dropping pending result for request " + s + ": " + bundle1.getParcelable(s));
                    bundle1.remove(s);
                }
                HashMap hashMap2 = f0.d;
                e e0 = (e)hashMap2.get(s);
                if(e0 != null) {
                    ArrayList arrayList0 = e0.b;
                    for(Object object1: arrayList0) {
                        e0.a.b(((l)object1));
                    }
                    arrayList0.clear();
                    hashMap2.remove(s);
                }
            }
        }
    }
}

