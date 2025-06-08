package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException extends UserRecoverableException {
    public final int j;

    public GooglePlayServicesRepairableException(int v, String s, Intent intent0) {
        super(s, intent0);
        this.j = v;
    }

    public int getConnectionStatusCode() {
        return this.j;
    }
}

