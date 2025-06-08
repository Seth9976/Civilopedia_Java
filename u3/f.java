package u3;

import J2.j;
import java.util.Arrays;
import s3.a;

public final class f extends a {
    public final boolean f;
    public static final f g;
    public static final f h;

    static {
        f f0 = new f(new int[]{1, 9, 0}, false);
        f.g = f0;
        f.h = f0.b != 1 || f0.c != 9 ? new f(new int[]{f0.b, f0.c + 1, 0}, false) : new f(new int[]{2, 0, 0}, false);
        new f(new int[0], false);
    }

    public f(int[] arr_v, boolean z) {
        j.f(arr_v, "versionArray");
        super(Arrays.copyOf(arr_v, arr_v.length));
        this.f = z;
    }

    public final boolean b(f f0) {
        j.f(f0, "metadataVersionFromLanguageVersion");
        f f1 = f.g;
        int v = this.b;
        int v1 = this.c;
        if(v == 2 && v1 == 0 && f1.b == 1 && f1.c == 8) {
            return true;
        }
        if(!this.f) {
            f1 = f.h;
        }
        f1.getClass();
        if(f1.b > f0.b || f1.b >= f0.b && f1.c > f0.c) {
            f0 = f1;
        }
        if((v != 1 || v1 != 0) && v != 0) {
            return v <= f0.b ? v < f0.b || v1 <= f0.c : false;
        }
        return false;
    }
}

