package z1;

import java.util.Arrays;

public final class z extends Y {
    public final String a;
    public final byte[] b;

    public z(String s, byte[] arr_b) {
        this.a = s;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        return !(object0 instanceof Y) || !this.a.equals(((z)(((Y)object0))).a) ? false : Arrays.equals(this.b, (((Y)object0) instanceof z ? ((z)(((Y)object0))) : ((z)(((Y)object0)))).b);
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}

