package o3;

public final class q {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final q f;
    public final boolean g;
    public final q h;
    public final q i;
    public final boolean j;
    public static final q k;

    static {
        q.k = new q(false, false, false, false, false, new q(false, false, false, false, false, null, false, null, null, 0x3FF), false, null, null, 988);
    }

    public q(boolean z, boolean z1, boolean z2, boolean z3, boolean z4, q q0, boolean z5, q q1, q q2, int v) {
        boolean z6 = true;
        if((v & 1) != 0) {
            z = true;
        }
        if((v & 2) != 0) {
            z1 = true;
        }
        if((v & 4) != 0) {
            z2 = false;
        }
        if((v & 8) != 0) {
            z3 = false;
        }
        if((v & 16) != 0) {
            z4 = false;
        }
        if((v & 0x20) != 0) {
            q0 = null;
        }
        if((v & 0x40) != 0) {
            z5 = true;
        }
        if((v & 0x80) != 0) {
            q1 = q0;
        }
        if((v & 0x100) != 0) {
            q2 = q0;
        }
        if((v & 0x200) != 0) {
            z6 = false;
        }
        super();
        this.a = z;
        this.b = z1;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = q0;
        this.g = z5;
        this.h = q1;
        this.i = q2;
        this.j = z6;
    }
}

