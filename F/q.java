package f;

import F0.g;
import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import k.s;
import p.b;
import z.a;

public abstract class q {
    public Object a;
    public Object b;

    public q(Context context0) {
        this.a = context0;
    }

    public q(t t0) {
        this.b = t0;
    }

    public void c() {
        g g0 = (g)this.a;
        if(g0 != null) {
            try {
                ((t)this.b).l.unregisterReceiver(g0);
            }
            catch(IllegalArgumentException unused_ex) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem0) {
        if(menuItem0 instanceof a) {
            a a0 = (a)menuItem0;
            if(((b)this.b) == null) {
                this.b = new b();  // 初始化器: Lp/k;-><init>()V
            }
            menuItem0 = (MenuItem)((b)this.b).getOrDefault(menuItem0, null);
            if(menuItem0 == null) {
                menuItem0 = new s(((Context)this.a), a0);
                ((b)this.b).put(a0, menuItem0);
            }
        }
        return menuItem0;
    }

    public abstract void g();

    public void h() {
        this.c();
        IntentFilter intentFilter0 = this.d();
        if(intentFilter0.countActions() == 0) {
            return;
        }
        if(((g)this.a) == null) {
            this.a = new g(this, 7);
        }
        ((t)this.b).l.registerReceiver(((g)this.a), intentFilter0);
    }
}

