# Modificadores de acesso

* public
    pode ser acessada de qualquer lugar por qualquer entidade que possa visualizar a classe a que ela pertence.

* private
    os métodos e atributos da classe definidos como privado não podem ser acessados ou usados por nenhuma outra classe. Esses atributos e métodos também não podem ser visualizados pelas classes herdadas

* protected
    Torna o membro acessivél às classes do mesmo pacote ou através de herança, seus membros herdadis não são acessíveis a outras classes fora do pacote em que foram declarados

* default (padrão)
    A classe e/ou seus membros são acessíveis somente por classes do mesmo pacote, na sua declaração não é definido nenhum tipo de modificador, sendo este identificado pelo compilador

* Palavras reservadas
    - abstract
        Não pode ser aplicado em variáveis, apenas classes e métodos. Uma classe abstrata não pode ser instanciada. Se houver alguma declaração de um método como abstract (abstrato), a classe também deve ser marcada como abstract.
    - static
        É usado para a criação de uma variável que poderá ser acessada por todas as instâncias de objetos desta classe como uma variável comum, ou seja, a variável criada será a mesma em todas as instancias e quando seu contúdo é modificado numa das instâncias, a modificação ocorre em todas as demais. E nas declarações de métodos ajudam no acesso direto à classe, portanto não é nescessário instanciar um objeto para acessar o método.
    - final
        Quando e aplicado na classe, não permite estender, nos métodos impede que o mesmo seja sobrescrito (overriding) na subclasse, e nos valores de váriaveis não pode ser alterado depois que já tenha sido atribuído um valor.