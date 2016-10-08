package de.dc.swtform.designer.control

import de.dc.swtform.designer.control.model.TreeNode
import org.eclipse.jface.viewers.ITreeContentProvider

class TreeContentProvider implements ITreeContentProvider {
	
	override getElements(Object inputElement) {
		(inputElement as TreeNode).children.toArray
	}

	override getChildren(Object parentElement) {
		val file = parentElement as TreeNode
		file.children
	}

	override getParent(Object element) {
		val file = element as TreeNode
		file.parent
	}

	override hasChildren(Object element) {
		val node = element as TreeNode
		node.hasChildren
	}

}
