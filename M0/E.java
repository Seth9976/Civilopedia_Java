package m0;

import A.f;
import B1.b;
import com.google.android.gms.internal.play_billing.zze;

public final class e {
    public int a;
    public String b;

    public static b a() {
        b b0 = new b();  // 初始化器: Ljava/lang/Object;-><init>()V
        b0.b = "";
        return b0;
    }

    @Override
    public final String toString() {
        return f.j("Response Code: ", zze.zzi(this.a), ", Debug Message: ", this.b);
    }
}

