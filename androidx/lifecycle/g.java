package androidx.lifecycle;

public enum g {
    ON_CREATE,
    ON_START,
    ON_RESUME,
    ON_PAUSE,
    ON_STOP,
    ON_DESTROY,
    ON_ANY;

    public final h a() {
        switch(this) {
            case 1: 
            case 2: {
                return h.k;
            }
            case 3: 
            case 4: {
                return h.l;
            }
            case 5: {
                return h.m;
            }
            case 6: {
                return h.i;
            }
            default: {
                throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }
}

