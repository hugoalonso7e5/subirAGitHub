fun main(){
    val matriuNum : Array<Array<Int>> = Array(5){Array(5){(0..10).random()} }
    val matriuLletres : Array<Array<Char>> = Array(5){Array(5){('a'..'f').random()} }

    //reutilizacion de funciones dentro de funciones

    imprimirMatriz(matriuNum)
    println(sumaMatrizInt(matriuNum))
    println(calcularMitjana(matriuNum))
    println(quants5HiHa(matriuNum))
    println(mitajanaDe5(matriuNum,quants5HiHa(matriuNum)))

    println()

    imprimirMatriz(matriuLletres)
    println("a: ${retornarChar(matriuLletres,'a')}")
    println("d: ${retornarChar(matriuLletres,'d')}")
    println("e: ${retornarChar(matriuLletres,'e')}")

    var matriuNova = modificarPer_(matriuLletres)

    //reutilizacion de imprimir matriz con la nueva
    imprimirMatriz(matriuNova)
}
//1-A
//no return
/**
 * Exercici 1, apartat A. Consisteix en crear un metode que printa la matriu de numeros aleatoris.
 * @author hugoalonso7e5
 * @param matriu Aquest parametre es la matriu a imprimir. Pot ser de tipus Char o Int.
 */
fun imprimirMatriz(matriu: Array<Array<Int>>) {
    for(i in matriu.indices){
        for(j in matriu[i].indices){
            print("${matriu[i][j]} ")
        }
        println()
    }
}

//1-B
/**
 * Exercici 1, apartat B. Es demana crear una funcio que retorni (RETURN) la suma de tots els numeros de la matriu.
 * @author hugoalonso7e5
 * @param matriu Aquesta es la matriu a sumar. Ha de ser de tipus Int.
 * @return Ha de retornar la suma de tots els numeros de la matriu. Per tant, ha de sumar tots els 25 nombres (matriu 5x5).
 */
fun sumaMatrizInt(matriu: Array<Array<Int>>):Int{
    var sumatori = 0
    for(i in matriu.indices){
        for(j in matriu[i].indices){
            sumatori+=matriu[i][j]
        }
    }

    return sumatori
}

//1-C
//hay que buscar aprovechar las funciones ya hechas
fun calcularMitjana(matriu: Array<Array<Int>>):Double{
    var mitjana = 0.0

    mitjana = sumaMatrizInt(matriu).toDouble() / (matriu.size*matriu[0].size)

    return mitjana
}

//1-D
fun quants5HiHa(matriu: Array<Array<Int>>):Int{
    var comptador = 0
    for (i in matriu){
        for (j in i){
            if (j>=5) comptador++
        }
    }

    return comptador
}

//1-E
fun mitajanaDe5(matriu: Array<Array<Int>>,quantiat:Int):Double{
    var suma:Double = sumarMajor5(matriu)
    return suma/quantiat
}
//funcion auxiliar para sumar los numeros>5
fun sumarMajor5(matriu: Array<Array<Int>>): Double {
    var sumatori = 0
    for (i in matriu){
        for (j in i){
            if (j>=5) sumatori+=j
        }
    }
    return sumatori.toDouble()
}


//2-A
//no return
fun imprimirMatriz(matriu: Array<Array<Char>>) {
    for(i in matriu.indices){
        for(j in matriu[i].indices){
            print("${matriu[i][j]} ")
        }
        println()
    }
}

//2-B/C/D
fun retornarChar(matriu: Array<Array<Char>>, lletra:Char):Int{
    var comptador = 0
    for (i in matriu){
        for (j in i){
            if (j==lletra) comptador++
        }
    }

    return comptador
}

//2-E
fun modificarPer_(matriu: Array<Array<Char>>):Array<Array<Char>>{
    var matriuNova = matriu

    for (i in matriuNova.indices){
        for (j in matriuNova[i].indices){
            matriuNova[i][j] = '_'
        }
    }

    return matriuNova
}