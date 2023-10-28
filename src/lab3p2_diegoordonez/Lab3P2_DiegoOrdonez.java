package lab3p2_diegoordonez;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3P2_DiegoOrdonez {

    static Scanner sc = new Scanner(System.in);
    static Scanner scs = new Scanner(System.in);
    static ArrayList<App> apps = new ArrayList();

    public static void main(String[] args) {

        int opcion = 0;
        do {
            System.out.println("1. Administrador");
            System.out.println("2. Usuario");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {

                case 1: {
                    MenuAdmin();

                    break;
                }
                case 2: {
                    MenuUsuario();

                    break;
                }

            }

        } while (opcion != 3);
    }

    public static void MenuAdmin() {
        int op = 0;
        do {
            System.out.println("1. Agregar Aplicación");
            System.out.println("2. Biblioteca");
            System.out.println("3. Actualización");
            System.out.println("4. Eliminar Aplicación");
            System.out.println("5. Estadísticas de Desarrollado");
            System.out.println("6. Salir");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    int op2 = 0;
                    do {
                        System.out.println("|. Agregar App de utilidad");
                        System.out.println("2. Agregar Juego");
                        System.out.println("3. Salir");
                        op2 = sc.nextInt();
                        switch (op2) {

                            case 1: {
                                System.out.println("Ingrese la categoria");
                                String cate = scs.nextLine();
                                System.out.println("Ingrese el nombre de la app");
                                String name = scs.nextLine();
                                System.out.println("Ingrese el nombre del desarollador ");
                                String dev = scs.nextLine();
                                System.out.println("Ingrese el precio de la app");
                                double price = sc.nextInt();
                                AppUtil appu = new AppUtil(cate, name, dev, price);
                                apps.add(appu);
                                break;
                            }
                            case 2: {
                                System.out.println("Ingrese la edad recomendada");
                                int edadR = sc.nextInt();
                                System.out.println("Ingrese el nombre de la app");
                                String name = scs.nextLine();
                                System.out.println("Ingrese el nombre del desarollador ");
                                String dev = scs.nextLine();
                                System.out.println("Ingrese el precio de la app");
                                double price = sc.nextInt();
                                AppJuego appj = new AppJuego(edadR, name, dev, price);
                                apps.add(appj);
                                break;
                            }
                        }
                    } while (op2 != 3);

                    break;
                }
                case 2: {
                    if (apps.isEmpty()) {
                        System.out.println("No hay apps");
                    } else {
                        for (App app : apps) {
                            System.out.println(apps.toString());

                        }
                    }

                    break;
                }
                case 3: {
                    System.out.println(apps.toString());
                    for (int i = 0; i < apps.size(); i++) {
                        System.out.println((i + 1) + ". " + apps.get(i));
                    }

                    System.out.print("Seleccione el número del app que desea modificar: ");
                    int pos = sc.nextInt();
                    apps.get(pos);

                    App a = new App();
                    String desarollador = apps.getClass().getSimpleName();
                    a.setDesarollador(desarollador);
                    String nombre = null;
                    a.setName(nombre);
                    double precio = 0;
                    a.setPrecio(precio);

                    break;
                }

                case 4: {

                    System.out.println(apps.toString());
                    for (int i = 0; i < apps.size(); i++) {
                        System.out.println((i + 1) + ". " + apps.get(i));
                    }

                    System.out.print("Seleccione el número del app que desea eliminar : ");
                    int pos = sc.nextInt();
                    apps.remove(pos);

                    break;
                }
                case 5: {
                    for (App app : apps) {
                        System.out.println(app.getName() + " " + app.getRating() + " " + app.getDescargas());

                    }
                }
                break;
            }

        } while (op
                != 6);

    }

    public static void MenuUsuario() {

        int op = 0;

        do {
            System.out.println("1. Buscar por Nombre");
            System.out.println("2. Buscar por Categoría");
            System.out.println("3. Biblioteca");
            System.out.println("4. Mostrar Descargas");
            System.out.println("5. Eliminar Descargar");
            System.out.println("6. Calificar Aplicación");
            System.out.println("7, Salir");
            op = sc.nextInt();
            switch (op) {
                case 1: {
                    BuscarNombre();

                }
                case 2: {
                    BuscarCategoria();
                }
                case 3: {
                    if (apps.isEmpty()) {
                        System.out.println("No hay apps");
                    } else {
                        for (App app : apps) {
                            System.out.println(apps.toString());

                        }
                    }
                }
                case 4: {

                }
                case 5: {
                }
                case 6: {
                    Rate();
                }

            }
        } while (op != 7);
    }

    public static void BuscarNombre() {
        System.out.println("Ingrese El nombre de la app");
        String name = scs.nextLine();
        App app = new App();
        if (name.equalsIgnoreCase(app.getName())) {

            app.estado = true;
            int des = app.getDescargas();
            des++;
        }

    }

    public static void BuscarCategoria() {

        System.out.println("Ingrese la categoria");
        String cate = scs.nextLine();
        AppUtil appu = new AppUtil();
        if (cate.equalsIgnoreCase(appu.categoria)) {

            System.out.println(appu.categoria);
        }
    }

    public static void Rate() {

        System.out.println("Que app desea ratiar");
        int pos = sc.nextInt();
        AppUtil appu = new AppUtil();
        for (App app : apps) {
            System.out.println(apps.toString());
            apps.get(pos - 1);
            System.out.println("cuanto desea colocar");
            double rate = sc.nextInt();

            appu.setRating(rate);
        }
      

    }
}
