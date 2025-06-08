package q0;

import B1.a;
import android.util.Base64;
import java.util.Arrays;
import n0.c;

public final class i {
    public final String a;
    public final byte[] b;
    public final c c;

    public i(String s, byte[] arr_b, c c0) {
        this.a = s;
        this.b = arr_b;
        this.c = c0;
    }

    public static a a() {
        a a0 = new a(28);
        a0.l = c.i;
        return a0;
    }

    // 去混淆评级： 中等(50)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof i && (this.a.equals(((i)object0).a) && Arrays.equals(this.b, ((i)object0).b) && this.c.equals(((i)object0).c));
    }

    @Override
    public final int hashCode() {
        int v = Arrays.hashCode(this.b);
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ v) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        byte[] arr_b = this.b;
        if(arr_b == null) {
            return "TransportContext(" + this.a + ", " + this.c + ", " + "" + ")";
        }
        String s = Base64.encodeToString(arr_b, 2);
        return "TransportContext(" + this.a + ", " + this.c + ", " + s + ")";
    }
}

