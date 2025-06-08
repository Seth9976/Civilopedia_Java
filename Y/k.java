package Y;

public final class k extends l {
    public final f a;

    public k(f f0) {
        this.a = f0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return k.class == class0 ? this.a.equals(((k)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + k.class.getName().hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}

