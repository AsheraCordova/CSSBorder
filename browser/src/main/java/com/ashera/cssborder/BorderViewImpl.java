//start - license
/*
 * Copyright (c) 2025 Ashera Cordova
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
//end - license
package com.ashera.cssborder;
//start - imports
import java.util.*;

import r.android.content.Context;
import r.android.os.Build;
import r.android.view.View;
import r.android.annotation.SuppressLint;
import r.android.annotation.SuppressLint;

import com.ashera.widget.*;
import com.ashera.converter.*;


import static com.ashera.widget.IWidget.*;
//end - imports
public class BorderViewImpl implements com.ashera.widget.IAttributable {
	// start - body
	public final static String LOCAL_NAME = "BorderView"; 
	private IWidget w;
	private BorderViewImpl(IWidget widget) {
		this.w = widget;
	}
	
	public String getLocalName() {
		return LOCAL_NAME;
	}
	
	public BorderViewImpl() {
	}
	
	@Override
	public com.ashera.widget.IAttributable newInstance(IWidget widget) {
		BorderViewImpl newIntance = new BorderViewImpl(widget);
		
		return newIntance;
	}
	
	
	@SuppressLint("NewApi")
	@Override
	public void loadAttributes(String localName) {

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("webUseBoxShadowForBorder").withType("boolean").withOrder(-999).withDecorator("border"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderStyle").withType("string").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopStyle").withType("string").withDecorator("border"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopLeftRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopRightRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomStyle").withType("string").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomLeftRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomRightRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderLeftWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderLeftColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderLeftStyle").withType("string").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRightWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRightColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRightStyle").withType("string").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
	}

	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		View view = (View) w.asWidget();
		org.teavm.jso.dom.html.HTMLElement hTMLElement = (org.teavm.jso.dom.html.HTMLElement) w.asNativeWidget();
		switch (key.getAttributeName()) {
		case "webUseBoxShadowForBorder": {


		 //



			}
			break;
		case "borderWidth": {


		 //



			}
			break;
		case "borderColor": {


		 //



			}
			break;
		case "borderStyle": {


		 //



			}
			break;
		case "borderRadius": {


		 //



			}
			break;
		case "borderTopWidth": {


		 //



			}
			break;
		case "borderTopColor": {


		 //



			}
			break;
		case "borderTopStyle": {


		 //



			}
			break;
		case "borderTopLeftRadius": {


		 //



			}
			break;
		case "borderTopRightRadius": {


		 //



			}
			break;
		case "borderBottomWidth": {


		 //



			}
			break;
		case "borderBottomColor": {


		 //



			}
			break;
		case "borderBottomStyle": {


		 //



			}
			break;
		case "borderBottomLeftRadius": {


		 //



			}
			break;
		case "borderBottomRightRadius": {


		 //



			}
			break;
		case "borderLeftWidth": {


		 //



			}
			break;
		case "borderLeftColor": {


		 //



			}
			break;
		case "borderLeftStyle": {


		 //



			}
			break;
		case "borderRightWidth": {


		 //



			}
			break;
		case "borderRightColor": {


		 //



			}
			break;
		case "borderRightStyle": {


		 //



			}
			break;
		default:
			break;
		}
	}
	
	@SuppressLint("NewApi")
	@Override
	public Object getAttribute(WidgetAttribute key, ILifeCycleDecorator decorator) {
		View view = (View) w.asWidget();
		org.teavm.jso.dom.html.HTMLElement hTMLElement = (org.teavm.jso.dom.html.HTMLElement) w.asNativeWidget();
		switch (key.getAttributeName()) {
			case "borderTopWidth": {
return null;			}
			case "borderTopColor": {
return null;			}
			case "borderTopStyle": {
return null;			}
			case "borderTopLeftRadius": {
return null;			}
			case "borderTopRightRadius": {
return null;			}
			case "borderBottomWidth": {
return null;			}
			case "borderBottomColor": {
return null;			}
			case "borderBottomStyle": {
return null;			}
			case "borderBottomLeftRadius": {
return null;			}
			case "borderBottomRightRadius": {
return null;			}
			case "borderLeftWidth": {
return null;			}
			case "borderLeftColor": {
return null;			}
			case "borderLeftStyle": {
return null;			}
			case "borderRightWidth": {
return null;			}
			case "borderRightColor": {
return null;			}
			case "borderRightStyle": {
return null;			}
		}
		return null;
	}
	
	

	// end - body
}
