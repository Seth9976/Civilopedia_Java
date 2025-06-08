package com.google.firebase.installations;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {
    public FirebaseInstallationsException(String s) {
        Preconditions.checkNotEmpty(s, "Detail message must not be empty");
        super(s);
    }
}

