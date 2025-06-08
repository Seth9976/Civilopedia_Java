package J2;

import I3.A;
import Y3.e;
import java.io.Serializable;
import java.util.regex.Pattern;

public final class q implements Serializable {
    public final int i;
    public Object j;

    public q(int v) {
        this.i = v;
        if(v != 1) {
            super();
            return;
        }
        Pattern pattern0 = Pattern.compile("\\[(B?)LIST](.*?)\\[/LIST]", 0x20);
        j.e(pattern0, "compile(...)");
        super();
        this.j = pattern0;
    }

    public q(String s) {
        this.i = 1;
        Pattern pattern0 = Pattern.compile(s);
        j.e(pattern0, "compile(...)");
        super();
        this.j = pattern0;
    }

    public static X3.j a(q q0, String s) {
        j.f(s, "input");
        if(s.length() < 0) {
            throw new IndexOutOfBoundsException("Start index out of bounds: " + 0 + ", input length: " + s.length());
        }
        return new X3.j(new A(11, q0, s), e.q);
    }

    @Override
    public final String toString() {
        if(this.i != 0) {
            String s = ((Pattern)this.j).toString();
            j.e(s, "toString(...)");
            return s;
        }
        return String.valueOf(this.j);
    }
}

