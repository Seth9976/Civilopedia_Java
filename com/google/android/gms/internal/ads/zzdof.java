package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.google.android.gms.ads.formats.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

public final class zzdof implements Runnable {
    public final zzdoh zza;
    public final zzdpc zzb;

    public zzdof(zzdoh zzdoh0, zzdpc zzdpc0) {
        this.zza = zzdoh0;
        this.zzb = zzdpc0;
    }

    @Override
    public final void run() {
        IObjectWrapper iObjectWrapper0;
        View view1;
        ViewGroup viewGroup0 = null;
        zzdoh zzdoh0 = this.zza;
        zzdpc zzdpc0 = this.zzb;
        Context context0 = null;
        if(zzdoh0.c.zzf() || zzdoh0.c.zze()) {
            for(int v = 0; v < 2; ++v) {
                View view0 = zzdpc0.zzg(new String[]{"1098", "3011"}[v]);
                if(view0 != null && view0 instanceof ViewGroup) {
                    viewGroup0 = (ViewGroup)view0;
                    break;
                }
            }
        }
        Context context1 = zzdpc0.zzf().getContext();
        RelativeLayout.LayoutParams relativeLayout$LayoutParams0 = new RelativeLayout.LayoutParams(-2, -2);
        zzdnh zzdnh0 = zzdoh0.d;
        if(zzdnh0.zze() != null) {
            view1 = zzdnh0.zze();
            zzbkp zzbkp0 = zzdoh0.i;
            if(zzbkp0 != null && viewGroup0 == null) {
                zzdoh.a(relativeLayout$LayoutParams0, zzbkp0.zze);
                view1.setLayoutParams(relativeLayout$LayoutParams0);
            }
        }
        else if(zzdnh0.zzl() instanceof zzbkk) {
            zzbkk zzbkk0 = (zzbkk)zzdnh0.zzl();
            if(viewGroup0 == null) {
                zzdoh.a(relativeLayout$LayoutParams0, zzbkk0.zzc());
            }
            zzbkl zzbkl0 = new zzbkl(context1, zzbkk0, relativeLayout$LayoutParams0);
            zzbkl0.setContentDescription(((CharSequence)zzay.zzc().zzb(zzbhz.zzcR)));
            view1 = zzbkl0;
        }
        else {
            view1 = null;
        }
        if(view1 != null) {
            if(view1.getParent() instanceof ViewGroup) {
                ((ViewGroup)view1.getParent()).removeView(view1);
            }
            if(viewGroup0 == null) {
                zza zza0 = new zza(zzdpc0.zzf().getContext());
                zza0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zza0.addView(view1);
                FrameLayout frameLayout0 = zzdpc0.zzh();
                if(frameLayout0 != null) {
                    frameLayout0.addView(zza0);
                }
            }
            else {
                viewGroup0.removeAllViews();
                viewGroup0.addView(view1);
            }
            zzdpc0.zzq(zzdpc0.zzk(), view1, true);
        }
        ViewGroup viewGroup1 = null;
        zzfrj zzfrj0 = zzdod.zza;
        int v1 = zzfrj0.size();
        int v2 = 0;
        while(v2 < v1) {
            View view2 = zzdpc0.zzg(((String)zzfrj0.get(v2)));
            ++v2;
            if(view2 instanceof ViewGroup) {
                viewGroup1 = (ViewGroup)view2;
                break;
            }
        }
        zzdoe zzdoe0 = new zzdoe(zzdoh0, viewGroup1);
        zzdoh0.h.execute(zzdoe0);
        if(viewGroup1 != null) {
            if(zzdoh0.b(viewGroup1, true)) {
                if(zzdnh0.zzr() != null) {
                    zzdnh0.zzr().zzaq(new Q(10, zzdpc0, viewGroup1));
                }
            }
            else if(!((Boolean)zzay.zzc().zzb(zzbhz.zzhX)).booleanValue() || !zzdoh0.b(viewGroup1, false)) {
                viewGroup1.removeAllViews();
                View view3 = zzdpc0.zzf();
                if(view3 != null) {
                    context0 = view3.getContext();
                }
                if(context0 != null) {
                    zzbky zzbky0 = zzdoh0.j.zza();
                    if(zzbky0 != null) {
                        try {
                            iObjectWrapper0 = zzbky0.zzi();
                        }
                        catch(RemoteException unused_ex) {
                            zzcfi.zzj("Could not get main image drawable");
                            return;
                        }
                        if(iObjectWrapper0 != null) {
                            Drawable drawable0 = (Drawable)ObjectWrapper.unwrap(iObjectWrapper0);
                            if(drawable0 != null) {
                                ImageView imageView0 = new ImageView(context0);
                                imageView0.setImageDrawable(drawable0);
                                IObjectWrapper iObjectWrapper1 = zzdpc0.zzj();
                                if(iObjectWrapper1 == null || !((Boolean)zzay.zzc().zzb(zzbhz.zzff)).booleanValue()) {
                                    imageView0.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                                }
                                else {
                                    imageView0.setScaleType(((ImageView.ScaleType)ObjectWrapper.unwrap(iObjectWrapper1)));
                                }
                                imageView0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                viewGroup1.addView(imageView0);
                            }
                        }
                    }
                }
            }
            else if(zzdnh0.zzp() != null) {
                zzdnh0.zzp().zzaq(new Q(10, zzdpc0, viewGroup1));
            }
        }
    }
}

