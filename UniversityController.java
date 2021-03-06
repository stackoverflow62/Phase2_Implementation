
import java.io.*;
import java.lang.*;
import java.util.*;
import dblibrary.project.csci230.*;
public class UniversityController{
  
  
  private UniversityDBLibrary dblib;
  
  /**
   * recieve the University that will be added to the database
   * pre: university that is added should not already exist
   * 
   * 
   * @param universityName the name of the university
   * @param state where the university is located
   * @param locationType whether the university is located in an rural, suburb, or city
   * @param control whether the school is private or public
   * @param numberOfStudents the number of students at a school
   * @param female the percentage of female student on a campus
   * @param satVerbal the sat verbal score of a university
   * @param satMath the sat math score of a university
   * @param expenses the cost of a university
   * @param financialAid the financial aid that the school gives
   * @param numberOfApplicants the number of students who apply to the university
   * @param admitted the number of students admitted to the university
   * @param enrolled the number of students enrolled at a university
   * @param academcScale the academic scale of a university
   * @param socialScale the social scale of a university
   * @param qualityOfLifeScale the quality of life at a university
   * 
   *
   * @throws IllegalArgumentException is the preconditions are not met
   */
  
  public void addUniversity(String schoolName, String state, String location, String control, int numStudents,
                            double female, double satVerb, double satMath, double expenses, double finAid, int numApplicants,
                            double numAdmitted, double numEnrolled, int acaScale, int socScale, int qualityLife){
    University ad = new University(schoolName, state, location, control, numStudents,
                                   female, satVerb, satMath, expenses, finAid, numApplicants,
                                   numAdmitted, numEnrolled, acaScale, socScale, qualityLife);
    
  }
  /**
   * This method allows a user to get their list of saved universities
   * 
   * @returns an ArrayList of thier saved Univeristies
   */
  public ArrayList<University> getSavedUniversities() {
    
    ArrayList<University> schoolInfo = new ArrayList<University>();
    String[][] school = dblib.university_getUniversities();
    String[][] empArr = dblib.university_getNamesWithEmphases();
    for(int i =0 ; i < school.length; i++){
      ArrayList<String> emphases = new ArrayList<String>();
      for(int j = 0; j < empArr.length; j++){
        if(empArr[j][0].equals(school[i][0])){
          emphases.add(empArr[j][1]);
        }
      }
      University university = new University(school[i][0],school[i][1],school[i][2],school[i][3],Integer.parseInt(school[i][4]),
                                             Double.parseDouble(school[i][5]),Double.parseDouble(school[i][6]),Double.parseDouble(school[i][7]),
                                             Double.parseDouble(school[i][8]),Double.parseDouble(school[i][9]),Integer.parseInt(school[i][10]),
                                             Double.parseDouble(school[i][11]),Double.parseDouble(school[i][12]),Integer.parseInt(school[i][13]),
                                             Integer.parseInt(school[i][14]),Integer.parseInt(school[i][15]));
      schoolInfo.add(university);
    }
    return schoolInfo;
  }
  
  /**
   * This method allows for a user to add a new user with the following attributes. 
   * 
   * @param firstName the first name of the user
   * @param lastName the last name of the user
   * @param password the password associated with the account
   * @param type the type of user an account is
   */
  public void addUser(String firstName, String lastName, String username, String password,char type){
    dblib.user_addUser(username, firstName, lastName, password, type);
  }
  
  /**
   * make changes to a university within the database
   * 
   * pre: university must exist in the database
   * @param u the universit that will be modified
   * @throws IllegalArgumentException if the preconditions are not met
   */
//  public void editUniveristy(String u){
//
//  }
  /**
   * view the details for a university
   * 
   * pre: university must exist in the database
   * @param u the university that will be viewed
   * @throws IllegalArgumentException if the preconditions are not met
   * 
   */
  public void viewUniversityDetails(University u)
  {
    u.getUniversityName();
    u.getUniversityState();
    u.getLocationType();
    u.getControl();
    u.getNumOfStudents();
    u.getFemalePercentage();
    u.getSATVerbal();
    u.getSATMath();
    u.getExpenses();
    u.getFinancialAid();
    u.getNumApplicants();
    u.getNumAdmitted();
    u.getNumEnrolled();
    u.getAcademicScale();
    u.getSocialScale();
    u.getQualityOfLife();
    u.getEmphases();
    
  }
/**
 * This method allows for a user to get the information of a university they want to see.
 * 
 * @param schoolName the name of the university they want information of
 * 
 * @returns a university object containing all its information
 */
 public University getUniversity(String schoolName){
      ArrayList<String> emphases = new ArrayList<String>();
      String[][] arr = dblib.university_getNamesWithEmphases();
      String[][] school = dblib.university_getUniversities();
      University university = null;
      
      for(int i =0 ; i < arr.length; i++){
        if(arr[i][0].equals(schoolName)){
          emphases.add(arr[i][1]);
        }
      }  
      for(int i =0 ; i< school.length ; i++){
        if(school[i][0].equals(schoolName)){
          for(int j = 0; j < school[i].length; j++){
            university = new University(school[i][0],school[i][1],school[i][2],school[i][3],Integer.parseInt(school[i][4]),
                                        Double.parseDouble(school[i][5]),Double.parseDouble(school[i][6]),Double.parseDouble(school[i][7]),
                                        Double.parseDouble(school[i][8]),Double.parseDouble(school[i][9]),Integer.parseInt(school[i][10]),
                                        Double.parseDouble(school[i][11]),Double.parseDouble(school[i][12]),Integer.parseInt(school[i][13]),
                                        Integer.parseInt(school[i][14]),Integer.parseInt(school[i][15]));
          }
        }
      }
      return university;
    }
  
}

