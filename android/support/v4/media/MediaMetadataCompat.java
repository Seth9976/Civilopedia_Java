package android.support.v4.media;

import P0.d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import p.b;

public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Bundle i;

    static {
        b b0 = new b();  // 初始化器: Lp/k;-><init>()V
        b0.put("android.media.metadata.TITLE", 1);
        b0.put("android.media.metadata.ARTIST", 1);
        b0.put("android.media.metadata.DURATION", 0);
        b0.put("android.media.metadata.ALBUM", 1);
        b0.put("android.media.metadata.AUTHOR", 1);
        b0.put("android.media.metadata.WRITER", 1);
        b0.put("android.media.metadata.COMPOSER", 1);
        b0.put("android.media.metadata.COMPILATION", 1);
        b0.put("android.media.metadata.DATE", 1);
        b0.put("android.media.metadata.YEAR", 0);
        b0.put("android.media.metadata.GENRE", 1);
        b0.put("android.media.metadata.TRACK_NUMBER", 0);
        b0.put("android.media.metadata.NUM_TRACKS", 0);
        b0.put("android.media.metadata.DISC_NUMBER", 0);
        b0.put("android.media.metadata.ALBUM_ARTIST", 1);
        b0.put("android.media.metadata.ART", 2);
        b0.put("android.media.metadata.ART_URI", 1);
        b0.put("android.media.metadata.ALBUM_ART", 2);
        b0.put("android.media.metadata.ALBUM_ART_URI", 1);
        b0.put("android.media.metadata.USER_RATING", 3);
        b0.put("android.media.metadata.RATING", 3);
        b0.put("android.media.metadata.DISPLAY_TITLE", 1);
        b0.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        b0.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        b0.put("android.media.metadata.DISPLAY_ICON", 2);
        b0.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        b0.put("android.media.metadata.MEDIA_ID", 1);
        b0.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        b0.put("android.media.metadata.MEDIA_URI", 1);
        b0.put("android.media.metadata.ADVERTISEMENT", 0);
        b0.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        MediaMetadataCompat.CREATOR = new d(4);
    }

    public MediaMetadataCompat(Parcel parcel0) {
        this.i = parcel0.readBundle(a.class.getClassLoader());
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeBundle(this.i);
    }
}

