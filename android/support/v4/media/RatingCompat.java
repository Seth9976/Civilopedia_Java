package android.support.v4.media;

import P0.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final float j;

    static {
        RatingCompat.CREATOR = new d(5);
    }

    public RatingCompat(int v, float f) {
        this.i = v;
        this.j = f;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return this.i;
    }

    @Override
    public final String toString() {
        return "Rating:style=" + this.i + " rating=" + (this.j < 0.0f ? "unrated" : String.valueOf(this.j));
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.i);
        parcel0.writeFloat(this.j);
    }
}

