import dblibrary.project.csci230.*;
import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * Account Entity that stores all the information pertaining to a school.
 * 
 * 
 * 
 * From 2/25/18-2/26/18-->worked on by Vue Xiong
 * -->wrote the variables, the constructor and logIn/logOut methods.
 * @author Ramon Angeles, Jonathan First, James H. , Jaime Vega, Vue Xiong
 * @version Feb 26, 2018
 */

public class Account 
{
  private String userName;
  private String password;
  private String firstName;
  private String lastName;
  private char type;
  private char status;
  private boolean isLoggedIn=false;//initially false because user is not log in yet.
  
  /**
   * This method checks whether or not a user is login.
   * If the user is not log in then it will set the isLoggedIn to true
   * 
   * @param userName the username of the user
   * @param password the password of the user
   * @param firstName the first name of the user
   * @param lastName the last name of the user
   * @param type the type of the account, whether it's a student account or admin account
   * @param status the status of the account, whether it's active or deactivated
   */
  public Account(String userName,String password, String firstName, String lastName, char type, char status)
  {
    this.userName = userName;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.type = type;
    this.status = status;
  }
  
 
  public void logIn()
  {
    if(!isLoggedIn)
    {
      isLoggedIn = true;
    }
  }
  /**
   * Sets the first name of the user
   * 
   * @param firstName the first name of the account
   */
  public void setFirstname(String firstName)
  {
    this.firstName = firstName;
  }
  /**
   * Allows user to get the first name of account
   */
  public String getFirstName()
  {
    return this.firstName;
  }
  /**
   * Sets the last name of user
   * 
   * @param lastName of user
   */
  public void setLastname(String lastName)
  {
    this.lastName = lastName;
  }
  /**
   * Gets the last name of user
   */
  public String getLastName()
  {
    return this.lastName;
  }
  /**
   * This method checks whether or not a user is login.
   * If the user is log in then it will set the isLoggedIn to false
   */
  public void logOut()
  {
    if(isLoggedIn)
    {
      isLoggedIn = false;
    }
  }
  /**
   * Allows user to get the username of an account
   */
  public String getUsername()
  {
    return this.userName;
  }
  /**
   * Allows user to set username
   * 
   * @param userName the username of an account
   */
  public void setUserName(String userName)
  {
    this.userName = userName;
  }
  
  /**
   * Allows user to set the password for an account
   * 
   * @param password the password associated with an account
   */
  public void setPassword(String password)
  {
    this.password = password;
  }
  /**
   * Allows user to get the password associated with a username
   */
  public String getPassword()
  {
    return this.password;
  }
  
   /**
   * Sets the type of the user
   * 
   * @param type the type of the account
   */
  public void setType(char type)
  {
    this.type = type;
  }
  /**
   * Allows user to get the type of account
   */
  public char getType()
  {
    return this.type;
  }
  
   /**
   * Sets the status of the user
   * 
   * @param status the status of the account
   */
  public void setStatus(char status)
  {
    this.status = status;
  }
  /**
   * Allows user to get the status of account
   */
  public char getStatus()
  {
    return this.status;
  }
}