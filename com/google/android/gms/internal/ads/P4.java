package com.google.android.gms.internal.ads;

public final class p4 {
    public final Object a;
    public zzw b;
    public boolean c;
    public boolean d;

    public p4(Object object0) {
        this.a = object0;
        this.b = new zzw();
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return p4.class == class0 ? this.a.equals(((p4)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}

