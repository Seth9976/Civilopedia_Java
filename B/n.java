package B;

import java.util.concurrent.ThreadFactory;

public final class n implements ThreadFactory {
    @Override
    public final Thread newThread(Runnable runnable0) {
        return new m(runnable0);
    }
}

