
import Controllers.CarroController;
import Models.Carro;

public class App {
        public static void main(String[] args) throws Exception {
                
                Carro[] carros = new Carro[] {
                                new Carro("Toyota", 2010),
                                new Carro("Honda", 2015),
                                new Carro("Ford", 2005),
                                new Carro("Chevrolet", 2018),
                                new Carro("BMW", 2010),
                                new Carro("Nissan", 2015),
                                new Carro("Volkswagen", 2020),
                                new Carro("Hyundai", 2010),
                                new Carro("Kia", 2005),
                                new Carro("Mazda", 2000),
                                new Carro("Subaru", 2012),
                                new Carro("Mercedes-Benz", 2016),
                                new Carro("Lexus", 2011),
                                new Carro("Audi", 2019),
                                new Carro("Tesla", 2020),
                                new Carro("Jaguar", 2014),
                                new Carro("Land Rover", 2018),
                                new Carro("Volvo", 2013),
                                new Carro("Infiniti", 2008),
                                new Carro("Acura", 2017)
                };

                CarroController controller = new CarroController();
                System.out.println("Arreglo original:" );
                controller.imprimirCarro(carros);
                controller.ordenarPorAnio(carros);

                System.out.println("======================================");
                System.out.println("Arreglo ordenado por año");
                controller.imprimirCarro(carros);
                System.out.println("======================================");


                int anioBuscado = 2012;
                int posicion = controller.busquedaBinaria(carros, anioBuscado);

                if (posicion != -1){
                        System.out.println("Carro encontrado: " + carros[posicion] + " el cual esta ubicado en la posicion: " + posicion);
                }else{
                        System.out.println("No se encontro un carro con el año: " + anioBuscado);
                }



                }


                // Implementar un método para ordenar los carros por año en orden ascendente
                // El metodo se le especificara en el enunciado del examen

                // Encontrar el carro usando búsqueda binaria basada en el año de fabricación y
                // imprimir su posició
                // en el arreglo de carros
                // Años a buscar en el arreglo de carros:
                // - 2012
                // - 2009

                // Imprimir:
                // Si encontro al carro en el arreglo de carros y su posisción
                // Si no encontro al carro en el arreglo de carros
        }
