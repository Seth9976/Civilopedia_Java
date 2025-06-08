package s1;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o2.I;

public final class p extends I {
    public final Set a;
    public final Set b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final b f;

    public p(a a0, b b0) {
        HashSet hashSet0 = new HashSet();
        HashSet hashSet1 = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        for(Object object0: a0.b) {
            int v = ((j)object0).c;
            int v1 = ((j)object0).b;
            Class class0 = ((j)object0).a;
            if(v == 0) {
                if(v1 == 2) {
                    hashSet3.add(class0);
                }
                else {
                    hashSet0.add(class0);
                }
            }
            else if(v == 2) {
                hashSet2.add(class0);
            }
            else if(v1 == 2) {
                hashSet4.add(class0);
            }
            else {
                hashSet1.add(class0);
            }
        }
        if(!a0.f.isEmpty()) {
            hashSet0.add(L1.a.class);
        }
        this.a = Collections.unmodifiableSet(hashSet0);
        this.b = Collections.unmodifiableSet(hashSet1);
        this.c = Collections.unmodifiableSet(hashSet2);
        this.d = Collections.unmodifiableSet(hashSet3);
        this.e = Collections.unmodifiableSet(hashSet4);
        this.f = b0;
    }

    @Override  // o2.I
    public final Object a(Class class0) {
        if(!this.a.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency " + class0 + ".");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        Object object0 = this.f.a(class0);
        if(!class0.equals(L1.a.class)) {
            return object0;
        }
        L1.a a0 = (L1.a)object0;
        return new o();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Override  // o2.I
    public final Set b(Class class0) {
        if(!this.d.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency Set<" + class0 + ">.");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return this.f.b(class0);
    }

    @Override  // s1.b
    public final N1.b c(Class class0) {
        if(!this.b.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency Provider<" + class0 + ">.");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return this.f.c(class0);
    }

    @Override  // s1.b
    public final N1.b d(Class class0) {
        if(!this.e.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency Provider<Set<" + class0 + ">>.");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return this.f.d(class0);
    }

    @Override  // s1.b
    public final n e(Class class0) {
        if(!this.c.contains(class0)) {
            throw new DependencyException("Attempting to request an undeclared dependency Deferred<" + class0 + ">.");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        return this.f.e(class0);
    }
}

