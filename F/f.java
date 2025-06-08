package f;

import L.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController.RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public final class f {
    public final Context a;
    public final g b;
    public final Window c;
    public CharSequence d;
    public AlertController.RecycleListView e;
    public Button f;
    public Button g;
    public Button h;
    public NestedScrollView i;
    public Drawable j;
    public ImageView k;
    public TextView l;
    public TextView m;
    public View n;
    public ListAdapter o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final a v;
    public final f.a w;

    public f(Context context0, g g0, Window window0) {
        this.p = -1;
        this.w = new f.a(this, 0);
        this.a = context0;
        this.b = g0;
        this.c = window0;
        a a0 = new a();
        a0.b = new WeakReference(g0);
        this.v = a0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, e.a.e, 0x7F020027, 0);  // attr:alertDialogStyle
        this.q = typedArray0.getResourceId(0, 0);
        typedArray0.getResourceId(2, 0);
        this.r = typedArray0.getResourceId(4, 0);
        typedArray0.getResourceId(5, 0);
        this.s = typedArray0.getResourceId(7, 0);
        this.t = typedArray0.getResourceId(3, 0);
        this.u = typedArray0.getBoolean(6, true);
        typedArray0.getDimensionPixelSize(1, 0);
        typedArray0.recycle();
        g0.a().f(1);
    }

    public static void a(View view0, View view1, View view2) {
        int v = 4;
        if(view1 != null) {
            view1.setVisibility((view0.canScrollVertically(-1) ? 0 : 4));
        }
        if(view2 != null) {
            if(view0.canScrollVertically(1)) {
                v = 0;
            }
            view2.setVisibility(v);
        }
    }

    public static ViewGroup b(View view0, View view1) {
        if(view0 == null) {
            if(view1 instanceof ViewStub) {
                view1 = ((ViewStub)view1).inflate();
            }
            return (ViewGroup)view1;
        }
        if(view1 != null) {
            ViewParent viewParent0 = view1.getParent();
            if(viewParent0 instanceof ViewGroup) {
                ((ViewGroup)viewParent0).removeView(view1);
            }
        }
        if(view0 instanceof ViewStub) {
            view0 = ((ViewStub)view0).inflate();
        }
        return (ViewGroup)view0;
    }
}

