package L0;

import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class a extends BasePendingResult {
    public final int p;
    public final Result q;

    public a(Result result0) {
        this.p = 0;
        super(Looper.getMainLooper());
        this.q = result0;
    }

    public a(Result result0, GoogleApiClient googleApiClient0) {
        this.p = 1;
        super(googleApiClient0);
        this.q = result0;
    }

    @Override  // com.google.android.gms.common.api.internal.BasePendingResult
    public final Result createFailedResult(Status status0) {
        if(this.p != 0) {
            return this.q;
        }
        Result result0 = this.q;
        if(status0.getStatusCode() != result0.getStatus().getStatusCode()) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
        return result0;
    }
}

