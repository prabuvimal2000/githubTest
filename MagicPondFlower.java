/*
 * Program for Calculate how many times we need to dip the flower in a magic bond to get minimum 100 flowers.
 * note here once we dip the flower to this pond we get double of the flower.
 * initially we dip one flower to that magic pond.
 * @author Prabu M
 * @since Jul 2 2021
 * 
 */
package javatraining;
public class MagicPondFlower {
	public static void main(String[] args)
	{
		int flower=1,dipCount=0,minimumFlower=100;
		while(flower<minimumFlower)
		{
			flower*=2;
			dipCount+=1;
		}
		System.out.println("If you need to get minimum 100 flowers in this magic pond you need to dip "+dipCount+" times in this magic pond.");
	}
}
