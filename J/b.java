package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.view.LayoutInflater;

public final class b extends ContextWrapper {
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;
    public Resources d;

    public b(Context context0, int v) {
        super(context0);
        this.a = v;
    }

    public final void a() {
        if(this.b == null) {
            this.b = this.getResources().newTheme();
            Resources.Theme resources$Theme0 = this.getBaseContext().getTheme();
            if(resources$Theme0 != null) {
                this.b.setTo(resources$Theme0);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    @Override  // android.content.ContextWrapper
    public final void attachBaseContext(Context context0) {
        super.attachBaseContext(context0);
    }

    @Override  // android.content.ContextWrapper
    public final AssetManager getAssets() {
        return this.getResources().getAssets();
    }

    @Override  // android.content.ContextWrapper
    public final Resources getResources() {
        if(this.d == null) {
            this.d = super.getResources();
        }
        return this.d;
    }

    @Override  // android.content.ContextWrapper
    public final Object getSystemService(String s) {
        if("layout_inflater".equals(s)) {
            if(this.c == null) {
                this.c = LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(s);
    }

    @Override  // android.content.ContextWrapper
    public final Resources.Theme getTheme() {
        Resources.Theme resources$Theme0 = this.b;
        if(resources$Theme0 != null) {
            return resources$Theme0;
        }
        if(this.a == 0) {
            this.a = 0x7F0F010B;  // style:Theme.AppCompat.Light
        }
        this.a();
        return this.b;
    }

    @Override  // android.content.ContextWrapper
    public final void setTheme(int v) {
        if(this.a != v) {
            this.a = v;
            this.a();
        }
    }
}

