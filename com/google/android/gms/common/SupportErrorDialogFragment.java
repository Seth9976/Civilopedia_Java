package com.google.android.gms.common;

import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.l;
import com.google.android.gms.common.internal.Preconditions;

public class SupportErrorDialogFragment extends c {
    public Dialog q0;
    public DialogInterface.OnCancelListener r0;
    public AlertDialog s0;

    public static SupportErrorDialogFragment newInstance(Dialog dialog0) {
        return SupportErrorDialogFragment.newInstance(dialog0, null);
    }

    public static SupportErrorDialogFragment newInstance(Dialog dialog0, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        SupportErrorDialogFragment supportErrorDialogFragment0 = new SupportErrorDialogFragment();
        Dialog dialog1 = (Dialog)Preconditions.checkNotNull(dialog0, "Cannot display null dialog");
        dialog1.setOnCancelListener(null);
        dialog1.setOnDismissListener(null);
        supportErrorDialogFragment0.q0 = dialog1;
        if(dialogInterface$OnCancelListener0 != null) {
            supportErrorDialogFragment0.r0 = dialogInterface$OnCancelListener0;
        }
        return supportErrorDialogFragment0;
    }

    @Override  // androidx.fragment.app.c
    public void onCancel(DialogInterface dialogInterface0) {
        DialogInterface.OnCancelListener dialogInterface$OnCancelListener0 = this.r0;
        if(dialogInterface$OnCancelListener0 != null) {
            dialogInterface$OnCancelListener0.onCancel(dialogInterface0);
        }
    }

    @Override  // androidx.fragment.app.c
    public Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = this.q0;
        if(dialog0 == null) {
            this.setShowsDialog(false);
            if(this.s0 == null) {
                this.s0 = new AlertDialog.Builder(((Context)Preconditions.checkNotNull(this.getContext()))).create();
            }
            return this.s0;
        }
        return dialog0;
    }

    @Override  // androidx.fragment.app.c
    public void show(l l0, String s) {
        super.show(l0, s);
    }
}

