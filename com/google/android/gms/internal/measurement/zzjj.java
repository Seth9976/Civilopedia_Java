package com.google.android.gms.internal.measurement;

import java.io.IOException;

public final class zzjj extends IOException {
    public zzjj() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzjj(IndexOutOfBoundsException indexOutOfBoundsException0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException0);
    }

    public zzjj(String s, IndexOutOfBoundsException indexOutOfBoundsException0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s, indexOutOfBoundsException0);
    }
}

