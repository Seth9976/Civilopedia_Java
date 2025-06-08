package u1;

import android.util.Log;

public final class c {
    public static final c a;

    static {
        c.a = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public boolean a(int v) {
        return 4 <= v || Log.isLoggable("FirebaseCrashlytics", v);
    }

    public void b(String s) {
        if(this.a(3)) {
            Log.d("FirebaseCrashlytics", s, null);
        }
    }

    public void c(String s) {
        if(this.a(2)) {
            Log.v("FirebaseCrashlytics", s, null);
        }
    }

    public void d(String s, Exception exception0) {
        if(this.a(5)) {
            Log.w("FirebaseCrashlytics", s, exception0);
        }
    }
}

