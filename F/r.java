package f;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import j.b;

public final class r extends ContentFrameLayout {
    public final t q;

    public r(t t0, b b0) {
        this.q = t0;
        super(b0, null);
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.ViewGroup
    public final boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        return this.q.n(keyEvent0) || super.dispatchKeyEvent(keyEvent0);
    }

    @Override  // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent0) {
        if(motionEvent0.getAction() == 0) {
            int v = (int)motionEvent0.getX();
            int v1 = (int)motionEvent0.getY();
            if(v < -5 || v1 < -5 || v > this.getWidth() + 5 || v1 > this.getHeight() + 5) {
                s s0 = this.q.s(0);
                this.q.m(s0, true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent0);
    }

    @Override  // android.view.View
    public final void setBackgroundResource(int v) {
        this.setBackgroundDrawable(g.b.c(this.getContext(), v));
    }
}

