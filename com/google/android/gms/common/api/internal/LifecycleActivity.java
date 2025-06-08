package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.j;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class LifecycleActivity {
    public final Activity a;

    public LifecycleActivity(Activity activity0) {
        Preconditions.checkNotNull(activity0, "Activity must not be null");
        this.a = activity0;
    }

    @KeepForSdk
    public LifecycleActivity(ContextWrapper contextWrapper0) {
        throw new UnsupportedOperationException();
    }

    public final Activity zza() {
        return this.a;
    }

    public final j zzb() {
        return (j)this.a;
    }

    public final boolean zzc() {
        return this.a instanceof Activity;
    }

    public final boolean zzd() {
        return this.a instanceof j;
    }
}

