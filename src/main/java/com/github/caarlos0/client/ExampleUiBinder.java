package com.github.caarlos0.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ExampleUiBinder extends Composite {
    interface ExampleUiBinderUiBinder extends UiBinder<HTMLPanel, ExampleUiBinder> {
    }

    private static ExampleUiBinderUiBinder ourUiBinder = GWT.create(ExampleUiBinderUiBinder.class);

    public ExampleUiBinder() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }
}