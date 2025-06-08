package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.util.zzbr;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import u.i;

public final class zzbox implements zzbom {
    public final zzb a;
    public final zzdwh b;
    public final zzfgp c;
    public final zzcfn d;
    public final zzbwp e;
    public final zzees f;
    public zzu g;

    public zzbox(zzb zzb0, zzbwp zzbwp0, zzees zzees0, zzdwh zzdwh0, zzfgp zzfgp0) {
        this.g = null;
        this.a = zzb0;
        this.e = zzbwp0;
        this.f = zzees0;
        this.b = zzdwh0;
        this.c = zzfgp0;
        this.d = new zzcfn(null);
    }

    public static Uri a(Context context0, zzaoc zzaoc0, Uri uri0, View view0, Activity activity0) {
        if(zzaoc0 == null) {
            return uri0;
        }
        try {
            if(zzaoc0.zze(uri0)) {
                return zzaoc0.zza(uri0, context0, view0, activity0);
            }
        }
        catch(zzaod exception0) {
            zzt.zzo().zzt(exception0, "OpenGmsgHandler.maybeAddClickSignalsToUri");
        }
        catch(Exception unused_ex) {
        }
        return uri0;
    }

    public static Uri b(Uri uri0) {
        try {
            if(uri0.getQueryParameter("aclk_ms") != null) {
                return uri0.buildUpon().appendQueryParameter("aclk_upms", "46643150").build();
            }
        }
        catch(UnsupportedOperationException unsupportedOperationException0) {
            zzcfi.zzh(("Error adding click uptime parameter to url: " + uri0.toString()), unsupportedOperationException0);
        }
        return uri0;
    }

    public final void c(zza zza0, Map map0, boolean z, String s, boolean z1) {
        boolean z2 = true;
        this.d(true);
        Context context0 = ((zzcli)zza0).getContext();
        zzaoc zzaoc0 = ((zzcli)zza0).zzK();
        View view0 = ((zzcli)zza0).zzH();
        ActivityManager activityManager0 = (ActivityManager)context0.getSystemService("activity");
        String s1 = (String)map0.get("u");
        Intent intent0 = null;
        if(!TextUtils.isEmpty(s1)) {
            Uri uri0 = zzbox.b(zzbox.a(context0, zzaoc0, Uri.parse(s1), view0, null));
            boolean z3 = Boolean.parseBoolean(((String)map0.get("use_first_package")));
            boolean z4 = Boolean.parseBoolean(((String)map0.get("use_running_process")));
            if(!Boolean.parseBoolean(((String)map0.get("use_custom_tabs"))) && !((Boolean)zzay.zzc().zzb(zzbhz.zzdA)).booleanValue()) {
                z2 = false;
            }
            if("http".equalsIgnoreCase(uri0.getScheme())) {
                intent0 = uri0.buildUpon().scheme("https").build();
            }
            else if("https".equalsIgnoreCase(uri0.getScheme())) {
                intent0 = uri0.buildUpon().scheme("http").build();
            }
            ArrayList arrayList0 = new ArrayList();
            Intent intent1 = zzbow.zza(uri0, context0, zzaoc0, view0);
            Intent intent2 = zzbow.zza(((Uri)intent0), context0, zzaoc0, view0);
            if(z2) {
                zzs.zzm(context0, intent1);
                zzs.zzm(context0, intent2);
            }
            ResolveInfo resolveInfo0 = zzbow.zzd(intent1, arrayList0, context0, zzaoc0, view0);
            if(resolveInfo0 != null) {
                intent0 = zzbow.zzb(intent1, resolveInfo0, context0, zzaoc0, view0);
            }
            else if(intent2 == null) {
            label_34:
                if(arrayList0.size() == 0) {
                    intent0 = intent1;
                }
                else {
                    if(z4 && activityManager0 != null) {
                        List list0 = activityManager0.getRunningAppProcesses();
                        if(list0 != null) {
                            int v = arrayList0.size();
                            int v1 = 0;
                            while(v1 < v) {
                                ResolveInfo resolveInfo2 = (ResolveInfo)arrayList0.get(v1);
                                for(Object object0: list0) {
                                    if(!((ActivityManager.RunningAppProcessInfo)object0).processName.equals(resolveInfo2.activityInfo.packageName)) {
                                        continue;
                                    }
                                    intent0 = zzbow.zzb(intent1, resolveInfo2, context0, zzaoc0, view0);
                                    goto label_56;
                                }
                                ++v1;
                            }
                        }
                    }
                    intent0 = z3 ? zzbow.zzb(intent1, ((ResolveInfo)arrayList0.get(0)), context0, zzaoc0, view0) : intent1;
                }
            }
            else {
                ResolveInfo resolveInfo1 = zzbow.zzc(intent2, context0, zzaoc0, view0);
                if(resolveInfo1 == null) {
                    goto label_34;
                }
                else {
                    intent0 = zzbow.zzb(intent1, resolveInfo1, context0, zzaoc0, view0);
                    if(zzbow.zzc(intent0, context0, zzaoc0, view0) == null) {
                        goto label_34;
                    }
                }
            }
        }
    label_56:
        if(z && this.f != null && intent0 != null && this.e(zza0, ((zzcli)zza0).getContext(), intent0.getData().toString(), s)) {
            return;
        }
        try {
            ((zzcmn)zza0).zzaF(new zzc(intent0, this.g), z1);
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            zzcfi.zzj(activityNotFoundException0.getMessage());
        }
    }

