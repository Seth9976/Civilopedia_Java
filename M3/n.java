package M3;

import N3.f;

public abstract class N {
    public abstract a0 a();

    public abstract w b();

    public abstract boolean c();

    public abstract N d(f arg1);

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof N)) {
            return false;
        }
        if(this.c() != ((N)object0).c()) {
            return false;
        }
        return this.a() == ((N)object0).a() ? this.b().equals(((N)object0).b()) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a().hashCode();
        if(X.l(this.b())) {
            return v * 0x1F + 19;
        }
        return this.c() ? v * 0x1F + 17 : v * 0x1F + this.b().hashCode();
    }

    @Override
    public final String toString() {
        if(this.c()) {
            return "*";
        }
        return this.a() == a0.k ? this.b().toString() : this.a() + " " + this.b();
    }
}

