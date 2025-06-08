package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.location.ActivityRecognitionApi;
import e1.o;
import e1.p;

public final class zzg implements ActivityRecognitionApi {
    @Override  // com.google.android.gms.location.ActivityRecognitionApi
    public final PendingResult removeActivityUpdates(GoogleApiClient googleApiClient0, PendingIntent pendingIntent0) {
        return googleApiClient0.execute(new p(googleApiClient0, pendingIntent0));
    }

    @Override  // com.google.android.gms.location.ActivityRecognitionApi
    public final PendingResult requestActivityUpdates(GoogleApiClient googleApiClient0, long v, PendingIntent pendingIntent0) {
        return googleApiClient0.execute(new o(googleApiClient0, v, pendingIntent0));
    }
}

