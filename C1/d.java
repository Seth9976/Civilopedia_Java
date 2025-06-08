package c1;

import com.google.android.gms.internal.common.zzo;
import i3.e;

public final class d extends zzo {
    public final char a;

    public d(char c) {
        this.a = c;
    }

    @Override
    public final String toString() {
        char[] arr_c = {'\\', 'u', '\u0000', '\u0000', '\u0000', '\u0000'};
        int v = this.a;
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_c[5 - v1] = "0123456789ABCDEF".charAt(v & 15);
            v >>= 4;
        }
        return e.f("CharMatcher.is(\'", String.copyValueOf(arr_c), "\')");
    }

    @Override  // com.google.android.gms.internal.common.zzo
    public final boolean zza(char c) {
        return c == this.a;
    }
}

