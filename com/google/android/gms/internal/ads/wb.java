package com.google.android.gms.internal.ads;

public final class wb {
    public final int a;
    public final boolean b;

    public wb(int v, boolean z) {
        this.a = v;
        this.b = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return wb.class == class0 && this.a == ((wb)object0).a && this.b == ((wb)object0).b;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a * 0x1F + this.b;
    }
}

