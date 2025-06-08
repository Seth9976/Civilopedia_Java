package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

public final class b implements Parcelable.Creator {
    public final int a;

    public b(int v) {
        this.a = v;
        super();
    }

    @Override  // android.os.Parcelable$Creator
    public final Object createFromParcel(Parcel parcel0) {
        switch(this.a) {
            case 0: {
                return new BackStackState(parcel0);
            }
            case 1: {
                FragmentManagerState fragmentManagerState0 = new FragmentManagerState();  // 初始化器: Ljava/lang/Object;-><init>()V
                fragmentManagerState0.l = null;
                fragmentManagerState0.i = parcel0.createTypedArrayList(FragmentState.CREATOR);
                fragmentManagerState0.j = parcel0.createStringArrayList();
                fragmentManagerState0.k = (BackStackState[])parcel0.createTypedArray(BackStackState.CREATOR);
                fragmentManagerState0.l = parcel0.readString();
                fragmentManagerState0.m = parcel0.readInt();
                return fragmentManagerState0;
            }
            default: {
                return new FragmentState(parcel0);
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public final Object[] newArray(int v) {
        switch(this.a) {
            case 0: {
                return new BackStackState[v];
            }
            case 1: {
                return new FragmentManagerState[v];
            }
            default: {
                return new FragmentState[v];
            }
        }
    }
}

