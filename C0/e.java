package c0;

import android.app.Notification.Action.Builder;
import android.graphics.drawable.Icon;

public abstract class e {
    public static String h(Icon icon0) {
        return icon0.getResPackage();
    }

    public static void i(Notification.Action.Builder notification$Action$Builder0) {
        notification$Action$Builder0.setSemanticAction(0);
    }
}

