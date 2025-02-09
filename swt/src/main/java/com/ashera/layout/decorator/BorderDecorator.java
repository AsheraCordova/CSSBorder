package com.ashera.layout.decorator;

import java.util.Arrays;
import java.util.List;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Path;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

import com.ashera.common.ColorManager;
import com.ashera.layout.ViewImpl;
import com.ashera.widget.ILifeCycleDecorator;
import com.ashera.widget.IWidget;
import com.ashera.widget.WidgetAttribute;

import r.android.view.View;

public class BorderDecorator implements ILifeCycleDecorator {
	//start - props
	private Border borderTop;
	private Border borderLeft;
	private Border borderRight;
	private Border borderBottom;
	@com.google.j2objc.annotations.Weak private IWidget widget;
	private float borderTopLeftRadius = 0;
	private float borderTopRightRadius = 0;
	private float borderBottomRightRadius = 0;
	private float borderBottomLeftRadius = 0;
	//end - props
	private Object defaultColor = ColorManager.getColor("#000");

	private View view;
	private Control control;
	private final static java.util.List<String> METHODS = Arrays.asList(new String[] {"initialised"});
	
	@Override
	public ILifeCycleDecorator newInstance(IWidget widget) {
		BorderDecorator borderDecorator = new BorderDecorator();
		borderDecorator.view = (View) widget.asWidget();
		borderDecorator.control = (Control) widget.asNativeWidget();
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
	
	@Override
	public void setAttribute(WidgetAttribute key, String strValue, Object objValue) {
		switch (key.getAttributeName()) {
		case "borderWidth": {

			createBorderWidth((int) objValue);

		}
			break;
		case "borderColor": {

			createBorderColor(objValue);

		}
			break;
		case "borderStyle": {

			createBorderStyle((String) objValue);

		}
			break;
		case "borderDashWidth": {

			createBorderDashWidth((int) objValue);

		}
			break;
		case "borderDashSpacing": {

			createBorderDashSpacing((int) objValue);

		}
		break;
		case "borderRadius": {

			createBorderRadius((float) objValue);

		}
			break;
		case "borderTopWidth": {

			createBorderWidthTop((int) objValue);

		}
			break;
		case "borderTopColor": {

			createBorderColorTop(objValue);

		}
			break;
		case "borderTopStyle": {

			createBorderStyleTop((String) objValue);

		}
			break;
		case "borderTopDashWidth": {

			createBorderDashWidthTop((int) objValue);

		}
			break;
		case "borderTopDashSpacing": {

			createBorderDashSpacingTop((int) objValue);

		}
			break;
		case "borderTopLeftRadius": {

			createBorderRadiusTopLeft((float) objValue);

		}
			break;
		case "borderTopRightRadius": {

			createBorderRadiusTopRight((float) objValue);

		}
			break;
		case "borderBottomWidth": {

			createBorderWidthBottom((int) objValue);

		}
			break;
		case "borderBottomColor": {

			createBorderColorBottom(objValue);

		}
			break;
		case "borderBottomStyle": {

			createBorderStyleBottom((String) objValue);

		}
			break;
		case "borderBottomDashWidth": {

			createBorderDashWidthBottom((int) objValue);

		}
			break;
		case "borderBottomDashSpacing": {

			createBorderDashSpacingBottom((int) objValue);

		}
			break;
		case "borderBottomLeftRadius": {

			createBorderRadiusBottomLeft((float) objValue);

		}
			break;
		case "borderBottomRightRadius": {

			createBorderRadiusBottomRight((float) objValue);

		}
			break;
		case "borderLeftWidth": {

			createBorderWidthLeft((int) objValue);

		}
			break;
		case "borderLeftColor": {

			createBorderColorLeft(objValue);

		}
			break;
		case "borderLeftStyle": {

			createBorderStyleLeft((String) objValue);

		}
			break;
		case "borderLeftDashWidth": {

			createBorderDashWidthLeft((int) objValue);

		}
			break;
		case "borderLeftDashSpacing": {

			createBorderDashSpacingLeft((int) objValue);

		}
			break;
		case "borderRightWidth": {

			createBorderWidthRight((int) objValue);

		}
			break;
		case "borderRightColor": {

			createBorderColorRight(objValue);

		}
			break;
		case "borderRightStyle": {

			createBorderStyleRight((String) objValue);

		}
			break;
		case "borderRightDashWidth": {

			createBorderDashWidthRight((int) objValue);

		}
			break;
		case "borderRightDashSpacing": {

			createBorderDashSpacingRight((int) objValue);

		}
			break;
		}
		addCommandIfNeeded();
	}

	@Override
	public Object getAttribute(WidgetAttribute widgetAttribute) {
		switch (widgetAttribute.getAttributeName()) {
		case "borderTopWidth": {
			if (borderTop == null) {
				return 0;
			}
			return borderTop.getWidth();
		}
		case "borderTopColor": {
			if (borderTop == null) {
				return null;
			}
			return borderTop.getColor();
		}
		case "borderTopStyle": {
			if (borderTop == null) {
				return null;
			}
			return borderTop.getStyle();

		}
		case "borderTopDashWidth": {
			if (borderTop == null) {
				return 0;
			}
			return borderTop.getDashWidth();
		}
		case "borderTopDashSpacing": {
			if (borderTop == null) {
				return 0;
			}
			return borderTop.getDashSpacing();

		}
		case "borderTopLeftRadius": {
			if (borderTop == null) {
				return 0;
			}
			return borderTop.getTopLeftRadius();

		}
		case "borderTopRightRadius": {
			if (borderTop == null) {
				return 0;
			}
			return borderTop.getTopRightRadius();
		}

		case "borderBottomWidth": {
			if (borderBottom == null) {
				return 0;
			}
			return borderBottom.getWidth();
		}
		case "borderBottomColor": {
			if (borderBottom == null) {
				return null;
			}
			return borderBottom.getColor();
		}
		case "borderBottomStyle": {
			if (borderBottom == null) {
				return null;
			}
			return borderBottom.getStyle();

		}
		case "borderBottomDashWidth": {
			if (borderBottom == null) {
				return 0;
			}
			return borderBottom.getDashWidth();
		}
		case "borderBottomDashSpacing": {
			if (borderBottom == null) {
				return 0;
			}
			return borderBottom.getDashSpacing();

		}
		case "borderBottomLeftRadius": {
			if (borderBottom == null) {
				return 0;
			}
			return borderBottom.getBottomLeftRadius();

		}
		case "borderBottomRightRadius": {
			if (borderBottom == null) {
				return 0;
			}
			return borderBottom.getBottomRightRadius();
		}
		case "borderLeftWidth": {
			if (borderLeft == null) {
				return 0;
			}
			return borderLeft.getWidth();
		}
		case "borderLeftColor": {
			if (borderLeft == null) {
				return null;
			}
			return borderLeft.getColor();
		}
		case "borderLeftStyle": {
			if (borderLeft == null) {
				return null;
			}
			return borderLeft.getStyle();

		}
		case "borderLeftDashWidth": {
			if (borderLeft == null) {
				return 0;
			}
			return borderLeft.getDashWidth();
		}
		case "borderLeftDashSpacing": {
			if (borderLeft == null) {
				return 0;
			}
			return borderLeft.getDashSpacing();

		}
		case "borderRightWidth": {
			if (borderRight == null) {
				return 0;
			}
			return borderRight.getWidth();
		}
		case "borderRightColor": {
			if (borderRight == null) {
				return null;
			}
			return borderRight.getColor();
		}
		case "borderRightStyle": {
			if (borderRight == null) {
				return null;
			}
			return borderRight.getStyle();

		}
		case "borderRightDashWidth": {
			if (borderRight == null) {
				return 0;
			}
			return borderRight.getDashWidth();
		}
		case "borderRightDashSpacing": {
			if (borderRight == null) {
				return 0;
			}
			return borderRight.getDashSpacing();

		}
		}
		return null;
	}

	@Override
	public List<String> getMethods() {
		return METHODS;
	}

	private void initBorderTop() {
		if (borderTop == null) {
			borderTop = new Border();
		}
	}

	private void initBorderLeft() {
		if (borderLeft == null) {
			borderLeft = new Border();
		}
	}

	private void initBorderRight() {
		if (borderRight == null) {
			borderRight = new Border();
		}
	}

	private void initBorderBottom() {
		if (borderBottom == null) {
			borderBottom = new Border();
		}
	}

	public void createBorderStyle(String style) {
		createBorderStyleTop(style);
		createBorderStyleBottom(style);
		createBorderStyleLeft(style);
		createBorderStyleRight(style);
	}

	public void createBorderDashSpacing(int dashSpacing) {
		createBorderDashSpacingTop(dashSpacing);
		createBorderDashSpacingBottom(dashSpacing);
		createBorderDashSpacingLeft(dashSpacing);
		createBorderDashSpacingRight(dashSpacing);
	}

	public void createBorderDashWidth(int dashWidth) {
		createBorderDashWidthTop(dashWidth);
		createBorderDashWidthBottom(dashWidth);
		createBorderDashWidthLeft(dashWidth);
		createBorderDashWidthRight(dashWidth);
	}

	public void createBorderColor(Object color) {
		createBorderColorTop(color);
		createBorderColorBottom(color);
		createBorderColorLeft(color);
		createBorderColorRight(color);
	}

	public void createBorderWidth(int borderWith) {
		createBorderWidthTop(borderWith);
		createBorderWidthBottom(borderWith);
		createBorderWidthLeft(borderWith);
		createBorderWidthRight(borderWith);
	}

	public void createBorderRadius(float radius) {

		createBorderRadiusTopLeft(radius);
		createBorderRadiusBottomLeft(radius);
		createBorderRadiusTopRight(radius);
		createBorderRadiusBottomRight(radius);
	}

	public void createBorderColorBottom(Object color) {
		initBorderBottom();
		borderBottom.setColor(color);
		invalidate();
	}


	public void createBorderColorTop(Object color) {
		initBorderTop();
		borderTop.setColor(color);
		invalidate();
	}

	public void createBorderColorLeft(Object color) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderColorRightInternal(color);
		} else {
			createBorderColorLeftInternal(color);
		}
	}

	private void createBorderColorLeftInternal(Object color) {
		initBorderLeft();
		borderLeft.setColor(color);
		invalidate();
	}

	public void createBorderColorRight(Object color) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderColorLeftInternal(color);
		} else {
			createBorderColorRightInternal(color);
		}
	}

	private void createBorderColorRightInternal(Object color) {
		initBorderRight();
		borderRight.setColor(color);
		invalidate();
	}

	public void createBorderWidthRight(int borderWith) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderWidthLeftInternal(borderWith);
		} else {
			createBorderWidthRightInternal(borderWith);
		}
	}

	private void createBorderWidthRightInternal(int borderWith) {
		initBorderRight();
		borderRight.setWidth(borderWith);
		invalidate();
	}

	public void createBorderWidthTop(int borderWith) {
		initBorderTop();
		borderTop.setWidth(borderWith);
		invalidate();
	}

	public void createBorderWidthBottom(int borderWith) {
		initBorderBottom();
		borderBottom.setWidth(borderWith);
		invalidate();
	}

	public void createBorderWidthLeft(int borderWith) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderWidthRightInternal(borderWith);
		} else {
			createBorderWidthLeftInternal(borderWith);
		}
	}

	private void createBorderWidthLeftInternal(int borderWith) {
		initBorderLeft();
		borderLeft.setWidth(borderWith);
		invalidate();
	}

	public void createBorderStyleTop(String style) {
		initBorderTop();
		borderTop.setStyle(style);
		invalidate();
	}

	public void createBorderDashSpacingTop(int dashSpacing) {
		initBorderTop();
		borderTop.setDashSpacing(dashSpacing);
		invalidate();
	}

	public void createBorderDashWidthTop(int dashWidth) {
		initBorderTop();
		borderTop.setDashWidth(dashWidth);
		invalidate();
	}

	public void createBorderStyleBottom(String style) {
		initBorderBottom();
		borderBottom.setStyle(style);
		invalidate();
	}

	public void createBorderDashSpacingBottom(int dashSpacing) {
		initBorderBottom();
		borderBottom.setDashSpacing(dashSpacing);
		invalidate();
	}

	public void createBorderDashWidthBottom(int dashWidth) {
		initBorderBottom();
		borderBottom.setDashWidth(dashWidth);
		invalidate();
	}

	public void createBorderStyleLeft(String style) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderStyleRightInternal(style);
		} else {
			createBorderStyleLeftInternal(style);
		}
	}

	private void createBorderStyleLeftInternal(String style) {
		initBorderLeft();
		borderLeft.setStyle(style);
		invalidate();
	}

	public void createBorderDashSpacingLeft(int dashSpacing) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderDashSpacingRightInternal(dashSpacing);
		} else {
			createBorderDashSpacingLeftInternal(dashSpacing);
		}
	}

	private void createBorderDashSpacingLeftInternal(int dashSpacing) {
		initBorderLeft();
		borderLeft.setDashSpacing(dashSpacing);
		invalidate();
	}

	public void createBorderDashWidthLeft(int dashWidth) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderDashWidthRightInternal(dashWidth);
		} else {			
			createBorderDashWidthLeftInternal(dashWidth);
		}
	}

	private void createBorderDashWidthLeftInternal(int dashWidth) {
		initBorderLeft();
		borderLeft.setDashWidth(dashWidth);
		invalidate();
	}

	public void createBorderStyleRight(String style) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderStyleLeftInternal(style);
		} else {
			createBorderStyleRightInternal(style);
		}
	}

	private void createBorderStyleRightInternal(String style) {
		initBorderRight();
		borderRight.setStyle(style);
		invalidate();
	}

	public void createBorderDashSpacingRight(int dashSpacing) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderDashSpacingLeftInternal(dashSpacing);
		} else {
			createBorderDashSpacingRightInternal(dashSpacing);
		}
	}

	private void createBorderDashSpacingRightInternal(int dashSpacing) {
		initBorderRight();
		borderRight.setDashSpacing(dashSpacing);
		invalidate();
	}

	public void createBorderDashWidthRight(int dashWidth) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderDashWidthLeftInternal(dashWidth);
		} else {
			createBorderDashWidthRightInternal(dashWidth);
		}
	}

	private void createBorderDashWidthRightInternal(int dashWidth) {
		initBorderRight();
		borderRight.setDashWidth(dashWidth);
		invalidate();
	}

	public void createBorderRadiusTopLeft(float radius) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderRadiusTopRightInternal(radius);
		} else {
			createBorderRadiusTopLeftInternal(radius);
		}
	}

	private void createBorderRadiusTopLeftInternal(float radius) {
		this.borderTopLeftRadius = radius;

		initBorderTop();
		initBorderLeft();
		borderTop.setTopLeftRadius(radius);
		borderLeft.setTopLeftRadius(radius);
		if (invalidate()) {
			createMask();
		}
	}

	public void createBorderRadiusTopRight(float radius) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderRadiusTopLeftInternal(radius);
		} else {
			createBorderRadiusTopRightInternal(radius);
		}
	}

	private void createBorderRadiusTopRightInternal(float radius) {
		this.borderTopRightRadius = radius;
		initBorderTop();
		initBorderRight();
		borderTop.setTopRightRadius(radius);
		borderRight.setTopRightRadius(radius);
		if (invalidate()) {
			createMask();
		}
	}

	public void createBorderRadiusBottomLeft(float radius) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderRadiusBottomRightInternal(radius);
		} else {
			createBorderRadiusBottomLeftInternal(radius);
		}
	}

	private void createBorderRadiusBottomLeftInternal(float radius) {
		this.borderBottomLeftRadius = radius;
		initBorderBottom();
		initBorderLeft();
		borderBottom.setBottomLeftRadius(radius);
		borderLeft.setBottomLeftRadius(radius);
		if (invalidate()) {
			createMask();
		}
	}

	public void createBorderRadiusBottomRight(float radius) {
		if (ViewImpl.isRTLLayout(widget)) {
			createBorderRadiusBottomLeftInternal(radius);
		} else {
			createBorderRadiusBottomRightInternal(radius);
		}
	}

	private void createBorderRadiusBottomRightInternal(float radius) {
		this.borderBottomRightRadius = radius;
		initBorderBottom();
		initBorderRight();
		borderBottom.setBottomRightRadius(radius);
		borderRight.setBottomRightRadius(radius);
		if (invalidate()) {
			createMask();
		}
	}
	
	public static class Arc {
		float left, top, right, bottom;
		int startAngle, sweepAngle;
		public Arc(float left, float top, float right, float bottom, int startAngle, int sweepAngle) {
			this.left = left;
			this.top = top;
			this.right = right;
			this.bottom = bottom;
			this.sweepAngle = sweepAngle;
			this.startAngle = startAngle;
		}
		
		public int getEndAngle() {
			return startAngle + sweepAngle;
		}
		
		public float getRadius() {
			return ((right - left) / 2f);
		}
		
		public float getWidth() {
			return right - left;
		}
		
		public float getHeight() {
			return bottom - top;
		}
		
		public float getMidPointX() {
			return left + ((right - left) / 2f);
		}
		
		public float getMidPointY() {
			return top + ((bottom - top)/2f);
		}
		
		public int getStartAngle() {
			return startAngle;
		}

	}

	public void createBorder(float x1, float y1, float x2, float y2, Object canvas, Object path, Object paint, Border border, String where) {
		reset(path, paint);
		
		Object borderColor = border.getColor();
		if (borderColor == null) {
			borderColor = defaultColor;
		}
		int width = border.getWidth();
		setColorAndWidth(path, paint, borderColor, width);

		switch (border.getStyle()) {
		case "dashed": {
			int defaultDashSpacing = (int) com.ashera.widget.PluginInvoker.convertDpToPixel("1dp");
			int defaultDashWidth = (int) com.ashera.widget.PluginInvoker.convertDpToPixel("3dp");
			int dashWidth = border.getDashWidth() == -1 ? defaultDashWidth : border.getDashWidth();
			int dashSpacing = border.getDashSpacing() == -1 ? defaultDashSpacing : border.getDashSpacing();
			setDashedEffect(path, paint, dashWidth, dashSpacing);
			break;
		}
		case "dotted": {
			int radius = (int) com.ashera.widget.PluginInvoker.convertDpToPixel("1dp");
			int defaultDashSpacing = (int) com.ashera.widget.PluginInvoker.convertDpToPixel("1dp");
			int dashSpacing = border.getDashSpacing() == -1 ? defaultDashSpacing : border.getDashSpacing();
			setDottedEffect(path, paint, radius, dashSpacing);
			break;
		}
		default:
			break;
		}

		boolean hasRadius = hasRadius(border);
		if (hasRadius) {
			createArc(x1, y1, x2, y2, border, path, where);
		} else {
			moveTo(path, x1, y1);
			quadTo(path, x1, y1, x2, y2);
		}
		
		drawPath(canvas, path, paint);
	}
	private void createArc(float x1, float y1, float x2, float y2, Border border, Object path, String where) {
		createArc(x1, y1, x2, y2, border, path, where, true);
	}
	private void createArc(float x1, float y1, float x2, float y2, Border border, Object path, String where, boolean partial) {
		if (border == null) {
			border = new Border();
		}
		
		switch (where) {
		case "left": {
			// x1 == x2
			float topleftRadius = border.getTopLeftRadius();
			float bottomleftRadius = border.getBottomLeftRadius();

			if (partial) {
				moveTo(path, x2, y2);
			}
			arcTo(path, new Arc(x2, y2 - 2 * bottomleftRadius, x2 + 2 * bottomleftRadius, y2, 90 + 45, 45));
			lineTo(path, x1, y1 + topleftRadius);
			arcTo(path, new Arc(x1, y1, x1 + 2 * topleftRadius, y1 + 2 * topleftRadius, 180, 45));

			break;
		}
		case "bottom": {
			// y1==y2
			float leftRadius = border.getBottomLeftRadius();
			float rightRadius = border.getBottomRightRadius();

			if (partial) {
				moveTo(path, x2, y2);
			}
			arcTo(path, new Arc(x2 - 2 * rightRadius, y2 - 2 * rightRadius, x2, y2, 45, 45));
			lineTo(path, x1 + leftRadius, y1);
			arcTo(path, new Arc(x1, y1 - 2 * leftRadius, x1 + 2 * leftRadius, y1, 90, 45));
			break;
		}

		case "right": {
			// x1==x2
			float topRightRadius = border.getTopRightRadius();
			float bottomRightRadius = border.getBottomRightRadius();

			if (partial) {
				moveTo(path, x1, y1);
			}
			arcTo(path, new Arc(x1 - 2 * topRightRadius, y1, x1, y1 + 2 * topRightRadius, 270 + 45, 45));
			lineTo(path, x2, y2 - bottomRightRadius);
			arcTo(path, new Arc(x2 - 2 * bottomRightRadius, y2 - 2 * bottomRightRadius, x2, y2, 0, 45));
			
			break;
		}
		case "top": {
			// y1 == y2
			float leftRadius = border.getTopLeftRadius();
			float rightRadius = border.getTopRightRadius();

			if (partial) {
				moveTo(path, x1, y1);
			}
			arcTo(path, new Arc(x1, y1, x1+ 2 * leftRadius,y1 + 2 * leftRadius, 180 + 45, 45));
			lineTo(path, x2 - rightRadius, y2);
			arcTo(path, new Arc(x2 - 2 * rightRadius, y2, x2, y2 + 2 * rightRadius, 270, 45));

			break;
		}
		default:
			break;
		}
	}

	private boolean hasRadius(Border border) {
		return border.getTopLeftRadius() > 0 || border.getTopRightRadius() > 0
				|| border.getBottomLeftRadius() > 0 || border.getBottomRightRadius() > 0;
	}
	
	private boolean isBorderNotPresent() {
		return borderTop == null && borderLeft == null && borderRight == null && borderBottom == null;
	}

	private void createBorderBottom(Object canvas, Object path, Object paint, int width, int height, int topOffset) {
		if (borderBottom != null && borderBottom.getWidth() > 0) {
			float offset = getOffset(borderBottom, "bottom");
			createBorder(0, height - offset, width, height - offset, canvas, path, paint, borderBottom, "bottom");
		}
	}

	private void createBorderRight(Object canvas, Object path, Object paint, int width, int height, int topOffset) {
		if (borderRight != null && borderRight.getWidth() > 0) {
			float offset = getOffset(borderRight, "right");
			createBorder(width - offset, 0, width - offset, height, canvas, path, paint, borderRight, "right");
		}
	}

	private void createBorderLeft(Object canvas, Object path, Object paint, int width, int height, int topOffset) {
		if (borderLeft != null && borderLeft.getWidth() > 0) {
			float offset = getOffset(borderLeft, "left");
			createBorder(offset, 0, offset, height, canvas, path, paint, borderLeft, "left");
		}
	}

	private void createBorderTop(Object canvas, Object path, Object paint, int width, int height, int topOffset) {
		if (borderTop != null && borderTop.getWidth() > 0) {
			float offset = getOffset(borderTop, "top");
			createBorder(0, topOffset + offset, width, topOffset + offset, canvas, path, paint, borderTop, "top");
		}
	}
	
	private float getOffset(Border border, String where) {
		float offset = (float) border.getWidth() * 0.5f;
		offset = adjustOffset(where, offset);
		return offset;
	}

	

	private boolean useCornerRadius() {
		boolean useCornerRadius = borderTopLeftRadius == borderTopRightRadius && borderBottomRightRadius == borderBottomLeftRadius && borderTopLeftRadius == borderBottomLeftRadius;
		return useCornerRadius;
	}
	
	private void createArcFullPath(Object path, View view) {
		createArc(0, 0, 0, view.getHeight(), borderLeft, path, "left", false);
        createArc(0, 0, view.getWidth(), 0, borderTop, path, "top", false);
        createArc(view.getWidth(), 0, view.getWidth(), view.getHeight(), borderRight, path, "right", false);
        createArc(0, view.getHeight(), view.getWidth(), view.getHeight(), borderBottom, path, "bottom", false);
	}

	private boolean invalidate() {
		boolean success = false;
		if (widget.isInitialised()) {
			nativeInvalidate(widget.asNativeWidget());

			success = true;
		}
		return success;
	}
	
	private boolean isNoClip() {
		boolean noClip = ((borderTopLeftRadius == borderTopRightRadius && borderBottomRightRadius == borderBottomLeftRadius && borderTopLeftRadius == borderBottomLeftRadius) && borderTopLeftRadius == 0);
		return noClip;
	}
	//end - body

	
	private void createMask() {
	}
	
    public void execute(String method, Object... args) {
    	switch (method) {
			case "initialised":
				initialized();
				break;
    	}
    }
	

	public void createMask(GC canvas) {
		boolean useCornerRadius = useCornerRadius();
		
		if (useCornerRadius && borderTopLeftRadius == 0) {
			return;
		}
		
		Path path = new Path(Display.getDefault());
        createArcFullPath(path, view);
        path.close();
        canvas.setClipping(path);
        path.dispose();
	}

	@Override
	public void initialized() {
		
	}
	private BorderListener borderListener;
	public void addCommandIfNeeded() {
		boolean noClip = isNoClip();
        int paintEvent = SWT.Paint;

        if (noClip) {
        	if (borderListener == null) {
	        	borderListener = new BorderListener();
		        control.addListener(paintEvent, borderListener);
        	}
        	widget.applyAttributeCommand("background", "border", new String[] {"borderRadius",
        			"borderTopLeftRadius", "borderTopRightRadius", "borderBottomLeftRadius", "borderBottomRightRadius"}, false, this);
        } else {
        	if (borderListener != null) {
        		control.removeListener(paintEvent, borderListener);
        	}
        	widget.applyAttributeCommand("background", "border", new String[] {"borderRadius",
        			"borderTopLeftRadius", "borderTopRightRadius", "borderBottomLeftRadius", "borderBottomRightRadius"}, true, this);
        }
	}

	private class BorderListener implements org.eclipse.swt.widgets.Listener {
		@Override
		public void handleEvent(org.eclipse.swt.widgets.Event event) {
	        if(isBorderNotPresent()) return;
			drawBorder(event);
		}

		private void drawBorder(org.eclipse.swt.widgets.Event event) {
	        GC canvas = event.gc;
	        BorderDecorator.this.drawBorder(canvas);
	        canvas.dispose();
		}
	}
	
	// called from border attribute command
	public Object getClippedBackgroundImage(Object value) {
		if (isNoClip()) {
			return value;
		}
		
		Rectangle rect = control.getBounds();
		if (rect.width == 0 || rect.height == 0) {
			return value;
		}

		Image image = new Image(null, rect.width, rect.height);
        widget.getFragment().addDisposable(image);

        GC canvas = new GC(image, ViewImpl.isShellInRTLMode() ? SWT.RIGHT_TO_LEFT : SWT.LEFT_TO_RIGHT);
        drawExistingImageWithMask(rect, canvas, value);
        drawBorder(canvas);
        
        canvas.dispose();
		return image;
	}
	
	private void drawExistingImageWithMask(Rectangle rect, GC canvas, Object objValue) {
	    canvas.setBackground(((Control) widget.asNativeWidget()).getParent().getBackground());
	    canvas.fillRectangle(0, 0, rect.width, rect.height);
	    createMask(canvas);

	    if (objValue != null && objValue instanceof r.android.content.res.ColorStateList) {
	    	objValue = ((r.android.content.res.ColorStateList) objValue).getColorForState(((View) widget.asWidget()).getDrawableState(), 0);
	    	objValue = ViewImpl.getColor(objValue);
	    }
	    if (objValue != null && objValue instanceof Color) {
	        canvas.setBackground((Color) objValue);
	        canvas.fillRectangle(0, 0, rect.width, rect.height);
	    }                    
	    if (objValue != null && objValue instanceof Image) {
	        canvas.drawImage((Image) objValue, 0, 0);
	    }
	}

	private void drawBorder(GC canvas) {
		int topOffset = 0;
		int height = view.getHeight() + topOffset;
		int width = view.getWidth();
		
		Path path = new Path(Display.getDefault());
		createBorderLeft(canvas, path, canvas, width, height, topOffset);
		
		path = createAndDisposeOldPath(path);
		createBorderRight(canvas, path, canvas, width, height, topOffset);
		
		path = createAndDisposeOldPath(path);
		createBorderBottom(canvas, path, canvas, width, height, topOffset);
		
		path = createAndDisposeOldPath(path);
		createBorderTop(canvas, path, canvas,width, height, topOffset);
		if (!path.isDisposed()) {
			path.dispose();
		}
	}

	private Path createAndDisposeOldPath(Path path) {
		if (!path.isDisposed()) {
			path.dispose();
		}
		path = new Path(Display.getDefault());
		return path;
	}

	
	// native methods
    
	private void reset(Object path, Object paint) {
	}

	private void drawPath(Object canvas, Object path, Object paint) {
		((GC) paint).drawPath((Path) path);
//		((Path) path).dispose();
	}

	private void setColorAndWidth(Object path, Object paint, Object borderColor, int width) {
		if (borderColor instanceof r.android.content.res.ColorStateList) {
			r.android.content.res.ColorStateList colorStateList = (r.android.content.res.ColorStateList) borderColor;
			View view = (View) widget.asWidget();
			borderColor = colorStateList.getColorForState(view.getDrawableState(), r.android.graphics.Color.RED);
		
		}
		((GC) paint).setForeground((Color) ViewImpl.getColor(borderColor));
		((GC) paint).setLineWidth(width);
	}
	

	private void setDottedEffect(Object path, Object paint, int radius, int dashSpacing) {
		((GC) paint).setLineStyle(SWT.LINE_DOT);
	}

	private void setDashedEffect(Object path, Object paint, int dashWidth, int dashSpacing) {
		((GC) paint).setLineStyle(SWT.LINE_DASH);
		int[] dashEffect = new int[] { dashWidth, dashSpacing };
		boolean valid = dashEffect.length > 0;
		for (int i = 0; i < dashEffect.length; i++) {
			if (dashEffect[i] <= 0) {
				valid = false;
				break;
			}
		}
		
		if (valid) {
			((GC) paint).setLineDash(dashEffect);
		} 
	}
	
	private void nativeInvalidate(Object view) {
		control.redraw();
	}
	
	// path methods
	private void quadTo(Object path, float x1, float y1, float x2, float y2) {
		((Path) path).quadTo(x1, y1, x2, y2);
	}

	private void moveTo(Object path, float x, float y) {
		((Path) path).moveTo(x, y);
	}

	private void lineTo(Object path, float x, float y) {
		((Path) path).lineTo(x, y);
	}

	private void arcTo(Object path, Arc arc) {
		((Path) path).addArc( arc.left, arc.top, arc.getWidth(), arc.getHeight(),
				360 - arc.startAngle, arc.sweepAngle * -1);
	}


	private float adjustOffset(String where, float offset) {
		switch (where) {
		case  "left":
		case  "top":
			offset = (float) Math.floor(offset);
			break;
		default:
			offset = (float) Math.ceil(offset);
			break;
		}
		return offset;
	}

	@Override
	public void drawableStateChanged() {
		if (isBorderStateful(borderBottom) || isBorderStateful(borderTop) || isBorderStateful(borderLeft) || isBorderStateful(borderRight)) {
			nativeInvalidate(widget.asNativeWidget());
		}
	}

	private boolean isBorderStateful(Border border) {
		return border != null && border.getColor() != null && border.getColor() instanceof r.android.content.res.ColorStateList 
				&& ((r.android.content.res.ColorStateList) border.getColor()).isStateful();
	}
	
}
