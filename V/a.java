package v;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract class a {
    public static void a(Context context0, Intent[] arr_intent, Bundle bundle0) {
        context0.startActivities(arr_intent, bundle0);
    }

    public static void b(Context context0, Intent intent0, Bundle bundle0) {
        context0.startActivity(intent0, bundle0);
    }
}

