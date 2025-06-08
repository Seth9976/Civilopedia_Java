package x1;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

public final class r implements Continuation {
    public final int i;
    public final TaskCompletionSource j;

    public r(int v, TaskCompletionSource taskCompletionSource0) {
        this.i = v;
        this.j = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public final Object then(Task task0) {
        if(this.i != 0) {
            boolean z = task0.isSuccessful();
            TaskCompletionSource taskCompletionSource0 = this.j;
            if(z) {
                taskCompletionSource0.trySetResult(task0.getResult());
                return null;
            }
            Exception exception0 = task0.getException();
            Objects.requireNonNull(exception0);
            taskCompletionSource0.trySetException(exception0);
            return null;
        }
        boolean z1 = task0.isSuccessful();
        TaskCompletionSource taskCompletionSource1 = this.j;
        if(z1) {
            taskCompletionSource1.trySetResult(task0.getResult());
            return null;
        }
        Exception exception1 = task0.getException();
        Objects.requireNonNull(exception1);
        taskCompletionSource1.trySetException(exception1);
        return null;
    }
}

