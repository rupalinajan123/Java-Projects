package EmailProject;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private String email;
	private String alernateEmail;
	private int defaultPasswordLength = 19;
	private int mailboxCapacity = 500;
	private String companySuffix ="company.com";
	
	public Email(String firstname, String lastname) {
		// TODO Auto-generated method stub
           this.firstname = firstname;
           this.lastname = lastname;
           System.out.println("Email Created:" +this.firstname +" "+ this.lastname);
           
           this.department = setDepartment();
           System.out.println("Department:" + this.department);
           
           this.password = randomPassword(defaultPasswordLength);
           System.out.println("Your Password:" + this.password);
           
           email = firstname.toLowerCase()+ "."+lastname.toLowerCase()+"@"+department + companySuffix;
           System.out.println("Your Email:" +email);
	}
	
	private String setDepartment()
	{
		System.out.println("Enter the Department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department Code");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if(deptChoice == 1) {return "Sales";}
		else if(deptChoice == 2) {return "Development";}
		else if(deptChoice == 3) {return "Accounting";}
		else {return "";}
	}
	
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++)
		{
			int rand = (int) (Math.random() * passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
//	
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	public void setAlernateEmail(String altEmail)
	{
		this.alernateEmail = altEmail;
	}
	
	public void changePassword(String password)
	{
		this.password = password;
	}
	
	public int setMailboxCapacity()
	{
		return mailboxCapacity;
	}
	
	public String getAlternateEmail()
	{
		return alernateEmail;
	}
	
	public String getpassword()
	{
		return password;
	}
	
	public String showInfo()
	{
		return "Display Name:"+ firstname+" "+lastname+"\n"+
				"Company Email:" +email + "\n"+
				"Mailbox Capacity:" + mailboxCapacity + "mb";
	}

}
