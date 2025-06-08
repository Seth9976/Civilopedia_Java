package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.HashSet;

public final class zzfjy {
    public final HashMap a;
    public final HashMap b;
    public final HashMap c;
    public final HashSet d;
    public final HashSet e;
    public final HashSet f;
    public final HashMap g;
    public boolean h;

    public zzfjy() {
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashSet();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashMap();
    }

    public final View zza(String s) {
        return (View)this.c.get(s);
    }

    public final zzfjx zzb(View view0) {
        HashMap hashMap0 = this.b;
        zzfjx zzfjx0 = (zzfjx)hashMap0.get(view0);
        if(zzfjx0 != null) {
            hashMap0.remove(view0);
        }
        return zzfjx0;
    }

    public final String zzc(String s) {
        return (String)this.g.get(s);
    }

    public final String zzd(View view0) {
        HashMap hashMap0 = this.a;
        if(hashMap0.size() == 0) {
            return null;
        }
        String s = (String)hashMap0.get(view0);
        if(s != null) {
            hashMap0.remove(view0);
        }
        return s;
    }

    public final HashSet zze() {
        return this.f;
    }

    public final HashSet zzf() {
        return this.e;
    }

    public final void zzg() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = false;
    }

    public final void zzh() {
        this.h = true;
    }

    public final void zzi() {
        String s1;
        zzfjc zzfjc0 = zzfjc.zza();
        if(zzfjc0 != null) {
            for(Object object0: zzfjc0.zzb()) {
                zzfir zzfir0 = (zzfir)object0;
                View view0 = zzfir0.zzf();
                if(zzfir0.zzj()) {
                    String s = zzfir0.zzh();
                    HashMap hashMap0 = this.g;
                    HashSet hashSet0 = this.f;
                    if(view0 == null) {
                        hashSet0.add(s);
                        hashMap0.put(s, "noAdView");
                    }
                    else {
                        if(view0.hasWindowFocus()) {
                            HashSet hashSet1 = new HashSet();
                            View view1 = view0;
                            while(true) {
                                if(view1 != null) {
                                    String s2 = zzfjw.zzb(view1);
                                    if(s2 == null) {
                                        hashSet1.add(view1);
                                        ViewParent viewParent0 = view1.getParent();
                                        view1 = viewParent0 instanceof View ? ((View)viewParent0) : null;
                                        continue;
                                    }
                                    else {
                                        s1 = s2;
                                        break;
                                    }
                                }
                                this.d.addAll(hashSet1);
                                s1 = null;
                                break;
                            }
                        }
                        else {
                            s1 = "noWindowFocus";
                        }
                        if(s1 == null) {
                            this.e.add(s);
                            this.a.put(view0, s);
                            for(Object object1: zzfir0.zzi()) {
                                zzfjf zzfjf0 = (zzfjf)object1;
                                View view2 = (View)zzfjf0.zzb().get();
                                if(view2 != null) {
                                    HashMap hashMap1 = this.b;
                                    zzfjx zzfjx0 = (zzfjx)hashMap1.get(view2);
                                    if(zzfjx0 == null) {
                                        hashMap1.put(view2, new zzfjx(zzfjf0, zzfir0.zzh()));
                                    }
                                    else {
                                        zzfjx0.zzc(zzfir0.zzh());
                                    }
                                }
                            }
                        }
                        else {
                            hashSet0.add(s);
                            this.c.put(s, view0);
                            hashMap0.put(s, s1);
                        }
                    }
                }
            }
        }
    }

    public final int zzj(View view0) {
        if(this.d.contains(view0)) {
            return 1;
        }
        return this.h ? 2 : 3;
    }
}

