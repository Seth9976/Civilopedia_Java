package com.google.android.gms.location;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.location.zzbe;

@VisibleForTesting
public interface Geofence {
    @VisibleForTesting
    public static final class Builder {
        public String a;
        public int b;
        public long c;
        public short d;
        public double e;
        public double f;
        public float g;
        public int h;
        public int i;

        public Builder() {
            this.a = null;
            this.b = 0;
            this.c = 0x8000000000000000L;
            this.d = -1;
            this.h = 0;
            this.i = -1;
        }

        public Geofence build() {
            String s = this.a;
            if(s == null) {
                throw new IllegalArgumentException("Request ID not set.");
            }
            int v = this.b;
            if(v == 0) {
                throw new IllegalArgumentException("Transitions types not set.");
            }
            if((v & 4) != 0 && this.i < 0) {
                throw new IllegalArgumentException("Non-negative loitering delay needs to be set when transition types include GEOFENCE_TRANSITION_DWELLING.");
            }
            long v1 = this.c;
            if(v1 == 0x8000000000000000L) {
                throw new IllegalArgumentException("Expiration not set.");
            }
            if(this.d == -1) {
                throw new IllegalArgumentException("Geofence region not set.");
            }
            int v2 = this.h;
            if(v2 < 0) {
                throw new IllegalArgumentException("Notification responsiveness should be nonnegative.");
            }
            return new zzbe(s, v, 1, this.e, this.f, this.g, v1, v2, this.i);
        }

        public Builder setCircularRegion(double f, double f1, float f2) {
            boolean z = false;
            Preconditions.checkArgument(f >= -90.0 && f <= 90.0, "Invalid latitude: " + f);
            Preconditions.checkArgument(f1 >= -180.0 && f1 <= 180.0, "Invalid longitude: " + f1);
            if(f2 > 0.0f) {
                z = true;
            }
            Preconditions.checkArgument(z, "Invalid radius: " + f2);
            this.d = 1;
            this.e = f;
            this.f = f1;
            this.g = f2;
            return this;
        }

        public Builder setExpirationDuration(long v) {
            if(v < 0L) {
                this.c = -1L;
                return this;
            }
            this.c = DefaultClock.getInstance().elapsedRealtime() + v;
            return this;
        }

        public Builder setLoiteringDelay(int v) {
            this.i = v;
            return this;
        }

        public Builder setNotificationResponsiveness(int v) {
            this.h = v;
            return this;
        }

        public Builder setRequestId(String s) {
            this.a = (String)Preconditions.checkNotNull(s, "Request ID can\'t be set to null");
            return this;
        }

        public Builder setTransitionTypes(@TransitionTypes int v) {
            this.b = v;
            return this;
        }
    }

    public @interface GeofenceTransition {
    }

    public @interface TransitionTypes {
    }

    public static final int GEOFENCE_TRANSITION_DWELL = 4;
    public static final int GEOFENCE_TRANSITION_ENTER = 1;
    public static final int GEOFENCE_TRANSITION_EXIT = 2;
    public static final long NEVER_EXPIRE = -1L;

    String getRequestId();
}

