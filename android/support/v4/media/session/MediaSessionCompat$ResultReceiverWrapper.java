package android.support.v4.media.session;

import P0.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.ResultReceiver;

public final class MediaSessionCompat.ResultReceiverWrapper implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public ResultReceiver i;

    static {
        MediaSessionCompat.ResultReceiverWrapper.CREATOR = new d(7);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.i.writeToParcel(parcel0, v);
    }
}

