package de.dc.swtform.designer.control

import org.eclipse.jface.viewers.LabelProvider
import de.dc.swtform.designer.control.model.TreeNode

class TreeLabelProvider extends LabelProvider {
	
	override getText(Object element) {
		if (element instanceof TreeNode) {
			return (element as TreeNode).name
		}
		super.getText(element)
	}
	
}