fun main() {

    /*
    Array - uma variável que armazena mais de um valor e que tem um tamanho fixo

    val num = arrayOf("Henrique", "Rodrigo")
     */

   /* val num = arrayOf("Karolyne", "Osmani")*/

    //num[0] = "Vanilma"
    //num = arrayOf(1, 2)

    /*println(num[0])
    println(num[1])*/

    //Interando valores de maneira mais simples

    /*for (i in 0 .. 1){
        println(num[i])
    }*/

    //Interando da maneira mais correta
    /*for (i in num){
        println(i)
    }*/

    //For Each
    /*num.forEach {
        println(it)
    }*/

    /*List - Consegue armazenar vários valores (de tipos específicos)
    e tem um tamanho dinâmico*/

    //Declaração utilizando listOf() - Nossa lista é imutável
   /* val nome = listOf("Karolyne", "Osmani")
    println(nome)
    */

    /*val nome = mutableListOf<String>()

    nome.add("Karolyne")
    nome.add("Osmani")
    nome.add("Vanilma")

    println(nome)

    while (true){
        print("Adicione um nome na lista: ")
        val nomeUsu = readLine()!!

        if(nomeUsu.isEmpty()){
            break
        }else{
            nome.add(nomeUsu)
        }
    }
    //Exemplo
    print("\nRemova algum nome que você adicionou dentro da lista: ")
    val nomeUsu = readLine()!!

    //remove sem verificações
    //nome.remove(nomeUsu)

    if (nome.contains(nomeUsu)){
        nome.remove(nomeUsu)
        println("Usuário $nomeUsu removido com sucesso!")

    }else{
        println("O nome $nomeUsu não existe na lista!")
    }
    println(nome.contains(nomeUsu))*/

    /*Insira no array os seguintes números [5, 10, 15, 20, 25].

     Use um loop para mostrar os valores
---------------------------------------------
     Insira no list os seguintes números [5, 10, 15, 20, 25].

     Removam o valor 5

     Use um loop para mostrar os valores */

    /*val num = arrayOf(5,10,15,20,25)
    num.forEach {
        println(it)
    }

    //2

    val num1 = mutableListOf(5,10,15,20,25)
    num1.remove(5)
    //println(num1)
    for (i in num1){
        println(i)
    }*/

    //Set - Armazenar valores únicos, ou seja, valores que não se repetem

    //setOf - set imutável
    //mutableSetOf() - set mutável

    //Exemplo setOf
   /* val set = setOf("Karolyne", "Karolyne")
    println(set)
    println(set.size)
    mutableListOf*/

    //Exemplo pratico de SetOf
   /* val num = mutableSetOf(9)
    num.add(5)
    num.add(2)
    num.add(3)
    num.add(3)
    num.add(3)
    num.add(3)
    num.add(3)

    println(num)

    num.remove(5)

    println(num)*/

    /*Map ou dicionário - Chave Valor (O map recebe um pair de valores, onde
    um será a K (chave) e o outro será o V (valor) em si)*/

    //mapOf - map imutável
    // mutableMapOf - map mutável

    //Declaração map imutável
   /* val mapUsuarios = mapOf(
        1 to "Karolyne",
        5 to "Osmani",
        46 to "Vanilma"
    )*/

    /*Crie uma um programa para trabalhar com estoque de uma loja, o
    programa deverá trabalhar com Collection do tipo List do Java para
    manipular os dados desse estoque, o programa deverá atender as
    seguintes funcionalidades:
    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.*/

    val listaEstoque = mutableListOf<String>()

    while (true){

        println("\n***Estoque da loja da Vanilma***\n")

        println("1 - Adicionar itens no estoque")
        println("2 - Remover itens no estoque")
        println("3 - Atualizar itens no estoque")
        println("4 - Listar itens no estoque")
        println("5 - Sair")

        println("\nEscolha uma opção: ")
        val opc = readLine()!!.toInt()

        println("\n")

        when(opc){

            1-> {
                print("Digite um item para ser adcionado no estoque: ")
                val item = readLine()!!

                if (item.isEmpty()){
                    print("Valor inválido")
                }else{
                    listaEstoque.add(item)
                    println("Item inserido com sucesso!")
                }
            }

            2 -> {
                print("Digite um item para ser removido no estoque: ")
                val item = readLine()!!

                if (item.isEmpty()){
                    println("Valor inválido")
                }else{
                    if (listaEstoque.contains(item)){
                        listaEstoque.remove(item)
                        println("O item $item foi removido com sucesso.")
                    }else{
                        println("O item $item não existe na lista.")
                    }
                }
            }

            3 -> {
                //Atualização por meio do Index
                println("Selecione um item de 0 a ${listaEstoque.size - 1}")
                val pos = readLine()!!.toInt()

                if (pos in 0..(listaEstoque.size - 1)){

                println("\nDigite o produto que vai substituir: ")
                val item = readLine()!!

                listaEstoque[pos] = item
                }else{
                    println("Essa item não existe")
                }

            }

            4 -> {
                if (listaEstoque.isEmpty()){
                    println("O estoque está vazio.")
                }else{
                    println("***Itens do Estoque***")
                    listaEstoque.forEach {
                        println(it)
                    }

                }
            }

            else -> break
        }
    }






}