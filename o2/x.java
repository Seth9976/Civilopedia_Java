package O2;

import H2.a;
import J2.j;
import R2.p0;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import x2.k;

public final class x implements Type, TypeVariable {
    public final r i;

    public x(r r0) {
        j.f(r0, "typeParameter");
        super();
        this.i = r0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof TypeVariable && this.getName().equals(((TypeVariable)object0).getName())) {
            this.getGenericDeclaration();
            throw null;
        }
        return false;
    }

    @Override
    public final Type[] getBounds() {
        ((p0)this.i).getClass();
        q q0 = p0.l[0];
        Object object0 = ((p0)this.i).j.invoke();
        j.e(object0, "getValue(...)");
        ArrayList arrayList0 = new ArrayList(k.E(((List)object0)));
        for(Object object1: ((List)object0)) {
            arrayList0.add(A.l(((J2.k)object1), true));
        }
        return (Type[])arrayList0.toArray(new Type[0]);
    }

    @Override
    public final GenericDeclaration getGenericDeclaration() {
        throw new a("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.i), 2);
    }

    @Override
    public final String getName() {
        return ((p0)this.i).a();
    }

    @Override
    public final String getTypeName() {
        return this.getName();
    }

    @Override
    public final int hashCode() {
        this.getName();
        this.getGenericDeclaration();
        throw null;
    }

    @Override
    public final String toString() {
        return this.getName();
    }
}

