package org.jenkinsci.test.acceptance.plugins.checkstyle;

import org.jenkinsci.test.acceptance.plugins.analysis_core.AnalysisAction;
import org.jenkinsci.test.acceptance.po.ContainerPageObject;

/**
 * Page object for Checkstyle action.
 *
 * @author Fabian Trampusch
 */
public class CheckStyleAction extends AnalysisAction {
    public CheckStyleAction(final ContainerPageObject parent) {
        super(parent, "checkstyle");
    }
}
