package v;

import android.content.Context;
import java.io.File;

public abstract class e {
    public static Context a(Context context0) {
        return context0.createDeviceProtectedStorageContext();
    }

    public static File b(Context context0) {
        return context0.getDataDir();
    }

    public static boolean c(Context context0) {
        return context0.isDeviceProtectedStorage();
    }
}

