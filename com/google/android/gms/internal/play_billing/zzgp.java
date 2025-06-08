package com.google.android.gms.internal.play_billing;

import java.io.IOException;

public final class zzgp extends IOException {
    public zzgp() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    public zzgp(long v, long v1, int v2, IndexOutOfBoundsException indexOutOfBoundsException0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + ("Pos: " + v + ", limit: " + v1 + ", len: " + v2), indexOutOfBoundsException0);
    }

    public zzgp(IndexOutOfBoundsException indexOutOfBoundsException0) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException0);
    }
}

