package c1;

import com.google.android.gms.internal.common.zzx;
import java.io.IOException;
import java.util.Iterator;

public final class f implements Iterable {
    public final CharSequence i;
    public final zzx j;

    public f(zzx zzx0, CharSequence charSequence0) {
        this.j = zzx0;
        this.i = charSequence0;
    }

    @Override
    public final Iterator iterator() {
        return new e(this.j.b, this.j, this.i);
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append('[');
        Iterator iterator0 = this.iterator();
        try {
            if(((e)iterator0).hasNext()) {
                Object object0 = ((e)iterator0).next();
                object0.getClass();
                CharSequence charSequence0 = object0 instanceof CharSequence ? ((CharSequence)object0) : object0.toString();
                stringBuilder0.append(charSequence0);
                while(((e)iterator0).hasNext()) {
                    stringBuilder0.append(", ");
                    Object object1 = ((e)iterator0).next();
                    object1.getClass();
                    CharSequence charSequence1 = object1 instanceof CharSequence ? ((CharSequence)object1) : object1.toString();
                    stringBuilder0.append(charSequence1);
                }
            }
        }
        catch(IOException iOException0) {
            throw new AssertionError(iOException0);
        }
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

