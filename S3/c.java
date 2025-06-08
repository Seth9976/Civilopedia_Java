package s3;

import w3.p;

public final class c extends d {
    public final p[] c;

    public c(int v, p[] arr_p) {
        if(arr_p == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'enumEntries\' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
        }
        int v1 = 1;
        int v2 = arr_p.length - 1;
        if(v2 != 0) {
            for(int v3 = 0x1F; v3 >= 0; --v3) {
                if((1 << v3 & v2) != 0) {
                    v1 = v3 + 1;
                    super(v, v1);
                    this.c = arr_p;
                    return;
                }
            }
            throw new IllegalStateException("Empty enum: " + arr_p.getClass());
        }
        super(v, v1);
        this.c = arr_p;
    }

    public final Object c(int v) {
        int v1 = (v & (1 << this.b) - 1 << this.a) >> this.a;
        p[] arr_p = this.c;
        int v2 = 0;
        while(v2 < arr_p.length) {
            p p0 = arr_p[v2];
            if(p0.a() != v1) {
                ++v2;
                continue;
            }
            return p0;
        }
        return null;
    }
}

