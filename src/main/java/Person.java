
public class Person {
	private int perMinWalk;
	private int perMinRun;
	private String name;

	public Person(int perMinWalk, int perMinRun, String name){
		this.perMinWalk = perMinWalk;
		this.perMinRun = perMinRun;
		this.name = name;
	}	

	public int walk(int min) {
		// TODO Auto-generated method stub
		return perMinWalk * min;
	}
}
