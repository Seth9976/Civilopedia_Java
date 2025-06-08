package com.google.gson.internal.bind;

import A.f;
import Y1.a;
import Y1.b;
import com.google.gson.JsonSyntaxException;
import com.google.gson.n;
import java.util.BitSet;
import q.e;

class TypeAdapters.2 extends n {
    @Override  // com.google.gson.n
    public final Object b(a a0) {
        boolean z1;
        BitSet bitSet0 = new BitSet();
        a0.a();
        int v = a0.v();
        int v1 = 0;
        while(v != 2) {
            boolean z = true;
            switch(e.c(v)) {
                case 5: {
                    String s = a0.t();
                    try {
                        if(Integer.parseInt(s) == 0) {
                            z = false;
                        }
                        z1 = z;
                        break;
                    }
                    catch(NumberFormatException unused_ex) {
                        throw new JsonSyntaxException("Error: Expecting: bitset number value (1, 0), Found: " + s);  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                    }
                    z = false;
                    z1 = z;
                    break;
                }
                case 6: {
                    if(a0.n() == 0) {
                        z = false;
                    }
                    z1 = z;
                    break;
                }
                case 7: {
                    z1 = a0.l();
                    break;
                }
                default: {
                    throw new JsonSyntaxException("Invalid bitset value type: " + f.y(v));  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
                }
            }
            if(z1) {
                bitSet0.set(v1);
            }
            ++v1;
            v = a0.v();
        }
        a0.e();
        return bitSet0;
    }

    @Override  // com.google.gson.n
    public final void c(b b0, Object object0) {
        b0.b();
        int v = ((BitSet)object0).length();
        for(int v1 = 0; v1 < v; ++v1) {
            b0.m(((long)((BitSet)object0).get(v1)));
        }
        b0.e();
    }
}

