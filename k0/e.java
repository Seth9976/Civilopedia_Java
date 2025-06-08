package K0;

import java.util.Arrays;

public final class e extends d {
    public final byte[] j;

    public e(byte[] arr_b) {
        super(Arrays.copyOfRange(arr_b, 0, 25));
        this.j = arr_b;
    }

    @Override  // K0.d
    public final byte[] c() {
        return this.j;
    }
}

