package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

public abstract class zzfkh extends AsyncTask {
    public zzfki a;
    public final zzfjz b;

    public zzfkh(zzfjz zzfjz0, byte[] arr_b) {
        this.b = zzfjz0;
    }

    public void a(String s) {
        zzfki zzfki0 = this.a;
        if(zzfki0 != null) {
            zzfki0.zza(this);
        }
    }

    @Override  // android.os.AsyncTask
    public void onPostExecute(Object object0) {
        this.a(((String)object0));
    }

    public final void zzb(zzfki zzfki0) {
        this.a = zzfki0;
    }
}

