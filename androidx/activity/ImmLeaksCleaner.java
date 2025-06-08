package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import java.lang.reflect.Field;

final class ImmLeaksCleaner implements l {
    public e i;
    public static int j;
    public static Field k;
    public static Field l;
    public static Field m;

    @Override  // androidx.lifecycle.l
    public final void a(n n0, g g0) {
        Object object0;
        if(g0 != g.ON_DESTROY) {
            return;
        }
        if(ImmLeaksCleaner.j == 0) {
            try {
                ImmLeaksCleaner.j = 2;
                Field field0 = InputMethodManager.class.getDeclaredField("mServedView");
                ImmLeaksCleaner.l = field0;
                field0.setAccessible(true);
                Field field1 = InputMethodManager.class.getDeclaredField("mNextServedView");
                ImmLeaksCleaner.m = field1;
                field1.setAccessible(true);
                Field field2 = InputMethodManager.class.getDeclaredField("mH");
                ImmLeaksCleaner.k = field2;
                field2.setAccessible(true);
                ImmLeaksCleaner.j = 1;
            }
            catch(NoSuchFieldException unused_ex) {
            }
        }
        if(ImmLeaksCleaner.j == 1) {
            InputMethodManager inputMethodManager0 = (InputMethodManager)this.i.getSystemService("input_method");
            try {
                object0 = ImmLeaksCleaner.k.get(inputMethodManager0);
                if(object0 == null) {
                    return;
                }
            }
            catch(IllegalAccessException unused_ex) {
                return;
            }
            synchronized(object0) {
                try {
                    View view0 = (View)ImmLeaksCleaner.l.get(inputMethodManager0);
                }
                catch(IllegalAccessException unused_ex) {
                    return;
                }
                catch(ClassCastException unused_ex) {
                    return;
                }
            }
            if(view0 == null) {
                return;
            }
            if(view0.isAttachedToWindow()) {
                return;
            }
            try {
                ImmLeaksCleaner.m.set(inputMethodManager0, null);
            }
            catch(IllegalAccessException unused_ex) {
                return;
            }
            inputMethodManager0.isActive();
        }
    }
}

