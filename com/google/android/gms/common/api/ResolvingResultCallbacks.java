package com.google.android.gms.common.api;

import android.content.IntentSender.SendIntentException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

public abstract class ResolvingResultCallbacks extends ResultCallbacks {
    @Override  // com.google.android.gms.common.api.ResultCallbacks
    @KeepForSdk
    public final void onFailure(Status status0) {
        if(status0.hasResolution()) {
            try {
                status0.startResolutionForResult(null, 0);
            }
            catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                Log.e("ResolvingResultCallback", "Failed to start resolution", intentSender$SendIntentException0);
                this.onUnresolvableFailure(new Status(8));
            }
            return;
        }
        this.onUnresolvableFailure(status0);
    }

    @Override  // com.google.android.gms.common.api.ResultCallbacks
    public abstract void onSuccess(Result arg1);

    public abstract void onUnresolvableFailure(Status arg1);
}

