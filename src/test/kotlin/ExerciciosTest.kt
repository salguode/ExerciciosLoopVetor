import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class ExerciciosTest {

    val exercicios = Exercicios()

    val vetor1 = arrayListOf(5, 9, 3, 19, 70, 8, 100, 2, 35, 27)
    val vetor2 = arrayListOf(4, 50, 44, 180, 32, 86, 500, 2, 12, 6, 98, 100)
    val vetor3 = arrayListOf(-27, 3, 55, 10, -50, 97, -33, 14, 70)

    @Test
    fun imprimaVetor() {
        assertEquals(
            "[5, 9, 3, 19, 70, 8, 100, 2, 35, 27]",
            exercicios.imprimaVetor(vetor1)
        )
        assertEquals(
            "[4, 50, 44, 180, 32, 86, 500, 2, 12, 6, 98, 100]",
            exercicios.imprimaVetor(vetor2)
        )
        assertEquals(
            "[-27, 3, 55, 10, -50, 97, -33, 14, 70]",
            exercicios.imprimaVetor(vetor3)
        )
    }

    @Test
    fun somaVetor() {
        assertEquals(278, exercicios.somaVetor(vetor1))
        assertEquals(1114, exercicios.somaVetor(vetor2))
        assertEquals(139, exercicios.somaVetor(vetor3))
    }

    @Test
    fun calculaMediaAritmetica() {
        assertEquals(27.8, exercicios.calculaMediaAritmetica(vetor1))
        assertEquals(92.83333333333333, exercicios.calculaMediaAritmetica(vetor2))
        assertEquals(15.444444444444445, exercicios.calculaMediaAritmetica(vetor3))
    }

    @Test
    fun maiorQueVinte() {
        assertEquals("Valor maior que 20", exercicios.maiorQueVinte(vetor1))
        assertEquals("Valor maior que 20", exercicios.maiorQueVinte(vetor2))
        assertEquals("Valor menor ou igual a 20", exercicios.maiorQueVinte(vetor3))
    }

    @Test
    fun maiorValor() {
        assertEquals(100, exercicios.maiorValor(vetor1))
        assertEquals(500, exercicios.maiorValor(vetor2))
        assertEquals(97, exercicios.maiorValor(vetor3))
    }

    @Test
    fun contarValoresImpares() {
        assertEquals("Quantidade de numeros impares: 6", exercicios.contarValoresImpares(vetor1))
        assertEquals("Nenhum valor ímpar encontrado", exercicios.contarValoresImpares(vetor2))
        assertEquals("Quantidade de numeros impares: 5", exercicios.contarValoresImpares(vetor3))
    }

    @Test
    fun menorValor() {
        assertEquals(2, exercicios.menorValor(vetor1))
        assertEquals(2, exercicios.menorValor(vetor2))
        assertEquals(-50, exercicios.menorValor(vetor3))
    }

    @Test
    fun trocaPrimeiroComUltimo(){
        assertEquals("[9, 5, 3, 19, 70, 8, 100, 2, 35, 27]",
            exercicios.menorValor(vetor1))
        assertEquals("[50, 4, 44, 180, 32, 86, 500, 2, 12, 6, 98, 100]",
            exercicios.menorValor(vetor2))
        assertEquals("[3, -27, 55, 10, -50, 97, -33, 14, 70]",
            exercicios.menorValor(vetor3))
    }

    @Test
    fun ordenarVetor(){
        assertEquals("[2, 3, 5, 8, 9, 19, 27, 35, 70, 100]",
            exercicios.menorValor(vetor1))
        assertEquals("[2, 4, 6, 12, 32, 44, 50, 86, 98, 100, 180, 500]",
            exercicios.menorValor(vetor2))
        assertEquals("[-50, -33, -27, 3, 10, 14, 55, 70, 97]",
            exercicios.menorValor(vetor3))
    }
}