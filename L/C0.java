package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import e.a;

public class c0 extends ViewGroup.MarginLayoutParams {
    public final float a;
    public int b;

    public c0(int v) {
        super(v, -2);
        this.b = -1;
        this.a = 0.0f;
    }

    public c0(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.b = -1;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.n);
        this.a = typedArray0.getFloat(3, 0.0f);
        this.b = typedArray0.getInt(0, -1);
        typedArray0.recycle();
    }

    public c0(ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        super(viewGroup$LayoutParams0);
        this.b = -1;
    }
}

