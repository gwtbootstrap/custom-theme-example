package com.github.caarlos0.resources;

import com.github.gwtbootstrap.client.ui.config.Configurator;
import com.github.gwtbootstrap.client.ui.resources.Resources;
import com.google.gwt.core.client.GWT;

public class ExampleConfigurator implements Configurator {
    public Resources getResources() {
        return GWT.create(ExampleResources.class);
    }

    public boolean hasResponsiveDesign() {
        return false;
    }
}
