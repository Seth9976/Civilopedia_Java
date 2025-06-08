package android.support.v4.media.session;

import P0.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;

public final class MediaSessionCompat.QueueItem implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final MediaDescriptionCompat i;
    public final long j;

    static {
        MediaSessionCompat.QueueItem.CREATOR = new d(6);
    }

    public MediaSessionCompat.QueueItem(Parcel parcel0) {
        this.i = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel0);
        this.j = parcel0.readLong();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "MediaSession.QueueItem {Description=" + this.i + ", Id=" + this.j + " }";
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        this.i.writeToParcel(parcel0, v);
        parcel0.writeLong(this.j);
    }
}

