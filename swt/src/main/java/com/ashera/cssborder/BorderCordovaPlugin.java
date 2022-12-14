package com.ashera.cssborder;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;

import com.ashera.converter.ConverterFactory;
import com.ashera.layout.decorator.BorderAttributeCommand;
import com.ashera.layout.decorator.BorderDecorator;
import com.ashera.widget.WidgetFactory;

public class BorderCordovaPlugin extends CordovaPlugin {
	@Override
	public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
		
        ConverterFactory.registerCommandConverter(new BorderAttributeCommand("border"));
        WidgetFactory.registerLifeCycleDecorator("border", new BorderDecorator());
        WidgetFactory.registerAttributableFor("View", new BorderViewImpl());

	}
}
