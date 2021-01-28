enum FunWithEnum
{
	WAFFLE(new HaveSomeFun("GERMAN_WAFFLE")),CONE(new HaveSomeFun("CHOCOLATE_CONE"));
	HaveSomeFun myObj;
	
	FunWithEnum(HaveSomeFun obj)
	{
		this.myObj = obj;
	}
	
	public HaveSomeFun getMyObj() {
		return myObj;
	}
	public void setMyObj(HaveSomeFun myObj) {
		this.myObj = myObj;
	}
}
public class HaveSomeFun 
{
	private String name;

	HaveSomeFun()
	{		 }

	HaveSomeFun(String name)
	{	this.name = name;}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args)
	{
		for(FunWithEnum i: FunWithEnum.values())
		{
			System.out.printf(i.ordinal() + " " + i.name() +"  "+ i.myObj.getName()+ "\n");
		}
	}
}
