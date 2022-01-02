# Spring MVC Countries
## Milestone 1
Creare un progetto Spring MVC + Spring Data JPA con driver MySQL
Predisporre la connessione al  database nel file application.properties (non vogliamo generare DDL perchè leggiamo il database esistente db_nations)
## Milestone 2
Creare una classe Country marcata come @Entity, che mappa la tabella countries con tutte le colonne
Creare un JPARepository per Country
## Milestone 3
Creare un template Thymeleaf che riceve in ingresso la lista delle country e le mostra in una tabella
## Milestone 4
Creare un controller che risponde alla root dell’applicazione, che ha come dipendenza il repository di Country.
Creare un metodo index che seleziona tutte le country da database, ordinate per nome,  e passa la lista al template Thymeleaf
NOTA: bonificare database da date non valide che hanno giorno o mese 00
## Milestone 5
Formattare l'area con [numbers utility](https://www.thymeleaf.org/apidocs/thymeleaf/2.0.15/org/thymeleaf/expression/Numbers.html) 
formattare la data con [temporals](https://www.baeldung.com/dates-in-thymeleaf)
Aggiungere la colonna con la flag, presa da questa [API gratuita](https://flagpedia.net/download/api)
NOTA: gestire i valori nulli in modo da non cercare di metterli in lowercase
## Milestone 6
Aggiungere tra le Entity anche Languages
Aggiungere pagina di dettaglio della country con Region name, Continent name e Languages (variante mettendo il default)
## Milestone 7
Aggiungere link che porta alla pagina di dettaglio della country con region, continent e languages
