package K0;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.b;
import com.google.android.gms.common.GoogleApiAvailability;

public final class a implements DialogInterface.OnClickListener {
    public final Activity i;
    public final int j;
    public final b k;
    public final GoogleApiAvailability l;

    public a(GoogleApiAvailability googleApiAvailability0, Activity activity0, int v, b b0) {
        this.l = googleApiAvailability0;
        this.i = activity0;
        this.j = v;
        this.k = b0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        dialogInterface0.dismiss();
        PendingIntent pendingIntent0 = this.l.getErrorResolutionPendingIntent(this.i, this.j, 0);
        if(pendingIntent0 == null) {
            return;
        }
        IntentSenderRequest intentSenderRequest0 = new IntentSenderRequest(pendingIntent0.getIntentSender());
        this.k.a(intentSenderRequest0);
    }
}

