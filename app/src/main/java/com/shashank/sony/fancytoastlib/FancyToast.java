package com.shashank.sony.fancytoastlib;
import android.content.Context;
import android.widget.Toast;
public class FancyToast {
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;
    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int DEFAULT = 0;
    public static Toast makeText(Context c, String text, int duration, int type, boolean b) {
        Toast toast = Toast.makeText(c, text, duration);
        toast.show();
        return toast;
    }
}
