package com.lioneltlynch.aqidatafinder.profile;

import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProfileDetector implements EnvironmentAware {

    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public void detectActiveProfiles() {
        String[] activeProfiles = environment.getActiveProfiles();

        for (String profile : activeProfiles) {
            System.out.println("Active Profile: " + profile);
        }
    }
}