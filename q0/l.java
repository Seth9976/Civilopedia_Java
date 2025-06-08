package q0;

import java.util.Arrays;
import n0.b;

public final class l {
    public final b a;
    public final byte[] b;

    public l(b b0, byte[] arr_b) {
        if(b0 == null) {
            throw new NullPointerException("encoding is null");
        }
        if(arr_b == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = b0;
        this.b = arr_b;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof l)) {
            return false;
        }
        return this.a.equals(((l)object0).a) ? Arrays.equals(this.b, ((l)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return (this.a.hashCode() ^ 1000003) * 1000003 ^ v;
    }

    @Override
    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}

