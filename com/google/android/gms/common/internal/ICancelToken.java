package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;

public interface ICancelToken extends IInterface {
    public static abstract class Stub extends zzb implements ICancelToken {
        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @Override  // com.google.android.gms.internal.common.zzb
        public final boolean a(int v, Parcel parcel0, Parcel parcel1) {
            if(v == 2) {
                this.cancel();
                return true;
            }
            return false;
        }

        public static ICancelToken asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterface0 instanceof ICancelToken ? ((ICancelToken)iInterface0) : new zzx(iBinder0, "com.google.android.gms.common.internal.ICancelToken");  // 初始化器: Lcom/google/android/gms/internal/common/zza;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V
        }
    }

    void cancel() throws RemoteException;
}

