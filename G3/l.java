package g3;

import J2.j;
import O2.A;
import X2.M;
import X2.b;
import y3.e;

public final class l implements e {
    @Override  // y3.e
    public final int a(b b0, b b1, X2.e e0) {
        j.f(b0, "superDescriptor");
        j.f(b1, "subDescriptor");
        if(!(b1 instanceof M) || !(b0 instanceof M) || !j.a(((M)b1).getName(), ((M)b0).getName())) {
            return 4;
        }
        if(A.O(((M)b1)) && A.O(((M)b0))) {
            return 1;
        }
        return A.O(((M)b1)) || A.O(((M)b0)) ? 3 : 4;
    }

    @Override  // y3.e
    public final int b() {
        return 3;
    }
}

