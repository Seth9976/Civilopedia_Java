package l;

import G.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public final class p extends Button implements b {
    public final o i;
    public final M j;

    public p(Context context0, AttributeSet attributeSet0) {
        B0.a(context0);
        super(context0, attributeSet0, 0x7F02004A);  // attr:buttonStyle
        o o0 = new o(this);
        this.i = o0;
        o0.d(attributeSet0, 0x7F02004A);  // attr:buttonStyle
        M m0 = new M(this);
        this.j = m0;
        m0.d(attributeSet0, 0x7F02004A);  // attr:buttonStyle
        m0.b();
    }

    @Override  // android.widget.TextView
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o o0 = this.i;
        if(o0 != null) {
            o0.a();
        }
        M m0 = this.j;
        if(m0 != null) {
            m0.b();
        }
    }

    @Override  // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if(b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        return this.j == null ? -1 : Math.round(this.j.i.e);
    }

    @Override  // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if(b.a) {
            return super.getAutoSizeMinTextSize();
        }
        return this.j == null ? -1 : Math.round(this.j.i.d);
    }

    @Override  // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if(b.a) {
            return super.getAutoSizeStepGranularity();
        }
        return this.j == null ? -1 : Math.round(this.j.i.c);
    }

    @Override  // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if(b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        return this.j == null ? new int[0] : this.j.i.f;
    }

    @Override  // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if(b.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        return this.j == null ? 0 : this.j.i.a;
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.i == null ? null : this.i.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.i == null ? null : this.i.c();
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent0) {
        super.onInitializeAccessibilityEvent(accessibilityEvent0);
        accessibilityEvent0.setClassName("android.widget.Button");
    }

    @Override  // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo0) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo0);
        accessibilityNodeInfo0.setClassName("android.widget.Button");
    }

    @Override  // android.widget.TextView
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        super.onLayout(z, v, v1, v2, v3);
        M m0 = this.j;
        if(m0 != null && !b.a) {
            m0.i.a();
        }
    }

    @Override  // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence0, int v, int v1, int v2) {
        super.onTextChanged(charSequence0, v, v1, v2);
        M m0 = this.j;
        if(m0 != null && !b.a) {
            P p0 = m0.i;
            if(p0.f()) {
                p0.a();
            }
        }
    }

    @Override  // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int v, int v1, int v2, int v3) {
        if(b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, v3);
            return;
        }
        M m0 = this.j;
        if(m0 != null) {
            m0.f(v, v1, v2, v3);
        }
    }

    @Override  // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] arr_v, int v) {
        if(b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, v);
            return;
        }
        M m0 = this.j;
        if(m0 != null) {
            m0.g(arr_v, v);
        }
    }

    @Override  // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int v) {
        if(b.a) {
            super.setAutoSizeTextTypeWithDefaults(v);
            return;
        }
        M m0 = this.j;
        if(m0 != null) {
            m0.h(v);
        }
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        o o0 = this.i;
        if(o0 != null) {
            o0.e();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        o o0 = this.i;
        if(o0 != null) {
            o0.f(v);
        }
    }

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(a.R(actionMode$Callback0, this));
    }

    public void setSupportAllCaps(boolean z) {
        M m0 = this.j;
        if(m0 != null) {
            m0.a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        o o0 = this.i;
        if(o0 != null) {
            o0.h(colorStateList0);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        o o0 = this.i;
        if(o0 != null) {
            o0.i(porterDuff$Mode0);
        }
    }

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        M m0 = this.j;
        if(m0 != null) {
            m0.e(context0, v);
        }
    }

    @Override  // android.widget.TextView
    public final void setTextSize(int v, float f) {
        if(b.a) {
            super.setTextSize(v, f);
            return;
        }
        M m0 = this.j;
        if(m0 != null) {
            P p0 = m0.i;
            if(!p0.f()) {
                p0.g(f, v);
            }
        }
    }
}

