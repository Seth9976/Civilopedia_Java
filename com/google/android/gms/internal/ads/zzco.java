package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class zzco {
    public int a;
    public int b;
    public boolean c;
    public final zzfrj d;
    public final zzfrj e;
    public final zzfrj f;
    public zzfrj g;
    public int h;
    public final HashMap i;
    public final HashSet j;

    @Deprecated
    public zzco() {
        this.a = 0x7FFFFFFF;
        this.b = 0x7FFFFFFF;
        this.c = true;
        this.d = zzfrj.zzo();
        this.e = zzfrj.zzo();
        this.f = zzfrj.zzo();
        this.g = zzfrj.zzo();
        this.h = 0;
        this.i = new HashMap();
        this.j = new HashSet();
    }

    public zzco(zzut zzut0) {
        this.a = zzut0.zzl;
        this.b = zzut0.zzm;
        this.c = zzut0.zzn;
        this.d = zzut0.zzo;
        this.e = zzut0.zzq;
        this.f = zzut0.zzu;
        this.g = zzut0.zzv;
        this.h = zzut0.zzw;
        this.j = new HashSet(zzut0.zzC);
        this.i = new HashMap(zzut0.zzB);
    }

    public final zzco zzd(Context context0) {
        if(zzeg.zza >= 23 || Looper.myLooper() != null) {
            CaptioningManager captioningManager0 = (CaptioningManager)context0.getSystemService("captioning");
            if(captioningManager0 != null && captioningManager0.isEnabled()) {
                this.h = 0x440;
                Locale locale0 = captioningManager0.getLocale();
                if(locale0 != null) {
                    this.g = zzfrj.zzp(zzeg.zzM(locale0));
                }
            }
        }
        return this;
    }

    public zzco zze(int v, int v1, boolean z) {
        this.a = v;
        this.b = v1;
        this.c = true;
        return this;
    }
}

