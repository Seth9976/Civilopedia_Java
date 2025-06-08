package com.google.android.gms.internal.ads;

import java.io.IOException;

public final class zzgju extends IOException {
    public zzgju() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzgju(IndexOutOfBoundsException indexOutOfBoundsException0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException0);
    }

    public zzgju(String s, IndexOutOfBoundsException indexOutOfBoundsException0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + s, indexOutOfBoundsException0);
    }
}

