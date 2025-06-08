package androidx.activity.result;

import P0.d;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final IntentSender i;
    public final Intent j;
    public final int k;
    public final int l;

    static {
        IntentSenderRequest.CREATOR = new d(12);
    }

    public IntentSenderRequest(IntentSender intentSender0) {
        this.i = intentSender0;
        this.j = null;
        this.k = 0;
        this.l = 0;
    }

    public IntentSenderRequest(Parcel parcel0) {
        this.i = (IntentSender)parcel0.readParcelable(IntentSender.class.getClassLoader());
        this.j = (Intent)parcel0.readParcelable(Intent.class.getClassLoader());
        this.k = parcel0.readInt();
        this.l = parcel0.readInt();
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.i, v);
        parcel0.writeParcelable(this.j, v);
        parcel0.writeInt(this.k);
        parcel0.writeInt(this.l);
    }
}

