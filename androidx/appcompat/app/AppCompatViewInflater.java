package androidx.appcompat.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import p.b;

public class AppCompatViewInflater {
    public final Object[] a;
    public static final Class[] b;
    public static final int[] c;
    public static final String[] d;
    public static final b e;

    static {
        AppCompatViewInflater.b = new Class[]{Context.class, AttributeSet.class};
        AppCompatViewInflater.c = new int[]{0x101026F};
        AppCompatViewInflater.d = new String[]{"android.widget.", "android.view.", "android.webkit."};
        AppCompatViewInflater.e = new b();  // 初始化器: Lp/k;-><init>()V
    }

    public AppCompatViewInflater() {
        this.a = new Object[2];
    }

    public final View a(Context context0, String s, String s1) {
        b b0 = AppCompatViewInflater.e;
        Constructor constructor0 = (Constructor)b0.getOrDefault(s, null);
        try {
            if(constructor0 == null) {
                constructor0 = Class.forName((s1 == null ? s : s1 + s), false, context0.getClassLoader()).asSubclass(View.class).getConstructor(AppCompatViewInflater.b);
                b0.put(s, constructor0);
            }
            constructor0.setAccessible(true);
            return (View)constructor0.newInstance(this.a);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }
}

