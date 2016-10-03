package de.dc.swtform.designer.template;

@SuppressWarnings("all")
public interface IGenerator<T extends Object> {
  public abstract String gen(final T in);
}
