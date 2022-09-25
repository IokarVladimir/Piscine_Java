public class Program {
	public static void main(String[] args) {
		User user1 = new User("Bublik", 10_000);
		User user2 = new User("Muslim", 20_000);
		User user3 = new User("Point", -1_000);

		System.out.printf("%s %d \n", user1.getName(), user1.getId());
		System.out.printf("%s %d \n", user2.getName(), user2.getId());
		System.out.printf("%s %d \n", user3.getName(), user3.getId());
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);

		UsersList list = new UsersArrayList();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		System.out.println("++++++" );
		System.out.println(list.getByIndex(0) + " == " + user1);
		System.out.println(list.getByIndex(user2.getId()) + " == " + user2);
		System.out.println("count = " + list.getCount());
		System.out.println("++++++" );
		User user4 = new User("Вася", -100_000);
		System.out.println(list.getByIndex(0));
		System.out.println(list.getById(1));
		System.out.println(list.getByIndex(1));
		System.out.println(list.getById(2));
		System.out.println(list.getByIndex(2));
		System.out.println(list.getById(3));
	}
}