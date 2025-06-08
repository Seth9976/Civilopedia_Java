package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public final class zzdod extends zzble implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzdpc {
    public final String i;
    public HashMap j;
    public FrameLayout k;
    public FrameLayout l;
    public final zzfvm m;
    public View n;
    public final int o;
    public zzdnc p;
    public zzbao q;
    public IObjectWrapper r;
    public zzbky s;
    public boolean t;
    public boolean u;
    public static final zzfrj zza;

    static {
        zzdod.zza = zzfrj.zzr("2011", "1009", "3010");
    }

    public zzdod(FrameLayout frameLayout0, FrameLayout frameLayout1, int v) {
        String s1;
        this.j = new HashMap();
        this.r = null;
        this.u = false;
        this.k = frameLayout0;
        this.l = frameLayout1;
        this.o = 221908000;
        String s = frameLayout0.getClass().getCanonicalName();
        if("com.google.android.gms.ads.formats.NativeContentAdView".equals(s)) {
            s1 = "1007";
        }
        else if("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(s)) {
            s1 = "2009";
        }
        else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(s);
            s1 = "3012";
        }
        this.i = s1;
        zzcgi.zza(frameLayout0, this);
        zzcgi.zzb(frameLayout0, this);
        this.m = zzcfv.zze;
        this.q = new zzbao(this.k.getContext(), this.k);
        frameLayout0.setOnTouchListener(this);
        frameLayout0.setOnClickListener(this);
    }

    public final void b(String s) {
        byte[] arr_b;
        synchronized(this) {
            FrameLayout frameLayout0 = new FrameLayout(this.l.getContext());
            frameLayout0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            Context context0 = this.l.getContext();
            frameLayout0.setClickable(false);
            frameLayout0.setFocusable(false);
            if(!TextUtils.isEmpty(s)) {
                if(context0.getApplicationContext() != null) {
                    context0 = context0.getApplicationContext();
                }
                Resources resources0 = context0.getResources();
                if(resources0 != null) {
                    DisplayMetrics displayMetrics0 = resources0.getDisplayMetrics();
                    if(displayMetrics0 != null) {
                        try {
                            arr_b = Base64.decode(s, 0);
                        }
                        catch(IllegalArgumentException illegalArgumentException0) {
                            zzcfi.zzk("Encountered invalid base64 watermark.", illegalArgumentException0);
                            this.l.addView(frameLayout0);
                            return;
                        }
                        BitmapDrawable bitmapDrawable0 = new BitmapDrawable(BitmapFactory.decodeByteArray(arr_b, 0, arr_b.length));
                        bitmapDrawable0.setTargetDensity(displayMetrics0.densityDpi);
                        bitmapDrawable0.setTileModeXY(Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
                        frameLayout0.setBackground(bitmapDrawable0);
                    }
                }
            }
            this.l.addView(frameLayout0);
        }
    }

    public final void c() {
        synchronized(this) {
            zzdoc zzdoc0 = new zzdoc(this);
            this.m.execute(zzdoc0);
        }
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        synchronized(this) {
            zzdnc zzdnc0 = this.p;
            if(zzdnc0 != null) {
                zzdnc0.zzk();
                this.p.zzx(view0, this.k, this.zzl(), this.zzm(), false);
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        synchronized(this) {
            zzdnc zzdnc0 = this.p;
            if(zzdnc0 != null) {
                FrameLayout frameLayout0 = this.k;
                zzdnc0.zzv(frameLayout0, this.zzl(), this.zzm(), zzdnc.zzP(frameLayout0));
            }
        }
    }

    @Override  // android.view.ViewTreeObserver$OnScrollChangedListener
    public final void onScrollChanged() {
        synchronized(this) {
            zzdnc zzdnc0 = this.p;
            if(zzdnc0 != null) {
                FrameLayout frameLayout0 = this.k;
                zzdnc0.zzv(frameLayout0, this.zzl(), this.zzm(), zzdnc.zzP(frameLayout0));
            }
        }
    }

    @Override  // android.view.View$OnTouchListener
    public final boolean onTouch(View view0, MotionEvent motionEvent0) {
        synchronized(this) {
            zzdnc zzdnc0 = this.p;
            if(zzdnc0 != null) {
                zzdnc0.zzD(view0, motionEvent0, this.k);
            }
            return false;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final IObjectWrapper zzb(String s) {
        synchronized(this) {
            return ObjectWrapper.wrap(this.zzg(s));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzbA(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.u) {
                return;
            }
            Object object0 = ObjectWrapper.unwrap(iObjectWrapper0);
            if(!(object0 instanceof zzdnc)) {
                zzcfi.zzj("Not an instance of native engine. This is most likely a transient error");
                return;
            }
            zzdnc zzdnc0 = this.p;
            if(zzdnc0 != null) {
                zzdnc0.zzL(this);
            }
            this.c();
            this.p = (zzdnc)object0;
            ((zzdnc)object0).zzK(this);
            this.p.zzC(this.k);
            this.p.zzi(this.l);
            if(this.t) {
                this.p.zza().zzb(this.s);
            }
            if(((Boolean)zzay.zzc().zzb(zzbhz.zzcY)).booleanValue() && !TextUtils.isEmpty(this.p.zzd())) {
                this.b(this.p.zzd());
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzbw(String s, IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            this.zzq(s, ((View)ObjectWrapper.unwrap(iObjectWrapper0)), true);
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzbx(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            this.p.zzF(((View)ObjectWrapper.unwrap(iObjectWrapper0)));
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzby(zzbky zzbky0) {
        synchronized(this) {
            if(this.u) {
                return;
            }
            this.t = true;
            this.s = zzbky0;
            zzdnc zzdnc0 = this.p;
            if(zzdnc0 != null) {
                zzdnc0.zza().zzb(zzbky0);
            }
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzbz(IObjectWrapper iObjectWrapper0) {
        synchronized(this) {
            if(this.u) {
                return;
            }
            this.r = iObjectWrapper0;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzc() {
        synchronized(this) {
            if(this.u) {
                return;
            }
            zzdnc zzdnc0 = this.p;
            if(zzdnc0 != null) {
                zzdnc0.zzL(this);
                this.p = null;
            }
            this.j.clear();
            this.k.removeAllViews();
            this.l.removeAllViews();
            this.j = null;
            this.k = null;
            this.l = null;
            this.n = null;
            this.q = null;
            this.u = true;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zzd(IObjectWrapper iObjectWrapper0) {
        MotionEvent motionEvent0 = (MotionEvent)ObjectWrapper.unwrap(iObjectWrapper0);
        this.onTouch(this.k, motionEvent0);
    }

    @Override  // com.google.android.gms.internal.ads.zzblf
    public final void zze(IObjectWrapper iObjectWrapper0, int v) {
        synchronized(this) {
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final View zzf() {
        return this.k;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final View zzg(String s) {
        synchronized(this) {
            if(this.u) {
                return null;
            }
            WeakReference weakReference0 = (WeakReference)this.j.get(s);
            return weakReference0 == null ? null : ((View)weakReference0.get());
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final FrameLayout zzh() {
        return this.l;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final zzbao zzi() {
        return this.q;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final IObjectWrapper zzj() {
        return this.r;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final String zzk() {
        synchronized(this) {
        }
        return this.i;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final Map zzl() {
        synchronized(this) {
        }
        return this.j;
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
        return null;
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final JSONObject zzo() {
        synchronized(this) {
            zzdnc zzdnc0 = this.p;
            return zzdnc0 != null ? zzdnc0.zzf(this.k, this.zzl(), this.zzm()) : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final JSONObject zzp() {
        synchronized(this) {
            zzdnc zzdnc0 = this.p;
            return zzdnc0 != null ? zzdnc0.zzg(this.k, this.zzl(), this.zzm()) : null;
        }
    }

    @Override  // com.google.android.gms.internal.ads.zzdpc
    public final void zzq(String s, View view0, boolean z) {
        synchronized(this) {
            if(!this.u) {
                if(view0 == null) {
                    this.j.remove(s);
                    return;
                }
                goto label_6;
            }
            return;
        }
        return;
    label_6:
        this.j.put(s, new WeakReference(view0));
        if(!"1098".equals(s) && !"3011".equals(s)) {
            if(zzbx.zzi(this.o)) {
                view0.setOnTouchListener(this);
            }
            view0.setClickable(true);
            view0.setOnClickListener(this);
        }
    }
}

