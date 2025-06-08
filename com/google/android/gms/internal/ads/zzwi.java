package com.google.android.gms.internal.ads;

import A.f;
import java.io.IOException;

public final class zzwi extends IOException {
    public zzwi(Throwable throwable0) {
        super(f.j("Unexpected ", throwable0.getClass().getSimpleName(), ": ", throwable0.getMessage()), throwable0);
    }
}

