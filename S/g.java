package s;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

public final class g extends View {
    public g(Context context0) {
        super(context0);
        super.setVisibility(8);
    }

    @Override  // android.view.View
    public final void draw(Canvas canvas0) {
    }

    @Override  // android.view.View
    public final void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int v) {
        d d0 = (d)this.getLayoutParams();
        d0.a = v;
        this.setLayoutParams(d0);
    }

    public void setGuidelineEnd(int v) {
        d d0 = (d)this.getLayoutParams();
        d0.b = v;
        this.setLayoutParams(d0);
    }

    public void setGuidelinePercent(float f) {
        d d0 = (d)this.getLayoutParams();
        d0.c = f;
        this.setLayoutParams(d0);
    }

    @Override  // android.view.View
    public void setVisibility(int v) {
    }
}

