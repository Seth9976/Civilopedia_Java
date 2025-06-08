package com.google.gson;

public final class l extends j {
    public final com.google.gson.internal.j i;

    public l() {
        this.i = new com.google.gson.internal.j();
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this || object0 instanceof l && ((l)object0).i.equals(this.i);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }
}

