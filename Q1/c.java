package q1;

import java.util.concurrent.Executor;

public final class c implements Executor {
    public static final c i;

    static {
        c.i = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override
    public final void execute(Runnable runnable0) {
        runnable0.run();
    }
}

