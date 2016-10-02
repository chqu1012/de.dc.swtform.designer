package de.dc.swtform.designer.util

import org.eclipse.swt.layout.GridData

class LayoutFactory {
	
	def static GridData griddata(int hAlign, int vAlign, boolean hGrab, boolean vGrab, int widthHinh){
		val gd = new GridData(hAlign, vAlign, hGrab, vGrab)
		gd.widthHint=widthHinh
		gd
	}
	
	def static GridData griddata(int hAlign, int vAlign, boolean hGrab, boolean vGrab){
		new GridData(hAlign, vAlign, hGrab, vGrab)
	}
	
	def static GridData griddata(int hAlign, int vAlign, boolean hGrab, boolean vGrab, int hSpan, int vSpan){
		new GridData(hAlign, vAlign, hGrab, vGrab, hSpan, vSpan)
	}
}