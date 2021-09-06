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
    - final