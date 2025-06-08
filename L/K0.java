package l;

import V.q;
import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import h.e;

public final class k0 {
    public final int a;

    public k0(int v) {
        this.a = v;
        super();
    }

    public final Drawable a(Context context0, XmlResourceParser xmlResourceParser0, AttributeSet attributeSet0, Resources.Theme resources$Theme0) {
        switch(this.a) {
            case 0: {
                try {
                    return e.e(context0, context0.getResources(), xmlResourceParser0, attributeSet0, resources$Theme0);
                }
                catch(Exception exception1) {
                    Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", exception1);
                    return null;
                }
            }
            case 1: {
                try {
                    Resources resources1 = context0.getResources();
                    Drawable drawable1 = new V.e(context0);
                    ((V.e)drawable1).inflate(resources1, xmlResourceParser0, attributeSet0, resources$Theme0);
                    return drawable1;
                }
                catch(Exception exception2) {
                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", exception2);
                    return null;
                }
            }
            default: {
                try {
                    Resources resources0 = context0.getResources();
                    Drawable drawable0 = new q();
                    ((q)drawable0).inflate(resources0, xmlResourceParser0, attributeSet0, resources$Theme0);
                    return drawable0;
                }
                catch(Exception exception0) {
                    Log.e("VdcInflateDelegate", "Exception while inflating <vector>", exception0);
                    return null;
                }
            }
        }
    }
}

