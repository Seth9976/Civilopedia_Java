package c0;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

public final class c {
    public final ComponentName a;
    public static final String b;

    static {
        c.b = "WM-SystemJobInfoConvert";
    }

    public c(Context context0) {
        this.a = new ComponentName(context0.getApplicationContext(), SystemJobService.class);
    }
}

