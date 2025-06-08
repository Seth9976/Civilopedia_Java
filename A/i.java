package A;

import android.os.LocaleList;
import java.util.Locale;

public final class i implements h {
    public final LocaleList a;

    public i(LocaleList localeList0) {
        this.a = localeList0;
    }

    @Override  // A.h
    public final Object a() {
        return this.a;
    }

    @Override
    public final boolean equals(Object object0) {
        Object object1 = ((h)object0).a();
        return this.a.equals(object1);
    }

    @Override  // A.h
    public final Locale get() {
        return b.k(this.a);
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

