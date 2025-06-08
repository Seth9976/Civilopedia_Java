package D0;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.internal.client.zzax;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdu;

public final class o extends zzax {
    public final zzdu k;

    public o(zzdu zzdu0) {
        this.k = zzdu0;
        super();
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final void onAdFailedToLoad(LoadAdError loadAdError0) {
        zzdk zzdk0 = this.k.zzi();
        this.k.d.zzb(zzdk0);
        super.onAdFailedToLoad(loadAdError0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzax
    public final void onAdLoaded() {
        zzdk zzdk0 = this.k.zzi();
        this.k.d.zzb(zzdk0);
        super.onAdLoaded();
    }
}

