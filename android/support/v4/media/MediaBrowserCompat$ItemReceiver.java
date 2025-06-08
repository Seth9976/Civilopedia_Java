package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.support.v4.os.ResultReceiver;

class MediaBrowserCompat.ItemReceiver extends ResultReceiver {
    @Override  // android.support.v4.os.ResultReceiver
    public final void a(int v, Bundle bundle0) {
        if(bundle0 != null) {
            bundle0.setClassLoader(a.class.getClassLoader());
        }
        if(v != 0 || bundle0 == null || !bundle0.containsKey("media_item")) {
            throw null;
        }
        Parcelable parcelable0 = bundle0.getParcelable("media_item");
        if(parcelable0 != null && !(parcelable0 instanceof MediaBrowserCompat.MediaItem)) {
            throw null;
        }
        MediaBrowserCompat.MediaItem mediaBrowserCompat$MediaItem0 = (MediaBrowserCompat.MediaItem)parcelable0;
        throw null;
    }
}

