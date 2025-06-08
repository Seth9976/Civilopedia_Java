package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.AnyClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class BaseImplementation {
    @KeepForSdk
    public static abstract class ApiMethodImpl extends BasePendingResult implements ResultHolder {
        public final AnyClientKey p;
        public final Api q;

        public ApiMethodImpl(Api api0, GoogleApiClient googleApiClient0) {
            super(((GoogleApiClient)Preconditions.checkNotNull(googleApiClient0, "GoogleApiClient must not be null")));
            Preconditions.checkNotNull(api0, "Api must not be null");
            this.p = api0.zab();
            this.q = api0;
        }

        public abstract void c(AnyClient arg1);

        @KeepForSdk
        public final Api getApi() {
            return this.q;
        }

        @KeepForSdk
        public final AnyClientKey getClientKey() {
            return this.p;
        }

        @KeepForSdk
        public final void run(AnyClient api$AnyClient0) throws DeadObjectException {
            try {
                this.c(api$AnyClient0);
            }
            catch(DeadObjectException deadObjectException0) {
                this.setFailedResult(new Status(8, deadObjectException0.getLocalizedMessage(), null));
                throw deadObjectException0;
            }
            catch(RemoteException remoteException0) {
                this.setFailedResult(new Status(8, remoteException0.getLocalizedMessage(), null));
            }
        }

        @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
        @KeepForSdk
        public final void setFailedResult(Status status0) {
            Preconditions.checkArgument(!status0.isSuccess(), "Failed result must not be success");
            this.setResult(this.createFailedResult(status0));
        }

        @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
        @KeepForSdk
        public void setResult(Object object0) {
            this.setResult(((Result)object0));
        }
    }

    @KeepForSdk
    public interface ResultHolder {
        @KeepForSdk
        void setFailedResult(Status arg1);

        @KeepForSdk
        void setResult(Object arg1);
    }

}

