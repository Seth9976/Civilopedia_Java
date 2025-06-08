package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

public final class zzr implements AppSetIdClient {
    public final zzp a;
    public final zzl b;

    public zzr(Context context0) {
        this.a = new zzp(context0, GoogleApiAvailabilityLight.getInstance());
        synchronized(zzl.class) {
            Preconditions.checkNotNull(context0, "Context must not be null");
            if(zzl.d == null) {
                zzl.d = new zzl(context0.getApplicationContext());
            }
        }
        this.b = zzl.d;
    }

    @Override  // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        return this.a.getAppSetIdInfo().continueWithTask((Task task0) -> {
            if(!task0.isSuccessful() && !task0.isCanceled()) {
                Exception exception0 = task0.getException();
                if(exception0 instanceof ApiException) {
                    switch(((ApiException)exception0).getStatusCode()) {
                        case 15: {
                            return Tasks.forException(new Exception("The operation to get app set ID timed out. Please try again later."));
                        }
                        case 43000: {
                            return Tasks.forException(new Exception("Failed to get app set ID due to an internal error. Please try again later."));
                        }
                        case 17: 
                        case 43001: 
                        case 43002: 
                        case 43003: {
                            return this.b.getAppSetIdInfo();
                        }
                        default: {
                            return task0;
                        }
                    }
                }
            }
            return task0;
        });
    }
}

