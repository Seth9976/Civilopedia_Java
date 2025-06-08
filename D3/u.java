package d3;

import J2.j;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

public final class u extends w {
    public final Field a;

    public u(Field field0) {
        j.f(field0, "member");
        super();
        this.a = field0;
    }

    @Override  // d3.w
    public final Member b() {
        return this.a;
    }
}

