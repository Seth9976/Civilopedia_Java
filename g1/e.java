package g1;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class e implements RemoteCall {
    public final int i;
    public final PendingIntent j;

    public e(int v, PendingIntent pendingIntent0) {
        this.i = v;
        this.j = pendingIntent0;
        super();
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        switch(this.i) {
            case 0: {
                i i0 = new i(1, ((TaskCompletionSource)object1));
                ((zzaz)object0).zzG(this.j, i0);
                return;
            }
            case 1: {
                k k0 = new k(((TaskCompletionSource)object1));
                ((zzaz)object0).zzx(this.j, k0);
                return;
            }
            default: {
                q q0 = new q(((TaskCompletionSource)object1));
                ((zzaz)object0).zzs(this.j, q0);
            }
        }
    }
}

