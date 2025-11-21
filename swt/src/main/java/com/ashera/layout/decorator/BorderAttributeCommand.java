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
package com.ashera.layout.decorator;

import com.ashera.widget.AttributeCommand;
import com.ashera.widget.BaseAttributeCommand;
import com.ashera.widget.IWidget;

public class BorderAttributeCommand extends BaseAttributeCommand{
	private BorderDecorator borderDecorator;
	
	public BorderAttributeCommand(String id) {
		super(id);
	}

	@Override
	public Object modifyValue(IWidget widget, Object nativeView, String phase, String attributeName, Object value) {
		return borderDecorator.getClippedBackgroundImage(value);
	}

	@Override
	public AttributeCommand newInstance(Object... args) {
		BorderAttributeCommand command = new BorderAttributeCommand(this.id);
		command.setPriority(20);
		command.updateArgs(args);
		return command;
	}

	@Override
	public void updateArgs(Object... args) {
		borderDecorator = (BorderDecorator) args[0];
	}

	@Override
	public boolean executeAfterPostMeasure() {
		return true;
	}

}
