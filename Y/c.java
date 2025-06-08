package y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;
import x2.w;

public final class c extends Drawable implements Drawable.Callback, a, b {
    public int i;
    public PorterDuff.Mode j;
    public boolean k;
    public d l;
    public boolean m;
    public Drawable n;
    public static final PorterDuff.Mode o;
    public static Method p;

    static {
        c.o = PorterDuff.Mode.SRC_IN;
    }

    public static void a() {
        if(c.p == null) {
            try {
                c.p = Drawable.class.getDeclaredMethod("isProjected", null);
            }
            catch(Exception exception0) {
                Log.w("WrappedDrawableApi21", "Failed to retrieve Drawable#isProjected() method", exception0);
            }
        }
    }

    // 去混淆评级： 低(40)
    public final boolean b() [...] // Potential decryptor

    public final d c() {
        d d0 = this.l;
        d d1 = new d();  // 初始化器: Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V
        d1.c = null;
        d1.d = c.o;
        if(d0 != null) {
            d1.a = d0.a;
            d1.b = d0.b;
            d1.c = d0.c;
            d1.d = d0.d;
        }
        return d1;
    }

    public final boolean d(int[] arr_v) {
        boolean z = this.n.setState(arr_v);
        return this.i(arr_v) || z;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas0) {
        this.n.draw(canvas0);
    }

    public final void e(int v) {
        this.setTintList(ColorStateList.valueOf(v));
    }

    public final void f(ColorStateList colorStateList0) {
        this.l.c = colorStateList0;
        this.i(this.n.getState());
    }

    public final void g(PorterDuff.Mode porterDuff$Mode0) {
        this.l.d = porterDuff$Mode0;
        this.i(this.n.getState());
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int v = super.getChangingConfigurations();
        d d0 = this.l;
        return d0 == null ? v | this.n.getChangingConfigurations() : v | d0.getChangingConfigurations() | this.n.getChangingConfigurations();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        d d0 = this.l;
        if(d0 != null && d0.b != null) {
            d0.a = this.getChangingConfigurations();
            return this.l;
        }
        return null;
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.n.getCurrent();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        return this.n.getDirtyBounds();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.getIntrinsicHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.getIntrinsicWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getLayoutDirection() {
        return w.g(this.n);
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.n.getMinimumHeight();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.n.getMinimumWidth();
    }

    @Override  // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.n.getOpacity();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline0) {
        this.n.getOutline(outline0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect0) {
        return this.n.getPadding(rect0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final int[] getState() {
        return this.n.getState();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        return this.n.getTransparentRegion();
    }

    public final void h(Drawable drawable0) {
        Drawable drawable1 = this.n;
        if(drawable1 != null) {
            drawable1.setCallback(null);
        }
        this.n = drawable0;
        if(drawable0 != null) {
            drawable0.setCallback(this);
            this.setVisible(drawable0.isVisible(), true);
            this.setState(drawable0.getState());
            this.setLevel(drawable0.getLevel());
            this.setBounds(drawable0.getBounds());
            d d0 = this.l;
            if(d0 != null) {
                d0.b = drawable0.getConstantState();
            }
        }
        this.invalidateSelf();
    }

    // 去混淆评级： 低(40)
    public final boolean i(int[] arr_v) {
        return false;
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void invalidateDrawable(Drawable drawable0) {
        this.invalidateSelf();
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.n.isAutoMirrored();
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable0 = this.n;
        if(drawable0 != null) {
            Method method0 = c.p;
            if(method0 != null) {
                try {
                    return ((Boolean)method0.invoke(drawable0, null)).booleanValue();
                }
                catch(Exception exception0) {
                    Log.w("WrappedDrawableApi21", "Error calling Drawable#isProjected() method", exception0);
                }
            }
        }
        return false;
    }

    // 去混淆评级： 中等(60)
    @Override  // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.n.isStateful();
    }

    @Override  // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.n.jumpToCurrentState();
    }

    @Override  // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if(!this.m && super.mutate() == this) {
            this.l = this.c();
            Drawable drawable0 = this.n;
            if(drawable0 != null) {
                drawable0.mutate();
            }
            d d0 = this.l;
            if(d0 != null) {
                d0.b = this.n == null ? null : this.n.getConstantState();
            }
            this.m = true;
        }
        return this;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect0) {
        Drawable drawable0 = this.n;
        if(drawable0 != null) {
            drawable0.setBounds(rect0);
        }
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int v) {
        return w.w(this.n, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int v) {
        return this.n.setLevel(v);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void scheduleDrawable(Drawable drawable0, Runnable runnable0, long v) {
        this.scheduleSelf(runnable0, v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAlpha(int v) {
        this.n.setAlpha(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        this.n.setAutoMirrored(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int v) {
        this.n.setChangingConfigurations(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter0) {
        this.n.setColorFilter(colorFilter0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.n.setDither(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.n.setFilterBitmap(z);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f1) {
        this.n.setHotspot(f, f1);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int v, int v1, int v2, int v3) {
        this.n.setHotspotBounds(v, v1, v2, v3);
    }

    @Override  // android.graphics.drawable.Drawable
    public final boolean setState(int[] arr_v) {
        if(this.d(arr_v)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTint(int v) {
        this.n.setTint(v);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList0) {
        this.n.setTintList(colorStateList0);
    }

    @Override  // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode porterDuff$Mode0) {
        this.n.setTintMode(porterDuff$Mode0);
    }

    // 去混淆评级： 低(20)
    @Override  // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z1) {
        return super.setVisible(z, z1) || this.n.setVisible(z, z1);
    }

    @Override  // android.graphics.drawable.Drawable$Callback
    public final void unscheduleDrawable(Drawable drawable0, Runnable runnable0) {
        this.unscheduleSelf(runnable0);
    }
}

