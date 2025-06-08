package i0;

import android.content.Context;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import java.util.WeakHashMap;

public abstract class j {
    public static final String a;
    public static final WeakHashMap b;

    static {
        j.a = "WM-WakeLocks";
        j.b = new WeakHashMap();
    }

    public static PowerManager.WakeLock a(Context context0, String s) {
        PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)context0.getApplicationContext().getSystemService("power")).newWakeLock(1, "WorkManager: " + s);
        synchronized(j.b) {
            j.b.put(powerManager$WakeLock0, "WorkManager: " + s);
            return powerManager$WakeLock0;
        }
    }
}

