# DISTRIBUTION PATTERNS

Aluno: Lucas Caetano Possatti

======================================

# 1. Remote Facade

======================================

![Exemplo de Remote Facade](./img/remote-facade-1.png)

<img src="img/remote-facade.png" alt="Exemplo de Remte Facade">

======================================

## Remote Facade

Provê objetos de maior granulação no lugar de objetos com menor granulação, para melhorar a eficiência através de uma rede.

======================================

### Vantagens de objetos de granulação fina (fine-grained)

 - Fácil de revelar a intenção por trás dos nomes e métodos de um objeto
 - Maior controle de métodos e objetos menores
 - Programação facilitada / Maior produtividade

======================================

### Desvantagens da granulação fina com chamadas inter-processos
 - Para interagir com o objeto, as vezes, são necessárias muitos chamadas a métodos
 - Chamadas entre processos são muito mais lentas do que chamadas em um mesmo processo.
 - Mesmo com os dois processos no mesmo computador.

======================================

$@#!$#@$!@#$!@#$!@#$@#$$#@$#@!$@#$

O cliente mode não querer o modelo inteiro, mas talvez apenas uma porção menor dele.

Nestes casos usamos o Data Transfer Object (DTO).

