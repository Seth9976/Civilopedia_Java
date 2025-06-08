package f;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View.OnClickListener;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class v implements View.OnClickListener {
    public final View i;
    public final String j;
    public Method k;
    public Context l;

    public v(View view0, String s) {
        this.i = view0;
        this.j = s;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        if(this.k == null) {
            View view1 = this.i;
            Context context0 = view1.getContext();
            while(true) {
                String s = this.j;
                if(context0 != null) {
                    try {
                        if(!context0.isRestricted()) {
                            Method method0 = context0.getClass().getMethod(s, View.class);
                            if(method0 != null) {
                                this.k = method0;
                                this.l = context0;
                                break;
                            }
                        }
                    }
                    catch(NoSuchMethodException unused_ex) {
                    }
                    if(context0 instanceof ContextWrapper) {
                        context0 = ((ContextWrapper)context0).getBaseContext();
                        continue;
                    }
                    context0 = null;
                    continue;
                }
                int v = view1.getId();
                String s1 = v == -1 ? "" : " with id \'" + view1.getContext().getResources().getResourceEntryName(v) + "\'";
                throw new IllegalStateException("Could not find method " + s + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view1.getClass() + s1);
            }
        }
        try {
            this.k.invoke(this.l, view0);
        }
        catch(IllegalAccessException illegalAccessException0) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", illegalAccessException0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            throw new IllegalStateException("Could not execute method for android:onClick", invocationTargetException0);
        }
    }
}

