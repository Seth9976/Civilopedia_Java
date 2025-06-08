package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int i;
    public final int j;

    public BrowserActionsFallbackMenuView(Context context0, AttributeSet attributeSet0) {
        super(context0, attributeSet0);
        this.i = this.getResources().getDimensionPixelOffset(0x7F05004F);  // dimen:browser_actions_context_menu_min_padding
        this.j = this.getResources().getDimensionPixelOffset(0x7F05004E);  // dimen:browser_actions_context_menu_max_width
    }

    @Override  // android.widget.LinearLayout
    public final void onMeasure(int v, int v1) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(this.getResources().getDisplayMetrics().widthPixels - this.i * 2, this.j), 0x40000000), v1);
    }
}

