package i1;

import com.google.android.gms.measurement.internal.zzau;
import java.util.Iterator;

public final class h implements Iterator {
    public final int i;
    public Iterator j;

    public h() {
        this.i = 1;
        super();
    }

    public h(zzau zzau0) {
        this.i = 0;
        super();
        this.j = zzau0.i.keySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        return this.j.hasNext();
    }

    @Override
    public final Object next() {
        return this.i != 0 ? this.j.next() : this.j.next();
    }

    @Override
    public final void remove() {
        throw this.i == 0 ? new UnsupportedOperationException("Remove not supported") : new UnsupportedOperationException();
    }
}

