package A;

import android.os.Handler;
import android.os.Looper;

public abstract class d {
    public static Handler a(Looper looper0) {
        return Handler.createAsync(looper0);
    }
}

