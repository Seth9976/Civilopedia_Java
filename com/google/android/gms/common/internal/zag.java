package com.google.android.gms.common.internal;

import P0.a;
import P0.b;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.h;
import com.google.android.gms.common.api.internal.LifecycleFragment;

public abstract class zag implements DialogInterface.OnClickListener {
    public abstract void a();

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        try {
            this.a();
        }
        catch(ActivityNotFoundException activityNotFoundException0) {
            Log.e("DialogRedirect", "Failed to start resolution intent.", activityNotFoundException0);
        }
        finally {
            dialogInterface0.dismiss();
        }
    }

    public static zag zab(Activity activity0, Intent intent0, int v) {
        return new a(intent0, activity0, v, 0);
    }

    public static zag zac(h h0, Intent intent0, int v) {
        return new a(intent0, h0, v, 1);
    }

    public static zag zad(LifecycleFragment lifecycleFragment0, Intent intent0, int v) {
        return new b(intent0, lifecycleFragment0);
    }
}

