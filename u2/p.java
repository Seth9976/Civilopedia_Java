package U2;

import J2.j;
import v3.b;
import v3.c;
import v3.f;

public enum p {
    UBYTEARRAY(new b(new c("kotlin"), new c("UByteArray"), false)),
    USHORTARRAY(new b(new c("kotlin"), new c("UShortArray"), false)),
    UINTARRAY(new b(new c("kotlin"), new c("UIntArray"), false)),
    ULONGARRAY(new b(new c("kotlin"), new c("ULongArray"), false));

    public final f i;

    public p(b b0) {
        f f0 = b0.i();
        j.e(f0, "getShortClassName(...)");
        this.i = f0;
    }
}

