package x1;

import android.util.Log;
import i3.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class p extends b {
    public final String i;
    public final ExecutorService j;
    public final TimeUnit k;

    public p(String s, ExecutorService executorService0, TimeUnit timeUnit0) {
        this.i = s;
        this.j = executorService0;
        this.k = timeUnit0;
    }

    @Override  // x1.b
    public final void a() {
        ExecutorService executorService0;
        String s;
        try {
            s = this.i;
            executorService0 = this.j;
            if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Executing shutdown hook for " + s, null);
            }
            executorService0.shutdown();
            if(!executorService0.awaitTermination(2L, this.k)) {
                if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", s + " did not shut down in the allocated time. Requesting immediate shutdown.", null);
                }
                executorService0.shutdownNow();
            }
        }
        catch(InterruptedException unused_ex) {
            String s1 = e.f("Interrupted while waiting for ", s, " to shut down. Requesting immediate shutdown.");
            if(Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", s1, null);
            }
            executorService0.shutdownNow();
        }
    }
}

