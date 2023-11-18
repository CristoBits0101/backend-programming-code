Scanner sc = new Scanner(System.in);
int desplaza=1;
for (int i=0;i
System.out.println(desplaza);int espera = sc.nextInt();

int aux_delante= (int )numero/desplaza;
System.out.println(aux_delante);espera = sc.nextInt();


aux_delante=(aux_delante*10)+digito;
System.out.println(aux_delante);espera = sc.nextInt();

int aux_detras= (int) numero%desplaza;
System.out.println(aux_detras);espera = sc.nextInt();
int salida=aux_delante*desplaza;
salida=salida+aux_detras;

return salida;

}