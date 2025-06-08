package r3;

import J2.j;
import java.util.Arrays;

public final class a extends s3.a {
    public static final a f;

    static {
        a.f = new a(new int[]{1, 0, 7});
        new a(new int[0]);
    }

    public a(int[] arr_v) {
        j.f(arr_v, "numbers");
        super(Arrays.copyOf(arr_v, arr_v.length));
    }
}

