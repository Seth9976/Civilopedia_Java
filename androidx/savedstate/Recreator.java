package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController.a;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

@SuppressLint({"RestrictedApi"})
final class Recreator implements l {
    public final Object i;

    public Recreator(e e0) {
        this.i = e0;
    }

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        b b0;
        Constructor constructor0;
        Class class0;
        Bundle bundle1;
        if(g0 != g.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        n0.getLifecycle().b(this);
        Object object0 = this.i;
        c c0 = ((e)object0).getSavedStateRegistry();
        if(!c0.c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle0 = c0.b;
        if(bundle0 == null) {
            bundle1 = null;
        }
        else {
            bundle1 = bundle0.getBundle("androidx.savedstate.Restarter");
            c0.b.remove("androidx.savedstate.Restarter");
            if(c0.b.isEmpty()) {
                c0.b = null;
            }
        }
        if(bundle1 == null) {
            return;
        }
        ArrayList arrayList0 = bundle1.getStringArrayList("classes_to_restore");
        if(arrayList0 == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for(Object object1: arrayList0) {
            String s = (String)object1;
            try {
                class0 = Class.forName(s, false, Recreator.class.getClassLoader()).asSubclass(b.class);
            }
            catch(ClassNotFoundException classNotFoundException0) {
                throw new RuntimeException(i3.e.f("Class ", s, " wasn\'t found"), classNotFoundException0);
            }
            try {
                constructor0 = class0.getDeclaredConstructor(null);
            }
            catch(NoSuchMethodException noSuchMethodException0) {
                throw new IllegalStateException("Class" + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
            }
            constructor0.setAccessible(true);
            try {
                b0 = (b)constructor0.newInstance(null);
            }
            catch(Exception exception0) {
                throw new RuntimeException("Failed to instantiate " + s, exception0);
            }
            ((a)b0).a(((e)object0));
        }
    }
}

