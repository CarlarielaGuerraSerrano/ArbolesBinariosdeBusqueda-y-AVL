/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolesBinarios;

/**
 *
 * @author Usuario
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // PRACTICO ARBOL BINARIO DE BUSQUEDA Y AVL
        
        //EL ARBOL EN EL QUE SE TRABAJARA
        IArbolBusqueda a1=new ArbolBinarioBusqueda();
        a1.insertar(30,"Fernando");
        a1.insertar(59,"Roberto");
        a1.insertar(20, "Juan");
        a1.insertar(65,"Miguel");
        a1.insertar(10,"Fabricio");
        a1.insertar(24,"Celia");
        a1.insertar(94,"Roxana");
        a1.insertar(22,"Joel");
        a1.insertar(1, "Manuel");
        a1.insertar(25,"Jessica");
        a1.insertar(50,"Maria");
        a1.insertar(60,"Ricardo");
        
        
        //IMPLEMENTAR LOS METODOS QUE NO SE IMPLEMENTARON EN CLASE O QUE SE EMPLEMENTARON A MEDIAS DE ABB Y AVL
        //RECORRIDOS
        //RECORRIDO PREORDEN
        System.out.println("Recorrido en Preorden"+a1.recorridoPreOrden());
        
        
       IArbolBusqueda a5=new ArbolBinarioBusqueda();
        a5.insertar(30, 1);
        a5.insertar(59, 2);
        a5.insertar(20, 3);
        a5.insertar(65, 4);
        a5.insertar(10, 5);
        a5.insertar(24, 6);
        a5.insertar(94, 7);
        a5.insertar(22, 8);
        
        System.out.println("Cantidad de nodos con solo hijos izquierdos: "+((ArbolBinarioBusqueda)a1).cantidadenodosConsoloHijosIzquierdosRec());
        System.out.println("Cantidad de nodos con solo hijos izquierdos Rec: "+((ArbolBinarioBusqueda)a1).cantidadNodosConSoloHI());
        System.out.println("Cantidad de nodos con solo hijos Izquierdos en el nivel N:  "+((ArbolBinarioBusqueda)a1).cantidadNodosConSoloHIenNivelRec(2));
        System.out.println("cantidad de nodos con solo hijos Izquierdos antes del nivel N:  "+((ArbolBinarioBusqueda)a1).cantidadNodosConSoloHIantesNivel(3));
        System.out.println("cantidad de nodos con solo hijos Izquierdos despues del nivel N:  "+((ArbolBinarioBusqueda)a1).cantidadNodosConSoloHIdespuesNivel(2));
        System.out.println("metodo que retorna true si un arbol es similar a otro arbol Binario:  "+((ArbolBinarioBusqueda)a1).arbolesSimilars((ArbolBinarioBusqueda)a5));
        System.out.println("cantidad de nodos que son comletos despues del nivel N:  "+((ArbolBinarioBusqueda)a1).cantidadNodosCompletosdespuesNivel(0));
        System.out.println("metodo que retorna true si el arbol es lleno:    "+((ArbolBinarioBusqueda)a1).arbolLleno());
        
        System.out.println("Recorrido en Preorden"+a1.recorridoPreOrden());
        System.out.println("Recorrido Por Niveles: "+ a1.recorridoPorNiveles());
        
        System.out.println("Recorrido en porOrden"+a1.recorridoPosOrden());
        System.out.println("Recorrido Recursivo posOrden"+((ArbolBinarioBusqueda)a1).recoPosOrdenRec());
        
        System.out.println("recorrido Recursivo InOrden"+((ArbolBinarioBusqueda)a1).recoInOrdenRec());
        
        System.out.println("reconstruccion Arbol com PRe: ");
        IArbolBusqueda a2=new ArbolBinarioBusqueda(((ArbolBinarioBusqueda)a1).recoInOrdenRec(),((ArbolBinarioBusqueda)a1).llenarListaValores(((ArbolBinarioBusqueda)a1).recoInOrdenRec()),
                                                   a1.recorridoPreOrden(),((ArbolBinarioBusqueda)a1).llenarListaValores(a1.recorridoPreOrden()), true);
        System.out.println(a2.recorridoPorNiveles());
        
        IArbolBusqueda a3=new ArbolBinarioBusqueda(a1.recorridoInorden(),((ArbolBinarioBusqueda)a1).llenarListaValores(a1.recorridoInorden()),
                                                   a1.recorridoPosOrden(),((ArbolBinarioBusqueda)a1).llenarListaValores(a1.recorridoPosOrden()),false);
        System.out.println("REconstruccion Arbol con Pos: ");
        System.out.println(a3.recorridoPreOrden());
        
        a1.eliminar(24);
        a1.eliminar(59);
        a1.eliminar(10);
        a1.eliminar(22);
        a1.eliminar(94);
        System.out.println(a1.recorridoPreOrden());
    }
    
}
