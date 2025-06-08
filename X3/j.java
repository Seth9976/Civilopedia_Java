package x3;

import O2.q;

public final class j {
    public Object a;
    public final k b;

    public j(Object object0, k k0) {
        this.b = k0;
        this.a = object0;
    }

    public final Object a(q q0, Object object0) {
        J2.j.f(q0, "property");
        return this.a;
    }

    public final void b(q q0, Object object0) {
        J2.j.f(q0, "property");
        if(this.b.a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.a = object0;
    }

    @Override
    public final String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}

