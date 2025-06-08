package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class e implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        SavedState staggeredGridLayoutManager$SavedState0 = new SavedState();  // 初始化器: Ljava/lang/Object;-><init>()V
        staggeredGridLayoutManager$SavedState0.i = parcel0.readInt();
        staggeredGridLayoutManager$SavedState0.j = parcel0.readInt();
        int v = parcel0.readInt();
        staggeredGridLayoutManager$SavedState0.k = v;
        if(v > 0) {
            int[] arr_v = new int[v];
            staggeredGridLayoutManager$SavedState0.l = arr_v;
            parcel0.readIntArray(arr_v);
        }
        int v1 = parcel0.readInt();
        staggeredGridLayoutManager$SavedState0.m = v1;
        if(v1 > 0) {
            int[] arr_v1 = new int[v1];
            staggeredGridLayoutManager$SavedState0.n = arr_v1;
            parcel0.readIntArray(arr_v1);
        }
        boolean z = false;
        staggeredGridLayoutManager$SavedState0.p = parcel0.readInt() == 1;
        staggeredGridLayoutManager$SavedState0.q = parcel0.readInt() == 1;
        if(parcel0.readInt() == 1) {
            z = true;
        }
        staggeredGridLayoutManager$SavedState0.r = z;
        staggeredGridLayoutManager$SavedState0.o = parcel0.readArrayList(StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem.class.getClassLoader());
        return staggeredGridLayoutManager$SavedState0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SavedState[v];
    }
}

