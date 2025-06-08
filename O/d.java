package o;

import a.a;
import a.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

public abstract class d implements ServiceConnection {
    public Context i;

    public abstract void onCustomTabsServiceConnected(ComponentName arg1, b arg2);

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        c c0;
        if(this.i == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        if(iBinder0 == null) {
            c0 = null;
        }
        else {
            IInterface iInterface0 = iBinder0.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if(iInterface0 == null || !(iInterface0 instanceof c)) {
                a a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
                a0.i = iBinder0;
                c0 = a0;
            }
            else {
                c0 = (c)iInterface0;
            }
        }
        this.onCustomTabsServiceConnected(componentName0, new o.c(c0, componentName0));  // 初始化器: Lo/b;-><init>(La/c;Landroid/content/ComponentName;)V
    }
}

