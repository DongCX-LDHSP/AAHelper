package com.dcx.AAHelper.Utils;

import android.content.Context;
import android.widget.Toast;

public class ToastMaker {
    public static void showLongToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }

    public static void showShortToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
