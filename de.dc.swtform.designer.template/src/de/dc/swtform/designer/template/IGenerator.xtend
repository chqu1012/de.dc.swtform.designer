package de.dc.swtform.designer.template

 interface IGenerator<T> {

	def String gen(T in);
}