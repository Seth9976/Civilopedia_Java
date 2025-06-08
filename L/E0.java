package l;

public final class e0 implements Runnable {
    public final int i;
    public final g0 j;

    public e0(g0 g00, int v) {
        this.i = v;
        this.j = g00;
        super();
    }

    @Override
    public final void run() {
        g0 g00 = this.j;
        if(this.i != 0) {
            if(g00.k != null && g00.k.isAttachedToWindow() && g00.k.getCount() > g00.k.getChildCount() && g00.k.getChildCount() <= g00.u) {
                g00.G.setInputMethodMode(2);
                g00.e();
            }
            return;
        }
        Y y0 = g00.k;
        if(y0 != null) {
            y0.setListSelectionHidden(true);
            y0.requestLayout();
        }
    }
}

