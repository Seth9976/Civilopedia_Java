package x1;

public final class o extends b {
    public final Runnable i;

    public o(Runnable runnable0) {
        this.i = runnable0;
    }

    @Override  // x1.b
    public final void a() {
        this.i.run();
    }
}

