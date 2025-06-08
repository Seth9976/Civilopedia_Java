package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;

public final class zze implements ServiceConnection {
    public final int i;
    public final BaseGmsClient j;

    public zze(BaseGmsClient baseGmsClient0, int v) {
        this.j = baseGmsClient0;
        super();
        this.i = v;
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        BaseGmsClient baseGmsClient0 = this.j;
        if(iBinder0 == null) {
            BaseGmsClient.g(baseGmsClient0);
            return;
        }
        synchronized(baseGmsClient0.v) {
            BaseGmsClient baseGmsClient1 = this.j;
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsServiceBroker iGmsServiceBroker0 = iInterface0 == null || !(iInterface0 instanceof IGmsServiceBroker) ? new f(iBinder0) : ((IGmsServiceBroker)iInterface0);
            baseGmsClient1.w = iGmsServiceBroker0;
        }
        this.j.getClass();
        zzg zzg0 = new zzg(this.j, 0, null);
        Message message0 = this.j.t.obtainMessage(7, this.i, -1, zzg0);
        this.j.t.sendMessage(message0);
    }

    @Override  // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName0) {
        synchronized(this.j.v) {
            this.j.w = null;
        }
        Message message0 = this.j.t.obtainMessage(6, this.i, 1);
        this.j.t.sendMessage(message0);
    }
}

