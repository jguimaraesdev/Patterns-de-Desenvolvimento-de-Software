Padrões de projeto adotados:

Factory Method: Utilizado para criar uma instância de uma família de objetos (no caso, os provedores de pagamento) 
sem especificar suas classes concretas. Isso torna o sistema mais flexível, 
permitindo fácil extensão para novos provedores de pagamento sem modificar o código existente.

Abstract Factory (indiretamente): Embora não tenhamos implementado uma fábrica abstrata neste exemplo, 
o padrão Factory Method é uma forma simplificada de uma fábrica abstrata. 
Ele fornece uma interface para criar famílias de objetos relacionados sem especificar suas classes concretas.

Esses padrões foram escolhidos para melhorar a flexibilidade e a manutenibilidade do sistema, 
facilitando a adição de novos provedores de pagamento no futuro.