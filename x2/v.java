package X2;

import J2.j;
import P3.e;
import v3.f;

public final class v extends U {
    public final f a;
    public final e b;

    public v(f f0, e e0) {
        j.f(e0, "underlyingType");
        super();
        this.a = f0;
        this.b = e0;
    }

    @Override  // X2.U
    public final boolean a(f f0) {
        return this.a.equals(f0);
    }

    @Override
    public final String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.a + ", underlyingType=" + this.b + ')';
    }
}

