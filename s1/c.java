package s1;

import N1.b;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;

public final class c implements b {
    public final int a;
    public final Object b;

    public c(Object object0, int v) {
        this.a = v;
        this.b = object0;
        super();
    }

    @Override  // N1.b
    public final Object get() {
        if(this.a != 0) {
            return (FirebaseCommonRegistrar)this.b;
        }
        String s = (String)this.b;
        try {
            Class class0 = Class.forName(s);
            if(!e.class.isAssignableFrom(class0)) {
                throw new InvalidRegistrarException("Class " + s + " is not an instance of com.google.firebase.components.ComponentRegistrar");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            return (e)class0.getDeclaredConstructor(null).newInstance(null);
        }
        catch(ClassNotFoundException unused_ex) {
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new InvalidRegistrarException(i3.e.f("Could not instantiate ", s, "."), illegalAccessException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(InstantiationException instantiationException0) {
            throw new InvalidRegistrarException(i3.e.f("Could not instantiate ", s, "."), instantiationException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(NoSuchMethodException noSuchMethodException0) {
            throw new InvalidRegistrarException("Could not instantiate " + s, noSuchMethodException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new InvalidRegistrarException("Could not instantiate " + s, invocationTargetException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
        }
        Log.w("ComponentDiscovery", "Class " + s + " is not an found.");
        return null;
    }
}

