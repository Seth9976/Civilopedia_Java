package com.google.android.gms.internal.play_billing;

public final class e extends f {
    public final int i;
    public static final e j;
    public static final e k;

    static {
        e.j = new e(0);
        e.k = new e(1);
    }

    public e(int v) {
        this.i = v;
        super();
    }

    @Override  // com.google.android.gms.internal.play_billing.f
    public final int a(f f0) {
        if(this.i != 0) {
            return f0 == this ? 0 : -1;
        }
        return f0 == this ? 0 : 1;
    }

    @Override  // com.google.android.gms.internal.play_billing.f
    public final void b(StringBuilder stringBuilder0) {
        if(this.i == 0) {
            throw new AssertionError();
        }
        stringBuilder0.append("(-∞");
    }

    @Override  // com.google.android.gms.internal.play_billing.f
    public final void c(StringBuilder stringBuilder0) {
        if(this.i != 0) {
            throw new AssertionError();
        }
        stringBuilder0.append("+∞)");
    }

    @Override
    public final int compareTo(Object object0) {
        if(this.i != 0) {
            return ((f)object0) == this ? 0 : -1;
        }
        return ((f)object0) == this ? 0 : 1;
    }

    @Override  // com.google.android.gms.internal.play_billing.f
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override
    public final String toString() {
        return this.i == 0 ? "+∞" : "-∞";
    }
}

