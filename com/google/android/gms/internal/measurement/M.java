package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.internal.zzfw;

public final class m extends u {
    public final int m;
    public final Object n;
    public final Object o;
    public final Object p;

    public m(y y0, Activity activity0, zzbz zzbz0) {
        this.m = 5;
        this.n = y0;
        this.o = activity0;
        this.p = zzbz0;
        super(y0.i, true);
    }

    public m(y y0, Bundle bundle0, Activity activity0) {
        this.m = 4;
        this.n = y0;
        this.p = bundle0;
        this.o = activity0;
        super(y0.i, true);
    }

    public m(zzee zzee0, Bundle bundle0, zzbz zzbz0) {
        this.m = 2;
        this.n = zzee0;
        this.p = bundle0;
        this.o = zzbz0;
        super(zzee0, true);
    }

    public m(zzee zzee0, String s, zzbz zzbz0) {
        this.m = 3;
        this.n = zzee0;
        this.o = s;
        this.p = zzbz0;
        super(zzee0, true);
    }

    public m(zzee zzee0, String s, Object object0) {
        this.m = 1;
        this.n = zzee0;
        this.o = s;
        this.p = object0;
        super(zzee0, false);
    }

    public m(zzee zzee0, String s, String s1, Context context0, Bundle bundle0) {
        this.m = 0;
        this.n = zzee0;
        this.o = context0;
        this.p = bundle0;
        super(zzee0, true);
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public final void a() {
        Bundle bundle0;
        zzcc zzcc0;
        switch(this.m) {
            case 0: {
                try {
                    Preconditions.checkNotNull(((Context)this.o));
                    zzee zzee0 = (zzee)this.n;
                    Context context0 = (Context)this.o;
                    zzee0.getClass();
                    try {
                        zzcc0 = zzcb.asInterface(DynamiteModule.load(context0, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION, "com.google.android.gms.measurement.dynamite").instantiate("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    }
                    catch(LoadingException dynamiteModule$LoadingException0) {
                        zzee0.a(dynamiteModule$LoadingException0, true, false);
                        zzcc0 = null;
                    }
                    zzee0.h = zzcc0;
                    if(((zzee)this.n).h == null) {
                        ((zzee)this.n).getClass();
                        Log.w("FA", "Failed to connect to measurement client.");
                        return;
                    }
                    int v = DynamiteModule.getLocalVersion(((Context)this.o), "com.google.android.gms.measurement.dynamite");
                    int v1 = DynamiteModule.getRemoteVersion(((Context)this.o), "com.google.android.gms.measurement.dynamite");
                    String s = zzfw.zza(((Context)this.o));
                    zzcl zzcl0 = new zzcl(68000L, ((long)Math.max(v, v1)), v1 < v, null, null, null, ((Bundle)this.p), s);
                    ((zzcc)Preconditions.checkNotNull(((zzee)this.n).h)).initialize(ObjectWrapper.wrap(((Context)this.o)), zzcl0, this.i);
                    return;
                }
                catch(Exception exception0) {
                }
                ((zzee)this.n).a(exception0, true, false);
                return;
            }
            case 1: {
                Object object0 = Preconditions.checkNotNull(((zzee)this.n).h);
                IObjectWrapper iObjectWrapper0 = ObjectWrapper.wrap(this.p);
                IObjectWrapper iObjectWrapper1 = ObjectWrapper.wrap(null);
                IObjectWrapper iObjectWrapper2 = ObjectWrapper.wrap(null);
                ((zzcc)object0).logHealthData(5, ((String)this.o), iObjectWrapper0, iObjectWrapper1, iObjectWrapper2);
                return;
            }
            case 2: {
                ((zzcc)Preconditions.checkNotNull(((zzee)this.n).h)).performAction(((Bundle)this.p), ((zzbz)this.o), this.i);
                return;
            }
            case 3: {
                ((zzcc)Preconditions.checkNotNull(((zzee)this.n).h)).getMaxUserProperties(((String)this.o), ((zzbz)this.p));
                return;
            }
            case 4: {
                if(((Bundle)this.p) == null) {
                    bundle0 = null;
                }
                else {
                    bundle0 = new Bundle();
                    if(((Bundle)this.p).containsKey("com.google.app_measurement.screen_service")) {
                        Object object1 = ((Bundle)this.p).get("com.google.app_measurement.screen_service");
                        if(object1 instanceof Bundle) {
                            bundle0.putBundle("com.google.app_measurement.screen_service", ((Bundle)object1));
                        }
                    }
                }
                ((zzcc)Preconditions.checkNotNull(((y)this.n).i.h)).onActivityCreated(ObjectWrapper.wrap(((Activity)this.o)), bundle0, this.j);
                return;
            }
            default: {
                ((zzcc)Preconditions.checkNotNull(((y)this.n).i.h)).onActivitySaveInstanceState(ObjectWrapper.wrap(((Activity)this.o)), ((zzbz)this.p), this.j);
            }
        }
    }

    @Override  // com.google.android.gms.internal.measurement.u
    public void b() {
        switch(this.m) {
            case 2: {
                ((zzbz)this.o).zzd(null);
                return;
            }
            case 3: {
                ((zzbz)this.p).zzd(null);
            }
        }
    }
}

