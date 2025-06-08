package Y;

public final class i extends l {
    public final f a;

    public i() {
        this.a = f.c;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return i.class == class0 ? this.a.equals(((i)object0).a) : false;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode() + i.class.getName().hashCode() * 0x1F;
    }

    @Override
    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}

