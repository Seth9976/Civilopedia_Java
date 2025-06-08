package x1;

import java.io.File;
import z1.v;

public final class a {
    public final v a;
    public final String b;
    public final File c;

    public a(v v0, String s, File file0) {
        this.a = v0;
        if(s == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.b = s;
        this.c = file0;
    }

    // 去混淆评级： 中等(50)
    @Override
    public final boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof a && (this.a.equals(((a)object0).a) && this.b.equals(((a)object0).b) && this.c.equals(((a)object0).c));
    }

    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }

    @Override
    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}

