package A;

import android.os.Build.VERSION;
import java.util.Locale;

public final class e {
    public final h a;
    public static final int b;

    static {
        Locale[] arr_locale = new Locale[0];
        if(Build.VERSION.SDK_INT >= 24) {
            b.h(arr_locale);
            return;
        }
        new g(arr_locale);
    }

    public e(h h0) {
        this.a = h0;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof e && this.a.equals(((e)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

