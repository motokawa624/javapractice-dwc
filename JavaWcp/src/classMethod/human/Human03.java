package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String proffession;
	
	public Human03() {
		this.name = "山田";
		this.age = 20;
		this.proffession = "プログラマー";
	}
	
	public String getProfile() {
		return "年齢は" + this.age + ",職業は" + this.proffession;
	}
	
	public void greet(String friend) {
		if (friend == null) {
			System.out.println("挨拶する友達が分かりません！");
			return;
		}
		System.out.println(friend + "さん、こんにちは！");
	}
}
