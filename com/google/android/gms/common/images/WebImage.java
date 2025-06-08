package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable.Class;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator = "WebImageCreator")
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final int i;
    public final Uri j;
    public final int k;
    public final int l;

    static {
        WebImage.CREATOR = new zah();
    }

    public WebImage(int v, Uri uri0, int v1, int v2) {
        this.i = v;
        this.j = uri0;
        this.k = v1;
        this.l = v2;
    }

    public WebImage(Uri uri0) throws IllegalArgumentException {
        this(uri0, 0, 0);
    }

    public WebImage(Uri uri0, int v, int v1) throws IllegalArgumentException {
        this(1, uri0, v, v1);
        if(uri0 == null) {
            throw new IllegalArgumentException("url cannot be null");
        }
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException("width and height must not be negative");
        }
    }

    @KeepForSdk
    public WebImage(JSONObject jSONObject0) throws IllegalArgumentException {
        Uri uri0 = Uri.EMPTY;
        if(jSONObject0.has("url")) {
            try {
                uri0 = Uri.parse(jSONObject0.getString("url"));
            }
            catch(JSONException unused_ex) {
            }
        }
        this(uri0, jSONObject0.optInt("width", 0), jSONObject0.optInt("height", 0));
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return this == object0 ? true : object0 != null && object0 instanceof WebImage && Objects.equal(this.j, ((WebImage)object0).j) && this.k == ((WebImage)object0).k && this.l == ((WebImage)object0).l;
    }

    public int getHeight() {
        return this.l;
    }

    public Uri getUrl() {
        return this.j;
    }

    public int getWidth() {
        return this.k;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.j, this.k, this.l});
    }

    @KeepForSdk
    public JSONObject toJson() {
        JSONObject jSONObject0 = new JSONObject();
        try {
            jSONObject0.put("url", this.j.toString());
            jSONObject0.put("width", this.k);
            jSONObject0.put("height", this.l);
        }
        catch(JSONException unused_ex) {
        }
        return jSONObject0;
    }

    @Override
    public String toString() {
        return "Image " + this.k + "x" + this.l + " " + this.j.toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.i);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.getUrl(), v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.getWidth());
        SafeParcelWriter.writeInt(parcel0, 4, this.getHeight());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

