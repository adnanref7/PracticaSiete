package Composite;

import java.util.ArrayList;

public class Composite implements AComponent {
	private ArrayList<AComponent> list = new ArrayList<>();

	public Composite() {
		super();
	}

	@Override
	public Integer operacion() {
		int acumulado = 0;
		for (AComponent comp : list) {
			acumulado = acumulado + comp.operacion();
		}
		System.out.println("\t La suma de estas computadoras es de " + acumulado + "$.");
		return acumulado;

	}

	@Override
	public void add(AComponent component) {
		list.add(component);

	}

	@Override
	public void remove(AComponent component) {
		list.remove(component);

	}

	@Override
	public void getChild(int position) {
		System.out.println(list.get(position));

	}

}
