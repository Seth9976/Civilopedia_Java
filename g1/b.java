package g1;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class b implements Continuation, OnTokenCanceledListener {
    public final TaskCompletionSource i;

    public b(TaskCompletionSource taskCompletionSource0) {
        this.i = taskCompletionSource0;
        super();
    }

    @Override  // com.google.android.gms.tasks.OnTokenCanceledListener
    public void onCanceled() {
        this.i.a.c();
    }

    @Override  // com.google.android.gms.tasks.Continuation
    public Object then(Task task0) {
        boolean z = task0.isSuccessful();
        TaskCompletionSource taskCompletionSource0 = this.i;
        if(!z) {
            if(task0.getException() == null) {
                taskCompletionSource0.trySetResult(null);
            }
            else {
                Exception exception0 = task0.getException();
                if(exception0 != null) {
                    taskCompletionSource0.setException(exception0);
                    return taskCompletionSource0.getTask();
                }
            }
        }
        return taskCompletionSource0.getTask();
    }
}

