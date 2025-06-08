package q3;

import w3.p;

public enum c implements p {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);

    public final int i;

    public c(int v1) {
        this.i = v1;
    }

    @Override  // w3.p
    public final int a() {
        return this.i;
    }

    public static c b(int v) {
        switch(v) {
            case 0: {
                return c.j;
            }
            case 1: {
                return c.k;
            }
            case 2: {
                return c.l;
            }
            case 3: {
                return c.m;
            }
            case 4: {
                return c.n;
            }
            case 5: {
                return c.o;
            }
            case 6: {
                return c.p;
            }
            case 7: {
                return c.q;
            }
            case 8: {
                return c.r;
            }
            case 9: {
                return c.s;
            }
            case 10: {
                return c.t;
            }
            case 11: {
                return c.u;
            }
            case 12: {
                return c.v;
            }
            default: {
                return null;
            }
        }
    }
}

