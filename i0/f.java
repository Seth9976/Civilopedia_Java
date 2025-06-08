package i0;

import Y.m;
import android.content.ComponentName;
import android.content.Context;

public abstract class f {
    public static final String a;

    static {
        f.a = "WM-PackageManagerHelper";
    }

    public static void a(Context context0, Class class0, boolean z) {
        String s = "disabled";
        try {
            context0.getPackageManager().setComponentEnabledSetting(new ComponentName(context0, class0.getName()), (z ? 1 : 2), 1);
            m.d().a("WM-PackageManagerHelper", class0.getName() + " " + (z ? "enabled" : "disabled"), new Throwable[0]);
        }
        catch(Exception exception0) {
            m m0 = m.d();
            String s1 = class0.getName();
            if(z) {
                s = "enabled";
            }
            m0.a("WM-PackageManagerHelper", A.f.i(s1, " could not be ", s), new Throwable[]{exception0});
        }
    }
}

