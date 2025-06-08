package v;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.util.concurrent.Executor;
import jeb.synthetic.FIN;
import l.O;
import w.a;
import w.f;
import w.g;

public abstract class j {
    public static final Object a;
    public static final Object b;

    static {
    }

    public static int checkSelfPermission(Context context0, String s) {
        if(s == null) {
            throw new IllegalArgumentException("permission is null");
        }
        return context0.checkPermission(s, Process.myPid(), Process.myUid());
    }

    public static Context createDeviceProtectedStorageContext(Context context0) {
        return Build.VERSION.SDK_INT < 24 ? null : e.a(context0);
    }

    public static String getAttributionTag(Context context0) {
        return Build.VERSION.SDK_INT < 30 ? null : h.a(context0);
    }

    public static File getCodeCacheDir(Context context0) {
        return c.a(context0);
    }

    public static int getColor(Context context0, int v) {
        return Build.VERSION.SDK_INT < 23 ? context0.getResources().getColor(v) : d.a(context0, v);
    }

    public static ColorStateList getColorStateList(Context context0, int v) {
        ColorStateList colorStateList1;
        ColorStateList colorStateList0;
        Resources resources0 = context0.getResources();
        Resources.Theme resources$Theme0 = context0.getTheme();
        if(Build.VERSION.SDK_INT >= 23) {
            return O.e(resources0, v, resources$Theme0);
        }
        g g0 = new g(resources0, resources$Theme0);
        Object object0 = w.h.c;
        __monitor_enter(object0);
        int v1 = FIN.finallyOpen$NT();
        SparseArray sparseArray0 = (SparseArray)w.h.b.get(g0);
        if(sparseArray0 == null || sparseArray0.size() <= 0) {
        label_18:
            FIN.finallyCodeBegin$NT(v1);
            __monitor_exit(object0);
            FIN.finallyCodeEnd$NT(v1);
            colorStateList0 = null;
        }
        else {
            f f0 = (f)sparseArray0.get(v);
            if(f0 == null) {
                goto label_18;
            }
            else {
                Configuration configuration0 = resources0.getConfiguration();
                if(f0.b.equals(configuration0)) {
                    colorStateList0 = f0.a;
                    FIN.finallyExec$NT(v1);
                }
                else {
                    sparseArray0.remove(v);
                    goto label_18;
                }
            }
        }
        if(colorStateList0 != null) {
            return colorStateList0;
        }
        ThreadLocal threadLocal0 = w.h.a;
        TypedValue typedValue0 = (TypedValue)threadLocal0.get();
        if(typedValue0 == null) {
            typedValue0 = new TypedValue();
            threadLocal0.set(typedValue0);
        }
        resources0.getValue(v, typedValue0, true);
        if(typedValue0.type >= 28 && typedValue0.type <= 0x1F) {
            colorStateList1 = null;
        }
        else {
            XmlResourceParser xmlResourceParser0 = resources0.getXml(v);
            try {
                colorStateList1 = a.a(resources0, xmlResourceParser0, resources$Theme0);
            }
            catch(Exception exception0) {
                Log.e("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", exception0);
                colorStateList1 = null;
            }
        }
        if(colorStateList1 != null) {
            w.h.a(g0, v, colorStateList1);
            return colorStateList1;
        }
        return resources0.getColorStateList(v);
    }

    public static File getDataDir(Context context0) {
        if(Build.VERSION.SDK_INT >= 24) {
            return e.b(context0);
        }
        String s = context0.getApplicationInfo().dataDir;
        return s == null ? null : new File(s);
    }

    public static Drawable getDrawable(Context context0, int v) {
        return c.b(context0, v);
    }

    public static File[] getExternalCacheDirs(Context context0) {
        return b.a(context0);
    }

    public static File[] getExternalFilesDirs(Context context0, String s) {
        return b.b(context0, s);
    }

    public static Executor getMainExecutor(Context context0) {
        return Build.VERSION.SDK_INT >= 28 ? v.g.a(context0) : new A.c(new Handler(context0.getMainLooper()), 0);
    }

    public static File getNoBackupFilesDir(Context context0) {
        return c.c(context0);
    }

    public static File[] getObbDirs(Context context0) {
        return b.c(context0);
    }

    public static Object getSystemService(Context context0, Class class0) {
        if(Build.VERSION.SDK_INT >= 23) {
            return d.c(context0, class0);
        }
        String s = j.getSystemServiceName(context0, class0);
        return s == null ? null : context0.getSystemService(s);
    }

    public static String getSystemServiceName(Context context0, Class class0) {
        return Build.VERSION.SDK_INT < 23 ? ((String)i.a.get(class0)) : d.d(context0, class0);
    }

    public static boolean isDeviceProtectedStorage(Context context0) {
        return Build.VERSION.SDK_INT < 24 ? false : e.c(context0);
    }

    public static boolean startActivities(Context context0, Intent[] arr_intent) {
        return j.startActivities(context0, arr_intent, null);
    }

    public static boolean startActivities(Context context0, Intent[] arr_intent, Bundle bundle0) {
        v.a.a(context0, arr_intent, bundle0);
        return true;
    }

    public static void startActivity(Context context0, Intent intent0, Bundle bundle0) {
        v.a.b(context0, intent0, bundle0);
    }

    public static void startForegroundService(Context context0, Intent intent0) {
        if(Build.VERSION.SDK_INT >= 26) {
            v.f.a(context0, intent0);
            return;
        }
        context0.startService(intent0);
    }
}

