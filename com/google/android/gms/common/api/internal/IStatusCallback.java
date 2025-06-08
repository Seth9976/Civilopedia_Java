package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import com.google.android.gms.internal.base.zac;

public interface IStatusCallback extends IInterface {
    public static abstract class Stub extends zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        @Override  // com.google.android.gms.internal.base.zab
        public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
            if(v == 1) {
                Status status0 = (Status)zac.zaa(parcel0, Status.CREATOR);
                zac.zab(parcel0);
                this.onResult(status0);
                return true;
            }
            return false;
        }

        public static IStatusCallback asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return iInterface0 instanceof IStatusCallback ? ((IStatusCallback)iInterface0) : new zaby(iBinder0, "com.google.android.gms.common.api.internal.IStatusCallback");  // 初始化器: Lcom/google/android/gms/internal/base/zaa;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }
    }

    void onResult(Status arg1) throws RemoteException;
}

