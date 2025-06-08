package v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

public abstract class c {
    public static File a(Context context0) {
        return context0.getCodeCacheDir();
    }

    public static Drawable b(Context context0, int v) {
        return context0.getDrawable(v);
    }

    public static File c(Context context0) {
        return context0.getNoBackupFilesDir();
    }
}

