package g1;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class o implements RemoteCall {
    public final int i;
    public final PendingIntent j;

    public o(int v, PendingIntent pendingIntent0) {
        this.i = v;
        this.j = pendingIntent0;
        super();
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        if(this.i != 0) {
            q q0 = new q(((TaskCompletionSource)object1));
            ((zzaz)object0).zzu(this.j, q0);
            return;
        }
        ((zzaz)object0).zzt(this.j);
        ((TaskCompletionSource)object1).setResult(null);
    }
}

