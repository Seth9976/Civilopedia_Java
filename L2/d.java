package l2;

import J2.j;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.spears.civilopedia.planning.components.YieldLabel;
import com.spears.civilopedia.planning.logic.Plot;
import g2.a;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import n2.A;
import n2.B;
import n2.E;
import n2.b;
import n2.m;
import n2.q;
import n2.v;
import o2.J;
import o2.s;
import x2.i;

public final class d {
    public final a a;
    public J b;
    public v c;
    public q d;

    public d(a a0) {
        this.a = a0;
    }

    public final v a() {
        v v0 = this.c;
        if(v0 != null) {
            return v0;
        }
        j.l("plotWithPosition");
        throw null;
    }

    public final void b(v v0, q q0) {
        j.f(v0, "plotWithPosition");
        j.f(q0, "adjacencyProps");
        this.c = v0;
        this.d = q0;
        Plot plot0 = v0.b;
        a a0 = this.a;
        o1.a.Q(a0.l, "icon_TERRAIN_PLAINS_256");
        boolean z = plot0.k();
        C1.d d0 = a0.c;
        RelativeLayout relativeLayout0 = a0.a;
        ImageView imageView0 = a0.e;
        if(z) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = imageView0.getLayoutParams();
            viewGroup$LayoutParams0.width = (int)(relativeLayout0.getResources().getDisplayMetrics().density * 60.0f);
            ViewGroup.LayoutParams viewGroup$LayoutParams1 = imageView0.getLayoutParams();
            viewGroup$LayoutParams1.height = (int)(60.0f * relativeLayout0.getResources().getDisplayMetrics().density);
            relativeLayout0.setElevation(100.0f);
            ((LinearLayoutCompat)d0.j).setVisibility(0);
            b b0 = (b)q0.g.getValue();
            j.c(b0);
            A a1 = q0.b;
            j.f(a1, "world");
            s s0 = (s)((Map)m.e).get(a1.a);
            if(s0 == null) {
                throw new IllegalStateException("");
            }
            TextView textView0 = (TextView)d0.l;
            textView0.setTextColor(s0.b);
            textView0.setText(android.support.v4.media.session.a.H(b0.b, new Object[0]));
            LinearLayoutCompat linearLayoutCompat0 = (LinearLayoutCompat)d0.i;
            Drawable drawable0 = linearLayoutCompat0.getBackground();
            PorterDuff.Mode porterDuff$Mode0 = PorterDuff.Mode.MULTIPLY;
            drawable0.setColorFilter(s0.a, porterDuff$Mode0);
            o1.a.Q(((ImageView)d0.n), (b0.a == 0 ? "icon_city_capital" : "icon_other_cities"));
            String s1 = ((m)a1.f).b();
            ImageView imageView1 = (ImageView)d0.k;
            o1.a.Q(imageView1, "icon_" + s1);
            imageView1.setColorFilter(s0.b, porterDuff$Mode0);
            linearLayoutCompat0.measure(0, 0);
            linearLayoutCompat0.setLayoutParams(new LinearLayout.LayoutParams(linearLayoutCompat0.getMeasuredWidth(), linearLayoutCompat0.getMeasuredHeight()));
        }
        else {
            ((LinearLayoutCompat)d0.j).setVisibility(8);
            ViewGroup.LayoutParams viewGroup$LayoutParams2 = imageView0.getLayoutParams();
            viewGroup$LayoutParams2.width = (int)(relativeLayout0.getResources().getDisplayMetrics().density * 80.0f);
            ViewGroup.LayoutParams viewGroup$LayoutParams3 = imageView0.getLayoutParams();
            viewGroup$LayoutParams3.height = (int)(80.0f * relativeLayout0.getResources().getDisplayMetrics().density);
        }
        B1.a a2 = a0.b;
        ((RelativeLayout)a2.k).setVisibility(8);
        boolean z1 = plot0.j();
        YieldLabel yieldLabel0 = a0.m;
        if(z1) {
            yieldLabel0.setVisibility(0);
            E e0 = q0.e(null);
            if(e0 != null) {
                yieldLabel0.setup(e0);
            }
        }
        else {
            B b1 = q0.a();
            if(b1 != null) {
                Set set0 = b1.a.entrySet();
                if(set0 != null) {
                    Map.Entry map$Entry0 = (Map.Entry)i.Q(set0);
                    if(map$Entry0 != null && ((Number)map$Entry0.getValue()).doubleValue() > 0.0) {
                        this.c(((String)map$Entry0.getKey()), ((Number)map$Entry0.getValue()).doubleValue());
                        ((RelativeLayout)a2.k).setVisibility(0);
                    }
                }
            }
            yieldLabel0.setVisibility(8);
        }
        d.d(a0.f, plot0.f());
        d.d(a0.j, plot0.h());
        d.d(imageView0, plot0.e());
        d.d(a0.d, plot0.d());
        d.d(a0.g, plot0.g());
        ((TextView)a0.k.k).setText(android.support.v4.media.session.a.H("LOC_PLOTINFO_SWAP_TILE_OWNER", new Object[0]));
    }

    public final void c(String s, double f) {
        j.e(this.a.b, "adjacency");
        RelativeLayout relativeLayout0 = (RelativeLayout)this.a.b.j;
        TextView textView0 = (TextView)this.a.b.l;
        switch(s.hashCode()) {
            case -1939221301: {
                if(s.equals("YIELD_PRODUCTION")) {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x7F040073));  // color:yieldProduction
                }
                else {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x106000B));
                }
                break;
            }
            case 0xECFBDA90: {
                if(s.equals("YIELD_FAITH")) {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x7F040071));  // color:yieldFaith
                }
                else {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x106000B));
                }
                break;
            }
            case 0x210832BC: {
                if(s.equals("YIELD_CULTURE")) {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x7F040070));  // color:yieldCulture
                }
                else {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x106000B));
                }
                break;
            }
            case 1350793074: {
                if(s.equals("YIELD_SCIENCE")) {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x7F040074));  // color:yieldScience
                }
                else {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x106000B));
                }
                break;
            }
            case 0x627C65F2: {
                if(s.equals("YIELD_GOLD")) {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x7F040072));  // color:yieldGold
                }
                else {
                    textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x106000B));
                }
                break;
            }
            default: {
                textView0.setTextColor(v.j.getColor(relativeLayout0.getContext(), 0x106000B));
            }
        }
        String s1 = s.substring(6);
        j.e(s1, "substring(...)");
        j.e(textView0, "label");
        o1.a.V(textView0, "[ICON_" + s1 + "large]+" + f);
    }

    public static void d(ImageView imageView0, String s) {
        if(s != null) {
            imageView0.setVisibility(0);
            o1.a.R(imageView0, "icon_" + s, 0x100);
            return;
        }
        imageView0.setVisibility(8);
    }
}

