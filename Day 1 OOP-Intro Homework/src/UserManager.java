
public class UserManager {
	public void addToCart(Lecture lecture) {
		System.out.println("Ders Sepete Eklendi: " + lecture.name);
	}
	public void deleteToCart (Lecture lecture) {
		System.out.println("Ders Sepetten Silindi: " + lecture.name);
	}
}
