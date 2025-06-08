package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

public abstract class b6 {
    private static boolean b(Throwable throwable0) {
        return throwable0 instanceof ErrnoException && ((ErrnoException)throwable0).errno == OsConstants.EACCES;
    }
}

