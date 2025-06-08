package com.spears.civilopedia.planning.components;

import J2.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.Metadata;
import n2.E;
import o1.a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Lcom/spears/civilopedia/planning/components/YieldLabel;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ln2/E;", "yield", "Lw2/k;", "setup", "(Ln2/E;)V", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class YieldLabel extends LinearLayout {
    public static final String[] i;

    static {
        YieldLabel.i = new String[]{"YIELD_FOOD", "YIELD_PRODUCTION", "YIELD_GOLD", "YIELD_CULTURE", "YIELD_SCIENCE", "YIELD_FAITH"};
    }

    public YieldLabel(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        super(context0, attributeSet0);
    }

    public final void setup(E e0) {
        j.f(e0, "yield");
        this.removeAllViews();
        String[] arr_s = YieldLabel.i;
        for(int v = 0; v < 6; ++v) {
            String s = arr_s[v];
            Integer integer0 = (Integer)e0.a.get(s);
            if(integer0 != null && ((int)integer0) > 0) {
                View view0 = LayoutInflater.from(this.getContext()).inflate(0x7F0A0066, this, false);  // layout:planning_view_yield_label_icon
                View view1 = view0.findViewById(0x7F07008E);  // id:icon
                j.e(view1, "findViewById(...)");
                a.Q(((ImageView)view1), "ICON_" + s + "_" + Math.min(5, ((int)integer0)));
                if(((int)integer0) > 5) {
                    ((ImageView)view0.findViewById(0x7F07006A)).setVisibility(0);  // id:count
                    View view2 = view0.findViewById(0x7F07006A);  // id:count
                    j.e(view2, "findViewById(...)");
                    a.Q(((ImageView)view2), "ICON_YIELD_VARIATION_" + (((int)integer0) > 11 ? "MANY" : integer0.toString()));
                }
                else {
                    ((ImageView)view0.findViewById(0x7F07006A)).setVisibility(8);  // id:count
                }
                this.addView(view0);
            }
        }
    }
}

