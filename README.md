# Navegação básica em aplicativos Android Nativo com XML

Aqui temos o código fonte de um tutorial gravado em vídeo disponibilizado gratuitamente no youtube: https://www.youtube.com/playlist?list=PLkwgaJSkQE72uFrk_wVlvr5JUnHfv2IUx

![Cópia de Sem nome](https://github.com/DiegoLinks/xml-basic-navigation/assets/36086232/dee9711c-fca8-45d7-889c-ba19f5865a6e)

Nesse repositório está disponível o código do tutorial de 3 etapas, sobre navegação, passagem de parâmetros e de objetos entre telas usando o Intent em um aplicativo Android Nativo com XML.

## Código básico para navegação entre Telas:

Crie uma intent. 

Essa intent precisa de dois parâmetros:  
- O contexto e a Activity de destino no caso o contexto dentro de uma Activity é o "this".
- E a Activity de destino, que deve ser colocada com o nome seguido de ::class.java, como no exemplo "HomeActivity::class.java"

Por fim, use o startActivity, passando a intent criada.

A ação de navegação pode ser feita por se chamar esse trecho de código no clique de um botão, por exemplo.

```kotlin
val intent = Intent(this, HomeActivity::class.java)
startActivity(intent)
```

Link do tutorial: (Estará disponível em breve)

## Código básico para passar parâmetros entre telas:

Com uma Intent já criada, adicione o parâmetro que deseja enviar a segunda tela usando um putExtra:
O putExtra funciona com o uso de chave/valor. A chave é um valor em String que vai identificar o parâmetro enviado na tela seguinte. 
O valor é o parâmetro em si, que pode ser por exemplo uma String, um Boolean, um Float e etc…

```kotlin
val name = "Diego"

val intent = Intent(this, HomeActivity::class.java)
intent.putExtra("name", name)
startActivity(intent)
```

Na tela de destino use a Intent para receber o valor que foi enviado:
Use intent.get o tipo de dado enviado no parâmetro, por exemplo intent.getStringExtra para String, intent.getIntExtra para Inteiro, intent.getBooleanExtra para boleano e etc… em alguns casos é necessário definir um valor padrão como por exemplo intent.getIntExtra("age", 10)
No get[TIPO]Extra, você usa a mesma chave usada para enviar o parâmetro, como por exemplo intent.getStringExtra("name")


```kotlin
val name = intent.getStringExtra("name")
```

É possível enviar e receber vários parâmetros na mesma Intent, para isso basta acrescentar novos putExtra a sua intent. Exemplo:

```kotlin
val name = "Diego"
val age = 100
val isSubscribe = true
val score = 100000.00

val intent = Intent(this, HomeActivity::class.java)
intent.putExtra("name", name)
intent.putExtra("age", age)
intent.putExtra("isSubscribe", isSubscribe)
intent.putExtra("score", score)
startActivity(intent)
```

Link do tutorial: (Estará disponível em breve)

## Código básico para passar objetos entre telas:

Com uma Intent já criada, adicione o objeto que deseja enviar a segunda tela usando um putExtra:
Para que o objeto seja enviado via putextra ele precisa ser serializável

```kotlin
data class User(
    //Atributos do objeto
) : Serializable //Objeto serializável
```

O objeto sendo Serializable o envio é feito da mesma forma que o envio de um parâmetro qualquer.

```kotlin
val user = User(...atributos do usuário…)

val intent = Intent(this, HomeActivity::class.java)
intent.putExtra("user", user)
startActivity(intent)
```

Na tela de destino use a Intent para receber o objeto que foi enviado:
É necessário fazer um Cast pro objeto, já que o intet.getSerializableExtra é genérico. Por exemplo intent.getSerializableExtra("user") as User

```kotlin
val user = intent.getSerializableExtra("user") as User
```

Link do tutorial: (Estará disponível em breve)

## Observações importantes

Essa é a forma básica de navegar, passar parâmetros e objetos entre telas em aplicativos Android Nativo XML. Porém não necessariamente é a melhor em especial se tratando de objetos já que getSerializableExtra está deprecated.

De qualquer forma é importante conhecer e entender como trabalhar com Intent, em especial em aplicativos com XML (que ainda são maioria na data que escrevo essa documentação).

Trabalhando com apps Android XML por exemplo existe a possibilidade de trabalhar com o Jetpack Navigation, para navegação, passagem de parâmetros e etc…

Para aplicativos novos, é recomendável o uso do Jetpack Compose. 

Projeto com código para navegação com Jetpack Compose:  https://github.com/DiegoLinks/compose-navigation

Vídeos tutoriais para navegação com Jetpack Compose: https://www.youtube.com/watch?v=MWtzPxftX_s&list=PLkwgaJSkQE72uFrk_wVlvr5JUnHfv2IUx
