package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import v.j;

public final class zao extends j {
    @ResultIgnorabilityUnspecified
    @Deprecated
    public static Intent zaa(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0) {
        return Build.VERSION.SDK_INT < 33 ? context0.registerReceiver(broadcastReceiver0, intentFilter0) : context0.registerReceiver(broadcastReceiver0, intentFilter0, 2);
    }
}

