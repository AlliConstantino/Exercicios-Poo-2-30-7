package exercicios;

public class exercicio {

	public static void main(String[] args) {
		e4(50);
		e11(8.0,8.0,7.0);
		e12(12);

	}
	
	public static void e1 (int n) { //funciona
		if(n%2 == 0)
			System.out.println("par");
		else
			System.out.println("impar");
		
	}
	
	public static void e2 (int n1, int n2) {//funciona
		if(n1 < n2)
			System.out.println("N1 eh menor que n2");
		else if(n1 > n2)
			System.out.println("N1 eh maior que n2");
		else if(n1 == n2)
			System.out.println("N1 eh igual a n2");
		
	}
	
	public static void e3() {//funciona
		for(int i = 0; i< 101;i++){
		       System.out.println(i);
		}
	}
	
	public static void e4(int n) {
		for(int i = n; i < n ;i++) 
			if(i % 2 == 0)
			System.out.println(i);
		
	}

	
	public static void e5(int n) {
		int produto = 0;
	for(int i = n; i < n;i--) {
		if(i < n)
			produto = produto + (i * n);
	}
	}
	
	public static void e6(int n) {
		int somaDosMult = 0;
		for(int i = n; i < n;i--) {
			if(i % 3 == 0)
				somaDosMult = somaDosMult + i;
			System.out.println(somaDosMult);
		}
	}
	
	public static void e7() {
		int a = 280;	
		while(a <= 280 & a >=0 & (a % 7 == 0)) {
			System.out.println(a);
		}
	}
	
	public static void e8() {
		int a = 0;
		int soma = 0;
		int resultado = 0;
		if((a % 3 == 0) & (a % 5 == 0) & (a % 7 == 0)) {
			for(a = 0; a >= soma;a++)
				System.out.println(a);
		}
	}
	
	public static void e11(double n1, double n2, double n3) {
		double soma = n1 + n2 + n3;
		double media = soma / 3.0;
		System.out.println("Sua média eh" + media);
		
		if(media < 3.0)
			System.out.println("Voce foi reprovado");
		else if(media > 3.0 & media < 5.75)
			System.out.println("Exame");
		else if(media > 5.76)
			System.out.println("Aprovado");
	}
	public static void e12(int n) { //primo:se divisivel por 1 ou ele mesmo,mas qq n eh div p 1,logo,testar se eh div p ele msm
		if(n < 1)
			System.out.println("Não eh possivel calcular se esse numero eh primo,pois ele eh menor que 1");
			break;
		else {
		for(int i = 2; i <= (n/2); i++)
		   if(n % n == 0)
		      System.out.println("Esse numero eh primo");
		   else
			   System.out.println("Esse numero nao eh primo");
			/*boolean primo = ((n % n == 0) && (n % 1 == 0)); //a principio nao tenho motivos p achar que eh primo
			primo = true;
			System.out.println(primo);
		   if ((n % n == 0)&(n % 1 == 0) ) 
			System.out.println("Esse numero eh primo");
		   else
			System.out.println("Esse numero nao eh primo");*/
		}
		
		
	}
	
	

}
