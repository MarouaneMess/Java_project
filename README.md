#Projet de Gestion de Location de Scooters

Description

Ce projet est une application de gestion de location de scooters développée en Java. Il est conçu selon une architecture MVC, bien que, pour le moment, seule la couche "Modèle" soit implémentée. La gestion des locations inclut les clients, les scooters, les modèles, les marques et les permis.

Structure du projet

Actuellement, le projet comprend uniquement le dossier Modele, qui contient les classes suivantes :

1. Scooter

Représente un scooter disponible à la location.

Possède des attributs comme l'ID (auto-incrémenté), le modèle, l'année de sortie, le kilométrage, le prix par jour et sa disponibilité.

2. Modele

Définit le modèle d'un scooter.

Contient un nom, une marque et des informations sur la puissance.

3. Marque

Stocke le nom de la marque du scooter.

4. Permis

Représente un permis de conduire avec un ID, une catégorie et des dates associées.

5. Client

Représente un client pouvant louer un scooter.

Stocke des informations personnelles (nom, prénom, adresse, permis).

6. Location

Gère les informations d'une location :

Client et scooter loué

Dates de début et de retour prévue

Enregistrement du retour et calcul du prix total

7. Retour

Stocke les informations relatives au retour du scooter (date de retour effective, kilométrage effectué).

8. Parc

Gère l'ensemble des scooters, clients et marques disponibles dans le système.

Fonctionnalités implémentées

✅ Gestion des scooters avec état de disponibilité.
✅ Création et gestion des clients avec permis.
✅ Enregistrement des locations et des retours avec calcul du prix.
✅ Vérifications et gestion des erreurs pour garantir l'intégrité des données.

Évolutions prévues

📌 Ajout de la couche Vue : Interface utilisateur pour interagir avec l’application.

📌 Ajout de la couche Controller : Gestion des actions entre la Vue et le Modèle.

📌 Gestion avancée des paiements et des réservations à l'avance.

Prérequis

Java 8 ou plus

Un IDE comme IntelliJ IDEA, Eclipse ou VS Code

Lancement du projet

Compiler les classes Java dans le dossier Modele.

Tester les fonctionnalités en créant des instances des différentes classes dans un programme principal.

🚀 Prochaines étapes : Développement des couches Vue et Controller pour une expérience utilisateur complète !

