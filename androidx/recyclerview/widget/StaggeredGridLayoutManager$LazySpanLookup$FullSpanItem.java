package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.util.Arrays;

@SuppressLint({"BanParcelableUsage"})
class StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public int i;
    public int j;
    public int[] k;
    public boolean l;

    static {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.CREATOR = new c();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override
    public final String toString() {
        return "FullSpanItem{mPosition=" + this.i + ", mGapDir=" + this.j + ", mHasUnwantedGapAfter=" + this.l + ", mGapPerSpan=" + Arrays.toString(this.k) + '}';
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeInt(this.i);
        parcel0.writeInt(this.j);
        parcel0.writeInt(((int)this.l));
        int[] arr_v = this.k;
        if(arr_v != null && arr_v.length > 0) {
            parcel0.writeInt(arr_v.length);
            parcel0.writeIntArray(this.k);
            return;
        }
        parcel0.writeInt(0);
    }
}

