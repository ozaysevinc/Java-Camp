
public class AdministratorManager {
	public void deleteLecture(Lecture lecture) {
		System.out.println("Ders Silindi: " + lecture.name);
	}
	public void addLecture (Lecture lecture) {
		System.out.println("Ders Eklendi: " + lecture.name);
	}
	public void deleteUser(User user) {
		System.out.println("Kullan�c� Silindi: " + user.name);
	}
	public void addUser(User user) {
		System.out.println("Kullan�c� Eklendi: " + user.name);
	}
}