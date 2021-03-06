package universe.constellation.orion.viewer.util;

import android.app.Activity;
import android.util.DisplayMetrics;

public class DensityUtil {

    public static double calcScreenSize(int originalSize, DisplayMetrics metrics) {
        System.out.println("dpi"  + metrics.density);
        return (originalSize * metrics.density + 0.5);
    }

    public static double calcScreenSize(int originalSize, Activity activity) {
        return calcScreenSize(originalSize, activity.getResources().getDisplayMetrics());
    }
}
