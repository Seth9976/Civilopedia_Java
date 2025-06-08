package a1;

import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.internal.appset.zze;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class c extends zze {
    public final TaskCompletionSource i;

    public c(TaskCompletionSource taskCompletionSource0) {
        this.i = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status0, zzc zzc0) {
        TaskUtil.setResultOrApiException(status0, (zzc0 == null ? null : new AppSetIdInfo(zzc0.zzb(), zzc0.zza())), this.i);
    }
}

