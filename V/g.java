package v;

import android.content.Context;
import java.util.concurrent.Executor;

public abstract class g {
    public static Executor a(Context context0) {
        return context0.getMainExecutor();
    }
}

