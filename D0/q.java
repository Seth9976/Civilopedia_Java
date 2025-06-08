package D0;

import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.internal.client.zzcx;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzed;

public final class q extends zzcx {
    public final int i;

    public q(int v) {
        this.i = v;
        super();
    }

    private final void b(zze zze0) {
    }

    private final void c(zze zze0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzcy
    public final void zze(zze zze0) {
        if(this.i != 0) {
            return;
        }
        OnAdInspectorClosedListener onAdInspectorClosedListener0 = zzed.zzf().g;
        if(onAdInspectorClosedListener0 != null) {
            onAdInspectorClosedListener0.onAdInspectorClosed((zze0 == null ? null : new AdInspectorError(zze0.zza, zze0.zzb, zze0.zzc)));
        }
    }
}

