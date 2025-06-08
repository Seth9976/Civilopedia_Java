package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import k.b;
import z1.a0;

public final class i extends w implements k {
    public final j k;

    public i(j j0, Context context0) {
        this.k = j0;
        super(context0, null, 0x7F02001D);  // attr:actionOverflowButtonStyle
        this.setClickable(true);
        this.setFocusable(true);
        this.setVisibility(0);
        this.setEnabled(true);
        a0.M(this, this.getContentDescription());
        this.setOnTouchListener(new b(this, this));
    }

    @Override  // l.k
    public final boolean b() {
        return false;
    }

    @Override  // l.k
    public final boolean c() {
        return false;
    }

    @Override  // android.view.View
    public final boolean performClick() {
        if(super.performClick()) {
            return true;
        }
        this.playSoundEffect(0);
        this.k.l();
        return true;
    }

    @Override  // android.widget.ImageView
    public final boolean setFrame(int v, int v1, int v2, int v3) {
        boolean z = super.setFrame(v, v1, v2, v3);
        Drawable drawable0 = this.getDrawable();
        Drawable drawable1 = this.getBackground();
        if(drawable0 != null && drawable1 != null) {
            int v4 = this.getWidth();
            int v5 = this.getHeight();
            int v6 = Math.max(v4, v5);
            int v7 = (v4 + (this.getPaddingLeft() - this.getPaddingRight())) / 2;
            int v8 = (v5 + (this.getPaddingTop() - this.getPaddingBottom())) / 2;
            drawable1.setHotspotBounds(v7 - v6 / 2, v8 - v6 / 2, v7 + v6 / 2, v8 + v6 / 2);
        }
        return z;
    }
}

