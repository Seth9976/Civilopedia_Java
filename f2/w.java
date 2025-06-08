package f2;

import J2.j;
import N.T;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class w extends T {
    public final LinearLayout s;
    public final TextView t;

    public w(LinearLayout linearLayout0) {
        super(linearLayout0);
        this.s = linearLayout0;
        View view0 = linearLayout0.findViewById(0x7F07010F);  // id:text
        j.e(view0, "findViewById(...)");
        this.t = (TextView)view0;
    }
}

