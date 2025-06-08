package m2;

import J2.j;
import N.T;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class m extends T {
    public final LinearLayout s;
    public final TextView t;
    public final ImageView u;
    public final ImageView v;

    public m(LinearLayout linearLayout0) {
        super(linearLayout0);
        this.s = linearLayout0;
        View view0 = linearLayout0.findViewById(0x7F07010F);  // id:text
        j.e(view0, "findViewById(...)");
        this.t = (TextView)view0;
        this.u = (ImageView)linearLayout0.findViewById(0x7F07008E);  // id:icon
        this.v = (ImageView)linearLayout0.findViewById(0x7F070095);  // id:info
    }
}

