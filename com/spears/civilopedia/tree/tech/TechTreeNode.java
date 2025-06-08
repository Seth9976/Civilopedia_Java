package com.spears.civilopedia.tree.tech;

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
import kotlin.Metadata;
import t2.a;
import t2.c;
import x2.r;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001AB\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b\u00A2\u0006\u0004\b\u000B\u0010\fR\"\u0010\u0014\u001A\u00020\r8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0018\u001A\u00020\r8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\b\u0015\u0010\u000F\u001A\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\"\u0010 \u001A\u00020\u00198\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\"\u0010(\u001A\u00020!8\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\"\u0010,\u001A\u00020\u00198\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b)\u0010\u001B\u001A\u0004\b*\u0010\u001D\"\u0004\b+\u0010\u001FR\"\u00100\u001A\u00020!8\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b-\u0010#\u001A\u0004\b.\u0010%\"\u0004\b/\u0010\'R\"\u00108\u001A\u0002018\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b2\u00103\u001A\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010@\u001A\u0002098\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010H\u001A\u0004\u0018\u00010A8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001A\u00020I8\u0006@\u0006X\u0086.\u00A2\u0006\u0012\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010M\"\u0004\bN\u0010O\u00A8\u0006Q"}, d2 = {"Lcom/spears/civilopedia/tree/tech/TechTreeNode;", "Landroid/widget/RelativeLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "percent", "Lw2/k;", "setBoostMeterPercent", "(D)V", "", "i", "I", "getX", "()I", "setX", "(I)V", "x", "j", "getY", "setY", "y", "Landroid/widget/TextView;", "k", "Landroid/widget/TextView;", "getNameLabel", "()Landroid/widget/TextView;", "setNameLabel", "(Landroid/widget/TextView;)V", "nameLabel", "Landroid/widget/ImageView;", "l", "Landroid/widget/ImageView;", "getBoostIconView", "()Landroid/widget/ImageView;", "setBoostIconView", "(Landroid/widget/ImageView;)V", "boostIconView", "m", "getBoostTextView", "setBoostTextView", "boostTextView", "n", "getIconView", "setIconView", "iconView", "Lcom/spears/civilopedia/tree/BoostMeterView;", "p", "Lcom/spears/civilopedia/tree/BoostMeterView;", "getBoostMeterView", "()Lcom/spears/civilopedia/tree/BoostMeterView;", "setBoostMeterView", "(Lcom/spears/civilopedia/tree/BoostMeterView;)V", "boostMeterView", "Landroid/widget/ImageButton;", "q", "Landroid/widget/ImageButton;", "getDetailButton", "()Landroid/widget/ImageButton;", "setDetailButton", "(Landroid/widget/ImageButton;)V", "detailButton", "Lt2/c;", "r", "Lt2/c;", "getListener", "()Lt2/c;", "setListener", "(Lt2/c;)V", "listener", "", "t", "Ljava/lang/String;", "getTechType", "()Ljava/lang/String;", "setTechType", "(Ljava/lang/String;)V", "techType", "app_regularGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TechTreeNode extends RelativeLayout {
    public int i;
    public int j;
    public TextView k;
    public ImageView l;
    public TextView m;
    public ImageView n;
    public LinearLayout o;
    public BoostMeterView p;
    public ImageButton q;
    public c r;
    public Object s;
    public String t;
    public boolean u;
    public static final int v;

    public TechTreeNode(Context context0, AttributeSet attributeSet0) {
        j.f(context0, "context");
        j.f(attributeSet0, "attrs");
        super(context0, attributeSet0);
        this.s = r.i;
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
        BoostMeterView boostMeterView0 = this.p;
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

    public final ImageButton getDetailButton() {
        ImageButton imageButton0 = this.q;
        if(imageButton0 != null) {
            return imageButton0;
        }
        j.l("detailButton");
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

    public final c getListener() {
        return this.r;
    }

    public final TextView getNameLabel() {
        TextView textView0 = this.k;
        if(textView0 != null) {
            return textView0;
        }
        j.l("nameLabel");
        throw null;
    }

    public final String getTechType() {
        String s = this.t;
        if(s != null) {
            return s;
        }
        j.l("techType");
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
        View view5 = this.findViewById(0x7F07004E);  // id:boost_meter
        j.e(view5, "findViewById(...)");
        this.setBoostMeterView(((BoostMeterView)view5));
        View view6 = this.findViewById(0x7F070072);  // id:detail
        j.e(view6, "findViewById(...)");
        this.setDetailButton(((ImageButton)view6));
        this.getDetailButton().setOnClickListener(new a(this, 0));
        this.setOnClickListener(new a(this, 1));
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
        this.p = boostMeterView0;
    }

    public final void setBoostTextView(TextView textView0) {
        j.f(textView0, "<set-?>");
        this.m = textView0;
    }

    public final void setDetailButton(ImageButton imageButton0) {
        j.f(imageButton0, "<set-?>");
        this.q = imageButton0;
    }

    public final void setIconView(ImageView imageView0) {
        j.f(imageView0, "<set-?>");
        this.n = imageView0;
    }

    public final void setListener(c c0) {
        this.r = c0;
    }

    public final void setNameLabel(TextView textView0) {
        j.f(textView0, "<set-?>");
        this.k = textView0;
    }

    public final void setTechType(String s) {
        j.f(s, "<set-?>");
        this.t = s;
    }

    public final void setX(int v) {
        this.i = v;
    }

    public final void setY(int v) {
        this.j = v;
    }
}

