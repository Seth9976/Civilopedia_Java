package l1;

import java.util.concurrent.Executor;
import m.a;

public final class h implements Executor {
    public final int i;

    public h(int v) {
        this.i = v;
        super();
    }

    @Override
    public final void execute(Runnable runnable0) {
        if(this.i != 0) {
            a.o0().c.d.execute(runnable0);
            return;
        }
        runnable0.run();
    }
}

