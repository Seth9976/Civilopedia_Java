package com.google.android.gms.internal.ads;

import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

public final class k3 implements DialogInterface.OnClickListener {
    public final JsPromptResult i;
    public final EditText j;

    public k3(JsPromptResult jsPromptResult0, EditText editText0) {
        this.i = jsPromptResult0;
        this.j = editText0;
    }

    @Override  // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface0, int v) {
        String s = this.j.getText().toString();
        this.i.confirm(s);
    }
}

