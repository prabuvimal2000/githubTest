package com.quizapp.dto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.csv.CSVParser;
import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.quizapp.model.QuestionComplexityLevel;
import com.quizapp.model.Questions;
import com.quizapp.model.SubCategories;

public class QuestionsFileRequest 
{
//	
//	public static boolean convertExcelToJson(MultipartFile file)
//	{
//		if (!FileType.equals(file.getContentType())) 
//	    {
//	      return false;
//	    }
//		return true;
//	}
	
       
	
	public static List<Questions> jsonFormatUpload(InputStream file,QuestionComplexityLevel questionLevel,SubCategories subcategory) throws IOException
	{
	
		System.out.println("Checked");
		//FileInputStream file = new FileInputStream(new File(file));
		
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet  sheet = workBook.getSheetAt(0);
		int rows = sheet.getLastRowNum();
//		int colum = sheet.getRow(1).getLastCellNum();
		List<Questions> questionList = new ArrayList<Questions>();
		for(int i=1;i<=2;i++)
		{
			XSSFRow row = sheet.getRow(i);
				int questionNo=(int) row.getCell(0).getNumericCellValue();
				String question,optA,optB,optC,optD,ans;
				question=row.getCell(1).getStringCellValue();
				optA=row.getCell(2).getStringCellValue();
				optB=row.getCell(3).getStringCellValue();
				optC=row.getCell(4).getStringCellValue();
				optD=row.getCell(5).getStringCellValue();
				ans=row.getCell(6).getStringCellValue();
				//Questions questions= new Questions(questionNo,question,optA,optB,optC,optD,ans);
				Questions questions= new Questions(questionNo,question,optA,optB,optC,optD,ans);
//				questions.setQuestionComplexityLevel(questionLevel);
//		    	questions.setSubCategory(subcategory);	
		    	questionList.add(questions);
		}
		System.out.println(questionList);

		 workBook.close();
		
		 return questionList;		
//		 
//		Iterator rowData = sheet.iterator() ;
//		while (rowData.hasNext())
//		{
//			XSSFRow row = (XSSFRow) rowData.next();
//			Iterator columData = row.cellIterator();
//			while(columData.hasNext())
//			{
//				XSSFCell cellData = (XSSFCell) columData.next();
//				String question="",optA="",optB="",optC="",optD="",ans="";
//				int questionNo=0;
//				switch(cellData.getCellType())
//				{
//				 case NUMERIC:
//				    questionNo=(int)cellData.getNumericCellValue();
//					System.out.println(questionNo);
//					break;
//				  case STRING:
//						question=cellData.getStringCellValue();
//						optA=cellData.getStringCellValue();
//						optB=cellData.getStringCellValue();
//						optC=cellData.getStringCellValue();
//						optD=cellData.getStringCellValue();
//						ans=cellData.getStringCellValue();
//						break;
//			    }
//					
//				Questions questions= new Questions(questionNo,question,optA,optB,optC,optD,ans);
//				questionList.add(questions);
//				questions.setQuestionComplexityLevel(questionLevel);
//		    	questions.setSubCategory(subcategory);
//			}
//			System.out.println(questionList);
//		}
		//return questionList;
	}
	
	public static List<String> convertObjects2JsonString(List<Questions> questions, QuestionComplexityLevel questionComplexityLevel, SubCategories subcategory) 
	{
		System.out.println("jsonStart");
    	ObjectMapper mapper = new ObjectMapper();
    	List<String> listOfQuestions = new ArrayList<>();
    	try
    	{
    		 for(Questions question:questions)
    		 {
    			 listOfQuestions.add(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(question));
    		 }
    		 System.out.println(listOfQuestions);
    	} 
    	catch (Exception e) {
    		e.printStackTrace();
    	}
    	return  listOfQuestions; 
	}
	
	
	
	
	
	
	
	  public static String TYPE = "text/csv";
	  public static String[] HEADERS = { "questionNumber", "question", "optA", "optB" ,"optC","optD","answer"};	  
	  
	  public static boolean hasCSVFormat(MultipartFile file) {

	    if (!TYPE.equals(file.getContentType())) 
	    {
	      return false;
	    }

	    return true;
	  }

	  public static List<Questions> csvQuestionFileUpload(InputStream is,QuestionComplexityLevel questionLevel,SubCategories subcategory) {
	    try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        CSVParser csvParser = new CSVParser(fileReader,
	            CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {

	      List<Questions> questionsList = new ArrayList<Questions>();

	      Iterable<CSVRecord> csvFileData = csvParser.getRecords();

	      for (CSVRecord csvRecord : csvFileData) 
	      {
	    	  Questions questions = new Questions(
	              Integer.parseInt(csvRecord.get("questionNumber")),
	              csvRecord.get("question"),
	              csvRecord.get("optA"),
	              csvRecord.get("optB"),
	              csvRecord.get("optC"),
	              csvRecord.get("optD"),
	              csvRecord.get("answer")
	            );
	    	questions.setQuestionComplexityLevel(questionLevel);
	    	questions.setSubCategory(subcategory);
            questionsList.add(questions);       
	      }

	      return questionsList;
	    } 
	    catch (IOException exception)
	    {
	      throw new RuntimeException("fail to get the CSV file: " + exception.getMessage());
	    }
	  }

}
