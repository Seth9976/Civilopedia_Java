package x;

import android.graphics.Insets;

public final class b {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public static final b e;

    static {
        b.e = new b(0, 0, 0, 0);
    }

    public b(int v, int v1, int v2, int v3) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = v3;
    }

    public static b a(int v, int v1, int v2, int v3) {
        return v != 0 || v1 != 0 || v2 != 0 || v3 != 0 ? new b(v, v1, v2, v3) : b.e;
    }

    public final Insets b() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            if(b.class != class0 || this.d != ((b)object0).d) {
                return false;
            }
            if(this.a != ((b)object0).a) {
                return false;
            }
            return this.c == ((b)object0).c ? this.b == ((b)object0).b : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return ((this.a * 0x1F + this.b) * 0x1F + this.c) * 0x1F + this.d;
    }

    @Override
    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}

