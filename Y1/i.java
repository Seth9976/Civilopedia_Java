package y1;

import B.k;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;
import x1.e;

public final class i implements a {
    public final File i;
    public h j;
    public static final Charset k;

    static {
        i.k = Charset.forName("UTF-8");
    }

    public i(File file0) {
        this.i = file0;
    }

    @Override  // y1.a
    public final void a() {
        e.b(this.j, "There was a problem closing the Crashlytics log file.");
        this.j = null;
    }

    @Override  // y1.a
    public final String b() {
        k k0;
        if(this.i.exists()) {
            this.c();
            h h0 = this.j;
            if(h0 == null) {
                k0 = null;
            }
            else {
                int[] arr_v = {0};
                byte[] arr_b = new byte[h0.l()];
                try {
                    this.j.d(new c(arr_b, arr_v));
                }
                catch(IOException iOException0) {
                    Log.e("FirebaseCrashlytics", "A problem occurred while reading the Crashlytics log file.", iOException0);
                }
                k0 = new k(arr_b, arr_v[0]);
            }
        }
        else {
            k0 = null;
        }
        if(k0 == null) {
            return null;
        }
        int v = k0.i;
        byte[] arr_b1 = new byte[v];
        System.arraycopy(((byte[])k0.j), 0, arr_b1, 0, v);
        return arr_b1 == null ? null : new String(arr_b1, i.k);
    }

    public final void c() {
        File file0 = this.i;
        if(this.j == null) {
            try {
                this.j = new h(file0);
            }
            catch(IOException iOException0) {
                Log.e("FirebaseCrashlytics", "Could not open log file: " + file0, iOException0);
            }
        }
    }

    @Override  // y1.a
    public final void e(String s, long v) {
        this.c();
        if(this.j != null) {
            if(s == null) {
                s = "null";
            }
            try {
                if(s.length() > 0x4000) {
                    s = "..." + s.substring(s.length() - 0x4000);
                }
                this.j.a(String.format(Locale.US, "%d %s%n", v, s.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(i.k));
                while(true) {
                    if(this.j.e() || this.j.l() <= 0x10000) {
                        return;
                    }
                    this.j.i();
                }
            }
            catch(IOException iOException0) {
            }
            Log.e("FirebaseCrashlytics", "There was a problem writing to the Crashlytics log.", iOException0);
        }
    }
}

