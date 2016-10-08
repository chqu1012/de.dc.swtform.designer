package de.dc.swtform.designer.control

import java.util.List

abstract class BaseModelProvider<T> implements IModelProvider<T> {

	override add(T entry) { entries += entry }
	override addAll(List<T> entries) { entries += entries }
	override remove(T entry) { entries -= entry }
	override removeAll(List<T> entries) { entries -= entries }
	def T findById(int id){	}
	def T findByName(String name){}
}
