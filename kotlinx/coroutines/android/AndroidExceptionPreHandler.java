package kotlinx.coroutines.android;

import A2.a;
import J2.j;
import J2.o;
import J2.r;
import O2.q;
import android.os.Build.VERSION;
import android.support.annotation.Keep;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import w2.c;
import w2.h;

@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FR\u001D\u0010\u0013\u001A\u0004\u0018\u00010\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "LA2/a;", "", "Lkotlin/Function0;", "Ljava/lang/reflect/Method;", "<init>", "()V", "invoke", "()Ljava/lang/reflect/Method;", "LA2/h;", "context", "", "exception", "Lw2/k;", "handleException", "(LA2/h;Ljava/lang/Throwable;)V", "preHandler$delegate", "Lw2/c;", "getPreHandler", "preHandler", "kotlinx-coroutines-android"}, k = 1, mv = {1, 4, 0})
public final class AndroidExceptionPreHandler extends a implements I2.a {
    static final q[] $$delegatedProperties;
    private final c preHandler$delegate;

    static {
        o o0 = new o(r.a.b(AndroidExceptionPreHandler.class), "preHandler", "getPreHandler()Ljava/lang/reflect/Method;");
        AndroidExceptionPreHandler.$$delegatedProperties = new q[]{r.a.e(o0)};
    }

    public AndroidExceptionPreHandler() {
        this.preHandler$delegate = new h(this);
    }

    private final Method getPreHandler() {
        q q0 = AndroidExceptionPreHandler.$$delegatedProperties[0];
        return (Method)this.preHandler$delegate.getValue();
    }

    public void handleException(A2.h h0, Throwable throwable0) {
        j.g(h0, "context");
        j.g(throwable0, "exception");
        Thread thread0 = Thread.currentThread();
        if(Build.VERSION.SDK_INT >= 28) {
            j.b(thread0, "thread");
            thread0.getUncaughtExceptionHandler().uncaughtException(thread0, throwable0);
            return;
        }
        Method method0 = this.getPreHandler();
        Object object0 = null;
        Object object1 = method0 == null ? null : method0.invoke(null, null);
        if(object1 instanceof Thread.UncaughtExceptionHandler) {
            object0 = object1;
        }
        if(((Thread.UncaughtExceptionHandler)object0) != null) {
            ((Thread.UncaughtExceptionHandler)object0).uncaughtException(thread0, throwable0);
        }
    }

    @Override  // I2.a
    public Object invoke() {
        return this.invoke();
    }

    public Method invoke() {
        try {
            Method method0 = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            j.b(method0, "it");
            if(Modifier.isPublic(method0.getModifiers()) && Modifier.isStatic(method0.getModifiers())) {
                return method0;
            }
        }
        catch(Throwable unused_ex) {
        }
        return null;
    }
}

