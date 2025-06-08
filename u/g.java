package u;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

public final class g {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    public g(int v, String s, PendingIntent pendingIntent0) {
        int v3;
        IconCompat iconCompat0 = v == 0 ? null : IconCompat.a(v);
        Bundle bundle0 = new Bundle();
        super();
        this.d = true;
        this.b = iconCompat0;
        if(iconCompat0 != null) {
            int v1 = iconCompat0.a;
            if(v1 == -1) {
                int v2 = Build.VERSION.SDK_INT;
                if(v2 >= 23) {
                    Icon icon0 = (Icon)iconCompat0.b;
                    if(v2 >= 28) {
                        v3 = icon0.getType();
                    }
                    else {
                        try {
                            v3 = (int)(((Integer)icon0.getClass().getMethod("getType", null).invoke(icon0, null)));
                            goto label_26;
                        }
                        catch(IllegalAccessException illegalAccessException0) {
                            Log.e("IconCompat", "Unable to get icon type " + icon0, illegalAccessException0);
                        }
                        catch(InvocationTargetException invocationTargetException0) {
                            Log.e("IconCompat", "Unable to get icon type " + icon0, invocationTargetException0);
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            Log.e("IconCompat", "Unable to get icon type " + icon0, noSuchMethodException0);
                        }
                        v1 = -1;
                        goto label_27;
                    }
                label_26:
                    v1 = v3;
                }
            }
        label_27:
            if(v1 == 2) {
                this.e = iconCompat0.b();
            }
        }
        this.f = h.b(s);
        this.g = pendingIntent0;
        this.a = bundle0;
        this.c = true;
        this.d = true;
    }
}

