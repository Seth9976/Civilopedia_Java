package s1;

import i3.e;

public final class j {
    public final Class a;
    public final int b;
    public final int c;

    public j(Class class0, int v, int v1) {
        this.a = class0;
        this.b = v;
        this.c = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof j && this.a == ((j)object0).a && this.b == ((j)object0).b && this.c == ((j)object0).c;
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b) * 1000003 ^ this.c;
    }

    @Override
    public final String toString() {
        String s;
        StringBuilder stringBuilder0 = new StringBuilder("Dependency{anInterface=");
        stringBuilder0.append(this.a);
        stringBuilder0.append(", type=");
        int v = this.b;
        if(v == 1) {
            s = "required";
        }
        else {
            s = v == 0 ? "optional" : "set";
        }
        stringBuilder0.append(s);
        stringBuilder0.append(", injection=");
        int v1 = this.c;
        switch(v1) {
            case 0: {
                return e.h(stringBuilder0, "direct", "}");
            }
            case 1: {
                return e.h(stringBuilder0, "provider", "}");
            }
            default: {
                if(v1 != 2) {
                    throw new AssertionError("Unsupported injection: " + v1);
                }
                return e.h(stringBuilder0, "deferred", "}");
            }
        }
    }
}

