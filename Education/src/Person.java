
public class Person {
	private Education education;
	
	public Person()
	{
		this.education = new Education();
		education.setLastSchool("1. Indiana University \n2. Purdue Uninversity \n3. Ohio State\n4. Penn State \n5. Northwestern\n"
				+ "6. University of Chicago\n7. Michigan State\n8. Bowling Green State\n9. University of Florida\n10. Ave Maria");
	}	
		public String getLastSchool()
		{
			return education.getLastSchool();
		}
	

}
