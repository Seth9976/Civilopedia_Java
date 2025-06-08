package androidx.fragment.app;

public final class d implements Runnable {
    public final int i;
    public final h j;

    public d(h h0, int v) {
        this.i = v;
        this.j = h0;
        super();
    }

    @Override
    public final void run() {
        if(this.i != 0) {
            this.j.a();
            return;
        }
        this.j.startPostponedEnterTransition();
    }
}

