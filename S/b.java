package s;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import r.a;
import r.d;

public abstract class b extends View {
    public int[] i;
    public int j;
    public Context k;
    public a l;

    public final void a(String s) {
        int v;
        if(s == null) {
            return;
        }
        Context context0 = this.k;
        if(context0 == null) {
            return;
        }
        String s1 = s.trim();
        try {
            v = 0;
            v = h.class.getField(s1).getInt(null);
        }
        catch(Exception unused_ex) {
        }
        if(v == 0) {
            v = context0.getResources().getIdentifier(s1, "id", "com.spears.civilopedia");
        }
        if(v == 0 && this.isInEditMode() && this.getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout0 = (ConstraintLayout)this.getParent();
            constraintLayout0.getClass();
            Object object0 = !(s1 instanceof String) || (constraintLayout0.u == null || !constraintLayout0.u.containsKey(s1)) ? null : constraintLayout0.u.get(s1);
            if(object0 != null && object0 instanceof Integer) {
                v = (int)(((Integer)object0));
            }
        }
        if(v != 0) {
            this.setTag(v, null);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + s1 + "\"");
    }

    public final void b(ConstraintLayout constraintLayout0) {
        if(this.isInEditMode()) {
            this.setIds(null);
        }
        a a0 = this.l;
        if(a0 == null) {
            return;
        }
        a0.j0 = 0;
        for(int v = 0; v < this.j; ++v) {
            View view0 = (View)constraintLayout0.i.get(this.i[v]);
            if(view0 != null) {
                a a1 = this.l;
                d d0 = constraintLayout0.c(view0);
                d[] arr_d = a1.i0;
                if(a1.j0 + 1 > arr_d.length) {
                    a1.i0 = (d[])Arrays.copyOf(arr_d, arr_d.length * 2);
                }
                int v1 = a1.j0;
                a1.i0[v1] = d0;
                a1.j0 = v1 + 1;
            }
        }
    }

    public final void c() {
        if(this.l == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
        if(viewGroup$LayoutParams0 instanceof s.d) {
            ((s.d)viewGroup$LayoutParams0).j0 = this.l;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.i, this.j);
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    private void setIds(String s) {
        if(s == null) {
            return;
        }
        int v = 0;
        int v1;
        while((v1 = s.indexOf(44, v)) != -1) {
            this.a(s.substring(v, v1));
            v = v1 + 1;
        }
        this.a(s.substring(v));
    }

    public void setReferencedIds(int[] arr_v) {
        this.j = 0;
        for(int v = 0; v < arr_v.length; ++v) {
            this.setTag(arr_v[v], null);
        }
    }

    @Override  // android.view.View
    public final void setTag(int v, Object object0) {
        int[] arr_v = this.i;
        if(this.j + 1 > arr_v.length) {
            this.i = Arrays.copyOf(arr_v, arr_v.length * 2);
        }
        int v1 = this.j;
        this.i[v1] = v;
        this.j = v1 + 1;
    }
}

