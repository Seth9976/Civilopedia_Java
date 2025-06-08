package x;

import android.graphics.Color;

public abstract class a {
    public static final int a;

    static {
        new ThreadLocal();
    }

    public static int a(int v, int v1) {
        int v2 = Color.alpha(v1);
        int v3 = Color.alpha(v);
        int v4 = 0xFF - (0xFF - v3) * (0xFF - v2) / 0xFF;
        return Color.argb(v4, a.b(Color.red(v), v3, Color.red(v1), v2, v4), a.b(Color.green(v), v3, Color.green(v1), v2, v4), a.b(Color.blue(v), v3, Color.blue(v1), v2, v4));
    }

    public static int b(int v, int v1, int v2, int v3, int v4) {
        return v4 == 0 ? 0 : ((0xFF - v1) * (v2 * v3) + v * 0xFF * v1) / (v4 * 0xFF);
    }
}

