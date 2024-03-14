Question1 : Le mode de creation create_drop permet de créer la table correspondat a la classe
on remarque aussi que les noms des attributs sont transformés en snake_case.
Une fois le serveur éteint la table sera supprimé.


Question2 : Les effets des propriétés ajoutées dans les @Column dans la classe ClassTestJPATwo
            1) precision : permet de preciser le nombre de chiffres après la virgule
            2) unique : permet de fixer une contrainte d'unicité de la valeur dans @Column
            En conclusion les propriétés ajoutées permettent de fixer des contraintes sur les colonnes.


Question3 : Les annotations @Column permetent de détailler les types des attributs et d'ajouter des contraintes 
            ce qui est ideal quand on est obligé de bien détailler pour que JPA soit capable d'etre le plus conform 
            au schéma de la table "existante" et donc on peut en déduire que le cas dans le quel il est nécessaire 
            de mettre les annotations @Column est le mode "Validate".
