package u;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

public final class i {
    public final Context a;
    public final NotificationManager b;

    static {
        new HashSet();
    }

    public i(Context context0) {
        this.a = context0;
        this.b = (NotificationManager)context0.getSystemService("notification");
    }

    public final boolean a() {
        if(Build.VERSION.SDK_INT >= 24) {
            return this.b.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager0 = (AppOpsManager)this.a.getSystemService("appops");
        int v = this.a.getApplicationInfo().uid;
        try {
            Method method0 = AppOpsManager.class.getMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
            Integer integer0 = (Integer)AppOpsManager.class.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            integer0.getClass();
            return ((int)(((Integer)method0.invoke(appOpsManager0, integer0, v, "com.spears.civilopedia")))) == 0;
        }
        catch(ClassNotFoundException | NoSuchMethodException | NoSuchFieldException | InvocationTargetException | IllegalAccessException | RuntimeException unused_ex) {
            return true;
        }
    }
}

