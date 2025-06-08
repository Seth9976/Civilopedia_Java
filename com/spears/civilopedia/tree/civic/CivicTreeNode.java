package com.spears.civilopedia.tree.civic;

import J2.j;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spears.civilopedia.tree.BoostMeterView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import s2.d;
import s2.g;
import x2.r;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0002RIB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\fR\"\u0010\u0014\u001A\u00020\r8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001A\u00020\r8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u0015\u0010\u000F\u001A\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010 \u001A\u00020\u00198\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\"\u0010(\u001A\u00020!8\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\"\u0010,\u001A\u00020\u00198\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b)\u0010\u001B\u001A\u0004\b*\u0010\u001D\"\u0004\b+\u0010\u001FR\"\u00100\u001A\u00020!8\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b-\u0010#\u001A\u0004\b.\u0010%\"\u0004\b/\u0010\'R\"\u00108\u001A\u0002018\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001A\u0002098\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010D\u001A\u00020!8\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\bA\u0010#\u001A\u0004\bB\u0010%\"\u0004\bC\u0010\'R\"\u0010H\u001A\u00020!8\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\bE\u0010#\u001A\u0004\bF\u0010%\"\u0004\bG\u0010\'R$\u0010P\u001A\u0004\u0018\u00010I8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\"\u0004\bN\u0010OR(\u0010Y\u001A\b\u0012\u0004\u0012\u00020R0Q8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bS\u0010T\u001A\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010`\u001A\u00020Z8\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b\u0014\u0010[\u001A\u0004\b\\\u0010]\"\u0004\b^\u0010_\u00A8\u0006a"}, d2 = {"Lcom/spears/civilopedia/tree/civic/CivicTreeNode;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "percent", "Lw2/k;", "setBoostMeterPercent", "(D)V", "", "i", "I", "getX", "()I", "setX", "(I)V", "x", "j", "getY", "setY", "y", "Landroid/widget/TextView;", "k", "Landroid/widget/TextView;", "getNameLabel", "()Landroid/widget/TextView;", "setNameLabel", "(Landroid/widget/TextView;)V", "nameLabel", "Landroid/widget/ImageView;", "l", "Landroid/widget/ImageView;", "getBoostIconView", "()Landroid/widget/ImageView;", "setBoostIconView", "(Landroid/widget/ImageView;)V", "boostIconView", "m", "getBoostTextView", "setBoostTextView", "boostTextView", "n", "getIconView", "setIconView", "iconView", "Lcom/spears/civilopedia/tree/BoostMeterView;", "q", "Lcom/spears/civilopedia/tree/BoostMeterView;", "getBoostMeterView", "()Lcom/spears/civilopedia/tree/BoostMeterView;", "setBoostMeterView", "(Lcom/spears/civilopedia/tree/BoostMeterView;)V", "boostMeterView", "Landroid/widget/ImageButton;", "r", "Landroid/widget/ImageButton;", "getDetailButton", "()Landroid/widget/ImageButton;", "setDetailButton", "(Landroid/widget/ImageButton;)V", "detailButton", "s", "getTileView", "setTileView", "tileView", "t", "getGearButtonView", "setGearButtonView", "gearButtonView", "Ls2/g;", "u", "Ls2/g;", "getListener", "()Ls2/g;", "setListener", "(Ls2/g;)V", "listener", "", "Ls2/f;", "v", "Ljava/util/List;", "getExtraUnlockIcons", "()Ljava/util/List;", "setExtraUnlockIcons", "(Ljava/util/List;)V", "extraUnlockIcons", "", "Ljava/lang/String;", "getCivicType", "()Ljava/lang/String;", "setCivicType", "(Ljava/lang/String;)V", "civicType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class CivicTreeNode extends RelativeLayout {
    public int i;
    public int j;
    public TextView k;
    public ImageView l;
    public TextView m;
    public ImageView n;
    public LinearLayout o;
    public LinearLayout p;
    public BoostMeterView q;
    public ImageButton r;
    public ImageView s;
    public ImageView t;
    public g u;
    public List v;
    public Object w;
    public String x;
    public boolean y;
    public static final int z;

    public CivicTreeNode(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attributeSet");
        super(context0, attributeSet0);
        this.v = new ArrayList();
        this.w = r.i;
    }

    public final void a(RelativeLayout relativeLayout0, int v) {
        if(v <= 8) {
            LinearLayout linearLayout0 = this.o;
            if(linearLayout0 != null) {
                linearLayout0.addView(relativeLayout0);
                return;
            }
            j.l("unlockStackView");
            throw null;
        }
        LinearLayout linearLayout1 = this.p;
        if(linearLayout1 != null) {
            linearLayout1.addView(relativeLayout0);
            return;
        }
        j.l("unlockStackView2");
        throw null;
    }

    public final ImageView getBoostIconView() {
        ImageView imageView0 = this.l;
        if(imageView0 != null) {
            return imageView0;
        }
        j.l("boostIconView");
        throw null;
    }

    public final BoostMeterView getBoostMeterView() {
        BoostMeterView boostMeterView0 = this.q;
        if(boostMeterView0 != null) {
            return boostMeterView0;
        }
        j.l("boostMeterView");
        throw null;
    }

    public final TextView getBoostTextView() {
        TextView textView0 = this.m;
        if(textView0 != null) {
            return textView0;
        }
        j.l("boostTextView");
        throw null;
    }

    public final String getCivicType() {
        String s = this.x;
        if(s != null) {
            return s;
        }
        j.l("civicType");
        throw null;
    }

    public final ImageButton getDetailButton() {
        ImageButton imageButton0 = this.r;
        if(imageButton0 != null) {
            return imageButton0;
        }
        j.l("detailButton");
        throw null;
    }

    public final List getExtraUnlockIcons() {
        return this.v;
    }

    public final ImageView getGearButtonView() {
        ImageView imageView0 = this.t;
        if(imageView0 != null) {
            return imageView0;
        }
        j.l("gearButtonView");
        throw null;
    }

    public final ImageView getIconView() {
        ImageView imageView0 = this.n;
        if(imageView0 != null) {
            return imageView0;
        }
        j.l("iconView");
        throw null;
    }

    public final g getListener() {
        return this.u;
    }

    public final TextView getNameLabel() {
        TextView textView0 = this.k;
        if(textView0 != null) {
            return textView0;
        }
        j.l("nameLabel");
        throw null;
    }

    public final ImageView getTileView() {
        ImageView imageView0 = this.s;
        if(imageView0 != null) {
            return imageView0;
        }
        j.l("tileView");
        throw null;
    }

    public final int getX() {
        return this.i;
    }

    public final int getY() {
        return this.j;
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View view0 = this.findViewById(0x7F0700AF);  // id:name
        j.e(view0, "findViewById(...)");
        this.setNameLabel(((TextView)view0));
        View view1 = this.findViewById(0x7F07004C);  // id:boostIcon
        j.e(view1, "findViewById(...)");
        this.setBoostIconView(((ImageView)view1));
        View view2 = this.findViewById(0x7F07004D);  // id:boostText
        j.e(view2, "findViewById(...)");
        this.setBoostTextView(((TextView)view2));
        View view3 = this.findViewById(0x7F07008E);  // id:icon
        j.e(view3, "findViewById(...)");
        this.setIconView(((ImageView)view3));
        View view4 = this.findViewById(0x7F07011F);  // id:unlock_stack
        j.e(view4, "findViewById(...)");
        this.o = (LinearLayout)view4;
        View view5 = this.findViewById(0x7F070120);  // id:unlock_stack2
        j.e(view5, "findViewById(...)");
        this.p = (LinearLayout)view5;
        View view6 = this.findViewById(0x7F07004E);  // id:boost_meter
        j.e(view6, "findViewById(...)");
        this.setBoostMeterView(((BoostMeterView)view6));
        View view7 = this.findViewById(0x7F070072);  // id:detail
        j.e(view7, "findViewById(...)");
        this.setDetailButton(((ImageButton)view7));
        View view8 = this.findViewById(0x7F070114);  // id:tile
        j.e(view8, "findViewById(...)");
        this.setTileView(((ImageView)view8));
        View view9 = this.findViewById(0x7F070087);  // id:gear_button
        j.e(view9, "findViewById(...)");
        this.setGearButtonView(((ImageView)view9));
        this.getDetailButton().setOnClickListener(new d(this, 0));
        this.setOnClickListener(new d(this, 1));
    }

    public final void setBoostIconView(ImageView imageView0) {
        j.f(imageView0, "<set-?>");
        this.l = imageView0;
    }

    public final void setBoostMeterPercent(double f) {
        this.getBoostMeterView().setPercent(f);
    }

    public final void setBoostMeterView(BoostMeterView boostMeterView0) {
        j.f(boostMeterView0, "<set-?>");
        this.q = boostMeterView0;
    }

    public final void setBoostTextView(TextView textView0) {
        j.f(textView0, "<set-?>");
        this.m = textView0;
    }

    public final void setCivicType(String s) {
        j.f(s, "<set-?>");
        this.x = s;
    }

    public final void setDetailButton(ImageButton imageButton0) {
        j.f(imageButton0, "<set-?>");
        this.r = imageButton0;
    }

    public final void setExtraUnlockIcons(List list0) {
        j.f(list0, "<set-?>");
        this.v = list0;
    }

    public final void setGearButtonView(ImageView imageView0) {
        j.f(imageView0, "<set-?>");
        this.t = imageView0;
    }

    public final void setIconView(ImageView imageView0) {
        j.f(imageView0, "<set-?>");
        this.n = imageView0;
    }

    public final void setListener(g g0) {
        this.u = g0;
    }

    public final void setNameLabel(TextView textView0) {
        j.f(textView0, "<set-?>");
        this.k = textView0;
    }

    public final void setTileView(ImageView imageView0) {
        j.f(imageView0, "<set-?>");
        this.s = imageView0;
    }

    public final void setX(int v) {
        this.i = v;
    }

    public final void setY(int v) {
        this.j = v;
    }
}

