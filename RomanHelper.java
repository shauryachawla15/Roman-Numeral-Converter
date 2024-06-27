// SHAURYA CHAWLA //
// 10/24/19 //
// PROJECT-2 (ROMAN NUMERALS) // (1st FILE)

public class RomanHelper {
// This method prints the description of the program
  public static void description()
  { System.out.println("****************************************************");
  System.out.println("* Welcome to the Roman Numeral Converter! *");
  System.out.println("* You can use this tool to convert any decimal *");
  System.out.println("* value into Roman Numeral. To get started *");
  System.out.println("* please enter the how many decimal numbers you *");
  System.out.println("* need to convert *");
  System.out.println("****************************************************\n");
  }
  // Conversion of numbers to Roman Numerals
  public static String getRoman(int num)
  {
  String roman = "";
  if( num > 0)
  { int numLength = String.valueOf(num).length();
  switch(numLength)
  { 
  case 1: if(num == 9)
  {
  roman += "IX";
  num = num - 9;
  }
  else if(num >= 5)
  {
  roman += "V";
  num = num - 5;
  }
  else if(num == 4)
  {
  roman += "IV";
  num = num - 4;
  }
  else
  {
  roman += "I";
  num = num - 1;
  }
  break;
  case 2: if(num >= 90)
  { roman += "XC";
  num = num -90;
  }
  else if(num >= 50)
  {
  roman += "L";
  num = num - 50;
  }
  else if(num >= 40)
  {
  roman += "XL";
  num = num - 40;
  }
  else
  {
  roman += "X";
  num = num - 10;
  }
  break;
  case 3: if(num >= 900)
  {
  roman += "CM";
  num = num - 900;
  }
  else if(num >= 500)
  {
  roman += "D";
  num = num - 500;
  }
  else
  {
  roman += "C";
  num = num - 100;
  }
  break;
  case 4:
  roman += "M";
  num = num - 1000;
  break;
  }
 }
 return roman;
}
}  
  
  
  
  