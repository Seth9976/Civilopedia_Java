package q3;

import w3.p;

public enum v implements p {
    TRUE(0),
    FALSE(1),
    NULL(2);

    public final int i;

    public v(int v1) {
        this.i = v1;
    }

    @Override  // w3.p
    public final int a() {
        return this.i;
    }
}

