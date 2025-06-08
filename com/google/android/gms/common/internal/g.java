package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zzi;

public final class g extends zzi {
    public final BaseGmsClient a;

    public g(BaseGmsClient baseGmsClient0, Looper looper0) {
        this.a = baseGmsClient0;
        super(looper0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        BaseGmsClient baseGmsClient0 = this.a;
        if(baseGmsClient0.K.get() != message0.arg1) {
            if(message0.what != 1 && message0.what != 2 && message0.what != 7) {
                return;
            }
            zzc zzc0 = (zzc)message0.obj;
            zzc0.getClass();
            zzc0.zzg();
            return;
        }
        if(message0.what != 1 && message0.what != 4 && message0.what != 7 && message0.what != 5 || baseGmsClient0.isConnecting()) {
            PendingIntent pendingIntent0 = null;
            switch(message0.what) {
                case 2: {
                    if(!baseGmsClient0.isConnected()) {
                        zzc zzc1 = (zzc)message0.obj;
                        zzc1.getClass();
                        zzc1.zzg();
                        return;
                    }
                    break;
                }
                case 3: {
                    Object object0 = message0.obj;
                    if(object0 instanceof PendingIntent) {
                        pendingIntent0 = (PendingIntent)object0;
                    }
                    ConnectionResult connectionResult2 = new ConnectionResult(message0.arg2, pendingIntent0);
                    baseGmsClient0.x.onReportServiceBinding(connectionResult2);
                    baseGmsClient0.f(connectionResult2);
                    return;
                }
                case 4: {
                    baseGmsClient0.H = new ConnectionResult(message0.arg2);
                    if(!baseGmsClient0.I && !TextUtils.isEmpty(baseGmsClient0.d()) && !TextUtils.isEmpty(null)) {
                        try {
                            Class.forName(baseGmsClient0.d());
                            if(!baseGmsClient0.I) {
                                goto label_16;
                            }
                        }
                        catch(ClassNotFoundException unused_ex) {
                        }
                        goto label_18;
                    label_16:
                        baseGmsClient0.i(3, null);
                        return;
                    }
                label_18:
                    ConnectionResult connectionResult0 = baseGmsClient0.H == null ? new ConnectionResult(8) : baseGmsClient0.H;
                    baseGmsClient0.x.onReportServiceBinding(connectionResult0);
                    baseGmsClient0.f(connectionResult0);
                    return;
                }
                case 5: {
                    ConnectionResult connectionResult1 = baseGmsClient0.H == null ? new ConnectionResult(8) : baseGmsClient0.H;
                    baseGmsClient0.x.onReportServiceBinding(connectionResult1);
                    baseGmsClient0.f(connectionResult1);
                    return;
                }
                case 6: {
                    baseGmsClient0.i(5, null);
                    BaseConnectionCallbacks baseGmsClient$BaseConnectionCallbacks0 = baseGmsClient0.C;
                    if(baseGmsClient$BaseConnectionCallbacks0 != null) {
                        baseGmsClient$BaseConnectionCallbacks0.onConnectionSuspended(message0.arg2);
                    }
                    baseGmsClient0.i = message0.arg2;
                    baseGmsClient0.j = System.currentTimeMillis();
                    BaseGmsClient.h(baseGmsClient0, 5, 1, null);
                    return;
                }
            }
            int v = message0.what;
            if(v != 1 && v != 2 && v != 7) {
                Log.wtf("GmsClient", "Don\'t know how to handle message: " + v, new Exception());
                return;
            }
            ((zzc)message0.obj).zze();
            return;
        }
        zzc zzc2 = (zzc)message0.obj;
        zzc2.getClass();
        zzc2.zzg();
    }
}

