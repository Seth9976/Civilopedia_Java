package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class a implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        AppCompatSpinner.SavedState appCompatSpinner$SavedState0 = new AppCompatSpinner.SavedState(parcel0);  // 初始化器: Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V
        appCompatSpinner$SavedState0.i = parcel0.readByte() != 0;
        return appCompatSpinner$SavedState0;
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        return new AppCompatSpinner.SavedState[v];
    }
}

