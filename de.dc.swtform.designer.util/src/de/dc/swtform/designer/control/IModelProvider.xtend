package de.dc.swtform.designer.control

import java.util.ArrayList
import java.util.List

interface IModelProvider<T> {
	List entries = new ArrayList
	
	def List<T> getEntries();
	def void addAll(List<T> entries)
	def void add(T entry);
	def void removeAll(List<T> entries)
	def void remove(T entry);
	def void remove(int index)	
}