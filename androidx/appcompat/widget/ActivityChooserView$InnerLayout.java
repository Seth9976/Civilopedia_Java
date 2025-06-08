package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import g.b;

public class ActivityChooserView.InnerLayout extends LinearLayout {
    public static final int[] i;

    static {
        ActivityChooserView.InnerLayout.i = new int[]{0x10100D4};
    }

    public ActivityChooserView.InnerLayout(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        Drawable drawable0;
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, ActivityChooserView.InnerLayout.i);
        if(typedArray0.hasValue(0)) {
            int v = typedArray0.getResourceId(0, 0);
            drawable0 = v == 0 ? typedArray0.getDrawable(0) : b.c(context0, v);
        }
        else {
            drawable0 = typedArray0.getDrawable(0);
        }
        this.setBackgroundDrawable(drawable0);
        typedArray0.recycle();
    }
}

