package com.google.android.gms.common;

import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

public class ErrorDialogFragment extends DialogFragment {
    public Dialog i;
    public DialogInterface.OnCancelListener j;
    public AlertDialog k;

    public static ErrorDialogFragment newInstance(Dialog dialog0) {
        return ErrorDialogFragment.newInstance(dialog0, null);
    }

    public static ErrorDialogFragment newInstance(Dialog dialog0, DialogInterface.OnCancelListener dialogInterface$OnCancelListener0) {
        ErrorDialogFragment errorDialogFragment0 = new ErrorDialogFragment();
        Dialog dialog1 = (Dialog)Preconditions.checkNotNull(dialog0, "Cannot display null dialog");
        dialog1.setOnCancelListener(null);
        dialog1.setOnDismissListener(null);
        errorDialogFragment0.i = dialog1;
        if(dialogInterface$OnCancelListener0 != null) {
            errorDialogFragment0.j = dialogInterface$OnCancelListener0;
        }
        return errorDialogFragment0;
    }

    @Override  // android.app.DialogFragment
    public void onCancel(DialogInterface dialogInterface0) {
        DialogInterface.OnCancelListener dialogInterface$OnCancelListener0 = this.j;
        if(dialogInterface$OnCancelListener0 != null) {
            dialogInterface$OnCancelListener0.onCancel(dialogInterface0);
        }
    }

    @Override  // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle0) {
        Dialog dialog0 = this.i;
        if(dialog0 == null) {
            this.setShowsDialog(false);
            if(this.k == null) {
                this.k = new AlertDialog.Builder(((Context)Preconditions.checkNotNull(this.getActivity()))).create();
            }
            return this.k;
        }
        return dialog0;
    }

    @Override  // android.app.DialogFragment
    public void show(FragmentManager fragmentManager0, String s) {
        super.show(fragmentManager0, s);
    }
}

