package com.spears.civilopedia.tree;

import J2.j;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000F\u001A\u00020\b8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Lcom/spears/civilopedia/tree/BoostMeterView;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "j", "D", "getPercent", "()D", "setPercent", "(D)V", "percent", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class BoostMeterView extends RelativeLayout {
    public final Path i;
    public double j;

    public BoostMeterView(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        super(context0, attributeSet0);
        this.i = new Path();
        this.j = 0.4;
        this.setWillNotDraw(false);
    }

    public final double getPercent() {
        return this.j;
    }

    @Override  // android.view.View
    public final void onDraw(Canvas canvas0) {
        j.f(canvas0, "canvas");
        float f = ((float)this.getWidth()) / 2.0f;
        float f1 = ((float)this.getHeight()) / 2.0f;
        this.i.moveTo(f, f1);
        float f2 = (float)this.getWidth();
        float f3 = (float)this.getHeight();
        this.i.arcTo(0.0f, 0.0f, f2, f3, -90.0f, 360.0f * ((float)this.j), false);
        this.i.close();
        canvas0.clipPath(this.i);
        super.onDraw(canvas0);
    }

    public final void setPercent(double f) {
        this.j = f;
    }
}

