package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

public final class a0 implements Runnable {
    public final int i;
    public final b0 j;

    public a0(b0 b00, int v) {
        this.i = v;
        this.j = b00;
        super();
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            b0 b00 = this.j;
            b00.a();
            View view0 = b00.l;
            if(view0.isEnabled() && !view0.isLongClickable() && b00.c()) {
                view0.getParent().requestDisallowInterceptTouchEvent(true);
                long v = SystemClock.uptimeMillis();
                MotionEvent motionEvent0 = MotionEvent.obtain(v, v, 3, 0.0f, 0.0f, 0);
                view0.onTouchEvent(motionEvent0);
                motionEvent0.recycle();
                b00.o = true;
            }
            return;
        }
        ViewParent viewParent0 = this.j.l.getParent();
        if(viewParent0 != null) {
            viewParent0.requestDisallowInterceptTouchEvent(true);
        }
    }
}

