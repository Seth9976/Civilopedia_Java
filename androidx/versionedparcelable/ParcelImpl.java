package androidx.versionedparcelable;

import P0.d;
import W.b;
import W.c;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final c i;

    static {
        ParcelImpl.CREATOR = new d(1);
    }

    public ParcelImpl(Parcel parcel0) {
        this.i = new b(parcel0).h();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        new b(parcel0).k(this.i);
    }
}

