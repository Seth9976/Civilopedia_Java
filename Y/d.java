package y;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;

public final class d extends Drawable.ConstantState {
    public int a;
    public Drawable.ConstantState b;
    public ColorStateList c;
    public PorterDuff.Mode d;

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final int getChangingConfigurations() {
        return this.b == null ? this.a : this.a | this.b.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable() {
        return this.newDrawable(null);
    }

    @Override  // android.graphics.drawable.Drawable$ConstantState
    public final Drawable newDrawable(Resources resources0) {
        Drawable drawable0 = new c();  // 初始化器: Landroid/graphics/drawable/Drawable;-><init>()V
        drawable0.l = this;
        Drawable.ConstantState drawable$ConstantState0 = this.b;
        if(drawable$ConstantState0 != null) {
            ((c)drawable0).h(drawable$ConstantState0.newDrawable(resources0));
        }
        c.a();
        return drawable0;
    }
}

