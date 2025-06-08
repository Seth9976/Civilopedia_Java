package e1;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.location.zzaa;
import com.google.android.gms.internal.location.zzah;

public final class C extends zzah {
    public final c i;

    public C(c c0) {
        this.i = c0;
    }

    @Override  // com.google.android.gms.internal.location.zzai
    public final void zzb(zzaa zzaa0) {
        Status status0 = zzaa0.getStatus();
        this.i.setResult(status0);
    }

    @Override  // com.google.android.gms.internal.location.zzai
    public final void zzc() {
    }
}

