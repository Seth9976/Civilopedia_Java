package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import c0.b;
import o1.a;

public final class u extends EditText {
    public final o i;
    public final M j;
    public final z k;

    public u(Context context0, AttributeSet attributeSet0) {
        B0.a(context0);
        super(context0, attributeSet0, 0x7F020087);  // attr:editTextStyle
        o o0 = new o(this);
        this.i = o0;
        o0.d(attributeSet0, 0x7F020087);  // attr:editTextStyle
        M m0 = new M(this);
        this.j = m0;
        m0.d(attributeSet0, 0x7F020087);  // attr:editTextStyle
        m0.b();
        z z0 = new z();  // 初始化器: Ljava/lang/Object;-><init>()V
        z0.a = this;
        this.k = z0;
    }

    @Override  // android.widget.TextView
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o o0 = this.i;
        if(o0 != null) {
            o0.a();
        }
        M m0 = this.j;
        if(m0 != null) {
            m0.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        return this.i == null ? null : this.i.b();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.i == null ? null : this.i.c();
    }

    @Override  // android.widget.EditText
    public Editable getText() {
        return Build.VERSION.SDK_INT < 28 ? this.getEditableText() : super.getText();
    }

    @Override  // android.widget.EditText
    public CharSequence getText() {
        return this.getText();
    }

    @Override  // android.widget.TextView
    public TextClassifier getTextClassifier() {
        if(Build.VERSION.SDK_INT < 28) {
            z z0 = this.k;
            if(z0 != null) {
                TextClassifier textClassifier0 = (TextClassifier)z0.b;
                if(textClassifier0 == null) {
                    TextClassificationManager textClassificationManager0 = b.g(((TextView)z0.a).getContext().getSystemService(TextClassificationManager.class));
                    return textClassificationManager0 == null ? TextClassifier.NO_OP : textClassificationManager0.getTextClassifier();
                }
                return textClassifier0;
            }
        }
        return super.getTextClassifier();
    }

    @Override  // android.widget.TextView
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo0) {
        InputConnection inputConnection0 = super.onCreateInputConnection(editorInfo0);
        a.J(inputConnection0, editorInfo0, this);
        return inputConnection0;
    }

    @Override  // android.view.View
    public void setBackgroundDrawable(Drawable drawable0) {
        super.setBackgroundDrawable(drawable0);
        o o0 = this.i;
        if(o0 != null) {
            o0.e();
        }
    }

    @Override  // android.view.View
    public void setBackgroundResource(int v) {
        super.setBackgroundResource(v);
        o o0 = this.i;
        if(o0 != null) {
            o0.f(v);
        }
    }

    @Override  // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback actionMode$Callback0) {
        super.setCustomSelectionActionModeCallback(android.support.v4.media.session.a.R(actionMode$Callback0, this));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList0) {
        o o0 = this.i;
        if(o0 != null) {
            o0.h(colorStateList0);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode porterDuff$Mode0) {
        o o0 = this.i;
        if(o0 != null) {
            o0.i(porterDuff$Mode0);
        }
    }

    @Override  // android.widget.TextView
    public final void setTextAppearance(Context context0, int v) {
        super.setTextAppearance(context0, v);
        M m0 = this.j;
        if(m0 != null) {
            m0.e(context0, v);
        }
    }

    @Override  // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier0) {
        if(Build.VERSION.SDK_INT < 28) {
            z z0 = this.k;
            if(z0 != null) {
                z0.b = textClassifier0;
                return;
            }
        }
        super.setTextClassifier(textClassifier0);
    }
}

