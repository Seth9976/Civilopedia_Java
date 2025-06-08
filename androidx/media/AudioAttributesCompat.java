package androidx.media;

import W.c;
import android.util.SparseIntArray;

public class AudioAttributesCompat implements c {
    public AudioAttributesImpl a;
    public static final int b;

    static {
        SparseIntArray sparseIntArray0 = new SparseIntArray();
        sparseIntArray0.put(5, 1);
        sparseIntArray0.put(6, 2);
        sparseIntArray0.put(7, 2);
        sparseIntArray0.put(8, 1);
        sparseIntArray0.put(9, 1);
        sparseIntArray0.put(10, 1);
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof AudioAttributesCompat)) {
            return false;
        }
        return this.a == null ? ((AudioAttributesCompat)object0).a == null : this.a.equals(((AudioAttributesCompat)object0).a);
    }

    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a.toString();
    }
}

