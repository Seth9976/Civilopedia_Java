package androidx.appcompat.view.menu;

import B1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import k.k;
import k.l;
import k.n;
import k.z;

public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, k, z {
    public l i;
    public static final int[] j;

    static {
        ExpandedMenuView.j = new int[]{0x10100D4, 0x1010129};
    }

    public ExpandedMenuView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.setOnItemClickListener(this);
        a a0 = a.A(context0, attributeSet0, ExpandedMenuView.j, 0x1010074);
        TypedArray typedArray0 = (TypedArray)a0.k;
        if(typedArray0.hasValue(0)) {
            this.setBackgroundDrawable(a0.o(0));
        }
        if(typedArray0.hasValue(1)) {
            this.setDivider(a0.o(1));
        }
        a0.C();
    }

    @Override  // k.k
    public final boolean a(n n0) {
        return this.i.q(n0, null, 0);
    }

    @Override  // k.z
    public final void c(l l0) {
        this.i = l0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override  // android.widget.ListView
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        this.a(((n)this.getAdapter().getItem(v)));
    }
}

