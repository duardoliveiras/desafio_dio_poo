# desafio_dio_poo
Programa desenvolvido para entregar no desafio de POO

Programa desenvolvido como parte de um desafio de Programação Orientada a Objetos (POO). Ele utiliza conceitos de herança, onde classes filhas herdam atributos de classes mães para reutilização de código. Foi criada uma classe abstrata que não pode ser instanciada e a partir dela foram definidas as classes filhas.

Além disso, o programa utiliza conceito de polimorfismo, onde objetos de diferentes classes são tratados de forma genérica, desde que possuam uma superclasse em comum, permitindo um código flexível com métodos que podem ser usados com diferentes tipos de objetos.

Também foram utilizadas coleções, em particular HashSet e LinkedHashSet. As coleções permitem a implementação de estruturas de dados eficientes para manipulação de conjuntos de objetos. O LinkedHashSet foi escolhido, pois mantém a ordem de inserção dos objetos e não permite elementos duplicados. O HashSet também foi utilizado, no caso onde não era necessário manter a ordem de inserção.

O projeto tem como ideia abstrair conceitos de orientação a objetos, transformando um bootcamp com cursos e mentorias em classes filhas de uma classe "conteudo", já que todos possuem conteúdo. Também foi criada uma classe "dev" com métodos para consulta de experiência, inscrição em bootcamps e progressão.

Como diferencial, adicionei um método para consultas todos integrantes cadastrados no bootcamp, o 'listarInscritos' esse método utiliza-se de um iterator
que percorre toda a lista set de devs inscritos e imprime o nome em ordem alfabética no console.
