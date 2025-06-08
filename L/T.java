package l;

import C1.d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;

public final class t {
    public m0 a;
    public static final PorterDuff.Mode b;
    public static t c;

    static {
        t.b = PorterDuff.Mode.SRC_IN;
    }

    public static t a() {
        synchronized(t.class) {
            if(t.c == null) {
                t.c();
            }
            return t.c;
        }
    }

    public final Drawable b(Context context0, int v) {
        synchronized(this) {
            return this.a.f(context0, v);
        }
    }

    public static void c() {
        synchronized(t.class) {
            if(t.c == null) {
                t t0 = new t();  // 初始化器: Ljava/lang/Object;-><init>()V
                t.c = t0;
                t0.a = m0.d();
                m0 m00 = t.c.a;
                d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
                d0.i = new int[]{0x7F060054, 0x7F060052, 0x7F060001};
                d0.j = new int[]{0x7F060019, 0x7F060042, 0x7F060020, 0x7F06001B, 0x7F06001C, 0x7F06001F, 0x7F06001E};  // drawable:abc_seekbar_tick_mark_material
                d0.k = new int[]{0x7F060051, 0x7F060053, 0x7F060012, 0x7F06004A, 0x7F06004B, 0x7F06004D, 0x7F06004F, 0x7F06004C, 0x7F06004E, 0x7F060050};  // drawable:abc_text_cursor_material
                d0.l = new int[]{0x7F060038, 0x7F060010, 0x7F060037};  // drawable:abc_cab_background_internal_bg
                d0.m = new int[]{0x7F060048, 0x7F060055};  // drawable:abc_tab_indicator_material
                d0.n = new int[]{0x7F060004, 0x7F06000A, 0x7F060005, 0x7F06000B};  // drawable:abc_btn_check_material
                m00.l(d0);
            }
        }
    }

    public static void d(Drawable drawable0, C0 c00, int[] arr_v) {
        if(W.a(drawable0) && drawable0.mutate() != drawable0) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        ColorFilter colorFilter0 = null;
        boolean z = c00.d;
        if(z || c00.c) {
            ColorStateList colorStateList0 = z ? c00.a : null;
            PorterDuff.Mode porterDuff$Mode0 = c00.c ? c00.b : m0.h;
            if(colorStateList0 != null && porterDuff$Mode0 != null) {
                colorFilter0 = m0.h(colorStateList0.getColorForState(arr_v, 0), porterDuff$Mode0);
            }
            drawable0.setColorFilter(colorFilter0);
        }
        else {
            drawable0.clearColorFilter();
        }
        if(Build.VERSION.SDK_INT <= 23) {
            drawable0.invalidateSelf();
        }
    }
}

