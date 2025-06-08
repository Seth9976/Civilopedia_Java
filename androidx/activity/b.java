package androidx.activity;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.content.pm.PackageManager;
import androidx.work.impl.foreground.SystemForegroundService;
import b0.g;
import u.a;

public final class b implements Runnable {
    public final int i;
    public final int j;
    public final Object k;
    public final Object l;

    public b(Object object0, int v, Object object1, int v1) {
        this.i = v1;
        this.l = object0;
        this.j = v;
        this.k = object1;
        super();
    }

    public b(Object object0, Object object1, int v, int v1) {
        this.i = v1;
        this.k = object0;
        this.l = object1;
        this.j = v;
        super();
    }

    @Override
    public final void run() {
        switch(this.i) {
            case 0: {
                Intent intent0 = new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", ((IntentSender.SendIntentException)this.k));
                ((c)this.l).a(this.j, 0, intent0);
                return;
            }
            case 1: {
                ((g)this.k).b(this.j, ((Intent)this.l));
                return;
            }
            case 2: {
                ((SystemForegroundService)this.l).m.notify(this.j, ((Notification)this.k));
                return;
            }
            default: {
                String[] arr_s = (String[])this.k;
                int[] arr_v = new int[arr_s.length];
                Activity activity0 = (Activity)this.l;
                PackageManager packageManager0 = activity0.getPackageManager();
                for(int v = 0; v < arr_s.length; ++v) {
                    arr_v[v] = packageManager0.checkPermission(arr_s[v], "com.spears.civilopedia");
                }
                ((a)activity0).onRequestPermissionsResult(this.j, arr_s, arr_v);
            }
        }
    }
}

