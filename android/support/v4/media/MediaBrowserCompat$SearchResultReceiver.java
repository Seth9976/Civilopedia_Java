package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.a;
import android.support.v4.os.ResultReceiver;
import java.util.ArrayList;

class MediaBrowserCompat.SearchResultReceiver extends ResultReceiver {
    @Override  // android.support.v4.os.ResultReceiver
    public final void a(int v, Bundle bundle0) {
        if(bundle0 != null) {
            bundle0.setClassLoader(a.class.getClassLoader());
        }
        if(v != 0 || bundle0 == null || !bundle0.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] arr_parcelable = bundle0.getParcelableArray("search_results");
        if(arr_parcelable != null) {
            ArrayList arrayList0 = new ArrayList();
            for(int v1 = 0; v1 < arr_parcelable.length; ++v1) {
                arrayList0.add(((MediaBrowserCompat.MediaItem)arr_parcelable[v1]));
            }
        }
        throw null;
    }
}

