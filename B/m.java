package B;

import android.os.Process;

public final class m extends Thread {
    public final int i;

    public m(Runnable runnable0) {
        super(runnable0, "fonts-androidx");
        this.i = 10;
    }

    @Override
    public final void run() {
        Process.setThreadPriority(this.i);
        super.run();
    }
}

