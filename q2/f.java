package q2;

public final class f {
    public final boolean a;

    public f(boolean z) {
        this.a = z;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof f ? this.a == ((f)object0).a : false;
    }

    // 去混淆评级： 低(20)
    @Override
    public final int hashCode() {
        return this.a ? 0x4CF : 0x4D5;
    }

    @Override
    public final String toString() {
        return "PremiumEntitlement(entitled=" + this.a + ")";
    }
}

