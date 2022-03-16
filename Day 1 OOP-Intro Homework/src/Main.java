
public class Main {

	public static void main(String[] args) {
		
		User user1 = new User(503,"Özay","Sevinç");
		User user2 = new User(1050,"Mustafa","Topçuoðlu");
		
		User[] users = {user1,user2};
		
		for (User user : users) {
			System.out.println("Kullancý:" + user.name);
		}
		
		
		Lecture lecture1 = new Lecture(1,"JavaScript Kampý","Engin Demiroð",0);
		Lecture lecture2 = new Lecture(2,"C# Kampý","Engin Demiroð",0);
		Lecture lecture3 = new Lecture(3,"Java&React Kampý","Engin Demiroð",0);
		Lecture lecture4 = new Lecture(4,"Programlamaya Giriþ","Engin Demiroð",0);
		
		Lecture[] lectures = {lecture1,lecture2,lecture3,lecture4}; 
		
		for (Lecture lecture : lectures) {
			System.out.println(lecture.name);
		}
		UserManager usermanager = new UserManager();
		usermanager.addToCart(lecture4);
		usermanager.addToCart(lecture1);
		
		usermanager.deleteToCart(lecture4);
		
		AdministratorManager administratorManager = new AdministratorManager();
		administratorManager.addLecture(lecture1);
		administratorManager.addLecture(lecture2);
		administratorManager.addLecture(lecture3);
		administratorManager.addLecture(lecture4);
		
		administratorManager.deleteLecture(lecture3);
		administratorManager.deleteLecture(lecture2);
		
		administratorManager.addUser(user1);
		administratorManager.addUser(user2);
		
		administratorManager.deleteUser(user1);
		administratorManager.deleteUser(user2);

		
		
		
		
		
	}

}
