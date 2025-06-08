package D;

import android.util.Log;
import java.io.Writer;

public final class a extends Writer {
    public final String i;
    public final StringBuilder j;

    public a() {
        this.j = new StringBuilder(0x80);
        this.i = "FragmentManager";
    }

    public final void a() {
        StringBuilder stringBuilder0 = this.j;
        if(stringBuilder0.length() > 0) {
            Log.d(this.i, stringBuilder0.toString());
            stringBuilder0.delete(0, stringBuilder0.length());
        }
    }

    @Override
    public final void close() {
        this.a();
    }

    @Override
    public final void flush() {
        this.a();
    }

    @Override
    public final void write(char[] arr_c, int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = arr_c[v + v2];
            if(v3 == 10) {
                this.a();
            }
            else {
                this.j.append(((char)v3));
            }
        }
    }
}

