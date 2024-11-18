package Controllers;

import Models.Carro;

/**
 * Controlador para manejar la lógica de operaciones sobre arrays de Carross.
 */
public class CarroController {
    //// GEnerar los metdoos necesarions
    /// 
    public void ordenarPorAnio(Carro[] carros){
        int n = carros.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if(carros[j].getAnio() > carros[j + 1].getAnio()){
                    Carro temp = carros[j];
                    carros[j] = carros[j + 1];
                    carros[j + 1] = temp;
                }
                
            }
        }

    }

    public int busquedaBinaria(Carro[] carros, int anio){
        int inicio = 0;
        int fin = carros.length - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio)/2 ;
            if(carros[medio].getAnio() == anio){
                return medio; 
            }
            if(carros[medio].getAnio() < anio){
                inicio = medio + 1;
            }else{
                fin = medio - 1;
            }
        }
        return -1;
    }

    public void imprimirCarro(Carro[] carros){
        for(Carro carro : carros){
            System.out.println(carro);
        }
    }
}
