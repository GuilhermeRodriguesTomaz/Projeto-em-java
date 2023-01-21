import java.util.Scanner;
 
class operçõesSuma {
 
   public static void main( String[] args ) {
      int a, b, c, operacao = 0;
      Scanner s = new Scanner( System.in );
      System.out.println( "Introduza dois numeros: ");
        a = s.nextInt();
        b = s.nextInt();
      System.out.println("escolha uma operação (1:soma, 2:subtracao, 3:multiplicacao, 4: divisao) ");
      operacao = s.nextInt();
    
      switch (operacao)
      {case 1:
      c = a + b;
      System.out.println("a soma e " + c);
      break;
  case 2:
      c = a - b;
      System.out.println("a subtracao e " + c);
      break;
  case 3:
      c = a * b;
      System.out.println("a multiplicacao e " + c);
      break;
  case 4:
      c = a/b;
      System.out.println("a divisao e " + c);
      break;
      }


   }
}