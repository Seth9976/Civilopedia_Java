package Y;

public final class j extends l {
    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null) {
            Class class0 = object0.getClass();
            return j.class == class0;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return j.class.getName().hashCode();
    }

    @Override
    public final String toString() {
        return "Retry";
    }
}

