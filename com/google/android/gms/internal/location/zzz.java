package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Build.VERSION;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import e1.A;
import e1.B;
import e1.s;
import e1.t;
import e1.u;
import e1.v;
import e1.w;
import e1.x;
import e1.y;
import e1.z;

@VisibleForTesting
public final class zzz implements FusedLocationProviderApi {
    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult flushLocations(GoogleApiClient googleApiClient0) {
        return googleApiClient0.execute(new v(googleApiClient0, 1));  // 初始化器: Le1/c;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;I)V
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final Location getLastLocation(GoogleApiClient googleApiClient0) {
        zzaz zzaz0 = LocationServices.zza(googleApiClient0);
        Context context0 = googleApiClient0.getContext();
        String s = Build.VERSION.SDK_INT < 30 || context0 == null ? null : context0.getAttributionTag();
        try {
            return zzaz0.zzz(s);
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final LocationAvailability getLocationAvailability(GoogleApiClient googleApiClient0) {
        zzaz zzaz0 = LocationServices.zza(googleApiClient0);
        try {
            return zzaz0.zzA();
        }
        catch(Exception unused_ex) {
            return null;
        }
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult removeLocationUpdates(GoogleApiClient googleApiClient0, PendingIntent pendingIntent0) {
        return googleApiClient0.execute(new B(googleApiClient0, pendingIntent0));
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult removeLocationUpdates(GoogleApiClient googleApiClient0, LocationCallback locationCallback0) {
        return googleApiClient0.execute(new s(googleApiClient0, locationCallback0));
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult removeLocationUpdates(GoogleApiClient googleApiClient0, LocationListener locationListener0) {
        return googleApiClient0.execute(new A(googleApiClient0, locationListener0));
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient0, LocationRequest locationRequest0, PendingIntent pendingIntent0) {
        return googleApiClient0.execute(new z(googleApiClient0, locationRequest0, pendingIntent0));
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient0, LocationRequest locationRequest0, LocationCallback locationCallback0, Looper looper0) {
        return googleApiClient0.execute(new y(googleApiClient0, locationRequest0, locationCallback0, looper0));
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient0, LocationRequest locationRequest0, LocationListener locationListener0) {
        Preconditions.checkNotNull(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
        return googleApiClient0.execute(new w(googleApiClient0, locationRequest0, locationListener0));
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult requestLocationUpdates(GoogleApiClient googleApiClient0, LocationRequest locationRequest0, LocationListener locationListener0, Looper looper0) {
        return googleApiClient0.execute(new x(googleApiClient0, locationRequest0, locationListener0, looper0));
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult setMockLocation(GoogleApiClient googleApiClient0, Location location0) {
        return googleApiClient0.execute(new u(googleApiClient0, location0));
    }

    @Override  // com.google.android.gms.location.FusedLocationProviderApi
    public final PendingResult setMockMode(GoogleApiClient googleApiClient0, boolean z) {
        return googleApiClient0.execute(new t(googleApiClient0, z));
    }
}

