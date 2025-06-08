package D;

import android.graphics.drawable.Drawable;
import java.util.Objects;

public final class b {
    public final CharSequence a;
    public final Drawable b;

    public b(CharSequence charSequence0, Drawable drawable0) {
        this.a = charSequence0;
        this.b = drawable0;
    }

    // 去混淆评级： 低(30)
    @Override
    public final boolean equals(Object object0) {
        return object0 instanceof b ? Objects.equals(((b)object0).a, this.a) && Objects.equals(((b)object0).b, this.b) : false;
    }

    @Override
    public final int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Drawable drawable0 = this.b;
        if(drawable0 != null) {
            v = drawable0.hashCode();
        }
        return v ^ v1;
    }

    @Override
    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}

