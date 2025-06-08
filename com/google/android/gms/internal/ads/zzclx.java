package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public final class zzclx extends FrameLayout implements zzcli {
    public final zzcli i;
    public final zzchg j;
    public final AtomicBoolean k;

    public zzclx(zzcli zzcli0) {
        super(zzcli0.getContext());
        this.k = new AtomicBoolean();
        this.i = zzcli0;
        this.j = new zzchg(zzcli0.zzG(), this, this);
        this.addView(((View)zzcli0));
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean canGoBack() {
        return this.i.canGoBack();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void destroy() {
        IObjectWrapper iObjectWrapper0 = this.zzS();
        zzcli zzcli0 = this.i;
        if(iObjectWrapper0 != null) {
            zzclv zzclv0 = new zzclv(iObjectWrapper0);
            zzs.zza.post(zzclv0);
            zzcli0.getClass();
            zzclw zzclw0 = new zzclw(zzcli0);
            long v = (long)(((int)(((Integer)zzay.zzc().zzb(zzbhz.zzec)))));
            zzs.zza.postDelayed(zzclw0, v);
            return;
        }
        zzcli0.destroy();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void goBack() {
        this.i.goBack();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void loadData(String s, String s1, String s2) {
        this.i.loadData(s, "text/html", s2);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4) {
        this.i.loadDataWithBaseURL(s, s1, "text/html", "UTF-8", null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void loadUrl(String s) {
        this.i.loadUrl(s);
    }

    @Override  // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcli zzcli0 = this.i;
        if(zzcli0 != null) {
            zzcli0.onAdClicked();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void onPause() {
        this.j.zze();
        this.i.onPause();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void onResume() {
        this.i.onResume();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli, android.view.View
    public final void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.i.setOnClickListener(view$OnClickListener0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli, android.view.View
    public final void setOnTouchListener(View.OnTouchListener view$OnTouchListener0) {
        this.i.setOnTouchListener(view$OnTouchListener0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void setWebChromeClient(WebChromeClient webChromeClient0) {
        this.i.setWebChromeClient(webChromeClient0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void setWebViewClient(WebViewClient webViewClient0) {
        this.i.setWebViewClient(webViewClient0);
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzA(int v) {
        this.i.zzA(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzB(boolean z) {
        this.i.zzB(false);
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzC(int v) {
        this.i.zzC(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzD(int v) {
        this.j.zzf(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzE(zzcme zzcme0) {
        this.i.zzE(zzcme0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzfbl zzF() {
        return this.i.zzF();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final Context zzG() {
        return this.i.zzG();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final View zzH() {
        return this;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final WebView zzI() {
        return (WebView)this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final WebViewClient zzJ() {
        return this.i.zzJ();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzaoc zzK() {
        return this.i.zzK();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzbca zzL() {
        return this.i.zzL();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzbko zzM() {
        return this.i.zzM();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzl zzN() {
        return this.i.zzN();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzl zzO() {
        return this.i.zzO();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzcmv zzP() {
        return ((o3)this.i).u;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzcmx zzQ() {
        return this.i.zzQ();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzfbo zzR() {
        return this.i.zzR();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final IObjectWrapper zzS() {
        return this.i.zzS();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzfvl zzT() {
        return this.i.zzT();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final String zzU() {
        return this.i.zzU();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzV(zzfbl zzfbl0, zzfbo zzfbo0) {
        this.i.zzV(zzfbl0, zzfbo0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzW() {
        this.j.zzd();
        this.i.zzW();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzX() {
        this.i.zzX();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzY(int v) {
        this.i.zzY(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzZ() {
        this.i.zzZ();
    }

    @Override  // com.google.android.gms.internal.ads.zzbrq
    public final void zza(String s) {
        ((o3)this.i).d(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaA(boolean z, int v) {
        if(!this.k.compareAndSet(false, true)) {
            return true;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzaF)).booleanValue()) {
            return false;
        }
        zzcli zzcli0 = this.i;
        if(zzcli0.getParent() instanceof ViewGroup) {
            ((ViewGroup)zzcli0.getParent()).removeView(((View)zzcli0));
        }
        zzcli0.zzaA(z, v);
        return true;
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaB() {
        return this.i.zzaB();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaC() {
        return this.i.zzaC();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaD() {
        return this.k.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaE() {
        return this.i.zzaE();
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaF(zzc zzc0, boolean z) {
        this.i.zzaF(zzc0, z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaG(zzbr zzbr0, zzees zzees0, zzdwh zzdwh0, zzfgp zzfgp0, String s, String s1, int v) {
        this.i.zzaG(zzbr0, zzees0, zzdwh0, zzfgp0, s, s1, 14);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaH(boolean z, int v, boolean z1) {
        this.i.zzaH(z, v, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaI(boolean z, int v, String s, boolean z1) {
        this.i.zzaI(z, v, s, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcmn
    public final void zzaJ(boolean z, int v, String s, String s1, boolean z1) {
        this.i.zzaJ(z, v, s, s1, z1);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaa() {
        HashMap hashMap0 = new HashMap(3);
        hashMap0.put("app_muted", String.valueOf(zzt.zzr().zze()));
        hashMap0.put("app_volume", String.valueOf(zzt.zzr().zza()));
        hashMap0.put("device_volume", String.valueOf(zzab.zzb(((o3)this.i).getContext())));
        ((o3)this.i).zzd("volume", hashMap0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzab(boolean z) {
        this.i.zzab(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzac() {
        this.i.zzac();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzad(String s, String s1, String s2) {
        this.i.zzad(s, s1, null);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzae() {
        this.i.zzae();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaf(String s, zzbom zzbom0) {
        this.i.zzaf(s, zzbom0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzag() {
        TextView textView0 = new TextView(this.getContext());
        textView0.setText(zzs.zzv());
        textView0.setTextSize(15.0f);
        textView0.setTextColor(-1);
        textView0.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable0 = new GradientDrawable();
        gradientDrawable0.setShape(0);
        gradientDrawable0.setColor(-12303292);
        gradientDrawable0.setCornerRadius(8.0f);
        textView0.setBackground(gradientDrawable0);
        this.addView(textView0, new FrameLayout.LayoutParams(-2, -2, 49));
        this.bringChildToFront(textView0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzah(zzl zzl0) {
        this.i.zzah(zzl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzai(zzcmx zzcmx0) {
        this.i.zzai(zzcmx0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaj(zzbca zzbca0) {
        this.i.zzaj(zzbca0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzak(boolean z) {
        this.i.zzak(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzal() {
        this.setBackgroundColor(0);
        this.i.setBackgroundColor(0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzam(Context context0) {
        this.i.zzam(context0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzan(boolean z) {
        this.i.zzan(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzao(zzbkm zzbkm0) {
        this.i.zzao(zzbkm0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzap(boolean z) {
        this.i.zzap(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaq(zzbko zzbko0) {
        this.i.zzaq(zzbko0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzar(IObjectWrapper iObjectWrapper0) {
        this.i.zzar(iObjectWrapper0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzas(int v) {
        this.i.zzas(v);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzat(zzl zzl0) {
        this.i.zzat(zzl0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzau(boolean z) {
        this.i.zzau(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzav(boolean z) {
        this.i.zzav(z);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzaw(String s, zzbom zzbom0) {
        this.i.zzaw(s, zzbom0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzax(String s, Predicate predicate0) {
        this.i.zzax(s, predicate0);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzay() {
        return this.i.zzay();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final boolean zzaz() {
        return this.i.zzaz();
    }

    @Override  // com.google.android.gms.internal.ads.zzbrq
    public final void zzb(String s, String s1) {
        this.i.zzb("window.inspectorInfo", s1);
    }

    @Override  // com.google.android.gms.ads.internal.zzl
    public final void zzbn() {
        this.i.zzbn();
    }

    @Override  // com.google.android.gms.ads.internal.zzl
    public final void zzbo() {
        this.i.zzbo();
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final zzchg zzbp() {
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzban
    public final void zzc(zzbam zzbam0) {
        this.i.zzc(zzbam0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zzd(String s, Map map0) {
        this.i.zzd(s, map0);
    }

    @Override  // com.google.android.gms.internal.ads.zzbrd
    public final void zze(String s, JSONObject jSONObject0) {
        this.i.zze(s, jSONObject0);
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzf() {
        return this.i.zzf();
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzg() {
        return this.i.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzh() {
        return this.i.zzh();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzi() {
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzcU)).booleanValue() ? this.i.getMeasuredHeight() : this.getMeasuredHeight();
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.internal.ads.zzchr
    public final int zzj() {
        return ((Boolean)zzay.zzc().zzb(zzbhz.zzcU)).booleanValue() ? this.i.getMeasuredWidth() : this.getMeasuredWidth();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final Activity zzk() {
        return this.i.zzk();
    }

    @Override  // com.google.android.gms.internal.ads.zzbrq
    public final void zzl(String s, JSONObject jSONObject0) {
        ((o3)this.i).zzb(s, jSONObject0.toString());
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zza zzm() {
        return this.i.zzm();
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final zzbil zzn() {
        return this.i.zzn();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzbim zzo() {
        return this.i.zzo();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzcfo zzp() {
        return this.i.zzp();
    }

    @Override  // com.google.android.gms.internal.ads.zzdjg
    public final void zzq() {
        zzcli zzcli0 = this.i;
        if(zzcli0 != null) {
            zzcli0.zzq();
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final zzcju zzr(String s) {
        return this.i.zzr(s);
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final zzcme zzs() {
        return this.i.zzs();
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final String zzt() {
        return this.i.zzt();
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final String zzu() {
        return this.i.zzu();
    }

    @Override  // com.google.android.gms.internal.ads.zzcli
    public final void zzv(String s, zzcju zzcju0) {
        this.i.zzv(s, zzcju0);
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzw() {
        this.i.zzw();
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzx(boolean z, long v) {
        this.i.zzx(z, v);
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzy() {
        this.i.zzy();
    }

    @Override  // com.google.android.gms.internal.ads.zzchr
    public final void zzz(int v) {
        this.i.zzz(v);
    }
}

