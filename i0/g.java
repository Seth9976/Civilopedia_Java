package i0;

import Y.b;
import Y.m;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.List;

public abstract class g {
    public static final String a;

    static {
        g.a = "WM-ProcessUtils";
    }

    public static boolean a(Context context0, b b0) {
        String s;
        if(Build.VERSION.SDK_INT >= 28) {
            s = Application.getProcessName();
        }
        else {
            try {
                Method method0 = Class.forName("android.app.ActivityThread", false, g.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                method0.setAccessible(true);
                Object object0 = method0.invoke(null, null);
                if(object0 instanceof String) {
                    s = (String)object0;
                }
                else {
                    goto label_11;
                }
                goto label_23;
            }
            catch(Throwable throwable0) {
                m.d().a("WM-ProcessUtils", "Unable to check ActivityThread for processName", new Throwable[]{throwable0});
            }
        label_11:
            s = null;
            int v = Process.myPid();
            ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
            if(activityManager0 != null) {
                List list0 = activityManager0.getRunningAppProcesses();
                if(list0 != null && !list0.isEmpty()) {
                    for(Object object1: list0) {
                        ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object1;
                        if(activityManager$RunningAppProcessInfo0.pid == v) {
                            s = activityManager$RunningAppProcessInfo0.processName;
                            break;
                        }
                    }
                }
            }
        }
    label_23:
        b0.getClass();
        return TextUtils.isEmpty(null) ? TextUtils.equals(s, context0.getApplicationInfo().processName) : TextUtils.equals(s, null);
    }
}

