package X2;

import java.util.ArrayList;
import java.util.Map;
import v3.f;
import x2.w;

public final class B extends U {
    public final ArrayList a;
    public final Map b;

    public B(ArrayList arrayList0) {
        this.a = arrayList0;
        Map map0 = w.z(arrayList0);
        if(map0.size() != arrayList0.size()) {
            throw new IllegalArgumentException("Some properties have the same names");
        }
        this.b = map0;
    }

    @Override  // X2.U
    public final boolean a(f f0) {
        return this.b.containsKey(f0);
    }

    @Override
    public final String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + this.a + ')';
    }
}

