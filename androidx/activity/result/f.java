package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.e;
import androidx.lifecycle.h;
import androidx.lifecycle.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public abstract class f {
    public Random a;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public ArrayList e;
    public final transient HashMap f;
    public final HashMap g;
    public final Bundle h;

    public f() {
        this.a = new Random();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new ArrayList();
        this.f = new HashMap();
        this.g = new HashMap();
        this.h = new Bundle();
    }

    public final boolean a(int v, int v1, Intent intent0) {
        String s = (String)this.b.get(v);
        if(s == null) {
            return false;
        }
        this.e.remove(s);
        d d0 = (d)this.f.get(s);
        if(d0 != null) {
            ActivityResult activityResult0 = new ActivityResult(v1, intent0);
            d0.a.b(activityResult0);
            return true;
        }
        this.g.remove(s);
        ActivityResult activityResult1 = new ActivityResult(v1, intent0);
        this.h.putParcelable(s, activityResult1);
        return true;
    }

    public final c b(String s, e e0, M1.f f0, a a0) {
        int v;
        HashMap hashMap1;
        p p0 = e0.k;
        if(p0.b.compareTo(h.l) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + e0 + " is attempting to register while current state is " + p0.b + ". LifecycleOwners must call register before they are STARTED.");
        }
        HashMap hashMap0 = this.c;
        Integer integer0 = (Integer)hashMap0.get(s);
        if(integer0 == null) {
            int v1;
            for(v1 = this.a.nextInt(0x7FFF0000); true; v1 = this.a.nextInt(0x7FFF0000)) {
                hashMap1 = this.b;
                if(!hashMap1.containsKey(((int)(v1 + 0x10000)))) {
                    break;
                }
            }
            hashMap1.put(((int)(v1 + 0x10000)), s);
            hashMap0.put(s, ((int)(v1 + 0x10000)));
            v = v1 + 0x10000;
        }
        else {
            v = (int)integer0;
        }
        HashMap hashMap2 = this.d;
        androidx.activity.result.e e1 = (androidx.activity.result.e)hashMap2.get(s);
        if(e1 == null) {
            e1 = new androidx.activity.result.e(p0);
        }
        ActivityResultRegistry.1 activityResultRegistry$10 = new ActivityResultRegistry.1(this, s, a0, f0);
        e1.a.a(activityResultRegistry$10);
        e1.b.add(activityResultRegistry$10);
        hashMap2.put(s, e1);
        return new c(this, s, v, f0);
    }
}

