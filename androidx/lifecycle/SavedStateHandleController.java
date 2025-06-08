package androidx.lifecycle;

import androidx.savedstate.b;
import androidx.savedstate.c;
import androidx.savedstate.e;
import java.util.HashMap;
import java.util.HashSet;

final class SavedStateHandleController implements l {
    public static final class a implements b {
        public final void a(e e0) {
            Object object1;
            B b0 = ((C)e0).getViewModelStore();
            c c0 = e0.getSavedStateRegistry();
            b0.getClass();
            for(Object object0: new HashSet(b0.a.keySet())) {
                A a0 = (A)b0.a.get(((String)object0));
                i i0 = e0.getLifecycle();
                HashMap hashMap0 = a0.a;
                if(hashMap0 == null) {
                    object1 = null;
                }
                else {
                    synchronized(hashMap0) {
                        object1 = a0.a.get("androidx.lifecycle.savedstate.vm.tag");
                    }
                }
                if(((SavedStateHandleController)object1) != null && !((SavedStateHandleController)object1).i) {
                    ((SavedStateHandleController)object1).i = true;
                    i0.a(((SavedStateHandleController)object1));
                    throw null;
                }
                if(false) {
                    break;
                }
            }
            if(!new HashSet(b0.a.keySet()).isEmpty()) {
                Class class0 = a.class;
                if(!c0.e) {
                    throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
                }
                if(c0.d == null) {
                    c0.d = new androidx.savedstate.a(c0);
                }
                try {
                    class0.getDeclaredConstructor(null);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    throw new IllegalArgumentException("Class" + class0.getSimpleName() + " must have default constructor in order to be automatically recreated", noSuchMethodException0);
                }
                c0.d.a.add(class0.getName());
            }
        }
    }

    public boolean i;

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        if(g0 == g.ON_DESTROY) {
            this.i = false;
            n0.getLifecycle().b(this);
        }
    }
}

