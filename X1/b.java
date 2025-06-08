package x1;

import android.os.Process;

public abstract class b implements Runnable {
    public abstract void a();

    @Override
    public final void run() {
        Process.setThreadPriority(10);
        this.a();
    }
}

