package K1;

import H1.b;
import H1.f;
import com.google.firebase.encoders.EncodingException;

public final class g implements f {
    public boolean a;
    public boolean b;
    public b c;
    public final e d;

    public g(e e0) {
        this.a = false;
        this.b = false;
        this.d = e0;
    }

    @Override  // H1.f
    public final f d(String s) {
        if(this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        this.a = true;
        this.d.e(this.c, s, this.b);
        return this;
    }

    @Override  // H1.f
    public final f e(boolean z) {
        if(this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");  // 初始化器: Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
        }
        this.a = true;
        this.d.d(this.c, ((int)z), this.b);
        return this;
    }
}

