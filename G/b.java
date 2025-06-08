package g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import jeb.synthetic.FIN;
import l.m0;
import v.j;

public abstract class b {
    public static final ThreadLocal a;
    public static final WeakHashMap b;
    public static final Object c;

    static {
        b.a = new ThreadLocal();
        b.b = new WeakHashMap(0);
        b.c = new Object();
    }

    public static void a(Context context0, int v, ColorStateList colorStateList0) {
        synchronized(b.c) {
            WeakHashMap weakHashMap0 = b.b;
            SparseArray sparseArray0 = (SparseArray)weakHashMap0.get(context0);
            if(sparseArray0 == null) {
                sparseArray0 = new SparseArray();
                weakHashMap0.put(context0, sparseArray0);
            }
            sparseArray0.append(v, new a(colorStateList0, context0.getResources().getConfiguration()));
        }
    }

    public static ColorStateList b(Context context0, int v) {
        ColorStateList colorStateList1;
        if(Build.VERSION.SDK_INT >= 23) {
            return context0.getColorStateList(v);
        }
        Object object0 = b.c;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        SparseArray sparseArray0 = (SparseArray)b.b.get(context0);
        ColorStateList colorStateList0 = null;
        if(sparseArray0 == null || sparseArray0.size() <= 0) {
        label_16:
            FIN.finallyCodeBegin$NT(v1);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v1);
            colorStateList1 = null;
        }
        else {
            a a0 = (a)sparseArray0.get(v);
            if(a0 == null) {
                goto label_16;
            }
            else {
                Configuration configuration0 = context0.getResources().getConfiguration();
                if(a0.b.equals(configuration0)) {
                    colorStateList1 = a0.a;
                    FIN.finallyExec$NT(v1);
                }
                else {
                    sparseArray0.remove(v);
                    goto label_16;
                }
            }
        }
        if(colorStateList1 != null) {
            return colorStateList1;
        }
        Resources resources0 = context0.getResources();
        ThreadLocal threadLocal0 = b.a;
        TypedValue typedValue0 = (TypedValue)threadLocal0.get();
        if(typedValue0 == null) {
            typedValue0 = new TypedValue();
            threadLocal0.set(typedValue0);
        }
        resources0.getValue(v, typedValue0, true);
        if(typedValue0.type < 28 || typedValue0.type > 0x1F) {
            Resources resources1 = context0.getResources();
            XmlResourceParser xmlResourceParser0 = resources1.getXml(v);
            try {
                colorStateList0 = w.a.a(resources1, xmlResourceParser0, context0.getTheme());
            }
            catch(Exception exception0) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", exception0);
            }
        }
        if(colorStateList0 != null) {
            b.a(context0, v, colorStateList0);
            return colorStateList0;
        }
        return j.getColorStateList(context0, v);
    }

    public static Drawable c(Context context0, int v) {
        return m0.d().f(context0, v);
    }
}

