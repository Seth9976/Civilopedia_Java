package android.support.v4.media;

import P0.d;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public class MediaBrowserCompat.MediaItem implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final MediaDescriptionCompat j;

    static {
        MediaBrowserCompat.MediaItem.CREATOR = new d(2);
    }

    public MediaBrowserCompat.MediaItem(Parcel parcel0) {
        this.i = parcel0.readInt();
        this.j = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(parcel0);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "MediaItem{mFlags=" + this.i + ", mDescription=" + this.j + '}';
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.i);
        this.j.writeToParcel(parcel0, v);
    }
}

