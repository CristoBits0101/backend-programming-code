Proceso Ejercicios_2_02
	
	// "Pedir una hora de la forma hora, minutos y segundos, y mostrar la hora en el segundo siguiente".
	
	// 1) Defino 1 variable para la hora, 2 variables para minutos y 2 variables para segundos.
	definir h, mm, m, ss, s como entero;
	
	// 2.1) Hora será inferior a 24 y mayor o = a 0 para poder ejecutar el programa.
	// 2.2) Minutos parte decimal será inferior a 6 y mayor o igual a 0 para poder ejecutar el programa.
	// 2.3) Minutos unidad será inferior a 10 y mayor o igual a 0 para poder ejecutar el programa.
	// 2.2) Segundos parte decimal será inferior a 6 y mayor igual a 0 para poder ejecutar el programa.
	// 2.5) Segundos unidad será inferior a 10 y mayor o igual a 0 para poder ejecutar el programa.
	Repetir
		
		escribir ("Introduzca la hora de partida desde el 0 hasta el 23:");
		leer h;
		
		escribir ("Introduzca las décimas de minutos desde el 0 hasta el 5:");
		leer mm;
		
		escribir ("Introduzca las unidades de minutos desde el 0 hasta el 9:");
		leer m;
		
		escribir ("Introduzca las décimas de segundos desde el 0 hasta el 5:");
		leer ss;
		
		escribir ("Introduzca las unidades de segundos desde el 0 hasta el 9:");
		leer s;
		
	Hasta Que h < 24 & h >= 0 & mm < 6 & m < 10 & mm >= 0 & m >= 0 & ss < 6 & s < 10 & ss >= 0 & s >= 0;
	
	// 3) bucle infinito que se va a ejecutar mientras que los segundos unidad sea inferior a 10.
	Mientras s < 10 Hacer
		
		// "Cada vez que el bucle de una vuelta súmale 1 a la unidad de los segundos".
		s <- s + 1;
		
		// "Después de sumar 1 a la unidad de segundos espera 1 segundo antes de dar otro".
		esperar 1 segundos;
		
		// "Limpia la pantalla después de esperar 1 segundos y antes de sumar otro".
		limpiar pantalla;
		
		// ""Cuando los segundos unidad lleguen a 10 le cambio el valor a 0 el bucle se queda infinito".
		Si s = 10 Entonces
			s <- 0;
		Fin Si
		
		// "Cuanto segundos unidad valga 0 sumamos 1 a segundos décima esto ocurre 1 vez cada 10 segundos".
		Si s = 0 Entonces
			ss <- ss + 1;
		Fin Si
		
		// "Si las décimas de unidad llegan a 6 cambiaran su valor a 0".
		Si ss = 6 Entonces
			ss <- 0;
		Fin Si
		
		// "Si las décimas y unidades de segundo valen 0 suma 1 a minutos, esto ocurre 1 vez cada 59 segundos".
		Si ss = 0 & s = 0 Entonces
			m <- m + 1;
		Fin Si
		
		// "Cuando minutos unidad valga 10 cambiara su valor a 0".
		Si m = 10 Entonces
			m <- 0;
		Fin Si
		
		// "Cuando minutos valga 0, décimas de segundos valga 0 y unidades de segundos valga 0 hacer minutos unidades + 1".
		// "Esto solo puede ocurrir una vez cada 10 minutos".
		Si m = 0 & ss = 0 & s = 0 Entonces
			mm <- mm + 1;
		Fin Si
		
		// "Cuando las décenas de minutos lleguen a 6 volverán a valer 0".
		Si mm = 6 Entonces
			mm <- 0;
		Fin Si
		
		// "Cuando todas las partes de minutos y segundos valgan 0 hora sumara +1".
		// "Esto solo ocurre una vez cada hora".
		Si mm = 0 & m = 0 & ss = 0 & s = 0 Entonces
			h <- h + 1;
		Fin Si
		
		// "Reseteamos la hora a las 24:00 para que valga 00".
		Si h = 24 Entonces
			h <- 0;
		Fin Si
		
		// "Si la hora es inferior a las 10 muéstrame un 0 delante de hora y el texto a.m.".
		Si h < 10 Entonces
			escribir ("Son las 0") h, (":") mm, m, (":") ss, s (" a.m.");
		SiNo
			// "Si la hora es inferior a las 12 y igual o mayor a 10 muéstrame esté texto".
			Si h >= 10 & h < 12 Entonces
				escribir ("Son las ") h, (":") mm, m, (":") ss, s (" a.m.");
			// "Si la hora es superior a las 12 muéstrame p.m.".
			SiNo
				escribir ("Son las ") h, (":") mm, m, (":") ss, s (" p.m.");
			Fin Si
		Fin Si
		
	Fin Mientras
FinProceso