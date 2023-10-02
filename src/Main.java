public class Main {
	public static void main(String[] args) {
		Channel channel = new Channel();

		Subscriber sub1 = new Subscriber("Suscriptor 1");
		Subscriber sub2 = new Subscriber("Suscriptor 2");
		Subscriber sub3 = new Subscriber("Suscriptor 3");

		channel.addSubscriber(sub1);
		channel.addSubscriber(sub2);
		channel.addSubscriber(sub3);

		channel.uploadVideo();

	}
}
