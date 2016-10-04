/*******************************************************************************
 * Copyright (c) 2016 Abel G�mez.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Abel G�mez (agomezlla@uoc.edu) - initial API and implementation
 *******************************************************************************/
package io.github.abelgomez.ps.transformer.ui.preferences;

import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

import io.github.abelgomez.ps.transformer.ui.TransformerUiPlugin;

/**
 * Dummy {@link PreferencePage} that serves as a root for all the
 * {@link PreferencePage}s of the {@link TransformerUiPlugin}
 * 
 * @author Abel G�mez (agomezlla@uoc.edu)
 *
 */
public class RootPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	@Override
	public void init(IWorkbench workbench) {
		setDescription("Preferences for the Publish-Subscribe Tools Plug-ins");
	}

	@Override
	protected void createFieldEditors() {
	}
}
