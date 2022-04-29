Proceso calcular_suma_valores_pares_lsta_n_elementos
	Definir n Como Entero;
	Definir i Como Entero;
	i <- 0;
	Escribir 'cuantos valores tiene:';
	Leer n;
	Definir suma Como Entero;
	suma <- 0;
	Definir lista Como Entero;
	Dimension lista[n];
	Para i<-0 Hasta n-1 Hacer
		Escribir 'valor ',i+1,':';
		Leer lista[i];
	FinPara
	Para i<-0 Hasta n-1 Hacer
		Si lista[i] MOD 2==0 Entonces
			suma <- suma+lista[i];
		FinSi
	FinPara
	Escribir 'la suma de los numero para en la lista de tamaño ',n,'es: ',suma;
FinProceso
