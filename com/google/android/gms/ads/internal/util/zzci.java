package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.zzcgi;

public final class zzci {
    public final View a;
    public Activity b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final ViewTreeObserver.OnGlobalLayoutListener f;

    public zzci(Activity activity0, View view0, ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0, ViewTreeObserver.OnScrollChangedListener viewTreeObserver$OnScrollChangedListener0) {
        this.b = activity0;
        this.a = view0;
        this.f = viewTreeObserver$OnGlobalLayoutListener0;
    }

    public final void a() {
        if(!this.c) {
            Activity activity0 = this.b;
            ViewTreeObserver.OnGlobalLayoutListener viewTreeObserver$OnGlobalLayoutListener0 = this.f;
            if(activity0 != null) {
                Window window0 = activity0.getWindow();
                ViewTreeObserver viewTreeObserver0 = null;
                if(window0 != null) {
                    View view0 = window0.getDecorView();
                    if(view0 != null) {
                        viewTreeObserver0 = view0.getViewTreeObserver();
                    }
                }
                if(viewTreeObserver0 != null) {
                    viewTreeObserver0.addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListener0);
                }
            }
            zzcgi.zza(this.a, viewTreeObserver$OnGlobalLayoutListener0);
            this.c = true;
        }
    }

    public final void zza() {
        this.e = false;
        Activity activity0 = this.b;
        if(activity0 != null && this.c) {
            Window window0 = activity0.getWindow();
            ViewTreeObserver viewTreeObserver0 = null;
            if(window0 != null) {
                View view0 = window0.getDecorView();
                if(view0 != null) {
                    viewTreeObserver0 = view0.getViewTreeObserver();
                }
            }
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.removeOnGlobalLayoutListener(this.f);
            }
            this.c = false;
        }
    }

    public final void zzb() {
        this.e = true;
        if(this.d) {
            this.a();
        }
    }

    public final void zzc() {
        this.d = true;
        if(this.e) {
            this.a();
        }
    }

    public final void zzd() {
        this.d = false;
        Activity activity0 = this.b;
        if(activity0 != null && this.c) {
            Window window0 = activity0.getWindow();
            ViewTreeObserver viewTreeObserver0 = null;
            if(window0 != null) {
                View view0 = window0.getDecorView();
                if(view0 != null) {
                    viewTreeObserver0 = view0.getViewTreeObserver();
                }
            }
            if(viewTreeObserver0 != null) {
                viewTreeObserver0.removeOnGlobalLayoutListener(this.f);
            }
            this.c = false;
        }
    }

    public final void zze(Activity activity0) {
        this.b = activity0;
    }
}

