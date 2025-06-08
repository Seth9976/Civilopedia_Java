package androidx.fragment.app;

import java.util.ArrayList;

public final class t implements s {
    public final int a;
    public final v b;

    public t(v v0, int v1) {
        this.b = v0;
        this.a = v1;
    }

    @Override  // androidx.fragment.app.s
    public final boolean a(ArrayList arrayList0, ArrayList arrayList1) {
        return this.b.A == null || this.a >= 0 || !this.b.A.getChildFragmentManager().a() ? this.b.a0(arrayList0, arrayList1, this.a, 1) : false;
    }
}

