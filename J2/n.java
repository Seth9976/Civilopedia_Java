package J2;

public final class n implements d {
    public final Class i;

    public n(String s, Class class0) {
        j.f(class0, "jClass");
        super();
        this.i = class0;
    }

    @Override  // J2.d
    public final Class a() {
        return this.i;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof n && j.a(this.i, ((n)object0).i);
    }

    @Override
    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override
    public final String toString() {
        return this.i.toString() + " (Kotlin reflection is not available)";
    }
}

