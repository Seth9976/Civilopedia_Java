package com.google.android.gms.location;

import B1.a;
import C1.d;
import D3.b;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.internal.location.zzbj;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g1.c;
import g1.e;
import g1.f;
import g1.h;

public class FusedLocationProviderClient extends GoogleApi {
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    public FusedLocationProviderClient(Activity activity0) {
        ApiExceptionMapper apiExceptionMapper0 = new ApiExceptionMapper();
        super(activity0, LocationServices.API, ApiOptions.NO_OPTIONS, apiExceptionMapper0);
    }

    public FusedLocationProviderClient(Context context0) {
        ApiExceptionMapper apiExceptionMapper0 = new ApiExceptionMapper();
        super(context0, LocationServices.API, ApiOptions.NO_OPTIONS, apiExceptionMapper0);
    }

    public final Task b(zzba zzba0, LocationCallback locationCallback0, Looper looper0, c c0, int v) {
        ListenerHolder listenerHolder0 = ListenerHolders.createListenerHolder(locationCallback0, zzbj.zza(looper0), "LocationCallback");
        h h0 = new h(this, listenerHolder0);
        d d0 = new d(this, h0, locationCallback0, c0, zzba0, listenerHolder0);
        return this.doRegisterEventListener(RegistrationMethods.builder().register(d0).unregister(h0).withHolder(listenerHolder0).setMethodKey(v).build());
    }

    public Task flushLocations() {
        return this.doWrite(TaskApiCall.builder().run(g1.d.k).setMethodKey(0x976).build());
    }

    public Task getCurrentLocation(int v, CancellationToken cancellationToken0) {
        LocationRequest locationRequest0 = LocationRequest.create();
        locationRequest0.setPriority(v);
        locationRequest0.setInterval(0L);
        locationRequest0.setFastestInterval(0L);
        locationRequest0.setExpirationDuration(30000L);
        zzba zzba0 = zzba.zza(null, locationRequest0);
        zzba0.zzd(true);
        zzba0.zzb(10000L);
        a a0 = new a(this, cancellationToken0, zzba0, 15);
        Task task0 = this.doRead(TaskApiCall.builder().run(a0).setFeatures(new Feature[]{zzu.zzd}).setMethodKey(0x96F).build());
        if(cancellationToken0 != null) {
            TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource(cancellationToken0);
            task0.continueWithTask(new c(taskCompletionSource0));
            return taskCompletionSource0.getTask();
        }
        return task0;
    }

    public Task getLastLocation() {
        return this.doRead(TaskApiCall.builder().run(new b(this, 19)).setMethodKey(0x96E).build());
    }

    public Task getLocationAvailability() {
        return this.doRead(TaskApiCall.builder().run(g1.d.j).setMethodKey(0x970).build());
    }

    public Task removeLocationUpdates(PendingIntent pendingIntent0) {
        return this.doWrite(TaskApiCall.builder().run(new e(0, pendingIntent0)).setMethodKey(0x972).build());
    }

    public Task removeLocationUpdates(LocationCallback locationCallback0) {
        return TaskUtil.toVoidTaskThatFailsOnFalse(this.doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback0, "LocationCallback")));
    }

    public Task requestLocationUpdates(LocationRequest locationRequest0, PendingIntent pendingIntent0) {
        zzba zzba0 = zzba.zza(null, locationRequest0);
        return this.doWrite(TaskApiCall.builder().run(new a(this, zzba0, pendingIntent0, 16)).setMethodKey(0x971).build());
    }

    public Task requestLocationUpdates(LocationRequest locationRequest0, LocationCallback locationCallback0, Looper looper0) {
        return this.b(zzba.zza(null, locationRequest0), locationCallback0, looper0, null, 0x984);
    }

    public Task setMockLocation(Location location0) {
        return this.doWrite(TaskApiCall.builder().run(new T1.c(location0, 26)).setMethodKey(0x975).build());
    }

    public Task setMockMode(boolean z) {
        return this.doWrite(TaskApiCall.builder().run(new f(z)).setMethodKey(2420).build());
    }
}

