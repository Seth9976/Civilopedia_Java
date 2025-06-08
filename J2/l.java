package J2;

import java.io.Serializable;

public abstract class l implements g, Serializable {
    public l(int v) {
    }

    @Override
    public final String toString() {
        String s = r.a.g(this);
        j.e(s, "renderLambdaToString(...)");
        return s;
    }
}

