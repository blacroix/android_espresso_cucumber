package fr.blacroix.android.espresso_cucumber.test.runner;

import android.os.Bundle;
import android.support.test.runner.MonitoringInstrumentation;

import cucumber.api.android.CucumberInstrumentationCore;

public class CucumberTestRunner extends MonitoringInstrumentation {

    private final CucumberInstrumentationCore instrumentationCore = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle arguments) {
        super.onCreate(arguments);

        instrumentationCore.create(arguments);
        start();
    }

    @Override
    public void onStart() {
        super.onStart();

        waitForIdleSync();
        instrumentationCore.start();
    }
}