    public final void d(boolean z) {
        zzbwp zzbwp0 = this.e;
        if(zzbwp0 != null) {
            zzbwp0.zza(z);
        }
    }

    public final boolean e(zza zza0, Context context0, String s, String s1) {
        zzdwh zzdwh1;
        boolean z = zzt.zzo().zzv(context0);
        zzbr zzbr0 = zzs.zzw(context0);
        zzdwh zzdwh0 = this.b;
        if(zzdwh0 != null) {
            zzefa.zzc(context0, zzdwh0, this.c, this.f, s1, "offline_open");
        }
        boolean z1 = ((zzcli)zza0).zzQ().zzi() && ((zzcli)zza0).zzk() == null;
        zzees zzees0 = this.f;
        if(z) {
            zzees0.zzh(this.d, s1);
            return false;
        }
        if(new i(context0).a() && zzbr0 != null && !z1 && ((Boolean)zzay.zzc().zzb(zzbhz.zzhb)).booleanValue()) {
            if(((zzcli)zza0).zzQ().zzi()) {
                zzdwh1 = zzdwh0;
                zzefa.zzh(((zzcli)zza0).zzk(), null, zzbr0, this.f, this.b, this.c, s1, s);
            }
            else {
                zzdwh1 = zzdwh0;
                ((zzcmn)zza0).zzaG(zzbr0, this.f, this.b, this.c, s1, s, 14);
            }
            if(zzdwh1 != null) {
                zzefa.zzc(context0, zzdwh1, this.c, this.f, s1, "dialog_impression");
            }
            zza0.onAdClicked();
            return true;
        }
        zzees0.zzc(s1);
        if(zzdwh0 != null) {
            HashMap hashMap0 = new HashMap();
            if(!new i(context0).a()) {
                hashMap0.put("dialog_not_shown_reason", "notifications_disabled");
            }
            else if(zzbr0 == null) {
                hashMap0.put("dialog_not_shown_reason", "work_manager_unavailable");
            }
            else if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhb)).booleanValue()) {
                hashMap0.put("dialog_not_shown_reason", "notification_flow_disabled");
            }
            else if(z1) {
                hashMap0.put("dialog_not_shown_reason", "fullscreen_no_activity");
            }
            zzefa.zzd(context0, this.b, this.c, this.f, s1, "dialog_not_shown", hashMap0);
        }
        return false;
    }

    public final void f(int v) {
        zzdwh zzdwh0 = this.b;
        if(zzdwh0 == null) {
            return;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzhj)).booleanValue()) {
            zzfgo zzfgo0 = zzfgo.zzb("cct_action");
            zzfgo0.zza("cct_open_status", zzbiw.zza(v));
            this.c.zzb(zzfgo0);
            return;
        }
        zzdwg zzdwg0 = zzdwh0.zza();
        zzdwg0.zzb("action", "cct_action");
        zzdwg0.zzb("cct_open_status", zzbiw.zza(v));
        zzdwg0.zzg();
    }

    @Override  // com.google.android.gms.internal.ads.zzbom
    public final void zza(Object object0, Map map0) {
        this.zze(((zza)object0), map0);
    }

    public static int zzb(Map map0) {
        String s = (String)map0.get("o");
        if(s != null) {
            if("p".equalsIgnoreCase(s)) {
                return 7;
            }
            if("l".equalsIgnoreCase(s)) {
                return 6;
            }
            return "c".equalsIgnoreCase(s) ? 14 : -1;
        }
        return -1;
    }

    public final void zze(zza zza0, Map map0) {
        boolean z5;
        boolean z1;
        String s = (String)map0.get("u");
        zzcli zzcli0 = (zzcli)zza0;
        String s1 = zzcdp.zzc(s, zzcli0.getContext(), true);
        Object object0 = map0.get("a");
        if(((String)object0) == null) {
            zzcfi.zzj("Action missing from an open GMSG.");
            return;
        }
        zzb zzb0 = this.a;
        if(zzb0 != null && !zzb0.zzc()) {
            zzb0.zzb(s1);
            return;
        }
        zzfbl zzfbl0 = zzcli0.zzF();
        zzfbo zzfbo0 = zzcli0.zzR();
        boolean z = false;
        String s2 = "";
        if(zzfbl0 == null || zzfbo0 == null) {
            z1 = false;
        }
        else {
            s2 = zzfbo0.zzb;
            z1 = zzfbl0.zzak;
        }
        boolean z2 = !((Boolean)zzay.zzc().zzb(zzbhz.zzih)).booleanValue() || !map0.containsKey("sc") || !((String)map0.get("sc")).equals("0");
        if("expand".equalsIgnoreCase(((String)object0))) {
            if(zzcli0.zzaC()) {
                zzcfi.zzj("Cannot expand WebView that is already expanded.");
                return;
            }
            this.d(false);
            ((zzcmn)zza0).zzaH(zzbox.zzf(map0), zzbox.zzb(map0), z2);
            return;
        }
        if("webapp".equalsIgnoreCase(((String)object0))) {
            this.d(false);
            if(s1 != null) {
                ((zzcmn)zza0).zzaI(zzbox.zzf(map0), zzbox.zzb(map0), s1, z2);
                return;
            }
            ((zzcmn)zza0).zzaJ(zzbox.zzf(map0), zzbox.zzb(map0), ((String)map0.get("html")), ((String)map0.get("baseurl")), z2);
            return;
        }
        zzees zzees0 = this.f;
        if("chrome_custom_tab".equalsIgnoreCase(((String)object0))) {
            Context context0 = zzcli0.getContext();
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzdC)).booleanValue()) {
                if(((Boolean)zzay.zzc().zzb(zzbhz.zzdI)).booleanValue()) {
                    zze.zza("User opt out chrome custom tab.");
                }
                else if(((Boolean)zzay.zzc().zzb(zzbhz.zzdG)).booleanValue()) {
                    String s3 = (String)zzay.zzc().zzb(zzbhz.zzdH);
                    if(!s3.isEmpty() && context0 != null) {
                        for(Object object1: zzfpg.zzc(zzfoh.zzc(';')).zzd(s3)) {
                            if(((String)object1).equals("com.spears.civilopedia")) {
                                z = true;
                                break;
                            }
                        }
                    }
                }
                else {
                    z = true;
                }
            }
            boolean z3 = zzbix.zzg(zzcli0.getContext());
            if(z) {
                if(!z3) {
                    this.f(4);
                    map0.put("use_first_package", "true");
                    map0.put("use_running_process", "true");
                    this.c(zza0, map0, z1, s2, z2);
                    return;
                }
                this.d(true);
                if(TextUtils.isEmpty(s1)) {
                    zzcfi.zzj("Cannot open browser with null or empty url");
                    this.f(7);
                    return;
                }
                Uri uri0 = Uri.parse(s1);
                Uri uri1 = zzbox.b(zzbox.a(zzcli0.getContext(), zzcli0.zzK(), uri0, zzcli0.zzH(), zzcli0.zzk()));
                if(z1 && zzees0 != null && this.e(zza0, zzcli0.getContext(), uri1.toString(), s2)) {
                    return;
                }
                this.g = new P1(this);
                ((zzcmn)zza0).zzaF(new zzc(null, uri1.toString(), null, null, null, null, null, null, ObjectWrapper.wrap(this.g).asBinder(), true), z2);
                return;
            }
            map0.put("use_first_package", "true");
            map0.put("use_running_process", "true");
            this.c(zza0, map0, z1, s2, z2);
            return;
        }
        if("app".equalsIgnoreCase(((String)object0)) && "true".equalsIgnoreCase(((String)map0.get("system_browser")))) {
            this.c(zza0, map0, z1, s2, z2);
            return;
        }
        if("open_app".equalsIgnoreCase(((String)object0))) {
            if(!((Boolean)zzay.zzc().zzb(zzbhz.zzgT)).booleanValue()) {
                return;
            }
            this.d(true);
            String s4 = (String)map0.get("p");
            if(s4 == null) {
                zzcfi.zzj("Package name missing from open app action.");
                return;
            }
            if(z1 && zzees0 != null && this.e(zza0, zzcli0.getContext(), s4, s2)) {
                return;
            }
            PackageManager packageManager0 = zzcli0.getContext().getPackageManager();
            if(packageManager0 == null) {
                zzcfi.zzj("Cannot get package manager from open app action.");
                return;
            }
            Intent intent0 = packageManager0.getLaunchIntentForPackage(s4);
            if(intent0 != null) {
                ((zzcmn)zza0).zzaF(new zzc(intent0, this.g), z2);
            }
            return;
        }
        this.d(true);
        String s5 = (String)map0.get("intent_url");
        Intent intent1 = null;
        if(!TextUtils.isEmpty(s5)) {
            try {
                intent1 = Intent.parseUri(s5, 0);
            }
            catch(URISyntaxException uRISyntaxException0) {
                zzcfi.zzh(("Error parsing the url: " + s5), uRISyntaxException0);
            }
        }
        if(intent1 != null && intent1.getData() != null) {
            Uri uri2 = intent1.getData();
            if(!Uri.EMPTY.equals(uri2)) {
                Uri uri3 = zzbox.b(zzbox.a(zzcli0.getContext(), zzcli0.zzK(), uri2, zzcli0.zzH(), zzcli0.zzk()));
                if(TextUtils.isEmpty(intent1.getType()) || !((Boolean)zzay.zzc().zzb(zzbhz.zzgU)).booleanValue()) {
                    intent1.setData(uri3);
                }
                else {
                    intent1.setDataAndType(uri3, intent1.getType());
                }
            }
        }
        boolean z4 = ((Boolean)zzay.zzc().zzb(zzbhz.zzhf)).booleanValue() && "intent_async".equalsIgnoreCase(((String)object0)) && map0.containsKey("event_id");
        HashMap hashMap0 = new HashMap();
        if(z4) {
            this.g = new Q1(z2, zza0, hashMap0, map0);
            z5 = false;
        }
        else {
            z5 = z2;
        }
        if(intent1 != null) {
            if(z1 && zzees0 != null && this.e(zza0, zzcli0.getContext(), intent1.getData().toString(), s2)) {
                if(z4) {
                    hashMap0.put(((String)map0.get("event_id")), Boolean.TRUE);
                    ((zzbrd)zza0).zzd("openIntentAsync", hashMap0);
                }
                return;
            }
            ((zzcmn)zza0).zzaF(new zzc(intent1, this.g), z5);
            return;
        }
        if(!TextUtils.isEmpty(s1)) {
            Uri uri4 = Uri.parse(s1);
            s1 = zzbox.b(zzbox.a(zzcli0.getContext(), zzcli0.zzK(), uri4, zzcli0.zzH(), zzcli0.zzk())).toString();
        }
        if(z1 && zzees0 != null && this.e(zza0, zzcli0.getContext(), s1, s2)) {
            if(z4) {
                hashMap0.put(((String)map0.get("event_id")), Boolean.TRUE);
                ((zzbrd)zza0).zzd("openIntentAsync", hashMap0);
            }
            return;
        }
        ((zzcmn)zza0).zzaF(new zzc(((String)map0.get("i")), s1, ((String)map0.get("m")), ((String)map0.get("p")), ((String)map0.get("c")), ((String)map0.get("f")), ((String)map0.get("e")), this.g), z5);
    }

    public static boolean zzf(Map map0) {
        return "1".equals(map0.get("custom_close"));
    }
}

