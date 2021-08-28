package Week3.day2;

public class desktop_ implements Software, Hardware{
	public void desktopModel() {
		System.out.println("Hp");
	}
public void softwareResources() {
	System.out.println("Windows 10");
}
public void hardwareResources() {
	System.out.println("Motherboard intel");
}
public static void main(String[] args) {
	desktop_ deskobj=new desktop_();
	deskobj.desktopModel();
	deskobj.softwareResources();
	deskobj.hardwareResources();
}
}
interface Software{
	abstract public void softwareResources();
}
interface Hardware{
	abstract public void hardwareResources();
}