package de.dc.swtform.designer.command;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.dc.swtform.designer.action.GenerateUiaction;

public class GenerateUICommand extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		GenerateUiaction action = new GenerateUiaction();
		action.run(null);
		return null;
	}

}
