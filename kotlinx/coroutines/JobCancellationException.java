package kotlinx.coroutines;

import J2.j;
import Z3.b;
import i3.e;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 0})
public final class JobCancellationException extends CancellationException {
    @Override
    public final boolean equals(Object object0) {
        if(object0 != this) {
            if(object0 instanceof JobCancellationException && j.a(((JobCancellationException)object0).getMessage(), this.getMessage())) {
                ((JobCancellationException)object0).getClass();
                return j.a(null, null) && j.a(((JobCancellationException)object0).getCause(), this.getCause());
            }
            return false;
        }
        return true;
    }

    @Override
    public final Throwable fillInStackTrace() {
        if(b.a) {
            Throwable throwable0 = super.fillInStackTrace();
            j.b(throwable0, "super.fillInStackTrace()");
            return throwable0;
        }
        return this;
    }

    @Override
    public final int hashCode() {
        if(this.getMessage() != null) {
            throw null;
        }
        KotlinNullPointerException kotlinNullPointerException0 = new KotlinNullPointerException();
        j.j(kotlinNullPointerException0, "J2.j");
        throw kotlinNullPointerException0;
    }

    @Override
    public final String toString() {
        return e.h(new StringBuilder(), super.toString(), "; job=null");
    }
}

