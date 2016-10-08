package de.dc.swtform.designer.control.model

import java.util.ArrayList
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors

class TreeNode {
	@Accessors TreeNode parent;
	@Accessors List<TreeNode> children=new ArrayList
	@Accessors String name
	
	new(TreeNode parent, String name) {
		this.parent=parent
		this.name=name
	}
	
	def hasChildren(){
		children.size>0
	}
}