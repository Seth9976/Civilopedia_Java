package com.google.android.gms.common.internal;

import P0.c;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

public final class zzg extends c {
    public final BaseGmsClient e;

    public zzg(BaseGmsClient baseGmsClient0, int v, Bundle bundle0) {
        this.e = baseGmsClient0;
        super(baseGmsClient0, v, null);
    }

    @Override  // P0.c
    public final void b(ConnectionResult connectionResult0) {
        this.e.getClass();
        this.e.x.onReportServiceBinding(connectionResult0);
        this.e.f(connectionResult0);
    }

    @Override  // P0.c
    public final boolean c() {
        this.e.x.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
        return true;
    }
}

