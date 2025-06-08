package android.support.v4.media.session;

import P0.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    static {
        ParcelableVolumeInfo.CREATOR = new d(9);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.i);
        parcel0.writeInt(this.k);
        parcel0.writeInt(this.l);
        parcel0.writeInt(this.m);
        parcel0.writeInt(this.j);
    }
}

