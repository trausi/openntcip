package org.opentraffic.ui;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.opentraffic.ui.adapters.IOpenTrafficUIAdapter;
import org.opentraffic.ui.adapters.OpenTrafficUIAdapter;

public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {

	@Override
	public IAdaptable getDefaultPageInput() {
		return new OpenTrafficUIAdapter();
	}

	private static final String PERSPECTIVE_ID = "org.opentraffic.ui.perspective";

    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return PERSPECTIVE_ID;
	}
}
