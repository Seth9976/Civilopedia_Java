package c0;

import android.app.Notification.Builder;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.view.textclassifier.TextClassificationManager;
import android.widget.TextView;

public abstract class b {
    public static Notification.Builder c(Notification.Builder notification$Builder0) {
        return notification$Builder0.setBadgeIconType(0);
    }

    public static Notification.Builder d(Context context0, String s) {
        return new Notification.Builder(context0, s);
    }

    public static TextClassificationManager g(Object object0) {
        return (TextClassificationManager)object0;
    }

    public static void k(Notification.Builder notification$Builder0) {
        notification$Builder0.setGroupAlertBehavior(0);
    }

    public static void m(Context context0, BroadcastReceiver broadcastReceiver0, IntentFilter intentFilter0, int v) {
        context0.registerReceiver(broadcastReceiver0, intentFilter0, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST", null, v);
    }

    public static void q(TextView textView0, int v, int v1, int v2) {
        textView0.setAutoSizeTextTypeUniformWithConfiguration(v, v1, v2, 0);
    }

    public static void s(TextView textView0, int[] arr_v) {
        textView0.setAutoSizeTextTypeUniformWithPresetSizes(arr_v, 0);
    }

    public static Notification.Builder v(Notification.Builder notification$Builder0) {
        return notification$Builder0.setSettingsText(null);
    }

    public static Notification.Builder x(Notification.Builder notification$Builder0) {
        return notification$Builder0.setShortcutId(null);
    }

    public static Notification.Builder y(Notification.Builder notification$Builder0) {
        return notification$Builder0.setTimeoutAfter(0L);
    }
}

