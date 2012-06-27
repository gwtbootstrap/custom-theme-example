package com.github.caarlos0.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class Example implements EntryPoint {

    public void onModuleLoad() {
        RootPanel.get().add(new ExampleUiBinder());
    }
}
