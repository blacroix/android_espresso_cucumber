/*
 * Meetic
 * Copyright (c) 2016. All rights reserved.
 */

package fr.blacroix.android.espresso_cucumber.test.tools;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitor;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import android.support.test.runner.lifecycle.Stage;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class ActivityKiller implements Runnable {

    public static void killOpenActivities() {
        new Handler(Looper.getMainLooper()).post(new ActivityKiller());
    }

    private final ActivityLifecycleMonitor activityLifecycleMonitor;

    private ActivityKiller() {
        this.activityLifecycleMonitor = ActivityLifecycleMonitorRegistry.getInstance();
    }

    @Override
    public void run() {
        final List<Activity> activities = new ArrayList<>();

        for (final Stage stage : EnumSet.range(Stage.CREATED, Stage.STOPPED)) {
            activities.addAll(activityLifecycleMonitor.getActivitiesInStage(stage));
        }

        for (final Activity activity : activities) {
            if (!activity.isFinishing()) {
                activity.finish();
            }
        }
    }
}