package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzeg;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;

public final class l2 extends zzcdv {
    public final QueryInfoGenerationCallback i;

    public l2(QueryInfoGenerationCallback queryInfoGenerationCallback0) {
        this.i = queryInfoGenerationCallback0;
        super();
    }

    @Override  // com.google.android.gms.internal.ads.zzcdw
    public final void zzb(String s) {
        this.i.onFailure(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcdw
    public final void zzc(String s, String s1, Bundle bundle0) {
        QueryInfo queryInfo0 = new QueryInfo(new zzeg(s, bundle0, s1));
        this.i.onSuccess(queryInfo0);
    }
}

