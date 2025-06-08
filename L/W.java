package l;

import B1.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import g.b;

public class w extends ImageView {
    public final o i;
    public final a j;

    public w(Context context0, AttributeSet attributeSet0, int v) {
        B0.a(context0);
        super(context0, attributeSet0, v);
        o o0 = new o(this);
        this.i = o0;
        o0.d(attributeSet0, v);
        a a0 = new a(this);
        this.j = a0;
        a0.z(attributeSet0, v);
    }

    @Override  // android.widget.ImageView
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o o0 = this.i;
        if(o0 != null) {
            o0.a();
        }
        a a0 = this.j;
        if(a0 != null) {
            a0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.i == null ? null : this.i.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.i == null ? null : this.i.c();
    }

    public ColorStateList getSupportImageTintList() {
        a a0 = this.j;
        if(a0 != null) {
            C0 c00 = (C0)a0.k;
            return c00 == null ? null : c00.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        a a0 = this.j;
        if(a0 != null) {
            C0 c00 = (C0)a0.k;
            return c00 == null ? null : c00.b;
        }
        return null;
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.ImageView
    public final boolean hasOverlappingRendering() {
        return !(((ImageView)this.j.j).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
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

    @Override  // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap0) {
        super.setImageBitmap(bitmap0);
        a a0 = this.j;
        if(a0 != null) {
            a0.b();
        }
    }

    @Override  // android.widget.ImageView
    public void setImageDrawable(Drawable drawable0) {
        super.setImageDrawable(drawable0);
        a a0 = this.j;
        if(a0 != null) {
            a0.b();
        }
    }

    @Override  // android.widget.ImageView
    public void setImageResource(int v) {
        a a0 = this.j;
        if(a0 != null) {
            ImageView imageView0 = (ImageView)a0.j;
            if(v == 0) {
                imageView0.setImageDrawable(null);
            }
            else {
                Drawable drawable0 = b.c(imageView0.getContext(), v);
                if(drawable0 != null) {
                    W.b(drawable0);
                }
                imageView0.setImageDrawable(drawable0);
            }
            a0.b();
        }
    }

    @Override  // android.widget.ImageView
    public void setImageURI(Uri uri0) {
        super.setImageURI(uri0);
        a a0 = this.j;
        if(a0 != null) {
            a0.b();
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

    public void setSupportImageTintList(ColorStateList colorStateList0) {
        a a0 = this.j;
        if(a0 != null) {
            if(((C0)a0.k) == null) {
                a0.k = new C0();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            ((C0)a0.k).a = colorStateList0;
            ((C0)a0.k).d = true;
            a0.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode porterDuff$Mode0) {
        a a0 = this.j;
        if(a0 != null) {
            if(((C0)a0.k) == null) {
                a0.k = new C0();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
            ((C0)a0.k).b = porterDuff$Mode0;
            ((C0)a0.k).c = true;
            a0.b();
        }
    }
}

