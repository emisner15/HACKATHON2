package com.example.quickstart;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.text.AlteredCharSequence;
import android.view.LayoutInflater;

/**
 * Created by Eric on 3/24/2018.
 */

public class AddStatsFunction extends DialogFragment {
    //// Interface to handle the Events
    interface AddStatDialogListener {

        void onSaveButtonClick(DialogFragment dialog);
        // Void onCancelButtonClick(DialogFragment dialog);
    }

    AddStatDialogListener addStatListener;
    Context context;

    // Override the Fragment.onAttach() method to instantiate the SetPasswordDialogListener
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        // Verify that the host activity implements the callback interface
        try {
            // Instantiate the SetPasswordDialogListener so we can send events to the host
            addStatListener = (AddStatDialogListener) activity;
        } catch (ClassCastException e) {
            // The activity doesn't implement the interface , throw exception
            throw new ClassCastException(activity.toString()
                    + " must implement AddStatDialogListener");
        }
    }
    // END

    @Override
    public Dialog onCreateDialog(Bundle savedInstancesState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        builder.setView(inflater.inflate(R.layout.stats_form,null));
    }
}
