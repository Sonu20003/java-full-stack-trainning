package oopsdemo;
/**
 * Author   : Sonu.2
 * Date     : Sep 2, 2025
 * Time     : 11:40:37 PM
 * Project  : CoreJava
 */

public class Candidate {

	private int id;
	private String name;
	private float stipend, da;

	public Candidate(int id, String name, float stipend) {
		super();
		this.id = id;
		this.name = name;
		this.stipend = stipend;
		
		this.calculateDA();
	}

	public void calculateDA()
	{
		this.da=this.stipend*.10f;
	}

	void display()
	{
		System.out.println("************* Candidate Details ***************");
		System.out.println("Candidate Id              :"+id);
		System.out.println("Candidate Name            :"+name);
		System.out.println("Candidate Stipend         :"+stipend);
		System.out.println("Candidate Daily Allowance :"+da);
	}

}
