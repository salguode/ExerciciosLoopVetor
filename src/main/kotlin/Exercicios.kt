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
        var media: Double = 0.0
        var resultado: Double = 0.0

        for (elemento in vetor){

            soma += elemento
            media ++
        }

        media = soma / media

        return media
    }

    fun maiorQueVinte(vetor: ArrayList<Int>): String {

        var soma = 0.0
        var media = 0.0

        for(elemento in vetor){

            soma += elemento
            media++

        }

        media = soma / media

        if(media > 20) {
            return "Valor maior que 20"
        }else {
            return "Valor menor ou igual a 20"
        }

    }

    fun maiorValor(vetor: ArrayList<Int>): Int {

        var maiorValor = 0

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

        var maiorValor = 0
        var menorValor = 0

        for(elemento in vetor){

            if(elemento > maiorValor){

                maiorValor = elemento

            }
        }

        menorValor = maiorValor

        for(elemento in vetor){

            if(elemento < menorValor){

                menorValor = elemento

            }
        }

        return menorValor
    }

}