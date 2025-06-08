package p3;

import G3.a;

public final class d extends a {
    public final int j;
    public final c k;

    public d(c c0, int v) {
        this.j = v;
        this.k = c0;
        super();
    }

    @Override  // G3.a
    public final void J0(String[] arr_s) {
        if(this.j != 0) {
            if(arr_s == null) {
                throw new IllegalArgumentException("Argument for @NotNull parameter \'data\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
            }
            this.k.j.e = arr_s;
            return;
        }
        if(arr_s == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter \'data\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
        }
        this.k.j.d = arr_s;
    }
}

