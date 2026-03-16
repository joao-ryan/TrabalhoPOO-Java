# 🏨 Sistema de Hotel em Java

Projeto simples desenvolvido em **Java** para praticar **Programação Orientada a Objetos (POO)**.
O sistema simula o funcionamento básico de um hotel, permitindo abrir o hotel, exibir informações e gerenciar reservas de hóspedes.

---

# 📚 Conceitos Praticados

Este exercício foi criado para reforçar conceitos fundamentais de **POO em Java**:

* Classes
* Objetos
* Atributos
* Métodos
* Organização de código

---

# 🗂 Estrutura do Projeto

```
EXERCICIOPOO-JAVA
│
├── src
│   └── main
│       └── java
│           ├── HotelAPP.java
│           └── HotelReserva.java
│
└── README.md
```

---

# 🏨 Classe `HotelAPP`

Classe principal responsável por representar o hotel e iniciar o programa.

## Atributos

* `nomeHotel`
* `cidade`
* `quantidadeQuartos`

## Métodos

| Método           | Descrição                      |
| ---------------- | ------------------------------ |
| `abrirHotel()`   | Simula a abertura do hotel     |
| `mostrarHotel()` | Mostra as informações do hotel |
| `fecharHotel()`  | Simula o fechamento do hotel   |

Também contém o método:

```
public static void main(String[] args)
```

Responsável por executar o programa.

---

# 🛎 Classe `HotelReserva`

Representa uma reserva feita por um hóspede.

## Atributos

* `nomeHospede`
* `numeroQuarto`
* `quantidadeDias`
* `valorDiaria`

## Métodos

| Método                      | Função                              |
| --------------------------- | ----------------------------------- |
| `confirmarReserva()`        | Confirma a reserva                  |
| `cancelarReserva()`         | Cancela a reserva                   |
| `exibirReserva()`           | Mostra os dados da reserva          |
| `calcularTotalHospedagem()` | Calcula o valor total da hospedagem |

---

# 🧮 Exemplo de Cálculo

O valor total da hospedagem é calculado multiplicando:

```
total = quantidadeDias × valorDiaria
```

---

# ▶️ Como Executar

1. Clone o repositório

```
git clone https://github.com/seu-usuario/EXERCICIOPOO-JAVA.git
```

2. Acesse a pasta do projeto

```
cd EXERCICIOPOO-JAVA
```

3. Compile os arquivos Java

```
javac src/main/java/*.java
```

4. Execute o programa

```
java src.main.java.HotelAPP
```

---

# 🎯 Objetivo do Projeto

Este projeto tem como objetivo praticar os fundamentos da **Programação Orientada a Objetos**, entendendo como classes, atributos e métodos funcionam juntos para representar entidades do mundo real.

---

# 👨‍💻 Autor

Desenvolvido por **João Ryan, Nicolas Gabriel, Matheus Amorim e Israel Dias**

Estudante de programação focado em desenvolvimento **Full Stack** e criação de projetos para evolução prática.

---

# ⭐ Contribuição

Sinta-se à vontade para:

* Estudar o código
* Melhorar a lógica
* Criar novas funcionalidades

Se este projeto te ajudou, deixe uma ⭐ no repositório.
