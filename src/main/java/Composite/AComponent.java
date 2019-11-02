package Composite;

public interface AComponent {

	public abstract Integer operacion();

	public abstract void add(AComponent component);

	public abstract void remove(AComponent component);

	public abstract void getChild(int position);


}
