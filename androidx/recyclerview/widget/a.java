package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        SavedState linearLayoutManager$SavedState0 = new SavedState();  // 初始化器: Ljava/lang/Object;-><init>()V
        linearLayoutManager$SavedState0.i = parcel0.readInt();
        linearLayoutManager$SavedState0.j = parcel0.readInt();
        linearLayoutManager$SavedState0.k = parcel0.readInt() == 1;
        return linearLayoutManager$SavedState0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new SavedState[v];
    }
}

