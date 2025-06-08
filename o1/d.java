package o1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class d implements Executor {
    public static final Handler i;

    static {
        d.i = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void execute(Runnable runnable0) {
        d.i.post(runnable0);
    }
}

