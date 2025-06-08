package g1;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class m implements ResultHolder {
    public final TaskCompletionSource a;

    public m(TaskCompletionSource taskCompletionSource0) {
        this.a = taskCompletionSource0;
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
    public final void setFailedResult(Status status0) {
        ApiException apiException0 = new ApiException(status0);
        this.a.setException(apiException0);
    }

    @Override  // com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder
    public final void setResult(Object object0) {
        Status status0 = ((LocationSettingsResult)object0).getStatus();
        TaskCompletionSource taskCompletionSource0 = this.a;
        if(status0.isSuccess()) {
            taskCompletionSource0.setResult(new LocationSettingsResponse(((LocationSettingsResult)object0)));
            return;
        }
        if(status0.hasResolution()) {
            taskCompletionSource0.setException(new ResolvableApiException(status0));
            return;
        }
        taskCompletionSource0.setException(new ApiException(status0));
    }
}

