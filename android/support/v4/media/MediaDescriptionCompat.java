package android.support.v4.media;

import P0.d;
import android.graphics.Bitmap;
import android.media.MediaDescription.Builder;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String i;
    public final CharSequence j;
    public final CharSequence k;
    public final CharSequence l;
    public final Bitmap m;
    public final Uri n;
    public final Bundle o;
    public final Uri p;
    public Object q;

    static {
        MediaDescriptionCompat.CREATOR = new d(3);
    }

    public MediaDescriptionCompat(String s, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, Bitmap bitmap0, Uri uri0, Bundle bundle0, Uri uri1) {
        this.i = s;
        this.j = charSequence0;
        this.k = charSequence1;
        this.l = charSequence2;
        this.m = bitmap0;
        this.n = uri0;
        this.o = bundle0;
        this.p = uri1;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return this.j + ", " + this.k + ", " + this.l;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = Build.VERSION.SDK_INT;
        MediaDescription mediaDescription0 = this.q;
        if(mediaDescription0 == null) {
            MediaDescription.Builder mediaDescription$Builder0 = new MediaDescription.Builder();
            mediaDescription$Builder0.setMediaId(this.i);
            mediaDescription$Builder0.setTitle(this.j);
            mediaDescription$Builder0.setSubtitle(this.k);
            mediaDescription$Builder0.setDescription(this.l);
            mediaDescription$Builder0.setIconBitmap(this.m);
            mediaDescription$Builder0.setIconUri(this.n);
            Uri uri0 = this.p;
            Bundle bundle0 = this.o;
            if(v1 < 23 && uri0 != null) {
                if(bundle0 == null) {
                    bundle0 = new Bundle();
                    bundle0.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle0.putParcelable("android.support.v4.media.description.MEDIA_URI", uri0);
            }
            mediaDescription$Builder0.setExtras(bundle0);
            if(v1 >= 23) {
                mediaDescription$Builder0.setMediaUri(uri0);
            }
            mediaDescription0 = mediaDescription$Builder0.build();
            this.q = mediaDescription0;
        }
        mediaDescription0.writeToParcel(parcel0, v);
    }
}

