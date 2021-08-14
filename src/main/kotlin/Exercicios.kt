class Exercicios {

    fun imprimaVetor(vetor: ArrayList<Int>): String {
        return vetor.toString()
    }

    fun somaVetor(vetor: ArrayList<Int>): Int {

        var resultado = 0

        for(elemento in vetor){
            resultado += elemento
        }

        return resultado
    }

    fun calculaMediaAritmetica(vetor: ArrayList<Int>): Double {

        return 0.0
    }

    fun maiorQueVinte(vetor: ArrayList<Int>): String {

        return ""
    }

    fun maiorValor(vetor: ArrayList<Int>): Int {
        
        return 0
    }

    fun contarValoresImpares(vetor: ArrayList<Int>): String{

        return ""
    }

    fun menorValor(vetor: ArrayList<Int>): Int{

        return 0
    }

}