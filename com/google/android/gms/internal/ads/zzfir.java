package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

public final class zzfir extends zzfin {
    public final zzfip a;
    public final ArrayList b;
    public zzfkm c;
    public zzfjp d;
    public boolean e;
    public boolean f;
    public final String g;
    public static final Pattern h;

    static {
        zzfir.h = Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public zzfir(zzfio zzfio0, zzfip zzfip0) {
        this.b = new ArrayList();
        this.e = false;
        this.f = false;
        this.a = zzfip0;
        this.g = UUID.randomUUID().toString();
        this.c = new zzfkm(null);
        this.d = zzfip0.zzd() == zzfiq.zza || zzfip0.zzd() == zzfiq.zzc ? new zzfjq(zzfip0.zza()) : new zzfjs(zzfip0.zzi(), null);
        this.d.zzj();
        zzfjc.zza().zzd(this);
        zzfji.zza().zzd(this.d.zza(), zzfio0.zzb());
    }

    @Override  // com.google.android.gms.internal.ads.zzfin
    public final void zzb(View view0, zzfit zzfit0, String s) {
        if(!this.f) {
            if(!zzfir.h.matcher("Ad overlay").matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
            }
            zzfjf zzfjf0 = null;
            ArrayList arrayList0 = this.b;
            for(Object object0: arrayList0) {
                zzfjf zzfjf1 = (zzfjf)object0;
                if(zzfjf1.zzb().get() == view0) {
                    zzfjf0 = zzfjf1;
                    break;
                }
            }
            if(zzfjf0 == null) {
                arrayList0.add(new zzfjf(view0, zzfit0, "Ad overlay"));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfin
    public final void zzc() {
        if(this.f) {
            return;
        }
        this.c.clear();
        if(!this.f) {
            this.b.clear();
        }
        this.f = true;
        zzfji.zza().zzc(this.d.zza());
        zzfjc.zza().zze(this);
        this.d.zzc();
        this.d = null;
    }

    @Override  // com.google.android.gms.internal.ads.zzfin
    public final void zzd(View view0) {
        if(this.f) {
            return;
        }
        if(this.zzf() == view0) {
            return;
        }
        this.c = new zzfkm(view0);
        this.d.zzb();
        Collection collection0 = zzfjc.zza().zzc();
        if(collection0 != null && collection0.size() > 0) {
            for(Object object0: collection0) {
                zzfir zzfir0 = (zzfir)object0;
                if(zzfir0 != this && zzfir0.zzf() == view0) {
                    zzfir0.c.clear();
                }
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzfin
    public final void zze() {
        if(this.e) {
            return;
        }
        this.e = true;
        zzfjc.zza().zzf(this);
        float f = zzfjj.zzb().zza();
        this.d.zzh(f);
        this.d.zzf(this, this.a);
    }

    public final View zzf() {
        return (View)this.c.get();
    }

    public final zzfjp zzg() {
        return this.d;
    }

    public final String zzh() {
        return this.g;
    }

    public final List zzi() {
        return this.b;
    }

    // 去混淆评级： 低(20)
    public final boolean zzj() {
        return this.e && !this.f;
    }
}

