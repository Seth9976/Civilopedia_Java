package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
public final class zzdob extends zzblk implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdpc {
    public final WeakReference i;
    public final HashMap j;
    public final HashMap k;
    public final HashMap l;
    public zzdnc m;
    public final zzbao n;

    public zzdob(View view0, HashMap hashMap0, HashMap hashMap1) {
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new HashMap();
        view0.setOnTouchListener(this);
        view0.setOnClickListener(this);
        zzcgi.zza(view0, this);
        zzcgi.zzb(view0, this);
        this.i = new WeakReference(view0);
        for(Object object0: hashMap0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            View view1 = (View)((Map.Entry)object0).getValue();
            if(view1 != null) {
                WeakReference weakReference0 = new WeakReference(view1);
                this.j.put(s, weakReference0);
                if(!"1098".equals(s) && !"3011".equals(s)) {
                    view1.setOnTouchListener(this);
                    view1.setClickable(true);
                    view1.setOnClickListener(this);
                }
            }
        }
        this.l.putAll(this.j);
        for(Object object1: hashMap1.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object1;
            View view2 = (View)map$Entry0.getValue();
            if(view2 != null) {
                String s1 = (String)map$Entry0.getKey();
                WeakReference weakReference1 = new WeakReference(view2);
                this.k.put(s1, weakReference1);
                view2.setOnTouchListener(this);
                view2.setClickable(false);
            }
        }
        this.l.putAll(this.k);
        this.n = new zzbao(view0.getContext(), view0);
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        synchronized(this) {
            zzdnc zzdnc0 = this.m;
            if(zzdnc0 != null) {
                zzdnc0.zzx(view0, this.zzf(), this.zzl(), this.zzm(), true);
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized(this) {
            zzdnc zzdnc0 = this.m;
            if(zzdnc0 != null) {
                zzdnc0.zzv(this.zzf(), this.zzl(), this.zzm(), zzdnc.zzP(this.zzf()));
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized(this) {
            zzdnc zzdnc0 = this.m;
            if(zzdnc0 != null) {
                zzdnc0.zzv(this.zzf(), this.zzl(), this.zzm(), zzdnc.zzP(this.zzf()));
            }
        }
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        synchronized(this) {
            zzdnc zzdnc0 = this.m;
            if(zzdnc0 != null) {
                zzdnc0.zzD(view0, motionEvent0, this.zzf());
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzb(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.m != null) {
                Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
                if(!(object0 instanceof View)) {
                    zzcfi.zzj("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                }
                this.m.zzF(((View)object0));
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzc(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            if(!(object0 instanceof zzdnc)) {
                zzcfi.zzj("Not an instance of InternalNativeAd. This is most likely a transient error");
                return;
            }
            zzdnc zzdnc0 = this.m;
            if(zzdnc0 != null) {
                zzdnc0.zzL(this);
            }
            if(((zzdnc)object0).zzM()) {
                this.m = (zzdnc)object0;
                ((zzdnc)object0).zzK(this);
                this.m.zzC(this.zzf());
                return;
            }
            zzcfi.zzg("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzbll
    public final void zzd() {
        synchronized(this) {
            zzdnc zzdnc0 = this.m;
            if(zzdnc0 != null) {
                zzdnc0.zzL(this);
                this.m = null;
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final View zzf() {
        return (View)this.i.get();
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final View zzg(String s) {
        synchronized(this) {
            WeakReference weakReference0 = (WeakReference)this.l.get(s);
            return weakReference0 == null ? null : ((View)weakReference0.get());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final FrameLayout zzh() {
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final zzbao zzi() {
        return this.n;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final IObjectWrapper zzj() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final String zzk() {
        synchronized(this) {
        }
        return "1007";
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final Map zzl() {
        synchronized(this) {
        }
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final Map zzm() {
        synchronized(this) {
        }
        return this.j;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final Map zzn() {
        synchronized(this) {
        }
        return this.k;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final JSONObject zzo() {
        synchronized(this) {
        }
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final JSONObject zzp() {
        synchronized(this) {
            zzdnc zzdnc0 = this.m;
            return zzdnc0 != null ? zzdnc0.zzg(this.zzf(), this.zzl(), this.zzm()) : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final void zzq(String s, View view0, boolean z) {
        synchronized(this) {
            WeakReference weakReference0 = new WeakReference(view0);
            this.l.put(s, weakReference0);
            if(!"1098".equals(s) && !"3011".equals(s)) {
                WeakReference weakReference1 = new WeakReference(view0);
                this.j.put(s, weakReference1);
                view0.setClickable(true);
                view0.setOnClickListener(this);
                view0.setOnTouchListener(this);
            }
        }
    }
}

