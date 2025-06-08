package p3;

import G3.a;
import k.d;
import o3.l;

public final class b extends a {
    public final int j;
    public final l k;

    public b(l l0, int v) {
        this.j = v;
        this.k = l0;
        super();
    }

    @Override  // G3.a
    public final void J0(String[] arr_s) {
        switch(this.j) {
            case 0: {
                if(arr_s == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
                }
                ((c)this.k).j.d = arr_s;
                return;
            }
            case 1: {
                if(arr_s == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2.visitEnd must not be null");
                }
                ((c)this.k).j.e = arr_s;
                return;
            }
            default: {
                if(arr_s == null) {
                    throw new IllegalArgumentException("Argument for @NotNull parameter \'result\' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
                }
                ((e)((d)this.k).j).h = arr_s;
            }
        }
    }
}

