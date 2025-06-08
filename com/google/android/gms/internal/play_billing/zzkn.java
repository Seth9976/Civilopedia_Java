package com.google.android.gms.internal.play_billing;

public enum zzkn {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    public final int i;

    public zzkn(int v1) {
        this.i = v1;
    }

    @Override
    public final String toString() {
        return Integer.toString(this.i);
    }
}

