package android.support.v4.media.session;

import P0.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class MediaSessionCompat.Token implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Parcelable i;

    static {
        MediaSessionCompat.Token.CREATOR = new d(8);
    }

    public MediaSessionCompat.Token(Parcelable parcelable0) {
        this.i = parcelable0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof MediaSessionCompat.Token)) {
            return false;
        }
        Parcelable parcelable0 = this.i;
        if(parcelable0 == null) {
            return ((MediaSessionCompat.Token)object0).i == null;
        }
        Parcelable parcelable1 = ((MediaSessionCompat.Token)object0).i;
        return parcelable1 == null ? false : parcelable0.equals(parcelable1);
    }

    @Override
    public final int hashCode() {
        return this.i == null ? 0 : this.i.hashCode();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.i, v);
    }
}

