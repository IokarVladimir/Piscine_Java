public class Program {
	public static void main(String[] args) {
		User user1 = new User("Bublik", -100_000);
		User user2 = new User("Point", 1_000_000);
		User user3 = new User("Muslim", 10_000_000);

		System.out.println(user1.getName()+"\t"+user1.getIdentifier()+
						"\tbalance\t"+user1.getBalance());
		System.out.println(user2.getName()+"\t"+user2.getIdentifier()+
						"\tbalance\t"+user2.getBalance());
		System.out.println(user3.getName()+"\t"+user3.getIdentifier()+
						"\tbalance\t"+user3.getBalance());
	}
}