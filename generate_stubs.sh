#!/bin/bash

# TextViewAnimation
cat << 'INNER' > ./app/src/main/java/Master/Animation/Text/TextViewAnimation.java
package Master.Animation.Text;
import android.content.Context;
public class TextViewAnimation {
    public TextViewAnimation(Context c) {}
}
INNER

# AnimatedParticleView
cat << 'INNER' > ./app/src/main/java/androidX/Master12/AnimatedParticleView.java
package androidX.Master12;
import android.content.Context;
public class AnimatedParticleView {
    public static final int MODE_BOUNCE = 1;
    public static final int MODE_SWIRL = 2;
    public AnimatedParticleView(Context c) {}
    public void setAnimationMode(int mode) {}
}
INNER

# TastyToast
cat << 'INNER' > ./app/src/main/java/com/sdsmdg/tastytoast/TastyToast.java
package com.sdsmdg.tastytoast;
import android.content.Context;
import android.widget.Toast;
public class TastyToast {
    public static final int LENGTH_LONG = Toast.LENGTH_LONG;
    public static final int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static final int DEFAULT = 0;
    public static Toast makeText(Context c, String text, int duration, int type) {
        Toast toast = Toast.makeText(c, text, duration);
        toast.show();
        return toast;
    }
}
INNER

# FancyToast
mkdir -p ./app/src/main/java/com/shashank/sony/fancytoastlib
cat << 'INNER' > ./app/src/main/java/com/shashank/sony/fancytoastlib/FancyToast.java
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
INNER

# AndroidSketchwareMaster
cat << 'INNER' > ./app/src/main/java/com/AndroidSketchwareMaster/CopyAssetTask.java
package com.AndroidSketchwareMaster;
public class CopyAssetTask {}
INNER
cat << 'INNER' > ./app/src/main/java/com/AndroidSketchwareMaster/ShizukuMaster.java
package com.AndroidSketchwareMaster;
public class ShizukuMaster {}
INNER
cat << 'INNER' > ./app/src/main/java/com/AndroidSketchwareMaster/ShizukuShell.java
package com.AndroidSketchwareMaster;
public class ShizukuShell {
    public interface OnProcessCompleteListener {}
}
INNER

# iOS Dialogs
mkdir -p ./app/src/main/java/com/cyberalpha/darkIOS
cat << 'INNER' > ./app/src/main/java/com/cyberalpha/darkIOS/DarkIOSDialog.java
package com.cyberalpha.darkIOS;
public class DarkIOSDialog {}
INNER

mkdir -p ./app/src/main/java/com/cyberalpha/iOSDialog
cat << 'INNER' > ./app/src/main/java/com/cyberalpha/iOSDialog/IOSDialog.java
package com.cyberalpha.iOSDialog;
public class IOSDialog {}
INNER

echo "Stubs generated."
