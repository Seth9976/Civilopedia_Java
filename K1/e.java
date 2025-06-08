package K1;

import H1.b;
import H1.c;
import H1.d;
import J1.a;
import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public final class e implements d {
    public OutputStream a;
    public final HashMap b;
    public final HashMap c;
    public final a d;
    public final g e;
    public static final Charset f;
    public static final b g;
    public static final b h;
    public static final a i;

    static {
        e.f = Charset.forName("UTF-8");
        K1.a a0 = new K1.a(1);
        HashMap hashMap0 = new HashMap();
        hashMap0.put(K1.d.class, a0);
        e.g = new b("key", Collections.unmodifiableMap(new HashMap(hashMap0)));
        K1.a a1 = new K1.a(2);
        HashMap hashMap1 = new HashMap();
        hashMap1.put(K1.d.class, a1);
        e.h = new b("value", Collections.unmodifiableMap(new HashMap(hashMap1)));
        e.i = new a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream0, HashMap hashMap0, HashMap hashMap1, a a0) {
        this.e = new g(this);
        this.a = byteArrayOutputStream0;
        this.b = hashMap0;
        this.c = hashMap1;
        this.d = a0;
    }

    @Override  // H1.d
    public final d a(b b0, int v) {
        this.d(b0, v, true);
        return this;
    }

    @Override  // H1.d
    public final d b(b b0, long v) {
        if(v != 0L) {
            K1.d d0 = (K1.d)(((Annotation)b0.b.get(K1.d.class)));
            if(d0 == null) {
                throw new EncodingException("Field has no @Protobuf config");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
            }
            this.i(((K1.a)d0).a << 3);
            this.j(v);
            return this;
        }
        return this;
    }

    @Override  // H1.d
    public final d c(b b0, boolean z) {
        this.d(b0, ((int)z), true);
        return this;
    }

    public final void d(b b0, int v, boolean z) {
        if(z && v == 0) {
            return;
        }
        K1.d d0 = (K1.d)(((Annotation)b0.b.get(K1.d.class)));
        if(d0 == null) {
            throw new EncodingException("Field has no @Protobuf config");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        this.i(((K1.a)d0).a << 3);
        this.i(v);
    }

    public final void e(b b0, Object object0, boolean z) {
        if(object0 == null) {
            return;
        }
        if(object0 instanceof CharSequence) {
            if(z && ((CharSequence)object0).length() == 0) {
                return;
            }
            this.i(e.h(b0) << 3 | 2);
            byte[] arr_b = ((CharSequence)object0).toString().getBytes(e.f);
            this.i(arr_b.length);
            this.a.write(arr_b);
            return;
        }
        if(object0 instanceof Collection) {
            for(Object object1: ((Collection)object0)) {
                this.e(b0, object1, false);
            }
            return;
        }
        if(object0 instanceof Map) {
            for(Object object2: ((Map)object0).entrySet()) {
                this.g(e.i, b0, ((Map.Entry)object2), false);
            }
            return;
        }
        if(object0 instanceof Double) {
            double f = (double)(((Double)object0));
            if(!z || f != 0.0) {
                this.i(e.h(b0) << 3 | 1);
                this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(f).array());
            }
            return;
        }
        if(object0 instanceof Float) {
            float f1 = (float)(((Float)object0));
            if(!z || f1 != 0.0f) {
                this.i(e.h(b0) << 3 | 5);
                this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(f1).array());
            }
            return;
        }
        if(object0 instanceof Number) {
            long v = ((Number)object0).longValue();
            if(!z || v != 0L) {
                K1.d d0 = (K1.d)(((Annotation)b0.b.get(K1.d.class)));
                if(d0 == null) {
                    throw new EncodingException("Field has no @Protobuf config");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
                this.i(((K1.a)d0).a << 3);
                this.j(v);
                return;
            }
            return;
        }
        if(object0 instanceof Boolean) {
            this.d(b0, ((int)((Boolean)object0).booleanValue()), z);
            return;
        }
        if(object0 instanceof byte[]) {
            if(z && ((byte[])object0).length == 0) {
                return;
            }
            this.i(e.h(b0) << 3 | 2);
            this.i(((byte[])object0).length);
            this.a.write(((byte[])object0));
            return;
        }
        Class class0 = object0.getClass();
        c c0 = (c)this.b.get(class0);
        if(c0 != null) {
            this.g(c0, b0, object0, z);
            return;
        }
        Class class1 = object0.getClass();
        H1.e e0 = (H1.e)this.c.get(class1);
        if(e0 != null) {
            this.e.a = false;
            this.e.c = b0;
            this.e.b = z;
            e0.a(object0, this.e);
            return;
        }
        if(object0 instanceof t0.c) {
            this.d(b0, ((t0.c)object0).i, true);
            return;
        }
        if(object0 instanceof Enum) {
            this.d(b0, ((Enum)object0).ordinal(), true);
            return;
        }
        this.g(this.d, b0, object0, z);
    }

    @Override  // H1.d
    public final d f(b b0, Object object0) {
        this.e(b0, object0, true);
        return this;
    }

    public final void g(c c0, b b0, Object object0, boolean z) {
        long v1;
        try(K1.b b1 = new K1.b()) {  // 初始化器: Ljava/io/OutputStream;-><init>()V
            b1.i = 0L;
            OutputStream outputStream0 = this.a;
            this.a = b1;
            try {
                c0.a(object0, this);
            }
            finally {
                this.a = outputStream0;
            }
        }
        v1 = b1.i;
        if(z && v1 == 0L) {
            return;
        }
        this.i(e.h(b0) << 3 | 2);
        this.j(v1);
        c0.a(object0, this);
    }

    public static int h(b b0) {
        K1.d d0 = (K1.d)(((Annotation)b0.b.get(K1.d.class)));
        if(d0 == null) {
            throw new EncodingException("Field has no @Protobuf config");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return ((K1.a)d0).a;
    }

    public final void i(int v) {
        while(((long)(v & 0xFFFFFF80)) != 0L) {
            this.a.write(v & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(v & 0x7F);
    }

    public final void j(long v) {
        while((0xFFFFFFFFFFFFFF80L & v) != 0L) {
            this.a.write(((int)v) & 0x7F | 0x80);
            v >>>= 7;
        }
        this.a.write(((int)v) & 0x7F);
    }
}

