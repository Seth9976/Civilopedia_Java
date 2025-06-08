package g1;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class d implements RemoteCall {
    public final int i;
    public static final d j;
    public static final d k;

    static {
        d.j = new d(0);
        d.k = new d(1);
    }

    public d(int v) {
        this.i = v;
        super();
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        if(this.i != 0) {
            ((zzaz)object0).zzK(new i(1, ((TaskCompletionSource)object1)));
            return;
        }
        ((TaskCompletionSource)object1).setResult(((zzaz)object0).zzA());
    }
}

