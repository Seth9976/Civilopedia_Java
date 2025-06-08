package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.base.R.styleable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;
import com.google.errorprone.annotations.InlineMe;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class SignInButton extends FrameLayout implements View.OnClickListener {
    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    public int i;
    public int j;
    public View k;
    public View.OnClickListener l;

    public SignInButton(Context context0) {
        this(context0, null);
    }

    public SignInButton(Context context0, AttributeSet attributeSet0) {
        this(context0, attributeSet0, 0);
    }

    public SignInButton(Context context0, AttributeSet attributeSet0, int v) {
        super(context0, attributeSet0, v);
        this.l = null;
        TypedArray typedArray0 = context0.getTheme().obtainStyledAttributes(attributeSet0, styleable.SignInButton, 0, 0);
        try {
            this.i = typedArray0.getInt(styleable.SignInButton_buttonSize, 0);
            this.j = typedArray0.getInt(styleable.SignInButton_colorScheme, 2);
        }
        finally {
            typedArray0.recycle();
        }
        this.setStyle(this.i, this.j);
    }

    @Override  // android.view.View$OnClickListener
    public void onClick(View view0) {
        View.OnClickListener view$OnClickListener0 = this.l;
        if(view$OnClickListener0 != null && view0 == this.k) {
            view$OnClickListener0.onClick(this);
        }
    }

    public void setColorScheme(int v) {
        this.setStyle(this.i, v);
    }

    @Override  // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.k.setEnabled(z);
    }

    @Override  // android.view.View
    public void setOnClickListener(View.OnClickListener view$OnClickListener0) {
        this.l = view$OnClickListener0;
        View view0 = this.k;
        if(view0 != null) {
            view0.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] arr_scope) {
        this.setStyle(this.i, this.j);
    }

    public void setSize(int v) {
        this.setStyle(v, this.j);
    }

    public void setStyle(int v, int v1) {
        this.i = v;
        this.j = v1;
        Context context0 = this.getContext();
        View view0 = this.k;
        if(view0 != null) {
            this.removeView(view0);
        }
        try {
            this.k = zaz.zaa(context0, this.i, this.j);
        }
        catch(RemoteCreatorException unused_ex) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int v2 = this.i;
            int v3 = this.j;
            zaaa zaaa0 = new zaaa(context0, null);
            zaaa0.zaa(context0.getResources(), v2, v3);
            this.k = zaaa0;
        }
        this.addView(this.k);
        this.k.setEnabled(this.isEnabled());
        this.k.setOnClickListener(this);
    }

    @InlineMe(replacement = "this.setStyle(buttonSize, colorScheme)")
    @Deprecated
    public void setStyle(int v, int v1, Scope[] arr_scope) {
        this.setStyle(v, v1);
    }
}

