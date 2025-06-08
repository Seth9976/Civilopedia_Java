package f2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import java.lang.ref.WeakReference;

public final class k extends ImageSpan {
    public WeakReference a;

    @Override  // android.text.style.DynamicDrawableSpan
    public final void draw(Canvas canvas0, CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, Paint paint0) {
        Drawable drawable0 = this.a == null ? null : ((Drawable)this.a.get());
        if(drawable0 == null) {
            drawable0 = this.getDrawable();
            this.a = new WeakReference(drawable0);
        }
        canvas0.save();
        int v5 = (v4 - v2 - drawable0.getBounds().bottom) / 2 + v2;
        canvas0.translate(f, ((float)(drawable0.getBounds().bottom / 7 + v5)));
        drawable0.draw(canvas0);
        canvas0.restore();
    }
}

