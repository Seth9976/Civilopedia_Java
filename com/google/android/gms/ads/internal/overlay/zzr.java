package com.google.android.gms.ads.internal.overlay;

import E0.d;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView.ScaleType;
import com.google.android.gms.ads.impl.R.drawable;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;

public final class zzr extends FrameLayout implements View.OnClickListener {
    public final ImageButton i;
    public final zzaa j;

    public zzr(Context context0, zzq zzq0, zzaa zzaa0) {
        super(context0);
        Drawable drawable0;
        this.j = zzaa0;
        this.setOnClickListener(this);
        ImageButton imageButton0 = new ImageButton(context0);
        this.i = imageButton0;
        String s = (String)zzay.zzc().zzb(zzbhz.zzaV);
        d d0 = null;
        if(TextUtils.isEmpty(s) || "default".equals(s)) {
            imageButton0.setImageResource(0x1080017);
        }
        else {
            Resources resources0 = zzt.zzo().zzd();
            if(resources0 == null) {
                imageButton0.setImageResource(0x1080017);
            }
            else {
                try {
                    if("white".equals(s)) {
                        drawable0 = resources0.getDrawable(drawable.admob_close_button_white_circle_black_cross);
                    }
                    else if("black".equals(s)) {
                        drawable0 = resources0.getDrawable(drawable.admob_close_button_black_circle_white_cross);
                    }
                    else {
                        goto label_19;
                    }
                }
                catch(Resources.NotFoundException unused_ex) {
                    zzcfi.zze("Close button resource not found, falling back to default.");
                    drawable0 = null;
                }
                goto label_20;
            label_19:
                drawable0 = null;
            label_20:
                if(drawable0 == null) {
                    imageButton0.setImageResource(0x1080017);
                }
                else {
                    imageButton0.setImageDrawable(drawable0);
                    imageButton0.setScaleType(ImageView.ScaleType.CENTER);
                }
            }
        }
        this.i.setBackgroundColor(0);
        this.i.setOnClickListener(this);
        int v = zzcfb.zzw(context0, zzq0.zza);
        int v1 = zzcfb.zzw(context0, 0);
        int v2 = zzcfb.zzw(context0, zzq0.zzb);
        int v3 = zzcfb.zzw(context0, zzq0.zzc);
        this.i.setPadding(v, v1, v2, v3);
        this.i.setContentDescription("Interstitial close button");
        FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(zzcfb.zzw(context0, zzq0.zzd + zzq0.zza + zzq0.zzb), zzcfb.zzw(context0, zzq0.zzd + zzq0.zzc), 17);
        this.addView(this.i, frameLayout$LayoutParams0);
        long v4 = (long)(((Long)zzay.zzc().zzb(zzbhz.zzaW)));
        if(v4 <= 0L) {
            return;
        }
        if(((Boolean)zzay.zzc().zzb(zzbhz.zzaX)).booleanValue()) {
            d0 = new d(this, 0);
        }
        this.i.setAlpha(0.0f);
        this.i.animate().alpha(1.0f).setDuration(v4).setListener(d0);
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        zzaa zzaa0 = this.j;
        if(zzaa0 != null) {
            zzaa0.zzbJ();
        }
    }

    public final void zzb(boolean z) {
        ImageButton imageButton0 = this.i;
        if(z) {
            imageButton0.setVisibility(8);
            if(((long)(((Long)zzay.zzc().zzb(zzbhz.zzaW)))) > 0L) {
                imageButton0.animate().cancel();
                imageButton0.clearAnimation();
            }
            return;
        }
        imageButton0.setVisibility(0);
    }
}

