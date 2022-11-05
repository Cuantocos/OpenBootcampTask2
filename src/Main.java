public class Main {
    public static void main(String[] args) {
        int numeroIf = 15;
        if(numeroIf == 0){
            System.out.println("El numero es 0");
        }else if(numeroIf < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es positivo");
        }

        int numeroWhile = 0;

        while(numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile ++;
        }

        numeroWhile = 0;
        do{
            System.out.println(numeroWhile);
            numeroWhile ++;
    }while(numeroWhile < 0);

    for(int numeroFor = 0; numeroFor < 3; numeroFor++){
        System.out.println(numeroFor);
    }

    var estacion = "Verano";

    switch (estacion){
        case "Invierno":
            System.out.println("La estacion es Invierno");
            break;
        case "Otoño":
            System.out.println("La estacion es Otoño");
            break;
        case "Primavera":
            System.out.println("La estacion es Primavera");
            break;
        case "Verano":
            System.out.println("La estacion es Verano");
            break;
        default:
            System.out.println("La variable no es una estacion");
    }
}}