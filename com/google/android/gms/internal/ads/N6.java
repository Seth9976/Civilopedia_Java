package com.google.android.gms.internal.ads;

public final class n6 {
    public final String a;
    public final String b;

    public n6(String s, String s1) {
        this.a = s;
        this.b = s1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof n6 ? this.a.equals(((n6)object0).a) && this.b.equals(((n6)object0).b) : false;
    }

    @Override
    public final int hashCode() {
        return (this.a + this.b).hashCode();
    }
}

