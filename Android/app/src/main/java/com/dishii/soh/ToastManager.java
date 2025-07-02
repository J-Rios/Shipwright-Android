package com.dishii.soh;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class ToastManager {
    public static void show(final Activity activity, final String message) {
        activity.runOnUiThread(() -> {
            Context context = activity.getApplicationContext();
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
        });
    }
}
