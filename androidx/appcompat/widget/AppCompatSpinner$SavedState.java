package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class AppCompatSpinner.SavedState extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR;
    public boolean i;

    static {
        AppCompatSpinner.SavedState.CREATOR = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // android.view.View$BaseSavedState
    public final void writeToParcel(Parcel parcel0, int v) {
        super.writeToParcel(parcel0, v);
        parcel0.writeByte(((byte)this.i));
    }
}

