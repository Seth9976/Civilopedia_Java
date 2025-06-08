package l1;

import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.TaskExecutors;

public final class b extends CancellationToken {
    public final j a;

    public b() {
        this.a = new j();
    }

    @Override  // com.google.android.gms.tasks.CancellationToken
    public final boolean isCancellationRequested() {
        return this.a.isComplete();
    }

    @Override  // com.google.android.gms.tasks.CancellationToken
    public final CancellationToken onCanceledRequested(OnTokenCanceledListener onTokenCanceledListener0) {
        D3.b b0 = new D3.b(onTokenCanceledListener0, 27);
        this.a.addOnSuccessListener(TaskExecutors.MAIN_THREAD, b0);
        return this;
    }
}

