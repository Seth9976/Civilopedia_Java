package x3;

import J2.j;
import Y3.n;

public final class q extends s {
    public q() {
        super("HTML", 1);
    }

    @Override  // x3.s
    public final String a(String s) {
        j.f(s, "string");
        return n.F0(n.F0(s, "<", "&lt;"), ">", "&gt;");
    }
}

