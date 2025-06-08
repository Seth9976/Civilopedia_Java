package com.google.android.gms.internal.play_billing;

public final class m0 {
    public final zzim a;
    public final int b;

    public m0(int v, zzim zzim0) {
        this.a = zzim0;
        this.b = v;
    }

    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof m0 ? this.a == ((m0)object0).a && this.b == ((m0)object0).b : false;
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 0xFFFF + this.b;
    }
}

