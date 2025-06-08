package c1;

import com.google.android.gms.internal.common.zzag;
import com.google.android.gms.internal.common.zzak;
import com.google.android.gms.internal.common.zzs;
import java.util.NoSuchElementException;

public final class b extends zzak {
    public final int i;
    public int j;
    public final zzag k;

    public b(zzag zzag0, int v) {
        int v1 = zzag0.size();
        super();
        zzs.zzb(v, v1, "index");
        this.i = v1;
        this.j = v;
        this.k = zzag0;
    }

    public final Object a(int v) {
        return this.k.get(v);
    }

    @Override
    public final boolean hasNext() {
        return this.j < this.i;
    }

    @Override
    public final boolean hasPrevious() {
        return this.j > 0;
    }

    @Override
    public final Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int v = this.j;
        this.j = v + 1;
        return this.a(v);
    }

    @Override
    public final int nextIndex() {
        return this.j;
    }

    @Override
    public final Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        int v = this.j - 1;
        this.j = v;
        return this.a(v);
    }

    @Override
    public final int previousIndex() {
        return this.j - 1;
    }
}

