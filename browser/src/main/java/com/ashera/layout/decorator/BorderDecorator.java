package com.ashera.layout.decorator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.teavm.jso.dom.html.HTMLElement;

import com.ashera.layout.ViewImpl;
import com.ashera.widget.ILifeCycleDecorator;
import com.ashera.widget.IWidget;
import com.ashera.widget.WidgetAttribute;

import r.android.content.res.ColorStateList;
import r.android.view.View;

public class BorderDecorator implements ILifeCycleDecorator {
	//start - props
	@com.google.j2objc.annotations.Weak private IWidget widget;
	//end - props

	private HTMLElement htmlElement;
	private Map<String, r.android.content.res.ColorStateList> colorMap = new HashMap<>();
	private final static java.util.List<String> METHODS = new java.util.ArrayList<>();
	
	@Override
	public ILifeCycleDecorator newInstance(IWidget widget) {
		BorderDecorator borderDecorator = new BorderDecorator();
		borderDecorator.htmlElement = (HTMLElement) widget.asNativeWidget();
		borderDecorator.widget = widget;
		return borderDecorator;
	}
    //start - body

	public BorderDecorator() {
	}
	
	@Override
	public IWidget getWidget() {
		return widget;
	}
	
	private void setBorderProperty(String property, String value) {
		Object webUseBoxShadowForBorder = widget.getFromTempCache("webUseBoxShadowForBorder");
		
		if (webUseBoxShadowForBorder == null || (boolean) webUseBoxShadowForBorder == false) {
			htmlElement.getStyle().setProperty(property, value);
		} else {
			if (property.indexOf("radius") != -1) {
				htmlElement.getStyle().setProperty(property, value);
			} else {
				htmlElement.setAttribute(property, value);
				useBoxShadowForBorder();
			}
		}
	}
	
