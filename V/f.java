package v;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public abstract class f {
    public static ComponentName a(Context context0, Intent intent0) {
        return context0.startForegroundService(intent0);
    }
}

