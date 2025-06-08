package l;

import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.CompoundButton;
import e.a;
import g.b;
import java.lang.reflect.Field;
import x2.w;
import z1.a0;

public final class s {
    public final CompoundButton a;
    public ColorStateList b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public boolean f;

    public s(CompoundButton compoundButton0) {
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.a = compoundButton0;
    }

    public final void a() {
        Drawable drawable0;
        CompoundButton compoundButton0 = this.a;
        if(Build.VERSION.SDK_INT >= 23) {
            drawable0 = compoundButton0.getButtonDrawable();
        }
        else {
            if(!a0.b) {
                try {
                    Field field0 = CompoundButton.class.getDeclaredField("mButtonDrawable");
                    a0.a = field0;
                    field0.setAccessible(true);
                }
                catch(NoSuchFieldException noSuchFieldException0) {
                    Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", noSuchFieldException0);
                }
                a0.b = true;
            }
            Field field1 = a0.a;
            if(field1 == null) {
                drawable0 = null;
            }
            else {
                try {
                    drawable0 = (Drawable)field1.get(compoundButton0);
                }
                catch(IllegalAccessException illegalAccessException0) {
                    Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", illegalAccessException0);
                    a0.a = null;
                    drawable0 = null;
                }
            }
        }
        if(drawable0 != null && (this.d || this.e)) {
            Drawable drawable1 = w.B(drawable0).mutate();
            if(this.d) {
                drawable1.setTintList(this.b);
            }
            if(this.e) {
                drawable1.setTintMode(this.c);
            }
            if(drawable1.isStateful()) {
                drawable1.setState(compoundButton0.getDrawableState());
            }
            compoundButton0.setButtonDrawable(drawable1);
        }
    }

    public final void b(AttributeSet attributeSet0, int v) {
        CompoundButton compoundButton0 = this.a;
        TypedArray typedArray0 = compoundButton0.getContext().obtainStyledAttributes(attributeSet0, a.l, v, 0);
        try {
            if(typedArray0.hasValue(1)) {
                int v2 = typedArray0.getResourceId(1, 0);
                if(v2 != 0) {
                    try {
                        compoundButton0.setButtonDrawable(b.c(compoundButton0.getContext(), v2));
                        goto label_12;
                    }
                    catch(Resources.NotFoundException unused_ex) {
                    }
                }
                goto label_8;
            }
            else {
            label_8:
                if(typedArray0.hasValue(0)) {
                    int v3 = typedArray0.getResourceId(0, 0);
                    if(v3 != 0) {
                        compoundButton0.setButtonDrawable(b.c(compoundButton0.getContext(), v3));
                    }
                }
            }
        label_12:
            if(typedArray0.hasValue(2)) {
                compoundButton0.setButtonTintList(typedArray0.getColorStateList(2));
            }
            if(typedArray0.hasValue(3)) {
                compoundButton0.setButtonTintMode(W.c(typedArray0.getInt(3, -1), null));
            }
        }
        finally {
            typedArray0.recycle();
        }
    }
}

