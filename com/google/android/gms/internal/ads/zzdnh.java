package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzef;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;
import p.k;

public final class zzdnh {
    public int a;
    public zzdk b;
    public zzbkt c;
    public View d;
    public List e;
    public List f;
    public zzef g;
    public Bundle h;
    public zzcli i;
    public zzcli j;
    public zzcli k;
    public IObjectWrapper l;
    public View m;
    public View n;
    public IObjectWrapper o;
    public double p;
    public zzblb q;
    public zzblb r;
    public String s;
    public final k t;
    public final k u;
    public float v;
    public String w;

    public zzdnh() {
        this.t = new k();
        this.u = new k();
        this.f = Collections.emptyList();
    }

    public static zzdnh a(zzdng zzdng0, zzbkt zzbkt0, View view0, String s, List list0, String s1, Bundle bundle0, String s2, View view1, IObjectWrapper iObjectWrapper0, String s3, String s4, double f, zzblb zzblb0, String s5, float f1) {
        zzdnh zzdnh0 = new zzdnh();
        zzdnh0.a = 6;
        zzdnh0.b = zzdng0;
        zzdnh0.c = zzbkt0;
        zzdnh0.d = view0;
        zzdnh0.zzU("headline", s);
        zzdnh0.e = list0;
        zzdnh0.zzU("body", s1);
        zzdnh0.h = bundle0;
        zzdnh0.zzU("call_to_action", s2);
        zzdnh0.m = view1;
        zzdnh0.o = iObjectWrapper0;
        zzdnh0.zzU("store", s3);
        zzdnh0.zzU("price", s4);
        zzdnh0.p = f;
        zzdnh0.q = zzblb0;
        zzdnh0.zzU("advertiser", s5);
        zzdnh0.zzP(f1);
        return zzdnh0;
    }

    public static Object b(IObjectWrapper iObjectWrapper0) {
        return iObjectWrapper0 == null ? null : ObjectWrapper.unwrap(iObjectWrapper0);
    }

    public final String zzA() {
        synchronized(this) {
        }
        return this.w;
    }

    public final String zzB() {
        synchronized(this) {
            return this.zzD("price");
        }
    }

    public final String zzC() {
        synchronized(this) {
            return this.zzD("store");
        }
    }

    public final String zzD(String s) {
        synchronized(this) {
            return (String)this.u.getOrDefault(s, null);
        }
    }

    public final List zzE() {
        synchronized(this) {
        }
        return this.e;
    }

    public final List zzF() {
        synchronized(this) {
        }
        return this.f;
    }

    public final void zzG() {
        synchronized(this) {
            zzcli zzcli0 = this.i;
            if(zzcli0 != null) {
                zzcli0.destroy();
                this.i = null;
            }
            zzcli zzcli1 = this.j;
            if(zzcli1 != null) {
                zzcli1.destroy();
                this.j = null;
            }
            zzcli zzcli2 = this.k;
            if(zzcli2 != null) {
                zzcli2.destroy();
                this.k = null;
            }
            this.l = null;
            this.t.clear();
            this.u.clear();
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.h = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.q = null;
            this.r = null;
            this.s = null;
        }
    }

    public final void zzH(zzbkt zzbkt0) {
        synchronized(this) {
            this.c = zzbkt0;
        }
    }

    public final void zzI(String s) {
        synchronized(this) {
            this.s = s;
        }
    }

    public final void zzJ(zzef zzef0) {
        synchronized(this) {
            this.g = zzef0;
        }
    }

    public final void zzK(zzblb zzblb0) {
        synchronized(this) {
            this.q = zzblb0;
        }
    }

    public final void zzL(String s, zzbkn zzbkn0) {
        synchronized(this) {
            if(zzbkn0 == null) {
                this.t.remove(s);
                return;
            }
            this.t.put(s, zzbkn0);
        }
    }

    public final void zzM(zzcli zzcli0) {
        synchronized(this) {
            this.j = zzcli0;
        }
    }

    public final void zzN(List list0) {
        synchronized(this) {
            this.e = list0;
        }
    }

    public final void zzO(zzblb zzblb0) {
        synchronized(this) {
            this.r = zzblb0;
        }
    }

    public final void zzP(float f) {
        synchronized(this) {
            this.v = f;
        }
    }

    public final void zzQ(List list0) {
        synchronized(this) {
            this.f = list0;
        }
    }

    public final void zzR(zzcli zzcli0) {
        synchronized(this) {
            this.k = zzcli0;
        }
    }

