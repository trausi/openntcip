package org.opentraffic.ui;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(false);
		layout.addView(HiddenView.VIEW_ID, IPageLayout.TOP, IPageLayout.DEFAULT_VIEW_RATIO, layout.getEditorArea());
	}
}
