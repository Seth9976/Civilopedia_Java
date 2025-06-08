package I3;

import J2.j;
import u3.f;
import v3.b;

public final class n {
    public final Object a;
    public final f b;
    public final f c;
    public final f d;
    public final String e;
    public final b f;

    public n(Object object0, f f0, f f1, f f2, String s, b b0) {
        j.f(s, "filePath");
        super();
        this.a = object0;
        this.b = f0;
        this.c = f1;
        this.d = f2;
        this.e = s;
        this.f = b0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof n)) {
            return false;
        }
        if(!this.a.equals(((n)object0).a)) {
            return false;
        }
        if(!j.a(this.b, ((n)object0).b)) {
            return false;
        }
        if(!j.a(this.c, ((n)object0).c)) {
            return false;
        }
        if(!this.d.equals(((n)object0).d)) {
            return false;
        }
        return j.a(this.e, ((n)object0).e) ? this.f.equals(((n)object0).f) : false;
    }

    @Override
    public final int hashCode() {
        int v = this.a.hashCode();
        int v1 = 0;
        int v2 = this.b == null ? 0 : this.b.hashCode();
        f f0 = this.c;
        if(f0 != null) {
            v1 = f0.hashCode();
        }
        return this.f.hashCode() + A.f.b((this.d.hashCode() + ((v * 0x1F + v2) * 0x1F + v1) * 0x1F) * 0x1F, 0x1F, this.e);
    }

    @Override
    public final String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.a + ", compilerVersion=" + this.b + ", languageVersion=" + this.c + ", expectedVersion=" + this.d + ", filePath=" + this.e + ", classId=" + this.f + ')';
    }
}

