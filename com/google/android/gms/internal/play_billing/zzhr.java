package com.google.android.gms.internal.play_billing;

import java.io.IOException;

public class zzhr extends IOException {
    public zzhr(IOException iOException0) {
        super(iOException0.getMessage(), iOException0);
    }

    public zzhr(String s) {
        super(s);
    }
}

