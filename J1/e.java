package J1;

import H1.b;
import H1.c;
import H1.d;
import H1.f;
import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class e implements d, f {
    public final boolean a;
    public final JsonWriter b;
    public final HashMap c;
    public final HashMap d;
    public final a e;
    public final boolean f;

    public e(Writer writer0, HashMap hashMap0, HashMap hashMap1, a a0, boolean z) {
        this.a = true;
        this.b = new JsonWriter(writer0);
        this.c = hashMap0;
        this.d = hashMap1;
        this.e = a0;
        this.f = z;
    }

    @Override  // H1.d
    public final d a(b b0, int v) {
        this.i();
        this.b.name(b0.a);
        this.i();
        this.b.value(((long)v));
        return this;
    }

    @Override  // H1.d
    public final d b(b b0, long v) {
        this.i();
        this.b.name(b0.a);
        this.i();
        this.b.value(v);
        return this;
    }

    @Override  // H1.d
    public final d c(b b0, boolean z) {
        this.i();
        this.b.name(b0.a);
        this.i();
        this.b.value(z);
        return this;
    }

    @Override  // H1.f
    public final f d(String s) {
        this.i();
        this.b.value(s);
        return this;
    }

    @Override  // H1.f
    public final f e(boolean z) {
        this.i();
        this.b.value(z);
        return this;
    }

    @Override  // H1.d
    public final d f(b b0, Object object0) {
        this.h(object0, b0.a);
        return this;
    }

    public final e g(Object object0) {
        int v = 0;
        JsonWriter jsonWriter0 = this.b;
        if(object0 == null) {
            jsonWriter0.nullValue();
            return this;
        }
        if(object0 instanceof Number) {
            jsonWriter0.value(((Number)object0));
            return this;
        }
        if(object0.getClass().isArray()) {
            if(object0 instanceof byte[]) {
                this.i();
                jsonWriter0.value(Base64.encodeToString(((byte[])object0), 2));
                return this;
            }
            jsonWriter0.beginArray();
            if(object0 instanceof int[]) {
                while(v < ((int[])object0).length) {
                    jsonWriter0.value(((long)((int[])object0)[v]));
                    ++v;
                }
            }
            else if(object0 instanceof long[]) {
                while(v < ((long[])object0).length) {
                    long v1 = ((long[])object0)[v];
                    this.i();
                    jsonWriter0.value(v1);
                    ++v;
                }
            }
            else if(object0 instanceof double[]) {
                while(v < ((double[])object0).length) {
                    jsonWriter0.value(((double[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof boolean[]) {
                while(v < ((boolean[])object0).length) {
                    jsonWriter0.value(((boolean[])object0)[v]);
                    ++v;
                }
            }
            else if(object0 instanceof Number[]) {
                while(v < ((Number[])object0).length) {
                    this.g(((Number[])object0)[v]);
                    ++v;
                }
            }
            else {
                while(v < ((Object[])object0).length) {
                    this.g(((Object[])object0)[v]);
                    ++v;
                }
            }
            jsonWriter0.endArray();
            return this;
        }
        if(object0 instanceof Collection) {
            jsonWriter0.beginArray();
            for(Object object1: ((Collection)object0)) {
                this.g(object1);
            }
            jsonWriter0.endArray();
            return this;
        }
        if(object0 instanceof Map) {
            jsonWriter0.beginObject();
            for(Object object2: ((Map)object0).entrySet()) {
                Map.Entry map$Entry0 = (Map.Entry)object2;
                Object object3 = map$Entry0.getKey();
                try {
                    this.h(map$Entry0.getValue(), ((String)object3));
                }
                catch(ClassCastException classCastException0) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", object3, object3.getClass()), classCastException0);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
                }
            }
            jsonWriter0.endObject();
            return this;
        }
        Class class0 = object0.getClass();
        c c0 = (c)this.c.get(class0);
        if(c0 != null) {
            jsonWriter0.beginObject();
            c0.a(object0, this);
            jsonWriter0.endObject();
            return this;
        }
        Class class1 = object0.getClass();
        H1.e e0 = (H1.e)this.d.get(class1);
        if(e0 != null) {
            e0.a(object0, this);
            return this;
        }
        if(object0 instanceof Enum) {
            this.i();
            jsonWriter0.value(((Enum)object0).name());
            return this;
        }
        jsonWriter0.beginObject();
        this.e.a(object0, this);
        throw null;
    }

    public final e h(Object object0, String s) {
        JsonWriter jsonWriter0 = this.b;
        if(this.f) {
            if(object0 != null) {
                this.i();
                jsonWriter0.name(s);
                this.g(object0);
            }
            return this;
        }
        this.i();
        jsonWriter0.name(s);
        if(object0 == null) {
            jsonWriter0.nullValue();
            return this;
        }
        this.g(object0);
        return this;
    }

    public final void i() {
        if(!this.a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}

