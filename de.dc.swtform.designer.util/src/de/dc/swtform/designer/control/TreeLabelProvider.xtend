package de.dc.swtform.designer.control

import de.dc.swtform.designer.control.model.TreeNode
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.StyledString

class TreeLabelProvider extends LabelProvider implements IStyledLabelProvider{
	
	override getText(Object element) {
		if (element instanceof TreeNode) {
			return (element as TreeNode).name
		}
		super.getText(element)
	}
	
	override getStyledText(Object element) {
		if (element instanceof TreeNode) {
			return new StyledString((element as TreeNode).name)
		}
		new StyledString(super.getText(element))
	}
}