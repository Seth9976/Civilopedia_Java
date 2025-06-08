package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzbkl extends RelativeLayout {
    public final AnimationDrawable i;
    public static final float[] j;

    static {
        zzbkl.j = new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    }

    public zzbkl(Context context0, zzbkk zzbkk0, RelativeLayout.LayoutParams relativeLayout$LayoutParams0) {
        super(context0);
        Preconditions.checkNotNull(zzbkk0);
        ShapeDrawable shapeDrawable0 = new ShapeDrawable(new RoundRectShape(zzbkl.j, null, null));
        shapeDrawable0.getPaint().setColor(zzbkk0.zzd());
        this.setLayoutParams(relativeLayout$LayoutParams0);
        this.setBackground(shapeDrawable0);
        RelativeLayout.LayoutParams relativeLayout$LayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
        if(!TextUtils.isEmpty(zzbkk0.zzg())) {
            RelativeLayout.LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView0 = new TextView(context0);
            textView0.setLayoutParams(relativeLayout$LayoutParams2);
            textView0.setId(0x47470001);
            textView0.setTypeface(Typeface.DEFAULT);
            textView0.setText(zzbkk0.zzg());
            textView0.setTextColor(zzbkk0.zze());
            textView0.setTextSize(((float)zzbkk0.zzf()));
            textView0.setPadding(zzcfb.zzw(context0, 4), 0, zzcfb.zzw(context0, 4), 0);
            this.addView(textView0);
            relativeLayout$LayoutParams1.addRule(1, textView0.getId());
        }
        ImageView imageView0 = new ImageView(context0);
        imageView0.setLayoutParams(relativeLayout$LayoutParams1);
        imageView0.setId(0x47470002);
        List list0 = zzbkk0.zzi();
        if(list0 != null && list0.size() > 1) {
            this.i = new AnimationDrawable();
            for(Object object0: list0) {
                zzbkn zzbkn0 = (zzbkn)object0;
                try {
                    Drawable drawable0 = (Drawable)ObjectWrapper.unwrap(zzbkn0.zzf());
                    this.i.addFrame(drawable0, zzbkk0.zzb());
                }
                catch(Exception exception0) {
                    zzcfi.zzh("Error while getting drawable.", exception0);
                }
            }
            imageView0.setBackground(this.i);
        }
        else if(list0.size() == 1) {
            try {
                imageView0.setImageDrawable(((Drawable)ObjectWrapper.unwrap(((zzbkn)list0.get(0)).zzf())));
            }
            catch(Exception exception1) {
                zzcfi.zzh("Error while getting drawable.", exception1);
            }
        }
        this.addView(imageView0);
    }

    @Override  // android.view.ViewGroup
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable0 = this.i;
        if(animationDrawable0 != null) {
            animationDrawable0.start();
        }
        super.onAttachedToWindow();
    }
}

