# spring-crash-courses
one to one : unidirectionelle
L'entité ProjetDetail n'a aucune visibilité sur l'entité Projet
===> On ajoute l'annotation au niveau de l'entité qui a la visiblité.
one to one : bidirectionelle
Annotaion d'association sera dans noté dans les deux entités et elles ont une visibilité entre eux
==>mappedBY("nom_du_champs_d'association_défini_dans_l'entité_parent")


unidirectionnne one to many entreprise 1-->* t equipe
bdd on trvouve une nouvelle table


unidirectionnne many to one equipe -->1 t entreprise
bdd on trouve un champs


bidi qui est le plus imporant