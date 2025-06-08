package androidx.appcompat.view.menu;

import B1.a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import k.l;
import k.n;
import k.y;

public class ListMenuItemView extends LinearLayout implements AbsListView.SelectionBoundsAdjuster, y {
    public n i;
    public ImageView j;
    public RadioButton k;
    public TextView l;
    public CheckBox m;
    public TextView n;
    public ImageView o;
    public ImageView p;
    public LinearLayout q;
    public final Drawable r;
    public final int s;
    public final Context t;
    public boolean u;
    public final Drawable v;
    public final boolean w;
    public LayoutInflater x;
    public boolean y;

    public ListMenuItemView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        a a0 = a.A(this.getContext(), attributeSet0, e.a.r, 0x7F0200F4);  // attr:listMenuViewStyle
        this.r = a0.o(5);
        TypedArray typedArray0 = (TypedArray)a0.k;
        this.s = typedArray0.getResourceId(1, -1);
        this.u = typedArray0.getBoolean(7, false);
        this.t = context0;
        this.v = a0.o(8);
        TypedArray typedArray1 = context0.getTheme().obtainStyledAttributes(null, new int[]{0x1010129}, 0x7F020083, 0);  // attr:dropDownListViewStyle
        this.w = typedArray1.hasValue(0);
        a0.C();
        typedArray1.recycle();
    }

    @Override  // k.y
    public final void a(n n0) {
        String s;
        this.i = n0;
        int v = 0;
        this.setVisibility((n0.isVisible() ? 0 : 8));
        this.setTitle(n0.e);
        this.setCheckable(n0.isCheckable());
        boolean z = n0.n.o() && (n0.n.n() ? n0.j : n0.h) != 0;
        n0.n.n();
        if(z) {
            n n1 = this.i;
            if(!n1.n.o() || (n1.n.n() ? n1.j : n1.h) == 0) {
                v = 8;
            }
            else {
                TextView textView0 = this.n;
                n n2 = this.i;
                int v1 = n2.n.n() ? n2.j : n2.h;
                if(v1 == 0) {
                    s = "";
                }
                else {
                    l l0 = n2.n;
                    l0.a.getResources();
                    StringBuilder stringBuilder0 = new StringBuilder();
                    if(ViewConfiguration.get(l0.a).hasPermanentMenuKey()) {
                        stringBuilder0.append("Menu+");
                    }
                    int v2 = l0.n() ? n2.k : n2.i;
                    n.c(stringBuilder0, v2, 0x10000, "Meta+");
                    n.c(stringBuilder0, v2, 0x1000, "Ctrl+");
                    n.c(stringBuilder0, v2, 2, "Alt+");
                    n.c(stringBuilder0, v2, 1, "Shift+");
                    n.c(stringBuilder0, v2, 4, "Sym+");
                    n.c(stringBuilder0, v2, 8, "Function+");
                    switch(v1) {
                        case 8: {
                            stringBuilder0.append("delete");
                            break;
                        }
                        case 10: {
                            stringBuilder0.append("enter");
                            break;
                        }
                        case 0x20: {
                            stringBuilder0.append("space");
                            break;
                        }
                        default: {
                            stringBuilder0.append(((char)v1));
                        }
                    }
                    s = stringBuilder0.toString();
                }
                textView0.setText(s);
            }
        }
        else {
            v = 8;
        }
        if(this.n.getVisibility() != v) {
            this.n.setVisibility(v);
        }
        this.setIcon(n0.getIcon());
        this.setEnabled(n0.isEnabled());
        this.setSubMenuArrowVisible(n0.hasSubMenu());
        this.setContentDescription(n0.q);
    }

    @Override  // android.widget.AbsListView$SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect0) {
        if(this.p != null && this.p.getVisibility() == 0) {
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.p.getLayoutParams();
            int v = rect0.top;
            rect0.top = this.p.getHeight() + linearLayout$LayoutParams0.topMargin + linearLayout$LayoutParams0.bottomMargin + v;
        }
    }

    private LayoutInflater getInflater() {
        if(this.x == null) {
            this.x = LayoutInflater.from(this.getContext());
        }
        return this.x;
    }

    @Override  // k.y
    public n getItemData() {
        return this.i;
    }

    @Override  // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.setBackground(this.r);
        TextView textView0 = (TextView)this.findViewById(0x7F070116);  // id:title
        this.l = textView0;
        int v = this.s;
        if(v != -1) {
            textView0.setTextAppearance(this.t, v);
        }
        this.n = (TextView)this.findViewById(0x7F0700E8);  // id:shortcut
        ImageView imageView0 = (ImageView)this.findViewById(0x7F0700FA);  // id:submenuarrow
        this.o = imageView0;
        if(imageView0 != null) {
            imageView0.setImageDrawable(this.v);
        }
        this.p = (ImageView)this.findViewById(0x7F070089);  // id:group_divider
        this.q = (LinearLayout)this.findViewById(0x7F070068);  // id:content
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        if(this.j != null && this.u) {
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.getLayoutParams();
            LinearLayout.LayoutParams linearLayout$LayoutParams0 = (LinearLayout.LayoutParams)this.j.getLayoutParams();
            int v2 = viewGroup$LayoutParams0.height;
            if(v2 > 0 && linearLayout$LayoutParams0.width <= 0) {
                linearLayout$LayoutParams0.width = v2;
            }
        }
        super.onMeasure(v, v1);
    }

    public void setCheckable(boolean z) {
        CheckBox checkBox0;
        RadioButton radioButton1;
        if(!z && this.k == null && this.m == null) {
            return;
        }
        if((this.i.x & 4) == 0) {
            if(this.m == null) {
                CheckBox checkBox1 = (CheckBox)this.getInflater().inflate(0x7F0A000E, this, false);  // layout:abc_list_menu_item_checkbox
                this.m = checkBox1;
                LinearLayout linearLayout1 = this.q;
                if(linearLayout1 == null) {
                    this.addView(checkBox1, -1);
                }
                else {
                    linearLayout1.addView(checkBox1, -1);
                }
            }
            radioButton1 = this.m;
            checkBox0 = this.k;
        }
        else {
            if(this.k == null) {
                RadioButton radioButton0 = (RadioButton)this.getInflater().inflate(0x7F0A0011, this, false);  // layout:abc_list_menu_item_radio
                this.k = radioButton0;
                LinearLayout linearLayout0 = this.q;
                if(linearLayout0 == null) {
                    this.addView(radioButton0, -1);
                }
                else {
                    linearLayout0.addView(radioButton0, -1);
                }
            }
            radioButton1 = this.k;
            checkBox0 = this.m;
        }
        if(z) {
            radioButton1.setChecked(this.i.isChecked());
            if(radioButton1.getVisibility() != 0) {
                radioButton1.setVisibility(0);
            }
            if(checkBox0 != null && checkBox0.getVisibility() != 8) {
                checkBox0.setVisibility(8);
            }
        }
        else {
            CheckBox checkBox2 = this.m;
            if(checkBox2 != null) {
                checkBox2.setVisibility(8);
            }
            RadioButton radioButton2 = this.k;
            if(radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        RadioButton radioButton1;
        if((this.i.x & 4) == 0) {
            if(this.m == null) {
                CheckBox checkBox0 = (CheckBox)this.getInflater().inflate(0x7F0A000E, this, false);  // layout:abc_list_menu_item_checkbox
                this.m = checkBox0;
                LinearLayout linearLayout1 = this.q;
                if(linearLayout1 == null) {
                    this.addView(checkBox0, -1);
                }
                else {
                    linearLayout1.addView(checkBox0, -1);
                }
            }
            radioButton1 = this.m;
        }
        else {
            if(this.k == null) {
                RadioButton radioButton0 = (RadioButton)this.getInflater().inflate(0x7F0A0011, this, false);  // layout:abc_list_menu_item_radio
                this.k = radioButton0;
                LinearLayout linearLayout0 = this.q;
                if(linearLayout0 == null) {
                    this.addView(radioButton0, -1);
                }
                else {
                    linearLayout0.addView(radioButton0, -1);
                }
            }
            radioButton1 = this.k;
        }
        radioButton1.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.y = z;
        this.u = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView0 = this.p;
        if(imageView0 != null) {
            imageView0.setVisibility((this.w || !z ? 8 : 0));
        }
    }

    public void setIcon(Drawable drawable0) {
        this.i.n.getClass();
        boolean z = this.y;
        if(!z && !this.u) {
            return;
        }
        ImageView imageView0 = this.j;
        if(imageView0 == null && drawable0 == null && !this.u) {
            return;
        }
        if(imageView0 == null) {
            ImageView imageView1 = (ImageView)this.getInflater().inflate(0x7F0A000F, this, false);  // layout:abc_list_menu_item_icon
            this.j = imageView1;
            LinearLayout linearLayout0 = this.q;
            if(linearLayout0 == null) {
                this.addView(imageView1, 0);
            }
            else {
                linearLayout0.addView(imageView1, 0);
            }
        }
        if(drawable0 == null && !this.u) {
            this.j.setVisibility(8);
            return;
        }
        ImageView imageView2 = this.j;
        if(!z) {
            drawable0 = null;
        }
        imageView2.setImageDrawable(drawable0);
        if(this.j.getVisibility() != 0) {
            this.j.setVisibility(0);
        }
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView0 = this.o;
        if(imageView0 != null) {
            imageView0.setVisibility((z ? 0 : 8));
        }
    }

    public void setTitle(CharSequence charSequence0) {
        if(charSequence0 != null) {
            this.l.setText(charSequence0);
            if(this.l.getVisibility() != 0) {
                this.l.setVisibility(0);
            }
        }
        else if(this.l.getVisibility() != 8) {
            this.l.setVisibility(8);
        }
    }
}

