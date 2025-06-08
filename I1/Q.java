package i1;

import B.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzlf;

public final class q extends BroadcastReceiver {
    public final zzlf a;
    public boolean b;
    public boolean c;

    public q(zzlf zzlf0) {
        Preconditions.checkNotNull(zzlf0);
        this.a = zzlf0;
    }

    public final void a() {
        zzlf zzlf0 = this.a;
        zzlf0.b();
        zzlf0.zzaz().zzg();
        zzlf0.zzaz().zzg();
        if(this.b) {
            zzlf0.zzay().zzj().zza("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            Context context0 = zzlf0.zzau();
            try {
                context0.unregisterReceiver(this);
            }
            catch(IllegalArgumentException illegalArgumentException0) {
                zzlf0.zzay().zzd().zzb("Failed to unregister the network broadcast receiver", illegalArgumentException0);
            }
        }
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        zzlf zzlf0 = this.a;
        zzlf0.b();
        String s = intent0.getAction();
        zzlf0.zzay().zzj().zzb("NetworkBroadcastReceiver received action", s);
        if("android.net.conn.CONNECTIVITY_CHANGE".equals(s)) {
            boolean z = zzlf0.zzl().zza();
            if(this.c != z) {
                this.c = z;
                zzlf0.zzaz().zzp(new b(this, z));
            }
            return;
        }
        zzlf0.zzay().zzk().zzb("NetworkBroadcastReceiver received unknown action", s);
    }
}

