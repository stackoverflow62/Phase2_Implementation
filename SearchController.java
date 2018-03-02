import dblibrary.project.csci230.*;
import java.io.*;
import java.util.*;

/**
 * This class is the Database controller that allows a user to access the database and change things.
 *
 * First version- Ramon Angeles
 * Java Doc -Vue Xiong
 * 
 * @author J. Ramon Angeles, James Heidelberger, Jaime Vega, Jonathan First, Vue Xiong
 * @version February 2018
 */

public class SearchController{
  
  private UniversityDBLibrary dblib;
  String universityName;//name of the university
  private String state;//state where university is located
  private String locationType;//Urban, Rural,etc
  private String control;//whether school is private or public
  private int numberOfStudents;//number of students at a university
  private double female;//percentage of female students in the university
  private double satVerbal;//SAT verbal scores for a university
  private double satMath;//SAT math scores for a university
  private double expenses;//cost to attend a university 
  private double financialAid;//financial aid a university offers
  private int numOfApplicants;//number of students who apply to university
  private double numAdmitted;//number of students admitted to a university
  private double enrolled;//number of students enroll in a university
  private int academicScale;//a university's academic standing
  private int socialScale;//a university's social scale between 1-5
  private int qualityOfLife;//quality of life on a university 1-5
  
  /**
   * This method allows for a user to search for a university by passing/giving all the search citeria that they
   * would like to search for. 
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
   * @returns an ArrayList of University
   */
  public ArrayList<University> search(String universityName, String state, String location, String control, int numberOfStudents, double female, double satVerbal,
                                      double satMath, double expenses, double financialAid, int numberOfApplicants, double admitted, double enrolled,
                                      int academicScale, int socialScale, int qualityOfLifeScale){
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
      
    }
    return schoolInfo;
  }
}