package O3;

import J2.j;
import X2.h;
import f3.b;
import java.util.Collection;
import java.util.Set;
import v3.f;

public final class m extends g {
    @Override  // O3.g
    public final Collection a(f f0, b b0) {
        this.i(f0, b0);
        throw null;
    }

    @Override  // O3.g
    public final Collection b(f f0, b b0) {
        this.h(f0, b0);
        throw null;
    }

    @Override  // O3.g
    public final Set c() {
        throw new IllegalStateException();
    }

    @Override  // O3.g
    public final Set d() {
        throw new IllegalStateException();
    }

    @Override  // O3.g
    public final Set e() {
        throw new IllegalStateException();
    }

    @Override  // O3.g
    public final h f(f f0, b b0) {
        j.f(f0, "name");
        j.f(b0, "location");
        throw new IllegalStateException(this.b + ", required name: " + f0);
    }

    @Override  // O3.g
    public final Collection g(F3.f f0, I2.b b0) {
        j.f(f0, "kindFilter");
        throw new IllegalStateException(this.b);
    }

    @Override  // O3.g
    public final Set h(f f0, b b0) {
        j.f(f0, "name");
        throw new IllegalStateException(this.b + ", required name: " + f0);
    }

    @Override  // O3.g
    public final Set i(f f0, b b0) {
        j.f(f0, "name");
        throw new IllegalStateException(this.b + ", required name: " + f0);
    }

    @Override  // O3.g
    public final String toString() {
        return "ThrowingScope{" + this.b + '}';
    }
}

