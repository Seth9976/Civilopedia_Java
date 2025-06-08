package l;

import android.content.Context;
import android.view.View.OnClickListener;
import android.view.View;
import android.view.Window.Callback;
import k.a;

public final class H0 implements View.OnClickListener {
    public final a i;
    public final I0 j;

    public H0(I0 i00) {
        this.j = i00;
        Context context0 = i00.a.getContext();
        CharSequence charSequence0 = i00.h;
        a a0 = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        a0.e = 0x1000;
        a0.g = 0x1000;
        a0.l = null;
        a0.m = null;
        a0.n = false;
        a0.o = false;
        a0.p = 16;
        a0.i = context0;
        a0.a = charSequence0;
        this.i = a0;
    }

    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Window.Callback window$Callback0 = this.j.k;
        if(window$Callback0 != null && this.j.l) {
            window$Callback0.onMenuItemSelected(0, this.i);
        }
    }
}

