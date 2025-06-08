package com.google.android.gms.ads.internal;

import C0.a;
import C0.b;
import C0.c;
import C1.d;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbi;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.ads.internal.client.zzbw;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzcg;
import com.google.android.gms.ads.internal.client.zzde;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdo;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzbcj;
import com.google.android.gms.internal.ads.zzbiu;
import com.google.android.gms.internal.ads.zzbjd;
import com.google.android.gms.internal.ads.zzbye;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzcfi;
import com.google.android.gms.internal.ads.zzcfo;
import com.google.android.gms.internal.ads.zzcfv;
import com.google.android.gms.internal.ads.zzetd;
import com.google.android.gms.internal.ads.zzfvl;
import i3.e;
import java.util.Iterator;
import java.util.TreeMap;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;

@ParametersAreNonnullByDefault
public final class zzs extends zzbr {
    public final zzcfo i;
    public final zzq j;
    public final zzfvl k;
    public final Context l;
    public final d m;
    public WebView n;
    public zzbf o;
    public zzaoc p;
    public AsyncTask q;

    public zzs(Context context0, zzq zzq0, String s, zzcfo zzcfo0) {
        String s1;
        this.l = context0;
        this.i = zzcfo0;
        this.j = zzq0;
        this.n = new WebView(context0);
        c c0 = new c(this, 0);
        this.k = zzcfv.zza.zzb(c0);
        d d0 = new d();  // 初始化器: Ljava/lang/Object;-><init>()V
        d0.i = context0.getApplicationContext();
        d0.j = s;
        d0.k = new TreeMap();
        try {
            s1 = "com.spears.civilopedia-" + Wrappers.packageManager(context0).getPackageInfo("com.spears.civilopedia", 0).versionName;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            zzcfi.zzh("Unable to get package version name for reporting", packageManager$NameNotFoundException0);
            s1 = "com.spears.civilopedia-missing";
        }
        d0.n = s1;
        this.m = d0;
        this.b(0);
        this.n.setVerticalScrollBarEnabled(false);
        this.n.getSettings().setJavaScriptEnabled(true);
        this.n.setWebViewClient(new a(this, 0));
        this.n.setOnTouchListener(new b(this, 0));
    }

    public final void b(int v) {
        if(this.n == null) {
            return;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, v);
        this.n.setLayoutParams(viewGroup$LayoutParams0);
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(zzbc zzbc0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(zzbf zzbf0) throws RemoteException {
        this.o = zzbf0;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(zzbw zzbw0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(zzq zzq0) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(zzbz zzbz0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcj0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(zzw zzw0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(zzcg zzcg0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(zzdo zzdo0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbye0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) throws RemoteException {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzO(zzbiu zzbiu0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(zzde zzde0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyh0, String s) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String s) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcar0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String s) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(zzff zzff0) {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzX() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzY() throws RemoteException {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzaa(zzl zzl0) throws RemoteException {
        TreeMap treeMap0;
        Preconditions.checkNotNull(this.n, "This Search Ad has already been torn down");
        d d0 = this.m;
        d0.getClass();
        d0.l = zzl0.zzj.zza;
        Bundle bundle0 = zzl0.zzm == null ? null : zzl0.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if(bundle0 != null) {
            Iterator iterator0 = bundle0.keySet().iterator();
            while(true) {
                boolean z = iterator0.hasNext();
                treeMap0 = (TreeMap)d0.k;
                if(!z) {
                    break;
                }
                Object object0 = iterator0.next();
                String s = (String)object0;
                if("csa_customDomain".equals(s)) {
                    d0.m = bundle0.getString(s);
                }
                else if(s.startsWith("csa_")) {
                    treeMap0.put(s.substring(4), bundle0.getString(s));
                }
            }
            treeMap0.put("SDKVersion", this.i.zza);
            if(((Boolean)zzbjd.zza.zze()).booleanValue()) {
                try {
                    JSONArray jSONArray0 = new JSONArray("[{\"bk\":\"tcString\",\"sk\":\"IABTCF_TCString\",\"type\":0},{\"bk\":\"gdprApplies\",\"sk\":\"IABTCF_gdprApplies\",\"type\":1},{\"bk\":\"usPrivacy\",\"sk\":\"IABUSPrivacy_String\",\"type\":0}]");
                    Bundle bundle1 = zzetd.zzc(((Context)d0.i), jSONArray0);
                    for(Object object1: bundle1.keySet()) {
                        treeMap0.put(((String)object1), bundle1.get(((String)object1)).toString());
                    }
                }
                catch(JSONException jSONException0) {
                    zzcfi.zzh("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", jSONException0);
                }
            }
        }
        this.q = new C0.d(this).execute(new Void[0]);
        return true;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(zzcd zzcd0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        throw new IllegalStateException("Unused method");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzq zzg() throws RemoteException {
        return this.j;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbf zzi() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzbz zzj() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdh zzk() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final zzdk zzl() {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() throws RemoteException {
        Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return ObjectWrapper.wrap(this.n);
    }

    public final String zzq() {
        String s = (String)this.m.m;
        if(TextUtils.isEmpty(s)) {
            s = "www.google.com";
        }
        return e.f("https://", s, "/afs/ads/i/webview.html");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzr() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzs() throws RemoteException {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final String zzt() throws RemoteException {
        return null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.q.cancel(true);
        this.k.cancel(true);
        this.n.destroy();
        this.n = null;
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(zzl zzl0, zzbi zzbi0) {
    }

    @Override  // com.google.android.gms.ads.internal.client.zzbs
    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}

