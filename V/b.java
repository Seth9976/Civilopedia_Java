package v;

import android.content.Context;
import java.io.File;

public abstract class b {
    public static File[] a(Context context0) {
        return context0.getExternalCacheDirs();
    }

    public static File[] b(Context context0, String s) {
        return context0.getExternalFilesDirs(s);
    }

    public static File[] c(Context context0) {
        return context0.getObbDirs();
    }
}

