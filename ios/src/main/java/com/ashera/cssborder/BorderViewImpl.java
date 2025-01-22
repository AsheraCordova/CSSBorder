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

/*-[
#include <UIKit/UIKit.h>
#include "ASUIView.h"
]-*/
import com.google.j2objc.annotations.Property;
import androidx.core.view.*;

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

		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderStyle").withType("string").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderDashWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderDashSpacing").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopStyle").withType("string").withDecorator("border"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopDashWidth").withType("dimension").withDecorator("border"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopDashSpacing").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopLeftRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderTopRightRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomStyle").withType("string").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomDashWidth").withType("dimension").withDecorator("border"));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomDashSpacing").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomLeftRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderBottomRightRadius").withType("dimensionfloat").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderLeftWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderLeftColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderLeftStyle").withType("string").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderLeftDashWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderLeftDashSpacing").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRightWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRightColor").withType("colorstate").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRightStyle").withType("string").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRightDashWidth").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
		WidgetFactory.registerAttribute(localName, new WidgetAttribute.Builder().withName("borderRightDashSpacing").withType("dimension").withDecorator("border").withUiFlag(UPDATE_UI_REQUEST_LAYOUT_N_INVALIDATE));
	}

	@SuppressLint("NewApi")
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue, ILifeCycleDecorator decorator) {
		View view = (View) w.asWidget();
		Object nativeWidget = w.asNativeWidget();
		switch (key.getAttributeName()) {
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
		case "borderDashWidth": {


		 //



			}
			break;
		case "borderDashSpacing": {


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
		case "borderTopDashWidth": {


		 //



			}
			break;
		case "borderTopDashSpacing": {


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
		case "borderBottomDashWidth": {


		 //



			}
			break;
		case "borderBottomDashSpacing": {


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
		case "borderLeftDashWidth": {


		 //



			}
			break;
		case "borderLeftDashSpacing": {


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
		case "borderRightDashWidth": {


		 //



			}
			break;
		case "borderRightDashSpacing": {


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
		Object nativeWidget = w.asNativeWidget();
		switch (key.getAttributeName()) {
			case "borderTopWidth": {
return null;			}
			case "borderTopColor": {
return null;			}
			case "borderTopStyle": {
return null;			}
			case "borderTopDashWidth": {
return null;			}
			case "borderTopDashSpacing": {
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
			case "borderBottomDashWidth": {
return null;			}
			case "borderBottomDashSpacing": {
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
			case "borderLeftDashWidth": {
return null;			}
			case "borderLeftDashSpacing": {
return null;			}
			case "borderRightWidth": {
return null;			}
			case "borderRightColor": {
return null;			}
			case "borderRightStyle": {
return null;			}
			case "borderRightDashWidth": {
return null;			}
			case "borderRightDashSpacing": {
return null;			}
		}
		return null;
	}
	
	

	// end - body
}
