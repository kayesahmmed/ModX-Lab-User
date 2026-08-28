package androidX.Master12;

import android.content.Context;
import android.view.View;

public class AnimatedParticleView extends View {
    public static final int MODE_BOUNCE = 1;
    public static final int MODE_SWIRL = 2;

    public AnimatedParticleView(Context c) {
        super(c);
    }

    public void setAnimationMode(int mode) {}
    public void setLineColor(int color) {}
    public void setparticleCount(int count) {}
    public void setParticleColor(int color) {}
    public void setParticleRadiusRange(float min, float max) {}
}