    public final void zzS(String s) {
        synchronized(this) {
            this.w = s;
        }
    }

    public final void zzT(double f) {
        synchronized(this) {
            this.p = f;
        }
    }

    public final void zzU(String s, String s1) {
        synchronized(this) {
            if(s1 == null) {
                this.u.remove(s);
                return;
            }
            this.u.put(s, s1);
        }
    }

    public final void zzV(int v) {
        synchronized(this) {
            this.a = v;
        }
    }

    public final void zzW(zzdk zzdk0) {
        synchronized(this) {
            this.b = zzdk0;
        }
    }

    public final void zzX(View view0) {
        synchronized(this) {
            this.m = view0;
        }
    }

    public final void zzY(zzcli zzcli0) {
        synchronized(this) {
            this.i = zzcli0;
        }
    }

    public final void zzZ(View view0) {
        synchronized(this) {
            this.n = view0;
        }
    }

    public final double zza() {
        synchronized(this) {
        }
        return this.p;
    }

    public final void zzaa(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            this.l = iObjectWrapper0;
        }
    }

    public static zzdnh zzab(zzbul zzbul0) {
        try {
            zzdk zzdk0 = zzbul0.zzg();
            zzdng zzdng0 = zzdk0 == null ? null : new zzdng(zzdk0, null);
            zzbkt zzbkt0 = zzbul0.zzh();
            View view0 = (View)zzdnh.b(zzbul0.zzj());
            String s = zzbul0.zzo();
            List list0 = zzbul0.zzr();
            String s1 = zzbul0.zzm();
            Bundle bundle0 = zzbul0.zzf();
            String s2 = zzbul0.zzn();
            View view1 = (View)zzdnh.b(zzbul0.zzk());
            IObjectWrapper iObjectWrapper0 = zzbul0.zzl();
            String s3 = zzbul0.zzq();
            String s4 = zzbul0.zzp();
            double f = zzbul0.zze();
            zzblb zzblb0 = zzbul0.zzi();
            zzdnh zzdnh0 = new zzdnh();
            zzdnh0.a = 2;
            zzdnh0.b = zzdng0;
            zzdnh0.c = zzbkt0;
            zzdnh0.d = view0;
            zzdnh0.zzU("headline", s);
            zzdnh0.e = list0;
            zzdnh0.zzU("body", s1);
            zzdnh0.h = bundle0;
            zzdnh0.zzU("call_to_action", s2);
            zzdnh0.m = view1;
            zzdnh0.o = iObjectWrapper0;
            zzdnh0.zzU("store", s3);
            zzdnh0.zzU("price", s4);
            zzdnh0.p = f;
            zzdnh0.q = zzblb0;
            return zzdnh0;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Failed to get native ad from app install ad mapper", remoteException0);
            return null;
        }
    }

    public static zzdnh zzac(zzbum zzbum0) {
        try {
            zzdk zzdk0 = zzbum0.zzf();
            zzdng zzdng0 = zzdk0 == null ? null : new zzdng(zzdk0, null);
            zzbkt zzbkt0 = zzbum0.zzg();
            View view0 = (View)zzdnh.b(zzbum0.zzi());
            String s = zzbum0.zzo();
            List list0 = zzbum0.zzp();
            String s1 = zzbum0.zzm();
            Bundle bundle0 = zzbum0.zze();
            String s2 = zzbum0.zzn();
            View view1 = (View)zzdnh.b(zzbum0.zzj());
            IObjectWrapper iObjectWrapper0 = zzbum0.zzk();
            String s3 = zzbum0.zzl();
            zzblb zzblb0 = zzbum0.zzh();
            zzdnh zzdnh0 = new zzdnh();
            zzdnh0.a = 1;
            zzdnh0.b = zzdng0;
            zzdnh0.c = zzbkt0;
            zzdnh0.d = view0;
            zzdnh0.zzU("headline", s);
            zzdnh0.e = list0;
            zzdnh0.zzU("body", s1);
            zzdnh0.h = bundle0;
            zzdnh0.zzU("call_to_action", s2);
            zzdnh0.m = view1;
            zzdnh0.o = iObjectWrapper0;
            zzdnh0.zzU("advertiser", s3);
            zzdnh0.r = zzblb0;
            return zzdnh0;
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Failed to get native ad from content ad mapper", remoteException0);
            return null;
        }
    }

    public static zzdnh zzad(zzbul zzbul0) {
        try {
            zzdk zzdk0 = zzbul0.zzg();
            return zzdnh.a((zzdk0 == null ? null : new zzdng(zzdk0, null)), zzbul0.zzh(), ((View)zzdnh.b(zzbul0.zzj())), zzbul0.zzo(), zzbul0.zzr(), zzbul0.zzm(), zzbul0.zzf(), zzbul0.zzn(), ((View)zzdnh.b(zzbul0.zzk())), zzbul0.zzl(), zzbul0.zzq(), zzbul0.zzp(), zzbul0.zze(), zzbul0.zzi(), null, 0.0f);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Failed to get native ad assets from app install ad mapper", remoteException0);
            return null;
        }
    }

    public static zzdnh zzae(zzbum zzbum0) {
        try {
            zzdk zzdk0 = zzbum0.zzf();
            return zzdnh.a((zzdk0 == null ? null : new zzdng(zzdk0, null)), zzbum0.zzg(), ((View)zzdnh.b(zzbum0.zzi())), zzbum0.zzo(), zzbum0.zzp(), zzbum0.zzm(), zzbum0.zze(), zzbum0.zzn(), ((View)zzdnh.b(zzbum0.zzj())), zzbum0.zzk(), null, null, -1.0, zzbum0.zzh(), zzbum0.zzl(), 0.0f);
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Failed to get native ad assets from content ad mapper", remoteException0);
            return null;
        }
    }

    public final float zzb() {
        synchronized(this) {
        }
        return this.v;
    }

    public final int zzc() {
        synchronized(this) {
        }
        return this.a;
    }

    public final Bundle zzd() {
        synchronized(this) {
            if(this.h == null) {
                this.h = new Bundle();
            }
            return this.h;
        }
    }

    public final View zze() {
        synchronized(this) {
        }
        return this.d;
    }

    public final View zzf() {
        synchronized(this) {
        }
        return this.m;
    }

    public final View zzg() {
        synchronized(this) {
        }
        return this.n;
    }

    public final k zzh() {
        synchronized(this) {
        }
        return this.t;
    }

    public final k zzi() {
        synchronized(this) {
        }
        return this.u;
    }

    public final zzdk zzj() {
        synchronized(this) {
        }
        return this.b;
    }

    public final zzef zzk() {
        synchronized(this) {
        }
        return this.g;
    }

    public final zzbkt zzl() {
        synchronized(this) {
        }
        return this.c;
    }

    public final zzblb zzm() {
        if(this.e != null && !this.e.isEmpty()) {
            Object object0 = this.e.get(0);
            return object0 instanceof IBinder ? zzbla.zzg(((IBinder)object0)) : null;
        }
        return null;
    }

    public final zzblb zzn() {
        synchronized(this) {
        }
        return this.q;
    }

    public final zzblb zzo() {
        synchronized(this) {
        }
        return this.r;
    }

    public final zzcli zzp() {
        synchronized(this) {
        }
        return this.j;
    }

    public final zzcli zzq() {
        synchronized(this) {
        }
        return this.k;
    }

    public final zzcli zzr() {
        synchronized(this) {
        }
        return this.i;
    }

    public static zzdnh zzs(zzbup zzbup0) {
        try {
            zzdk zzdk0 = zzbup0.zzj();
            return zzdnh.a((zzdk0 == null ? null : new zzdng(zzdk0, zzbup0)), zzbup0.zzk(), ((View)zzdnh.b(zzbup0.zzm())), zzbup0.zzs(), zzbup0.zzv(), zzbup0.zzq(), zzbup0.zzi(), zzbup0.zzr(), ((View)zzdnh.b(zzbup0.zzn())), zzbup0.zzo(), zzbup0.zzu(), zzbup0.zzt(), zzbup0.zze(), zzbup0.zzl(), zzbup0.zzp(), zzbup0.zzf());
        }
        catch(RemoteException remoteException0) {
            zzcfi.zzk("Failed to get native ad assets from unified ad mapper", remoteException0);
            return null;
        }
    }

    public final IObjectWrapper zzt() {
        synchronized(this) {
        }
        return this.o;
    }

    public final IObjectWrapper zzu() {
        synchronized(this) {
        }
        return this.l;
    }

    public final String zzv() {
        synchronized(this) {
            return this.zzD("advertiser");
        }
    }

    public final String zzw() {
        synchronized(this) {
            return this.zzD("body");
        }
    }

    public final String zzx() {
        synchronized(this) {
            return this.zzD("call_to_action");
        }
    }

    public final String zzy() {
        synchronized(this) {
        }
        return this.s;
    }

    public final String zzz() {
        synchronized(this) {
            return this.zzD("headline");
        }
    }
}

