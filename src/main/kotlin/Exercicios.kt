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
        var soma: Double = 0.0

        for (elemento in vetor){
            soma += elemento
        }

        return  soma / vetor.size
    }

    fun maiorQueVinte(vetor: ArrayList<Int>): String {
        val media = calculaMediaAritmetica(vetor)

        return if(media > 20) {
            "Valor maior que 20"
        }else {
            "Valor menor ou igual a 20"
        }
    }

    fun maiorValor(vetor: ArrayList<Int>): Int {
        var maiorValor = vetor[0]

        for(elemento in vetor){
            if (elemento > maiorValor){
                maiorValor = elemento
            }
        }

        return maiorValor
    }

    fun contarValoresImpares(vetor: ArrayList<Int>): String{
        var numerosImpar = 0

        for(elemento in vetor){
            if(elemento % 2 != 0){
                numerosImpar++
            }
        }

        if(numerosImpar > 0){
            return "Quantidade de numeros impares: $numerosImpar"
        }else {
            return "Nenhum valor ímpar encontrado"
        }
    }

    fun menorValor(vetor: ArrayList<Int>): Int{
        var menorValor = vetor[0]

        for(elemento in vetor){
            if(elemento < menorValor){
                menorValor = elemento
            }
        }

        return menorValor
    }

    fun trocaPrimeiroComSegundo(vetor: ArrayList<Int>): String{
        var auxiliar = vetor[0]

        vetor[0] = vetor[1]
        vetor[1] = auxiliar

        return vetor.toString()
    }

    fun ordenarVetor(vetor: ArrayList<Int>): String{

        val vetorResultado = mutableListOf<Int>()

        for(i in vetor.indices){
            var menorIndice = i

            for(j in vetor.indices){
                if(vetor[j] < vetor[menorIndice] ){
                    menorIndice = j

                }
            }
            val auxiliar = vetor[i]
            vetor[i] = vetor[menorIndice]

            vetor[menorIndice] =  auxiliar
            vetorResultado.add(vetor[i])
        }

        return vetorResultado.toString()
    }

}