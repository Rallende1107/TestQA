package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoQA extends Base{


	
    By searchBox = By.id("searchBox");
    By addButton = By.id("addNewRecordButton");
    By btnUpdate = By.id("edit-record-3");
    By btnDelete = By.id("delete-record-3");
    By txtFirstName = By.id("firstName");
    By btnSubmit = By.id("submit");
    By txtLastName = By.id("lastName");
    By txtEmail = By.id("userEmail");
    By txtAge = By.id("age");
    By txtSalary = By.id("salary");
    By txtDepartment = By.id("department");

	public DemoQA(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	 public void Create_user () throws InterruptedException {
	        if (isDisplayed(addButton)){
	            click(addButton);
	            if (isDisplayed(txtFirstName) && isDisplayed(txtLastName)&&isDisplayed(txtEmail) && isDisplayed(txtAge)&& isDisplayed(txtSalary)&& isDisplayed(txtDepartment)){
	                esperar(3);
	                writeTex("Rene", txtFirstName);esperar(1);
	                writeTex("Allende", txtLastName);esperar(1);
	                writeTex("rallende@gmail.com", txtEmail);esperar(1);
	                writeTex("27", txtAge);esperar(1);
	                writeTex("1000000", txtSalary);esperar(1);
	                writeTex("QA", txtDepartment);esperar(1);
	                esperar(1);esperar(1);
	                click(btnSubmit);
	                System.out.println("User Agregado");
	            } else  {
	                System.out.println("Uno o mas campo no estan displonibles");
	            }
	        }
	        else {
	            System.out.println("Boton no esta displonible");
	        }
	    }

	    public void Update_user () throws InterruptedException {
	        if (isDisplayed(btnUpdate)){
	            click(btnUpdate);
	            esperar(3);
	            if (isDisplayed(txtFirstName) && isDisplayed(txtEmail)){
	                esperar(1);
	                writeTex("Rene", txtFirstName);
	                esperar(1);
	                writeTex("rallende@gmail.com", txtEmail);esperar(1);
	                click(btnSubmit);
	                System.out.println("User Modificado");
	            } else  {
	                System.out.println("Uno o mas campo no estan displonibles");
	            }
	        }

	    }
	    public void Delete_user () {
	        if (isDisplayed(btnDelete)){
	            click(btnDelete);
	            System.out.println("User Eliminado");
	        }

	    }
	    public void Search_user () {
	        if (isDisplayed(searchBox)){
	            writeTex("Hola", searchBox);
	        }else {
	            System.out.println("Uno o mas campo no estan displonibles");
	        }

	    }	
    
}
