package q3;

import w3.p;

public enum b0 implements p {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);

    public final int i;

    public b0(int v1) {
        this.i = v1;
    }

    @Override  // w3.p
    public final int a() {
        return this.i;
    }
}

