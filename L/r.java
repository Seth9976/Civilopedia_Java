package l;

import B1.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import g.b;

public final class r extends CheckedTextView {
    public final M i;
    public static final int[] j;

    static {
        r.j = new int[]{0x1010108};
    }

    public r(Context context0, AttributeSet attributeSet0) {
        B0.a(context0);
        super(context0, attributeSet0, 0x10103C8);
        M m0 = new M(this);
        this.i = m0;
        m0.d(attributeSet0, 0x10103C8);
        m0.b();
        a a0 = a.A(this.getContext(), attributeSet0, r.j, 0x10103C8);
        this.setCheckMarkDrawable(a0.o(0));
        a0.C();
    }

    @Override  // android.widget.CheckedTextView
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        M m0 = this.i;
        if(m0 != null) {
            m0.b();
        }
    }

    @Override  // android.widget.TextView
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        o1.a.J(inputConnection0, editorInfo0, this);
        return inputConnection0;
    }

    @Override  // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int v) {
        this.setCheckMarkDrawable(b.c(this.getContext(), v));
    }

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.R(actionMode$Callback0, this));
    }

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        M m0 = this.i;
        if(m0 != null) {
            m0.e(context0, v);
        }
    }
}

