# Modelando o iPhone com UML: Funções de Músicas, Chamadas e Internet

Repositório criado para o **Desafio de Projeto** do Bootcamp Claro - Java com Spring Boot [Digital Innovation One (DIO)](https://www.dio.me/).

[Link do desafio](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/poo).

### Diagrama UML

```mermaid
classDiagram
    namespace Genérico {
        class IAparelhoTelefonico {
            <<interface>>
            +ligar(String numero)
            +atender()
            +iniciarCorreioVoz()
        }
        class INavegadorInternet {
            <<interface>>
            +exibirPagina(String url)
            +adicionarNovaAba()
            +atualizarPagina()
        }
        class IReprodutorMusical {
            <<interface>>
            +tocar()
            +pausar()
            +selecionarMusica()
        }

        class Smartphone
    }
    
    namespace Apple {
        class iPhone {
            -ligarFaceTime(String numero)
            -atenderFaceTime()
        }
    }

    Smartphone --|> IAparelhoTelefonico : implementa
    Smartphone --|> INavegadorInternet : implementa
    Smartphone --|> IReprodutorMusical : implementa
    iPhone --|> Smartphone: estende
    
    note for Smartphone "implementa todos os métodos das interfaces"
    note for iPhone "estende Smartphone e seus métodos além dos métodos exclusivos"
    note "Exemplo de re-utilização de modelos bases"
```