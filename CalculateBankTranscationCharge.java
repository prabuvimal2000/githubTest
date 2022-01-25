/*
 * Program for calculate the amount transaction during amount transfer from person to person .
 * @author Prabu M
 * @since Jul 2 2021
 * 
 */
package javatraining;
import java.util.Scanner;
public class CalculateBankTranscationCharge {
	public static void main(String[] args)
	{
		int numOfPersons;
		float transactionServiceChargePercent=0.01f,totalServiceCharge=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of peoples to perform transcation: ");
		numOfPersons=input.nextInt();
		for (int i=0;i<numOfPersons;i++)
		{
			System.out.println("Enter the send person : ");
			String sendPerson = input.next();
			System.out.println("Enter the receive person : ");
			String receivePerson= input.next();
			System.out.println("Enter the amount to transfer : ");
			long amountToTransfer=input.nextLong();
			totalServiceCharge=totalServiceCharge+(amountToTransfer*transactionServiceChargePercent);
		}
		System.out.println("The total service charge earned by the bank : "+totalServiceCharge);
	    input.close();
	}
}
