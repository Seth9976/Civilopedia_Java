package g1;

import android.location.Location;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class c implements Continuation {
    public final TaskCompletionSource i;

    public c(TaskCompletionSource taskCompletionSource0) {
        this.i = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        boolean z = task0.isSuccessful();
        TaskCompletionSource taskCompletionSource0 = this.i;
        if(z) {
            taskCompletionSource0.trySetResult(((Location)task0.getResult()));
            return taskCompletionSource0.getTask();
        }
        Exception exception0 = task0.getException();
        if(exception0 != null) {
            taskCompletionSource0.setException(exception0);
        }
        return taskCompletionSource0.getTask();
    }
}

