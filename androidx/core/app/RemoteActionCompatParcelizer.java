package androidx.core.app;

import W.a;
import W.b;
import W.c;
import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a a0) {
        RemoteActionCompat remoteActionCompat0 = new RemoteActionCompat();
        c c0 = remoteActionCompat0.a;
        boolean z = true;
        if(a0.e(1)) {
            c0 = a0.h();
        }
        remoteActionCompat0.a = (IconCompat)c0;
        remoteActionCompat0.b = a0.e(2) ? ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b)a0).e)) : remoteActionCompat0.b;
        remoteActionCompat0.c = a0.e(3) ? ((CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b)a0).e)) : remoteActionCompat0.c;
        remoteActionCompat0.d = (PendingIntent)a0.g(remoteActionCompat0.d, 4);
        remoteActionCompat0.e = a0.e(5) ? ((b)a0).e.readInt() != 0 : remoteActionCompat0.e;
        boolean z1 = remoteActionCompat0.f;
        if(a0.e(6)) {
            if(((b)a0).e.readInt() == 0) {
                z = false;
            }
            z1 = z;
        }
        remoteActionCompat0.f = z1;
        return remoteActionCompat0;
    }

    public static void write(RemoteActionCompat remoteActionCompat0, a a0) {
        a0.getClass();
        IconCompat iconCompat0 = remoteActionCompat0.a;
        a0.i(1);
        a0.k(iconCompat0);
        CharSequence charSequence0 = remoteActionCompat0.b;
        a0.i(2);
        TextUtils.writeToParcel(charSequence0, ((b)a0).e, 0);
        CharSequence charSequence1 = remoteActionCompat0.c;
        a0.i(3);
        TextUtils.writeToParcel(charSequence1, ((b)a0).e, 0);
        PendingIntent pendingIntent0 = remoteActionCompat0.d;
        a0.i(4);
        ((b)a0).e.writeParcelable(pendingIntent0, 0);
        boolean z = remoteActionCompat0.e;
        a0.i(5);
        ((b)a0).e.writeInt(((int)z));
        boolean z1 = remoteActionCompat0.f;
        a0.i(6);
        ((b)a0).e.writeInt(((int)z1));
    }
}

