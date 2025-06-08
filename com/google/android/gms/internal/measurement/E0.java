package com.google.android.gms.internal.measurement;

public final class e0 implements i0 {
    public final i0[] a;

    public e0(i0[] arr_i0) {
        this.a = arr_i0;
    }

    @Override  // com.google.android.gms.internal.measurement.i0
    public final r0 a(Class class0) {
        for(int v = 0; v < 2; ++v) {
            i0 i00 = this.a[v];
            if(i00.b(class0)) {
                return i00.a(class0);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + class0.getName());
    }

    @Override  // com.google.android.gms.internal.measurement.i0
    public final boolean b(Class class0) {
        for(int v = 0; v < 2; ++v) {
            if(this.a[v].b(class0)) {
                return true;
            }
        }
        return false;
    }
}

