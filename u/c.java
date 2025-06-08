package u;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import i3.e;
import java.util.Arrays;
import v.j;

public abstract class c extends j {
    public static void a(Activity activity0, String[] arr_s, int v) {
        for(int v1 = 0; v1 < arr_s.length; ++v1) {
            if(TextUtils.isEmpty(arr_s[v1])) {
                throw new IllegalArgumentException(e.h(new StringBuilder("Permission request for permissions "), Arrays.toString(arr_s), " must not contain null or empty values"));
            }
        }
        if(Build.VERSION.SDK_INT >= 23) {
            if(activity0 instanceof b && !((androidx.fragment.app.j)(((b)activity0))).v && v != -1) {
                androidx.fragment.app.j.f(v);
            }
            activity0.requestPermissions(arr_s, v);
            return;
        }
        if(activity0 instanceof a) {
            new Handler(Looper.getMainLooper()).post(new androidx.activity.b(arr_s, activity0, v, 3));
        }
    }
}

