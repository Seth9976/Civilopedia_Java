package com.google.android.gms.common;

import android.content.Intent;

public class UserRecoverableException extends Exception {
    public final Intent i;

    public UserRecoverableException(String s, Intent intent0) {
        super(s);
        this.i = intent0;
    }

    public Intent getIntent() {
        return new Intent(this.i);
    }
}