	private void useBoxShadowForBorder() {
		String boxShadowTemplate = "inset 0 %s 0 0 %s, inset 0 -%s 0 0 %s, inset %s 0 0 %s, inset -%s 0 0 %s";
		
		String borderWidth = htmlElement.getAttribute("border-width");
		
		if (borderWidth == null) {
			borderWidth = "0px";
		}
		
		String borderTopWidth = htmlElement.getAttribute("border-top-width");
		String borderBottomWidth = htmlElement.getAttribute("border-bottom-width");
		String borderLeftWidth = htmlElement.getAttribute("border-left-width");
		String borderRightWidth = htmlElement.getAttribute("border-right-width");
				
		if (borderTopWidth == null) {
			borderTopWidth = borderWidth;
		}
		
		if (borderBottomWidth == null) {
			borderBottomWidth = borderWidth;
		}
		
		if (borderLeftWidth == null) {
			borderLeftWidth = borderWidth;
		}
		
		if (borderRightWidth == null) {
			borderRightWidth = borderWidth;
		}
		
		String borderColor = htmlElement.getAttribute("border-color");
		
		if (borderColor == null) {
			borderColor = "black";
		}
		
		String borderTopColor = htmlElement.getAttribute("border-top-color");
		String borderBottomColor = htmlElement.getAttribute("border-bottom-color");
		String borderLeftColor = htmlElement.getAttribute("border-left-color");
		String borderRightColor = htmlElement.getAttribute("border-right-color");
				
		if (borderTopColor == null) {
			borderTopColor = borderColor;
		}
		
		if (borderBottomColor == null) {
			borderBottomColor = borderColor;
		}
		
		if (borderLeftColor == null) {
			borderLeftColor = borderColor;
		}
		
		if (borderRightColor == null) {
			borderRightColor = borderColor;
		}
		
		
		String finalValue = String.format(boxShadowTemplate, 
				borderTopWidth, borderTopColor,
				borderBottomWidth, borderBottomColor,
				borderLeftWidth, borderLeftColor,
				borderRightWidth, borderRightColor
				);
		
		htmlElement.getStyle().setProperty("box-shadow", finalValue);
	}

	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue) {
		String attributeName = key.getAttributeName();
		switch (attributeName) {
		case "webUseBoxShadowForBorder": {
			widget.storeInTempCache("webUseBoxShadowForBorder", objValue);
		}
			break;
		case "borderWidth": {
			setBorderProperty("border-width", ((int) objValue) + "px");
		}
			break;
		case "borderColor": {
			
			setBorderColor(attributeName, "border-color", objValue);

		}
			break;
		case "borderStyle": {
			setBorderProperty("border-style", strValue);

		}
			break;
		case "borderDashWidth": {


		}
			break;
		case "borderDashSpacing": {


		}
		break;
		case "borderRadius": {

			setBorderProperty("border-radius", ((float) objValue) + "px");

		}
			break;
		case "borderTopWidth": {

			setBorderProperty("border-top-width", ((int) objValue) + "px");

		}
			break;
		case "borderTopColor": {
			setBorderColor(attributeName, "border-top-color", objValue);
		}
			break;
		case "borderTopStyle": {

			setBorderProperty("border-top-style", strValue);

		}
			break;
		case "borderTopDashWidth": {


		}
			break;
		case "borderTopDashSpacing": {


		}
			break;
		case "borderTopLeftRadius": {

			if (ViewImpl.isRTLLayout(widget)) {
				setBorderProperty("border-top-right-radius", ((float) objValue) + "px");
			} else {
				setBorderProperty("border-top-left-radius", ((float) objValue) + "px");
			}

		}
			break;
		case "borderTopRightRadius": {

			if (!ViewImpl.isRTLLayout(widget)) {
				setBorderProperty("border-top-right-radius", ((float) objValue) + "px");
			} else {
				setBorderProperty("border-top-left-radius", ((float) objValue) + "px");
			}

		}
			break;
		case "borderBottomWidth": {

			setBorderProperty("border-bottom-width", ((int) objValue) + "px");

		}
			break;
		case "borderBottomColor": {
			setBorderColor(attributeName, "border-bottom-color", objValue);

		}
			break;
		case "borderBottomStyle": {

			setBorderProperty("border-bottom-style", strValue);

		}
			break;
		case "borderBottomDashWidth": {

		}
			break;
		case "borderBottomDashSpacing": {

		}
			break;
		case "borderBottomLeftRadius": {

			if (ViewImpl.isRTLLayout(widget)) {
				setBorderProperty("border-bottom-right-radius", ((float) objValue) + "px");
			} else {
				setBorderProperty("border-bottom-left-radius", ((float) objValue) + "px");
			}

		}
			break;
		case "borderBottomRightRadius": {

			if (!ViewImpl.isRTLLayout(widget)) {
				setBorderProperty("border-bottom-right-radius", ((float) objValue) + "px");
			} else {
				setBorderProperty("border-bottom-left-radius", ((float) objValue) + "px");
			}

		}
			break;
		case "borderLeftWidth": {
			if (ViewImpl.isRTLLayout(widget)) {
				setBorderProperty("border-right-width", ((int) objValue) + "px");
			} else {
				setBorderProperty("border-left-width", ((int) objValue) + "px");
			}

		}
			break;
		case "borderLeftColor": {
			if (ViewImpl.isRTLLayout(widget)) {
				setBorderColor(attributeName, "border-right-color", objValue);
			} else {
				setBorderColor(attributeName, "border-left-color", objValue);
			}

		}
			break;
		case "borderLeftStyle": {
			if (ViewImpl.isRTLLayout(widget)) {
				setBorderProperty("border-right-style", strValue);
			} else {
				setBorderProperty("border-left-style", strValue);
			}

		}
			break;
		case "borderLeftDashWidth": {


		}
			break;
		case "borderLeftDashSpacing": {


		}
			break;
		case "borderRightWidth": {
			if (!ViewImpl.isRTLLayout(widget)) {
				setBorderProperty("border-right-width", ((int) objValue) + "px");
			} else {
				setBorderProperty("border-left-width", ((int) objValue) + "px");
			}

		}
			break;
		case "borderRightColor": {
			if (!ViewImpl.isRTLLayout(widget)) {
				setBorderColor(attributeName, "border-right-color", objValue);
			} else {
				setBorderColor(attributeName, "border-left-color", objValue);
			}

		

		}
			break;
		case "borderRightStyle": {

			if (!ViewImpl.isRTLLayout(widget)) {
				setBorderProperty("border-right-style", strValue);
			} else {
				setBorderProperty("border-left-style", strValue);
			}

		}
			break;
		case "borderRightDashWidth": {

		}
			break;
		case "borderRightDashSpacing": {

		}
			break;
		}
		
		updateBorderStyle();
	}

	private void updateBorderStyle() {
		if (!isPropertySet("border-style") && (isPropertySet("border-color") || isPropertySet("border-width") || isPropertySet("border-radius"))) {
			if (!isPropertySet("border-bottom-style")) {
				setBorderProperty("border-bottom-style", "solid");
			}
			
			if (!isPropertySet("border-top-style")) {
				setBorderProperty("border-top-style", "solid");
			}
			
			if (!isPropertySet("border-left-style")) {
				setBorderProperty("border-left-style", "solid");
			}
			
			if (!isPropertySet("border-right-style")) {
				setBorderProperty("border-right-style", "solid");
			}
		}
		
		if (!isPropertySet("border-bottom-style") && (isPropertySet("border-bottom-color") || isPropertySet("border-bottom-width") || isPropertySet("border-bottom-radius"))) {
			setBorderProperty("border-bottom-style", "solid");
		}
		
		if (!isPropertySet("border-top-style") && (isPropertySet("border-top-color") || isPropertySet("border-top-width") || isPropertySet("border-top-radius"))) {
			setBorderProperty("border-top-style", "solid");
		}
		
		if (!isPropertySet("border-left-style") && (isPropertySet("border-left-color") || isPropertySet("border-left-width") || isPropertySet("border-left-radius"))) {
			setBorderProperty("border-left-style", "solid");
		}
		
		if (!isPropertySet("border-right-style") && (isPropertySet("border-right-color") || isPropertySet("border-right-width") || isPropertySet("border-right-radius"))) {
			setBorderProperty("border-right-style", "solid");
		}
	}

	private boolean isPropertySet(String property) {
		String propertyValue = htmlElement.getStyle().getPropertyValue(property);
		return propertyValue != null && !propertyValue.isEmpty();
	}

	private void setBorderColor(String attributeName, String property, Object objValue) {
		if (objValue instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) objValue;
			View view = (View) widget.asWidget();
			objValue = colorStateList.getColorForState(view.getDrawableState(), r.android.graphics.Color.RED);
			colorMap.put(attributeName, colorStateList);
		}
		
		setBorderProperty(property, (String) ViewImpl.getColor(objValue));
	}

	@Override
	public Object getAttribute(WidgetAttribute widgetAttribute) {
		switch (widgetAttribute.getAttributeName()) {
		case "borderTopWidth": {
			return ViewImpl.getPropertyValueAsInt(htmlElement, "border-top-width");
		}
		case "borderTopColor": {
			return colorMap.get("borderTopColor");
		}
		case "borderTopStyle": {
			return htmlElement.getStyle().getPropertyValue("border-top-style");

		}
		case "borderTopDashWidth": {
			return 0;
		}
		case "borderTopDashSpacing": {
			return 0;

		}
		case "borderTopLeftRadius": {
			if (ViewImpl.isRTLLayout(widget)) {
				return ViewImpl.getPropertyValueAsFloat(htmlElement, "border-top-right-radius");
			}
			return ViewImpl.getPropertyValueAsFloat(htmlElement, "border-top-left-radius");
		}
		case "borderTopRightRadius": {
			if (!ViewImpl.isRTLLayout(widget)) {
				return ViewImpl.getPropertyValueAsFloat(htmlElement, "border-top-right-radius");
			}
			return ViewImpl.getPropertyValueAsFloat(htmlElement, "border-top-left-radius");
		}

		case "borderBottomWidth": {
			return ViewImpl.getPropertyValueAsInt(htmlElement, "border-bottom-width");
		}
		case "borderBottomColor": {
			return colorMap.get("borderBottomColor");
		}
		case "borderBottomStyle": {
			return htmlElement.getStyle().getPropertyValue("border-bottom-style");

		}
		case "borderBottomDashWidth": {
			return 0;
		}
		case "borderBottomDashSpacing": {
			return 0;

		}
		case "borderBottomLeftRadius": {
			if (ViewImpl.isRTLLayout(widget)) {
				return ViewImpl.getPropertyValueAsFloat(htmlElement, "border-bottom-right-radius");
			}
			return ViewImpl.getPropertyValueAsFloat(htmlElement, "border-bottom-left-radius");
		}
		case "borderBottomRightRadius": {
			if (!ViewImpl.isRTLLayout(widget)) {
				return ViewImpl.getPropertyValueAsFloat(htmlElement, "border-bottom-right-radius");
			}
			return ViewImpl.getPropertyValueAsFloat(htmlElement, "border-bottom-left-radius");
		}
		case "borderLeftWidth": {
			if (ViewImpl.isRTLLayout(widget)) {
				return ViewImpl.getPropertyValueAsInt(htmlElement, "border-right-width");
			}
			return ViewImpl.getPropertyValueAsInt(htmlElement, "border-left-width");
		}
		case "borderLeftColor": {
			if (ViewImpl.isRTLLayout(widget)) {
				return colorMap.get("borderRightColor");
			}
			return colorMap.get("borderLeftColor");
		}
		case "borderLeftStyle": {
			if (ViewImpl.isRTLLayout(widget)) {
				return htmlElement.getStyle().getPropertyValue("border-right-style");
			}
			return htmlElement.getStyle().getPropertyValue("border-left-style");

		}
		case "borderLeftDashWidth": {
			return 0;
		}
		case "borderLeftDashSpacing": {
			return 0;

		}
		case "borderRightWidth": {
			if (!ViewImpl.isRTLLayout(widget)) {
				return ViewImpl.getPropertyValueAsInt(htmlElement, "border-right-width");
			}
			return ViewImpl.getPropertyValueAsInt(htmlElement, "border-left-width");
		}
		case "borderRightColor": {
			if (!ViewImpl.isRTLLayout(widget)) {
				return colorMap.get("borderRightColor");
			}
			return colorMap.get("borderLeftColor");
		}
		case "borderRightStyle": {
			if (!ViewImpl.isRTLLayout(widget)) {
				return htmlElement.getStyle().getPropertyValue("border-right-style");
			}
			return htmlElement.getStyle().getPropertyValue("border-left-style");

		}
		case "borderRightDashWidth": {
			return 0;
		}
		case "borderRightDashSpacing": {
			return 0;

		}
		}
		return null;
	}

	@Override
	public List<String> getMethods() {
		return METHODS;
	}

	//end - body


	@Override
	public void drawableStateChanged() {
		ColorStateList color = colorMap.get("borderColor");
		
		if (isBorderStateful(color)) {
			setBorderColor("borderColor", "border-color", color);
		}
		
		color = colorMap.get("borderBottomColor");
		if (isBorderStateful(color)) {
			setBorderColor("borderBottomColor", "border-bottom-color", color);
		}
		
		color = colorMap.get("borderTopColor");
		if (isBorderStateful(color)) {
			setBorderColor("borderTopColor", "border-top-color", color);
		}
		
		color = colorMap.get("borderLeftColor");
		if (isBorderStateful(color)) {
			setBorderColor("borderLeftColor", "border-left-color", color);
		}
		
		color = colorMap.get("borderRightColor");
		if (isBorderStateful(color)) {
			setBorderColor("borderRightColor", "border-right-color", color);
		}
	}

	private boolean isBorderStateful(r.android.content.res.ColorStateList color) {
		return color != null && color instanceof r.android.content.res.ColorStateList 
				&& ((r.android.content.res.ColorStateList)color).isStateful();
	}

	@Override
	public void execute(String method, Object... params) {
	}

	@Override
	public void initialized() {
		
	}
	
}
