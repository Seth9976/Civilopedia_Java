package com.google.android.gms.location;

import N.b;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import g1.e;
import g1.n;
import g1.o;

public class ActivityRecognitionClient extends GoogleApi {
    public static final int zza;

    public ActivityRecognitionClient(Activity activity0) {
        super(activity0, LocationServices.API, ApiOptions.NO_OPTIONS, Settings.DEFAULT_SETTINGS);
    }

    public ActivityRecognitionClient(Context context0) {
        super(context0, LocationServices.API, ApiOptions.NO_OPTIONS, Settings.DEFAULT_SETTINGS);
    }

    public Task removeActivityTransitionUpdates(PendingIntent pendingIntent0) {
        return this.doWrite(TaskApiCall.builder().run(new e(2, pendingIntent0)).setMethodKey(2406).build());
    }

    public Task removeActivityUpdates(PendingIntent pendingIntent0) {
        return this.doWrite(TaskApiCall.builder().run(new o(0, pendingIntent0)).setMethodKey(2402).build());
    }

    public Task removeSleepSegmentUpdates(PendingIntent pendingIntent0) {
        return this.doWrite(TaskApiCall.builder().run(new o(1, pendingIntent0)).setMethodKey(0x96B).build());
    }

    public Task requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest0, PendingIntent pendingIntent0) {
        activityTransitionRequest0.zza(this.b);
        return this.doWrite(TaskApiCall.builder().run(new n(1, activityTransitionRequest0, pendingIntent0)).setMethodKey(2405).build());
    }

    public Task requestActivityUpdates(long v, PendingIntent pendingIntent0) {
        return this.doWrite(TaskApiCall.builder().run(new b(pendingIntent0, v, 4)).setMethodKey(2401).build());
    }

    public Task requestSleepSegmentUpdates(PendingIntent pendingIntent0, SleepSegmentRequest sleepSegmentRequest0) {
        Preconditions.checkNotNull(pendingIntent0, "PendingIntent must be specified.");
        return this.doRead(TaskApiCall.builder().run(new n(this, pendingIntent0, sleepSegmentRequest0, 0)).setFeatures(new Feature[]{zzu.zzb}).setMethodKey(2410).build());
    }
}

