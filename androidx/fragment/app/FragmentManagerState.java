package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public ArrayList i;
    public ArrayList j;
    public BackStackState[] k;
    public String l;
    public int m;

    static {
        FragmentManagerState.CREATOR = new b(1);
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeTypedList(this.i);
        parcel0.writeStringList(this.j);
        parcel0.writeTypedArray(this.k, v);
        parcel0.writeString(this.l);
        parcel0.writeInt(this.m);
    }
}

