package E;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import java.util.List;

public abstract class l {
    public static ApplicationExitInfo d(Object object0) [...] // Inlined contents

    public static List l(ActivityManager activityManager0) {
        return activityManager0.getHistoricalProcessExitReasons(null, 0, 0);
    }
}

