package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@VisibleForTesting
@ParametersAreNonnullByDefault
public interface zzcli extends zza, zzl, zzban, zzbrd, zzbrq, zzchr, zzckz, zzcmf, zzcmj, zzcmn, zzcmq, zzcmr, zzcms, zzdjg {
    boolean canGoBack();

    void destroy();

    @Override  // com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzchr
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] arg1);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    void loadData(String arg1, String arg2, String arg3);

    void loadDataWithBaseURL(String arg1, String arg2, String arg3, String arg4, String arg5);

    void loadUrl(String arg1);

    void measure(int arg1, int arg2);

    void onPause();

    void onResume();

    @Override  // com.google.android.gms.internal.ads.zzchr
    void setBackgroundColor(int arg1);

    void setOnClickListener(View.OnClickListener arg1);

    void setOnTouchListener(View.OnTouchListener arg1);

    void setWebChromeClient(WebChromeClient arg1);

    void setWebViewClient(WebViewClient arg1);

    @Override  // com.google.android.gms.internal.ads.zzchr
    void zzE(zzcme arg1);

    @Override  // com.google.android.gms.internal.ads.zzckz
    zzfbl zzF();

    Context zzG();

    @Override  // com.google.android.gms.internal.ads.zzcms
    View zzH();

    WebView zzI();

    WebViewClient zzJ();

    @Override  // com.google.android.gms.internal.ads.zzcmq
    zzaoc zzK();

    zzbca zzL();

    zzbko zzM();

    com.google.android.gms.ads.internal.overlay.zzl zzN();

    com.google.android.gms.ads.internal.overlay.zzl zzO();

    zzcmv zzP();

    @Override  // com.google.android.gms.internal.ads.zzcmp
    zzcmx zzQ();

    @Override  // com.google.android.gms.internal.ads.zzcmf
    zzfbo zzR();

    IObjectWrapper zzS();

    zzfvl zzT();

    String zzU();

    void zzV(zzfbl arg1, zzfbo arg2);

    void zzW();

    void zzX();

    void zzY(int arg1);

    void zzZ();

    boolean zzaA(boolean arg1, int arg2);

    boolean zzaB();

    boolean zzaC();

    boolean zzaD();

    boolean zzaE();

    void zzaa();

    void zzab(boolean arg1);

    void zzac();

    void zzad(String arg1, String arg2, String arg3);

    void zzae();

    void zzaf(String arg1, zzbom arg2);

    void zzag();

    void zzah(com.google.android.gms.ads.internal.overlay.zzl arg1);

    void zzai(zzcmx arg1);

    void zzaj(zzbca arg1);

    void zzak(boolean arg1);

    void zzal();

    void zzam(Context arg1);

    void zzan(boolean arg1);

    void zzao(zzbkm arg1);

    void zzap(boolean arg1);

    void zzaq(zzbko arg1);

    void zzar(IObjectWrapper arg1);

    void zzas(int arg1);

    void zzat(com.google.android.gms.ads.internal.overlay.zzl arg1);

    void zzau(boolean arg1);

    void zzav(boolean arg1);

    void zzaw(String arg1, zzbom arg2);

    void zzax(String arg1, Predicate arg2);

    boolean zzay();

    boolean zzaz();

    @Override  // com.google.android.gms.internal.ads.zzcmj, com.google.android.gms.internal.ads.zzchr
    Activity zzk();

    @Override  // com.google.android.gms.internal.ads.zzchr
    com.google.android.gms.ads.internal.zza zzm();

    @Override  // com.google.android.gms.internal.ads.zzchr
    zzbim zzo();

    @Override  // com.google.android.gms.internal.ads.zzcmr, com.google.android.gms.internal.ads.zzchr
    zzcfo zzp();

    @Override  // com.google.android.gms.internal.ads.zzchr
    zzcme zzs();

    @Override  // com.google.android.gms.internal.ads.zzchr
    void zzv(String arg1, zzcju arg2);
}

