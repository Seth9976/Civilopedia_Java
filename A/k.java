package A;

import android.app.NotificationManager;
import android.content.Context;
import android.os.UserManager;
import android.view.ViewGroup;

public abstract class k {
    public static Object i(Context context0) {
        return context0.getSystemService(UserManager.class);
    }

    public static void m(ViewGroup viewGroup0, int v) {
        viewGroup0.setScrollIndicators(v, 3);
    }

    public static Object x(Context context0) {
        return context0.getSystemService(NotificationManager.class);
    }
}

