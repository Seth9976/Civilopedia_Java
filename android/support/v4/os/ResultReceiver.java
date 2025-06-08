package android.support.v4.os;

import P0.d;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import b.b;
import b.c;

@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public b i;

    static {
        ResultReceiver.CREATOR = new d(13);
    }

    public void a(int v, Bundle bundle0) {
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        synchronized(this) {
            if(this.i == null) {
                this.i = new c(this);
            }
            parcel0.writeStrongBinder(this.i.asBinder());
        }
    }
}

