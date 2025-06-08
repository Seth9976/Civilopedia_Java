package androidx.customview.view;

import I.a;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final Parcelable i;
    public static final AbsSavedState j;

    static {
        AbsSavedState.j = new AbsSavedState() {  // 初始化器: Landroidx/customview/view/AbsSavedState;-><init>()V
        };
        AbsSavedState.CREATOR = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public AbsSavedState() {
        this.i = null;
    }

    public AbsSavedState(Parcel parcel0, ClassLoader classLoader0) {
        Parcelable parcelable0 = parcel0.readParcelable(classLoader0);
        if(parcelable0 == null) {
            parcelable0 = AbsSavedState.j;
        }
        this.i = parcelable0;
    }

    public AbsSavedState(Parcelable parcelable0) {
        if(parcelable0 == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if(parcelable0 == AbsSavedState.j) {
            parcelable0 = null;
        }
        this.i = parcelable0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        parcel0.writeParcelable(this.i, v);
    }
}

