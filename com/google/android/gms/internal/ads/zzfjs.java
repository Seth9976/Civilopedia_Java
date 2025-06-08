package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public final class zzfjs extends zzfjp {
    public WebView d;
    public Long e;
    public final Map f;

    public zzfjs(Map map0, String s) {
        this.e = null;
        this.f = map0;
    }

    @Override  // com.google.android.gms.internal.ads.zzfjp
    public final void zzc() {
        super.zzc();
        long v = this.e == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - ((long)this.e), TimeUnit.NANOSECONDS);
        new Handler().postDelayed(new A0(this), Math.max(4000L - v, 2000L));
        this.d = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfjp
    public final void zzf(zzfir zzfir0, zzfip zzfip0) {
        JSONObject jSONObject0 = new JSONObject();
        Map map0 = zzfip0.zzi();
        for(Object object0: map0.keySet()) {
            zzfjt.zzg(jSONObject0, ((String)object0), ((zzfix)map0.get(((String)object0))));
        }
        this.a(zzfir0, zzfip0, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzfjp
    public final void zzj() {
        WebView webView0 = new WebView(zzfjg.zzb().zza());
        this.d = webView0;
        webView0.getSettings().setJavaScriptEnabled(true);
        this.a = new zzfkn(this.d);
        WebView webView1 = this.d;
        if(webView1 != null && !TextUtils.isEmpty(null)) {
            webView1.loadUrl("javascript: null");
        }
        Map map0 = this.f;
        Iterator iterator0 = map0.keySet().iterator();
        if(!iterator0.hasNext()) {
            this.e = System.nanoTime();
            return;
        }
        Object object0 = iterator0.next();
        zzfix zzfix0 = (zzfix)map0.get(((String)object0));
        throw null;
    }
}

