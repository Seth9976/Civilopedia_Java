package A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public final class g implements h {
    public final Locale[] a;
    public static final Locale[] b;

    static {
        g.b = new Locale[0];
        new Locale("en", "XA");
        new Locale("ar", "XB");
        new Locale("en", "Latn");
    }

    public g(Locale[] arr_locale) {
        if(arr_locale.length == 0) {
            this.a = g.b;
            return;
        }
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        for(int v = 0; v < arr_locale.length; ++v) {
            Locale locale0 = arr_locale[v];
            if(locale0 == null) {
                throw new NullPointerException(f.e(v, "list[", "] is null"));
            }
            if(!hashSet0.contains(locale0)) {
                Locale locale1 = (Locale)locale0.clone();
                arrayList0.add(locale1);
                locale1.getLanguage();
                String s = locale1.getCountry();
                if(s != null && !s.isEmpty()) {
                    locale1.getCountry();
                }
                hashSet0.add(locale1);
            }
        }
        this.a = (Locale[])arrayList0.toArray(new Locale[arrayList0.size()]);
    }

    @Override  // A.h
    public final Object a() {
        return null;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 == this) {
            return true;
        }
        if(!(object0 instanceof g)) {
            return false;
        }
        Locale[] arr_locale = ((g)object0).a;
        Locale[] arr_locale1 = this.a;
        if(arr_locale1.length != arr_locale.length) {
            return false;
        }
        for(int v = 0; v < arr_locale1.length; ++v) {
            if(!arr_locale1[v].equals(arr_locale[v])) {
                return false;
            }
        }
        return true;
    }

    @Override  // A.h
    public final Locale get() {
        return this.a.length <= 0 ? null : this.a[0];
    }

    @Override
    public final int hashCode() {
        int v = 1;
        for(int v1 = 0; true; ++v1) {
            Locale[] arr_locale = this.a;
            if(v1 >= arr_locale.length) {
                break;
            }
            v = v * 0x1F + arr_locale[v1].hashCode();
        }
        return v;
    }

    @Override
    public final String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("[");
        for(int v = 0; true; ++v) {
            Locale[] arr_locale = this.a;
            if(v >= arr_locale.length) {
                break;
            }
            stringBuilder0.append(arr_locale[v]);
            if(v < arr_locale.length - 1) {
                stringBuilder0.append(',');
            }
        }
        stringBuilder0.append("]");
        return stringBuilder0.toString();
    }
}

