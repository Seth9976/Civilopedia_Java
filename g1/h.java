package g1;

import S3.g;
import com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.internal.location.zzaz;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class h extends g {
    public final ListenerHolder j;

    public h(FusedLocationProviderClient fusedLocationProviderClient0, ListenerHolder listenerHolder0) {
        this.j = listenerHolder0;
        this.i = true;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        zzaz zzaz0 = (zzaz)object0;
        if(this.i) {
            i i0 = new i(0, ((TaskCompletionSource)object1));
            try {
                ListenerKey listenerHolder$ListenerKey0 = this.j.getListenerKey();
                if(listenerHolder$ListenerKey0 != null) {
                    zzaz0.zzH(listenerHolder$ListenerKey0, i0);
                }
            }
            catch(RuntimeException runtimeException0) {
                ((TaskCompletionSource)object1).trySetException(runtimeException0);
            }
        }
    }
}

