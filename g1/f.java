package g1;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class f implements RemoteCall {
    public final boolean i;

    public f(boolean z) {
        this.i = z;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((zzaz)object0).zzI(this.i);
        ((TaskCompletionSource)object1).setResult(null);
    }
}

