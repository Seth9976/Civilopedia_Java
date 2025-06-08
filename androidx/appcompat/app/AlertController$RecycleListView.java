package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import e.a;

public class AlertController.RecycleListView extends ListView {
    public final int i;
    public final int j;

    public AlertController.RecycleListView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, a.t);
        this.j = typedArray0.getDimensionPixelOffset(0, -1);
        this.i = typedArray0.getDimensionPixelOffset(1, -1);
    }
}

