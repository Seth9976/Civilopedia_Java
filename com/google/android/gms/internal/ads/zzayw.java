package com.google.android.gms.internal.ads;

import A.f;
import java.io.IOException;

public final class zzayw extends IOException {
    public zzayw(Throwable throwable0) {
        super(f.j("Unexpected ", throwable0.getClass().getSimpleName(), ": ", throwable0.getMessage()), throwable0);
    }
}

