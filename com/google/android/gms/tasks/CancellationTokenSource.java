package com.google.android.gms.tasks;

import l1.b;

public class CancellationTokenSource {
    public final b a;

    public CancellationTokenSource() {
        this.a = new b();
    }

    public void cancel() {
        this.a.a.d(null);
    }

    public CancellationToken getToken() {
        return this.a;
    }
}

