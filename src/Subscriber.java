public class Subscriber implements update{
	private String name;

	public Subscriber(String name) {
		this.name = name;
	}

	@Override
	public void notify(String msg) {
		System.out.println(this.name + " // " + msg);
	}
}
