//Estructuras alternativas IF, IF-ELSE, SWITCH


import java.util.Scanner;

public class Main {
    //IMPORTANTE poner static en Scanner para acceder desde dentro
    static Scanner sc = new Scanner(System.in);
    static int num1;
    static int num2;
    static int num3;
    static int opcion;
    static String subopcion;

    public static void main() {

        System.out.println("Hola,mundo");
        System.out.println("Hola primer mundo.");

        do{
            menu();
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    ej1();
                    break;
                case 2:
                    ej2();
                    break;
                case 3:
                    ej3();
                    break;
                case 4:
                    ej4();
                    break;
                case 5:
                    ej5();
                    break;
                case 6:
                    ej6();
                    break;
                case 7:
                    ej7();
                    break;
                case 8:
                    ej8();
                    break;
                case 9:
                    ej9();
                    break;
                case 10:
                    ej10();
                    break;
                case 11:
                    ej11();
                    break;
                case 12:
                    ej12();
                    break;
                case 13:
                    ej13();
                    break;
                case 14:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Introduce un opción válida.");
                    break;
            }

        } while (opcion !=14);
    }

    public static void menu() {
        System.out.print("""
                
                
                --- MENÚ ---
                1 - ¿Mayor de edad?
                2 - ¿Mayor o menor de edad?
                3 - 2 números (+, -, *, /)
                4 - 2 números y muestra el mayor
                5 - 2 números, orden ascendente
                6 - 2 números, mayor o igual.
                7 - 3 números y muestra el mayor
                8 - Precio con 10% dto (min 100)
                9 - Precio < 30, -2€
                10 - Nota a literal
                11 - Cálculo sueldo
                12 - Aprobados, Suspendidos y Media
                13 - Emulador Calculadora
                14 - Salir
                Introduce una opción: 
                """);

    }

    /*Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “Eres mayor de edad” solo si lo
     somos.*/
    public static void ej1(){
        int edad;
        System.out.print("Introduce la edad: ");
        edad = sc.nextInt();
        if (edad < 0){
            System.out.println("Introduce una edad válida.");
        }else {
            if (edad >= 18) {
                System.out.println("Eres mayor de edad.");
            }
        }
    }

    /*Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” o el mensaje
    de “eres menor de edad”. */
    public static void ej2(){
        int edad;
        System.out.print("Introduce la edad: ");
        edad = sc.nextInt();
        if (edad < 0){
            System.out.println("Introduce una edad válida.");
        }else {
            if (edad >= 18) {
                System.out.println("Eres mayor de edad.");
            } else {
                System.out.println("Eres menor de edad");
            }
        }
    }

    /*Escribe un programa que lee dos números, calcula y muestra el valor de su suma, resta, producto y división.
    (Ten en cuenta la división por cero).*/
    public static void ej3(){

        System.out.print("Introduce un número: ");
        num1= sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2= sc.nextInt();

        System.out.println("La suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
        System.out.println("La resta de " + num1 + " - " + num2 + " es: " + (num1 - num2));
        System.out.println("El producto de " + num1 + " * " + num2 + " es: " + (num1 * num2));
        if (num2 == 0){
            System.out.println("La división no se puede hacer porque no se puede dividir entre 0.");
        } else {
            System.out.println("La división de " + num1 + " / " + num2 + " es: " + (num1 / num2));
        }
    }

    //Escribe un programa que lee 2 números y muestra el mayor.
    public static void ej4(){
        System.out.print("Introduce un número: ");
        num1= sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2= sc.nextInt();

        if(num1>num2){
            System.out.println("El mayor es: " + num1);
        } else {
            System.out.println("El mayor es: " + num2);
        }
    }

    //Escribe un programa que lee dos números y los visualiza en orden ascendente.
    public static void ej5(){
        System.out.print("Introduce un número: ");
        num1= sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2= sc.nextInt();

        if(num1>num2){
            System.out.println("Números en orden ascendente: " + num2 + " < " + num1);
        } else {
            System.out.println("Números en orden ascendente: " + num1 + " < " + num2);
        }
    }

    //Escribe un programa que lee dos números y nos dice cuál es el mayor o si son iguales.
    public static void ej6(){
        System.out.print("Introduce un número: ");
        num1= sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2= sc.nextInt();

        if(num1>num2){
            System.out.println("El mayor es: " + num1);
        } else if (num2>num1){
            System.out.println("El mayor es: " + num2);
        } else {
            System.out.println("Los números son iguales.");
        }
    }

    //Escribe un programa que lea tres números distintos y nos diga cuál es el mayor.
    public static void ej7(){
        System.out.print("Introduce un número: ");
        num1= sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2= sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        num3 = sc.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("El mayor es: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("El mayor es: " + num2);
        } else if (num3 > num1 && num3 > num2){
            System.out.println("El mayor es: " + num3);
        } else if (num1 == num2) {
            if (num1>num3) {
                System.out.println("El mayor es: " + num1);
            }
        } else if (num2==num3) {
            if (num2>num1) {
                System.out.println("El mayor es: " + num2);
            }
        } else {
            System.out.println("Los números son iguales.");
        }
    }

    /*  a) El valor mínimo para optar al descuento es 100 y el descuento será de un
        10%
        b) Pedir que se introduzca el precio inicial, en euros
        c) Leer el precio introducido
        d) Comprobar que el precio introducido sea mayor o igual al valor mínimo
        para optar al descuento. En caso afirmativo, aplicar el descuento al precio
        inicial.
        e) Mostrar el precio final*/
    public static void ej8(){
        double precio;
        System.out.print("Introduce el precio inicial: ");
        precio = sc.nextDouble();

        if (precio >= 100){
            double dto = precio - ((precio*10.0)/100.0);
            System.out.println("El precio final es: " + dto + "€");
        } else {
            System.out.println("El precio final es: " + precio + "€");
        }
    }

    /*Modifica el programa anterior para que, en lugar de hacer el descuento del 10 %
        a los productos de 100 € o más, aplique una penalización de 2 € si el precio es
        menor de 30 €.*/
    public static void ej9(){
        double precio;
        System.out.print("Introduce el precio inicial: ");
        precio = sc.nextDouble();

        if (precio < 30){
            double dto = precio + 2;
            System.out.println("El precio final es: " + dto + "€");
        } else {
            System.out.println("El precio final es: " + precio + "€");
        }
    }

    /*. Escribe un programa que lea una calificación numérica entre 0 y 10 y la
        transforma en calificación alfabética, escribiendo el resultado.
        • de 0 a <3 Muy Deficiente.
        • de 3 a <5 Insuficiente.
        • de 5 a <6 Bien.
        • de 6 a <9 Notable
        • de 9 a 10 Sobresaliente */
    public static void ej10(){
        System.out.print("Introduce la nota: ");
        num1= sc.nextInt();

        if (num1<0 || num1>10){
            System.out.println("Nota introducida incorrecta.");
        } else {
            if (num1>=0 && num1<3){
                System.out.println("Muy Deficiente");
            } else if (num1>=3 && num1<5){
                System.out.println("Insuficiente");
            } else if (num1>=5 && num1 <6){
                System.out.println("Bien");
            } else if (num1>=6 && num1<9){
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        }
    }

    /*Escribe un programa que calcula el salario neto semanal de un trabajador (al que
        pediremos nombre, horas trabajadas y su tarifa por hora) en función del número
        de horas trabajadas y la tasa de impuestos de acuerdo a las siguientes hipótesis:
        • Las primeras 35 horas se pagan a tarifa normal.
        • Las horas que pasen de 35 se pagan a 1,5 veces la tarifa normal.
        • Las tasas de impuestos son:
        o Los primeros 500 euros son libres de impuestos.
        o Los siguientes 400 tienen un 25% de impuestos.
        o Los restantes un 45% de impuestos.
        Escribir nombre, salario bruto, tasas y salario neto.*/
    public static void ej11() {
        String nombre;
        int horas;
        double tarifa; double calc35; double calcM35; double bruto; double tasas = 0;
        double dif500; double dif900;

        System.out.print("Introduce el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Introduce las horas trabajadas: ");
        horas = sc.nextInt();
        System.out.print("Introduce la tarifa por hora: ");
        tarifa = sc.nextDouble();

        calc35 = horas * tarifa;
        calcM35 = (horas - 35) * (tarifa * 1.5);

        //Calculamos tarifa/horas
        if (horas <= 35){
            bruto = calc35;
        } else {
            bruto = (35 * tarifa) + calcM35;
        }

        //Calculamos tasas
        if(bruto>500) { // 25%
            dif500 = bruto - 500;
            if (dif500 <= 400) {
                tasas = (dif500 * 25) / 100.0;
            } else { //45%
                dif900 = dif500 - 400;
                tasas = (400 * 25 / 100.0) + (dif900 * 45) / 100.0;
            }
        }


        //Escribir nombre, salario bruto, tasas y salario neto
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario bruto: " + bruto);
        System.out.println("Tasas: " + tasas);
        System.out.println("Salario neto: " + (bruto - tasas));
    }

    /* Escribe un programa que lea una secuencia de notas que se van introduciendo
    por el teclado (las notas serán valores numéricos que pueden contener
    decimales). La secuencia de notas finalizará cuando se introduzca un valor
    negativo. El programa informará al final del número de aprobados, el número de
    suspensos y la nota media. El programa deberá controlar los posibles errores que
    se puedan producir a la hora de introducir las notas por teclado de tal forma que
    si alguna nota introducida fuera errónea la vuelva a solicitar.*/
    public static void ej12(){
        double nota;
        double apro = 0;
        double suspen = 0;
        double sum = 0;


        do{

            nota= validaDouble("Introduce la nota: ");

            if (nota>10 || nota <0){
                System.out.println("Nota introducida negativa o incorrecta.");
            } else {
                sum += nota;
                if (nota>=0 && nota<5){
                    suspen++;
                } else{
                    apro++;
                }
            }

        } while (nota>=0);
        System.out.println("Aprobados: " + apro);
        System.out.println("Suspendidos: " + suspen);
        System.out.println("Nota media: " + (sum / (suspen + apro)));
    }

    /*Diseña un programa que imite a una calculadora capaz de realizar las
        operaciones básicas (suma, resta, producto y multiplicación) y dos operaciones
        complejas como la potencia y la raíz cuadrada, la aplicación debe mostrar
        inicialmente un menú similar al siguiente:
        > Emulador Calculadora
        Elige una opción:
        1.- Operaciones básicas.
        2.- Operaciones complejas.
        3.- Salir.
        En el caso de la opción 1 se deberá mostrar:
        a. Suma.
        b. Resta.
        c. Producto.
        d. División.
        En el caso de la opción 2 se deberá mostrar:
         a. Potencia.
        b. Raíz cuadrada.
        Una vez elegida la opción correspondiente el programa deberá solicitar los datos
        necesarios y mostrar por pantalla el resultado obtenido en cada caso. El
        programa deberá controlar los posibles errores que se puedan producir a la hora
        de elegir la opción y de introducir los datos por teclado de tal forma que si los
        datos introducidos fueran erróneos los vuelva a solicitar.*/

    public static void ej13(){
        do{
            System.out.println("""
                    > Emulador Calculadora
                    Elige una opción:
                    1.- Operaciones básicas.
                    2.- Operaciones complejas.
                    3.- Salir.
                    """);
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("""
                            > Operaciones básicas
                            a. Suma.
                            b. Resta.
                            c. Producto.
                            d. División.
                            Elige una opción:
                            """);
                    subopcion = sc.nextLine();
                    switch (subopcion){
                        case "a":
                            pedir2Num();
                            System.out.println("La suma de " + num1 + " + " + num2 + " es: " + (num1 + num2));
                            break;
                        case "b":
                            pedir2Num();
                            System.out.println("La resta de " + num1 + " - " + num2 + " es: " + (num1 - num2));
                            break;
                        case "c":
                            pedir2Num();
                            System.out.println("El producto de " + num1 + " * " + num2 + " es: " + (num1 * num2));
                            break;
                        case "d":
                            pedir2Num();
                            if (num2 == 0){
                                System.out.println("No se puede dividir entre 0.");
                            } else {
                                System.out.println("La división de " + num1 + " / " + num2 + " es: " +
                                        (num1 / num2));
                            }
                        default:
                            System.out.println("Error. Opción seleccionada incorrecta.");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("""
                            >Operaciones complejas
                            a. Potencia.
                            b. Raíz cuadrada.
                            Elige una opción:
                            """);
                    subopcion = sc.nextLine();
                    switch (subopcion){
                        case "a":
                            pedir2Num();
                            System.out.println("La potencia de " + num1 + " ^ " + num2 + " es: " + (Math.pow(num1,num2)));
                            break;
                        case "b":
                            System.out.print("Introduce un número: ");
                            num1 = sc.nextInt();
                            double raiz = Math.round(Math.sqrt(num1)*100.0)/100.0;
                            System.out.println("La raíz cuadrada de " + num1 + " es " + raiz);
                            break;
                        default:
                            System.out.println("Error. Opción seleccionada incorrecta.");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Error. Opción seleccionada incorrecta.");
                    break;
            }

        } while (opcion!=3);

    }

    public static void pedir2Num(){
        System.out.print("Introduce un número: ");
        num1= sc.nextInt();
        System.out.print("Introduce otro número: ");
        num2= sc.nextInt();
        sc.nextLine();
    }

    public static double validaDouble(String mensaje){
        System.out.println(mensaje);
        while(!sc.hasNextDouble()){
            System.out.println("No es un número correcto.");
            sc.next();
        }
        return sc.nextDouble();
    }

}