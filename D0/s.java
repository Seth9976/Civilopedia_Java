package D0;

import B.b;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzeo;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

public final class s extends zzbk {
    public final zzeo i;

    public s(zzeo zzeo0) {
        this.i = zzeo0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final String zze() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final String zzf() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzg(zzl zzl0) {
        this.zzh(zzl0, 1);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final void zzh(zzl zzl0, int v) {
        zzcfi.zzg("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        b b0 = new b(this, 1);
        zzcfb.zza.post(b0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbl
    public final boolean zzi() {
        return false;
    }
}

