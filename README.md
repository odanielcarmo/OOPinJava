# OOPinJava

Prática de Programação Orientada a Objetos em Java, com um modelo simples de locadora de veículos.

## Conceitos praticados

- **Encapsulamento:** atributos privados com getters.
- **Abstração:** classe abstrata `Veiculo` com o método abstrato `calcularValorAluguel`.
- **Validação no construtor:** `Cliente` exige CPF com 11 dígitos.
- **Exceções:** `IllegalArgumentException` e `IllegalStateException`.
- **BigDecimal** para valores monetários.

## Estrutura

```
src/locadora/model/
├── Cliente.java
└── Veiculo.java
```

## Status

Em desenvolvimento: ainda não há classes concretas de veículo nem classe principal.

## Requisitos

JDK 25 (o código usa `IO.println`).
