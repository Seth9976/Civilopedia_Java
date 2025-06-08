package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Reserved;
import com.google.android.gms.internal.location.zzbe;
import i3.e;
import java.util.ArrayList;
import java.util.List;

@Class(creator = "GeofencingRequestCreator")
@Reserved({1000})
public class GeofencingRequest extends AbstractSafeParcelable {
    public static final class Builder {
        public final ArrayList a;
        public int b;
        public final String c;

        public Builder() {
            this.a = new ArrayList();
            this.b = 5;
            this.c = "";
        }

        public Builder addGeofence(Geofence geofence0) {
            Preconditions.checkNotNull(geofence0, "geofence can\'t be null.");
            Preconditions.checkArgument(geofence0 instanceof zzbe, "Geofence must be created using Geofence.Builder.");
            this.a.add(((zzbe)geofence0));
            return this;
        }

        public Builder addGeofences(List list0) {
            if(list0 != null && !list0.isEmpty()) {
                for(Object object0: list0) {
                    Geofence geofence0 = (Geofence)object0;
                    if(geofence0 != null) {
                        this.addGeofence(geofence0);
                    }
                }
            }
            return this;
        }

        public GeofencingRequest build() {
            Preconditions.checkArgument(!this.a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.a, this.b, this.c, null);
        }

        public Builder setInitialTrigger(@InitialTrigger int v) {
            this.b = v & 7;
            return this;
        }
    }

    public @interface InitialTrigger {
    }

    public static final Parcelable.Creator CREATOR = null;
    public static final int INITIAL_TRIGGER_DWELL = 4;
    public static final int INITIAL_TRIGGER_ENTER = 1;
    public static final int INITIAL_TRIGGER_EXIT = 2;
    public final ArrayList i;
    public final int j;
    public final String k;
    public final String l;

    static {
        GeofencingRequest.CREATOR = new zzau();
    }

    public GeofencingRequest(ArrayList arrayList0, int v, String s, String s1) {
        this.i = arrayList0;
        this.j = v;
        this.k = s;
        this.l = s1;
    }

    public List getGeofences() {
        List list0 = new ArrayList();
        ((ArrayList)list0).addAll(this.i);
        return list0;
    }

    @InitialTrigger
    public int getInitialTrigger() {
        return this.j;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("GeofencingRequest[geofences=");
        stringBuilder0.append(this.i);
        stringBuilder0.append(", initialTrigger=");
        stringBuilder0.append(this.j);
        stringBuilder0.append(", tag=");
        stringBuilder0.append(this.k);
        stringBuilder0.append(", attributionTag=");
        return e.h(stringBuilder0, this.l, "]");
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeTypedList(parcel0, 1, this.i, false);
        SafeParcelWriter.writeInt(parcel0, 2, this.getInitialTrigger());
        SafeParcelWriter.writeString(parcel0, 3, this.k, false);
        SafeParcelWriter.writeString(parcel0, 4, this.l, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public final GeofencingRequest zza(String s) {
        return new GeofencingRequest(this.i, this.j, this.k, s);
    }
}

