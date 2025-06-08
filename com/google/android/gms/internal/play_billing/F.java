package com.google.android.gms.internal.play_billing;

import java.io.Serializable;

public abstract class f implements Serializable, Comparable {
    public abstract int a(f arg1);

    public abstract void b(StringBuilder arg1);

    public abstract void c(StringBuilder arg1);

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof f) {
            f f0 = (f)object0;
            try {
                if(this.a(f0) == 0) {
                    return true;
                }
            }
            catch(ClassCastException unused_ex) {
            }
        }
        return false;
    }

    @Override
    public abstract int hashCode();
}

