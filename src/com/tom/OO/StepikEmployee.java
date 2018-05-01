package com.tom.OO;

public class StepikEmployee {
		class Employee {
			public String getName() {
				return name;
			}
			public String getEmail() {
				return email;
			}
			public int getExperience() {
				return experience;
			}
			public Employee(String name, String email, int experience) {
				super();
				this.name = name;
				this.email = email;
				this.experience = experience;
			}
			String name;
			String email;
			int experience;
			
		}

		class Developer extends Employee {
			public String getMainLanguage() {
				return MainLanguage;
			}
			public String[] getSkills() {
				return skills;
			}
			public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
				super(name, email, experience);
				MainLanguage = mainLanguage;
				this.skills = skills;
			}
			String MainLanguage;
			String[] skills;




		}

		class DataAnalyst extends Employee {
			public DataAnalyst(String name, String email, int experience, boolean phD, String[] mlMethods) {
				super(name, email, experience);
				PhD = phD;
				this.mlMethods = mlMethods;
			}
			public boolean isPhD() {
				return PhD;
			}
			public String[] getMlMethods() {
				return mlMethods;
			}
			boolean PhD;
			String[] mlMethods;



		}
	public static void main(String[] args) {
		String[] skills = { "git", "Scala", "JBoss", "UML" };
		Developer developer = new Developer("Mary", "mary@mail.com", 3, "Java", skills);

		String[] mlMethods = { "neural networks", "decision tree", "bayesian algorithms" };
		DataAnalyst analyst = new DataAnalyst("John", "john@gmail.com", 2, true, mlMethods);
	}

}
