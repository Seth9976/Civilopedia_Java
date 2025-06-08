package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class c implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0 = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();  // 初始化器: Ljava/lang/Object;-><init>()V
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.i = parcel0.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.j = parcel0.readInt();
        staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.l = parcel0.readInt() == 1;
        int v = parcel0.readInt();
        if(v > 0) {
            int[] arr_v = new int[v];
            staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0.k = arr_v;
            parcel0.readIntArray(arr_v);
        }
        return staggeredGridLayoutManager$LazySpanLookup$FullSpanItem0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem[v];
    }
}

