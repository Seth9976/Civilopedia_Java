package v;

import android.content.Context;
import android.content.res.ColorStateList;

public abstract class d {
    public static int a(Context context0, int v) {
        return context0.getColor(v);
    }

    public static ColorStateList b(Context context0, int v) {
        return context0.getColorStateList(v);
    }

    public static Object c(Context context0, Class class0) {
        return context0.getSystemService(class0);
    }

    public static String d(Context context0, Class class0) {
        return context0.getSystemServiceName(class0);
    }
}

