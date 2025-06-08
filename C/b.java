package C;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class b {
    public static NotificationChannel c() {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
    }

    public static NotificationChannel d(NotificationManager notificationManager0) {
        return notificationManager0.getNotificationChannel("com.google.android.gms.availability");
    }

    public static NotificationChannel f(String s) {
        return new NotificationChannel("com.google.android.gms.availability", s, 4);
    }

    public static void q(NotificationChannel notificationChannel0) {
        notificationChannel0.setShowBadge(false);
    }

    public static void x(RecyclerView recyclerView0) {
        recyclerView0.setImportantForAutofill(8);
    }
}

